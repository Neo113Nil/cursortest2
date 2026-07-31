package okhttp3.internal.ws;

import f2.AbstractC2420c;
import java.io.Closeable;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.C3372e;
import okio.h;
import okio.i;
import okio.z;

@Metadata
/* loaded from: classes3.dex */
public final class MessageDeflater implements Closeable, AutoCloseable {

    /* renamed from: b, reason: collision with root package name */
    private final boolean f43166b;

    /* renamed from: c, reason: collision with root package name */
    private final C3372e f43167c;

    /* renamed from: d, reason: collision with root package name */
    private final Deflater f43168d;

    /* renamed from: e, reason: collision with root package name */
    private final i f43169e;

    public MessageDeflater(boolean z4) {
        this.f43166b = z4;
        C3372e c3372e = new C3372e();
        this.f43167c = c3372e;
        Deflater deflater = new Deflater(-1, true);
        this.f43168d = deflater;
        this.f43169e = new i((z) c3372e, deflater);
    }

    private final boolean b(C3372e c3372e, h hVar) {
        return c3372e.D(c3372e.l0() - hVar.v(), hVar);
    }

    public final void a(C3372e buffer) {
        h hVar;
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (this.f43167c.l0() != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.f43166b) {
            this.f43168d.reset();
        }
        this.f43169e.write(buffer, buffer.l0());
        this.f43169e.flush();
        C3372e c3372e = this.f43167c;
        hVar = MessageDeflaterKt.f43170a;
        if (b(c3372e, hVar)) {
            long l02 = this.f43167c.l0() - 4;
            C3372e.a d02 = C3372e.d0(this.f43167c, null, 1, null);
            try {
                d02.o(l02);
                AbstractC2420c.a(d02, null);
            } finally {
            }
        } else {
            this.f43167c.w(0);
        }
        C3372e c3372e2 = this.f43167c;
        buffer.write(c3372e2, c3372e2.l0());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f43169e.close();
    }
}
