package androidx.compose.foundation.gestures;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* compiled from: Scrollable.kt */
@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"androidx/compose/foundation/gestures/ScrollableKt$scrollableNestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ScrollableKt$scrollableNestedScrollConnection$1 implements NestedScrollConnection {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ State $scrollLogic;

    ScrollableKt$scrollableNestedScrollConnection$1(boolean z, State state) {
        this.$enabled = z;
        this.$scrollLogic = state;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
    public long mo277onPostScrollDzOQY0M(long consumed, long available, int source) {
        if (this.$enabled) {
            return ((ScrollingLogic) this.$scrollLogic.getValue()).m280performRawScrollMKHz9U(available);
        }
        return Offset.INSTANCE.m1308getZeroF1C5BW0();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo276onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
        ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1;
        int i;
        long m2612getZero9UxMQ8M;
        if (continuation instanceof ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1) {
            scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 = (ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1) continuation;
            int i2 = scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.$enabled) {
                        ScrollingLogic scrollingLogic = (ScrollingLogic) this.$scrollLogic.getValue();
                        scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.J$0 = j2;
                        scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.label = 1;
                        obj = scrollingLogic.m279doFlingAnimationQWom1Mo(j2, scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        m2612getZero9UxMQ8M = Velocity.INSTANCE.m2612getZero9UxMQ8M();
                        return Velocity.m2599boximpl(m2612getZero9UxMQ8M);
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j2 = scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.J$0;
                    ResultKt.throwOnFailure(obj);
                }
                m2612getZero9UxMQ8M = Velocity.m2608minusAH228Gc(j2, ((Velocity) obj).getPackedValue());
                return Velocity.m2599boximpl(m2612getZero9UxMQ8M);
            }
        }
        scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 = new ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1(this, continuation);
        Object obj2 = scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.label;
        if (i != 0) {
        }
        m2612getZero9UxMQ8M = Velocity.m2608minusAH228Gc(j2, ((Velocity) obj2).getPackedValue());
        return Velocity.m2599boximpl(m2612getZero9UxMQ8M);
    }
}
