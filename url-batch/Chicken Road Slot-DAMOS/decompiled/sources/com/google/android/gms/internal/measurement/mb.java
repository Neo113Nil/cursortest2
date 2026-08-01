package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.DataFormatException;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class mb extends InputStream {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2534d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2535e;

    public mb(nb nbVar) {
        this.f2535e = nbVar;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i3, int i10) {
        switch (this.f2534d) {
            case 0:
                nb nbVar = (nb) this.f2535e;
                try {
                    int inflate = nbVar.f2576d.inflate(bArr, i3, i10);
                    if (inflate > 0) {
                        return inflate;
                    }
                    if (i10 == 0) {
                        return 0;
                    }
                    if (nbVar.f2576d.getRemaining() == 0) {
                        return -1;
                    }
                    int remaining = nbVar.f2576d.getRemaining();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 70 + String.valueOf(remaining).length());
                    sb2.append("Read no bytes (requested up to ");
                    sb2.append(i10);
                    sb2.append(") but did not reach end of stream, had ");
                    sb2.append(remaining);
                    throw new IOException(sb2.toString());
                } catch (DataFormatException e2) {
                    throw new IOException(e2);
                }
            default:
                return ((y0) this.f2535e).f(bArr, i3, i10);
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        switch (this.f2534d) {
            case 1:
                if (j <= 0) {
                    return 0L;
                }
                int i3 = j > 2147483647L ? Integer.MAX_VALUE : (int) j;
                ((y0) this.f2535e).g(i3);
                return i3;
            default:
                return super.skip(j);
        }
    }

    public mb(nb nbVar, y0 y0Var) {
        this.f2535e = y0Var;
    }

    @Override // java.io.InputStream
    public final int read() {
        switch (this.f2534d) {
            case 0:
                byte[] bArr = new byte[1];
                if (read(bArr, 0, 1) == -1) {
                    return -1;
                }
                return bArr[0];
            default:
                byte[] bArr2 = new byte[1];
                if (((y0) this.f2535e).f(bArr2, 0, 1) == -1) {
                    return -1;
                }
                return bArr2[0];
        }
    }
}
