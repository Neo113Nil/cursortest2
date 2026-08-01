package t1;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public final z1.f f3764b;
    public boolean d;
    public int h;
    public int i;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3763a = true;

    /* renamed from: c, reason: collision with root package name */
    public int f3765c = Integer.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public int f3766e = 4096;

    /* renamed from: f, reason: collision with root package name */
    public C0316b[] f3767f = new C0316b[8];

    /* renamed from: g, reason: collision with root package name */
    public int f3768g = 7;

    public d(z1.f fVar) {
        this.f3764b = fVar;
    }

    public final void a(int i) {
        int i2;
        if (i > 0) {
            int length = this.f3767f.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f3768g;
                if (length < i2 || i <= 0) {
                    break;
                }
                C0316b c0316b = this.f3767f[length];
                b1.d.b(c0316b);
                i -= c0316b.f3756c;
                int i4 = this.i;
                C0316b c0316b2 = this.f3767f[length];
                b1.d.b(c0316b2);
                this.i = i4 - c0316b2.f3756c;
                this.h--;
                i3++;
                length--;
            }
            C0316b[] c0316bArr = this.f3767f;
            int i5 = i2 + 1;
            System.arraycopy(c0316bArr, i5, c0316bArr, i5 + i3, this.h);
            C0316b[] c0316bArr2 = this.f3767f;
            int i6 = this.f3768g + 1;
            Arrays.fill(c0316bArr2, i6, i6 + i3, (Object) null);
            this.f3768g += i3;
        }
    }

    public final void b(C0316b c0316b) {
        int i = this.f3766e;
        int i2 = c0316b.f3756c;
        if (i2 > i) {
            C0316b[] c0316bArr = this.f3767f;
            T0.g.m0(c0316bArr, 0, c0316bArr.length);
            this.f3768g = this.f3767f.length - 1;
            this.h = 0;
            this.i = 0;
            return;
        }
        a((this.i + i2) - i);
        int i3 = this.h + 1;
        C0316b[] c0316bArr2 = this.f3767f;
        if (i3 > c0316bArr2.length) {
            C0316b[] c0316bArr3 = new C0316b[c0316bArr2.length * 2];
            System.arraycopy(c0316bArr2, 0, c0316bArr3, c0316bArr2.length, c0316bArr2.length);
            this.f3768g = this.f3767f.length - 1;
            this.f3767f = c0316bArr3;
        }
        int i4 = this.f3768g;
        this.f3768g = i4 - 1;
        this.f3767f[i4] = c0316b;
        this.h++;
        this.i += i2;
    }

    public final void c(z1.i iVar) {
        b1.d.e(iVar, "data");
        z1.f fVar = this.f3764b;
        if (this.f3763a) {
            int[] iArr = z.f3857a;
            int a2 = iVar.a();
            long j2 = 0;
            for (int i = 0; i < a2; i++) {
                byte d = iVar.d(i);
                byte[] bArr = n1.b.f3286a;
                j2 += z.f3858b[d & 255];
            }
            if (((int) ((j2 + 7) >> 3)) < iVar.a()) {
                z1.f fVar2 = new z1.f();
                int[] iArr2 = z.f3857a;
                int a3 = iVar.a();
                long j3 = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < a3; i3++) {
                    byte d2 = iVar.d(i3);
                    byte[] bArr2 = n1.b.f3286a;
                    int i4 = d2 & 255;
                    int i5 = z.f3857a[i4];
                    byte b2 = z.f3858b[i4];
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
                z1.i k2 = fVar2.k(fVar2.f4268b);
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
            int i3 = this.f3765c;
            if (i3 < this.f3766e) {
                e(i3, 31, 32);
            }
            this.d = false;
            this.f3765c = Integer.MAX_VALUE;
            e(this.f3766e, 31, 32);
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C0316b c0316b = (C0316b) arrayList.get(i4);
            z1.i g2 = c0316b.f3754a.g();
            Integer num = (Integer) e.f3770b.get(g2);
            z1.i iVar = c0316b.f3755b;
            if (num != null) {
                int intValue = num.intValue();
                i2 = intValue + 1;
                if (2 <= i2 && i2 < 8) {
                    C0316b[] c0316bArr = e.f3769a;
                    if (b1.d.a(c0316bArr[intValue].f3755b, iVar)) {
                        i = i2;
                    } else if (b1.d.a(c0316bArr[i2].f3755b, iVar)) {
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
                int i5 = this.f3768g + 1;
                int length = this.f3767f.length;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    C0316b c0316b2 = this.f3767f[i5];
                    b1.d.b(c0316b2);
                    if (b1.d.a(c0316b2.f3754a, g2)) {
                        C0316b c0316b3 = this.f3767f[i5];
                        b1.d.b(c0316b3);
                        if (b1.d.a(c0316b3.f3755b, iVar)) {
                            i2 = e.f3769a.length + (i5 - this.f3768g);
                            break;
                        } else if (i == -1) {
                            i = (i5 - this.f3768g) + e.f3769a.length;
                        }
                    }
                    i5++;
                }
            }
            if (i2 != -1) {
                e(i2, 127, 128);
            } else if (i == -1) {
                this.f3764b.u(64);
                c(g2);
                c(iVar);
                b(c0316b);
            } else {
                z1.i iVar2 = C0316b.d;
                g2.getClass();
                b1.d.e(iVar2, "prefix");
                if (!g2.f(iVar2, iVar2.a()) || b1.d.a(C0316b.i, g2)) {
                    e(i, 63, 64);
                    c(iVar);
                    b(c0316b);
                } else {
                    e(i, 15, 0);
                    c(iVar);
                }
            }
        }
    }

    public final void e(int i, int i2, int i3) {
        z1.f fVar = this.f3764b;
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
