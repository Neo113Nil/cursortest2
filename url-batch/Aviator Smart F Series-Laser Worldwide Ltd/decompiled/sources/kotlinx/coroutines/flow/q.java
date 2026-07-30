package kotlinx.coroutines.flow;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes5.dex */
final class q {
    public final CoroutineContext context;
    public final int extraBufferCapacity;
    public final BufferOverflow onBufferOverflow;
    public final e upstream;

    public q(e eVar, int i8, BufferOverflow bufferOverflow, CoroutineContext coroutineContext) {
        this.upstream = eVar;
        this.extraBufferCapacity = i8;
        this.onBufferOverflow = bufferOverflow;
        this.context = coroutineContext;
    }
}
