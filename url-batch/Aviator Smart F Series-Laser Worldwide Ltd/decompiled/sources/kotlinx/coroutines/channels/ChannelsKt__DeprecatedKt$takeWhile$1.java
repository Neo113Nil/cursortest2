package kotlinx.coroutines.channels;

import com.realsil.sdk.dfu.DfuException;
import f6.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import y5.w;

@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1", f = "Deprecated.kt", i = {0, 1, 1, 2}, l = {DfuException.ERROR_BATTERY_LEVEL_LOW, 270, DfuException.ERROR_READ_APP_INFO_ERROR}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0"})
/* loaded from: classes5.dex */
final class ChannelsKt__DeprecatedKt$takeWhile$1 extends SuspendLambda implements p {
    final /* synthetic */ p $predicate;
    final /* synthetic */ ReceiveChannel $this_takeWhile;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChannelsKt__DeprecatedKt$takeWhile$1(ReceiveChannel receiveChannel, p pVar, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.$this_takeWhile = receiveChannel;
        this.$predicate = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
        ChannelsKt__DeprecatedKt$takeWhile$1 channelsKt__DeprecatedKt$takeWhile$1 = new ChannelsKt__DeprecatedKt$takeWhile$1(this.$this_takeWhile, this.$predicate, cVar);
        channelsKt__DeprecatedKt$takeWhile$1.L$0 = obj;
        return channelsKt__DeprecatedKt$takeWhile$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ac  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a7 -> B:8:0x0057). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        ChannelIterator it;
        j jVar;
        Object obj2;
        ChannelsKt__DeprecatedKt$takeWhile$1 channelsKt__DeprecatedKt$takeWhile$1;
        ChannelsKt__DeprecatedKt$takeWhile$1 channelsKt__DeprecatedKt$takeWhile$12;
        j jVar2;
        ChannelIterator channelIterator;
        Object hasNext;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i8 = this.label;
        if (i8 == 0) {
            y5.g.throwOnFailure(obj);
            j jVar3 = (j) this.L$0;
            it = this.$this_takeWhile.iterator();
            jVar = jVar3;
        } else if (i8 == 1) {
            ChannelIterator channelIterator2 = (ChannelIterator) this.L$1;
            j jVar4 = (j) this.L$0;
            y5.g.throwOnFailure(obj);
            jVar2 = jVar4;
            channelIterator = channelIterator2;
            obj2 = coroutine_suspended;
            channelsKt__DeprecatedKt$takeWhile$1 = this;
            if (((Boolean) obj).booleanValue()) {
            }
        } else if (i8 == 2) {
            Object obj3 = this.L$2;
            ChannelIterator channelIterator3 = (ChannelIterator) this.L$1;
            j jVar5 = (j) this.L$0;
            y5.g.throwOnFailure(obj);
            j jVar6 = jVar5;
            ChannelIterator channelIterator4 = channelIterator3;
            Object obj4 = obj3;
            obj2 = coroutine_suspended;
            channelsKt__DeprecatedKt$takeWhile$1 = this;
            if (((Boolean) obj).booleanValue()) {
                return w.INSTANCE;
            }
            channelsKt__DeprecatedKt$takeWhile$1.L$0 = jVar6;
            channelsKt__DeprecatedKt$takeWhile$1.L$1 = channelIterator4;
            channelsKt__DeprecatedKt$takeWhile$1.L$2 = null;
            channelsKt__DeprecatedKt$takeWhile$1.label = 3;
            if (jVar6.send(obj4, channelsKt__DeprecatedKt$takeWhile$1) == obj2) {
                return obj2;
            }
            channelsKt__DeprecatedKt$takeWhile$12 = channelsKt__DeprecatedKt$takeWhile$1;
            coroutine_suspended = obj2;
            it = channelIterator4;
            jVar = jVar6;
            channelsKt__DeprecatedKt$takeWhile$12.L$0 = jVar;
            channelsKt__DeprecatedKt$takeWhile$12.L$1 = it;
            channelsKt__DeprecatedKt$takeWhile$12.label = 1;
            hasNext = it.hasNext(channelsKt__DeprecatedKt$takeWhile$12);
            if (hasNext != coroutine_suspended) {
                return coroutine_suspended;
            }
            Object obj5 = coroutine_suspended;
            channelsKt__DeprecatedKt$takeWhile$1 = channelsKt__DeprecatedKt$takeWhile$12;
            obj = hasNext;
            jVar2 = jVar;
            channelIterator = it;
            obj2 = obj5;
            if (((Boolean) obj).booleanValue()) {
                return w.INSTANCE;
            }
            Object next = channelIterator.next();
            p pVar = channelsKt__DeprecatedKt$takeWhile$1.$predicate;
            channelsKt__DeprecatedKt$takeWhile$1.L$0 = jVar2;
            channelsKt__DeprecatedKt$takeWhile$1.L$1 = channelIterator;
            channelsKt__DeprecatedKt$takeWhile$1.L$2 = next;
            channelsKt__DeprecatedKt$takeWhile$1.label = 2;
            Object invoke = pVar.invoke(next, channelsKt__DeprecatedKt$takeWhile$1);
            if (invoke == obj2) {
                return obj2;
            }
            ChannelIterator channelIterator5 = channelIterator;
            obj4 = next;
            obj = invoke;
            jVar6 = jVar2;
            channelIterator4 = channelIterator5;
            if (((Boolean) obj).booleanValue()) {
            }
        } else {
            if (i8 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (ChannelIterator) this.L$1;
            jVar = (j) this.L$0;
            y5.g.throwOnFailure(obj);
        }
        channelsKt__DeprecatedKt$takeWhile$12 = this;
        channelsKt__DeprecatedKt$takeWhile$12.L$0 = jVar;
        channelsKt__DeprecatedKt$takeWhile$12.L$1 = it;
        channelsKt__DeprecatedKt$takeWhile$12.label = 1;
        hasNext = it.hasNext(channelsKt__DeprecatedKt$takeWhile$12);
        if (hasNext != coroutine_suspended) {
        }
    }

    @Override // f6.p
    public final Object invoke(j jVar, kotlin.coroutines.c cVar) {
        return ((ChannelsKt__DeprecatedKt$takeWhile$1) create(jVar, cVar)).invokeSuspend(w.INSTANCE);
    }
}
