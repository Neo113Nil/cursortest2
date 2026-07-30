package o;

/* renamed from: o.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0793a extends V6.b {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0793a f7104c;

    /* renamed from: d, reason: collision with root package name */
    public static final e0.c f7105d = new e0.c(1);

    /* renamed from: b, reason: collision with root package name */
    public final C0795c f7106b;

    public C0793a() {
        super(18);
        this.f7106b = new C0795c();
    }

    public static C0793a T() {
        if (f7104c != null) {
            return f7104c;
        }
        synchronized (C0793a.class) {
            try {
                if (f7104c == null) {
                    f7104c = new C0793a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f7104c;
    }
}
