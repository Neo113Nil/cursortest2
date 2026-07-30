package com.appsflyer.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFa1hSDK implements AFa1gSDK {
    private Map<String, String> valueOf = new LinkedHashMap();

    @Override // com.appsflyer.internal.AFa1gSDK
    public final Map<String, String> AFInAppEventType(Context context) {
        context.getClass();
        if (this.valueOf.isEmpty()) {
            Resources resources = context.getResources();
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            int i = resources.getConfiguration().screenLayout & 15;
            this.valueOf.put("xdp", String.valueOf(displayMetrics.xdpi));
            this.valueOf.put("ydp", String.valueOf(displayMetrics.ydpi));
            this.valueOf.put("x_px", String.valueOf(displayMetrics.widthPixels));
            this.valueOf.put("y_px", String.valueOf(displayMetrics.heightPixels));
            this.valueOf.put("d_dpi", String.valueOf(displayMetrics.densityDpi));
            this.valueOf.put("size", String.valueOf(i));
        }
        return this.valueOf;
    }
}
