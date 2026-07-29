package com.tapjoy.internal;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes2.dex */
public interface jc extends Closeable, Flushable {
    void a(is isVar, long j);

    @Override // java.io.Closeable, java.lang.AutoCloseable, com.tapjoy.internal.jd
    void close();

    void flush();
}
