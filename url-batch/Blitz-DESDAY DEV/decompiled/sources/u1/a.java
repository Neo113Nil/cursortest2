package u1;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f3783a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3784b;

    /* renamed from: c, reason: collision with root package name */
    public c f3785c;
    public long d;

    public a(String str, boolean z2) {
        g1.d.e(str, "name");
        this.f3783a = str;
        this.f3784b = z2;
        this.d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f3783a;
    }
}
