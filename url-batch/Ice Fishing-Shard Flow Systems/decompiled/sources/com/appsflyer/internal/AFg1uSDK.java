package com.appsflyer.internal;

import android.content.Context;
import java.util.Map;
import kotlin.Metadata;

@Metadata
/* loaded from: classes.dex */
public interface AFg1uSDK {
    public static final AFa1zSDK AFa1zSDK = AFa1zSDK.getRevenue;

    public static final class AFa1zSDK {
        static final /* synthetic */ AFa1zSDK getRevenue = new AFa1zSDK();

        private AFa1zSDK() {
        }
    }

    Map<String, String> getMonetizationNetwork(Context context);
}
