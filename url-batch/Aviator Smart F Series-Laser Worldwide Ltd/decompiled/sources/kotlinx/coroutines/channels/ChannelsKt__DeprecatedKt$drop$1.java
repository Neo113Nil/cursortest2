package kotlinx.coroutines.channels;

import f6.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import y5.w;

@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1", f = "Deprecated.kt", i = {0, 0, 1, 2}, l = {164, 169, 170}, m = "invokeSuspend", n = {"$this$produce", "remaining", "$this$produce", "$this$produce"}, s = {"L$0", "I$0", "L$0", "L$0"})
/* loaded from: classes5.dex */
final class ChannelsKt__DeprecatedKt$drop$1 extends SuspendLambda implements p {
    final /* synthetic */ int $n;
    final /* synthetic */ ReceiveChannel $this_drop;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChannelsKt__DeprecatedKt$drop$1(int i8, ReceiveChannel receiveChannel, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.$n = i8;
        this.$this_drop = receiveChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
        ChannelsKt__DeprecatedKt$drop$1 channelsKt__DeprecatedKt$drop$1 = new ChannelsKt__DeprecatedKt$drop$1(this.$n, this.$this_drop, cVar);
        channelsKt__DeprecatedKt$drop$1.L$0 = obj;
        return channelsKt__DeprecatedKt$drop$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ab A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00c8 -> B:7:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0077 -> B:24:0x007e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        j jVar;
        int i8;
        Object obj2;
        ChannelsKt__DeprecatedKt$drop$1 channelsKt__DeprecatedKt$drop$1;
        ChannelIterator it;
        j jVar2;
        ChannelsKt__DeprecatedKt$drop$1 channelsKt__DeprecatedKt$drop$12;
        ChannelIterator it2;
        Object hasNext;
        j jVar3;
        Object hasNext2;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i9 = this.label;
        if (i9 == 0) {
            y5.g.throwOnFailure(obj);
            jVar = (j) this.L$0;
            i8 = this.$n;
            if (!(i8 >= 0)) {
                throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
            }
            if (i8 > 0) {
                it = this.$this_drop.iterator();
                jVar2 = jVar;
                channelsKt__DeprecatedKt$drop$12 = this;
                channelsKt__DeprecatedKt$drop$12.L$0 = jVar2;
                channelsKt__DeprecatedKt$drop$12.L$1 = it;
                channelsKt__DeprecatedKt$drop$12.I$0 = i8;
                channelsKt__DeprecatedKt$drop$12.label = 1;
                hasNext = it.hasNext(channelsKt__DeprecatedKt$drop$12);
                if (hasNext != coroutine_suspended) {
                }
            } else {
                obj2 = coroutine_suspended;
                channelsKt__DeprecatedKt$drop$1 = this;
                it2 = channelsKt__DeprecatedKt$drop$1.$this_drop.iterator();
                channelsKt__DeprecatedKt$drop$1.L$0 = jVar;
                channelsKt__DeprecatedKt$drop$1.L$1 = it2;
                channelsKt__DeprecatedKt$drop$1.label = 2;
                hasNext2 = it2.hasNext(channelsKt__DeprecatedKt$drop$1);
                if (hasNext2 != obj2) {
                }
            }
        } else if (i9 == 1) {
            int i10 = this.I$0;
            ChannelIterator channelIterator = (ChannelIterator) this.L$1;
            j jVar4 = (j) this.L$0;
            y5.g.throwOnFailure(obj);
            j jVar5 = jVar4;
            ChannelIterator channelIterator2 = channelIterator;
            int i11 = i10;
            obj2 = coroutine_suspended;
            channelsKt__DeprecatedKt$drop$1 = this;
            if (((Boolean) obj).booleanValue()) {
                channelIterator2.next();
                int i12 = i11 - 1;
                if (i12 != 0) {
                    it = channelIterator2;
                    jVar2 = jVar5;
                    Object obj3 = obj2;
                    i8 = i12;
                    channelsKt__DeprecatedKt$drop$12 = channelsKt__DeprecatedKt$drop$1;
                    coroutine_suspended = obj3;
                    channelsKt__DeprecatedKt$drop$12.L$0 = jVar2;
                    channelsKt__DeprecatedKt$drop$12.L$1 = it;
                    channelsKt__DeprecatedKt$drop$12.I$0 = i8;
                    channelsKt__DeprecatedKt$drop$12.label = 1;
                    hasNext = it.hasNext(channelsKt__DeprecatedKt$drop$12);
                    if (hasNext != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Object obj4 = coroutine_suspended;
                    channelsKt__DeprecatedKt$drop$1 = channelsKt__DeprecatedKt$drop$12;
                    obj = hasNext;
                    jVar5 = jVar2;
                    channelIterator2 = it;
                    i11 = i8;
                    obj2 = obj4;
                    if (((Boolean) obj).booleanValue()) {
                    }
                }
            }
            jVar = jVar5;
            it2 = channelsKt__DeprecatedKt$drop$1.$this_drop.iterator();
            channelsKt__DeprecatedKt$drop$1.L$0 = jVar;
            channelsKt__DeprecatedKt$drop$1.L$1 = it2;
            channelsKt__DeprecatedKt$drop$1.label = 2;
            hasNext2 = it2.hasNext(channelsKt__DeprecatedKt$drop$1);
            if (hasNext2 != obj2) {
            }
        } else if (i9 == 2) {
            ChannelIterator channelIterator3 = (ChannelIterator) this.L$1;
            j jVar6 = (j) this.L$0;
            y5.g.throwOnFailure(obj);
            jVar3 = jVar6;
            it2 = channelIterator3;
            obj2 = coroutine_suspended;
            channelsKt__DeprecatedKt$drop$1 = this;
            if (((Boolean) obj).booleanValue()) {
            }
        } else {
            if (i9 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ChannelIterator channelIterator4 = (ChannelIterator) this.L$1;
            j jVar7 = (j) this.L$0;
            y5.g.throwOnFailure(obj);
            jVar = jVar7;
            it2 = channelIterator4;
            obj2 = coroutine_suspended;
            channelsKt__DeprecatedKt$drop$1 = this;
            channelsKt__DeprecatedKt$drop$1.L$0 = jVar;
            channelsKt__DeprecatedKt$drop$1.L$1 = it2;
            channelsKt__DeprecatedKt$drop$1.label = 2;
            hasNext2 = it2.hasNext(channelsKt__DeprecatedKt$drop$1);
            if (hasNext2 != obj2) {
                return obj2;
            }
            jVar3 = jVar;
            obj = hasNext2;
            if (((Boolean) obj).booleanValue()) {
                return w.INSTANCE;
            }
            Object next = it2.next();
            channelsKt__DeprecatedKt$drop$1.L$0 = jVar3;
            channelsKt__DeprecatedKt$drop$1.L$1 = it2;
            channelsKt__DeprecatedKt$drop$1.label = 3;
            if (jVar3.send(next, channelsKt__DeprecatedKt$drop$1) == obj2) {
                return obj2;
            }
            jVar = jVar3;
            channelsKt__DeprecatedKt$drop$1.L$0 = jVar;
            channelsKt__DeprecatedKt$drop$1.L$1 = it2;
            channelsKt__DeprecatedKt$drop$1.label = 2;
            hasNext2 = it2.hasNext(channelsKt__DeprecatedKt$drop$1);
            if (hasNext2 != obj2) {
            }
        }
    }

    @Override // f6.p
    public final Object invoke(j jVar, kotlin.coroutines.c cVar) {
        return ((ChannelsKt__DeprecatedKt$drop$1) create(jVar, cVar)).invokeSuspend(w.INSTANCE);
    }
}
