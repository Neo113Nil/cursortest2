package k1;

import c2.i1;
import c2.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lk1/u;", "Lc2/x0;", "Lk1/g0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class u extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f5346a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f5347b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5348c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5349d;

    public u(long j, f0 f0Var, long j3, long j10) {
        this.f5346a = j;
        this.f5347b = f0Var;
        this.f5348c = j3;
        this.f5349d = j10;
    }

    @Override // c2.x0
    public final d1.k d() {
        g0 g0Var = new g0();
        g0Var.C = 1.0f;
        g0Var.D = 1.0f;
        g0Var.E = 1.0f;
        g0Var.F = 8.0f;
        g0Var.G = this.f5346a;
        g0Var.H = this.f5347b;
        g0Var.I = true;
        g0Var.J = this.f5348c;
        g0Var.K = this.f5349d;
        g0Var.L = 3;
        g0Var.M = new a3.e(15, g0Var);
        return g0Var;
    }

    @Override // c2.x0
    public final void e(d1.k kVar) {
        i1 i1Var;
        g0 g0Var = (g0) kVar;
        g0Var.C = 1.0f;
        g0Var.D = 1.0f;
        g0Var.E = 1.0f;
        g0Var.F = 8.0f;
        g0Var.G = this.f5346a;
        g0Var.H = this.f5347b;
        g0Var.I = true;
        g0Var.J = this.f5348c;
        g0Var.K = this.f5349d;
        g0Var.L = 3;
        a3.e eVar = g0Var.M;
        if (g0Var.f3305d.B && (i1Var = c2.k.s(g0Var, 2).C) != null) {
            i1Var.Z0(eVar, true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Float.compare(1.0f, 1.0f) == 0 && Float.compare(1.0f, 1.0f) == 0 && Float.compare(1.0f, 1.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(8.0f, 8.0f) == 0 && i0.a(this.f5346a, uVar.f5346a) && Intrinsics.a(this.f5347b, uVar.f5347b) && p.c(this.f5348c, uVar.f5348c) && p.c(this.f5349d, uVar.f5349d);
    }

    public final int hashCode() {
        int b10 = n0.l.b(8.0f, n0.l.b(0.0f, n0.l.b(0.0f, n0.l.b(0.0f, n0.l.b(0.0f, n0.l.b(0.0f, n0.l.b(0.0f, n0.l.b(1.0f, n0.l.b(1.0f, Float.hashCode(1.0f) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i3 = i0.f5327c;
        int d10 = n0.l.d((this.f5347b.hashCode() + n0.l.c(b10, 31, this.f5346a)) * 31, 961, true);
        int i10 = p.f5341h;
        hd.z zVar = hd.a0.f4495e;
        return v4.a.x(3, v4.a.x(0, n0.l.c(n0.l.c(d10, 31, this.f5348c), 31, this.f5349d), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GraphicsLayerElement(scaleX=1.0, scaleY=1.0, alpha=1.0, translationX=0.0, translationY=0.0, shadowElevation=0.0, rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=8.0, transformOrigin=");
        sb2.append((Object) i0.b(this.f5346a));
        sb2.append(", shape=");
        sb2.append(this.f5347b);
        sb2.append(", clip=true, renderEffect=null, ambientShadowColor=");
        v4.a.t(this.f5348c, sb2, ", spotShadowColor=");
        sb2.append((Object) p.h(this.f5349d));
        sb2.append(", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb2.append((Object) v.u(3));
        sb2.append(", colorFilter=null)");
        return sb2.toString();
    }
}
