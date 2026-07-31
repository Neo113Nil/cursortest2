package com.google.android.gms.internal.common;

/* loaded from: classes.dex */
abstract class zzv extends zzk {
    final CharSequence zzb;
    final zzp zzc;
    final boolean zzd;
    int zze = 0;
    int zzf = Integer.MAX_VALUE;

    zzv(zzw zzwVar, CharSequence charSequence) {
        this.zzc = zzwVar.zzf();
        this.zzd = zzwVar.zzg();
        this.zzb = charSequence;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        r3 = r5.zzf;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (r3 != 1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        r1 = r5.zzb;
        r3 = r1.length();
        r5.zze = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (r3 <= r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        r1.charAt(r3 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        return r5.zzb.subSequence(r0, r1).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005d, code lost:
    
        r5.zzf = r3 - 1;
     */
    @Override // com.google.android.gms.internal.common.zzk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final /* bridge */ /* synthetic */ Object zza() {
        int zzd;
        int i4 = this.zze;
        while (true) {
            int i5 = this.zze;
            if (i5 == -1) {
                zzb();
                return null;
            }
            int zzc = zzc(i5);
            if (zzc == -1) {
                zzc = this.zzb.length();
                this.zze = -1;
                zzd = -1;
            } else {
                zzd = zzd(zzc);
                this.zze = zzd;
            }
            if (zzd == i4) {
                int i6 = zzd + 1;
                this.zze = i6;
                if (i6 > this.zzb.length()) {
                    this.zze = -1;
                }
            } else {
                if (i4 < zzc) {
                    this.zzb.charAt(i4);
                }
                if (i4 < zzc) {
                    this.zzb.charAt(zzc - 1);
                }
                if (!this.zzd || i4 != zzc) {
                    break;
                }
                i4 = this.zze;
            }
        }
    }

    abstract int zzc(int i4);

    abstract int zzd(int i4);
}
