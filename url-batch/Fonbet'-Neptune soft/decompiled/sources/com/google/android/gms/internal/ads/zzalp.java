package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.regex.Pattern;
import kotlinx.coroutines.DebugKt;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes3.dex */
final class zzalp {
    private static final Pattern zzd = Pattern.compile("\\s+");
    private static final zzfyv zze = zzfyv.zzp(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "none");
    private static final zzfyv zzf = zzfyv.zzq("dot", "sesame", "circle");
    private static final zzfyv zzg = zzfyv.zzp("filled", "open");
    private static final zzfyv zzh = zzfyv.zzq("after", "before", "outside");
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzalp(int i, int i2, int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cf, code lost:
    
        if (r7.equals("dot") == false) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzalp zza(String str) {
        int i;
        if (str == null) {
            return null;
        }
        String zza = zzfuv.zza(str.trim());
        if (zza.isEmpty()) {
            return null;
        }
        zzfyv zzm = zzfyv.zzm(TextUtils.split(zza, zzd));
        String str2 = (String) zzfyw.zza(zzgas.zzb(zzh, zzm), "outside");
        int hashCode = str2.hashCode();
        int i2 = 2;
        if (hashCode != -1106037339) {
            if (hashCode == 92734940 && str2.equals("after")) {
                i = 2;
            }
            i = 1;
        } else {
            if (str2.equals("outside")) {
                i = -2;
            }
            i = 1;
        }
        zzgaq zzb = zzgas.zzb(zze, zzm);
        int i3 = 0;
        if (zzb.isEmpty()) {
            zzgaq zzb2 = zzgas.zzb(zzg, zzm);
            zzgaq zzb3 = zzgas.zzb(zzf, zzm);
            if (!zzb2.isEmpty() || !zzb3.isEmpty()) {
                String str3 = (String) zzfyw.zza(zzb2, "filled");
                i3 = (str3.hashCode() == 3417674 && str3.equals("open")) ? 2 : 1;
                String str4 = (String) zzfyw.zza(zzb3, "circle");
                int hashCode2 = str4.hashCode();
                if (hashCode2 != -905816648) {
                    if (hashCode2 == 99657) {
                    }
                    i2 = 1;
                } else {
                    if (str4.equals("sesame")) {
                        i2 = 3;
                    }
                    i2 = 1;
                }
            }
            i2 = -1;
        } else {
            String str5 = (String) zzb.iterator().next();
            if (str5.hashCode() == 3387192 && str5.equals("none")) {
                i2 = 0;
            }
            i2 = -1;
        }
        return new zzalp(i2, i3, i);
    }
}
