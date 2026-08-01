package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import io.ktor.http.LinkHeader;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbkv implements zzbkd {
    private final Context zza;

    public zzbkv(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) {
        if (!map.containsKey("text") || TextUtils.isEmpty((CharSequence) map.get("text"))) {
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("Opening Share Sheet with text: ".concat(String.valueOf((String) map.get("text"))));
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", (String) map.get("text"));
        if (map.containsKey(LinkHeader.Parameters.Title)) {
            intent.putExtra("android.intent.extra.TITLE", (String) map.get(LinkHeader.Parameters.Title));
        }
        try {
            com.google.android.gms.ads.internal.zzt.zzp();
            com.google.android.gms.ads.internal.util.zzt.zzS(this.zza, intent);
        } catch (RuntimeException e) {
            zzcbn.zzk("Failed to open Share Sheet", e);
            com.google.android.gms.ads.internal.zzt.zzo().zzw(e, "ShareSheetGmsgHandler.onGmsg");
        }
    }
}
