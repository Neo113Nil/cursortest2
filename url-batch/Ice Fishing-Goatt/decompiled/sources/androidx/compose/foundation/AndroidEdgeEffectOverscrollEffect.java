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
        EdgeEffectWrapper edgeEffectWrapper = new EdgeEffectWrapper(context, ColorKt.m3877toArgb8_81llA(overscrollConfiguration.getGlowColor()));
        this.edgeEffectWrapper = edgeEffectWrapper;
        this.redrawSignal = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
        this.invalidationEnabled = true;
        this.containerSize = Size.INSTANCE.m3660getZeroNHjbRc();
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
    public long mo210applyToScrollRhakbz0(long delta, int source, Function1<? super Offset, Offset> performScroll) {
        float m204pullBottomk4lQ0M;
        long Offset;
        boolean z;
        boolean z2;
        if (Size.m3653isEmptyimpl(this.containerSize)) {
            return performScroll.invoke(Offset.m3571boximpl(delta)).getPackedValue();
        }
        boolean z3 = true;
        if (!this.scrollCycleInProgress) {
            stopOverscrollAnimation();
            this.scrollCycleInProgress = true;
        }
        float f = 0.0f;
        if (Offset.m3583getYimpl(delta) != 0.0f) {
            if (this.edgeEffectWrapper.isTopStretched()) {
                m204pullBottomk4lQ0M = m207pullTopk4lQ0M(delta);
                if (!this.edgeEffectWrapper.isTopStretched()) {
                    this.edgeEffectWrapper.getOrCreateTopEffect().onRelease();
                }
            } else if (this.edgeEffectWrapper.isBottomStretched()) {
                m204pullBottomk4lQ0M = m204pullBottomk4lQ0M(delta);
                if (!this.edgeEffectWrapper.isBottomStretched()) {
                    this.edgeEffectWrapper.getOrCreateBottomEffect().onRelease();
                }
            }
            if (Offset.m3582getXimpl(delta) != 0.0f) {
                if (this.edgeEffectWrapper.isLeftStretched()) {
                    f = m205pullLeftk4lQ0M(delta);
                    if (!this.edgeEffectWrapper.isLeftStretched()) {
                        this.edgeEffectWrapper.getOrCreateLeftEffect().onRelease();
                    }
                } else if (this.edgeEffectWrapper.isRightStretched()) {
                    f = m206pullRightk4lQ0M(delta);
                    if (!this.edgeEffectWrapper.isRightStretched()) {
                        this.edgeEffectWrapper.getOrCreateRightEffect().onRelease();
                    }
                }
            }
            Offset = OffsetKt.Offset(f, m204pullBottomk4lQ0M);
            if (!Offset.m3579equalsimpl0(Offset, Offset.INSTANCE.m3598getZeroF1C5BW0())) {
                invalidateOverscroll$foundation_release();
            }
            long m3586minusMKHz9U = Offset.m3586minusMKHz9U(delta, Offset);
            long packedValue = performScroll.invoke(Offset.m3571boximpl(m3586minusMKHz9U)).getPackedValue();
            long m3586minusMKHz9U2 = Offset.m3586minusMKHz9U(m3586minusMKHz9U, packedValue);
            boolean z4 = false;
            if (NestedScrollSource.m4906equalsimpl0(source, NestedScrollSource.INSTANCE.m4918getUserInputWNlRxjI())) {
                if (Offset.m3582getXimpl(m3586minusMKHz9U2) > 0.5f) {
                    m205pullLeftk4lQ0M(m3586minusMKHz9U2);
                } else if (Offset.m3582getXimpl(m3586minusMKHz9U2) < -0.5f) {
                    m206pullRightk4lQ0M(m3586minusMKHz9U2);
                } else {
                    z = false;
                    if (Offset.m3583getYimpl(m3586minusMKHz9U2) <= 0.5f) {
                        m207pullTopk4lQ0M(m3586minusMKHz9U2);
                    } else if (Offset.m3583getYimpl(m3586minusMKHz9U2) < -0.5f) {
                        m204pullBottomk4lQ0M(m3586minusMKHz9U2);
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
                if (Offset.m3583getYimpl(m3586minusMKHz9U2) <= 0.5f) {
                }
                z2 = true;
                if (!z) {
                }
                z4 = z3;
            }
            if (!m208releaseOppositeOverscrollk4lQ0M(delta) || z4) {
                invalidateOverscroll$foundation_release();
            }
            return Offset.m3587plusMKHz9U(Offset, packedValue);
        }
        m204pullBottomk4lQ0M = 0.0f;
        if (Offset.m3582getXimpl(delta) != 0.0f) {
        }
        Offset = OffsetKt.Offset(f, m204pullBottomk4lQ0M);
        if (!Offset.m3579equalsimpl0(Offset, Offset.INSTANCE.m3598getZeroF1C5BW0())) {
        }
        long m3586minusMKHz9U3 = Offset.m3586minusMKHz9U(delta, Offset);
        long packedValue2 = performScroll.invoke(Offset.m3571boximpl(m3586minusMKHz9U3)).getPackedValue();
        long m3586minusMKHz9U22 = Offset.m3586minusMKHz9U(m3586minusMKHz9U3, packedValue2);
        boolean z42 = false;
        if (NestedScrollSource.m4906equalsimpl0(source, NestedScrollSource.INSTANCE.m4918getUserInputWNlRxjI())) {
        }
        if (!m208releaseOppositeOverscrollk4lQ0M(delta)) {
        }
        invalidateOverscroll$foundation_release();
        return Offset.m3587plusMKHz9U(Offset, packedValue2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x005c, code lost:
    
        if (r16.invoke(r0, r3) == r4) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: applyToFling-BMRW4eQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo209applyToFlingBMRW4eQ(long j, Function2<? super Velocity, ? super Continuation<? super Velocity>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        AndroidEdgeEffectOverscrollEffect$applyToFling$1 androidEdgeEffectOverscrollEffect$applyToFling$1;
        int i;
        float f;
        float f2;
        long m6505minusAH228Gc;
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect;
        long m6505minusAH228Gc2;
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
                    long j2 = androidEdgeEffectOverscrollEffect$applyToFling$1.J$0;
                    AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect2 = (AndroidEdgeEffectOverscrollEffect) androidEdgeEffectOverscrollEffect$applyToFling$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    m6505minusAH228Gc = j2;
                    androidEdgeEffectOverscrollEffect = androidEdgeEffectOverscrollEffect2;
                    m6505minusAH228Gc2 = Velocity.m6505minusAH228Gc(m6505minusAH228Gc, ((Velocity) obj).getPackedValue());
                    androidEdgeEffectOverscrollEffect.scrollCycleInProgress = false;
                    if (Velocity.m6502getXimpl(m6505minusAH228Gc2) <= 0.0f) {
                        EdgeEffectCompat.INSTANCE.onAbsorbCompat(androidEdgeEffectOverscrollEffect.edgeEffectWrapper.getOrCreateLeftEffect(), MathKt.roundToInt(Velocity.m6502getXimpl(m6505minusAH228Gc2)));
                    } else if (Velocity.m6502getXimpl(m6505minusAH228Gc2) < 0.0f) {
                        EdgeEffectCompat.INSTANCE.onAbsorbCompat(androidEdgeEffectOverscrollEffect.edgeEffectWrapper.getOrCreateRightEffect(), -MathKt.roundToInt(Velocity.m6502getXimpl(m6505minusAH228Gc2)));
                    }
                    if (Velocity.m6503getYimpl(m6505minusAH228Gc2) <= 0.0f) {
                        EdgeEffectCompat.INSTANCE.onAbsorbCompat(androidEdgeEffectOverscrollEffect.edgeEffectWrapper.getOrCreateTopEffect(), MathKt.roundToInt(Velocity.m6503getYimpl(m6505minusAH228Gc2)));
                    } else if (Velocity.m6503getYimpl(m6505minusAH228Gc2) < 0.0f) {
                        EdgeEffectCompat.INSTANCE.onAbsorbCompat(androidEdgeEffectOverscrollEffect.edgeEffectWrapper.getOrCreateBottomEffect(), -MathKt.roundToInt(Velocity.m6503getYimpl(m6505minusAH228Gc2)));
                    }
                    if (!Velocity.m6501equalsimpl0(m6505minusAH228Gc2, Velocity.INSTANCE.m6513getZero9UxMQ8M())) {
                        androidEdgeEffectOverscrollEffect.invalidateOverscroll$foundation_release();
                    }
                    androidEdgeEffectOverscrollEffect.animateToRelease();
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                if (Size.m3653isEmptyimpl(this.containerSize)) {
                    Velocity m6493boximpl = Velocity.m6493boximpl(j);
                    androidEdgeEffectOverscrollEffect$applyToFling$1.label = 1;
                } else {
                    if (Velocity.m6502getXimpl(j) > 0.0f && this.edgeEffectWrapper.isLeftStretched()) {
                        EdgeEffectCompat.INSTANCE.onAbsorbCompat(this.edgeEffectWrapper.getOrCreateLeftEffect(), MathKt.roundToInt(Velocity.m6502getXimpl(j)));
                        f = Velocity.m6502getXimpl(j);
                    } else if (Velocity.m6502getXimpl(j) >= 0.0f || !this.edgeEffectWrapper.isRightStretched()) {
                        f = 0.0f;
                    } else {
                        EdgeEffectCompat.INSTANCE.onAbsorbCompat(this.edgeEffectWrapper.getOrCreateRightEffect(), -MathKt.roundToInt(Velocity.m6502getXimpl(j)));
                        f = Velocity.m6502getXimpl(j);
                    }
                    if (Velocity.m6503getYimpl(j) > 0.0f && this.edgeEffectWrapper.isTopStretched()) {
                        EdgeEffectCompat.INSTANCE.onAbsorbCompat(this.edgeEffectWrapper.getOrCreateTopEffect(), MathKt.roundToInt(Velocity.m6503getYimpl(j)));
                        f2 = Velocity.m6503getYimpl(j);
                    } else if (Velocity.m6503getYimpl(j) >= 0.0f || !this.edgeEffectWrapper.isBottomStretched()) {
                        f2 = 0.0f;
                    } else {
                        EdgeEffectCompat.INSTANCE.onAbsorbCompat(this.edgeEffectWrapper.getOrCreateBottomEffect(), -MathKt.roundToInt(Velocity.m6503getYimpl(j)));
                        f2 = Velocity.m6503getYimpl(j);
                    }
                    long Velocity = VelocityKt.Velocity(f, f2);
                    if (!Velocity.m6501equalsimpl0(Velocity, Velocity.INSTANCE.m6513getZero9UxMQ8M())) {
                        invalidateOverscroll$foundation_release();
                    }
                    m6505minusAH228Gc = Velocity.m6505minusAH228Gc(j, Velocity);
                    Velocity m6493boximpl2 = Velocity.m6493boximpl(m6505minusAH228Gc);
                    androidEdgeEffectOverscrollEffect$applyToFling$1.L$0 = this;
                    androidEdgeEffectOverscrollEffect$applyToFling$1.J$0 = m6505minusAH228Gc;
                    androidEdgeEffectOverscrollEffect$applyToFling$1.label = 2;
                    obj = function2.invoke(m6493boximpl2, androidEdgeEffectOverscrollEffect$applyToFling$1);
                    if (obj != coroutine_suspended) {
                        androidEdgeEffectOverscrollEffect = this;
                        m6505minusAH228Gc2 = Velocity.m6505minusAH228Gc(m6505minusAH228Gc, ((Velocity) obj).getPackedValue());
                        androidEdgeEffectOverscrollEffect.scrollCycleInProgress = false;
                        if (Velocity.m6502getXimpl(m6505minusAH228Gc2) <= 0.0f) {
                        }
                        if (Velocity.m6503getYimpl(m6505minusAH228Gc2) <= 0.0f) {
                        }
                        if (!Velocity.m6501equalsimpl0(m6505minusAH228Gc2, Velocity.INSTANCE.m6513getZero9UxMQ8M())) {
                        }
                        androidEdgeEffectOverscrollEffect.animateToRelease();
                        return Unit.INSTANCE;
                    }
                }
                return coroutine_suspended;
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
            m205pullLeftk4lQ0M(Offset.INSTANCE.m3598getZeroF1C5BW0());
            z = true;
        } else {
            z = false;
        }
        if (this.edgeEffectWrapper.isRightStretched()) {
            m206pullRightk4lQ0M(Offset.INSTANCE.m3598getZeroF1C5BW0());
            z = true;
        }
        if (this.edgeEffectWrapper.isTopStretched()) {
            m207pullTopk4lQ0M(Offset.INSTANCE.m3598getZeroF1C5BW0());
            z = true;
        }
        if (!this.edgeEffectWrapper.isBottomStretched()) {
            return z;
        }
        m204pullBottomk4lQ0M(Offset.INSTANCE.m3598getZeroF1C5BW0());
        return true;
    }

    /* renamed from: updateSize-uvyYCjk$foundation_release, reason: not valid java name */
    public final void m212updateSizeuvyYCjk$foundation_release(long size) {
        boolean m3647equalsimpl0 = Size.m3647equalsimpl0(this.containerSize, Size.INSTANCE.m3660getZeroNHjbRc());
        boolean m3647equalsimpl02 = Size.m3647equalsimpl0(size, this.containerSize);
        this.containerSize = size;
        if (!m3647equalsimpl02) {
            this.edgeEffectWrapper.m283setSizeozmzZPI(IntSizeKt.IntSize(MathKt.roundToInt(Size.m3651getWidthimpl(size)), MathKt.roundToInt(Size.m3648getHeightimpl(size))));
        }
        if (m3647equalsimpl0 || m3647equalsimpl02) {
            return;
        }
        invalidateOverscroll$foundation_release();
        animateToRelease();
    }

    /* renamed from: displacement-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m211displacementF1C5BW0$foundation_release() {
        Offset offset = this.pointerPosition;
        long packedValue = offset != null ? offset.getPackedValue() : SizeKt.m3661getCenteruvyYCjk(this.containerSize);
        return OffsetKt.Offset(Offset.m3582getXimpl(packedValue) / Size.m3651getWidthimpl(this.containerSize), Offset.m3583getYimpl(packedValue) / Size.m3648getHeightimpl(this.containerSize));
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
    private final boolean m208releaseOppositeOverscrollk4lQ0M(long delta) {
        boolean z;
        if (!this.edgeEffectWrapper.isLeftAnimating() || Offset.m3582getXimpl(delta) >= 0.0f) {
            z = false;
        } else {
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.edgeEffectWrapper.getOrCreateLeftEffect(), Offset.m3582getXimpl(delta));
            z = !this.edgeEffectWrapper.isLeftAnimating();
        }
        if (this.edgeEffectWrapper.isRightAnimating() && Offset.m3582getXimpl(delta) > 0.0f) {
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.edgeEffectWrapper.getOrCreateRightEffect(), Offset.m3582getXimpl(delta));
            z = z || !this.edgeEffectWrapper.isRightAnimating();
        }
        if (this.edgeEffectWrapper.isTopAnimating() && Offset.m3583getYimpl(delta) < 0.0f) {
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.edgeEffectWrapper.getOrCreateTopEffect(), Offset.m3583getYimpl(delta));
            z = z || !this.edgeEffectWrapper.isTopAnimating();
        }
        if (!this.edgeEffectWrapper.isBottomAnimating() || Offset.m3583getYimpl(delta) <= 0.0f) {
            return z;
        }
        EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.edgeEffectWrapper.getOrCreateBottomEffect(), Offset.m3583getYimpl(delta));
        return z || !this.edgeEffectWrapper.isBottomAnimating();
    }

    /* renamed from: pullTop-k-4lQ0M, reason: not valid java name */
    private final float m207pullTopk4lQ0M(long scroll) {
        float m3582getXimpl = Offset.m3582getXimpl(m211displacementF1C5BW0$foundation_release());
        float m3583getYimpl = Offset.m3583getYimpl(scroll) / Size.m3648getHeightimpl(this.containerSize);
        EdgeEffect orCreateTopEffect = this.edgeEffectWrapper.getOrCreateTopEffect();
        return EdgeEffectCompat.INSTANCE.getDistanceCompat(orCreateTopEffect) == 0.0f ? EdgeEffectCompat.INSTANCE.onPullDistanceCompat(orCreateTopEffect, m3583getYimpl, m3582getXimpl) * Size.m3648getHeightimpl(this.containerSize) : Offset.m3583getYimpl(scroll);
    }

    /* renamed from: pullBottom-k-4lQ0M, reason: not valid java name */
    private final float m204pullBottomk4lQ0M(long scroll) {
        float m3582getXimpl = Offset.m3582getXimpl(m211displacementF1C5BW0$foundation_release());
        float m3583getYimpl = Offset.m3583getYimpl(scroll) / Size.m3648getHeightimpl(this.containerSize);
        EdgeEffect orCreateBottomEffect = this.edgeEffectWrapper.getOrCreateBottomEffect();
        return EdgeEffectCompat.INSTANCE.getDistanceCompat(orCreateBottomEffect) == 0.0f ? (-EdgeEffectCompat.INSTANCE.onPullDistanceCompat(orCreateBottomEffect, -m3583getYimpl, 1.0f - m3582getXimpl)) * Size.m3648getHeightimpl(this.containerSize) : Offset.m3583getYimpl(scroll);
    }

    /* renamed from: pullLeft-k-4lQ0M, reason: not valid java name */
    private final float m205pullLeftk4lQ0M(long scroll) {
        float m3583getYimpl = Offset.m3583getYimpl(m211displacementF1C5BW0$foundation_release());
        float m3582getXimpl = Offset.m3582getXimpl(scroll) / Size.m3651getWidthimpl(this.containerSize);
        EdgeEffect orCreateLeftEffect = this.edgeEffectWrapper.getOrCreateLeftEffect();
        return EdgeEffectCompat.INSTANCE.getDistanceCompat(orCreateLeftEffect) == 0.0f ? EdgeEffectCompat.INSTANCE.onPullDistanceCompat(orCreateLeftEffect, m3582getXimpl, 1.0f - m3583getYimpl) * Size.m3651getWidthimpl(this.containerSize) : Offset.m3582getXimpl(scroll);
    }

    /* renamed from: pullRight-k-4lQ0M, reason: not valid java name */
    private final float m206pullRightk4lQ0M(long scroll) {
        float m3583getYimpl = Offset.m3583getYimpl(m211displacementF1C5BW0$foundation_release());
        float m3582getXimpl = Offset.m3582getXimpl(scroll) / Size.m3651getWidthimpl(this.containerSize);
        EdgeEffect orCreateRightEffect = this.edgeEffectWrapper.getOrCreateRightEffect();
        return EdgeEffectCompat.INSTANCE.getDistanceCompat(orCreateRightEffect) == 0.0f ? (-EdgeEffectCompat.INSTANCE.onPullDistanceCompat(orCreateRightEffect, -m3582getXimpl, m3583getYimpl)) * Size.m3651getWidthimpl(this.containerSize) : Offset.m3582getXimpl(scroll);
    }
}
