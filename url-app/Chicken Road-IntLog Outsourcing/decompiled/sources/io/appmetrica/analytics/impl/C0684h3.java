package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.h3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0684h3 extends U2 {
    public C0684h3(int i2, String str, PublicLogger publicLogger) {
        super(i2, str, publicLogger);
    }

    public final int b() {
        return this.f7575a;
    }

    @Override // io.appmetrica.analytics.impl.Nn
    public final byte[] a(byte[] bArr) {
        if (bArr == null) {
            return bArr;
        }
        int length = bArr.length;
        int i2 = this.f7575a;
        if (length <= i2) {
            return bArr;
        }
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        this.f7577c.warning("\"%s\" %s exceeded limit of %d bytes", this.f7576b, bArr, Integer.valueOf(this.f7575a));
        return bArr2;
    }

    public final String a() {
        return this.f7576b;
    }
}
