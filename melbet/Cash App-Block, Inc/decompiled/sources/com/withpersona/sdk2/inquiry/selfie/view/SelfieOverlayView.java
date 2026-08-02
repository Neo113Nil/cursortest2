package com.withpersona.sdk2.inquiry.selfie.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cardcustomizations.stampview.StampsKt$$ExternalSyntheticLambda4;
import com.withpersona.sdk2.camera.selfie.SelfieBrightnessInfo;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes9.dex */
public final class SelfieOverlayView extends FrameLayout {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final int arcBaseColor;
    public final Path arcBottom;
    public final Paint arcBottomPaint;
    public final Path arcDialHighlightClipPathLeft;
    public final Path arcDialHighlightClipPathRight;
    public final Path arcDialLeft;
    public float arcDialLeftIntensity;
    public final Paint arcDialLeftPaint;
    public final Path arcDialRight;
    public float arcDialRightIntensity;
    public final Paint arcDialRightPaint;
    public final float arcDialStrokeWidth;
    public final float arcGapDegrees;
    public final int arcHighlightColor;
    public final ArcHoverState arcHoverState;
    public final float arcInset;
    public final Path arcLeft;
    public final Paint arcLeftPaint;
    public final Path arcRight;
    public final Paint arcRightPaint;
    public final float arcStrokeWidth;
    public final float arcTickLength;
    public final Path arcTop;
    public final Paint arcTopPaint;
    public SelfieBrightnessInfo brightnessInfo;
    public final int colorOnSurface;
    public float currentIntensity;
    public ValueAnimator directionHintAnimator;
    public final Paint filledArcDialPaint;
    public IntensityAnimationState intensityAnimationState;
    public ValueAnimator intensityAnimator;
    public boolean isPreviewMirrored;
    public final int shadowColor;
    public final Paint shadowPaint;
    public State state;
    public StateAnimationState stateAnimationState;
    public ValueAnimator stateAnimator;

    public enum EndStateConstants {
        Center(1.0f, 1.0f, 1.0f, 1.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE),
        Left(0.1f, 0.1f, RecyclerView.DECELERATION_RATE, 0.1f, 1.0f, RecyclerView.DECELERATION_RATE),
        Right(0.1f, 0.1f, 0.1f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f),
        None(0.1f, 0.1f, 0.1f, 0.1f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE),
        Finalizing(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);

        public final float arcBottomAlpha;
        public final float arcDialLeftAlpha;
        public final float arcDialRightAlpha;
        public final float arcLeftAlpha;
        public final float arcRightAlpha;
        public final float arcTopAlpha;

        EndStateConstants(float f, float f2, float f3, float f4, float f5, float f6) {
            this.arcTopAlpha = f;
            this.arcBottomAlpha = f2;
            this.arcLeftAlpha = f3;
            this.arcRightAlpha = f4;
            this.arcDialLeftAlpha = f5;
            this.arcDialRightAlpha = f6;
        }
    }

    public final class IntensityAnimationState {
        public float endIntensity;
        public float progress;
        public float startIntensity;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IntensityAnimationState)) {
                return false;
            }
            IntensityAnimationState intensityAnimationState = (IntensityAnimationState) obj;
            return Float.compare(this.progress, intensityAnimationState.progress) == 0 && Float.compare(this.startIntensity, intensityAnimationState.startIntensity) == 0 && Float.compare(this.endIntensity, intensityAnimationState.endIntensity) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.endIntensity) + CameraState$Type$EnumUnboxingLocalUtility.m(this.startIntensity, Float.hashCode(this.progress) * 31, 31);
        }

        public final String toString() {
            return Recorder$$ExternalSyntheticOutline1.m(this.endIntensity, ")", JsonLogicResult$Success$$ExternalSyntheticOutline0.m("IntensityAnimationState(progress=", this.progress, ", startIntensity=", this.startIntensity, ", endIntensity="));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class State {
        public static final /* synthetic */ State[] $VALUES;
        public static final State Center;
        public static final State Finalizing;
        public static final State Left;
        public static final State None;
        public static final State Right;

        static {
            State state = new State("Center", 0);
            Center = state;
            State state2 = new State("Left", 1);
            Left = state2;
            State state3 = new State("Right", 2);
            Right = state3;
            State state4 = new State("None", 3);
            None = state4;
            State state5 = new State("Finalizing", 4);
            Finalizing = state5;
            $VALUES = new State[]{state, state2, state3, state4, state5};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public final class StateAnimationState {
        public final State endState;
        public float progress;
        public final float startArcBottomAlpha;
        public final float startArcDialLeftAlpha;
        public final float startArcDialRightAlpha;
        public final float startArcLeftAlpha;
        public final float startArcRightAlpha;
        public final float startArcTopAlpha;
        public final State startState;

        public StateAnimationState(State state, State state2, float f, float f2, float f3, float f4, float f5, float f6) {
            state.getClass();
            state2.getClass();
            this.startState = state;
            this.endState = state2;
            this.progress = RecyclerView.DECELERATION_RATE;
            this.startArcTopAlpha = f;
            this.startArcBottomAlpha = f2;
            this.startArcLeftAlpha = f3;
            this.startArcRightAlpha = f4;
            this.startArcDialLeftAlpha = f5;
            this.startArcDialRightAlpha = f6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateAnimationState)) {
                return false;
            }
            StateAnimationState stateAnimationState = (StateAnimationState) obj;
            return this.startState == stateAnimationState.startState && this.endState == stateAnimationState.endState && Float.compare(this.progress, stateAnimationState.progress) == 0 && Float.compare(this.startArcTopAlpha, stateAnimationState.startArcTopAlpha) == 0 && Float.compare(this.startArcBottomAlpha, stateAnimationState.startArcBottomAlpha) == 0 && Float.compare(this.startArcLeftAlpha, stateAnimationState.startArcLeftAlpha) == 0 && Float.compare(this.startArcRightAlpha, stateAnimationState.startArcRightAlpha) == 0 && Float.compare(this.startArcDialLeftAlpha, stateAnimationState.startArcDialLeftAlpha) == 0 && Float.compare(this.startArcDialRightAlpha, stateAnimationState.startArcDialRightAlpha) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.startArcDialRightAlpha) + CameraState$Type$EnumUnboxingLocalUtility.m(this.startArcDialLeftAlpha, CameraState$Type$EnumUnboxingLocalUtility.m(this.startArcRightAlpha, CameraState$Type$EnumUnboxingLocalUtility.m(this.startArcLeftAlpha, CameraState$Type$EnumUnboxingLocalUtility.m(this.startArcBottomAlpha, CameraState$Type$EnumUnboxingLocalUtility.m(this.startArcTopAlpha, CameraState$Type$EnumUnboxingLocalUtility.m(this.progress, (this.endState.hashCode() + ((this.startState.hashCode() + (Boolean.hashCode(true) * 31)) * 31)) * 31, 31), 31), 31), 31), 31), 31);
        }

        public final String toString() {
            float f = this.progress;
            StringBuilder sb = new StringBuilder("StateAnimationState(animating=true, startState=");
            sb.append(this.startState);
            sb.append(", endState=");
            sb.append(this.endState);
            sb.append(", progress=");
            Request$Priority$EnumUnboxingLocalUtility.m(sb, f, ", startArcTopAlpha=", this.startArcTopAlpha, ", startArcBottomAlpha=");
            Request$Priority$EnumUnboxingLocalUtility.m(sb, this.startArcBottomAlpha, ", startArcLeftAlpha=", this.startArcLeftAlpha, ", startArcRightAlpha=");
            Request$Priority$EnumUnboxingLocalUtility.m(sb, this.startArcRightAlpha, ", startArcDialLeftAlpha=", this.startArcDialLeftAlpha, ", startArcDialRightAlpha=");
            return Recorder$$ExternalSyntheticOutline1.m(this.startArcDialRightAlpha, ")", sb);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfieOverlayView(Context context) {
        super(context);
        context.getClass();
        this.state = State.Center;
        this.colorOnSurface = -1;
        this.shadowColor = -16777216;
        this.arcBaseColor = -1;
        this.arcHighlightColor = -13910906;
        this.arcInset = (float) ExtensionsKt.getDpToPx(48.0d);
        this.arcGapDegrees = 20.0f;
        this.arcStrokeWidth = (float) ExtensionsKt.getDpToPx(4.0d);
        this.arcDialStrokeWidth = (float) ExtensionsKt.getDpToPx(2.0d);
        this.arcTickLength = (float) ExtensionsKt.getDpToPx(24.0d);
        this.arcTop = new Path();
        this.arcBottom = new Path();
        this.arcLeft = new Path();
        this.arcRight = new Path();
        this.arcDialLeft = new Path();
        this.arcDialRight = new Path();
        this.arcDialHighlightClipPathRight = new Path();
        this.arcDialHighlightClipPathLeft = new Path();
        this.arcTopPaint = newArcPaint();
        this.arcBottomPaint = newArcPaint();
        this.arcLeftPaint = newArcPaint();
        this.arcRightPaint = newArcPaint();
        this.shadowPaint = newShadowPaint();
        Paint newArcDialPaint = newArcDialPaint();
        newArcDialPaint.setAlpha(0);
        this.arcDialLeftPaint = newArcDialPaint;
        Paint newArcDialPaint2 = newArcDialPaint();
        newArcDialPaint2.setAlpha(0);
        this.arcDialRightPaint = newArcDialPaint2;
        Paint newArcDialPaint3 = newArcDialPaint();
        newArcDialPaint3.setColor(-13910906);
        this.filledArcDialPaint = newArcDialPaint3;
        ArcHoverState arcHoverState = new ArcHoverState();
        focus(arcHoverState, this.currentIntensity);
        this.arcHoverState = arcHoverState;
        this.brightnessInfo = new SelfieBrightnessInfo();
        setWillNotDraw(false);
    }

    public static void addDial(Path path, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = (f3 - f) / 2.0f;
        float f8 = f7 + f;
        float f9 = f7 + f2;
        float f10 = f6 / 2.0f;
        double radians = Math.toRadians(f4);
        double radians2 = Math.toRadians(f5) / 29.0d;
        int i = 0;
        while (i < 30) {
            float f11 = f7 + f10;
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            float f12 = f7;
            double d = f7 - f10;
            float f13 = f8;
            float f14 = f9;
            double d2 = radians;
            double d3 = f11;
            path.moveTo(((float) (d * cos)) + f13, ((float) (d * sin)) + f14);
            path.lineTo(((float) (cos * d3)) + f13, ((float) (d3 * sin)) + f14);
            radians = d2 + radians2;
            i++;
            f10 = f10;
            f9 = f14;
            f7 = f12;
            f8 = f13;
        }
    }

    public static void focus(ArcHoverState arcHoverState, float f) {
        float f2 = (float) (48.0d / ExtensionsKt.displayMetrics.density);
        arcHoverState.arcTopTranslateX = RecyclerView.DECELERATION_RATE;
        float f3 = f2 * f;
        arcHoverState.arcTopTranslateY = f3;
        arcHoverState.arcBottomTranslateX = RecyclerView.DECELERATION_RATE;
        float f4 = (-f2) * f;
        arcHoverState.arcBottomTranslateY = f4;
        arcHoverState.arcLeftTranslateX = f3;
        arcHoverState.arcLeftTranslateY = RecyclerView.DECELERATION_RATE;
        arcHoverState.arcRightTranslateX = f4;
        arcHoverState.arcRightTranslateY = RecyclerView.DECELERATION_RATE;
        arcHoverState.arcThicknessMultiplier = f + 1.0f;
    }

    public static EndStateConstants getEndState(State state) {
        int ordinal = state.ordinal();
        if (ordinal == 0) {
            return EndStateConstants.Center;
        }
        if (ordinal == 1) {
            return EndStateConstants.Left;
        }
        if (ordinal == 2) {
            return EndStateConstants.Right;
        }
        if (ordinal == 3) {
            return EndStateConstants.None;
        }
        if (ordinal == 4) {
            return EndStateConstants.Finalizing;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static void interpolate(ArcHoverState arcHoverState, ArcHoverState arcHoverState2, ArcHoverState arcHoverState3, float f) {
        float f2 = arcHoverState2.arcTopTranslateX;
        arcHoverState.arcTopTranslateX = CameraState$Type$EnumUnboxingLocalUtility.m(arcHoverState3.arcTopTranslateX, f2, f, f2);
        float f3 = arcHoverState2.arcTopTranslateY;
        arcHoverState.arcTopTranslateY = CameraState$Type$EnumUnboxingLocalUtility.m(arcHoverState3.arcTopTranslateY, f3, f, f3);
        float f4 = arcHoverState2.arcBottomTranslateX;
        arcHoverState.arcBottomTranslateX = CameraState$Type$EnumUnboxingLocalUtility.m(arcHoverState3.arcBottomTranslateX, f4, f, f4);
        float f5 = arcHoverState2.arcBottomTranslateY;
        arcHoverState.arcBottomTranslateY = CameraState$Type$EnumUnboxingLocalUtility.m(arcHoverState3.arcBottomTranslateY, f5, f, f5);
        float f6 = arcHoverState2.arcLeftTranslateX;
        arcHoverState.arcLeftTranslateX = CameraState$Type$EnumUnboxingLocalUtility.m(arcHoverState3.arcLeftTranslateX, f6, f, f6);
        float f7 = arcHoverState2.arcLeftTranslateY;
        arcHoverState.arcLeftTranslateY = CameraState$Type$EnumUnboxingLocalUtility.m(arcHoverState3.arcLeftTranslateY, f7, f, f7);
        float f8 = arcHoverState2.arcRightTranslateX;
        arcHoverState.arcRightTranslateX = CameraState$Type$EnumUnboxingLocalUtility.m(arcHoverState3.arcRightTranslateX, f8, f, f8);
        float f9 = arcHoverState2.arcRightTranslateY;
        arcHoverState.arcRightTranslateY = CameraState$Type$EnumUnboxingLocalUtility.m(arcHoverState3.arcRightTranslateY, f9, f, f9);
        float f10 = arcHoverState2.arcThicknessMultiplier;
        arcHoverState.arcThicknessMultiplier = CameraState$Type$EnumUnboxingLocalUtility.m(arcHoverState3.arcThicknessMultiplier, f10, f, f10);
    }

    public static final void onDirectionChanged$playDirectionAnimation(State state, SelfieOverlayView selfieOverlayView) {
        ArcHoverState arcHoverState = selfieOverlayView.arcHoverState;
        int ordinal = state.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(RecyclerView.DECELERATION_RATE, 1.0f);
                ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                ofFloat.setRepeatMode(2);
                ofFloat.setStartDelay(0L);
                ofFloat.setRepeatCount(-1);
                ofFloat.setDuration(700L);
                ArcHoverState copy$default = ArcHoverState.copy$default(arcHoverState);
                ArcHoverState arcHoverState2 = new ArcHoverState();
                arcHoverState2.arcLeftTranslateX = -((float) (48.0d / ExtensionsKt.displayMetrics.density));
                ofFloat.addUpdateListener(new StampsKt$$ExternalSyntheticLambda4(3, selfieOverlayView, copy$default, arcHoverState2));
                ofFloat.start();
                selfieOverlayView.directionHintAnimator = ofFloat;
                return;
            }
            if (ordinal != 2) {
                if (ordinal == 3 || ordinal == 4) {
                    return;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(RecyclerView.DECELERATION_RATE, 1.0f);
            ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat2.setRepeatMode(2);
            ofFloat2.setStartDelay(0L);
            ofFloat2.setRepeatCount(-1);
            ofFloat2.setDuration(700L);
            ArcHoverState copy$default2 = ArcHoverState.copy$default(arcHoverState);
            ArcHoverState arcHoverState3 = new ArcHoverState();
            arcHoverState3.arcRightTranslateX = (float) (48.0d / ExtensionsKt.displayMetrics.density);
            ofFloat2.addUpdateListener(new StampsKt$$ExternalSyntheticLambda4(4, selfieOverlayView, copy$default2, arcHoverState3));
            ofFloat2.start();
            selfieOverlayView.directionHintAnimator = ofFloat2;
        }
    }

    public static /* synthetic */ void setState$default(SelfieOverlayView selfieOverlayView, State state, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        selfieOverlayView.setState(state, z);
    }

    public final void applyCurrentState() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        State state;
        float f7;
        StateAnimationState stateAnimationState = this.stateAnimationState;
        IntensityAnimationState intensityAnimationState = this.intensityAnimationState;
        if (stateAnimationState != null) {
            float f8 = stateAnimationState.progress;
            EndStateConstants endState = getEndState(stateAnimationState.endState);
            float f9 = stateAnimationState.startArcTopAlpha;
            f = CameraState$Type$EnumUnboxingLocalUtility.m(endState.arcTopAlpha, f9, f8, f9);
            float f10 = stateAnimationState.startArcBottomAlpha;
            f2 = CameraState$Type$EnumUnboxingLocalUtility.m(endState.arcBottomAlpha, f10, f8, f10);
            float f11 = stateAnimationState.startArcLeftAlpha;
            f3 = CameraState$Type$EnumUnboxingLocalUtility.m(endState.arcLeftAlpha, f11, f8, f11);
            float f12 = stateAnimationState.startArcRightAlpha;
            f4 = CameraState$Type$EnumUnboxingLocalUtility.m(endState.arcRightAlpha, f12, f8, f12);
            float f13 = stateAnimationState.startArcDialLeftAlpha;
            f5 = CameraState$Type$EnumUnboxingLocalUtility.m(endState.arcDialLeftAlpha, f13, f8, f13);
            float f14 = stateAnimationState.startArcDialRightAlpha;
            f6 = CameraState$Type$EnumUnboxingLocalUtility.m(endState.arcDialRightAlpha, f14, f8, f14);
        } else {
            f = getEndState(this.state).arcTopAlpha;
            f2 = getEndState(this.state).arcBottomAlpha;
            f3 = getEndState(this.state).arcLeftAlpha;
            f4 = getEndState(this.state).arcRightAlpha;
            f5 = getEndState(this.state).arcDialLeftAlpha;
            f6 = getEndState(this.state).arcDialRightAlpha;
        }
        if (stateAnimationState == null || (state = stateAnimationState.endState) == null) {
            state = this.state;
        }
        if (intensityAnimationState != null) {
            float f15 = intensityAnimationState.endIntensity;
            float f16 = intensityAnimationState.startIntensity;
            f7 = ((f15 - f16) * intensityAnimationState.progress) + f16;
        } else {
            f7 = this.currentIntensity;
        }
        this.currentIntensity = f7;
        float f17 = state == State.Center ? f7 : 0.0f;
        float f18 = state == State.Left ? f7 : 0.0f;
        if (state != State.Right) {
            f7 = 0.0f;
        }
        float f19 = ((f - 0.1f) / 1.0f) * f17;
        float f20 = ((f2 - 0.1f) / 1.0f) * f17;
        float f21 = ((f3 - 0.1f) / 1.0f) * f17;
        float f22 = ((f4 - 0.1f) / 1.0f) * f17;
        float f23 = ((f5 - 0.1f) / 1.0f) * f18;
        float f24 = ((f6 - 0.1f) / 1.0f) * f7;
        int i = this.arcBaseColor;
        int i2 = this.arcHighlightColor;
        int blendARGB = ColorUtils.blendARGB(f19, i, i2);
        Paint paint = this.arcTopPaint;
        paint.setColor(blendARGB);
        int blendARGB2 = ColorUtils.blendARGB(f20, i, i2);
        Paint paint2 = this.arcBottomPaint;
        paint2.setColor(blendARGB2);
        int blendARGB3 = ColorUtils.blendARGB(f21, i, i2);
        Paint paint3 = this.arcLeftPaint;
        paint3.setColor(blendARGB3);
        int blendARGB4 = ColorUtils.blendARGB(f22, i, i2);
        Paint paint4 = this.arcRightPaint;
        paint4.setColor(blendARGB4);
        boolean z = (this.arcDialLeftIntensity == f23 && this.arcDialRightIntensity == f24) ? false : true;
        this.arcDialLeftIntensity = f23;
        this.arcDialRightIntensity = f24;
        paint.setAlpha((int) (f * 255.0f));
        paint2.setAlpha((int) (f2 * 255.0f));
        paint3.setAlpha((int) (f3 * 255.0f));
        paint4.setAlpha((int) (f4 * 255.0f));
        this.arcDialLeftPaint.setAlpha((int) (f5 * 255.0f));
        this.arcDialRightPaint.setAlpha((int) (f6 * 255.0f));
        ArcHoverState arcHoverState = this.arcHoverState;
        float f25 = arcHoverState.arcThicknessMultiplier;
        float f26 = this.arcStrokeWidth;
        paint.setStrokeWidth(f25 * f26);
        paint2.setStrokeWidth(arcHoverState.arcThicknessMultiplier * f26);
        paint3.setStrokeWidth(arcHoverState.arcThicknessMultiplier * f26);
        paint4.setStrokeWidth(f26 * arcHoverState.arcThicknessMultiplier);
        if (z) {
            float measuredWidth = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            float f27 = measuredWidth / 2.0f;
            float f28 = measuredHeight / 2.0f;
            float f29 = this.arcDialLeftIntensity * 45.0f;
            Path path = this.arcDialHighlightClipPathLeft;
            path.reset();
            path.moveTo(f27, f28);
            path.arcTo(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, measuredWidth, measuredHeight, 180.0f - f29, f29 * 2.0f, false);
            path.close();
            float f30 = this.arcDialRightIntensity * 45.0f;
            Path path2 = this.arcDialHighlightClipPathRight;
            path2.reset();
            path2.moveTo(f27, f28);
            path2.arcTo(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, measuredWidth, measuredHeight, -f30, f30 * 2.0f, false);
            path2.close();
        }
        invalidate();
    }

    public final Paint newArcDialPaint() {
        Paint newArcPaint = newArcPaint();
        newArcPaint.setStrokeWidth(this.arcDialStrokeWidth);
        return newArcPaint;
    }

    public final Paint newArcPaint() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(this.colorOnSurface);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.arcStrokeWidth);
        paint.setStrokeCap(Paint.Cap.ROUND);
        return paint;
    }

    public final Paint newShadowPaint() {
        Paint newArcPaint = newArcPaint();
        float f = this.arcStrokeWidth;
        newArcPaint.setStrokeWidth(f);
        int i = this.shadowColor;
        newArcPaint.setColor(i);
        newArcPaint.setShadowLayer(f * 2.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, i);
        return newArcPaint;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.stateAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.intensityAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimator3 = this.directionHintAnimator;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
    }

    public final void onDirectionChanged(State state, final State state2) {
        if (state == state2) {
            return;
        }
        ValueAnimator valueAnimator = this.directionHintAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            valueAnimator.removeAllUpdateListeners();
        }
        ArcHoverState arcHoverState = this.arcHoverState;
        if (arcHoverState.arcTopTranslateX == RecyclerView.DECELERATION_RATE && arcHoverState.arcTopTranslateY == RecyclerView.DECELERATION_RATE && arcHoverState.arcBottomTranslateX == RecyclerView.DECELERATION_RATE && arcHoverState.arcBottomTranslateY == RecyclerView.DECELERATION_RATE && arcHoverState.arcLeftTranslateX == RecyclerView.DECELERATION_RATE && arcHoverState.arcLeftTranslateY == RecyclerView.DECELERATION_RATE && arcHoverState.arcRightTranslateX == RecyclerView.DECELERATION_RATE && arcHoverState.arcRightTranslateY == RecyclerView.DECELERATION_RATE && arcHoverState.arcThicknessMultiplier == 1.0f) {
            onDirectionChanged$playDirectionAnimation(state2, this);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(RecyclerView.DECELERATION_RATE, 1.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setStartDelay(0L);
        ofFloat.setRepeatCount(0);
        ofFloat.setDuration(250L);
        ArcHoverState copy$default = ArcHoverState.copy$default(arcHoverState);
        ArcHoverState arcHoverState2 = new ArcHoverState();
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ofFloat.addUpdateListener(new StampsKt$$ExternalSyntheticLambda4(2, this, copy$default, arcHoverState2));
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView$onDirectionChanged$lambda$23$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                ref$BooleanRef.element = true;
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                if (Ref$BooleanRef.this.element) {
                    return;
                }
                SelfieOverlayView.onDirectionChanged$playDirectionAnimation(state2, this);
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        });
        ofFloat.start();
        this.directionHintAnimator = ofFloat;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int save;
        canvas.getClass();
        super.onDraw(canvas);
        ArcHoverState arcHoverState = this.arcHoverState;
        float f = arcHoverState.arcTopTranslateX;
        float f2 = arcHoverState.arcTopTranslateY;
        int save2 = canvas.save();
        canvas.translate(f, f2);
        try {
            float topBrightness = this.brightnessInfo.getTopBrightness();
            Path path = this.arcTop;
            Paint paint = this.arcTopPaint;
            Paint paint2 = this.shadowPaint;
            if (topBrightness > 0.5f) {
                setShadowAlpha((int) (paint.getAlpha() * CameraState$Type$EnumUnboxingLocalUtility.m(this.brightnessInfo.getTopBrightness(), 0.5f, 0.66f, RecyclerView.DECELERATION_RATE)), paint2);
                canvas.drawPath(path, paint2);
            }
            canvas.drawPath(path, paint);
            canvas.restoreToCount(save2);
            float f3 = arcHoverState.arcBottomTranslateX;
            float f4 = arcHoverState.arcBottomTranslateY;
            int save3 = canvas.save();
            canvas.translate(f3, f4);
            try {
                float bottomBrightness = this.brightnessInfo.getBottomBrightness();
                Path path2 = this.arcBottom;
                Paint paint3 = this.arcBottomPaint;
                if (bottomBrightness > 0.5f) {
                    setShadowAlpha((int) (paint3.getAlpha() * CameraState$Type$EnumUnboxingLocalUtility.m(this.brightnessInfo.getBottomBrightness(), 0.5f, 0.66f, RecyclerView.DECELERATION_RATE)), paint2);
                    canvas.drawPath(path2, paint2);
                }
                canvas.drawPath(path2, paint3);
                canvas.restoreToCount(save3);
                boolean z = this.isPreviewMirrored;
                SelfieBrightnessInfo selfieBrightnessInfo = this.brightnessInfo;
                float rightBrightness = z ? selfieBrightnessInfo.getRightBrightness() : selfieBrightnessInfo.getLeftBrightness();
                boolean z2 = this.isPreviewMirrored;
                SelfieBrightnessInfo selfieBrightnessInfo2 = this.brightnessInfo;
                float leftBrightness = z2 ? selfieBrightnessInfo2.getLeftBrightness() : selfieBrightnessInfo2.getRightBrightness();
                Paint paint4 = this.arcDialLeftPaint;
                int alpha = paint4.getAlpha();
                Paint paint5 = this.filledArcDialPaint;
                if (alpha > 0) {
                    save = canvas.save();
                    try {
                        canvas.translate(arcHoverState.arcLeftTranslateX, arcHoverState.arcLeftTranslateY);
                        Path path3 = this.arcDialLeft;
                        if (rightBrightness > 0.5f) {
                            setShadowAlpha((int) (paint4.getAlpha() * CameraState$Type$EnumUnboxingLocalUtility.m(rightBrightness, 0.5f, 0.66f, RecyclerView.DECELERATION_RATE)), paint2);
                            canvas.drawPath(path3, paint2);
                        }
                        canvas.drawPath(path3, paint4);
                        canvas.clipPath(this.arcDialHighlightClipPathLeft);
                        canvas.drawPath(path3, paint5);
                        canvas.restoreToCount(save);
                    } finally {
                    }
                }
                Paint paint6 = this.arcLeftPaint;
                if (paint6.getAlpha() > 0) {
                    float f5 = arcHoverState.arcLeftTranslateX;
                    float f6 = arcHoverState.arcLeftTranslateY;
                    save = canvas.save();
                    canvas.translate(f5, f6);
                    Path path4 = this.arcLeft;
                    if (rightBrightness > 0.5f) {
                        try {
                            setShadowAlpha((int) (paint6.getAlpha() * CameraState$Type$EnumUnboxingLocalUtility.m(rightBrightness, 0.5f, 0.66f, RecyclerView.DECELERATION_RATE)), paint2);
                            canvas.drawPath(path4, paint2);
                        } finally {
                        }
                    }
                    canvas.drawPath(path4, paint6);
                    canvas.restoreToCount(save);
                }
                Paint paint7 = this.arcDialRightPaint;
                if (paint7.getAlpha() > 0) {
                    int save4 = canvas.save();
                    try {
                        canvas.translate(arcHoverState.arcRightTranslateX, arcHoverState.arcRightTranslateY);
                        Path path5 = this.arcDialRight;
                        if (leftBrightness > 0.5f) {
                            setShadowAlpha((int) (paint7.getAlpha() * CameraState$Type$EnumUnboxingLocalUtility.m(leftBrightness, 0.5f, 0.66f, RecyclerView.DECELERATION_RATE)), paint2);
                            canvas.drawPath(path5, paint2);
                        }
                        canvas.drawPath(path5, paint7);
                        canvas.clipPath(this.arcDialHighlightClipPathRight);
                        canvas.drawPath(path5, paint5);
                        canvas.restoreToCount(save4);
                    } finally {
                        canvas.restoreToCount(save4);
                    }
                }
                Paint paint8 = this.arcRightPaint;
                if (paint8.getAlpha() > 0) {
                    float f7 = arcHoverState.arcRightTranslateX;
                    float f8 = arcHoverState.arcRightTranslateY;
                    int save5 = canvas.save();
                    canvas.translate(f7, f8);
                    Path path6 = this.arcRight;
                    if (leftBrightness > 0.5f) {
                        try {
                            setShadowAlpha((int) (paint8.getAlpha() * CameraState$Type$EnumUnboxingLocalUtility.m(leftBrightness, 0.5f, 0.66f, RecyclerView.DECELERATION_RATE)), paint2);
                            canvas.drawPath(path6, paint2);
                        } finally {
                            canvas.restoreToCount(save5);
                        }
                    }
                    canvas.drawPath(path6, paint8);
                    canvas.restoreToCount(save5);
                }
            } finally {
                canvas.restoreToCount(save3);
            }
        } finally {
            canvas.restoreToCount(save2);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = this.arcGapDegrees;
        float f2 = f / 2.0f;
        Path path = this.arcTop;
        path.reset();
        float f3 = measuredWidth;
        float f4 = this.arcInset;
        float f5 = measuredHeight;
        float f6 = 90.0f - f;
        path.addArc(f4, f4, f3 - f4, f5 - f4, f2 + 225.0f, f6);
        Path path2 = this.arcBottom;
        path2.reset();
        float f7 = this.arcInset;
        path2.addArc(f7, f7, f3 - f7, f5 - f7, f2 + 45.0f, f6);
        Path path3 = this.arcLeft;
        path3.reset();
        float f8 = this.arcInset;
        float f9 = f2 + 135.0f;
        path3.addArc(f8, f8, f3 - f8, f5 - f8, f9, f6);
        Path path4 = this.arcRight;
        path4.reset();
        float f10 = this.arcInset;
        float f11 = f2 + 315.0f;
        path4.addArc(f10, f10, f3 - f10, f5 - f10, f11, f6);
        Path path5 = this.arcDialLeft;
        path5.reset();
        float f12 = this.arcInset;
        addDial(path5, f12, f12, f3 - f12, f9, f6, this.arcTickLength);
        Path path6 = this.arcDialRight;
        path6.reset();
        float f13 = this.arcInset;
        addDial(path6, f13, f13, f3 - f13, f11, f6, this.arcTickLength);
        invalidate();
    }

    public final void setCameraStreamBrightnessInfo(SelfieBrightnessInfo selfieBrightnessInfo) {
        if (selfieBrightnessInfo == null) {
            selfieBrightnessInfo = new SelfieBrightnessInfo();
        }
        this.brightnessInfo = selfieBrightnessInfo;
        invalidate();
    }

    public final void setIntensity(float f) {
        if (this.currentIntensity == f) {
            return;
        }
        float coerceIn = RangesKt___RangesKt.coerceIn(f, RecyclerView.DECELERATION_RATE, 1.0f);
        ValueAnimator valueAnimator = this.intensityAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            valueAnimator.removeAllUpdateListeners();
        }
        float f2 = this.currentIntensity;
        IntensityAnimationState intensityAnimationState = new IntensityAnimationState();
        intensityAnimationState.progress = RecyclerView.DECELERATION_RATE;
        intensityAnimationState.startIntensity = f2;
        intensityAnimationState.endIntensity = coerceIn;
        this.intensityAnimationState = intensityAnimationState;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(RecyclerView.DECELERATION_RATE, 1.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setStartDelay(0L);
        ofFloat.setRepeatCount(0);
        ofFloat.setDuration(200L);
        if (this.state == State.Center) {
            ArcHoverState copy$default = ArcHoverState.copy$default(this.arcHoverState);
            ArcHoverState arcHoverState = new ArcHoverState();
            focus(arcHoverState, coerceIn);
            ofFloat.addUpdateListener(new StampsKt$$ExternalSyntheticLambda4(1, this, copy$default, arcHoverState));
        } else {
            ofFloat.addUpdateListener(new SelfieOverlayView$$ExternalSyntheticLambda1(this, 0));
        }
        ofFloat.addListener(new SelfieOverlayView$setState$lambda$7$$inlined$doOnEnd$1(this, 1));
        ofFloat.start();
        this.intensityAnimator = ofFloat;
    }

    public final void setIsPreviewMirrored(boolean z) {
        if (this.isPreviewMirrored == z) {
            return;
        }
        this.isPreviewMirrored = z;
        invalidate();
    }

    public final void setShadowAlpha(int i, Paint paint) {
        if (paint.getAlpha() == i) {
            return;
        }
        paint.setShadowLayer(this.arcStrokeWidth * 2.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, ColorUtils.setAlphaComponent(this.shadowColor, i));
        paint.setAlpha(i);
    }

    public final void setState(State state, boolean z) {
        state.getClass();
        StateAnimationState stateAnimationState = this.stateAnimationState;
        if (stateAnimationState == null || stateAnimationState.endState != state) {
            if (stateAnimationState == null && this.state == state) {
                return;
            }
            ValueAnimator valueAnimator = this.stateAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                valueAnimator.removeAllUpdateListeners();
            }
            State state2 = this.state;
            if (!z) {
                this.state = state;
                this.stateAnimationState = null;
                applyCurrentState();
                onDirectionChanged(state2, state);
                return;
            }
            this.stateAnimationState = new StateAnimationState(state2, state, this.arcTopPaint.getAlpha() / 255.0f, this.arcBottomPaint.getAlpha() / 255.0f, this.arcLeftPaint.getAlpha() / 255.0f, this.arcRightPaint.getAlpha() / 255.0f, this.arcDialLeftPaint.getAlpha() / 255.0f, this.arcDialRightPaint.getAlpha() / 255.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(RecyclerView.DECELERATION_RATE, 1.0f);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setStartDelay(0L);
            ofFloat.setRepeatCount(0);
            ofFloat.setDuration(400L);
            ofFloat.addUpdateListener(new SelfieOverlayView$$ExternalSyntheticLambda1(this, 1));
            ofFloat.addListener(new SelfieOverlayView$setState$lambda$7$$inlined$doOnEnd$1(this, 0));
            ofFloat.start();
            this.stateAnimator = ofFloat;
        }
    }

    public final class ArcHoverState {
        public float arcBottomTranslateX;
        public float arcBottomTranslateY;
        public float arcLeftTranslateX;
        public float arcLeftTranslateY;
        public float arcRightTranslateX;
        public float arcRightTranslateY;
        public float arcThicknessMultiplier;
        public float arcTopTranslateX;
        public float arcTopTranslateY;

        public ArcHoverState(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
            this.arcTopTranslateX = f;
            this.arcTopTranslateY = f2;
            this.arcBottomTranslateX = f3;
            this.arcBottomTranslateY = f4;
            this.arcLeftTranslateX = f5;
            this.arcLeftTranslateY = f6;
            this.arcRightTranslateX = f7;
            this.arcRightTranslateY = f8;
            this.arcThicknessMultiplier = f9;
        }

        public static ArcHoverState copy$default(ArcHoverState arcHoverState) {
            float f = arcHoverState.arcTopTranslateX;
            float f2 = arcHoverState.arcTopTranslateY;
            float f3 = arcHoverState.arcBottomTranslateX;
            float f4 = arcHoverState.arcBottomTranslateY;
            float f5 = arcHoverState.arcLeftTranslateX;
            float f6 = arcHoverState.arcLeftTranslateY;
            float f7 = arcHoverState.arcRightTranslateX;
            float f8 = arcHoverState.arcRightTranslateY;
            float f9 = arcHoverState.arcThicknessMultiplier;
            arcHoverState.getClass();
            return new ArcHoverState(f, f2, f3, f4, f5, f6, f7, f8, f9);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArcHoverState)) {
                return false;
            }
            ArcHoverState arcHoverState = (ArcHoverState) obj;
            return Float.compare(this.arcTopTranslateX, arcHoverState.arcTopTranslateX) == 0 && Float.compare(this.arcTopTranslateY, arcHoverState.arcTopTranslateY) == 0 && Float.compare(this.arcBottomTranslateX, arcHoverState.arcBottomTranslateX) == 0 && Float.compare(this.arcBottomTranslateY, arcHoverState.arcBottomTranslateY) == 0 && Float.compare(this.arcLeftTranslateX, arcHoverState.arcLeftTranslateX) == 0 && Float.compare(this.arcLeftTranslateY, arcHoverState.arcLeftTranslateY) == 0 && Float.compare(this.arcRightTranslateX, arcHoverState.arcRightTranslateX) == 0 && Float.compare(this.arcRightTranslateY, arcHoverState.arcRightTranslateY) == 0 && Float.compare(this.arcThicknessMultiplier, arcHoverState.arcThicknessMultiplier) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.arcThicknessMultiplier) + CameraState$Type$EnumUnboxingLocalUtility.m(this.arcRightTranslateY, CameraState$Type$EnumUnboxingLocalUtility.m(this.arcRightTranslateX, CameraState$Type$EnumUnboxingLocalUtility.m(this.arcLeftTranslateY, CameraState$Type$EnumUnboxingLocalUtility.m(this.arcLeftTranslateX, CameraState$Type$EnumUnboxingLocalUtility.m(this.arcBottomTranslateY, CameraState$Type$EnumUnboxingLocalUtility.m(this.arcBottomTranslateX, CameraState$Type$EnumUnboxingLocalUtility.m(this.arcTopTranslateY, Float.hashCode(this.arcTopTranslateX) * 31, 31), 31), 31), 31), 31), 31), 31);
        }

        public final String toString() {
            float f = this.arcTopTranslateX;
            float f2 = this.arcTopTranslateY;
            float f3 = this.arcBottomTranslateX;
            float f4 = this.arcBottomTranslateY;
            float f5 = this.arcLeftTranslateX;
            float f6 = this.arcLeftTranslateY;
            float f7 = this.arcRightTranslateX;
            float f8 = this.arcRightTranslateY;
            float f9 = this.arcThicknessMultiplier;
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ArcHoverState(arcTopTranslateX=", f, ", arcTopTranslateY=", f2, ", arcBottomTranslateX=");
            Request$Priority$EnumUnboxingLocalUtility.m(m, f3, ", arcBottomTranslateY=", f4, ", arcLeftTranslateX=");
            Request$Priority$EnumUnboxingLocalUtility.m(m, f5, ", arcLeftTranslateY=", f6, ", arcRightTranslateX=");
            Request$Priority$EnumUnboxingLocalUtility.m(m, f7, ", arcRightTranslateY=", f8, ", arcThicknessMultiplier=");
            return Recorder$$ExternalSyntheticOutline1.m(f9, ")", m);
        }

        public /* synthetic */ ArcHoverState() {
            this(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfieOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.state = State.Center;
        this.colorOnSurface = -1;
        this.shadowColor = -16777216;
        this.arcBaseColor = -1;
        this.arcHighlightColor = -13910906;
        this.arcInset = (float) ExtensionsKt.getDpToPx(48.0d);
        this.arcGapDegrees = 20.0f;
        this.arcStrokeWidth = (float) ExtensionsKt.getDpToPx(4.0d);
        this.arcDialStrokeWidth = (float) ExtensionsKt.getDpToPx(2.0d);
        this.arcTickLength = (float) ExtensionsKt.getDpToPx(24.0d);
        this.arcTop = new Path();
        this.arcBottom = new Path();
        this.arcLeft = new Path();
        this.arcRight = new Path();
        this.arcDialLeft = new Path();
        this.arcDialRight = new Path();
        this.arcDialHighlightClipPathRight = new Path();
        this.arcDialHighlightClipPathLeft = new Path();
        this.arcTopPaint = newArcPaint();
        this.arcBottomPaint = newArcPaint();
        this.arcLeftPaint = newArcPaint();
        this.arcRightPaint = newArcPaint();
        this.shadowPaint = newShadowPaint();
        Paint newArcDialPaint = newArcDialPaint();
        newArcDialPaint.setAlpha(0);
        this.arcDialLeftPaint = newArcDialPaint;
        Paint newArcDialPaint2 = newArcDialPaint();
        newArcDialPaint2.setAlpha(0);
        this.arcDialRightPaint = newArcDialPaint2;
        Paint newArcDialPaint3 = newArcDialPaint();
        newArcDialPaint3.setColor(-13910906);
        this.filledArcDialPaint = newArcDialPaint3;
        ArcHoverState arcHoverState = new ArcHoverState();
        focus(arcHoverState, this.currentIntensity);
        this.arcHoverState = arcHoverState;
        this.brightnessInfo = new SelfieBrightnessInfo();
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfieOverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.state = State.Center;
        this.colorOnSurface = -1;
        this.shadowColor = -16777216;
        this.arcBaseColor = -1;
        this.arcHighlightColor = -13910906;
        this.arcInset = (float) ExtensionsKt.getDpToPx(48.0d);
        this.arcGapDegrees = 20.0f;
        this.arcStrokeWidth = (float) ExtensionsKt.getDpToPx(4.0d);
        this.arcDialStrokeWidth = (float) ExtensionsKt.getDpToPx(2.0d);
        this.arcTickLength = (float) ExtensionsKt.getDpToPx(24.0d);
        this.arcTop = new Path();
        this.arcBottom = new Path();
        this.arcLeft = new Path();
        this.arcRight = new Path();
        this.arcDialLeft = new Path();
        this.arcDialRight = new Path();
        this.arcDialHighlightClipPathRight = new Path();
        this.arcDialHighlightClipPathLeft = new Path();
        this.arcTopPaint = newArcPaint();
        this.arcBottomPaint = newArcPaint();
        this.arcLeftPaint = newArcPaint();
        this.arcRightPaint = newArcPaint();
        this.shadowPaint = newShadowPaint();
        Paint newArcDialPaint = newArcDialPaint();
        newArcDialPaint.setAlpha(0);
        this.arcDialLeftPaint = newArcDialPaint;
        Paint newArcDialPaint2 = newArcDialPaint();
        newArcDialPaint2.setAlpha(0);
        this.arcDialRightPaint = newArcDialPaint2;
        Paint newArcDialPaint3 = newArcDialPaint();
        newArcDialPaint3.setColor(-13910906);
        this.filledArcDialPaint = newArcDialPaint3;
        ArcHoverState arcHoverState = new ArcHoverState();
        focus(arcHoverState, this.currentIntensity);
        this.arcHoverState = arcHoverState;
        this.brightnessInfo = new SelfieBrightnessInfo();
        setWillNotDraw(false);
    }
}
