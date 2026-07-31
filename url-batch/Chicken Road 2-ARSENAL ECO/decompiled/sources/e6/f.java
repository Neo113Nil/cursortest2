package e6;

import java.util.ArrayList;
import java.util.Arrays;
import l5.AbstractC0505i;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final n6.f f4063a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4065c;

    /* renamed from: g, reason: collision with root package name */
    public int f4069g;

    /* renamed from: h, reason: collision with root package name */
    public int f4070h;

    /* renamed from: b, reason: collision with root package name */
    public int f4064b = Integer.MAX_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f4066d = 4096;

    /* renamed from: e, reason: collision with root package name */
    public C0358d[] f4067e = new C0358d[8];

    /* renamed from: f, reason: collision with root package name */
    public int f4068f = 7;

    public f(n6.f fVar) {
        this.f4063a = fVar;
    }

    public final void a(int i7) {
        int i8;
        if (i7 > 0) {
            int length = this.f4067e.length - 1;
            int i9 = 0;
            while (true) {
                i8 = this.f4068f;
                if (length < i8 || i7 <= 0) {
                    break;
                }
                C0358d c0358d = this.f4067e[length];
                kotlin.jvm.internal.i.b(c0358d);
                i7 -= c0358d.f4055c;
                int i10 = this.f4070h;
                C0358d c0358d2 = this.f4067e[length];
                kotlin.jvm.internal.i.b(c0358d2);
                this.f4070h = i10 - c0358d2.f4055c;
                this.f4069g--;
                i9++;
                length--;
            }
            C0358d[] c0358dArr = this.f4067e;
            int i11 = i8 + 1;
            System.arraycopy(c0358dArr, i11, c0358dArr, i11 + i9, this.f4069g);
            C0358d[] c0358dArr2 = this.f4067e;
            int i12 = this.f4068f + 1;
            Arrays.fill(c0358dArr2, i12, i12 + i9, (Object) null);
            this.f4068f += i9;
        }
    }

    public final void b(C0358d c0358d) {
        int i7 = c0358d.f4055c;
        int i8 = this.f4066d;
        if (i7 > i8) {
            C0358d[] c0358dArr = this.f4067e;
            AbstractC0505i.J(0, c0358dArr.length, c0358dArr);
            this.f4068f = this.f4067e.length - 1;
            this.f4069g = 0;
            this.f4070h = 0;
            return;
        }
        a((this.f4070h + i7) - i8);
        int i9 = this.f4069g + 1;
        C0358d[] c0358dArr2 = this.f4067e;
        if (i9 > c0358dArr2.length) {
            C0358d[] c0358dArr3 = new C0358d[c0358dArr2.length * 2];
            System.arraycopy(c0358dArr2, 0, c0358dArr3, c0358dArr2.length, c0358dArr2.length);
            this.f4068f = this.f4067e.length - 1;
            this.f4067e = c0358dArr3;
        }
        int i10 = this.f4068f;
        this.f4068f = i10 - 1;
        this.f4067e[i10] = c0358d;
        this.f4069g++;
        this.f4070h += i7;
    }

    public final void c(n6.i data) {
        kotlin.jvm.internal.i.e(data, "data");
        int[] iArr = B.f4030a;
        int a7 = data.a();
        long j4 = 0;
        long j7 = 0;
        for (int i7 = 0; i7 < a7; i7++) {
            byte d7 = data.d(i7);
            byte[] bArr = Y5.c.f3099a;
            j7 += B.f4031b[d7 & 255];
        }
        int i8 = (int) ((j7 + 7) >> 3);
        int a8 = data.a();
        n6.f fVar = this.f4063a;
        if (i8 >= a8) {
            e(data.a(), 127, 0);
            fVar.G(data);
            return;
        }
        n6.f fVar2 = new n6.f();
        int[] iArr2 = B.f4030a;
        int a9 = data.a();
        int i9 = 0;
        for (int i10 = 0; i10 < a9; i10++) {
            byte d8 = data.d(i10);
            byte[] bArr2 = Y5.c.f3099a;
            int i11 = d8 & 255;
            int i12 = B.f4030a[i11];
            byte b7 = B.f4031b[i11];
            j4 = (j4 << b7) | i12;
            i9 += b7;
            while (i9 >= 8) {
                i9 -= 8;
                fVar2.I((int) (j4 >> i9));
            }
        }
        if (i9 > 0) {
            fVar2.I((int) ((j4 << (8 - i9)) | (255 >>> i9)));
        }
        n6.i f7 = fVar2.f(fVar2.f5524g);
        e(f7.a(), 127, 128);
        fVar.G(f7);
    }

    public final void d(ArrayList arrayList) {
        int i7;
        int i8;
        if (this.f4065c) {
            int i9 = this.f4064b;
            if (i9 < this.f4066d) {
                e(i9, 31, 32);
            }
            this.f4065c = false;
            this.f4064b = Integer.MAX_VALUE;
            e(this.f4066d, 31, 32);
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C0358d c0358d = (C0358d) arrayList.get(i10);
            n6.i i11 = c0358d.f4053a.i();
            n6.i iVar = c0358d.f4054b;
            Integer num = (Integer) g.f4072b.get(i11);
            if (num != null) {
                int intValue = num.intValue();
                i8 = intValue + 1;
                if (2 <= i8 && i8 < 8) {
                    C0358d[] c0358dArr = g.f4071a;
                    if (kotlin.jvm.internal.i.a(c0358dArr[intValue].f4054b, iVar)) {
                        i7 = i8;
                    } else if (kotlin.jvm.internal.i.a(c0358dArr[i8].f4054b, iVar)) {
                        i8 = intValue + 2;
                        i7 = i8;
                    }
                }
                i7 = i8;
                i8 = -1;
            } else {
                i7 = -1;
                i8 = -1;
            }
            if (i8 == -1) {
                int i12 = this.f4068f + 1;
                int length = this.f4067e.length;
                while (true) {
                    if (i12 >= length) {
                        break;
                    }
                    C0358d c0358d2 = this.f4067e[i12];
                    kotlin.jvm.internal.i.b(c0358d2);
                    if (kotlin.jvm.internal.i.a(c0358d2.f4053a, i11)) {
                        C0358d c0358d3 = this.f4067e[i12];
                        kotlin.jvm.internal.i.b(c0358d3);
                        if (kotlin.jvm.internal.i.a(c0358d3.f4054b, iVar)) {
                            i8 = g.f4071a.length + (i12 - this.f4068f);
                            break;
                        } else if (i7 == -1) {
                            i7 = (i12 - this.f4068f) + g.f4071a.length;
                        }
                    }
                    i12++;
                }
            }
            if (i8 != -1) {
                e(i8, 127, 128);
            } else if (i7 == -1) {
                this.f4063a.I(64);
                c(i11);
                c(iVar);
                b(c0358d);
            } else {
                n6.i prefix = C0358d.f4047d;
                i11.getClass();
                kotlin.jvm.internal.i.e(prefix, "prefix");
                if (!i11.f(prefix, prefix.a()) || kotlin.jvm.internal.i.a(C0358d.f4052i, i11)) {
                    e(i7, 63, 64);
                    c(iVar);
                    b(c0358d);
                } else {
                    e(i7, 15, 0);
                    c(iVar);
                }
            }
        }
    }

    public final void e(int i7, int i8, int i9) {
        n6.f fVar = this.f4063a;
        if (i7 < i8) {
            fVar.I(i7 | i9);
            return;
        }
        fVar.I(i9 | i8);
        int i10 = i7 - i8;
        while (i10 >= 128) {
            fVar.I(128 | (i10 & 127));
            i10 >>>= 7;
        }
        fVar.I(i10);
    }
}
