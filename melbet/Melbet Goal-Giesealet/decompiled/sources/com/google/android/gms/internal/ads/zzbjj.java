package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final /* synthetic */ class zzbjj implements zzbjl {
    static final /* synthetic */ zzbjj zza = new zzbjj();

    private /* synthetic */ zzbjj() {
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* synthetic */ void zza(Object obj, Map map) {
        zzcfw zzcfwVar = (zzcfw) obj;
        zzbjl zzbjlVar = zzbjk.zza;
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] split = str.split(",");
        HashMap hashMap = new HashMap();
        PackageManager packageManager = zzcfwVar.getContext().getPackageManager();
        for (String str2 : split) {
            String[] split2 = str2.split(";", 2);
            boolean z = true;
            if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) == null) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            hashMap.put(str2, valueOf);
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 14 + valueOf.toString().length());
            sb.append("/canOpenURLs;");
            sb.append(str2);
            sb.append(";");
            sb.append(valueOf);
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        ((zzbmh) zzcfwVar).zze("openableURLs", hashMap);
    }
}
