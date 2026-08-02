package f1;

import T.C0089g;
import T.C0096n;
import T.C0097o;
import W.AbstractC0110c;
import W.J;
import a.AbstractC0124a;
import a0.C0134J;
import java.util.Collections;

/* loaded from: classes.dex */
public final class r implements h {

    /* renamed from: a, reason: collision with root package name */
    public final B f8707a;

    /* renamed from: b, reason: collision with root package name */
    public String f8708b;

    /* renamed from: c, reason: collision with root package name */
    public y0.F f8709c;

    /* renamed from: d, reason: collision with root package name */
    public q f8710d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8711e;

    /* renamed from: l, reason: collision with root package name */
    public long f8718l;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f8712f = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    public final C0134J f8713g = new C0134J(32);

    /* renamed from: h, reason: collision with root package name */
    public final C0134J f8714h = new C0134J(33);

    /* renamed from: i, reason: collision with root package name */
    public final C0134J f8715i = new C0134J(34);

    /* renamed from: j, reason: collision with root package name */
    public final C0134J f8716j = new C0134J(39);

    /* renamed from: k, reason: collision with root package name */
    public final C0134J f8717k = new C0134J(40);

    /* renamed from: m, reason: collision with root package name */
    public long f8719m = -9223372036854775807L;
    public final W.u n = new W.u();

    public r(B b4) {
        this.f8707a = b4;
    }

    @Override // f1.h
    public final void a(W.u uVar) {
        int i4;
        this.f8709c.getClass();
        String str = J.f3263a;
        while (uVar.a() > 0) {
            int i5 = uVar.f3352b;
            int i6 = uVar.f3353c;
            byte[] bArr = uVar.f3351a;
            this.f8718l += uVar.a();
            this.f8709c.a(uVar.a(), uVar);
            while (i5 < i6) {
                int b4 = X.p.b(bArr, i5, i6, this.f8712f);
                if (b4 == i6) {
                    g(bArr, i5, i6);
                    return;
                }
                int i7 = (bArr[b4 + 3] & 126) >> 1;
                if (b4 <= 0 || bArr[b4 - 1] != 0) {
                    i4 = 3;
                } else {
                    b4--;
                    i4 = 4;
                }
                int i8 = b4;
                int i9 = i4;
                int i10 = i8 - i5;
                if (i10 > 0) {
                    g(bArr, i5, i8);
                }
                int i11 = i6 - i8;
                long j4 = this.f8718l - i11;
                f(i11, i10 < 0 ? -i10 : 0, j4, this.f8719m);
                h(i11, i7, j4, this.f8719m);
                i5 = i8 + i9;
            }
        }
    }

    @Override // f1.h
    public final void b() {
        this.f8718l = 0L;
        this.f8719m = -9223372036854775807L;
        X.p.a(this.f8712f);
        this.f8713g.d();
        this.f8714h.d();
        this.f8715i.d();
        this.f8716j.d();
        this.f8717k.d();
        this.f8707a.f8506d.c(0);
        q qVar = this.f8710d;
        if (qVar != null) {
            qVar.f8699f = false;
            qVar.f8700g = false;
            qVar.f8701h = false;
            qVar.f8702i = false;
            qVar.f8703j = false;
        }
    }

    @Override // f1.h
    public final void c(boolean z) {
        this.f8709c.getClass();
        String str = J.f3263a;
        if (z) {
            this.f8707a.f8506d.c(0);
            f(0, 0, this.f8718l, this.f8719m);
            h(0, 48, this.f8718l, this.f8719m);
        }
    }

    @Override // f1.h
    public final void d(int i4, long j4) {
        this.f8719m = j4;
    }

    @Override // f1.h
    public final void e(y0.p pVar, E e4) {
        e4.a();
        e4.c();
        this.f8708b = (String) e4.f8531e;
        e4.c();
        y0.F z = pVar.z(e4.f8529c, 2);
        this.f8709c = z;
        this.f8710d = new q(z);
        this.f8707a.b(pVar, e4);
    }

    public final void f(int i4, int i5, long j4, long j5) {
        K3.n nVar = this.f8707a.f8506d;
        q qVar = this.f8710d;
        boolean z = this.f8711e;
        if (qVar.f8703j && qVar.f8700g) {
            qVar.f8706m = qVar.f8696c;
            qVar.f8703j = false;
        } else if (qVar.f8701h || qVar.f8700g) {
            if (z && qVar.f8702i) {
                qVar.a(i4 + ((int) (j4 - qVar.f8695b)));
            }
            qVar.f8704k = qVar.f8695b;
            qVar.f8705l = qVar.f8698e;
            qVar.f8706m = qVar.f8696c;
            qVar.f8702i = true;
        }
        if (!this.f8711e) {
            C0134J c0134j = this.f8713g;
            c0134j.b(i5);
            C0134J c0134j2 = this.f8714h;
            c0134j2.b(i5);
            C0134J c0134j3 = this.f8715i;
            c0134j3.b(i5);
            if (c0134j.f3911c && c0134j2.f3911c && c0134j3.f3911c) {
                String str = this.f8708b;
                int i6 = c0134j.f3912d;
                byte[] bArr = new byte[c0134j2.f3912d + i6 + c0134j3.f3912d];
                System.arraycopy((byte[]) c0134j.f3913e, 0, bArr, 0, i6);
                System.arraycopy((byte[]) c0134j2.f3913e, 0, bArr, c0134j.f3912d, c0134j2.f3912d);
                System.arraycopy((byte[]) c0134j3.f3913e, 0, bArr, c0134j.f3912d + c0134j2.f3912d, c0134j3.f3912d);
                X.l i7 = X.p.i((byte[]) c0134j2.f3913e, 3, c0134j2.f3912d, null);
                X.i iVar = i7.f3518b;
                String b4 = iVar != null ? AbstractC0110c.b(iVar.f3504a, iVar.f3505b, iVar.f3506c, iVar.f3507d, iVar.f3508e, iVar.f3509f) : null;
                C0096n c0096n = new C0096n();
                c0096n.f2819a = str;
                c0096n.f2830l = T.F.n("video/mp2t");
                c0096n.f2831m = T.F.n("video/hevc");
                c0096n.f2828j = b4;
                c0096n.f2836t = i7.f3521e;
                c0096n.f2837u = i7.f3522f;
                c0096n.v = i7.f3523g;
                c0096n.f2838w = i7.f3524h;
                c0096n.f2808C = new C0089g(i7.f3527k, i7.f3528l, i7.f3529m, null, i7.f3519c + 8, i7.f3520d + 8);
                c0096n.z = i7.f3525i;
                c0096n.o = i7.f3526j;
                c0096n.f2809D = i7.f3517a + 1;
                c0096n.f2832p = Collections.singletonList(bArr);
                C0097o c0097o = new C0097o(c0096n);
                this.f8709c.d(c0097o);
                int i8 = c0097o.f2869p;
                AbstractC0124a.t(i8 != -1);
                nVar.i(i8);
                this.f8711e = true;
            }
        }
        C0134J c0134j4 = this.f8716j;
        boolean b5 = c0134j4.b(i5);
        W.u uVar = this.n;
        if (b5) {
            uVar.K(X.p.n(c0134j4.f3912d, (byte[]) c0134j4.f3913e), (byte[]) c0134j4.f3913e);
            uVar.N(5);
            nVar.a(j5, uVar);
        }
        C0134J c0134j5 = this.f8717k;
        if (c0134j5.b(i5)) {
            uVar.K(X.p.n(c0134j5.f3912d, (byte[]) c0134j5.f3913e), (byte[]) c0134j5.f3913e);
            uVar.N(5);
            nVar.a(j5, uVar);
        }
    }

    public final void g(byte[] bArr, int i4, int i5) {
        q qVar = this.f8710d;
        if (qVar.f8699f) {
            int i6 = qVar.f8697d;
            int i7 = (i4 + 2) - i6;
            if (i7 < i5) {
                qVar.f8700g = (bArr[i7] & 128) != 0;
                qVar.f8699f = false;
            } else {
                qVar.f8697d = (i5 - i4) + i6;
            }
        }
        if (!this.f8711e) {
            this.f8713g.a(bArr, i4, i5);
            this.f8714h.a(bArr, i4, i5);
            this.f8715i.a(bArr, i4, i5);
        }
        this.f8716j.a(bArr, i4, i5);
        this.f8717k.a(bArr, i4, i5);
    }

    public final void h(int i4, int i5, long j4, long j5) {
        q qVar = this.f8710d;
        boolean z = this.f8711e;
        qVar.f8700g = false;
        qVar.f8701h = false;
        qVar.f8698e = j5;
        qVar.f8697d = 0;
        qVar.f8695b = j4;
        if (i5 >= 32 && i5 != 40) {
            if (qVar.f8702i && !qVar.f8703j) {
                if (z) {
                    qVar.a(i4);
                }
                qVar.f8702i = false;
            }
            if ((32 <= i5 && i5 <= 35) || i5 == 39) {
                qVar.f8701h = !qVar.f8703j;
                qVar.f8703j = true;
            }
        }
        boolean z4 = i5 >= 16 && i5 <= 21;
        qVar.f8696c = z4;
        qVar.f8699f = z4 || i5 <= 9;
        if (!this.f8711e) {
            this.f8713g.e(i5);
            this.f8714h.e(i5);
            this.f8715i.e(i5);
        }
        this.f8716j.e(i5);
        this.f8717k.e(i5);
    }
}
