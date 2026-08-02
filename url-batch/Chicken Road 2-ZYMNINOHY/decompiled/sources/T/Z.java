package T;

import a.AbstractC0124a;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    public final int f2751a;

    /* renamed from: b, reason: collision with root package name */
    public final U f2752b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2753c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f2754d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f2755e;

    static {
        W.J.G(0);
        W.J.G(1);
        W.J.G(3);
        W.J.G(4);
    }

    public Z(U u4, boolean z, int[] iArr, boolean[] zArr) {
        int i4 = u4.f2705a;
        this.f2751a = i4;
        boolean z4 = false;
        AbstractC0124a.h(i4 == iArr.length && i4 == zArr.length);
        this.f2752b = u4;
        if (z && i4 > 1) {
            z4 = true;
        }
        this.f2753c = z4;
        this.f2754d = (int[]) iArr.clone();
        this.f2755e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Z.class == obj.getClass()) {
            Z z = (Z) obj;
            if (this.f2753c == z.f2753c && this.f2752b.equals(z.f2752b) && Arrays.equals(this.f2754d, z.f2754d) && Arrays.equals(this.f2755e, z.f2755e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f2755e) + ((Arrays.hashCode(this.f2754d) + (((this.f2752b.hashCode() * 31) + (this.f2753c ? 1 : 0)) * 31)) * 31);
    }
}
