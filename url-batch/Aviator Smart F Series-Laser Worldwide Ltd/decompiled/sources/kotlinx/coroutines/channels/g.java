package kotlinx.coroutines.channels;

import f6.p;
import f6.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public abstract class g {
    public static final String DEFAULT_CLOSE_MESSAGE = "Channel was closed";

    public static final void cancelConsumed(ReceiveChannel receiveChannel, Throwable th) {
        ChannelsKt__Channels_commonKt.cancelConsumed(receiveChannel, th);
    }

    public static final <E, R> R consume(a aVar, f6.l lVar) {
        return (R) ChannelsKt__Channels_commonKt.consume(aVar, lVar);
    }

    public static final <E> Object consumeEach(a aVar, f6.l lVar, kotlin.coroutines.c cVar) {
        return ChannelsKt__Channels_commonKt.consumeEach(aVar, lVar, cVar);
    }

    public static final f6.l consumes(ReceiveChannel receiveChannel) {
        return ChannelsKt__DeprecatedKt.consumes(receiveChannel);
    }

    public static final f6.l consumesAll(ReceiveChannel... receiveChannelArr) {
        return ChannelsKt__DeprecatedKt.consumesAll(receiveChannelArr);
    }

    public static final /* synthetic */ ReceiveChannel distinct(ReceiveChannel receiveChannel) {
        ReceiveChannel distinctBy$default;
        distinctBy$default = ChannelsKt__DeprecatedKt.distinctBy$default(receiveChannel, null, new ChannelsKt__DeprecatedKt$distinct$1(null), 1, null);
        return distinctBy$default;
    }

    public static final <E, K> ReceiveChannel distinctBy(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, p pVar) {
        return ChannelsKt__DeprecatedKt.distinctBy(receiveChannel, coroutineContext, pVar);
    }

    public static final <E> ReceiveChannel filter(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, p pVar) {
        return ChannelsKt__DeprecatedKt.filter(receiveChannel, coroutineContext, pVar);
    }

    public static final <E> ReceiveChannel filterNotNull(ReceiveChannel receiveChannel) {
        return ChannelsKt__DeprecatedKt.filterNotNull(receiveChannel);
    }

    public static final <E, R> ReceiveChannel map(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, p pVar) {
        return ChannelsKt__DeprecatedKt.map(receiveChannel, coroutineContext, pVar);
    }

    public static final <E, R> ReceiveChannel mapIndexed(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, q qVar) {
        return ChannelsKt__DeprecatedKt.mapIndexed(receiveChannel, coroutineContext, qVar);
    }

    public static final /* synthetic */ ReceiveChannel requireNoNulls(ReceiveChannel receiveChannel) {
        ReceiveChannel map$default;
        map$default = ChannelsKt__DeprecatedKt.map$default(receiveChannel, null, new ChannelsKt__DeprecatedKt$requireNoNulls$1(receiveChannel, null), 1, null);
        return map$default;
    }

    public static final <E, C extends l> Object toChannel(ReceiveChannel receiveChannel, C c8, kotlin.coroutines.c cVar) {
        return ChannelsKt__DeprecatedKt.toChannel(receiveChannel, c8, cVar);
    }

    public static final <E, C extends Collection<? super E>> Object toCollection(ReceiveChannel receiveChannel, C c8, kotlin.coroutines.c cVar) {
        return ChannelsKt__DeprecatedKt.toCollection(receiveChannel, c8, cVar);
    }

    public static final <E> Object toList(ReceiveChannel receiveChannel, kotlin.coroutines.c cVar) {
        return ChannelsKt__Channels_commonKt.toList(receiveChannel, cVar);
    }

    public static final <K, V, M extends Map<? super K, ? super V>> Object toMap(ReceiveChannel receiveChannel, M m8, kotlin.coroutines.c cVar) {
        return ChannelsKt__DeprecatedKt.toMap(receiveChannel, m8, cVar);
    }

    public static final /* synthetic */ Object toMutableList(ReceiveChannel receiveChannel, kotlin.coroutines.c cVar) {
        Object collection;
        collection = toCollection(receiveChannel, new ArrayList(), cVar);
        return collection;
    }

    public static final <E> Object toMutableSet(ReceiveChannel receiveChannel, kotlin.coroutines.c cVar) {
        return ChannelsKt__DeprecatedKt.toMutableSet(receiveChannel, cVar);
    }

    public static final <E> Object trySendBlocking(l lVar, E e8) {
        return ChannelsKt__ChannelsKt.trySendBlocking(lVar, e8);
    }

    public static final /* synthetic */ ReceiveChannel zip(ReceiveChannel receiveChannel, ReceiveChannel receiveChannel2) {
        ReceiveChannel zip$default;
        zip$default = ChannelsKt__DeprecatedKt.zip$default(receiveChannel, receiveChannel2, null, ChannelsKt__DeprecatedKt$zip$1.INSTANCE, 2, null);
        return zip$default;
    }

    public static final <E, R> R consume(ReceiveChannel receiveChannel, f6.l lVar) {
        return (R) ChannelsKt__Channels_commonKt.consume(receiveChannel, lVar);
    }

    public static final <E> Object consumeEach(ReceiveChannel receiveChannel, f6.l lVar, kotlin.coroutines.c cVar) {
        return ChannelsKt__Channels_commonKt.consumeEach(receiveChannel, lVar, cVar);
    }

    public static final /* synthetic */ Object toMap(ReceiveChannel receiveChannel, kotlin.coroutines.c cVar) {
        Object map;
        map = toMap(receiveChannel, new LinkedHashMap(), cVar);
        return map;
    }

    public static final <E, R, V> ReceiveChannel zip(ReceiveChannel receiveChannel, ReceiveChannel receiveChannel2, CoroutineContext coroutineContext, p pVar) {
        return ChannelsKt__DeprecatedKt.zip(receiveChannel, receiveChannel2, coroutineContext, pVar);
    }
}
