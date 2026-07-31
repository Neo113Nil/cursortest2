package androidx.dynamicanimation.animation;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.dynamicanimation.animation.AnimationHandler;
import androidx.dynamicanimation.animation.DynamicAnimation;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public abstract class DynamicAnimation<T extends DynamicAnimation<T>> implements AnimationHandler.AnimationFrameCallback {
    private final ArrayList mEndListeners;
    private long mLastFrameTime;
    float mMaxValue;
    float mMinValue;
    final FloatPropertyCompat mProperty;
    boolean mRunning;
    boolean mStartValueIsSet;
    final Object mTarget;
    private final ArrayList mUpdateListeners;
    float mValue;
    float mVelocity;
    public static final ViewProperty TRANSLATION_X = new ViewProperty("translationX") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.1
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(View view, float f) {
            view.setTranslationX(f);
        }
    };
    public static final ViewProperty TRANSLATION_Y = new ViewProperty("translationY") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.2
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(View view, float f) {
            view.setTranslationY(f);
        }
    };
    public static final ViewProperty TRANSLATION_Z = new ViewProperty("translationZ") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.3
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(View view, float f) {
            ViewCompat.setTranslationZ(view, f);
        }
    };
    public static final ViewProperty SCALE_X = new ViewProperty("scaleX") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.4
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(View view, float f) {
            view.setScaleX(f);
        }
    };
    public static final ViewProperty SCALE_Y = new ViewProperty("scaleY") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.5
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(View view, float f) {
            view.setScaleY(f);
        }
    };
    public static final ViewProperty ROTATION = new ViewProperty("rotation") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.6
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(View view, float f) {
            view.setRotation(f);
        }
    };
    public static final ViewProperty ROTATION_X = new ViewProperty("rotationX") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.7
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(View view, float f) {
            view.setRotationX(f);
        }
    };
    public static final ViewProperty ROTATION_Y = new ViewProperty("rotationY") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.8
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(View view, float f) {
            view.setRotationY(f);
        }
    };
    public static final ViewProperty X = new ViewProperty(VastAttributes.HORIZONTAL_POSITION) { // from class: androidx.dynamicanimation.animation.DynamicAnimation.9
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(View view, float f) {
            view.setX(f);
        }
    };
    public static final ViewProperty Y = new ViewProperty(VastAttributes.VERTICAL_POSITION) { // from class: androidx.dynamicanimation.animation.DynamicAnimation.10
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(View view, float f) {
            view.setY(f);
        }
    };
    public static final ViewProperty Z = new ViewProperty("z") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.11
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(View view, float f) {
            ViewCompat.setZ(view, f);
        }
    };
    public static final ViewProperty ALPHA = new ViewProperty("alpha") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.12
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(View view, float f) {
            view.setAlpha(f);
        }
    };
    public static final ViewProperty SCROLL_X = new ViewProperty("scrollX") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.13
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(View view, float f) {
            view.setScrollX((int) f);
        }
    };
    public static final ViewProperty SCROLL_Y = new ViewProperty("scrollY") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.14
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(View view, float f) {
            view.setScrollY((int) f);
        }
    };

    static class MassState {
        float mValue;
        float mVelocity;
    }

    public interface OnAnimationEndListener {
        void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2);
    }

    public interface OnAnimationUpdateListener {
        void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2);
    }

    abstract boolean updateValueAndVelocity(long j);

    public static abstract class ViewProperty extends FloatPropertyCompat<View> {
        private ViewProperty(String str) {
            super(str);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$15, reason: invalid class name */
    /* loaded from: classes15.dex */
    class AnonymousClass15 extends FloatPropertyCompat {
        final /* synthetic */ FloatValueHolder val$floatValueHolder;

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(Object obj, float f) {
            this.val$floatValueHolder.setValue(f);
        }
    }

    private static void removeNullEntries(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    @Override // androidx.dynamicanimation.animation.AnimationHandler.AnimationFrameCallback
    public boolean doAnimationFrame(long j) {
        long j2 = this.mLastFrameTime;
        if (j2 == 0) {
            this.mLastFrameTime = j;
            setPropertyValue(this.mValue);
            return false;
        }
        this.mLastFrameTime = j;
        boolean updateValueAndVelocity = updateValueAndVelocity(j - j2);
        float min = Math.min(this.mValue, this.mMaxValue);
        this.mValue = min;
        float max = Math.max(min, this.mMinValue);
        this.mValue = max;
        setPropertyValue(max);
        if (updateValueAndVelocity) {
            endAnimationInternal(false);
        }
        return updateValueAndVelocity;
    }

    private void endAnimationInternal(boolean z) {
        this.mRunning = false;
        AnimationHandler.getInstance().removeCallback(this);
        this.mLastFrameTime = 0L;
        this.mStartValueIsSet = false;
        for (int i = 0; i < this.mEndListeners.size(); i++) {
            if (this.mEndListeners.get(i) != null) {
                ((OnAnimationEndListener) this.mEndListeners.get(i)).onAnimationEnd(this, z, this.mValue, this.mVelocity);
            }
        }
        removeNullEntries(this.mEndListeners);
    }

    void setPropertyValue(float f) {
        this.mProperty.setValue(this.mTarget, f);
        for (int i = 0; i < this.mUpdateListeners.size(); i++) {
            if (this.mUpdateListeners.get(i) != null) {
                ((OnAnimationUpdateListener) this.mUpdateListeners.get(i)).onAnimationUpdate(this, this.mValue, this.mVelocity);
            }
        }
        removeNullEntries(this.mUpdateListeners);
    }
}
