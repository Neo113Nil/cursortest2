package okhttp3;

import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic"),
    HTTP_3("h3");

    public static final HttpUrl.Companion Companion = new HttpUrl.Companion();
    public final String protocol;

    Protocol(String str) {
        this.protocol = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.protocol;
    }
}
