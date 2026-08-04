package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzbif implements zzbjl {
    zzbif() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcek zzcekVar = (zzcek) obj;
        WindowManager windowManager = (WindowManager) zzcekVar.getContext().getSystemService("window");
        com.google.android.gms.ads.internal.zzt.zzc();
        DisplayMetrics zzx = com.google.android.gms.ads.internal.util.zzs.zzx(windowManager);
        int i = zzx.widthPixels;
        int i2 = zzx.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        ((View) zzcekVar).getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i2));
        zzcekVar.zze("locationReady", hashMap);
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("GET LOCATION COMPILED");
    }
}
