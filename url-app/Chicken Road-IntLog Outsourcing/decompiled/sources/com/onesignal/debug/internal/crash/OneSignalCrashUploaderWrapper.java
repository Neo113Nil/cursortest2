package com.onesignal.debug.internal.crash;

import B2.b;
import D4.AbstractC0024y;
import a.AbstractC0169a;
import com.onesignal.common.threading.OneSignalDispatchers;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.features.FeatureFlag;
import com.onesignal.core.internal.features.IFeatureManager;
import com.onesignal.core.internal.startup.IStartableService;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.otel.crash.OtelCrashUploader;
import f4.InterfaceC0428e;
import k4.C1224j;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class OneSignalCrashUploaderWrapper implements IStartableService {
    private final IApplicationService applicationService;
    private final IFeatureManager featureManager;
    private final InterfaceC0428e uploader$delegate;

    public OneSignalCrashUploaderWrapper(IApplicationService applicationService, IFeatureManager featureManager) {
        i.e(applicationService, "applicationService");
        i.e(featureManager, "featureManager");
        this.applicationService = applicationService;
        this.featureManager = featureManager;
        this.uploader$delegate = AbstractC0169a.A(new OneSignalCrashUploaderWrapper$uploader$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OtelCrashUploader getUploader() {
        return (OtelCrashUploader) this.uploader$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$0(OneSignalCrashUploaderWrapper this$0) {
        i.e(this$0, "this$0");
        try {
            AbstractC0024y.q(C1224j.f10720a, new OneSignalCrashUploaderWrapper$start$2$1(this$0, null));
        } catch (Throwable th) {
            Logging.warn("OneSignal: Crash uploader failed to start: " + th.getMessage(), th);
        }
    }

    @Override // com.onesignal.core.internal.startup.IStartableService
    public void start() {
        if (OtelSdkSupport.INSTANCE.isSupported()) {
            if (this.featureManager.isEnabled(FeatureFlag.SDK_BACKGROUND_THREADING)) {
                OneSignalDispatchers.INSTANCE.launchOnIO(new OneSignalCrashUploaderWrapper$start$1(this, null));
            } else {
                new Thread(new b(10, this)).start();
            }
        }
    }
}
