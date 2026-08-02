package com.withpersona.sdk2.inquiry.selfie.video_capture;

import android.content.Context;
import com.fillr.featuretoggle.UnleashContext;
import com.withpersona.sdk2.camera.CameraXController_Factory_Impl;
import com.withpersona.sdk2.camera.camera2.Camera2Controller_Factory_Impl;
import com.withpersona.sdk2.inquiry.internal.InquiryActivityModule_ContextFactory;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;
import net.idrnd.face.iad.capture.internal.p0;

/* loaded from: classes9.dex */
public final class LocalVideoCaptureRenderer_Factory implements Factory {
    public final /* synthetic */ int $r8$classId;
    public final Provider applicationContextProvider;
    public final InstanceFactory camera2ControllerFactoryProvider;
    public final InstanceFactory cameraXControllerFactoryProvider;
    public final Provider navigationStateManagerProvider;

    public /* synthetic */ LocalVideoCaptureRenderer_Factory(InquiryActivityModule_ContextFactory inquiryActivityModule_ContextFactory, InstanceFactory instanceFactory, InstanceFactory instanceFactory2, Provider provider, int i) {
        this.$r8$classId = i;
        this.applicationContextProvider = inquiryActivityModule_ContextFactory;
        this.cameraXControllerFactoryProvider = instanceFactory;
        this.camera2ControllerFactoryProvider = instanceFactory2;
        this.navigationStateManagerProvider = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i = this.$r8$classId;
        Provider provider = this.navigationStateManagerProvider;
        InstanceFactory instanceFactory = this.camera2ControllerFactoryProvider;
        InstanceFactory instanceFactory2 = this.cameraXControllerFactoryProvider;
        Provider provider2 = this.applicationContextProvider;
        switch (i) {
            case 0:
                return new p0((Context) provider2.get(), (CameraXController_Factory_Impl) instanceFactory2.instance, (Camera2Controller_Factory_Impl) instanceFactory.instance, (NavigationStateManager) provider.get());
            default:
                Context context = (Context) provider2.get();
                CameraXController_Factory_Impl cameraXController_Factory_Impl = (CameraXController_Factory_Impl) instanceFactory2.instance;
                Camera2Controller_Factory_Impl camera2Controller_Factory_Impl = (Camera2Controller_Factory_Impl) instanceFactory.instance;
                NavigationStateManager navigationStateManager = (NavigationStateManager) provider.get();
                context.getClass();
                cameraXController_Factory_Impl.getClass();
                camera2Controller_Factory_Impl.getClass();
                navigationStateManager.getClass();
                UnleashContext unleashContext = new UnleashContext();
                unleashContext.userId = context;
                unleashContext.sessionId = cameraXController_Factory_Impl;
                unleashContext.remoteAddress = camera2Controller_Factory_Impl;
                unleashContext.properties = navigationStateManager;
                return unleashContext;
        }
    }
}
