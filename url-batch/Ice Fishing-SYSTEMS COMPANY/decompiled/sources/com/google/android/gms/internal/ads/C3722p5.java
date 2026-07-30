package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import m1.C4774a;

/* renamed from: com.google.android.gms.internal.ads.p5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3722p5 extends ByteArrayOutputStream {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f33329n = 0;

    /* renamed from: u, reason: collision with root package name */
    public final Object f33330u;

    public C3722p5(C3398j5 c3398j5, int i) {
        this.f33330u = c3398j5;
        ((ByteArrayOutputStream) this).buf = c3398j5.j(Math.max(i, 256));
    }

    public void a(int i) {
        int i4 = ((ByteArrayOutputStream) this).count;
        if (i4 + i <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        int i9 = (i4 + i) * 2;
        C4774a c4774a = (C4774a) this.f33330u;
        byte[] a9 = c4774a.a(i9);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, a9, 0, ((ByteArrayOutputStream) this).count);
        c4774a.b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = a9;
    }

    public void b(int i) {
        int i4 = ((ByteArrayOutputStream) this).count;
        if (i4 + i <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        int i9 = i4 + i;
        C3398j5 c3398j5 = (C3398j5) this.f33330u;
        byte[] j9 = c3398j5.j(i9 + i9);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, j9, 0, ((ByteArrayOutputStream) this).count);
        c3398j5.o(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = j9;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        switch (this.f33329n) {
            case 0:
                ((C3398j5) this.f33330u).o(((ByteArrayOutputStream) this).buf);
                ((ByteArrayOutputStream) this).buf = null;
                super.close();
                break;
            case 1:
                ((C4774a) this.f33330u).b(((ByteArrayOutputStream) this).buf);
                ((ByteArrayOutputStream) this).buf = null;
                super.close();
                break;
            default:
                super.close();
                break;
        }
    }

    public void finalize() {
        switch (this.f33329n) {
            case 0:
                ((C3398j5) this.f33330u).o(((ByteArrayOutputStream) this).buf);
                break;
            case 1:
                ((C4774a) this.f33330u).b(((ByteArrayOutputStream) this).buf);
                break;
            default:
                super.finalize();
                break;
        }
    }

    @Override // java.io.ByteArrayOutputStream
    public String toString() {
        switch (this.f33329n) {
            case 2:
                int i = ((ByteArrayOutputStream) this).count;
                if (i > 0 && ((ByteArrayOutputStream) this).buf[i - 1] == 13) {
                    i--;
                }
                try {
                    return new String(((ByteArrayOutputStream) this).buf, 0, i, ((q1.d) this.f33330u).f39912u.name());
                } catch (UnsupportedEncodingException e6) {
                    throw new AssertionError(e6);
                }
            default:
                return super.toString();
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i4) {
        switch (this.f33329n) {
            case 0:
                synchronized (this) {
                    b(i4);
                    super.write(bArr, i, i4);
                }
                return;
            case 1:
                synchronized (this) {
                    a(i4);
                    super.write(bArr, i, i4);
                }
                return;
            default:
                super.write(bArr, i, i4);
                return;
        }
    }

    public C3722p5(C4774a c4774a, int i) {
        this.f33330u = c4774a;
        ((ByteArrayOutputStream) this).buf = c4774a.a(Math.max(i, 256));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3722p5(q1.d dVar, int i) {
        super(i);
        this.f33330u = dVar;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(int i) {
        switch (this.f33329n) {
            case 0:
                synchronized (this) {
                    b(1);
                    super.write(i);
                }
                return;
            case 1:
                synchronized (this) {
                    a(1);
                    super.write(i);
                }
                return;
            default:
                super.write(i);
                return;
        }
    }
}
