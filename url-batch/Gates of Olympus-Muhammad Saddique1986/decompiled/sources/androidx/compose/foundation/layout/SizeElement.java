package androidx.compose.foundation.layout;

import A.k;
import O0.e;
import U.p;
import r.T;
import t0.U;

/* loaded from: classes.dex */
final class SizeElement extends U {

    /* renamed from: a, reason: collision with root package name */
    public final float f4816a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4817b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4818c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4819d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4820e;

    public SizeElement(float f3, float f4, float f5, float f6, boolean z3) {
        this.f4816a = f3;
        this.f4817b = f4;
        this.f4818c = f5;
        this.f4819d = f6;
        this.f4820e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return e.a(this.f4816a, sizeElement.f4816a) && e.a(this.f4817b, sizeElement.f4817b) && e.a(this.f4818c, sizeElement.f4818c) && e.a(this.f4819d, sizeElement.f4819d) && this.f4820e == sizeElement.f4820e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4820e) + k.a(this.f4819d, k.a(this.f4818c, k.a(this.f4817b, Float.hashCode(this.f4816a) * 31, 31), 31), 31);
    }

    @Override // t0.U
    public final p l() {
        T t3 = new T();
        t3.f7991q = this.f4816a;
        t3.f7992r = this.f4817b;
        t3.f7993s = this.f4818c;
        t3.f7994t = this.f4819d;
        t3.f7995u = this.f4820e;
        return t3;
    }

    @Override // t0.U
    public final void m(p pVar) {
        T t3 = (T) pVar;
        t3.f7991q = this.f4816a;
        t3.f7992r = this.f4817b;
        t3.f7993s = this.f4818c;
        t3.f7994t = this.f4819d;
        t3.f7995u = this.f4820e;
    }

    public /* synthetic */ SizeElement(float f3, float f4, float f5, float f6, int i3) {
        this((i3 & 1) != 0 ? Float.NaN : f3, (i3 & 2) != 0 ? Float.NaN : f4, (i3 & 4) != 0 ? Float.NaN : f5, (i3 & 8) != 0 ? Float.NaN : f6, true);
    }
}
