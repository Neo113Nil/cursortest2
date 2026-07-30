package g0;

import f0.l;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class f implements n0.d {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f351a;

    /* renamed from: b, reason: collision with root package name */
    public final int f352b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f353c = new AtomicBoolean(false);

    public f(FlutterJNI flutterJNI, int i2) {
        this.f351a = flutterJNI;
        this.f352b = i2;
    }

    @Override // n0.d
    public final void a(ByteBuffer byteBuffer) {
        if (this.f353c.getAndSet(true)) {
            l.b("Reply already submitted");
            return;
        }
        int i2 = this.f352b;
        FlutterJNI flutterJNI = this.f351a;
        if (byteBuffer == null) {
            flutterJNI.invokePlatformMessageEmptyResponseCallback(i2);
        } else {
            flutterJNI.invokePlatformMessageResponseCallback(i2, byteBuffer, byteBuffer.position());
        }
    }
}
