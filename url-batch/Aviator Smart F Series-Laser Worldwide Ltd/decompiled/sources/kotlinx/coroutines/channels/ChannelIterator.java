package kotlinx.coroutines.channels;

/* loaded from: classes5.dex */
public interface ChannelIterator {

    public static final class DefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static /* synthetic */ Object next(ChannelIterator channelIterator, kotlin.coroutines.c cVar) {
            ChannelIterator$next0$1 channelIterator$next0$1;
            Object obj;
            Object coroutine_suspended;
            int i8;
            if (cVar instanceof ChannelIterator$next0$1) {
                channelIterator$next0$1 = (ChannelIterator$next0$1) cVar;
                int i9 = channelIterator$next0$1.label;
                if ((i9 & Integer.MIN_VALUE) != 0) {
                    channelIterator$next0$1.label = i9 - Integer.MIN_VALUE;
                    obj = channelIterator$next0$1.result;
                    coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                    i8 = channelIterator$next0$1.label;
                    if (i8 != 0) {
                        y5.g.throwOnFailure(obj);
                        channelIterator$next0$1.L$0 = channelIterator;
                        channelIterator$next0$1.label = 1;
                        obj = channelIterator.hasNext(channelIterator$next0$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i8 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        channelIterator = (ChannelIterator) channelIterator$next0$1.L$0;
                        y5.g.throwOnFailure(obj);
                    }
                    if (((Boolean) obj).booleanValue()) {
                        throw new ClosedReceiveChannelException(g.DEFAULT_CLOSE_MESSAGE);
                    }
                    return channelIterator.next();
                }
            }
            channelIterator$next0$1 = new ChannelIterator$next0$1(cVar);
            obj = channelIterator$next0$1.result;
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            i8 = channelIterator$next0$1.label;
            if (i8 != 0) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
        }
    }

    Object hasNext(kotlin.coroutines.c cVar);

    Object next();

    /* synthetic */ Object next(kotlin.coroutines.c cVar);
}
