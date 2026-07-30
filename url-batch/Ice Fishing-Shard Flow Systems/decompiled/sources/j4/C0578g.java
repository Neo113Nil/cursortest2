package j4;

import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: j4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0578g implements s4.e {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f5972a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5973b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f5974c = new AtomicBoolean(false);

    public C0578g(FlutterJNI flutterJNI, int i2) {
        this.f5972a = flutterJNI;
        this.f5973b = i2;
    }

    @Override // s4.e
    public final void a(ByteBuffer byteBuffer) {
        if (this.f5974c.getAndSet(true)) {
            throw new IllegalStateException("Reply already submitted");
        }
        int i2 = this.f5973b;
        FlutterJNI flutterJNI = this.f5972a;
        if (byteBuffer == null) {
            flutterJNI.invokePlatformMessageEmptyResponseCallback(i2);
        } else {
            flutterJNI.invokePlatformMessageResponseCallback(i2, byteBuffer, byteBuffer.position());
        }
    }
}
