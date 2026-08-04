package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.facebook.react.uimanager.ViewProps;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzakr {
    private static final Pattern zzd = Pattern.compile("\\s+");
    private static final zzgke zze = zzgke.zzj("auto", ViewProps.NONE);
    private static final zzgke zzf = zzgke.zzk("dot", "sesame", "circle");
    private static final zzgke zzg = zzgke.zzj("filled", "open");
    private static final zzgke zzh = zzgke.zzk("after", "before", "outside");
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzakr(int i, int i2, int i3) {
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
    public static zzakr zza(String str) {
        int i;
        if (str == null) {
            return null;
        }
        String zza = zzggj.zza(str.trim());
        if (zza.isEmpty()) {
            return null;
        }
        zzgke zzp = zzgke.zzp(TextUtils.split(zza, zzd));
        String str2 = (String) zzgkf.zzb(zzglz.zza(zzh, zzp), "outside");
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
        zzgly zza2 = zzglz.zza(zze, zzp);
        int i3 = 0;
        if (zza2.isEmpty()) {
            zzgly zza3 = zzglz.zza(zzg, zzp);
            zzgly zza4 = zzglz.zza(zzf, zzp);
            if (!zza3.isEmpty() || !zza4.isEmpty()) {
                String str3 = (String) zzgkf.zzb(zza3, "filled");
                i3 = (str3.hashCode() == 3417674 && str3.equals("open")) ? 2 : 1;
                String str4 = (String) zzgkf.zzb(zza4, "circle");
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
            String str5 = (String) zza2.iterator().next();
            if (str5.hashCode() == 3387192 && str5.equals(ViewProps.NONE)) {
                i2 = 0;
            }
            i2 = -1;
        }
        return new zzakr(i2, i3, i);
    }
}
