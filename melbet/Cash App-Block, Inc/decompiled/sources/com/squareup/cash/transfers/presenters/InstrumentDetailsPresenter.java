package com.squareup.cash.transfers.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import androidx.core.text.TextUtilsCompat;
import androidx.glance.session.SessionWorker$doWork$2$2;
import app.cash.api.ApiResult;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.broadway.presenter.molecule.AnswerDispatcher;
import app.cash.broadway.presenter.molecule.AnswersKt;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda25;
import com.google.maps.android.compose.GoogleMapKt;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.bitcoin.presenters.BitcoinDepositsPresenter$$ExternalSyntheticLambda2;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.card.onboarding.CardModelView$lighting$$inlined$map$1;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientTransfersUseInstrumentCardArt;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.graphics.swampgl.components.Transform$special$$inlined$map$1;
import com.squareup.cash.instruments.backend.api.InstrumentManagerKt;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.instruments.viewmodels.InstrumentCellViewModel;
import com.squareup.cash.instruments.viewmodels.InstrumentIcon;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.permissions.AndroidPermissionManager;
import com.squareup.cash.permissions.AndroidPermissionManager$create$1;
import com.squareup.cash.permissions.ReadOnlyPermissions;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.recipients.data.RealRecipientRepository$suggestions$$inlined$map$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.shopping.web.ShoppingWebBridge$loadUrl$1;
import com.squareup.cash.support.incidents.backend.api.Incident;
import com.squareup.cash.support.incidents.backend.real.RealIncidentsService;
import com.squareup.cash.support.incidents.viewmodels.IncidentViewModel$Severity;
import com.squareup.cash.support.incidents.viewmodels.IncidentViewModel$SubscriptionAction;
import com.squareup.cash.support.presenters.ArticlePresenter$models$$inlined$AnswerHandler$1;
import com.squareup.cash.support.presenters.SupportIncidentDetailsPresenter$State;
import com.squareup.cash.support.presenters.SupportIncidentDetailsPresenter$WhenMappings;
import com.squareup.cash.support.presenters.SupportIncidentDetailsPresenter$updateIncidentSubscription$1;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.support.screens.SupportScreens$SupportDialogs$SupportFlowCheckConnectionScreen;
import com.squareup.cash.support.viewmodels.SupportIncidentDetailsViewModel;
import com.squareup.cash.tax.presenters.TaxWebAppPresenter$models$1$1;
import com.squareup.cash.tax.web.TaxWebAppBridge;
import com.squareup.cash.transfers.screens.BalanceBasedAutoReloadConfirmationScreen;
import com.squareup.cash.transfers.screens.InstrumentDetailsScreen;
import com.squareup.cash.transfers.screens.RecurringReloadConfigurationQuestion;
import com.squareup.cash.transfers.viewmodels.BalanceBasedAutoReloadConfirmationViewModel;
import com.squareup.cash.transfers.viewmodels.InstrumentDetailsViewModel;
import com.squareup.cash.ui.gcm.NotificationActionService$onHandleIntent$1;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.balancebasedaddcash.api.v1_0.AppService;
import com.squareup.protos.cash.balancebasedaddcash.api.v1_0.SetBalanceBasedAddCashPreferenceResponse;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class InstrumentDetailsPresenter implements MoleculePresenter {
    public final /* synthetic */ int $r8$classId = 2;
    public final Analytics analytics;
    public final Object args;
    public final Object flowStarter;
    public final Object instrumentManager;
    public final Object ioDispatcher;
    public final BetterNavigator.ScreenNavigator navigator;
    public final Object scope;
    public final AndroidStringManager stringManager;
    public final boolean useInstrumentCardArt;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CashInstrumentType.values().length];
            try {
                iArr[CashInstrumentType.DEBIT_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CashInstrumentType.CREDIT_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CashInstrumentType.BANK_ACCOUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public InstrumentDetailsPresenter(LocalizedMoneyFormatter.Factory factory, RealBalanceSnapshotManager realBalanceSnapshotManager, AppService appService, AndroidStringManager androidStringManager, BlockersDataNavigator blockersDataNavigator, Analytics analytics, FeatureFlagManager featureFlagManager, BalanceBasedAutoReloadConfirmationScreen balanceBasedAutoReloadConfirmationScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        balanceBasedAutoReloadConfirmationScreen.getClass();
        this.args = realBalanceSnapshotManager;
        this.instrumentManager = appService;
        this.stringManager = androidStringManager;
        this.flowStarter = blockersDataNavigator;
        this.analytics = analytics;
        this.ioDispatcher = balanceBasedAutoReloadConfirmationScreen;
        this.navigator = screenNavigator;
        this.scope = factory.create(MoneyFormatterConfig.COMPACT);
        this.useInstrumentCardArt = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) featureFlagManager).currentValue(AmplitudeExperiments$ClientTransfersUseInstrumentCardArt.INSTANCE)).enabled();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Integer, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$submitBlocker(InstrumentDetailsPresenter instrumentDetailsPresenter, Money money, Money money2, ContinuationImpl continuationImpl) {
        BalanceBasedAutoReloadConfirmationPresenter$submitBlocker$1 balanceBasedAutoReloadConfirmationPresenter$submitBlocker$1;
        int i;
        InstrumentDetailsPresenter instrumentDetailsPresenter2;
        AndroidStringManager androidStringManager;
        ?? r9;
        ApiResult apiResult;
        AndroidStringManager androidStringManager2 = instrumentDetailsPresenter.stringManager;
        BetterNavigator.ScreenNavigator screenNavigator = instrumentDetailsPresenter.navigator;
        BalanceBasedAutoReloadConfirmationScreen balanceBasedAutoReloadConfirmationScreen = (BalanceBasedAutoReloadConfirmationScreen) instrumentDetailsPresenter.ioDispatcher;
        if (continuationImpl instanceof BalanceBasedAutoReloadConfirmationPresenter$submitBlocker$1) {
            balanceBasedAutoReloadConfirmationPresenter$submitBlocker$1 = (BalanceBasedAutoReloadConfirmationPresenter$submitBlocker$1) continuationImpl;
            int i2 = balanceBasedAutoReloadConfirmationPresenter$submitBlocker$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                balanceBasedAutoReloadConfirmationPresenter$submitBlocker$1.label = i2 - PKIFailureInfo.systemUnavail;
                BalanceBasedAutoReloadConfirmationPresenter$submitBlocker$1 balanceBasedAutoReloadConfirmationPresenter$submitBlocker$12 = balanceBasedAutoReloadConfirmationPresenter$submitBlocker$1;
                Object obj = balanceBasedAutoReloadConfirmationPresenter$submitBlocker$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = balanceBasedAutoReloadConfirmationPresenter$submitBlocker$12.label;
                boolean z = true;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Analytics analytics = instrumentDetailsPresenter.analytics;
                    BlockersData blockersData = balanceBasedAutoReloadConfirmationScreen.blockersData;
                    SessionWorker$doWork$2$2 sessionWorker$doWork$2$2 = new SessionWorker$doWork$2$2(instrumentDetailsPresenter, money, money2, continuation, 22);
                    instrumentDetailsPresenter2 = instrumentDetailsPresenter;
                    balanceBasedAutoReloadConfirmationPresenter$submitBlocker$12.label = 1;
                    androidStringManager = androidStringManager2;
                    r9 = 0;
                    obj = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(24, blockersData, analytics, androidStringManager, balanceBasedAutoReloadConfirmationPresenter$submitBlocker$12, null, sessionWorker$doWork$2$2);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    instrumentDetailsPresenter2 = instrumentDetailsPresenter;
                    r9 = 0;
                    androidStringManager = androidStringManager2;
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Failure)) {
                    screenNavigator.goTo(new ProfileScreens.ErrorScreen(TextUtilsCompat.errorMessaging(androidStringManager, (ApiResult.Failure) apiResult, r9).message, r9, 14));
                    z = false;
                } else {
                    if (!(apiResult instanceof ApiResult.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) instrumentDetailsPresenter2.flowStarter;
                    BlockersData blockersData2 = balanceBasedAutoReloadConfirmationScreen.blockersData;
                    ResponseContext responseContext = ((SetBalanceBasedAddCashPreferenceResponse) ((ApiResult.Success) apiResult).response).response_context;
                    responseContext.getClass();
                    Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                    screenNavigator.goTo(blockersDataNavigator.getNext(balanceBasedAutoReloadConfirmationScreen, blockersData2.updateFromResponseContext(responseContext, false)));
                }
                return Boolean.valueOf(z);
            }
        }
        balanceBasedAutoReloadConfirmationPresenter$submitBlocker$1 = new BalanceBasedAutoReloadConfirmationPresenter$submitBlocker$1(instrumentDetailsPresenter, continuationImpl);
        BalanceBasedAutoReloadConfirmationPresenter$submitBlocker$1 balanceBasedAutoReloadConfirmationPresenter$submitBlocker$122 = balanceBasedAutoReloadConfirmationPresenter$submitBlocker$1;
        Object obj2 = balanceBasedAutoReloadConfirmationPresenter$submitBlocker$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = balanceBasedAutoReloadConfirmationPresenter$submitBlocker$122.label;
        boolean z2 = true;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Failure)) {
        }
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a7, code lost:
    
        if (r2 == r6) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$updateIncidentSubscription(InstrumentDetailsPresenter instrumentDetailsPresenter, IncidentViewModel$SubscriptionAction incidentViewModel$SubscriptionAction, MutableState mutableState, ContinuationImpl continuationImpl) {
        SupportIncidentDetailsPresenter$updateIncidentSubscription$1 supportIncidentDetailsPresenter$updateIncidentSubscription$1;
        Object obj;
        int i;
        MutableState mutableState2;
        int ordinal;
        IncidentViewModel$SubscriptionAction incidentViewModel$SubscriptionAction2;
        MutableState mutableState3;
        boolean booleanValue;
        IncidentViewModel$SubscriptionAction incidentViewModel$SubscriptionAction3;
        int i2;
        IncidentViewModel$SubscriptionAction incidentViewModel$SubscriptionAction4 = incidentViewModel$SubscriptionAction;
        SupportScreens.FlowScreens.SupportIncidentDetailsScreen supportIncidentDetailsScreen = (SupportScreens.FlowScreens.SupportIncidentDetailsScreen) instrumentDetailsPresenter.scope;
        RealIncidentsService realIncidentsService = (RealIncidentsService) instrumentDetailsPresenter.args;
        if (continuationImpl instanceof SupportIncidentDetailsPresenter$updateIncidentSubscription$1) {
            supportIncidentDetailsPresenter$updateIncidentSubscription$1 = (SupportIncidentDetailsPresenter$updateIncidentSubscription$1) continuationImpl;
            int i3 = supportIncidentDetailsPresenter$updateIncidentSubscription$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                supportIncidentDetailsPresenter$updateIncidentSubscription$1.label = i3 - PKIFailureInfo.systemUnavail;
                obj = supportIncidentDetailsPresenter$updateIncidentSubscription$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = supportIncidentDetailsPresenter$updateIncidentSubscription$1.label;
                int i4 = 2;
                Incident incident = null;
                Object[] objArr = 0;
                boolean z = true;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (instrumentDetailsPresenter.useInstrumentCardArt && incidentViewModel$SubscriptionAction4 == IncidentViewModel$SubscriptionAction.SUBSCRIBE) {
                        AndroidPermissionManager$create$1 create = ((AndroidPermissionManager) instrumentDetailsPresenter.flowStarter).create("android.permission.POST_NOTIFICATIONS");
                        ReadOnlyPermissions readOnlyPermissions = create.$readonly;
                        if (!readOnlyPermissions.check()) {
                            supportIncidentDetailsPresenter$updateIncidentSubscription$1.L$0 = incidentViewModel$SubscriptionAction4;
                            mutableState2 = mutableState;
                            supportIncidentDetailsPresenter$updateIncidentSubscription$1.L$1 = mutableState2;
                            supportIncidentDetailsPresenter$updateIncidentSubscription$1.label = 1;
                            create.request();
                            obj = FlowKt.first(FlowKt.merge(new RealRecipientRepository$suggestions$$inlined$map$1(readOnlyPermissions.granted(), 23), new RealRecipientRepository$suggestions$$inlined$map$1(readOnlyPermissions.denied(), 24)), supportIncidentDetailsPresenter$updateIncidentSubscription$1);
                        }
                    }
                    mutableState2 = mutableState;
                    mutableState2.setValue(SupportIncidentDetailsPresenter$State.copy$default((SupportIncidentDetailsPresenter$State) mutableState2.getValue(), null, true, 3));
                    ordinal = incidentViewModel$SubscriptionAction4.ordinal();
                    if (ordinal == 0) {
                        String str = supportIncidentDetailsScreen.incidentId;
                        supportIncidentDetailsPresenter$updateIncidentSubscription$1.L$0 = incidentViewModel$SubscriptionAction4;
                        supportIncidentDetailsPresenter$updateIncidentSubscription$1.L$1 = mutableState2;
                        supportIncidentDetailsPresenter$updateIncidentSubscription$1.label = 2;
                        obj = realIncidentsService.subscribeToIncident(str, supportIncidentDetailsPresenter$updateIncidentSubscription$1);
                        if (obj != obj2) {
                            incidentViewModel$SubscriptionAction2 = incidentViewModel$SubscriptionAction4;
                            mutableState3 = mutableState2;
                            booleanValue = ((Boolean) obj).booleanValue();
                            if (!booleanValue) {
                            }
                            if (booleanValue) {
                            }
                            mutableState3.setValue(SupportIncidentDetailsPresenter$State.copy$default((SupportIncidentDetailsPresenter$State) mutableState3.getValue(), incident, false, 2));
                            return Unit.INSTANCE;
                        }
                    } else {
                        if (ordinal != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        String str2 = supportIncidentDetailsScreen.incidentId;
                        supportIncidentDetailsPresenter$updateIncidentSubscription$1.L$0 = incidentViewModel$SubscriptionAction4;
                        supportIncidentDetailsPresenter$updateIncidentSubscription$1.L$1 = mutableState2;
                        supportIncidentDetailsPresenter$updateIncidentSubscription$1.label = 3;
                        obj = realIncidentsService.unsubscribeFromIncident(str2, supportIncidentDetailsPresenter$updateIncidentSubscription$1);
                        if (obj != obj2) {
                            incidentViewModel$SubscriptionAction2 = incidentViewModel$SubscriptionAction4;
                            mutableState3 = mutableState2;
                            booleanValue = ((Boolean) obj).booleanValue();
                            if (!booleanValue) {
                            }
                            if (booleanValue) {
                            }
                            mutableState3.setValue(SupportIncidentDetailsPresenter$State.copy$default((SupportIncidentDetailsPresenter$State) mutableState3.getValue(), incident, false, 2));
                            return Unit.INSTANCE;
                        }
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i == 2) {
                        mutableState3 = supportIncidentDetailsPresenter$updateIncidentSubscription$1.L$1;
                        incidentViewModel$SubscriptionAction2 = supportIncidentDetailsPresenter$updateIncidentSubscription$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        booleanValue = ((Boolean) obj).booleanValue();
                        if (!booleanValue) {
                        }
                        if (booleanValue) {
                        }
                        mutableState3.setValue(SupportIncidentDetailsPresenter$State.copy$default((SupportIncidentDetailsPresenter$State) mutableState3.getValue(), incident, false, 2));
                        return Unit.INSTANCE;
                    }
                    if (i != 3) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mutableState3 = supportIncidentDetailsPresenter$updateIncidentSubscription$1.L$1;
                    incidentViewModel$SubscriptionAction2 = supportIncidentDetailsPresenter$updateIncidentSubscription$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    booleanValue = ((Boolean) obj).booleanValue();
                    if (!booleanValue) {
                        BetterNavigator.ScreenNavigator screenNavigator = instrumentDetailsPresenter.navigator;
                        AndroidStringManager androidStringManager = instrumentDetailsPresenter.stringManager;
                        int ordinal2 = incidentViewModel$SubscriptionAction2.ordinal();
                        if (ordinal2 == 0) {
                            i2 = R.string.support_home_incident_subscription_failed;
                        } else {
                            if (ordinal2 != 1) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            i2 = R.string.support_home_incident_unsubscription_failed;
                        }
                        screenNavigator.goTo(new SupportScreens$SupportDialogs$SupportFlowCheckConnectionScreen(androidStringManager.get(i2), (String) (objArr == true ? 1 : 0), i4));
                    }
                    if (booleanValue) {
                        incident = ((SupportIncidentDetailsPresenter$State) mutableState3.getValue()).incident;
                    } else {
                        int ordinal3 = incidentViewModel$SubscriptionAction2.ordinal();
                        if (ordinal3 == 0) {
                            incidentViewModel$SubscriptionAction3 = IncidentViewModel$SubscriptionAction.UNSUBSCRIBE;
                        } else {
                            if (ordinal3 != 1) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            incidentViewModel$SubscriptionAction3 = IncidentViewModel$SubscriptionAction.SUBSCRIBE;
                        }
                        int ordinal4 = incidentViewModel$SubscriptionAction3.ordinal();
                        if (ordinal4 == 0) {
                            z = false;
                        } else if (ordinal4 != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        Incident incident2 = ((SupportIncidentDetailsPresenter$State) mutableState3.getValue()).incident;
                        if (incident2 != null) {
                            incident = Incident.copy$default(incident2, z);
                        }
                    }
                    mutableState3.setValue(SupportIncidentDetailsPresenter$State.copy$default((SupportIncidentDetailsPresenter$State) mutableState3.getValue(), incident, false, 2));
                    return Unit.INSTANCE;
                }
                MutableState mutableState4 = supportIncidentDetailsPresenter$updateIncidentSubscription$1.L$1;
                IncidentViewModel$SubscriptionAction incidentViewModel$SubscriptionAction5 = supportIncidentDetailsPresenter$updateIncidentSubscription$1.L$0;
                SafeTrace.throwOnFailure(obj);
                mutableState2 = mutableState4;
                incidentViewModel$SubscriptionAction4 = incidentViewModel$SubscriptionAction5;
                if (!((Boolean) obj).booleanValue()) {
                    Timber.Forest.d("Notification permission not granted for incident subscription", new Object[0]);
                }
                mutableState2.setValue(SupportIncidentDetailsPresenter$State.copy$default((SupportIncidentDetailsPresenter$State) mutableState2.getValue(), null, true, 3));
                ordinal = incidentViewModel$SubscriptionAction4.ordinal();
                if (ordinal == 0) {
                }
                return obj2;
            }
        }
        supportIncidentDetailsPresenter$updateIncidentSubscription$1 = new SupportIncidentDetailsPresenter$updateIncidentSubscription$1(instrumentDetailsPresenter, continuationImpl);
        obj = supportIncidentDetailsPresenter$updateIncidentSubscription$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = supportIncidentDetailsPresenter$updateIncidentSubscription$1.label;
        int i42 = 2;
        Incident incident3 = null;
        Object[] objArr2 = 0;
        boolean z2 = true;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        mutableState2.setValue(SupportIncidentDetailsPresenter$State.copy$default((SupportIncidentDetailsPresenter$State) mutableState2.getValue(), null, true, 3));
        ordinal = incidentViewModel$SubscriptionAction4.ordinal();
        if (ordinal == 0) {
        }
        return obj22;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x041f  */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4, types: [com.squareup.cash.support.viewmodels.SupportIncidentDetailsViewModel$ButtonViewModel] */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.List] */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        InstrumentDetailsViewModel.DefaultState notSet;
        boolean z;
        Instrument instrument;
        InstrumentIcon instrumentIcon;
        int i2;
        String str;
        int i3;
        String str2;
        InstrumentIcon.IconShape iconShape;
        boolean z2;
        Instrument instrument2;
        Instrument instrument3;
        IncidentViewModel$Severity incidentViewModel$Severity;
        String format2;
        String str3;
        IncidentViewModel$SubscriptionAction incidentViewModel$SubscriptionAction;
        ?? r23;
        Object loaded;
        Object obj;
        InstrumentCellViewModel instrumentCellViewModel;
        ArrayList arrayList;
        int i4 = this.$r8$classId;
        Object obj2 = this.instrumentManager;
        boolean z3 = this.useInstrumentCardArt;
        Object obj3 = this.args;
        int i5 = 2;
        Object obj4 = Composer.Companion.Empty;
        AndroidStringManager androidStringManager = this.stringManager;
        switch (i4) {
            case 0:
                InstrumentDetailsScreen instrumentDetailsScreen = (InstrumentDetailsScreen) obj3;
                flow.getClass();
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(-1389986030);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == obj4) {
                    RealInstrumentManager realInstrumentManager = (RealInstrumentManager) obj2;
                    String instrumentToken = instrumentDetailsScreen.getInstrumentToken();
                    instrumentToken.getClass();
                    rememberedValue = StateFlowKt.runUntil(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(new Transform$special$$inlined$map$1(RealInstrumentManager.syncValueBased$default(realInstrumentManager), instrumentToken, 20), 24), realInstrumentManager.signOut);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, null, null, gapComposer, 48, 2);
                Updater.LaunchedEffect(gapComposer, flow, new TaxWebAppBridge.AnonymousClass4(flow, (Continuation) null, this, 18));
                String str4 = androidStringManager.get(R.string.instrument_details_default_payment_method_title);
                String str5 = androidStringManager.get(R.string.instrument_details_default_payment_method_subtitle);
                Instrument instrument4 = (Instrument) collectAsState.getValue();
                if ((instrument4 != null ? instrument4.cashInstrumentType : null) != CashInstrumentType.DEBIT_CARD) {
                    notSet = InstrumentDetailsViewModel.DefaultState.Invalid.INSTANCE;
                } else {
                    Instrument instrument5 = (Instrument) collectAsState.getValue();
                    notSet = (instrument5 == null || !instrument5.defaultForInstrumentType) ? new InstrumentDetailsViewModel.DefaultState.NotSet(str4, str5, androidStringManager.get(R.string.instrument_details_set_default_button)) : new InstrumentDetailsViewModel.DefaultState.Set(str4, str5);
                }
                if (z3) {
                    Instrument instrument6 = (Instrument) collectAsState.getValue();
                    if ((instrument6 != null ? instrument6.cardImageUrl : null) != null) {
                        z = true;
                        String cardInfoLabel = (z3 || (instrument3 = (Instrument) collectAsState.getValue()) == null) ? null : UtilsKt.cardInfoLabel(instrument3, androidStringManager);
                        String str6 = (z3 || (instrument2 = (Instrument) collectAsState.getValue()) == null) ? null : instrument2.bankName;
                        String instrumentToken2 = instrumentDetailsScreen.getInstrumentToken();
                        Instrument instrument7 = (Instrument) collectAsState.getValue();
                        String str7 = instrument7 == null ? instrument7.displayName : null;
                        Instrument instrument8 = (Instrument) collectAsState.getValue();
                        String str8 = instrument8 == null ? instrument8.displayNameCompact : null;
                        Instrument instrument9 = (Instrument) collectAsState.getValue();
                        String str9 = instrument9 == null ? instrument9.bankName : null;
                        instrument = (Instrument) collectAsState.getValue();
                        if (instrument == null) {
                            Icons icons = notSet instanceof InstrumentDetailsViewModel.DefaultState.Set ? Icons.FavoriteFill16 : null;
                            if (z3) {
                                Instrument instrument10 = (Instrument) collectAsState.getValue();
                                if ((instrument10 != null ? instrument10.cashInstrumentType : null) != CashInstrumentType.BANK_ACCOUNT) {
                                    iconShape = InstrumentIcon.IconShape.CARD;
                                    if (z3) {
                                        Instrument instrument11 = (Instrument) collectAsState.getValue();
                                        if ((instrument11 != null ? instrument11.cashInstrumentType : null) != CashInstrumentType.BANK_ACCOUNT) {
                                            z2 = true;
                                            instrumentIcon = GoogleMapKt.instrumentIcon(instrument, icons, iconShape, z2);
                                        }
                                    }
                                    z2 = false;
                                    instrumentIcon = GoogleMapKt.instrumentIcon(instrument, icons, iconShape, z2);
                                }
                            }
                            iconShape = InstrumentIcon.IconShape.CIRCLE;
                            if (z3) {
                            }
                            z2 = false;
                            instrumentIcon = GoogleMapKt.instrumentIcon(instrument, icons, iconShape, z2);
                        } else {
                            instrumentIcon = null;
                        }
                        CashInstrumentType instrumentType = instrumentDetailsScreen.getInstrumentType();
                        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                        i2 = iArr[instrumentType.ordinal()];
                        if (i2 != 1) {
                            str = androidStringManager.get(R.string.card_options_remove_debit_card);
                        } else if (i2 == 2) {
                            str = androidStringManager.get(R.string.card_options_remove_card);
                        } else {
                            if (i2 != 3) {
                                throw new AssertionError(instrumentDetailsScreen.getInstrumentType() + " is not removable");
                            }
                            str = androidStringManager.get(R.string.card_options_remove_bank);
                        }
                        String str10 = str;
                        i3 = iArr[instrumentDetailsScreen.getInstrumentType().ordinal()];
                        if (i3 != 1) {
                            str2 = androidStringManager.get(R.string.card_options_replace_debit_card);
                        } else if (i3 == 2) {
                            str2 = androidStringManager.get(R.string.card_options_replace_card);
                        } else {
                            if (i3 != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline2.m$1(instrumentDetailsScreen.getInstrumentToken(), " is not replaceable"));
                                return null;
                            }
                            str2 = androidStringManager.get(R.string.card_options_replace_bank);
                        }
                        InstrumentDetailsViewModel instrumentDetailsViewModel = new InstrumentDetailsViewModel(instrumentToken2, str7, str8, str9, instrumentIcon, str10, str2, notSet, z, cardInfoLabel, str6);
                        gapComposer.end(false);
                        return instrumentDetailsViewModel;
                    }
                }
                z = false;
                if (z3) {
                }
                if (z3) {
                }
                String instrumentToken22 = instrumentDetailsScreen.getInstrumentToken();
                Instrument instrument72 = (Instrument) collectAsState.getValue();
                if (instrument72 == null) {
                }
                Instrument instrument82 = (Instrument) collectAsState.getValue();
                if (instrument82 == null) {
                }
                Instrument instrument92 = (Instrument) collectAsState.getValue();
                if (instrument92 == null) {
                }
                instrument = (Instrument) collectAsState.getValue();
                if (instrument == null) {
                }
                CashInstrumentType instrumentType2 = instrumentDetailsScreen.getInstrumentType();
                int[] iArr2 = WhenMappings.$EnumSwitchMapping$0;
                i2 = iArr2[instrumentType2.ordinal()];
                if (i2 != 1) {
                }
                String str102 = str;
                i3 = iArr2[instrumentDetailsScreen.getInstrumentType().ordinal()];
                if (i3 != 1) {
                }
                InstrumentDetailsViewModel instrumentDetailsViewModel2 = new InstrumentDetailsViewModel(instrumentToken22, str7, str8, str9, instrumentIcon, str102, str2, notSet, z, cardInfoLabel, str6);
                gapComposer.end(false);
                return instrumentDetailsViewModel2;
            case 1:
                flow.getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(-1995267453);
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (rememberedValue2 == obj4) {
                    rememberedValue2 = Updater.mutableStateOf$default(new SupportIncidentDetailsPresenter$State(null, true, false));
                    gapComposer2.updateRememberedValue(rememberedValue2);
                }
                MutableState mutableState = (MutableState) rememberedValue2;
                Unit unit = Unit.INSTANCE;
                boolean changedInstance = gapComposer2.changedInstance(this);
                Object rememberedValue3 = gapComposer2.rememberedValue();
                if (changedInstance || rememberedValue3 == obj4) {
                    rememberedValue3 = new ShoppingWebBridge$loadUrl$1(this, mutableState, null, 24);
                    gapComposer2.updateRememberedValue(rememberedValue3);
                }
                Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue3);
                Continuation continuation = null;
                Updater.LaunchedEffect(gapComposer2, flow, new TaxWebAppPresenter$models$1$1(flow, continuation, (MoleculePresenter) this, mutableState, 16));
                SupportIncidentDetailsPresenter$State supportIncidentDetailsPresenter$State = (SupportIncidentDetailsPresenter$State) mutableState.getValue();
                if (supportIncidentDetailsPresenter$State.loading) {
                    obj = SupportIncidentDetailsViewModel.Loading.INSTANCE;
                } else {
                    Incident incident = supportIncidentDetailsPresenter$State.incident;
                    if (incident != null) {
                        boolean z4 = supportIncidentDetailsPresenter$State.updatingSubscription;
                        Resources resources = androidStringManager.resources;
                        String str11 = incident.id;
                        String str12 = incident.title;
                        String str13 = incident.details;
                        Incident.Status status = incident.status;
                        int ordinal = status.ordinal();
                        if (ordinal == 0) {
                            incidentViewModel$Severity = IncidentViewModel$Severity.ERROR;
                        } else if (ordinal == 1) {
                            incidentViewModel$Severity = IncidentViewModel$Severity.INFO;
                        } else if (ordinal == 2) {
                            incidentViewModel$Severity = IncidentViewModel$Severity.RESOLVED;
                        } else {
                            if (ordinal != 3) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            incidentViewModel$Severity = IncidentViewModel$Severity.INFO;
                        }
                        IncidentViewModel$Severity incidentViewModel$Severity2 = incidentViewModel$Severity;
                        ZonedDateTime ofInstant = ZonedDateTime.ofInstant(incident.timestamp, ZoneId.of(((AndroidClock) obj2).timeZone().getID()));
                        String format3 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(ofInstant);
                        String format4 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).format(ofInstant);
                        if (SupportIncidentDetailsPresenter$WhenMappings.$EnumSwitchMapping$1[status.ordinal()] == 3) {
                            format3.getClass();
                            format4.getClass();
                            resources.getClass();
                            format2 = new MessageFormat(resources.getString(R.string.support_home_incident_resolved_status)).format(new Object[]{format3, format4});
                            format2.getClass();
                        } else {
                            format3.getClass();
                            format4.getClass();
                            resources.getClass();
                            format2 = new MessageFormat(resources.getString(R.string.support_home_incident_ongoing_status)).format(new Object[]{format3, format4});
                            format2.getClass();
                        }
                        String str14 = format2;
                        Object obj5 = continuation;
                        if (incident.canChangeSubscription) {
                            if (z4) {
                                r23 = SupportIncidentDetailsViewModel.ButtonViewModel.UpdatingSubscription.INSTANCE;
                                loaded = new SupportIncidentDetailsViewModel.Loaded(str11, str12, str13, incidentViewModel$Severity2, str14, r23);
                                gapComposer2.end(false);
                                return loaded;
                            }
                            if (incident.isSubscribed) {
                                str3 = androidStringManager.get(R.string.support_incident_details_subscribed_button_text);
                                incidentViewModel$SubscriptionAction = IncidentViewModel$SubscriptionAction.UNSUBSCRIBE;
                            } else {
                                str3 = androidStringManager.get(R.string.support_incident_details_notify_button_text);
                                incidentViewModel$SubscriptionAction = IncidentViewModel$SubscriptionAction.SUBSCRIBE;
                            }
                            obj5 = new SupportIncidentDetailsViewModel.ButtonViewModel.Display(str3, incidentViewModel$SubscriptionAction);
                        }
                        r23 = obj5;
                        loaded = new SupportIncidentDetailsViewModel.Loaded(str11, str12, str13, incidentViewModel$Severity2, str14, r23);
                        gapComposer2.end(false);
                        return loaded;
                    }
                    obj = SupportIncidentDetailsViewModel.Empty.INSTANCE;
                }
                loaded = obj;
                gapComposer2.end(false);
                return loaded;
            default:
                MoneyFormatter moneyFormatter = (MoneyFormatter) this.scope;
                BalanceBasedAutoReloadConfirmationScreen balanceBasedAutoReloadConfirmationScreen = (BalanceBasedAutoReloadConfirmationScreen) this.ioDispatcher;
                flow.getClass();
                ?? r4 = (GapComposer) composer;
                r4.startReplaceGroup(-1051592125);
                Object rememberedValue4 = r4.rememberedValue();
                if (rememberedValue4 == obj4) {
                    rememberedValue4 = Updater.mutableStateOf$default(balanceBasedAutoReloadConfirmationScreen.confirmationData.minimumBalanceConfig.initialAmount);
                    r4.updateRememberedValue(rememberedValue4);
                }
                MutableState mutableState2 = (MutableState) rememberedValue4;
                Object rememberedValue5 = r4.rememberedValue();
                if (rememberedValue5 == obj4) {
                    rememberedValue5 = Updater.mutableStateOf$default(balanceBasedAutoReloadConfirmationScreen.confirmationData.incrementAmountConfig.initialAmount);
                    r4.updateRememberedValue(rememberedValue5);
                }
                MutableState mutableState3 = (MutableState) rememberedValue5;
                Object rememberedValue6 = r4.rememberedValue();
                if (rememberedValue6 == obj4) {
                    CardModelView$lighting$$inlined$map$1 cardModelView$lighting$$inlined$map$1 = new CardModelView$lighting$$inlined$map$1(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(((RealBalanceSnapshotManager) obj3).select(), 24), 15);
                    r4.updateRememberedValue(cardModelView$lighting$$inlined$map$1);
                    rememberedValue6 = cardModelView$lighting$$inlined$map$1;
                }
                Updater.collectAsState((Flow) rememberedValue6, null, null, r4, 48, 2);
                Object rememberedValue7 = r4.rememberedValue();
                if (rememberedValue7 == obj4) {
                    rememberedValue7 = Updater.mutableStateOf$default(Boolean.FALSE);
                    r4.updateRememberedValue(rememberedValue7);
                }
                MutableState mutableState4 = (MutableState) rememberedValue7;
                Updater.LaunchedEffect((Composer) r4, flow, new NotificationActionService$onHandleIntent$1(flow, (Continuation) null, this, mutableState4, mutableState2, mutableState3, 16));
                Object rememberedValue8 = r4.rememberedValue();
                if (rememberedValue8 == obj4) {
                    rememberedValue8 = new BitcoinDepositsPresenter$$ExternalSyntheticLambda2(mutableState2, mutableState3, i5);
                    r4.updateRememberedValue(rememberedValue8);
                }
                Function2 function2 = (Function2) rememberedValue8;
                AnswerDispatcher answerDispatcher = (AnswerDispatcher) r4.consume(AnswersKt.LocalAnswerDispatcher);
                boolean changedInstance2 = r4.changedInstance(answerDispatcher);
                Object rememberedValue9 = r4.rememberedValue();
                if (changedInstance2 || rememberedValue9 == obj4) {
                    rememberedValue9 = new ArticlePresenter$models$$inlined$AnswerHandler$1(function2, answerDispatcher, 29);
                    r4.updateRememberedValue(rememberedValue9);
                }
                Updater.DisposableEffect(answerDispatcher, (Function1) rememberedValue9, (Composer) r4);
                if (((Boolean) mutableState4.getValue()).booleanValue()) {
                    r4.startReplaceGroup(-486872849);
                    boolean changedInstance3 = r4.changedInstance(this);
                    Object rememberedValue10 = r4.rememberedValue();
                    if (changedInstance3 || rememberedValue10 == obj4) {
                        TaxWebAppPresenter$models$1$1 taxWebAppPresenter$models$1$1 = new TaxWebAppPresenter$models$1$1(this, mutableState2, mutableState3, mutableState4, (Continuation) null);
                        r4.updateRememberedValue(taxWebAppPresenter$models$1$1);
                        rememberedValue10 = taxWebAppPresenter$models$1$1;
                    }
                    Updater.LaunchedEffect((Composer) r4, "Submit blocker", (Function2) rememberedValue10);
                    r4.end(false);
                    r4.end(false);
                    return BalanceBasedAutoReloadConfirmationViewModel.Loading.INSTANCE;
                }
                r4.startReplaceGroup(-486642209);
                r4.end(false);
                BalanceBasedAutoReloadConfirmationScreen.ConfirmationData confirmationData = balanceBasedAutoReloadConfirmationScreen.confirmationData;
                String str15 = confirmationData.title;
                BalanceBasedAutoReloadConfirmationScreen.ConfirmationData.FundingSource fundingSource = confirmationData.fundingSource;
                String str16 = confirmationData.subtitle;
                BalanceBasedAutoReloadConfirmationViewModel.Content.Preference preference = new BalanceBasedAutoReloadConfirmationViewModel.Content.Preference(confirmationData.minimumBalanceConfig.title, moneyFormatter.format((Money) mutableState2.getValue()));
                BalanceBasedAutoReloadConfirmationViewModel.Content.Preference preference2 = new BalanceBasedAutoReloadConfirmationViewModel.Content.Preference(confirmationData.incrementAmountConfig.title, moneyFormatter.format((Money) mutableState3.getValue()));
                BalanceBasedAutoReloadConfirmationViewModel.Content.FundingSource fundingSource2 = new BalanceBasedAutoReloadConfirmationViewModel.Content.FundingSource(androidStringManager.get(R.string.balance_based_add_cash_funding_source_header), fundingSource.debitCardName, fundingSource.bankName);
                com.squareup.protos.franklin.api.Instrument instrument12 = fundingSource.instrument;
                if (instrument12 != null) {
                    Instrument commonInstrument = InstrumentManagerKt.toCommonInstrument(instrument12);
                    CashInstrumentType cashInstrumentType = commonInstrument.cashInstrumentType;
                    InstrumentIcon instrumentIcon$default = GoogleMapKt.instrumentIcon$default(commonInstrument, null, (z3 && (cashInstrumentType == CashInstrumentType.DEBIT_CARD || cashInstrumentType == CashInstrumentType.CREDIT_CARD)) ? InstrumentIcon.IconShape.CARD : InstrumentIcon.IconShape.CIRCLE, 5);
                    if (z3) {
                        arrayList = CollectionsKt__CollectionsJVMKt.listOf(instrumentIcon$default);
                    } else {
                        List listOf = CollectionsKt__CollectionsJVMKt.listOf(instrumentIcon$default);
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj6 : listOf) {
                            if (!(((InstrumentIcon) obj6) instanceof InstrumentIcon.LocalIcon)) {
                                arrayList2.add(obj6);
                            }
                        }
                        arrayList = arrayList2;
                    }
                    String str17 = commonInstrument.displayNameCompact;
                    if (str17 == null) {
                        str17 = fundingSource.debitCardName;
                    }
                    instrumentCellViewModel = new InstrumentCellViewModel(str17, null, true, arrayList, InstrumentCellViewModel.Accessory.Info.INSTANCE, null, androidStringManager.get(R.string.transfers_cash_in_instrument_selector_from), null, null, 416);
                } else {
                    instrumentCellViewModel = null;
                }
                BalanceBasedAutoReloadConfirmationViewModel.Content content = new BalanceBasedAutoReloadConfirmationViewModel.Content(str15, str16, preference, preference2, fundingSource2, instrumentCellViewModel, confirmationData.ctaButtonLabel);
                r4.end(false);
                return content;
        }
    }

    public void openRecurringReloadConfiguration(Money money, Money money2, boolean z) {
        this.navigator.askQuestion(RecurringReloadConfigurationQuestion.INSTANCE, new UserJavascriptInterfaceBase$$ExternalSyntheticLambda25(money, money2, z, this, 17));
    }

    public InstrumentDetailsPresenter(RealIncidentsService realIncidentsService, AndroidClock androidClock, AndroidStringManager androidStringManager, Analytics analytics, AndroidPermissionManager androidPermissionManager, IntentLauncher intentLauncher, SupportScreens.FlowScreens.SupportIncidentDetailsScreen supportIncidentDetailsScreen, BetterNavigator.ScreenNavigator screenNavigator, boolean z) {
        supportIncidentDetailsScreen.getClass();
        this.args = realIncidentsService;
        this.instrumentManager = androidClock;
        this.stringManager = androidStringManager;
        this.analytics = analytics;
        this.flowStarter = androidPermissionManager;
        this.ioDispatcher = intentLauncher;
        this.scope = supportIncidentDetailsScreen;
        this.navigator = screenNavigator;
        this.useInstrumentCardArt = z;
    }

    public InstrumentDetailsPresenter(InstrumentDetailsScreen instrumentDetailsScreen, BetterNavigator.ScreenNavigator screenNavigator, RealInstrumentManager realInstrumentManager, AndroidStringManager androidStringManager, FlowStarter flowStarter, Analytics analytics, CoroutineContext coroutineContext, CoroutineScope coroutineScope, FeatureFlagManager featureFlagManager) {
        instrumentDetailsScreen.getClass();
        this.args = instrumentDetailsScreen;
        this.navigator = screenNavigator;
        this.instrumentManager = realInstrumentManager;
        this.stringManager = androidStringManager;
        this.flowStarter = flowStarter;
        this.analytics = analytics;
        this.ioDispatcher = coroutineContext;
        this.scope = coroutineScope;
        this.useInstrumentCardArt = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) featureFlagManager).currentValue(AmplitudeExperiments$ClientTransfersUseInstrumentCardArt.INSTANCE)).enabled();
    }
}
