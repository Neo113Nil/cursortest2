package com.withpersona.sdk2.camera;

import androidx.activity.result.ActivityResultLauncher;
import com.squareup.workflow1.ui.BuilderViewFactory;
import com.squareup.workflow1.ui.TypedViewRegistry;
import com.squareup.workflow1.ui.ViewFactory;
import com.squareup.workflow1.ui.modal.AlertContainer;
import com.stripe.android.GooglePayConfig;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.financialconnections.analytics.DefaultFinancialConnectionsEventReporter;
import com.stripe.android.financialconnections.domain.LookupAccount_Factory;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepositoryImpl;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda2;
import com.withpersona.sdk2.inquiry.device.DeviceModule;
import com.withpersona.sdk2.inquiry.device.RealDeviceIdProvider;
import com.withpersona.sdk2.inquiry.document.DocumentCameraWorker_Factory;
import com.withpersona.sdk2.inquiry.document.DocumentsSelectWorker_Factory_Factory;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdInstructionsRunner;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdSubmittingRunner;
import com.withpersona.sdk2.inquiry.governmentid.autoClassification.SelectCountryAndIdClassRunner;
import com.withpersona.sdk2.inquiry.governmentid.reviewCaptureScreen.GovernmentIdReviewRunner;
import com.withpersona.sdk2.inquiry.internal.InquiryFragment$createInquiryComponentIfNeeded$externalInquiryController$1;
import com.withpersona.sdk2.inquiry.launchers.CustomTabsLauncherModule;
import com.withpersona.sdk2.inquiry.launchers.DocumentSelectLauncherModule;
import com.withpersona.sdk2.inquiry.logger.Logger_Factory;
import com.withpersona.sdk2.inquiry.shared.SharedModule;
import com.withpersona.sdk2.inquiry.shared.data_collection.DataCollector;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ExternalEventLogger;
import com.withpersona.sdk2.inquiry.shared.files.SdkFilesManager;
import com.withpersona.sdk2.inquiry.shared.systemUiController.SystemUiController;
import com.withpersona.sdk2.inquiry.shared.ui.ScreenWithTransitionContainer;
import dagger.Lazy;
import dagger.internal.DelegateFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.SetFactory;
import dev.chrisbanes.haze.Pool;
import io.noties.markwon.LinkResolverDef;
import java.util.Arrays;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.text.MatchResult;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import net.idrnd.face.iad.capture.internal.o0;
import net.idrnd.misnap.iad.Payload;

/* loaded from: classes9.dex */
public final class CameraPreview_Factory implements Factory {
    public final /* synthetic */ int $r8$classId;
    public final Object sdkFilesManagerProvider;

    public CameraPreview_Factory(DeviceModule deviceModule, Logger_Factory logger_Factory) {
        this.$r8$classId = 6;
        this.sdkFilesManagerProvider = logger_Factory;
    }

    public static CoroutineContext provideWorkContext(LinkResolverDef linkResolverDef) {
        linkResolverDef.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
        Preconditions.checkNotNullFromProvides(defaultIoScheduler);
        return defaultIoScheduler;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i = this.$r8$classId;
        int i2 = 4;
        Object obj = this.sdkFilesManagerProvider;
        switch (i) {
            case 0:
                return new CameraPreview((SdkFilesManager) ((CameraPreview_Factory) obj).get());
            case 1:
                return provideWorkContext((LinkResolverDef) obj);
            case 2:
                return (FinancialConnectionsRepositoryImpl) ((LookupAccount_Factory) obj).get();
            case 3:
                return (DefaultFinancialConnectionsEventReporter) ((DocumentCameraWorker_Factory) obj).get();
            case 4:
                return (DefaultAnalyticsRequestExecutor) ((SelfieDirectionFeed_Factory) obj).get();
            case 5:
                Lazy lazy = DoubleCheck.lazy((DelegateFactory) obj);
                lazy.getClass();
                return new HCaptcha$$ExternalSyntheticLambda2(lazy, i2);
            case 6:
                return (RealDeviceIdProvider) ((Logger_Factory) obj).get();
            case 7:
                Set set = ArraysKt___ArraysKt.toSet(new ViewFactory[]{GovernmentIdInstructionsRunner.Companion, (BuilderViewFactory) ((DocumentsSelectWorker_Factory_Factory) obj).get(), GovernmentIdReviewRunner.Companion, GovernmentIdSubmittingRunner.Companion, AlertContainer.Companion, ScreenWithTransitionContainer.Companion, SelectCountryAndIdClassRunner.Companion});
                Preconditions.checkNotNullFromProvides(set);
                return set;
            case 8:
                return ((GooglePayConfig) obj).connectedAccountId;
            case 9:
                Set set2 = (Set) ((SetFactory) obj).get();
                set2.getClass();
                ViewFactory[] viewFactoryArr = (ViewFactory[]) set2.toArray(new ViewFactory[0]);
                ViewFactory[] viewFactoryArr2 = (ViewFactory[]) Arrays.copyOf(viewFactoryArr, viewFactoryArr.length);
                return new TypedViewRegistry((ViewFactory[]) Arrays.copyOf(viewFactoryArr2, viewFactoryArr2.length));
            case 10:
                ActivityResultLauncher activityResultLauncher = ((CustomTabsLauncherModule) obj).customTabsLauncher;
                Preconditions.checkNotNullFromProvides(activityResultLauncher);
                return activityResultLauncher;
            case 11:
                ActivityResultLauncher activityResultLauncher2 = ((DocumentSelectLauncherModule) obj).openDocumentResultLauncher;
                Preconditions.checkNotNullFromProvides(activityResultLauncher2);
                return activityResultLauncher2;
            case 12:
                ActivityResultLauncher activityResultLauncher3 = (ActivityResultLauncher) ((o0) obj).a;
                Preconditions.checkNotNullFromProvides(activityResultLauncher3);
                return activityResultLauncher3;
            case 13:
                ActivityResultLauncher activityResultLauncher4 = (ActivityResultLauncher) ((Payload) obj).a;
                Preconditions.checkNotNullFromProvides(activityResultLauncher4);
                return activityResultLauncher4;
            case 14:
                ActivityResultLauncher activityResultLauncher5 = ((CustomTabsLauncherModule) obj).customTabsLauncher;
                Preconditions.checkNotNullFromProvides(activityResultLauncher5);
                return activityResultLauncher5;
            case 15:
                SharedModule sharedModule = (SharedModule) obj;
                return new SystemUiController(sharedModule.controlNavigationBar, sharedModule.controlStatusBar);
            case 16:
                DataCollector dataCollector = (DataCollector) ((Payload) obj).a;
                Preconditions.checkNotNullFromProvides(dataCollector);
                return dataCollector;
            case 17:
                return new ExternalEventLogger((InquiryFragment$createInquiryComponentIfNeeded$externalInquiryController$1) ((Pool) ((CameraPreview_Factory) obj).sdkFilesManagerProvider).pool);
            case 18:
                return (InquiryFragment$createInquiryComponentIfNeeded$externalInquiryController$1) ((Pool) obj).pool;
            default:
                SdkFilesManager sdkFilesManager = (SdkFilesManager) ((MatchResult.Destructured) obj).match;
                Preconditions.checkNotNullFromProvides(sdkFilesManager);
                return sdkFilesManager;
        }
    }

    public /* synthetic */ CameraPreview_Factory(Object obj, int i) {
        this.$r8$classId = i;
        this.sdkFilesManagerProvider = obj;
    }
}
