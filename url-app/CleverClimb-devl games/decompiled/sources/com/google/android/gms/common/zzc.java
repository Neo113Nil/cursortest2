package com.google.android.gms.common;

import com.google.android.gms.common.GoogleCertificates;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
abstract class zzc extends GoogleCertificates.CertData {
    private static final WeakReference<byte[]> zzbf = new WeakReference<>(null);
    private WeakReference<byte[]> zzbe;

    zzc(byte[] bArr) {
        super(bArr);
        this.zzbe = zzbf;
    }

    @Override // com.google.android.gms.common.GoogleCertificates.CertData
    final byte[] getBytes() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.zzbe.get();
            if (bArr == null) {
                bArr = zzf();
                this.zzbe = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }

    protected abstract byte[] zzf();
}
