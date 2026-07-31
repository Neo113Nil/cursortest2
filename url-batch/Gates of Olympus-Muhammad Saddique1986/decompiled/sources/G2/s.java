package G2;

/* loaded from: classes.dex */
public enum s {
    f2273e("http/1.0"),
    f2274f("http/1.1"),
    f2275g("spdy/3.1"),
    f2276h("h2"),
    f2277i("h2_prior_knowledge"),
    f2278j("quic");


    /* renamed from: d, reason: collision with root package name */
    public final String f2280d;

    s(String str) {
        this.f2280d = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f2280d;
    }
}
