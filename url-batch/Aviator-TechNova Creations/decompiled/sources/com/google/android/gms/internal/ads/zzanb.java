package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.facebook.appevents.integrity.IntegrityManager;
import java.util.regex.Pattern;
import kotlinx.coroutines.DebugKt;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzanb {
    private static final Pattern zzd = Pattern.compile("\\s+");
    private static final zzgup zze = zzgup.zzj(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, IntegrityManager.INTEGRITY_TYPE_NONE);
    private static final zzgup zzf = zzgup.zzk("dot", "sesame", "circle");
    private static final zzgup zzg = zzgup.zzj("filled", "open");
    private static final zzgup zzh = zzgup.zzk("after", "before", "outside");
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzanb(int i, int i2, int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    public static zzanb zza(String str) {
        boolean z;
        if (str == null) {
            return null;
        }
        String zza = zzgql.zza(str.trim());
        if (zza.isEmpty()) {
            return null;
        }
        zzgup zzp = zzgup.zzp(TextUtils.split(zza, zzd));
        String str2 = (String) zzgut.zzb(zzgwp.zza(zzh, zzp), "outside");
        int hashCode = str2.hashCode();
        int i = -1;
        int i2 = 0;
        if (hashCode != -1106037339) {
            if (hashCode == 92734940 && str2.equals("after")) {
                z = false;
            }
            z = -1;
        } else {
            if (str2.equals("outside")) {
                z = true;
            }
            z = -1;
        }
        int i3 = z ? !z ? 1 : -2 : 2;
        zzgwo zza2 = zzgwp.zza(zze, zzp);
        if (zza2.isEmpty()) {
            zzgwo zza3 = zzgwp.zza(zzg, zzp);
            zzgwo zza4 = zzgwp.zza(zzf, zzp);
            if (!zza3.isEmpty() || !zza4.isEmpty()) {
                String str3 = (String) zzgut.zzb(zza3, "filled");
                int i4 = (str3.hashCode() == 3417674 && str3.equals("open")) ? 2 : 1;
                String str4 = (String) zzgut.zzb(zza4, "circle");
                int hashCode2 = str4.hashCode();
                if (hashCode2 != -905816648) {
                    if (hashCode2 == 99657 && str4.equals("dot")) {
                        i = 0;
                    }
                } else if (str4.equals("sesame")) {
                    i = 1;
                }
                if (i == 0) {
                    i = 2;
                } else if (i != 1) {
                    i2 = i4;
                    i = 1;
                } else {
                    i = 3;
                }
                i2 = i4;
            }
        } else {
            String str5 = (String) zza2.iterator().next();
            if (str5.hashCode() == 3387192 && str5.equals(IntegrityManager.INTEGRITY_TYPE_NONE)) {
                i = 0;
            }
        }
        return new zzanb(i, i2, i3);
    }
}
