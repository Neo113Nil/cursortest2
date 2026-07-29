package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public abstract class zzyj {
    private static volatile boolean zzbts = true;
    int zzbtp;
    private int zzbtq;
    private boolean zzbtr;

    private zzyj() {
        this.zzbtp = 100;
        this.zzbtq = Integer.MAX_VALUE;
        this.zzbtr = false;
    }

    static zzyj zza(byte[] bArr, int i, int i2, boolean z) {
        zzyl zzylVar = new zzyl(bArr, i, i2);
        try {
            zzylVar.zzah(i2);
            return zzylVar;
        } catch (zzyy e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract int zztr();
}
