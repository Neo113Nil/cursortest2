package com.appsflyer.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFg1qSDK implements AFg1vSDK {
    private Map<String, String> getMonetizationNetwork = new LinkedHashMap();

    @Override // com.appsflyer.internal.AFg1vSDK
    public final Map<String, String> getMediationNetwork(Context context) {
        context.getClass();
        if (this.getMonetizationNetwork.isEmpty()) {
            Resources resources = context.getResources();
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            int i3 = resources.getConfiguration().screenLayout & 15;
            this.getMonetizationNetwork.put("xdp", String.valueOf(displayMetrics.xdpi));
            this.getMonetizationNetwork.put("ydp", String.valueOf(displayMetrics.ydpi));
            this.getMonetizationNetwork.put("x_px", String.valueOf(displayMetrics.widthPixels));
            this.getMonetizationNetwork.put("y_px", String.valueOf(displayMetrics.heightPixels));
            this.getMonetizationNetwork.put("d_dpi", String.valueOf(displayMetrics.densityDpi));
            this.getMonetizationNetwork.put("size", String.valueOf(i3));
        }
        return this.getMonetizationNetwork;
    }
}
