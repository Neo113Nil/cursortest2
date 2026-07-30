package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.signature.SignatureVisitor;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzcrh implements zzcql {
    private final CookieManager zza;

    public zzcrh(Context context) {
        this.zza = com.google.android.gms.ads.internal.zzt.zzf().zza(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcql
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
            cookieManager.setCookie((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbu), str);
            return;
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbu);
        String cookie = cookieManager.getCookie(str2);
        if (cookie != null) {
            List zze = zzgrr.zza(zzgqq.zzc(';')).zze(cookie);
            for (int i = 0; i < zze.size(); i++) {
                Iterator it = zzgrr.zza(zzgqq.zzc(SignatureVisitor.INSTANCEOF)).zzd((String) zze.get(i)).iterator();
                it.getClass();
                if (!it.hasNext()) {
                    StringBuilder sb = new StringBuilder(String.valueOf(0).length() + 70);
                    sb.append("position (0) must be less than the number of elements that remained (");
                    sb.append(0);
                    sb.append(")");
                    throw new IndexOutOfBoundsException(sb.toString());
                }
                String str3 = (String) it.next();
                String str4 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbg);
                String.valueOf(str3);
                String.valueOf(str4);
                cookieManager.setCookie(str2, String.valueOf(str3).concat(String.valueOf(str4)));
            }
        }
    }
}
