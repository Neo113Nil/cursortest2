package com.appsflyer.internal;

import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class AFi1aSDK {
    public String AFInAppEventParameterName;
    public final WeakReference<Context> valueOf;

    public AFi1aSDK(Context context) {
        this.valueOf = new WeakReference<>(context);
    }
}
