package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.net.Uri;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzof {
    static final zzfxu zzb;
    private final SparseArray zzd;
    private final int zze;
    public static final zzof zza = new zzof(zzfxr.zzn(zzod.zza));
    private static final zzfxr zzc = zzfxr.zzp(2, 5, 6);

    static {
        zzfxt zzfxtVar = new zzfxt();
        zzfxtVar.zza(5, 6);
        zzfxtVar.zza(17, 6);
        zzfxtVar.zza(7, 6);
        zzfxtVar.zza(30, 10);
        zzfxtVar.zza(18, 6);
        zzfxtVar.zza(6, 8);
        zzfxtVar.zza(8, 8);
        zzfxtVar.zza(14, 8);
        zzb = zzfxtVar.zzc();
    }

    private zzof(List list) {
        this.zzd = new SparseArray();
        for (int i = 0; i < list.size(); i++) {
            zzod zzodVar = (zzod) list.get(i);
            this.zzd.put(zzodVar.zzb, zzodVar);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzd.size(); i3++) {
            i2 = Math.max(i2, ((zzod) this.zzd.valueAt(i3)).zzc);
        }
        this.zze = i2;
    }

    static Uri zza() {
        if (zzf()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    static zzof zzc(Context context, zzh zzhVar, zzon zzonVar) {
        return zzd(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), zzhVar, zzonVar);
    }

    static zzof zzd(Context context, Intent intent, zzh zzhVar, zzon zzonVar) {
        Object systemService = context.getSystemService("audio");
        systemService.getClass();
        AudioManager audioManager = (AudioManager) systemService;
        if (zzonVar == null) {
            zzonVar = zzet.zza >= 33 ? zzoc.zzb(audioManager, zzhVar) : null;
        }
        if (zzet.zza >= 33 && (zzet.zzN(context) || zzet.zzJ(context))) {
            return zzoc.zza(audioManager, zzhVar);
        }
        if (zzet.zza >= 23 && zzoa.zza(audioManager, zzonVar)) {
            return zza;
        }
        zzfxv zzfxvVar = new zzfxv();
        zzfxvVar.zzf((Object) 2);
        if (zzet.zza >= 29 && (zzet.zzN(context) || zzet.zzJ(context))) {
            zzfxvVar.zzh(zzob.zzb(zzhVar));
            return new zzof(zze(zzgap.zzh(zzfxvVar.zzi()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if ((z || zzf()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            zzfxvVar.zzh(zzc);
        }
        if (intent == null || z || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new zzof(zze(zzgap.zzh(zzfxvVar.zzi()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            zzfxvVar.zzh(zzgap.zzg(intArrayExtra));
        }
        return new zzof(zze(zzgap.zzh(zzfxvVar.zzi()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    private static zzfxr zze(int[] iArr, int i) {
        zzfxo zzfxoVar = new zzfxo();
        for (int i2 : iArr) {
            zzfxoVar.zzf(new zzod(i2, i));
        }
        return zzfxoVar.zzi();
    }

    private static boolean zzf() {
        return "Amazon".equals(zzet.zzc) || "Xiaomi".equals(zzet.zzc);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001a, code lost:
    
        if (r1 != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean contentEquals;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzof)) {
            return false;
        }
        zzof zzofVar = (zzof) obj;
        SparseArray sparseArray = this.zzd;
        SparseArray sparseArray2 = zzofVar.zzd;
        if (zzet.zza >= 31) {
            contentEquals = sparseArray.contentEquals(sparseArray2);
        } else {
            int size = sparseArray.size();
            if (size == sparseArray2.size()) {
                for (int i = 0; i < size; i++) {
                    if (!Objects.equals(sparseArray.valueAt(i), sparseArray2.get(sparseArray.keyAt(i)))) {
                        break;
                    }
                }
                if (this.zze == zzofVar.zze) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = zzet.zza;
        SparseArray sparseArray = this.zzd;
        if (i2 >= 31) {
            i = sparseArray.contentHashCode();
        } else {
            int i3 = 17;
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                i3 = (((i3 * 31) + sparseArray.keyAt(i4)) * 31) + Objects.hashCode(sparseArray.valueAt(i4));
            }
            i = i3;
        }
        return this.zze + (i * 31);
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.zze + ", audioProfiles=" + this.zzd.toString() + "]";
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009d, code lost:
    
        if (r6 != 5) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0046, code lost:
    
        if (com.google.android.gms.internal.ads.zzet.zzH(r8.zzd, 30) == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c8 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair zzb(zzaf zzafVar, zzh zzhVar) {
        int zzh;
        String str = zzafVar.zzm;
        str.getClass();
        int zza2 = zzbn.zza(str, zzafVar.zzj);
        if (!zzb.containsKey(Integer.valueOf(zza2))) {
            return null;
        }
        int i = 6;
        if (zza2 == 18) {
            if (zzet.zzH(this.zzd, 18)) {
                zza2 = 18;
            } else {
                zza2 = 6;
                if (!zzet.zzH(this.zzd, zza2)) {
                    return null;
                }
                zzod zzodVar = (zzod) this.zzd.get(zza2);
                zzodVar.getClass();
                int i2 = zzafVar.zzz;
                if (i2 == -1 || zza2 == 18) {
                    int i3 = zzafVar.zzA;
                    if (i3 == -1) {
                        i3 = 48000;
                    }
                    i2 = zzodVar.zza(i3, zzhVar);
                } else if (!zzafVar.zzm.equals("audio/vnd.dts.uhd;profile=p2") || zzet.zza >= 33) {
                    if (!zzodVar.zzb(i2)) {
                        return null;
                    }
                } else if (i2 > 10) {
                    return null;
                }
                if (zzet.zza <= 28) {
                    if (i2 == 7) {
                        i = 8;
                    } else if (i2 != 3) {
                        if (i2 != 4) {
                        }
                    }
                    if (zzet.zza <= 26 && "fugu".equals(zzet.zzb) && i == 1) {
                        i = 2;
                    }
                    zzh = zzet.zzh(i);
                    if (zzh == 0) {
                        return Pair.create(Integer.valueOf(zza2), Integer.valueOf(zzh));
                    }
                    return null;
                }
                i = i2;
                if (zzet.zza <= 26) {
                    i = 2;
                }
                zzh = zzet.zzh(i);
                if (zzh == 0) {
                }
            }
        }
        if (zza2 == 8) {
            if (zzet.zzH(this.zzd, 8)) {
                zza2 = 8;
            }
            zza2 = 7;
            if (!zzet.zzH(this.zzd, zza2)) {
            }
        }
        if (zza2 == 30) {
        }
        if (!zzet.zzH(this.zzd, zza2)) {
        }
    }
}
