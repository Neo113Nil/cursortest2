package r1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g implements x0.i {

    /* renamed from: a, reason: collision with root package name */
    public static final g f7769a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f7770b;

    @Override // x0.i
    public final boolean a() {
        Boolean bool = f7770b;
        if (bool != null) {
            return bool.booleanValue();
        }
        a.a.N("canFocus is read before it is written");
        throw null;
    }

    @Override // x0.i
    public final void b(boolean z8) {
        f7770b = Boolean.valueOf(z8);
    }
}
