package androidx.compose.foundation.layout;

import A.AbstractC0017m;
import M0.e;
import S.n;
import kotlin.Metadata;
import q.i0;
import r0.T;

@Metadata
/* loaded from: classes.dex */
final class SizeElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final float f5069a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5070b;

    /* renamed from: c, reason: collision with root package name */
    public final float f5071c;

    /* renamed from: d, reason: collision with root package name */
    public final float f5072d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5073e;

    public SizeElement(float f4, float f5, float f6, float f7, boolean z4) {
        this.f5069a = f4;
        this.f5070b = f5;
        this.f5071c = f6;
        this.f5072d = f7;
        this.f5073e = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return e.a(this.f5069a, sizeElement.f5069a) && e.a(this.f5070b, sizeElement.f5070b) && e.a(this.f5071c, sizeElement.f5071c) && e.a(this.f5072d, sizeElement.f5072d) && this.f5073e == sizeElement.f5073e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f5073e) + AbstractC0017m.a(this.f5072d, AbstractC0017m.a(this.f5071c, AbstractC0017m.a(this.f5070b, Float.hashCode(this.f5069a) * 31, 31), 31), 31);
    }

    @Override // r0.T
    public final n l() {
        i0 i0Var = new i0();
        i0Var.f9260t = this.f5069a;
        i0Var.f9261u = this.f5070b;
        i0Var.f9262v = this.f5071c;
        i0Var.f9263w = this.f5072d;
        i0Var.f9264x = this.f5073e;
        return i0Var;
    }

    @Override // r0.T
    public final void m(n nVar) {
        i0 i0Var = (i0) nVar;
        i0Var.f9260t = this.f5069a;
        i0Var.f9261u = this.f5070b;
        i0Var.f9262v = this.f5071c;
        i0Var.f9263w = this.f5072d;
        i0Var.f9264x = this.f5073e;
    }

    public /* synthetic */ SizeElement(float f4, float f5, float f6, float f7, int i2) {
        this((i2 & 1) != 0 ? Float.NaN : f4, (i2 & 2) != 0 ? Float.NaN : f5, (i2 & 4) != 0 ? Float.NaN : f6, (i2 & 8) != 0 ? Float.NaN : f7, true);
    }
}
