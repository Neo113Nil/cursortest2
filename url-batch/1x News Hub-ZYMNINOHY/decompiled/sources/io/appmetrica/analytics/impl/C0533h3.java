package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.h3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0533h3 extends U2 {
    public C0533h3(int i3, String str, PublicLogger publicLogger) {
        super(i3, str, publicLogger);
    }

    public final int b() {
        return this.f6744a;
    }

    @Override // io.appmetrica.analytics.impl.Nn
    public final byte[] a(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            int i3 = this.f6744a;
            if (length > i3) {
                byte[] bArr2 = new byte[i3];
                System.arraycopy(bArr, 0, bArr2, 0, i3);
                this.f6746c.warning("\"%s\" %s exceeded limit of %d bytes", this.f6745b, bArr, Integer.valueOf(this.f6744a));
                return bArr2;
            }
        }
        return bArr;
    }

    public final String a() {
        return this.f6745b;
    }
}
