package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzclu implements zzcky {
    private final CookieManager zza;

    public zzclu(Context context) {
        this.zza = com.google.android.gms.ads.internal.zzt.zzf().zza(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcky
    public final void zza(Map map) {
        CookieManager cookieManager = this.zza;
        if (cookieManager == null) {
            return;
        }
        if (((String) map.get("clear")) == null) {
            String str = (String) map.get("cookie");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            cookieManager.setCookie((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbd), str);
            return;
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbd);
        String cookie = cookieManager.getCookie(str2);
        if (cookie != null) {
            List zze = zzghq.zza(zzggo.zzc(';')).zze(cookie);
            for (int i = 0; i < zze.size(); i++) {
                Iterator it = zzghq.zza(zzggo.zzc('=')).zzd((String) zze.get(i)).iterator();
                it.getClass();
                if (!it.hasNext()) {
                    StringBuilder sb = new StringBuilder(String.valueOf(0).length() + 70);
                    sb.append("position (0) must be less than the number of elements that remained (");
                    sb.append(0);
                    sb.append(")");
                    throw new IndexOutOfBoundsException(sb.toString());
                }
                String str3 = (String) it.next();
                String str4 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzaP);
                String.valueOf(str3);
                String.valueOf(str4);
                cookieManager.setCookie(str2, String.valueOf(str3).concat(String.valueOf(str4)));
            }
        }
    }
}
