package N3;

import java.io.IOException;
import java.util.ArrayList;
import kotlin.KotlinVersion;

/* renamed from: N3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0080d {

    /* renamed from: c, reason: collision with root package name */
    public final T3.p f1839c;

    /* renamed from: f, reason: collision with root package name */
    public int f1842f;

    /* renamed from: g, reason: collision with root package name */
    public int f1843g;

    /* renamed from: a, reason: collision with root package name */
    public int f1837a = 4096;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1838b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public C0079c[] f1840d = new C0079c[8];

    /* renamed from: e, reason: collision with root package name */
    public int f1841e = 7;

    public C0080d(t tVar) {
        this.f1839c = new T3.p(tVar);
    }

    public final int a(int i4) {
        int i5;
        int i6 = 0;
        if (i4 > 0) {
            int length = this.f1840d.length;
            while (true) {
                length--;
                i5 = this.f1841e;
                if (length < i5 || i4 <= 0) {
                    break;
                }
                C0079c c0079c = this.f1840d[length];
                kotlin.jvm.internal.i.b(c0079c);
                int i7 = c0079c.f1836c;
                i4 -= i7;
                this.f1843g -= i7;
                this.f1842f--;
                i6++;
            }
            C0079c[] c0079cArr = this.f1840d;
            System.arraycopy(c0079cArr, i5 + 1, c0079cArr, i5 + 1 + i6, this.f1842f);
            this.f1841e += i6;
        }
        return i6;
    }

    public final T3.j b(int i4) {
        if (i4 >= 0) {
            C0079c[] c0079cArr = f.f1852a;
            if (i4 <= c0079cArr.length - 1) {
                return c0079cArr[i4].f1834a;
            }
        }
        int length = this.f1841e + 1 + (i4 - f.f1852a.length);
        if (length >= 0) {
            C0079c[] c0079cArr2 = this.f1840d;
            if (length < c0079cArr2.length) {
                C0079c c0079c = c0079cArr2[length];
                kotlin.jvm.internal.i.b(c0079c);
                return c0079c.f1834a;
            }
        }
        throw new IOException(kotlin.jvm.internal.i.h(Integer.valueOf(i4 + 1), "Header index too large "));
    }

    public final void c(C0079c c0079c) {
        this.f1838b.add(c0079c);
        int i4 = c0079c.f1836c;
        int i5 = this.f1837a;
        if (i4 > i5) {
            C0079c[] c0079cArr = this.f1840d;
            d3.g.S(c0079cArr, 0, c0079cArr.length);
            this.f1841e = this.f1840d.length - 1;
            this.f1842f = 0;
            this.f1843g = 0;
            return;
        }
        a((this.f1843g + i4) - i5);
        int i6 = this.f1842f + 1;
        C0079c[] c0079cArr2 = this.f1840d;
        if (i6 > c0079cArr2.length) {
            C0079c[] c0079cArr3 = new C0079c[c0079cArr2.length * 2];
            System.arraycopy(c0079cArr2, 0, c0079cArr3, c0079cArr2.length, c0079cArr2.length);
            this.f1841e = this.f1840d.length - 1;
            this.f1840d = c0079cArr3;
        }
        int i7 = this.f1841e;
        this.f1841e = i7 - 1;
        this.f1840d[i7] = c0079c;
        this.f1842f++;
        this.f1843g += i4;
    }

    public final T3.j d() {
        T3.p source = this.f1839c;
        byte readByte = source.readByte();
        byte[] bArr = H3.b.f1103a;
        int i4 = readByte & 255;
        int i5 = 0;
        boolean z = (readByte & 128) == 128;
        long e4 = e(i4, 127);
        if (!z) {
            return source.c(e4);
        }
        T3.g gVar = new T3.g();
        int[] iArr = B.f1813a;
        kotlin.jvm.internal.i.e(source, "source");
        A a3 = B.f1815c;
        A a4 = a3;
        long j4 = 0;
        int i6 = 0;
        while (j4 < e4) {
            j4++;
            byte readByte2 = source.readByte();
            byte[] bArr2 = H3.b.f1103a;
            i5 = (i5 << 8) | (readByte2 & 255);
            i6 += 8;
            while (i6 >= 8) {
                int i7 = (i5 >>> (i6 - 8)) & KotlinVersion.MAX_COMPONENT_VALUE;
                A[] aArr = (A[]) a4.f1812c;
                kotlin.jvm.internal.i.b(aArr);
                a4 = aArr[i7];
                kotlin.jvm.internal.i.b(a4);
                if (((A[]) a4.f1812c) == null) {
                    gVar.x(a4.f1810a);
                    i6 -= a4.f1811b;
                    a4 = a3;
                } else {
                    i6 -= 8;
                }
            }
        }
        while (i6 > 0) {
            int i8 = (i5 << (8 - i6)) & KotlinVersion.MAX_COMPONENT_VALUE;
            A[] aArr2 = (A[]) a4.f1812c;
            kotlin.jvm.internal.i.b(aArr2);
            A a5 = aArr2[i8];
            kotlin.jvm.internal.i.b(a5);
            int i9 = a5.f1811b;
            if (((A[]) a5.f1812c) != null || i9 > i6) {
                break;
            }
            gVar.x(a5.f1810a);
            i6 -= i9;
            a4 = a3;
        }
        return gVar.c(gVar.f2975b);
    }

    public final int e(int i4, int i5) {
        int i6 = i4 & i5;
        if (i6 < i5) {
            return i6;
        }
        int i7 = 0;
        while (true) {
            byte readByte = this.f1839c.readByte();
            byte[] bArr = H3.b.f1103a;
            int i8 = readByte & 255;
            if ((readByte & 128) == 0) {
                return i5 + (i8 << i7);
            }
            i5 += (readByte & Byte.MAX_VALUE) << i7;
            i7 += 7;
        }
    }
}
