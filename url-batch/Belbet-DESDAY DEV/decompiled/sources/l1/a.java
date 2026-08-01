package l1;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f3172a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3173b;

    /* renamed from: c, reason: collision with root package name */
    public c f3174c;
    public long d;

    public a(String str, boolean z2) {
        X0.d.e(str, "name");
        this.f3172a = str;
        this.f3173b = z2;
        this.d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f3172a;
    }
}
