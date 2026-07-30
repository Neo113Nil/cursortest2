package com.yanzhenjie.kalle.connect;

import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public interface b extends Closeable {
    void disconnect();

    int getCode();

    Map<String, List<String>> getHeaders();

    InputStream getInputStream();

    OutputStream getOutputStream();
}
