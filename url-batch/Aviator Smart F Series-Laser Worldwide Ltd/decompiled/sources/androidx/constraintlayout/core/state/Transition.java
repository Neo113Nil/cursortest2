package androidx.constraintlayout.core.state;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.Motion;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.key.MotionKeyAttributes;
import androidx.constraintlayout.core.motion.key.MotionKeyCycle;
import androidx.constraintlayout.core.motion.key.MotionKeyPosition;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.SpringStopEngine;
import androidx.constraintlayout.core.motion.utils.StopEngine;
import androidx.constraintlayout.core.motion.utils.StopLogicEngine;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.github.mikephil.charting.utils.i;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class Transition implements TypedValues {
    static final int ANTICIPATE = 6;
    static final int BOUNCE = 4;
    private static final boolean DEBUG = false;
    static final int EASE_IN = 1;
    static final int EASE_IN_OUT = 0;
    static final int EASE_OUT = 2;
    public static final int END = 1;
    public static final int INTERPOLATED = 2;
    private static final int INTERPOLATOR_REFERENCE_ID = -2;
    static final int LINEAR = 3;
    static final int OVERSHOOT = 5;
    private static final int SPLINE_STRING = -1;
    public static final int START = 0;
    int mParentEndHeight;
    int mParentEndWidth;
    int mParentInterpolateHeight;
    int mParentInterpolatedWidth;
    int mParentStartHeight;
    int mParentStartWidth;
    final CorePixelDp mToPixel;
    boolean mWrap;
    private HashMap<Integer, HashMap<String, KeyPosition>> mKeyPositions = new HashMap<>();
    private HashMap<String, WidgetState> mState = new HashMap<>();
    private TypedBundle mBundle = new TypedBundle();
    private int mDefaultInterpolator = 0;
    private String mDefaultInterpolatorString = null;
    private Easing mEasing = null;
    private int mAutoTransition = 0;
    private int mDuration = 400;
    private float mStagger = 0.0f;
    private OnSwipe mOnSwipe = null;

    static class KeyPosition {
        int mFrame;
        String mTarget;
        int mType;
        float mX;
        float mY;

        KeyPosition(String str, int i8, int i9, float f8, float f9) {
            this.mTarget = str;
            this.mFrame = i8;
            this.mType = i9;
            this.mX = f8;
            this.mY = f9;
        }
    }

    static class OnSwipe {
        public static final int ANCHOR_SIDE_BOTTOM = 3;
        public static final int ANCHOR_SIDE_END = 6;
        public static final int ANCHOR_SIDE_LEFT = 1;
        public static final int ANCHOR_SIDE_MIDDLE = 4;
        public static final int ANCHOR_SIDE_RIGHT = 2;
        public static final int ANCHOR_SIDE_START = 5;
        public static final int ANCHOR_SIDE_TOP = 0;
        public static final int BOUNDARY_BOUNCE_BOTH = 3;
        public static final int BOUNDARY_BOUNCE_END = 2;
        public static final int BOUNDARY_BOUNCE_START = 1;
        public static final int BOUNDARY_OVERSHOOT = 0;
        public static final int DRAG_ANTICLOCKWISE = 7;
        public static final int DRAG_CLOCKWISE = 6;
        public static final int DRAG_DOWN = 1;
        public static final int DRAG_END = 5;
        public static final int DRAG_LEFT = 2;
        public static final int DRAG_RIGHT = 3;
        public static final int DRAG_START = 4;
        public static final int DRAG_UP = 0;
        public static final int MODE_CONTINUOUS_VELOCITY = 0;
        public static final int MODE_SPRING = 1;
        public static final int ON_UP_AUTOCOMPLETE = 0;
        public static final int ON_UP_AUTOCOMPLETE_TO_END = 2;
        public static final int ON_UP_AUTOCOMPLETE_TO_START = 1;
        public static final int ON_UP_DECELERATE = 4;
        public static final int ON_UP_DECELERATE_AND_COMPLETE = 5;
        public static final int ON_UP_NEVER_COMPLETE_TO_END = 7;
        public static final int ON_UP_NEVER_COMPLETE_TO_START = 6;
        public static final int ON_UP_STOP = 3;
        String mAnchorId;
        private int mAnchorSide;
        private StopEngine mEngine;
        String mLimitBoundsTo;
        private String mRotationCenterId;
        private long mStart;
        public static final String[] SIDES = {"top", TtmlNode.LEFT, TtmlNode.RIGHT, "bottom", "middle", "start", "end"};
        private static final float[][] TOUCH_SIDES = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
        public static final String[] DIRECTIONS = {MapBundleKey.OfflineMapKey.OFFLINE_UPDATE, "down", TtmlNode.LEFT, TtmlNode.RIGHT, "start", "end", "clockwise", "anticlockwise"};
        public static final String[] MODE = {"velocity", "spring"};
        public static final String[] TOUCH_UP = {"autocomplete", "toStart", "toEnd", "stop", "decelerate", "decelerateComplete", "neverCompleteStart", "neverCompleteEnd"};
        public static final String[] BOUNDARY = {"overshoot", "bounceStart", "bounceEnd", "bounceBoth"};
        private static final float[][] TOUCH_DIRECTION = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};
        private boolean mDragVertical = true;
        private int mDragDirection = 0;
        private float mDragScale = 1.0f;
        private float mDragThreshold = 10.0f;
        private int mAutoCompleteMode = 0;
        private float mMaxVelocity = 4.0f;
        private float mMaxAcceleration = 1.2f;
        private int mOnTouchUp = 0;
        private float mSpringMass = 1.0f;
        private float mSpringStiffness = 400.0f;
        private float mSpringDamping = 10.0f;
        private float mSpringStopThreshold = 0.01f;
        private float mDestination = 0.0f;
        private int mSpringBoundary = 0;

        OnSwipe() {
        }

        void config(float f8, float f9, long j8, float f10) {
            SpringStopEngine springStopEngine;
            StopLogicEngine stopLogicEngine;
            StopLogicEngine.Decelerate decelerate;
            this.mStart = j8;
            float abs = Math.abs(f9);
            float f11 = this.mMaxVelocity;
            if (abs > f11) {
                f9 = Math.signum(f9) * f11;
            }
            float f12 = f9;
            float destinationPosition = getDestinationPosition(f8, f12, f10);
            this.mDestination = destinationPosition;
            if (destinationPosition == f8) {
                this.mEngine = null;
                return;
            }
            if (this.mOnTouchUp == 4 && this.mAutoCompleteMode == 0) {
                StopEngine stopEngine = this.mEngine;
                if (stopEngine instanceof StopLogicEngine.Decelerate) {
                    decelerate = (StopLogicEngine.Decelerate) stopEngine;
                } else {
                    decelerate = new StopLogicEngine.Decelerate();
                    this.mEngine = decelerate;
                }
                decelerate.config(f8, this.mDestination, f12);
                return;
            }
            if (this.mAutoCompleteMode == 0) {
                StopEngine stopEngine2 = this.mEngine;
                if (stopEngine2 instanceof StopLogicEngine) {
                    stopLogicEngine = (StopLogicEngine) stopEngine2;
                } else {
                    stopLogicEngine = new StopLogicEngine();
                    this.mEngine = stopLogicEngine;
                }
                stopLogicEngine.config(f8, this.mDestination, f12, f10, this.mMaxAcceleration, this.mMaxVelocity);
                return;
            }
            StopEngine stopEngine3 = this.mEngine;
            if (stopEngine3 instanceof SpringStopEngine) {
                springStopEngine = (SpringStopEngine) stopEngine3;
            } else {
                springStopEngine = new SpringStopEngine();
                this.mEngine = springStopEngine;
            }
            springStopEngine.springConfig(f8, this.mDestination, f12, this.mSpringMass, this.mSpringStiffness, this.mSpringDamping, this.mSpringStopThreshold, this.mSpringBoundary);
        }

        float getDestinationPosition(float f8, float f9, float f10) {
            float abs = (((Math.abs(f9) * 0.5f) * f9) / this.mMaxAcceleration) + f8;
            switch (this.mOnTouchUp) {
                case 1:
                    return f8 >= 1.0f ? 1.0f : 0.0f;
                case 2:
                    return f8 <= 0.0f ? 0.0f : 1.0f;
                case 3:
                    return Float.NaN;
                case 4:
                    return Math.max(0.0f, Math.min(1.0f, abs));
                case 5:
                    return (abs <= 0.2f || abs >= 0.8f) ? abs > 0.5f ? 1.0f : 0.0f : abs;
                case 6:
                    return 1.0f;
                case 7:
                    return 0.0f;
                default:
                    return ((double) abs) > 0.5d ? 1.0f : 0.0f;
            }
        }

        float[] getDirection() {
            return TOUCH_DIRECTION[this.mDragDirection];
        }

        float getScale() {
            return this.mDragScale;
        }

        float[] getSide() {
            return TOUCH_SIDES[this.mAnchorSide];
        }

        public float getTouchUpProgress(long j8) {
            return this.mEngine.isStopped() ? this.mDestination : this.mEngine.getInterpolation((j8 - this.mStart) * 1.0E-9f);
        }

        public boolean isNotDone(float f8) {
            StopEngine stopEngine;
            return (this.mOnTouchUp == 3 || (stopEngine = this.mEngine) == null || stopEngine.isStopped()) ? false : true;
        }

        public void printInfo() {
            if (this.mAutoCompleteMode == 0) {
                PrintStream printStream = System.out;
                printStream.println("velocity = " + this.mEngine.getVelocity());
                printStream.println("mMaxAcceleration = " + this.mMaxAcceleration);
                printStream.println("mMaxVelocity = " + this.mMaxVelocity);
                return;
            }
            PrintStream printStream2 = System.out;
            printStream2.println("mSpringMass          = " + this.mSpringMass);
            printStream2.println("mSpringStiffness     = " + this.mSpringStiffness);
            printStream2.println("mSpringDamping       = " + this.mSpringDamping);
            printStream2.println("mSpringStopThreshold = " + this.mSpringStopThreshold);
            printStream2.println("mSpringBoundary      = " + this.mSpringBoundary);
        }

        void setAnchorId(String str) {
            this.mAnchorId = str;
        }

        void setAnchorSide(int i8) {
            this.mAnchorSide = i8;
        }

        void setAutoCompleteMode(int i8) {
            this.mAutoCompleteMode = i8;
        }

        void setDragDirection(int i8) {
            this.mDragDirection = i8;
            this.mDragVertical = i8 < 2;
        }

        void setDragScale(float f8) {
            if (Float.isNaN(f8)) {
                return;
            }
            this.mDragScale = f8;
        }

        void setDragThreshold(float f8) {
            if (Float.isNaN(f8)) {
                return;
            }
            this.mDragThreshold = f8;
        }

        void setLimitBoundsTo(String str) {
            this.mLimitBoundsTo = str;
        }

        void setMaxAcceleration(float f8) {
            if (Float.isNaN(f8)) {
                return;
            }
            this.mMaxAcceleration = f8;
        }

        void setMaxVelocity(float f8) {
            if (Float.isNaN(f8)) {
                return;
            }
            this.mMaxVelocity = f8;
        }

        void setOnTouchUp(int i8) {
            this.mOnTouchUp = i8;
        }

        void setRotationCenterId(String str) {
            this.mRotationCenterId = str;
        }

        void setSpringBoundary(int i8) {
            this.mSpringBoundary = i8;
        }

        void setSpringDamping(float f8) {
            if (Float.isNaN(f8)) {
                return;
            }
            this.mSpringDamping = f8;
        }

        void setSpringMass(float f8) {
            if (Float.isNaN(f8)) {
                return;
            }
            this.mSpringMass = f8;
        }

        void setSpringStiffness(float f8) {
            if (Float.isNaN(f8)) {
                return;
            }
            this.mSpringStiffness = f8;
        }

        void setSpringStopThreshold(float f8) {
            if (Float.isNaN(f8)) {
                return;
            }
            this.mSpringStopThreshold = f8;
        }
    }

    public Transition(@NonNull CorePixelDp corePixelDp) {
        this.mToPixel = corePixelDp;
    }

    private void calculateParentDimensions(float f8) {
        this.mParentInterpolatedWidth = (int) (this.mParentStartWidth + 0.5f + ((this.mParentEndWidth - r0) * f8));
        this.mParentInterpolateHeight = (int) (this.mParentStartHeight + 0.5f + ((this.mParentEndHeight - r0) * f8));
    }

    public static Interpolator getInterpolator(int i8, final String str) {
        switch (i8) {
            case -1:
                return new Interpolator() { // from class: androidx.constraintlayout.core.state.a
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f8) {
                        float lambda$getInterpolator$0;
                        lambda$getInterpolator$0 = Transition.lambda$getInterpolator$0(str, f8);
                        return lambda$getInterpolator$0;
                    }
                };
            case 0:
                return new Interpolator() { // from class: androidx.constraintlayout.core.state.b
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f8) {
                        float lambda$getInterpolator$1;
                        lambda$getInterpolator$1 = Transition.lambda$getInterpolator$1(f8);
                        return lambda$getInterpolator$1;
                    }
                };
            case 1:
                return new Interpolator() { // from class: androidx.constraintlayout.core.state.c
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f8) {
                        float lambda$getInterpolator$2;
                        lambda$getInterpolator$2 = Transition.lambda$getInterpolator$2(f8);
                        return lambda$getInterpolator$2;
                    }
                };
            case 2:
                return new Interpolator() { // from class: androidx.constraintlayout.core.state.d
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f8) {
                        float lambda$getInterpolator$3;
                        lambda$getInterpolator$3 = Transition.lambda$getInterpolator$3(f8);
                        return lambda$getInterpolator$3;
                    }
                };
            case 3:
                return new Interpolator() { // from class: androidx.constraintlayout.core.state.e
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f8) {
                        float lambda$getInterpolator$4;
                        lambda$getInterpolator$4 = Transition.lambda$getInterpolator$4(f8);
                        return lambda$getInterpolator$4;
                    }
                };
            case 4:
                return new Interpolator() { // from class: androidx.constraintlayout.core.state.h
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f8) {
                        float lambda$getInterpolator$7;
                        lambda$getInterpolator$7 = Transition.lambda$getInterpolator$7(f8);
                        return lambda$getInterpolator$7;
                    }
                };
            case 5:
                return new Interpolator() { // from class: androidx.constraintlayout.core.state.g
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f8) {
                        float lambda$getInterpolator$6;
                        lambda$getInterpolator$6 = Transition.lambda$getInterpolator$6(f8);
                        return lambda$getInterpolator$6;
                    }
                };
            case 6:
                return new Interpolator() { // from class: androidx.constraintlayout.core.state.f
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f8) {
                        float lambda$getInterpolator$5;
                        lambda$getInterpolator$5 = Transition.lambda$getInterpolator$5(f8);
                        return lambda$getInterpolator$5;
                    }
                };
            default:
                return null;
        }
    }

    private WidgetState getWidgetState(String str) {
        return this.mState.get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$getInterpolator$0(String str, float f8) {
        return (float) Easing.getInterpolator(str).get(f8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$getInterpolator$1(float f8) {
        return (float) Easing.getInterpolator("standard").get(f8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$getInterpolator$2(float f8) {
        return (float) Easing.getInterpolator("accelerate").get(f8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$getInterpolator$3(float f8) {
        return (float) Easing.getInterpolator("decelerate").get(f8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$getInterpolator$4(float f8) {
        return (float) Easing.getInterpolator("linear").get(f8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$getInterpolator$5(float f8) {
        return (float) Easing.getInterpolator("anticipate").get(f8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$getInterpolator$6(float f8) {
        return (float) Easing.getInterpolator("overshoot").get(f8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$getInterpolator$7(float f8) {
        return (float) Easing.getInterpolator("spline(0.0, 0.2, 0.4, 0.6, 0.8 ,1.0, 0.8, 1.0, 0.9, 1.0)").get(f8);
    }

    public void addCustomColor(int i8, String str, String str2, int i9) {
        getWidgetState(str, null, i8).getFrame(i8).addCustomColor(str2, i9);
    }

    public void addCustomFloat(int i8, String str, String str2, float f8) {
        getWidgetState(str, null, i8).getFrame(i8).addCustomFloat(str2, f8);
    }

    public void addKeyAttribute(String str, TypedBundle typedBundle) {
        getWidgetState(str, null, 0).setKeyAttribute(typedBundle);
    }

    public void addKeyCycle(String str, TypedBundle typedBundle) {
        getWidgetState(str, null, 0).setKeyCycle(typedBundle);
    }

    public void addKeyPosition(String str, TypedBundle typedBundle) {
        getWidgetState(str, null, 0).setKeyPosition(typedBundle);
    }

    public void calcStagger() {
        float f8;
        float f9;
        float f10 = this.mStagger;
        if (f10 == 0.0f) {
            return;
        }
        boolean z7 = ((double) f10) < i.DOUBLE_EPSILON;
        float abs = Math.abs(f10);
        Iterator<String> it = this.mState.keySet().iterator();
        do {
            f8 = Float.MAX_VALUE;
            f9 = -3.4028235E38f;
            if (!it.hasNext()) {
                Iterator<String> it2 = this.mState.keySet().iterator();
                while (it2.hasNext()) {
                    Motion motion = this.mState.get(it2.next()).mMotionControl;
                    float finalX = motion.getFinalX() + motion.getFinalY();
                    f8 = Math.min(f8, finalX);
                    f9 = Math.max(f9, finalX);
                }
                Iterator<String> it3 = this.mState.keySet().iterator();
                while (it3.hasNext()) {
                    Motion motion2 = this.mState.get(it3.next()).mMotionControl;
                    float finalX2 = motion2.getFinalX() + motion2.getFinalY();
                    float f11 = f9 - f8;
                    float f12 = abs - (((finalX2 - f8) * abs) / f11);
                    if (z7) {
                        f12 = abs - (((f9 - finalX2) / f11) * abs);
                    }
                    motion2.setStaggerScale(1.0f / (1.0f - abs));
                    motion2.setStaggerOffset(f12);
                }
                return;
            }
        } while (Float.isNaN(this.mState.get(it.next()).mMotionControl.getMotionStagger()));
        Iterator<String> it4 = this.mState.keySet().iterator();
        while (it4.hasNext()) {
            float motionStagger = this.mState.get(it4.next()).mMotionControl.getMotionStagger();
            if (!Float.isNaN(motionStagger)) {
                f8 = Math.min(f8, motionStagger);
                f9 = Math.max(f9, motionStagger);
            }
        }
        Iterator<String> it5 = this.mState.keySet().iterator();
        while (it5.hasNext()) {
            Motion motion3 = this.mState.get(it5.next()).mMotionControl;
            float motionStagger2 = motion3.getMotionStagger();
            if (!Float.isNaN(motionStagger2)) {
                float f13 = 1.0f / (1.0f - abs);
                float f14 = f9 - f8;
                float f15 = abs - (((motionStagger2 - f8) * abs) / f14);
                if (z7) {
                    f15 = abs - (((f9 - motionStagger2) / f14) * abs);
                }
                motion3.setStaggerScale(f13);
                motion3.setStaggerOffset(f15);
            }
        }
    }

    public void clear() {
        this.mState.clear();
    }

    public boolean contains(String str) {
        return this.mState.containsKey(str);
    }

    OnSwipe createOnSwipe() {
        OnSwipe onSwipe = new OnSwipe();
        this.mOnSwipe = onSwipe;
        return onSwipe;
    }

    public float dragToProgress(float f8, int i8, int i9, float f9, float f10) {
        float abs;
        float scale;
        Iterator<WidgetState> it = this.mState.values().iterator();
        WidgetState next = it.hasNext() ? it.next() : null;
        OnSwipe onSwipe = this.mOnSwipe;
        if (onSwipe == null || next == null) {
            if (next != null) {
                return (-f10) / next.mParentHeight;
            }
            return 1.0f;
        }
        String str = onSwipe.mAnchorId;
        if (str == null) {
            float[] direction = onSwipe.getDirection();
            int i10 = next.mParentHeight;
            float f11 = i10;
            float f12 = i10;
            float f13 = direction[0];
            abs = f13 != 0.0f ? (f9 * Math.abs(f13)) / f11 : (f10 * Math.abs(direction[1])) / f12;
            scale = this.mOnSwipe.getScale();
        } else {
            WidgetState widgetState = this.mState.get(str);
            float[] direction2 = this.mOnSwipe.getDirection();
            float[] side = this.mOnSwipe.getSide();
            float[] fArr = new float[2];
            widgetState.interpolate(i8, i9, f8, this);
            widgetState.mMotionControl.getDpDt(f8, side[0], side[1], fArr);
            float f14 = direction2[0];
            abs = f14 != 0.0f ? (f9 * Math.abs(f14)) / fArr[0] : (f10 * Math.abs(direction2[1])) / fArr[1];
            scale = this.mOnSwipe.getScale();
        }
        return abs * scale;
    }

    public void fillKeyPositions(WidgetFrame widgetFrame, float[] fArr, float[] fArr2, float[] fArr3) {
        KeyPosition keyPosition;
        int i8 = 0;
        for (int i9 = 0; i9 <= 100; i9++) {
            HashMap<String, KeyPosition> hashMap = this.mKeyPositions.get(Integer.valueOf(i9));
            if (hashMap != null && (keyPosition = hashMap.get(widgetFrame.widget.stringId)) != null) {
                fArr[i8] = keyPosition.mX;
                fArr2[i8] = keyPosition.mY;
                fArr3[i8] = keyPosition.mFrame;
                i8++;
            }
        }
    }

    public KeyPosition findNextPosition(String str, int i8) {
        KeyPosition keyPosition;
        while (i8 <= 100) {
            HashMap<String, KeyPosition> hashMap = this.mKeyPositions.get(Integer.valueOf(i8));
            if (hashMap != null && (keyPosition = hashMap.get(str)) != null) {
                return keyPosition;
            }
            i8++;
        }
        return null;
    }

    public KeyPosition findPreviousPosition(String str, int i8) {
        KeyPosition keyPosition;
        while (i8 >= 0) {
            HashMap<String, KeyPosition> hashMap = this.mKeyPositions.get(Integer.valueOf(i8));
            if (hashMap != null && (keyPosition = hashMap.get(str)) != null) {
                return keyPosition;
            }
            i8--;
        }
        return null;
    }

    public int getAutoTransition() {
        return this.mAutoTransition;
    }

    public WidgetFrame getEnd(String str) {
        WidgetState widgetState = this.mState.get(str);
        if (widgetState == null) {
            return null;
        }
        return widgetState.mEnd;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String str) {
        return 0;
    }

    public WidgetFrame getInterpolated(String str) {
        WidgetState widgetState = this.mState.get(str);
        if (widgetState == null) {
            return null;
        }
        return widgetState.mInterpolated;
    }

    public int getInterpolatedHeight() {
        return this.mParentInterpolateHeight;
    }

    public int getInterpolatedWidth() {
        return this.mParentInterpolatedWidth;
    }

    public int getKeyFrames(String str, float[] fArr, int[] iArr, int[] iArr2) {
        return this.mState.get(str).mMotionControl.buildKeyFrames(fArr, iArr, iArr2);
    }

    public Motion getMotion(String str) {
        return getWidgetState(str, null, 0).mMotionControl;
    }

    public int getNumberKeyPositions(WidgetFrame widgetFrame) {
        int i8 = 0;
        for (int i9 = 0; i9 <= 100; i9++) {
            HashMap<String, KeyPosition> hashMap = this.mKeyPositions.get(Integer.valueOf(i9));
            if (hashMap != null && hashMap.get(widgetFrame.widget.stringId) != null) {
                i8++;
            }
        }
        return i8;
    }

    public float[] getPath(String str) {
        float[] fArr = new float[124];
        this.mState.get(str).mMotionControl.buildPath(fArr, 62);
        return fArr;
    }

    public WidgetFrame getStart(String str) {
        WidgetState widgetState = this.mState.get(str);
        if (widgetState == null) {
            return null;
        }
        return widgetState.mStart;
    }

    public float getTouchUpProgress(long j8) {
        OnSwipe onSwipe = this.mOnSwipe;
        if (onSwipe != null) {
            return onSwipe.getTouchUpProgress(j8);
        }
        return 0.0f;
    }

    public boolean hasOnSwipe() {
        return this.mOnSwipe != null;
    }

    public boolean hasPositionKeyframes() {
        return this.mKeyPositions.size() > 0;
    }

    public void interpolate(int i8, int i9, float f8) {
        if (this.mWrap) {
            calculateParentDimensions(f8);
        }
        Easing easing = this.mEasing;
        if (easing != null) {
            f8 = (float) easing.get(f8);
        }
        Iterator<String> it = this.mState.keySet().iterator();
        while (it.hasNext()) {
            this.mState.get(it.next()).interpolate(i8, i9, f8, this);
        }
    }

    public boolean isEmpty() {
        return this.mState.isEmpty();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isFirstDownAccepted(float f8, float f9) {
        OnSwipe onSwipe = this.mOnSwipe;
        if (onSwipe == null) {
            return false;
        }
        String str = onSwipe.mLimitBoundsTo;
        if (str == null) {
            return true;
        }
        WidgetState widgetState = this.mState.get(str);
        if (widgetState == null) {
            System.err.println("mLimitBoundsTo target is null");
            return false;
        }
        WidgetFrame frame = widgetState.getFrame(2);
        return f8 >= ((float) frame.left) && f8 < ((float) frame.right) && f9 >= ((float) frame.top) && f9 < ((float) frame.bottom);
    }

    public boolean isTouchNotDone(float f8) {
        return this.mOnSwipe.isNotDone(f8);
    }

    void resetProperties() {
        this.mOnSwipe = null;
        this.mBundle.clear();
    }

    public void setTouchUp(float f8, long j8, float f9, float f10) {
        OnSwipe onSwipe = this.mOnSwipe;
        if (onSwipe != null) {
            WidgetState widgetState = this.mState.get(onSwipe.mAnchorId);
            float[] fArr = new float[2];
            float[] direction = this.mOnSwipe.getDirection();
            float[] side = this.mOnSwipe.getSide();
            widgetState.mMotionControl.getDpDt(f8, side[0], side[1], fArr);
            if (Math.abs((direction[0] * fArr[0]) + (direction[1] * fArr[1])) < 0.01d) {
                fArr[0] = 0.01f;
                fArr[1] = 0.01f;
            }
            this.mOnSwipe.config(f8, (direction[0] != 0.0f ? f9 / fArr[0] : f10 / fArr[1]) * this.mOnSwipe.getScale(), j8, this.mDuration * 0.001f);
        }
    }

    public void setTransitionProperties(TypedBundle typedBundle) {
        typedBundle.applyDelta(this.mBundle);
        typedBundle.applyDelta(this);
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i8, float f8) {
        if (i8 != 706) {
            return false;
        }
        this.mStagger = f8;
        return false;
    }

    public void updateFrom(ConstraintWidgetContainer constraintWidgetContainer, int i8) {
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidgetContainer.mListDimensionBehaviors;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean z7 = dimensionBehaviour == dimensionBehaviour2;
        this.mWrap = z7;
        this.mWrap = z7 | (dimensionBehaviourArr[1] == dimensionBehaviour2);
        if (i8 == 0) {
            int width = constraintWidgetContainer.getWidth();
            this.mParentStartWidth = width;
            this.mParentInterpolatedWidth = width;
            int height = constraintWidgetContainer.getHeight();
            this.mParentStartHeight = height;
            this.mParentInterpolateHeight = height;
        } else {
            this.mParentEndWidth = constraintWidgetContainer.getWidth();
            this.mParentEndHeight = constraintWidgetContainer.getHeight();
        }
        ArrayList<ConstraintWidget> children = constraintWidgetContainer.getChildren();
        int size = children.size();
        WidgetState[] widgetStateArr = new WidgetState[size];
        for (int i9 = 0; i9 < size; i9++) {
            ConstraintWidget constraintWidget = children.get(i9);
            WidgetState widgetState = getWidgetState(constraintWidget.stringId, null, i8);
            widgetStateArr[i9] = widgetState;
            widgetState.update(constraintWidget, i8);
            String pathRelativeId = widgetState.getPathRelativeId();
            if (pathRelativeId != null) {
                widgetState.setPathRelative(getWidgetState(pathRelativeId, null, i8));
            }
        }
        calcStagger();
    }

    public void addKeyAttribute(String str, TypedBundle typedBundle, CustomVariable[] customVariableArr) {
        getWidgetState(str, null, 0).setKeyAttribute(typedBundle, customVariableArr);
    }

    public void addKeyPosition(String str, int i8, int i9, float f8, float f9) {
        TypedBundle typedBundle = new TypedBundle();
        typedBundle.add(510, 2);
        typedBundle.add(100, i8);
        typedBundle.add(506, f8);
        typedBundle.add(507, f9);
        getWidgetState(str, null, 0).setKeyPosition(typedBundle);
        KeyPosition keyPosition = new KeyPosition(str, i8, i9, f8, f9);
        HashMap<String, KeyPosition> hashMap = this.mKeyPositions.get(Integer.valueOf(i8));
        if (hashMap == null) {
            hashMap = new HashMap<>();
            this.mKeyPositions.put(Integer.valueOf(i8), hashMap);
        }
        hashMap.put(str, keyPosition);
    }

    public WidgetState getWidgetState(String str, ConstraintWidget constraintWidget, int i8) {
        WidgetState widgetState = this.mState.get(str);
        if (widgetState == null) {
            widgetState = new WidgetState();
            this.mBundle.applyDelta(widgetState.mMotionControl);
            widgetState.mMotionWidgetStart.updateMotion(widgetState.mMotionControl);
            this.mState.put(str, widgetState);
            if (constraintWidget != null) {
                widgetState.update(constraintWidget, i8);
            }
        }
        return widgetState;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i8, int i9) {
        return false;
    }

    public static class WidgetState {
        Motion mMotionControl;
        boolean mNeedSetup = true;
        KeyCache mKeyCache = new KeyCache();
        int mParentHeight = -1;
        int mParentWidth = -1;
        WidgetFrame mStart = new WidgetFrame();
        WidgetFrame mEnd = new WidgetFrame();
        WidgetFrame mInterpolated = new WidgetFrame();
        MotionWidget mMotionWidgetStart = new MotionWidget(this.mStart);
        MotionWidget mMotionWidgetEnd = new MotionWidget(this.mEnd);
        MotionWidget mMotionWidgetInterpolated = new MotionWidget(this.mInterpolated);

        public WidgetState() {
            Motion motion = new Motion(this.mMotionWidgetStart);
            this.mMotionControl = motion;
            motion.setStart(this.mMotionWidgetStart);
            this.mMotionControl.setEnd(this.mMotionWidgetEnd);
        }

        public WidgetFrame getFrame(int i8) {
            return i8 == 0 ? this.mStart : i8 == 1 ? this.mEnd : this.mInterpolated;
        }

        String getPathRelativeId() {
            return this.mMotionControl.getAnimateRelativeTo();
        }

        public void interpolate(int i8, int i9, float f8, Transition transition) {
            this.mParentHeight = i9;
            this.mParentWidth = i8;
            if (this.mNeedSetup) {
                this.mMotionControl.setup(i8, i9, 1.0f, System.nanoTime());
                this.mNeedSetup = false;
            }
            WidgetFrame.interpolate(i8, i9, this.mInterpolated, this.mStart, this.mEnd, transition, f8);
            this.mInterpolated.interpolatedPos = f8;
            this.mMotionControl.interpolate(this.mMotionWidgetInterpolated, f8, System.nanoTime(), this.mKeyCache);
        }

        public void setKeyAttribute(TypedBundle typedBundle) {
            MotionKeyAttributes motionKeyAttributes = new MotionKeyAttributes();
            typedBundle.applyDelta(motionKeyAttributes);
            this.mMotionControl.addKey(motionKeyAttributes);
        }

        public void setKeyCycle(TypedBundle typedBundle) {
            MotionKeyCycle motionKeyCycle = new MotionKeyCycle();
            typedBundle.applyDelta(motionKeyCycle);
            this.mMotionControl.addKey(motionKeyCycle);
        }

        public void setKeyPosition(TypedBundle typedBundle) {
            MotionKeyPosition motionKeyPosition = new MotionKeyPosition();
            typedBundle.applyDelta(motionKeyPosition);
            this.mMotionControl.addKey(motionKeyPosition);
        }

        public void setPathRelative(WidgetState widgetState) {
            this.mMotionControl.setupRelative(widgetState.mMotionControl);
        }

        public void update(ConstraintWidget constraintWidget, int i8) {
            if (i8 == 0) {
                this.mStart.update(constraintWidget);
                MotionWidget motionWidget = this.mMotionWidgetStart;
                motionWidget.updateMotion(motionWidget);
                this.mMotionControl.setStart(this.mMotionWidgetStart);
                this.mNeedSetup = true;
            } else if (i8 == 1) {
                this.mEnd.update(constraintWidget);
                this.mMotionControl.setEnd(this.mMotionWidgetEnd);
                this.mNeedSetup = true;
            }
            this.mParentWidth = -1;
        }

        public void setKeyAttribute(TypedBundle typedBundle, CustomVariable[] customVariableArr) {
            MotionKeyAttributes motionKeyAttributes = new MotionKeyAttributes();
            typedBundle.applyDelta(motionKeyAttributes);
            if (customVariableArr != null) {
                for (int i8 = 0; i8 < customVariableArr.length; i8++) {
                    motionKeyAttributes.mCustom.put(customVariableArr[i8].getName(), customVariableArr[i8]);
                }
            }
            this.mMotionControl.addKey(motionKeyAttributes);
        }
    }

    public WidgetFrame getEnd(ConstraintWidget constraintWidget) {
        return getWidgetState(constraintWidget.stringId, null, 1).mEnd;
    }

    public WidgetFrame getInterpolated(ConstraintWidget constraintWidget) {
        return getWidgetState(constraintWidget.stringId, null, 2).mInterpolated;
    }

    public WidgetFrame getStart(ConstraintWidget constraintWidget) {
        return getWidgetState(constraintWidget.stringId, null, 0).mStart;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i8, boolean z7) {
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i8, String str) {
        if (i8 != 705) {
            return false;
        }
        this.mDefaultInterpolatorString = str;
        this.mEasing = Easing.getInterpolator(str);
        return false;
    }

    public Interpolator getInterpolator() {
        return getInterpolator(this.mDefaultInterpolator, this.mDefaultInterpolatorString);
    }
}
