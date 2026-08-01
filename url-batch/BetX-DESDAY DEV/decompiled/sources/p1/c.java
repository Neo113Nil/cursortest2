package p1;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public final v1.q f3781c;

    /* renamed from: f, reason: collision with root package name */
    public int f3784f;

    /* renamed from: g, reason: collision with root package name */
    public int f3785g;

    /* renamed from: a, reason: collision with root package name */
    public int f3779a = 4096;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3780b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public C0314b[] f3782d = new C0314b[8];

    /* renamed from: e, reason: collision with root package name */
    public int f3783e = 7;

    public c(r rVar) {
        this.f3781c = new v1.q(rVar);
    }

    public final int a(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.f3782d.length;
            while (true) {
                length--;
                i2 = this.f3783e;
                if (length < i2 || i <= 0) {
                    break;
                }
                C0314b c0314b = this.f3782d[length];
                X0.f.b(c0314b);
                int i4 = c0314b.f3778c;
                i -= i4;
                this.f3785g -= i4;
                this.f3784f--;
                i3++;
            }
            C0314b[] c0314bArr = this.f3782d;
            System.arraycopy(c0314bArr, i2 + 1, c0314bArr, i2 + 1 + i3, this.f3784f);
            this.f3783e += i3;
        }
        return i3;
    }

    public final v1.j b(int i) {
        if (i >= 0) {
            C0314b[] c0314bArr = e.f3793a;
            if (i <= c0314bArr.length - 1) {
                return c0314bArr[i].f3776a;
            }
        }
        int length = this.f3783e + 1 + (i - e.f3793a.length);
        if (length >= 0) {
            C0314b[] c0314bArr2 = this.f3782d;
            if (length < c0314bArr2.length) {
                C0314b c0314b = c0314bArr2[length];
                X0.f.b(c0314b);
                return c0314b.f3776a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(C0314b c0314b) {
        this.f3780b.add(c0314b);
        int i = this.f3779a;
        int i2 = c0314b.f3778c;
        if (i2 > i) {
            C0314b[] c0314bArr = this.f3782d;
            O0.g.x0(c0314bArr, 0, c0314bArr.length);
            this.f3783e = this.f3782d.length - 1;
            this.f3784f = 0;
            this.f3785g = 0;
            return;
        }
        a((this.f3785g + i2) - i);
        int i3 = this.f3784f + 1;
        C0314b[] c0314bArr2 = this.f3782d;
        if (i3 > c0314bArr2.length) {
            C0314b[] c0314bArr3 = new C0314b[c0314bArr2.length * 2];
            System.arraycopy(c0314bArr2, 0, c0314bArr3, c0314bArr2.length, c0314bArr2.length);
            this.f3783e = this.f3782d.length - 1;
            this.f3782d = c0314bArr3;
        }
        int i4 = this.f3783e;
        this.f3783e = i4 - 1;
        this.f3782d[i4] = c0314b;
        this.f3784f++;
        this.f3785g += i2;
    }

    public final v1.j d() {
        int i;
        v1.q qVar = this.f3781c;
        byte i2 = qVar.i();
        byte[] bArr = j1.b.f2971a;
        int i3 = i2 & 255;
        int i4 = 0;
        boolean z2 = (i2 & 128) == 128;
        long e2 = e(i3, 127);
        if (!z2) {
            return qVar.j(e2);
        }
        v1.f fVar = new v1.f();
        int[] iArr = z.f3890a;
        X0.f.e(qVar, "source");
        y yVar = z.f3892c;
        y yVar2 = yVar;
        int i5 = 0;
        for (long j2 = 0; j2 < e2; j2++) {
            byte i6 = qVar.i();
            byte[] bArr2 = j1.b.f2971a;
            i4 = (i4 << 8) | (i6 & 255);
            i5 += 8;
            while (i5 >= 8) {
                y[] yVarArr = (y[]) yVar2.f3889c;
                X0.f.b(yVarArr);
                yVar2 = yVarArr[(i4 >>> (i5 - 8)) & 255];
                X0.f.b(yVar2);
                if (((y[]) yVar2.f3889c) == null) {
                    fVar.u(yVar2.f3887a);
                    i5 -= yVar2.f3888b;
                    yVar2 = yVar;
                } else {
                    i5 -= 8;
                }
            }
        }
        while (i5 > 0) {
            y[] yVarArr2 = (y[]) yVar2.f3889c;
            X0.f.b(yVarArr2);
            y yVar3 = yVarArr2[(i4 << (8 - i5)) & 255];
            X0.f.b(yVar3);
            if (((y[]) yVar3.f3889c) != null || (i = yVar3.f3888b) > i5) {
                break;
            }
            fVar.u(yVar3.f3887a);
            i5 -= i;
            yVar2 = yVar;
        }
        return fVar.k(fVar.f4488b);
    }

    public final int e(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte i5 = this.f3781c.i();
            byte[] bArr = j1.b.f2971a;
            int i6 = i5 & 255;
            if ((i5 & 128) == 0) {
                return i2 + (i6 << i4);
            }
            i2 += (i5 & Byte.MAX_VALUE) << i4;
            i4 += 7;
        }
    }
}
