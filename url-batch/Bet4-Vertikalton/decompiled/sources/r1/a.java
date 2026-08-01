package r1;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f3509a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3510b;

    /* renamed from: c, reason: collision with root package name */
    public c f3511c;
    public long d;

    public a(String str, boolean z2) {
        d1.d.e(str, "name");
        this.f3509a = str;
        this.f3510b = z2;
        this.d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f3509a;
    }
}
