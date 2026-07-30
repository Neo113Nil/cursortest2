package kotlinx.coroutines.channels;

import f6.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import y5.w;

@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1", f = "Deprecated.kt", i = {0, 1, 1, 2}, l = {198, 199, 199}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0"})
/* loaded from: classes5.dex */
final class ChannelsKt__DeprecatedKt$filter$1 extends SuspendLambda implements p {
    final /* synthetic */ p $predicate;
    final /* synthetic */ ReceiveChannel $this_filter;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChannelsKt__DeprecatedKt$filter$1(ReceiveChannel receiveChannel, p pVar, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.$this_filter = receiveChannel;
        this.$predicate = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
        ChannelsKt__DeprecatedKt$filter$1 channelsKt__DeprecatedKt$filter$1 = new ChannelsKt__DeprecatedKt$filter$1(this.$this_filter, this.$predicate, cVar);
        channelsKt__DeprecatedKt$filter$1.L$0 = obj;
        return channelsKt__DeprecatedKt$filter$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        r11 = r0;
        r0 = r1;
        r1 = r6;
        r6 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        ChannelIterator it;
        j jVar;
        ChannelIterator channelIterator;
        Object obj2;
        ChannelsKt__DeprecatedKt$filter$1 channelsKt__DeprecatedKt$filter$1;
        ChannelsKt__DeprecatedKt$filter$1 channelsKt__DeprecatedKt$filter$12;
        j jVar2;
        Object hasNext;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i8 = this.label;
        if (i8 == 0) {
            y5.g.throwOnFailure(obj);
            j jVar3 = (j) this.L$0;
            it = this.$this_filter.iterator();
            jVar = jVar3;
        } else if (i8 == 1) {
            ChannelIterator channelIterator2 = (ChannelIterator) this.L$1;
            j jVar4 = (j) this.L$0;
            y5.g.throwOnFailure(obj);
            jVar2 = jVar4;
            channelIterator = channelIterator2;
            obj2 = coroutine_suspended;
            channelsKt__DeprecatedKt$filter$1 = this;
            if (((Boolean) obj).booleanValue()) {
            }
        } else if (i8 == 2) {
            Object obj3 = this.L$2;
            channelIterator = (ChannelIterator) this.L$1;
            j jVar5 = (j) this.L$0;
            y5.g.throwOnFailure(obj);
            j jVar6 = jVar5;
            Object obj4 = obj3;
            obj2 = coroutine_suspended;
            channelsKt__DeprecatedKt$filter$1 = this;
            if (((Boolean) obj).booleanValue()) {
                channelsKt__DeprecatedKt$filter$1.L$0 = jVar6;
                channelsKt__DeprecatedKt$filter$1.L$1 = channelIterator;
                channelsKt__DeprecatedKt$filter$1.L$2 = null;
                channelsKt__DeprecatedKt$filter$1.label = 3;
                if (jVar6.send(obj4, channelsKt__DeprecatedKt$filter$1) == obj2) {
                    return obj2;
                }
            }
            channelsKt__DeprecatedKt$filter$12 = channelsKt__DeprecatedKt$filter$1;
            coroutine_suspended = obj2;
            it = channelIterator;
            jVar = jVar6;
            channelsKt__DeprecatedKt$filter$12.L$0 = jVar;
            channelsKt__DeprecatedKt$filter$12.L$1 = it;
            channelsKt__DeprecatedKt$filter$12.L$2 = null;
            channelsKt__DeprecatedKt$filter$12.label = 1;
            hasNext = it.hasNext(channelsKt__DeprecatedKt$filter$12);
            if (hasNext == coroutine_suspended) {
                return coroutine_suspended;
            }
            Object obj5 = coroutine_suspended;
            channelsKt__DeprecatedKt$filter$1 = channelsKt__DeprecatedKt$filter$12;
            obj = hasNext;
            jVar2 = jVar;
            channelIterator = it;
            obj2 = obj5;
            if (((Boolean) obj).booleanValue()) {
                return w.INSTANCE;
            }
            Object next = channelIterator.next();
            p pVar = channelsKt__DeprecatedKt$filter$1.$predicate;
            channelsKt__DeprecatedKt$filter$1.L$0 = jVar2;
            channelsKt__DeprecatedKt$filter$1.L$1 = channelIterator;
            channelsKt__DeprecatedKt$filter$1.L$2 = next;
            channelsKt__DeprecatedKt$filter$1.label = 2;
            Object invoke = pVar.invoke(next, channelsKt__DeprecatedKt$filter$1);
            if (invoke == obj2) {
                return obj2;
            }
            j jVar7 = jVar2;
            obj4 = next;
            obj = invoke;
            jVar6 = jVar7;
            if (((Boolean) obj).booleanValue()) {
            }
            channelsKt__DeprecatedKt$filter$12 = channelsKt__DeprecatedKt$filter$1;
            coroutine_suspended = obj2;
            it = channelIterator;
            jVar = jVar6;
            channelsKt__DeprecatedKt$filter$12.L$0 = jVar;
            channelsKt__DeprecatedKt$filter$12.L$1 = it;
            channelsKt__DeprecatedKt$filter$12.L$2 = null;
            channelsKt__DeprecatedKt$filter$12.label = 1;
            hasNext = it.hasNext(channelsKt__DeprecatedKt$filter$12);
            if (hasNext == coroutine_suspended) {
            }
        } else {
            if (i8 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (ChannelIterator) this.L$1;
            jVar = (j) this.L$0;
            y5.g.throwOnFailure(obj);
        }
        channelsKt__DeprecatedKt$filter$12 = this;
        channelsKt__DeprecatedKt$filter$12.L$0 = jVar;
        channelsKt__DeprecatedKt$filter$12.L$1 = it;
        channelsKt__DeprecatedKt$filter$12.L$2 = null;
        channelsKt__DeprecatedKt$filter$12.label = 1;
        hasNext = it.hasNext(channelsKt__DeprecatedKt$filter$12);
        if (hasNext == coroutine_suspended) {
        }
    }

    @Override // f6.p
    public final Object invoke(j jVar, kotlin.coroutines.c cVar) {
        return ((ChannelsKt__DeprecatedKt$filter$1) create(jVar, cVar)).invokeSuspend(w.INSTANCE);
    }
}
