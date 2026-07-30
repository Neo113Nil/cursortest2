package com.yanzhenjie.kalle;

import java.io.Closeable;
import java.io.InputStream;

/* loaded from: classes4.dex */
public interface r extends Closeable {
    byte[] byteArray();

    InputStream stream();

    String string();
}
