package t1;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public final z1.f f3846b;
    public boolean d;
    public int h;
    public int i;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3845a = true;

    /* renamed from: c, reason: collision with root package name */
    public int f3847c = Integer.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public int f3848e = 4096;

    /* renamed from: f, reason: collision with root package name */
    public C0303b[] f3849f = new C0303b[8];

    /* renamed from: g, reason: collision with root package name */
    public int f3850g = 7;

    public d(z1.f fVar) {
        this.f3846b = fVar;
    }

    public final void a(int i) {
        int i2;
        if (i > 0) {
            int length = this.f3849f.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f3850g;
                if (length < i2 || i <= 0) {
                    break;
                }
                C0303b c0303b = this.f3849f[length];
                b1.d.b(c0303b);
                i -= c0303b.f3838c;
                int i4 = this.i;
                C0303b c0303b2 = this.f3849f[length];
                b1.d.b(c0303b2);
                this.i = i4 - c0303b2.f3838c;
                this.h--;
                i3++;
                length--;
            }
            C0303b[] c0303bArr = this.f3849f;
            int i5 = i2 + 1;
            System.arraycopy(c0303bArr, i5, c0303bArr, i5 + i3, this.h);
            C0303b[] c0303bArr2 = this.f3849f;
            int i6 = this.f3850g + 1;
            Arrays.fill(c0303bArr2, i6, i6 + i3, (Object) null);
            this.f3850g += i3;
        }
    }

    public final void b(C0303b c0303b) {
        int i = this.f3848e;
        int i2 = c0303b.f3838c;
        if (i2 > i) {
            C0303b[] c0303bArr = this.f3849f;
            T0.g.u0(c0303bArr, 0, c0303bArr.length);
            this.f3850g = this.f3849f.length - 1;
            this.h = 0;
            this.i = 0;
            return;
        }
        a((this.i + i2) - i);
        int i3 = this.h + 1;
        C0303b[] c0303bArr2 = this.f3849f;
        if (i3 > c0303bArr2.length) {
            C0303b[] c0303bArr3 = new C0303b[c0303bArr2.length * 2];
            System.arraycopy(c0303bArr2, 0, c0303bArr3, c0303bArr2.length, c0303bArr2.length);
            this.f3850g = this.f3849f.length - 1;
            this.f3849f = c0303bArr3;
        }
        int i4 = this.f3850g;
        this.f3850g = i4 - 1;
        this.f3849f[i4] = c0303b;
        this.h++;
        this.i += i2;
    }

    public final void c(z1.i iVar) {
        b1.d.e(iVar, "data");
        z1.f fVar = this.f3846b;
        if (this.f3845a) {
            int[] iArr = z.f3939a;
            int a2 = iVar.a();
            long j2 = 0;
            for (int i = 0; i < a2; i++) {
                byte d = iVar.d(i);
                byte[] bArr = n1.b.f3319a;
                j2 += z.f3940b[d & 255];
            }
            if (((int) ((j2 + 7) >> 3)) < iVar.a()) {
                z1.f fVar2 = new z1.f();
                int[] iArr2 = z.f3939a;
                int a3 = iVar.a();
                long j3 = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < a3; i3++) {
                    byte d2 = iVar.d(i3);
                    byte[] bArr2 = n1.b.f3319a;
                    int i4 = d2 & 255;
                    int i5 = z.f3939a[i4];
                    byte b2 = z.f3940b[i4];
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
                z1.i k2 = fVar2.k(fVar2.f4269b);
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
            int i3 = this.f3847c;
            if (i3 < this.f3848e) {
                e(i3, 31, 32);
            }
            this.d = false;
            this.f3847c = Integer.MAX_VALUE;
            e(this.f3848e, 31, 32);
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C0303b c0303b = (C0303b) arrayList.get(i4);
            z1.i g2 = c0303b.f3836a.g();
            Integer num = (Integer) e.f3852b.get(g2);
            z1.i iVar = c0303b.f3837b;
            if (num != null) {
                int intValue = num.intValue();
                i2 = intValue + 1;
                if (2 <= i2 && i2 < 8) {
                    C0303b[] c0303bArr = e.f3851a;
                    if (b1.d.a(c0303bArr[intValue].f3837b, iVar)) {
                        i = i2;
                    } else if (b1.d.a(c0303bArr[i2].f3837b, iVar)) {
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
                int i5 = this.f3850g + 1;
                int length = this.f3849f.length;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    C0303b c0303b2 = this.f3849f[i5];
                    b1.d.b(c0303b2);
                    if (b1.d.a(c0303b2.f3836a, g2)) {
                        C0303b c0303b3 = this.f3849f[i5];
                        b1.d.b(c0303b3);
                        if (b1.d.a(c0303b3.f3837b, iVar)) {
                            i2 = e.f3851a.length + (i5 - this.f3850g);
                            break;
                        } else if (i == -1) {
                            i = (i5 - this.f3850g) + e.f3851a.length;
                        }
                    }
                    i5++;
                }
            }
            if (i2 != -1) {
                e(i2, 127, 128);
            } else if (i == -1) {
                this.f3846b.u(64);
                c(g2);
                c(iVar);
                b(c0303b);
            } else {
                z1.i iVar2 = C0303b.d;
                g2.getClass();
                b1.d.e(iVar2, "prefix");
                if (!g2.f(iVar2, iVar2.a()) || b1.d.a(C0303b.i, g2)) {
                    e(i, 63, 64);
                    c(iVar);
                    b(c0303b);
                } else {
                    e(i, 15, 0);
                    c(iVar);
                }
            }
        }
    }

    public final void e(int i, int i2, int i3) {
        z1.f fVar = this.f3846b;
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
