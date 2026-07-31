package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.v3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3029v3 extends Z2 {
    public C3029v3(int i4, @NonNull String str, @NonNull PublicLogger publicLogger) {
        super(i4, str, publicLogger);
    }

    public final int b() {
        return this.f38595a;
    }

    @Override // io.appmetrica.analytics.impl.In
    public final byte[] a(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            int i4 = this.f38595a;
            if (length > i4) {
                byte[] bArr2 = new byte[i4];
                System.arraycopy(bArr, 0, bArr2, 0, i4);
                this.f38597c.warning("\"%s\" %s exceeded limit of %d bytes", this.f38596b, bArr, Integer.valueOf(this.f38595a));
                return bArr2;
            }
        }
        return bArr;
    }

    @NonNull
    public final String a() {
        return this.f38596b;
    }
}
