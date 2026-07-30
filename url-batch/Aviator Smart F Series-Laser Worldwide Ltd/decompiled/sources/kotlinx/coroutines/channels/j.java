package kotlinx.coroutines.channels;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.i0;

/* loaded from: classes5.dex */
public interface j extends i0, l {
    @Override // kotlinx.coroutines.channels.l
    /* synthetic */ boolean close(Throwable th);

    l getChannel();

    @Override // kotlinx.coroutines.i0
    /* synthetic */ CoroutineContext getCoroutineContext();

    @Override // kotlinx.coroutines.channels.l
    /* synthetic */ kotlinx.coroutines.selects.g getOnSend();

    @Override // kotlinx.coroutines.channels.l
    /* synthetic */ void invokeOnClose(f6.l lVar);

    @Override // kotlinx.coroutines.channels.l
    /* synthetic */ boolean isClosedForSend();

    @Override // kotlinx.coroutines.channels.l
    /* synthetic */ boolean offer(Object obj);

    @Override // kotlinx.coroutines.channels.l
    /* synthetic */ Object send(Object obj, kotlin.coroutines.c cVar);

    @Override // kotlinx.coroutines.channels.l
    /* renamed from: trySend-JP2dKIU */
    /* synthetic */ Object mo1234trySendJP2dKIU(Object obj);
}
