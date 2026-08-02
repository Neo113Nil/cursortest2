package com.stripe.android.core.networking;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory;
import androidx.lifecycle.viewmodel.CreationExtras;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.core.utilities.AppPreferenceStore;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.kotterknife.Lazy;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.stripe.android.financialconnections.FinancialConnectionsSheetActivity;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.FinancialConnectionsSheetState;
import com.stripe.android.financialconnections.analytics.DefaultFinancialConnectionsEventReporter;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.di.FinancialConnectionsSheetConfigurationModule_ProvidesApiVersionFactory;
import com.stripe.android.financialconnections.di.FinancialConnectionsSingletonSharedModule;
import com.stripe.android.financialconnections.domain.GetCachedAccountsKt;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.IntegrityVerdictManager;
import com.stripe.android.financialconnections.domain.LookupAccount_Factory;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.PartnerAccount;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.repository.CachedConsumerSession;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepositoryImpl;
import com.stripe.android.googlepaylauncher.DefaultPaymentsClientFactory_Factory;
import com.stripe.android.model.LinkBrand;
import com.stripe.android.payments.PaymentIntentFlowResultProcessor_Factory;
import com.stripe.android.payments.SetupIntentFlowResultProcessor_Factory;
import com.stripe.attestation.IntegrityStandardRequestManager;
import com.stripe.attestation.RealStandardIntegrityManagerFactory;
import com.withpersona.sdk2.camera.CameraModule_CameraStatsManagerFactory;
import com.withpersona.sdk2.camera.CameraPreview_Factory;
import com.withpersona.sdk2.camera.SelfieDirectionFeed_Factory;
import com.withpersona.sdk2.inquiry.document.DocumentCameraWorker_Factory;
import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow_Factory;
import com.withpersona.sdk2.inquiry.selfie.SelfieAnalyzeWorker_Factory;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.MatchResult;
import kotlinx.serialization.json.JsonBuilder;
import net.idrnd.face.iad.capture.internal.o0;
import net.idrnd.face.iad.capture.internal.y0;
import net.idrnd.misnap.iad.Payload;

/* loaded from: classes8.dex */
public final /* synthetic */ class MarkdownParser$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ MarkdownParser$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FinancialConnectionsSessionManifest financialConnectionsSessionManifest;
        int i = 2;
        int i2 = 1;
        switch (this.$r8$classId) {
            case 0:
                MatchResult matchResult = (MatchResult) obj;
                matchResult.getClass();
                break;
            case 1:
                AnalyticsRequestV2.Parameter parameter = (AnalyticsRequestV2.Parameter) obj;
                parameter.getClass();
                break;
            case 2:
                MatchResult matchResult2 = (MatchResult) obj;
                matchResult2.getClass();
                break;
            case 3:
                MatchResult matchResult3 = (MatchResult) obj;
                matchResult3.getClass();
                break;
            case 4:
                QueryStringFactory$Parameter queryStringFactory$Parameter = (QueryStringFactory$Parameter) obj;
                queryStringFactory$Parameter.getClass();
                break;
            case 5:
                Context context = (Context) obj;
                DefaultStripeNetworkClient defaultStripeNetworkClient = SendAnalyticsRequestV2Worker.networkClient;
                context.getClass();
                Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                break;
            case 6:
                String str = (String) obj;
                str.getClass();
                String property = System.getProperty(str);
                if (property == null) {
                }
                break;
            case 7:
                CreationExtras creationExtras = (CreationExtras) obj;
                creationExtras.getClass();
                SavedStateHandle createSavedStateHandle = SavedStateHandleSupport.createSavedStateHandle(creationExtras);
                Bundle bundle = (Bundle) createSavedStateHandle.get("financial_connections_sheet_state");
                Object obj2 = creationExtras.get(ViewModelProvider$AndroidViewModelFactory.APPLICATION_KEY);
                obj2.getClass();
                Application application = (Application) obj2;
                int i3 = FinancialConnectionsSheetActivity.$r8$clinit;
                FinancialConnectionsSheetActivityArgs financialConnectionsSheetActivityArgs = (FinancialConnectionsSheetActivityArgs) createSavedStateHandle.get("FinancialConnectionsSheetActivityArgs");
                if (financialConnectionsSheetActivityArgs == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                    break;
                } else {
                    FinancialConnectionsSessionManifest financialConnectionsSessionManifest2 = bundle != null ? (FinancialConnectionsSessionManifest) bundle.getParcelable("financial_connections_sheet_manifest") : null;
                    Serializable serializable = bundle != null ? bundle.getSerializable("financial_connections_sheet_web_auth_flow_status") : null;
                    FinancialConnectionsSheetState.AuthFlowStatus authFlowStatus = serializable instanceof FinancialConnectionsSheetState.AuthFlowStatus ? (FinancialConnectionsSheetState.AuthFlowStatus) serializable : null;
                    if (authFlowStatus == null) {
                        authFlowStatus = FinancialConnectionsSheetState.AuthFlowStatus.NONE;
                    }
                    FinancialConnectionsSheetState financialConnectionsSheetState = new FinancialConnectionsSheetState(financialConnectionsSheetActivityArgs, false, financialConnectionsSessionManifest2, authFlowStatus, null);
                    FinancialConnectionsSheetConfiguration configuration = financialConnectionsSheetActivityArgs.getConfiguration();
                    SelfieAnalyzeWorker_Factory component = FinancialConnectionsSingletonSharedModule.INSTANCE.getComponent(application);
                    configuration.getClass();
                    y0 y0Var = new y0();
                    InstanceFactory create = InstanceFactory.create(application);
                    Provider provider = DoubleCheck.provider(new CameraModule_CameraStatsManagerFactory(create, 3));
                    Provider provider2 = DoubleCheck.provider(new CameraModule_CameraStatsManagerFactory(DoubleCheck.provider(FinancialConnectionsSheetConfigurationModule_ProvidesApiVersionFactory.InstanceHolder.INSTANCE$1), 9));
                    Provider provider3 = DoubleCheck.provider(FinancialConnectionsSheetConfigurationModule_ProvidesApiVersionFactory.InstanceHolder.INSTANCE$3);
                    SelfieDirectionFeed_Factory selfieDirectionFeed_Factory = new SelfieDirectionFeed_Factory(y0Var, provider2, provider3);
                    Provider provider4 = DoubleCheck.provider(FinancialConnectionsSheetConfigurationModule_ProvidesApiVersionFactory.InstanceHolder.INSTANCE$5);
                    int i4 = 4;
                    LookupAccount_Factory lookupAccount_Factory = new LookupAccount_Factory(selfieDirectionFeed_Factory, new SelfieDirectionFeed_Factory(provider4, provider2, i4), provider4, provider2, 2);
                    Provider provider5 = DoubleCheck.provider(new CameraModule_CameraStatsManagerFactory(DoubleCheck.provider(FinancialConnectionsSheetConfigurationModule_ProvidesApiVersionFactory.InstanceHolder.INSTANCE), 10));
                    InstanceFactory create2 = InstanceFactory.create(configuration);
                    Provider provider6 = DoubleCheck.provider(new DefaultPaymentsClientFactory_Factory(create2, i2));
                    Provider provider7 = DoubleCheck.provider(new CameraModule_CameraStatsManagerFactory(DoubleCheck.provider(new SelfieDirectionFeed_Factory(provider6, DoubleCheck.provider(new CameraModule_CameraStatsManagerFactory(create2, i4)), 6)), 5));
                    Provider provider8 = DoubleCheck.provider(FinancialConnectionsSheetConfigurationModule_ProvidesApiVersionFactory.InstanceHolder.INSTANCE$2);
                    Provider provider9 = DoubleCheck.provider(new PaymentIntentFlowResultProcessor_Factory(lookupAccount_Factory, provider5, provider7, provider8, provider2));
                    Provider provider10 = DoubleCheck.provider(new CameraPreview_Factory(new LookupAccount_Factory(lookupAccount_Factory, provider7, new CameraModule_CameraStatsManagerFactory(create, 8), provider5, 3), i));
                    Provider provider11 = DoubleCheck.provider(new CameraPreview_Factory(new DocumentCameraWorker_Factory(DoubleCheck.provider(new CameraPreview_Factory(new SelfieDirectionFeed_Factory(provider2, provider3, 3), 4)), DoubleCheck.provider(new DeviceFeatureRequestWorkflow_Factory(create, provider6)), provider3, 1), 3));
                    LookupAccount_Factory lookupAccount_Factory2 = new LookupAccount_Factory(provider9, create2, provider, new CameraModule_CameraStatsManagerFactory(create, 2), 1);
                    Provider provider12 = DoubleCheck.provider(new SetupIntentFlowResultProcessor_Factory(create, lookupAccount_Factory2, provider8, create2, DoubleCheck.provider(new SetupIntentFlowResultProcessor_Factory(create, selfieDirectionFeed_Factory, provider2, DoubleCheck.provider(new RealAnalyticsRequestV2Storage_Factory(create)), DoubleCheck.provider(new CameraModule_CameraStatsManagerFactory(lookupAccount_Factory2, 11)), 1)), 3));
                    Provider provider13 = DoubleCheck.provider(GetCachedAccountsKt.INSTANCE);
                    Provider provider14 = DoubleCheck.provider(FinancialConnectionsSheetConfigurationModule_ProvidesApiVersionFactory.InstanceHolder.INSTANCE$4);
                    String str2 = (String) provider.get();
                    GetOrFetchSync getOrFetchSync = new GetOrFetchSync((FinancialConnectionsManifestRepositoryImpl) provider9.get(), configuration, (String) provider.get(), new AppPreferenceStore(application));
                    IntegrityStandardRequestManager integrityStandardRequestManager = (IntegrityStandardRequestManager) component.selfieDirectionFeedProvider.get();
                    if (integrityStandardRequestManager != null && (r2 = (IntegrityVerdictManager) component.sdkFilesManagerProvider.get()) != null) {
                        Lazy lazy = new Lazy(new Payload((FinancialConnectionsRepositoryImpl) provider10.get()), (FinancialConnectionsRepositoryImpl) provider10.get());
                        o0 o0Var = new o0((FinancialConnectionsRepositoryImpl) provider10.get());
                        Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1 = (Logger$Companion$NOOP_LOGGER$1) provider2.get();
                        RealStandardIntegrityManagerFactory realStandardIntegrityManagerFactory = new RealStandardIntegrityManagerFactory(application, 1);
                        DefaultFinancialConnectionsEventReporter defaultFinancialConnectionsEventReporter = (DefaultFinancialConnectionsEventReporter) provider11.get();
                        FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl = (FinancialConnectionsAnalyticsTrackerImpl) provider12.get();
                        FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl2 = (FinancialConnectionsAnalyticsTrackerImpl) provider12.get();
                        AppPreferenceStore appPreferenceStore = new AppPreferenceStore(application);
                        financialConnectionsAnalyticsTrackerImpl2.getClass();
                        ToolbarTuckTargets toolbarTuckTargets = new ToolbarTuckTargets();
                        toolbarTuckTargets.startCornerCenterX$delegate = financialConnectionsAnalyticsTrackerImpl2;
                        toolbarTuckTargets.endCornerCenterX$delegate = appPreferenceStore;
                        break;
                    } else {
                        a$$ExternalSyntheticBUOutline0.m$2("Cannot return null from a non-@Nullable component method");
                        break;
                    }
                }
                break;
            case 8:
                JsonBuilder jsonBuilder = (JsonBuilder) obj;
                jsonBuilder.getClass();
                jsonBuilder.coerceInputValues = true;
                jsonBuilder.ignoreUnknownKeys = true;
                jsonBuilder.isLenient = true;
                jsonBuilder.encodeDefaults = true;
                break;
            case 9:
                CachedConsumerSession cachedConsumerSession = (CachedConsumerSession) obj;
                if (cachedConsumerSession != null) {
                    break;
                }
                break;
            case 10:
                SynchronizeSessionResponse synchronizeSessionResponse = (SynchronizeSessionResponse) obj;
                if (synchronizeSessionResponse != null && (financialConnectionsSessionManifest = synchronizeSessionResponse.manifest) != null) {
                    LinkBrand linkBrand = financialConnectionsSessionManifest.rawLinkBrand;
                    if (linkBrand == null) {
                        break;
                    }
                }
                break;
            case 11:
                PartnerAccount partnerAccount = (PartnerAccount) obj;
                partnerAccount.getClass();
                break;
            case 12:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsProperties_androidKt.setTestTagsAsResourceId(semanticsPropertyReceiver);
                break;
            case 13:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsProperties_androidKt.setTestTagsAsResourceId(semanticsPropertyReceiver2);
                break;
            case 14:
                ((String) obj).getClass();
                break;
            case 15:
                ((String) obj).getClass();
                break;
            case 16:
                ((String) obj).getClass();
                break;
            case 17:
                SemanticsPropertyReceiver semanticsPropertyReceiver3 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver3.getClass();
                SemanticsProperties_androidKt.setTestTagsAsResourceId(semanticsPropertyReceiver3);
                break;
            case 18:
                SemanticsPropertyReceiver semanticsPropertyReceiver4 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver4.getClass();
                SemanticsProperties_androidKt.setTestTagsAsResourceId(semanticsPropertyReceiver4);
                break;
            case 19:
                SemanticsPropertyReceiver semanticsPropertyReceiver5 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver5.getClass();
                SemanticsProperties_androidKt.setTestTagsAsResourceId(semanticsPropertyReceiver5);
                break;
            case 20:
                SemanticsPropertyReceiver semanticsPropertyReceiver6 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver6.getClass();
                SemanticsProperties_androidKt.setTestTagsAsResourceId(semanticsPropertyReceiver6);
                break;
            case 21:
                FinancialConnectionsInstitution financialConnectionsInstitution = (FinancialConnectionsInstitution) obj;
                financialConnectionsInstitution.getClass();
                break;
            case 22:
                FinancialConnectionsInstitution financialConnectionsInstitution2 = (FinancialConnectionsInstitution) obj;
                financialConnectionsInstitution2.getClass();
                break;
            case 23:
                SemanticsPropertyReceiver semanticsPropertyReceiver7 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver7.getClass();
                SemanticsProperties_androidKt.setTestTagsAsResourceId(semanticsPropertyReceiver7);
                break;
            case 24:
                SemanticsPropertyReceiver semanticsPropertyReceiver8 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver8.getClass();
                SemanticsProperties_androidKt.setTestTagsAsResourceId(semanticsPropertyReceiver8);
                break;
            case 25:
                SemanticsPropertyReceiver semanticsPropertyReceiver9 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver9.getClass();
                SemanticsProperties_androidKt.setTestTagsAsResourceId(semanticsPropertyReceiver9);
                break;
            case 26:
                ((String) obj).getClass();
                break;
            case 27:
                SemanticsPropertyReceiver semanticsPropertyReceiver10 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver10.getClass();
                SemanticsProperties_androidKt.setTestTagsAsResourceId(semanticsPropertyReceiver10);
                break;
            case 28:
                SemanticsPropertyReceiver semanticsPropertyReceiver11 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver11.getClass();
                SemanticsProperties_androidKt.setTestTagsAsResourceId(semanticsPropertyReceiver11);
                break;
            default:
                SemanticsPropertyReceiver semanticsPropertyReceiver12 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver12.getClass();
                SemanticsProperties_androidKt.setTestTagsAsResourceId(semanticsPropertyReceiver12);
                break;
        }
        return Unit.INSTANCE;
    }
}
