package androidx.compose.ui.draw;

import A.AbstractC0017m;
import A.g0;
import M0.e;
import S.n;
import Z.C0318o;
import Z.C0323u;
import Z.P;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n.k;
import r0.AbstractC1065f;
import r0.T;
import r0.a0;
import y2.y;

@Metadata
/* loaded from: classes.dex */
public final class ShadowGraphicsLayerElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final P f5166a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5167b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5168c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5169d;

    public ShadowGraphicsLayerElement(P p4, boolean z4, long j4, long j5) {
        float f4 = k.f8524a;
        this.f5166a = p4;
        this.f5167b = z4;
        this.f5168c = j4;
        this.f5169d = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        shadowGraphicsLayerElement.getClass();
        float f4 = k.f8527d;
        return e.a(f4, f4) && Intrinsics.a(this.f5166a, shadowGraphicsLayerElement.f5166a) && this.f5167b == shadowGraphicsLayerElement.f5167b && C0323u.c(this.f5168c, shadowGraphicsLayerElement.f5168c) && C0323u.c(this.f5169d, shadowGraphicsLayerElement.f5169d);
    }

    public final int hashCode() {
        int d4 = AbstractC0017m.d((this.f5166a.hashCode() + (Float.hashCode(k.f8527d) * 31)) * 31, 31, this.f5167b);
        int i2 = C0323u.f4548h;
        y.a aVar = y.f11688e;
        return Long.hashCode(this.f5169d) + AbstractC0017m.c(d4, 31, this.f5168c);
    }

    @Override // r0.T
    public final n l() {
        return new C0318o(new g0(9, this));
    }

    @Override // r0.T
    public final void m(n nVar) {
        C0318o c0318o = (C0318o) nVar;
        c0318o.f4538t = new g0(9, this);
        a0 a0Var = AbstractC1065f.t(c0318o, 2).f9763s;
        if (a0Var != null) {
            a0Var.j1(c0318o.f4538t, true);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append((Object) e.c(k.f8527d));
        sb.append(", shape=");
        sb.append(this.f5166a);
        sb.append(", clip=");
        sb.append(this.f5167b);
        sb.append(", ambientColor=");
        AbstractC0017m.s(this.f5168c, sb, ", spotColor=");
        sb.append((Object) C0323u.i(this.f5169d));
        sb.append(')');
        return sb.toString();
    }
}
