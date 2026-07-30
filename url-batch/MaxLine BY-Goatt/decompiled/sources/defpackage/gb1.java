package defpackage;

import androidx.compose.foundation.lazy.layout.a;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gb1 extends ul1 implements xd0 {
    public a A;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gb1) && Intrinsics.b(this.A, ((gb1) obj).A);
    }

    @Override // defpackage.xd0
    public final void g(k91 k91Var) {
        ArrayList arrayList = this.A.h;
        if (arrayList.size() <= 0) {
            k91Var.a();
        } else {
            q40.t(arrayList.get(0));
            throw null;
        }
    }

    public final int hashCode() {
        return this.A.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.A + ')';
    }

    @Override // defpackage.ul1
    public final void y0() {
        this.A.getClass();
    }

    @Override // defpackage.ul1
    public final void z0() {
        this.A.c();
    }
}
