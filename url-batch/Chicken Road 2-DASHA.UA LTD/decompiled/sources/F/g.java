package F;

import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class g implements N.e {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f217a;

    /* renamed from: b, reason: collision with root package name */
    public final int f218b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f219c = new AtomicBoolean(false);

    public g(FlutterJNI flutterJNI, int i2) {
        this.f217a = flutterJNI;
        this.f218b = i2;
    }

    @Override // N.e
    public final void a(ByteBuffer byteBuffer) {
        if (this.f219c.getAndSet(true)) {
            throw new IllegalStateException("Reply already submitted");
        }
        int i2 = this.f218b;
        FlutterJNI flutterJNI = this.f217a;
        if (byteBuffer == null) {
            flutterJNI.invokePlatformMessageEmptyResponseCallback(i2);
        } else {
            flutterJNI.invokePlatformMessageResponseCallback(i2, byteBuffer, byteBuffer.position());
        }
    }
}
