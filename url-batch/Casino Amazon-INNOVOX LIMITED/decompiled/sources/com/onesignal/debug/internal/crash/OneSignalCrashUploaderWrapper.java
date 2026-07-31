package com.onesignal.debug.internal.crash;

import android.content.Context;
import com.facebook.react.uimanager.ViewProps;
import com.onesignal.common.threading.OneSignalDispatchers;
import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.features.IFeatureManager;
import com.onesignal.core.internal.startup.IStartableService;
import com.onesignal.debug.internal.logging.otel.android.AndroidOtelLogger;
import com.onesignal.debug.internal.logging.otel.android.OtelPlatformProviderKt;
import com.onesignal.otel.OtelFactory;
import com.onesignal.otel.crash.OtelCrashUploader;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OneSignalCrashUploaderWrapper.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/onesignal/debug/internal/crash/OneSignalCrashUploaderWrapper;", "Lcom/onesignal/core/internal/startup/IStartableService;", "applicationService", "Lcom/onesignal/core/internal/application/IApplicationService;", "featureManager", "Lcom/onesignal/core/internal/features/IFeatureManager;", "(Lcom/onesignal/core/internal/application/IApplicationService;Lcom/onesignal/core/internal/features/IFeatureManager;)V", "uploader", "Lcom/onesignal/otel/crash/OtelCrashUploader;", "getUploader", "()Lcom/onesignal/otel/crash/OtelCrashUploader;", "uploader$delegate", "Lkotlin/Lazy;", ViewProps.START, "", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OneSignalCrashUploaderWrapper implements IStartableService {
    private final IApplicationService applicationService;
    private final IFeatureManager featureManager;

    /* renamed from: uploader$delegate, reason: from kotlin metadata */
    private final Lazy uploader;

    public OneSignalCrashUploaderWrapper(IApplicationService applicationService, IFeatureManager featureManager) {
        Intrinsics.checkNotNullParameter(applicationService, "applicationService");
        Intrinsics.checkNotNullParameter(featureManager, "featureManager");
        this.applicationService = applicationService;
        this.featureManager = featureManager;
        this.uploader = LazyKt.lazy(new Function0<OtelCrashUploader>() { // from class: com.onesignal.debug.internal.crash.OneSignalCrashUploaderWrapper$uploader$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final OtelCrashUploader invoke() {
                IApplicationService iApplicationService;
                iApplicationService = OneSignalCrashUploaderWrapper.this.applicationService;
                Context appContext = iApplicationService.getAppContext();
                final OneSignalCrashUploaderWrapper oneSignalCrashUploaderWrapper = OneSignalCrashUploaderWrapper.this;
                return OtelFactory.INSTANCE.createCrashUploader(OtelPlatformProviderKt.createAndroidOtelPlatformProvider(appContext, new Function0<IFeatureManager>() { // from class: com.onesignal.debug.internal.crash.OneSignalCrashUploaderWrapper$uploader$2$platformProvider$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final IFeatureManager invoke() {
                        IFeatureManager iFeatureManager;
                        iFeatureManager = OneSignalCrashUploaderWrapper.this.featureManager;
                        return iFeatureManager;
                    }
                }), new AndroidOtelLogger());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OtelCrashUploader getUploader() {
        return (OtelCrashUploader) this.uploader.getValue();
    }

    @Override // com.onesignal.core.internal.startup.IStartableService
    public void start() {
        if (OtelSdkSupport.INSTANCE.isSupported()) {
            OneSignalDispatchers.INSTANCE.launchOnIO(new OneSignalCrashUploaderWrapper$start$1(this, null));
        }
    }
}
