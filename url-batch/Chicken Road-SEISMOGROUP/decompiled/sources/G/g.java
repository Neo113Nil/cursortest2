package G;

import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class g implements N.e {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f292a;

    /* renamed from: b, reason: collision with root package name */
    public final int f293b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f294c = new AtomicBoolean(false);

    public g(FlutterJNI flutterJNI, int i2) {
        this.f292a = flutterJNI;
        this.f293b = i2;
    }

    @Override // N.e
    public final void a(ByteBuffer byteBuffer) {
        if (this.f294c.getAndSet(true)) {
            throw new IllegalStateException("Reply already submitted");
        }
        int i2 = this.f293b;
        FlutterJNI flutterJNI = this.f292a;
        if (byteBuffer == null) {
            flutterJNI.invokePlatformMessageEmptyResponseCallback(i2);
        } else {
            flutterJNI.invokePlatformMessageResponseCallback(i2, byteBuffer, byteBuffer.position());
        }
    }
}
