package kotlinx.coroutines.channels;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import f6.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import y5.w;

@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1", f = "Deprecated.kt", i = {0, 1, 1, 2, 3, 4}, l = {181, 182, 183, 187, TsExtractor.TS_PACKET_SIZE}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0", "L$0", "L$0"})
/* loaded from: classes5.dex */
final class ChannelsKt__DeprecatedKt$dropWhile$1 extends SuspendLambda implements p {
    final /* synthetic */ p $predicate;
    final /* synthetic */ ReceiveChannel $this_dropWhile;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChannelsKt__DeprecatedKt$dropWhile$1(ReceiveChannel receiveChannel, p pVar, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.$this_dropWhile = receiveChannel;
        this.$predicate = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
        ChannelsKt__DeprecatedKt$dropWhile$1 channelsKt__DeprecatedKt$dropWhile$1 = new ChannelsKt__DeprecatedKt$dropWhile$1(this.$this_dropWhile, this.$predicate, cVar);
        channelsKt__DeprecatedKt$dropWhile$1.L$0 = obj;
        return channelsKt__DeprecatedKt$dropWhile$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00e5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0102 -> B:9:0x00d9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00b1 -> B:29:0x00b5). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        ChannelIterator it;
        j jVar;
        ChannelsKt__DeprecatedKt$dropWhile$1 channelsKt__DeprecatedKt$dropWhile$1;
        j jVar2;
        ChannelIterator channelIterator;
        Object obj2;
        ChannelsKt__DeprecatedKt$dropWhile$1 channelsKt__DeprecatedKt$dropWhile$12;
        j jVar3;
        Object hasNext;
        ChannelIterator it2;
        ChannelIterator channelIterator2;
        Object hasNext2;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i8 = this.label;
        if (i8 == 0) {
            y5.g.throwOnFailure(obj);
            j jVar4 = (j) this.L$0;
            it = this.$this_dropWhile.iterator();
            jVar = jVar4;
            channelsKt__DeprecatedKt$dropWhile$1 = this;
            channelsKt__DeprecatedKt$dropWhile$1.L$0 = jVar;
            channelsKt__DeprecatedKt$dropWhile$1.L$1 = it;
            channelsKt__DeprecatedKt$dropWhile$1.L$2 = null;
            channelsKt__DeprecatedKt$dropWhile$1.label = 1;
            hasNext = it.hasNext(channelsKt__DeprecatedKt$dropWhile$1);
            if (hasNext != coroutine_suspended) {
            }
        } else if (i8 == 1) {
            ChannelIterator channelIterator3 = (ChannelIterator) this.L$1;
            j jVar5 = (j) this.L$0;
            y5.g.throwOnFailure(obj);
            jVar2 = jVar5;
            channelIterator = channelIterator3;
            obj2 = coroutine_suspended;
            channelsKt__DeprecatedKt$dropWhile$12 = this;
            if (((Boolean) obj).booleanValue()) {
            }
            it2 = channelsKt__DeprecatedKt$dropWhile$12.$this_dropWhile.iterator();
            channelsKt__DeprecatedKt$dropWhile$12.L$0 = jVar2;
            channelsKt__DeprecatedKt$dropWhile$12.L$1 = it2;
            channelsKt__DeprecatedKt$dropWhile$12.label = 4;
            hasNext2 = it2.hasNext(channelsKt__DeprecatedKt$dropWhile$12);
            if (hasNext2 != obj2) {
            }
        } else if (i8 == 2) {
            Object obj3 = this.L$2;
            channelIterator = (ChannelIterator) this.L$1;
            j jVar6 = (j) this.L$0;
            y5.g.throwOnFailure(obj);
            jVar3 = jVar6;
            Object obj4 = obj3;
            obj2 = coroutine_suspended;
            channelsKt__DeprecatedKt$dropWhile$12 = this;
            if (((Boolean) obj).booleanValue()) {
                channelsKt__DeprecatedKt$dropWhile$12.L$0 = jVar3;
                channelsKt__DeprecatedKt$dropWhile$12.L$1 = null;
                channelsKt__DeprecatedKt$dropWhile$12.L$2 = null;
                channelsKt__DeprecatedKt$dropWhile$12.label = 3;
                if (jVar3.send(obj4, channelsKt__DeprecatedKt$dropWhile$12) == obj2) {
                    return obj2;
                }
                jVar2 = jVar3;
                it2 = channelsKt__DeprecatedKt$dropWhile$12.$this_dropWhile.iterator();
                channelsKt__DeprecatedKt$dropWhile$12.L$0 = jVar2;
                channelsKt__DeprecatedKt$dropWhile$12.L$1 = it2;
                channelsKt__DeprecatedKt$dropWhile$12.label = 4;
                hasNext2 = it2.hasNext(channelsKt__DeprecatedKt$dropWhile$12);
                if (hasNext2 != obj2) {
                }
            } else {
                channelsKt__DeprecatedKt$dropWhile$1 = channelsKt__DeprecatedKt$dropWhile$12;
                coroutine_suspended = obj2;
                it = channelIterator;
                jVar = jVar3;
                channelsKt__DeprecatedKt$dropWhile$1.L$0 = jVar;
                channelsKt__DeprecatedKt$dropWhile$1.L$1 = it;
                channelsKt__DeprecatedKt$dropWhile$1.L$2 = null;
                channelsKt__DeprecatedKt$dropWhile$1.label = 1;
                hasNext = it.hasNext(channelsKt__DeprecatedKt$dropWhile$1);
                if (hasNext != coroutine_suspended) {
                    return coroutine_suspended;
                }
                Object obj5 = coroutine_suspended;
                channelsKt__DeprecatedKt$dropWhile$12 = channelsKt__DeprecatedKt$dropWhile$1;
                obj = hasNext;
                jVar2 = jVar;
                channelIterator = it;
                obj2 = obj5;
                if (((Boolean) obj).booleanValue()) {
                    Object next = channelIterator.next();
                    p pVar = channelsKt__DeprecatedKt$dropWhile$12.$predicate;
                    channelsKt__DeprecatedKt$dropWhile$12.L$0 = jVar2;
                    channelsKt__DeprecatedKt$dropWhile$12.L$1 = channelIterator;
                    channelsKt__DeprecatedKt$dropWhile$12.L$2 = next;
                    channelsKt__DeprecatedKt$dropWhile$12.label = 2;
                    Object invoke = pVar.invoke(next, channelsKt__DeprecatedKt$dropWhile$12);
                    if (invoke == obj2) {
                        return obj2;
                    }
                    j jVar7 = jVar2;
                    obj4 = next;
                    obj = invoke;
                    jVar3 = jVar7;
                    if (((Boolean) obj).booleanValue()) {
                    }
                }
                it2 = channelsKt__DeprecatedKt$dropWhile$12.$this_dropWhile.iterator();
                channelsKt__DeprecatedKt$dropWhile$12.L$0 = jVar2;
                channelsKt__DeprecatedKt$dropWhile$12.L$1 = it2;
                channelsKt__DeprecatedKt$dropWhile$12.label = 4;
                hasNext2 = it2.hasNext(channelsKt__DeprecatedKt$dropWhile$12);
                if (hasNext2 != obj2) {
                }
            }
        } else if (i8 == 3) {
            j jVar8 = (j) this.L$0;
            y5.g.throwOnFailure(obj);
            jVar3 = jVar8;
            obj2 = coroutine_suspended;
            channelsKt__DeprecatedKt$dropWhile$12 = this;
            jVar2 = jVar3;
            it2 = channelsKt__DeprecatedKt$dropWhile$12.$this_dropWhile.iterator();
            channelsKt__DeprecatedKt$dropWhile$12.L$0 = jVar2;
            channelsKt__DeprecatedKt$dropWhile$12.L$1 = it2;
            channelsKt__DeprecatedKt$dropWhile$12.label = 4;
            hasNext2 = it2.hasNext(channelsKt__DeprecatedKt$dropWhile$12);
            if (hasNext2 != obj2) {
            }
        } else if (i8 == 4) {
            ChannelIterator channelIterator4 = (ChannelIterator) this.L$1;
            j jVar9 = (j) this.L$0;
            y5.g.throwOnFailure(obj);
            jVar2 = jVar9;
            channelIterator2 = channelIterator4;
            obj2 = coroutine_suspended;
            channelsKt__DeprecatedKt$dropWhile$12 = this;
            if (((Boolean) obj).booleanValue()) {
            }
        } else {
            if (i8 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ChannelIterator channelIterator5 = (ChannelIterator) this.L$1;
            j jVar10 = (j) this.L$0;
            y5.g.throwOnFailure(obj);
            it2 = channelIterator5;
            jVar2 = jVar10;
            obj2 = coroutine_suspended;
            channelsKt__DeprecatedKt$dropWhile$12 = this;
            channelsKt__DeprecatedKt$dropWhile$12.L$0 = jVar2;
            channelsKt__DeprecatedKt$dropWhile$12.L$1 = it2;
            channelsKt__DeprecatedKt$dropWhile$12.label = 4;
            hasNext2 = it2.hasNext(channelsKt__DeprecatedKt$dropWhile$12);
            if (hasNext2 != obj2) {
                return obj2;
            }
            channelIterator2 = it2;
            obj = hasNext2;
            if (((Boolean) obj).booleanValue()) {
                return w.INSTANCE;
            }
            Object next2 = channelIterator2.next();
            channelsKt__DeprecatedKt$dropWhile$12.L$0 = jVar2;
            channelsKt__DeprecatedKt$dropWhile$12.L$1 = channelIterator2;
            channelsKt__DeprecatedKt$dropWhile$12.label = 5;
            if (jVar2.send(next2, channelsKt__DeprecatedKt$dropWhile$12) == obj2) {
                return obj2;
            }
            it2 = channelIterator2;
            channelsKt__DeprecatedKt$dropWhile$12.L$0 = jVar2;
            channelsKt__DeprecatedKt$dropWhile$12.L$1 = it2;
            channelsKt__DeprecatedKt$dropWhile$12.label = 4;
            hasNext2 = it2.hasNext(channelsKt__DeprecatedKt$dropWhile$12);
            if (hasNext2 != obj2) {
            }
        }
    }

    @Override // f6.p
    public final Object invoke(j jVar, kotlin.coroutines.c cVar) {
        return ((ChannelsKt__DeprecatedKt$dropWhile$1) create(jVar, cVar)).invokeSuspend(w.INSTANCE);
    }
}
