package com.baidu.mapauto.auth.org.spongycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public OutputStream f7818a;

    public class a extends p {

        /* renamed from: b, reason: collision with root package name */
        public boolean f7819b;

        public a(OutputStream outputStream) {
            super(outputStream);
            this.f7819b = true;
        }

        @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.p
        public final void a(int i8) {
            if (this.f7819b) {
                this.f7819b = false;
            } else {
                this.f7818a.write(i8);
            }
        }
    }

    public p(OutputStream outputStream) {
        this.f7818a = outputStream;
    }

    public x0 a() {
        return new x0(this.f7818a);
    }

    public p b() {
        return new k1(this.f7818a);
    }

    public void a(int i8) {
        this.f7818a.write(i8);
    }

    public final void b(int i8) {
        if (i8 <= 127) {
            a((byte) i8);
            return;
        }
        int i9 = i8;
        int i10 = 1;
        while (true) {
            i9 >>>= 8;
            if (i9 == 0) {
                break;
            } else {
                i10++;
            }
        }
        a((byte) (i10 | 128));
        for (int i11 = (i10 - 1) * 8; i11 >= 0; i11 -= 8) {
            a((byte) (i8 >> i11));
        }
    }

    public void a(d dVar) {
        if (dVar == null) {
            throw new IOException("null object detected");
        }
        dVar.c().a(this);
    }

    public final void a(r rVar) {
        rVar.a(new a(this.f7818a));
    }

    public final void a(byte[] bArr, int i8) {
        a(i8);
        b(bArr.length);
        this.f7818a.write(bArr);
    }

    public final void a(int i8, int i9) {
        if (i9 < 31) {
            a(i8 | i9);
            return;
        }
        a(i8 | 31);
        if (i9 < 128) {
            a(i9);
            return;
        }
        byte[] bArr = new byte[5];
        int i10 = 4;
        bArr[4] = (byte) (i9 & 127);
        do {
            i9 >>= 7;
            i10--;
            bArr[i10] = (byte) ((i9 & 127) | 128);
        } while (i9 > 127);
        this.f7818a.write(bArr, i10, 5 - i10);
    }
}
