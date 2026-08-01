package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbiw implements zzbkd {
    @Override // com.google.android.gms.internal.ads.zzbkd
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcgv zzcgvVar = (zzcgv) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                zzcbn.zzj("No label given for CSI tick.");
                return;
            }
            if (TextUtils.isEmpty(str4)) {
                zzcbn.zzj("No timestamp given for CSI tick.");
                return;
            }
            try {
                long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() + (Long.parseLong(str4) - com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis());
                if (true == TextUtils.isEmpty(str3)) {
                    str3 = "native:view_load";
                }
                zzcgvVar.zzm().zzc(str2, str3, elapsedRealtime);
                return;
            } catch (NumberFormatException e) {
                zzcbn.zzk("Malformed timestamp for CSI tick.", e);
                return;
            }
        }
        if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                zzcbn.zzj("No value given for CSI experiment.");
                return;
            } else {
                zzcgvVar.zzm().zza().zzd("e", str5);
                return;
            }
        }
        if ("extra".equals(str)) {
            String str6 = (String) map.get("name");
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                zzcbn.zzj("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                zzcbn.zzj("No name given for CSI extra.");
            } else {
                zzcgvVar.zzm().zza().zzd(str6, str7);
            }
        }
    }
}
