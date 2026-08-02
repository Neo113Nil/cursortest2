package defpackage;

import java.io.Closeable;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface kkb extends Closeable {
    void b();

    void c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    boolean d();

    int e();

    int f();

    kkb g(int i);

    void i(OutputStream outputStream, int i);

    void j(byte[] bArr, int i, int i2);

    void k(int i);
}
