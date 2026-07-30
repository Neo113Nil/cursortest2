package kotlinx.coroutines.channels;

import kotlinx.coroutines.channels.e;
import y5.w;

/* loaded from: classes5.dex */
abstract /* synthetic */ class ChannelsKt__ChannelsKt {
    public static final /* synthetic */ void sendBlocking(l lVar, Object obj) {
        if (e.m1250isSuccessimpl(lVar.mo1234trySendJP2dKIU(obj))) {
            return;
        }
        kotlinx.coroutines.h.runBlocking$default(null, new ChannelsKt__ChannelsKt$sendBlocking$1(lVar, obj, null), 1, null);
    }

    public static final <E> Object trySendBlocking(l lVar, E e8) {
        Object runBlocking$default;
        Object mo1234trySendJP2dKIU = lVar.mo1234trySendJP2dKIU(e8);
        if (mo1234trySendJP2dKIU instanceof e.c) {
            runBlocking$default = kotlinx.coroutines.h.runBlocking$default(null, new ChannelsKt__ChannelsKt$trySendBlocking$2(lVar, e8, null), 1, null);
            return ((e) runBlocking$default).m1252unboximpl();
        }
        return e.Companion.m1255successJP2dKIU(w.INSTANCE);
    }
}
