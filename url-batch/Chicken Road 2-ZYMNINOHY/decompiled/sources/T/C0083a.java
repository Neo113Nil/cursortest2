package T;

import E.AbstractC0005f;
import a.AbstractC0124a;
import android.net.Uri;
import java.util.Arrays;

/* renamed from: T.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0083a {

    /* renamed from: a, reason: collision with root package name */
    public final int f2756a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2757b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri[] f2758c;

    /* renamed from: d, reason: collision with root package name */
    public final C0107z[] f2759d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f2760e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f2761f;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f2762g;

    /* renamed from: h, reason: collision with root package name */
    public final AbstractC0084b[] f2763h;

    static {
        AbstractC0005f.s(0, 1, 2, 3, 4);
        AbstractC0005f.s(5, 6, 7, 8, 9);
        W.J.G(10);
        W.J.G(11);
    }

    public C0083a(int i4, int i5, int[] iArr, C0107z[] c0107zArr, long[] jArr, String[] strArr, AbstractC0084b[] abstractC0084bArr) {
        Uri uri;
        int i6 = 0;
        AbstractC0124a.h(iArr.length == c0107zArr.length);
        AbstractC0124a.h(iArr.length == abstractC0084bArr.length);
        this.f2756a = i4;
        this.f2757b = i5;
        this.f2760e = iArr;
        this.f2759d = c0107zArr;
        this.f2761f = jArr;
        this.f2758c = new Uri[c0107zArr.length];
        while (true) {
            Uri[] uriArr = this.f2758c;
            if (i6 >= uriArr.length) {
                this.f2762g = strArr;
                this.f2763h = abstractC0084bArr;
                return;
            }
            C0107z c0107z = c0107zArr[i6];
            if (c0107z == null) {
                uri = null;
            } else {
                C0104w c0104w = c0107z.f2900b;
                c0104w.getClass();
                uri = c0104w.f2893a;
            }
            uriArr[i6] = uri;
            i6++;
        }
    }

    public final int a(int i4) {
        int i5;
        int i6 = i4 + 1;
        while (true) {
            int[] iArr = this.f2760e;
            if (i6 >= iArr.length || (i5 = iArr[i6]) == 0 || i5 == 1) {
                break;
            }
            i6++;
        }
        return i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0083a.class != obj.getClass()) {
            return false;
        }
        C0083a c0083a = (C0083a) obj;
        return this.f2756a == c0083a.f2756a && this.f2757b == c0083a.f2757b && Arrays.equals(this.f2759d, c0083a.f2759d) && Arrays.equals(this.f2760e, c0083a.f2760e) && Arrays.equals(this.f2761f, c0083a.f2761f) && Arrays.equals(this.f2762g, c0083a.f2762g) && Arrays.equals(this.f2763h, c0083a.f2763h);
    }

    public final int hashCode() {
        int i4 = ((this.f2756a * 31) + this.f2757b) * 31;
        int i5 = (int) 0;
        return (Arrays.hashCode(this.f2763h) + ((((((Arrays.hashCode(this.f2761f) + ((Arrays.hashCode(this.f2760e) + ((Arrays.hashCode(this.f2759d) + ((i4 + i5) * 31)) * 31)) * 31)) * 31) + i5) * 961) + Arrays.hashCode(this.f2762g)) * 31)) * 31;
    }
}
