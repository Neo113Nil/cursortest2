package androidx.compose.foundation.layout;

import H2.AbstractC0080b;
import M0.e;
import U.k;
import r.P;
import t0.T;

/* loaded from: classes.dex */
final class SizeElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final float f3637a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3638b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3639c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3640d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3641e;

    public SizeElement(float f3, float f4, float f5, float f6) {
        this.f3637a = f3;
        this.f3638b = f4;
        this.f3639c = f5;
        this.f3640d = f6;
        this.f3641e = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return e.a(this.f3637a, sizeElement.f3637a) && e.a(this.f3638b, sizeElement.f3638b) && e.a(this.f3639c, sizeElement.f3639c) && e.a(this.f3640d, sizeElement.f3640d) && this.f3641e == sizeElement.f3641e;
    }

    @Override // t0.T
    public final k h() {
        P p = new P();
        p.f7017q = this.f3637a;
        p.f7018r = this.f3638b;
        p.f7019s = this.f3639c;
        p.f7020t = this.f3640d;
        p.f7021u = this.f3641e;
        return p;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3641e) + AbstractC0080b.a(this.f3640d, AbstractC0080b.a(this.f3639c, AbstractC0080b.a(this.f3638b, Float.hashCode(this.f3637a) * 31, 31), 31), 31);
    }

    @Override // t0.T
    public final void i(k kVar) {
        P p = (P) kVar;
        p.f7017q = this.f3637a;
        p.f7018r = this.f3638b;
        p.f7019s = this.f3639c;
        p.f7020t = this.f3640d;
        p.f7021u = this.f3641e;
    }

    public /* synthetic */ SizeElement(float f3, float f4, float f5, float f6, int i3) {
        this((i3 & 1) != 0 ? Float.NaN : f3, (i3 & 2) != 0 ? Float.NaN : f4, (i3 & 4) != 0 ? Float.NaN : f5, (i3 & 8) != 0 ? Float.NaN : f6);
    }
}
