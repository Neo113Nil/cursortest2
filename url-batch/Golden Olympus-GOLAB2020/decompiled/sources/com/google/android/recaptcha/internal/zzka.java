package com.google.android.recaptcha.internal;

import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzka extends zzjr {
    private final MessageDigest zza;
    private final int zzb;
    private boolean zzc;

    /* synthetic */ zzka(MessageDigest messageDigest, int i4, zzkb zzkbVar) {
        this.zza = messageDigest;
        this.zzb = i4;
    }

    private final void zzc() {
        zzjf.zze(!this.zzc, "Cannot re-use a Hasher after calling hash() on it");
    }

    @Override // com.google.android.recaptcha.internal.zzjr
    protected final void zza(byte[] bArr, int i4, int i5) {
        zzc();
        this.zza.update(bArr, 0, i5);
    }

    @Override // com.google.android.recaptcha.internal.zzjx
    public final zzjv zzb() {
        zzc();
        this.zzc = true;
        int i4 = this.zzb;
        if (i4 == this.zza.getDigestLength()) {
            byte[] digest = this.zza.digest();
            int i5 = zzjv.zzb;
            return new zzju(digest);
        }
        byte[] copyOf = Arrays.copyOf(this.zza.digest(), i4);
        int i6 = zzjv.zzb;
        return new zzju(copyOf);
    }
}
