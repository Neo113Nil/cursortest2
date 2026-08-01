package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzbjh implements zzbkd {
    zzbjh() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzbkd
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcgv zzcgvVar = (zzcgv) obj;
        WindowManager windowManager = (WindowManager) zzcgvVar.getContext().getSystemService("window");
        com.google.android.gms.ads.internal.zzt.zzp();
        DisplayMetrics zzs = com.google.android.gms.ads.internal.util.zzt.zzs(windowManager);
        int i = zzs.widthPixels;
        int i2 = zzs.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        ((View) zzcgvVar).getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i2));
        zzcgvVar.zzd("locationReady", hashMap);
        zzcbn.zzj("GET LOCATION COMPILED");
    }
}
