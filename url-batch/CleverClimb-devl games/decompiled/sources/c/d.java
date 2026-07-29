package c;

import java.io.IOException;

/* compiled from: BufferedSink.java */
/* loaded from: classes.dex */
public interface d extends q {
    d b(f fVar) throws IOException;

    d b(String str) throws IOException;

    c c();

    d c(byte[] bArr) throws IOException;

    d c(byte[] bArr, int i, int i2) throws IOException;

    @Override // c.q, java.io.Flushable
    void flush() throws IOException;

    d g(int i) throws IOException;

    d h(int i) throws IOException;

    d i(int i) throws IOException;

    d k(long j) throws IOException;

    d l(long j) throws IOException;

    d v() throws IOException;
}
