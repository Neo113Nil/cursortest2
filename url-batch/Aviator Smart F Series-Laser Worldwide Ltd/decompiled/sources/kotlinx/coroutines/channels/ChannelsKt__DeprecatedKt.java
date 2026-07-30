package kotlinx.coroutines.channels;

import f6.p;
import f6.q;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.t0;
import y5.w;

/* loaded from: classes5.dex */
abstract /* synthetic */ class ChannelsKt__DeprecatedKt {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object any(ReceiveChannel receiveChannel, kotlin.coroutines.c cVar) {
        ChannelsKt__DeprecatedKt$any$1 channelsKt__DeprecatedKt$any$1;
        Object coroutine_suspended;
        int i8;
        try {
            if (cVar instanceof ChannelsKt__DeprecatedKt$any$1) {
                channelsKt__DeprecatedKt$any$1 = (ChannelsKt__DeprecatedKt$any$1) cVar;
                int i9 = channelsKt__DeprecatedKt$any$1.label;
                if ((i9 & Integer.MIN_VALUE) != 0) {
                    channelsKt__DeprecatedKt$any$1.label = i9 - Integer.MIN_VALUE;
                    Object obj = channelsKt__DeprecatedKt$any$1.result;
                    coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                    i8 = channelsKt__DeprecatedKt$any$1.label;
                    if (i8 != 0) {
                        y5.g.throwOnFailure(obj);
                        ChannelIterator it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$any$1.L$0 = receiveChannel;
                        channelsKt__DeprecatedKt$any$1.label = 1;
                        obj = it.hasNext(channelsKt__DeprecatedKt$any$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i8 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        receiveChannel = (ReceiveChannel) channelsKt__DeprecatedKt$any$1.L$0;
                        y5.g.throwOnFailure(obj);
                    }
                    g.cancelConsumed(receiveChannel, null);
                    return obj;
                }
            }
            if (i8 != 0) {
            }
            g.cancelConsumed(receiveChannel, null);
            return obj;
        } finally {
        }
        channelsKt__DeprecatedKt$any$1 = new ChannelsKt__DeprecatedKt$any$1(cVar);
        Object obj2 = channelsKt__DeprecatedKt$any$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = channelsKt__DeprecatedKt$any$1.label;
    }

    public static final f6.l consumes(final ReceiveChannel receiveChannel) {
        return new f6.l() { // from class: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumes$1
            {
                super(1);
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return w.INSTANCE;
            }

            public final void invoke(Throwable th) {
                g.cancelConsumed(ReceiveChannel.this, th);
            }
        };
    }

    public static final f6.l consumesAll(final ReceiveChannel... receiveChannelArr) {
        return new f6.l() { // from class: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumesAll$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return w.INSTANCE;
            }

            public final void invoke(Throwable th) {
                Throwable th2 = null;
                for (ReceiveChannel receiveChannel : receiveChannelArr) {
                    try {
                        g.cancelConsumed(receiveChannel, th);
                    } catch (Throwable th3) {
                        if (th2 == null) {
                            th2 = th3;
                        } else {
                            y5.b.addSuppressed(th2, th3);
                        }
                    }
                }
                if (th2 != null) {
                    throw th2;
                }
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0068 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x0060, B:14:0x0068, B:30:0x0072), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x0060, B:14:0x0068, B:30:0x0072), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x005d -> B:12:0x0060). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object count(ReceiveChannel receiveChannel, kotlin.coroutines.c cVar) {
        ChannelsKt__DeprecatedKt$count$1 channelsKt__DeprecatedKt$count$1;
        Object coroutine_suspended;
        int i8;
        ReceiveChannel receiveChannel2;
        Throwable th;
        Ref$IntRef ref$IntRef;
        ReceiveChannel receiveChannel3;
        ChannelIterator it;
        Object hasNext;
        if (cVar instanceof ChannelsKt__DeprecatedKt$count$1) {
            channelsKt__DeprecatedKt$count$1 = (ChannelsKt__DeprecatedKt$count$1) cVar;
            int i9 = channelsKt__DeprecatedKt$count$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$count$1.label = i9 - Integer.MIN_VALUE;
                Object obj = channelsKt__DeprecatedKt$count$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = channelsKt__DeprecatedKt$count$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    try {
                        ref$IntRef = new Ref$IntRef();
                        receiveChannel3 = receiveChannel;
                        it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$count$1.L$0 = ref$IntRef;
                        channelsKt__DeprecatedKt$count$1.L$1 = receiveChannel3;
                        channelsKt__DeprecatedKt$count$1.L$2 = it;
                        channelsKt__DeprecatedKt$count$1.label = 1;
                        hasNext = it.hasNext(channelsKt__DeprecatedKt$count$1);
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
                    it = (ChannelIterator) channelsKt__DeprecatedKt$count$1.L$2;
                    receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$count$1.L$1;
                    ref$IntRef = (Ref$IntRef) channelsKt__DeprecatedKt$count$1.L$0;
                    try {
                        y5.g.throwOnFailure(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            it.next();
                            ref$IntRef.element++;
                            receiveChannel3 = receiveChannel2;
                            try {
                                channelsKt__DeprecatedKt$count$1.L$0 = ref$IntRef;
                                channelsKt__DeprecatedKt$count$1.L$1 = receiveChannel3;
                                channelsKt__DeprecatedKt$count$1.L$2 = it;
                                channelsKt__DeprecatedKt$count$1.label = 1;
                                hasNext = it.hasNext(channelsKt__DeprecatedKt$count$1);
                                if (hasNext != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                receiveChannel2 = receiveChannel3;
                                obj = hasNext;
                                if (!((Boolean) obj).booleanValue()) {
                                    w wVar = w.INSTANCE;
                                    g.cancelConsumed(receiveChannel2, null);
                                    return kotlin.coroutines.jvm.internal.a.boxInt(ref$IntRef.element);
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                receiveChannel2 = receiveChannel3;
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
                        throw th;
                    }
                }
            }
        }
        channelsKt__DeprecatedKt$count$1 = new ChannelsKt__DeprecatedKt$count$1(cVar);
        Object obj2 = channelsKt__DeprecatedKt$count$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = channelsKt__DeprecatedKt$count$1.label;
        if (i8 != 0) {
        }
    }

    public static final <E, K> ReceiveChannel distinctBy(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, p pVar) {
        return ProduceKt.produce$default(e1.INSTANCE, coroutineContext, 0, null, g.consumes(receiveChannel), new ChannelsKt__DeprecatedKt$distinctBy$1(receiveChannel, pVar, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel distinctBy$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, p pVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            coroutineContext = t0.getUnconfined();
        }
        return g.distinctBy(receiveChannel, coroutineContext, pVar);
    }

    public static final /* synthetic */ ReceiveChannel drop(ReceiveChannel receiveChannel, int i8, CoroutineContext coroutineContext) {
        return ProduceKt.produce$default(e1.INSTANCE, coroutineContext, 0, null, g.consumes(receiveChannel), new ChannelsKt__DeprecatedKt$drop$1(i8, receiveChannel, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel drop$default(ReceiveChannel receiveChannel, int i8, CoroutineContext coroutineContext, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            coroutineContext = t0.getUnconfined();
        }
        return drop(receiveChannel, i8, coroutineContext);
    }

    public static final /* synthetic */ ReceiveChannel dropWhile(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, p pVar) {
        return ProduceKt.produce$default(e1.INSTANCE, coroutineContext, 0, null, g.consumes(receiveChannel), new ChannelsKt__DeprecatedKt$dropWhile$1(receiveChannel, pVar, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel dropWhile$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, p pVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            coroutineContext = t0.getUnconfined();
        }
        return dropWhile(receiveChannel, coroutineContext, pVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006c A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #2 {all -> 0x0039, blocks: (B:12:0x0035, B:13:0x0064, B:15:0x006c, B:26:0x007d, B:27:0x0094), top: B:11:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d A[Catch: all -> 0x0039, TRY_ENTER, TryCatch #2 {all -> 0x0039, blocks: (B:12:0x0035, B:13:0x0064, B:15:0x006c, B:26:0x007d, B:27:0x0094), top: B:11:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x005f -> B:13:0x0064). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object elementAt(ReceiveChannel receiveChannel, int i8, kotlin.coroutines.c cVar) {
        ChannelsKt__DeprecatedKt$elementAt$1 channelsKt__DeprecatedKt$elementAt$1;
        Object coroutine_suspended;
        int i9;
        ReceiveChannel receiveChannel2;
        Throwable th;
        ChannelIterator it;
        int i10;
        Object hasNext;
        try {
            if (cVar instanceof ChannelsKt__DeprecatedKt$elementAt$1) {
                channelsKt__DeprecatedKt$elementAt$1 = (ChannelsKt__DeprecatedKt$elementAt$1) cVar;
                int i11 = channelsKt__DeprecatedKt$elementAt$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    channelsKt__DeprecatedKt$elementAt$1.label = i11 - Integer.MIN_VALUE;
                    Object obj = channelsKt__DeprecatedKt$elementAt$1.result;
                    coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                    i9 = channelsKt__DeprecatedKt$elementAt$1.label;
                    if (i9 != 0) {
                        y5.g.throwOnFailure(obj);
                        if (i8 < 0) {
                            throw new IndexOutOfBoundsException("ReceiveChannel doesn't contain element at index " + i8 + '.');
                        }
                        it = receiveChannel.iterator();
                        i10 = 0;
                        channelsKt__DeprecatedKt$elementAt$1.L$0 = receiveChannel;
                        channelsKt__DeprecatedKt$elementAt$1.L$1 = it;
                        channelsKt__DeprecatedKt$elementAt$1.I$0 = i8;
                        channelsKt__DeprecatedKt$elementAt$1.I$1 = i10;
                        channelsKt__DeprecatedKt$elementAt$1.label = 1;
                        hasNext = it.hasNext(channelsKt__DeprecatedKt$elementAt$1);
                        if (hasNext != coroutine_suspended) {
                        }
                    } else {
                        if (i9 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i12 = channelsKt__DeprecatedKt$elementAt$1.I$1;
                        i8 = channelsKt__DeprecatedKt$elementAt$1.I$0;
                        ChannelIterator channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$elementAt$1.L$1;
                        receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$elementAt$1.L$0;
                        try {
                            y5.g.throwOnFailure(obj);
                            if (!((Boolean) obj).booleanValue()) {
                                Object next = channelIterator.next();
                                int i13 = i12 + 1;
                                if (i8 == i12) {
                                    g.cancelConsumed(receiveChannel2, null);
                                    return next;
                                }
                                it = channelIterator;
                                receiveChannel = receiveChannel2;
                                i10 = i13;
                                channelsKt__DeprecatedKt$elementAt$1.L$0 = receiveChannel;
                                channelsKt__DeprecatedKt$elementAt$1.L$1 = it;
                                channelsKt__DeprecatedKt$elementAt$1.I$0 = i8;
                                channelsKt__DeprecatedKt$elementAt$1.I$1 = i10;
                                channelsKt__DeprecatedKt$elementAt$1.label = 1;
                                hasNext = it.hasNext(channelsKt__DeprecatedKt$elementAt$1);
                                if (hasNext != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                receiveChannel2 = receiveChannel;
                                i12 = i10;
                                channelIterator = it;
                                obj = hasNext;
                                if (!((Boolean) obj).booleanValue()) {
                                    throw new IndexOutOfBoundsException("ReceiveChannel doesn't contain element at index " + i8 + '.');
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                g.cancelConsumed(receiveChannel2, th);
                                throw th3;
                            }
                        }
                    }
                }
            }
            if (i9 != 0) {
            }
        } catch (Throwable th4) {
            receiveChannel2 = receiveChannel;
            th = th4;
        }
        channelsKt__DeprecatedKt$elementAt$1 = new ChannelsKt__DeprecatedKt$elementAt$1(cVar);
        Object obj2 = channelsKt__DeprecatedKt$elementAt$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i9 = channelsKt__DeprecatedKt$elementAt$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0072 A[Catch: all -> 0x0083, TRY_LEAVE, TryCatch #0 {all -> 0x0083, blocks: (B:13:0x006a, B:15:0x0072, B:22:0x0054, B:46:0x004f), top: B:45:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0065 -> B:13:0x006a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object elementAtOrNull(ReceiveChannel receiveChannel, int i8, kotlin.coroutines.c cVar) {
        ChannelsKt__DeprecatedKt$elementAtOrNull$1 channelsKt__DeprecatedKt$elementAtOrNull$1;
        Object coroutine_suspended;
        int i9;
        ChannelIterator it;
        int i10;
        Throwable th;
        ReceiveChannel receiveChannel2;
        Object hasNext;
        if (cVar instanceof ChannelsKt__DeprecatedKt$elementAtOrNull$1) {
            channelsKt__DeprecatedKt$elementAtOrNull$1 = (ChannelsKt__DeprecatedKt$elementAtOrNull$1) cVar;
            int i11 = channelsKt__DeprecatedKt$elementAtOrNull$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$elementAtOrNull$1.label = i11 - Integer.MIN_VALUE;
                Object obj = channelsKt__DeprecatedKt$elementAtOrNull$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i9 = channelsKt__DeprecatedKt$elementAtOrNull$1.label;
                if (i9 != 0) {
                    y5.g.throwOnFailure(obj);
                    if (i8 < 0) {
                        g.cancelConsumed(receiveChannel, null);
                        return null;
                    }
                    try {
                        it = receiveChannel.iterator();
                        i10 = 0;
                        channelsKt__DeprecatedKt$elementAtOrNull$1.L$0 = receiveChannel;
                        channelsKt__DeprecatedKt$elementAtOrNull$1.L$1 = it;
                        channelsKt__DeprecatedKt$elementAtOrNull$1.I$0 = i8;
                        channelsKt__DeprecatedKt$elementAtOrNull$1.I$1 = i10;
                        channelsKt__DeprecatedKt$elementAtOrNull$1.label = 1;
                        hasNext = it.hasNext(channelsKt__DeprecatedKt$elementAtOrNull$1);
                        if (hasNext != coroutine_suspended) {
                        }
                    } catch (Throwable th2) {
                        receiveChannel2 = receiveChannel;
                        th = th2;
                        throw th;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i12 = channelsKt__DeprecatedKt$elementAtOrNull$1.I$1;
                    i8 = channelsKt__DeprecatedKt$elementAtOrNull$1.I$0;
                    ChannelIterator channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$elementAtOrNull$1.L$1;
                    receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$elementAtOrNull$1.L$0;
                    try {
                        y5.g.throwOnFailure(obj);
                        i10 = i12;
                        receiveChannel = receiveChannel2;
                        Object obj2 = coroutine_suspended;
                        ChannelsKt__DeprecatedKt$elementAtOrNull$1 channelsKt__DeprecatedKt$elementAtOrNull$12 = channelsKt__DeprecatedKt$elementAtOrNull$1;
                        ChannelIterator channelIterator2 = channelIterator;
                        if (!((Boolean) obj).booleanValue()) {
                            Object next = channelIterator2.next();
                            int i13 = i10 + 1;
                            if (i8 == i10) {
                                g.cancelConsumed(receiveChannel, null);
                                return next;
                            }
                            it = channelIterator2;
                            channelsKt__DeprecatedKt$elementAtOrNull$1 = channelsKt__DeprecatedKt$elementAtOrNull$12;
                            coroutine_suspended = obj2;
                            i10 = i13;
                            channelsKt__DeprecatedKt$elementAtOrNull$1.L$0 = receiveChannel;
                            channelsKt__DeprecatedKt$elementAtOrNull$1.L$1 = it;
                            channelsKt__DeprecatedKt$elementAtOrNull$1.I$0 = i8;
                            channelsKt__DeprecatedKt$elementAtOrNull$1.I$1 = i10;
                            channelsKt__DeprecatedKt$elementAtOrNull$1.label = 1;
                            hasNext = it.hasNext(channelsKt__DeprecatedKt$elementAtOrNull$1);
                            if (hasNext != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            ChannelsKt__DeprecatedKt$elementAtOrNull$1 channelsKt__DeprecatedKt$elementAtOrNull$13 = channelsKt__DeprecatedKt$elementAtOrNull$1;
                            channelIterator2 = it;
                            obj = hasNext;
                            obj2 = coroutine_suspended;
                            channelsKt__DeprecatedKt$elementAtOrNull$12 = channelsKt__DeprecatedKt$elementAtOrNull$13;
                            if (!((Boolean) obj).booleanValue()) {
                                g.cancelConsumed(receiveChannel, null);
                                return null;
                            }
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
            }
        }
        channelsKt__DeprecatedKt$elementAtOrNull$1 = new ChannelsKt__DeprecatedKt$elementAtOrNull$1(cVar);
        Object obj3 = channelsKt__DeprecatedKt$elementAtOrNull$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i9 = channelsKt__DeprecatedKt$elementAtOrNull$1.label;
        if (i9 != 0) {
        }
    }

    public static final <E> ReceiveChannel filter(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, p pVar) {
        return ProduceKt.produce$default(e1.INSTANCE, coroutineContext, 0, null, g.consumes(receiveChannel), new ChannelsKt__DeprecatedKt$filter$1(receiveChannel, pVar, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel filter$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, p pVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            coroutineContext = t0.getUnconfined();
        }
        return g.filter(receiveChannel, coroutineContext, pVar);
    }

    public static final /* synthetic */ ReceiveChannel filterIndexed(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, q qVar) {
        return ProduceKt.produce$default(e1.INSTANCE, coroutineContext, 0, null, g.consumes(receiveChannel), new ChannelsKt__DeprecatedKt$filterIndexed$1(receiveChannel, qVar, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel filterIndexed$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, q qVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            coroutineContext = t0.getUnconfined();
        }
        return filterIndexed(receiveChannel, coroutineContext, qVar);
    }

    public static final /* synthetic */ ReceiveChannel filterNot(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, p pVar) {
        return g.filter(receiveChannel, coroutineContext, new ChannelsKt__DeprecatedKt$filterNot$1(pVar, null));
    }

    public static /* synthetic */ ReceiveChannel filterNot$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, p pVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            coroutineContext = t0.getUnconfined();
        }
        return filterNot(receiveChannel, coroutineContext, pVar);
    }

    public static final <E> ReceiveChannel filterNotNull(ReceiveChannel receiveChannel) {
        ReceiveChannel filter$default = filter$default(receiveChannel, null, new ChannelsKt__DeprecatedKt$filterNotNull$1(null), 1, null);
        s.checkNotNull(filter$default, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E of kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.filterNotNull>");
        return filter$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x005c, B:14:0x0064, B:16:0x006a, B:18:0x004a, B:23:0x006f), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x005c, B:14:0x0064, B:16:0x006a, B:18:0x004a, B:23:0x006f), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0059 -> B:12:0x005c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object filterNotNullTo(ReceiveChannel receiveChannel, Collection collection, kotlin.coroutines.c cVar) {
        ChannelsKt__DeprecatedKt$filterNotNullTo$1 channelsKt__DeprecatedKt$filterNotNullTo$1;
        Object coroutine_suspended;
        int i8;
        ReceiveChannel receiveChannel2;
        Throwable th;
        ChannelIterator it;
        Collection collection2;
        Object hasNext;
        if (cVar instanceof ChannelsKt__DeprecatedKt$filterNotNullTo$1) {
            channelsKt__DeprecatedKt$filterNotNullTo$1 = (ChannelsKt__DeprecatedKt$filterNotNullTo$1) cVar;
            int i9 = channelsKt__DeprecatedKt$filterNotNullTo$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$filterNotNullTo$1.label = i9 - Integer.MIN_VALUE;
                Object obj = channelsKt__DeprecatedKt$filterNotNullTo$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = channelsKt__DeprecatedKt$filterNotNullTo$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    try {
                        receiveChannel2 = receiveChannel;
                        it = receiveChannel.iterator();
                        collection2 = collection;
                        channelsKt__DeprecatedKt$filterNotNullTo$1.L$0 = collection2;
                        channelsKt__DeprecatedKt$filterNotNullTo$1.L$1 = receiveChannel2;
                        channelsKt__DeprecatedKt$filterNotNullTo$1.L$2 = it;
                        channelsKt__DeprecatedKt$filterNotNullTo$1.label = 1;
                        hasNext = it.hasNext(channelsKt__DeprecatedKt$filterNotNullTo$1);
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
                    it = (ChannelIterator) channelsKt__DeprecatedKt$filterNotNullTo$1.L$2;
                    receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$filterNotNullTo$1.L$1;
                    Collection collection3 = (Collection) channelsKt__DeprecatedKt$filterNotNullTo$1.L$0;
                    try {
                        y5.g.throwOnFailure(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            w wVar = w.INSTANCE;
                            g.cancelConsumed(receiveChannel2, null);
                            return collection3;
                        }
                        Object next = it.next();
                        if (next != null) {
                            collection3.add(next);
                        }
                        collection2 = collection3;
                        channelsKt__DeprecatedKt$filterNotNullTo$1.L$0 = collection2;
                        channelsKt__DeprecatedKt$filterNotNullTo$1.L$1 = receiveChannel2;
                        channelsKt__DeprecatedKt$filterNotNullTo$1.L$2 = it;
                        channelsKt__DeprecatedKt$filterNotNullTo$1.label = 1;
                        hasNext = it.hasNext(channelsKt__DeprecatedKt$filterNotNullTo$1);
                        if (hasNext != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        collection3 = collection2;
                        obj = hasNext;
                        if (!((Boolean) obj).booleanValue()) {
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
            }
        }
        channelsKt__DeprecatedKt$filterNotNullTo$1 = new ChannelsKt__DeprecatedKt$filterNotNullTo$1(cVar);
        Object obj2 = channelsKt__DeprecatedKt$filterNotNullTo$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = channelsKt__DeprecatedKt$filterNotNullTo$1.label;
        if (i8 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005b A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #1 {all -> 0x0031, blocks: (B:11:0x002d, B:12:0x0053, B:14:0x005b, B:18:0x0064, B:19:0x006b), top: B:10:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064 A[Catch: all -> 0x0031, TRY_ENTER, TryCatch #1 {all -> 0x0031, blocks: (B:11:0x002d, B:12:0x0053, B:14:0x005b, B:18:0x0064, B:19:0x006b), top: B:10:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object first(ReceiveChannel receiveChannel, kotlin.coroutines.c cVar) {
        ChannelsKt__DeprecatedKt$first$1 channelsKt__DeprecatedKt$first$1;
        Object obj;
        Object coroutine_suspended;
        int i8;
        ReceiveChannel receiveChannel2;
        Throwable th;
        ChannelIterator channelIterator;
        if (cVar instanceof ChannelsKt__DeprecatedKt$first$1) {
            channelsKt__DeprecatedKt$first$1 = (ChannelsKt__DeprecatedKt$first$1) cVar;
            int i9 = channelsKt__DeprecatedKt$first$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$first$1.label = i9 - Integer.MIN_VALUE;
                obj = channelsKt__DeprecatedKt$first$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = channelsKt__DeprecatedKt$first$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    try {
                        ChannelIterator it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$first$1.L$0 = receiveChannel;
                        channelsKt__DeprecatedKt$first$1.L$1 = it;
                        channelsKt__DeprecatedKt$first$1.label = 1;
                        Object hasNext = it.hasNext(channelsKt__DeprecatedKt$first$1);
                        if (hasNext == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        receiveChannel2 = receiveChannel;
                        channelIterator = it;
                        obj = hasNext;
                    } catch (Throwable th2) {
                        receiveChannel2 = receiveChannel;
                        th = th2;
                        throw th;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$first$1.L$1;
                    receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$first$1.L$0;
                    try {
                        y5.g.throwOnFailure(obj);
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
                if (((Boolean) obj).booleanValue()) {
                    throw new NoSuchElementException("ReceiveChannel is empty.");
                }
                Object next = channelIterator.next();
                g.cancelConsumed(receiveChannel2, null);
                return next;
            }
        }
        channelsKt__DeprecatedKt$first$1 = new ChannelsKt__DeprecatedKt$first$1(cVar);
        obj = channelsKt__DeprecatedKt$first$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = channelsKt__DeprecatedKt$first$1.label;
        if (i8 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[Catch: all -> 0x0031, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:11:0x002d, B:12:0x0053, B:18:0x0060), top: B:10:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object firstOrNull(ReceiveChannel receiveChannel, kotlin.coroutines.c cVar) {
        ChannelsKt__DeprecatedKt$firstOrNull$1 channelsKt__DeprecatedKt$firstOrNull$1;
        Object obj;
        Object coroutine_suspended;
        int i8;
        ReceiveChannel receiveChannel2;
        Throwable th;
        ChannelIterator channelIterator;
        if (cVar instanceof ChannelsKt__DeprecatedKt$firstOrNull$1) {
            channelsKt__DeprecatedKt$firstOrNull$1 = (ChannelsKt__DeprecatedKt$firstOrNull$1) cVar;
            int i9 = channelsKt__DeprecatedKt$firstOrNull$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$firstOrNull$1.label = i9 - Integer.MIN_VALUE;
                obj = channelsKt__DeprecatedKt$firstOrNull$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = channelsKt__DeprecatedKt$firstOrNull$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    try {
                        ChannelIterator it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$firstOrNull$1.L$0 = receiveChannel;
                        channelsKt__DeprecatedKt$firstOrNull$1.L$1 = it;
                        channelsKt__DeprecatedKt$firstOrNull$1.label = 1;
                        Object hasNext = it.hasNext(channelsKt__DeprecatedKt$firstOrNull$1);
                        if (hasNext == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        receiveChannel2 = receiveChannel;
                        channelIterator = it;
                        obj = hasNext;
                    } catch (Throwable th2) {
                        receiveChannel2 = receiveChannel;
                        th = th2;
                        throw th;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$firstOrNull$1.L$1;
                    receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$firstOrNull$1.L$0;
                    try {
                        y5.g.throwOnFailure(obj);
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
                if (((Boolean) obj).booleanValue()) {
                    g.cancelConsumed(receiveChannel2, null);
                    return null;
                }
                Object next = channelIterator.next();
                g.cancelConsumed(receiveChannel2, null);
                return next;
            }
        }
        channelsKt__DeprecatedKt$firstOrNull$1 = new ChannelsKt__DeprecatedKt$firstOrNull$1(cVar);
        obj = channelsKt__DeprecatedKt$firstOrNull$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = channelsKt__DeprecatedKt$firstOrNull$1.label;
        if (i8 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    public static final /* synthetic */ ReceiveChannel flatMap(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, p pVar) {
        return ProduceKt.produce$default(e1.INSTANCE, coroutineContext, 0, null, g.consumes(receiveChannel), new ChannelsKt__DeprecatedKt$flatMap$1(receiveChannel, pVar, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel flatMap$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, p pVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            coroutineContext = t0.getUnconfined();
        }
        return flatMap(receiveChannel, coroutineContext, pVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0070 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:11:0x0033, B:12:0x0067, B:14:0x0070, B:16:0x007a, B:20:0x0084, B:21:0x0053, B:25:0x008b), top: B:10:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #1 {all -> 0x0037, blocks: (B:11:0x0033, B:12:0x0067, B:14:0x0070, B:16:0x007a, B:20:0x0084, B:21:0x0053, B:25:0x008b), top: B:10:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0064 -> B:12:0x0067). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object indexOf(ReceiveChannel receiveChannel, Object obj, kotlin.coroutines.c cVar) {
        ChannelsKt__DeprecatedKt$indexOf$1 channelsKt__DeprecatedKt$indexOf$1;
        Object coroutine_suspended;
        int i8;
        ReceiveChannel receiveChannel2;
        Throwable th;
        ChannelIterator it;
        Ref$IntRef ref$IntRef;
        Object obj2;
        Object hasNext;
        try {
            if (cVar instanceof ChannelsKt__DeprecatedKt$indexOf$1) {
                channelsKt__DeprecatedKt$indexOf$1 = (ChannelsKt__DeprecatedKt$indexOf$1) cVar;
                int i9 = channelsKt__DeprecatedKt$indexOf$1.label;
                if ((i9 & Integer.MIN_VALUE) != 0) {
                    channelsKt__DeprecatedKt$indexOf$1.label = i9 - Integer.MIN_VALUE;
                    Object obj3 = channelsKt__DeprecatedKt$indexOf$1.result;
                    coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                    i8 = channelsKt__DeprecatedKt$indexOf$1.label;
                    if (i8 != 0) {
                        y5.g.throwOnFailure(obj3);
                        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                        try {
                            receiveChannel2 = receiveChannel;
                            it = receiveChannel.iterator();
                            ref$IntRef = ref$IntRef2;
                            obj2 = obj;
                            channelsKt__DeprecatedKt$indexOf$1.L$0 = obj2;
                            channelsKt__DeprecatedKt$indexOf$1.L$1 = ref$IntRef;
                            channelsKt__DeprecatedKt$indexOf$1.L$2 = receiveChannel2;
                            channelsKt__DeprecatedKt$indexOf$1.L$3 = it;
                            channelsKt__DeprecatedKt$indexOf$1.label = 1;
                            hasNext = it.hasNext(channelsKt__DeprecatedKt$indexOf$1);
                            if (hasNext != coroutine_suspended) {
                            }
                        } catch (Throwable th2) {
                            receiveChannel2 = receiveChannel;
                            th = th2;
                        }
                    } else {
                        if (i8 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = (ChannelIterator) channelsKt__DeprecatedKt$indexOf$1.L$3;
                        receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$indexOf$1.L$2;
                        ref$IntRef = (Ref$IntRef) channelsKt__DeprecatedKt$indexOf$1.L$1;
                        Object obj4 = channelsKt__DeprecatedKt$indexOf$1.L$0;
                        try {
                            y5.g.throwOnFailure(obj3);
                            if (!((Boolean) obj3).booleanValue()) {
                                w wVar = w.INSTANCE;
                                g.cancelConsumed(receiveChannel2, null);
                                return kotlin.coroutines.jvm.internal.a.boxInt(-1);
                            }
                            if (s.areEqual(obj4, it.next())) {
                                Integer boxInt = kotlin.coroutines.jvm.internal.a.boxInt(ref$IntRef.element);
                                g.cancelConsumed(receiveChannel2, null);
                                return boxInt;
                            }
                            ref$IntRef.element++;
                            obj2 = obj4;
                            channelsKt__DeprecatedKt$indexOf$1.L$0 = obj2;
                            channelsKt__DeprecatedKt$indexOf$1.L$1 = ref$IntRef;
                            channelsKt__DeprecatedKt$indexOf$1.L$2 = receiveChannel2;
                            channelsKt__DeprecatedKt$indexOf$1.L$3 = it;
                            channelsKt__DeprecatedKt$indexOf$1.label = 1;
                            hasNext = it.hasNext(channelsKt__DeprecatedKt$indexOf$1);
                            if (hasNext != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            obj4 = obj2;
                            obj3 = hasNext;
                            if (!((Boolean) obj3).booleanValue()) {
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                    throw th;
                }
            }
            throw th;
        } catch (Throwable th4) {
            g.cancelConsumed(receiveChannel2, th);
            throw th4;
        }
        channelsKt__DeprecatedKt$indexOf$1 = new ChannelsKt__DeprecatedKt$indexOf$1(cVar);
        Object obj32 = channelsKt__DeprecatedKt$indexOf$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = channelsKt__DeprecatedKt$indexOf$1.label;
        if (i8 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0093 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:12:0x0032, B:13:0x008b, B:15:0x0093), top: B:11:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0071 A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #2 {all -> 0x004e, blocks: (B:40:0x004a, B:41:0x0069, B:43:0x0071, B:45:0x00a2, B:46:0x00a9), top: B:39:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a2 A[Catch: all -> 0x004e, TRY_ENTER, TryCatch #2 {all -> 0x004e, blocks: (B:40:0x004a, B:41:0x0069, B:43:0x0071, B:45:0x00a2, B:46:0x00a9), top: B:39:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0087 -> B:13:0x008b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object last(ReceiveChannel receiveChannel, kotlin.coroutines.c cVar) {
        ChannelsKt__DeprecatedKt$last$1 channelsKt__DeprecatedKt$last$1;
        Object obj;
        Object coroutine_suspended;
        int i8;
        ReceiveChannel receiveChannel2;
        ChannelIterator channelIterator;
        Object next;
        ChannelIterator channelIterator2;
        Object hasNext;
        if (cVar instanceof ChannelsKt__DeprecatedKt$last$1) {
            channelsKt__DeprecatedKt$last$1 = (ChannelsKt__DeprecatedKt$last$1) cVar;
            int i9 = channelsKt__DeprecatedKt$last$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$last$1.label = i9 - Integer.MIN_VALUE;
                obj = channelsKt__DeprecatedKt$last$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = channelsKt__DeprecatedKt$last$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    try {
                        ChannelIterator it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$last$1.L$0 = receiveChannel;
                        channelsKt__DeprecatedKt$last$1.L$1 = it;
                        channelsKt__DeprecatedKt$last$1.label = 1;
                        Object hasNext2 = it.hasNext(channelsKt__DeprecatedKt$last$1);
                        if (hasNext2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        receiveChannel2 = receiveChannel;
                        channelIterator = it;
                        obj = hasNext2;
                    } catch (Throwable th) {
                        receiveChannel2 = receiveChannel;
                        th = th;
                        throw th;
                    }
                } else if (i8 == 1) {
                    channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$last$1.L$1;
                    receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$last$1.L$0;
                    try {
                        y5.g.throwOnFailure(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    if (i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj2 = channelsKt__DeprecatedKt$last$1.L$2;
                    channelIterator2 = (ChannelIterator) channelsKt__DeprecatedKt$last$1.L$1;
                    ReceiveChannel receiveChannel3 = (ReceiveChannel) channelsKt__DeprecatedKt$last$1.L$0;
                    try {
                        y5.g.throwOnFailure(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            next = channelIterator2.next();
                            receiveChannel = receiveChannel3;
                            channelsKt__DeprecatedKt$last$1.L$0 = receiveChannel;
                            channelsKt__DeprecatedKt$last$1.L$1 = channelIterator2;
                            channelsKt__DeprecatedKt$last$1.L$2 = next;
                            channelsKt__DeprecatedKt$last$1.label = 2;
                            hasNext = channelIterator2.hasNext(channelsKt__DeprecatedKt$last$1);
                            if (hasNext != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            receiveChannel3 = receiveChannel;
                            obj2 = next;
                            obj = hasNext;
                            if (!((Boolean) obj).booleanValue()) {
                                g.cancelConsumed(receiveChannel3, null);
                                return obj2;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        receiveChannel2 = receiveChannel3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            g.cancelConsumed(receiveChannel2, th);
                            throw th4;
                        }
                    }
                }
                if (((Boolean) obj).booleanValue()) {
                    throw new NoSuchElementException("ReceiveChannel is empty.");
                }
                next = channelIterator.next();
                ReceiveChannel receiveChannel4 = receiveChannel2;
                channelIterator2 = channelIterator;
                receiveChannel = receiveChannel4;
                channelsKt__DeprecatedKt$last$1.L$0 = receiveChannel;
                channelsKt__DeprecatedKt$last$1.L$1 = channelIterator2;
                channelsKt__DeprecatedKt$last$1.L$2 = next;
                channelsKt__DeprecatedKt$last$1.label = 2;
                hasNext = channelIterator2.hasNext(channelsKt__DeprecatedKt$last$1);
                if (hasNext != coroutine_suspended) {
                }
            }
        }
        channelsKt__DeprecatedKt$last$1 = new ChannelsKt__DeprecatedKt$last$1(cVar);
        obj = channelsKt__DeprecatedKt$last$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = channelsKt__DeprecatedKt$last$1.label;
        if (i8 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007d A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:11:0x0037, B:12:0x0075, B:14:0x007d, B:16:0x0087, B:17:0x008b, B:18:0x005f, B:23:0x0092), top: B:10:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:11:0x0037, B:12:0x0075, B:14:0x007d, B:16:0x0087, B:17:0x008b, B:18:0x005f, B:23:0x0092), top: B:10:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0072 -> B:12:0x0075). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object lastIndexOf(ReceiveChannel receiveChannel, Object obj, kotlin.coroutines.c cVar) {
        ChannelsKt__DeprecatedKt$lastIndexOf$1 channelsKt__DeprecatedKt$lastIndexOf$1;
        Object coroutine_suspended;
        int i8;
        Ref$IntRef ref$IntRef;
        ReceiveChannel receiveChannel2;
        Throwable th;
        ChannelIterator it;
        Ref$IntRef ref$IntRef2;
        Object obj2;
        Object hasNext;
        if (cVar instanceof ChannelsKt__DeprecatedKt$lastIndexOf$1) {
            channelsKt__DeprecatedKt$lastIndexOf$1 = (ChannelsKt__DeprecatedKt$lastIndexOf$1) cVar;
            int i9 = channelsKt__DeprecatedKt$lastIndexOf$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$lastIndexOf$1.label = i9 - Integer.MIN_VALUE;
                Object obj3 = channelsKt__DeprecatedKt$lastIndexOf$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = channelsKt__DeprecatedKt$lastIndexOf$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj3);
                    Ref$IntRef ref$IntRef3 = new Ref$IntRef();
                    ref$IntRef3.element = -1;
                    ref$IntRef = new Ref$IntRef();
                    try {
                        receiveChannel2 = receiveChannel;
                        it = receiveChannel.iterator();
                        ref$IntRef2 = ref$IntRef3;
                        obj2 = obj;
                        channelsKt__DeprecatedKt$lastIndexOf$1.L$0 = obj2;
                        channelsKt__DeprecatedKt$lastIndexOf$1.L$1 = ref$IntRef2;
                        channelsKt__DeprecatedKt$lastIndexOf$1.L$2 = ref$IntRef;
                        channelsKt__DeprecatedKt$lastIndexOf$1.L$3 = receiveChannel2;
                        channelsKt__DeprecatedKt$lastIndexOf$1.L$4 = it;
                        channelsKt__DeprecatedKt$lastIndexOf$1.label = 1;
                        hasNext = it.hasNext(channelsKt__DeprecatedKt$lastIndexOf$1);
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
                    it = (ChannelIterator) channelsKt__DeprecatedKt$lastIndexOf$1.L$4;
                    receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$lastIndexOf$1.L$3;
                    ref$IntRef = (Ref$IntRef) channelsKt__DeprecatedKt$lastIndexOf$1.L$2;
                    ref$IntRef2 = (Ref$IntRef) channelsKt__DeprecatedKt$lastIndexOf$1.L$1;
                    Object obj4 = channelsKt__DeprecatedKt$lastIndexOf$1.L$0;
                    try {
                        y5.g.throwOnFailure(obj3);
                        if (!((Boolean) obj3).booleanValue()) {
                            w wVar = w.INSTANCE;
                            g.cancelConsumed(receiveChannel2, null);
                            return kotlin.coroutines.jvm.internal.a.boxInt(ref$IntRef2.element);
                        }
                        if (s.areEqual(obj4, it.next())) {
                            ref$IntRef2.element = ref$IntRef.element;
                        }
                        ref$IntRef.element++;
                        obj2 = obj4;
                        channelsKt__DeprecatedKt$lastIndexOf$1.L$0 = obj2;
                        channelsKt__DeprecatedKt$lastIndexOf$1.L$1 = ref$IntRef2;
                        channelsKt__DeprecatedKt$lastIndexOf$1.L$2 = ref$IntRef;
                        channelsKt__DeprecatedKt$lastIndexOf$1.L$3 = receiveChannel2;
                        channelsKt__DeprecatedKt$lastIndexOf$1.L$4 = it;
                        channelsKt__DeprecatedKt$lastIndexOf$1.label = 1;
                        hasNext = it.hasNext(channelsKt__DeprecatedKt$lastIndexOf$1);
                        if (hasNext != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj4 = obj2;
                        obj3 = hasNext;
                        if (!((Boolean) obj3).booleanValue()) {
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
            }
        }
        channelsKt__DeprecatedKt$lastIndexOf$1 = new ChannelsKt__DeprecatedKt$lastIndexOf$1(cVar);
        Object obj32 = channelsKt__DeprecatedKt$lastIndexOf$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = channelsKt__DeprecatedKt$lastIndexOf$1.label;
        if (i8 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0097 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #2 {all -> 0x0037, blocks: (B:12:0x0033, B:13:0x008f, B:15:0x0097), top: B:11:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075 A[Catch: all -> 0x004f, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x004f, blocks: (B:40:0x004b, B:41:0x0069, B:45:0x0075), top: B:39:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x008b -> B:13:0x008f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object lastOrNull(ReceiveChannel receiveChannel, kotlin.coroutines.c cVar) {
        ChannelsKt__DeprecatedKt$lastOrNull$1 channelsKt__DeprecatedKt$lastOrNull$1;
        Object obj;
        Object coroutine_suspended;
        int i8;
        ReceiveChannel receiveChannel2;
        ChannelIterator channelIterator;
        Object next;
        ChannelIterator channelIterator2;
        Object hasNext;
        if (cVar instanceof ChannelsKt__DeprecatedKt$lastOrNull$1) {
            channelsKt__DeprecatedKt$lastOrNull$1 = (ChannelsKt__DeprecatedKt$lastOrNull$1) cVar;
            int i9 = channelsKt__DeprecatedKt$lastOrNull$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$lastOrNull$1.label = i9 - Integer.MIN_VALUE;
                obj = channelsKt__DeprecatedKt$lastOrNull$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = channelsKt__DeprecatedKt$lastOrNull$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    try {
                        ChannelIterator it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$lastOrNull$1.L$0 = receiveChannel;
                        channelsKt__DeprecatedKt$lastOrNull$1.L$1 = it;
                        channelsKt__DeprecatedKt$lastOrNull$1.label = 1;
                        Object hasNext2 = it.hasNext(channelsKt__DeprecatedKt$lastOrNull$1);
                        if (hasNext2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        receiveChannel2 = receiveChannel;
                        channelIterator = it;
                        obj = hasNext2;
                    } catch (Throwable th) {
                        receiveChannel2 = receiveChannel;
                        th = th;
                        throw th;
                    }
                } else if (i8 == 1) {
                    channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$lastOrNull$1.L$1;
                    receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$lastOrNull$1.L$0;
                    try {
                        y5.g.throwOnFailure(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    if (i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj2 = channelsKt__DeprecatedKt$lastOrNull$1.L$2;
                    channelIterator2 = (ChannelIterator) channelsKt__DeprecatedKt$lastOrNull$1.L$1;
                    ReceiveChannel receiveChannel3 = (ReceiveChannel) channelsKt__DeprecatedKt$lastOrNull$1.L$0;
                    try {
                        y5.g.throwOnFailure(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            next = channelIterator2.next();
                            receiveChannel = receiveChannel3;
                            channelsKt__DeprecatedKt$lastOrNull$1.L$0 = receiveChannel;
                            channelsKt__DeprecatedKt$lastOrNull$1.L$1 = channelIterator2;
                            channelsKt__DeprecatedKt$lastOrNull$1.L$2 = next;
                            channelsKt__DeprecatedKt$lastOrNull$1.label = 2;
                            hasNext = channelIterator2.hasNext(channelsKt__DeprecatedKt$lastOrNull$1);
                            if (hasNext != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            receiveChannel3 = receiveChannel;
                            obj2 = next;
                            obj = hasNext;
                            if (!((Boolean) obj).booleanValue()) {
                                g.cancelConsumed(receiveChannel3, null);
                                return obj2;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        receiveChannel2 = receiveChannel3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            g.cancelConsumed(receiveChannel2, th);
                            throw th4;
                        }
                    }
                }
                if (((Boolean) obj).booleanValue()) {
                    g.cancelConsumed(receiveChannel2, null);
                    return null;
                }
                next = channelIterator.next();
                ReceiveChannel receiveChannel4 = receiveChannel2;
                channelIterator2 = channelIterator;
                receiveChannel = receiveChannel4;
                channelsKt__DeprecatedKt$lastOrNull$1.L$0 = receiveChannel;
                channelsKt__DeprecatedKt$lastOrNull$1.L$1 = channelIterator2;
                channelsKt__DeprecatedKt$lastOrNull$1.L$2 = next;
                channelsKt__DeprecatedKt$lastOrNull$1.label = 2;
                hasNext = channelIterator2.hasNext(channelsKt__DeprecatedKt$lastOrNull$1);
                if (hasNext != coroutine_suspended) {
                }
            }
        }
        channelsKt__DeprecatedKt$lastOrNull$1 = new ChannelsKt__DeprecatedKt$lastOrNull$1(cVar);
        obj = channelsKt__DeprecatedKt$lastOrNull$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = channelsKt__DeprecatedKt$lastOrNull$1.label;
        if (i8 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    public static final <E, R> ReceiveChannel map(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, p pVar) {
        return ProduceKt.produce$default(e1.INSTANCE, coroutineContext, 0, null, g.consumes(receiveChannel), new ChannelsKt__DeprecatedKt$map$1(receiveChannel, pVar, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel map$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, p pVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            coroutineContext = t0.getUnconfined();
        }
        return g.map(receiveChannel, coroutineContext, pVar);
    }

    public static final <E, R> ReceiveChannel mapIndexed(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, q qVar) {
        return ProduceKt.produce$default(e1.INSTANCE, coroutineContext, 0, null, g.consumes(receiveChannel), new ChannelsKt__DeprecatedKt$mapIndexed$1(receiveChannel, qVar, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel mapIndexed$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, q qVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            coroutineContext = t0.getUnconfined();
        }
        return g.mapIndexed(receiveChannel, coroutineContext, qVar);
    }

    public static final /* synthetic */ ReceiveChannel mapIndexedNotNull(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, q qVar) {
        return g.filterNotNull(g.mapIndexed(receiveChannel, coroutineContext, qVar));
    }

    public static /* synthetic */ ReceiveChannel mapIndexedNotNull$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, q qVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            coroutineContext = t0.getUnconfined();
        }
        return mapIndexedNotNull(receiveChannel, coroutineContext, qVar);
    }

    public static final /* synthetic */ ReceiveChannel mapNotNull(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, p pVar) {
        return g.filterNotNull(g.map(receiveChannel, coroutineContext, pVar));
    }

    public static /* synthetic */ ReceiveChannel mapNotNull$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, p pVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            coroutineContext = t0.getUnconfined();
        }
        return mapNotNull(receiveChannel, coroutineContext, pVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ac A[Catch: all -> 0x00bb, TRY_LEAVE, TryCatch #2 {all -> 0x00bb, blocks: (B:15:0x00a4, B:17:0x00ac, B:20:0x008f, B:55:0x0063), top: B:54:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087 A[Catch: all -> 0x005d, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x005d, blocks: (B:44:0x0059, B:45:0x007b, B:49:0x0087), top: B:43:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00a0 -> B:14:0x003d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object maxWith(ReceiveChannel receiveChannel, Comparator comparator, kotlin.coroutines.c cVar) {
        ChannelsKt__DeprecatedKt$maxWith$1 channelsKt__DeprecatedKt$maxWith$1;
        Object obj;
        Object coroutine_suspended;
        int i8;
        ReceiveChannel receiveChannel2;
        ChannelIterator channelIterator;
        Comparator comparator2;
        Object next;
        Comparator comparator3;
        ChannelIterator channelIterator2;
        Object hasNext;
        if (cVar instanceof ChannelsKt__DeprecatedKt$maxWith$1) {
            channelsKt__DeprecatedKt$maxWith$1 = (ChannelsKt__DeprecatedKt$maxWith$1) cVar;
            int i9 = channelsKt__DeprecatedKt$maxWith$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$maxWith$1.label = i9 - Integer.MIN_VALUE;
                obj = channelsKt__DeprecatedKt$maxWith$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = channelsKt__DeprecatedKt$maxWith$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    try {
                        ChannelIterator it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$maxWith$1.L$0 = comparator;
                        channelsKt__DeprecatedKt$maxWith$1.L$1 = receiveChannel;
                        channelsKt__DeprecatedKt$maxWith$1.L$2 = it;
                        channelsKt__DeprecatedKt$maxWith$1.label = 1;
                        Object hasNext2 = it.hasNext(channelsKt__DeprecatedKt$maxWith$1);
                        if (hasNext2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        receiveChannel2 = receiveChannel;
                        channelIterator = it;
                        obj = hasNext2;
                        comparator2 = comparator;
                    } catch (Throwable th) {
                        receiveChannel2 = receiveChannel;
                        th = th;
                        throw th;
                    }
                } else if (i8 == 1) {
                    channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$maxWith$1.L$2;
                    receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$maxWith$1.L$1;
                    comparator2 = (Comparator) channelsKt__DeprecatedKt$maxWith$1.L$0;
                    try {
                        y5.g.throwOnFailure(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    if (i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj2 = channelsKt__DeprecatedKt$maxWith$1.L$3;
                    channelIterator2 = (ChannelIterator) channelsKt__DeprecatedKt$maxWith$1.L$2;
                    ReceiveChannel receiveChannel3 = (ReceiveChannel) channelsKt__DeprecatedKt$maxWith$1.L$1;
                    comparator3 = (Comparator) channelsKt__DeprecatedKt$maxWith$1.L$0;
                    try {
                        y5.g.throwOnFailure(obj);
                        ChannelsKt__DeprecatedKt$maxWith$1 channelsKt__DeprecatedKt$maxWith$12 = channelsKt__DeprecatedKt$maxWith$1;
                        Object obj3 = obj2;
                        receiveChannel = receiveChannel3;
                        Object obj4 = coroutine_suspended;
                        ChannelsKt__DeprecatedKt$maxWith$1 channelsKt__DeprecatedKt$maxWith$13 = channelsKt__DeprecatedKt$maxWith$12;
                        if (!((Boolean) obj).booleanValue()) {
                            next = channelIterator2.next();
                            if (comparator3.compare(obj3, next) >= 0) {
                                next = obj3;
                            }
                            channelsKt__DeprecatedKt$maxWith$1 = channelsKt__DeprecatedKt$maxWith$13;
                            coroutine_suspended = obj4;
                            channelsKt__DeprecatedKt$maxWith$1.L$0 = comparator3;
                            channelsKt__DeprecatedKt$maxWith$1.L$1 = receiveChannel;
                            channelsKt__DeprecatedKt$maxWith$1.L$2 = channelIterator2;
                            channelsKt__DeprecatedKt$maxWith$1.L$3 = next;
                            channelsKt__DeprecatedKt$maxWith$1.label = 2;
                            hasNext = channelIterator2.hasNext(channelsKt__DeprecatedKt$maxWith$1);
                            if (hasNext != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            channelsKt__DeprecatedKt$maxWith$12 = channelsKt__DeprecatedKt$maxWith$1;
                            obj3 = next;
                            obj = hasNext;
                            Object obj42 = coroutine_suspended;
                            ChannelsKt__DeprecatedKt$maxWith$1 channelsKt__DeprecatedKt$maxWith$132 = channelsKt__DeprecatedKt$maxWith$12;
                            if (!((Boolean) obj).booleanValue()) {
                                g.cancelConsumed(receiveChannel, null);
                                return obj3;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        receiveChannel2 = receiveChannel3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            g.cancelConsumed(receiveChannel2, th);
                            throw th4;
                        }
                    }
                }
                if (((Boolean) obj).booleanValue()) {
                    g.cancelConsumed(receiveChannel2, null);
                    return null;
                }
                next = channelIterator.next();
                comparator3 = comparator2;
                ReceiveChannel receiveChannel4 = receiveChannel2;
                channelIterator2 = channelIterator;
                receiveChannel = receiveChannel4;
                channelsKt__DeprecatedKt$maxWith$1.L$0 = comparator3;
                channelsKt__DeprecatedKt$maxWith$1.L$1 = receiveChannel;
                channelsKt__DeprecatedKt$maxWith$1.L$2 = channelIterator2;
                channelsKt__DeprecatedKt$maxWith$1.L$3 = next;
                channelsKt__DeprecatedKt$maxWith$1.label = 2;
                hasNext = channelIterator2.hasNext(channelsKt__DeprecatedKt$maxWith$1);
                if (hasNext != coroutine_suspended) {
                }
            }
        }
        channelsKt__DeprecatedKt$maxWith$1 = new ChannelsKt__DeprecatedKt$maxWith$1(cVar);
        obj = channelsKt__DeprecatedKt$maxWith$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = channelsKt__DeprecatedKt$maxWith$1.label;
        if (i8 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ac A[Catch: all -> 0x00bb, TRY_LEAVE, TryCatch #2 {all -> 0x00bb, blocks: (B:15:0x00a4, B:17:0x00ac, B:20:0x008f, B:55:0x0063), top: B:54:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087 A[Catch: all -> 0x005d, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x005d, blocks: (B:44:0x0059, B:45:0x007b, B:49:0x0087), top: B:43:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00a0 -> B:14:0x003d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object minWith(ReceiveChannel receiveChannel, Comparator comparator, kotlin.coroutines.c cVar) {
        ChannelsKt__DeprecatedKt$minWith$1 channelsKt__DeprecatedKt$minWith$1;
        Object obj;
        Object coroutine_suspended;
        int i8;
        ReceiveChannel receiveChannel2;
        ChannelIterator channelIterator;
        Comparator comparator2;
        Object next;
        Comparator comparator3;
        ChannelIterator channelIterator2;
        Object hasNext;
        if (cVar instanceof ChannelsKt__DeprecatedKt$minWith$1) {
            channelsKt__DeprecatedKt$minWith$1 = (ChannelsKt__DeprecatedKt$minWith$1) cVar;
            int i9 = channelsKt__DeprecatedKt$minWith$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$minWith$1.label = i9 - Integer.MIN_VALUE;
                obj = channelsKt__DeprecatedKt$minWith$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = channelsKt__DeprecatedKt$minWith$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    try {
                        ChannelIterator it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$minWith$1.L$0 = comparator;
                        channelsKt__DeprecatedKt$minWith$1.L$1 = receiveChannel;
                        channelsKt__DeprecatedKt$minWith$1.L$2 = it;
                        channelsKt__DeprecatedKt$minWith$1.label = 1;
                        Object hasNext2 = it.hasNext(channelsKt__DeprecatedKt$minWith$1);
                        if (hasNext2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        receiveChannel2 = receiveChannel;
                        channelIterator = it;
                        obj = hasNext2;
                        comparator2 = comparator;
                    } catch (Throwable th) {
                        receiveChannel2 = receiveChannel;
                        th = th;
                        throw th;
                    }
                } else if (i8 == 1) {
                    channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$minWith$1.L$2;
                    receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$minWith$1.L$1;
                    comparator2 = (Comparator) channelsKt__DeprecatedKt$minWith$1.L$0;
                    try {
                        y5.g.throwOnFailure(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    if (i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj2 = channelsKt__DeprecatedKt$minWith$1.L$3;
                    channelIterator2 = (ChannelIterator) channelsKt__DeprecatedKt$minWith$1.L$2;
                    ReceiveChannel receiveChannel3 = (ReceiveChannel) channelsKt__DeprecatedKt$minWith$1.L$1;
                    comparator3 = (Comparator) channelsKt__DeprecatedKt$minWith$1.L$0;
                    try {
                        y5.g.throwOnFailure(obj);
                        ChannelsKt__DeprecatedKt$minWith$1 channelsKt__DeprecatedKt$minWith$12 = channelsKt__DeprecatedKt$minWith$1;
                        Object obj3 = obj2;
                        receiveChannel = receiveChannel3;
                        Object obj4 = coroutine_suspended;
                        ChannelsKt__DeprecatedKt$minWith$1 channelsKt__DeprecatedKt$minWith$13 = channelsKt__DeprecatedKt$minWith$12;
                        if (!((Boolean) obj).booleanValue()) {
                            next = channelIterator2.next();
                            if (comparator3.compare(obj3, next) <= 0) {
                                next = obj3;
                            }
                            channelsKt__DeprecatedKt$minWith$1 = channelsKt__DeprecatedKt$minWith$13;
                            coroutine_suspended = obj4;
                            channelsKt__DeprecatedKt$minWith$1.L$0 = comparator3;
                            channelsKt__DeprecatedKt$minWith$1.L$1 = receiveChannel;
                            channelsKt__DeprecatedKt$minWith$1.L$2 = channelIterator2;
                            channelsKt__DeprecatedKt$minWith$1.L$3 = next;
                            channelsKt__DeprecatedKt$minWith$1.label = 2;
                            hasNext = channelIterator2.hasNext(channelsKt__DeprecatedKt$minWith$1);
                            if (hasNext != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            channelsKt__DeprecatedKt$minWith$12 = channelsKt__DeprecatedKt$minWith$1;
                            obj3 = next;
                            obj = hasNext;
                            Object obj42 = coroutine_suspended;
                            ChannelsKt__DeprecatedKt$minWith$1 channelsKt__DeprecatedKt$minWith$132 = channelsKt__DeprecatedKt$minWith$12;
                            if (!((Boolean) obj).booleanValue()) {
                                g.cancelConsumed(receiveChannel, null);
                                return obj3;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        receiveChannel2 = receiveChannel3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            g.cancelConsumed(receiveChannel2, th);
                            throw th4;
                        }
                    }
                }
                if (((Boolean) obj).booleanValue()) {
                    g.cancelConsumed(receiveChannel2, null);
                    return null;
                }
                next = channelIterator.next();
                comparator3 = comparator2;
                ReceiveChannel receiveChannel4 = receiveChannel2;
                channelIterator2 = channelIterator;
                receiveChannel = receiveChannel4;
                channelsKt__DeprecatedKt$minWith$1.L$0 = comparator3;
                channelsKt__DeprecatedKt$minWith$1.L$1 = receiveChannel;
                channelsKt__DeprecatedKt$minWith$1.L$2 = channelIterator2;
                channelsKt__DeprecatedKt$minWith$1.L$3 = next;
                channelsKt__DeprecatedKt$minWith$1.label = 2;
                hasNext = channelIterator2.hasNext(channelsKt__DeprecatedKt$minWith$1);
                if (hasNext != coroutine_suspended) {
                }
            }
        }
        channelsKt__DeprecatedKt$minWith$1 = new ChannelsKt__DeprecatedKt$minWith$1(cVar);
        obj = channelsKt__DeprecatedKt$minWith$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = channelsKt__DeprecatedKt$minWith$1.label;
        if (i8 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object none(ReceiveChannel receiveChannel, kotlin.coroutines.c cVar) {
        ChannelsKt__DeprecatedKt$none$1 channelsKt__DeprecatedKt$none$1;
        Object coroutine_suspended;
        int i8;
        try {
            if (cVar instanceof ChannelsKt__DeprecatedKt$none$1) {
                channelsKt__DeprecatedKt$none$1 = (ChannelsKt__DeprecatedKt$none$1) cVar;
                int i9 = channelsKt__DeprecatedKt$none$1.label;
                if ((i9 & Integer.MIN_VALUE) != 0) {
                    channelsKt__DeprecatedKt$none$1.label = i9 - Integer.MIN_VALUE;
                    Object obj = channelsKt__DeprecatedKt$none$1.result;
                    coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                    i8 = channelsKt__DeprecatedKt$none$1.label;
                    if (i8 != 0) {
                        y5.g.throwOnFailure(obj);
                        ChannelIterator it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$none$1.L$0 = receiveChannel;
                        channelsKt__DeprecatedKt$none$1.label = 1;
                        obj = it.hasNext(channelsKt__DeprecatedKt$none$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i8 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        receiveChannel = (ReceiveChannel) channelsKt__DeprecatedKt$none$1.L$0;
                        y5.g.throwOnFailure(obj);
                    }
                    Boolean boxBoolean = kotlin.coroutines.jvm.internal.a.boxBoolean(!((Boolean) obj).booleanValue());
                    g.cancelConsumed(receiveChannel, null);
                    return boxBoolean;
                }
            }
            if (i8 != 0) {
            }
            Boolean boxBoolean2 = kotlin.coroutines.jvm.internal.a.boxBoolean(!((Boolean) obj).booleanValue());
            g.cancelConsumed(receiveChannel, null);
            return boxBoolean2;
        } finally {
        }
        channelsKt__DeprecatedKt$none$1 = new ChannelsKt__DeprecatedKt$none$1(cVar);
        Object obj2 = channelsKt__DeprecatedKt$none$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = channelsKt__DeprecatedKt$none$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008e A[Catch: all -> 0x0032, TRY_ENTER, TryCatch #1 {all -> 0x0032, blocks: (B:12:0x002e, B:13:0x0081, B:18:0x008e, B:19:0x0095), top: B:11:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c A[Catch: all -> 0x004a, TRY_LEAVE, TryCatch #2 {all -> 0x004a, blocks: (B:33:0x0046, B:34:0x0064, B:36:0x006c, B:40:0x0096, B:41:0x009d), top: B:32:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0096 A[Catch: all -> 0x004a, TRY_ENTER, TryCatch #2 {all -> 0x004a, blocks: (B:33:0x0046, B:34:0x0064, B:36:0x006c, B:40:0x0096, B:41:0x009d), top: B:32:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object single(ReceiveChannel receiveChannel, kotlin.coroutines.c cVar) {
        ChannelsKt__DeprecatedKt$single$1 channelsKt__DeprecatedKt$single$1;
        Object obj;
        Object coroutine_suspended;
        int i8;
        ReceiveChannel receiveChannel2;
        Throwable th;
        ChannelIterator channelIterator;
        ReceiveChannel receiveChannel3;
        Object obj2;
        if (cVar instanceof ChannelsKt__DeprecatedKt$single$1) {
            channelsKt__DeprecatedKt$single$1 = (ChannelsKt__DeprecatedKt$single$1) cVar;
            int i9 = channelsKt__DeprecatedKt$single$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$single$1.label = i9 - Integer.MIN_VALUE;
                obj = channelsKt__DeprecatedKt$single$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = channelsKt__DeprecatedKt$single$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    try {
                        ChannelIterator it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$single$1.L$0 = receiveChannel;
                        channelsKt__DeprecatedKt$single$1.L$1 = it;
                        channelsKt__DeprecatedKt$single$1.label = 1;
                        Object hasNext = it.hasNext(channelsKt__DeprecatedKt$single$1);
                        if (hasNext == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        receiveChannel2 = receiveChannel;
                        channelIterator = it;
                        obj = hasNext;
                    } catch (Throwable th2) {
                        receiveChannel2 = receiveChannel;
                        th = th2;
                        throw th;
                    }
                } else {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj2 = channelsKt__DeprecatedKt$single$1.L$1;
                        receiveChannel3 = (ReceiveChannel) channelsKt__DeprecatedKt$single$1.L$0;
                        try {
                            y5.g.throwOnFailure(obj);
                            if (!((Boolean) obj).booleanValue()) {
                                throw new IllegalArgumentException("ReceiveChannel has more than one element.");
                            }
                            g.cancelConsumed(receiveChannel3, null);
                            return obj2;
                        } catch (Throwable th3) {
                            th = th3;
                            receiveChannel2 = receiveChannel3;
                            try {
                                throw th;
                            } catch (Throwable th4) {
                                g.cancelConsumed(receiveChannel2, th);
                                throw th4;
                            }
                        }
                    }
                    channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$single$1.L$1;
                    receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$single$1.L$0;
                    try {
                        y5.g.throwOnFailure(obj);
                    } catch (Throwable th5) {
                        th = th5;
                        throw th;
                    }
                }
                if (((Boolean) obj).booleanValue()) {
                    throw new NoSuchElementException("ReceiveChannel is empty.");
                }
                Object next = channelIterator.next();
                channelsKt__DeprecatedKt$single$1.L$0 = receiveChannel2;
                channelsKt__DeprecatedKt$single$1.L$1 = next;
                channelsKt__DeprecatedKt$single$1.label = 2;
                Object hasNext2 = channelIterator.hasNext(channelsKt__DeprecatedKt$single$1);
                if (hasNext2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                receiveChannel3 = receiveChannel2;
                obj = hasNext2;
                obj2 = next;
                if (!((Boolean) obj).booleanValue()) {
                }
            }
        }
        channelsKt__DeprecatedKt$single$1 = new ChannelsKt__DeprecatedKt$single$1(cVar);
        obj = channelsKt__DeprecatedKt$single$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = channelsKt__DeprecatedKt$single$1.label;
        if (i8 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071 A[Catch: all -> 0x004b, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x004b, blocks: (B:33:0x0047, B:34:0x0065, B:38:0x0071), top: B:32:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object singleOrNull(ReceiveChannel receiveChannel, kotlin.coroutines.c cVar) {
        ChannelsKt__DeprecatedKt$singleOrNull$1 channelsKt__DeprecatedKt$singleOrNull$1;
        Object obj;
        Object coroutine_suspended;
        int i8;
        ReceiveChannel receiveChannel2;
        Throwable th;
        ChannelIterator channelIterator;
        ReceiveChannel receiveChannel3;
        Object obj2;
        if (cVar instanceof ChannelsKt__DeprecatedKt$singleOrNull$1) {
            channelsKt__DeprecatedKt$singleOrNull$1 = (ChannelsKt__DeprecatedKt$singleOrNull$1) cVar;
            int i9 = channelsKt__DeprecatedKt$singleOrNull$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$singleOrNull$1.label = i9 - Integer.MIN_VALUE;
                obj = channelsKt__DeprecatedKt$singleOrNull$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = channelsKt__DeprecatedKt$singleOrNull$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    try {
                        ChannelIterator it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$singleOrNull$1.L$0 = receiveChannel;
                        channelsKt__DeprecatedKt$singleOrNull$1.L$1 = it;
                        channelsKt__DeprecatedKt$singleOrNull$1.label = 1;
                        Object hasNext = it.hasNext(channelsKt__DeprecatedKt$singleOrNull$1);
                        if (hasNext == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        receiveChannel2 = receiveChannel;
                        channelIterator = it;
                        obj = hasNext;
                    } catch (Throwable th2) {
                        receiveChannel2 = receiveChannel;
                        th = th2;
                        throw th;
                    }
                } else {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj2 = channelsKt__DeprecatedKt$singleOrNull$1.L$1;
                        receiveChannel3 = (ReceiveChannel) channelsKt__DeprecatedKt$singleOrNull$1.L$0;
                        try {
                            y5.g.throwOnFailure(obj);
                            if (((Boolean) obj).booleanValue()) {
                                g.cancelConsumed(receiveChannel3, null);
                                return obj2;
                            }
                            g.cancelConsumed(receiveChannel3, null);
                            return null;
                        } catch (Throwable th3) {
                            th = th3;
                            receiveChannel2 = receiveChannel3;
                            try {
                                throw th;
                            } catch (Throwable th4) {
                                g.cancelConsumed(receiveChannel2, th);
                                throw th4;
                            }
                        }
                    }
                    channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$singleOrNull$1.L$1;
                    receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$singleOrNull$1.L$0;
                    try {
                        y5.g.throwOnFailure(obj);
                    } catch (Throwable th5) {
                        th = th5;
                        throw th;
                    }
                }
                if (((Boolean) obj).booleanValue()) {
                    g.cancelConsumed(receiveChannel2, null);
                    return null;
                }
                Object next = channelIterator.next();
                channelsKt__DeprecatedKt$singleOrNull$1.L$0 = receiveChannel2;
                channelsKt__DeprecatedKt$singleOrNull$1.L$1 = next;
                channelsKt__DeprecatedKt$singleOrNull$1.label = 2;
                Object hasNext2 = channelIterator.hasNext(channelsKt__DeprecatedKt$singleOrNull$1);
                if (hasNext2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                receiveChannel3 = receiveChannel2;
                obj = hasNext2;
                obj2 = next;
                if (((Boolean) obj).booleanValue()) {
                }
            }
        }
        channelsKt__DeprecatedKt$singleOrNull$1 = new ChannelsKt__DeprecatedKt$singleOrNull$1(cVar);
        obj = channelsKt__DeprecatedKt$singleOrNull$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = channelsKt__DeprecatedKt$singleOrNull$1.label;
        if (i8 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    public static final /* synthetic */ ReceiveChannel take(ReceiveChannel receiveChannel, int i8, CoroutineContext coroutineContext) {
        return ProduceKt.produce$default(e1.INSTANCE, coroutineContext, 0, null, g.consumes(receiveChannel), new ChannelsKt__DeprecatedKt$take$1(i8, receiveChannel, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel take$default(ReceiveChannel receiveChannel, int i8, CoroutineContext coroutineContext, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            coroutineContext = t0.getUnconfined();
        }
        return take(receiveChannel, i8, coroutineContext);
    }

    public static final /* synthetic */ ReceiveChannel takeWhile(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, p pVar) {
        return ProduceKt.produce$default(e1.INSTANCE, coroutineContext, 0, null, g.consumes(receiveChannel), new ChannelsKt__DeprecatedKt$takeWhile$1(receiveChannel, pVar, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel takeWhile$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, p pVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            coroutineContext = t0.getUnconfined();
        }
        return takeWhile(receiveChannel, coroutineContext, pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[Catch: all -> 0x003b, TryCatch #2 {all -> 0x003b, blocks: (B:12:0x0034, B:19:0x0070, B:21:0x0078, B:24:0x008b, B:40:0x0051), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008b A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #2 {all -> 0x003b, blocks: (B:12:0x0034, B:19:0x0070, B:21:0x0078, B:24:0x008b, B:40:0x0051), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r7v0, types: [C extends kotlinx.coroutines.channels.l] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0088 -> B:13:0x0037). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <E, C extends l> Object toChannel(ReceiveChannel receiveChannel, C c8, kotlin.coroutines.c cVar) {
        ChannelsKt__DeprecatedKt$toChannel$1 channelsKt__DeprecatedKt$toChannel$1;
        Object coroutine_suspended;
        int i8;
        ChannelIterator it;
        ChannelIterator channelIterator;
        l lVar;
        l lVar2;
        Object hasNext;
        try {
            if (cVar instanceof ChannelsKt__DeprecatedKt$toChannel$1) {
                channelsKt__DeprecatedKt$toChannel$1 = (ChannelsKt__DeprecatedKt$toChannel$1) cVar;
                int i9 = channelsKt__DeprecatedKt$toChannel$1.label;
                if ((i9 & Integer.MIN_VALUE) != 0) {
                    channelsKt__DeprecatedKt$toChannel$1.label = i9 - Integer.MIN_VALUE;
                    Object obj = channelsKt__DeprecatedKt$toChannel$1.result;
                    coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                    i8 = channelsKt__DeprecatedKt$toChannel$1.label;
                    if (i8 != 0) {
                        y5.g.throwOnFailure(obj);
                        try {
                            it = receiveChannel.iterator();
                            lVar2 = c8;
                            channelsKt__DeprecatedKt$toChannel$1.L$0 = lVar2;
                            channelsKt__DeprecatedKt$toChannel$1.L$1 = receiveChannel;
                            channelsKt__DeprecatedKt$toChannel$1.L$2 = it;
                            channelsKt__DeprecatedKt$toChannel$1.label = 1;
                            hasNext = it.hasNext(channelsKt__DeprecatedKt$toChannel$1);
                            if (hasNext == coroutine_suspended) {
                            }
                        } catch (Throwable th) {
                            c8 = receiveChannel;
                            th = th;
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                g.cancelConsumed(c8, th);
                                throw th2;
                            }
                        }
                    } else if (i8 == 1) {
                        channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$toChannel$1.L$2;
                        boolean z7 = (C) ((ReceiveChannel) channelsKt__DeprecatedKt$toChannel$1.L$1);
                        lVar = (l) channelsKt__DeprecatedKt$toChannel$1.L$0;
                        y5.g.throwOnFailure(obj);
                        c8 = z7;
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$toChannel$1.L$2;
                        ReceiveChannel receiveChannel2 = (C) ((ReceiveChannel) channelsKt__DeprecatedKt$toChannel$1.L$1);
                        lVar = (l) channelsKt__DeprecatedKt$toChannel$1.L$0;
                        y5.g.throwOnFailure(obj);
                        ReceiveChannel receiveChannel3 = receiveChannel2;
                        it = channelIterator;
                        receiveChannel = receiveChannel3;
                        lVar2 = (C) lVar;
                        channelsKt__DeprecatedKt$toChannel$1.L$0 = lVar2;
                        channelsKt__DeprecatedKt$toChannel$1.L$1 = receiveChannel;
                        channelsKt__DeprecatedKt$toChannel$1.L$2 = it;
                        channelsKt__DeprecatedKt$toChannel$1.label = 1;
                        hasNext = it.hasNext(channelsKt__DeprecatedKt$toChannel$1);
                        if (hasNext == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        l lVar3 = lVar2;
                        boolean z8 = (C) receiveChannel;
                        channelIterator = it;
                        obj = hasNext;
                        lVar = lVar3;
                        c8 = z8;
                        if (((Boolean) obj).booleanValue()) {
                            w wVar = w.INSTANCE;
                            g.cancelConsumed((ReceiveChannel) c8, null);
                            return lVar;
                        }
                        Object next = channelIterator.next();
                        channelsKt__DeprecatedKt$toChannel$1.L$0 = lVar;
                        channelsKt__DeprecatedKt$toChannel$1.L$1 = (Object) c8;
                        channelsKt__DeprecatedKt$toChannel$1.L$2 = channelIterator;
                        channelsKt__DeprecatedKt$toChannel$1.label = 2;
                        receiveChannel3 = c8;
                        if (lVar.send(next, channelsKt__DeprecatedKt$toChannel$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        it = channelIterator;
                        receiveChannel = receiveChannel3;
                        lVar2 = (C) lVar;
                        channelsKt__DeprecatedKt$toChannel$1.L$0 = lVar2;
                        channelsKt__DeprecatedKt$toChannel$1.L$1 = receiveChannel;
                        channelsKt__DeprecatedKt$toChannel$1.L$2 = it;
                        channelsKt__DeprecatedKt$toChannel$1.label = 1;
                        hasNext = it.hasNext(channelsKt__DeprecatedKt$toChannel$1);
                        if (hasNext == coroutine_suspended) {
                        }
                    }
                }
            }
            if (i8 != 0) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        channelsKt__DeprecatedKt$toChannel$1 = new ChannelsKt__DeprecatedKt$toChannel$1(cVar);
        Object obj2 = channelsKt__DeprecatedKt$toChannel$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = channelsKt__DeprecatedKt$toChannel$1.label;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x005c, B:14:0x0064, B:15:0x004a, B:20:0x006d), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x005c, B:14:0x0064, B:15:0x004a, B:20:0x006d), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0059 -> B:12:0x005c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <E, C extends Collection<? super E>> Object toCollection(ReceiveChannel receiveChannel, C c8, kotlin.coroutines.c cVar) {
        ChannelsKt__DeprecatedKt$toCollection$1 channelsKt__DeprecatedKt$toCollection$1;
        Object coroutine_suspended;
        int i8;
        ReceiveChannel receiveChannel2;
        Throwable th;
        ChannelIterator it;
        C c9;
        Object hasNext;
        if (cVar instanceof ChannelsKt__DeprecatedKt$toCollection$1) {
            channelsKt__DeprecatedKt$toCollection$1 = (ChannelsKt__DeprecatedKt$toCollection$1) cVar;
            int i9 = channelsKt__DeprecatedKt$toCollection$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$toCollection$1.label = i9 - Integer.MIN_VALUE;
                Object obj = channelsKt__DeprecatedKt$toCollection$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = channelsKt__DeprecatedKt$toCollection$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    try {
                        receiveChannel2 = receiveChannel;
                        it = receiveChannel.iterator();
                        c9 = c8;
                        channelsKt__DeprecatedKt$toCollection$1.L$0 = c9;
                        channelsKt__DeprecatedKt$toCollection$1.L$1 = receiveChannel2;
                        channelsKt__DeprecatedKt$toCollection$1.L$2 = it;
                        channelsKt__DeprecatedKt$toCollection$1.label = 1;
                        hasNext = it.hasNext(channelsKt__DeprecatedKt$toCollection$1);
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
                    it = (ChannelIterator) channelsKt__DeprecatedKt$toCollection$1.L$2;
                    receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$toCollection$1.L$1;
                    Collection collection = (Collection) channelsKt__DeprecatedKt$toCollection$1.L$0;
                    try {
                        y5.g.throwOnFailure(obj);
                        ?? r22 = collection;
                        if (!((Boolean) obj).booleanValue()) {
                            r22.add(it.next());
                            c9 = r22;
                            channelsKt__DeprecatedKt$toCollection$1.L$0 = c9;
                            channelsKt__DeprecatedKt$toCollection$1.L$1 = receiveChannel2;
                            channelsKt__DeprecatedKt$toCollection$1.L$2 = it;
                            channelsKt__DeprecatedKt$toCollection$1.label = 1;
                            hasNext = it.hasNext(channelsKt__DeprecatedKt$toCollection$1);
                            if (hasNext != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            r22 = c9;
                            obj = hasNext;
                            if (!((Boolean) obj).booleanValue()) {
                                w wVar = w.INSTANCE;
                                g.cancelConsumed(receiveChannel2, null);
                                return r22;
                            }
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
            }
        }
        channelsKt__DeprecatedKt$toCollection$1 = new ChannelsKt__DeprecatedKt$toCollection$1(cVar);
        Object obj2 = channelsKt__DeprecatedKt$toCollection$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = channelsKt__DeprecatedKt$toCollection$1.label;
        if (i8 != 0) {
        }
    }

    public static final <E> Object toMutableSet(ReceiveChannel receiveChannel, kotlin.coroutines.c cVar) {
        return g.toCollection(receiveChannel, new LinkedHashSet(), cVar);
    }

    public static final /* synthetic */ ReceiveChannel withIndex(ReceiveChannel receiveChannel, CoroutineContext coroutineContext) {
        return ProduceKt.produce$default(e1.INSTANCE, coroutineContext, 0, null, g.consumes(receiveChannel), new ChannelsKt__DeprecatedKt$withIndex$1(receiveChannel, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel withIndex$default(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            coroutineContext = t0.getUnconfined();
        }
        return withIndex(receiveChannel, coroutineContext);
    }

    public static /* synthetic */ ReceiveChannel zip$default(ReceiveChannel receiveChannel, ReceiveChannel receiveChannel2, CoroutineContext coroutineContext, p pVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            coroutineContext = t0.getUnconfined();
        }
        return g.zip(receiveChannel, receiveChannel2, coroutineContext, pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x005c, B:14:0x0064, B:15:0x004a, B:20:0x0077), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x005c, B:14:0x0064, B:15:0x004a, B:20:0x0077), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0059 -> B:12:0x005c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <K, V, M extends Map<? super K, ? super V>> Object toMap(ReceiveChannel receiveChannel, M m8, kotlin.coroutines.c cVar) {
        ChannelsKt__DeprecatedKt$toMap$2 channelsKt__DeprecatedKt$toMap$2;
        Object coroutine_suspended;
        int i8;
        ReceiveChannel receiveChannel2;
        Throwable th;
        ChannelIterator it;
        M m9;
        Object hasNext;
        if (cVar instanceof ChannelsKt__DeprecatedKt$toMap$2) {
            channelsKt__DeprecatedKt$toMap$2 = (ChannelsKt__DeprecatedKt$toMap$2) cVar;
            int i9 = channelsKt__DeprecatedKt$toMap$2.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$toMap$2.label = i9 - Integer.MIN_VALUE;
                Object obj = channelsKt__DeprecatedKt$toMap$2.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = channelsKt__DeprecatedKt$toMap$2.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    try {
                        receiveChannel2 = receiveChannel;
                        it = receiveChannel.iterator();
                        m9 = m8;
                        channelsKt__DeprecatedKt$toMap$2.L$0 = m9;
                        channelsKt__DeprecatedKt$toMap$2.L$1 = receiveChannel2;
                        channelsKt__DeprecatedKt$toMap$2.L$2 = it;
                        channelsKt__DeprecatedKt$toMap$2.label = 1;
                        hasNext = it.hasNext(channelsKt__DeprecatedKt$toMap$2);
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
                    it = (ChannelIterator) channelsKt__DeprecatedKt$toMap$2.L$2;
                    receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$toMap$2.L$1;
                    Map map = (Map) channelsKt__DeprecatedKt$toMap$2.L$0;
                    try {
                        y5.g.throwOnFailure(obj);
                        ?? r22 = map;
                        if (!((Boolean) obj).booleanValue()) {
                            Pair pair = (Pair) it.next();
                            r22.put(pair.getFirst(), pair.getSecond());
                            m9 = r22;
                            channelsKt__DeprecatedKt$toMap$2.L$0 = m9;
                            channelsKt__DeprecatedKt$toMap$2.L$1 = receiveChannel2;
                            channelsKt__DeprecatedKt$toMap$2.L$2 = it;
                            channelsKt__DeprecatedKt$toMap$2.label = 1;
                            hasNext = it.hasNext(channelsKt__DeprecatedKt$toMap$2);
                            if (hasNext != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            r22 = m9;
                            obj = hasNext;
                            if (!((Boolean) obj).booleanValue()) {
                                w wVar = w.INSTANCE;
                                g.cancelConsumed(receiveChannel2, null);
                                return r22;
                            }
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
            }
        }
        channelsKt__DeprecatedKt$toMap$2 = new ChannelsKt__DeprecatedKt$toMap$2(cVar);
        Object obj2 = channelsKt__DeprecatedKt$toMap$2.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = channelsKt__DeprecatedKt$toMap$2.label;
        if (i8 != 0) {
        }
    }

    public static final <E, R, V> ReceiveChannel zip(ReceiveChannel receiveChannel, ReceiveChannel receiveChannel2, CoroutineContext coroutineContext, p pVar) {
        return ProduceKt.produce$default(e1.INSTANCE, coroutineContext, 0, null, g.consumesAll(receiveChannel, receiveChannel2), new ChannelsKt__DeprecatedKt$zip$2(receiveChannel2, receiveChannel, pVar, null), 6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:12:0x0034, B:19:0x006e, B:21:0x0076, B:23:0x007c, B:26:0x008f, B:42:0x004f), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #1 {all -> 0x0038, blocks: (B:12:0x0034, B:19:0x006e, B:21:0x0076, B:23:0x007c, B:26:0x008f, B:42:0x004f), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlinx.coroutines.channels.l] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007a -> B:13:0x008b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0088 -> B:13:0x008b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object filterNotNullTo(ReceiveChannel receiveChannel, l lVar, kotlin.coroutines.c cVar) {
        ChannelsKt__DeprecatedKt$filterNotNullTo$3 channelsKt__DeprecatedKt$filterNotNullTo$3;
        Object coroutine_suspended;
        int i8;
        ChannelIterator it;
        ChannelIterator channelIterator;
        l lVar2;
        l lVar3;
        Object hasNext;
        try {
            if (cVar instanceof ChannelsKt__DeprecatedKt$filterNotNullTo$3) {
                channelsKt__DeprecatedKt$filterNotNullTo$3 = (ChannelsKt__DeprecatedKt$filterNotNullTo$3) cVar;
                int i9 = channelsKt__DeprecatedKt$filterNotNullTo$3.label;
                if ((i9 & Integer.MIN_VALUE) != 0) {
                    channelsKt__DeprecatedKt$filterNotNullTo$3.label = i9 - Integer.MIN_VALUE;
                    Object obj = channelsKt__DeprecatedKt$filterNotNullTo$3.result;
                    coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                    i8 = channelsKt__DeprecatedKt$filterNotNullTo$3.label;
                    if (i8 != 0) {
                        y5.g.throwOnFailure(obj);
                        try {
                            it = receiveChannel.iterator();
                            lVar3 = lVar;
                            channelsKt__DeprecatedKt$filterNotNullTo$3.L$0 = lVar3;
                            channelsKt__DeprecatedKt$filterNotNullTo$3.L$1 = receiveChannel;
                            channelsKt__DeprecatedKt$filterNotNullTo$3.L$2 = it;
                            channelsKt__DeprecatedKt$filterNotNullTo$3.label = 1;
                            hasNext = it.hasNext(channelsKt__DeprecatedKt$filterNotNullTo$3);
                            if (hasNext == coroutine_suspended) {
                            }
                        } catch (Throwable th) {
                            lVar = receiveChannel;
                            th = th;
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                g.cancelConsumed(lVar, th);
                                throw th2;
                            }
                        }
                    } else if (i8 == 1) {
                        channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$filterNotNullTo$3.L$2;
                        ReceiveChannel receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$filterNotNullTo$3.L$1;
                        lVar2 = (l) channelsKt__DeprecatedKt$filterNotNullTo$3.L$0;
                        y5.g.throwOnFailure(obj);
                        lVar = receiveChannel2;
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$filterNotNullTo$3.L$2;
                        ReceiveChannel receiveChannel3 = (ReceiveChannel) channelsKt__DeprecatedKt$filterNotNullTo$3.L$1;
                        lVar2 = (l) channelsKt__DeprecatedKt$filterNotNullTo$3.L$0;
                        y5.g.throwOnFailure(obj);
                        ReceiveChannel receiveChannel4 = receiveChannel3;
                        it = channelIterator;
                        receiveChannel = receiveChannel4;
                        lVar3 = lVar2;
                        channelsKt__DeprecatedKt$filterNotNullTo$3.L$0 = lVar3;
                        channelsKt__DeprecatedKt$filterNotNullTo$3.L$1 = receiveChannel;
                        channelsKt__DeprecatedKt$filterNotNullTo$3.L$2 = it;
                        channelsKt__DeprecatedKt$filterNotNullTo$3.label = 1;
                        hasNext = it.hasNext(channelsKt__DeprecatedKt$filterNotNullTo$3);
                        if (hasNext == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        l lVar4 = lVar3;
                        lVar = receiveChannel;
                        channelIterator = it;
                        obj = hasNext;
                        lVar2 = lVar4;
                        if (((Boolean) obj).booleanValue()) {
                            w wVar = w.INSTANCE;
                            g.cancelConsumed(lVar, null);
                            return lVar2;
                        }
                        Object next = channelIterator.next();
                        receiveChannel4 = lVar;
                        if (next != null) {
                            channelsKt__DeprecatedKt$filterNotNullTo$3.L$0 = lVar2;
                            channelsKt__DeprecatedKt$filterNotNullTo$3.L$1 = lVar;
                            channelsKt__DeprecatedKt$filterNotNullTo$3.L$2 = channelIterator;
                            channelsKt__DeprecatedKt$filterNotNullTo$3.label = 2;
                            receiveChannel4 = lVar;
                            if (lVar2.send(next, channelsKt__DeprecatedKt$filterNotNullTo$3) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        it = channelIterator;
                        receiveChannel = receiveChannel4;
                        lVar3 = lVar2;
                        channelsKt__DeprecatedKt$filterNotNullTo$3.L$0 = lVar3;
                        channelsKt__DeprecatedKt$filterNotNullTo$3.L$1 = receiveChannel;
                        channelsKt__DeprecatedKt$filterNotNullTo$3.L$2 = it;
                        channelsKt__DeprecatedKt$filterNotNullTo$3.label = 1;
                        hasNext = it.hasNext(channelsKt__DeprecatedKt$filterNotNullTo$3);
                        if (hasNext == coroutine_suspended) {
                        }
                    }
                }
            }
            if (i8 != 0) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        channelsKt__DeprecatedKt$filterNotNullTo$3 = new ChannelsKt__DeprecatedKt$filterNotNullTo$3(cVar);
        Object obj2 = channelsKt__DeprecatedKt$filterNotNullTo$3.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = channelsKt__DeprecatedKt$filterNotNullTo$3.label;
    }
}
