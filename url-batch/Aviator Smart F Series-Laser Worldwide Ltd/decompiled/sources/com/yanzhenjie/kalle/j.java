package com.yanzhenjie.kalle;

import java.nio.charset.Charset;

/* loaded from: classes4.dex */
public class j extends s {
    public j(String str) {
        this(str, k.getConfig().getCharset());
    }

    public j(String str, Charset charset) {
        super(str, charset, i.VALUE_APPLICATION_JSON);
    }
}
