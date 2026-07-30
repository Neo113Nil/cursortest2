package com.airbnb.lottie.animation.keyframe;

import android.view.animation.Interpolator;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a {
    private final d keyframesWrapper;

    @Nullable
    protected com.airbnb.lottie.value.c valueCallback;
    final List<b> listeners = new ArrayList(1);
    private boolean isDiscrete = false;
    protected float progress = 0.0f;

    @Nullable
    private Object cachedGetValue = null;
    private float cachedStartDelayProgress = -1.0f;
    private float cachedEndProgress = -1.0f;

    public interface b {
        void onValueChanged();
    }

    private static final class c implements d {
        private c() {
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public com.airbnb.lottie.value.a getCurrentKeyframe() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public float getEndProgress() {
            return 1.0f;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public float getStartDelayProgress() {
            return 0.0f;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean isCachedValueEnabled(float f8) {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean isEmpty() {
            return true;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean isValueChanged(float f8) {
            return false;
        }
    }

    private interface d {
        com.airbnb.lottie.value.a getCurrentKeyframe();

        @FloatRange(from = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON, to = 1.0d)
        float getEndProgress();

        @FloatRange(from = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON, to = 1.0d)
        float getStartDelayProgress();

        boolean isCachedValueEnabled(float f8);

        boolean isEmpty();

        boolean isValueChanged(float f8);
    }

    private static final class e implements d {
        private com.airbnb.lottie.value.a cachedCurrentKeyframe = null;
        private float cachedInterpolatedProgress = -1.0f;

        @NonNull
        private com.airbnb.lottie.value.a currentKeyframe = findKeyframe(0.0f);
        private final List<? extends com.airbnb.lottie.value.a> keyframes;

        e(List<? extends com.airbnb.lottie.value.a> list) {
            this.keyframes = list;
        }

        private com.airbnb.lottie.value.a findKeyframe(float f8) {
            List<? extends com.airbnb.lottie.value.a> list = this.keyframes;
            com.airbnb.lottie.value.a aVar = list.get(list.size() - 1);
            if (f8 >= aVar.getStartProgress()) {
                return aVar;
            }
            for (int size = this.keyframes.size() - 2; size >= 1; size--) {
                com.airbnb.lottie.value.a aVar2 = this.keyframes.get(size);
                if (this.currentKeyframe != aVar2 && aVar2.containsProgress(f8)) {
                    return aVar2;
                }
            }
            return this.keyframes.get(0);
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        @NonNull
        public com.airbnb.lottie.value.a getCurrentKeyframe() {
            return this.currentKeyframe;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public float getEndProgress() {
            return this.keyframes.get(r0.size() - 1).getEndProgress();
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public float getStartDelayProgress() {
            return this.keyframes.get(0).getStartProgress();
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean isCachedValueEnabled(float f8) {
            com.airbnb.lottie.value.a aVar = this.cachedCurrentKeyframe;
            com.airbnb.lottie.value.a aVar2 = this.currentKeyframe;
            if (aVar == aVar2 && this.cachedInterpolatedProgress == f8) {
                return true;
            }
            this.cachedCurrentKeyframe = aVar2;
            this.cachedInterpolatedProgress = f8;
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean isEmpty() {
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean isValueChanged(float f8) {
            if (this.currentKeyframe.containsProgress(f8)) {
                return !this.currentKeyframe.isStatic();
            }
            this.currentKeyframe = findKeyframe(f8);
            return true;
        }
    }

    private static final class f implements d {
        private float cachedInterpolatedProgress = -1.0f;

        @NonNull
        private final com.airbnb.lottie.value.a keyframe;

        f(List<? extends com.airbnb.lottie.value.a> list) {
            this.keyframe = list.get(0);
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public com.airbnb.lottie.value.a getCurrentKeyframe() {
            return this.keyframe;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public float getEndProgress() {
            return this.keyframe.getEndProgress();
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public float getStartDelayProgress() {
            return this.keyframe.getStartProgress();
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean isCachedValueEnabled(float f8) {
            if (this.cachedInterpolatedProgress == f8) {
                return true;
            }
            this.cachedInterpolatedProgress = f8;
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean isEmpty() {
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean isValueChanged(float f8) {
            return !this.keyframe.isStatic();
        }
    }

    a(List<? extends com.airbnb.lottie.value.a> list) {
        this.keyframesWrapper = wrap(list);
    }

    @FloatRange(from = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON, to = 1.0d)
    private float getStartDelayProgress() {
        if (this.cachedStartDelayProgress == -1.0f) {
            this.cachedStartDelayProgress = this.keyframesWrapper.getStartDelayProgress();
        }
        return this.cachedStartDelayProgress;
    }

    private static <T> d wrap(List<? extends com.airbnb.lottie.value.a> list) {
        return list.isEmpty() ? new c() : list.size() == 1 ? new f(list) : new e(list);
    }

    public void addUpdateListener(b bVar) {
        this.listeners.add(bVar);
    }

    protected com.airbnb.lottie.value.a getCurrentKeyframe() {
        com.airbnb.lottie.c.beginSection("BaseKeyframeAnimation#getCurrentKeyframe");
        com.airbnb.lottie.value.a currentKeyframe = this.keyframesWrapper.getCurrentKeyframe();
        com.airbnb.lottie.c.endSection("BaseKeyframeAnimation#getCurrentKeyframe");
        return currentKeyframe;
    }

    @FloatRange(from = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON, to = 1.0d)
    float getEndProgress() {
        if (this.cachedEndProgress == -1.0f) {
            this.cachedEndProgress = this.keyframesWrapper.getEndProgress();
        }
        return this.cachedEndProgress;
    }

    protected float getInterpolatedCurrentKeyframeProgress() {
        com.airbnb.lottie.value.a currentKeyframe = getCurrentKeyframe();
        if (currentKeyframe == null || currentKeyframe.isStatic()) {
            return 0.0f;
        }
        return currentKeyframe.interpolator.getInterpolation(getLinearCurrentKeyframeProgress());
    }

    float getLinearCurrentKeyframeProgress() {
        if (this.isDiscrete) {
            return 0.0f;
        }
        com.airbnb.lottie.value.a currentKeyframe = getCurrentKeyframe();
        if (currentKeyframe.isStatic()) {
            return 0.0f;
        }
        return (this.progress - currentKeyframe.getStartProgress()) / (currentKeyframe.getEndProgress() - currentKeyframe.getStartProgress());
    }

    public float getProgress() {
        return this.progress;
    }

    public Object getValue() {
        float linearCurrentKeyframeProgress = getLinearCurrentKeyframeProgress();
        if (this.valueCallback == null && this.keyframesWrapper.isCachedValueEnabled(linearCurrentKeyframeProgress)) {
            return this.cachedGetValue;
        }
        com.airbnb.lottie.value.a currentKeyframe = getCurrentKeyframe();
        Interpolator interpolator = currentKeyframe.xInterpolator;
        Object value = (interpolator == null || currentKeyframe.yInterpolator == null) ? getValue(currentKeyframe, getInterpolatedCurrentKeyframeProgress()) : getValue(currentKeyframe, linearCurrentKeyframeProgress, interpolator.getInterpolation(linearCurrentKeyframeProgress), currentKeyframe.yInterpolator.getInterpolation(linearCurrentKeyframeProgress));
        this.cachedGetValue = value;
        return value;
    }

    abstract Object getValue(com.airbnb.lottie.value.a aVar, float f8);

    public void notifyListeners() {
        for (int i8 = 0; i8 < this.listeners.size(); i8++) {
            this.listeners.get(i8).onValueChanged();
        }
    }

    public void setIsDiscrete() {
        this.isDiscrete = true;
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f8) {
        if (this.keyframesWrapper.isEmpty()) {
            return;
        }
        if (f8 < getStartDelayProgress()) {
            f8 = getStartDelayProgress();
        } else if (f8 > getEndProgress()) {
            f8 = getEndProgress();
        }
        if (f8 == this.progress) {
            return;
        }
        this.progress = f8;
        if (this.keyframesWrapper.isValueChanged(f8)) {
            notifyListeners();
        }
    }

    public void setValueCallback(@Nullable com.airbnb.lottie.value.c cVar) {
        com.airbnb.lottie.value.c cVar2 = this.valueCallback;
        if (cVar2 != null) {
            cVar2.setAnimation(null);
        }
        this.valueCallback = cVar;
        if (cVar != null) {
            cVar.setAnimation(this);
        }
    }

    protected Object getValue(com.airbnb.lottie.value.a aVar, float f8, float f9, float f10) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }
}
