package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes.dex */
public final class Z2 extends M2 {
    public Z2(int i4, String str, PublicLogger publicLogger) {
        super(i4, str, publicLogger);
    }

    public final int b() {
        return this.f10619a;
    }

    @Override // io.appmetrica.analytics.impl.Ln
    public final byte[] a(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            int i4 = this.f10619a;
            if (length > i4) {
                byte[] bArr2 = new byte[i4];
                System.arraycopy(bArr, 0, bArr2, 0, i4);
                this.f10621c.warning("\"%s\" %s exceeded limit of %d bytes", this.f10620b, bArr, Integer.valueOf(this.f10619a));
                return bArr2;
            }
        }
        return bArr;
    }

    public final String a() {
        return this.f10620b;
    }
}
