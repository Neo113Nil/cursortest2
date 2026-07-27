package P0;

import A.AbstractC0017m;
import G.C0235z;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final int f3699a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3700b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3701c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3702d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3703e;

    public F(boolean z4, boolean z5, boolean z6, int i2, boolean z7, boolean z8) {
        C0235z c0235z = o.f3753a;
        int i4 = !z4 ? 262152 : 262144;
        i4 = i2 == 2 ? i4 | 8192 : i4;
        i4 = z8 ? i4 : i4 | 512;
        boolean z9 = i2 == 1;
        this.f3699a = i4;
        this.f3700b = z9;
        this.f3701c = z5;
        this.f3702d = z6;
        this.f3703e = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f4 = (F) obj;
        return this.f3699a == f4.f3699a && this.f3700b == f4.f3700b && this.f3701c == f4.f3701c && this.f3702d == f4.f3702d && this.f3703e == f4.f3703e;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + AbstractC0017m.d(AbstractC0017m.d(AbstractC0017m.d(AbstractC0017m.d(this.f3699a * 31, 31, this.f3700b), 31, this.f3701c), 31, this.f3702d), 31, this.f3703e);
    }
}
