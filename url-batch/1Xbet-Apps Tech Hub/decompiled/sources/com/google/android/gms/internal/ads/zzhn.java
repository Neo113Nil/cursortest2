package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public interface zzhn extends zzgq {
    public static final zzftz zza = new zzftz() { // from class: com.google.android.gms.internal.ads.zzhh
        @Override // com.google.android.gms.internal.ads.zzftz
        public final boolean zza(Object obj) {
            String str = (String) obj;
            if (str == null) {
                return false;
            }
            String zza2 = zzftf.zza(str);
            if (TextUtils.isEmpty(zza2)) {
                return false;
            }
            return ((zza2.contains("text") && !zza2.contains("text/vtt")) || zza2.contains("html") || zza2.contains("xml")) ? false : true;
        }
    };

    @Override // com.google.android.gms.internal.ads.zzgq
    Map zze();
}
