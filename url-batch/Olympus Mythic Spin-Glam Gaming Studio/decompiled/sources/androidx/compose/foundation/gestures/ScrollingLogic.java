package androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import com.ironsource.X3;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$LongRef;

/* compiled from: Scrollable.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u001a\b\u0002\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0015\u001a\u00020\u0012*\u00020\u0011ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u0016*\u00020\u0011ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0017\u0010\u0014J\u0017\u0010\u001b\u001a\u00020\u0011*\u00020\u0012ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u0011*\u00020\u0016ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ\u001f\u0010 \u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u0011ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010!\u001a\u00020\u0011*\u00020\u0011¢\u0006\u0004\b!\u0010\"J\u0017\u0010!\u001a\u00020\u0012*\u00020\u0012ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b#\u0010$J1\u0010,\u001a\u00020\u0012*\u00020%2\u0006\u0010&\u001a\u00020\u00122\b\u0010'\u001a\u0004\u0018\u00010\u00122\u0006\u0010)\u001a\u00020(ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b*\u0010+J\u001b\u0010/\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u0012ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b.\u0010$J\u001b\u00102\u001a\u0002012\u0006\u00100\u001a\u00020\u0011H\u0086@ø\u0001\u0000¢\u0006\u0004\b2\u00103J!\u00107\u001a\u00020\u00162\u0006\u00104\u001a\u00020\u0016H\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b5\u00106J\r\u00108\u001a\u00020\u0004¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b>\u00109R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010E\u001a\u0004\bF\u0010GR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010H\u001a\u0004\bI\u0010J\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006K"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollingLogic;", "", "Landroidx/compose/foundation/gestures/Orientation;", X3.i.n, "", "reverseDirection", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "nestedScrollDispatcher", "Landroidx/compose/foundation/gestures/ScrollableState;", "scrollableState", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "<init>", "(Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/runtime/State;Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/OverscrollEffect;)V", "", "Landroidx/compose/ui/geometry/Offset;", "toOffset-tuRUvjQ", "(F)J", "toOffset", "Landroidx/compose/ui/unit/Velocity;", "toVelocity-adjELrA", "toVelocity", "toFloat-k-4lQ0M", "(J)F", "toFloat", "toFloat-TH1AsA0", "newValue", "update-QWom1Mo", "(JF)J", "update", "reverseIfNeeded", "(F)F", "reverseIfNeeded-MK-Hz9U", "(J)J", "Landroidx/compose/foundation/gestures/ScrollScope;", "scrollDelta", "pointerPosition", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "dispatchScroll-f0eR0lY", "(Landroidx/compose/foundation/gestures/ScrollScope;JLandroidx/compose/ui/geometry/Offset;I)J", "dispatchScroll", "scroll", "performRawScroll-MK-Hz9U", "performRawScroll", "axisVelocity", "", "onDragStopped", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "available", "doFlingAnimation-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doFlingAnimation", "shouldScrollImmediately", "()Z", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "Z", "getReverseDirection", "Landroidx/compose/runtime/State;", "getNestedScrollDispatcher", "()Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/gestures/ScrollableState;", "getScrollableState", "()Landroidx/compose/foundation/gestures/ScrollableState;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "getFlingBehavior", "()Landroidx/compose/foundation/gestures/FlingBehavior;", "Landroidx/compose/foundation/OverscrollEffect;", "getOverscrollEffect", "()Landroidx/compose/foundation/OverscrollEffect;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes15.dex */
final class ScrollingLogic {
    private final FlingBehavior flingBehavior;
    private final State nestedScrollDispatcher;
    private final Orientation orientation;
    private final OverscrollEffect overscrollEffect;
    private final boolean reverseDirection;
    private final ScrollableState scrollableState;

    public ScrollingLogic(Orientation orientation, boolean z, State nestedScrollDispatcher, ScrollableState scrollableState, FlingBehavior flingBehavior, OverscrollEffect overscrollEffect) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(nestedScrollDispatcher, "nestedScrollDispatcher");
        Intrinsics.checkNotNullParameter(scrollableState, "scrollableState");
        Intrinsics.checkNotNullParameter(flingBehavior, "flingBehavior");
        this.orientation = orientation;
        this.reverseDirection = z;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        this.scrollableState = scrollableState;
        this.flingBehavior = flingBehavior;
        this.overscrollEffect = overscrollEffect;
    }

    public final ScrollableState getScrollableState() {
        return this.scrollableState;
    }

    public final FlingBehavior getFlingBehavior() {
        return this.flingBehavior;
    }

    /* renamed from: toOffset-tuRUvjQ, reason: not valid java name */
    public final long m284toOffsettuRUvjQ(float f) {
        if (f == 0.0f) {
            return Offset.INSTANCE.m1308getZeroF1C5BW0();
        }
        return this.orientation == Orientation.Horizontal ? OffsetKt.Offset(f, 0.0f) : OffsetKt.Offset(0.0f, f);
    }

    /* renamed from: toVelocity-adjELrA, reason: not valid java name */
    public final long m285toVelocityadjELrA(float f) {
        return this.orientation == Orientation.Horizontal ? VelocityKt.Velocity(f, 0.0f) : VelocityKt.Velocity(0.0f, f);
    }

    /* renamed from: toFloat-k-4lQ0M, reason: not valid java name */
    public final float m283toFloatk4lQ0M(long j) {
        return this.orientation == Orientation.Horizontal ? Offset.m1297getXimpl(j) : Offset.m1298getYimpl(j);
    }

    /* renamed from: toFloat-TH1AsA0, reason: not valid java name */
    public final float m282toFloatTH1AsA0(long j) {
        return this.orientation == Orientation.Horizontal ? Velocity.m2605getXimpl(j) : Velocity.m2606getYimpl(j);
    }

    /* renamed from: update-QWom1Mo, reason: not valid java name */
    public final long m286updateQWom1Mo(long j, float f) {
        return this.orientation == Orientation.Horizontal ? Velocity.m2602copyOhffZ5M$default(j, f, 0.0f, 2, null) : Velocity.m2602copyOhffZ5M$default(j, 0.0f, f, 1, null);
    }

    public final float reverseIfNeeded(float f) {
        return this.reverseDirection ? f * (-1) : f;
    }

    /* renamed from: reverseIfNeeded-MK-Hz9U, reason: not valid java name */
    public final long m281reverseIfNeededMKHz9U(long j) {
        return this.reverseDirection ? Offset.m1303timestuRUvjQ(j, -1.0f) : j;
    }

    /* renamed from: dispatchScroll-f0eR0lY, reason: not valid java name */
    public final long m278dispatchScrollf0eR0lY(ScrollScope dispatchScroll, long j, Offset offset, int i) {
        long m1308getZeroF1C5BW0;
        Intrinsics.checkNotNullParameter(dispatchScroll, "$this$dispatchScroll");
        OverscrollEffect overscrollEffect = this.overscrollEffect;
        if (overscrollEffect != null && overscrollEffect.isEnabled()) {
            m1308getZeroF1C5BW0 = this.overscrollEffect.mo153consumePreScrollA0NYTsA(j, offset, i);
        } else {
            m1308getZeroF1C5BW0 = Offset.INSTANCE.m1308getZeroF1C5BW0();
        }
        long m1301minusMKHz9U = Offset.m1301minusMKHz9U(j, m1308getZeroF1C5BW0);
        NestedScrollDispatcher nestedScrollDispatcher = (NestedScrollDispatcher) this.nestedScrollDispatcher.getValue();
        long m1301minusMKHz9U2 = Offset.m1301minusMKHz9U(m1301minusMKHz9U, nestedScrollDispatcher.m1824dispatchPreScrollOzD1aCk(m1301minusMKHz9U, i));
        long m281reverseIfNeededMKHz9U = m281reverseIfNeededMKHz9U(m284toOffsettuRUvjQ(dispatchScroll.scrollBy(m283toFloatk4lQ0M(m281reverseIfNeededMKHz9U(m1301minusMKHz9U2)))));
        long m1301minusMKHz9U3 = Offset.m1301minusMKHz9U(m1301minusMKHz9U2, m281reverseIfNeededMKHz9U);
        long m1822dispatchPostScrollDzOQY0M = nestedScrollDispatcher.m1822dispatchPostScrollDzOQY0M(m281reverseIfNeededMKHz9U, m1301minusMKHz9U3, i);
        OverscrollEffect overscrollEffect2 = this.overscrollEffect;
        if (overscrollEffect2 != null && overscrollEffect2.isEnabled()) {
            this.overscrollEffect.mo151consumePostScrolll7mfB5k(m1301minusMKHz9U2, Offset.m1301minusMKHz9U(m1301minusMKHz9U3, m1822dispatchPostScrollDzOQY0M), offset, i);
        }
        return m1301minusMKHz9U3;
    }

    /* renamed from: performRawScroll-MK-Hz9U, reason: not valid java name */
    public final long m280performRawScrollMKHz9U(long scroll) {
        if (this.scrollableState.isScrollInProgress()) {
            return Offset.INSTANCE.m1308getZeroF1C5BW0();
        }
        return m284toOffsettuRUvjQ(reverseIfNeeded(this.scrollableState.dispatchRawDelta(reverseIfNeeded(m283toFloatk4lQ0M(scroll)))));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onDragStopped(float f, Continuation continuation) {
        ScrollingLogic$onDragStopped$1 scrollingLogic$onDragStopped$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        float f2;
        float f3;
        ScrollingLogic scrollingLogic;
        ScrollingLogic scrollingLogic2;
        ScrollingLogic scrollingLogic3;
        long j;
        long j2;
        long j3;
        OverscrollEffect overscrollEffect;
        if (continuation instanceof ScrollingLogic$onDragStopped$1) {
            scrollingLogic$onDragStopped$1 = (ScrollingLogic$onDragStopped$1) continuation;
            int i2 = scrollingLogic$onDragStopped$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scrollingLogic$onDragStopped$1.label = i2 - Integer.MIN_VALUE;
                obj = scrollingLogic$onDragStopped$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = scrollingLogic$onDragStopped$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    OverscrollEffect overscrollEffect2 = this.overscrollEffect;
                    if (overscrollEffect2 != null && overscrollEffect2.isEnabled()) {
                        OverscrollEffect overscrollEffect3 = this.overscrollEffect;
                        long m285toVelocityadjELrA = m285toVelocityadjELrA(f);
                        scrollingLogic$onDragStopped$1.L$0 = this;
                        scrollingLogic$onDragStopped$1.L$1 = this;
                        scrollingLogic$onDragStopped$1.F$0 = f;
                        scrollingLogic$onDragStopped$1.label = 1;
                        obj = overscrollEffect3.mo152consumePreFlingQWom1Mo(m285toVelocityadjELrA, scrollingLogic$onDragStopped$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        scrollingLogic2 = this;
                        scrollingLogic3 = scrollingLogic2;
                    } else {
                        f2 = 0.0f;
                        f3 = f;
                        scrollingLogic = this;
                        long m285toVelocityadjELrA2 = scrollingLogic.m285toVelocityadjELrA(f3 - f2);
                        NestedScrollDispatcher nestedScrollDispatcher = (NestedScrollDispatcher) scrollingLogic.nestedScrollDispatcher.getValue();
                        scrollingLogic$onDragStopped$1.L$0 = scrollingLogic;
                        scrollingLogic$onDragStopped$1.L$1 = null;
                        scrollingLogic$onDragStopped$1.J$0 = m285toVelocityadjELrA2;
                        scrollingLogic$onDragStopped$1.label = 2;
                        obj = nestedScrollDispatcher.m1823dispatchPreFlingQWom1Mo(m285toVelocityadjELrA2, scrollingLogic$onDragStopped$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        j = m285toVelocityadjELrA2;
                        long m2608minusAH228Gc = Velocity.m2608minusAH228Gc(j, ((Velocity) obj).getPackedValue());
                        scrollingLogic$onDragStopped$1.L$0 = scrollingLogic;
                        scrollingLogic$onDragStopped$1.J$0 = m2608minusAH228Gc;
                        scrollingLogic$onDragStopped$1.label = 3;
                        obj = scrollingLogic.m279doFlingAnimationQWom1Mo(m2608minusAH228Gc, scrollingLogic$onDragStopped$1);
                        if (obj != coroutine_suspended) {
                        }
                    }
                } else if (i == 1) {
                    f = scrollingLogic$onDragStopped$1.F$0;
                    scrollingLogic2 = (ScrollingLogic) scrollingLogic$onDragStopped$1.L$1;
                    scrollingLogic3 = (ScrollingLogic) scrollingLogic$onDragStopped$1.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            j2 = scrollingLogic$onDragStopped$1.J$0;
                            scrollingLogic = (ScrollingLogic) scrollingLogic$onDragStopped$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            long packedValue = ((Velocity) obj).getPackedValue();
                            NestedScrollDispatcher nestedScrollDispatcher2 = (NestedScrollDispatcher) scrollingLogic.nestedScrollDispatcher.getValue();
                            long m2608minusAH228Gc2 = Velocity.m2608minusAH228Gc(j2, packedValue);
                            scrollingLogic$onDragStopped$1.L$0 = scrollingLogic;
                            scrollingLogic$onDragStopped$1.J$0 = packedValue;
                            scrollingLogic$onDragStopped$1.label = 4;
                            obj = nestedScrollDispatcher2.m1821dispatchPostFlingRZ2iAVY(m2608minusAH228Gc2, packedValue, scrollingLogic$onDragStopped$1);
                            if (obj != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            j3 = packedValue;
                            long m2608minusAH228Gc3 = Velocity.m2608minusAH228Gc(j3, ((Velocity) obj).getPackedValue());
                            overscrollEffect = scrollingLogic.overscrollEffect;
                            if (overscrollEffect != null) {
                            }
                            return Unit.INSTANCE;
                        }
                        if (i != 4) {
                            if (i == 5) {
                                ResultKt.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j3 = scrollingLogic$onDragStopped$1.J$0;
                        scrollingLogic = (ScrollingLogic) scrollingLogic$onDragStopped$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        long m2608minusAH228Gc32 = Velocity.m2608minusAH228Gc(j3, ((Velocity) obj).getPackedValue());
                        overscrollEffect = scrollingLogic.overscrollEffect;
                        if (overscrollEffect != null || !overscrollEffect.isEnabled()) {
                            return Unit.INSTANCE;
                        }
                        OverscrollEffect overscrollEffect4 = scrollingLogic.overscrollEffect;
                        long m285toVelocityadjELrA3 = scrollingLogic.m285toVelocityadjELrA(scrollingLogic.m282toFloatTH1AsA0(m2608minusAH228Gc32));
                        scrollingLogic$onDragStopped$1.L$0 = null;
                        scrollingLogic$onDragStopped$1.label = 5;
                        if (overscrollEffect4.mo150consumePostFlingsFctU(m285toVelocityadjELrA3, scrollingLogic$onDragStopped$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    j = scrollingLogic$onDragStopped$1.J$0;
                    scrollingLogic = (ScrollingLogic) scrollingLogic$onDragStopped$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    long m2608minusAH228Gc4 = Velocity.m2608minusAH228Gc(j, ((Velocity) obj).getPackedValue());
                    scrollingLogic$onDragStopped$1.L$0 = scrollingLogic;
                    scrollingLogic$onDragStopped$1.J$0 = m2608minusAH228Gc4;
                    scrollingLogic$onDragStopped$1.label = 3;
                    obj = scrollingLogic.m279doFlingAnimationQWom1Mo(m2608minusAH228Gc4, scrollingLogic$onDragStopped$1);
                    if (obj != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    j2 = m2608minusAH228Gc4;
                    long packedValue2 = ((Velocity) obj).getPackedValue();
                    NestedScrollDispatcher nestedScrollDispatcher22 = (NestedScrollDispatcher) scrollingLogic.nestedScrollDispatcher.getValue();
                    long m2608minusAH228Gc22 = Velocity.m2608minusAH228Gc(j2, packedValue2);
                    scrollingLogic$onDragStopped$1.L$0 = scrollingLogic;
                    scrollingLogic$onDragStopped$1.J$0 = packedValue2;
                    scrollingLogic$onDragStopped$1.label = 4;
                    obj = nestedScrollDispatcher22.m1821dispatchPostFlingRZ2iAVY(m2608minusAH228Gc22, packedValue2, scrollingLogic$onDragStopped$1);
                    if (obj != coroutine_suspended) {
                    }
                }
                f2 = scrollingLogic2.m282toFloatTH1AsA0(((Velocity) obj).getPackedValue());
                f3 = f;
                scrollingLogic = scrollingLogic3;
                long m285toVelocityadjELrA22 = scrollingLogic.m285toVelocityadjELrA(f3 - f2);
                NestedScrollDispatcher nestedScrollDispatcher3 = (NestedScrollDispatcher) scrollingLogic.nestedScrollDispatcher.getValue();
                scrollingLogic$onDragStopped$1.L$0 = scrollingLogic;
                scrollingLogic$onDragStopped$1.L$1 = null;
                scrollingLogic$onDragStopped$1.J$0 = m285toVelocityadjELrA22;
                scrollingLogic$onDragStopped$1.label = 2;
                obj = nestedScrollDispatcher3.m1823dispatchPreFlingQWom1Mo(m285toVelocityadjELrA22, scrollingLogic$onDragStopped$1);
                if (obj == coroutine_suspended) {
                }
            }
        }
        scrollingLogic$onDragStopped$1 = new ScrollingLogic$onDragStopped$1(this, continuation);
        obj = scrollingLogic$onDragStopped$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = scrollingLogic$onDragStopped$1.label;
        if (i != 0) {
        }
        f2 = scrollingLogic2.m282toFloatTH1AsA0(((Velocity) obj).getPackedValue());
        f3 = f;
        scrollingLogic = scrollingLogic3;
        long m285toVelocityadjELrA222 = scrollingLogic.m285toVelocityadjELrA(f3 - f2);
        NestedScrollDispatcher nestedScrollDispatcher32 = (NestedScrollDispatcher) scrollingLogic.nestedScrollDispatcher.getValue();
        scrollingLogic$onDragStopped$1.L$0 = scrollingLogic;
        scrollingLogic$onDragStopped$1.L$1 = null;
        scrollingLogic$onDragStopped$1.J$0 = m285toVelocityadjELrA222;
        scrollingLogic$onDragStopped$1.label = 2;
        obj = nestedScrollDispatcher32.m1823dispatchPreFlingQWom1Mo(m285toVelocityadjELrA222, scrollingLogic$onDragStopped$1);
        if (obj == coroutine_suspended) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* renamed from: doFlingAnimation-QWom1Mo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m279doFlingAnimationQWom1Mo(long j, Continuation continuation) {
        ScrollingLogic$doFlingAnimation$1 scrollingLogic$doFlingAnimation$1;
        int i;
        Ref$LongRef ref$LongRef;
        if (continuation instanceof ScrollingLogic$doFlingAnimation$1) {
            scrollingLogic$doFlingAnimation$1 = (ScrollingLogic$doFlingAnimation$1) continuation;
            int i2 = scrollingLogic$doFlingAnimation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scrollingLogic$doFlingAnimation$1.label = i2 - Integer.MIN_VALUE;
                ScrollingLogic$doFlingAnimation$1 scrollingLogic$doFlingAnimation$12 = scrollingLogic$doFlingAnimation$1;
                Object obj = scrollingLogic$doFlingAnimation$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = scrollingLogic$doFlingAnimation$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref$LongRef ref$LongRef2 = new Ref$LongRef();
                    ref$LongRef2.element = j;
                    ScrollableState scrollableState = this.scrollableState;
                    ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this, ref$LongRef2, j, null);
                    scrollingLogic$doFlingAnimation$12.L$0 = ref$LongRef2;
                    scrollingLogic$doFlingAnimation$12.label = 1;
                    if (ScrollableState.scroll$default(scrollableState, null, scrollingLogic$doFlingAnimation$2, scrollingLogic$doFlingAnimation$12, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ref$LongRef = ref$LongRef2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$LongRef = (Ref$LongRef) scrollingLogic$doFlingAnimation$12.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return Velocity.m2599boximpl(ref$LongRef.element);
            }
        }
        scrollingLogic$doFlingAnimation$1 = new ScrollingLogic$doFlingAnimation$1(this, continuation);
        ScrollingLogic$doFlingAnimation$1 scrollingLogic$doFlingAnimation$122 = scrollingLogic$doFlingAnimation$1;
        Object obj2 = scrollingLogic$doFlingAnimation$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = scrollingLogic$doFlingAnimation$122.label;
        if (i != 0) {
        }
        return Velocity.m2599boximpl(ref$LongRef.element);
    }

    public final boolean shouldScrollImmediately() {
        if (!this.scrollableState.isScrollInProgress()) {
            OverscrollEffect overscrollEffect = this.overscrollEffect;
            if (!(overscrollEffect != null ? overscrollEffect.isInProgress() : false)) {
                return false;
            }
        }
        return true;
    }
}
