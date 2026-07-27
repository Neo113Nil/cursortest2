package t3;

import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import l.B0;
import z2.C1436t;
import z3.C1448f;
import z3.C1451i;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int f10765a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f10766b;

    /* renamed from: c, reason: collision with root package name */
    public final z3.z f10767c;

    /* renamed from: d, reason: collision with root package name */
    public C1212c[] f10768d;

    /* renamed from: e, reason: collision with root package name */
    public int f10769e;

    /* renamed from: f, reason: collision with root package name */
    public int f10770f;

    /* renamed from: g, reason: collision with root package name */
    public int f10771g;

    public d(s source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f10765a = 4096;
        this.f10766b = new ArrayList();
        this.f10767c = m3.z.h(source);
        this.f10768d = new C1212c[8];
        this.f10769e = 7;
    }

    public final int a(int i2) {
        int i4;
        int i5 = 0;
        if (i2 > 0) {
            int length = this.f10768d.length;
            while (true) {
                length--;
                i4 = this.f10769e;
                if (length < i4 || i2 <= 0) {
                    break;
                }
                C1212c c1212c = this.f10768d[length];
                Intrinsics.c(c1212c);
                int i6 = c1212c.f10764c;
                i2 -= i6;
                this.f10771g -= i6;
                this.f10770f--;
                i5++;
            }
            C1212c[] c1212cArr = this.f10768d;
            System.arraycopy(c1212cArr, i4 + 1, c1212cArr, i4 + 1 + i5, this.f10770f);
            this.f10769e += i5;
        }
        return i5;
    }

    public final C1451i b(int i2) {
        if (i2 >= 0) {
            C1212c[] c1212cArr = f.f10781a;
            if (i2 <= c1212cArr.length - 1) {
                return c1212cArr[i2].f10762a;
            }
        }
        int length = this.f10769e + 1 + (i2 - f.f10781a.length);
        if (length >= 0) {
            C1212c[] c1212cArr2 = this.f10768d;
            if (length < c1212cArr2.length) {
                C1212c c1212c = c1212cArr2[length];
                Intrinsics.c(c1212c);
                return c1212c.f10762a;
            }
        }
        throw new IOException("Header index too large " + (i2 + 1));
    }

    public final void c(C1212c c1212c) {
        this.f10766b.add(c1212c);
        int i2 = this.f10765a;
        int i4 = c1212c.f10764c;
        if (i4 > i2) {
            C1436t.k(r7, 0, this.f10768d.length);
            this.f10769e = this.f10768d.length - 1;
            this.f10770f = 0;
            this.f10771g = 0;
            return;
        }
        a((this.f10771g + i4) - i2);
        int i5 = this.f10770f + 1;
        C1212c[] c1212cArr = this.f10768d;
        if (i5 > c1212cArr.length) {
            C1212c[] c1212cArr2 = new C1212c[c1212cArr.length * 2];
            System.arraycopy(c1212cArr, 0, c1212cArr2, c1212cArr.length, c1212cArr.length);
            this.f10769e = this.f10768d.length - 1;
            this.f10768d = c1212cArr2;
        }
        int i6 = this.f10769e;
        this.f10769e = i6 - 1;
        this.f10768d[i6] = c1212c;
        this.f10770f++;
        this.f10771g += i4;
    }

    public final C1451i d() {
        int i2;
        z3.z source = this.f10767c;
        byte d4 = source.d();
        byte[] bArr = n3.b.f8558a;
        int i4 = d4 & 255;
        int i5 = 0;
        boolean z4 = (d4 & 128) == 128;
        long e4 = e(i4, 127);
        if (!z4) {
            return source.f(e4);
        }
        C1448f sink = new C1448f();
        int[] iArr = z.f10883a;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        B0 b02 = z.f10885c;
        B0 b03 = b02;
        int i6 = 0;
        for (long j4 = 0; j4 < e4; j4++) {
            byte d5 = source.d();
            byte[] bArr2 = n3.b.f8558a;
            i5 = (i5 << 8) | (d5 & 255);
            i6 += 8;
            while (i6 >= 8) {
                B0[] b0Arr = (B0[]) b03.f7557i;
                Intrinsics.c(b0Arr);
                b03 = b0Arr[(i5 >>> (i6 - 8)) & 255];
                Intrinsics.c(b03);
                if (((B0[]) b03.f7557i) == null) {
                    sink.y(b03.f7555d);
                    i6 -= b03.f7556e;
                    b03 = b02;
                } else {
                    i6 -= 8;
                }
            }
        }
        while (i6 > 0) {
            B0[] b0Arr2 = (B0[]) b03.f7557i;
            Intrinsics.c(b0Arr2);
            B0 b04 = b0Arr2[(i5 << (8 - i6)) & 255];
            Intrinsics.c(b04);
            if (((B0[]) b04.f7557i) != null || (i2 = b04.f7556e) > i6) {
                break;
            }
            sink.y(b04.f7555d);
            i6 -= i2;
            b03 = b02;
        }
        return sink.j(sink.f11999e);
    }

    public final int e(int i2, int i4) {
        int i5 = i2 & i4;
        if (i5 < i4) {
            return i5;
        }
        int i6 = 0;
        while (true) {
            byte d4 = this.f10767c.d();
            byte[] bArr = n3.b.f8558a;
            int i7 = d4 & 255;
            if ((d4 & 128) == 0) {
                return i4 + (i7 << i6);
            }
            i4 += (d4 & Byte.MAX_VALUE) << i6;
            i6 += 7;
        }
    }
}
