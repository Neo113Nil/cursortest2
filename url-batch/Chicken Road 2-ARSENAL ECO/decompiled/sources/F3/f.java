package F3;

import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class f implements O3.d {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f729a;

    /* renamed from: b, reason: collision with root package name */
    public final int f730b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f731c = new AtomicBoolean(false);

    public f(FlutterJNI flutterJNI, int i7) {
        this.f729a = flutterJNI;
        this.f730b = i7;
    }

    @Override // O3.d
    public final void a(ByteBuffer byteBuffer) {
        if (this.f731c.getAndSet(true)) {
            throw new IllegalStateException("Reply already submitted");
        }
        int i7 = this.f730b;
        FlutterJNI flutterJNI = this.f729a;
        if (byteBuffer == null) {
            flutterJNI.invokePlatformMessageEmptyResponseCallback(i7);
        } else {
            flutterJNI.invokePlatformMessageResponseCallback(i7, byteBuffer, byteBuffer.position());
        }
    }
}
