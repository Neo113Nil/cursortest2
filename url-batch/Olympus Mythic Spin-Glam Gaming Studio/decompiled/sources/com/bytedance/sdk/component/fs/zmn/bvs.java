package com.bytedance.sdk.component.fs.zmn;

import java.nio.charset.Charset;

/* loaded from: classes12.dex */
public final class bvs {
    private String fs;
    private String zmn;

    private bvs(String str) {
        this.zmn = str;
    }

    public static bvs zmn(String str) {
        return new bvs(str);
    }

    public String zmn() {
        return this.zmn;
    }

    public Charset zmn(Charset charset) {
        try {
            String str = this.fs;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }
}
