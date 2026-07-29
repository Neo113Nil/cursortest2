package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.zzaqw;
import com.youappi.sdk.net.model.VideoEvent;
import java.util.Map;

/* loaded from: classes.dex */
final class zzs implements zzv<zzaqw> {
    zzs() {
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzv
    public final /* synthetic */ void zza(zzaqw zzaqwVar, Map map) {
        zzaqw zzaqwVar2 = zzaqwVar;
        String str = (String) map.get("action");
        if (VideoEvent.EVENT_PAUSE.equals(str)) {
            zzaqwVar2.zzcl();
        } else if (VideoEvent.EVENT_RESUME.equals(str)) {
            zzaqwVar2.zzcm();
        }
    }
}
