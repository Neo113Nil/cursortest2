package A2;

/* loaded from: classes.dex */
public enum B {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");


    /* renamed from: d, reason: collision with root package name */
    public final String f32d;

    B(String str) {
        this.f32d = str;
    }
}
