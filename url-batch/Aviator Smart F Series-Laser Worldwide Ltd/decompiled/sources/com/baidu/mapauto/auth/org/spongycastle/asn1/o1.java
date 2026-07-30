package com.baidu.mapauto.auth.org.spongycastle.asn1;

import java.io.EOFException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class o1 extends t1 {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f7815e = new byte[0];

    /* renamed from: c, reason: collision with root package name */
    public final int f7816c;

    /* renamed from: d, reason: collision with root package name */
    public int f7817d;

    public o1(int i8, InputStream inputStream) {
        super(i8, inputStream);
        if (i8 < 0) {
            throw new IllegalArgumentException("negative lengths not allowed");
        }
        this.f7816c = i8;
        this.f7817d = i8;
        if (i8 == 0) {
            b();
        }
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.t1
    public final int a() {
        return this.f7817d;
    }

    public final byte[] c() {
        int i8 = this.f7817d;
        if (i8 == 0) {
            return f7815e;
        }
        byte[] bArr = new byte[i8];
        InputStream inputStream = this.f7838a;
        int i9 = 0;
        while (i9 < i8) {
            int read = inputStream.read(bArr, i9, i8 - i9);
            if (read < 0) {
                break;
            }
            i9 += read;
        }
        int i10 = i8 - i9;
        this.f7817d = i10;
        if (i10 == 0) {
            b();
            return bArr;
        }
        StringBuilder a8 = com.baidu.mapauto.auth.b.a("DEF length ");
        a8.append(this.f7816c);
        a8.append(" object truncated by ");
        a8.append(this.f7817d);
        throw new EOFException(a8.toString());
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f7817d == 0) {
            return -1;
        }
        int read = this.f7838a.read();
        if (read >= 0) {
            int i8 = this.f7817d - 1;
            this.f7817d = i8;
            if (i8 == 0) {
                b();
            }
            return read;
        }
        StringBuilder a8 = com.baidu.mapauto.auth.b.a("DEF length ");
        a8.append(this.f7816c);
        a8.append(" object truncated by ");
        a8.append(this.f7817d);
        throw new EOFException(a8.toString());
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i8, int i9) {
        int i10 = this.f7817d;
        if (i10 == 0) {
            return -1;
        }
        int read = this.f7838a.read(bArr, i8, Math.min(i9, i10));
        if (read >= 0) {
            int i11 = this.f7817d - read;
            this.f7817d = i11;
            if (i11 == 0) {
                b();
            }
            return read;
        }
        StringBuilder a8 = com.baidu.mapauto.auth.b.a("DEF length ");
        a8.append(this.f7816c);
        a8.append(" object truncated by ");
        a8.append(this.f7817d);
        throw new EOFException(a8.toString());
    }
}
