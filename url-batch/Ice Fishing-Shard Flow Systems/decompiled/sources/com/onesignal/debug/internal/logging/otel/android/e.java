package com.onesignal.debug.internal.logging.otel.android;

import android.content.Context;
import com.onesignal.common.AndroidUtils;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import r4.f;

/* loaded from: classes.dex */
public abstract class e {
    public static final boolean OTEL_EXPORTER_LOGGING_ENABLED = false;

    public static final c createAndroidOtelPlatformProvider(Context context, Function0<? extends B2.e> featureManagerProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(featureManagerProvider, "featureManagerProvider");
        StringBuilder sb = new StringBuilder();
        sb.append(context.getCacheDir().getPath());
        String str = File.separator;
        sb.append(str);
        sb.append("onesignal");
        sb.append(str);
        sb.append("otel");
        String f7 = f.f(sb, str, "crashes");
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        String appVersion = AndroidUtils.INSTANCE.getAppVersion(context);
        if (appVersion == null) {
            appVersion = "unknown";
        }
        return new c(new d(f7, packageName, appVersion, context, null, 16, null), featureManagerProvider);
    }
}
