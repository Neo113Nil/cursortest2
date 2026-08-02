package T;

import java.util.Arrays;

/* renamed from: T.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0085c {

    /* renamed from: c, reason: collision with root package name */
    public static final C0085c f2767c = new C0085c(new C0083a[0]);

    /* renamed from: d, reason: collision with root package name */
    public static final C0083a f2768d;

    /* renamed from: a, reason: collision with root package name */
    public final int f2769a;

    /* renamed from: b, reason: collision with root package name */
    public final C0083a[] f2770b;

    static {
        C0083a c0083a = new C0083a(-1, -1, new int[0], new C0107z[0], new long[0], new String[0], new AbstractC0084b[0]);
        int[] iArr = c0083a.f2760e;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = c0083a.f2761f;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        C0107z[] c0107zArr = (C0107z[]) Arrays.copyOf(c0083a.f2759d, 0);
        String[] strArr = (String[]) Arrays.copyOf(c0083a.f2762g, 0);
        AbstractC0084b[] abstractC0084bArr = c0083a.f2763h;
        f2768d = new C0083a(0, c0083a.f2757b, copyOf, c0107zArr, copyOf2, strArr, (AbstractC0084b[]) Arrays.copyOf(abstractC0084bArr, Math.max(0, abstractC0084bArr.length)));
        W.J.G(1);
        W.J.G(2);
        W.J.G(3);
        W.J.G(4);
    }

    public C0085c(C0083a[] c0083aArr) {
        this.f2769a = c0083aArr.length;
        this.f2770b = c0083aArr;
    }

    public final C0083a a(int i4) {
        return i4 < 0 ? f2768d : this.f2770b[i4];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0085c.class != obj.getClass()) {
            return false;
        }
        C0085c c0085c = (C0085c) obj;
        return this.f2769a == c0085c.f2769a && Arrays.equals(this.f2770b, c0085c.f2770b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f2770b) + (((((this.f2769a * 961) + ((int) 0)) * 31) + ((int) (-9223372036854775807L))) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i4 = 0;
        while (true) {
            C0083a[] c0083aArr = this.f2770b;
            if (i4 >= c0083aArr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=0, ads=[");
            c0083aArr[i4].getClass();
            for (int i5 = 0; i5 < c0083aArr[i4].f2760e.length; i5++) {
                sb.append("ad(state=");
                int i6 = c0083aArr[i4].f2760e[i5];
                if (i6 == 0) {
                    sb.append('_');
                } else if (i6 == 1) {
                    sb.append('R');
                } else if (i6 == 2) {
                    sb.append('S');
                } else if (i6 == 3) {
                    sb.append('P');
                } else if (i6 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(c0083aArr[i4].f2761f[i5]);
                sb.append(')');
                if (i5 < c0083aArr[i4].f2760e.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i4 < c0083aArr.length - 1) {
                sb.append(", ");
            }
            i4++;
        }
    }
}
