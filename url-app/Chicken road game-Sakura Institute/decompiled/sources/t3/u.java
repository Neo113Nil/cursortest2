package t3;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import z3.C1448f;
import z3.D;
import z3.H;

/* loaded from: classes.dex */
public final class u implements D {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10852d;

    /* renamed from: e, reason: collision with root package name */
    public final C1448f f10853e = new C1448f();

    /* renamed from: i, reason: collision with root package name */
    public boolean f10854i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x f10855j;

    public u(x xVar, boolean z4) {
        this.f10855j = xVar;
        this.f10852d = z4;
    }

    public final void a(boolean z4) {
        long min;
        boolean z5;
        x xVar = this.f10855j;
        synchronized (xVar) {
            try {
                xVar.f10874l.h();
                while (xVar.f10867e >= xVar.f10868f && !this.f10852d && !this.f10854i) {
                    try {
                        synchronized (xVar) {
                            EnumC1211b enumC1211b = xVar.f10875m;
                            if (enumC1211b != null) {
                                break;
                            } else {
                                xVar.k();
                            }
                        }
                    } finally {
                        xVar.f10874l.k();
                    }
                }
                xVar.f10874l.k();
                xVar.b();
                min = Math.min(xVar.f10868f - xVar.f10867e, this.f10853e.f11999e);
                xVar.f10867e += min;
                z5 = z4 && min == this.f10853e.f11999e;
                Unit unit = Unit.f7487a;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f10855j.f10874l.h();
        try {
            x xVar2 = this.f10855j;
            xVar2.f10864b.i(xVar2.f10863a, z5, this.f10853e, min);
        } finally {
            xVar = this.f10855j;
        }
    }

    @Override // z3.D
    public final H c() {
        return this.f10855j.f10874l;
    }

    @Override // z3.D, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z4;
        x xVar = this.f10855j;
        byte[] bArr = n3.b.f8558a;
        synchronized (xVar) {
            if (this.f10854i) {
                return;
            }
            synchronized (xVar) {
                z4 = xVar.f10875m == null;
                Unit unit = Unit.f7487a;
            }
            x xVar2 = this.f10855j;
            if (!xVar2.f10872j.f10852d) {
                if (this.f10853e.f11999e > 0) {
                    while (this.f10853e.f11999e > 0) {
                        a(true);
                    }
                } else if (z4) {
                    xVar2.f10864b.i(xVar2.f10863a, true, null, 0L);
                }
            }
            synchronized (this.f10855j) {
                this.f10854i = true;
                Unit unit2 = Unit.f7487a;
            }
            this.f10855j.f10864b.flush();
            this.f10855j.a();
        }
    }

    @Override // z3.D
    public final void e(C1448f source, long j4) {
        Intrinsics.checkNotNullParameter(source, "source");
        byte[] bArr = n3.b.f8558a;
        C1448f c1448f = this.f10853e;
        c1448f.e(source, j4);
        while (c1448f.f11999e >= 16384) {
            a(false);
        }
    }

    @Override // z3.D, java.io.Flushable
    public final void flush() {
        x xVar = this.f10855j;
        byte[] bArr = n3.b.f8558a;
        synchronized (xVar) {
            xVar.b();
            Unit unit = Unit.f7487a;
        }
        while (this.f10853e.f11999e > 0) {
            a(false);
            this.f10855j.f10864b.flush();
        }
    }
}
