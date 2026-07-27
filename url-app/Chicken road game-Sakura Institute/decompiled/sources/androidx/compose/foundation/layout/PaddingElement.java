package androidx.compose.foundation.layout;

import A.AbstractC0017m;
import M0.e;
import S.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import q.C1020Y;
import r0.T;

@Metadata
/* loaded from: classes.dex */
final class PaddingElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final float f5064a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5065b;

    /* renamed from: c, reason: collision with root package name */
    public final float f5066c;

    /* renamed from: d, reason: collision with root package name */
    public final float f5067d;

    public PaddingElement(float f4, float f5, float f6, float f7, Function1 function1) {
        this.f5064a = f4;
        this.f5065b = f5;
        this.f5066c = f6;
        this.f5067d = f7;
        if ((f4 < 0.0f && !e.a(f4, Float.NaN)) || ((f5 < 0.0f && !e.a(f5, Float.NaN)) || ((f6 < 0.0f && !e.a(f6, Float.NaN)) || (f7 < 0.0f && !e.a(f7, Float.NaN))))) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && e.a(this.f5064a, paddingElement.f5064a) && e.a(this.f5065b, paddingElement.f5065b) && e.a(this.f5066c, paddingElement.f5066c) && e.a(this.f5067d, paddingElement.f5067d);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + AbstractC0017m.a(this.f5067d, AbstractC0017m.a(this.f5066c, AbstractC0017m.a(this.f5065b, Float.hashCode(this.f5064a) * 31, 31), 31), 31);
    }

    @Override // r0.T
    public final n l() {
        C1020Y c1020y = new C1020Y();
        c1020y.f9225t = this.f5064a;
        c1020y.f9226u = this.f5065b;
        c1020y.f9227v = this.f5066c;
        c1020y.f9228w = this.f5067d;
        c1020y.f9229x = true;
        return c1020y;
    }

    @Override // r0.T
    public final void m(n nVar) {
        C1020Y c1020y = (C1020Y) nVar;
        c1020y.f9225t = this.f5064a;
        c1020y.f9226u = this.f5065b;
        c1020y.f9227v = this.f5066c;
        c1020y.f9228w = this.f5067d;
        c1020y.f9229x = true;
    }
}
