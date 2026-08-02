package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzbib implements zzbix {
    zzbib() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzbix
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcej zzcejVar = (zzcej) obj;
        WindowManager windowManager = (WindowManager) zzcejVar.getContext().getSystemService("window");
        com.google.android.gms.ads.internal.zzu.zzp();
        DisplayMetrics zzt = com.google.android.gms.ads.internal.util.zzt.zzt(windowManager);
        int i = zzt.widthPixels;
        int i2 = zzt.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        ((View) zzcejVar).getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i2));
        zzcejVar.zzd("locationReady", hashMap);
        com.google.android.gms.ads.internal.util.client.zzm.zzj("GET LOCATION COMPILED");
    }
}
