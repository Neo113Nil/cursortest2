package com.google.android.gms.internal.drive;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzhm extends zzir<zzhm> {
    public int versionCode = 1;
    public long zze = -1;
    public long zzf = -1;
    public long zzg = -1;

    public zzhm() {
        this.zzmw = null;
        this.zznf = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzhm)) {
            return false;
        }
        zzhm zzhmVar = (zzhm) obj;
        if (this.versionCode == zzhmVar.versionCode && this.zze == zzhmVar.zze && this.zzf == zzhmVar.zzf && this.zzg == zzhmVar.zzg) {
            return (this.zzmw == null || this.zzmw.isEmpty()) ? zzhmVar.zzmw == null || zzhmVar.zzmw.isEmpty() : this.zzmw.equals(zzhmVar.zzmw);
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((getClass().getName().hashCode() + 527) * 31) + this.versionCode) * 31) + ((int) (this.zze ^ (this.zze >>> 32)))) * 31) + ((int) (this.zzf ^ (this.zzf >>> 32)))) * 31) + ((int) (this.zzg ^ (this.zzg >>> 32)))) * 31) + ((this.zzmw == null || this.zzmw.isEmpty()) ? 0 : this.zzmw.hashCode());
    }

    @Override // com.google.android.gms.internal.drive.zzix
    public final /* synthetic */ zzix zza(zzio zzioVar) throws IOException {
        while (true) {
            int zzbd = zzioVar.zzbd();
            if (zzbd == 0) {
                return this;
            }
            if (zzbd == 8) {
                this.versionCode = zzioVar.zzbe();
            } else if (zzbd == 16) {
                long zzbf = zzioVar.zzbf();
                this.zze = (-(zzbf & 1)) ^ (zzbf >>> 1);
            } else if (zzbd == 24) {
                long zzbf2 = zzioVar.zzbf();
                this.zzf = (-(zzbf2 & 1)) ^ (zzbf2 >>> 1);
            } else if (zzbd == 32) {
                long zzbf3 = zzioVar.zzbf();
                this.zzg = (-(zzbf3 & 1)) ^ (zzbf3 >>> 1);
            } else if (!super.zza(zzioVar, zzbd)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.drive.zzir, com.google.android.gms.internal.drive.zzix
    public final void zza(zzip zzipVar) throws IOException {
        zzipVar.zzb(1, this.versionCode);
        zzipVar.zza(2, this.zze);
        zzipVar.zza(3, this.zzf);
        zzipVar.zza(4, this.zzg);
        super.zza(zzipVar);
    }

    @Override // com.google.android.gms.internal.drive.zzir, com.google.android.gms.internal.drive.zzix
    protected final int zzaq() {
        return super.zzaq() + zzip.zzc(1, this.versionCode) + zzip.zzb(2, this.zze) + zzip.zzb(3, this.zzf) + zzip.zzb(4, this.zzg);
    }
}
