package com.mopub.nativeads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.mopub.common.VisibleForTesting;
import com.mopub.nativeads.VisibilityTracker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class ImpressionTracker {
    private static final int PERIOD = 250;
    private final Handler mPollHandler;
    private final PollingRunnable mPollingRunnable;
    private final Map<View, TimestampWrapper<ImpressionInterface>> mPollingViews;
    private final Map<View, ImpressionInterface> mTrackedViews;
    private final VisibilityTracker.VisibilityChecker mVisibilityChecker;
    private final VisibilityTracker mVisibilityTracker;
    private VisibilityTracker.VisibilityTrackerListener mVisibilityTrackerListener;

    public ImpressionTracker(Context context) {
        this(new WeakHashMap(), new WeakHashMap(), new VisibilityTracker.VisibilityChecker(), new VisibilityTracker(context), new Handler(Looper.getMainLooper()));
    }

    @VisibleForTesting
    ImpressionTracker(Map<View, ImpressionInterface> map, Map<View, TimestampWrapper<ImpressionInterface>> map2, VisibilityTracker.VisibilityChecker visibilityChecker, VisibilityTracker visibilityTracker, Handler handler) {
        this.mTrackedViews = map;
        this.mPollingViews = map2;
        this.mVisibilityChecker = visibilityChecker;
        this.mVisibilityTracker = visibilityTracker;
        this.mVisibilityTrackerListener = new VisibilityTracker.VisibilityTrackerListener() { // from class: com.mopub.nativeads.ImpressionTracker.1
            @Override // com.mopub.nativeads.VisibilityTracker.VisibilityTrackerListener
            public void onVisibilityChanged(List<View> list, List<View> list2) {
                for (View view : list) {
                    ImpressionInterface impressionInterface = (ImpressionInterface) ImpressionTracker.this.mTrackedViews.get(view);
                    if (impressionInterface != null) {
                        TimestampWrapper timestampWrapper = (TimestampWrapper) ImpressionTracker.this.mPollingViews.get(view);
                        if (timestampWrapper == null || !impressionInterface.equals(timestampWrapper.mInstance)) {
                            ImpressionTracker.this.mPollingViews.put(view, new TimestampWrapper(impressionInterface));
                        }
                    } else {
                        ImpressionTracker.this.removeView(view);
                    }
                }
                Iterator<View> it = list2.iterator();
                while (it.hasNext()) {
                    ImpressionTracker.this.mPollingViews.remove(it.next());
                }
                ImpressionTracker.this.scheduleNextPoll();
            }
        };
        this.mVisibilityTracker.setVisibilityTrackerListener(this.mVisibilityTrackerListener);
        this.mPollHandler = handler;
        this.mPollingRunnable = new PollingRunnable();
    }

    public void addView(View view, ImpressionInterface impressionInterface) {
        if (this.mTrackedViews.get(view) == impressionInterface) {
            return;
        }
        removeView(view);
        if (impressionInterface.isImpressionRecorded()) {
            return;
        }
        this.mTrackedViews.put(view, impressionInterface);
        this.mVisibilityTracker.addView(view, impressionInterface.getImpressionMinPercentageViewed(), impressionInterface.getImpressionMinVisiblePx());
    }

    public void removeView(View view) {
        this.mTrackedViews.remove(view);
        removePollingView(view);
        this.mVisibilityTracker.removeView(view);
    }

    public void clear() {
        this.mTrackedViews.clear();
        this.mPollingViews.clear();
        this.mVisibilityTracker.clear();
        this.mPollHandler.removeMessages(0);
    }

    public void destroy() {
        clear();
        this.mVisibilityTracker.destroy();
        this.mVisibilityTrackerListener = null;
    }

    @VisibleForTesting
    void scheduleNextPoll() {
        if (this.mPollHandler.hasMessages(0)) {
            return;
        }
        this.mPollHandler.postDelayed(this.mPollingRunnable, 250L);
    }

    private void removePollingView(View view) {
        this.mPollingViews.remove(view);
    }

    @VisibleForTesting
    class PollingRunnable implements Runnable {
        private final ArrayList<View> mRemovedViews = new ArrayList<>();

        PollingRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            for (Map.Entry entry : ImpressionTracker.this.mPollingViews.entrySet()) {
                View view = (View) entry.getKey();
                TimestampWrapper timestampWrapper = (TimestampWrapper) entry.getValue();
                if (ImpressionTracker.this.mVisibilityChecker.hasRequiredTimeElapsed(timestampWrapper.mCreatedTimestamp, ((ImpressionInterface) timestampWrapper.mInstance).getImpressionMinTimeViewed())) {
                    ((ImpressionInterface) timestampWrapper.mInstance).recordImpression(view);
                    ((ImpressionInterface) timestampWrapper.mInstance).setImpressionRecorded();
                    this.mRemovedViews.add(view);
                }
            }
            Iterator<View> it = this.mRemovedViews.iterator();
            while (it.hasNext()) {
                ImpressionTracker.this.removeView(it.next());
            }
            this.mRemovedViews.clear();
            if (ImpressionTracker.this.mPollingViews.isEmpty()) {
                return;
            }
            ImpressionTracker.this.scheduleNextPoll();
        }
    }

    @VisibleForTesting
    @Deprecated
    VisibilityTracker.VisibilityTrackerListener getVisibilityTrackerListener() {
        return this.mVisibilityTrackerListener;
    }
}
