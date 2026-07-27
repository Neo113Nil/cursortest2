package androidx.compose.foundation;

import A.AbstractC0017m;
import A.g0;
import S.n;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m.Z;
import m.a0;
import m.k0;
import r0.AbstractC1065f;
import r0.T;
import y0.t;

@Metadata
/* loaded from: classes.dex */
public final class MagnifierElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f5020a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f5021b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f5022c;

    /* renamed from: d, reason: collision with root package name */
    public final float f5023d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5024e;

    /* renamed from: f, reason: collision with root package name */
    public final long f5025f;

    /* renamed from: g, reason: collision with root package name */
    public final float f5026g;

    /* renamed from: h, reason: collision with root package name */
    public final float f5027h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f5028i;

    /* renamed from: j, reason: collision with root package name */
    public final k0 f5029j;

    public MagnifierElement(g0 g0Var, Function1 function1, Function1 function12, float f4, boolean z4, long j4, float f5, float f6, boolean z5, k0 k0Var) {
        this.f5020a = g0Var;
        this.f5021b = function1;
        this.f5022c = function12;
        this.f5023d = f4;
        this.f5024e = z4;
        this.f5025f = j4;
        this.f5026g = f5;
        this.f5027h = f6;
        this.f5028i = z5;
        this.f5029j = k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MagnifierElement)) {
            return false;
        }
        MagnifierElement magnifierElement = (MagnifierElement) obj;
        return this.f5020a == magnifierElement.f5020a && this.f5021b == magnifierElement.f5021b && this.f5023d == magnifierElement.f5023d && this.f5024e == magnifierElement.f5024e && this.f5025f == magnifierElement.f5025f && M0.e.a(this.f5026g, magnifierElement.f5026g) && M0.e.a(this.f5027h, magnifierElement.f5027h) && this.f5028i == magnifierElement.f5028i && this.f5022c == magnifierElement.f5022c && this.f5029j.equals(magnifierElement.f5029j);
    }

    public final int hashCode() {
        int hashCode = this.f5020a.hashCode() * 31;
        Function1 function1 = this.f5021b;
        int d4 = AbstractC0017m.d(AbstractC0017m.a(this.f5027h, AbstractC0017m.a(this.f5026g, AbstractC0017m.c(AbstractC0017m.d(AbstractC0017m.a(this.f5023d, (hashCode + (function1 != null ? function1.hashCode() : 0)) * 31, 31), 31, this.f5024e), 31, this.f5025f), 31), 31), 31, this.f5028i);
        Function1 function12 = this.f5022c;
        return this.f5029j.hashCode() + ((d4 + (function12 != null ? function12.hashCode() : 0)) * 31);
    }

    @Override // r0.T
    public final n l() {
        k0 k0Var = this.f5029j;
        return new Z(this.f5020a, this.f5021b, this.f5022c, this.f5023d, this.f5024e, this.f5025f, this.f5026g, this.f5027h, this.f5028i, k0Var);
    }

    @Override // r0.T
    public final void m(n nVar) {
        Z z4 = (Z) nVar;
        float f4 = z4.f8068w;
        long j4 = z4.f8070y;
        float f5 = z4.f8071z;
        boolean z5 = z4.f8069x;
        float f6 = z4.f8055A;
        boolean z6 = z4.B;
        k0 k0Var = z4.f8056C;
        View view = z4.f8057D;
        M0.b bVar = z4.f8058E;
        z4.f8065t = this.f5020a;
        z4.f8066u = this.f5021b;
        float f7 = this.f5023d;
        z4.f8068w = f7;
        boolean z7 = this.f5024e;
        z4.f8069x = z7;
        long j5 = this.f5025f;
        z4.f8070y = j5;
        float f8 = this.f5026g;
        z4.f8071z = f8;
        float f9 = this.f5027h;
        z4.f8055A = f9;
        boolean z8 = this.f5028i;
        z4.B = z8;
        z4.f8067v = this.f5022c;
        k0 k0Var2 = this.f5029j;
        z4.f8056C = k0Var2;
        View x2 = AbstractC1065f.x(z4);
        M0.b bVar2 = AbstractC1065f.v(z4).f9610w;
        if (z4.f8059F != null) {
            t tVar = a0.f8075a;
            if (((!Float.isNaN(f7) || !Float.isNaN(f4)) && f7 != f4 && !k0Var2.a()) || j5 != j4 || !M0.e.a(f8, f5) || !M0.e.a(f9, f6) || z7 != z5 || z8 != z6 || !k0Var2.equals(k0Var) || !x2.equals(view) || !Intrinsics.a(bVar2, bVar)) {
                z4.C0();
            }
        }
        z4.D0();
    }
}
