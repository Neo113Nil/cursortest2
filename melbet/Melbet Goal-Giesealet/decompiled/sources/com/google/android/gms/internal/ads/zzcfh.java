package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.facebook.react.uimanager.ViewProps;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzcfh implements zzbjl {
    final /* synthetic */ zzcfn zza;

    zzcfh(zzcfn zzcfnVar) {
        Objects.requireNonNull(zzcfnVar);
        this.zza = zzcfnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        if (map != null) {
            String str = (String) map.get(ViewProps.HEIGHT);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int parseInt = Integer.parseInt(str);
                zzcfn zzcfnVar = this.zza;
                synchronized (zzcfnVar) {
                    if (zzcfnVar.zzaX() != parseInt) {
                        zzcfnVar.zzaY(parseInt);
                        zzcfnVar.requestLayout();
                    }
                }
            } catch (Exception e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Exception occurred while getting webview content height", e);
            }
        }
    }
}
