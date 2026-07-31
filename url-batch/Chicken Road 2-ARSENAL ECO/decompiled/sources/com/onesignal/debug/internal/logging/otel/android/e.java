package com.onesignal.debug.internal.logging.otel.android;

import N.p;
import android.content.Context;
import com.onesignal.common.AndroidUtils;
import java.io.File;
import kotlin.jvm.internal.i;
import x5.InterfaceC0732a;

/* loaded from: classes.dex */
public abstract class e {
    public static final boolean OTEL_EXPORTER_LOGGING_ENABLED = false;

    public static final c createAndroidOtelPlatformProvider(Context context, InterfaceC0732a featureManagerProvider) {
        i.e(context, "context");
        i.e(featureManagerProvider, "featureManagerProvider");
        StringBuilder sb = new StringBuilder();
        sb.append(context.getCacheDir().getPath());
        String str = File.separator;
        sb.append(str);
        sb.append("onesignal");
        sb.append(str);
        sb.append("otel");
        String b7 = p.b(sb, str, "crashes");
        String packageName = context.getPackageName();
        i.d(packageName, "getPackageName(...)");
        String appVersion = AndroidUtils.INSTANCE.getAppVersion(context);
        if (appVersion == null) {
            appVersion = "unknown";
        }
        return new c(new d(b7, packageName, appVersion, context, null, 16, null), featureManagerProvider);
    }
}
