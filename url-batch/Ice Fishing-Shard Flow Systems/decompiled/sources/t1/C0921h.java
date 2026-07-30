package t1;

/* renamed from: t1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0921h {

    /* renamed from: b, reason: collision with root package name */
    public static C0921h f7956b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0922i f7957c = new C0922i(0, false, false, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public Object f7958a;

    public static synchronized C0921h a() {
        C0921h c0921h;
        synchronized (C0921h.class) {
            try {
                if (f7956b == null) {
                    f7956b = new C0921h();
                }
                c0921h = f7956b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0921h;
    }
}
