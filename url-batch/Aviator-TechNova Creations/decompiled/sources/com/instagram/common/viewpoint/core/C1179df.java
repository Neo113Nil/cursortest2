package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.ads.redexgen.X.df, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1179df extends InputStream {
    public int A00;
    public long A01;
    public InterfaceC1771nl A02;
    public final Uri A03;
    public final InterfaceC01704w A04;
    public final C1133cu A05;
    public final String A06;

    public C1179df(C1133cu c1133cu, Uri uri, InterfaceC01704w interfaceC01704w) throws IOException {
        this.A05 = c1133cu;
        this.A04 = interfaceC01704w;
        this.A03 = uri;
        this.A06 = C1218eJ.A09(this.A05, this.A03);
        A00(0);
    }

    private void A00(int i) throws IOException {
        if (this.A02 != null) {
            this.A02.close();
        }
        this.A02 = this.A04.A5A();
        this.A01 = (int) this.A02.AFy(new AnonymousClass56(this.A03, i, -1L, this.A06));
    }

    @Override // java.io.InputStream
    public final int available() {
        return ((int) this.A01) - this.A00;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.A02.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] b = new byte[1];
        return read(b);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.A02.read(bArr, i, i2);
        int read2 = this.A00;
        this.A00 = read2 + read;
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        long j2 = this.A01 - this.A00;
        if (j2 <= 0) {
            return 0L;
        }
        if (j > j2) {
            j = j2;
        }
        this.A00 = (int) (this.A00 + j);
        A00(this.A00);
        return j;
    }
}
