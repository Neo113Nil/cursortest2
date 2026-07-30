package kotlinx.coroutines.channels;

import f6.p;
import f6.q;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import y5.w;

@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 1, 2, 2}, l = {211, 212, 212}, m = "invokeSuspend", n = {"$this$produce", "index", "$this$produce", "e", "index", "$this$produce", "index"}, s = {"L$0", "I$0", "L$0", "L$2", "I$0", "L$0", "I$0"})
/* loaded from: classes5.dex */
final class ChannelsKt__DeprecatedKt$filterIndexed$1 extends SuspendLambda implements p {
    final /* synthetic */ q $predicate;
    final /* synthetic */ ReceiveChannel $this_filterIndexed;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChannelsKt__DeprecatedKt$filterIndexed$1(ReceiveChannel receiveChannel, q qVar, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.$this_filterIndexed = receiveChannel;
        this.$predicate = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
        ChannelsKt__DeprecatedKt$filterIndexed$1 channelsKt__DeprecatedKt$filterIndexed$1 = new ChannelsKt__DeprecatedKt$filterIndexed$1(this.$this_filterIndexed, this.$predicate, cVar);
        channelsKt__DeprecatedKt$filterIndexed$1.L$0 = obj;
        return channelsKt__DeprecatedKt$filterIndexed$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        r13 = r0;
        r0 = r1;
        r7 = r8;
        r1 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        j jVar;
        ChannelIterator it;
        int i8;
        j jVar2;
        Object obj2;
        ChannelsKt__DeprecatedKt$filterIndexed$1 channelsKt__DeprecatedKt$filterIndexed$1;
        ChannelsKt__DeprecatedKt$filterIndexed$1 channelsKt__DeprecatedKt$filterIndexed$12;
        ChannelIterator channelIterator;
        int i9;
        Object hasNext;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            y5.g.throwOnFailure(obj);
            jVar = (j) this.L$0;
            it = this.$this_filterIndexed.iterator();
            i8 = 0;
        } else if (i10 == 1) {
            int i11 = this.I$0;
            ChannelIterator channelIterator2 = (ChannelIterator) this.L$1;
            j jVar3 = (j) this.L$0;
            y5.g.throwOnFailure(obj);
            jVar2 = jVar3;
            channelIterator = channelIterator2;
            i9 = i11;
            obj2 = coroutine_suspended;
            channelsKt__DeprecatedKt$filterIndexed$1 = this;
            if (((Boolean) obj).booleanValue()) {
            }
        } else if (i10 == 2) {
            int i12 = this.I$0;
            Object obj3 = this.L$2;
            ChannelIterator channelIterator3 = (ChannelIterator) this.L$1;
            jVar2 = (j) this.L$0;
            y5.g.throwOnFailure(obj);
            int i13 = i12;
            obj2 = coroutine_suspended;
            channelsKt__DeprecatedKt$filterIndexed$1 = this;
            ChannelIterator channelIterator4 = channelIterator3;
            Object obj4 = obj3;
            it = channelIterator4;
            if (((Boolean) obj).booleanValue()) {
                channelsKt__DeprecatedKt$filterIndexed$1.L$0 = jVar2;
                channelsKt__DeprecatedKt$filterIndexed$1.L$1 = it;
                channelsKt__DeprecatedKt$filterIndexed$1.L$2 = null;
                channelsKt__DeprecatedKt$filterIndexed$1.I$0 = i13;
                channelsKt__DeprecatedKt$filterIndexed$1.label = 3;
                if (jVar2.send(obj4, channelsKt__DeprecatedKt$filterIndexed$1) == obj2) {
                    return obj2;
                }
            }
            channelsKt__DeprecatedKt$filterIndexed$12 = channelsKt__DeprecatedKt$filterIndexed$1;
            coroutine_suspended = obj2;
            jVar = jVar2;
            i8 = i13;
            channelsKt__DeprecatedKt$filterIndexed$12.L$0 = jVar;
            channelsKt__DeprecatedKt$filterIndexed$12.L$1 = it;
            channelsKt__DeprecatedKt$filterIndexed$12.L$2 = null;
            channelsKt__DeprecatedKt$filterIndexed$12.I$0 = i8;
            channelsKt__DeprecatedKt$filterIndexed$12.label = 1;
            hasNext = it.hasNext(channelsKt__DeprecatedKt$filterIndexed$12);
            if (hasNext == coroutine_suspended) {
                return coroutine_suspended;
            }
            Object obj5 = coroutine_suspended;
            channelsKt__DeprecatedKt$filterIndexed$1 = channelsKt__DeprecatedKt$filterIndexed$12;
            obj = hasNext;
            jVar2 = jVar;
            channelIterator = it;
            i9 = i8;
            obj2 = obj5;
            if (((Boolean) obj).booleanValue()) {
                return w.INSTANCE;
            }
            Object next = channelIterator.next();
            q qVar = channelsKt__DeprecatedKt$filterIndexed$1.$predicate;
            i13 = i9 + 1;
            Integer boxInt = kotlin.coroutines.jvm.internal.a.boxInt(i9);
            channelsKt__DeprecatedKt$filterIndexed$1.L$0 = jVar2;
            channelsKt__DeprecatedKt$filterIndexed$1.L$1 = channelIterator;
            channelsKt__DeprecatedKt$filterIndexed$1.L$2 = next;
            channelsKt__DeprecatedKt$filterIndexed$1.I$0 = i13;
            channelsKt__DeprecatedKt$filterIndexed$1.label = 2;
            Object invoke = qVar.invoke(boxInt, next, channelsKt__DeprecatedKt$filterIndexed$1);
            if (invoke == obj2) {
                return obj2;
            }
            channelIterator4 = channelIterator;
            obj4 = next;
            obj = invoke;
            it = channelIterator4;
            if (((Boolean) obj).booleanValue()) {
            }
            channelsKt__DeprecatedKt$filterIndexed$12 = channelsKt__DeprecatedKt$filterIndexed$1;
            coroutine_suspended = obj2;
            jVar = jVar2;
            i8 = i13;
            channelsKt__DeprecatedKt$filterIndexed$12.L$0 = jVar;
            channelsKt__DeprecatedKt$filterIndexed$12.L$1 = it;
            channelsKt__DeprecatedKt$filterIndexed$12.L$2 = null;
            channelsKt__DeprecatedKt$filterIndexed$12.I$0 = i8;
            channelsKt__DeprecatedKt$filterIndexed$12.label = 1;
            hasNext = it.hasNext(channelsKt__DeprecatedKt$filterIndexed$12);
            if (hasNext == coroutine_suspended) {
            }
        } else {
            if (i10 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i8 = this.I$0;
            it = (ChannelIterator) this.L$1;
            jVar = (j) this.L$0;
            y5.g.throwOnFailure(obj);
        }
        channelsKt__DeprecatedKt$filterIndexed$12 = this;
        channelsKt__DeprecatedKt$filterIndexed$12.L$0 = jVar;
        channelsKt__DeprecatedKt$filterIndexed$12.L$1 = it;
        channelsKt__DeprecatedKt$filterIndexed$12.L$2 = null;
        channelsKt__DeprecatedKt$filterIndexed$12.I$0 = i8;
        channelsKt__DeprecatedKt$filterIndexed$12.label = 1;
        hasNext = it.hasNext(channelsKt__DeprecatedKt$filterIndexed$12);
        if (hasNext == coroutine_suspended) {
        }
    }

    @Override // f6.p
    public final Object invoke(j jVar, kotlin.coroutines.c cVar) {
        return ((ChannelsKt__DeprecatedKt$filterIndexed$1) create(jVar, cVar)).invokeSuspend(w.INSTANCE);
    }
}
