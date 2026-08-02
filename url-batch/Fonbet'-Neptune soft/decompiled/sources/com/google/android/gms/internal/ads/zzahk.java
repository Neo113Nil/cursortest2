package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes3.dex */
public final class zzahk extends zzahf {
    public final String zza;
    public final zzfyq zzb;

    public zzahk(String str, String str2, List list) {
        super(str);
        zzdd.zzd(!list.isEmpty());
        this.zza = str2;
        zzfyq zzl = zzfyq.zzl(list);
        this.zzb = zzl;
    }

    private static List zzb(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzahk zzahkVar = (zzahk) obj;
            if (Objects.equals(this.zzf, zzahkVar.zzf) && Objects.equals(this.zza, zzahkVar.zza) && this.zzb.equals(zzahkVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzf.hashCode() + 527;
        String str = this.zza;
        return (((hashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.zzb.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzahf
    public final String toString() {
        return this.zzf + ": description=" + this.zza + ": values=" + String.valueOf(this.zzb);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0181 A[Catch: NumberFormatException | StringIndexOutOfBoundsException -> 0x0203, TryCatch #0 {NumberFormatException | StringIndexOutOfBoundsException -> 0x0203, blocks: (B:6:0x0123, B:13:0x0178, B:15:0x0181, B:16:0x018d, B:71:0x01dc), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x018c  */
    @Override // com.google.android.gms.internal.ads.zzahf, com.google.android.gms.internal.ads.zzau
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzar zzarVar) {
        String str = this.zzf;
        try {
            switch (str.hashCode()) {
                case 82815:
                    if (!str.equals("TAL")) {
                    }
                    zzarVar.zzd((CharSequence) this.zzb.get(0));
                    break;
                case 82878:
                    if (!str.equals("TCM")) {
                    }
                    zzarVar.zzf((CharSequence) this.zzb.get(0));
                    break;
                case 82897:
                    if (!str.equals("TDA")) {
                    }
                    String str2 = (String) this.zzb.get(0);
                    int parseInt = Integer.parseInt(str2.substring(2, 4));
                    int parseInt2 = Integer.parseInt(str2.substring(0, 2));
                    zzarVar.zzl(Integer.valueOf(parseInt));
                    zzarVar.zzk(Integer.valueOf(parseInt2));
                    break;
                case 83253:
                    if (!str.equals("TP1")) {
                    }
                    zzarVar.zze((CharSequence) this.zzb.get(0));
                    break;
                case 83254:
                    if (!str.equals("TP2")) {
                    }
                    zzarVar.zzc((CharSequence) this.zzb.get(0));
                    break;
                case 83255:
                    if (!str.equals("TP3")) {
                    }
                    zzarVar.zzg((CharSequence) this.zzb.get(0));
                    break;
                case 83341:
                    if (!str.equals("TRK")) {
                    }
                    String str3 = (String) this.zzb.get(0);
                    String str4 = zzex.zza;
                    String[] split = str3.split("/", -1);
                    int parseInt3 = Integer.parseInt(split[0]);
                    Integer valueOf = split.length <= 1 ? Integer.valueOf(Integer.parseInt(split[1])) : null;
                    zzarVar.zzu(Integer.valueOf(parseInt3));
                    zzarVar.zzt(valueOf);
                    break;
                case 83378:
                    if (!str.equals("TT2")) {
                    }
                    zzarVar.zzr((CharSequence) this.zzb.get(0));
                    break;
                case 83536:
                    if (!str.equals("TXT")) {
                    }
                    zzarVar.zzv((CharSequence) this.zzb.get(0));
                    break;
                case 83552:
                    if (!str.equals("TYE")) {
                    }
                    zzarVar.zzm(Integer.valueOf(Integer.parseInt((String) this.zzb.get(0))));
                    break;
                case 2567331:
                    if (!str.equals("TALB")) {
                    }
                    zzarVar.zzd((CharSequence) this.zzb.get(0));
                    break;
                case 2569357:
                    if (!str.equals("TCOM")) {
                    }
                    zzarVar.zzf((CharSequence) this.zzb.get(0));
                    break;
                case 2569358:
                    if (str.equals("TCON")) {
                        zzfyq zzfyqVar = this.zzb;
                        Integer zzg = zzgbt.zzg((String) zzfyqVar.get(0), 10);
                        if (zzg != null) {
                            String zza = zzahg.zza(zzg.intValue());
                            if (zza != null) {
                                zzarVar.zzj(zza);
                                break;
                            }
                        } else {
                            zzarVar.zzj((CharSequence) zzfyqVar.get(0));
                            break;
                        }
                    }
                    break;
                case 2569891:
                    if (!str.equals("TDAT")) {
                    }
                    String str22 = (String) this.zzb.get(0);
                    int parseInt4 = Integer.parseInt(str22.substring(2, 4));
                    int parseInt22 = Integer.parseInt(str22.substring(0, 2));
                    zzarVar.zzl(Integer.valueOf(parseInt4));
                    zzarVar.zzk(Integer.valueOf(parseInt22));
                    break;
                case 2570401:
                    if (str.equals("TDRC")) {
                        List zzb = zzb((String) this.zzb.get(0));
                        int size = zzb.size();
                        if (size != 1) {
                            if (size != 2) {
                                if (size == 3) {
                                    zzarVar.zzk((Integer) zzb.get(2));
                                }
                            }
                            zzarVar.zzl((Integer) zzb.get(1));
                        }
                        zzarVar.zzm((Integer) zzb.get(0));
                        break;
                    }
                    break;
                case 2570410:
                    if (str.equals("TDRL")) {
                        List zzb2 = zzb((String) this.zzb.get(0));
                        int size2 = zzb2.size();
                        if (size2 != 1) {
                            if (size2 != 2) {
                                if (size2 == 3) {
                                    zzarVar.zzn((Integer) zzb2.get(2));
                                }
                            }
                            zzarVar.zzo((Integer) zzb2.get(1));
                        }
                        zzarVar.zzp((Integer) zzb2.get(0));
                        break;
                    }
                    break;
                case 2571565:
                    if (!str.equals("TEXT")) {
                    }
                    zzarVar.zzv((CharSequence) this.zzb.get(0));
                    break;
                case 2575251:
                    if (!str.equals("TIT2")) {
                    }
                    zzarVar.zzr((CharSequence) this.zzb.get(0));
                    break;
                case 2581512:
                    if (!str.equals("TPE1")) {
                    }
                    zzarVar.zze((CharSequence) this.zzb.get(0));
                    break;
                case 2581513:
                    if (!str.equals("TPE2")) {
                    }
                    zzarVar.zzc((CharSequence) this.zzb.get(0));
                    break;
                case 2581514:
                    if (!str.equals("TPE3")) {
                    }
                    zzarVar.zzg((CharSequence) this.zzb.get(0));
                    break;
                case 2583398:
                    if (!str.equals("TRCK")) {
                    }
                    String str32 = (String) this.zzb.get(0);
                    String str42 = zzex.zza;
                    String[] split2 = str32.split("/", -1);
                    int parseInt32 = Integer.parseInt(split2[0]);
                    if (split2.length <= 1) {
                    }
                    zzarVar.zzu(Integer.valueOf(parseInt32));
                    zzarVar.zzt(valueOf);
                    break;
                case 2590194:
                    if (!str.equals("TYER")) {
                    }
                    zzarVar.zzm(Integer.valueOf(Integer.parseInt((String) this.zzb.get(0))));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }
}
