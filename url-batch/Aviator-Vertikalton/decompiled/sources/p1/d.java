package p1;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public final v1.f f3783b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3785d;
    public int h;
    public int i;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3782a = true;

    /* renamed from: c, reason: collision with root package name */
    public int f3784c = Integer.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public int f3786e = 4096;

    /* renamed from: f, reason: collision with root package name */
    public C0312b[] f3787f = new C0312b[8];

    /* renamed from: g, reason: collision with root package name */
    public int f3788g = 7;

    public d(v1.f fVar) {
        this.f3783b = fVar;
    }

    public final void a(int i) {
        int i2;
        if (i > 0) {
            int length = this.f3787f.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f3788g;
                if (length < i2 || i <= 0) {
                    break;
                }
                C0312b c0312b = this.f3787f[length];
                X0.f.b(c0312b);
                i -= c0312b.f3774c;
                int i4 = this.i;
                C0312b c0312b2 = this.f3787f[length];
                X0.f.b(c0312b2);
                this.i = i4 - c0312b2.f3774c;
                this.h--;
                i3++;
                length--;
            }
            C0312b[] c0312bArr = this.f3787f;
            int i5 = i2 + 1;
            System.arraycopy(c0312bArr, i5, c0312bArr, i5 + i3, this.h);
            C0312b[] c0312bArr2 = this.f3787f;
            int i6 = this.f3788g + 1;
            Arrays.fill(c0312bArr2, i6, i6 + i3, (Object) null);
            this.f3788g += i3;
        }
    }

    public final void b(C0312b c0312b) {
        int i = this.f3786e;
        int i2 = c0312b.f3774c;
        if (i2 > i) {
            C0312b[] c0312bArr = this.f3787f;
            O0.g.x0(c0312bArr, 0, c0312bArr.length);
            this.f3788g = this.f3787f.length - 1;
            this.h = 0;
            this.i = 0;
            return;
        }
        a((this.i + i2) - i);
        int i3 = this.h + 1;
        C0312b[] c0312bArr2 = this.f3787f;
        if (i3 > c0312bArr2.length) {
            C0312b[] c0312bArr3 = new C0312b[c0312bArr2.length * 2];
            System.arraycopy(c0312bArr2, 0, c0312bArr3, c0312bArr2.length, c0312bArr2.length);
            this.f3788g = this.f3787f.length - 1;
            this.f3787f = c0312bArr3;
        }
        int i4 = this.f3788g;
        this.f3788g = i4 - 1;
        this.f3787f[i4] = c0312b;
        this.h++;
        this.i += i2;
    }

    public final void c(v1.j jVar) {
        X0.f.e(jVar, "data");
        v1.f fVar = this.f3783b;
        if (this.f3782a) {
            int[] iArr = z.f3886a;
            int a2 = jVar.a();
            long j2 = 0;
            for (int i = 0; i < a2; i++) {
                byte d2 = jVar.d(i);
                byte[] bArr = j1.b.f2967a;
                j2 += z.f3887b[d2 & 255];
            }
            if (((int) ((j2 + 7) >> 3)) < jVar.a()) {
                v1.f fVar2 = new v1.f();
                int[] iArr2 = z.f3886a;
                int a3 = jVar.a();
                long j3 = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < a3; i3++) {
                    byte d3 = jVar.d(i3);
                    byte[] bArr2 = j1.b.f2967a;
                    int i4 = d3 & 255;
                    int i5 = z.f3886a[i4];
                    byte b2 = z.f3887b[i4];
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
                v1.j k2 = fVar2.k(fVar2.f4484b);
                e(k2.a(), 127, 128);
                fVar.s(k2);
                return;
            }
        }
        e(jVar.a(), 127, 0);
        fVar.s(jVar);
    }

    public final void d(ArrayList arrayList) {
        int i;
        int i2;
        if (this.f3785d) {
            int i3 = this.f3784c;
            if (i3 < this.f3786e) {
                e(i3, 31, 32);
            }
            this.f3785d = false;
            this.f3784c = Integer.MAX_VALUE;
            e(this.f3786e, 31, 32);
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C0312b c0312b = (C0312b) arrayList.get(i4);
            v1.j g2 = c0312b.f3772a.g();
            Integer num = (Integer) e.f3790b.get(g2);
            v1.j jVar = c0312b.f3773b;
            if (num != null) {
                int intValue = num.intValue();
                i2 = intValue + 1;
                if (2 <= i2 && i2 < 8) {
                    C0312b[] c0312bArr = e.f3789a;
                    if (X0.f.a(c0312bArr[intValue].f3773b, jVar)) {
                        i = i2;
                    } else if (X0.f.a(c0312bArr[i2].f3773b, jVar)) {
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
                int i5 = this.f3788g + 1;
                int length = this.f3787f.length;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    C0312b c0312b2 = this.f3787f[i5];
                    X0.f.b(c0312b2);
                    if (X0.f.a(c0312b2.f3772a, g2)) {
                        C0312b c0312b3 = this.f3787f[i5];
                        X0.f.b(c0312b3);
                        if (X0.f.a(c0312b3.f3773b, jVar)) {
                            i2 = e.f3789a.length + (i5 - this.f3788g);
                            break;
                        } else if (i == -1) {
                            i = (i5 - this.f3788g) + e.f3789a.length;
                        }
                    }
                    i5++;
                }
            }
            if (i2 != -1) {
                e(i2, 127, 128);
            } else if (i == -1) {
                this.f3783b.u(64);
                c(g2);
                c(jVar);
                b(c0312b);
            } else {
                v1.j jVar2 = C0312b.f3768d;
                g2.getClass();
                X0.f.e(jVar2, "prefix");
                if (!g2.f(jVar2, jVar2.a()) || X0.f.a(C0312b.i, g2)) {
                    e(i, 63, 64);
                    c(jVar);
                    b(c0312b);
                } else {
                    e(i, 15, 0);
                    c(jVar);
                }
            }
        }
    }

    public final void e(int i, int i2, int i3) {
        v1.f fVar = this.f3783b;
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
