package androidx.compose.ui.graphics;

import defpackage.aw;
import defpackage.cm1;
import defpackage.fk2;
import defpackage.gl2;
import defpackage.in1;
import defpackage.ks1;
import defpackage.o70;
import defpackage.q13;
import defpackage.q40;
import defpackage.s03;
import defpackage.s72;
import defpackage.ul1;
import defpackage.wy2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class GraphicsLayerElement extends cm1 {
    public final float a;
    public final float b;
    public final long c;
    public final fk2 d;
    public final boolean e;
    public final long f;
    public final long g;

    public GraphicsLayerElement(float f, float f2, long j, fk2 fk2Var, boolean z, long j2, long j3) {
        this.a = f;
        this.b = f2;
        this.c = j;
        this.d = fk2Var;
        this.e = z;
        this.f = j2;
        this.g = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        return Float.compare(1.0f, 1.0f) == 0 && Float.compare(1.0f, 1.0f) == 0 && Float.compare(this.a, graphicsLayerElement.a) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.b, graphicsLayerElement.b) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(8.0f, 8.0f) == 0 && wy2.a(this.c, graphicsLayerElement.c) && Intrinsics.b(this.d, graphicsLayerElement.d) && this.e == graphicsLayerElement.e && aw.c(this.f, graphicsLayerElement.f) && aw.c(this.g, graphicsLayerElement.g);
    }

    public final int hashCode() {
        int d = q40.d(8.0f, q40.d(0.0f, q40.d(0.0f, q40.d(0.0f, q40.d(this.b, q40.d(0.0f, q40.d(0.0f, q40.d(this.a, q40.d(1.0f, Float.hashCode(1.0f) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i = wy2.c;
        int i2 = in1.i((this.d.hashCode() + in1.h(d, 31, this.c)) * 31, 961, this.e);
        int i3 = aw.h;
        q13.a aVar = q13.m;
        return q40.e(3, q40.e(0, in1.h(in1.h(i2, 31, this.f), 31, this.g), 31), 31);
    }

    @Override // defpackage.cm1
    public final ul1 i() {
        gl2 gl2Var = new gl2();
        gl2Var.A = 1.0f;
        gl2Var.B = 1.0f;
        gl2Var.C = this.a;
        gl2Var.D = this.b;
        gl2Var.E = 8.0f;
        gl2Var.F = this.c;
        gl2Var.G = this.d;
        gl2Var.H = this.e;
        gl2Var.I = this.f;
        gl2Var.J = this.g;
        gl2Var.K = 3;
        gl2Var.L = new s72(8, gl2Var);
        return gl2Var;
    }

    @Override // defpackage.cm1
    public final void m(ul1 ul1Var) {
        gl2 gl2Var = (gl2) ul1Var;
        gl2Var.A = 1.0f;
        gl2Var.B = 1.0f;
        gl2Var.C = this.a;
        gl2Var.D = this.b;
        gl2Var.E = 8.0f;
        gl2Var.F = this.c;
        gl2Var.G = this.d;
        gl2Var.H = this.e;
        gl2Var.I = this.f;
        gl2Var.J = this.g;
        gl2Var.K = 3;
        ks1 ks1Var = s03.H(gl2Var, 2).B;
        if (ks1Var != null) {
            ks1Var.p1(gl2Var.L, true);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=1.0, scaleY=1.0, alpha=");
        sb.append(this.a);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.b);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=8.0, transformOrigin=");
        sb.append((Object) wy2.b(this.c));
        sb.append(", shape=");
        sb.append(this.d);
        sb.append(", clip=");
        sb.append(this.e);
        sb.append(", renderEffect=null, ambientShadowColor=");
        in1.o(this.f, sb, ", spotShadowColor=");
        sb.append((Object) aw.i(this.g));
        sb.append(", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb.append((Object) o70.O(3));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }
}
