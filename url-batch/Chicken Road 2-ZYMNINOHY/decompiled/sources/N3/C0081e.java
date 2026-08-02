package N3;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: N3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0081e {

    /* renamed from: a, reason: collision with root package name */
    public final T3.g f1844a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1846c;

    /* renamed from: g, reason: collision with root package name */
    public int f1850g;

    /* renamed from: h, reason: collision with root package name */
    public int f1851h;

    /* renamed from: b, reason: collision with root package name */
    public int f1845b = Integer.MAX_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f1847d = 4096;

    /* renamed from: e, reason: collision with root package name */
    public C0079c[] f1848e = new C0079c[8];

    /* renamed from: f, reason: collision with root package name */
    public int f1849f = 7;

    public C0081e(T3.g gVar) {
        this.f1844a = gVar;
    }

    public final void a(int i4) {
        int i5;
        if (i4 > 0) {
            int length = this.f1848e.length - 1;
            int i6 = 0;
            while (true) {
                i5 = this.f1849f;
                if (length < i5 || i4 <= 0) {
                    break;
                }
                C0079c c0079c = this.f1848e[length];
                kotlin.jvm.internal.i.b(c0079c);
                i4 -= c0079c.f1836c;
                int i7 = this.f1851h;
                C0079c c0079c2 = this.f1848e[length];
                kotlin.jvm.internal.i.b(c0079c2);
                this.f1851h = i7 - c0079c2.f1836c;
                this.f1850g--;
                i6++;
                length--;
            }
            C0079c[] c0079cArr = this.f1848e;
            int i8 = i5 + 1;
            System.arraycopy(c0079cArr, i8, c0079cArr, i8 + i6, this.f1850g);
            C0079c[] c0079cArr2 = this.f1848e;
            int i9 = this.f1849f + 1;
            Arrays.fill(c0079cArr2, i9, i9 + i6, (Object) null);
            this.f1849f += i6;
        }
    }

    public final void b(C0079c c0079c) {
        int i4 = c0079c.f1836c;
        int i5 = this.f1847d;
        if (i4 > i5) {
            C0079c[] c0079cArr = this.f1848e;
            d3.g.S(c0079cArr, 0, c0079cArr.length);
            this.f1849f = this.f1848e.length - 1;
            this.f1850g = 0;
            this.f1851h = 0;
            return;
        }
        a((this.f1851h + i4) - i5);
        int i6 = this.f1850g + 1;
        C0079c[] c0079cArr2 = this.f1848e;
        if (i6 > c0079cArr2.length) {
            C0079c[] c0079cArr3 = new C0079c[c0079cArr2.length * 2];
            System.arraycopy(c0079cArr2, 0, c0079cArr3, c0079cArr2.length, c0079cArr2.length);
            this.f1849f = this.f1848e.length - 1;
            this.f1848e = c0079cArr3;
        }
        int i7 = this.f1849f;
        this.f1849f = i7 - 1;
        this.f1848e[i7] = c0079c;
        this.f1850g++;
        this.f1851h += i4;
    }

    public final void c(T3.j data) {
        kotlin.jvm.internal.i.e(data, "data");
        int[] iArr = B.f1813a;
        int a3 = data.a();
        long j4 = 0;
        int i4 = 0;
        long j5 = 0;
        int i5 = 0;
        while (i5 < a3) {
            int i6 = i5 + 1;
            byte d4 = data.d(i5);
            byte[] bArr = H3.b.f1103a;
            j5 += B.f1814b[d4 & 255];
            i5 = i6;
        }
        int i7 = (int) ((j5 + 7) >> 3);
        int a4 = data.a();
        T3.g gVar = this.f1844a;
        if (i7 >= a4) {
            e(data.a(), 127, 0);
            gVar.v(data);
            return;
        }
        T3.g gVar2 = new T3.g();
        int[] iArr2 = B.f1813a;
        int a5 = data.a();
        int i8 = 0;
        while (i4 < a5) {
            int i9 = i4 + 1;
            byte d5 = data.d(i4);
            byte[] bArr2 = H3.b.f1103a;
            int i10 = d5 & 255;
            int i11 = B.f1813a[i10];
            byte b4 = B.f1814b[i10];
            j4 = (j4 << b4) | i11;
            i8 += b4;
            while (i8 >= 8) {
                i8 -= 8;
                gVar2.x((int) (j4 >> i8));
            }
            i4 = i9;
        }
        if (i8 > 0) {
            gVar2.x((int) ((j4 << (8 - i8)) | (255 >>> i8)));
        }
        T3.j c4 = gVar2.c(gVar2.f2975b);
        e(c4.a(), 127, 128);
        gVar.v(c4);
    }

    public final void d(ArrayList arrayList) {
        int i4;
        int i5;
        if (this.f1846c) {
            int i6 = this.f1845b;
            if (i6 < this.f1847d) {
                e(i6, 31, 32);
            }
            this.f1846c = false;
            this.f1845b = Integer.MAX_VALUE;
            e(this.f1847d, 31, 32);
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            int i8 = i7 + 1;
            C0079c c0079c = (C0079c) arrayList.get(i7);
            T3.j g4 = c0079c.f1834a.g();
            T3.j jVar = c0079c.f1835b;
            Integer num = (Integer) f.f1853b.get(g4);
            if (num != null) {
                int intValue = num.intValue();
                i5 = intValue + 1;
                if (2 <= i5 && i5 < 8) {
                    C0079c[] c0079cArr = f.f1852a;
                    if (kotlin.jvm.internal.i.a(c0079cArr[intValue].f1835b, jVar)) {
                        i4 = i5;
                    } else if (kotlin.jvm.internal.i.a(c0079cArr[i5].f1835b, jVar)) {
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
                int i9 = this.f1849f + 1;
                int length = this.f1848e.length;
                while (true) {
                    if (i9 >= length) {
                        break;
                    }
                    int i10 = i9 + 1;
                    C0079c c0079c2 = this.f1848e[i9];
                    kotlin.jvm.internal.i.b(c0079c2);
                    if (kotlin.jvm.internal.i.a(c0079c2.f1834a, g4)) {
                        C0079c c0079c3 = this.f1848e[i9];
                        kotlin.jvm.internal.i.b(c0079c3);
                        if (kotlin.jvm.internal.i.a(c0079c3.f1835b, jVar)) {
                            i5 = f.f1852a.length + (i9 - this.f1849f);
                            break;
                        } else if (i4 == -1) {
                            i4 = f.f1852a.length + (i9 - this.f1849f);
                        }
                    }
                    i9 = i10;
                }
            }
            if (i5 != -1) {
                e(i5, 127, 128);
            } else if (i4 == -1) {
                this.f1844a.x(64);
                c(g4);
                c(jVar);
                b(c0079c);
            } else {
                T3.j prefix = C0079c.f1828d;
                g4.getClass();
                kotlin.jvm.internal.i.e(prefix, "prefix");
                if (!g4.f(prefix, prefix.a()) || kotlin.jvm.internal.i.a(C0079c.f1833i, g4)) {
                    e(i4, 63, 64);
                    c(jVar);
                    b(c0079c);
                } else {
                    e(i4, 15, 0);
                    c(jVar);
                }
            }
            i7 = i8;
        }
    }

    public final void e(int i4, int i5, int i6) {
        T3.g gVar = this.f1844a;
        if (i4 < i5) {
            gVar.x(i4 | i6);
            return;
        }
        gVar.x(i6 | i5);
        int i7 = i4 - i5;
        while (i7 >= 128) {
            gVar.x(128 | (i7 & 127));
            i7 >>>= 7;
        }
        gVar.x(i7);
    }
}
