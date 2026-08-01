package G1;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: G1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0004e {

    /* renamed from: b, reason: collision with root package name */
    public final M1.f f379b;
    public boolean d;
    public int h;
    public int i;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f378a = true;

    /* renamed from: c, reason: collision with root package name */
    public int f380c = Integer.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public int f381e = 4096;

    /* renamed from: f, reason: collision with root package name */
    public C0002c[] f382f = new C0002c[8];

    /* renamed from: g, reason: collision with root package name */
    public int f383g = 7;

    public C0004e(M1.f fVar) {
        this.f379b = fVar;
    }

    public final void a(int i) {
        int i2;
        if (i > 0) {
            int length = this.f382f.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f383g;
                if (length < i2 || i <= 0) {
                    break;
                }
                C0002c c0002c = this.f382f[length];
                k1.e.b(c0002c);
                i -= c0002c.f371c;
                int i4 = this.i;
                C0002c c0002c2 = this.f382f[length];
                k1.e.b(c0002c2);
                this.i = i4 - c0002c2.f371c;
                this.h--;
                i3++;
                length--;
            }
            C0002c[] c0002cArr = this.f382f;
            int i5 = i2 + 1;
            System.arraycopy(c0002cArr, i5, c0002cArr, i5 + i3, this.h);
            C0002c[] c0002cArr2 = this.f382f;
            int i6 = this.f383g + 1;
            Arrays.fill(c0002cArr2, i6, i6 + i3, (Object) null);
            this.f383g += i3;
        }
    }

    public final void b(C0002c c0002c) {
        int i = this.f381e;
        int i2 = c0002c.f371c;
        if (i2 > i) {
            C0002c[] c0002cArr = this.f382f;
            Y0.i.l0(c0002cArr, 0, c0002cArr.length);
            this.f383g = this.f382f.length - 1;
            this.h = 0;
            this.i = 0;
            return;
        }
        a((this.i + i2) - i);
        int i3 = this.h + 1;
        C0002c[] c0002cArr2 = this.f382f;
        if (i3 > c0002cArr2.length) {
            C0002c[] c0002cArr3 = new C0002c[c0002cArr2.length * 2];
            System.arraycopy(c0002cArr2, 0, c0002cArr3, c0002cArr2.length, c0002cArr2.length);
            this.f383g = this.f382f.length - 1;
            this.f382f = c0002cArr3;
        }
        int i4 = this.f383g;
        this.f383g = i4 - 1;
        this.f382f[i4] = c0002c;
        this.h++;
        this.i += i2;
    }

    public final void c(M1.i iVar) {
        k1.e.e(iVar, "data");
        M1.f fVar = this.f379b;
        if (this.f378a) {
            int[] iArr = B.f359a;
            int a2 = iVar.a();
            long j2 = 0;
            for (int i = 0; i < a2; i++) {
                byte d = iVar.d(i);
                byte[] bArr = A1.c.f13a;
                j2 += B.f360b[d & 255];
            }
            if (((int) ((j2 + 7) >> 3)) < iVar.a()) {
                M1.f fVar2 = new M1.f();
                int[] iArr2 = B.f359a;
                int a3 = iVar.a();
                long j3 = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < a3; i3++) {
                    byte d2 = iVar.d(i3);
                    byte[] bArr2 = A1.c.f13a;
                    int i4 = d2 & 255;
                    int i5 = B.f359a[i4];
                    byte b2 = B.f360b[i4];
                    j3 = (j3 << b2) | i5;
                    i2 += b2;
                    while (i2 >= 8) {
                        i2 -= 8;
                        fVar2.A((int) (j3 >> i2));
                    }
                }
                if (i2 > 0) {
                    fVar2.A((int) ((255 >>> i2) | (j3 << (8 - i2))));
                }
                M1.i p2 = fVar2.p(fVar2.f799b);
                e(p2.a(), 127, 128);
                fVar.y(p2);
                return;
            }
        }
        e(iVar.a(), 127, 0);
        fVar.y(iVar);
    }

    public final void d(ArrayList arrayList) {
        int i;
        int i2;
        if (this.d) {
            int i3 = this.f380c;
            if (i3 < this.f381e) {
                e(i3, 31, 32);
            }
            this.d = false;
            this.f380c = Integer.MAX_VALUE;
            e(this.f381e, 31, 32);
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C0002c c0002c = (C0002c) arrayList.get(i4);
            M1.i g2 = c0002c.f369a.g();
            Integer num = (Integer) f.f385b.get(g2);
            M1.i iVar = c0002c.f370b;
            if (num != null) {
                int intValue = num.intValue();
                i2 = intValue + 1;
                if (2 <= i2 && i2 < 8) {
                    C0002c[] c0002cArr = f.f384a;
                    if (k1.e.a(c0002cArr[intValue].f370b, iVar)) {
                        i = i2;
                    } else if (k1.e.a(c0002cArr[i2].f370b, iVar)) {
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
                int i5 = this.f383g + 1;
                int length = this.f382f.length;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    C0002c c0002c2 = this.f382f[i5];
                    k1.e.b(c0002c2);
                    if (k1.e.a(c0002c2.f369a, g2)) {
                        C0002c c0002c3 = this.f382f[i5];
                        k1.e.b(c0002c3);
                        if (k1.e.a(c0002c3.f370b, iVar)) {
                            i2 = f.f384a.length + (i5 - this.f383g);
                            break;
                        } else if (i == -1) {
                            i = (i5 - this.f383g) + f.f384a.length;
                        }
                    }
                    i5++;
                }
            }
            if (i2 != -1) {
                e(i2, 127, 128);
            } else if (i == -1) {
                this.f379b.A(64);
                c(g2);
                c(iVar);
                b(c0002c);
            } else {
                M1.i iVar2 = C0002c.d;
                g2.getClass();
                k1.e.e(iVar2, "prefix");
                if (!g2.f(iVar2, iVar2.a()) || k1.e.a(C0002c.i, g2)) {
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
        M1.f fVar = this.f379b;
        if (i < i2) {
            fVar.A(i | i3);
            return;
        }
        fVar.A(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            fVar.A(128 | (i4 & 127));
            i4 >>>= 7;
        }
        fVar.A(i4);
    }
}
