package j3;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final p3.f f2415a;
    public boolean c;
    public int g;
    public int h;

    /* renamed from: b, reason: collision with root package name */
    public int f2416b = Integer.MAX_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f2417d = 4096;

    /* renamed from: e, reason: collision with root package name */
    public b[] f2418e = new b[8];

    /* renamed from: f, reason: collision with root package name */
    public int f2419f = 7;

    public d(p3.f fVar) {
        this.f2415a = fVar;
    }

    public final void a(int i4) {
        int i5;
        if (i4 > 0) {
            int length = this.f2418e.length - 1;
            int i6 = 0;
            while (true) {
                i5 = this.f2419f;
                if (length < i5 || i4 <= 0) {
                    break;
                }
                b bVar = this.f2418e[length];
                u2.c.b(bVar);
                i4 -= bVar.c;
                int i7 = this.h;
                b bVar2 = this.f2418e[length];
                u2.c.b(bVar2);
                this.h = i7 - bVar2.c;
                this.g--;
                i6++;
                length--;
            }
            b[] bVarArr = this.f2418e;
            int i8 = i5 + 1;
            System.arraycopy(bVarArr, i8, bVarArr, i8 + i6, this.g);
            b[] bVarArr2 = this.f2418e;
            int i9 = this.f2419f + 1;
            Arrays.fill(bVarArr2, i9, i9 + i6, (Object) null);
            this.f2419f += i6;
        }
    }

    public final void b(b bVar) {
        int i4 = bVar.c;
        int i5 = this.f2417d;
        if (i4 > i5) {
            b[] bVarArr = this.f2418e;
            n2.f.F(bVarArr, 0, bVarArr.length);
            this.f2419f = this.f2418e.length - 1;
            this.g = 0;
            this.h = 0;
            return;
        }
        a((this.h + i4) - i5);
        int i6 = this.g + 1;
        b[] bVarArr2 = this.f2418e;
        if (i6 > bVarArr2.length) {
            b[] bVarArr3 = new b[bVarArr2.length * 2];
            System.arraycopy(bVarArr2, 0, bVarArr3, bVarArr2.length, bVarArr2.length);
            this.f2419f = this.f2418e.length - 1;
            this.f2418e = bVarArr3;
        }
        int i7 = this.f2419f;
        this.f2419f = i7 - 1;
        this.f2418e[i7] = bVar;
        this.g++;
        this.h += i4;
    }

    public final void c(p3.i iVar) {
        u2.c.e(iVar, "data");
        int[] iArr = a0.f2400a;
        int a4 = iVar.a();
        long j4 = 0;
        long j5 = 0;
        for (int i4 = 0; i4 < a4; i4++) {
            byte d4 = iVar.d(i4);
            byte[] bArr = d3.c.f1490a;
            j5 += a0.f2401b[d4 & 255];
        }
        int i5 = (int) ((j5 + 7) >> 3);
        int a5 = iVar.a();
        p3.f fVar = this.f2415a;
        if (i5 >= a5) {
            e(iVar.a(), 127, 0);
            fVar.u(iVar);
            return;
        }
        p3.f fVar2 = new p3.f();
        int[] iArr2 = a0.f2400a;
        int a6 = iVar.a();
        int i6 = 0;
        for (int i7 = 0; i7 < a6; i7++) {
            byte d5 = iVar.d(i7);
            byte[] bArr2 = d3.c.f1490a;
            int i8 = d5 & 255;
            int i9 = a0.f2400a[i8];
            byte b2 = a0.f2401b[i8];
            j4 = (j4 << b2) | i9;
            i6 += b2;
            while (i6 >= 8) {
                i6 -= 8;
                fVar2.x((int) (j4 >> i6));
            }
        }
        if (i6 > 0) {
            fVar2.x((int) ((j4 << (8 - i6)) | (255 >>> i6)));
        }
        p3.i b4 = fVar2.b(fVar2.g);
        e(b4.a(), 127, 128);
        fVar.u(b4);
    }

    public final void d(ArrayList arrayList) {
        int i4;
        int i5;
        if (this.c) {
            int i6 = this.f2416b;
            if (i6 < this.f2417d) {
                e(i6, 31, 32);
            }
            this.c = false;
            this.f2416b = Integer.MAX_VALUE;
            e(this.f2417d, 31, 32);
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            b bVar = (b) arrayList.get(i7);
            p3.i g = bVar.f2406a.g();
            p3.i iVar = bVar.f2407b;
            Integer num = (Integer) e.f2421b.get(g);
            if (num != null) {
                int intValue = num.intValue();
                i5 = intValue + 1;
                if (2 <= i5 && i5 < 8) {
                    b[] bVarArr = e.f2420a;
                    if (u2.c.a(bVarArr[intValue].f2407b, iVar)) {
                        i4 = i5;
                    } else if (u2.c.a(bVarArr[i5].f2407b, iVar)) {
                        i5 = intValue + 2;
                        i4 = i5;
                    }
                }
                i4 = i5;
                i5 = -1;
            } else {
                i4 = -1;
                i5 = -1;
            }
            if (i5 == -1) {
                int i8 = this.f2419f + 1;
                int length = this.f2418e.length;
                while (true) {
                    if (i8 >= length) {
                        break;
                    }
                    b bVar2 = this.f2418e[i8];
                    u2.c.b(bVar2);
                    if (u2.c.a(bVar2.f2406a, g)) {
                        b bVar3 = this.f2418e[i8];
                        u2.c.b(bVar3);
                        if (u2.c.a(bVar3.f2407b, iVar)) {
                            i5 = e.f2420a.length + (i8 - this.f2419f);
                            break;
                        } else if (i4 == -1) {
                            i4 = (i8 - this.f2419f) + e.f2420a.length;
                        }
                    }
                    i8++;
                }
            }
            if (i5 != -1) {
                e(i5, 127, 128);
            } else if (i4 == -1) {
                this.f2415a.x(64);
                c(g);
                c(iVar);
                b(bVar);
            } else {
                p3.i iVar2 = b.f2402d;
                g.getClass();
                u2.c.e(iVar2, "prefix");
                if (!g.f(iVar2, iVar2.a()) || u2.c.a(b.f2405i, g)) {
                    e(i4, 63, 64);
                    c(iVar);
                    b(bVar);
                } else {
                    e(i4, 15, 0);
                    c(iVar);
                }
            }
        }
    }

    public final void e(int i4, int i5, int i6) {
        p3.f fVar = this.f2415a;
        if (i4 < i5) {
            fVar.x(i4 | i6);
            return;
        }
        fVar.x(i6 | i5);
        int i7 = i4 - i5;
        while (i7 >= 128) {
            fVar.x(128 | (i7 & 127));
            i7 >>>= 7;
        }
        fVar.x(i7);
    }
}
