package kotlinx.coroutines.channels;

import f6.p;
import java.util.HashSet;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import y5.w;

@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 1, 2, 2, 2}, l = {387, 388, 390}, m = "invokeSuspend", n = {"$this$produce", "keys", "$this$produce", "keys", "e", "$this$produce", "keys", com.baidu.ar.k.f2621r}, s = {"L$0", "L$1", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3"})
/* loaded from: classes5.dex */
final class ChannelsKt__DeprecatedKt$distinctBy$1 extends SuspendLambda implements p {
    final /* synthetic */ p $selector;
    final /* synthetic */ ReceiveChannel $this_distinctBy;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChannelsKt__DeprecatedKt$distinctBy$1(ReceiveChannel receiveChannel, p pVar, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.$this_distinctBy = receiveChannel;
        this.$selector = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
        ChannelsKt__DeprecatedKt$distinctBy$1 channelsKt__DeprecatedKt$distinctBy$1 = new ChannelsKt__DeprecatedKt$distinctBy$1(this.$this_distinctBy, this.$selector, cVar);
        channelsKt__DeprecatedKt$distinctBy$1.L$0 = obj;
        return channelsKt__DeprecatedKt$distinctBy$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00c5 -> B:7:0x00cb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00d2 -> B:8:0x0071). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        j jVar;
        ChannelsKt__DeprecatedKt$distinctBy$1 channelsKt__DeprecatedKt$distinctBy$1;
        HashSet hashSet;
        ChannelIterator it;
        j jVar2;
        HashSet hashSet2;
        Object obj2;
        ChannelIterator channelIterator;
        Object obj3;
        ChannelsKt__DeprecatedKt$distinctBy$1 channelsKt__DeprecatedKt$distinctBy$12;
        j jVar3;
        HashSet hashSet3;
        Object hasNext;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i8 = this.label;
        if (i8 == 0) {
            y5.g.throwOnFailure(obj);
            j jVar4 = (j) this.L$0;
            HashSet hashSet4 = new HashSet();
            jVar = jVar4;
            channelsKt__DeprecatedKt$distinctBy$1 = this;
            hashSet = hashSet4;
            it = this.$this_distinctBy.iterator();
            channelsKt__DeprecatedKt$distinctBy$1.L$0 = jVar;
            channelsKt__DeprecatedKt$distinctBy$1.L$1 = hashSet;
            channelsKt__DeprecatedKt$distinctBy$1.L$2 = it;
            channelsKt__DeprecatedKt$distinctBy$1.L$3 = null;
            channelsKt__DeprecatedKt$distinctBy$1.label = 1;
            hasNext = it.hasNext(channelsKt__DeprecatedKt$distinctBy$1);
            if (hasNext != coroutine_suspended) {
            }
        } else if (i8 == 1) {
            ChannelIterator channelIterator2 = (ChannelIterator) this.L$2;
            HashSet hashSet5 = (HashSet) this.L$1;
            j jVar5 = (j) this.L$0;
            y5.g.throwOnFailure(obj);
            jVar3 = jVar5;
            hashSet3 = hashSet5;
            channelIterator = channelIterator2;
            obj3 = coroutine_suspended;
            channelsKt__DeprecatedKt$distinctBy$12 = this;
            if (((Boolean) obj).booleanValue()) {
            }
        } else if (i8 == 2) {
            Object obj4 = this.L$3;
            channelIterator = (ChannelIterator) this.L$2;
            HashSet hashSet6 = (HashSet) this.L$1;
            j jVar6 = (j) this.L$0;
            y5.g.throwOnFailure(obj);
            jVar2 = jVar6;
            hashSet2 = hashSet6;
            obj2 = obj4;
            obj3 = coroutine_suspended;
            channelsKt__DeprecatedKt$distinctBy$12 = this;
            if (hashSet2.contains(obj)) {
            }
        } else {
            if (i8 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj5 = this.L$3;
            channelIterator = (ChannelIterator) this.L$2;
            HashSet hashSet7 = (HashSet) this.L$1;
            j jVar7 = (j) this.L$0;
            y5.g.throwOnFailure(obj);
            channelsKt__DeprecatedKt$distinctBy$1 = this;
            hashSet7.add(obj5);
            it = channelIterator;
            hashSet = hashSet7;
            jVar = jVar7;
            channelsKt__DeprecatedKt$distinctBy$1.L$0 = jVar;
            channelsKt__DeprecatedKt$distinctBy$1.L$1 = hashSet;
            channelsKt__DeprecatedKt$distinctBy$1.L$2 = it;
            channelsKt__DeprecatedKt$distinctBy$1.L$3 = null;
            channelsKt__DeprecatedKt$distinctBy$1.label = 1;
            hasNext = it.hasNext(channelsKt__DeprecatedKt$distinctBy$1);
            if (hasNext != coroutine_suspended) {
                return coroutine_suspended;
            }
            Object obj6 = coroutine_suspended;
            channelsKt__DeprecatedKt$distinctBy$12 = channelsKt__DeprecatedKt$distinctBy$1;
            obj = hasNext;
            jVar3 = jVar;
            hashSet3 = hashSet;
            channelIterator = it;
            obj3 = obj6;
            if (((Boolean) obj).booleanValue()) {
                return w.INSTANCE;
            }
            Object next = channelIterator.next();
            p pVar = channelsKt__DeprecatedKt$distinctBy$12.$selector;
            channelsKt__DeprecatedKt$distinctBy$12.L$0 = jVar3;
            channelsKt__DeprecatedKt$distinctBy$12.L$1 = hashSet3;
            channelsKt__DeprecatedKt$distinctBy$12.L$2 = channelIterator;
            channelsKt__DeprecatedKt$distinctBy$12.L$3 = next;
            channelsKt__DeprecatedKt$distinctBy$12.label = 2;
            Object invoke = pVar.invoke(next, channelsKt__DeprecatedKt$distinctBy$12);
            if (invoke == obj3) {
                return obj3;
            }
            HashSet hashSet8 = hashSet3;
            obj2 = next;
            obj = invoke;
            jVar2 = jVar3;
            hashSet2 = hashSet8;
            if (hashSet2.contains(obj)) {
                channelsKt__DeprecatedKt$distinctBy$12.L$0 = jVar2;
                channelsKt__DeprecatedKt$distinctBy$12.L$1 = hashSet2;
                channelsKt__DeprecatedKt$distinctBy$12.L$2 = channelIterator;
                channelsKt__DeprecatedKt$distinctBy$12.L$3 = obj;
                channelsKt__DeprecatedKt$distinctBy$12.label = 3;
                if (jVar2.send(obj2, channelsKt__DeprecatedKt$distinctBy$12) == obj3) {
                    return obj3;
                }
                hashSet7 = hashSet2;
                jVar7 = jVar2;
                Object obj7 = obj3;
                obj5 = obj;
                channelsKt__DeprecatedKt$distinctBy$1 = channelsKt__DeprecatedKt$distinctBy$12;
                coroutine_suspended = obj7;
                hashSet7.add(obj5);
                it = channelIterator;
                hashSet = hashSet7;
                jVar = jVar7;
                channelsKt__DeprecatedKt$distinctBy$1.L$0 = jVar;
                channelsKt__DeprecatedKt$distinctBy$1.L$1 = hashSet;
                channelsKt__DeprecatedKt$distinctBy$1.L$2 = it;
                channelsKt__DeprecatedKt$distinctBy$1.L$3 = null;
                channelsKt__DeprecatedKt$distinctBy$1.label = 1;
                hasNext = it.hasNext(channelsKt__DeprecatedKt$distinctBy$1);
                if (hasNext != coroutine_suspended) {
                }
            } else {
                channelsKt__DeprecatedKt$distinctBy$1 = channelsKt__DeprecatedKt$distinctBy$12;
                coroutine_suspended = obj3;
                it = channelIterator;
                hashSet = hashSet2;
                jVar = jVar2;
                channelsKt__DeprecatedKt$distinctBy$1.L$0 = jVar;
                channelsKt__DeprecatedKt$distinctBy$1.L$1 = hashSet;
                channelsKt__DeprecatedKt$distinctBy$1.L$2 = it;
                channelsKt__DeprecatedKt$distinctBy$1.L$3 = null;
                channelsKt__DeprecatedKt$distinctBy$1.label = 1;
                hasNext = it.hasNext(channelsKt__DeprecatedKt$distinctBy$1);
                if (hasNext != coroutine_suspended) {
                }
            }
        }
    }

    @Override // f6.p
    public final Object invoke(j jVar, kotlin.coroutines.c cVar) {
        return ((ChannelsKt__DeprecatedKt$distinctBy$1) create(jVar, cVar)).invokeSuspend(w.INSTANCE);
    }
}
