package kotlinx.coroutines.channels;

import com.realsil.sdk.core.bluetooth.connection.le.GattError;
import f6.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import y5.w;

@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {GattError.GATT_PRC_IN_PROGRESS, 255}, m = "invokeSuspend", n = {"$this$produce", "remaining", "$this$produce", "remaining"}, s = {"L$0", "I$0", "L$0", "I$0"})
/* loaded from: classes5.dex */
final class ChannelsKt__DeprecatedKt$take$1 extends SuspendLambda implements p {
    final /* synthetic */ int $n;
    final /* synthetic */ ReceiveChannel $this_take;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChannelsKt__DeprecatedKt$take$1(int i8, ReceiveChannel receiveChannel, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.$n = i8;
        this.$this_take = receiveChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
        ChannelsKt__DeprecatedKt$take$1 channelsKt__DeprecatedKt$take$1 = new ChannelsKt__DeprecatedKt$take$1(this.$n, this.$this_take, cVar);
        channelsKt__DeprecatedKt$take$1.L$0 = obj;
        return channelsKt__DeprecatedKt$take$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0080 -> B:6:0x0082). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        j jVar;
        int i8;
        ChannelIterator it;
        ChannelsKt__DeprecatedKt$take$1 channelsKt__DeprecatedKt$take$1;
        ChannelsKt__DeprecatedKt$take$1 channelsKt__DeprecatedKt$take$12;
        j jVar2;
        Object hasNext;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i9 = this.label;
        if (i9 == 0) {
            y5.g.throwOnFailure(obj);
            jVar = (j) this.L$0;
            i8 = this.$n;
            if (i8 == 0) {
                return w.INSTANCE;
            }
            if (!(i8 >= 0)) {
                throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
            }
            it = this.$this_take.iterator();
            channelsKt__DeprecatedKt$take$1 = this;
            channelsKt__DeprecatedKt$take$1.L$0 = jVar;
            channelsKt__DeprecatedKt$take$1.L$1 = it;
            channelsKt__DeprecatedKt$take$1.I$0 = i8;
            channelsKt__DeprecatedKt$take$1.label = 1;
            hasNext = it.hasNext(channelsKt__DeprecatedKt$take$1);
            if (hasNext == coroutine_suspended) {
            }
        } else if (i9 == 1) {
            i8 = this.I$0;
            it = (ChannelIterator) this.L$1;
            jVar2 = (j) this.L$0;
            y5.g.throwOnFailure(obj);
            channelsKt__DeprecatedKt$take$12 = this;
            if (((Boolean) obj).booleanValue()) {
            }
        } else {
            if (i9 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i8 = this.I$0;
            it = (ChannelIterator) this.L$1;
            j jVar3 = (j) this.L$0;
            y5.g.throwOnFailure(obj);
            jVar = jVar3;
            channelsKt__DeprecatedKt$take$1 = this;
            i8--;
            if (i8 == 0) {
                return w.INSTANCE;
            }
            channelsKt__DeprecatedKt$take$1.L$0 = jVar;
            channelsKt__DeprecatedKt$take$1.L$1 = it;
            channelsKt__DeprecatedKt$take$1.I$0 = i8;
            channelsKt__DeprecatedKt$take$1.label = 1;
            hasNext = it.hasNext(channelsKt__DeprecatedKt$take$1);
            if (hasNext == coroutine_suspended) {
                return coroutine_suspended;
            }
            ChannelsKt__DeprecatedKt$take$1 channelsKt__DeprecatedKt$take$13 = channelsKt__DeprecatedKt$take$1;
            jVar2 = jVar;
            obj = hasNext;
            channelsKt__DeprecatedKt$take$12 = channelsKt__DeprecatedKt$take$13;
            if (((Boolean) obj).booleanValue()) {
                return w.INSTANCE;
            }
            Object next = it.next();
            channelsKt__DeprecatedKt$take$12.L$0 = jVar2;
            channelsKt__DeprecatedKt$take$12.L$1 = it;
            channelsKt__DeprecatedKt$take$12.I$0 = i8;
            channelsKt__DeprecatedKt$take$12.label = 2;
            if (jVar2.send(next, channelsKt__DeprecatedKt$take$12) == coroutine_suspended) {
                return coroutine_suspended;
            }
            jVar = jVar2;
            channelsKt__DeprecatedKt$take$1 = channelsKt__DeprecatedKt$take$12;
            i8--;
            if (i8 == 0) {
            }
            channelsKt__DeprecatedKt$take$1.L$0 = jVar;
            channelsKt__DeprecatedKt$take$1.L$1 = it;
            channelsKt__DeprecatedKt$take$1.I$0 = i8;
            channelsKt__DeprecatedKt$take$1.label = 1;
            hasNext = it.hasNext(channelsKt__DeprecatedKt$take$1);
            if (hasNext == coroutine_suspended) {
            }
        }
    }

    @Override // f6.p
    public final Object invoke(j jVar, kotlin.coroutines.c cVar) {
        return ((ChannelsKt__DeprecatedKt$take$1) create(jVar, cVar)).invokeSuspend(w.INSTANCE);
    }
}
