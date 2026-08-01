package j0;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final d0.d f4781a;

    /* renamed from: b, reason: collision with root package name */
    public final d0.d f4782b;

    /* renamed from: c, reason: collision with root package name */
    public final d0.d f4783c;

    /* renamed from: d, reason: collision with root package name */
    public final d0.d f4784d;

    /* renamed from: e, reason: collision with root package name */
    public final d0.d f4785e;

    /* renamed from: f, reason: collision with root package name */
    public final d0.d f4786f;
    public final d0.d g;

    /* renamed from: h, reason: collision with root package name */
    public final d0.d f4787h;

    public a0() {
        d0.d dVar = z.f4902a;
        d0.d dVar2 = z.f4903b;
        d0.d dVar3 = z.f4904c;
        d0.d dVar4 = z.f4905d;
        d0.d dVar5 = z.f4907f;
        d0.d dVar6 = z.f4906e;
        d0.d dVar7 = z.g;
        d0.d dVar8 = z.f4908h;
        this.f4781a = dVar;
        this.f4782b = dVar2;
        this.f4783c = dVar3;
        this.f4784d = dVar4;
        this.f4785e = dVar5;
        this.f4786f = dVar6;
        this.g = dVar7;
        this.f4787h = dVar8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Intrinsics.a(this.f4781a, a0Var.f4781a) && Intrinsics.a(this.f4782b, a0Var.f4782b) && Intrinsics.a(this.f4783c, a0Var.f4783c) && Intrinsics.a(this.f4784d, a0Var.f4784d) && Intrinsics.a(this.f4785e, a0Var.f4785e) && Intrinsics.a(this.f4786f, a0Var.f4786f) && Intrinsics.a(this.g, a0Var.g) && Intrinsics.a(this.f4787h, a0Var.f4787h);
    }

    public final int hashCode() {
        return this.f4787h.hashCode() + ((this.g.hashCode() + ((this.f4786f.hashCode() + ((this.f4785e.hashCode() + ((this.f4784d.hashCode() + ((this.f4783c.hashCode() + ((this.f4782b.hashCode() + (this.f4781a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f4781a + ", small=" + this.f4782b + ", medium=" + this.f4783c + ", large=" + this.f4784d + ", largeIncreased=" + this.f4786f + ", extraLarge=" + this.f4785e + ", extralargeIncreased=" + this.g + ", extraExtraLarge=" + this.f4787h + ')';
    }
}
