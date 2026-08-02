package o0;

import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import w0.InterfaceC0319e;

/* loaded from: classes.dex */
public final class g implements InterfaceC0319e {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f3344a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3345b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f3346c = new AtomicBoolean(false);

    public g(FlutterJNI flutterJNI, int i2) {
        this.f3344a = flutterJNI;
        this.f3345b = i2;
    }

    @Override // w0.InterfaceC0319e
    public final void a(ByteBuffer byteBuffer) {
        if (this.f3346c.getAndSet(true)) {
            throw new IllegalStateException("Reply already submitted");
        }
        int i2 = this.f3345b;
        FlutterJNI flutterJNI = this.f3344a;
        if (byteBuffer == null) {
            flutterJNI.invokePlatformMessageEmptyResponseCallback(i2);
        } else {
            flutterJNI.invokePlatformMessageResponseCallback(i2, byteBuffer, byteBuffer.position());
        }
    }
}
