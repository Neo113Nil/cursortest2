package p1;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f3389a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3390b;

    /* renamed from: c, reason: collision with root package name */
    public c f3391c;
    public long d;

    public a(String str, boolean z2) {
        b1.d.e(str, "name");
        this.f3389a = str;
        this.f3390b = z2;
        this.d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f3389a;
    }
}
