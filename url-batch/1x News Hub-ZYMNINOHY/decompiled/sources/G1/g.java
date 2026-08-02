package G1;

import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class g implements P1.e {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f549a;

    /* renamed from: b, reason: collision with root package name */
    public final int f550b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f551c = new AtomicBoolean(false);

    public g(FlutterJNI flutterJNI, int i3) {
        this.f549a = flutterJNI;
        this.f550b = i3;
    }

    @Override // P1.e
    public final void a(ByteBuffer byteBuffer) {
        if (this.f551c.getAndSet(true)) {
            throw new IllegalStateException("Reply already submitted");
        }
        int i3 = this.f550b;
        FlutterJNI flutterJNI = this.f549a;
        if (byteBuffer == null) {
            flutterJNI.invokePlatformMessageEmptyResponseCallback(i3);
        } else {
            flutterJNI.invokePlatformMessageResponseCallback(i3, byteBuffer, byteBuffer.position());
        }
    }
}
