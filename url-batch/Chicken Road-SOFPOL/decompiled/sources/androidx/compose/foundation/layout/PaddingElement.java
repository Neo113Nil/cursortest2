package androidx.compose.foundation.layout;

import a0.q;
import r2.f;
import w1.x0;
import x.e0;
import y0.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
final class PaddingElement extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f490a;

    /* renamed from: b, reason: collision with root package name */
    public final float f491b;

    /* renamed from: c, reason: collision with root package name */
    public final float f492c;

    /* renamed from: d, reason: collision with root package name */
    public final float f493d;

    public PaddingElement(float f6, float f8, float f9, float f10) {
        this.f490a = f6;
        this.f491b = f8;
        this.f492c = f9;
        this.f493d = f10;
        boolean z3 = true;
        boolean z7 = (f6 >= 0.0f || Float.isNaN(f6)) & (f8 >= 0.0f || Float.isNaN(f8)) & (f9 >= 0.0f || Float.isNaN(f9));
        if (f10 < 0.0f && !Float.isNaN(f10)) {
            z3 = false;
        }
        if (!z7 || !z3) {
            y.a.a("Padding must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && f.a(this.f490a, paddingElement.f490a) && f.a(this.f491b, paddingElement.f491b) && f.a(this.f492c, paddingElement.f492c) && f.a(this.f493d, paddingElement.f493d);
    }

    @Override // w1.x0
    public final l f() {
        e0 e0Var = new e0();
        e0Var.f8208r = this.f490a;
        e0Var.f8209s = this.f491b;
        e0Var.f8210t = this.f492c;
        e0Var.f8211u = this.f493d;
        e0Var.f8212v = true;
        return e0Var;
    }

    @Override // w1.x0
    public final void g(l lVar) {
        e0 e0Var = (e0) lVar;
        e0Var.f8208r = this.f490a;
        e0Var.f8209s = this.f491b;
        e0Var.f8210t = this.f492c;
        e0Var.f8211u = this.f493d;
        e0Var.f8212v = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + q.a(this.f493d, q.a(this.f492c, q.a(this.f491b, Float.hashCode(this.f490a) * 31, 31), 31), 31);
    }
}
