package t0;

import n.z0;

/* renamed from: t0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0994g implements Z.k {

    /* renamed from: a, reason: collision with root package name */
    public static final C0994g f8746a = new C0994g();

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f8747b;

    @Override // Z.k
    public final boolean a() {
        Boolean bool = f8747b;
        if (bool != null) {
            return bool.booleanValue();
        }
        z0.p("canFocus is read before it is written");
        throw null;
    }

    @Override // Z.k
    public final void b(boolean z3) {
        f8747b = Boolean.valueOf(z3);
    }
}
