package a8;

import q7.C4946o;

/* loaded from: classes2.dex */
public final class Z implements X7.a {

    /* renamed from: a, reason: collision with root package name */
    public static final Z f4461a = new Z();

    /* renamed from: b, reason: collision with root package name */
    public static final C0454v f4462b = I.a("kotlin.UInt", C0458z.f4522a);

    @Override // X7.a
    public final void a(c8.r rVar, Object obj) {
        rVar.h(f4462b).j(((C4946o) obj).f40176n);
    }

    @Override // X7.a
    public final Object b(Z7.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        return new C4946o(decoder.q(f4462b).h());
    }

    @Override // X7.a
    public final Y7.e c() {
        return f4462b;
    }
}
