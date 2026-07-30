package kotlinx.coroutines.flow.internal;

import y5.w;

/* loaded from: classes5.dex */
public final class m implements kotlinx.coroutines.flow.f {
    private final kotlinx.coroutines.channels.l channel;

    public m(kotlinx.coroutines.channels.l lVar) {
        this.channel = lVar;
    }

    @Override // kotlinx.coroutines.flow.f
    public Object emit(Object obj, kotlin.coroutines.c cVar) {
        Object coroutine_suspended;
        Object send = this.channel.send(obj, cVar);
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return send == coroutine_suspended ? send : w.INSTANCE;
    }
}
