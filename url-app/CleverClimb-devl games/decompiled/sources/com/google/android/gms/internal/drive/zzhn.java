package com.google.android.gms.internal.drive;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzhn extends zzir<zzhn> {
    public int versionCode = 1;
    public String zzab = "";
    public long zzac = -1;
    public long zzf = -1;
    public int zzad = -1;

    public zzhn() {
        this.zzmw = null;
        this.zznf = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzhn)) {
            return false;
        }
        zzhn zzhnVar = (zzhn) obj;
        if (this.versionCode != zzhnVar.versionCode) {
            return false;
        }
        if (this.zzab == null) {
            if (zzhnVar.zzab != null) {
                return false;
            }
        } else if (!this.zzab.equals(zzhnVar.zzab)) {
            return false;
        }
        if (this.zzac == zzhnVar.zzac && this.zzf == zzhnVar.zzf && this.zzad == zzhnVar.zzad) {
            return (this.zzmw == null || this.zzmw.isEmpty()) ? zzhnVar.zzmw == null || zzhnVar.zzmw.isEmpty() : this.zzmw.equals(zzhnVar.zzmw);
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((getClass().getName().hashCode() + 527) * 31) + this.versionCode) * 31) + (this.zzab == null ? 0 : this.zzab.hashCode())) * 31) + ((int) (this.zzac ^ (this.zzac >>> 32)))) * 31) + ((int) (this.zzf ^ (this.zzf >>> 32)))) * 31) + this.zzad) * 31;
        if (this.zzmw != null && !this.zzmw.isEmpty()) {
            i = this.zzmw.hashCode();
        }
        return hashCode + i;
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
            } else if (zzbd == 18) {
                this.zzab = zzioVar.readString();
            } else if (zzbd == 24) {
                long zzbf = zzioVar.zzbf();
                this.zzac = (-(zzbf & 1)) ^ (zzbf >>> 1);
            } else if (zzbd == 32) {
                long zzbf2 = zzioVar.zzbf();
                this.zzf = (-(zzbf2 & 1)) ^ (zzbf2 >>> 1);
            } else if (zzbd == 40) {
                this.zzad = zzioVar.zzbe();
            } else if (!super.zza(zzioVar, zzbd)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.drive.zzir, com.google.android.gms.internal.drive.zzix
    public final void zza(zzip zzipVar) throws IOException {
        zzipVar.zzb(1, this.versionCode);
        String str = this.zzab;
        zzipVar.zzd(2, 2);
        zzipVar.zzh(str);
        zzipVar.zza(3, this.zzac);
        zzipVar.zza(4, this.zzf);
        if (this.zzad != -1) {
            zzipVar.zzb(5, this.zzad);
        }
        super.zza(zzipVar);
    }

    @Override // com.google.android.gms.internal.drive.zzir, com.google.android.gms.internal.drive.zzix
    protected final int zzaq() {
        int zzaq = super.zzaq() + zzip.zzc(1, this.versionCode) + zzip.zzo(2) + zzip.zzi(this.zzab) + zzip.zzb(3, this.zzac) + zzip.zzb(4, this.zzf);
        return this.zzad != -1 ? zzaq + zzip.zzc(5, this.zzad) : zzaq;
    }
}
