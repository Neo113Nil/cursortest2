package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator;
import okio.internal.DefaultSocket;

/* loaded from: classes3.dex */
public final class ProducerCoroutine extends AbstractCoroutine implements ProducerScope, Channel {
    public final BufferedChannel _channel;

    public ProducerCoroutine(CoroutineContext coroutineContext, BufferedChannel bufferedChannel) {
        super(coroutineContext, true);
        this._channel = bufferedChannel;
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
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
    public final void cancelInternal(CancellationException cancellationException) {
        this._channel.closeOrCancelImpl(cancellationException, true);
        cancelImpl$kotlinx_coroutines_core(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final boolean close(Throwable th) {
        return this._channel.closeOrCancelImpl(th, false);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final DefaultSocket getOnReceiveCatching() {
        return this._channel.getOnReceiveCatching();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final void invokeOnClose(Function1 function1) {
        this._channel.invokeOnClose(function1);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final boolean isClosedForReceive() {
        return this._channel.isClosedForReceive();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final BufferedChannel.BufferedChannelIterator iterator() {
        BufferedChannel bufferedChannel = this._channel;
        bufferedChannel.getClass();
        return bufferedChannel.new BufferedChannelIterator();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final boolean offer(Object obj) {
        return this._channel.offer(obj);
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public final void onCancelled(Throwable th, boolean z) {
        if (this._channel.closeOrCancelImpl(th, false) || z) {
            return;
        }
        JobKt.handleCoroutineException(this.context, th);
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public final void onCompleted(Object obj) {
        this._channel.close(null);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final Object receive(ContinuationImpl continuationImpl) {
        BufferedChannel bufferedChannel = this._channel;
        bufferedChannel.getClass();
        return BufferedChannel.receive$suspendImpl(bufferedChannel, continuationImpl);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* renamed from: receiveCatching-JP2dKIU */
    public final Object mo4187receiveCatchingJP2dKIU(SuspendLambda suspendLambda) {
        BufferedChannel bufferedChannel = this._channel;
        bufferedChannel.getClass();
        Object m4186receiveCatchingJP2dKIU$suspendImpl = BufferedChannel.m4186receiveCatchingJP2dKIU$suspendImpl(bufferedChannel, suspendLambda);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return m4186receiveCatchingJP2dKIU$suspendImpl;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final Object send(Object obj, Continuation continuation) {
        return this._channel.send(obj, continuation);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* renamed from: tryReceive-PtdJZtk */
    public final Object mo4189tryReceivePtdJZtk() {
        return this._channel.mo4189tryReceivePtdJZtk();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: trySend-JP2dKIU */
    public final Object mo1159trySendJP2dKIU(Object obj) {
        return this._channel.mo1159trySendJP2dKIU(obj);
    }
}
