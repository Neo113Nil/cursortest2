package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.aiming.mdt.utils.Constants;
import com.tapjoy.TapjoyConstants;
import com.umeng.commonsdk.proguard.d;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

@zzadh
/* loaded from: classes2.dex */
public final class zznm {
    private Context mContext;
    private String zzaej;
    private String zzbfx = (String) zzkb.zzik().zzd(zznk.zzawi);
    private Map<String, String> zzbfy = new LinkedHashMap();

    public zznm(Context context, String str) {
        this.mContext = null;
        this.zzaej = null;
        this.mContext = context;
        this.zzaej = str;
        this.zzbfy.put(d.ap, "gmob_sdk");
        this.zzbfy.put("v", Constants.ALL_LOAD);
        this.zzbfy.put(d.w, Build.VERSION.RELEASE);
        this.zzbfy.put(TapjoyConstants.TJC_SDK_PLACEMENT, Build.VERSION.SDK);
        Map<String, String> map = this.zzbfy;
        com.google.android.gms.ads.internal.zzbv.zzek();
        map.put(TapjoyConstants.TJC_NOTIFICATION_DEVICE_PREFIX, zzakk.zzri());
        this.zzbfy.put(TapjoyConstants.TJC_APP_PLACEMENT, context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        Map<String, String> map2 = this.zzbfy;
        com.google.android.gms.ads.internal.zzbv.zzek();
        map2.put("is_lite_sdk", zzakk.zzav(context) ? "1" : "0");
        Future<zzaga> zzq = com.google.android.gms.ads.internal.zzbv.zzev().zzq(this.mContext);
        try {
            zzq.get();
            this.zzbfy.put("network_coarse", Integer.toString(zzq.get().zzcjx));
            this.zzbfy.put("network_fine", Integer.toString(zzq.get().zzcjy));
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzbv.zzeo().zza(e, "CsiConfiguration.CsiConfiguration");
        }
    }

    final Context getContext() {
        return this.mContext;
    }

    final String zzfw() {
        return this.zzaej;
    }

    final String zzjd() {
        return this.zzbfx;
    }

    final Map<String, String> zzje() {
        return this.zzbfy;
    }
}
