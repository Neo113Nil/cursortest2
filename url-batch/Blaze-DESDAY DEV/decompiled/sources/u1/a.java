package u1;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f3776a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3777b;

    /* renamed from: c, reason: collision with root package name */
    public c f3778c;
    public long d;

    public a(String str, boolean z2) {
        g1.d.e(str, "name");
        this.f3776a = str;
        this.f3777b = z2;
        this.d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f3776a;
    }
}
