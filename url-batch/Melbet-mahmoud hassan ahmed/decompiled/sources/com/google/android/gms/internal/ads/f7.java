package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;

/* loaded from: classes.dex */
public final class f7 extends ByteArrayOutputStream {

    /* renamed from: f, reason: collision with root package name */
    private final s6 f5014f;

    public f7(s6 s6Var, int i7) {
        this.f5014f = s6Var;
        ((ByteArrayOutputStream) this).buf = s6Var.b(Math.max(i7, 256));
    }

    private final void b(int i7) {
        int i8 = ((ByteArrayOutputStream) this).count;
        if (i8 + i7 <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        int i9 = i8 + i7;
        byte[] b7 = this.f5014f.b(i9 + i9);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, b7, 0, ((ByteArrayOutputStream) this).count);
        this.f5014f.a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = b7;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5014f.a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.f5014f.a(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i7) {
        b(1);
        super.write(i7);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i7, int i8) {
        b(i8);
        super.write(bArr, i7, i8);
    }
}
