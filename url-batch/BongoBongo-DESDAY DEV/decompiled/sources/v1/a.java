package v1;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f3957a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3958b;

    /* renamed from: c, reason: collision with root package name */
    public c f3959c;
    public long d;

    public a(String str, boolean z2) {
        h1.d.e(str, "name");
        this.f3957a = str;
        this.f3958b = z2;
        this.d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f3957a;
    }
}
