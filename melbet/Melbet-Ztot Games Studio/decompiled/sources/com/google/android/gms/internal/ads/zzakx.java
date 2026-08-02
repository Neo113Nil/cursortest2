package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import java.util.regex.Pattern;
import kotlinx.coroutines.DebugKt;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzakx {
    private static final Pattern zzd = Pattern.compile("\\s+");
    private static final zzfxw zze = zzfxw.zzp(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, DevicePublicKeyStringDef.NONE);
    private static final zzfxw zzf = zzfxw.zzq("dot", "sesame", "circle");
    private static final zzfxw zzg = zzfxw.zzp("filled", "open");
    private static final zzfxw zzh = zzfxw.zzq("after", "before", "outside");
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzakx(int i, int i2, int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    public static zzakx zza(String str) {
        char c;
        if (str == null) {
            return null;
        }
        String zza = zzfuf.zza(str.trim());
        if (zza.isEmpty()) {
            return null;
        }
        zzfxw zzm = zzfxw.zzm(TextUtils.split(zza, zzd));
        String str2 = (String) zzfxx.zza(zzfzt.zzb(zzh, zzm), "outside");
        int hashCode = str2.hashCode();
        int i = -1;
        int i2 = 0;
        if (hashCode != -1106037339) {
            if (hashCode == 92734940 && str2.equals("after")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str2.equals("outside")) {
                c = 1;
            }
            c = 65535;
        }
        int i3 = c != 0 ? c != 1 ? 1 : -2 : 2;
        zzfzs zzb = zzfzt.zzb(zze, zzm);
        if (zzb.isEmpty()) {
            zzfzs zzb2 = zzfzt.zzb(zzg, zzm);
            zzfzs zzb3 = zzfzt.zzb(zzf, zzm);
            if (!zzb2.isEmpty() || !zzb3.isEmpty()) {
                String str3 = (String) zzfxx.zza(zzb2, "filled");
                int i4 = (str3.hashCode() == 3417674 && str3.equals("open")) ? 2 : 1;
                String str4 = (String) zzfxx.zza(zzb3, "circle");
                int hashCode2 = str4.hashCode();
                if (hashCode2 != -905816648) {
                    if (hashCode2 == 99657 && str4.equals("dot")) {
                        i = 0;
                    }
                } else if (str4.equals("sesame")) {
                    i = 1;
                }
                if (i == 0) {
                    i2 = i4;
                    i = 2;
                } else if (i != 1) {
                    i2 = i4;
                    i = 1;
                } else {
                    i = 3;
                    i2 = i4;
                }
            }
        } else {
            String str5 = (String) zzb.iterator().next();
            if (str5.hashCode() == 3387192 && str5.equals(DevicePublicKeyStringDef.NONE)) {
                i = 0;
            }
        }
        return new zzakx(i, i2, i3);
    }
}
