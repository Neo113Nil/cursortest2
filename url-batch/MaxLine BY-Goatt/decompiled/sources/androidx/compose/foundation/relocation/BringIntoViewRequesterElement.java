package androidx.compose.foundation.relocation;

import defpackage.cm1;
import defpackage.op;
import defpackage.pp;
import defpackage.ul1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class BringIntoViewRequesterElement extends cm1 {
    public final op a;

    public BringIntoViewRequesterElement(op opVar) {
        this.a = opVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BringIntoViewRequesterElement) {
            return Intrinsics.b(this.a, ((BringIntoViewRequesterElement) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.cm1
    public final ul1 i() {
        pp ppVar = new pp();
        ppVar.A = this.a;
        return ppVar;
    }

    @Override // defpackage.cm1
    public final void m(ul1 ul1Var) {
        pp ppVar = (pp) ul1Var;
        op opVar = ppVar.A;
        if (opVar != null) {
            opVar.a.k(ppVar);
        }
        op opVar2 = this.a;
        if (opVar2 != null) {
            opVar2.a.b(ppVar);
        }
        ppVar.A = opVar2;
    }
}
