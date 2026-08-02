package m0;

import T.C0097o;
import v2.f0;

/* renamed from: m0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1298k {

    /* renamed from: a, reason: collision with root package name */
    public final int f14395a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14396b;

    /* renamed from: c, reason: collision with root package name */
    public final C0097o f14397c;

    /* renamed from: d, reason: collision with root package name */
    public final f0 f14398d;

    /* renamed from: e, reason: collision with root package name */
    public final String f14399e;

    public C1298k(C0097o c0097o, int i4, int i5, f0 f0Var, String str) {
        this.f14395a = i4;
        this.f14396b = i5;
        this.f14397c = c0097o;
        this.f14398d = f0.a(f0Var);
        this.f14399e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1298k.class == obj.getClass()) {
            C1298k c1298k = (C1298k) obj;
            if (this.f14395a == c1298k.f14395a && this.f14396b == c1298k.f14396b && this.f14397c.equals(c1298k.f14397c)) {
                f0 f0Var = c1298k.f14398d;
                f0 f0Var2 = this.f14398d;
                f0Var2.getClass();
                if (v2.r.f(f0Var2, f0Var) && this.f14399e.equals(c1298k.f14399e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f14399e.hashCode() + ((this.f14398d.hashCode() + ((this.f14397c.hashCode() + ((((217 + this.f14395a) * 31) + this.f14396b) * 31)) * 31)) * 31);
    }
}
