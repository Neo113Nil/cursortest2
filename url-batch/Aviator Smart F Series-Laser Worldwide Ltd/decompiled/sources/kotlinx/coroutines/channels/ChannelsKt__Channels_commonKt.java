package kotlinx.coroutines.channels;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.collections.q;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.d1;
import y5.w;

/* loaded from: classes5.dex */
abstract /* synthetic */ class ChannelsKt__Channels_commonKt {
    public static final void cancelConsumed(ReceiveChannel receiveChannel, Throwable th) {
        if (th != null) {
            r0 = th instanceof CancellationException ? (CancellationException) th : null;
            if (r0 == null) {
                r0 = d1.CancellationException("Channel was consumed, consumer had failed", th);
            }
        }
        receiveChannel.cancel(r0);
    }

    public static final <E, R> R consume(a aVar, f6.l lVar) {
        ReceiveChannel a8 = aVar.a();
        try {
            return (R) lVar.invoke(a8);
        } finally {
            r.finallyStart(1);
            ReceiveChannel.DefaultImpls.cancel$default(a8, (CancellationException) null, 1, (Object) null);
            r.finallyEnd(1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x005c, B:14:0x0064, B:15:0x004a, B:20:0x006d), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x005c, B:14:0x0064, B:15:0x004a, B:20:0x006d), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0059 -> B:12:0x005c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <E> Object consumeEach(ReceiveChannel receiveChannel, f6.l lVar, kotlin.coroutines.c cVar) {
        ChannelsKt__Channels_commonKt$consumeEach$1 channelsKt__Channels_commonKt$consumeEach$1;
        Object coroutine_suspended;
        int i8;
        ReceiveChannel receiveChannel2;
        Throwable th;
        ChannelIterator it;
        f6.l lVar2;
        Object hasNext;
        if (cVar instanceof ChannelsKt__Channels_commonKt$consumeEach$1) {
            channelsKt__Channels_commonKt$consumeEach$1 = (ChannelsKt__Channels_commonKt$consumeEach$1) cVar;
            int i9 = channelsKt__Channels_commonKt$consumeEach$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                channelsKt__Channels_commonKt$consumeEach$1.label = i9 - Integer.MIN_VALUE;
                Object obj = channelsKt__Channels_commonKt$consumeEach$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = channelsKt__Channels_commonKt$consumeEach$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    try {
                        receiveChannel2 = receiveChannel;
                        it = receiveChannel.iterator();
                        lVar2 = lVar;
                        channelsKt__Channels_commonKt$consumeEach$1.L$0 = lVar2;
                        channelsKt__Channels_commonKt$consumeEach$1.L$1 = receiveChannel2;
                        channelsKt__Channels_commonKt$consumeEach$1.L$2 = it;
                        channelsKt__Channels_commonKt$consumeEach$1.label = 1;
                        hasNext = it.hasNext(channelsKt__Channels_commonKt$consumeEach$1);
                        if (hasNext != coroutine_suspended) {
                        }
                    } catch (Throwable th2) {
                        receiveChannel2 = receiveChannel;
                        th = th2;
                        throw th;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (ChannelIterator) channelsKt__Channels_commonKt$consumeEach$1.L$2;
                    receiveChannel2 = (ReceiveChannel) channelsKt__Channels_commonKt$consumeEach$1.L$1;
                    f6.l lVar3 = (f6.l) channelsKt__Channels_commonKt$consumeEach$1.L$0;
                    try {
                        y5.g.throwOnFailure(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            lVar3.invoke(it.next());
                            lVar2 = lVar3;
                            channelsKt__Channels_commonKt$consumeEach$1.L$0 = lVar2;
                            channelsKt__Channels_commonKt$consumeEach$1.L$1 = receiveChannel2;
                            channelsKt__Channels_commonKt$consumeEach$1.L$2 = it;
                            channelsKt__Channels_commonKt$consumeEach$1.label = 1;
                            hasNext = it.hasNext(channelsKt__Channels_commonKt$consumeEach$1);
                            if (hasNext != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            lVar3 = lVar2;
                            obj = hasNext;
                            if (!((Boolean) obj).booleanValue()) {
                                w wVar = w.INSTANCE;
                                r.finallyStart(1);
                                g.cancelConsumed(receiveChannel2, null);
                                r.finallyEnd(1);
                                return w.INSTANCE;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            r.finallyStart(1);
                            g.cancelConsumed(receiveChannel2, th);
                            r.finallyEnd(1);
                            throw th4;
                        }
                    }
                }
            }
        }
        channelsKt__Channels_commonKt$consumeEach$1 = new ChannelsKt__Channels_commonKt$consumeEach$1(cVar);
        Object obj2 = channelsKt__Channels_commonKt$consumeEach$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = channelsKt__Channels_commonKt$consumeEach$1.label;
        if (i8 != 0) {
        }
    }

    private static final <E> Object consumeEach$$forInline(ReceiveChannel receiveChannel, f6.l lVar, kotlin.coroutines.c cVar) {
        try {
            ChannelIterator it = receiveChannel.iterator();
            while (true) {
                r.mark(3);
                r.mark(0);
                Object hasNext = it.hasNext(null);
                r.mark(1);
                if (!((Boolean) hasNext).booleanValue()) {
                    w wVar = w.INSTANCE;
                    r.finallyStart(1);
                    g.cancelConsumed(receiveChannel, null);
                    r.finallyEnd(1);
                    return w.INSTANCE;
                }
                lVar.invoke(it.next());
            }
        } finally {
        }
    }

    public static final /* synthetic */ kotlinx.coroutines.selects.e onReceiveOrNull(ReceiveChannel receiveChannel) {
        s.checkNotNull(receiveChannel, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E of kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.onReceiveOrNull?>");
        return receiveChannel.getOnReceiveOrNull();
    }

    public static final /* synthetic */ Object receiveOrNull(ReceiveChannel receiveChannel, kotlin.coroutines.c cVar) {
        s.checkNotNull(receiveChannel, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E of kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.receiveOrNull?>");
        return receiveChannel.receiveOrNull(cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006f A[Catch: all -> 0x0039, TryCatch #2 {all -> 0x0039, blocks: (B:11:0x0035, B:12:0x0067, B:14:0x006f, B:29:0x0078), top: B:10:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #2 {all -> 0x0039, blocks: (B:11:0x0035, B:12:0x0067, B:14:0x006f, B:29:0x0078), top: B:10:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0064 -> B:12:0x0067). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <E> Object toList(ReceiveChannel receiveChannel, kotlin.coroutines.c cVar) {
        ChannelsKt__Channels_commonKt$toList$1 channelsKt__Channels_commonKt$toList$1;
        Object coroutine_suspended;
        int i8;
        ReceiveChannel receiveChannel2;
        Throwable th;
        List list;
        ChannelIterator it;
        List list2;
        Object hasNext;
        if (cVar instanceof ChannelsKt__Channels_commonKt$toList$1) {
            channelsKt__Channels_commonKt$toList$1 = (ChannelsKt__Channels_commonKt$toList$1) cVar;
            int i9 = channelsKt__Channels_commonKt$toList$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                channelsKt__Channels_commonKt$toList$1.label = i9 - Integer.MIN_VALUE;
                Object obj = channelsKt__Channels_commonKt$toList$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = channelsKt__Channels_commonKt$toList$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    try {
                        List createListBuilder = q.createListBuilder();
                        list = createListBuilder;
                        receiveChannel2 = receiveChannel;
                        it = receiveChannel.iterator();
                        list2 = createListBuilder;
                        channelsKt__Channels_commonKt$toList$1.L$0 = list;
                        channelsKt__Channels_commonKt$toList$1.L$1 = list2;
                        channelsKt__Channels_commonKt$toList$1.L$2 = receiveChannel2;
                        channelsKt__Channels_commonKt$toList$1.L$3 = it;
                        channelsKt__Channels_commonKt$toList$1.label = 1;
                        hasNext = it.hasNext(channelsKt__Channels_commonKt$toList$1);
                        if (hasNext != coroutine_suspended) {
                        }
                    } catch (Throwable th2) {
                        receiveChannel2 = receiveChannel;
                        th = th2;
                        throw th;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (ChannelIterator) channelsKt__Channels_commonKt$toList$1.L$3;
                    ReceiveChannel receiveChannel3 = (ReceiveChannel) channelsKt__Channels_commonKt$toList$1.L$2;
                    List list3 = (List) channelsKt__Channels_commonKt$toList$1.L$1;
                    list = (List) channelsKt__Channels_commonKt$toList$1.L$0;
                    try {
                        y5.g.throwOnFailure(obj);
                        List list4 = list3;
                        if (!((Boolean) obj).booleanValue()) {
                            list4.add(it.next());
                            receiveChannel2 = receiveChannel3;
                            list2 = list4;
                            try {
                                channelsKt__Channels_commonKt$toList$1.L$0 = list;
                                channelsKt__Channels_commonKt$toList$1.L$1 = list2;
                                channelsKt__Channels_commonKt$toList$1.L$2 = receiveChannel2;
                                channelsKt__Channels_commonKt$toList$1.L$3 = it;
                                channelsKt__Channels_commonKt$toList$1.label = 1;
                                hasNext = it.hasNext(channelsKt__Channels_commonKt$toList$1);
                                if (hasNext != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                receiveChannel3 = receiveChannel2;
                                obj = hasNext;
                                list4 = list2;
                                if (!((Boolean) obj).booleanValue()) {
                                    w wVar = w.INSTANCE;
                                    g.cancelConsumed(receiveChannel3, null);
                                    return q.build(list);
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                try {
                                    throw th;
                                } catch (Throwable th4) {
                                    g.cancelConsumed(receiveChannel2, th);
                                    throw th4;
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        receiveChannel2 = receiveChannel3;
                        throw th;
                    }
                }
            }
        }
        channelsKt__Channels_commonKt$toList$1 = new ChannelsKt__Channels_commonKt$toList$1(cVar);
        Object obj2 = channelsKt__Channels_commonKt$toList$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = channelsKt__Channels_commonKt$toList$1.label;
        if (i8 != 0) {
        }
    }

    public static final <E, R> R consume(ReceiveChannel receiveChannel, f6.l lVar) {
        try {
            R r8 = (R) lVar.invoke(receiveChannel);
            r.finallyStart(1);
            g.cancelConsumed(receiveChannel, null);
            r.finallyEnd(1);
            return r8;
        } finally {
        }
    }

    private static final <E> Object consumeEach$$forInline(a aVar, f6.l lVar, kotlin.coroutines.c cVar) {
        ReceiveChannel a8 = aVar.a();
        try {
            ChannelIterator it = a8.iterator();
            while (true) {
                r.mark(3);
                r.mark(0);
                Object hasNext = it.hasNext(null);
                r.mark(1);
                if (!((Boolean) hasNext).booleanValue()) {
                    w wVar = w.INSTANCE;
                    r.finallyStart(1);
                    ReceiveChannel.DefaultImpls.cancel$default(a8, (CancellationException) null, 1, (Object) null);
                    r.finallyEnd(1);
                    return w.INSTANCE;
                }
                lVar.invoke(it.next());
            }
        } catch (Throwable th) {
            r.finallyStart(1);
            ReceiveChannel.DefaultImpls.cancel$default(a8, (CancellationException) null, 1, (Object) null);
            r.finallyEnd(1);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006e A[Catch: all -> 0x0079, TryCatch #0 {all -> 0x0079, blocks: (B:15:0x0066, B:17:0x006e, B:29:0x007c), top: B:14:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c A[Catch: all -> 0x0079, TRY_LEAVE, TryCatch #0 {all -> 0x0079, blocks: (B:15:0x0066, B:17:0x006e, B:29:0x007c), top: B:14:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0062 -> B:13:0x0038). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <E> Object consumeEach(a aVar, f6.l lVar, kotlin.coroutines.c cVar) {
        ChannelsKt__Channels_commonKt$consumeEach$3 channelsKt__Channels_commonKt$consumeEach$3;
        Object coroutine_suspended;
        int i8;
        ReceiveChannel receiveChannel;
        Throwable th;
        ReceiveChannel receiveChannel2;
        ChannelIterator it;
        Object hasNext;
        if (cVar instanceof ChannelsKt__Channels_commonKt$consumeEach$3) {
            channelsKt__Channels_commonKt$consumeEach$3 = (ChannelsKt__Channels_commonKt$consumeEach$3) cVar;
            int i9 = channelsKt__Channels_commonKt$consumeEach$3.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                channelsKt__Channels_commonKt$consumeEach$3.label = i9 - Integer.MIN_VALUE;
                Object obj = channelsKt__Channels_commonKt$consumeEach$3.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = channelsKt__Channels_commonKt$consumeEach$3.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    ReceiveChannel a8 = aVar.a();
                    try {
                        receiveChannel2 = a8;
                        it = a8.iterator();
                        channelsKt__Channels_commonKt$consumeEach$3.L$0 = lVar;
                        channelsKt__Channels_commonKt$consumeEach$3.L$1 = receiveChannel2;
                        channelsKt__Channels_commonKt$consumeEach$3.L$2 = it;
                        channelsKt__Channels_commonKt$consumeEach$3.label = 1;
                        hasNext = it.hasNext(channelsKt__Channels_commonKt$consumeEach$3);
                        if (hasNext != coroutine_suspended) {
                        }
                    } catch (Throwable th2) {
                        receiveChannel = a8;
                        th = th2;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (ChannelIterator) channelsKt__Channels_commonKt$consumeEach$3.L$2;
                    receiveChannel = (ReceiveChannel) channelsKt__Channels_commonKt$consumeEach$3.L$1;
                    f6.l lVar2 = (f6.l) channelsKt__Channels_commonKt$consumeEach$3.L$0;
                    try {
                        y5.g.throwOnFailure(obj);
                        ChannelsKt__Channels_commonKt$consumeEach$3 channelsKt__Channels_commonKt$consumeEach$32 = channelsKt__Channels_commonKt$consumeEach$3;
                        ReceiveChannel receiveChannel3 = receiveChannel;
                        lVar = lVar2;
                        Object obj2 = coroutine_suspended;
                        ChannelsKt__Channels_commonKt$consumeEach$3 channelsKt__Channels_commonKt$consumeEach$33 = channelsKt__Channels_commonKt$consumeEach$32;
                        try {
                            if (!((Boolean) obj).booleanValue()) {
                                lVar.invoke(it.next());
                                receiveChannel2 = receiveChannel3;
                                channelsKt__Channels_commonKt$consumeEach$3 = channelsKt__Channels_commonKt$consumeEach$33;
                                coroutine_suspended = obj2;
                                try {
                                    channelsKt__Channels_commonKt$consumeEach$3.L$0 = lVar;
                                    channelsKt__Channels_commonKt$consumeEach$3.L$1 = receiveChannel2;
                                    channelsKt__Channels_commonKt$consumeEach$3.L$2 = it;
                                    channelsKt__Channels_commonKt$consumeEach$3.label = 1;
                                    hasNext = it.hasNext(channelsKt__Channels_commonKt$consumeEach$3);
                                    if (hasNext != coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    channelsKt__Channels_commonKt$consumeEach$32 = channelsKt__Channels_commonKt$consumeEach$3;
                                    receiveChannel3 = receiveChannel2;
                                    obj = hasNext;
                                    Object obj22 = coroutine_suspended;
                                    ChannelsKt__Channels_commonKt$consumeEach$3 channelsKt__Channels_commonKt$consumeEach$332 = channelsKt__Channels_commonKt$consumeEach$32;
                                    if (!((Boolean) obj).booleanValue()) {
                                        w wVar = w.INSTANCE;
                                        r.finallyStart(1);
                                        ReceiveChannel.DefaultImpls.cancel$default(receiveChannel3, (CancellationException) null, 1, (Object) null);
                                        r.finallyEnd(1);
                                        return w.INSTANCE;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    receiveChannel = receiveChannel2;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            receiveChannel = receiveChannel3;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
                r.finallyStart(1);
                ReceiveChannel.DefaultImpls.cancel$default(receiveChannel, (CancellationException) null, 1, (Object) null);
                r.finallyEnd(1);
                throw th;
            }
        }
        channelsKt__Channels_commonKt$consumeEach$3 = new ChannelsKt__Channels_commonKt$consumeEach$3(cVar);
        Object obj3 = channelsKt__Channels_commonKt$consumeEach$3.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = channelsKt__Channels_commonKt$consumeEach$3.label;
        if (i8 != 0) {
        }
        r.finallyStart(1);
        ReceiveChannel.DefaultImpls.cancel$default(receiveChannel, (CancellationException) null, 1, (Object) null);
        r.finallyEnd(1);
        throw th;
    }
}
