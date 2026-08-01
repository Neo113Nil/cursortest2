package t3;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public enum p {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* renamed from: f, reason: collision with root package name */
    public final String f3505f;

    p(String str) {
        this.f3505f = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f3505f;
    }
}
