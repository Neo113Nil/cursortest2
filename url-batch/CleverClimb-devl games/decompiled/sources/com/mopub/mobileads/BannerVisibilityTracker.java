package com.mopub.mobileads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import com.mopub.common.Preconditions;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.Dips;
import com.mopub.common.util.Views;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
class BannerVisibilityTracker {
    private static final int VISIBILITY_THROTTLE_MILLIS = 100;
    private BannerVisibilityTrackerListener mBannerVisibilityTrackerListener;
    private boolean mIsImpTrackerFired;
    private boolean mIsVisibilityScheduled;

    @VisibleForTesting
    final ViewTreeObserver.OnPreDrawListener mOnPreDrawListener;
    private final View mRootView;
    private final View mTrackedView;
    private final BannerVisibilityChecker mVisibilityChecker;
    private final Handler mVisibilityHandler;
    private final BannerVisibilityRunnable mVisibilityRunnable;

    @VisibleForTesting
    WeakReference<ViewTreeObserver> mWeakViewTreeObserver;

    interface BannerVisibilityTrackerListener {
        void onVisibilityChanged();
    }

    @VisibleForTesting
    public BannerVisibilityTracker(Context context, View view, View view2, int i, int i2) {
        Preconditions.checkNotNull(view);
        Preconditions.checkNotNull(view2);
        this.mRootView = view;
        this.mTrackedView = view2;
        this.mVisibilityChecker = new BannerVisibilityChecker(i, i2);
        this.mVisibilityHandler = new Handler();
        this.mVisibilityRunnable = new BannerVisibilityRunnable();
        this.mOnPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.mopub.mobileads.BannerVisibilityTracker.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                BannerVisibilityTracker.this.scheduleVisibilityCheck();
                return true;
            }
        };
        this.mWeakViewTreeObserver = new WeakReference<>(null);
        setViewTreeObserver(context, this.mTrackedView);
    }

    private void setViewTreeObserver(Context context, View view) {
        ViewTreeObserver viewTreeObserver = this.mWeakViewTreeObserver.get();
        if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            View topmostView = Views.getTopmostView(context, view);
            if (topmostView == null) {
                MoPubLog.d("Unable to set Visibility Tracker due to no available root view.");
                return;
            }
            ViewTreeObserver viewTreeObserver2 = topmostView.getViewTreeObserver();
            if (!viewTreeObserver2.isAlive()) {
                MoPubLog.w("Visibility Tracker was unable to track views because the root view tree observer was not alive");
            } else {
                this.mWeakViewTreeObserver = new WeakReference<>(viewTreeObserver2);
                viewTreeObserver2.addOnPreDrawListener(this.mOnPreDrawListener);
            }
        }
    }

    @VisibleForTesting
    @Deprecated
    BannerVisibilityTrackerListener getBannerVisibilityTrackerListener() {
        return this.mBannerVisibilityTrackerListener;
    }

    void setBannerVisibilityTrackerListener(BannerVisibilityTrackerListener bannerVisibilityTrackerListener) {
        this.mBannerVisibilityTrackerListener = bannerVisibilityTrackerListener;
    }

    void destroy() {
        this.mVisibilityHandler.removeMessages(0);
        this.mIsVisibilityScheduled = false;
        ViewTreeObserver viewTreeObserver = this.mWeakViewTreeObserver.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mWeakViewTreeObserver.clear();
        this.mBannerVisibilityTrackerListener = null;
    }

    void scheduleVisibilityCheck() {
        if (this.mIsVisibilityScheduled) {
            return;
        }
        this.mIsVisibilityScheduled = true;
        this.mVisibilityHandler.postDelayed(this.mVisibilityRunnable, 100L);
    }

    @VisibleForTesting
    @Deprecated
    BannerVisibilityChecker getBannerVisibilityChecker() {
        return this.mVisibilityChecker;
    }

    @VisibleForTesting
    @Deprecated
    Handler getVisibilityHandler() {
        return this.mVisibilityHandler;
    }

    @VisibleForTesting
    @Deprecated
    boolean isVisibilityScheduled() {
        return this.mIsVisibilityScheduled;
    }

    @VisibleForTesting
    @Deprecated
    boolean isImpTrackerFired() {
        return this.mIsImpTrackerFired;
    }

    class BannerVisibilityRunnable implements Runnable {
        BannerVisibilityRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (BannerVisibilityTracker.this.mIsImpTrackerFired) {
                return;
            }
            BannerVisibilityTracker.this.mIsVisibilityScheduled = false;
            if (BannerVisibilityTracker.this.mVisibilityChecker.isVisible(BannerVisibilityTracker.this.mRootView, BannerVisibilityTracker.this.mTrackedView)) {
                if (!BannerVisibilityTracker.this.mVisibilityChecker.hasBeenVisibleYet()) {
                    BannerVisibilityTracker.this.mVisibilityChecker.setStartTimeMillis();
                }
                if (BannerVisibilityTracker.this.mVisibilityChecker.hasRequiredTimeElapsed() && BannerVisibilityTracker.this.mBannerVisibilityTrackerListener != null) {
                    BannerVisibilityTracker.this.mBannerVisibilityTrackerListener.onVisibilityChanged();
                    BannerVisibilityTracker.this.mIsImpTrackerFired = true;
                }
            }
            if (BannerVisibilityTracker.this.mIsImpTrackerFired) {
                return;
            }
            BannerVisibilityTracker.this.scheduleVisibilityCheck();
        }
    }

    static class BannerVisibilityChecker {
        private int mMinVisibleDips;
        private int mMinVisibleMillis;
        private long mStartTimeMillis = Long.MIN_VALUE;
        private final Rect mClipRect = new Rect();

        BannerVisibilityChecker(int i, int i2) {
            this.mMinVisibleDips = i;
            this.mMinVisibleMillis = i2;
        }

        boolean hasBeenVisibleYet() {
            return this.mStartTimeMillis != Long.MIN_VALUE;
        }

        void setStartTimeMillis() {
            this.mStartTimeMillis = SystemClock.uptimeMillis();
        }

        boolean hasRequiredTimeElapsed() {
            return hasBeenVisibleYet() && SystemClock.uptimeMillis() - this.mStartTimeMillis >= ((long) this.mMinVisibleMillis);
        }

        boolean isVisible(View view, View view2) {
            return view2 != null && view2.getVisibility() == 0 && view.getParent() != null && view2.getWidth() > 0 && view2.getHeight() > 0 && view2.getGlobalVisibleRect(this.mClipRect) && ((long) (Dips.pixelsToIntDips((float) this.mClipRect.width(), view2.getContext()) * Dips.pixelsToIntDips((float) this.mClipRect.height(), view2.getContext()))) >= ((long) this.mMinVisibleDips);
        }
    }
}
