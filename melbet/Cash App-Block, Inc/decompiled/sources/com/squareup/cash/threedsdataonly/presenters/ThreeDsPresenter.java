package com.squareup.cash.threedsdataonly.presenters;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.cdf.threeds.ThreeDsAuthenticationSdkFailure;
import com.squareup.cash.cdf.threeds.ThreeDsAuthenticationSdkInitializationFailure;
import com.squareup.cash.cdf.threeds.ThreeDsAuthenticationSdkInitializationSuccess;
import com.squareup.cash.cdf.threeds.ThreeDsAuthenticationSdkWarning;
import com.squareup.cash.cdf.threeds.ThreeDsAuthenticationUseAuthenticationParams;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientTransfersThreedsPreInitialization;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientTransfers_3dsPreAuthentication;
import com.squareup.cash.featureflags.FeatureFlag$ControlTreatmentAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.music.views.MusicViewFactory$MetroFactory;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda3;
import com.squareup.cash.support.chat.views.ChatInputView$Content$1$1$1;
import com.squareup.cash.tax.web.TaxWebAppBridge;
import com.squareup.cash.threedsdataonly.backend.api.InitializationResult;
import com.squareup.cash.threedsdataonly.backend.api.ThreeDsSpanAction$EndSdkAuthenticationParamsSpan;
import com.squareup.cash.threedsdataonly.backend.api.ThreeDsSpanAction$EndSdkInitializationSpan;
import com.squareup.cash.threedsdataonly.backend.api.ThreeDsSpanAction$StartSdkAuthenticationParamsSpan;
import com.squareup.cash.threedsdataonly.backend.api.ThreeDsSpanAction$StartSdkInitializationSpan;
import com.squareup.cash.threedsdataonly.backend.api.Transaction$AuthenticationRequestParameters;
import com.squareup.cash.threedsdataonly.backend.api.Warning;
import com.squareup.cash.threedsdataonly.backend.real.RealThreeDsAuthenticationManager;
import com.squareup.cash.threedsdataonly.backend.real.RealThreeDsService;
import com.squareup.cash.threedsdataonly.backend.real.RealThreeDsService$$ExternalSyntheticLambda0;
import com.squareup.cash.threedsdataonly.backend.real.RealThreeDsSpanTrackingService;
import com.squareup.cash.threedsdataonly.viewmodels.ThreeDsViewModel;
import com.squareup.cash.ui.BreadcrumbListener;
import com.squareup.protos.cash.cash3dsauthentication.api.v1.ThreeDsAuthenticationService;
import com.squareup.protos.cash.ui.Image;
import com.withpersona.sdk2.inquiry.logger.Logger$_log$2;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class ThreeDsPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final ThreeDsAuthenticationService appService;
    public final BlockersScreens.ThreeDsAuthenticationScreen args;
    public final BlockersDataNavigator blockersDataNavigator;
    public final CoroutineContext ioDispatcher;
    public final boolean isDebug;
    public final boolean issuerMode;
    public final BetterNavigator.ScreenNavigator navigator;
    public final boolean preAuthenticationParamsEnabled;
    public final boolean preInitializationEnabled;
    public final RealThreeDsSpanTrackingService spanTrackingService;
    public final AndroidStringManager stringManager;
    public final RealThreeDsAuthenticationManager threeDsAuthenticationManager;
    public final RealThreeDsService threeDsService;

    public ThreeDsPresenter(RealThreeDsService realThreeDsService, RealThreeDsAuthenticationManager realThreeDsAuthenticationManager, BlockersDataNavigator blockersDataNavigator, ThreeDsAuthenticationService threeDsAuthenticationService, RealThreeDsSpanTrackingService realThreeDsSpanTrackingService, FeatureFlagManager featureFlagManager, Analytics analytics, AndroidStringManager androidStringManager, boolean z, CoroutineContext coroutineContext, RealRouter$Factory$Impl realRouter$Factory$Impl, BlockersScreens.ThreeDsAuthenticationScreen threeDsAuthenticationScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        threeDsAuthenticationScreen.getClass();
        this.threeDsService = realThreeDsService;
        this.threeDsAuthenticationManager = realThreeDsAuthenticationManager;
        this.blockersDataNavigator = blockersDataNavigator;
        this.appService = threeDsAuthenticationService;
        this.spanTrackingService = realThreeDsSpanTrackingService;
        this.analytics = analytics;
        this.stringManager = androidStringManager;
        this.isDebug = z;
        this.ioDispatcher = coroutineContext;
        this.args = threeDsAuthenticationScreen;
        this.navigator = screenNavigator;
        realRouter$Factory$Impl.create$1(screenNavigator);
        RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) featureFlagManager;
        this.preInitializationEnabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) realFeatureFlagManager.peekCurrentValue(AmplitudeExperiments$ClientTransfersThreedsPreInitialization.INSTANCE)).enabled();
        this.preAuthenticationParamsEnabled = ((FeatureFlag$ControlTreatmentAmplitudeExperiment$Options) realFeatureFlagManager.peekCurrentValue(AmplitudeExperiments$ClientTransfers_3dsPreAuthentication.INSTANCE)).enabled();
        this.issuerMode = threeDsAuthenticationScreen.issuerLogo != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0063, code lost:
    
        if (r1 == r7) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0130 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$performSdkOperations(ThreeDsPresenter threeDsPresenter, Function1 function1, ContinuationImpl continuationImpl) {
        ThreeDsPresenter$performSdkOperations$1 threeDsPresenter$performSdkOperations$1;
        int i;
        Function1 function12;
        InitializationResult initializationResult;
        boolean z;
        boolean z2 = threeDsPresenter.isDebug;
        BlockersScreens.ThreeDsAuthenticationScreen threeDsAuthenticationScreen = threeDsPresenter.args;
        Analytics analytics = threeDsPresenter.analytics;
        RealThreeDsSpanTrackingService realThreeDsSpanTrackingService = threeDsPresenter.spanTrackingService;
        if (continuationImpl instanceof ThreeDsPresenter$performSdkOperations$1) {
            threeDsPresenter$performSdkOperations$1 = (ThreeDsPresenter$performSdkOperations$1) continuationImpl;
            int i2 = threeDsPresenter$performSdkOperations$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                threeDsPresenter$performSdkOperations$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = threeDsPresenter$performSdkOperations$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = threeDsPresenter$performSdkOperations$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realThreeDsSpanTrackingService.onAction(ThreeDsSpanAction$StartSdkInitializationSpan.INSTANCE);
                    RealThreeDsService realThreeDsService = threeDsPresenter.threeDsService;
                    function12 = function1;
                    threeDsPresenter$performSdkOperations$1.L$0 = function12;
                    threeDsPresenter$performSdkOperations$1.label = 1;
                    obj = realThreeDsService.init.awaitInternal(threeDsPresenter$performSdkOperations$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                SafeTrace.throwOnFailure(obj);
                                return obj;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = threeDsPresenter$performSdkOperations$1.Z$0;
                        SafeTrace.throwOnFailure(obj);
                        List<Warning> list = (List) obj;
                        for (Warning warning : list) {
                            Timber.Forest forest = Timber.Forest;
                            forest.tag("3DS");
                            Warning.Severity severity = warning.severity;
                            String str = warning.message;
                            forest.d("3DS SDK [Severity: " + severity + "] " + str, new Object[0]);
                            if (!z2) {
                                analytics.track(new ThreeDsAuthenticationSdkWarning(threeDsAuthenticationScreen.blockersData.flowToken, Recorder$$ExternalSyntheticOutline2.m(warning.id, ":", str)), null);
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : list) {
                            if (((Warning) obj3).severity == Warning.Severity.HIGH) {
                                arrayList.add(obj3);
                            }
                        }
                        if (z2 && !arrayList.isEmpty()) {
                            return null;
                        }
                        threeDsPresenter$performSdkOperations$1.L$0 = null;
                        threeDsPresenter$performSdkOperations$1.Z$0 = z;
                        threeDsPresenter$performSdkOperations$1.label = 3;
                        Object authenticationParams = threeDsPresenter.getAuthenticationParams(threeDsPresenter$performSdkOperations$1);
                        return authenticationParams != obj2 ? obj2 : authenticationParams;
                    }
                    function12 = threeDsPresenter$performSdkOperations$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                initializationResult = (InitializationResult) obj;
                if (initializationResult instanceof InitializationResult.Success) {
                    if (!(initializationResult instanceof InitializationResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    realThreeDsSpanTrackingService.onAction(new ThreeDsSpanAction$EndSdkInitializationSpan(false, true, ThreeDsSpanAction$EndSdkInitializationSpan.Source.BLOCKER));
                    analytics.track(new ThreeDsAuthenticationSdkInitializationFailure(threeDsAuthenticationScreen.blockersData.flowToken, null, 2), null);
                    return null;
                }
                boolean z3 = ((InitializationResult.Success) initializationResult).alreadyInitialized;
                function12.invoke(Boolean.valueOf(z3));
                realThreeDsSpanTrackingService.onAction(new ThreeDsSpanAction$EndSdkInitializationSpan(z3, false, ThreeDsSpanAction$EndSdkInitializationSpan.Source.BLOCKER));
                if (!z3) {
                    analytics.track(new ThreeDsAuthenticationSdkInitializationSuccess(threeDsAuthenticationScreen.blockersData.flowToken), null);
                }
                threeDsPresenter$performSdkOperations$1.L$0 = null;
                threeDsPresenter$performSdkOperations$1.Z$0 = z3;
                threeDsPresenter$performSdkOperations$1.label = 2;
                Object warnings = threeDsPresenter.getWarnings(threeDsPresenter$performSdkOperations$1);
                if (warnings != obj2) {
                    z = z3;
                    obj = warnings;
                    List<Warning> list2 = (List) obj;
                    while (r8.hasNext()) {
                    }
                    ArrayList arrayList2 = new ArrayList();
                    while (r1.hasNext()) {
                    }
                    if (z2) {
                    }
                    threeDsPresenter$performSdkOperations$1.L$0 = null;
                    threeDsPresenter$performSdkOperations$1.Z$0 = z;
                    threeDsPresenter$performSdkOperations$1.label = 3;
                    Object authenticationParams2 = threeDsPresenter.getAuthenticationParams(threeDsPresenter$performSdkOperations$1);
                    if (authenticationParams2 != obj2) {
                    }
                }
            }
        }
        threeDsPresenter$performSdkOperations$1 = new ThreeDsPresenter$performSdkOperations$1(threeDsPresenter, continuationImpl);
        Object obj4 = threeDsPresenter$performSdkOperations$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = threeDsPresenter$performSdkOperations$1.label;
        if (i != 0) {
        }
        initializationResult = (InitializationResult) obj4;
        if (initializationResult instanceof InitializationResult.Success) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(2:3|(13:5|6|7|8|(1:(1:(8:12|13|14|15|(1:17)(1:(1:23)(2:24|25))|18|19|20)(2:26|27))(1:28))(2:38|(2:40|(2:42|35))(8:43|(1:31)(1:37)|(3:33|(2:36|14)|35)|15|(0)(0)|18|19|20))|29|(0)(0)|(0)|15|(0)(0)|18|19|20))|49|6|7|8|(0)(0)|29|(0)(0)|(0)|15|(0)(0)|18|19|20) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0036, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a5, code lost:
    
        if ((r0 instanceof kotlinx.coroutines.TimeoutCancellationException) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ad, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008e A[Catch: Exception -> 0x0036, TryCatch #0 {Exception -> 0x0036, blocks: (B:13:0x0032, B:14:0x0081, B:15:0x0084, B:17:0x008e, B:18:0x0095, B:23:0x0093, B:24:0x009d, B:25:0x00a2, B:28:0x0040, B:29:0x005e, B:33:0x006a, B:40:0x0053), top: B:8:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006a A[Catch: Exception -> 0x0036, TryCatch #0 {Exception -> 0x0036, blocks: (B:13:0x0032, B:14:0x0081, B:15:0x0084, B:17:0x008e, B:18:0x0095, B:23:0x0093, B:24:0x009d, B:25:0x00a2, B:28:0x0040, B:29:0x005e, B:33:0x006a, B:40:0x0053), top: B:8:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getAuthenticationParams(ContinuationImpl continuationImpl) {
        ThreeDsPresenter$getAuthenticationParams$1 threeDsPresenter$getAuthenticationParams$1;
        int i;
        Transaction$AuthenticationRequestParameters transaction$AuthenticationRequestParameters;
        int i2;
        int i3;
        ThreeDsAuthenticationUseAuthenticationParams.Source source;
        if (continuationImpl instanceof ThreeDsPresenter$getAuthenticationParams$1) {
            threeDsPresenter$getAuthenticationParams$1 = (ThreeDsPresenter$getAuthenticationParams$1) continuationImpl;
            int i4 = threeDsPresenter$getAuthenticationParams$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                threeDsPresenter$getAuthenticationParams$1.label = i4 - PKIFailureInfo.systemUnavail;
                ThreeDsPresenter$getAuthenticationParams$1 threeDsPresenter$getAuthenticationParams$12 = threeDsPresenter$getAuthenticationParams$1;
                Object obj = threeDsPresenter$getAuthenticationParams$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = threeDsPresenter$getAuthenticationParams$12.label;
                RealThreeDsAuthenticationManager realThreeDsAuthenticationManager = this.threeDsAuthenticationManager;
                RealThreeDsSpanTrackingService realThreeDsSpanTrackingService = this.spanTrackingService;
                BlockersScreens.ThreeDsAuthenticationScreen threeDsAuthenticationScreen = this.args;
                Transaction$AuthenticationRequestParameters transaction$AuthenticationRequestParameters2 = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    boolean z = this.preAuthenticationParamsEnabled;
                    realThreeDsSpanTrackingService.onAction(new ThreeDsSpanAction$StartSdkAuthenticationParamsSpan(z));
                    if (!z) {
                        transaction$AuthenticationRequestParameters = null;
                        i2 = transaction$AuthenticationRequestParameters != null ? 1 : 0;
                        if (transaction$AuthenticationRequestParameters == null) {
                            String str = threeDsAuthenticationScreen.directoryServerId;
                            String str2 = threeDsAuthenticationScreen.messageVersion;
                            String str3 = threeDsAuthenticationScreen.publicIpAddress;
                            String str4 = threeDsAuthenticationScreen.blockersData.flowToken;
                            threeDsPresenter$getAuthenticationParams$12.I$0 = i2;
                            threeDsPresenter$getAuthenticationParams$12.label = 2;
                            obj = realThreeDsAuthenticationManager.createTransactionAuthenticationParams(str, str2, str3, str4, threeDsPresenter$getAuthenticationParams$12);
                            if (obj != coroutineSingletons) {
                                i3 = i2;
                                transaction$AuthenticationRequestParameters = (Transaction$AuthenticationRequestParameters) obj;
                                i2 = i3;
                            }
                            return coroutineSingletons;
                        }
                        Analytics analytics = this.analytics;
                        String str5 = threeDsAuthenticationScreen.blockersData.flowToken;
                        if (i2 != 1) {
                        }
                        analytics.track(new ThreeDsAuthenticationUseAuthenticationParams(str5, source), null);
                        transaction$AuthenticationRequestParameters2 = transaction$AuthenticationRequestParameters;
                        realThreeDsSpanTrackingService.onAction(ThreeDsSpanAction$EndSdkAuthenticationParamsSpan.INSTANCE);
                        return transaction$AuthenticationRequestParameters2;
                    }
                    String str6 = threeDsAuthenticationScreen.directoryServerId;
                    threeDsPresenter$getAuthenticationParams$12.label = 1;
                    obj = realThreeDsAuthenticationManager.getTransactionAuthenticationParams(str6, threeDsPresenter$getAuthenticationParams$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i3 = threeDsPresenter$getAuthenticationParams$12.I$0;
                        SafeTrace.throwOnFailure(obj);
                        transaction$AuthenticationRequestParameters = (Transaction$AuthenticationRequestParameters) obj;
                        i2 = i3;
                        Analytics analytics2 = this.analytics;
                        String str52 = threeDsAuthenticationScreen.blockersData.flowToken;
                        if (i2 != 1) {
                            source = ThreeDsAuthenticationUseAuthenticationParams.Source.PRE_AUTH;
                        } else {
                            if (i2 != 0) {
                                throw new NoWhenBranchMatchedException();
                            }
                            source = ThreeDsAuthenticationUseAuthenticationParams.Source.BLOCKER;
                        }
                        analytics2.track(new ThreeDsAuthenticationUseAuthenticationParams(str52, source), null);
                        transaction$AuthenticationRequestParameters2 = transaction$AuthenticationRequestParameters;
                        realThreeDsSpanTrackingService.onAction(ThreeDsSpanAction$EndSdkAuthenticationParamsSpan.INSTANCE);
                        return transaction$AuthenticationRequestParameters2;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                transaction$AuthenticationRequestParameters = (Transaction$AuthenticationRequestParameters) obj;
                if (transaction$AuthenticationRequestParameters != null) {
                }
                if (transaction$AuthenticationRequestParameters == null) {
                }
                Analytics analytics22 = this.analytics;
                String str522 = threeDsAuthenticationScreen.blockersData.flowToken;
                if (i2 != 1) {
                }
                analytics22.track(new ThreeDsAuthenticationUseAuthenticationParams(str522, source), null);
                transaction$AuthenticationRequestParameters2 = transaction$AuthenticationRequestParameters;
                realThreeDsSpanTrackingService.onAction(ThreeDsSpanAction$EndSdkAuthenticationParamsSpan.INSTANCE);
                return transaction$AuthenticationRequestParameters2;
            }
        }
        threeDsPresenter$getAuthenticationParams$1 = new ThreeDsPresenter$getAuthenticationParams$1(this, continuationImpl);
        ThreeDsPresenter$getAuthenticationParams$1 threeDsPresenter$getAuthenticationParams$122 = threeDsPresenter$getAuthenticationParams$1;
        Object obj2 = threeDsPresenter$getAuthenticationParams$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = threeDsPresenter$getAuthenticationParams$122.label;
        RealThreeDsAuthenticationManager realThreeDsAuthenticationManager2 = this.threeDsAuthenticationManager;
        RealThreeDsSpanTrackingService realThreeDsSpanTrackingService2 = this.spanTrackingService;
        BlockersScreens.ThreeDsAuthenticationScreen threeDsAuthenticationScreen2 = this.args;
        Transaction$AuthenticationRequestParameters transaction$AuthenticationRequestParameters22 = null;
        if (i != 0) {
        }
        transaction$AuthenticationRequestParameters = (Transaction$AuthenticationRequestParameters) obj2;
        if (transaction$AuthenticationRequestParameters != null) {
        }
        if (transaction$AuthenticationRequestParameters == null) {
        }
        Analytics analytics222 = this.analytics;
        String str5222 = threeDsAuthenticationScreen2.blockersData.flowToken;
        if (i2 != 1) {
        }
        analytics222.track(new ThreeDsAuthenticationUseAuthenticationParams(str5222, source), null);
        transaction$AuthenticationRequestParameters22 = transaction$AuthenticationRequestParameters;
        realThreeDsSpanTrackingService2.onAction(ThreeDsSpanAction$EndSdkAuthenticationParamsSpan.INSTANCE);
        return transaction$AuthenticationRequestParameters22;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getWarnings(ContinuationImpl continuationImpl) {
        ThreeDsPresenter$getWarnings$1 threeDsPresenter$getWarnings$1;
        int i;
        try {
            if (continuationImpl instanceof ThreeDsPresenter$getWarnings$1) {
                threeDsPresenter$getWarnings$1 = (ThreeDsPresenter$getWarnings$1) continuationImpl;
                int i2 = threeDsPresenter$getWarnings$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    threeDsPresenter$getWarnings$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = threeDsPresenter$getWarnings$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = threeDsPresenter$getWarnings$1.label;
                    int i3 = 0;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealThreeDsService realThreeDsService = this.threeDsService;
                        threeDsPresenter$getWarnings$1.label = 1;
                        try {
                            obj = new RealThreeDsService$$ExternalSyntheticLambda0(realThreeDsService, i3).invoke();
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } catch (Exception e) {
                            throw RealThreeDsService.asCashType(e);
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return (List) obj;
                }
            }
            if (i != 0) {
            }
            return (List) obj;
        } catch (Exception e2) {
            Timber.Forest forest = Timber.Forest;
            forest.tag("3DS");
            forest.e("Failed to retrieve 3DS SDK warnings", new Object[0], e2);
            if (e2 instanceof TimeoutCancellationException) {
                throw e2;
            }
            this.analytics.track(new ThreeDsAuthenticationSdkFailure(this.args.blockersData.flowToken, e2.getMessage()), null);
            return EmptyList.INSTANCE;
        }
        threeDsPresenter$getWarnings$1 = new ThreeDsPresenter$getWarnings$1(this, continuationImpl);
        Object obj2 = threeDsPresenter$getWarnings$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = threeDsPresenter$getWarnings$1.label;
        int i32 = 0;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(971021151);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Continuation continuation = null;
        Updater.LaunchedEffect(gapComposer, flow, new TaxWebAppBridge.AnonymousClass4(flow, continuation, this, 13));
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new ChatInputView$Content$1$1$1(this, continuation, 23);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            BlockersScreens.ThreeDsAuthenticationScreen threeDsAuthenticationScreen = this.args;
            Image image = threeDsAuthenticationScreen.issuerLogo;
            String str = threeDsAuthenticationScreen.progressMessage;
            rememberedValue3 = Updater.mutableStateOf$default(image != null ? new ThreeDsViewModel.IssuerLoading(str, image) : new ThreeDsViewModel.DefaultLoading(str));
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState2 = (MutableState) rememberedValue3;
        boolean changedInstance2 = gapComposer.changedInstance(this);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = new BottomSheet$$ExternalSyntheticLambda3(18, this, mutableState);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        Updater.DisposableEffect(unit, (Function1) rememberedValue4, gapComposer);
        boolean changedInstance3 = gapComposer.changedInstance(this);
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (changedInstance3 || rememberedValue5 == neverEqualPolicy) {
            rememberedValue5 = new Logger$_log$2(this, mutableState, continuation, 3);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue5);
        ThreeDsViewModel threeDsViewModel = (ThreeDsViewModel) mutableState2.getValue();
        gapComposer.end(false);
        return threeDsViewModel;
    }

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final DoubleCheck analytics;
        public final DoubleCheck appService;
        public final Provider blockersDataNavigator;
        public final DoubleCheck featureFlagManager;
        public final LambdaProvider ioDispatcher;
        public final LambdaProvider isDebug;
        public final Provider routerFactory;
        public final Provider spanTrackingService;
        public final LambdaProvider stringManager;
        public final DoubleCheck threeDsAuthenticationManager;
        public final DoubleCheck threeDsService;

        public MetroFactory(DoubleCheck doubleCheck, LambdaProvider lambdaProvider, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4, InstanceFactory instanceFactory, LambdaProvider lambdaProvider2, LambdaProvider lambdaProvider3, MusicViewFactory$MetroFactory musicViewFactory$MetroFactory, InstanceFactory instanceFactory2, DoubleCheck doubleCheck5) {
            this.threeDsService = doubleCheck;
            this.stringManager = lambdaProvider;
            this.threeDsAuthenticationManager = doubleCheck2;
            this.appService = doubleCheck3;
            this.featureFlagManager = doubleCheck4;
            this.blockersDataNavigator = instanceFactory;
            this.isDebug = lambdaProvider2;
            this.ioDispatcher = lambdaProvider3;
            this.spanTrackingService = musicViewFactory$MetroFactory;
            this.routerFactory = instanceFactory2;
            this.analytics = doubleCheck5;
        }

        public MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, RealBrazeManager.MetroFactory metroFactory, DoubleCheck doubleCheck3, BreadcrumbListener.MetroFactory metroFactory2, DoubleCheck doubleCheck4, DoubleCheck doubleCheck5, LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, LambdaProvider lambdaProvider3, InstanceFactory instanceFactory) {
            this.threeDsService = doubleCheck;
            this.threeDsAuthenticationManager = doubleCheck2;
            this.blockersDataNavigator = metroFactory;
            this.appService = doubleCheck3;
            this.spanTrackingService = metroFactory2;
            this.featureFlagManager = doubleCheck4;
            this.analytics = doubleCheck5;
            this.stringManager = lambdaProvider;
            this.isDebug = lambdaProvider2;
            this.ioDispatcher = lambdaProvider3;
            this.routerFactory = instanceFactory;
        }
    }
}
