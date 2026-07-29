package com.google.android.gms.internal.drive;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzho extends zzir<zzho> {
    public long zzac = -1;
    public long zzf = -1;

    public zzho() {
        this.zzmw = null;
        this.zznf = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzho)) {
            return false;
        }
        zzho zzhoVar = (zzho) obj;
        if (this.zzac == zzhoVar.zzac && this.zzf == zzhoVar.zzf) {
            return (this.zzmw == null || this.zzmw.isEmpty()) ? zzhoVar.zzmw == null || zzhoVar.zzmw.isEmpty() : this.zzmw.equals(zzhoVar.zzmw);
        }
        return false;
    }

    public final int hashCode() {
        return ((((((getClass().getName().hashCode() + 527) * 31) + ((int) (this.zzac ^ (this.zzac >>> 32)))) * 31) + ((int) (this.zzf ^ (this.zzf >>> 32)))) * 31) + ((this.zzmw == null || this.zzmw.isEmpty()) ? 0 : this.zzmw.hashCode());
    }

    @Override // com.google.android.gms.internal.drive.zzix
    public final /* synthetic */ zzix zza(zzio zzioVar) throws IOException {
        while (true) {
            int zzbd = zzioVar.zzbd();
            if (zzbd == 0) {
                return this;
            }
            if (zzbd == 8) {
                long zzbf = zzioVar.zzbf();
                this.zzac = (-(zzbf & 1)) ^ (zzbf >>> 1);
            } else if (zzbd == 16) {
                long zzbf2 = zzioVar.zzbf();
                this.zzf = (-(zzbf2 & 1)) ^ (zzbf2 >>> 1);
            } else if (!super.zza(zzioVar, zzbd)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.drive.zzir, com.google.android.gms.internal.drive.zzix
    public final void zza(zzip zzipVar) throws IOException {
        zzipVar.zza(1, this.zzac);
        zzipVar.zza(2, this.zzf);
        super.zza(zzipVar);
    }

    @Override // com.google.android.gms.internal.drive.zzir, com.google.android.gms.internal.drive.zzix
    protected final int zzaq() {
        return super.zzaq() + zzip.zzb(1, this.zzac) + zzip.zzb(2, this.zzf);
    }
}
