package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class le0 extends zl0 implements gu {
    public ne0 s;

    @Override // defpackage.gu
    public final void F(ld0 ld0Var) {
        ArrayList arrayList = (ArrayList) this.s.h;
        if (arrayList.size() <= 0) {
            ld0Var.a();
        } else {
            qy0.u(arrayList.get(0));
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof le0) && Intrinsics.a(this.s, ((le0) obj).s);
    }

    public final int hashCode() {
        return this.s.hashCode();
    }

    @Override // defpackage.zl0
    public final void r0() {
        this.s.getClass();
    }

    @Override // defpackage.zl0
    public final void s0() {
        ne0 ne0Var = this.s;
        ne0Var.d();
        ne0Var.b = null;
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.s + ')';
    }
}
