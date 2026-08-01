package G1;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: G1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0004e {

    /* renamed from: b, reason: collision with root package name */
    public final M1.f f362b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f364d;

    /* renamed from: h, reason: collision with root package name */
    public int f367h;
    public int i;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f361a = true;

    /* renamed from: c, reason: collision with root package name */
    public int f363c = Integer.MAX_VALUE;
    public int e = 4096;

    /* renamed from: f, reason: collision with root package name */
    public C0002c[] f365f = new C0002c[8];

    /* renamed from: g, reason: collision with root package name */
    public int f366g = 7;

    public C0004e(M1.f fVar) {
        this.f362b = fVar;
    }

    public final void a(int i) {
        int i2;
        if (i > 0) {
            int length = this.f365f.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f366g;
                if (length < i2 || i <= 0) {
                    break;
                }
                C0002c c0002c = this.f365f[length];
                j1.h.b(c0002c);
                i -= c0002c.f354c;
                int i4 = this.i;
                C0002c c0002c2 = this.f365f[length];
                j1.h.b(c0002c2);
                this.i = i4 - c0002c2.f354c;
                this.f367h--;
                i3++;
                length--;
            }
            C0002c[] c0002cArr = this.f365f;
            int i5 = i2 + 1;
            System.arraycopy(c0002cArr, i5, c0002cArr, i5 + i3, this.f367h);
            C0002c[] c0002cArr2 = this.f365f;
            int i6 = this.f366g + 1;
            Arrays.fill(c0002cArr2, i6, i6 + i3, (Object) null);
            this.f366g += i3;
        }
    }

    public final void b(C0002c c0002c) {
        int i = this.e;
        int i2 = c0002c.f354c;
        if (i2 > i) {
            C0002c[] c0002cArr = this.f365f;
            X0.j.o0(c0002cArr, 0, c0002cArr.length);
            this.f366g = this.f365f.length - 1;
            this.f367h = 0;
            this.i = 0;
            return;
        }
        a((this.i + i2) - i);
        int i3 = this.f367h + 1;
        C0002c[] c0002cArr2 = this.f365f;
        if (i3 > c0002cArr2.length) {
            C0002c[] c0002cArr3 = new C0002c[c0002cArr2.length * 2];
            System.arraycopy(c0002cArr2, 0, c0002cArr3, c0002cArr2.length, c0002cArr2.length);
            this.f366g = this.f365f.length - 1;
            this.f365f = c0002cArr3;
        }
        int i4 = this.f366g;
        this.f366g = i4 - 1;
        this.f365f[i4] = c0002c;
        this.f367h++;
        this.i += i2;
    }

    public final void c(M1.i iVar) {
        j1.h.e(iVar, "data");
        M1.f fVar = this.f362b;
        if (this.f361a) {
            int[] iArr = B.f341a;
            int a2 = iVar.a();
            long j = 0;
            for (int i = 0; i < a2; i++) {
                byte d2 = iVar.d(i);
                byte[] bArr = A1.c.f19a;
                j += B.f342b[d2 & 255];
            }
            if (((int) ((j + 7) >> 3)) < iVar.a()) {
                M1.f fVar2 = new M1.f();
                int[] iArr2 = B.f341a;
                int a3 = iVar.a();
                long j2 = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < a3; i3++) {
                    byte d3 = iVar.d(i3);
                    byte[] bArr2 = A1.c.f19a;
                    int i4 = d3 & 255;
                    int i5 = B.f341a[i4];
                    byte b2 = B.f342b[i4];
                    j2 = (j2 << b2) | i5;
                    i2 += b2;
                    while (i2 >= 8) {
                        i2 -= 8;
                        fVar2.M((int) (j2 >> i2));
                    }
                }
                if (i2 > 0) {
                    fVar2.M((int) ((255 >>> i2) | (j2 << (8 - i2))));
                }
                M1.i B2 = fVar2.B(fVar2.f827b);
                e(B2.a(), 127, 128);
                fVar.K(B2);
                return;
            }
        }
        e(iVar.a(), 127, 0);
        fVar.K(iVar);
    }

    public final void d(ArrayList arrayList) {
        int i;
        int i2;
        if (this.f364d) {
            int i3 = this.f363c;
            if (i3 < this.e) {
                e(i3, 31, 32);
            }
            this.f364d = false;
            this.f363c = Integer.MAX_VALUE;
            e(this.e, 31, 32);
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C0002c c0002c = (C0002c) arrayList.get(i4);
            M1.i g2 = c0002c.f352a.g();
            Integer num = (Integer) f.f369b.get(g2);
            M1.i iVar = c0002c.f353b;
            if (num != null) {
                int intValue = num.intValue();
                i2 = intValue + 1;
                if (2 <= i2 && i2 < 8) {
                    C0002c[] c0002cArr = f.f368a;
                    if (j1.h.a(c0002cArr[intValue].f353b, iVar)) {
                        i = i2;
                    } else if (j1.h.a(c0002cArr[i2].f353b, iVar)) {
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
                int i5 = this.f366g + 1;
                int length = this.f365f.length;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    C0002c c0002c2 = this.f365f[i5];
                    j1.h.b(c0002c2);
                    if (j1.h.a(c0002c2.f352a, g2)) {
                        C0002c c0002c3 = this.f365f[i5];
                        j1.h.b(c0002c3);
                        if (j1.h.a(c0002c3.f353b, iVar)) {
                            i2 = f.f368a.length + (i5 - this.f366g);
                            break;
                        } else if (i == -1) {
                            i = (i5 - this.f366g) + f.f368a.length;
                        }
                    }
                    i5++;
                }
            }
            if (i2 != -1) {
                e(i2, 127, 128);
            } else if (i == -1) {
                this.f362b.M(64);
                c(g2);
                c(iVar);
                b(c0002c);
            } else {
                M1.i iVar2 = C0002c.f348d;
                g2.getClass();
                j1.h.e(iVar2, "prefix");
                if (!g2.f(iVar2, iVar2.a()) || j1.h.a(C0002c.i, g2)) {
                    e(i, 63, 64);
                    c(iVar);
                    b(c0002c);
                } else {
                    e(i, 15, 0);
                    c(iVar);
                }
            }
        }
    }

    public final void e(int i, int i2, int i3) {
        M1.f fVar = this.f362b;
        if (i < i2) {
            fVar.M(i | i3);
            return;
        }
        fVar.M(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            fVar.M(128 | (i4 & 127));
            i4 >>>= 7;
        }
        fVar.M(i4);
    }
}
