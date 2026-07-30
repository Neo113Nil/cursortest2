package com.appsflyer.internal;

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public interface AFb1iSDK {
    public static final AFa1zSDK AFa1zSDK = AFa1zSDK.values;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public interface AFa1wSDK {
        void AFKeystoreWrapper(Context context);

        void values(Activity activity);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class AFa1zSDK {
        static final /* synthetic */ AFa1zSDK values = new AFa1zSDK();
        private static long AFKeystoreWrapper = 500;

        private AFa1zSDK() {
        }

        public static long valueOf() {
            return AFKeystoreWrapper;
        }
    }

    void AFInAppEventParameterName(Context context, AFa1wSDK aFa1wSDK);

    boolean AFKeystoreWrapper();

    void valueOf(Context context);
}
