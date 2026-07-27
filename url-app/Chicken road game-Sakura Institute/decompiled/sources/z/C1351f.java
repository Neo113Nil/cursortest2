package z;

import A.AbstractC0017m;
import A0.C0036g;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1351f {

    /* renamed from: a, reason: collision with root package name */
    public final C0036g f11740a;

    /* renamed from: b, reason: collision with root package name */
    public C0036g f11741b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11742c = false;

    /* renamed from: d, reason: collision with root package name */
    public C1349d f11743d = null;

    public C1351f(C0036g c0036g, C0036g c0036g2) {
        this.f11740a = c0036g;
        this.f11741b = c0036g2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1351f)) {
            return false;
        }
        C1351f c1351f = (C1351f) obj;
        return Intrinsics.a(this.f11740a, c1351f.f11740a) && Intrinsics.a(this.f11741b, c1351f.f11741b) && this.f11742c == c1351f.f11742c && Intrinsics.a(this.f11743d, c1351f.f11743d);
    }

    public final int hashCode() {
        int d4 = AbstractC0017m.d((this.f11741b.hashCode() + (this.f11740a.hashCode() * 31)) * 31, 31, this.f11742c);
        C1349d c1349d = this.f11743d;
        return d4 + (c1349d == null ? 0 : c1349d.hashCode());
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.f11740a) + ", substitution=" + ((Object) this.f11741b) + ", isShowingSubstitution=" + this.f11742c + ", layoutCache=" + this.f11743d + ')';
    }
}
