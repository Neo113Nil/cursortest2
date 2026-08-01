package r1;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public final x1.f f3543b;
    public boolean d;
    public int h;
    public int i;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3542a = true;

    /* renamed from: c, reason: collision with root package name */
    public int f3544c = Integer.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public int f3545e = 4096;

    /* renamed from: f, reason: collision with root package name */
    public C0291b[] f3546f = new C0291b[8];

    /* renamed from: g, reason: collision with root package name */
    public int f3547g = 7;

    public d(x1.f fVar) {
        this.f3543b = fVar;
    }

    public final void a(int i) {
        int i2;
        if (i > 0) {
            int length = this.f3546f.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f3547g;
                if (length < i2 || i <= 0) {
                    break;
                }
                C0291b c0291b = this.f3546f[length];
                Z0.d.b(c0291b);
                i -= c0291b.f3535c;
                int i4 = this.i;
                C0291b c0291b2 = this.f3546f[length];
                Z0.d.b(c0291b2);
                this.i = i4 - c0291b2.f3535c;
                this.h--;
                i3++;
                length--;
            }
            C0291b[] c0291bArr = this.f3546f;
            int i5 = i2 + 1;
            System.arraycopy(c0291bArr, i5, c0291bArr, i5 + i3, this.h);
            C0291b[] c0291bArr2 = this.f3546f;
            int i6 = this.f3547g + 1;
            Arrays.fill(c0291bArr2, i6, i6 + i3, (Object) null);
            this.f3547g += i3;
        }
    }

    public final void b(C0291b c0291b) {
        int i = this.f3545e;
        int i2 = c0291b.f3535c;
        if (i2 > i) {
            C0291b[] c0291bArr = this.f3546f;
            R0.g.q0(c0291bArr, 0, c0291bArr.length);
            this.f3547g = this.f3546f.length - 1;
            this.h = 0;
            this.i = 0;
            return;
        }
        a((this.i + i2) - i);
        int i3 = this.h + 1;
        C0291b[] c0291bArr2 = this.f3546f;
        if (i3 > c0291bArr2.length) {
            C0291b[] c0291bArr3 = new C0291b[c0291bArr2.length * 2];
            System.arraycopy(c0291bArr2, 0, c0291bArr3, c0291bArr2.length, c0291bArr2.length);
            this.f3547g = this.f3546f.length - 1;
            this.f3546f = c0291bArr3;
        }
        int i4 = this.f3547g;
        this.f3547g = i4 - 1;
        this.f3546f[i4] = c0291b;
        this.h++;
        this.i += i2;
    }

    public final void c(x1.i iVar) {
        Z0.d.e(iVar, "data");
        x1.f fVar = this.f3543b;
        if (this.f3542a) {
            int[] iArr = z.f3636a;
            int a2 = iVar.a();
            long j2 = 0;
            for (int i = 0; i < a2; i++) {
                byte d = iVar.d(i);
                byte[] bArr = l1.b.f3252a;
                j2 += z.f3637b[d & 255];
            }
            if (((int) ((j2 + 7) >> 3)) < iVar.a()) {
                x1.f fVar2 = new x1.f();
                int[] iArr2 = z.f3636a;
                int a3 = iVar.a();
                long j3 = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < a3; i3++) {
                    byte d2 = iVar.d(i3);
                    byte[] bArr2 = l1.b.f3252a;
                    int i4 = d2 & 255;
                    int i5 = z.f3636a[i4];
                    byte b2 = z.f3637b[i4];
                    j3 = (j3 << b2) | i5;
                    i2 += b2;
                    while (i2 >= 8) {
                        i2 -= 8;
                        fVar2.u((int) (j3 >> i2));
                    }
                }
                if (i2 > 0) {
                    fVar2.u((int) ((255 >>> i2) | (j3 << (8 - i2))));
                }
                x1.i k2 = fVar2.k(fVar2.f4236b);
                e(k2.a(), 127, 128);
                fVar.s(k2);
                return;
            }
        }
        e(iVar.a(), 127, 0);
        fVar.s(iVar);
    }

    public final void d(ArrayList arrayList) {
        int i;
        int i2;
        if (this.d) {
            int i3 = this.f3544c;
            if (i3 < this.f3545e) {
                e(i3, 31, 32);
            }
            this.d = false;
            this.f3544c = Integer.MAX_VALUE;
            e(this.f3545e, 31, 32);
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C0291b c0291b = (C0291b) arrayList.get(i4);
            x1.i g2 = c0291b.f3533a.g();
            Integer num = (Integer) e.f3549b.get(g2);
            x1.i iVar = c0291b.f3534b;
            if (num != null) {
                int intValue = num.intValue();
                i2 = intValue + 1;
                if (2 <= i2 && i2 < 8) {
                    C0291b[] c0291bArr = e.f3548a;
                    if (Z0.d.a(c0291bArr[intValue].f3534b, iVar)) {
                        i = i2;
                    } else if (Z0.d.a(c0291bArr[i2].f3534b, iVar)) {
                        i2 = intValue + 2;
                        i = i2;
                    }
                }
                i = i2;
                i2 = -1;
            } else {
                i = -1;
                i2 = -1;
            }
            if (i2 == -1) {
                int i5 = this.f3547g + 1;
                int length = this.f3546f.length;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    C0291b c0291b2 = this.f3546f[i5];
                    Z0.d.b(c0291b2);
                    if (Z0.d.a(c0291b2.f3533a, g2)) {
                        C0291b c0291b3 = this.f3546f[i5];
                        Z0.d.b(c0291b3);
                        if (Z0.d.a(c0291b3.f3534b, iVar)) {
                            i2 = e.f3548a.length + (i5 - this.f3547g);
                            break;
                        } else if (i == -1) {
                            i = (i5 - this.f3547g) + e.f3548a.length;
                        }
                    }
                    i5++;
                }
            }
            if (i2 != -1) {
                e(i2, 127, 128);
            } else if (i == -1) {
                this.f3543b.u(64);
                c(g2);
                c(iVar);
                b(c0291b);
            } else {
                x1.i iVar2 = C0291b.d;
                g2.getClass();
                Z0.d.e(iVar2, "prefix");
                if (!g2.f(iVar2, iVar2.a()) || Z0.d.a(C0291b.i, g2)) {
                    e(i, 63, 64);
                    c(iVar);
                    b(c0291b);
                } else {
                    e(i, 15, 0);
                    c(iVar);
                }
            }
        }
    }

    public final void e(int i, int i2, int i3) {
        x1.f fVar = this.f3543b;
        if (i < i2) {
            fVar.u(i | i3);
            return;
        }
        fVar.u(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            fVar.u(128 | (i4 & 127));
            i4 >>>= 7;
        }
        fVar.u(i4);
    }
}
