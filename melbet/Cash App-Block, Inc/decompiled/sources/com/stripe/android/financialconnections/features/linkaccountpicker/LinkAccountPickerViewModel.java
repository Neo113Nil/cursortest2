package com.stripe.android.financialconnections.features.linkaccountpicker;

import androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.trace.core.util.Matchers;
import com.google.android.gms.internal.common.zzai;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.scannerview.TextSetter;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.financialconnections.FinancialConnections;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEvent;
import com.stripe.android.financialconnections.domain.AcceptConsent;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.domain.UpdateCachedAccounts;
import com.stripe.android.financialconnections.exception.UnclassifiedError;
import com.stripe.android.financialconnections.features.exit.ExitViewModel$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerState;
import com.stripe.android.financialconnections.features.notice.NoticeSheetState;
import com.stripe.android.financialconnections.features.notice.RealPresentSheet;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.Image;
import com.stripe.android.financialconnections.model.NetworkedAccount;
import com.stripe.android.financialconnections.model.PartnerAccount;
import com.stripe.android.financialconnections.model.ShareNetworkedAccountsResponse;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.navigation.DestinationMappersKt;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarStateUpdate;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.repository.RealConsumerSessionRepository;
import com.stripe.android.financialconnections.ui.HandleClickableUrl;
import com.stripe.android.uicore.navigation.NavigationManagerImpl;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.FinancialConnectionsGenericInfoScreen;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class LinkAccountPickerViewModel extends FinancialConnectionsViewModel {
    public static final FinancialConnectionsSessionManifest.Pane PANE = FinancialConnectionsSessionManifest.Pane.LINK_ACCOUNT_PICKER;
    public final AcceptConsent acceptConsent;
    public final RealConsumerSessionRepository consumerSessionProvider;
    public final FinancialConnectionsAnalyticsTrackerImpl eventTracker;
    public final ToolbarTuckTargets fetchNetworkedAccounts;
    public final GetOrFetchSync getSync;
    public final HandleClickableUrl handleClickableUrl;
    public final Logger$Companion$NOOP_LOGGER$1 logger;
    public final NavigationManagerImpl navigationManager;
    public final RealPresentSheet presentSheet;
    public final TextSetter selectNetworkedAccounts;
    public final UpdateCachedAccounts updateCachedAccounts;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FinancialConnectionsSessionManifest.Pane.values().length];
            try {
                iArr[FinancialConnectionsSessionManifest.Pane.PARTNER_AUTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FinancialConnectionsSessionManifest.Pane.BANK_AUTH_REPAIR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FinancialConnectionsSessionManifest.Pane.INSTITUTION_PICKER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkAccountPickerViewModel(LinkAccountPickerState linkAccountPickerState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl, RealConsumerSessionRepository realConsumerSessionRepository, HandleClickableUrl handleClickableUrl, ToolbarTuckTargets toolbarTuckTargets, TextSetter textSetter, UpdateCachedAccounts updateCachedAccounts, GetOrFetchSync getOrFetchSync, NavigationManagerImpl navigationManagerImpl, Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1, AcceptConsent acceptConsent, RealPresentSheet realPresentSheet) {
        super(linkAccountPickerState, nativeAuthFlowCoordinator);
        nativeAuthFlowCoordinator.getClass();
        financialConnectionsAnalyticsTrackerImpl.getClass();
        realConsumerSessionRepository.getClass();
        handleClickableUrl.getClass();
        toolbarTuckTargets.getClass();
        textSetter.getClass();
        updateCachedAccounts.getClass();
        getOrFetchSync.getClass();
        navigationManagerImpl.getClass();
        logger$Companion$NOOP_LOGGER$1.getClass();
        acceptConsent.getClass();
        realPresentSheet.getClass();
        this.eventTracker = financialConnectionsAnalyticsTrackerImpl;
        this.consumerSessionProvider = realConsumerSessionRepository;
        this.handleClickableUrl = handleClickableUrl;
        this.fetchNetworkedAccounts = toolbarTuckTargets;
        this.selectNetworkedAccounts = textSetter;
        this.updateCachedAccounts = updateCachedAccounts;
        this.getSync = getOrFetchSync;
        this.navigationManager = navigationManagerImpl;
        this.logger = logger$Companion$NOOP_LOGGER$1;
        this.acceptConsent = acceptConsent;
        this.presentSheet = realPresentSheet;
        Continuation continuation = null;
        onAsync(LinkAccountPickerViewModel$observeAsyncs$1.INSTANCE, new LinkAccountPickerViewModel$observeAsyncs$2(this, continuation, 0), new LinkAccountPickerViewModel$observeAsyncs$2(this, continuation, 1));
        FinancialConnectionsViewModel.onAsync$default(this, LinkAccountPickerViewModel$observeAsyncs$4.INSTANCE, null, new LinkAccountPickerViewModel$observeAsyncs$2(this, continuation, 2), 2);
        FinancialConnectionsViewModel.execute$default(this, new DataStoreImpl$readDataOrHandleCorruption$3(this, continuation, 16), new ExitViewModel$$ExternalSyntheticLambda0(20));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$handleNonSuccessNextPane(LinkAccountPickerViewModel linkAccountPickerViewModel, LinkAccountPickerState.Payload payload, FinancialConnectionsSessionManifest.Pane pane, ContinuationImpl continuationImpl) {
        LinkAccountPickerViewModel$handleNonSuccessNextPane$1 linkAccountPickerViewModel$handleNonSuccessNextPane$1;
        int i;
        int i2;
        Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1 = linkAccountPickerViewModel.logger;
        FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl = linkAccountPickerViewModel.eventTracker;
        if (continuationImpl instanceof LinkAccountPickerViewModel$handleNonSuccessNextPane$1) {
            linkAccountPickerViewModel$handleNonSuccessNextPane$1 = (LinkAccountPickerViewModel$handleNonSuccessNextPane$1) continuationImpl;
            int i3 = linkAccountPickerViewModel$handleNonSuccessNextPane$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                linkAccountPickerViewModel$handleNonSuccessNextPane$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = linkAccountPickerViewModel$handleNonSuccessNextPane$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = linkAccountPickerViewModel$handleNonSuccessNextPane$1.label;
                FinancialConnectionsSessionManifest.Pane pane2 = PANE;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    int i4 = pane == null ? -1 : WhenMappings.$EnumSwitchMapping$0[pane.ordinal()];
                    if (i4 == -1) {
                        Matchers.logError(financialConnectionsAnalyticsTrackerImpl, "Selected connect account, but next pane is NULL.", new UnclassifiedError("ConnectUnselectedAccountError", null), logger$Companion$NOOP_LOGGER$1, pane2);
                    } else if (i4 == 1) {
                        Matchers.logError(financialConnectionsAnalyticsTrackerImpl, "Connecting a supportability account, but user shouldn't be able to.", new UnclassifiedError("ConnectSupportabilityAccountError", null), logger$Companion$NOOP_LOGGER$1, pane2);
                    } else if (i4 == 2) {
                        Matchers.logError(financialConnectionsAnalyticsTrackerImpl, "Connecting a repair account, but user shouldn't be able to.", new UnclassifiedError("ConnectRepairAccountError", null), logger$Companion$NOOP_LOGGER$1, pane2);
                    }
                    if (payload.acquireConsentOnPrimaryCtaClick) {
                        AcceptConsent acceptConsent = linkAccountPickerViewModel.acceptConsent;
                        linkAccountPickerViewModel$handleNonSuccessNextPane$1.L$1 = pane;
                        linkAccountPickerViewModel$handleNonSuccessNextPane$1.label = 1;
                        if (acceptConsent.repository.markConsentAcquired(acceptConsent.configuration.financialConnectionsSessionClientSecret, linkAccountPickerViewModel$handleNonSuccessNextPane$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pane = linkAccountPickerViewModel$handleNonSuccessNextPane$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                i2 = pane != null ? -1 : WhenMappings.$EnumSwitchMapping$0[pane.ordinal()];
                if (i2 != -1) {
                    pane = FinancialConnectionsSessionManifest.Pane.INSTITUTION_PICKER;
                } else if (i2 == 1 || i2 == 2) {
                    pane = FinancialConnectionsSessionManifest.Pane.INSTITUTION_PICKER;
                }
                NavigationManagerImpl.tryNavigateTo$default(linkAccountPickerViewModel.navigationManager, Destination.invoke$default(DestinationMappersKt.getDestination(pane), pane2), null, 6);
                return Unit.INSTANCE;
            }
        }
        linkAccountPickerViewModel$handleNonSuccessNextPane$1 = new LinkAccountPickerViewModel$handleNonSuccessNextPane$1(linkAccountPickerViewModel, continuationImpl);
        Object obj2 = linkAccountPickerViewModel$handleNonSuccessNextPane$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = linkAccountPickerViewModel$handleNonSuccessNextPane$1.label;
        FinancialConnectionsSessionManifest.Pane pane22 = PANE;
        if (i != 0) {
        }
        if (pane != null) {
        }
        if (i2 != -1) {
        }
        NavigationManagerImpl.tryNavigateTo$default(linkAccountPickerViewModel.navigationManager, Destination.invoke$default(DestinationMappersKt.getDestination(pane), pane22), null, 6);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$selectAccounts(LinkAccountPickerViewModel linkAccountPickerViewModel, boolean z, String str, Set set, ContinuationImpl continuationImpl) {
        LinkAccountPickerViewModel$selectAccounts$1 linkAccountPickerViewModel$selectAccounts$1;
        int i;
        FinancialConnectionsSessionManifest.Pane pane;
        linkAccountPickerViewModel.getClass();
        if (continuationImpl instanceof LinkAccountPickerViewModel$selectAccounts$1) {
            linkAccountPickerViewModel$selectAccounts$1 = (LinkAccountPickerViewModel$selectAccounts$1) continuationImpl;
            int i2 = linkAccountPickerViewModel$selectAccounts$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                linkAccountPickerViewModel$selectAccounts$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = linkAccountPickerViewModel$selectAccounts$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = linkAccountPickerViewModel$selectAccounts$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    TextSetter textSetter = linkAccountPickerViewModel.selectNetworkedAccounts;
                    Boolean valueOf = Boolean.valueOf(z);
                    linkAccountPickerViewModel$selectAccounts$1.label = 1;
                    obj = textSetter.invoke(str, set, valueOf, linkAccountPickerViewModel$selectAccounts$1);
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
                pane = ((ShareNetworkedAccountsResponse) obj).nextPane;
                if (pane == null) {
                    pane = FinancialConnectionsSessionManifest.Pane.SUCCESS;
                }
                FinancialConnections.m4012emitEventgIAlus$financial_connections_release(FinancialConnectionsEvent.Name.ACCOUNTS_SELECTED, new FinancialConnectionsEvent.Metadata(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7));
                NavigationManagerImpl.tryNavigateTo$default(linkAccountPickerViewModel.navigationManager, Destination.invoke$default(DestinationMappersKt.getDestination(pane), PANE), null, 6);
                return Unit.INSTANCE;
            }
        }
        linkAccountPickerViewModel$selectAccounts$1 = new LinkAccountPickerViewModel$selectAccounts$1(linkAccountPickerViewModel, continuationImpl);
        Object obj2 = linkAccountPickerViewModel$selectAccounts$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = linkAccountPickerViewModel$selectAccounts$1.label;
        if (i != 0) {
        }
        pane = ((ShareNetworkedAccountsResponse) obj2).nextPane;
        if (pane == null) {
        }
        FinancialConnections.m4012emitEventgIAlus$financial_connections_release(FinancialConnectionsEvent.Name.ACCOUNTS_SELECTED, new FinancialConnectionsEvent.Metadata(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7));
        NavigationManagerImpl.tryNavigateTo$default(linkAccountPickerViewModel.navigationManager, Destination.invoke$default(DestinationMappersKt.getDestination(pane), PANE), null, 6);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static NoticeSheetState.NoticeSheetContent computeDrawerPayload(PartnerAccount partnerAccount, LinkAccountPickerState.Payload payload) {
        Object obj;
        NoticeSheetState.NoticeSheetContent.UpdateRequired updateRequired;
        Map map;
        Image image;
        NetworkedAccount networkedAccount;
        Iterator it = payload.accounts.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((LinkedAccount) obj).account.id, partnerAccount.id)) {
                break;
            }
        }
        LinkedAccount linkedAccount = (LinkedAccount) obj;
        FinancialConnectionsGenericInfoScreen financialConnectionsGenericInfoScreen = (linkedAccount == null || (networkedAccount = linkedAccount.display) == null) ? null : networkedAccount.drawerOnSelection;
        if (financialConnectionsGenericInfoScreen != null) {
            FinancialConnectionsInstitution financialConnectionsInstitution = partnerAccount.institution;
            String str = (financialConnectionsInstitution == null || (image = financialConnectionsInstitution.icon) == null) ? null : image.f809default;
            FinancialConnectionsGenericInfoScreen.Header header = financialConnectionsGenericInfoScreen.header;
            FinancialConnectionsGenericInfoScreen.Header header2 = header != null ? new FinancialConnectionsGenericInfoScreen.Header(header.title, header.subtitle, new Image(str), header.alignment) : null;
            String str2 = financialConnectionsGenericInfoScreen.id;
            FinancialConnectionsGenericInfoScreen.Body body = financialConnectionsGenericInfoScreen.body;
            FinancialConnectionsGenericInfoScreen.Footer footer = financialConnectionsGenericInfoScreen.footer;
            FinancialConnectionsGenericInfoScreen.Options options = financialConnectionsGenericInfoScreen.options;
            str2.getClass();
            FinancialConnectionsGenericInfoScreen financialConnectionsGenericInfoScreen2 = new FinancialConnectionsGenericInfoScreen(str2, header2, body, footer, options);
            FinancialConnectionsSessionManifest.Pane pane = partnerAccount.nextPaneOnSelection;
            int i = pane == null ? -1 : WhenMappings.$EnumSwitchMapping$0[pane.ordinal()];
            if (i == 1) {
                updateRequired = new NoticeSheetState.NoticeSheetContent.UpdateRequired(financialConnectionsGenericInfoScreen2, new NoticeSheetState.NoticeSheetContent.UpdateRequired.Type.Supportability(financialConnectionsInstitution));
            } else if (i == 2) {
                String str3 = partnerAccount.authorization;
                updateRequired = new NoticeSheetState.NoticeSheetContent.UpdateRequired(financialConnectionsGenericInfoScreen2, new NoticeSheetState.NoticeSheetContent.UpdateRequired.Type.Repair((str3 == null || (map = payload.partnerToCoreAuths) == null) ? null : (String) MapsKt__MapsKt.getValue(map, str3), financialConnectionsInstitution));
            } else if (i == 3) {
                updateRequired = new NoticeSheetState.NoticeSheetContent.UpdateRequired(financialConnectionsGenericInfoScreen2, new NoticeSheetState.NoticeSheetContent.UpdateRequired.Type.Supportability(null));
            }
            if (updateRequired == null) {
                return updateRequired;
            }
            if (financialConnectionsGenericInfoScreen != null) {
                return new NoticeSheetState.NoticeSheetContent.Generic(financialConnectionsGenericInfoScreen);
            }
            return null;
        }
        updateRequired = null;
        if (updateRequired == null) {
        }
    }

    public final void present(NoticeSheetState.NoticeSheetContent noticeSheetContent) {
        String str;
        boolean z = noticeSheetContent instanceof NoticeSheetState.NoticeSheetContent.UpdateRequired;
        FinancialConnectionsSessionManifest.Pane pane = PANE;
        if (z) {
            NoticeSheetState.NoticeSheetContent.UpdateRequired.Type type2 = ((NoticeSheetState.NoticeSheetContent.UpdateRequired) noticeSheetContent).f1430type;
            if (type2 instanceof NoticeSheetState.NoticeSheetContent.UpdateRequired.Type.Supportability) {
                str = "click.supportability_account";
            } else {
                if (!(type2 instanceof NoticeSheetState.NoticeSheetContent.UpdateRequired.Type.Repair)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                str = "click.repair_accounts";
            }
            this.eventTracker.track(new FinancialConnectionsAnalyticsEvent.Click(str, pane));
        }
        this.presentSheet.invoke(noticeSheetContent, pane);
    }

    @Override // com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel
    public final TopAppBarStateUpdate updateTopAppBar(Object obj) {
        LinkAccountPickerState linkAccountPickerState = (LinkAccountPickerState) obj;
        linkAccountPickerState.getClass();
        return new TopAppBarStateUpdate(PANE, false, zzai.getError(linkAccountPickerState.payload), false, null, 56);
    }
}
