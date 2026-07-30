package s7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public enum q {
    f8662g("http/1.0"),
    f8663h("http/1.1"),
    f8664i("spdy/3.1"),
    f8665j("h2"),
    f8666k("h2_prior_knowledge"),
    f8667l("quic");


    /* renamed from: f, reason: collision with root package name */
    public final String f8669f;

    q(String str) {
        this.f8669f = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f8669f;
    }
}
