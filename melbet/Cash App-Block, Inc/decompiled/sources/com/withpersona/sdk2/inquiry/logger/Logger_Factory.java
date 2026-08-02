package com.withpersona.sdk2.inquiry.logger;

import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.withpersona.sdk2.camera.GovernmentIdFeed;
import com.withpersona.sdk2.camera.SelfieProcessor;
import com.withpersona.sdk2.camera.stats.RealCameraStatsManager;
import com.withpersona.sdk2.inquiry.device.RealDeviceIdProvider;
import com.withpersona.sdk2.inquiry.device.RealDeviceInfoProvider;
import com.withpersona.sdk2.inquiry.device.RealDeviceVendorIDProvider;
import com.withpersona.sdk2.inquiry.document.network.DocumentService;
import com.withpersona.sdk2.inquiry.featureflag.FeatureFlagManager;
import com.withpersona.sdk2.inquiry.featureflag.network.FeatureFlagService;
import com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationRenderer;
import com.withpersona.sdk2.inquiry.governmentid.network.GovernmentIdService;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.renderers.GovIdAutoClassificationRenderer;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.RealFallbackModeManager;
import com.withpersona.sdk2.inquiry.internal.network.InquiryService;
import com.withpersona.sdk2.inquiry.network.upload.UploadService;
import com.withpersona.sdk2.inquiry.sandbox.SandboxFlags;
import com.withpersona.sdk2.inquiry.sandbox.SandboxModule$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.selfie.network.SelfieService;
import com.withpersona.sdk2.inquiry.shared.inquiryTheme.InquiryThemeManager;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager;
import com.withpersona.sdk2.inquiry.ui.network.UiService;
import com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcService;
import com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcWorker;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dev.chrisbanes.haze.Pool;
import kotlin.text.MatchResult;
import kotlinx.coroutines.flow.MutableSharedFlow;
import net.idrnd.face.iad.capture.internal.o0;
import retrofit2.Retrofit;

/* loaded from: classes9.dex */
public final class Logger_Factory implements Factory {
    public final /* synthetic */ int $r8$classId;
    public final Provider contextProvider;

    public /* synthetic */ Logger_Factory(Provider provider, int i) {
        this.$r8$classId = i;
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i = this.$r8$classId;
        Provider provider = this.contextProvider;
        switch (i) {
            case 0:
                return new Logger((Context) provider.get());
            case 1:
                return new GovernmentIdFeed((MutableSharedFlow) provider.get());
            case 2:
                return new SelfieProcessor((FeatureFlagManager) provider.get());
            case 3:
                return new RealCameraStatsManager((Context) provider.get());
            case 4:
                return new RealDeviceIdProvider((Context) provider.get());
            case 5:
                ((Context) provider.get()).getClass();
                return new RealDeviceInfoProvider();
            case 6:
                return new RealDeviceVendorIDProvider((Context) provider.get());
            case 7:
                DocumentService documentService = (DocumentService) provider.get();
                documentService.getClass();
                Pool pool = new Pool();
                pool.pool = documentService;
                return pool;
            case 8:
                DocumentService documentService2 = (DocumentService) provider.get();
                documentService2.getClass();
                MatchResult.Destructured destructured = new MatchResult.Destructured();
                destructured.match = documentService2;
                return destructured;
            case 9:
                return new o0((DocumentService) provider.get());
            case 10:
                return new AutoClassificationRenderer((NavigationStateManager) provider.get());
            case 11:
                return new GovIdAutoClassificationRenderer((NavigationStateManager) provider.get());
            case 12:
                RealFallbackModeManager realFallbackModeManager = (RealFallbackModeManager) provider.get();
                realFallbackModeManager.getClass();
                return realFallbackModeManager;
            case 13:
                Retrofit retrofit = (Retrofit) provider.get();
                retrofit.getClass();
                Object create = retrofit.create(DocumentService.class);
                create.getClass();
                return (DocumentService) create;
            case 14:
                Retrofit retrofit3 = (Retrofit) provider.get();
                retrofit3.getClass();
                Object create2 = retrofit3.create(FeatureFlagService.class);
                create2.getClass();
                return (FeatureFlagService) create2;
            case 15:
                Retrofit retrofit4 = (Retrofit) provider.get();
                retrofit4.getClass();
                Object create3 = retrofit4.create(GovernmentIdService.class);
                create3.getClass();
                return (GovernmentIdService) create3;
            case 16:
                Retrofit retrofit5 = (Retrofit) provider.get();
                retrofit5.getClass();
                Object create4 = retrofit5.create(InquiryService.class);
                create4.getClass();
                return (InquiryService) create4;
            case 17:
                Retrofit retrofit6 = (Retrofit) provider.get();
                retrofit6.getClass();
                Object create5 = retrofit6.create(SelfieService.class);
                create5.getClass();
                return (SelfieService) create5;
            case 18:
                Retrofit retrofit7 = (Retrofit) provider.get();
                retrofit7.getClass();
                Object create6 = retrofit7.create(UiService.class);
                create6.getClass();
                return (UiService) create6;
            case 19:
                Retrofit retrofit8 = (Retrofit) provider.get();
                retrofit8.getClass();
                Object create7 = retrofit8.create(UploadService.class);
                create7.getClass();
                return (UploadService) create7;
            case 20:
                SandboxFlags sandboxFlags = (SandboxFlags) provider.get();
                sandboxFlags.getClass();
                return new SandboxModule$$ExternalSyntheticLambda0(sandboxFlags, 0);
            case 21:
                return new InquiryThemeManager((SavedStateHandle) provider.get());
            case 22:
                UiService uiService = (UiService) provider.get();
                uiService.getClass();
                Pool pool2 = new Pool();
                pool2.pool = uiService;
                return pool2;
            case 23:
                UiService uiService2 = (UiService) provider.get();
                uiService2.getClass();
                MatchResult.Destructured destructured2 = new MatchResult.Destructured();
                destructured2.match = uiService2;
                return destructured2;
            default:
                return new WebRtcWorker.Factory((WebRtcService) provider.get());
        }
    }

    public /* synthetic */ Logger_Factory(Object obj, Provider provider, int i) {
        this.$r8$classId = i;
        this.contextProvider = provider;
    }
}
