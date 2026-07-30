package com.bumptech.glide.load.data;

import com.google.android.gms.internal.ads.C3112dq;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class b extends OutputStream {

    /* renamed from: n, reason: collision with root package name */
    public final FileOutputStream f23574n;

    /* renamed from: u, reason: collision with root package name */
    public byte[] f23575u;

    /* renamed from: v, reason: collision with root package name */
    public final C3112dq f23576v;

    /* renamed from: w, reason: collision with root package name */
    public int f23577w;

    public b(FileOutputStream fileOutputStream, C3112dq c3112dq) {
        this.f23574n = fileOutputStream;
        this.f23576v = c3112dq;
        this.f23575u = (byte[]) c3112dq.f(com.anythink.basead.exoplayer.b.aX, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        FileOutputStream fileOutputStream = this.f23574n;
        try {
            flush();
            fileOutputStream.close();
            byte[] bArr = this.f23575u;
            if (bArr != null) {
                this.f23576v.k(bArr);
                this.f23575u = null;
            }
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        int i = this.f23577w;
        FileOutputStream fileOutputStream = this.f23574n;
        if (i > 0) {
            fileOutputStream.write(this.f23575u, 0, i);
            this.f23577w = 0;
        }
        fileOutputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        byte[] bArr = this.f23575u;
        int i4 = this.f23577w;
        int i9 = i4 + 1;
        this.f23577w = i9;
        bArr[i4] = (byte) i;
        if (i9 != bArr.length || i9 <= 0) {
            return;
        }
        this.f23574n.write(bArr, 0, i9);
        this.f23577w = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i4) {
        int i9 = 0;
        do {
            int i10 = i4 - i9;
            int i11 = i + i9;
            int i12 = this.f23577w;
            FileOutputStream fileOutputStream = this.f23574n;
            if (i12 == 0 && i10 >= this.f23575u.length) {
                fileOutputStream.write(bArr, i11, i10);
                return;
            }
            int min = Math.min(i10, this.f23575u.length - i12);
            System.arraycopy(bArr, i11, this.f23575u, this.f23577w, min);
            int i13 = this.f23577w + min;
            this.f23577w = i13;
            i9 += min;
            byte[] bArr2 = this.f23575u;
            if (i13 == bArr2.length && i13 > 0) {
                fileOutputStream.write(bArr2, 0, i13);
                this.f23577w = 0;
            }
        } while (i9 < i4);
    }
}
