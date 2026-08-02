package com.squareup.workflow1.internal;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.AutoValue_EncoderProfilesProxy_VideoProfileProxy;
import androidx.camera.core.impl.AutoValue_StreamSpec;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.VideoSpec;
import androidx.camera.video.internal.config.CaptureEncodeRates;
import androidx.camera.video.internal.config.VideoConfigUtil;
import androidx.camera.video.internal.encoder.AutoValue_AudioEncoderConfig;
import androidx.camera.video.internal.encoder.AutoValue_VideoEncoderConfig;
import androidx.camera.video.internal.encoder.AutoValue_VideoEncoderDataSpace;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.core.util.Supplier;
import androidx.media3.common.util.StuckPlayerDetector;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.util.BitmapsKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.appsflyer.AppsFlyerProperties;
import com.fillr.browsersdk.FillrAuthenticationStore;
import com.google.android.datatransport.runtime.AutoValue_EventInternal;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.zzuc;
import com.google.android.gms.internal.measurement.zzvh;
import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.android.gms.tasks.zzb;
import com.google.android.gms.tasks.zzw;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.auth.zzd;
import com.google.android.libraries.places.api.model.OpeningHours$HoursType;
import com.google.android.libraries.places.api.model.zzdi;
import com.google.android.libraries.places.api.model.zzey;
import com.google.android.libraries.places.api.net.zze;
import com.google.android.libraries.places.api.net.zzh;
import com.google.android.libraries.places.api.net.zzk;
import com.google.android.libraries.places.api.net.zzl;
import com.google.android.libraries.places.api.net.zzt;
import com.google.android.libraries.places.internal.zzayi;
import com.google.android.libraries.places.internal.zzbav;
import com.google.android.libraries.places.internal.zzbbg;
import com.google.android.libraries.places.internal.zzbgl;
import com.google.android.libraries.places.internal.zzbov;
import com.google.android.libraries.places.internal.zzbow;
import com.google.android.libraries.places.internal.zzbpc;
import com.google.android.libraries.places.internal.zzbsg;
import com.google.android.libraries.places.internal.zzbsh;
import com.google.android.libraries.places.internal.zzbsj;
import com.google.android.libraries.places.internal.zzbsn;
import com.google.android.libraries.places.internal.zzex;
import com.google.android.libraries.places.internal.zzfa;
import com.google.android.libraries.places.internal.zzfg;
import com.google.android.libraries.places.internal.zzfj;
import com.google.android.libraries.places.internal.zzfl;
import com.google.android.libraries.places.internal.zzfv;
import com.google.android.libraries.places.internal.zzgc;
import com.google.android.libraries.places.internal.zzhv;
import com.google.android.libraries.places.internal.zzib;
import com.google.android.libraries.places.internal.zzii;
import com.google.android.libraries.places.internal.zzil;
import com.google.android.libraries.places.internal.zziw;
import com.google.android.libraries.places.internal.zzje;
import com.google.android.libraries.places.internal.zzjn;
import com.google.android.libraries.places.internal.zzjp;
import com.google.android.libraries.places.internal.zzjt;
import com.google.android.libraries.places.internal.zzka;
import com.google.android.libraries.places.internal.zzns;
import com.google.android.play.integrity.internal.ah;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import com.google.common.util.concurrent.AbstractTransformFuture;
import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.DirectExecutor;
import com.google.common.util.concurrent.FluentFuture;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ImmediateFuture;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.zxing.Result;
import com.nimbusds.jose.jca.JCAContext;
import com.squareup.cardcustomizations.signature.SignatureState;
import com.squareup.cardcustomizations.signature.SignatureStateListener;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.presenters.ActivityEmbeddedPresenter$Companion;
import com.squareup.cash.activity.presenters.DefaultActivityItemEventHandler$Factory$Impl;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.arcade.components.ToastKt$Toast$7$1;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda5;
import com.squareup.cash.bitcoin.presenters.applet.widget.BitcoinHomeWidgetPresenter;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.activity.BitcoinDependentActivityViewModel;
import com.squareup.cash.blockers.views.SignatureViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.card.onboarding.CardStudioViewEvent;
import com.squareup.cash.card.onboarding.CardStudioViewModel;
import com.squareup.cash.clientroutes.RealClientRouteParser;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientrouting.analytics.AnalyticsParams;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.family.activity.presenters.DependentActivitiesContextKt;
import com.squareup.cash.family.activity.presenters.FamilySharedActivityCache$Factory$Impl;
import com.squareup.cash.family.familyhub.backend.real.RealDependentCustomerTokenRepository;
import com.squareup.cash.fidesmo.real.RealFidesmoClient$observeDeviceState$1;
import com.squareup.cash.genericelements.backend.GenericTreeElementsData;
import com.squareup.cash.genericelements.backend.RealGenericTreeElementsRepo;
import com.squareup.cash.genericelements.presenters.analytics.GenericCdfEvent;
import com.squareup.cash.genericelements.presenters.api.GenericTreeElementsAnalyticsData;
import com.squareup.cash.genericelements.presenters.api.GenericTreeElementsItem;
import com.squareup.cash.genericelements.presenters.mappers.GenericContainerType;
import com.squareup.cash.genericelements.presenters.mappers.GenericTreeElementsMapperKt$WhenMappings;
import com.squareup.cash.genericelements.screens.GenericTreeElementsScreen;
import com.squareup.cash.genericelements.viewmodels.GenericAnalyticsData;
import com.squareup.cash.genericelements.viewmodels.GenericComponentViewModel;
import com.squareup.cash.genericelements.viewmodels.GenericContainerViewModel;
import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewEvent;
import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewModel;
import com.squareup.cash.graphics.swampgl.GLThread$launch$1;
import com.squareup.cash.history.presenters.CheckStatusPresenter;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.merchant.backend.real.RealThirdPartyOfferAnalyticsFlowProvider;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$4$1;
import com.squareup.protos.cash.activity.api.v1.ActivityClientService;
import com.squareup.protos.cash.activity.api.v1.ActivityDisplayCategory;
import com.squareup.protos.cash.genericelements.ui.CardSeriesContainer;
import com.squareup.protos.cash.genericelements.ui.ComponentElement;
import com.squareup.protos.cash.genericelements.ui.ContainerElement;
import com.squareup.protos.cash.genericelements.ui.ContainerElement$Container$Card;
import com.squareup.protos.cash.genericelements.ui.ContainerElement$Container$Placeholder;
import com.squareup.protos.cash.genericelements.ui.ContainerElement$Container$Series;
import com.squareup.protos.cash.genericelements.ui.ContainerElement$Container$Single;
import com.squareup.protos.cash.genericelements.ui.PlaceholderContainer;
import com.squareup.protos.cash.genericelements.ui.SeriesContainer;
import com.squareup.protos.cash.genericelements.ui.StyleAttributes;
import com.squareup.protos.cash.ui.Color;
import com.squareup.util.coroutines.StateFlowKt$combineState$2;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.ProtoAdapter;
import com.squareup.workflow1.internal.SubtreeManager;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.RealAttachConsumerToLinkAccountSession;
import com.stripe.android.financialconnections.domain.RealHandleError;
import com.stripe.android.financialconnections.domain.RequestIntegrityToken;
import com.stripe.android.financialconnections.features.networkinglinksignup.LinkSignupHandler;
import com.stripe.android.financialconnections.features.networkinglinksignup.LinkSignupHandlerForInstantDebits$performSignup$1;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupState;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepositoryImpl;
import com.stripe.android.model.ConsumerSessionSignup;
import com.stripe.android.repository.ConsumersApiServiceImpl;
import com.stripe.android.uicore.elements.PhoneNumberController;
import com.stripe.android.uicore.navigation.NavigationManagerImpl;
import com.withpersona.sdk2.camera.CameraPreview;
import com.withpersona.sdk2.inquiry.featureflag.FeatureFlagManager;
import com.withpersona.sdk2.inquiry.internal.DaggerInquiryComponent$InquiryComponentImpl;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieStepFragment;
import com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieViewModel_Factory_Impl;
import com.withpersona.sdk2.inquiry.shared.di.BaseDaggerFragment;
import com.withpersona.sdk2.inquiry.shared.files.SdkFilesManager;
import com.withpersona.sdk2.inquiry.shared.systemUiController.SystemUiController;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.workflows.WorkflowContextAdapter$updateState$1;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import com.withpersona.sdk2.inquiry.workflows.WorkflowWorker;
import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.internal.ContextScope;
import net.oneformapp.schema.Schema;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.InputEventTrigger;
import papa.SafeTrace;
import utils.StringUtilsKt;

/* loaded from: classes4.dex */
public final class SubtreeManager implements Supplier, BitcoinHomeWidgetPresenter, SignatureStateListener, LinkSignupHandler, AndroidInjector {
    public Object children;
    public Object contextForChildren;
    public Object emitActionToParent;
    public Object idCounter;
    public Object interceptor;
    public Object snapshotCache;
    public Object workflowSession;

    public SubtreeManager(RealGenericTreeElementsRepo realGenericTreeElementsRepo, RealClientRouteParser realClientRouteParser, Analytics analytics, RealThirdPartyOfferAnalyticsFlowProvider realThirdPartyOfferAnalyticsFlowProvider, RealRouter$Factory$Impl realRouter$Factory$Impl, BetterNavigator.ScreenNavigator screenNavigator, Screen screen) {
        this.snapshotCache = realGenericTreeElementsRepo;
        this.contextForChildren = realClientRouteParser;
        this.emitActionToParent = analytics;
        this.workflowSession = realThirdPartyOfferAnalyticsFlowProvider;
        this.interceptor = screenNavigator;
        this.idCounter = screen;
        this.children = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    public static final void access$process(SubtreeManager subtreeManager, GenericTreeElementsViewEvent genericTreeElementsViewEvent, GenericTreeElementsItem genericTreeElementsItem) {
        String str = genericTreeElementsItem.entityToken;
        GenericTreeElementsAnalyticsData genericTreeElementsAnalyticsData = genericTreeElementsItem.overrideAnalytics;
        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) subtreeManager.interceptor;
        RealGenericTreeElementsRepo realGenericTreeElementsRepo = (RealGenericTreeElementsRepo) subtreeManager.snapshotCache;
        boolean z = genericTreeElementsViewEvent instanceof GenericTreeElementsViewEvent.OpenUrlEvent;
        Back back = Back.INSTANCE;
        if (z) {
            RealClientRouteParser realClientRouteParser = (RealClientRouteParser) subtreeManager.contextForChildren;
            String str2 = ((GenericTreeElementsViewEvent.OpenUrlEvent) genericTreeElementsViewEvent).url;
            if (realClientRouteParser.parse(str2) != null) {
                RealRouter realRouter = (RealRouter) subtreeManager.children;
                Screen screen = (Screen) subtreeManager.idCounter;
                realRouter.route(new RoutingParams(screen, null, screen instanceof GenericTreeElementsScreen.GenericTreeElementsSheet ? back : screen, null, new AnalyticsParams.GenericTreeElementsParams(str, genericTreeElementsAnalyticsData.referrerFlowToken, genericTreeElementsAnalyticsData.queryToken), null, 470), str2);
                return;
            }
            return;
        }
        if (genericTreeElementsViewEvent instanceof GenericTreeElementsViewEvent.PromptOverlayEvent) {
            GenericTreeElementsViewEvent.PromptOverlayEvent promptOverlayEvent = (GenericTreeElementsViewEvent.PromptOverlayEvent) genericTreeElementsViewEvent;
            List list = promptOverlayEvent.overlayTreeElements;
            String str3 = promptOverlayEvent.genericElementsContext;
            if (!list.isEmpty()) {
                realGenericTreeElementsRepo.dataSource.memCache.put(str3, new GenericTreeElementsData(list, null, null, null));
            }
            ContainerElement containerElement = promptOverlayEvent.errorTreeElement;
            if (containerElement != null) {
                realGenericTreeElementsRepo.dataSource.memCache.put(str3.concat("_ERROR"), new GenericTreeElementsData(CollectionsKt__CollectionsJVMKt.listOf(containerElement), null, null, null));
            }
            screenNavigator.goTo(new GenericTreeElementsScreen.GenericTreeElementsSheet(str3, str, genericTreeElementsAnalyticsData.referrerFlowToken));
            return;
        }
        if (!(genericTreeElementsViewEvent instanceof GenericTreeElementsViewEvent.DismissEvent)) {
            if (genericTreeElementsViewEvent instanceof GenericTreeElementsViewEvent.ViewAnalyticsEvent) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        } else {
            GenericAnalyticsData genericAnalyticsData = genericTreeElementsItem.dismissAnalytics;
            if (genericAnalyticsData != null) {
                subtreeManager.track(genericAnalyticsData, genericTreeElementsAnalyticsData);
            }
            screenNavigator.goTo(back);
        }
    }

    public void addMetadata(String str, String str2) {
        HashMap hashMap = (HashMap) this.idCounter;
        if (hashMap != null) {
            hashMap.put(str, str2);
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("Property \"autoMetadata\" has not been set");
        }
    }

    /* renamed from: build, reason: collision with other method in class */
    public AutoValue_AudioEncoderConfig m4004build() {
        String str = ((String) this.snapshotCache) == null ? " mimeType" : "";
        if (((Timebase) this.emitActionToParent) == null) {
            str = str.concat(" inputTimebase");
        }
        if (((Integer) this.workflowSession) == null) {
            str = str.concat(" bitrate");
        }
        if (((Integer) this.interceptor) == null) {
            str = str.concat(" captureSampleRate");
        }
        if (((Integer) this.idCounter) == null) {
            str = str.concat(" encodeSampleRate");
        }
        if (((Integer) this.children) == null) {
            str = str.concat(" channelCount");
        }
        if (!str.isEmpty()) {
            a$$ExternalSyntheticBUOutline0.m$1("Missing required properties:".concat(str));
            return null;
        }
        String str2 = (String) this.snapshotCache;
        int intValue = ((Integer) this.contextForChildren).intValue();
        AutoValue_AudioEncoderConfig autoValue_AudioEncoderConfig = new AutoValue_AudioEncoderConfig(str2, intValue, (Timebase) this.emitActionToParent, ((Integer) this.workflowSession).intValue(), ((Integer) this.interceptor).intValue(), ((Integer) this.idCounter).intValue(), ((Integer) this.children).intValue());
        if (!Objects.equals(str2, "audio/mp4a-latm") || intValue != -1) {
            return autoValue_AudioEncoderConfig;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Encoder mime set to AAC, but no AAC profile was provided.");
        return null;
    }

    @Override // androidx.core.util.Supplier
    public Object get() {
        String str = (String) this.snapshotCache;
        Size size = (Size) this.workflowSession;
        AutoValue_EncoderProfilesProxy_VideoProfileProxy autoValue_EncoderProfilesProxy_VideoProfileProxy = (AutoValue_EncoderProfilesProxy_VideoProfileProxy) this.interceptor;
        LinkedHashMap linkedHashMap = VideoConfigUtil.MIME_TO_DATA_SPACE_MAP;
        VideoSpec videoSpec = (VideoSpec) this.emitActionToParent;
        CaptureEncodeRates resolveFrameRates$camera_video = VideoConfigUtil.resolveFrameRates$camera_video(videoSpec, (Range) this.children);
        StringBuilder sb = new StringBuilder("Resolved VIDEO frame rates: Capture frame rate = ");
        int i = resolveFrameRates$camera_video.captureRate;
        sb.append(i);
        sb.append("fps. Encode frame rate = ");
        int i2 = resolveFrameRates$camera_video.encodeRate;
        sb.append(i2);
        sb.append("fps.");
        StringUtilsKt.d("VidEncVdPrflRslvr", sb.toString());
        int i3 = videoSpec.bitrate;
        if (i3 == 0) {
            StringUtilsKt.d("VidEncVdPrflRslvr", "Using resolved VIDEO bitrate from EncoderProfiles");
            i3 = VideoConfigUtil.scaleBitrate(autoValue_EncoderProfilesProxy_VideoProfileProxy.bitrate, ((DynamicRange) this.idCounter).mBitDepth, autoValue_EncoderProfilesProxy_VideoProfileProxy.bitDepth, resolveFrameRates$camera_video.encodeRate, autoValue_EncoderProfilesProxy_VideoProfileProxy.frameRate, size.getWidth(), autoValue_EncoderProfilesProxy_VideoProfileProxy.width, size.getHeight(), autoValue_EncoderProfilesProxy_VideoProfileProxy.height);
        }
        int i4 = autoValue_EncoderProfilesProxy_VideoProfileProxy.profile;
        AutoValue_VideoEncoderDataSpace mimeAndProfileToEncoderDataSpace = VideoConfigUtil.mimeAndProfileToEncoderDataSpace(i4, str);
        StuckPlayerDetector builder = AutoValue_VideoEncoderConfig.builder();
        builder.player = str;
        Timebase timebase = (Timebase) this.contextForChildren;
        if (timebase == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null inputTimebase");
            return null;
        }
        builder.callback = timebase;
        if (size == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null resolution");
            return null;
        }
        builder.clock = size;
        builder.stuckSuppressedDetector = Integer.valueOf(i3);
        builder.stuckBufferingDetector = Integer.valueOf(i);
        builder.stuckPlayingDetector = Integer.valueOf(i2);
        builder.playerListener = Integer.valueOf(i4);
        builder.handler = mimeAndProfileToEncoderDataSpace;
        return builder.build();
    }

    public WorkflowState getState() {
        return (WorkflowState) ((ReadonlyStateFlow) this.contextForChildren).$$delegate_0.getValue();
    }

    @Override // com.stripe.android.financialconnections.features.networkinglinksignup.LinkSignupHandler
    public void handleSignupFailure(NetworkingLinkSignupState networkingLinkSignupState, Throwable th) {
        networkingLinkSignupState.getClass();
        th.getClass();
        RealHandleError realHandleError = (RealHandleError) this.children;
        String str = networkingLinkSignupState.validEmail;
        str.getClass();
        String str2 = networkingLinkSignupState.validPhone;
        Object invoke = networkingLinkSignupState.payload.invoke();
        invoke.getClass();
        realHandleError.invoke("Error creating a Link account", FillrAuthenticationStore.toAttestationErrorIfApplicable(th, new ElementsSessionContext.PrefillDetails(str, str2, ((NetworkingLinkSignupState.Payload) invoke).phoneController.getCountryCode())), FinancialConnectionsSessionManifest.Pane.LINK_LOGIN, true);
    }

    @Override // dagger.android.AndroidInjector
    public void inject(BaseDaggerFragment baseDaggerFragment) {
        SelfieStepFragment selfieStepFragment = (SelfieStepFragment) baseDaggerFragment;
        DaggerInquiryComponent$InquiryComponentImpl daggerInquiryComponent$InquiryComponentImpl = (DaggerInquiryComponent$InquiryComponentImpl) this.snapshotCache;
        selfieStepFragment.androidInjector = daggerInquiryComponent$InquiryComponentImpl.dispatchingAndroidInjector();
        selfieStepFragment.viewModelFactory = (SelfieViewModel_Factory_Impl) ((InstanceFactory) this.children).instance;
        SdkFilesManager sdkFilesManager = (SdkFilesManager) daggerInquiryComponent$InquiryComponentImpl.filesModule.match;
        Preconditions.checkNotNullFromProvides(sdkFilesManager);
        selfieStepFragment.cameraPreview = new CameraPreview(sdkFilesManager);
        selfieStepFragment.selfieDirectionFeed = DoubleCheck.lazy(daggerInquiryComponent$InquiryComponentImpl.selfieDirectionFeedProvider);
        selfieStepFragment.trackingEventsLogger = (TrackingEventsLogger) daggerInquiryComponent$InquiryComponentImpl.trackingEventsLoggerProvider.get();
        selfieStepFragment.systemUiController = (SystemUiController) daggerInquiryComponent$InquiryComponentImpl.systemUiControllerProvider.get();
        selfieStepFragment.featureFlagManager = (FeatureFlagManager) daggerInquiryComponent$InquiryComponentImpl.featureFlagManagerProvider.get();
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0064 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GenericTreeElementsViewModel.Loaded model(GenericTreeElementsItem genericTreeElementsItem, Flow flow, Composer composer, int i) {
        ComponentElement componentElement;
        SeriesContainer seriesContainer;
        PlaceholderContainer placeholderContainer;
        CardSeriesContainer cardSeriesContainer;
        GenericContainerType genericContainerType;
        int i2;
        GenericContainerViewModel genericContainerViewModel;
        Boolean bool;
        Color color;
        AndroidMessage androidMessage;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-199987194);
        boolean changedInstance = ((((i & 14) ^ 6) > 4 && gapComposer.changedInstance(genericTreeElementsItem)) || (i & 6) == 4) | gapComposer.changedInstance(this);
        Object rememberedValue = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (changedInstance || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new CheckStatusPresenter.AnonymousClass1.C00611(genericTreeElementsItem, this, continuation, 17);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Updater.LaunchedEffect(gapComposer, genericTreeElementsItem, (Function2) rememberedValue);
        Updater.LaunchedEffect(gapComposer, flow, new RealFidesmoClient$observeDeviceState$1(flow, continuation, this, genericTreeElementsItem, 26));
        List<ContainerElement> list = genericTreeElementsItem.elements;
        ProtoAdapter protoAdapter = genericTreeElementsItem.placeholderAdapter;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (ContainerElement containerElement : list) {
            containerElement.getClass();
            ContainerElement.Margin margin = containerElement.margin;
            BitmapsKt bitmapsKt = containerElement.container;
            if (bitmapsKt != null) {
                ContainerElement$Container$Single containerElement$Container$Single = bitmapsKt instanceof ContainerElement$Container$Single ? (ContainerElement$Container$Single) bitmapsKt : null;
                if (containerElement$Container$Single != null) {
                    componentElement = containerElement$Container$Single.value;
                    if (componentElement == null) {
                        genericContainerType = GenericContainerType.COMPONENT_CONTAINER;
                    } else {
                        if (bitmapsKt != null) {
                            ContainerElement$Container$Series containerElement$Container$Series = bitmapsKt instanceof ContainerElement$Container$Series ? (ContainerElement$Container$Series) bitmapsKt : null;
                            if (containerElement$Container$Series != null) {
                                seriesContainer = containerElement$Container$Series.value;
                                if (seriesContainer == null) {
                                    genericContainerType = GenericContainerType.SERIES_CONTAINER;
                                } else {
                                    if (bitmapsKt != null) {
                                        ContainerElement$Container$Placeholder containerElement$Container$Placeholder = bitmapsKt instanceof ContainerElement$Container$Placeholder ? (ContainerElement$Container$Placeholder) bitmapsKt : null;
                                        if (containerElement$Container$Placeholder != null) {
                                            placeholderContainer = containerElement$Container$Placeholder.value;
                                            if (placeholderContainer == null) {
                                                genericContainerType = GenericContainerType.PLACEHOLDER_CONTAINER;
                                            } else {
                                                if (bitmapsKt != null) {
                                                    ContainerElement$Container$Card containerElement$Container$Card = bitmapsKt instanceof ContainerElement$Container$Card ? (ContainerElement$Container$Card) bitmapsKt : null;
                                                    if (containerElement$Container$Card != null) {
                                                        cardSeriesContainer = containerElement$Container$Card.value;
                                                        genericContainerType = cardSeriesContainer == null ? GenericContainerType.CARD_CONTAINER : null;
                                                    }
                                                }
                                                cardSeriesContainer = null;
                                                if (cardSeriesContainer == null) {
                                                }
                                            }
                                        }
                                    }
                                    placeholderContainer = null;
                                    if (placeholderContainer == null) {
                                    }
                                }
                            }
                        }
                        seriesContainer = null;
                        if (seriesContainer == null) {
                        }
                    }
                    i2 = genericContainerType != null ? -1 : GenericTreeElementsMapperKt$WhenMappings.$EnumSwitchMapping$0[genericContainerType.ordinal()];
                    if (i2 != -1) {
                        if (i2 == 1) {
                            bitmapsKt.getClass();
                            ContainerElement$Container$Single containerElement$Container$Single2 = bitmapsKt instanceof ContainerElement$Container$Single ? (ContainerElement$Container$Single) bitmapsKt : null;
                            ComponentElement componentElement2 = containerElement$Container$Single2 != null ? containerElement$Container$Single2.value : null;
                            componentElement2.getClass();
                            GenericComponentViewModel viewModel = ah.toViewModel(componentElement2);
                            if (viewModel != null) {
                                genericContainerViewModel = new GenericContainerViewModel.ComponentContainerViewModel(viewModel, ah.toContainerMargins(margin));
                            }
                        } else if (i2 == 2) {
                            bitmapsKt.getClass();
                            ContainerElement$Container$Series containerElement$Container$Series2 = bitmapsKt instanceof ContainerElement$Container$Series ? (ContainerElement$Container$Series) bitmapsKt : null;
                            SeriesContainer seriesContainer2 = containerElement$Container$Series2 != null ? containerElement$Container$Series2.value : null;
                            seriesContainer2.getClass();
                            Pair containerMargins = ah.toContainerMargins(margin);
                            List list2 = seriesContainer2.items;
                            StyleAttributes styleAttributes = seriesContainer2.attributes;
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                GenericComponentViewModel viewModel2 = ah.toViewModel((ComponentElement) it.next());
                                if (viewModel2 != null) {
                                    arrayList2.add(viewModel2);
                                }
                            }
                            SeriesContainer.Scroll scroll = seriesContainer2.scroll;
                            scroll.getClass();
                            genericContainerViewModel = new GenericContainerViewModel.SeriesContainerViewModel(arrayList2, scroll, seriesContainer2.ignoreVerticalSpacing, (styleAttributes == null || (color = styleAttributes.background_color) == null) ? null : new ColorModel.Accented(color), (styleAttributes == null || (bool = styleAttributes.show_drop_shadow) == null) ? false : bool.booleanValue(), containerMargins);
                        } else if (i2 == 3) {
                            bitmapsKt.getClass();
                            ContainerElement$Container$Placeholder containerElement$Container$Placeholder2 = bitmapsKt instanceof ContainerElement$Container$Placeholder ? (ContainerElement$Container$Placeholder) bitmapsKt : null;
                            PlaceholderContainer placeholderContainer2 = containerElement$Container$Placeholder2 != null ? containerElement$Container$Placeholder2.value : null;
                            placeholderContainer2.getClass();
                            Pair containerMargins2 = ah.toContainerMargins(margin);
                            String str = placeholderContainer2.encoded_input_proto;
                            if (str != null) {
                                ByteString.Companion companion = ByteString.Companion;
                                ByteString decodeBase64 = ByteString.Companion.decodeBase64(str);
                                if (decodeBase64 != null && protoAdapter != null) {
                                    androidMessage = (AndroidMessage) protoAdapter.decode(decodeBase64);
                                    genericContainerViewModel = new GenericContainerViewModel.PlaceholderContainerViewModel(androidMessage, containerMargins2);
                                }
                            }
                            androidMessage = null;
                            genericContainerViewModel = new GenericContainerViewModel.PlaceholderContainerViewModel(androidMessage, containerMargins2);
                        } else {
                            if (i2 != 4) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            bitmapsKt.getClass();
                            ContainerElement$Container$Card containerElement$Container$Card2 = bitmapsKt instanceof ContainerElement$Container$Card ? (ContainerElement$Container$Card) bitmapsKt : null;
                            CardSeriesContainer cardSeriesContainer2 = containerElement$Container$Card2 != null ? containerElement$Container$Card2.value : null;
                            cardSeriesContainer2.getClass();
                            Pair containerMargins3 = ah.toContainerMargins(margin);
                            List list3 = cardSeriesContainer2.items;
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it2 = list3.iterator();
                            while (it2.hasNext()) {
                                GenericComponentViewModel viewModel3 = ah.toViewModel((ComponentElement) it2.next());
                                if (viewModel3 != null) {
                                    arrayList3.add(viewModel3);
                                }
                            }
                            genericContainerViewModel = new GenericContainerViewModel.CardContainerViewModel(arrayList3, containerMargins3);
                        }
                        if (genericContainerViewModel != null) {
                            arrayList.add(genericContainerViewModel);
                        }
                    }
                    genericContainerViewModel = null;
                    if (genericContainerViewModel != null) {
                    }
                }
            }
            componentElement = null;
            if (componentElement == null) {
            }
            if (genericContainerType != null) {
            }
            if (i2 != -1) {
            }
            genericContainerViewModel = null;
            if (genericContainerViewModel != null) {
            }
        }
        GenericTreeElementsViewModel.Loaded loaded = new GenericTreeElementsViewModel.Loaded(arrayList, null);
        gapComposer.end(false);
        return loaded;
    }

    @Override // com.squareup.cash.bitcoin.presenters.applet.widget.BitcoinHomeWidgetPresenter
    public BitcoinHomeWidgetViewModel models(BetterNavigator.ScreenNavigator screenNavigator, Flow flow, GapComposer gapComposer, int i) {
        gapComposer.startReplaceGroup(1492404897);
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj = Composer.Companion.Empty;
        if (rememberedValue == obj) {
            String customerToken = ((RealDependentCustomerTokenRepository) this.snapshotCache).getCustomerToken();
            if (customerToken == null) {
                customerToken = "";
            }
            ActivitiesManager.ActivityContext dependentActivitiesContext$default = DependentActivitiesContextKt.dependentActivitiesContext$default(customerToken, (ActivityClientService) this.interceptor, ActivityDisplayCategory.ADC_BITCOIN);
            rememberedValue = ((RealActivityEmbeddedPresenter$Factory$Impl) this.emitActionToParent).create(screenNavigator, ActivityEmbeddedPresenter$Companion.EmbeddedRecentsConfiguration$default(dependentActivitiesContext$default, ((FamilySharedActivityCache$Factory$Impl) this.contextForChildren).create(dependentActivitiesContext$default), null, new BankingDialogKt$$ExternalSyntheticLambda5(27, screenNavigator, this), 3, ((AndroidStringManager) this.workflowSession).get(R.string.dependent_detail_recent_activity_empty_state), null, InputEventTrigger.Companion.decoratedWith((DefaultActivityItemEventHandler$Factory$Impl) this.children, (JCAContext) this.idCounter), null, null, 7496));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState rememberUpdatedState = Updater.rememberUpdatedState(((RealActivityEmbeddedPresenter) rememberedValue).models(gapComposer, 6), gapComposer);
        Unit unit = Unit.INSTANCE;
        boolean changed = gapComposer.changed(rememberUpdatedState);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changed || rememberedValue2 == obj) {
            rememberedValue2 = new ToastKt$Toast$7$1(rememberUpdatedState, null, 5);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
        BitcoinDependentActivityViewModel bitcoinDependentActivityViewModel = new BitcoinDependentActivityViewModel((UiCallbackModel) rememberUpdatedState.getValue());
        gapComposer.end(false);
        return bitcoinDependentActivityViewModel;
    }

    @Override // com.stripe.android.financialconnections.features.networkinglinksignup.LinkSignupHandler
    public void navigateToVerification() {
        NavigationManagerImpl.tryNavigateTo$default((NavigationManagerImpl) this.interceptor, Destination.invoke$default(Destination.NetworkingLinkVerification.INSTANCE, FinancialConnectionsSessionManifest.Pane.LINK_LOGIN), null, 6);
    }

    @Override // com.squareup.cardcustomizations.signature.SignatureStateListener
    public void onGlyphAdded() {
        Function1 function1 = (Function1) this.snapshotCache;
        ((MutableState) this.contextForChildren).setValue(Boolean.FALSE);
        if (((CardStudioViewModel.Content) this.emitActionToParent).customizationMode instanceof CardStudioViewModel.CustomizationMode.Pattern) {
            ((SnapshotStateList) this.workflowSession).add(new SignatureViewKt$$ExternalSyntheticLambda3(function1, (SignatureState) this.idCounter, 1));
        } else {
            ((SnapshotStateList) this.interceptor).add(new SignatureViewKt$$ExternalSyntheticLambda3(function1, (SignatureState) this.children, 2));
        }
    }

    @Override // com.squareup.cardcustomizations.signature.SignatureStateListener
    public void onStartedSigning() {
        ((Function1) this.snapshotCache).invoke(new CardStudioViewEvent.ToggleScaleBar(true));
        ((MutableState) this.contextForChildren).setValue(Boolean.TRUE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0147, code lost:
    
        if (r2 == r4) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0137, code lost:
    
        if (r0.invoke(r1, r12) != r4) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e3, code lost:
    
        if (r2 != r4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x011f, code lost:
    
        if (r2 == r4) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
    
        if (r6 == r4) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    @Override // com.stripe.android.financialconnections.features.networkinglinksignup.LinkSignupHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Enum performSignup(NetworkingLinkSignupState networkingLinkSignupState, ContinuationImpl continuationImpl) {
        LinkSignupHandlerForInstantDebits$performSignup$1 linkSignupHandlerForInstantDebits$performSignup$1;
        LinkSignupHandlerForInstantDebits$performSignup$1 linkSignupHandlerForInstantDebits$performSignup$12;
        PhoneNumberController phoneNumberController;
        Object invoke$default;
        NetworkingLinkSignupState networkingLinkSignupState2;
        PhoneNumberController phoneNumberController2;
        ConsumerSessionSignup consumerSessionSignup;
        NetworkingLinkSignupState networkingLinkSignupState3 = networkingLinkSignupState;
        GetOrFetchSync getOrFetchSync = (GetOrFetchSync) this.workflowSession;
        FinancialConnectionsConsumerSessionRepositoryImpl financialConnectionsConsumerSessionRepositoryImpl = (FinancialConnectionsConsumerSessionRepositoryImpl) this.snapshotCache;
        if (continuationImpl instanceof LinkSignupHandlerForInstantDebits$performSignup$1) {
            linkSignupHandlerForInstantDebits$performSignup$1 = (LinkSignupHandlerForInstantDebits$performSignup$1) continuationImpl;
            int i = linkSignupHandlerForInstantDebits$performSignup$1.label;
            if ((i & PKIFailureInfo.systemUnavail) != 0) {
                linkSignupHandlerForInstantDebits$performSignup$1.label = i - PKIFailureInfo.systemUnavail;
                linkSignupHandlerForInstantDebits$performSignup$12 = linkSignupHandlerForInstantDebits$performSignup$1;
                Object obj = linkSignupHandlerForInstantDebits$performSignup$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (linkSignupHandlerForInstantDebits$performSignup$12.label) {
                    case 0:
                        SafeTrace.throwOnFailure(obj);
                        Object invoke = networkingLinkSignupState3.payload.invoke();
                        invoke.getClass();
                        phoneNumberController = ((NetworkingLinkSignupState.Payload) invoke).phoneController;
                        linkSignupHandlerForInstantDebits$performSignup$12.L$0 = networkingLinkSignupState3;
                        linkSignupHandlerForInstantDebits$performSignup$12.L$1 = phoneNumberController;
                        linkSignupHandlerForInstantDebits$performSignup$12.label = 1;
                        invoke$default = GetOrFetchSync.invoke$default(getOrFetchSync, null, linkSignupHandlerForInstantDebits$performSignup$12, 3);
                        break;
                    case 1:
                        PhoneNumberController phoneNumberController3 = linkSignupHandlerForInstantDebits$performSignup$12.L$1;
                        NetworkingLinkSignupState networkingLinkSignupState4 = linkSignupHandlerForInstantDebits$performSignup$12.L$0;
                        SafeTrace.throwOnFailure(obj);
                        phoneNumberController = phoneNumberController3;
                        networkingLinkSignupState3 = networkingLinkSignupState4;
                        invoke$default = obj;
                        if (!((SynchronizeSessionResponse) invoke$default).manifest.appVerificationEnabled) {
                            String str = networkingLinkSignupState3.validEmail;
                            str.getClass();
                            String str2 = networkingLinkSignupState3.validPhone;
                            str2.getClass();
                            String countryCode = phoneNumberController.getCountryCode();
                            linkSignupHandlerForInstantDebits$performSignup$12.L$0 = null;
                            linkSignupHandlerForInstantDebits$performSignup$12.L$1 = null;
                            linkSignupHandlerForInstantDebits$performSignup$12.label = 4;
                            financialConnectionsConsumerSessionRepositoryImpl.getClass();
                            obj = financialConnectionsConsumerSessionRepositoryImpl.performSignUp(str, str2, countryCode, null, null, new StateFlowKt$combineState$2(3, financialConnectionsConsumerSessionRepositoryImpl.consumersApiService, ConsumersApiServiceImpl.class, "signUp", "signUp-0E7RQCE(Lcom/stripe/android/model/SignUpParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 4), linkSignupHandlerForInstantDebits$performSignup$12);
                            break;
                        } else {
                            RequestIntegrityToken requestIntegrityToken = (RequestIntegrityToken) this.emitActionToParent;
                            FinancialConnectionsAnalyticsEvent.AttestationEndpoint attestationEndpoint = FinancialConnectionsAnalyticsEvent.AttestationEndpoint.SIGNUP;
                            FinancialConnectionsSessionManifest.Pane pane = FinancialConnectionsSessionManifest.Pane.LINK_LOGIN;
                            linkSignupHandlerForInstantDebits$performSignup$12.L$0 = networkingLinkSignupState3;
                            linkSignupHandlerForInstantDebits$performSignup$12.L$1 = phoneNumberController;
                            linkSignupHandlerForInstantDebits$performSignup$12.label = 2;
                            Object invoke2 = requestIntegrityToken.invoke(attestationEndpoint, pane, linkSignupHandlerForInstantDebits$performSignup$12);
                            if (invoke2 != coroutineSingletons) {
                                networkingLinkSignupState2 = networkingLinkSignupState3;
                                phoneNumberController2 = phoneNumberController;
                                obj = invoke2;
                                String str3 = (String) obj;
                                String str4 = networkingLinkSignupState2.validEmail;
                                str4.getClass();
                                String str5 = networkingLinkSignupState2.validPhone;
                                str5.getClass();
                                String countryCode2 = phoneNumberController2.getCountryCode();
                                String str6 = (String) this.idCounter;
                                linkSignupHandlerForInstantDebits$performSignup$12.L$0 = null;
                                linkSignupHandlerForInstantDebits$performSignup$12.L$1 = null;
                                linkSignupHandlerForInstantDebits$performSignup$12.label = 3;
                                financialConnectionsConsumerSessionRepositoryImpl.getClass();
                                obj = financialConnectionsConsumerSessionRepositoryImpl.performSignUp(str4, str5, countryCode2, str3, str6, new StateFlowKt$combineState$2(3, financialConnectionsConsumerSessionRepositoryImpl.consumersApiService, ConsumersApiServiceImpl.class, "mobileSignUp", "mobileSignUp-0E7RQCE(Lcom/stripe/android/model/SignUpParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 3), linkSignupHandlerForInstantDebits$performSignup$12);
                                break;
                            }
                        }
                        return coroutineSingletons;
                    case 2:
                        phoneNumberController2 = linkSignupHandlerForInstantDebits$performSignup$12.L$1;
                        networkingLinkSignupState2 = linkSignupHandlerForInstantDebits$performSignup$12.L$0;
                        SafeTrace.throwOnFailure(obj);
                        String str32 = (String) obj;
                        String str42 = networkingLinkSignupState2.validEmail;
                        str42.getClass();
                        String str52 = networkingLinkSignupState2.validPhone;
                        str52.getClass();
                        String countryCode22 = phoneNumberController2.getCountryCode();
                        String str62 = (String) this.idCounter;
                        linkSignupHandlerForInstantDebits$performSignup$12.L$0 = null;
                        linkSignupHandlerForInstantDebits$performSignup$12.L$1 = null;
                        linkSignupHandlerForInstantDebits$performSignup$12.label = 3;
                        financialConnectionsConsumerSessionRepositoryImpl.getClass();
                        obj = financialConnectionsConsumerSessionRepositoryImpl.performSignUp(str42, str52, countryCode22, str32, str62, new StateFlowKt$combineState$2(3, financialConnectionsConsumerSessionRepositoryImpl.consumersApiService, ConsumersApiServiceImpl.class, "mobileSignUp", "mobileSignUp-0E7RQCE(Lcom/stripe/android/model/SignUpParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 3), linkSignupHandlerForInstantDebits$performSignup$12);
                        break;
                    case 3:
                        SafeTrace.throwOnFailure(obj);
                        consumerSessionSignup = (ConsumerSessionSignup) obj;
                        RealAttachConsumerToLinkAccountSession realAttachConsumerToLinkAccountSession = (RealAttachConsumerToLinkAccountSession) this.contextForChildren;
                        String str7 = consumerSessionSignup.consumerSession.clientSecret;
                        linkSignupHandlerForInstantDebits$performSignup$12.L$0 = null;
                        linkSignupHandlerForInstantDebits$performSignup$12.L$1 = null;
                        linkSignupHandlerForInstantDebits$performSignup$12.label = 5;
                        break;
                    case 4:
                        SafeTrace.throwOnFailure(obj);
                        consumerSessionSignup = (ConsumerSessionSignup) obj;
                        RealAttachConsumerToLinkAccountSession realAttachConsumerToLinkAccountSession2 = (RealAttachConsumerToLinkAccountSession) this.contextForChildren;
                        String str72 = consumerSessionSignup.consumerSession.clientSecret;
                        linkSignupHandlerForInstantDebits$performSignup$12.L$0 = null;
                        linkSignupHandlerForInstantDebits$performSignup$12.L$1 = null;
                        linkSignupHandlerForInstantDebits$performSignup$12.label = 5;
                        break;
                    case 5:
                        SafeTrace.throwOnFailure(obj);
                        linkSignupHandlerForInstantDebits$performSignup$12.L$0 = null;
                        linkSignupHandlerForInstantDebits$performSignup$12.L$1 = null;
                        linkSignupHandlerForInstantDebits$performSignup$12.label = 6;
                        obj = GetOrFetchSync.invoke$default(getOrFetchSync, GetOrFetchSync.RefetchCondition.Always.INSTANCE, linkSignupHandlerForInstantDebits$performSignup$12, 2);
                        break;
                    case 6:
                        SafeTrace.throwOnFailure(obj);
                        return ((SynchronizeSessionResponse) obj).manifest.nextPane;
                    default:
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        linkSignupHandlerForInstantDebits$performSignup$1 = new LinkSignupHandlerForInstantDebits$performSignup$1(this, continuationImpl);
        linkSignupHandlerForInstantDebits$performSignup$12 = linkSignupHandlerForInstantDebits$performSignup$1;
        Object obj2 = linkSignupHandlerForInstantDebits$performSignup$12.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (linkSignupHandlerForInstantDebits$performSignup$12.label) {
        }
    }

    public void runningSideEffect(String str, Function1 function1) {
        str.getClass();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.idCounter;
        Job job = (Job) linkedHashMap.get(str);
        if (job == null || !job.isActive()) {
            linkedHashMap.put(str, JobKt.launch$default((ContextScope) this.workflowSession, null, null, new GLThread$launch$1(function1, null, 7), 3));
        }
    }

    public void runningWorker(WorkflowWorker workflowWorker, Function1 function1) {
        workflowWorker.getClass();
        JobKt.launch$default((ContextScope) this.workflowSession, Dispatchers.Unconfined, null, new HeroCardViewKt$Render$1$4$1(this, workflowWorker, function1, null, 6), 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0053, code lost:
    
        if (r1.equals("ThirdPartyOffer Interact CopyCode") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0081, code lost:
    
        r7 = kotlin.collections.MapsKt__MapsKt.toMutableMap(r7);
        r2 = (java.lang.String) r7.get("offer_id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x008b, code lost:
    
        if (r2 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x008d, code lost:
    
        r3 = r6.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0091, code lost:
    
        if (r3 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0093, code lost:
    
        r3 = com.squareup.cash.integration.analytics.RealUuidGenerator.generate().toString();
        r6.put(r2, r3);
        r3.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a1, code lost:
    
        r3 = (java.lang.String) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a3, code lost:
    
        r7.put("offer_flow_token", r3);
        r6 = r8.referrerFlowToken;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a8, code lost:
    
        if (r6 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00aa, code lost:
    
        r7.put("referrer_flow_token", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00af, code lost:
    
        r7 = kotlin.collections.MapsKt__MapsKt.toMap(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        if (r1.equals("ShopHub Search ViewItem") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        r6 = r8.genericCDFEventParameters;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        if (r6 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        r7 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
    
        if (r1.equals("ShopHub Search SelectItem") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
    
        if (r1.equals("ThirdPartyOffer Interact ShopStart") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007e, code lost:
    
        if (r1.equals("ThirdPartyOffer View Details") == false) goto L41;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void track(GenericAnalyticsData genericAnalyticsData, GenericTreeElementsAnalyticsData genericTreeElementsAnalyticsData) {
        Analytics analytics = (Analytics) this.emitActionToParent;
        LinkedHashMap linkedHashMap = ((RealThirdPartyOfferAnalyticsFlowProvider) this.workflowSession).offerFlowTokens;
        genericAnalyticsData.getClass();
        String str = genericAnalyticsData.name;
        Map map = genericAnalyticsData.parameters;
        String str2 = "";
        switch (str.hashCode()) {
            case -2098260150:
                break;
            case -1504241947:
                break;
            case -875787322:
                break;
            case -189133137:
                break;
            case 344521737:
                break;
            case 842002433:
                if (str.equals("ThirdPartyOffer View Impression")) {
                    LinkedHashMap mutableMap = MapsKt__MapsKt.toMutableMap(map);
                    String str3 = (String) mutableMap.get("offer_id");
                    if (str3 != null) {
                        str2 = RealUuidGenerator.generate().toString();
                        linkedHashMap.put(str3, str2);
                        str2.getClass();
                    }
                    mutableMap.put("offer_flow_token", str2);
                    map = MapsKt__MapsKt.toMap(mutableMap);
                    break;
                }
                break;
        }
        analytics.track(new GenericCdfEvent(str, map), null);
    }

    public void updateState(WorkflowState workflowState) {
        JobKt.launch$default((ContextScope) this.workflowSession, Dispatchers.Unconfined, null, new WorkflowContextAdapter$updateState$1(this, workflowState, (Continuation) null), 2);
    }

    public Task zza(zzt zztVar) {
        List list = zztVar.zzh;
        if (list.isEmpty()) {
            return Room.forException(new ApiException(new Status(9012, "Place fields must not be empty.", null, null)));
        }
        if (zztVar.zzm.isEmpty()) {
            return Room.forException(new ApiException(new Status(9012, "Text query must not be an empty string.", null, null)));
        }
        ((zzfa) ((zzex) this.workflowSession)).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzhv.zzb);
        int i = 1;
        String zzc = zzjn.zzc(zzjp.zza(list), true, arrayList);
        ImmediateFuture zzx = zzx();
        AbstractTransformFuture.AsyncTransformFuture transformAsync = Futures.transformAsync(zzx, new zzuc(3, this, zzc, zztVar), DirectExecutor.INSTANCE);
        zzb zzbVar = zztVar.zza;
        if (zzbVar != null) {
            zzbVar.onCanceledRequested(new zzii(transformAsync, 2));
        }
        Task onSuccessTask = zzib.zza(transformAsync).onSuccessTask(new Result(i, this, zztVar));
        return ((zzw) onSuccessTask).continueWithTask(TaskExecutors.MAIN_THREAD, new zzil(this, zztVar, elapsedRealtime, zzx));
    }

    public Task zzb(zzk zzkVar, zzns zznsVar) {
        String str = zzkVar.zza;
        if (str == null) {
            return Room.forException(new ApiException(new Status(9012, "Query must not be null.", null, null)));
        }
        if (TextUtils.isEmpty(str.trim())) {
            ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
            return Room.forResult(new zzl(ImmutableList.copyOf((Collection) RegularImmutableList.EMPTY)));
        }
        ((zzfa) ((zzex) this.workflowSession)).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ImmediateFuture zzx = zzx();
        AbstractTransformFuture.AsyncTransformFuture transformAsync = Futures.transformAsync(zzx, new zzuc(2, this, zznsVar, zzkVar), DirectExecutor.INSTANCE);
        zzb zzbVar = zzkVar.zzk;
        if (zzbVar != null) {
            zzbVar.onCanceledRequested(new zzii(transformAsync, 3));
        }
        Task onSuccessTask = zzib.zza(transformAsync).onSuccessTask(new zzgc(26));
        return ((zzw) onSuccessTask).continueWithTask(TaskExecutors.MAIN_THREAD, new zziw(this, elapsedRealtime, zznsVar, zzx, 0));
    }

    public Task zzc(final zze zzeVar, final zzns zznsVar) {
        if (zzeVar.zza.isEmpty()) {
            return Room.forException(new ApiException(new Status(9012, "Place id must not be an empty string.", null, null)));
        }
        List list = zzeVar.zzb;
        if (list.isEmpty()) {
            return Room.forException(new ApiException(new Status(9012, "Place fields must not be empty.", null, null)));
        }
        ((zzfa) ((zzex) this.workflowSession)).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ArrayList arrayList = new ArrayList(zzjp.zza(list));
        arrayList.add("attributions");
        int i = 0;
        final String zzc = zzjn.zzc(arrayList, false, new ArrayList());
        ImmediateFuture zzx = zzx();
        AbstractTransformFuture.AsyncTransformFuture transformAsync = Futures.transformAsync(zzx, new AsyncFunction() { // from class: com.google.android.libraries.places.internal.zziy
            @Override // com.google.common.util.concurrent.AsyncFunction
            public final ListenableFuture apply(Object obj) {
                SubtreeManager subtreeManager = SubtreeManager.this;
                zzns zznsVar2 = zznsVar;
                String str = zzc;
                com.google.android.libraries.places.api.net.zze zzeVar2 = zzeVar;
                zzbgl zzy = subtreeManager.zzy(zznsVar2, str, (zzd) obj, 2);
                Locale zzf = Places.zza.zzf();
                zzbeg zza$1 = zzbeh.zza$1();
                String concat = "places/".concat(String.valueOf(zzeVar2.zza));
                zza$1.zzy();
                ((zzbeh) zza$1.zza).zzd(concat);
                zzdi zzdiVar = zzeVar2.zzc;
                if (zzdiVar != null) {
                    String zzdiVar2 = zzdiVar.toString();
                    zza$1.zzy();
                    ((zzbeh) zza$1.zza).zzg(zzdiVar2);
                }
                String languageTag = zzf.toLanguageTag();
                zza$1.zzy();
                ((zzbeh) zza$1.zza).zze(languageTag);
                zzbeh zzbehVar = (zzbeh) zza$1.zzD();
                zzbow zzbowVar = (zzbow) zzy.zza;
                Schema schema = zzjn.zzd;
                if (schema == null) {
                    synchronized (zzjn.class) {
                        try {
                            schema = zzjn.zzd;
                            if (schema == null) {
                                zzbso zzi = Schema.zzi();
                                zzi.zzc = zzbsq.zza;
                                zzi.zzd = Schema.zzh("google.maps.places.v1.Places", "GetPlace");
                                zzi.zze = true;
                                zzbeh zzc2 = zzbeh.zzc();
                                zzbjc zzbjcVar = zzckb.zza;
                                zzi.zza = new zzcka(zzc2);
                                zzi.zzb = new zzcka(zzbgj.zzbp());
                                schema = zzi.zzf();
                                zzjn.zzd = schema;
                            }
                        } finally {
                        }
                    }
                }
                return zzcko.zzb(zzbowVar.zza(schema, (zzbov) zzy.zzd), zzbehVar);
            }
        }, DirectExecutor.INSTANCE);
        zzb zzbVar = zzeVar.zzd;
        if (zzbVar != null) {
            zzbVar.onCanceledRequested(new zzii(transformAsync, i));
        }
        Task onSuccessTask = zzib.zza(transformAsync).onSuccessTask(new zzfv(this, 11));
        return ((zzw) onSuccessTask).continueWithTask(TaskExecutors.MAIN_THREAD, new zziw(this, elapsedRealtime, zznsVar, zzx, 1));
    }

    public zzey zzd() {
        List list;
        List list2;
        List list3 = (List) this.contextForChildren;
        if (list3 != null && (list = (List) this.emitActionToParent) != null && (list2 = (List) this.workflowSession) != null) {
            return new zzey((OpeningHours$HoursType) this.snapshotCache, list3, list, list2, (Boolean) this.interceptor, (Instant) this.idCounter, (Instant) this.children);
        }
        StringBuilder sb = new StringBuilder();
        if (((List) this.contextForChildren) == null) {
            sb.append(" periods");
        }
        if (((List) this.emitActionToParent) == null) {
            sb.append(" specialDays");
        }
        if (((List) this.workflowSession) == null) {
            sb.append(" weekdayText");
        }
        a$$ExternalSyntheticBUOutline0.m$1("Missing required properties:".concat(sb.toString()));
        return null;
    }

    public ImmediateFuture zzx() {
        Trace.checkState("ApiConfig must be initialized.", Places.zza.zzb());
        return Futures.immediateFuture(zzd.zza);
    }

    public zzbgl zzy(zzns zznsVar, String str, zzd zzdVar, int i) {
        zzbsn zzbsnVar;
        String str2;
        String str3;
        zzje zzjeVar = (zzje) this.contextForChildren;
        String str4 = "X-Goog-FieldMask";
        int i2 = 1;
        if (zznsVar != zzns.zzd) {
            String zze = Places.zza.zze();
            zzjeVar.getClass();
            zzbsnVar = new zzbsn();
            zzbsg zzbsgVar = zzbsn.zza;
            BitSet bitSet = zzbsj.zzb;
            zzbsnVar.zzc(new zzbsh("X-Goog-Api-Key", zzbsgVar), zze);
            zzjeVar.zzc(zzbsnVar);
            if (!str.isEmpty()) {
                zzbsnVar.zzc(new zzbsh(str4, zzbsgVar), str);
            }
        } else {
            if (i == 0) {
                throw null;
            }
            zzka zzkaVar = (zzka) this.idCounter;
            DirectExecutor directExecutor = DirectExecutor.INSTANCE;
            if (i == 4) {
                if (i != 4) {
                    zzkaVar.getClass();
                    a$$ExternalSyntheticBUOutline0.m$3("Only Autocomplete widget should call getOrRefreshToken()");
                    return null;
                }
                int i3 = zzkaVar.zzc;
                if (i3 != 0 && i3 != i) {
                    a$$ExternalSyntheticBUOutline0.m$3(CameraSelector$$ExternalSyntheticOutline0.m("Token type ", zzel$EnumUnboxingLocalUtility.name$4(i3), " does not match requested type ", zzel$EnumUnboxingLocalUtility.name$4(i)));
                    return null;
                }
                Long l = (Long) zzkaVar.zzb;
                str2 = (String) (((l == null ? true : Instant.ofEpochSecond(l.longValue()).isBefore(Instant.now())) || (str3 = zzkaVar.zza) == null) ? Futures.transform(Futures.transformAsync(FluentFuture.from(((zzjt) zzkaVar.zze).zza()), new zzvh(zzkaVar, i, i2), directExecutor), zzfl.zza, directExecutor) : Futures.immediateFuture(str3)).get();
            } else {
                if (i == 4) {
                    zzkaVar.getClass();
                    a$$ExternalSyntheticBUOutline0.m$3("Autocomplete widget should call getOrRefreshToken()");
                    return null;
                }
                if (zzkaVar.zza != null) {
                    Long l2 = (Long) zzkaVar.zzb;
                    if (l2 == null ? true : Instant.ofEpochSecond(l2.longValue()).isBefore(Instant.now())) {
                        a$$ExternalSyntheticBUOutline0.m$1("Token is expired");
                        return null;
                    }
                }
                int i4 = zzkaVar.zzc;
                if (i4 != 0 && i4 != i) {
                    a$$ExternalSyntheticBUOutline0.m$3(CameraSelector$$ExternalSyntheticOutline0.m("Token type ", zzel$EnumUnboxingLocalUtility.name$4(i4), " does not match requested type ", zzel$EnumUnboxingLocalUtility.name$4(i)));
                    return null;
                }
                String str5 = zzkaVar.zza;
                str2 = (String) (str5 != null ? Futures.immediateFuture(str5) : Futures.transform(Futures.transformAsync(FluentFuture.from(((zzjt) zzkaVar.zze).zza()), new zzvh(zzkaVar, i, 2), directExecutor), zzfl.zza$1, directExecutor)).get();
            }
            zzjeVar.getClass();
            zzbsnVar = new zzbsn();
            zzbsg zzbsgVar2 = zzbsn.zza;
            BitSet bitSet2 = zzbsj.zzb;
            zzbsnVar.zzc(new zzbsh("Authorization", zzbsgVar2), "Bearer ".concat(String.valueOf(str2)));
            if (!str.isEmpty()) {
                zzbsnVar.zzc(new zzbsh(str4, zzbsgVar2), str);
            }
            zzjeVar.zzc(zzbsnVar);
        }
        zzayi zzayiVar = new zzayi(zzbsnVar, 1);
        zzdVar.getClass();
        zzayi zzayiVar2 = new zzayi(new zzbsn(), 1);
        RegularImmutableList of = ImmutableList.of((Object) zzfj.zza);
        of.getClass();
        zzbav zzc = zzbbg.zzc();
        zzc.getClass();
        ImmutableList.Itr listIterator = of.listIterator(0);
        while (listIterator.hasNext()) {
            if (((zzfj) listIterator.next()).ordinal() != 0) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            Collections.unmodifiableList(((zzbbg) zzc.zza).zza()).getClass();
            HashSet hashSet = zzfg.zzb;
            hashSet.getClass();
            zzc.zzy();
            ((zzbbg) zzc.zza).zzd(hashSet);
        }
        zzbgl zzbglVar = (zzbgl) this.snapshotCache;
        zzbbg zzbbgVar = (zzbbg) zzc.zzD();
        zzbsn zzbsnVar2 = new zzbsn();
        zzbsg zzbsgVar3 = zzbsn.zza;
        BitSet bitSet3 = zzbsj.zzb;
        zzbsnVar2.zzc(new zzbsh("x-goog-gmp-client-signals", zzbsgVar3), Base64.getEncoder().encodeToString(zzbbgVar.zzbr()));
        zzayi[] zzayiVarArr = {zzayiVar, zzayiVar2, new zzayi(zzbsnVar2, 1), (zzayi) this.children};
        zzbow zzbowVar = (zzbow) zzbglVar.zza;
        List asList = Arrays.asList(zzayiVarArr);
        Trace.checkNotNull(zzbowVar, AppsFlyerProperties.CHANNEL);
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            zzbowVar = new zzbpc(zzbowVar, (zzayi) it.next());
        }
        return (zzbgl) zzbglVar.zza(zzbowVar, (zzbov) zzbglVar.zzd);
    }

    public SubtreeManager(String str, String str2, String str3, StepStyle stepStyle, Function0 function0, String str4, Function0 function02) {
        Request$Priority$EnumUnboxingLocalUtility.m(str, str2, str3, str4);
        this.snapshotCache = str;
        this.contextForChildren = str2;
        this.emitActionToParent = str3;
        this.workflowSession = stepStyle;
        this.interceptor = function0;
        this.idCounter = str4;
        this.children = function02;
    }

    public /* synthetic */ SubtreeManager(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.snapshotCache = obj;
        this.contextForChildren = obj2;
        this.emitActionToParent = obj3;
        this.workflowSession = obj4;
        this.interceptor = obj5;
        this.idCounter = obj6;
        this.children = obj7;
    }

    public Task zzd(final zzh zzhVar) {
        ((zzfa) ((zzex) this.workflowSession)).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ImmediateFuture zzx = zzx();
        AbstractTransformFuture.AsyncTransformFuture transformAsync = Futures.transformAsync(zzx, new AsyncFunction() { // from class: com.google.android.libraries.places.internal.zzij
            @Override // com.google.common.util.concurrent.AsyncFunction
            public final ListenableFuture apply(Object obj) {
                SubtreeManager subtreeManager = SubtreeManager.this;
                zzns zznsVar = zzns.zzc;
                com.google.android.libraries.places.api.net.zzh zzhVar2 = zzhVar;
                zzbgl zzy = subtreeManager.zzy(zznsVar, "", (zzd) obj, ((zzka) subtreeManager.idCounter).zzc);
                zzbee zza$1 = zzbef.zza$1();
                String str = ((com.google.android.libraries.places.api.model.zzfg) zzhVar2.zzc).zze;
                str.getClass();
                String concat = str.concat("/media");
                zza$1.zzy();
                ((zzbef) zza$1.zza).zzd(concat);
                Integer num = zzhVar2.zzb;
                if (num != null) {
                    int intValue = num.intValue();
                    zza$1.zzy();
                    ((zzbef) zza$1.zza).zzf$1(intValue);
                }
                Integer num2 = zzhVar2.zza;
                if (num2 != null) {
                    int intValue2 = num2.intValue();
                    zza$1.zzy();
                    ((zzbef) zza$1.zza).zze(intValue2);
                }
                zza$1.zzy();
                ((zzbef) zza$1.zza).zzg$1();
                zzbef zzbefVar = (zzbef) zza$1.zzD();
                zzbow zzbowVar = (zzbow) zzy.zza;
                Schema schema = zzjn.zzc;
                if (schema == null) {
                    synchronized (zzjn.class) {
                        try {
                            schema = zzjn.zzc;
                            if (schema == null) {
                                zzbso zzi = Schema.zzi();
                                zzi.zzc = zzbsq.zza;
                                zzi.zzd = Schema.zzh("google.maps.places.v1.Places", "GetPhotoMedia");
                                zzi.zze = true;
                                zzbef zzc = zzbef.zzc();
                                zzbjc zzbjcVar = zzckb.zza;
                                zzi.zza = new zzcka(zzc);
                                zzi.zzb = new zzcka(zzbep.zzc());
                                schema = zzi.zzf();
                                zzjn.zzc = schema;
                            }
                        } finally {
                        }
                    }
                }
                return zzcko.zzb(zzbowVar.zza(schema, (zzbov) zzy.zzd), zzbefVar);
            }
        }, DirectExecutor.INSTANCE);
        zzb zzbVar = zzhVar.zzd;
        if (zzbVar != null) {
            zzbVar.onCanceledRequested(new zzii(transformAsync, 1));
        }
        Task onSuccessTask = zzib.zza(transformAsync).onSuccessTask(zzgc.zza$11);
        return ((zzw) onSuccessTask).continueWithTask(TaskExecutors.MAIN_THREAD, new zzil(this, elapsedRealtime, zzx));
    }

    /* renamed from: build, reason: collision with other method in class */
    public AutoValue_EventInternal m4005build() {
        String str;
        if (((String) this.snapshotCache) == null) {
            str = " transportName";
        } else {
            str = "";
        }
        if (((EncodedPayload) this.emitActionToParent) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.workflowSession) == null) {
            str = str.concat(" eventMillis");
        }
        if (((Long) this.interceptor) == null) {
            str = str.concat(" uptimeMillis");
        }
        if (((HashMap) this.idCounter) == null) {
            str = str.concat(" autoMetadata");
        }
        if (str.isEmpty()) {
            return new AutoValue_EventInternal((String) this.snapshotCache, (Integer) this.contextForChildren, (EncodedPayload) this.emitActionToParent, ((Long) this.workflowSession).longValue(), ((Long) this.interceptor).longValue(), (HashMap) this.idCounter, (Integer) this.children);
        }
        a$$ExternalSyntheticBUOutline0.m$1("Missing required properties:".concat(str));
        return null;
    }

    public AutoValue_StreamSpec build() {
        String str;
        if (((Size) this.snapshotCache) == null) {
            str = " resolution";
        } else {
            str = "";
        }
        if (((Size) this.contextForChildren) == null) {
            str = str.concat(" originalConfiguredResolution");
        }
        if (((DynamicRange) this.emitActionToParent) == null) {
            str = str.concat(" dynamicRange");
        }
        if (((Integer) this.workflowSession) == null) {
            str = str.concat(" sessionType");
        }
        if (((Range) this.interceptor) == null) {
            str = str.concat(" expectedFrameRateRange");
        }
        if (((Boolean) this.children) == null) {
            str = str.concat(" zslDisabled");
        }
        if (str.isEmpty()) {
            return new AutoValue_StreamSpec((Size) this.snapshotCache, (Size) this.contextForChildren, (DynamicRange) this.emitActionToParent, ((Integer) this.workflowSession).intValue(), (Range) this.interceptor, (Config) this.idCounter, ((Boolean) this.children).booleanValue());
        }
        a$$ExternalSyntheticBUOutline0.m$1("Missing required properties:".concat(str));
        return null;
    }
}
