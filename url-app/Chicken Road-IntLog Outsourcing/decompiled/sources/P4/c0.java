package P4;

import f4.C0440q;

/* loaded from: classes.dex */
public final class c0 implements M4.a {

    /* renamed from: a, reason: collision with root package name */
    public static final c0 f2360a = new c0();

    /* renamed from: b, reason: collision with root package name */
    public static final C0142v f2361b = I.a("kotlin.ULong", F.f2325a);

    @Override // M4.a
    public final Object a(O4.b decoder) {
        kotlin.jvm.internal.i.e(decoder, "decoder");
        return new C0440q(decoder.n(f2361b).c());
    }

    @Override // M4.a
    public final void b(R4.s sVar, Object obj) {
        sVar.h(f2361b).k(((C0440q) obj).f5684a);
    }

    @Override // M4.a
    public final N4.e c() {
        return f2361b;
    }
}
