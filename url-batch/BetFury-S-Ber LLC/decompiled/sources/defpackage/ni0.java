package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public enum ni0 {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");

    public static final mi0 Companion = new mi0();
    private final String javaName;

    ni0(String str) {
        this.javaName = str;
    }

    public static final ni0 forJavaName(String str) {
        Companion.getClass();
        return mi0.a(str);
    }

    /* renamed from: -deprecated_javaName, reason: not valid java name */
    public final String m10deprecated_javaName() {
        return this.javaName;
    }

    public final String javaName() {
        return this.javaName;
    }
}
