package com.liulishuo.filedownloader.stream;

/* loaded from: classes4.dex */
public interface a {
    void close();

    void flushAndSync();

    void seek(long j8);

    void setLength(long j8);

    void write(byte[] bArr, int i8, int i9);
}
