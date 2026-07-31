package com.bytedance.sdk.openadsdk.nqi;

import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

/* loaded from: classes5.dex */
public final class kgc {
    public static final Charset fs;
    public static final Charset zmn;

    static {
        Charset charset;
        Charset charset2 = null;
        try {
            charset = Charset.forName("SJIS");
        } catch (UnsupportedCharsetException unused) {
            charset = null;
        }
        zmn = charset;
        try {
            charset2 = Charset.forName("GB2312");
        } catch (UnsupportedCharsetException unused2) {
        }
        fs = charset2;
    }
}
