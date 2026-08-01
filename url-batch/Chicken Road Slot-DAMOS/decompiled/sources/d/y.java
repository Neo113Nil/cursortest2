package d;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class y extends a.a {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f3271a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.u f3272b;

    public y(d0 d0Var, androidx.lifecycle.u uVar) {
        d0Var.getClass();
        this.f3271a = d0Var;
        this.f3272b = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Intrinsics.a(this.f3271a, yVar.f3271a) && Intrinsics.a(this.f3272b, yVar.f3272b);
    }

    public final int hashCode() {
        int hashCode = this.f3271a.hashCode() * 31;
        androidx.lifecycle.u uVar = this.f3272b;
        return hashCode + (uVar == null ? 0 : uVar.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.f3271a + ", owner=" + this.f3272b + ')';
    }
}
