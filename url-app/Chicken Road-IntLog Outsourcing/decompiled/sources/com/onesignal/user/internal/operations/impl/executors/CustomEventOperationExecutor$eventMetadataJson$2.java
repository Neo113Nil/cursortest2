package com.onesignal.user.internal.operations.impl.executors;

import android.os.Build;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.OneSignalUtils;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.device.IDeviceService;
import com.onesignal.user.internal.customEvents.impl.CustomEventMetadata;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class CustomEventOperationExecutor$eventMetadataJson$2 extends j implements InterfaceC1430a {
    final /* synthetic */ CustomEventOperationExecutor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomEventOperationExecutor$eventMetadataJson$2(CustomEventOperationExecutor customEventOperationExecutor) {
        super(0);
        this.this$0 = customEventOperationExecutor;
    }

    @Override // t4.InterfaceC1430a
    public final CustomEventMetadata invoke() {
        IDeviceService iDeviceService;
        IApplicationService iApplicationService;
        iDeviceService = this.this$0.deviceService;
        String name = iDeviceService.getDeviceType().name();
        String sdkVersion = OneSignalUtils.INSTANCE.getSdkVersion();
        AndroidUtils androidUtils = AndroidUtils.INSTANCE;
        iApplicationService = this.this$0.applicationService;
        return new CustomEventMetadata(name, sdkVersion, androidUtils.getAppVersion(iApplicationService.getAppContext()), "AndroidPush", Build.MODEL, Build.VERSION.RELEASE);
    }
}
