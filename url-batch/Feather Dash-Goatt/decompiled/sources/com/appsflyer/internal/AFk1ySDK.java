package com.appsflyer.internal;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFk1ySDK {
    public String getMonetizationNetwork;
    public final WeakReference<Context> getRevenue;

    public AFk1ySDK(Context context) {
        this.getRevenue = new WeakReference<>(context);
    }
}
