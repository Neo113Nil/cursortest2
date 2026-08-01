package te;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class l0 implements re.e {

    /* renamed from: a, reason: collision with root package name */
    public final re.e f9400a;

    public l0(re.e eVar) {
        this.f9400a = eVar;
    }

    @Override // re.e
    public final i7.a b() {
        return re.h.f8254h;
    }

    @Override // re.e
    public final int c() {
        return 1;
    }

    @Override // re.e
    public final String d(int i3) {
        return String.valueOf(i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return Intrinsics.a(this.f9400a, l0Var.f9400a) && Intrinsics.a(a(), l0Var.a());
    }

    @Override // re.e
    public final re.e h(int i3) {
        if (i3 >= 0) {
            return this.f9400a;
        }
        kotlin.collections.i0.i(n0.l.i(i3, "Illegal index ", ", "), a(), " expects only non-negative indices");
        return null;
    }

    public final int hashCode() {
        return a().hashCode() + (this.f9400a.hashCode() * 31);
    }

    @Override // re.e
    public final boolean i(int i3) {
        if (i3 >= 0) {
            return false;
        }
        kotlin.collections.i0.i(n0.l.i(i3, "Illegal index ", ", "), a(), " expects only non-negative indices");
        return false;
    }

    public final String toString() {
        return a() + '(' + this.f9400a + ')';
    }
}
