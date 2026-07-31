package f1;

import f1.i;
import java.util.ArrayList;
import java.util.Arrays;
import m4.q;
import o2.a0;
import r0.n2;
import r0.s1;
import w0.h0;

/* loaded from: classes.dex */
final class j extends i {

    /* renamed from: n, reason: collision with root package name */
    private a f16155n;

    /* renamed from: o, reason: collision with root package name */
    private int f16156o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f16157p;

    /* renamed from: q, reason: collision with root package name */
    private h0.d f16158q;

    /* renamed from: r, reason: collision with root package name */
    private h0.b f16159r;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final h0.d f16160a;

        /* renamed from: b, reason: collision with root package name */
        public final h0.b f16161b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f16162c;

        /* renamed from: d, reason: collision with root package name */
        public final h0.c[] f16163d;

        /* renamed from: e, reason: collision with root package name */
        public final int f16164e;

        public a(h0.d dVar, h0.b bVar, byte[] bArr, h0.c[] cVarArr, int i7) {
            this.f16160a = dVar;
            this.f16161b = bVar;
            this.f16162c = bArr;
            this.f16163d = cVarArr;
            this.f16164e = i7;
        }
    }

    j() {
    }

    static void n(a0 a0Var, long j7) {
        if (a0Var.b() < a0Var.f() + 4) {
            a0Var.L(Arrays.copyOf(a0Var.d(), a0Var.f() + 4));
        } else {
            a0Var.N(a0Var.f() + 4);
        }
        byte[] d7 = a0Var.d();
        d7[a0Var.f() - 4] = (byte) (j7 & 255);
        d7[a0Var.f() - 3] = (byte) ((j7 >>> 8) & 255);
        d7[a0Var.f() - 2] = (byte) ((j7 >>> 16) & 255);
        d7[a0Var.f() - 1] = (byte) ((j7 >>> 24) & 255);
    }

    private static int o(byte b7, a aVar) {
        return !aVar.f16163d[p(b7, aVar.f16164e, 1)].f22926a ? aVar.f16160a.f22936g : aVar.f16160a.f22937h;
    }

    static int p(byte b7, int i7, int i8) {
        return (b7 >> i8) & (255 >>> (8 - i7));
    }

    public static boolean r(a0 a0Var) {
        try {
            return h0.m(1, a0Var, true);
        } catch (n2 unused) {
            return false;
        }
    }

    @Override // f1.i
    protected void e(long j7) {
        super.e(j7);
        this.f16157p = j7 != 0;
        h0.d dVar = this.f16158q;
        this.f16156o = dVar != null ? dVar.f22936g : 0;
    }

    @Override // f1.i
    protected long f(a0 a0Var) {
        if ((a0Var.d()[0] & 1) == 1) {
            return -1L;
        }
        int o7 = o(a0Var.d()[0], (a) o2.a.h(this.f16155n));
        long j7 = this.f16157p ? (this.f16156o + o7) / 4 : 0;
        n(a0Var, j7);
        this.f16157p = true;
        this.f16156o = o7;
        return j7;
    }

    @Override // f1.i
    protected boolean h(a0 a0Var, long j7, i.b bVar) {
        if (this.f16155n != null) {
            o2.a.e(bVar.f16153a);
            return false;
        }
        a q7 = q(a0Var);
        this.f16155n = q7;
        if (q7 == null) {
            return true;
        }
        h0.d dVar = q7.f16160a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar.f22939j);
        arrayList.add(q7.f16162c);
        bVar.f16153a = new s1.b().e0("audio/vorbis").G(dVar.f22934e).Z(dVar.f22933d).H(dVar.f22931b).f0(dVar.f22932c).T(arrayList).X(h0.c(q.u(q7.f16161b.f22924b))).E();
        return true;
    }

    @Override // f1.i
    protected void l(boolean z6) {
        super.l(z6);
        if (z6) {
            this.f16155n = null;
            this.f16158q = null;
            this.f16159r = null;
        }
        this.f16156o = 0;
        this.f16157p = false;
    }

    a q(a0 a0Var) {
        h0.d dVar = this.f16158q;
        if (dVar == null) {
            this.f16158q = h0.k(a0Var);
            return null;
        }
        h0.b bVar = this.f16159r;
        if (bVar == null) {
            this.f16159r = h0.i(a0Var);
            return null;
        }
        byte[] bArr = new byte[a0Var.f()];
        System.arraycopy(a0Var.d(), 0, bArr, 0, a0Var.f());
        return new a(dVar, bVar, bArr, h0.l(a0Var, dVar.f22931b), h0.a(r4.length - 1));
    }
}
