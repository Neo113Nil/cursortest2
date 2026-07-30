package androidx.dynamicanimation.animation;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.SimpleArrayMap;
import androidx.dynamicanimation.animation.AnimationHandler;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class AnimationHandler {
    private static final ThreadLocal<AnimationHandler> sAnimatorHandler = new ThreadLocal<>();

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public DurationScaleChangeListener mDurationScaleChangeListener;
    private FrameCallbackScheduler mScheduler;
    private final SimpleArrayMap<AnimationFrameCallback, Long> mDelayedCallbackStartTime = new SimpleArrayMap<>();
    final ArrayList<AnimationFrameCallback> mAnimationCallbacks = new ArrayList<>();
    private final AnimationCallbackDispatcher mCallbackDispatcher = new AnimationCallbackDispatcher();
    private final Runnable mRunnable = new Runnable() { // from class: androidx.dynamicanimation.animation.b
        @Override // java.lang.Runnable
        public final void run() {
            AnimationHandler.this.lambda$new$0();
        }
    };
    long mCurrentFrameTime = 0;
    private boolean mListDirty = false;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public float mDurationScale = 1.0f;

    private class AnimationCallbackDispatcher {
        private AnimationCallbackDispatcher() {
        }

        void dispatchAnimationFrame() {
            AnimationHandler.this.mCurrentFrameTime = SystemClock.uptimeMillis();
            AnimationHandler animationHandler = AnimationHandler.this;
            animationHandler.doAnimationFrame(animationHandler.mCurrentFrameTime);
            if (AnimationHandler.this.mAnimationCallbacks.size() > 0) {
                AnimationHandler.this.mScheduler.postFrameCallback(AnimationHandler.this.mRunnable);
            }
        }
    }

    interface AnimationFrameCallback {
        boolean doAnimationFrame(long j8);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public interface DurationScaleChangeListener {
        boolean register();

        boolean unregister();
    }

    @VisibleForTesting
    @RequiresApi(api = 33)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public class DurationScaleChangeListener33 implements DurationScaleChangeListener {
        ValueAnimator.DurationScaleChangeListener mListener;

        public DurationScaleChangeListener33() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$register$0(float f8) {
            AnimationHandler.this.mDurationScale = f8;
        }

        @Override // androidx.dynamicanimation.animation.AnimationHandler.DurationScaleChangeListener
        public boolean register() {
            boolean registerDurationScaleChangeListener;
            if (this.mListener != null) {
                return true;
            }
            ValueAnimator.DurationScaleChangeListener durationScaleChangeListener = new ValueAnimator.DurationScaleChangeListener() { // from class: androidx.dynamicanimation.animation.e
                @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                public final void onChanged(float f8) {
                    AnimationHandler.DurationScaleChangeListener33.this.lambda$register$0(f8);
                }
            };
            this.mListener = durationScaleChangeListener;
            registerDurationScaleChangeListener = ValueAnimator.registerDurationScaleChangeListener(durationScaleChangeListener);
            return registerDurationScaleChangeListener;
        }

        @Override // androidx.dynamicanimation.animation.AnimationHandler.DurationScaleChangeListener
        public boolean unregister() {
            boolean unregisterDurationScaleChangeListener;
            unregisterDurationScaleChangeListener = ValueAnimator.unregisterDurationScaleChangeListener(this.mListener);
            this.mListener = null;
            return unregisterDurationScaleChangeListener;
        }
    }

    static final class FrameCallbackScheduler16 implements FrameCallbackScheduler {
        private final Choreographer mChoreographer = Choreographer.getInstance();
        private final Looper mLooper = Looper.myLooper();

        FrameCallbackScheduler16() {
        }

        @Override // androidx.dynamicanimation.animation.FrameCallbackScheduler
        public boolean isCurrentThread() {
            return Thread.currentThread() == this.mLooper.getThread();
        }

        @Override // androidx.dynamicanimation.animation.FrameCallbackScheduler
        public void postFrameCallback(final Runnable runnable) {
            this.mChoreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.dynamicanimation.animation.f
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j8) {
                    runnable.run();
                }
            });
        }
    }

    public AnimationHandler(FrameCallbackScheduler frameCallbackScheduler) {
        this.mScheduler = frameCallbackScheduler;
    }

    private void cleanUpList() {
        if (this.mListDirty) {
            for (int size = this.mAnimationCallbacks.size() - 1; size >= 0; size--) {
                if (this.mAnimationCallbacks.get(size) == null) {
                    this.mAnimationCallbacks.remove(size);
                }
            }
            if (this.mAnimationCallbacks.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                this.mDurationScaleChangeListener.unregister();
            }
            this.mListDirty = false;
        }
    }

    static AnimationHandler getInstance() {
        ThreadLocal<AnimationHandler> threadLocal = sAnimatorHandler;
        if (threadLocal.get() == null) {
            threadLocal.set(new AnimationHandler(new FrameCallbackScheduler16()));
        }
        return threadLocal.get();
    }

    private boolean isCallbackDue(AnimationFrameCallback animationFrameCallback, long j8) {
        Long l8 = this.mDelayedCallbackStartTime.get(animationFrameCallback);
        if (l8 == null) {
            return true;
        }
        if (l8.longValue() >= j8) {
            return false;
        }
        this.mDelayedCallbackStartTime.remove(animationFrameCallback);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        this.mCallbackDispatcher.dispatchAnimationFrame();
    }

    void addAnimationFrameCallback(AnimationFrameCallback animationFrameCallback, long j8) {
        float durationScale;
        if (this.mAnimationCallbacks.size() == 0) {
            this.mScheduler.postFrameCallback(this.mRunnable);
            if (Build.VERSION.SDK_INT >= 33) {
                durationScale = ValueAnimator.getDurationScale();
                this.mDurationScale = durationScale;
                if (this.mDurationScaleChangeListener == null) {
                    this.mDurationScaleChangeListener = new DurationScaleChangeListener33();
                }
                this.mDurationScaleChangeListener.register();
            }
        }
        if (!this.mAnimationCallbacks.contains(animationFrameCallback)) {
            this.mAnimationCallbacks.add(animationFrameCallback);
        }
        if (j8 > 0) {
            this.mDelayedCallbackStartTime.put(animationFrameCallback, Long.valueOf(SystemClock.uptimeMillis() + j8));
        }
    }

    void doAnimationFrame(long j8) {
        long uptimeMillis = SystemClock.uptimeMillis();
        for (int i8 = 0; i8 < this.mAnimationCallbacks.size(); i8++) {
            AnimationFrameCallback animationFrameCallback = this.mAnimationCallbacks.get(i8);
            if (animationFrameCallback != null && isCallbackDue(animationFrameCallback, uptimeMillis)) {
                animationFrameCallback.doAnimationFrame(j8);
            }
        }
        cleanUpList();
    }

    @VisibleForTesting
    public float getDurationScale() {
        return this.mDurationScale;
    }

    FrameCallbackScheduler getScheduler() {
        return this.mScheduler;
    }

    boolean isCurrentThread() {
        return this.mScheduler.isCurrentThread();
    }

    void removeCallback(AnimationFrameCallback animationFrameCallback) {
        this.mDelayedCallbackStartTime.remove(animationFrameCallback);
        int indexOf = this.mAnimationCallbacks.indexOf(animationFrameCallback);
        if (indexOf >= 0) {
            this.mAnimationCallbacks.set(indexOf, null);
            this.mListDirty = true;
        }
    }
}
