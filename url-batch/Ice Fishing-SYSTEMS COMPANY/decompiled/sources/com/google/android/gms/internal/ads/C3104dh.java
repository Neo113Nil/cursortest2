package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.dh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3104dh implements ZG {

    /* renamed from: n, reason: collision with root package name */
    public final byte[] f30075n;

    public C3104dh(byte[] bArr, int i) {
        switch (i) {
            case 1:
                this.f30075n = new byte[256];
                for (int i4 = 0; i4 < 256; i4++) {
                    this.f30075n[i4] = (byte) i4;
                }
                int i9 = 0;
                for (int i10 = 0; i10 < 256; i10++) {
                    byte[] bArr2 = this.f30075n;
                    byte b9 = bArr2[i10];
                    i9 = (i9 + b9 + bArr[i10 % bArr.length]) & com.anythink.basead.exoplayer.k.p.f8630b;
                    bArr2[i10] = bArr2[i9];
                    bArr2[i9] = b9;
                }
                break;
            default:
                this.f30075n = bArr;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.ZG
    /* renamed from: a */
    public /* synthetic */ InterfaceC3572mH mo9a() {
        AtomicInteger atomicInteger = C3267gh.f31034N;
        return new SF(this.f30075n);
    }
}
