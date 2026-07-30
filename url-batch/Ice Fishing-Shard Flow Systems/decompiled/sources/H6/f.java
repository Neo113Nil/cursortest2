package H6;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f implements T6.u {

    /* renamed from: d, reason: collision with root package name */
    public final T6.u f1036d;

    /* renamed from: e, reason: collision with root package name */
    public final long f1037e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1038i;

    /* renamed from: l, reason: collision with root package name */
    public long f1039l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1040m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1041n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ h f1042o;

    public f(h hVar, T6.u delegate, long j) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f1042o = hVar;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f1036d = delegate;
        this.f1037e = j;
        this.f1040m = hVar.f1050a;
    }

    public final void a() {
        this.f1036d.close();
    }

    @Override // T6.u
    public final T6.y b() {
        return this.f1036d.b();
    }

    @Override // T6.u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1041n) {
            return;
        }
        this.f1041n = true;
        long j = this.f1037e;
        if (j != -1 && this.f1039l != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            a();
            d(null);
        } catch (IOException e7) {
            IOException d7 = d(e7);
            Intrinsics.b(d7);
            throw d7;
        }
    }

    public final IOException d(IOException iOException) {
        if (this.f1038i) {
            return iOException;
        }
        this.f1038i = true;
        return h.a(this.f1042o, iOException, 2);
    }

    @Override // T6.u, java.io.Flushable
    public final void flush() {
        try {
            g();
        } catch (IOException e7) {
            IOException d7 = d(e7);
            Intrinsics.b(d7);
            throw d7;
        }
    }

    public final void g() {
        this.f1036d.flush();
    }

    public final String toString() {
        return f.class.getSimpleName() + '(' + this.f1036d + ')';
    }

    @Override // T6.u
    public final void x(long j, T6.f source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f1041n) {
            throw new IllegalStateException("closed");
        }
        long j7 = this.f1037e;
        if (j7 != -1 && this.f1039l + j > j7) {
            throw new ProtocolException("expected " + j7 + " bytes but received " + (this.f1039l + j));
        }
        try {
            if (this.f1040m) {
                this.f1040m = false;
                h hVar = this.f1042o;
                hVar.getClass();
                q call = (q) hVar.f1052c;
                Intrinsics.checkNotNullParameter(call, "call");
            }
            Intrinsics.checkNotNullParameter(source, "source");
            this.f1036d.x(j, source);
            this.f1039l += j;
        } catch (IOException e7) {
            IOException d7 = d(e7);
            Intrinsics.b(d7);
            throw d7;
        }
    }
}
