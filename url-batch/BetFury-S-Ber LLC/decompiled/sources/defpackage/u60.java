package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public enum u60 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");

    public static final t60 Companion = new t60();
    private final String protocol;

    u60(String str) {
        this.protocol = str;
    }

    public static final u60 get(String str) {
        Companion.getClass();
        return t60.a(str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }
}
