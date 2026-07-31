package okhttp3.internal.ws;

import java.io.Closeable;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.B;
import okio.C3372e;
import okio.n;

@Metadata
/* loaded from: classes3.dex */
public final class MessageInflater implements Closeable, AutoCloseable {

    /* renamed from: b, reason: collision with root package name */
    private final boolean f43171b;

    /* renamed from: c, reason: collision with root package name */
    private final C3372e f43172c;

    /* renamed from: d, reason: collision with root package name */
    private final Inflater f43173d;

    /* renamed from: e, reason: collision with root package name */
    private final n f43174e;

    public MessageInflater(boolean z4) {
        this.f43171b = z4;
        C3372e c3372e = new C3372e();
        this.f43172c = c3372e;
        Inflater inflater = new Inflater(true);
        this.f43173d = inflater;
        this.f43174e = new n((B) c3372e, inflater);
    }

    public final void a(C3372e buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (this.f43172c.l0() != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.f43171b) {
            this.f43173d.reset();
        }
        this.f43172c.F(buffer);
        this.f43172c.t(65535);
        long bytesRead = this.f43173d.getBytesRead() + this.f43172c.l0();
        do {
            this.f43174e.a(buffer, Long.MAX_VALUE);
        } while (this.f43173d.getBytesRead() < bytesRead);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f43174e.close();
    }
}
