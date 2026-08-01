package v1;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public final B1.f f4066b;
    public boolean d;
    public int h;
    public int i;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4065a = true;

    /* renamed from: c, reason: collision with root package name */
    public int f4067c = Integer.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public int f4068e = 4096;

    /* renamed from: f, reason: collision with root package name */
    public b[] f4069f = new b[8];

    /* renamed from: g, reason: collision with root package name */
    public int f4070g = 7;

    public d(B1.f fVar) {
        this.f4066b = fVar;
    }

    public final void a(int i) {
        int i2;
        if (i > 0) {
            int length = this.f4069f.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f4070g;
                if (length < i2 || i <= 0) {
                    break;
                }
                b bVar = this.f4069f[length];
                d1.d.b(bVar);
                i -= bVar.f4058c;
                int i4 = this.i;
                b bVar2 = this.f4069f[length];
                d1.d.b(bVar2);
                this.i = i4 - bVar2.f4058c;
                this.h--;
                i3++;
                length--;
            }
            b[] bVarArr = this.f4069f;
            int i5 = i2 + 1;
            System.arraycopy(bVarArr, i5, bVarArr, i5 + i3, this.h);
            b[] bVarArr2 = this.f4069f;
            int i6 = this.f4070g + 1;
            Arrays.fill(bVarArr2, i6, i6 + i3, (Object) null);
            this.f4070g += i3;
        }
    }

    public final void b(b bVar) {
        int i = this.f4068e;
        int i2 = bVar.f4058c;
        if (i2 > i) {
            b[] bVarArr = this.f4069f;
            S0.f.f0(bVarArr, 0, bVarArr.length);
            this.f4070g = this.f4069f.length - 1;
            this.h = 0;
            this.i = 0;
            return;
        }
        a((this.i + i2) - i);
        int i3 = this.h + 1;
        b[] bVarArr2 = this.f4069f;
        if (i3 > bVarArr2.length) {
            b[] bVarArr3 = new b[bVarArr2.length * 2];
            System.arraycopy(bVarArr2, 0, bVarArr3, bVarArr2.length, bVarArr2.length);
            this.f4070g = this.f4069f.length - 1;
            this.f4069f = bVarArr3;
        }
        int i4 = this.f4070g;
        this.f4070g = i4 - 1;
        this.f4069f[i4] = bVar;
        this.h++;
        this.i += i2;
    }

    public final void c(B1.i iVar) {
        d1.d.e(iVar, "data");
        B1.f fVar = this.f4066b;
        if (this.f4065a) {
            int[] iArr = y.f4156a;
            int a2 = iVar.a();
            long j2 = 0;
            for (int i = 0; i < a2; i++) {
                byte d = iVar.d(i);
                byte[] bArr = p1.b.f3455a;
                j2 += y.f4157b[d & 255];
            }
            if (((int) ((j2 + 7) >> 3)) < iVar.a()) {
                B1.f fVar2 = new B1.f();
                int[] iArr2 = y.f4156a;
                int a3 = iVar.a();
                long j3 = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < a3; i3++) {
                    byte d2 = iVar.d(i3);
                    byte[] bArr2 = p1.b.f3455a;
                    int i4 = d2 & 255;
                    int i5 = y.f4156a[i4];
                    byte b2 = y.f4157b[i4];
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
                B1.i k2 = fVar2.k(fVar2.f69b);
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
            int i3 = this.f4067c;
            if (i3 < this.f4068e) {
                e(i3, 31, 32);
            }
            this.d = false;
            this.f4067c = Integer.MAX_VALUE;
            e(this.f4068e, 31, 32);
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            b bVar = (b) arrayList.get(i4);
            B1.i g2 = bVar.f4056a.g();
            Integer num = (Integer) e.f4072b.get(g2);
            B1.i iVar = bVar.f4057b;
            if (num != null) {
                int intValue = num.intValue();
                i2 = intValue + 1;
                if (2 <= i2 && i2 < 8) {
                    b[] bVarArr = e.f4071a;
                    if (d1.d.a(bVarArr[intValue].f4057b, iVar)) {
                        i = i2;
                    } else if (d1.d.a(bVarArr[i2].f4057b, iVar)) {
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
                int i5 = this.f4070g + 1;
                int length = this.f4069f.length;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    b bVar2 = this.f4069f[i5];
                    d1.d.b(bVar2);
                    if (d1.d.a(bVar2.f4056a, g2)) {
                        b bVar3 = this.f4069f[i5];
                        d1.d.b(bVar3);
                        if (d1.d.a(bVar3.f4057b, iVar)) {
                            i2 = e.f4071a.length + (i5 - this.f4070g);
                            break;
                        } else if (i == -1) {
                            i = (i5 - this.f4070g) + e.f4071a.length;
                        }
                    }
                    i5++;
                }
            }
            if (i2 != -1) {
                e(i2, 127, 128);
            } else if (i == -1) {
                this.f4066b.u(64);
                c(g2);
                c(iVar);
                b(bVar);
            } else {
                B1.i iVar2 = b.d;
                g2.getClass();
                d1.d.e(iVar2, "prefix");
                if (!g2.f(iVar2, iVar2.a()) || d1.d.a(b.i, g2)) {
                    e(i, 63, 64);
                    c(iVar);
                    b(bVar);
                } else {
                    e(i, 15, 0);
                    c(iVar);
                }
            }
        }
    }

    public final void e(int i, int i2, int i3) {
        B1.f fVar = this.f4066b;
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
