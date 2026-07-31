package f2;

import android.graphics.Bitmap;
import c2.b;
import c2.g;
import c2.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
import o2.a0;
import o2.m0;

/* loaded from: classes.dex */
public final class a extends g {

    /* renamed from: o, reason: collision with root package name */
    private final a0 f16165o;

    /* renamed from: p, reason: collision with root package name */
    private final a0 f16166p;

    /* renamed from: q, reason: collision with root package name */
    private final C0062a f16167q;

    /* renamed from: r, reason: collision with root package name */
    private Inflater f16168r;

    /* renamed from: f2.a$a, reason: collision with other inner class name */
    private static final class C0062a {

        /* renamed from: a, reason: collision with root package name */
        private final a0 f16169a = new a0();

        /* renamed from: b, reason: collision with root package name */
        private final int[] f16170b = new int[256];

        /* renamed from: c, reason: collision with root package name */
        private boolean f16171c;

        /* renamed from: d, reason: collision with root package name */
        private int f16172d;

        /* renamed from: e, reason: collision with root package name */
        private int f16173e;

        /* renamed from: f, reason: collision with root package name */
        private int f16174f;

        /* renamed from: g, reason: collision with root package name */
        private int f16175g;

        /* renamed from: h, reason: collision with root package name */
        private int f16176h;

        /* renamed from: i, reason: collision with root package name */
        private int f16177i;

        /* JADX INFO: Access modifiers changed from: private */
        public void e(a0 a0Var, int i7) {
            int F;
            if (i7 < 4) {
                return;
            }
            a0Var.P(3);
            int i8 = i7 - 4;
            if ((a0Var.C() & 128) != 0) {
                if (i8 < 7 || (F = a0Var.F()) < 4) {
                    return;
                }
                this.f16176h = a0Var.I();
                this.f16177i = a0Var.I();
                this.f16169a.K(F - 4);
                i8 -= 7;
            }
            int e7 = this.f16169a.e();
            int f7 = this.f16169a.f();
            if (e7 >= f7 || i8 <= 0) {
                return;
            }
            int min = Math.min(i8, f7 - e7);
            a0Var.j(this.f16169a.d(), e7, min);
            this.f16169a.O(e7 + min);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(a0 a0Var, int i7) {
            if (i7 < 19) {
                return;
            }
            this.f16172d = a0Var.I();
            this.f16173e = a0Var.I();
            a0Var.P(11);
            this.f16174f = a0Var.I();
            this.f16175g = a0Var.I();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(a0 a0Var, int i7) {
            if (i7 % 5 != 2) {
                return;
            }
            a0Var.P(2);
            Arrays.fill(this.f16170b, 0);
            int i8 = i7 / 5;
            int i9 = 0;
            while (i9 < i8) {
                int C = a0Var.C();
                int C2 = a0Var.C();
                int C3 = a0Var.C();
                int C4 = a0Var.C();
                int C5 = a0Var.C();
                double d7 = C2;
                double d8 = C3 - 128;
                Double.isNaN(d8);
                Double.isNaN(d7);
                int i10 = (int) ((1.402d * d8) + d7);
                int i11 = i9;
                double d9 = C4 - 128;
                Double.isNaN(d9);
                Double.isNaN(d7);
                Double.isNaN(d8);
                Double.isNaN(d9);
                Double.isNaN(d7);
                this.f16170b[C] = m0.q((int) (d7 + (d9 * 1.772d)), 0, 255) | (m0.q((int) ((d7 - (0.34414d * d9)) - (d8 * 0.71414d)), 0, 255) << 8) | (C5 << 24) | (m0.q(i10, 0, 255) << 16);
                i9 = i11 + 1;
            }
            this.f16171c = true;
        }

        public c2.b d() {
            int i7;
            if (this.f16172d == 0 || this.f16173e == 0 || this.f16176h == 0 || this.f16177i == 0 || this.f16169a.f() == 0 || this.f16169a.e() != this.f16169a.f() || !this.f16171c) {
                return null;
            }
            this.f16169a.O(0);
            int i8 = this.f16176h * this.f16177i;
            int[] iArr = new int[i8];
            int i9 = 0;
            while (i9 < i8) {
                int C = this.f16169a.C();
                if (C != 0) {
                    i7 = i9 + 1;
                    iArr[i9] = this.f16170b[C];
                } else {
                    int C2 = this.f16169a.C();
                    if (C2 != 0) {
                        i7 = ((C2 & 64) == 0 ? C2 & 63 : ((C2 & 63) << 8) | this.f16169a.C()) + i9;
                        Arrays.fill(iArr, i9, i7, (C2 & 128) == 0 ? 0 : this.f16170b[this.f16169a.C()]);
                    }
                }
                i9 = i7;
            }
            return new b.C0043b().f(Bitmap.createBitmap(iArr, this.f16176h, this.f16177i, Bitmap.Config.ARGB_8888)).k(this.f16174f / this.f16172d).l(0).h(this.f16175g / this.f16173e, 0).i(0).n(this.f16176h / this.f16172d).g(this.f16177i / this.f16173e).a();
        }

        public void h() {
            this.f16172d = 0;
            this.f16173e = 0;
            this.f16174f = 0;
            this.f16175g = 0;
            this.f16176h = 0;
            this.f16177i = 0;
            this.f16169a.K(0);
            this.f16171c = false;
        }
    }

    public a() {
        super("PgsDecoder");
        this.f16165o = new a0();
        this.f16166p = new a0();
        this.f16167q = new C0062a();
    }

    private void C(a0 a0Var) {
        if (a0Var.a() <= 0 || a0Var.h() != 120) {
            return;
        }
        if (this.f16168r == null) {
            this.f16168r = new Inflater();
        }
        if (m0.q0(a0Var, this.f16166p, this.f16168r)) {
            a0Var.M(this.f16166p.d(), this.f16166p.f());
        }
    }

    private static c2.b D(a0 a0Var, C0062a c0062a) {
        int f7 = a0Var.f();
        int C = a0Var.C();
        int I = a0Var.I();
        int e7 = a0Var.e() + I;
        c2.b bVar = null;
        if (e7 > f7) {
            a0Var.O(f7);
            return null;
        }
        if (C != 128) {
            switch (C) {
                case 20:
                    c0062a.g(a0Var, I);
                    break;
                case 21:
                    c0062a.e(a0Var, I);
                    break;
                case 22:
                    c0062a.f(a0Var, I);
                    break;
            }
        } else {
            bVar = c0062a.d();
            c0062a.h();
        }
        a0Var.O(e7);
        return bVar;
    }

    @Override // c2.g
    protected h A(byte[] bArr, int i7, boolean z6) {
        this.f16165o.M(bArr, i7);
        C(this.f16165o);
        this.f16167q.h();
        ArrayList arrayList = new ArrayList();
        while (this.f16165o.a() >= 3) {
            c2.b D = D(this.f16165o, this.f16167q);
            if (D != null) {
                arrayList.add(D);
            }
        }
        return new b(Collections.unmodifiableList(arrayList));
    }
}
