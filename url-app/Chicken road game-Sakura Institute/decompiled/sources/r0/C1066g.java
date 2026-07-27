package r0;

import n.AbstractC0864b;

/* renamed from: r0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1066g implements X.k {

    /* renamed from: a, reason: collision with root package name */
    public static final C1066g f9796a = new C1066g();

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f9797b;

    @Override // X.k
    public final boolean a() {
        Boolean bool = f9797b;
        if (bool != null) {
            return bool.booleanValue();
        }
        AbstractC0864b.E("canFocus is read before it is written");
        throw null;
    }

    @Override // X.k
    public final void b(boolean z4) {
        f9797b = Boolean.valueOf(z4);
    }
}
