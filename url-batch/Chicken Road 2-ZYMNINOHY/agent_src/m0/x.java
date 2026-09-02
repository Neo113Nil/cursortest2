package m0;

import android.os.Handler;
import android.os.HandlerThread;
import io.appmetrica.analytics.impl.ap;
import java.io.Closeable;
import java.io.OutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class x implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final OutputStream f14467a;

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f14468b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f14469c;

    public x(y yVar, OutputStream outputStream) {
        this.f14467a = outputStream;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:RtspMessageChannel:Sender");
        this.f14468b = handlerThread;
        handlerThread.start();
        this.f14469c = new Handler(handlerThread.getLooper());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        HandlerThread handlerThread = this.f14468b;
        Objects.requireNonNull(handlerThread);
        this.f14469c.post(new ap(3, handlerThread));
        try {
            handlerThread.join();
        } catch (InterruptedException unused) {
            handlerThread.interrupt();
        }
    }
}
