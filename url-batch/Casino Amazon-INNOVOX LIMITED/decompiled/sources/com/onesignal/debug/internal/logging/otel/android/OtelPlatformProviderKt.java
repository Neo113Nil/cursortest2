package com.onesignal.debug.internal.logging.otel.android;

import android.content.Context;
import com.onesignal.common.AndroidUtils;
import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.features.IFeatureManager;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OtelPlatformProvider.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"OTEL_EXPORTER_LOGGING_ENABLED", "", "createAndroidOtelPlatformProvider", "Lcom/onesignal/debug/internal/logging/otel/android/OtelPlatformProvider;", "context", "Landroid/content/Context;", "featureManagerProvider", "Lkotlin/Function0;", "Lcom/onesignal/core/internal/features/IFeatureManager;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OtelPlatformProviderKt {
    public static final boolean OTEL_EXPORTER_LOGGING_ENABLED = false;

    public static final OtelPlatformProvider createAndroidOtelPlatformProvider(Context context, Function0<? extends IFeatureManager> featureManagerProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(featureManagerProvider, "featureManagerProvider");
        String str = context.getCacheDir().getPath() + File.separator + "onesignal" + File.separator + "otel" + File.separator + "crashes";
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        String appVersion = AndroidUtils.INSTANCE.getAppVersion(context);
        if (appVersion == null) {
            appVersion = "unknown";
        }
        return new OtelPlatformProvider(new OtelPlatformProviderConfig(str, packageName, appVersion, context, null, 16, null), featureManagerProvider);
    }
}
