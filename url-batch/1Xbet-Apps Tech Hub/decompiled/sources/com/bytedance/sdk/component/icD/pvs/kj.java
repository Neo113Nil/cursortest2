package com.bytedance.sdk.component.icD.pvs;

/* compiled from: Protocol.java */
/* loaded from: classes.dex */
public enum kj {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");

    private final String NB;

    kj(String str) {
        this.NB = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.NB;
    }
}
