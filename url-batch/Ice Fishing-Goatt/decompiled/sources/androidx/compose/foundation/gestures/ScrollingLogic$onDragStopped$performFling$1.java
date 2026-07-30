package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: Scrollable.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/Velocity;", "velocity"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1", f = "Scrollable.kt", i = {0, 1, 1, 2, 2}, l = {745, 748, 751}, m = "invokeSuspend", n = {"velocity", "velocity", "available", "velocity", "velocityLeft"}, s = {"J$0", "J$0", "J$1", "J$0", "J$1"})
/* loaded from: classes.dex */
final class ScrollingLogic$onDragStopped$performFling$1 extends SuspendLambda implements Function2<Velocity, Continuation<? super Velocity>, Object> {
    /* synthetic */ long J$0;
    long J$1;
    int label;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollingLogic$onDragStopped$performFling$1(ScrollingLogic scrollingLogic, Continuation<? super ScrollingLogic$onDragStopped$performFling$1> continuation) {
        super(2, continuation);
        this.this$0 = scrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ScrollingLogic$onDragStopped$performFling$1 scrollingLogic$onDragStopped$performFling$1 = new ScrollingLogic$onDragStopped$performFling$1(this.this$0, continuation);
        scrollingLogic$onDragStopped$performFling$1.J$0 = ((Velocity) obj).getPackedValue();
        return scrollingLogic$onDragStopped$performFling$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Velocity velocity, Continuation<? super Velocity> continuation) {
        return m492invokesFctU(velocity.getPackedValue(), continuation);
    }

    /* renamed from: invoke-sF-c-tU, reason: not valid java name */
    public final Object m492invokesFctU(long j, Continuation<? super Velocity> continuation) {
        return ((ScrollingLogic$onDragStopped$performFling$1) create(Velocity.m6493boximpl(j), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        if (r2 == r1) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        NestedScrollDispatcher nestedScrollDispatcher;
        Object m4901dispatchPreFlingQWom1Mo;
        long j;
        long m6505minusAH228Gc;
        Object m485doFlingAnimationQWom1Mo;
        NestedScrollDispatcher nestedScrollDispatcher2;
        Object m4899dispatchPostFlingRZ2iAVY;
        long j2;
        long j3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long j4 = this.J$0;
            nestedScrollDispatcher = this.this$0.nestedScrollDispatcher;
            this.J$0 = j4;
            this.label = 1;
            m4901dispatchPreFlingQWom1Mo = nestedScrollDispatcher.m4901dispatchPreFlingQWom1Mo(j4, this);
            if (m4901dispatchPreFlingQWom1Mo != coroutine_suspended) {
                j = j4;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j3 = this.J$1;
                j2 = this.J$0;
                ResultKt.throwOnFailure(obj);
                m4899dispatchPostFlingRZ2iAVY = obj;
                return Velocity.m6493boximpl(Velocity.m6505minusAH228Gc(j2, Velocity.m6505minusAH228Gc(j3, ((Velocity) m4899dispatchPostFlingRZ2iAVY).getPackedValue())));
            }
            long j5 = this.J$1;
            long j6 = this.J$0;
            ResultKt.throwOnFailure(obj);
            m6505minusAH228Gc = j5;
            j = j6;
            m485doFlingAnimationQWom1Mo = obj;
            long packedValue = ((Velocity) m485doFlingAnimationQWom1Mo).getPackedValue();
            nestedScrollDispatcher2 = this.this$0.nestedScrollDispatcher;
            this.J$0 = j;
            this.J$1 = packedValue;
            this.label = 3;
            m4899dispatchPostFlingRZ2iAVY = nestedScrollDispatcher2.m4899dispatchPostFlingRZ2iAVY(Velocity.m6505minusAH228Gc(m6505minusAH228Gc, packedValue), packedValue, this);
            if (m4899dispatchPostFlingRZ2iAVY != coroutine_suspended) {
                j2 = j;
                j3 = packedValue;
                return Velocity.m6493boximpl(Velocity.m6505minusAH228Gc(j2, Velocity.m6505minusAH228Gc(j3, ((Velocity) m4899dispatchPostFlingRZ2iAVY).getPackedValue())));
            }
            return coroutine_suspended;
        }
        j = this.J$0;
        ResultKt.throwOnFailure(obj);
        m4901dispatchPreFlingQWom1Mo = obj;
        m6505minusAH228Gc = Velocity.m6505minusAH228Gc(j, ((Velocity) m4901dispatchPreFlingQWom1Mo).getPackedValue());
        this.J$0 = j;
        this.J$1 = m6505minusAH228Gc;
        this.label = 2;
        m485doFlingAnimationQWom1Mo = this.this$0.m485doFlingAnimationQWom1Mo(m6505minusAH228Gc, this);
    }
}
