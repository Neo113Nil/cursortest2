package c3;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public enum r {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* renamed from: f, reason: collision with root package name */
    public final String f1126f;

    r(String str) {
        this.f1126f = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f1126f;
    }
}
