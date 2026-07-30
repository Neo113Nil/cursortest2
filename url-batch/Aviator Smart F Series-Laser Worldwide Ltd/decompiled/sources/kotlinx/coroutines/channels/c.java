package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.JobSupport;

/* loaded from: classes5.dex */
public class c extends kotlinx.coroutines.a implements b {
    private final b _channel;

    public c(CoroutineContext coroutineContext, b bVar, boolean z7, boolean z8) {
        super(coroutineContext, z7, z8);
        this._channel = bVar;
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.l1
    public final void cancel(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(cancellationExceptionMessage(), null, this);
        }
        cancelInternal(cancellationException);
    }

    @Override // kotlinx.coroutines.JobSupport
    public void cancelInternal(Throwable th) {
        CancellationException cancellationException$default = JobSupport.toCancellationException$default(this, th, null, 1, null);
        this._channel.cancel(cancellationException$default);
        cancelCoroutine(cancellationException$default);
    }

    @Override // kotlinx.coroutines.channels.b, kotlinx.coroutines.channels.l
    public boolean close(Throwable th) {
        return this._channel.close(th);
    }

    public final b getChannel() {
        return this;
    }

    @Override // kotlinx.coroutines.channels.b, kotlinx.coroutines.channels.ReceiveChannel
    public kotlinx.coroutines.selects.e getOnReceive() {
        return this._channel.getOnReceive();
    }

    @Override // kotlinx.coroutines.channels.b, kotlinx.coroutines.channels.ReceiveChannel
    public kotlinx.coroutines.selects.e getOnReceiveCatching() {
        return this._channel.getOnReceiveCatching();
    }

    @Override // kotlinx.coroutines.channels.b, kotlinx.coroutines.channels.ReceiveChannel
    public kotlinx.coroutines.selects.e getOnReceiveOrNull() {
        return this._channel.getOnReceiveOrNull();
    }

    @Override // kotlinx.coroutines.channels.b, kotlinx.coroutines.channels.l
    public kotlinx.coroutines.selects.g getOnSend() {
        return this._channel.getOnSend();
    }

    protected final b get_channel() {
        return this._channel;
    }

    @Override // kotlinx.coroutines.channels.b, kotlinx.coroutines.channels.l
    public void invokeOnClose(f6.l lVar) {
        this._channel.invokeOnClose(lVar);
    }

    @Override // kotlinx.coroutines.channels.b, kotlinx.coroutines.channels.ReceiveChannel
    public boolean isClosedForReceive() {
        return this._channel.isClosedForReceive();
    }

    @Override // kotlinx.coroutines.channels.b, kotlinx.coroutines.channels.l
    public boolean isClosedForSend() {
        return this._channel.isClosedForSend();
    }

    @Override // kotlinx.coroutines.channels.b, kotlinx.coroutines.channels.ReceiveChannel
    public boolean isEmpty() {
        return this._channel.isEmpty();
    }

    @Override // kotlinx.coroutines.channels.b, kotlinx.coroutines.channels.ReceiveChannel
    public ChannelIterator iterator() {
        return this._channel.iterator();
    }

    @Override // kotlinx.coroutines.channels.b, kotlinx.coroutines.channels.l
    public boolean offer(Object obj) {
        return this._channel.offer(obj);
    }

    @Override // kotlinx.coroutines.channels.b, kotlinx.coroutines.channels.ReceiveChannel
    public Object poll() {
        return this._channel.poll();
    }

    @Override // kotlinx.coroutines.channels.b, kotlinx.coroutines.channels.ReceiveChannel
    public Object receive(kotlin.coroutines.c cVar) {
        return this._channel.receive(cVar);
    }

    @Override // kotlinx.coroutines.channels.b, kotlinx.coroutines.channels.ReceiveChannel
    /* renamed from: receiveCatching-JP2dKIU */
    public Object mo1232receiveCatchingJP2dKIU(kotlin.coroutines.c cVar) {
        Object mo1232receiveCatchingJP2dKIU = this._channel.mo1232receiveCatchingJP2dKIU(cVar);
        kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return mo1232receiveCatchingJP2dKIU;
    }

    @Override // kotlinx.coroutines.channels.b, kotlinx.coroutines.channels.ReceiveChannel
    public Object receiveOrNull(kotlin.coroutines.c cVar) {
        return this._channel.receiveOrNull(cVar);
    }

    @Override // kotlinx.coroutines.channels.b, kotlinx.coroutines.channels.l
    public Object send(Object obj, kotlin.coroutines.c cVar) {
        return this._channel.send(obj, cVar);
    }

    @Override // kotlinx.coroutines.channels.b, kotlinx.coroutines.channels.ReceiveChannel
    /* renamed from: tryReceive-PtdJZtk */
    public Object mo1233tryReceivePtdJZtk() {
        return this._channel.mo1233tryReceivePtdJZtk();
    }

    @Override // kotlinx.coroutines.channels.b, kotlinx.coroutines.channels.l
    /* renamed from: trySend-JP2dKIU */
    public Object mo1234trySendJP2dKIU(Object obj) {
        return this._channel.mo1234trySendJP2dKIU(obj);
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.l1
    public /* synthetic */ void cancel() {
        cancelInternal(new JobCancellationException(cancellationExceptionMessage(), null, this));
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.l1
    public final /* synthetic */ boolean cancel(Throwable th) {
        cancelInternal(new JobCancellationException(cancellationExceptionMessage(), null, this));
        return true;
    }
}
