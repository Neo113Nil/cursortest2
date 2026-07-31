package l;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0484a extends A3.c {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0484a f5235c;

    /* renamed from: d, reason: collision with root package name */
    public static final P.c f5236d = new P.c(1);

    /* renamed from: b, reason: collision with root package name */
    public final d f5237b;

    public C0484a() {
        super(14);
        this.f5237b = new d();
    }

    public static C0484a o0() {
        if (f5235c != null) {
            return f5235c;
        }
        synchronized (C0484a.class) {
            try {
                if (f5235c == null) {
                    f5235c = new C0484a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f5235c;
    }
}
