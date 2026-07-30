package androidx.compose.foundation.layout;

import a0.m;
import m2.e;
import q.o0;
import r1.s0;
import s0.n;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
final class SizeElement extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f627a;

    /* renamed from: b, reason: collision with root package name */
    public final float f628b;

    /* renamed from: c, reason: collision with root package name */
    public final float f629c;

    /* renamed from: d, reason: collision with root package name */
    public final float f630d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f631e;

    public SizeElement(float f9, float f10, float f11, float f12, boolean z8) {
        this.f627a = f9;
        this.f628b = f10;
        this.f629c = f11;
        this.f630d = f12;
        this.f631e = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return e.a(this.f627a, sizeElement.f627a) && e.a(this.f628b, sizeElement.f628b) && e.a(this.f629c, sizeElement.f629c) && e.a(this.f630d, sizeElement.f630d) && this.f631e == sizeElement.f631e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f631e) + m.a(this.f630d, m.a(this.f629c, m.a(this.f628b, Float.hashCode(this.f627a) * 31, 31), 31), 31);
    }

    @Override // r1.s0
    public final n l() {
        o0 o0Var = new o0();
        o0Var.f7320s = this.f627a;
        o0Var.f7321t = this.f628b;
        o0Var.f7322u = this.f629c;
        o0Var.f7323v = this.f630d;
        o0Var.f7324w = this.f631e;
        return o0Var;
    }

    @Override // r1.s0
    public final void m(n nVar) {
        o0 o0Var = (o0) nVar;
        o0Var.f7320s = this.f627a;
        o0Var.f7321t = this.f628b;
        o0Var.f7322u = this.f629c;
        o0Var.f7323v = this.f630d;
        o0Var.f7324w = this.f631e;
    }

    public /* synthetic */ SizeElement(float f9, float f10, float f11, float f12, int i7) {
        this((i7 & 1) != 0 ? Float.NaN : f9, (i7 & 2) != 0 ? Float.NaN : f10, (i7 & 4) != 0 ? Float.NaN : f11, (i7 & 8) != 0 ? Float.NaN : f12, true);
    }
}
