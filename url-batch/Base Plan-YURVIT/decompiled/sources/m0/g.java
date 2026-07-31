package m0;

import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import v0.InterfaceC0240e;

/* loaded from: classes.dex */
public final class g implements InterfaceC0240e {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f2874a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2875b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f2876c = new AtomicBoolean(false);

    public g(FlutterJNI flutterJNI, int i2) {
        this.f2874a = flutterJNI;
        this.f2875b = i2;
    }

    @Override // v0.InterfaceC0240e
    public final void a(ByteBuffer byteBuffer) {
        if (this.f2876c.getAndSet(true)) {
            throw new IllegalStateException("Reply already submitted");
        }
        int i2 = this.f2875b;
        FlutterJNI flutterJNI = this.f2874a;
        if (byteBuffer == null) {
            flutterJNI.invokePlatformMessageEmptyResponseCallback(i2);
        } else {
            flutterJNI.invokePlatformMessageResponseCallback(i2, byteBuffer, byteBuffer.position());
        }
    }
}
