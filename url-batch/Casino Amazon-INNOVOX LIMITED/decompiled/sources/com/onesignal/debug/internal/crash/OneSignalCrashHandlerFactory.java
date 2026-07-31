package com.onesignal.debug.internal.crash;

import android.content.Context;
import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.features.IFeatureManager;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.debug.internal.logging.otel.android.OtelPlatformProviderKt;
import com.onesignal.otel.IOtelCrashHandler;
import com.onesignal.otel.IOtelLogger;
import com.onesignal.otel.OtelFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OneSignalCrashHandlerFactory.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¨\u0006\f"}, d2 = {"Lcom/onesignal/debug/internal/crash/OneSignalCrashHandlerFactory;", "", "()V", "createCrashHandler", "Lcom/onesignal/otel/IOtelCrashHandler;", "context", "Landroid/content/Context;", "logger", "Lcom/onesignal/otel/IOtelLogger;", "featureManagerProvider", "Lkotlin/Function0;", "Lcom/onesignal/core/internal/features/IFeatureManager;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OneSignalCrashHandlerFactory {
    public static final OneSignalCrashHandlerFactory INSTANCE = new OneSignalCrashHandlerFactory();

    private OneSignalCrashHandlerFactory() {
    }

    public final IOtelCrashHandler createCrashHandler(Context context, IOtelLogger logger, Function0<? extends IFeatureManager> featureManagerProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(featureManagerProvider, "featureManagerProvider");
        if (!OtelSdkSupport.INSTANCE.isSupported()) {
            throw new IllegalArgumentException("createCrashHandler called on unsupported SDK (< 26)".toString());
        }
        Logging.info$default("OneSignal: Creating Otel crash handler (SDK >= 26)", null, 2, null);
        return OtelFactory.INSTANCE.createCrashHandler(OtelPlatformProviderKt.createAndroidOtelPlatformProvider(context, featureManagerProvider), logger);
    }
}
