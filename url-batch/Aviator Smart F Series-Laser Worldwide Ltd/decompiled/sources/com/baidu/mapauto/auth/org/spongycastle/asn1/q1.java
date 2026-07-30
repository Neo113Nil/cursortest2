package com.baidu.mapauto.auth.org.spongycastle.asn1;

import java.io.EOFException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class q1 extends t1 {

    /* renamed from: c, reason: collision with root package name */
    public int f7826c;

    /* renamed from: d, reason: collision with root package name */
    public int f7827d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7828e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7829f;

    public q1(int i8, InputStream inputStream) {
        super(i8, inputStream);
        this.f7828e = false;
        this.f7829f = true;
        this.f7826c = inputStream.read();
        int read = inputStream.read();
        this.f7827d = read;
        if (read < 0) {
            throw new EOFException();
        }
        c();
    }

    public final boolean c() {
        if (!this.f7828e && this.f7829f && this.f7826c == 0 && this.f7827d == 0) {
            this.f7828e = true;
            b();
        }
        return this.f7828e;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (c()) {
            return -1;
        }
        int read = this.f7838a.read();
        if (read < 0) {
            throw new EOFException();
        }
        int i8 = this.f7826c;
        this.f7826c = this.f7827d;
        this.f7827d = read;
        return i8;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i8, int i9) {
        if (this.f7829f || i9 < 3) {
            return super.read(bArr, i8, i9);
        }
        if (this.f7828e) {
            return -1;
        }
        int read = this.f7838a.read(bArr, i8 + 2, i9 - 2);
        if (read < 0) {
            throw new EOFException();
        }
        bArr[i8] = (byte) this.f7826c;
        bArr[i8 + 1] = (byte) this.f7827d;
        this.f7826c = this.f7838a.read();
        int read2 = this.f7838a.read();
        this.f7827d = read2;
        if (read2 >= 0) {
            return read + 2;
        }
        throw new EOFException();
    }
}
