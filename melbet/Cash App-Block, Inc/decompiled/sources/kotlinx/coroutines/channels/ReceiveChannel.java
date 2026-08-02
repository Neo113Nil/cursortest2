package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.BufferedChannel;
import okio.internal.DefaultSocket;

/* loaded from: classes3.dex */
public interface ReceiveChannel {
    void cancel(CancellationException cancellationException);

    DefaultSocket getOnReceiveCatching();

    boolean isClosedForReceive();

    BufferedChannel.BufferedChannelIterator iterator();

    Object receive(ContinuationImpl continuationImpl);

    /* renamed from: receiveCatching-JP2dKIU */
    Object mo4187receiveCatchingJP2dKIU(SuspendLambda suspendLambda);

    /* renamed from: tryReceive-PtdJZtk */
    Object mo4189tryReceivePtdJZtk();
}
