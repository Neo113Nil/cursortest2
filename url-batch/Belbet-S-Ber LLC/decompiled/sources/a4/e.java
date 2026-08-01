package a4;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final g4.f f161a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f163c;

    /* renamed from: g, reason: collision with root package name */
    public int f166g;
    public int h;

    /* renamed from: b, reason: collision with root package name */
    public int f162b = Integer.MAX_VALUE;
    public int d = 4096;

    /* renamed from: e, reason: collision with root package name */
    public c[] f164e = new c[8];

    /* renamed from: f, reason: collision with root package name */
    public int f165f = 7;

    public e(g4.f fVar) {
        this.f161a = fVar;
    }

    public final void a(int i) {
        int i4;
        if (i > 0) {
            int length = this.f164e.length - 1;
            int i5 = 0;
            while (true) {
                i4 = this.f165f;
                if (length < i4 || i <= 0) {
                    break;
                }
                c cVar = this.f164e[length];
                i3.d.b(cVar);
                i -= cVar.f150c;
                int i6 = this.h;
                c cVar2 = this.f164e[length];
                i3.d.b(cVar2);
                this.h = i6 - cVar2.f150c;
                this.f166g--;
                i5++;
                length--;
            }
            c[] cVarArr = this.f164e;
            int i7 = i4 + 1;
            System.arraycopy(cVarArr, i7, cVarArr, i7 + i5, this.f166g);
            c[] cVarArr2 = this.f164e;
            int i8 = this.f165f + 1;
            Arrays.fill(cVarArr2, i8, i8 + i5, (Object) null);
            this.f165f += i5;
        }
    }

    public final void b(c cVar) {
        int i = cVar.f150c;
        int i4 = this.d;
        if (i > i4) {
            c[] cVarArr = this.f164e;
            x2.g.K(cVarArr, 0, cVarArr.length);
            this.f165f = this.f164e.length - 1;
            this.f166g = 0;
            this.h = 0;
            return;
        }
        a((this.h + i) - i4);
        int i5 = this.f166g + 1;
        c[] cVarArr2 = this.f164e;
        if (i5 > cVarArr2.length) {
            c[] cVarArr3 = new c[cVarArr2.length * 2];
            System.arraycopy(cVarArr2, 0, cVarArr3, cVarArr2.length, cVarArr2.length);
            this.f165f = this.f164e.length - 1;
            this.f164e = cVarArr3;
        }
        int i6 = this.f165f;
        this.f165f = i6 - 1;
        this.f164e[i6] = cVar;
        this.f166g++;
        this.h += i;
    }

    public final void c(g4.i iVar) {
        i3.d.e(iVar, "data");
        int[] iArr = c0.f151a;
        int a5 = iVar.a();
        long j2 = 0;
        long j4 = 0;
        for (int i = 0; i < a5; i++) {
            byte d = iVar.d(i);
            byte[] bArr = u3.b.f3581a;
            j4 += c0.f152b[d & 255];
        }
        int i4 = (int) ((j4 + 7) >> 3);
        int a6 = iVar.a();
        g4.f fVar = this.f161a;
        if (i4 >= a6) {
            e(iVar.a(), 127, 0);
            fVar.u(iVar);
            return;
        }
        g4.f fVar2 = new g4.f();
        int[] iArr2 = c0.f151a;
        int a7 = iVar.a();
        int i5 = 0;
        for (int i6 = 0; i6 < a7; i6++) {
            byte d5 = iVar.d(i6);
            byte[] bArr2 = u3.b.f3581a;
            int i7 = d5 & 255;
            int i8 = c0.f151a[i7];
            byte b2 = c0.f152b[i7];
            j2 = (j2 << b2) | i8;
            i5 += b2;
            while (i5 >= 8) {
                i5 -= 8;
                fVar2.x((int) (j2 >> i5));
            }
        }
        if (i5 > 0) {
            fVar2.x((int) ((j2 << (8 - i5)) | (255 >>> i5)));
        }
        g4.i b5 = fVar2.b(fVar2.f1935g);
        e(b5.a(), 127, 128);
        fVar.u(b5);
    }

    public final void d(ArrayList arrayList) {
        int i;
        int i4;
        if (this.f163c) {
            int i5 = this.f162b;
            if (i5 < this.d) {
                e(i5, 31, 32);
            }
            this.f163c = false;
            this.f162b = Integer.MAX_VALUE;
            e(this.d, 31, 32);
        }
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            c cVar = (c) arrayList.get(i6);
            g4.i g3 = cVar.f148a.g();
            g4.i iVar = cVar.f149b;
            Integer num = (Integer) f.f170b.get(g3);
            if (num != null) {
                int intValue = num.intValue();
                i4 = intValue + 1;
                if (2 <= i4 && i4 < 8) {
                    c[] cVarArr = f.f169a;
                    if (i3.d.a(cVarArr[intValue].f149b, iVar)) {
                        i = i4;
                    } else if (i3.d.a(cVarArr[i4].f149b, iVar)) {
                        i4 = intValue + 2;
                        i = i4;
                    }
                }
                i = i4;
                i4 = -1;
            } else {
                i = -1;
                i4 = -1;
            }
            if (i4 == -1) {
                int i7 = this.f165f + 1;
                int length = this.f164e.length;
                while (true) {
                    if (i7 >= length) {
                        break;
                    }
                    c cVar2 = this.f164e[i7];
                    i3.d.b(cVar2);
                    if (i3.d.a(cVar2.f148a, g3)) {
                        c cVar3 = this.f164e[i7];
                        i3.d.b(cVar3);
                        if (i3.d.a(cVar3.f149b, iVar)) {
                            i4 = f.f169a.length + (i7 - this.f165f);
                            break;
                        } else if (i == -1) {
                            i = (i7 - this.f165f) + f.f169a.length;
                        }
                    }
                    i7++;
                }
            }
            if (i4 != -1) {
                e(i4, 127, 128);
            } else if (i == -1) {
                this.f161a.x(64);
                c(g3);
                c(iVar);
                b(cVar);
            } else {
                g4.i iVar2 = c.d;
                g3.getClass();
                i3.d.e(iVar2, "prefix");
                if (!g3.f(iVar2, iVar2.a()) || i3.d.a(c.i, g3)) {
                    e(i, 63, 64);
                    c(iVar);
                    b(cVar);
                } else {
                    e(i, 15, 0);
                    c(iVar);
                }
            }
        }
    }

    public final void e(int i, int i4, int i5) {
        g4.f fVar = this.f161a;
        if (i < i4) {
            fVar.x(i | i5);
            return;
        }
        fVar.x(i5 | i4);
        int i6 = i - i4;
        while (i6 >= 128) {
            fVar.x(128 | (i6 & 127));
            i6 >>>= 7;
        }
        fVar.x(i6);
    }
}
