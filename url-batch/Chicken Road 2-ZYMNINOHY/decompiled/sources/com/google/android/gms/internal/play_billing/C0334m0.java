package com.google.android.gms.internal.play_billing;

import E.AbstractC0005f;

/* renamed from: com.google.android.gms.internal.play_billing.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0334m0 extends C0336n0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f5979d;

    public C0334m0(int i4, byte[] bArr) {
        super(bArr);
        C0336n0.e(0, i4, bArr.length);
        this.f5979d = i4;
    }

    @Override // com.google.android.gms.internal.play_billing.C0336n0
    public final byte b(int i4) {
        int i5 = this.f5979d;
        if (((i5 - (i4 + 1)) | i4) >= 0) {
            return this.f5983b[i4];
        }
        if (i4 < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC0005f.j(i4, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC0005f.i(i4, i5, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.play_billing.C0336n0
    public final byte c(int i4) {
        return this.f5983b[i4];
    }

    @Override // com.google.android.gms.internal.play_billing.C0336n0
    public final int d() {
        return this.f5979d;
    }
}
