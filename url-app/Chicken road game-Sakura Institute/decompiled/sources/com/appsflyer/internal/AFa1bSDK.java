package com.appsflyer.internal;

import android.content.Context;
import java.util.Map;
import kotlin.Metadata;

@Metadata
/* loaded from: classes.dex */
public interface AFa1bSDK {
    public static final AFa1vSDK AFa1vSDK = AFa1vSDK.AFInAppEventParameterName;

    public static final class AFa1vSDK {
        static final /* synthetic */ AFa1vSDK AFInAppEventParameterName = new AFa1vSDK();

        private AFa1vSDK() {
        }
    }

    Map<String, String> valueOf(Context context);
}
