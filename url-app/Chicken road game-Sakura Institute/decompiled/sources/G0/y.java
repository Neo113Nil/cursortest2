package G0;

import A.AbstractC0017m;
import A0.C0036g;
import A0.K;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final C0036g f3093a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3094b;

    /* renamed from: c, reason: collision with root package name */
    public final K f3095c;

    static {
        y.t tVar = P.o.f3675a;
    }

    public y(C0036g c0036g, long j4, K k4) {
        K k5;
        this.f3093a = c0036g;
        this.f3094b = M1.a.r(j4, c0036g.f328a.length());
        if (k4 != null) {
            k5 = new K(M1.a.r(k4.f301a, c0036g.f328a.length()));
        } else {
            k5 = null;
        }
        this.f3095c = k5;
    }

    public static y a(y yVar, C0036g c0036g, long j4, int i2) {
        if ((i2 & 1) != 0) {
            c0036g = yVar.f3093a;
        }
        if ((i2 & 2) != 0) {
            j4 = yVar.f3094b;
        }
        K k4 = (i2 & 4) != 0 ? yVar.f3095c : null;
        yVar.getClass();
        return new y(c0036g, j4, k4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return K.a(this.f3094b, yVar.f3094b) && Intrinsics.a(this.f3095c, yVar.f3095c) && Intrinsics.a(this.f3093a, yVar.f3093a);
    }

    public final int hashCode() {
        int hashCode = this.f3093a.hashCode() * 31;
        int i2 = K.f300c;
        int c4 = AbstractC0017m.c(hashCode, 31, this.f3094b);
        K k4 = this.f3095c;
        return c4 + (k4 != null ? Long.hashCode(k4.f301a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f3093a) + "', selection=" + ((Object) K.g(this.f3094b)) + ", composition=" + this.f3095c + ')';
    }

    public y(int i2, long j4, String str) {
        this(new C0036g((i2 & 1) != 0 ? "" : str, null, 6), (i2 & 2) != 0 ? K.f299b : j4, (K) null);
    }
}
