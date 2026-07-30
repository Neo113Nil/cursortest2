package e0;

import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: e0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0119g implements n0.e {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f1868a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1869b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f1870c = new AtomicBoolean(false);

    public C0119g(FlutterJNI flutterJNI, int i2) {
        this.f1868a = flutterJNI;
        this.f1869b = i2;
    }

    @Override // n0.e
    public final void a(ByteBuffer byteBuffer) {
        if (this.f1870c.getAndSet(true)) {
            throw new IllegalStateException("Reply already submitted");
        }
        int i2 = this.f1869b;
        FlutterJNI flutterJNI = this.f1868a;
        if (byteBuffer == null) {
            flutterJNI.invokePlatformMessageEmptyResponseCallback(i2);
        } else {
            flutterJNI.invokePlatformMessageResponseCallback(i2, byteBuffer, byteBuffer.position());
        }
    }
}
