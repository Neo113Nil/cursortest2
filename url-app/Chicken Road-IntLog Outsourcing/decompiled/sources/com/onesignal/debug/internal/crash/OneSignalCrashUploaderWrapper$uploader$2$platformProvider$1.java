package com.onesignal.debug.internal.crash;

import com.onesignal.core.internal.features.IFeatureManager;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class OneSignalCrashUploaderWrapper$uploader$2$platformProvider$1 extends j implements InterfaceC1430a {
    final /* synthetic */ OneSignalCrashUploaderWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneSignalCrashUploaderWrapper$uploader$2$platformProvider$1(OneSignalCrashUploaderWrapper oneSignalCrashUploaderWrapper) {
        super(0);
        this.this$0 = oneSignalCrashUploaderWrapper;
    }

    @Override // t4.InterfaceC1430a
    public final IFeatureManager invoke() {
        IFeatureManager iFeatureManager;
        iFeatureManager = this.this$0.featureManager;
        return iFeatureManager;
    }
}
