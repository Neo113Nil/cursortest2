package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.ads.CL;

/* renamed from: com.google.android.gms.internal.consent_sdk.g2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4336g2 extends C4340h2 {
    @Override // com.google.android.gms.internal.consent_sdk.C4340h2
    public final byte a(int i) {
        if (((47 - (i + 1)) | i) >= 0) {
            return this.f35846u[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(CL.i(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(D.y.i(i, "Index > length: ", ", 47"));
    }

    @Override // com.google.android.gms.internal.consent_sdk.C4340h2
    public final byte c(int i) {
        return this.f35846u[i];
    }

    @Override // com.google.android.gms.internal.consent_sdk.C4340h2
    public final int d() {
        return 47;
    }
}
