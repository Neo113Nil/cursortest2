package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* loaded from: classes.dex */
final class zzet extends zzes {
    private final byte[] zzb;

    zzet(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final byte zza(int i4) {
        return this.zzb[i4];
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    final byte zzb(int i4) {
        return this.zzb[i4];
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    protected final int zzd(int i4, int i5, int i6) {
        return zzga.zzb(i4, this.zzb, 0, i6);
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final int zze() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final zzev zzf(int i4, int i5) {
        byte[] bArr = this.zzb;
        int zzj = zzev.zzj(0, i5, bArr.length);
        return zzj == 0 ? zzev.zza : new zzep(bArr, 0, zzj);
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    final void zzg(zzem zzemVar) {
        byte[] bArr = this.zzb;
        ((zzez) zzemVar).zzc(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    protected final boolean zzh(zzev zzevVar) {
        byte[] bArr;
        int i4;
        boolean z4 = zzevVar instanceof zzet;
        if (z4) {
            return Arrays.equals(this.zzb, ((zzet) zzevVar).zzb);
        }
        boolean z5 = zzevVar instanceof zzep;
        if (!z5) {
            return zzevVar.zzh(this);
        }
        byte[] bArr2 = this.zzb;
        int zze = zzevVar.zze();
        int length = bArr2.length;
        if (length > zze) {
            throw new IllegalArgumentException("Length too large: " + length + length);
        }
        if (length > zzevVar.zze()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + length + ", " + zzevVar.zze());
        }
        if (z4) {
            return zzev.zzl(bArr2, 0, ((zzet) zzevVar).zzb, 0, length);
        }
        if (!z5) {
            return zzevVar.zzf(0, length).equals(zzf(0, length));
        }
        zzep zzepVar = (zzep) zzevVar;
        bArr = zzepVar.zzb;
        i4 = zzepVar.zzc;
        return zzev.zzl(bArr2, 0, bArr, i4, length);
    }
}
