package com.yandex.mobile.ads.impl;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.ByteArrayOutputStream;

/* loaded from: classes3.dex */
public final class cj1 extends ByteArrayOutputStream implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    private final C2374yl f24228a;

    public cj1(C2374yl c2374yl, int i4) {
        this.f24228a = c2374yl;
        ((ByteArrayOutputStream) this).buf = c2374yl.a(Math.max(i4, UserVerificationMethods.USER_VERIFY_HANDPRINT));
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f24228a.a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.f24228a.a(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i4) {
        int i5 = ((ByteArrayOutputStream) this).count + 1;
        if (i5 > ((ByteArrayOutputStream) this).buf.length) {
            byte[] a4 = this.f24228a.a(i5 * 2);
            System.arraycopy(((ByteArrayOutputStream) this).buf, 0, a4, 0, ((ByteArrayOutputStream) this).count);
            this.f24228a.a(((ByteArrayOutputStream) this).buf);
            ((ByteArrayOutputStream) this).buf = a4;
        }
        super.write(i4);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i4, int i5) {
        int i6 = ((ByteArrayOutputStream) this).count + i5;
        if (i6 > ((ByteArrayOutputStream) this).buf.length) {
            byte[] a4 = this.f24228a.a(i6 * 2);
            System.arraycopy(((ByteArrayOutputStream) this).buf, 0, a4, 0, ((ByteArrayOutputStream) this).count);
            this.f24228a.a(((ByteArrayOutputStream) this).buf);
            ((ByteArrayOutputStream) this).buf = a4;
        }
        super.write(bArr, i4, i5);
    }
}
