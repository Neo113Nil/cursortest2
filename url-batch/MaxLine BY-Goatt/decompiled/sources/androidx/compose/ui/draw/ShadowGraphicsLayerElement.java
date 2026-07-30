package androidx.compose.ui.draw;

import defpackage.aw;
import defpackage.cm1;
import defpackage.fk2;
import defpackage.in1;
import defpackage.ks1;
import defpackage.oo;
import defpackage.pc0;
import defpackage.q13;
import defpackage.s03;
import defpackage.s72;
import defpackage.ul1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ShadowGraphicsLayerElement extends cm1 {
    public final fk2 a;
    public final boolean b;
    public final long c;
    public final long d;

    public ShadowGraphicsLayerElement(fk2 fk2Var, boolean z, long j, long j2) {
        this.a = fk2Var;
        this.b = z;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        return pc0.a(3.0f, 3.0f) && Intrinsics.b(this.a, shadowGraphicsLayerElement.a) && this.b == shadowGraphicsLayerElement.b && aw.c(this.c, shadowGraphicsLayerElement.c) && aw.c(this.d, shadowGraphicsLayerElement.d);
    }

    public final int hashCode() {
        int i = in1.i((this.a.hashCode() + (Float.hashCode(3.0f) * 31)) * 31, 31, this.b);
        int i2 = aw.h;
        q13.a aVar = q13.m;
        return Long.hashCode(this.d) + in1.h(i, 31, this.c);
    }

    @Override // defpackage.cm1
    public final ul1 i() {
        return new oo(new s72(7, this));
    }

    @Override // defpackage.cm1
    public final void m(ul1 ul1Var) {
        oo ooVar = (oo) ul1Var;
        ooVar.A = new s72(7, this);
        ks1 ks1Var = s03.H(ooVar, 2).B;
        if (ks1Var != null) {
            ks1Var.p1(ooVar.A, true);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append((Object) pc0.b(3.0f));
        sb.append(", shape=");
        sb.append(this.a);
        sb.append(", clip=");
        sb.append(this.b);
        sb.append(", ambientColor=");
        in1.o(this.c, sb, ", spotColor=");
        sb.append((Object) aw.i(this.d));
        sb.append(')');
        return sb.toString();
    }
}
