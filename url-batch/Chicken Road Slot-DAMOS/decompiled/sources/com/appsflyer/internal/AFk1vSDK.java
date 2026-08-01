package com.appsflyer.internal;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFk1vSDK {
    public String getCurrencyIso4217Code;
    public final WeakReference<Context> getMonetizationNetwork;

    public AFk1vSDK(Context context) {
        this.getMonetizationNetwork = new WeakReference<>(context);
    }
}
