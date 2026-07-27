package q3;

import C.F;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;
import z3.C1448f;
import z3.D;
import z3.H;

/* loaded from: classes.dex */
public final class b implements D {

    /* renamed from: d, reason: collision with root package name */
    public final D f9364d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9365e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9366i;

    /* renamed from: j, reason: collision with root package name */
    public long f9367j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9368k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ F f9369l;

    public b(F f4, D delegate, long j4) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f9369l = f4;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f9364d = delegate;
        this.f9365e = j4;
    }

    public final void a() {
        this.f9364d.close();
    }

    public final IOException b(IOException iOException) {
        if (this.f9366i) {
            return iOException;
        }
        this.f9366i = true;
        return this.f9369l.a(false, true, iOException);
    }

    @Override // z3.D
    public final H c() {
        return this.f9364d.c();
    }

    @Override // z3.D, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f9368k) {
            return;
        }
        this.f9368k = true;
        long j4 = this.f9365e;
        if (j4 != -1 && this.f9367j != j4) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            a();
            b(null);
        } catch (IOException e4) {
            throw b(e4);
        }
    }

    public final void d() {
        this.f9364d.flush();
    }

    @Override // z3.D
    public final void e(C1448f source, long j4) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f9368k) {
            throw new IllegalStateException("closed");
        }
        long j5 = this.f9365e;
        if (j5 != -1 && this.f9367j + j4 > j5) {
            throw new ProtocolException("expected " + j5 + " bytes but received " + (this.f9367j + j4));
        }
        try {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f9364d.e(source, j4);
            this.f9367j += j4;
        } catch (IOException e4) {
            throw b(e4);
        }
    }

    @Override // z3.D, java.io.Flushable
    public final void flush() {
        try {
            d();
        } catch (IOException e4) {
            throw b(e4);
        }
    }

    public final String toString() {
        return b.class.getSimpleName() + '(' + this.f9364d + ')';
    }
}
