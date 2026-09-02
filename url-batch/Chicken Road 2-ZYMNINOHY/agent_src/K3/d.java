package K3;

import T3.v;
import T3.x;
import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class d implements v {

    /* renamed from: a, reason: collision with root package name */
    public final v f1538a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1539b;

    /* renamed from: c, reason: collision with root package name */
    public long f1540c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1541d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1542e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1543f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f1544g;

    public d(e eVar, v delegate, long j4) {
        kotlin.jvm.internal.i.e(delegate, "delegate");
        this.f1544g = eVar;
        this.f1538a = delegate;
        this.f1539b = j4;
        this.f1541d = true;
        if (j4 == 0) {
            b(null);
        }
    }

    public final void a() {
        this.f1538a.close();
    }

    public final IOException b(IOException iOException) {
        if (this.f1542e) {
            return iOException;
        }
        this.f1542e = true;
        if (iOException == null && this.f1541d) {
            this.f1541d = false;
        }
        return this.f1544g.a(true, false, iOException);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1543f) {
            return;
        }
        this.f1543f = true;
        try {
            a();
            b(null);
        } catch (IOException e4) {
            throw b(e4);
        }
    }

    @Override // T3.v
    public final x d() {
        return this.f1538a.d();
    }

    @Override // T3.v
    public final long j(T3.g sink, long j4) {
        kotlin.jvm.internal.i.e(sink, "sink");
        if (this.f1543f) {
            throw new IllegalStateException("closed");
        }
        try {
            long j5 = this.f1538a.j(sink, 8192L);
            if (this.f1541d) {
                this.f1541d = false;
            }
            if (j5 == -1) {
                b(null);
                return -1L;
            }
            long j6 = this.f1540c + j5;
            long j7 = this.f1539b;
            if (j7 == -1 || j6 <= j7) {
                this.f1540c = j6;
                if (j6 == j7) {
                    b(null);
                }
                return j5;
            }
            throw new ProtocolException("expected " + j7 + " bytes but received " + j6);
        } catch (IOException e4) {
            throw b(e4);
        }
    }

    public final String toString() {
        return d.class.getSimpleName() + '(' + this.f1538a + ')';
    }
}
