package c2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c implements i1.m {

    /* renamed from: a, reason: collision with root package name */
    public static final c f1503a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f1504b;

    @Override // i1.m
    public final boolean c() {
        Boolean bool = f1504b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw v4.a.h("canFocus is read before it is written");
    }

    @Override // i1.m
    public final void d(boolean z10) {
        f1504b = Boolean.valueOf(z10);
    }
}
