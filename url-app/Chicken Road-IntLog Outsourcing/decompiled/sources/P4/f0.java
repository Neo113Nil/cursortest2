package P4;

import f4.C0443t;

/* loaded from: classes.dex */
public final class f0 implements M4.a {

    /* renamed from: a, reason: collision with root package name */
    public static final f0 f2370a = new f0();

    /* renamed from: b, reason: collision with root package name */
    public static final C0142v f2371b = I.a("kotlin.UShort", S.f2342a);

    @Override // M4.a
    public final Object a(O4.b decoder) {
        kotlin.jvm.internal.i.e(decoder, "decoder");
        return new C0443t(decoder.n(f2371b).t());
    }

    @Override // M4.a
    public final void b(R4.s sVar, Object obj) {
        sVar.h(f2371b).n(((C0443t) obj).f5687a);
    }

    @Override // M4.a
    public final N4.e c() {
        return f2371b;
    }
}
