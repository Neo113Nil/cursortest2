package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
@Deprecated
/* loaded from: classes3.dex */
public class zzagu implements zzau {
    public final String zza;
    public final String zzb;

    public zzagu(String str, String str2) {
        this.zza = zzfuv.zzb(str);
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzagu zzaguVar = (zzagu) obj;
            if (this.zza.equals(zzaguVar.zza) && this.zzb.equals(zzaguVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() + 527) * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        return "VC: " + this.zza + "=" + this.zzb;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzau
    public final void zza(zzar zzarVar) {
        Integer zzg;
        Integer zzg2;
        Integer zzg3;
        Integer zzg4;
        String str = this.zza;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS") && (zzg = zzgbt.zzg(this.zzb, 10)) != null) {
                    zzarVar.zzt(zzg);
                    break;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS") && (zzg2 = zzgbt.zzg(this.zzb, 10)) != null) {
                    zzarVar.zzs(zzg2);
                    break;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER") && (zzg3 = zzgbt.zzg(this.zzb, 10)) != null) {
                    zzarVar.zzu(zzg3);
                    break;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    zzarVar.zzd(this.zzb);
                    break;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    zzarVar.zzj(this.zzb);
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    zzarVar.zzr(this.zzb);
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    zzarVar.zzh(this.zzb);
                    break;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER") && (zzg4 = zzgbt.zzg(this.zzb, 10)) != null) {
                    zzarVar.zzi(zzg4);
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    zzarVar.zzc(this.zzb);
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    zzarVar.zze(this.zzb);
                    break;
                }
                break;
        }
    }
}
