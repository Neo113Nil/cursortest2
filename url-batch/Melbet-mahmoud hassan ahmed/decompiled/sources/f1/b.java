package f1;

import f1.i;
import java.util.Arrays;
import o2.a0;
import o2.m0;
import w0.b0;
import w0.m;
import w0.s;
import w0.t;
import w0.u;
import w0.v;

/* loaded from: classes.dex */
final class b extends i {

    /* renamed from: n, reason: collision with root package name */
    private v f16110n;

    /* renamed from: o, reason: collision with root package name */
    private a f16111o;

    private static final class a implements g {

        /* renamed from: a, reason: collision with root package name */
        private v f16112a;

        /* renamed from: b, reason: collision with root package name */
        private v.a f16113b;

        /* renamed from: c, reason: collision with root package name */
        private long f16114c = -1;

        /* renamed from: d, reason: collision with root package name */
        private long f16115d = -1;

        public a(v vVar, v.a aVar) {
            this.f16112a = vVar;
            this.f16113b = aVar;
        }

        @Override // f1.g
        public b0 a() {
            o2.a.f(this.f16114c != -1);
            return new u(this.f16112a, this.f16114c);
        }

        @Override // f1.g
        public long b(m mVar) {
            long j7 = this.f16115d;
            if (j7 < 0) {
                return -1L;
            }
            long j8 = -(j7 + 2);
            this.f16115d = -1L;
            return j8;
        }

        @Override // f1.g
        public void c(long j7) {
            long[] jArr = this.f16113b.f22978a;
            this.f16115d = jArr[m0.i(jArr, j7, true, true)];
        }

        public void d(long j7) {
            this.f16114c = j7;
        }
    }

    b() {
    }

    private int n(a0 a0Var) {
        int i7 = (a0Var.d()[2] & 255) >> 4;
        if (i7 == 6 || i7 == 7) {
            a0Var.P(4);
            a0Var.J();
        }
        int j7 = s.j(a0Var, i7);
        a0Var.O(0);
        return j7;
    }

    private static boolean o(byte[] bArr) {
        return bArr[0] == -1;
    }

    public static boolean p(a0 a0Var) {
        return a0Var.a() >= 5 && a0Var.C() == 127 && a0Var.E() == 1179402563;
    }

    @Override // f1.i
    protected long f(a0 a0Var) {
        if (o(a0Var.d())) {
            return n(a0Var);
        }
        return -1L;
    }

    @Override // f1.i
    protected boolean h(a0 a0Var, long j7, i.b bVar) {
        byte[] d7 = a0Var.d();
        v vVar = this.f16110n;
        if (vVar == null) {
            v vVar2 = new v(d7, 17);
            this.f16110n = vVar2;
            bVar.f16153a = vVar2.g(Arrays.copyOfRange(d7, 9, a0Var.f()), null);
            return true;
        }
        if ((d7[0] & Byte.MAX_VALUE) == 3) {
            v.a f7 = t.f(a0Var);
            v b7 = vVar.b(f7);
            this.f16110n = b7;
            this.f16111o = new a(b7, f7);
            return true;
        }
        if (!o(d7)) {
            return true;
        }
        a aVar = this.f16111o;
        if (aVar != null) {
            aVar.d(j7);
            bVar.f16154b = this.f16111o;
        }
        o2.a.e(bVar.f16153a);
        return false;
    }

    @Override // f1.i
    protected void l(boolean z6) {
        super.l(z6);
        if (z6) {
            this.f16110n = null;
            this.f16111o = null;
        }
    }
}
