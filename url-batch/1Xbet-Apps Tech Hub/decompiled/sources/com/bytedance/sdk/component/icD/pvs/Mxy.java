package com.bytedance.sdk.component.icD.pvs;

import java.nio.charset.Charset;

/* compiled from: MediaType.java */
/* loaded from: classes.dex */
public final class Mxy {
    private String icD;
    private String pvs;

    private Mxy(String str) {
        this.pvs = str;
    }

    public static Mxy pvs(String str) {
        return new Mxy(str);
    }

    public String pvs() {
        return this.pvs;
    }

    public Charset pvs(Charset charset) {
        try {
            String str = this.icD;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }
}
