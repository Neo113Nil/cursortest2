package com.yanzhenjie.kalle;

import java.io.OutputStream;

/* loaded from: classes4.dex */
public interface f {
    long contentLength();

    String contentType();

    void writeTo(OutputStream outputStream);
}
