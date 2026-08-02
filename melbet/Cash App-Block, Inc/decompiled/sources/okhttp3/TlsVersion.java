package okhttp3;

import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public enum TlsVersion {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");

    public static final HttpUrl.Companion Companion = new HttpUrl.Companion();
    public final String javaName;

    TlsVersion(String str) {
        this.javaName = str;
    }
}
