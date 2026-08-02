package com.squareup.cash.transfers.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import androidx.core.text.TextUtilsCompat;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.AnswerDispatcher;
import app.cash.broadway.presenter.molecule.AnswersKt;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.maps.android.compose.GoogleMapKt;
import com.squareup.cash.R;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.cash.CashRecurringDepositComplete;
import com.squareup.cash.cdf.cash.CashRecurringDepositReceiveError;
import com.squareup.cash.cdf.cash.CashRecurringDepositUpdateAmount;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.instruments.viewmodels.InstrumentCellViewModel;
import com.squareup.cash.instruments.viewmodels.InstrumentIcon;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.DbSessionManager$updateDb$2;
import com.squareup.cash.transfers.backend.api.ScheduledReloadsManager;
import com.squareup.cash.transfers.backend.api.ScheduledReloadsPreference;
import com.squareup.cash.transfers.backend.real.RealScheduledReloadsManager;
import com.squareup.cash.transfers.screens.RecurringReloadConfigurationScreen;
import com.squareup.cash.transfers.screens.ScheduledReloadConfirmationScreen;
import com.squareup.cash.transfers.viewmodels.ScheduledReloadConfirmationViewModel;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.SetScheduledTransactionPreferenceRequest;
import com.squareup.protos.franklin.app.SetScheduledTransactionPreferenceResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import com.squareup.protos.repeatedly.common.ScheduledTransactionPreference;
import com.squareup.util.compose.LifecycleKt$$ExternalSyntheticLambda0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class ScheduledReloadConfirmationPresenter implements MoleculePresenter {
    public static final Money PLACEHOLDER_AMOUNT = new Money((Long) 5000L, CurrencyCode.USD, 4);
    public final Analytics analytics;
    public final AppService appService;
    public final ScheduledReloadConfirmationScreen args;
    public final BlockersDataNavigator blockersDataNavigator;
    public final RealInstrumentManager instrumentManager;
    public final MoneyFormatter moneyFormatter;
    public final BetterNavigator.ScreenNavigator navigator;
    public final ScheduledReloadsManager scheduledReloadsManager;
    public final AndroidStringManager stringManager;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ClientScenario.values().length];
            try {
                iArr[ClientScenario.UPDATE_SCHEDULED_RELOAD_FREQUENCY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClientScenario.UPDATE_SCHEDULED_RELOAD_AMOUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[RecurringSchedule.Frequency.values().length];
            try {
                iArr2[RecurringSchedule.Frequency.EVERY_DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[RecurringSchedule.Frequency.EVERY_WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[RecurringSchedule.Frequency.EVERY_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public ScheduledReloadConfirmationPresenter(LocalizedMoneyFormatter.Factory factory, ScheduledReloadsManager scheduledReloadsManager, RealInstrumentManager realInstrumentManager, AppService appService, AndroidStringManager androidStringManager, BlockersDataNavigator blockersDataNavigator, Analytics analytics, ScheduledReloadConfirmationScreen scheduledReloadConfirmationScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        scheduledReloadConfirmationScreen.getClass();
        this.scheduledReloadsManager = scheduledReloadsManager;
        this.instrumentManager = realInstrumentManager;
        this.appService = appService;
        this.stringManager = androidStringManager;
        this.blockersDataNavigator = blockersDataNavigator;
        this.analytics = analytics;
        this.args = scheduledReloadConfirmationScreen;
        this.navigator = screenNavigator;
        this.moneyFormatter = factory.create(MoneyFormatterConfig.COMPACT);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$submitPreference(ScheduledReloadConfirmationPresenter scheduledReloadConfirmationPresenter, RecurringSchedule.Frequency frequency, Integer num, Money money, ContinuationImpl continuationImpl) {
        ScheduledReloadConfirmationPresenter$submitPreference$1 scheduledReloadConfirmationPresenter$submitPreference$1;
        int i;
        ApiResult apiResult;
        AndroidStringManager androidStringManager = scheduledReloadConfirmationPresenter.stringManager;
        BetterNavigator.ScreenNavigator screenNavigator = scheduledReloadConfirmationPresenter.navigator;
        Analytics analytics = scheduledReloadConfirmationPresenter.analytics;
        ScheduledReloadConfirmationScreen scheduledReloadConfirmationScreen = scheduledReloadConfirmationPresenter.args;
        if (continuationImpl instanceof ScheduledReloadConfirmationPresenter$submitPreference$1) {
            scheduledReloadConfirmationPresenter$submitPreference$1 = (ScheduledReloadConfirmationPresenter$submitPreference$1) continuationImpl;
            int i2 = scheduledReloadConfirmationPresenter$submitPreference$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                scheduledReloadConfirmationPresenter$submitPreference$1.label = i2 - PKIFailureInfo.systemUnavail;
                ScheduledReloadConfirmationPresenter$submitPreference$1 scheduledReloadConfirmationPresenter$submitPreference$12 = scheduledReloadConfirmationPresenter$submitPreference$1;
                Object obj = scheduledReloadConfirmationPresenter$submitPreference$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scheduledReloadConfirmationPresenter$submitPreference$12.label;
                boolean z = true;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    SetScheduledTransactionPreferenceRequest setScheduledTransactionPreferenceRequest = new SetScheduledTransactionPreferenceRequest(null, new ScheduledTransactionPreference(Boolean.TRUE, money, new RecurringSchedule(frequency, num != null ? CollectionsKt__CollectionsJVMKt.listOf(num) : EmptyList.INSTANCE, TimeZone.getDefault().getID(), (Integer) null, 24), null, null, null, 504), ByteString.EMPTY);
                    BlockersData blockersData = scheduledReloadConfirmationScreen.blockersData;
                    ScheduledReloadConfirmationPresenter$submitPreference$result$1 scheduledReloadConfirmationPresenter$submitPreference$result$1 = new ScheduledReloadConfirmationPresenter$submitPreference$result$1(scheduledReloadConfirmationPresenter, setScheduledTransactionPreferenceRequest, null);
                    scheduledReloadConfirmationPresenter$submitPreference$12.label = 1;
                    obj = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(24, blockersData, analytics, androidStringManager, scheduledReloadConfirmationPresenter$submitPreference$12, null, scheduledReloadConfirmationPresenter$submitPreference$result$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Failure)) {
                    analytics.track(new CashRecurringDepositReceiveError(scheduledReloadConfirmationScreen.blockersData.flowToken), null);
                    screenNavigator.goTo(new ProfileScreens.ErrorScreen(TextUtilsCompat.errorMessaging(androidStringManager, (ApiResult.Failure) apiResult, null).message, null, 14));
                    z = false;
                } else {
                    if (!(apiResult instanceof ApiResult.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    BlockersData blockersData2 = scheduledReloadConfirmationScreen.blockersData;
                    if (blockersData2.clientScenario == ClientScenario.UPDATE_SCHEDULED_RELOAD_AMOUNT) {
                        analytics.track(new CashRecurringDepositUpdateAmount(blockersData2.flowToken), null);
                    } else {
                        analytics.track(new CashRecurringDepositComplete(blockersData2.flowToken), null);
                    }
                    BlockersDataNavigator blockersDataNavigator = scheduledReloadConfirmationPresenter.blockersDataNavigator;
                    ResponseContext responseContext = ((SetScheduledTransactionPreferenceResponse) ((ApiResult.Success) apiResult).response).response_context;
                    responseContext.getClass();
                    screenNavigator.goTo(blockersDataNavigator.getNext(scheduledReloadConfirmationScreen, blockersData2.updateFromResponseContext(responseContext, false)));
                }
                return Boolean.valueOf(z);
            }
        }
        scheduledReloadConfirmationPresenter$submitPreference$1 = new ScheduledReloadConfirmationPresenter$submitPreference$1(scheduledReloadConfirmationPresenter, continuationImpl);
        ScheduledReloadConfirmationPresenter$submitPreference$1 scheduledReloadConfirmationPresenter$submitPreference$122 = scheduledReloadConfirmationPresenter$submitPreference$1;
        Object obj2 = scheduledReloadConfirmationPresenter$submitPreference$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scheduledReloadConfirmationPresenter$submitPreference$122.label;
        boolean z2 = true;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Failure)) {
        }
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:195:0x010c, code lost:
    
        if (r7 == null) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0308  */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        RecurringSchedule.Frequency frequency;
        com.squareup.cash.transfers.backend.api.RecurringSchedule recurringSchedule;
        int i2;
        Integer num;
        int i3;
        com.squareup.cash.transfers.backend.api.RecurringSchedule recurringSchedule2;
        List list;
        Money money;
        RecurringSchedule.Frequency frequency2;
        Money money2;
        int i4;
        Integer num2;
        Object rememberedValue;
        boolean changedInstance;
        Object rememberedValue2;
        RecurringSchedule.Frequency frequency3;
        Integer num3;
        Money money3;
        boolean z;
        boolean booleanValue;
        Object obj;
        String str;
        InstrumentCellViewModel instrumentCellViewModel;
        int i5;
        String str2;
        String str3;
        String displayName;
        RecurringReloadConfigurationScreen.ScheduledStartAt scheduledStartAt;
        RecurringReloadConfigurationScreen.ScheduledStartAt scheduledStartAt2;
        boolean z2;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(590344818);
        Object rememberedValue3 = gapComposer.rememberedValue();
        Object obj2 = Composer.Companion.Empty;
        if (rememberedValue3 == obj2) {
            rememberedValue3 = ((RealScheduledReloadsManager) this.scheduledReloadsManager).preferences();
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue3, null, null, gapComposer, 48, 2);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == obj2) {
            rememberedValue4 = this.instrumentManager.forType(CashInstrumentType.DEBIT_CARD);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue4, EmptyList.INSTANCE, null, gapComposer, 48, 2);
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == obj2) {
            rememberedValue5 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        MutableState mutableState = (MutableState) rememberedValue5;
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (rememberedValue6 == obj2) {
            rememberedValue6 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        MutableState mutableState2 = (MutableState) rememberedValue6;
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (rememberedValue7 == obj2) {
            rememberedValue7 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue7);
        }
        MutableState mutableState3 = (MutableState) rememberedValue7;
        Object rememberedValue8 = gapComposer.rememberedValue();
        if (rememberedValue8 == obj2) {
            rememberedValue8 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue8);
        }
        MutableState mutableState4 = (MutableState) rememberedValue8;
        Object rememberedValue9 = gapComposer.rememberedValue();
        if (rememberedValue9 == obj2) {
            rememberedValue9 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue9);
        }
        MutableState mutableState5 = (MutableState) rememberedValue9;
        Object rememberedValue10 = gapComposer.rememberedValue();
        if (rememberedValue10 == obj2) {
            rememberedValue10 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue10);
        }
        MutableState mutableState6 = (MutableState) rememberedValue10;
        ScheduledReloadsPreference scheduledReloadsPreference = (ScheduledReloadsPreference) collectAsState.getValue();
        ScheduledReloadsPreference.State state = scheduledReloadsPreference != null ? scheduledReloadsPreference.state : null;
        ScheduledReloadsPreference.State.Enabled enabled = state instanceof ScheduledReloadsPreference.State.Enabled ? (ScheduledReloadsPreference.State.Enabled) state : null;
        boolean z3 = enabled == null && scheduledReloadsPreference != null;
        if (((Boolean) mutableState4.getValue()).booleanValue()) {
            frequency = (RecurringSchedule.Frequency) mutableState.getValue();
        } else {
            if (enabled != null && (recurringSchedule = enabled.recurringSchedule) != null) {
                int ordinal = recurringSchedule.frequency.ordinal();
                if (ordinal == 0) {
                    frequency = RecurringSchedule.Frequency.EVERY_DAY;
                } else if (ordinal == 1) {
                    frequency = RecurringSchedule.Frequency.EVERY_WEEK;
                } else if (ordinal == 2) {
                    frequency = RecurringSchedule.Frequency.EVERY_TWO_WEEKS;
                } else {
                    if (ordinal != 3) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    frequency = RecurringSchedule.Frequency.EVERY_MONTH;
                }
            }
            frequency = z3 ? RecurringSchedule.Frequency.EVERY_MONTH : null;
        }
        if (((Boolean) mutableState4.getValue()).booleanValue()) {
            i3 = (Integer) mutableState2.getValue();
            i2 = 1;
        } else {
            i2 = 1;
            if (enabled == null || (recurringSchedule2 = enabled.recurringSchedule) == null || (list = recurringSchedule2.daysOfPeriod) == null || (i3 = (Integer) CollectionsKt.firstOrNull(list)) == null) {
                if (!z3) {
                    num = null;
                    if (!((Boolean) mutableState4.getValue()).booleanValue()) {
                        money = (Money) mutableState3.getValue();
                    } else if (enabled == null || (money = enabled.amount) == null) {
                        money = z3 ? PLACEHOLDER_AMOUNT : null;
                    }
                    frequency2 = frequency;
                    money2 = money;
                    i4 = i2;
                    num2 = num;
                    Updater.LaunchedEffect(gapComposer, flow, new DbSessionManager$updateDb$2(flow, null, this, Updater.rememberUpdatedState(frequency, gapComposer), Updater.rememberUpdatedState(num, gapComposer), Updater.rememberUpdatedState(money, gapComposer), mutableState5, 27));
                    rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == obj2) {
                        Object lifecycleKt$$ExternalSyntheticLambda0 = new LifecycleKt$$ExternalSyntheticLambda0(mutableState4, mutableState, mutableState2, mutableState3, 12);
                        gapComposer.updateRememberedValue(lifecycleKt$$ExternalSyntheticLambda0);
                        rememberedValue = lifecycleKt$$ExternalSyntheticLambda0;
                    }
                    Function2 function2 = (Function2) rememberedValue;
                    AnswerDispatcher answerDispatcher = (AnswerDispatcher) gapComposer.consume(AnswersKt.LocalAnswerDispatcher);
                    changedInstance = gapComposer.changedInstance(answerDispatcher);
                    rememberedValue2 = gapComposer.rememberedValue();
                    if (!changedInstance || rememberedValue2 == obj2) {
                        rememberedValue2 = new LinkedAccountsPresenter$models$$inlined$AnswerHandler$1(function2, answerDispatcher, i4);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    Updater.DisposableEffect(answerDispatcher, (Function1) rememberedValue2, gapComposer);
                    if (scheduledReloadsPreference != null || ((Boolean) mutableState6.getValue()).booleanValue()) {
                        frequency3 = frequency2;
                        num3 = num2;
                        money3 = money2;
                        z = 0;
                        gapComposer.startReplaceGroup(-923622256);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-924561153);
                        ClientScenario clientScenario = this.args.blockersData.clientScenario;
                        int i6 = clientScenario == null ? -1 : WhenMappings.$EnumSwitchMapping$0[clientScenario.ordinal()];
                        if (i6 == i4) {
                            frequency3 = frequency2;
                            num3 = num2;
                            money3 = money2;
                            scheduledStartAt = RecurringReloadConfigurationScreen.ScheduledStartAt.FREQUENCY;
                        } else if (i6 != 2) {
                            frequency3 = frequency2;
                            if (frequency3 == null) {
                                scheduledStartAt2 = null;
                                num3 = num2;
                                money3 = money2;
                            } else if (frequency3 == RecurringSchedule.Frequency.EVERY_DAY) {
                                money3 = money2;
                                scheduledStartAt2 = money3 == null ? RecurringReloadConfigurationScreen.ScheduledStartAt.AMOUNT : null;
                                num3 = num2;
                            } else {
                                num3 = num2;
                                money3 = money2;
                                if (num3 == null) {
                                    scheduledStartAt = RecurringReloadConfigurationScreen.ScheduledStartAt.DAY;
                                } else if (money3 == null) {
                                    scheduledStartAt = RecurringReloadConfigurationScreen.ScheduledStartAt.AMOUNT;
                                } else {
                                    scheduledStartAt2 = null;
                                }
                            }
                            if (scheduledStartAt2 == null) {
                                gapComposer.startReplaceGroup(-923954452);
                                boolean changedInstance2 = gapComposer.changedInstance(this) | gapComposer.changed(frequency3 == null ? -1 : frequency3.ordinal()) | gapComposer.changed(num3) | gapComposer.changedInstance(money3) | gapComposer.changed(scheduledStartAt2.ordinal());
                                Object rememberedValue11 = gapComposer.rememberedValue();
                                if (changedInstance2 || rememberedValue11 == obj2) {
                                    Object scheduledReloadConfirmationPresenter$models$3$1 = new ScheduledReloadConfirmationPresenter$models$3$1(this, frequency3, num3, money3, scheduledStartAt2, mutableState6, null);
                                    gapComposer.updateRememberedValue(scheduledReloadConfirmationPresenter$models$3$1);
                                    rememberedValue11 = scheduledReloadConfirmationPresenter$models$3$1;
                                }
                                Updater.LaunchedEffect(gapComposer, "auto-launch", (Function2) rememberedValue11);
                                z2 = false;
                                gapComposer.end(false);
                            } else {
                                z2 = false;
                                gapComposer.startReplaceGroup(-923666648);
                                gapComposer.end(false);
                                mutableState6.setValue(Boolean.TRUE);
                            }
                            gapComposer.end(z2);
                            z = z2;
                        } else {
                            frequency3 = frequency2;
                            num3 = num2;
                            money3 = money2;
                            scheduledStartAt = RecurringReloadConfigurationScreen.ScheduledStartAt.AMOUNT;
                        }
                        scheduledStartAt2 = scheduledStartAt;
                        if (scheduledStartAt2 == null) {
                        }
                        gapComposer.end(z2);
                        z = z2;
                    }
                    booleanValue = ((Boolean) mutableState5.getValue()).booleanValue();
                    ScheduledReloadConfirmationViewModel.Loading loading = ScheduledReloadConfirmationViewModel.Loading.INSTANCE;
                    if (!booleanValue) {
                        gapComposer.startReplaceGroup(-923590574);
                        frequency3.getClass();
                        money3.getClass();
                        boolean changedInstance3 = gapComposer.changedInstance(this) | gapComposer.changed(frequency3.ordinal()) | gapComposer.changed(num3) | gapComposer.changedInstance(money3);
                        Object rememberedValue12 = gapComposer.rememberedValue();
                        if (changedInstance3 || rememberedValue12 == obj2) {
                            Object scheduledReloadConfirmationPresenter$models$4$1 = new ScheduledReloadConfirmationPresenter$models$4$1(this, frequency3, num3, money3, mutableState5, null);
                            gapComposer.updateRememberedValue(scheduledReloadConfirmationPresenter$models$4$1);
                            rememberedValue12 = scheduledReloadConfirmationPresenter$models$4$1;
                        }
                        Updater.LaunchedEffect(gapComposer, "Submit preference", (Function2) rememberedValue12);
                        gapComposer.end(z);
                        gapComposer.end(z);
                        return loading;
                    }
                    gapComposer.startReplaceGroup(-923284976);
                    gapComposer.end(z);
                    if (scheduledReloadsPreference == null) {
                        gapComposer.end(z);
                        return loading;
                    }
                    Iterator it = ((List) collectAsState2.getValue()).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((Instrument) obj).defaultForInstrumentType) {
                            break;
                        }
                    }
                    Instrument instrument = (Instrument) obj;
                    String str4 = "";
                    AndroidStringManager androidStringManager = this.stringManager;
                    if (instrument != null) {
                        str = null;
                        InstrumentIcon instrumentIcon$default = GoogleMapKt.instrumentIcon$default(instrument, null, InstrumentIcon.IconShape.CARD, 5);
                        String str5 = instrument.displayNameCompact;
                        instrumentCellViewModel = new InstrumentCellViewModel(str5 == null ? "" : str5, null, true, CollectionsKt__CollectionsJVMKt.listOf(instrumentIcon$default), InstrumentCellViewModel.Accessory.Info.INSTANCE, null, androidStringManager.get(R.string.recurring_reload_option_from), null, null, 416);
                    } else {
                        str = null;
                        instrumentCellViewModel = null;
                    }
                    int i7 = frequency3 == RecurringSchedule.Frequency.EVERY_DAY ? i4 : z;
                    boolean z4 = (frequency3 == null || (i7 == 0 && num3 == null) || money3 == null) ? z : i4;
                    if (frequency3 != null) {
                        int i8 = WhenMappings.$EnumSwitchMapping$1[frequency3.ordinal()];
                        if (i8 == i4) {
                            i5 = 3;
                            str4 = androidStringManager.get(R.string.recurring_reload_option_frequency_day);
                        } else if (i8 != 2) {
                            i5 = 3;
                            if (i8 == 3) {
                                str4 = androidStringManager.get(R.string.recurring_reload_option_frequency_month);
                            }
                        } else {
                            i5 = 3;
                            str4 = androidStringManager.get(R.string.recurring_reload_option_frequency_week);
                        }
                        str2 = str4;
                    } else {
                        i5 = 3;
                        str2 = str;
                    }
                    if (num3 != null) {
                        int intValue = num3.intValue();
                        int i9 = frequency3 != null ? WhenMappings.$EnumSwitchMapping$1[frequency3.ordinal()] : -1;
                        if (i9 != 2) {
                            displayName = i9 != i5 ? String.valueOf(intValue) : AndroidStringManager.getOrdinal(intValue);
                        } else {
                            displayName = DayOfWeek.of(intValue).getDisplayName(TextStyle.FULL, Locale.getDefault());
                            displayName.getClass();
                        }
                        str3 = displayName;
                    } else {
                        str3 = str;
                    }
                    ScheduledReloadConfirmationViewModel.Content content = new ScheduledReloadConfirmationViewModel.Content(androidStringManager.get(R.string.scheduled_reload_confirmation_title), androidStringManager.get(R.string.recurring_reload_frequency_title), str2, androidStringManager.get(R.string.scheduled_reload_confirmation_day_label), str3, (frequency3 == null || i7 != 0) ? z : i4, androidStringManager.get(R.string.recurring_reload_scheduled_amount_title), money3 != null ? this.moneyFormatter.format(money3) : str, instrumentCellViewModel, androidStringManager.get(R.string.scheduled_reload_confirmation_button), z4);
                    gapComposer.end(z);
                    return content;
                }
                i3 = 1;
            }
        }
        num = i3;
        if (!((Boolean) mutableState4.getValue()).booleanValue()) {
        }
        frequency2 = frequency;
        money2 = money;
        i4 = i2;
        num2 = num;
        Updater.LaunchedEffect(gapComposer, flow, new DbSessionManager$updateDb$2(flow, null, this, Updater.rememberUpdatedState(frequency, gapComposer), Updater.rememberUpdatedState(num, gapComposer), Updater.rememberUpdatedState(money, gapComposer), mutableState5, 27));
        rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == obj2) {
        }
        Function2 function22 = (Function2) rememberedValue;
        AnswerDispatcher answerDispatcher2 = (AnswerDispatcher) gapComposer.consume(AnswersKt.LocalAnswerDispatcher);
        changedInstance = gapComposer.changedInstance(answerDispatcher2);
        rememberedValue2 = gapComposer.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue2 = new LinkedAccountsPresenter$models$$inlined$AnswerHandler$1(function22, answerDispatcher2, i4);
        gapComposer.updateRememberedValue(rememberedValue2);
        Updater.DisposableEffect(answerDispatcher2, (Function1) rememberedValue2, gapComposer);
        if (scheduledReloadsPreference != null) {
        }
        frequency3 = frequency2;
        num3 = num2;
        money3 = money2;
        z = 0;
        gapComposer.startReplaceGroup(-923622256);
        gapComposer.end(false);
        booleanValue = ((Boolean) mutableState5.getValue()).booleanValue();
        ScheduledReloadConfirmationViewModel.Loading loading2 = ScheduledReloadConfirmationViewModel.Loading.INSTANCE;
        if (!booleanValue) {
        }
    }
}
