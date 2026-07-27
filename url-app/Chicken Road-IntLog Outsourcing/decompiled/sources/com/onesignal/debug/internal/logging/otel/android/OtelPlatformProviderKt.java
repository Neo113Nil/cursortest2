package com.onesignal.debug.internal.logging.otel.android;

import android.content.Context;
import b2.AbstractC0279e;
import com.onesignal.common.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import java.io.File;
import kotlin.jvm.internal.i;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class OtelPlatformProviderKt {
    public static final boolean OTEL_EXPORTER_LOGGING_ENABLED = false;

    public static final OtelPlatformProvider createAndroidOtelPlatformProvider(Context context, InterfaceC1430a featureManagerProvider) {
        i.e(context, "context");
        i.e(featureManagerProvider, "featureManagerProvider");
        StringBuilder sb = new StringBuilder();
        sb.append(context.getCacheDir().getPath());
        String str = File.separator;
        sb.append(str);
        sb.append("onesignal");
        sb.append(str);
        sb.append("otel");
        String h3 = AbstractC0279e.h(sb, str, "crashes");
        String packageName = context.getPackageName();
        i.d(packageName, "getPackageName(...)");
        String appVersion = AndroidUtils.INSTANCE.getAppVersion(context);
        if (appVersion == null) {
            appVersion = CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE;
        }
        return new OtelPlatformProvider(new OtelPlatformProviderConfig(h3, packageName, appVersion, context, null, 16, null), featureManagerProvider);
    }
}
