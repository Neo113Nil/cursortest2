package com.google.android.gms.ads.internal.util;

import android.R;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.internal.ads.zzayp;
import com.google.android.gms.internal.ads.zzcbn;
import com.google.android.gms.internal.ads.zzcgv;
import com.google.android.gms.internal.ads.zzchc;
import com.google.android.gms.internal.ads.zzchz;
import com.google.android.gms.internal.ads.zzefa;
import java.io.InputStream;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public class zzu extends zzab {
    public zzu() {
        super(null);
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final int zza() {
        return R.style.Theme.Material.Dialog.Alert;
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final CookieManager zzb(Context context) {
        com.google.android.gms.ads.internal.zzt.zzp();
        if (zzt.zzE()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            zzcbn.zzh("Failed to obtain CookieManager.", th);
            com.google.android.gms.ads.internal.zzt.zzo().zzv(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final WebResourceResponse zzc(String str, String str2, int i, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i, str3, map, inputStream);
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final zzchc zzd(zzcgv zzcgvVar, zzayp zzaypVar, boolean z, zzefa zzefaVar) {
        return new zzchz(zzcgvVar, zzaypVar, z, zzefaVar);
    }
}
