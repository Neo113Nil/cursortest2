package m1;

import java.io.IOException;
import java.net.ProtocolException;
import v1.u;
import v1.y;

/* loaded from: classes.dex */
public final class c implements u {

    /* renamed from: a, reason: collision with root package name */
    public final u f3539a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3540b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3541c;

    /* renamed from: d, reason: collision with root package name */
    public long f3542d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3543e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f3544f;

    public c(e eVar, u uVar, long j2) {
        X0.f.e(uVar, "delegate");
        this.f3544f = eVar;
        this.f3539a = uVar;
        this.f3540b = j2;
    }

    @Override // v1.u
    public final y a() {
        return this.f3539a.a();
    }

    @Override // v1.u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3543e) {
            return;
        }
        this.f3543e = true;
        long j2 = this.f3540b;
        if (j2 != -1 && this.f3542d != j2) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            g();
            h(null);
        } catch (IOException e2) {
            throw h(e2);
        }
    }

    @Override // v1.u
    public final void d(v1.f fVar, long j2) {
        if (this.f3543e) {
            throw new IllegalStateException("closed");
        }
        long j3 = this.f3540b;
        if (j3 == -1 || this.f3542d + j2 <= j3) {
            try {
                this.f3539a.d(fVar, j2);
                this.f3542d += j2;
                return;
            } catch (IOException e2) {
                throw h(e2);
            }
        }
        throw new ProtocolException("expected " + j3 + " bytes but received " + (this.f3542d + j2));
    }

    @Override // v1.u, java.io.Flushable
    public final void flush() {
        try {
            i();
        } catch (IOException e2) {
            throw h(e2);
        }
    }

    public final void g() {
        this.f3539a.close();
    }

    public final IOException h(IOException iOException) {
        if (this.f3541c) {
            return iOException;
        }
        this.f3541c = true;
        return this.f3544f.a(false, true, iOException);
    }

    public final void i() {
        this.f3539a.flush();
    }

    public final String toString() {
        return c.class.getSimpleName() + '(' + this.f3539a + ')';
    }
}
