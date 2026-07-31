package androidx.compose.foundation.layout;

import A.k;
import O0.e;
import U.p;
import r.C0848J;
import t0.U;

/* loaded from: classes.dex */
final class PaddingElement extends U {

    /* renamed from: a, reason: collision with root package name */
    public final float f4811a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4812b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4813c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4814d;

    public PaddingElement(float f3, float f4, float f5, float f6) {
        this.f4811a = f3;
        this.f4812b = f4;
        this.f4813c = f5;
        this.f4814d = f6;
        if ((f3 < 0.0f && !e.a(f3, Float.NaN)) || ((f4 < 0.0f && !e.a(f4, Float.NaN)) || ((f5 < 0.0f && !e.a(f5, Float.NaN)) || (f6 < 0.0f && !e.a(f6, Float.NaN))))) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && e.a(this.f4811a, paddingElement.f4811a) && e.a(this.f4812b, paddingElement.f4812b) && e.a(this.f4813c, paddingElement.f4813c) && e.a(this.f4814d, paddingElement.f4814d);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + k.a(this.f4814d, k.a(this.f4813c, k.a(this.f4812b, Float.hashCode(this.f4811a) * 31, 31), 31), 31);
    }

    @Override // t0.U
    public final p l() {
        C0848J c0848j = new C0848J();
        c0848j.f7974q = this.f4811a;
        c0848j.f7975r = this.f4812b;
        c0848j.f7976s = this.f4813c;
        c0848j.f7977t = this.f4814d;
        c0848j.f7978u = true;
        return c0848j;
    }

    @Override // t0.U
    public final void m(p pVar) {
        C0848J c0848j = (C0848J) pVar;
        c0848j.f7974q = this.f4811a;
        c0848j.f7975r = this.f4812b;
        c0848j.f7976s = this.f4813c;
        c0848j.f7977t = this.f4814d;
        c0848j.f7978u = true;
    }
}
