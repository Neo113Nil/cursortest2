package T;

import E.AbstractC0005f;
import W.AbstractC0108a;
import a.AbstractC0124a;
import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public final int f2705a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2706b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2707c;

    /* renamed from: d, reason: collision with root package name */
    public final C0097o[] f2708d;

    /* renamed from: e, reason: collision with root package name */
    public int f2709e;

    static {
        W.J.G(0);
        W.J.G(1);
    }

    public U(String str, C0097o... c0097oArr) {
        AbstractC0124a.h(c0097oArr.length > 0);
        this.f2706b = str;
        this.f2708d = c0097oArr;
        this.f2705a = c0097oArr.length;
        String str2 = c0097oArr[0].n;
        this.f2707c = TextUtils.isEmpty(str2) ? F.h(c0097oArr[0].f2868m) : F.h(str2);
        String str3 = c0097oArr[0].f2859d;
        str3 = (str3 == null || str3.equals("und")) ? "" : str3;
        int i4 = c0097oArr[0].f2861f | 16384;
        for (int i5 = 1; i5 < c0097oArr.length; i5++) {
            String str4 = c0097oArr[i5].f2859d;
            if (!str3.equals((str4 == null || str4.equals("und")) ? "" : str4)) {
                b("languages", c0097oArr[0].f2859d, c0097oArr[i5].f2859d, i5);
                return;
            } else {
                if (i4 != (c0097oArr[i5].f2861f | 16384)) {
                    b("role flags", Integer.toBinaryString(c0097oArr[0].f2861f), Integer.toBinaryString(c0097oArr[i5].f2861f), i5);
                    return;
                }
            }
        }
    }

    public static void b(String str, String str2, String str3, int i4) {
        AbstractC0108a.f("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i4 + ")"));
    }

    public final int a(C0097o c0097o) {
        int i4 = 0;
        while (true) {
            C0097o[] c0097oArr = this.f2708d;
            if (i4 >= c0097oArr.length) {
                return -1;
            }
            if (c0097o == c0097oArr[i4]) {
                return i4;
            }
            i4++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && U.class == obj.getClass()) {
            U u4 = (U) obj;
            if (this.f2706b.equals(u4.f2706b) && Arrays.equals(this.f2708d, u4.f2708d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f2709e == 0) {
            this.f2709e = Arrays.hashCode(this.f2708d) + AbstractC0005f.f(527, 31, this.f2706b);
        }
        return this.f2709e;
    }

    public final String toString() {
        return this.f2706b + ": " + Arrays.toString(this.f2708d);
    }
}
