package androidx.compose.foundation;

import defpackage.aw;
import defpackage.cm1;
import defpackage.cn;
import defpackage.cq;
import defpackage.fk2;
import defpackage.q13;
import defpackage.q40;
import defpackage.ul1;
import defpackage.xd1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class BackgroundElement extends cm1 {
    public final long a;
    public final cq b;
    public final float c;
    public final fk2 d;

    public BackgroundElement(long j, xd1 xd1Var, fk2 fk2Var, int i) {
        j = (i & 1) != 0 ? aw.g : j;
        xd1Var = (i & 2) != 0 ? null : xd1Var;
        this.a = j;
        this.b = xd1Var;
        this.c = 1.0f;
        this.d = fk2Var;
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && aw.c(this.a, backgroundElement.a) && Intrinsics.b(this.b, backgroundElement.b) && this.c == backgroundElement.c && Intrinsics.b(this.d, backgroundElement.d);
    }

    public final int hashCode() {
        int i = aw.h;
        q13.a aVar = q13.m;
        int hashCode = Long.hashCode(this.a) * 31;
        cq cqVar = this.b;
        return this.d.hashCode() + q40.d(this.c, (hashCode + (cqVar != null ? cqVar.hashCode() : 0)) * 31, 31);
    }

    @Override // defpackage.cm1
    public final ul1 i() {
        cn cnVar = new cn();
        cnVar.A = this.a;
        cnVar.B = this.b;
        cnVar.C = this.c;
        cnVar.D = this.d;
        cnVar.E = 9205357640488583168L;
        return cnVar;
    }

    @Override // defpackage.cm1
    public final void m(ul1 ul1Var) {
        cn cnVar = (cn) ul1Var;
        cnVar.A = this.a;
        cnVar.B = this.b;
        cnVar.C = this.c;
        cnVar.D = this.d;
    }
}
