package com.google.android.gms.internal.play_billing;

import E1.AbstractC0033i;

/* loaded from: classes.dex */
public final class X0 extends Y0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f2815d;

    public X0(int i3, byte[] bArr) {
        super(bArr);
        Y0.e(0, i3, bArr.length);
        this.f2815d = i3;
    }

    @Override // com.google.android.gms.internal.play_billing.Y0
    public final byte b(int i3) {
        int i4 = this.f2815d;
        if (((i4 - (i3 + 1)) | i3) >= 0) {
            return this.f2824b[i3];
        }
        if (i3 < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC0033i.h(i3, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC0033i.g(i3, i4, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.play_billing.Y0
    public final byte c(int i3) {
        return this.f2824b[i3];
    }

    @Override // com.google.android.gms.internal.play_billing.Y0
    public final int d() {
        return this.f2815d;
    }
}
