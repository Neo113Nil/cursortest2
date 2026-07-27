package com.appsflyer.internal;

import android.content.Context;
import kotlin.Metadata;

@Metadata
/* loaded from: classes.dex */
public interface AFd1xSDK {
    public static final AFa1uSDK AFa1uSDK = AFa1uSDK.AFInAppEventType;

    public static final class AFa1uSDK {
        static final /* synthetic */ AFa1uSDK AFInAppEventType = new AFa1uSDK();
        private static long AFKeystoreWrapper = 500;

        private AFa1uSDK() {
        }

        public static long AFInAppEventParameterName() {
            return AFKeystoreWrapper;
        }
    }

    public interface AFa1zSDK {
        void valueOf();

        void values(AFh1xSDK aFh1xSDK);
    }

    void AFInAppEventType();

    void AFInAppEventType(Context context, AFa1zSDK aFa1zSDK);

    boolean values();
}
