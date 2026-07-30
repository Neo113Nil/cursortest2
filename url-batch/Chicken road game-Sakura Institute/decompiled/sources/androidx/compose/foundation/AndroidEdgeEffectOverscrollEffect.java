package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt;

/* compiled from: AndroidOverscroll.android.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010#\u001a\u00020\u001fH\u0002J?\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020&2\"\u0010'\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020&\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0)\u0012\u0006\u0012\u0004\u0018\u00010*0(H\u0096@ø\u0001\u0000¢\u0006\u0004\b+\u0010,J6\u0010-\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020\u001c2\u0006\u0010/\u001a\u0002002\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c02H\u0016ø\u0001\u0000¢\u0006\u0004\b3\u00104J\u0015\u00105\u001a\u00020\u001cH\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\u001fH\u0000¢\u0006\u0002\b9J\u001a\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u001cH\u0002ø\u0001\u0000¢\u0006\u0004\b=\u0010>J\u001a\u0010?\u001a\u00020;2\u0006\u0010<\u001a\u00020\u001cH\u0002ø\u0001\u0000¢\u0006\u0004\b@\u0010>J\u001a\u0010A\u001a\u00020;2\u0006\u0010<\u001a\u00020\u001cH\u0002ø\u0001\u0000¢\u0006\u0004\bB\u0010>J\u001a\u0010C\u001a\u00020;2\u0006\u0010<\u001a\u00020\u001cH\u0002ø\u0001\u0000¢\u0006\u0004\bD\u0010>J\u001a\u0010E\u001a\u00020\u00112\u0006\u0010.\u001a\u00020\u001cH\u0002ø\u0001\u0000¢\u0006\u0004\bF\u0010GJ\b\u0010H\u001a\u00020\u0011H\u0002J\u001a\u0010I\u001a\u00020\u001f2\u0006\u0010J\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\bK\u0010LR\u0016\u0010\u0007\u001a\u00020\bX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u00020\u00118\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006M"}, d2 = {"Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "Landroidx/compose/foundation/OverscrollEffect;", "context", "Landroid/content/Context;", "overscrollConfig", "Landroidx/compose/foundation/OverscrollConfiguration;", "(Landroid/content/Context;Landroidx/compose/foundation/OverscrollConfiguration;)V", "containerSize", "Landroidx/compose/ui/geometry/Size;", "J", "edgeEffectWrapper", "Landroidx/compose/foundation/EdgeEffectWrapper;", "effectModifier", "Landroidx/compose/ui/Modifier;", "getEffectModifier", "()Landroidx/compose/ui/Modifier;", "invalidationEnabled", "", "getInvalidationEnabled$foundation_release$annotations", "()V", "getInvalidationEnabled$foundation_release", "()Z", "setInvalidationEnabled$foundation_release", "(Z)V", "isInProgress", "pointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerPosition", "Landroidx/compose/ui/geometry/Offset;", "redrawSignal", "Landroidx/compose/runtime/MutableState;", "", "getRedrawSignal$foundation_release", "()Landroidx/compose/runtime/MutableState;", "scrollCycleInProgress", "animateToRelease", "applyToFling", "velocity", "Landroidx/compose/ui/unit/Velocity;", "performFling", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "applyToFling-BMRW4eQ", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applyToScroll", "delta", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "performScroll", "Lkotlin/Function1;", "applyToScroll-Rhakbz0", "(JILkotlin/jvm/functions/Function1;)J", "displacement", "displacement-F1C5BW0$foundation_release", "()J", "invalidateOverscroll", "invalidateOverscroll$foundation_release", "pullBottom", "", "scroll", "pullBottom-k-4lQ0M", "(J)F", "pullLeft", "pullLeft-k-4lQ0M", "pullRight", "pullRight-k-4lQ0M", "pullTop", "pullTop-k-4lQ0M", "releaseOppositeOverscroll", "releaseOppositeOverscroll-k-4lQ0M", "(J)Z", "stopOverscrollAnimation", "updateSize", "size", "updateSize-uvyYCjk$foundation_release", "(J)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidEdgeEffectOverscrollEffect implements OverscrollEffect {
    public static final int $stable = 0;
    private long containerSize;
    private final EdgeEffectWrapper edgeEffectWrapper;
    private final Modifier effectModifier;
    private boolean invalidationEnabled;
    private PointerId pointerId;
    private Offset pointerPosition;
    private final MutableState<Unit> redrawSignal;
    private boolean scrollCycleInProgress;

    public static /* synthetic */ void getInvalidationEnabled$foundation_release$annotations() {
    }

    public AndroidEdgeEffectOverscrollEffect(Context context, OverscrollConfiguration overscrollConfiguration) {
        Modifier drawGlowOverscrollModifier;
        EdgeEffectWrapper edgeEffectWrapper = new EdgeEffectWrapper(context, ColorKt.m3894toArgb8_81llA(overscrollConfiguration.getGlowColor()));
        this.edgeEffectWrapper = edgeEffectWrapper;
        this.redrawSignal = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
        this.invalidationEnabled = true;
        this.containerSize = Size.INSTANCE.m3677getZeroNHjbRc();
        Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, Unit.INSTANCE, new AndroidEdgeEffectOverscrollEffect$effectModifier$1(this, null));
        if (Build.VERSION.SDK_INT >= 31) {
            drawGlowOverscrollModifier = new DrawStretchOverscrollModifier(this, edgeEffectWrapper, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$special$$inlined$debugInspectorInfo$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                    invoke2(inspectorInfo);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(InspectorInfo inspectorInfo) {
                    inspectorInfo.setName("overscroll");
                    inspectorInfo.setValue(AndroidEdgeEffectOverscrollEffect.this);
                }
            } : InspectableValueKt.getNoInspectorInfo());
        } else {
            drawGlowOverscrollModifier = new DrawGlowOverscrollModifier(this, edgeEffectWrapper, overscrollConfiguration, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$special$$inlined$debugInspectorInfo$2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                    invoke2(inspectorInfo);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(InspectorInfo inspectorInfo) {
                    inspectorInfo.setName("overscroll");
                    inspectorInfo.setValue(AndroidEdgeEffectOverscrollEffect.this);
                }
            } : InspectableValueKt.getNoInspectorInfo());
        }
        this.effectModifier = pointerInput.then(drawGlowOverscrollModifier);
    }

    public final MutableState<Unit> getRedrawSignal$foundation_release() {
        return this.redrawSignal;
    }

    /* renamed from: getInvalidationEnabled$foundation_release, reason: from getter */
    public final boolean getInvalidationEnabled() {
        return this.invalidationEnabled;
    }

    public final void setInvalidationEnabled$foundation_release(boolean z) {
        this.invalidationEnabled = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010c  */
    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: applyToScroll-Rhakbz0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long mo218applyToScrollRhakbz0(long delta, int source, Function1<? super Offset, Offset> performScroll) {
        float m212pullBottomk4lQ0M;
        long Offset;
        boolean z;
        boolean z2;
        if (Size.m3670isEmptyimpl(this.containerSize)) {
            return performScroll.invoke(Offset.m3588boximpl(delta)).getPackedValue();
        }
        boolean z3 = true;
        if (!this.scrollCycleInProgress) {
            stopOverscrollAnimation();
            this.scrollCycleInProgress = true;
        }
        float f = 0.0f;
        if (Offset.m3600getYimpl(delta) != 0.0f) {
            if (this.edgeEffectWrapper.isTopStretched()) {
                m212pullBottomk4lQ0M = m215pullTopk4lQ0M(delta);
                if (!this.edgeEffectWrapper.isTopStretched()) {
                    this.edgeEffectWrapper.getOrCreateTopEffect().onRelease();
                }
            } else if (this.edgeEffectWrapper.isBottomStretched()) {
                m212pullBottomk4lQ0M = m212pullBottomk4lQ0M(delta);
                if (!this.edgeEffectWrapper.isBottomStretched()) {
                    this.edgeEffectWrapper.getOrCreateBottomEffect().onRelease();
                }
            }
            if (Offset.m3599getXimpl(delta) != 0.0f) {
                if (this.edgeEffectWrapper.isLeftStretched()) {
                    f = m213pullLeftk4lQ0M(delta);
                    if (!this.edgeEffectWrapper.isLeftStretched()) {
                        this.edgeEffectWrapper.getOrCreateLeftEffect().onRelease();
                    }
                } else if (this.edgeEffectWrapper.isRightStretched()) {
                    f = m214pullRightk4lQ0M(delta);
                    if (!this.edgeEffectWrapper.isRightStretched()) {
                        this.edgeEffectWrapper.getOrCreateRightEffect().onRelease();
                    }
                }
            }
            Offset = OffsetKt.Offset(f, m212pullBottomk4lQ0M);
            if (!Offset.m3596equalsimpl0(Offset, Offset.INSTANCE.m3615getZeroF1C5BW0())) {
                invalidateOverscroll$foundation_release();
            }
            long m3603minusMKHz9U = Offset.m3603minusMKHz9U(delta, Offset);
            long packedValue = performScroll.invoke(Offset.m3588boximpl(m3603minusMKHz9U)).getPackedValue();
            long m3603minusMKHz9U2 = Offset.m3603minusMKHz9U(m3603minusMKHz9U, packedValue);
            boolean z4 = false;
            if (NestedScrollSource.m4929equalsimpl0(source, NestedScrollSource.INSTANCE.m4941getUserInputWNlRxjI())) {
                if (Offset.m3599getXimpl(m3603minusMKHz9U2) > 0.5f) {
                    m213pullLeftk4lQ0M(m3603minusMKHz9U2);
                } else if (Offset.m3599getXimpl(m3603minusMKHz9U2) < -0.5f) {
                    m214pullRightk4lQ0M(m3603minusMKHz9U2);
                } else {
                    z = false;
                    if (Offset.m3600getYimpl(m3603minusMKHz9U2) <= 0.5f) {
                        m215pullTopk4lQ0M(m3603minusMKHz9U2);
                    } else if (Offset.m3600getYimpl(m3603minusMKHz9U2) < -0.5f) {
                        m212pullBottomk4lQ0M(m3603minusMKHz9U2);
                    } else {
                        z2 = false;
                        if (!z && !z2) {
                            z3 = false;
                        }
                        z4 = z3;
                    }
                    z2 = true;
                    if (!z) {
                        z3 = false;
                    }
                    z4 = z3;
                }
                z = true;
                if (Offset.m3600getYimpl(m3603minusMKHz9U2) <= 0.5f) {
                }
                z2 = true;
                if (!z) {
                }
                z4 = z3;
            }
            if (!m216releaseOppositeOverscrollk4lQ0M(delta) || z4) {
                invalidateOverscroll$foundation_release();
            }
            return Offset.m3604plusMKHz9U(Offset, packedValue);
        }
        m212pullBottomk4lQ0M = 0.0f;
        if (Offset.m3599getXimpl(delta) != 0.0f) {
        }
        Offset = OffsetKt.Offset(f, m212pullBottomk4lQ0M);
        if (!Offset.m3596equalsimpl0(Offset, Offset.INSTANCE.m3615getZeroF1C5BW0())) {
        }
        long m3603minusMKHz9U3 = Offset.m3603minusMKHz9U(delta, Offset);
        long packedValue2 = performScroll.invoke(Offset.m3588boximpl(m3603minusMKHz9U3)).getPackedValue();
        long m3603minusMKHz9U22 = Offset.m3603minusMKHz9U(m3603minusMKHz9U3, packedValue2);
        boolean z42 = false;
        if (NestedScrollSource.m4929equalsimpl0(source, NestedScrollSource.INSTANCE.m4941getUserInputWNlRxjI())) {
        }
        if (!m216releaseOppositeOverscrollk4lQ0M(delta)) {
        }
        invalidateOverscroll$foundation_release();
        return Offset.m3604plusMKHz9U(Offset, packedValue2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: applyToFling-BMRW4eQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo217applyToFlingBMRW4eQ(long j, Function2<? super Velocity, ? super Continuation<? super Velocity>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        AndroidEdgeEffectOverscrollEffect$applyToFling$1 androidEdgeEffectOverscrollEffect$applyToFling$1;
        int i;
        float f;
        float f2;
        long m6539minusAH228Gc;
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect;
        long m6539minusAH228Gc2;
        if (continuation instanceof AndroidEdgeEffectOverscrollEffect$applyToFling$1) {
            androidEdgeEffectOverscrollEffect$applyToFling$1 = (AndroidEdgeEffectOverscrollEffect$applyToFling$1) continuation;
            if ((androidEdgeEffectOverscrollEffect$applyToFling$1.label & Integer.MIN_VALUE) != 0) {
                androidEdgeEffectOverscrollEffect$applyToFling$1.label -= Integer.MIN_VALUE;
                Object obj = androidEdgeEffectOverscrollEffect$applyToFling$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidEdgeEffectOverscrollEffect$applyToFling$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    m6539minusAH228Gc = androidEdgeEffectOverscrollEffect$applyToFling$1.J$0;
                    androidEdgeEffectOverscrollEffect = (AndroidEdgeEffectOverscrollEffect) androidEdgeEffectOverscrollEffect$applyToFling$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    m6539minusAH228Gc2 = Velocity.m6539minusAH228Gc(m6539minusAH228Gc, ((Velocity) obj).getPackedValue());
                    androidEdgeEffectOverscrollEffect.scrollCycleInProgress = false;
                    if (Velocity.m6536getXimpl(m6539minusAH228Gc2) <= 0.0f) {
                        EdgeEffectCompat.INSTANCE.onAbsorbCompat(androidEdgeEffectOverscrollEffect.edgeEffectWrapper.getOrCreateLeftEffect(), MathKt.roundToInt(Velocity.m6536getXimpl(m6539minusAH228Gc2)));
                    } else if (Velocity.m6536getXimpl(m6539minusAH228Gc2) < 0.0f) {
                        EdgeEffectCompat.INSTANCE.onAbsorbCompat(androidEdgeEffectOverscrollEffect.edgeEffectWrapper.getOrCreateRightEffect(), -MathKt.roundToInt(Velocity.m6536getXimpl(m6539minusAH228Gc2)));
                    }
                    if (Velocity.m6537getYimpl(m6539minusAH228Gc2) <= 0.0f) {
                        EdgeEffectCompat.INSTANCE.onAbsorbCompat(androidEdgeEffectOverscrollEffect.edgeEffectWrapper.getOrCreateTopEffect(), MathKt.roundToInt(Velocity.m6537getYimpl(m6539minusAH228Gc2)));
                    } else if (Velocity.m6537getYimpl(m6539minusAH228Gc2) < 0.0f) {
                        EdgeEffectCompat.INSTANCE.onAbsorbCompat(androidEdgeEffectOverscrollEffect.edgeEffectWrapper.getOrCreateBottomEffect(), -MathKt.roundToInt(Velocity.m6537getYimpl(m6539minusAH228Gc2)));
                    }
                    if (!Velocity.m6535equalsimpl0(m6539minusAH228Gc2, Velocity.INSTANCE.m6547getZero9UxMQ8M())) {
                        androidEdgeEffectOverscrollEffect.invalidateOverscroll$foundation_release();
                    }
                    androidEdgeEffectOverscrollEffect.animateToRelease();
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                if (Size.m3670isEmptyimpl(this.containerSize)) {
                    Velocity m6527boximpl = Velocity.m6527boximpl(j);
                    androidEdgeEffectOverscrollEffect$applyToFling$1.label = 1;
                    if (function2.invoke(m6527boximpl, androidEdgeEffectOverscrollEffect$applyToFling$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                if (Velocity.m6536getXimpl(j) > 0.0f && this.edgeEffectWrapper.isLeftStretched()) {
                    EdgeEffectCompat.INSTANCE.onAbsorbCompat(this.edgeEffectWrapper.getOrCreateLeftEffect(), MathKt.roundToInt(Velocity.m6536getXimpl(j)));
                    f = Velocity.m6536getXimpl(j);
                } else if (Velocity.m6536getXimpl(j) >= 0.0f || !this.edgeEffectWrapper.isRightStretched()) {
                    f = 0.0f;
                } else {
                    EdgeEffectCompat.INSTANCE.onAbsorbCompat(this.edgeEffectWrapper.getOrCreateRightEffect(), -MathKt.roundToInt(Velocity.m6536getXimpl(j)));
                    f = Velocity.m6536getXimpl(j);
                }
                if (Velocity.m6537getYimpl(j) > 0.0f && this.edgeEffectWrapper.isTopStretched()) {
                    EdgeEffectCompat.INSTANCE.onAbsorbCompat(this.edgeEffectWrapper.getOrCreateTopEffect(), MathKt.roundToInt(Velocity.m6537getYimpl(j)));
                    f2 = Velocity.m6537getYimpl(j);
                } else if (Velocity.m6537getYimpl(j) >= 0.0f || !this.edgeEffectWrapper.isBottomStretched()) {
                    f2 = 0.0f;
                } else {
                    EdgeEffectCompat.INSTANCE.onAbsorbCompat(this.edgeEffectWrapper.getOrCreateBottomEffect(), -MathKt.roundToInt(Velocity.m6537getYimpl(j)));
                    f2 = Velocity.m6537getYimpl(j);
                }
                long Velocity = VelocityKt.Velocity(f, f2);
                if (!Velocity.m6535equalsimpl0(Velocity, Velocity.INSTANCE.m6547getZero9UxMQ8M())) {
                    invalidateOverscroll$foundation_release();
                }
                m6539minusAH228Gc = Velocity.m6539minusAH228Gc(j, Velocity);
                Velocity m6527boximpl2 = Velocity.m6527boximpl(m6539minusAH228Gc);
                androidEdgeEffectOverscrollEffect$applyToFling$1.L$0 = this;
                androidEdgeEffectOverscrollEffect$applyToFling$1.J$0 = m6539minusAH228Gc;
                androidEdgeEffectOverscrollEffect$applyToFling$1.label = 2;
                obj = function2.invoke(m6527boximpl2, androidEdgeEffectOverscrollEffect$applyToFling$1);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                androidEdgeEffectOverscrollEffect = this;
                m6539minusAH228Gc2 = Velocity.m6539minusAH228Gc(m6539minusAH228Gc, ((Velocity) obj).getPackedValue());
                androidEdgeEffectOverscrollEffect.scrollCycleInProgress = false;
                if (Velocity.m6536getXimpl(m6539minusAH228Gc2) <= 0.0f) {
                }
                if (Velocity.m6537getYimpl(m6539minusAH228Gc2) <= 0.0f) {
                }
                if (!Velocity.m6535equalsimpl0(m6539minusAH228Gc2, Velocity.INSTANCE.m6547getZero9UxMQ8M())) {
                }
                androidEdgeEffectOverscrollEffect.animateToRelease();
                return Unit.INSTANCE;
            }
        }
        androidEdgeEffectOverscrollEffect$applyToFling$1 = new AndroidEdgeEffectOverscrollEffect$applyToFling$1(this, continuation);
        Object obj2 = androidEdgeEffectOverscrollEffect$applyToFling$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidEdgeEffectOverscrollEffect$applyToFling$1.label;
        if (i == 0) {
        }
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public boolean isInProgress() {
        EdgeEffectWrapper edgeEffectWrapper = this.edgeEffectWrapper;
        EdgeEffect edgeEffect = edgeEffectWrapper.topEffect;
        if (edgeEffect != null && EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect2 = edgeEffectWrapper.bottomEffect;
        if (edgeEffect2 != null && EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect2) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect3 = edgeEffectWrapper.leftEffect;
        if (edgeEffect3 != null && EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect3) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect4 = edgeEffectWrapper.rightEffect;
        return (edgeEffect4 == null || EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect4) == 0.0f) ? false : true;
    }

    private final boolean stopOverscrollAnimation() {
        boolean z;
        if (this.edgeEffectWrapper.isLeftStretched()) {
            m213pullLeftk4lQ0M(Offset.INSTANCE.m3615getZeroF1C5BW0());
            z = true;
        } else {
            z = false;
        }
        if (this.edgeEffectWrapper.isRightStretched()) {
            m214pullRightk4lQ0M(Offset.INSTANCE.m3615getZeroF1C5BW0());
            z = true;
        }
        if (this.edgeEffectWrapper.isTopStretched()) {
            m215pullTopk4lQ0M(Offset.INSTANCE.m3615getZeroF1C5BW0());
            z = true;
        }
        if (!this.edgeEffectWrapper.isBottomStretched()) {
            return z;
        }
        m212pullBottomk4lQ0M(Offset.INSTANCE.m3615getZeroF1C5BW0());
        return true;
    }

    /* renamed from: updateSize-uvyYCjk$foundation_release, reason: not valid java name */
    public final void m220updateSizeuvyYCjk$foundation_release(long size) {
        boolean m3664equalsimpl0 = Size.m3664equalsimpl0(this.containerSize, Size.INSTANCE.m3677getZeroNHjbRc());
        boolean z = !Size.m3664equalsimpl0(size, this.containerSize);
        this.containerSize = size;
        if (z) {
            this.edgeEffectWrapper.m291setSizeozmzZPI(IntSizeKt.IntSize(MathKt.roundToInt(Size.m3668getWidthimpl(size)), MathKt.roundToInt(Size.m3665getHeightimpl(size))));
        }
        if (m3664equalsimpl0 || !z) {
            return;
        }
        invalidateOverscroll$foundation_release();
        animateToRelease();
    }

    /* renamed from: displacement-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m219displacementF1C5BW0$foundation_release() {
        Offset offset = this.pointerPosition;
        long packedValue = offset != null ? offset.getPackedValue() : SizeKt.m3678getCenteruvyYCjk(this.containerSize);
        return OffsetKt.Offset(Offset.m3599getXimpl(packedValue) / Size.m3668getWidthimpl(this.containerSize), Offset.m3600getYimpl(packedValue) / Size.m3665getHeightimpl(this.containerSize));
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public Modifier getEffectModifier() {
        return this.effectModifier;
    }

    public final void invalidateOverscroll$foundation_release() {
        if (this.invalidationEnabled) {
            this.redrawSignal.setValue(Unit.INSTANCE);
        }
    }

    private final void animateToRelease() {
        boolean z;
        EdgeEffectWrapper edgeEffectWrapper = this.edgeEffectWrapper;
        EdgeEffect edgeEffect = edgeEffectWrapper.topEffect;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = edgeEffectWrapper.bottomEffect;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = edgeEffectWrapper.leftEffect;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = edgeEffectWrapper.rightEffect;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z = edgeEffect4.isFinished() || z;
        }
        if (z) {
            invalidateOverscroll$foundation_release();
        }
    }

    /* renamed from: releaseOppositeOverscroll-k-4lQ0M, reason: not valid java name */
    private final boolean m216releaseOppositeOverscrollk4lQ0M(long delta) {
        boolean z;
        boolean z2 = true;
        if (!this.edgeEffectWrapper.isLeftAnimating() || Offset.m3599getXimpl(delta) >= 0.0f) {
            z = false;
        } else {
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.edgeEffectWrapper.getOrCreateLeftEffect(), Offset.m3599getXimpl(delta));
            z = !this.edgeEffectWrapper.isLeftAnimating();
        }
        if (this.edgeEffectWrapper.isRightAnimating() && Offset.m3599getXimpl(delta) > 0.0f) {
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.edgeEffectWrapper.getOrCreateRightEffect(), Offset.m3599getXimpl(delta));
            z = z || !this.edgeEffectWrapper.isRightAnimating();
        }
        if (this.edgeEffectWrapper.isTopAnimating() && Offset.m3600getYimpl(delta) < 0.0f) {
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.edgeEffectWrapper.getOrCreateTopEffect(), Offset.m3600getYimpl(delta));
            z = z || !this.edgeEffectWrapper.isTopAnimating();
        }
        if (!this.edgeEffectWrapper.isBottomAnimating() || Offset.m3600getYimpl(delta) <= 0.0f) {
            return z;
        }
        EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.edgeEffectWrapper.getOrCreateBottomEffect(), Offset.m3600getYimpl(delta));
        if (!z && this.edgeEffectWrapper.isBottomAnimating()) {
            z2 = false;
        }
        return z2;
    }

    /* renamed from: pullTop-k-4lQ0M, reason: not valid java name */
    private final float m215pullTopk4lQ0M(long scroll) {
        float m3599getXimpl = Offset.m3599getXimpl(m219displacementF1C5BW0$foundation_release());
        float m3600getYimpl = Offset.m3600getYimpl(scroll) / Size.m3665getHeightimpl(this.containerSize);
        EdgeEffect orCreateTopEffect = this.edgeEffectWrapper.getOrCreateTopEffect();
        return EdgeEffectCompat.INSTANCE.getDistanceCompat(orCreateTopEffect) == 0.0f ? EdgeEffectCompat.INSTANCE.onPullDistanceCompat(orCreateTopEffect, m3600getYimpl, m3599getXimpl) * Size.m3665getHeightimpl(this.containerSize) : Offset.m3600getYimpl(scroll);
    }

    /* renamed from: pullBottom-k-4lQ0M, reason: not valid java name */
    private final float m212pullBottomk4lQ0M(long scroll) {
        float m3599getXimpl = Offset.m3599getXimpl(m219displacementF1C5BW0$foundation_release());
        float m3600getYimpl = Offset.m3600getYimpl(scroll) / Size.m3665getHeightimpl(this.containerSize);
        EdgeEffect orCreateBottomEffect = this.edgeEffectWrapper.getOrCreateBottomEffect();
        return EdgeEffectCompat.INSTANCE.getDistanceCompat(orCreateBottomEffect) == 0.0f ? (-EdgeEffectCompat.INSTANCE.onPullDistanceCompat(orCreateBottomEffect, -m3600getYimpl, 1 - m3599getXimpl)) * Size.m3665getHeightimpl(this.containerSize) : Offset.m3600getYimpl(scroll);
    }

    /* renamed from: pullLeft-k-4lQ0M, reason: not valid java name */
    private final float m213pullLeftk4lQ0M(long scroll) {
        float m3600getYimpl = Offset.m3600getYimpl(m219displacementF1C5BW0$foundation_release());
        float m3599getXimpl = Offset.m3599getXimpl(scroll) / Size.m3668getWidthimpl(this.containerSize);
        EdgeEffect orCreateLeftEffect = this.edgeEffectWrapper.getOrCreateLeftEffect();
        return EdgeEffectCompat.INSTANCE.getDistanceCompat(orCreateLeftEffect) == 0.0f ? EdgeEffectCompat.INSTANCE.onPullDistanceCompat(orCreateLeftEffect, m3599getXimpl, 1 - m3600getYimpl) * Size.m3668getWidthimpl(this.containerSize) : Offset.m3599getXimpl(scroll);
    }

    /* renamed from: pullRight-k-4lQ0M, reason: not valid java name */
    private final float m214pullRightk4lQ0M(long scroll) {
        float m3600getYimpl = Offset.m3600getYimpl(m219displacementF1C5BW0$foundation_release());
        float m3599getXimpl = Offset.m3599getXimpl(scroll) / Size.m3668getWidthimpl(this.containerSize);
        EdgeEffect orCreateRightEffect = this.edgeEffectWrapper.getOrCreateRightEffect();
        return EdgeEffectCompat.INSTANCE.getDistanceCompat(orCreateRightEffect) == 0.0f ? (-EdgeEffectCompat.INSTANCE.onPullDistanceCompat(orCreateRightEffect, -m3599getXimpl, m3600getYimpl)) * Size.m3668getWidthimpl(this.containerSize) : Offset.m3599getXimpl(scroll);
    }
}
