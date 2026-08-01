package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzchm implements zzbkd {
    final /* synthetic */ zzcho zza;

    zzchm(zzcho zzchoVar) {
        this.zza = zzchoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        int i;
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int parseInt = Integer.parseInt(str);
                synchronized (this.zza) {
                    zzcho zzchoVar = this.zza;
                    i = zzchoVar.zzG;
                    if (i != parseInt) {
                        zzchoVar.zzG = parseInt;
                        this.zza.requestLayout();
                    }
                }
            } catch (Exception e) {
                zzcbn.zzk("Exception occurred while getting webview content height", e);
            }
        }
    }
}
