package t0;

import e2.AbstractC0381e;

/* renamed from: t0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0899g implements Z.i {

    /* renamed from: a, reason: collision with root package name */
    public static final C0899g f7912a = new C0899g();

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f7913b;

    @Override // Z.i
    public final boolean a() {
        Boolean bool = f7913b;
        if (bool != null) {
            return bool.booleanValue();
        }
        AbstractC0381e.O("canFocus is read before it is written");
        throw null;
    }

    @Override // Z.i
    public final void b(boolean z3) {
        f7913b = Boolean.valueOf(z3);
    }
}
