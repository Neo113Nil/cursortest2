package v;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a1 implements p {

    /* renamed from: a, reason: collision with root package name */
    public final int f9731a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9732b;

    /* renamed from: c, reason: collision with root package name */
    public final n f9733c;

    public a1(int i3, int i10, n nVar) {
        this.f9731a = i3;
        this.f9732b = i10;
        this.f9733c = nVar;
    }

    @Override // v.f
    public final b1 a(c6.s sVar) {
        return new n0.c1(this.f9731a, this.f9732b, this.f9733c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a1) {
            a1 a1Var = (a1) obj;
            if (a1Var.f9731a == this.f9731a && a1Var.f9732b == this.f9732b && Intrinsics.a(a1Var.f9733c, this.f9733c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f9733c.hashCode() + (this.f9731a * 31)) * 31) + this.f9732b;
    }
}
