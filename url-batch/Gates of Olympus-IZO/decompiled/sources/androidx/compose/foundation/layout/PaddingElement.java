package androidx.compose.foundation.layout;

import H2.AbstractC0080b;
import M0.e;
import U.k;
import r.C0795G;
import t0.T;

/* loaded from: classes.dex */
final class PaddingElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final float f3632a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3633b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3634c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3635d;

    public PaddingElement(float f3, float f4, float f5, float f6) {
        this.f3632a = f3;
        this.f3633b = f4;
        this.f3634c = f5;
        this.f3635d = f6;
        if ((f3 < 0.0f && !e.a(f3, Float.NaN)) || ((f4 < 0.0f && !e.a(f4, Float.NaN)) || ((f5 < 0.0f && !e.a(f5, Float.NaN)) || (f6 < 0.0f && !e.a(f6, Float.NaN))))) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && e.a(this.f3632a, paddingElement.f3632a) && e.a(this.f3633b, paddingElement.f3633b) && e.a(this.f3634c, paddingElement.f3634c) && e.a(this.f3635d, paddingElement.f3635d);
    }

    @Override // t0.T
    public final k h() {
        C0795G c0795g = new C0795G();
        c0795g.f7001q = this.f3632a;
        c0795g.f7002r = this.f3633b;
        c0795g.f7003s = this.f3634c;
        c0795g.f7004t = this.f3635d;
        c0795g.f7005u = true;
        return c0795g;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + AbstractC0080b.a(this.f3635d, AbstractC0080b.a(this.f3634c, AbstractC0080b.a(this.f3633b, Float.hashCode(this.f3632a) * 31, 31), 31), 31);
    }

    @Override // t0.T
    public final void i(k kVar) {
        C0795G c0795g = (C0795G) kVar;
        c0795g.f7001q = this.f3632a;
        c0795g.f7002r = this.f3633b;
        c0795g.f7003s = this.f3634c;
        c0795g.f7004t = this.f3635d;
        c0795g.f7005u = true;
    }
}
