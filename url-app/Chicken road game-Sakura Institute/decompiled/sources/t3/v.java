package t3;

import A.AbstractC0017m;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import z3.C1448f;
import z3.F;
import z3.H;

/* loaded from: classes.dex */
public final class v implements F {

    /* renamed from: d, reason: collision with root package name */
    public final long f10856d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10857e;

    /* renamed from: i, reason: collision with root package name */
    public final C1448f f10858i = new C1448f();

    /* renamed from: j, reason: collision with root package name */
    public final C1448f f10859j = new C1448f();

    /* renamed from: k, reason: collision with root package name */
    public boolean f10860k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x f10861l;

    public v(x xVar, long j4, boolean z4) {
        this.f10861l = xVar;
        this.f10856d = j4;
        this.f10857e = z4;
    }

    @Override // z3.F
    public final H c() {
        return this.f10861l.f10873k;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j4;
        x xVar = this.f10861l;
        synchronized (xVar) {
            this.f10860k = true;
            C1448f c1448f = this.f10859j;
            j4 = c1448f.f11999e;
            c1448f.s(j4);
            xVar.notifyAll();
            Unit unit = Unit.f7487a;
        }
        if (j4 > 0) {
            byte[] bArr = n3.b.f8558a;
            this.f10861l.f10864b.h(j4);
        }
        this.f10861l.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008b A[LOOP:0: B:3:0x0010->B:40:0x008b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e A[SYNTHETIC] */
    @Override // z3.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long l(C1448f sink, long j4) {
        EnumC1211b enumC1211b;
        Throwable th;
        boolean z4;
        long j5;
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j6 = 0;
        if (j4 < 0) {
            throw new IllegalArgumentException(AbstractC0017m.i("byteCount < 0: ", j4).toString());
        }
        while (true) {
            x xVar = this.f10861l;
            synchronized (xVar) {
                xVar.f10873k.h();
                try {
                    synchronized (xVar) {
                        enumC1211b = xVar.f10875m;
                    }
                    if (z4) {
                        if (j5 != -1) {
                            return j5;
                        }
                        if (th == null) {
                            return -1L;
                        }
                        throw th;
                    }
                    j6 = 0;
                } catch (Throwable th2) {
                    xVar.f10873k.k();
                    throw th2;
                }
            }
            if (enumC1211b == null || this.f10857e) {
                th = null;
            } else {
                th = xVar.f10876n;
                if (th == null) {
                    synchronized (xVar) {
                        EnumC1211b enumC1211b2 = xVar.f10875m;
                        Intrinsics.c(enumC1211b2);
                        th = new C(enumC1211b2);
                    }
                }
            }
            if (this.f10860k) {
                throw new IOException("stream closed");
            }
            C1448f c1448f = this.f10859j;
            long j7 = c1448f.f11999e;
            z4 = false;
            if (j7 > j6) {
                j5 = c1448f.l(sink, Math.min(j4, j7));
                long j8 = xVar.f10865c + j5;
                xVar.f10865c = j8;
                long j9 = j8 - xVar.f10866d;
                if (th == null && j9 >= xVar.f10864b.f10829v.a() / 2) {
                    xVar.f10864b.k(j9, xVar.f10863a);
                    xVar.f10866d = xVar.f10865c;
                }
            } else {
                if (!this.f10857e && th == null) {
                    xVar.k();
                    z4 = true;
                }
                j5 = -1;
            }
            xVar.f10873k.k();
            Unit unit = Unit.f7487a;
            if (z4) {
            }
        }
    }
}
