package com.stripe.android.uicore.elements.compat;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.animation.BoundsAnimation$animate$1;
import androidx.compose.animation.CrossfadeKt$Crossfade$3$1;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverterImpl;
import androidx.compose.material.TextFieldImplKt$CommonDecorationBox$labelColor$1;
import androidx.compose.material.TextFieldTransitionScope$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.recyclerview.widget.RecyclerView;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.dynamite.zzg;
import com.stripe.android.uicore.elements.PhoneNumberController$$ExternalSyntheticLambda9;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.InteractionResult;

/* loaded from: classes7.dex */
public final class TextFieldTransitionScope {
    public static final TextFieldTransitionScope INSTANCE = new TextFieldTransitionScope();

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InputPhase.values().length];
            try {
                InputPhase inputPhase = InputPhase.Focused;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                InputPhase inputPhase2 = InputPhase.Focused;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                InputPhase inputPhase3 = InputPhase.Focused;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:168:0x0235, code lost:
    
        if (r31 != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x01ef, code lost:
    
        if (r31 != false) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x031f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x035d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03ba A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0433 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0459 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0143 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0206 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x024a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x029f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x030a  */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [boolean, int] */
    /* renamed from: Transition-DTcfvLk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4075TransitionDTcfvLk(InputPhase inputPhase, long j, long j2, TextFieldImplKt$CommonDecorationBox$labelColor$1 textFieldImplKt$CommonDecorationBox$labelColor$1, boolean z, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        Object m;
        float f;
        boolean changed;
        Object rememberedValue;
        int ordinal;
        float f2;
        boolean changed2;
        Object rememberedValue2;
        Object m2;
        int ordinal2;
        float f3;
        boolean changed3;
        Object rememberedValue3;
        int ordinal3;
        boolean z2;
        boolean changed4;
        Object rememberedValue4;
        int[] iArr;
        boolean changed5;
        Object rememberedValue5;
        ?? r10;
        Object m3;
        int[] iArr2;
        long j3;
        boolean changed6;
        Object rememberedValue6;
        InputPhase inputPhase2;
        Color color;
        long j4;
        boolean changed7;
        Object rememberedValue7;
        boolean changed8;
        Object rememberedValue8;
        Object m4;
        boolean changed9;
        Object rememberedValue9;
        boolean changed10;
        Object rememberedValue10;
        Snapshot currentThreadSnapshot;
        Function1 readObserver;
        Snapshot makeCurrentNonObservable;
        boolean z3;
        CrossfadeKt$Crossfade$3$1 crossfadeKt$Crossfade$3$1 = CrossfadeKt$Crossfade$3$1.INSTANCE$9;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-791965669);
        int i2 = i | (gapComposer.changed(inputPhase.ordinal()) ? 4 : 2) | (gapComposer.changed(j) ? 32 : 16) | (gapComposer.changed(j2) ? 256 : 128) | (gapComposer.changedInstance(textFieldImplKt$CommonDecorationBox$labelColor$1) ? 2048 : 1024) | (gapComposer.changed(z) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            Transition updateTransition = AnimatableKt.updateTransition(inputPhase, "TextFieldInputState", gapComposer, (i2 & 14) | 48, 0);
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = updateTransition.targetState$delegate;
            InteractionResult interactionResult = updateTransition.transitionState;
            TwoWayConverterImpl twoWayConverterImpl = AnimatableKt.FloatToVector;
            boolean isSeeking = updateTransition.isSeeking();
            Object obj = Composer.Companion.Empty;
            if (isSeeking) {
                m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, 1666827533, false, interactionResult);
            } else {
                gapComposer.startReplaceGroup(1666573488);
                boolean changed11 = gapComposer.changed(updateTransition);
                m = gapComposer.rememberedValue();
                if (changed11 || m == obj) {
                    currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
                    readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
                    try {
                        Object currentState = interactionResult.getCurrentState();
                        zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                        gapComposer.updateRememberedValue(currentState);
                        m = currentState;
                        z3 = false;
                    } finally {
                    }
                } else {
                    z3 = false;
                }
                gapComposer.end(z3);
            }
            gapComposer.startReplaceGroup(-1082240119);
            int ordinal4 = ((InputPhase) m).ordinal();
            float f4 = 1.0f;
            if (ordinal4 != 0) {
                if (ordinal4 == 1) {
                    f = RecyclerView.DECELERATION_RATE;
                    gapComposer.end(false);
                    Float valueOf = Float.valueOf(f);
                    changed = gapComposer.changed(updateTransition);
                    rememberedValue = gapComposer.rememberedValue();
                    if (!changed || rememberedValue == obj) {
                        rememberedValue = Updater.derivedStateOf(new TextFieldTransitionScope$TransitionDTcfvLk$$inlined$animateColor$1(updateTransition, 8));
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    InputPhase inputPhase3 = (InputPhase) ((State) rememberedValue).getValue();
                    gapComposer.startReplaceGroup(-1082240119);
                    ordinal = inputPhase3.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            f2 = RecyclerView.DECELERATION_RATE;
                            gapComposer.end(false);
                            Float valueOf2 = Float.valueOf(f2);
                            changed2 = gapComposer.changed(updateTransition);
                            rememberedValue2 = gapComposer.rememberedValue();
                            if (!changed2 || rememberedValue2 == obj) {
                                rememberedValue2 = Updater.derivedStateOf(new TextFieldTransitionScope$TransitionDTcfvLk$$inlined$animateColor$1(updateTransition, 9));
                                gapComposer.updateRememberedValue(rememberedValue2);
                            }
                            ((Transition.Segment) ((State) rememberedValue2).getValue()).getClass();
                            gapComposer.startReplaceGroup(-1820270483);
                            TweenSpec tween$default = AnimatableKt.tween$default(150, 0, null, 6);
                            gapComposer.end(false);
                            Transition.TransitionAnimationState createTransitionAnimation = AnimatableKt.createTransitionAnimation(updateTransition, valueOf, valueOf2, tween$default, twoWayConverterImpl, gapComposer, 196608);
                            PhoneNumberController$$ExternalSyntheticLambda9 phoneNumberController$$ExternalSyntheticLambda9 = new PhoneNumberController$$ExternalSyntheticLambda9(10);
                            if (updateTransition.isSeeking()) {
                                m2 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, 1666827533, false, interactionResult);
                            } else {
                                gapComposer.startReplaceGroup(1666573488);
                                boolean changed12 = gapComposer.changed(updateTransition);
                                m2 = gapComposer.rememberedValue();
                                if (changed12 || m2 == obj) {
                                    currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
                                    readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                                    makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
                                    try {
                                        Object currentState2 = interactionResult.getCurrentState();
                                        zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                                        gapComposer.updateRememberedValue(currentState2);
                                        m2 = currentState2;
                                    } finally {
                                    }
                                }
                                gapComposer.end(false);
                            }
                            gapComposer.startReplaceGroup(1758344392);
                            ordinal2 = ((InputPhase) m2).ordinal();
                            if (ordinal2 != 0) {
                                if (ordinal2 != 1) {
                                    if (ordinal2 != 2) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return;
                                    }
                                }
                                f3 = RecyclerView.DECELERATION_RATE;
                                gapComposer.end(false);
                                Float valueOf3 = Float.valueOf(f3);
                                changed3 = gapComposer.changed(updateTransition);
                                rememberedValue3 = gapComposer.rememberedValue();
                                if (!changed3 || rememberedValue3 == obj) {
                                    rememberedValue3 = Updater.derivedStateOf(new TextFieldTransitionScope$TransitionDTcfvLk$$inlined$animateColor$1(updateTransition, 10));
                                    gapComposer.updateRememberedValue(rememberedValue3);
                                }
                                InputPhase inputPhase4 = (InputPhase) ((State) rememberedValue3).getValue();
                                gapComposer.startReplaceGroup(1758344392);
                                ordinal3 = inputPhase4.ordinal();
                                if (ordinal3 != 0) {
                                    if (ordinal3 != 1) {
                                        if (ordinal3 != 2) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return;
                                        }
                                    }
                                    z2 = false;
                                    f4 = RecyclerView.DECELERATION_RATE;
                                    gapComposer.end(z2);
                                    Float valueOf4 = Float.valueOf(f4);
                                    changed4 = gapComposer.changed(updateTransition);
                                    rememberedValue4 = gapComposer.rememberedValue();
                                    if (!changed4 || rememberedValue4 == obj) {
                                        rememberedValue4 = Updater.derivedStateOf(new TextFieldTransitionScope$TransitionDTcfvLk$$inlined$animateColor$1(updateTransition, 11));
                                        gapComposer.updateRememberedValue(rememberedValue4);
                                    }
                                    Transition.TransitionAnimationState createTransitionAnimation2 = AnimatableKt.createTransitionAnimation(updateTransition, valueOf3, valueOf4, (FiniteAnimationSpec) phoneNumberController$$ExternalSyntheticLambda9.invoke(((State) rememberedValue4).getValue(), gapComposer, 0), twoWayConverterImpl, gapComposer, 196608);
                                    InputPhase inputPhase5 = (InputPhase) parcelableSnapshotMutableState.getValue();
                                    gapComposer.startReplaceGroup(-15504215);
                                    iArr = WhenMappings.$EnumSwitchMapping$0;
                                    long j5 = iArr[inputPhase5.ordinal()] == 1 ? j : j2;
                                    gapComposer.end(false);
                                    ColorSpace m679getColorSpaceimpl = Color.m679getColorSpaceimpl(j5);
                                    changed5 = gapComposer.changed(m679getColorSpaceimpl);
                                    rememberedValue5 = gapComposer.rememberedValue();
                                    if (!changed5 || rememberedValue5 == obj) {
                                        rememberedValue5 = new TwoWayConverterImpl(crossfadeKt$Crossfade$3$1, new BoundsAnimation$animate$1(m679getColorSpaceimpl, 1));
                                        gapComposer.updateRememberedValue(rememberedValue5);
                                    }
                                    TwoWayConverterImpl twoWayConverterImpl2 = (TwoWayConverterImpl) rememberedValue5;
                                    if (updateTransition.isSeeking()) {
                                        r10 = 0;
                                        m3 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, 1666827533, false, interactionResult);
                                    } else {
                                        gapComposer.startReplaceGroup(1666573488);
                                        boolean changed13 = gapComposer.changed(updateTransition);
                                        m3 = gapComposer.rememberedValue();
                                        if (changed13 || m3 == obj) {
                                            currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
                                            readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                                            makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
                                            try {
                                                Object currentState3 = interactionResult.getCurrentState();
                                                zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                                                gapComposer.updateRememberedValue(currentState3);
                                                m3 = currentState3;
                                            } finally {
                                            }
                                        }
                                        r10 = 0;
                                        gapComposer.end(false);
                                    }
                                    gapComposer.startReplaceGroup(-15504215);
                                    if (iArr[((InputPhase) m3).ordinal()] == 1) {
                                        iArr2 = iArr;
                                        j3 = j;
                                    } else {
                                        iArr2 = iArr;
                                        j3 = j2;
                                    }
                                    Color m5 = Recorder$$ExternalSyntheticOutline1.m(gapComposer, (boolean) r10, j3);
                                    changed6 = gapComposer.changed(updateTransition);
                                    rememberedValue6 = gapComposer.rememberedValue();
                                    if (!changed6 || rememberedValue6 == obj) {
                                        rememberedValue6 = Updater.derivedStateOf(new TextFieldTransitionScope$TransitionDTcfvLk$$inlined$animateColor$1(updateTransition, r10));
                                        gapComposer.updateRememberedValue(rememberedValue6);
                                    }
                                    inputPhase2 = (InputPhase) ((State) rememberedValue6).getValue();
                                    gapComposer.startReplaceGroup(-15504215);
                                    if (iArr2[inputPhase2.ordinal()] == 1) {
                                        color = m5;
                                        j4 = j;
                                    } else {
                                        color = m5;
                                        j4 = j2;
                                    }
                                    Color m6 = Recorder$$ExternalSyntheticOutline1.m(gapComposer, false, j4);
                                    changed7 = gapComposer.changed(updateTransition);
                                    rememberedValue7 = gapComposer.rememberedValue();
                                    if (!changed7 || rememberedValue7 == obj) {
                                        rememberedValue7 = Updater.derivedStateOf(new TextFieldTransitionScope$TransitionDTcfvLk$$inlined$animateColor$1(updateTransition, 5));
                                        gapComposer.updateRememberedValue(rememberedValue7);
                                    }
                                    ((Transition.Segment) ((State) rememberedValue7).getValue()).getClass();
                                    gapComposer.startReplaceGroup(412246452);
                                    TweenSpec tween$default2 = AnimatableKt.tween$default(150, 0, null, 6);
                                    gapComposer.end(false);
                                    Transition.TransitionAnimationState createTransitionAnimation3 = AnimatableKt.createTransitionAnimation(updateTransition, color, m6, tween$default2, twoWayConverterImpl2, gapComposer, 196608);
                                    int i3 = (i2 & 7168) | MLKEMEngine.KyberPolyBytes;
                                    ColorSpace m679getColorSpaceimpl2 = Color.m679getColorSpaceimpl(((Color) textFieldImplKt$CommonDecorationBox$labelColor$1.invoke(parcelableSnapshotMutableState.getValue(), gapComposer, Integer.valueOf((i3 >> 6) & 112))).value);
                                    changed8 = gapComposer.changed(m679getColorSpaceimpl2);
                                    rememberedValue8 = gapComposer.rememberedValue();
                                    if (!changed8 || rememberedValue8 == obj) {
                                        rememberedValue8 = new TwoWayConverterImpl(crossfadeKt$Crossfade$3$1, new BoundsAnimation$animate$1(m679getColorSpaceimpl2, 1));
                                        gapComposer.updateRememberedValue(rememberedValue8);
                                    }
                                    TwoWayConverterImpl twoWayConverterImpl3 = (TwoWayConverterImpl) rememberedValue8;
                                    int i4 = ((i3 << 3) & 57344) | 3072;
                                    if (updateTransition.isSeeking()) {
                                        m4 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, 1666827533, false, interactionResult);
                                    } else {
                                        gapComposer.startReplaceGroup(1666573488);
                                        boolean changed14 = gapComposer.changed(updateTransition);
                                        m4 = gapComposer.rememberedValue();
                                        if (changed14 || m4 == obj) {
                                            currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
                                            readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                                            makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
                                            try {
                                                Object currentState4 = interactionResult.getCurrentState();
                                                zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                                                gapComposer.updateRememberedValue(currentState4);
                                                m4 = currentState4;
                                            } finally {
                                            }
                                        }
                                        gapComposer.end(false);
                                    }
                                    int i5 = (i4 >> 9) & 112;
                                    Object invoke = textFieldImplKt$CommonDecorationBox$labelColor$1.invoke(m4, gapComposer, Integer.valueOf(i5));
                                    changed9 = gapComposer.changed(updateTransition);
                                    rememberedValue9 = gapComposer.rememberedValue();
                                    if (!changed9 || rememberedValue9 == obj) {
                                        rememberedValue9 = Updater.derivedStateOf(new TextFieldTransitionScope$TransitionDTcfvLk$$inlined$animateColor$1(updateTransition, 6));
                                        gapComposer.updateRememberedValue(rememberedValue9);
                                    }
                                    Object invoke2 = textFieldImplKt$CommonDecorationBox$labelColor$1.invoke(((State) rememberedValue9).getValue(), gapComposer, Integer.valueOf(i5));
                                    changed10 = gapComposer.changed(updateTransition);
                                    rememberedValue10 = gapComposer.rememberedValue();
                                    if (!changed10 || rememberedValue10 == obj) {
                                        rememberedValue10 = Updater.derivedStateOf(new TextFieldTransitionScope$TransitionDTcfvLk$$inlined$animateColor$1(updateTransition, 7));
                                        gapComposer.updateRememberedValue(rememberedValue10);
                                    }
                                    ((Transition.Segment) ((State) rememberedValue10).getValue()).getClass();
                                    gapComposer.startReplaceGroup(1054273641);
                                    TweenSpec tween$default3 = AnimatableKt.tween$default(150, 0, null, 6);
                                    gapComposer.end(false);
                                    composableLambdaImpl.invoke(Float.valueOf(((Number) createTransitionAnimation.value$delegate.getValue()).floatValue()), new Color(((Color) createTransitionAnimation3.value$delegate.getValue()).value), new Color(((Color) AnimatableKt.createTransitionAnimation(updateTransition, invoke, invoke2, tween$default3, twoWayConverterImpl3, gapComposer, 196608).value$delegate.getValue()).value), Float.valueOf(((Number) createTransitionAnimation2.value$delegate.getValue()).floatValue()), (Object) gapComposer, (Object) 24576);
                                }
                                z2 = false;
                                gapComposer.end(z2);
                                Float valueOf42 = Float.valueOf(f4);
                                changed4 = gapComposer.changed(updateTransition);
                                rememberedValue4 = gapComposer.rememberedValue();
                                if (!changed4) {
                                }
                                rememberedValue4 = Updater.derivedStateOf(new TextFieldTransitionScope$TransitionDTcfvLk$$inlined$animateColor$1(updateTransition, 11));
                                gapComposer.updateRememberedValue(rememberedValue4);
                                Transition.TransitionAnimationState createTransitionAnimation22 = AnimatableKt.createTransitionAnimation(updateTransition, valueOf3, valueOf42, (FiniteAnimationSpec) phoneNumberController$$ExternalSyntheticLambda9.invoke(((State) rememberedValue4).getValue(), gapComposer, 0), twoWayConverterImpl, gapComposer, 196608);
                                InputPhase inputPhase52 = (InputPhase) parcelableSnapshotMutableState.getValue();
                                gapComposer.startReplaceGroup(-15504215);
                                iArr = WhenMappings.$EnumSwitchMapping$0;
                                if (iArr[inputPhase52.ordinal()] == 1) {
                                }
                                gapComposer.end(false);
                                ColorSpace m679getColorSpaceimpl3 = Color.m679getColorSpaceimpl(j5);
                                changed5 = gapComposer.changed(m679getColorSpaceimpl3);
                                rememberedValue5 = gapComposer.rememberedValue();
                                if (!changed5) {
                                }
                                rememberedValue5 = new TwoWayConverterImpl(crossfadeKt$Crossfade$3$1, new BoundsAnimation$animate$1(m679getColorSpaceimpl3, 1));
                                gapComposer.updateRememberedValue(rememberedValue5);
                                TwoWayConverterImpl twoWayConverterImpl22 = (TwoWayConverterImpl) rememberedValue5;
                                if (updateTransition.isSeeking()) {
                                }
                                gapComposer.startReplaceGroup(-15504215);
                                if (iArr[((InputPhase) m3).ordinal()] == 1) {
                                }
                                Color m52 = Recorder$$ExternalSyntheticOutline1.m(gapComposer, (boolean) r10, j3);
                                changed6 = gapComposer.changed(updateTransition);
                                rememberedValue6 = gapComposer.rememberedValue();
                                if (!changed6) {
                                }
                                rememberedValue6 = Updater.derivedStateOf(new TextFieldTransitionScope$TransitionDTcfvLk$$inlined$animateColor$1(updateTransition, r10));
                                gapComposer.updateRememberedValue(rememberedValue6);
                                inputPhase2 = (InputPhase) ((State) rememberedValue6).getValue();
                                gapComposer.startReplaceGroup(-15504215);
                                if (iArr2[inputPhase2.ordinal()] == 1) {
                                }
                                Color m62 = Recorder$$ExternalSyntheticOutline1.m(gapComposer, false, j4);
                                changed7 = gapComposer.changed(updateTransition);
                                rememberedValue7 = gapComposer.rememberedValue();
                                if (!changed7) {
                                }
                                rememberedValue7 = Updater.derivedStateOf(new TextFieldTransitionScope$TransitionDTcfvLk$$inlined$animateColor$1(updateTransition, 5));
                                gapComposer.updateRememberedValue(rememberedValue7);
                                ((Transition.Segment) ((State) rememberedValue7).getValue()).getClass();
                                gapComposer.startReplaceGroup(412246452);
                                TweenSpec tween$default22 = AnimatableKt.tween$default(150, 0, null, 6);
                                gapComposer.end(false);
                                Transition.TransitionAnimationState createTransitionAnimation32 = AnimatableKt.createTransitionAnimation(updateTransition, color, m62, tween$default22, twoWayConverterImpl22, gapComposer, 196608);
                                int i32 = (i2 & 7168) | MLKEMEngine.KyberPolyBytes;
                                ColorSpace m679getColorSpaceimpl22 = Color.m679getColorSpaceimpl(((Color) textFieldImplKt$CommonDecorationBox$labelColor$1.invoke(parcelableSnapshotMutableState.getValue(), gapComposer, Integer.valueOf((i32 >> 6) & 112))).value);
                                changed8 = gapComposer.changed(m679getColorSpaceimpl22);
                                rememberedValue8 = gapComposer.rememberedValue();
                                if (!changed8) {
                                }
                                rememberedValue8 = new TwoWayConverterImpl(crossfadeKt$Crossfade$3$1, new BoundsAnimation$animate$1(m679getColorSpaceimpl22, 1));
                                gapComposer.updateRememberedValue(rememberedValue8);
                                TwoWayConverterImpl twoWayConverterImpl32 = (TwoWayConverterImpl) rememberedValue8;
                                int i42 = ((i32 << 3) & 57344) | 3072;
                                if (updateTransition.isSeeking()) {
                                }
                                int i52 = (i42 >> 9) & 112;
                                Object invoke3 = textFieldImplKt$CommonDecorationBox$labelColor$1.invoke(m4, gapComposer, Integer.valueOf(i52));
                                changed9 = gapComposer.changed(updateTransition);
                                rememberedValue9 = gapComposer.rememberedValue();
                                if (!changed9) {
                                }
                                rememberedValue9 = Updater.derivedStateOf(new TextFieldTransitionScope$TransitionDTcfvLk$$inlined$animateColor$1(updateTransition, 6));
                                gapComposer.updateRememberedValue(rememberedValue9);
                                Object invoke22 = textFieldImplKt$CommonDecorationBox$labelColor$1.invoke(((State) rememberedValue9).getValue(), gapComposer, Integer.valueOf(i52));
                                changed10 = gapComposer.changed(updateTransition);
                                rememberedValue10 = gapComposer.rememberedValue();
                                if (!changed10) {
                                }
                                rememberedValue10 = Updater.derivedStateOf(new TextFieldTransitionScope$TransitionDTcfvLk$$inlined$animateColor$1(updateTransition, 7));
                                gapComposer.updateRememberedValue(rememberedValue10);
                                ((Transition.Segment) ((State) rememberedValue10).getValue()).getClass();
                                gapComposer.startReplaceGroup(1054273641);
                                TweenSpec tween$default32 = AnimatableKt.tween$default(150, 0, null, 6);
                                gapComposer.end(false);
                                composableLambdaImpl.invoke(Float.valueOf(((Number) createTransitionAnimation.value$delegate.getValue()).floatValue()), new Color(((Color) createTransitionAnimation32.value$delegate.getValue()).value), new Color(((Color) AnimatableKt.createTransitionAnimation(updateTransition, invoke3, invoke22, tween$default32, twoWayConverterImpl32, gapComposer, 196608).value$delegate.getValue()).value), Float.valueOf(((Number) createTransitionAnimation22.value$delegate.getValue()).floatValue()), (Object) gapComposer, (Object) 24576);
                            }
                            f3 = 1.0f;
                            gapComposer.end(false);
                            Float valueOf32 = Float.valueOf(f3);
                            changed3 = gapComposer.changed(updateTransition);
                            rememberedValue3 = gapComposer.rememberedValue();
                            if (!changed3) {
                            }
                            rememberedValue3 = Updater.derivedStateOf(new TextFieldTransitionScope$TransitionDTcfvLk$$inlined$animateColor$1(updateTransition, 10));
                            gapComposer.updateRememberedValue(rememberedValue3);
                            InputPhase inputPhase42 = (InputPhase) ((State) rememberedValue3).getValue();
                            gapComposer.startReplaceGroup(1758344392);
                            ordinal3 = inputPhase42.ordinal();
                            if (ordinal3 != 0) {
                            }
                            z2 = false;
                            gapComposer.end(z2);
                            Float valueOf422 = Float.valueOf(f4);
                            changed4 = gapComposer.changed(updateTransition);
                            rememberedValue4 = gapComposer.rememberedValue();
                            if (!changed4) {
                            }
                            rememberedValue4 = Updater.derivedStateOf(new TextFieldTransitionScope$TransitionDTcfvLk$$inlined$animateColor$1(updateTransition, 11));
                            gapComposer.updateRememberedValue(rememberedValue4);
                            Transition.TransitionAnimationState createTransitionAnimation222 = AnimatableKt.createTransitionAnimation(updateTransition, valueOf32, valueOf422, (FiniteAnimationSpec) phoneNumberController$$ExternalSyntheticLambda9.invoke(((State) rememberedValue4).getValue(), gapComposer, 0), twoWayConverterImpl, gapComposer, 196608);
                            InputPhase inputPhase522 = (InputPhase) parcelableSnapshotMutableState.getValue();
                            gapComposer.startReplaceGroup(-15504215);
                            iArr = WhenMappings.$EnumSwitchMapping$0;
                            if (iArr[inputPhase522.ordinal()] == 1) {
                            }
                            gapComposer.end(false);
                            ColorSpace m679getColorSpaceimpl32 = Color.m679getColorSpaceimpl(j5);
                            changed5 = gapComposer.changed(m679getColorSpaceimpl32);
                            rememberedValue5 = gapComposer.rememberedValue();
                            if (!changed5) {
                            }
                            rememberedValue5 = new TwoWayConverterImpl(crossfadeKt$Crossfade$3$1, new BoundsAnimation$animate$1(m679getColorSpaceimpl32, 1));
                            gapComposer.updateRememberedValue(rememberedValue5);
                            TwoWayConverterImpl twoWayConverterImpl222 = (TwoWayConverterImpl) rememberedValue5;
                            if (updateTransition.isSeeking()) {
                            }
                            gapComposer.startReplaceGroup(-15504215);
                            if (iArr[((InputPhase) m3).ordinal()] == 1) {
                            }
                            Color m522 = Recorder$$ExternalSyntheticOutline1.m(gapComposer, (boolean) r10, j3);
                            changed6 = gapComposer.changed(updateTransition);
                            rememberedValue6 = gapComposer.rememberedValue();
                            if (!changed6) {
                            }
                            rememberedValue6 = Updater.derivedStateOf(new TextFieldTransitionScope$TransitionDTcfvLk$$inlined$animateColor$1(updateTransition, r10));
                            gapComposer.updateRememberedValue(rememberedValue6);
                            inputPhase2 = (InputPhase) ((State) rememberedValue6).getValue();
                            gapComposer.startReplaceGroup(-15504215);
                            if (iArr2[inputPhase2.ordinal()] == 1) {
                            }
                            Color m622 = Recorder$$ExternalSyntheticOutline1.m(gapComposer, false, j4);
                            changed7 = gapComposer.changed(updateTransition);
                            rememberedValue7 = gapComposer.rememberedValue();
                            if (!changed7) {
                            }
                            rememberedValue7 = Updater.derivedStateOf(new TextFieldTransitionScope$TransitionDTcfvLk$$inlined$animateColor$1(updateTransition, 5));
                            gapComposer.updateRememberedValue(rememberedValue7);
                            ((Transition.Segment) ((State) rememberedValue7).getValue()).getClass();
                            gapComposer.startReplaceGroup(412246452);
                            TweenSpec tween$default222 = AnimatableKt.tween$default(150, 0, null, 6);
                            gapComposer.end(false);
                            Transition.TransitionAnimationState createTransitionAnimation322 = AnimatableKt.createTransitionAnimation(updateTransition, color, m622, tween$default222, twoWayConverterImpl222, gapComposer, 196608);
                            int i322 = (i2 & 7168) | MLKEMEngine.KyberPolyBytes;
                            ColorSpace m679getColorSpaceimpl222 = Color.m679getColorSpaceimpl(((Color) textFieldImplKt$CommonDecorationBox$labelColor$1.invoke(parcelableSnapshotMutableState.getValue(), gapComposer, Integer.valueOf((i322 >> 6) & 112))).value);
                            changed8 = gapComposer.changed(m679getColorSpaceimpl222);
                            rememberedValue8 = gapComposer.rememberedValue();
                            if (!changed8) {
                            }
                            rememberedValue8 = new TwoWayConverterImpl(crossfadeKt$Crossfade$3$1, new BoundsAnimation$animate$1(m679getColorSpaceimpl222, 1));
                            gapComposer.updateRememberedValue(rememberedValue8);
                            TwoWayConverterImpl twoWayConverterImpl322 = (TwoWayConverterImpl) rememberedValue8;
                            int i422 = ((i322 << 3) & 57344) | 3072;
                            if (updateTransition.isSeeking()) {
                            }
                            int i522 = (i422 >> 9) & 112;
                            Object invoke32 = textFieldImplKt$CommonDecorationBox$labelColor$1.invoke(m4, gapComposer, Integer.valueOf(i522));
                            changed9 = gapComposer.changed(updateTransition);
                            rememberedValue9 = gapComposer.rememberedValue();
                            if (!changed9) {
                            }
                            rememberedValue9 = Updater.derivedStateOf(new TextFieldTransitionScope$TransitionDTcfvLk$$inlined$animateColor$1(updateTransition, 6));
                            gapComposer.updateRememberedValue(rememberedValue9);
                            Object invoke222 = textFieldImplKt$CommonDecorationBox$labelColor$1.invoke(((State) rememberedValue9).getValue(), gapComposer, Integer.valueOf(i522));
                            changed10 = gapComposer.changed(updateTransition);
                            rememberedValue10 = gapComposer.rememberedValue();
                            if (!changed10) {
                            }
                            rememberedValue10 = Updater.derivedStateOf(new TextFieldTransitionScope$TransitionDTcfvLk$$inlined$animateColor$1(updateTransition, 7));
                            gapComposer.updateRememberedValue(rememberedValue10);
                            ((Transition.Segment) ((State) rememberedValue10).getValue()).getClass();
                            gapComposer.startReplaceGroup(1054273641);
                            TweenSpec tween$default322 = AnimatableKt.tween$default(150, 0, null, 6);
                            gapComposer.end(false);
                            composableLambdaImpl.invoke(Float.valueOf(((Number) createTransitionAnimation.value$delegate.getValue()).floatValue()), new Color(((Color) createTransitionAnimation322.value$delegate.getValue()).value), new Color(((Color) AnimatableKt.createTransitionAnimation(updateTransition, invoke32, invoke222, tween$default322, twoWayConverterImpl322, gapComposer, 196608).value$delegate.getValue()).value), Float.valueOf(((Number) createTransitionAnimation222.value$delegate.getValue()).floatValue()), (Object) gapComposer, (Object) 24576);
                        } else if (ordinal != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                    }
                    f2 = 1.0f;
                    gapComposer.end(false);
                    Float valueOf22 = Float.valueOf(f2);
                    changed2 = gapComposer.changed(updateTransition);
                    rememberedValue2 = gapComposer.rememberedValue();
                    if (!changed2) {
                    }
                    rememberedValue2 = Updater.derivedStateOf(new TextFieldTransitionScope$TransitionDTcfvLk$$inlined$animateColor$1(updateTransition, 9));
                    gapComposer.updateRememberedValue(rememberedValue2);
                    ((Transition.Segment) ((State) rememberedValue2).getValue()).getClass();
                    gapComposer.startReplaceGroup(-1820270483);
                    TweenSpec tween$default4 = AnimatableKt.tween$default(150, 0, null, 6);
                    gapComposer.end(false);
                    Transition.TransitionAnimationState createTransitionAnimation4 = AnimatableKt.createTransitionAnimation(updateTransition, valueOf, valueOf22, tween$default4, twoWayConverterImpl, gapComposer, 196608);
                    PhoneNumberController$$ExternalSyntheticLambda9 phoneNumberController$$ExternalSyntheticLambda92 = new PhoneNumberController$$ExternalSyntheticLambda9(10);
                    if (updateTransition.isSeeking()) {
                    }
                    gapComposer.startReplaceGroup(1758344392);
                    ordinal2 = ((InputPhase) m2).ordinal();
                    if (ordinal2 != 0) {
                    }
                    f3 = 1.0f;
                    gapComposer.end(false);
                    Float valueOf322 = Float.valueOf(f3);
                    changed3 = gapComposer.changed(updateTransition);
                    rememberedValue3 = gapComposer.rememberedValue();
                    if (!changed3) {
                    }
                    rememberedValue3 = Updater.derivedStateOf(new TextFieldTransitionScope$TransitionDTcfvLk$$inlined$animateColor$1(updateTransition, 10));
                    gapComposer.updateRememberedValue(rememberedValue3);
                    InputPhase inputPhase422 = (InputPhase) ((State) rememberedValue3).getValue();
                    gapComposer.startReplaceGroup(1758344392);
                    ordinal3 = inputPhase422.ordinal();
                    if (ordinal3 != 0) {
                    }
                    z2 = false;
                    gapComposer.end(z2);
                    Float valueOf4222 = Float.valueOf(f4);
                    changed4 = gapComposer.changed(updateTransition);
                    rememberedValue4 = gapComposer.rememberedValue();
                    if (!changed4) {
                    }
                    rememberedValue4 = Updater.derivedStateOf(new TextFieldTransitionScope$TransitionDTcfvLk$$inlined$animateColor$1(updateTransition, 11));
                    gapComposer.updateRememberedValue(rememberedValue4);
                    Transition.TransitionAnimationState createTransitionAnimation2222 = AnimatableKt.createTransitionAnimation(updateTransition, valueOf322, valueOf4222, (FiniteAnimationSpec) phoneNumberController$$ExternalSyntheticLambda92.invoke(((State) rememberedValue4).getValue(), gapComposer, 0), twoWayConverterImpl, gapComposer, 196608);
                    InputPhase inputPhase5222 = (InputPhase) parcelableSnapshotMutableState.getValue();
                    gapComposer.startReplaceGroup(-15504215);
                    iArr = WhenMappings.$EnumSwitchMapping$0;
                    if (iArr[inputPhase5222.ordinal()] == 1) {
                    }
                    gapComposer.end(false);
                    ColorSpace m679getColorSpaceimpl322 = Color.m679getColorSpaceimpl(j5);
                    changed5 = gapComposer.changed(m679getColorSpaceimpl322);
                    rememberedValue5 = gapComposer.rememberedValue();
                    if (!changed5) {
                    }
                    rememberedValue5 = new TwoWayConverterImpl(crossfadeKt$Crossfade$3$1, new BoundsAnimation$animate$1(m679getColorSpaceimpl322, 1));
                    gapComposer.updateRememberedValue(rememberedValue5);
                    TwoWayConverterImpl twoWayConverterImpl2222 = (TwoWayConverterImpl) rememberedValue5;
                    if (updateTransition.isSeeking()) {
                    }
                    gapComposer.startReplaceGroup(-15504215);
                    if (iArr[((InputPhase) m3).ordinal()] == 1) {
                    }
                    Color m5222 = Recorder$$ExternalSyntheticOutline1.m(gapComposer, (boolean) r10, j3);
                    changed6 = gapComposer.changed(updateTransition);
                    rememberedValue6 = gapComposer.rememberedValue();
                    if (!changed6) {
                    }
                    rememberedValue6 = Updater.derivedStateOf(new TextFieldTransitionScope$TransitionDTcfvLk$$inlined$animateColor$1(updateTransition, r10));
                    gapComposer.updateRememberedValue(rememberedValue6);
                    inputPhase2 = (InputPhase) ((State) rememberedValue6).getValue();
                    gapComposer.startReplaceGroup(-15504215);
                    if (iArr2[inputPhase2.ordinal()] == 1) {
                    }
                    Color m6222 = Recorder$$ExternalSyntheticOutline1.m(gapComposer, false, j4);
                    changed7 = gapComposer.changed(updateTransition);
                    rememberedValue7 = gapComposer.rememberedValue();
                    if (!changed7) {
                    }
                    rememberedValue7 = Updater.derivedStateOf(new TextFieldTransitionScope$TransitionDTcfvLk$$inlined$animateColor$1(updateTransition, 5));
                    gapComposer.updateRememberedValue(rememberedValue7);
                    ((Transition.Segment) ((State) rememberedValue7).getValue()).getClass();
                    gapComposer.startReplaceGroup(412246452);
                    TweenSpec tween$default2222 = AnimatableKt.tween$default(150, 0, null, 6);
                    gapComposer.end(false);
                    Transition.TransitionAnimationState createTransitionAnimation3222 = AnimatableKt.createTransitionAnimation(updateTransition, color, m6222, tween$default2222, twoWayConverterImpl2222, gapComposer, 196608);
                    int i3222 = (i2 & 7168) | MLKEMEngine.KyberPolyBytes;
                    ColorSpace m679getColorSpaceimpl2222 = Color.m679getColorSpaceimpl(((Color) textFieldImplKt$CommonDecorationBox$labelColor$1.invoke(parcelableSnapshotMutableState.getValue(), gapComposer, Integer.valueOf((i3222 >> 6) & 112))).value);
                    changed8 = gapComposer.changed(m679getColorSpaceimpl2222);
                    rememberedValue8 = gapComposer.rememberedValue();
                    if (!changed8) {
                    }
                    rememberedValue8 = new TwoWayConverterImpl(crossfadeKt$Crossfade$3$1, new BoundsAnimation$animate$1(m679getColorSpaceimpl2222, 1));
                    gapComposer.updateRememberedValue(rememberedValue8);
                    TwoWayConverterImpl twoWayConverterImpl3222 = (TwoWayConverterImpl) rememberedValue8;
                    int i4222 = ((i3222 << 3) & 57344) | 3072;
                    if (updateTransition.isSeeking()) {
                    }
                    int i5222 = (i4222 >> 9) & 112;
                    Object invoke322 = textFieldImplKt$CommonDecorationBox$labelColor$1.invoke(m4, gapComposer, Integer.valueOf(i5222));
                    changed9 = gapComposer.changed(updateTransition);
                    rememberedValue9 = gapComposer.rememberedValue();
                    if (!changed9) {
                    }
                    rememberedValue9 = Updater.derivedStateOf(new TextFieldTransitionScope$TransitionDTcfvLk$$inlined$animateColor$1(updateTransition, 6));
                    gapComposer.updateRememberedValue(rememberedValue9);
                    Object invoke2222 = textFieldImplKt$CommonDecorationBox$labelColor$1.invoke(((State) rememberedValue9).getValue(), gapComposer, Integer.valueOf(i5222));
                    changed10 = gapComposer.changed(updateTransition);
                    rememberedValue10 = gapComposer.rememberedValue();
                    if (!changed10) {
                    }
                    rememberedValue10 = Updater.derivedStateOf(new TextFieldTransitionScope$TransitionDTcfvLk$$inlined$animateColor$1(updateTransition, 7));
                    gapComposer.updateRememberedValue(rememberedValue10);
                    ((Transition.Segment) ((State) rememberedValue10).getValue()).getClass();
                    gapComposer.startReplaceGroup(1054273641);
                    TweenSpec tween$default3222 = AnimatableKt.tween$default(150, 0, null, 6);
                    gapComposer.end(false);
                    composableLambdaImpl.invoke(Float.valueOf(((Number) createTransitionAnimation4.value$delegate.getValue()).floatValue()), new Color(((Color) createTransitionAnimation3222.value$delegate.getValue()).value), new Color(((Color) AnimatableKt.createTransitionAnimation(updateTransition, invoke322, invoke2222, tween$default3222, twoWayConverterImpl3222, gapComposer, 196608).value$delegate.getValue()).value), Float.valueOf(((Number) createTransitionAnimation2222.value$delegate.getValue()).floatValue()), (Object) gapComposer, (Object) 24576);
                } else if (ordinal4 != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
            }
            f = 1.0f;
            gapComposer.end(false);
            Float valueOf5 = Float.valueOf(f);
            changed = gapComposer.changed(updateTransition);
            rememberedValue = gapComposer.rememberedValue();
            if (!changed) {
            }
            rememberedValue = Updater.derivedStateOf(new TextFieldTransitionScope$TransitionDTcfvLk$$inlined$animateColor$1(updateTransition, 8));
            gapComposer.updateRememberedValue(rememberedValue);
            InputPhase inputPhase32 = (InputPhase) ((State) rememberedValue).getValue();
            gapComposer.startReplaceGroup(-1082240119);
            ordinal = inputPhase32.ordinal();
            if (ordinal != 0) {
            }
            f2 = 1.0f;
            gapComposer.end(false);
            Float valueOf222 = Float.valueOf(f2);
            changed2 = gapComposer.changed(updateTransition);
            rememberedValue2 = gapComposer.rememberedValue();
            if (!changed2) {
            }
            rememberedValue2 = Updater.derivedStateOf(new TextFieldTransitionScope$TransitionDTcfvLk$$inlined$animateColor$1(updateTransition, 9));
            gapComposer.updateRememberedValue(rememberedValue2);
            ((Transition.Segment) ((State) rememberedValue2).getValue()).getClass();
            gapComposer.startReplaceGroup(-1820270483);
            TweenSpec tween$default42 = AnimatableKt.tween$default(150, 0, null, 6);
            gapComposer.end(false);
            Transition.TransitionAnimationState createTransitionAnimation42 = AnimatableKt.createTransitionAnimation(updateTransition, valueOf5, valueOf222, tween$default42, twoWayConverterImpl, gapComposer, 196608);
            PhoneNumberController$$ExternalSyntheticLambda9 phoneNumberController$$ExternalSyntheticLambda922 = new PhoneNumberController$$ExternalSyntheticLambda9(10);
            if (updateTransition.isSeeking()) {
            }
            gapComposer.startReplaceGroup(1758344392);
            ordinal2 = ((InputPhase) m2).ordinal();
            if (ordinal2 != 0) {
            }
            f3 = 1.0f;
            gapComposer.end(false);
            Float valueOf3222 = Float.valueOf(f3);
            changed3 = gapComposer.changed(updateTransition);
            rememberedValue3 = gapComposer.rememberedValue();
            if (!changed3) {
            }
            rememberedValue3 = Updater.derivedStateOf(new TextFieldTransitionScope$TransitionDTcfvLk$$inlined$animateColor$1(updateTransition, 10));
            gapComposer.updateRememberedValue(rememberedValue3);
            InputPhase inputPhase4222 = (InputPhase) ((State) rememberedValue3).getValue();
            gapComposer.startReplaceGroup(1758344392);
            ordinal3 = inputPhase4222.ordinal();
            if (ordinal3 != 0) {
            }
            z2 = false;
            gapComposer.end(z2);
            Float valueOf42222 = Float.valueOf(f4);
            changed4 = gapComposer.changed(updateTransition);
            rememberedValue4 = gapComposer.rememberedValue();
            if (!changed4) {
            }
            rememberedValue4 = Updater.derivedStateOf(new TextFieldTransitionScope$TransitionDTcfvLk$$inlined$animateColor$1(updateTransition, 11));
            gapComposer.updateRememberedValue(rememberedValue4);
            Transition.TransitionAnimationState createTransitionAnimation22222 = AnimatableKt.createTransitionAnimation(updateTransition, valueOf3222, valueOf42222, (FiniteAnimationSpec) phoneNumberController$$ExternalSyntheticLambda922.invoke(((State) rememberedValue4).getValue(), gapComposer, 0), twoWayConverterImpl, gapComposer, 196608);
            InputPhase inputPhase52222 = (InputPhase) parcelableSnapshotMutableState.getValue();
            gapComposer.startReplaceGroup(-15504215);
            iArr = WhenMappings.$EnumSwitchMapping$0;
            if (iArr[inputPhase52222.ordinal()] == 1) {
            }
            gapComposer.end(false);
            ColorSpace m679getColorSpaceimpl3222 = Color.m679getColorSpaceimpl(j5);
            changed5 = gapComposer.changed(m679getColorSpaceimpl3222);
            rememberedValue5 = gapComposer.rememberedValue();
            if (!changed5) {
            }
            rememberedValue5 = new TwoWayConverterImpl(crossfadeKt$Crossfade$3$1, new BoundsAnimation$animate$1(m679getColorSpaceimpl3222, 1));
            gapComposer.updateRememberedValue(rememberedValue5);
            TwoWayConverterImpl twoWayConverterImpl22222 = (TwoWayConverterImpl) rememberedValue5;
            if (updateTransition.isSeeking()) {
            }
            gapComposer.startReplaceGroup(-15504215);
            if (iArr[((InputPhase) m3).ordinal()] == 1) {
            }
            Color m52222 = Recorder$$ExternalSyntheticOutline1.m(gapComposer, (boolean) r10, j3);
            changed6 = gapComposer.changed(updateTransition);
            rememberedValue6 = gapComposer.rememberedValue();
            if (!changed6) {
            }
            rememberedValue6 = Updater.derivedStateOf(new TextFieldTransitionScope$TransitionDTcfvLk$$inlined$animateColor$1(updateTransition, r10));
            gapComposer.updateRememberedValue(rememberedValue6);
            inputPhase2 = (InputPhase) ((State) rememberedValue6).getValue();
            gapComposer.startReplaceGroup(-15504215);
            if (iArr2[inputPhase2.ordinal()] == 1) {
            }
            Color m62222 = Recorder$$ExternalSyntheticOutline1.m(gapComposer, false, j4);
            changed7 = gapComposer.changed(updateTransition);
            rememberedValue7 = gapComposer.rememberedValue();
            if (!changed7) {
            }
            rememberedValue7 = Updater.derivedStateOf(new TextFieldTransitionScope$TransitionDTcfvLk$$inlined$animateColor$1(updateTransition, 5));
            gapComposer.updateRememberedValue(rememberedValue7);
            ((Transition.Segment) ((State) rememberedValue7).getValue()).getClass();
            gapComposer.startReplaceGroup(412246452);
            TweenSpec tween$default22222 = AnimatableKt.tween$default(150, 0, null, 6);
            gapComposer.end(false);
            Transition.TransitionAnimationState createTransitionAnimation32222 = AnimatableKt.createTransitionAnimation(updateTransition, color, m62222, tween$default22222, twoWayConverterImpl22222, gapComposer, 196608);
            int i32222 = (i2 & 7168) | MLKEMEngine.KyberPolyBytes;
            ColorSpace m679getColorSpaceimpl22222 = Color.m679getColorSpaceimpl(((Color) textFieldImplKt$CommonDecorationBox$labelColor$1.invoke(parcelableSnapshotMutableState.getValue(), gapComposer, Integer.valueOf((i32222 >> 6) & 112))).value);
            changed8 = gapComposer.changed(m679getColorSpaceimpl22222);
            rememberedValue8 = gapComposer.rememberedValue();
            if (!changed8) {
            }
            rememberedValue8 = new TwoWayConverterImpl(crossfadeKt$Crossfade$3$1, new BoundsAnimation$animate$1(m679getColorSpaceimpl22222, 1));
            gapComposer.updateRememberedValue(rememberedValue8);
            TwoWayConverterImpl twoWayConverterImpl32222 = (TwoWayConverterImpl) rememberedValue8;
            int i42222 = ((i32222 << 3) & 57344) | 3072;
            if (updateTransition.isSeeking()) {
            }
            int i52222 = (i42222 >> 9) & 112;
            Object invoke3222 = textFieldImplKt$CommonDecorationBox$labelColor$1.invoke(m4, gapComposer, Integer.valueOf(i52222));
            changed9 = gapComposer.changed(updateTransition);
            rememberedValue9 = gapComposer.rememberedValue();
            if (!changed9) {
            }
            rememberedValue9 = Updater.derivedStateOf(new TextFieldTransitionScope$TransitionDTcfvLk$$inlined$animateColor$1(updateTransition, 6));
            gapComposer.updateRememberedValue(rememberedValue9);
            Object invoke22222 = textFieldImplKt$CommonDecorationBox$labelColor$1.invoke(((State) rememberedValue9).getValue(), gapComposer, Integer.valueOf(i52222));
            changed10 = gapComposer.changed(updateTransition);
            rememberedValue10 = gapComposer.rememberedValue();
            if (!changed10) {
            }
            rememberedValue10 = Updater.derivedStateOf(new TextFieldTransitionScope$TransitionDTcfvLk$$inlined$animateColor$1(updateTransition, 7));
            gapComposer.updateRememberedValue(rememberedValue10);
            ((Transition.Segment) ((State) rememberedValue10).getValue()).getClass();
            gapComposer.startReplaceGroup(1054273641);
            TweenSpec tween$default32222 = AnimatableKt.tween$default(150, 0, null, 6);
            gapComposer.end(false);
            composableLambdaImpl.invoke(Float.valueOf(((Number) createTransitionAnimation42.value$delegate.getValue()).floatValue()), new Color(((Color) createTransitionAnimation32222.value$delegate.getValue()).value), new Color(((Color) AnimatableKt.createTransitionAnimation(updateTransition, invoke3222, invoke22222, tween$default32222, twoWayConverterImpl32222, gapComposer, 196608).value$delegate.getValue()).value), Float.valueOf(((Number) createTransitionAnimation22222.value$delegate.getValue()).floatValue()), (Object) gapComposer, (Object) 24576);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextFieldTransitionScope$$ExternalSyntheticLambda1(this, inputPhase, j, j2, textFieldImplKt$CommonDecorationBox$labelColor$1, z, composableLambdaImpl, i, 1);
        }
    }
}
