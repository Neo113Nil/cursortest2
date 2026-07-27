package q3;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;
import z3.C1448f;
import z3.F;
import z3.H;

/* loaded from: classes.dex */
public final class c implements F {

    /* renamed from: d, reason: collision with root package name */
    public final F f9370d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9371e;

    /* renamed from: i, reason: collision with root package name */
    public long f9372i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f9373j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9374k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f9375l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C.F f9376m;

    public c(C.F f4, F delegate, long j4) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f9376m = f4;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f9370d = delegate;
        this.f9371e = j4;
        this.f9373j = true;
        if (j4 == 0) {
            b(null);
        }
    }

    public final void a() {
        this.f9370d.close();
    }

    public final IOException b(IOException iOException) {
        if (this.f9374k) {
            return iOException;
        }
        this.f9374k = true;
        C.F f4 = this.f9376m;
        if (iOException == null && this.f9373j) {
            this.f9373j = false;
            f4.getClass();
            g call = (g) f4.f1052b;
            Intrinsics.checkNotNullParameter(call, "call");
        }
        return f4.a(true, false, iOException);
    }

    @Override // z3.F
    public final H c() {
        return this.f9370d.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f9375l) {
            return;
        }
        this.f9375l = true;
        try {
            a();
            b(null);
        } catch (IOException e4) {
            throw b(e4);
        }
    }

    @Override // z3.F
    public final long l(C1448f sink, long j4) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (this.f9375l) {
            throw new IllegalStateException("closed");
        }
        try {
            long l4 = this.f9370d.l(sink, j4);
            if (this.f9373j) {
                this.f9373j = false;
                C.F f4 = this.f9376m;
                f4.getClass();
                g call = (g) f4.f1052b;
                Intrinsics.checkNotNullParameter(call, "call");
            }
            if (l4 == -1) {
                b(null);
                return -1L;
            }
            long j5 = this.f9372i + l4;
            long j6 = this.f9371e;
            if (j6 == -1 || j5 <= j6) {
                this.f9372i = j5;
                if (j5 == j6) {
                    b(null);
                }
                return l4;
            }
            throw new ProtocolException("expected " + j6 + " bytes but received " + j5);
        } catch (IOException e4) {
            throw b(e4);
        }
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f9370d + ')';
    }
}
