package com.squareup.cash.tabprovider.real;

import androidx.lifecycle.Lifecycle;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.browsersdk.model.FillrCartInformationExtraction$FillrCartInformation;
import com.squareup.cash.boost.backend.BoostAction;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.session.backend.SessionState;
import com.squareup.cash.session.backend.SwitchingState;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.cash.sharesheet.ShareSheetPresenter$models$3$1$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.cash.sharesheet.ShareTargetsManager$ShareResult;
import com.squareup.cash.sheet.RealSheetState$awaitDismissalDragDisabled$$inlined$filter$1$2$1;
import com.squareup.cash.shopping.presenters.RealShoppingJavascriptPresenter$model$lambda$17$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.shopping.presenters.RealShoppingJavascriptPresenter$model$lambda$20$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.shopping.presenters.RealShoppingJavascriptPresenter$model$lambda$25$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.shopping.presenters.RealShoppingJavascriptPresenter$model$lambda$3$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.shopping.presenters.ShoppingWebPresenter$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.shopping.presenters.ShoppingWebPresenter$models$lambda$28$$inlined$filter$1$2$1;
import com.squareup.cash.shopping.presenters.ShoppingWebPresenter$models$lambda$30$$inlined$map$1$2$1;
import com.squareup.cash.shopping.viewmodels.ShoppingWebViewEvent;
import com.squareup.cash.support.chat.backend.api.Transcript;
import com.squareup.cash.support.chat.backend.real.ChatLastReadMessageToken;
import com.squareup.cash.support.chat.backend.real.PendingTranscript;
import com.squareup.cash.support.chat.backend.real.RealPendingMessagesStore;
import com.squareup.cash.support.chat.backend.real.RealPendingMessagesStore$messages$$inlined$map$1$2$1;
import com.squareup.cash.support.chat.backend.real.SupportConversationPersistence$observeLastReadMessageToken$$inlined$map$1$2$1;
import com.squareup.cash.support.chat.presenters.ChatPresenter$AnnounceMessagesForAccessibility$1$1$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.cash.support.chat.presenters.ChatPresenter$models$lambda$3$$inlined$map$1$2$1;
import com.squareup.cash.support.chat.presenters.ChatPresenter$models$lambda$55$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.support.chat.presenters.ChatPresenter$rememberIsUserTyping$lambda$0$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.support.chat.presenters.ChatPresenter$rememberIsUserTyping$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.support.chat.presenters.ChatPresenter$rememberIsUserTyping$lambda$0$$inlined$map$2$2$1;
import com.squareup.cash.support.chat.presenters.ChatTransactionPickerPresenter$models$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.support.chat.viewmodels.ChatViewEvent;
import com.squareup.cash.support.presenters.PhoneVerificationPresenter$models$lambda$6$$inlined$filter$1$2$1;
import com.squareup.cash.support.presenters.PhoneVerificationPresenter$models$lambda$6$$inlined$map$1$2$1;
import com.squareup.cash.support.presenters.SupportHomePresenter$models$lambda$5$$inlined$map$1$2$1;
import com.squareup.cash.support.presenters.SupportIncidentDetailsPresenter$requestPermission$$inlined$filter$1$2$1;
import com.squareup.cash.support.presenters.SupportIncidentDetailsPresenter$requestPermission$$inlined$map$1$2$1;
import com.squareup.cash.support.presenters.SupportLoadClientScenarioPresenter$loadClientScenario$$inlined$mapNotNull$1$2$1;
import com.squareup.cash.support.presenters.SupportSearchPresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.support.screens.SupportScreens$SupportDialogs$SupportFlowCheckConnectionScreen;
import com.squareup.cash.support.viewmodels.SupportSearchViewEvent;
import com.squareup.cash.tabprovider.api.TabInfoState;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter$models$lambda$10$$inlined$map$1$2$1;
import com.squareup.cash.taptopay.backend.real.RealTapToPayEligibilityProvider;
import com.squareup.cash.taptopay.backend.real.RealTapToPayEligibilityProvider$isActivated$$inlined$map$1$2$1;
import com.squareup.cash.taptopay.backend.real.RealTapToPayEligibilityProvider$isEligibleForOnboarding$$inlined$map$1$2$1;
import com.squareup.cash.transactionpicker.presenters.PagedTransactions;
import com.squareup.cash.transactionpicker.viewmodels.TransactionPickerViewModel;
import com.squareup.cash.wallet.db.IssuedCardFactory;
import com.squareup.protos.cash.cashbusinessaccounts.TapToPay;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealTabProvider$setup$lambda$0$$inlined$map$1$2 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowCollector $this_unsafeFlow;

    /* renamed from: com.squareup.cash.tabprovider.real.RealTabProvider$setup$lambda$0$$inlined$map$1$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= PKIFailureInfo.systemUnavail;
            return RealTabProvider$setup$lambda$0$$inlined$map$1$2.this.emit(null, this);
        }
    }

    public RealTabProvider$setup$lambda$0$$inlined$map$1$2(FlowCollector flowCollector, RealTapToPayEligibilityProvider realTapToPayEligibilityProvider) {
        this.$r8$classId = 29;
        this.$this_unsafeFlow = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x072b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x075d  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x079e  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x07a8  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x07dd  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x07e7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012f  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        int i;
        ShareSheetPresenter$models$3$1$invokeSuspend$$inlined$map$1$2$1 shareSheetPresenter$models$3$1$invokeSuspend$$inlined$map$1$2$1;
        int i2;
        RealSheetState$awaitDismissalDragDisabled$$inlined$filter$1$2$1 realSheetState$awaitDismissalDragDisabled$$inlined$filter$1$2$1;
        int i3;
        RealShoppingJavascriptPresenter$model$lambda$17$$inlined$filterIsInstance$1$2$1 realShoppingJavascriptPresenter$model$lambda$17$$inlined$filterIsInstance$1$2$1;
        int i4;
        RealShoppingJavascriptPresenter$model$lambda$20$$inlined$filterIsInstance$1$2$1 realShoppingJavascriptPresenter$model$lambda$20$$inlined$filterIsInstance$1$2$1;
        int i5;
        RealShoppingJavascriptPresenter$model$lambda$25$$inlined$filterIsInstance$1$2$1 realShoppingJavascriptPresenter$model$lambda$25$$inlined$filterIsInstance$1$2$1;
        int i6;
        RealShoppingJavascriptPresenter$model$lambda$3$$inlined$filterIsInstance$1$2$1 realShoppingJavascriptPresenter$model$lambda$3$$inlined$filterIsInstance$1$2$1;
        int i7;
        ShoppingWebPresenter$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 shoppingWebPresenter$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
        int i8;
        ShoppingWebPresenter$models$lambda$28$$inlined$filter$1$2$1 shoppingWebPresenter$models$lambda$28$$inlined$filter$1$2$1;
        int i9;
        ShoppingWebPresenter$models$lambda$30$$inlined$map$1$2$1 shoppingWebPresenter$models$lambda$30$$inlined$map$1$2$1;
        int i10;
        RealPendingMessagesStore$messages$$inlined$map$1$2$1 realPendingMessagesStore$messages$$inlined$map$1$2$1;
        int i11;
        SupportConversationPersistence$observeLastReadMessageToken$$inlined$map$1$2$1 supportConversationPersistence$observeLastReadMessageToken$$inlined$map$1$2$1;
        int i12;
        ChatPresenter$AnnounceMessagesForAccessibility$1$1$invokeSuspend$$inlined$map$1$2$1 chatPresenter$AnnounceMessagesForAccessibility$1$1$invokeSuspend$$inlined$map$1$2$1;
        int i13;
        ChatPresenter$models$lambda$3$$inlined$map$1$2$1 chatPresenter$models$lambda$3$$inlined$map$1$2$1;
        int i14;
        ChatPresenter$models$lambda$55$$inlined$filterIsInstance$1$2$1 chatPresenter$models$lambda$55$$inlined$filterIsInstance$1$2$1;
        int i15;
        ChatPresenter$rememberIsUserTyping$lambda$0$$inlined$filterIsInstance$1$2$1 chatPresenter$rememberIsUserTyping$lambda$0$$inlined$filterIsInstance$1$2$1;
        int i16;
        ChatPresenter$rememberIsUserTyping$lambda$0$$inlined$map$1$2$1 chatPresenter$rememberIsUserTyping$lambda$0$$inlined$map$1$2$1;
        int i17;
        ChatPresenter$rememberIsUserTyping$lambda$0$$inlined$map$2$2$1 chatPresenter$rememberIsUserTyping$lambda$0$$inlined$map$2$2$1;
        int i18;
        ChatTransactionPickerPresenter$models$lambda$0$$inlined$map$1$2$1 chatTransactionPickerPresenter$models$lambda$0$$inlined$map$1$2$1;
        int i19;
        PhoneVerificationPresenter$models$lambda$6$$inlined$filter$1$2$1 phoneVerificationPresenter$models$lambda$6$$inlined$filter$1$2$1;
        int i20;
        PhoneVerificationPresenter$models$lambda$6$$inlined$map$1$2$1 phoneVerificationPresenter$models$lambda$6$$inlined$map$1$2$1;
        int i21;
        SupportHomePresenter$models$lambda$5$$inlined$map$1$2$1 supportHomePresenter$models$lambda$5$$inlined$map$1$2$1;
        int i22;
        SupportIncidentDetailsPresenter$requestPermission$$inlined$filter$1$2$1 supportIncidentDetailsPresenter$requestPermission$$inlined$filter$1$2$1;
        int i23;
        SupportIncidentDetailsPresenter$requestPermission$$inlined$map$1$2$1 supportIncidentDetailsPresenter$requestPermission$$inlined$map$1$2$1;
        int i24;
        SupportLoadClientScenarioPresenter$loadClientScenario$$inlined$mapNotNull$1$2$1 supportLoadClientScenarioPresenter$loadClientScenario$$inlined$mapNotNull$1$2$1;
        int i25;
        SupportSearchPresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 supportSearchPresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
        int i26;
        RealLocalTabProvider$showLocal$lambda$0$$inlined$map$1$2$1 realLocalTabProvider$showLocal$lambda$0$$inlined$map$1$2$1;
        int i27;
        TabToolbarPresenter$models$lambda$10$$inlined$map$1$2$1 tabToolbarPresenter$models$lambda$10$$inlined$map$1$2$1;
        int i28;
        RealTapToPayEligibilityProvider$isActivated$$inlined$map$1$2$1 realTapToPayEligibilityProvider$isActivated$$inlined$map$1$2$1;
        int i29;
        RealTapToPayEligibilityProvider$isEligibleForOnboarding$$inlined$map$1$2$1 realTapToPayEligibilityProvider$isEligibleForOnboarding$$inlined$map$1$2$1;
        int i30;
        Object obj2;
        int i31 = this.$r8$classId;
        FlowCollector flowCollector = this.$this_unsafeFlow;
        Object obj3 = null;
        switch (i31) {
            case 0:
                if (continuation instanceof AnonymousClass1) {
                    anonymousClass1 = (AnonymousClass1) continuation;
                    int i32 = anonymousClass1.label;
                    if ((i32 & PKIFailureInfo.systemUnavail) != 0) {
                        anonymousClass1.label = i32 - PKIFailureInfo.systemUnavail;
                        Object obj4 = anonymousClass1.result;
                        Object obj5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = anonymousClass1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj4);
                            Object ready = new TabInfoState.Ready((List) obj);
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(ready, anonymousClass1) == obj5) {
                                break;
                            }
                        } else if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj4);
                        }
                        break;
                    }
                }
                anonymousClass1 = new AnonymousClass1(continuation);
                Object obj42 = anonymousClass1.result;
                Object obj52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = anonymousClass1.label;
                if (i != 0) {
                }
            case 1:
                if (continuation instanceof ShareSheetPresenter$models$3$1$invokeSuspend$$inlined$map$1$2$1) {
                    shareSheetPresenter$models$3$1$invokeSuspend$$inlined$map$1$2$1 = (ShareSheetPresenter$models$3$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i33 = shareSheetPresenter$models$3$1$invokeSuspend$$inlined$map$1$2$1.label;
                    if ((i33 & PKIFailureInfo.systemUnavail) != 0) {
                        shareSheetPresenter$models$3$1$invokeSuspend$$inlined$map$1$2$1.label = i33 - PKIFailureInfo.systemUnavail;
                        Object obj6 = shareSheetPresenter$models$3$1$invokeSuspend$$inlined$map$1$2$1.result;
                        Object obj7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = shareSheetPresenter$models$3$1$invokeSuspend$$inlined$map$1$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj6);
                            Object sharingCompleted = new ShareSheetPresenter.StateUpdate.SharingCompleted((ShareTargetsManager$ShareResult) obj);
                            shareSheetPresenter$models$3$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(sharingCompleted, shareSheetPresenter$models$3$1$invokeSuspend$$inlined$map$1$2$1) == obj7) {
                                break;
                            }
                        } else if (i2 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj6);
                        }
                        break;
                    }
                }
                shareSheetPresenter$models$3$1$invokeSuspend$$inlined$map$1$2$1 = new ShareSheetPresenter$models$3$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                Object obj62 = shareSheetPresenter$models$3$1$invokeSuspend$$inlined$map$1$2$1.result;
                Object obj72 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = shareSheetPresenter$models$3$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i2 != 0) {
                }
            case 2:
                if (continuation instanceof RealSheetState$awaitDismissalDragDisabled$$inlined$filter$1$2$1) {
                    realSheetState$awaitDismissalDragDisabled$$inlined$filter$1$2$1 = (RealSheetState$awaitDismissalDragDisabled$$inlined$filter$1$2$1) continuation;
                    int i34 = realSheetState$awaitDismissalDragDisabled$$inlined$filter$1$2$1.label;
                    if ((i34 & PKIFailureInfo.systemUnavail) != 0) {
                        realSheetState$awaitDismissalDragDisabled$$inlined$filter$1$2$1.label = i34 - PKIFailureInfo.systemUnavail;
                        Object obj8 = realSheetState$awaitDismissalDragDisabled$$inlined$filter$1$2$1.result;
                        Object obj9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i3 = realSheetState$awaitDismissalDragDisabled$$inlined$filter$1$2$1.label;
                        if (i3 != 0) {
                            SafeTrace.throwOnFailure(obj8);
                            if (((Boolean) obj).booleanValue()) {
                                realSheetState$awaitDismissalDragDisabled$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector.emit(obj, realSheetState$awaitDismissalDragDisabled$$inlined$filter$1$2$1) == obj9) {
                                    break;
                                }
                            }
                        } else if (i3 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj8);
                        }
                        break;
                    }
                }
                realSheetState$awaitDismissalDragDisabled$$inlined$filter$1$2$1 = new RealSheetState$awaitDismissalDragDisabled$$inlined$filter$1$2$1(this, continuation);
                Object obj82 = realSheetState$awaitDismissalDragDisabled$$inlined$filter$1$2$1.result;
                Object obj92 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = realSheetState$awaitDismissalDragDisabled$$inlined$filter$1$2$1.label;
                if (i3 != 0) {
                }
            case 3:
                if (continuation instanceof RealShoppingJavascriptPresenter$model$lambda$17$$inlined$filterIsInstance$1$2$1) {
                    realShoppingJavascriptPresenter$model$lambda$17$$inlined$filterIsInstance$1$2$1 = (RealShoppingJavascriptPresenter$model$lambda$17$$inlined$filterIsInstance$1$2$1) continuation;
                    int i35 = realShoppingJavascriptPresenter$model$lambda$17$$inlined$filterIsInstance$1$2$1.label;
                    if ((i35 & PKIFailureInfo.systemUnavail) != 0) {
                        realShoppingJavascriptPresenter$model$lambda$17$$inlined$filterIsInstance$1$2$1.label = i35 - PKIFailureInfo.systemUnavail;
                        Object obj10 = realShoppingJavascriptPresenter$model$lambda$17$$inlined$filterIsInstance$1$2$1.result;
                        Object obj11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i4 = realShoppingJavascriptPresenter$model$lambda$17$$inlined$filterIsInstance$1$2$1.label;
                        if (i4 != 0) {
                            SafeTrace.throwOnFailure(obj10);
                            if (obj instanceof ShoppingWebViewEvent.WebMonitoringJsonEvents) {
                                realShoppingJavascriptPresenter$model$lambda$17$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, realShoppingJavascriptPresenter$model$lambda$17$$inlined$filterIsInstance$1$2$1) == obj11) {
                                    break;
                                }
                            }
                        } else if (i4 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj10);
                        }
                        break;
                    }
                }
                realShoppingJavascriptPresenter$model$lambda$17$$inlined$filterIsInstance$1$2$1 = new RealShoppingJavascriptPresenter$model$lambda$17$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj102 = realShoppingJavascriptPresenter$model$lambda$17$$inlined$filterIsInstance$1$2$1.result;
                Object obj112 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = realShoppingJavascriptPresenter$model$lambda$17$$inlined$filterIsInstance$1$2$1.label;
                if (i4 != 0) {
                }
            case 4:
                if (continuation instanceof RealShoppingJavascriptPresenter$model$lambda$20$$inlined$filterIsInstance$1$2$1) {
                    realShoppingJavascriptPresenter$model$lambda$20$$inlined$filterIsInstance$1$2$1 = (RealShoppingJavascriptPresenter$model$lambda$20$$inlined$filterIsInstance$1$2$1) continuation;
                    int i36 = realShoppingJavascriptPresenter$model$lambda$20$$inlined$filterIsInstance$1$2$1.label;
                    if ((i36 & PKIFailureInfo.systemUnavail) != 0) {
                        realShoppingJavascriptPresenter$model$lambda$20$$inlined$filterIsInstance$1$2$1.label = i36 - PKIFailureInfo.systemUnavail;
                        Object obj12 = realShoppingJavascriptPresenter$model$lambda$20$$inlined$filterIsInstance$1$2$1.result;
                        Object obj13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i5 = realShoppingJavascriptPresenter$model$lambda$20$$inlined$filterIsInstance$1$2$1.label;
                        if (i5 != 0) {
                            SafeTrace.throwOnFailure(obj12);
                            if (obj instanceof ShoppingWebViewEvent.AfterpayWebCheckoutFlowJsonEvents) {
                                realShoppingJavascriptPresenter$model$lambda$20$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, realShoppingJavascriptPresenter$model$lambda$20$$inlined$filterIsInstance$1$2$1) == obj13) {
                                    break;
                                }
                            }
                        } else if (i5 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj12);
                        }
                        break;
                    }
                }
                realShoppingJavascriptPresenter$model$lambda$20$$inlined$filterIsInstance$1$2$1 = new RealShoppingJavascriptPresenter$model$lambda$20$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj122 = realShoppingJavascriptPresenter$model$lambda$20$$inlined$filterIsInstance$1$2$1.result;
                Object obj132 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i5 = realShoppingJavascriptPresenter$model$lambda$20$$inlined$filterIsInstance$1$2$1.label;
                if (i5 != 0) {
                }
            case 5:
                if (continuation instanceof RealShoppingJavascriptPresenter$model$lambda$25$$inlined$filterIsInstance$1$2$1) {
                    realShoppingJavascriptPresenter$model$lambda$25$$inlined$filterIsInstance$1$2$1 = (RealShoppingJavascriptPresenter$model$lambda$25$$inlined$filterIsInstance$1$2$1) continuation;
                    int i37 = realShoppingJavascriptPresenter$model$lambda$25$$inlined$filterIsInstance$1$2$1.label;
                    if ((i37 & PKIFailureInfo.systemUnavail) != 0) {
                        realShoppingJavascriptPresenter$model$lambda$25$$inlined$filterIsInstance$1$2$1.label = i37 - PKIFailureInfo.systemUnavail;
                        Object obj14 = realShoppingJavascriptPresenter$model$lambda$25$$inlined$filterIsInstance$1$2$1.result;
                        Object obj15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i6 = realShoppingJavascriptPresenter$model$lambda$25$$inlined$filterIsInstance$1$2$1.label;
                        if (i6 != 0) {
                            SafeTrace.throwOnFailure(obj14);
                            if (obj instanceof ShoppingWebViewEvent.PayKitShopViewEvent) {
                                realShoppingJavascriptPresenter$model$lambda$25$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, realShoppingJavascriptPresenter$model$lambda$25$$inlined$filterIsInstance$1$2$1) == obj15) {
                                    break;
                                }
                            }
                        } else if (i6 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj14);
                        }
                        break;
                    }
                }
                realShoppingJavascriptPresenter$model$lambda$25$$inlined$filterIsInstance$1$2$1 = new RealShoppingJavascriptPresenter$model$lambda$25$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj142 = realShoppingJavascriptPresenter$model$lambda$25$$inlined$filterIsInstance$1$2$1.result;
                Object obj152 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i6 = realShoppingJavascriptPresenter$model$lambda$25$$inlined$filterIsInstance$1$2$1.label;
                if (i6 != 0) {
                }
            case 6:
                if (continuation instanceof RealShoppingJavascriptPresenter$model$lambda$3$$inlined$filterIsInstance$1$2$1) {
                    realShoppingJavascriptPresenter$model$lambda$3$$inlined$filterIsInstance$1$2$1 = (RealShoppingJavascriptPresenter$model$lambda$3$$inlined$filterIsInstance$1$2$1) continuation;
                    int i38 = realShoppingJavascriptPresenter$model$lambda$3$$inlined$filterIsInstance$1$2$1.label;
                    if ((i38 & PKIFailureInfo.systemUnavail) != 0) {
                        realShoppingJavascriptPresenter$model$lambda$3$$inlined$filterIsInstance$1$2$1.label = i38 - PKIFailureInfo.systemUnavail;
                        Object obj16 = realShoppingJavascriptPresenter$model$lambda$3$$inlined$filterIsInstance$1$2$1.result;
                        Object obj17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i7 = realShoppingJavascriptPresenter$model$lambda$3$$inlined$filterIsInstance$1$2$1.label;
                        if (i7 != 0) {
                            SafeTrace.throwOnFailure(obj16);
                            if (obj instanceof ShoppingWebViewEvent.NavigationStateUpdated) {
                                realShoppingJavascriptPresenter$model$lambda$3$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, realShoppingJavascriptPresenter$model$lambda$3$$inlined$filterIsInstance$1$2$1) == obj17) {
                                    break;
                                }
                            }
                        } else if (i7 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj16);
                        }
                        break;
                    }
                }
                realShoppingJavascriptPresenter$model$lambda$3$$inlined$filterIsInstance$1$2$1 = new RealShoppingJavascriptPresenter$model$lambda$3$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj162 = realShoppingJavascriptPresenter$model$lambda$3$$inlined$filterIsInstance$1$2$1.result;
                Object obj172 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i7 = realShoppingJavascriptPresenter$model$lambda$3$$inlined$filterIsInstance$1$2$1.label;
                if (i7 != 0) {
                }
            case 7:
                if (continuation instanceof ShoppingWebPresenter$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) {
                    shoppingWebPresenter$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = (ShoppingWebPresenter$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) continuation;
                    int i39 = shoppingWebPresenter$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                    if ((i39 & PKIFailureInfo.systemUnavail) != 0) {
                        shoppingWebPresenter$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = i39 - PKIFailureInfo.systemUnavail;
                        Object obj18 = shoppingWebPresenter$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                        Object obj19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i8 = shoppingWebPresenter$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                        if (i8 != 0) {
                            SafeTrace.throwOnFailure(obj18);
                            if (obj instanceof BoostAction.Blockers) {
                                shoppingWebPresenter$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, shoppingWebPresenter$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) == obj19) {
                                    break;
                                }
                            }
                        } else if (i8 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj18);
                        }
                        break;
                    }
                }
                shoppingWebPresenter$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = new ShoppingWebPresenter$1$invokeSuspend$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj182 = shoppingWebPresenter$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                Object obj192 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i8 = shoppingWebPresenter$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                if (i8 != 0) {
                }
            case 8:
                if (continuation instanceof ShoppingWebPresenter$models$lambda$28$$inlined$filter$1$2$1) {
                    shoppingWebPresenter$models$lambda$28$$inlined$filter$1$2$1 = (ShoppingWebPresenter$models$lambda$28$$inlined$filter$1$2$1) continuation;
                    int i40 = shoppingWebPresenter$models$lambda$28$$inlined$filter$1$2$1.label;
                    if ((i40 & PKIFailureInfo.systemUnavail) != 0) {
                        shoppingWebPresenter$models$lambda$28$$inlined$filter$1$2$1.label = i40 - PKIFailureInfo.systemUnavail;
                        Object obj20 = shoppingWebPresenter$models$lambda$28$$inlined$filter$1$2$1.result;
                        Object obj21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i9 = shoppingWebPresenter$models$lambda$28$$inlined$filter$1$2$1.label;
                        if (i9 != 0) {
                            SafeTrace.throwOnFailure(obj20);
                            FillrCartInformationExtraction$FillrCartInformation fillrCartInformationExtraction$FillrCartInformation = (FillrCartInformationExtraction$FillrCartInformation) obj;
                            ArrayList arrayList = fillrCartInformationExtraction$FillrCartInformation != null ? fillrCartInformationExtraction$FillrCartInformation.products : null;
                            if (arrayList != null && !arrayList.isEmpty()) {
                                shoppingWebPresenter$models$lambda$28$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector.emit(obj, shoppingWebPresenter$models$lambda$28$$inlined$filter$1$2$1) == obj21) {
                                    break;
                                }
                            }
                        } else if (i9 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj20);
                        }
                        break;
                    }
                }
                shoppingWebPresenter$models$lambda$28$$inlined$filter$1$2$1 = new ShoppingWebPresenter$models$lambda$28$$inlined$filter$1$2$1(this, continuation);
                Object obj202 = shoppingWebPresenter$models$lambda$28$$inlined$filter$1$2$1.result;
                Object obj212 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i9 = shoppingWebPresenter$models$lambda$28$$inlined$filter$1$2$1.label;
                if (i9 != 0) {
                }
                break;
            case 9:
                if (continuation instanceof ShoppingWebPresenter$models$lambda$30$$inlined$map$1$2$1) {
                    shoppingWebPresenter$models$lambda$30$$inlined$map$1$2$1 = (ShoppingWebPresenter$models$lambda$30$$inlined$map$1$2$1) continuation;
                    int i41 = shoppingWebPresenter$models$lambda$30$$inlined$map$1$2$1.label;
                    if ((i41 & PKIFailureInfo.systemUnavail) != 0) {
                        shoppingWebPresenter$models$lambda$30$$inlined$map$1$2$1.label = i41 - PKIFailureInfo.systemUnavail;
                        Object obj22 = shoppingWebPresenter$models$lambda$30$$inlined$map$1$2$1.result;
                        Object obj23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i10 = shoppingWebPresenter$models$lambda$30$$inlined$map$1$2$1.label;
                        if (i10 != 0) {
                            SafeTrace.throwOnFailure(obj22);
                            IssuedCardFactory.IssuedCard issuedCard = (IssuedCardFactory.IssuedCard) obj;
                            Object valueOf = Boolean.valueOf((issuedCard != null ? issuedCard.getPan() : null) != null);
                            shoppingWebPresenter$models$lambda$30$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(valueOf, shoppingWebPresenter$models$lambda$30$$inlined$map$1$2$1) == obj23) {
                                break;
                            }
                        } else if (i10 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj22);
                        }
                        break;
                    }
                }
                shoppingWebPresenter$models$lambda$30$$inlined$map$1$2$1 = new ShoppingWebPresenter$models$lambda$30$$inlined$map$1$2$1(this, continuation);
                Object obj222 = shoppingWebPresenter$models$lambda$30$$inlined$map$1$2$1.result;
                Object obj232 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = shoppingWebPresenter$models$lambda$30$$inlined$map$1$2$1.label;
                if (i10 != 0) {
                }
            case 10:
                if (continuation instanceof RealPendingMessagesStore$messages$$inlined$map$1$2$1) {
                    realPendingMessagesStore$messages$$inlined$map$1$2$1 = (RealPendingMessagesStore$messages$$inlined$map$1$2$1) continuation;
                    int i42 = realPendingMessagesStore$messages$$inlined$map$1$2$1.label;
                    if ((i42 & PKIFailureInfo.systemUnavail) != 0) {
                        realPendingMessagesStore$messages$$inlined$map$1$2$1.label = i42 - PKIFailureInfo.systemUnavail;
                        Object obj24 = realPendingMessagesStore$messages$$inlined$map$1$2$1.result;
                        Object obj25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i11 = realPendingMessagesStore$messages$$inlined$map$1$2$1.label;
                        if (i11 != 0) {
                            SafeTrace.throwOnFailure(obj24);
                            Map map = ((RealPendingMessagesStore.MessagesState) obj).pendingRequests;
                            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(map.size()));
                            for (Map.Entry entry : map.entrySet()) {
                                linkedHashMap.put(entry.getKey(), ((RealPendingMessagesStore.PendingRequest) entry.getValue()).message);
                            }
                            Object pendingTranscript = new PendingTranscript(linkedHashMap);
                            realPendingMessagesStore$messages$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(pendingTranscript, realPendingMessagesStore$messages$$inlined$map$1$2$1) == obj25) {
                                break;
                            }
                        } else if (i11 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj24);
                        }
                        break;
                    }
                }
                realPendingMessagesStore$messages$$inlined$map$1$2$1 = new RealPendingMessagesStore$messages$$inlined$map$1$2$1(this, continuation);
                Object obj242 = realPendingMessagesStore$messages$$inlined$map$1$2$1.result;
                Object obj252 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i11 = realPendingMessagesStore$messages$$inlined$map$1$2$1.label;
                if (i11 != 0) {
                }
            case 11:
                if (continuation instanceof SupportConversationPersistence$observeLastReadMessageToken$$inlined$map$1$2$1) {
                    supportConversationPersistence$observeLastReadMessageToken$$inlined$map$1$2$1 = (SupportConversationPersistence$observeLastReadMessageToken$$inlined$map$1$2$1) continuation;
                    int i43 = supportConversationPersistence$observeLastReadMessageToken$$inlined$map$1$2$1.label;
                    if ((i43 & PKIFailureInfo.systemUnavail) != 0) {
                        supportConversationPersistence$observeLastReadMessageToken$$inlined$map$1$2$1.label = i43 - PKIFailureInfo.systemUnavail;
                        Object obj26 = supportConversationPersistence$observeLastReadMessageToken$$inlined$map$1$2$1.result;
                        Object obj27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i12 = supportConversationPersistence$observeLastReadMessageToken$$inlined$map$1$2$1.label;
                        if (i12 != 0) {
                            SafeTrace.throwOnFailure(obj26);
                            ChatLastReadMessageToken chatLastReadMessageToken = (ChatLastReadMessageToken) obj;
                            Object obj28 = chatLastReadMessageToken != null ? chatLastReadMessageToken.token : null;
                            Object obj29 = obj28 != null ? obj28 : null;
                            supportConversationPersistence$observeLastReadMessageToken$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj29, supportConversationPersistence$observeLastReadMessageToken$$inlined$map$1$2$1) == obj27) {
                                break;
                            }
                        } else if (i12 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj26);
                        }
                        break;
                    }
                }
                supportConversationPersistence$observeLastReadMessageToken$$inlined$map$1$2$1 = new SupportConversationPersistence$observeLastReadMessageToken$$inlined$map$1$2$1(this, continuation);
                Object obj262 = supportConversationPersistence$observeLastReadMessageToken$$inlined$map$1$2$1.result;
                Object obj272 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i12 = supportConversationPersistence$observeLastReadMessageToken$$inlined$map$1$2$1.label;
                if (i12 != 0) {
                }
            case 12:
                if (continuation instanceof ChatPresenter$AnnounceMessagesForAccessibility$1$1$invokeSuspend$$inlined$map$1$2$1) {
                    chatPresenter$AnnounceMessagesForAccessibility$1$1$invokeSuspend$$inlined$map$1$2$1 = (ChatPresenter$AnnounceMessagesForAccessibility$1$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i44 = chatPresenter$AnnounceMessagesForAccessibility$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                    if ((i44 & PKIFailureInfo.systemUnavail) != 0) {
                        chatPresenter$AnnounceMessagesForAccessibility$1$1$invokeSuspend$$inlined$map$1$2$1.label = i44 - PKIFailureInfo.systemUnavail;
                        Object obj30 = chatPresenter$AnnounceMessagesForAccessibility$1$1$invokeSuspend$$inlined$map$1$2$1.result;
                        Object obj31 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i13 = chatPresenter$AnnounceMessagesForAccessibility$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                        if (i13 != 0) {
                            SafeTrace.throwOnFailure(obj30);
                            Object obj32 = ((Transcript) obj).messages;
                            chatPresenter$AnnounceMessagesForAccessibility$1$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj32, chatPresenter$AnnounceMessagesForAccessibility$1$1$invokeSuspend$$inlined$map$1$2$1) == obj31) {
                                break;
                            }
                        } else if (i13 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj30);
                        }
                        break;
                    }
                }
                chatPresenter$AnnounceMessagesForAccessibility$1$1$invokeSuspend$$inlined$map$1$2$1 = new ChatPresenter$AnnounceMessagesForAccessibility$1$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                Object obj302 = chatPresenter$AnnounceMessagesForAccessibility$1$1$invokeSuspend$$inlined$map$1$2$1.result;
                Object obj312 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i13 = chatPresenter$AnnounceMessagesForAccessibility$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i13 != 0) {
                }
            case 13:
                if (continuation instanceof ChatPresenter$models$lambda$3$$inlined$map$1$2$1) {
                    chatPresenter$models$lambda$3$$inlined$map$1$2$1 = (ChatPresenter$models$lambda$3$$inlined$map$1$2$1) continuation;
                    int i45 = chatPresenter$models$lambda$3$$inlined$map$1$2$1.label;
                    if ((i45 & PKIFailureInfo.systemUnavail) != 0) {
                        chatPresenter$models$lambda$3$$inlined$map$1$2$1.label = i45 - PKIFailureInfo.systemUnavail;
                        Object obj33 = chatPresenter$models$lambda$3$$inlined$map$1$2$1.result;
                        Object obj34 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i14 = chatPresenter$models$lambda$3$$inlined$map$1$2$1.label;
                        if (i14 != 0) {
                            SafeTrace.throwOnFailure(obj33);
                            Object valueOf2 = Boolean.valueOf(((Lifecycle.State) obj).isAtLeast(Lifecycle.State.STARTED));
                            chatPresenter$models$lambda$3$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(valueOf2, chatPresenter$models$lambda$3$$inlined$map$1$2$1) == obj34) {
                                break;
                            }
                        } else if (i14 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj33);
                        }
                        break;
                    }
                }
                chatPresenter$models$lambda$3$$inlined$map$1$2$1 = new ChatPresenter$models$lambda$3$$inlined$map$1$2$1(this, continuation);
                Object obj332 = chatPresenter$models$lambda$3$$inlined$map$1$2$1.result;
                Object obj342 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i14 = chatPresenter$models$lambda$3$$inlined$map$1$2$1.label;
                if (i14 != 0) {
                }
            case 14:
                if (continuation instanceof ChatPresenter$models$lambda$55$$inlined$filterIsInstance$1$2$1) {
                    chatPresenter$models$lambda$55$$inlined$filterIsInstance$1$2$1 = (ChatPresenter$models$lambda$55$$inlined$filterIsInstance$1$2$1) continuation;
                    int i46 = chatPresenter$models$lambda$55$$inlined$filterIsInstance$1$2$1.label;
                    if ((i46 & PKIFailureInfo.systemUnavail) != 0) {
                        chatPresenter$models$lambda$55$$inlined$filterIsInstance$1$2$1.label = i46 - PKIFailureInfo.systemUnavail;
                        Object obj35 = chatPresenter$models$lambda$55$$inlined$filterIsInstance$1$2$1.result;
                        Object obj36 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i15 = chatPresenter$models$lambda$55$$inlined$filterIsInstance$1$2$1.label;
                        if (i15 != 0) {
                            SafeTrace.throwOnFailure(obj35);
                            if (obj instanceof ChatViewEvent.InputChanged) {
                                chatPresenter$models$lambda$55$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, chatPresenter$models$lambda$55$$inlined$filterIsInstance$1$2$1) == obj36) {
                                    break;
                                }
                            }
                        } else if (i15 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj35);
                        }
                        break;
                    }
                }
                chatPresenter$models$lambda$55$$inlined$filterIsInstance$1$2$1 = new ChatPresenter$models$lambda$55$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj352 = chatPresenter$models$lambda$55$$inlined$filterIsInstance$1$2$1.result;
                Object obj362 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i15 = chatPresenter$models$lambda$55$$inlined$filterIsInstance$1$2$1.label;
                if (i15 != 0) {
                }
            case 15:
                if (continuation instanceof ChatPresenter$rememberIsUserTyping$lambda$0$$inlined$filterIsInstance$1$2$1) {
                    chatPresenter$rememberIsUserTyping$lambda$0$$inlined$filterIsInstance$1$2$1 = (ChatPresenter$rememberIsUserTyping$lambda$0$$inlined$filterIsInstance$1$2$1) continuation;
                    int i47 = chatPresenter$rememberIsUserTyping$lambda$0$$inlined$filterIsInstance$1$2$1.label;
                    if ((i47 & PKIFailureInfo.systemUnavail) != 0) {
                        chatPresenter$rememberIsUserTyping$lambda$0$$inlined$filterIsInstance$1$2$1.label = i47 - PKIFailureInfo.systemUnavail;
                        Object obj37 = chatPresenter$rememberIsUserTyping$lambda$0$$inlined$filterIsInstance$1$2$1.result;
                        Object obj38 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i16 = chatPresenter$rememberIsUserTyping$lambda$0$$inlined$filterIsInstance$1$2$1.label;
                        if (i16 != 0) {
                            SafeTrace.throwOnFailure(obj37);
                            if (obj instanceof ChatViewEvent.InputChanged) {
                                chatPresenter$rememberIsUserTyping$lambda$0$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, chatPresenter$rememberIsUserTyping$lambda$0$$inlined$filterIsInstance$1$2$1) == obj38) {
                                    break;
                                }
                            }
                        } else if (i16 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj37);
                        }
                        break;
                    }
                }
                chatPresenter$rememberIsUserTyping$lambda$0$$inlined$filterIsInstance$1$2$1 = new ChatPresenter$rememberIsUserTyping$lambda$0$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj372 = chatPresenter$rememberIsUserTyping$lambda$0$$inlined$filterIsInstance$1$2$1.result;
                Object obj382 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i16 = chatPresenter$rememberIsUserTyping$lambda$0$$inlined$filterIsInstance$1$2$1.label;
                if (i16 != 0) {
                }
            case 16:
                if (continuation instanceof ChatPresenter$rememberIsUserTyping$lambda$0$$inlined$map$1$2$1) {
                    chatPresenter$rememberIsUserTyping$lambda$0$$inlined$map$1$2$1 = (ChatPresenter$rememberIsUserTyping$lambda$0$$inlined$map$1$2$1) continuation;
                    int i48 = chatPresenter$rememberIsUserTyping$lambda$0$$inlined$map$1$2$1.label;
                    if ((i48 & PKIFailureInfo.systemUnavail) != 0) {
                        chatPresenter$rememberIsUserTyping$lambda$0$$inlined$map$1$2$1.label = i48 - PKIFailureInfo.systemUnavail;
                        Object obj39 = chatPresenter$rememberIsUserTyping$lambda$0$$inlined$map$1$2$1.result;
                        Object obj40 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i17 = chatPresenter$rememberIsUserTyping$lambda$0$$inlined$map$1$2$1.label;
                        if (i17 != 0) {
                            SafeTrace.throwOnFailure(obj39);
                            Object obj41 = Boolean.TRUE;
                            chatPresenter$rememberIsUserTyping$lambda$0$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj41, chatPresenter$rememberIsUserTyping$lambda$0$$inlined$map$1$2$1) == obj40) {
                                break;
                            }
                        } else if (i17 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj39);
                        }
                        break;
                    }
                }
                chatPresenter$rememberIsUserTyping$lambda$0$$inlined$map$1$2$1 = new ChatPresenter$rememberIsUserTyping$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj392 = chatPresenter$rememberIsUserTyping$lambda$0$$inlined$map$1$2$1.result;
                Object obj402 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i17 = chatPresenter$rememberIsUserTyping$lambda$0$$inlined$map$1$2$1.label;
                if (i17 != 0) {
                }
            case 17:
                if (continuation instanceof ChatPresenter$rememberIsUserTyping$lambda$0$$inlined$map$2$2$1) {
                    chatPresenter$rememberIsUserTyping$lambda$0$$inlined$map$2$2$1 = (ChatPresenter$rememberIsUserTyping$lambda$0$$inlined$map$2$2$1) continuation;
                    int i49 = chatPresenter$rememberIsUserTyping$lambda$0$$inlined$map$2$2$1.label;
                    if ((i49 & PKIFailureInfo.systemUnavail) != 0) {
                        chatPresenter$rememberIsUserTyping$lambda$0$$inlined$map$2$2$1.label = i49 - PKIFailureInfo.systemUnavail;
                        Object obj43 = chatPresenter$rememberIsUserTyping$lambda$0$$inlined$map$2$2$1.result;
                        Object obj44 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i18 = chatPresenter$rememberIsUserTyping$lambda$0$$inlined$map$2$2$1.label;
                        if (i18 != 0) {
                            SafeTrace.throwOnFailure(obj43);
                            Object obj45 = Boolean.FALSE;
                            chatPresenter$rememberIsUserTyping$lambda$0$$inlined$map$2$2$1.label = 1;
                            if (flowCollector.emit(obj45, chatPresenter$rememberIsUserTyping$lambda$0$$inlined$map$2$2$1) == obj44) {
                                break;
                            }
                        } else if (i18 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj43);
                        }
                        break;
                    }
                }
                chatPresenter$rememberIsUserTyping$lambda$0$$inlined$map$2$2$1 = new ChatPresenter$rememberIsUserTyping$lambda$0$$inlined$map$2$2$1(this, continuation);
                Object obj432 = chatPresenter$rememberIsUserTyping$lambda$0$$inlined$map$2$2$1.result;
                Object obj442 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i18 = chatPresenter$rememberIsUserTyping$lambda$0$$inlined$map$2$2$1.label;
                if (i18 != 0) {
                }
            case 18:
                if (continuation instanceof ChatTransactionPickerPresenter$models$lambda$0$$inlined$map$1$2$1) {
                    chatTransactionPickerPresenter$models$lambda$0$$inlined$map$1$2$1 = (ChatTransactionPickerPresenter$models$lambda$0$$inlined$map$1$2$1) continuation;
                    int i50 = chatTransactionPickerPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                    if ((i50 & PKIFailureInfo.systemUnavail) != 0) {
                        chatTransactionPickerPresenter$models$lambda$0$$inlined$map$1$2$1.label = i50 - PKIFailureInfo.systemUnavail;
                        Object obj46 = chatTransactionPickerPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                        Object obj47 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i19 = chatTransactionPickerPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                        if (i19 != 0) {
                            SafeTrace.throwOnFailure(obj46);
                            PagedTransactions pagedTransactions = (PagedTransactions) obj;
                            Object loaded = new TransactionPickerViewModel.Loaded(pagedTransactions.outstanding, pagedTransactions.outstandingCount, pagedTransactions.completed, pagedTransactions.completedCount);
                            chatTransactionPickerPresenter$models$lambda$0$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(loaded, chatTransactionPickerPresenter$models$lambda$0$$inlined$map$1$2$1) == obj47) {
                                break;
                            }
                        } else if (i19 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj46);
                        }
                        break;
                    }
                }
                chatTransactionPickerPresenter$models$lambda$0$$inlined$map$1$2$1 = new ChatTransactionPickerPresenter$models$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj462 = chatTransactionPickerPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                Object obj472 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i19 = chatTransactionPickerPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                if (i19 != 0) {
                }
            case 19:
                if (continuation instanceof PhoneVerificationPresenter$models$lambda$6$$inlined$filter$1$2$1) {
                    phoneVerificationPresenter$models$lambda$6$$inlined$filter$1$2$1 = (PhoneVerificationPresenter$models$lambda$6$$inlined$filter$1$2$1) continuation;
                    int i51 = phoneVerificationPresenter$models$lambda$6$$inlined$filter$1$2$1.label;
                    if ((i51 & PKIFailureInfo.systemUnavail) != 0) {
                        phoneVerificationPresenter$models$lambda$6$$inlined$filter$1$2$1.label = i51 - PKIFailureInfo.systemUnavail;
                        Object obj48 = phoneVerificationPresenter$models$lambda$6$$inlined$filter$1$2$1.result;
                        Object obj49 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i20 = phoneVerificationPresenter$models$lambda$6$$inlined$filter$1$2$1.label;
                        if (i20 != 0) {
                            SafeTrace.throwOnFailure(obj48);
                            if (((Lifecycle.State) obj) == Lifecycle.State.RESUMED) {
                                phoneVerificationPresenter$models$lambda$6$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector.emit(obj, phoneVerificationPresenter$models$lambda$6$$inlined$filter$1$2$1) == obj49) {
                                    break;
                                }
                            }
                        } else if (i20 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj48);
                        }
                        break;
                    }
                }
                phoneVerificationPresenter$models$lambda$6$$inlined$filter$1$2$1 = new PhoneVerificationPresenter$models$lambda$6$$inlined$filter$1$2$1(this, continuation);
                Object obj482 = phoneVerificationPresenter$models$lambda$6$$inlined$filter$1$2$1.result;
                Object obj492 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i20 = phoneVerificationPresenter$models$lambda$6$$inlined$filter$1$2$1.label;
                if (i20 != 0) {
                }
            case 20:
                if (continuation instanceof PhoneVerificationPresenter$models$lambda$6$$inlined$map$1$2$1) {
                    phoneVerificationPresenter$models$lambda$6$$inlined$map$1$2$1 = (PhoneVerificationPresenter$models$lambda$6$$inlined$map$1$2$1) continuation;
                    int i52 = phoneVerificationPresenter$models$lambda$6$$inlined$map$1$2$1.label;
                    if ((i52 & PKIFailureInfo.systemUnavail) != 0) {
                        phoneVerificationPresenter$models$lambda$6$$inlined$map$1$2$1.label = i52 - PKIFailureInfo.systemUnavail;
                        Object obj50 = phoneVerificationPresenter$models$lambda$6$$inlined$map$1$2$1.result;
                        Object obj51 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i21 = phoneVerificationPresenter$models$lambda$6$$inlined$map$1$2$1.label;
                        if (i21 != 0) {
                            SafeTrace.throwOnFailure(obj50);
                            Object num = new Integer(((IndexedValue) obj).index);
                            phoneVerificationPresenter$models$lambda$6$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(num, phoneVerificationPresenter$models$lambda$6$$inlined$map$1$2$1) == obj51) {
                                break;
                            }
                        } else if (i21 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj50);
                        }
                        break;
                    }
                }
                phoneVerificationPresenter$models$lambda$6$$inlined$map$1$2$1 = new PhoneVerificationPresenter$models$lambda$6$$inlined$map$1$2$1(this, continuation);
                Object obj502 = phoneVerificationPresenter$models$lambda$6$$inlined$map$1$2$1.result;
                Object obj512 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i21 = phoneVerificationPresenter$models$lambda$6$$inlined$map$1$2$1.label;
                if (i21 != 0) {
                }
            case 21:
                if (continuation instanceof SupportHomePresenter$models$lambda$5$$inlined$map$1$2$1) {
                    supportHomePresenter$models$lambda$5$$inlined$map$1$2$1 = (SupportHomePresenter$models$lambda$5$$inlined$map$1$2$1) continuation;
                    int i53 = supportHomePresenter$models$lambda$5$$inlined$map$1$2$1.label;
                    if ((i53 & PKIFailureInfo.systemUnavail) != 0) {
                        supportHomePresenter$models$lambda$5$$inlined$map$1$2$1.label = i53 - PKIFailureInfo.systemUnavail;
                        Object obj53 = supportHomePresenter$models$lambda$5$$inlined$map$1$2$1.result;
                        Object obj54 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i22 = supportHomePresenter$models$lambda$5$$inlined$map$1$2$1.label;
                        if (i22 != 0) {
                            SafeTrace.throwOnFailure(obj53);
                            Object obj55 = ((Transcript) obj).messages;
                            supportHomePresenter$models$lambda$5$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj55, supportHomePresenter$models$lambda$5$$inlined$map$1$2$1) == obj54) {
                                break;
                            }
                        } else if (i22 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj53);
                        }
                        break;
                    }
                }
                supportHomePresenter$models$lambda$5$$inlined$map$1$2$1 = new SupportHomePresenter$models$lambda$5$$inlined$map$1$2$1(this, continuation);
                Object obj532 = supportHomePresenter$models$lambda$5$$inlined$map$1$2$1.result;
                Object obj542 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i22 = supportHomePresenter$models$lambda$5$$inlined$map$1$2$1.label;
                if (i22 != 0) {
                }
            case 22:
                if (continuation instanceof SupportIncidentDetailsPresenter$requestPermission$$inlined$filter$1$2$1) {
                    supportIncidentDetailsPresenter$requestPermission$$inlined$filter$1$2$1 = (SupportIncidentDetailsPresenter$requestPermission$$inlined$filter$1$2$1) continuation;
                    int i54 = supportIncidentDetailsPresenter$requestPermission$$inlined$filter$1$2$1.label;
                    if ((i54 & PKIFailureInfo.systemUnavail) != 0) {
                        supportIncidentDetailsPresenter$requestPermission$$inlined$filter$1$2$1.label = i54 - PKIFailureInfo.systemUnavail;
                        Object obj56 = supportIncidentDetailsPresenter$requestPermission$$inlined$filter$1$2$1.result;
                        Object obj57 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i23 = supportIncidentDetailsPresenter$requestPermission$$inlined$filter$1$2$1.label;
                        if (i23 != 0) {
                            SafeTrace.throwOnFailure(obj56);
                            if (((Boolean) obj).booleanValue()) {
                                supportIncidentDetailsPresenter$requestPermission$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector.emit(obj, supportIncidentDetailsPresenter$requestPermission$$inlined$filter$1$2$1) == obj57) {
                                    break;
                                }
                            }
                        } else if (i23 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj56);
                        }
                        break;
                    }
                }
                supportIncidentDetailsPresenter$requestPermission$$inlined$filter$1$2$1 = new SupportIncidentDetailsPresenter$requestPermission$$inlined$filter$1$2$1(this, continuation);
                Object obj562 = supportIncidentDetailsPresenter$requestPermission$$inlined$filter$1$2$1.result;
                Object obj572 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i23 = supportIncidentDetailsPresenter$requestPermission$$inlined$filter$1$2$1.label;
                if (i23 != 0) {
                }
            case 23:
                if (continuation instanceof SupportIncidentDetailsPresenter$requestPermission$$inlined$map$1$2$1) {
                    supportIncidentDetailsPresenter$requestPermission$$inlined$map$1$2$1 = (SupportIncidentDetailsPresenter$requestPermission$$inlined$map$1$2$1) continuation;
                    int i55 = supportIncidentDetailsPresenter$requestPermission$$inlined$map$1$2$1.label;
                    if ((i55 & PKIFailureInfo.systemUnavail) != 0) {
                        supportIncidentDetailsPresenter$requestPermission$$inlined$map$1$2$1.label = i55 - PKIFailureInfo.systemUnavail;
                        Object obj58 = supportIncidentDetailsPresenter$requestPermission$$inlined$map$1$2$1.result;
                        Object obj59 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i24 = supportIncidentDetailsPresenter$requestPermission$$inlined$map$1$2$1.label;
                        if (i24 != 0) {
                            SafeTrace.throwOnFailure(obj58);
                            Object obj60 = Boolean.FALSE;
                            supportIncidentDetailsPresenter$requestPermission$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj60, supportIncidentDetailsPresenter$requestPermission$$inlined$map$1$2$1) == obj59) {
                                break;
                            }
                        } else if (i24 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj58);
                        }
                        break;
                    }
                }
                supportIncidentDetailsPresenter$requestPermission$$inlined$map$1$2$1 = new SupportIncidentDetailsPresenter$requestPermission$$inlined$map$1$2$1(this, continuation);
                Object obj582 = supportIncidentDetailsPresenter$requestPermission$$inlined$map$1$2$1.result;
                Object obj592 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i24 = supportIncidentDetailsPresenter$requestPermission$$inlined$map$1$2$1.label;
                if (i24 != 0) {
                }
            case 24:
                if (continuation instanceof SupportLoadClientScenarioPresenter$loadClientScenario$$inlined$mapNotNull$1$2$1) {
                    supportLoadClientScenarioPresenter$loadClientScenario$$inlined$mapNotNull$1$2$1 = (SupportLoadClientScenarioPresenter$loadClientScenario$$inlined$mapNotNull$1$2$1) continuation;
                    int i56 = supportLoadClientScenarioPresenter$loadClientScenario$$inlined$mapNotNull$1$2$1.label;
                    if ((i56 & PKIFailureInfo.systemUnavail) != 0) {
                        supportLoadClientScenarioPresenter$loadClientScenario$$inlined$mapNotNull$1$2$1.label = i56 - PKIFailureInfo.systemUnavail;
                        Object obj61 = supportLoadClientScenarioPresenter$loadClientScenario$$inlined$mapNotNull$1$2$1.result;
                        Object obj63 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i25 = supportLoadClientScenarioPresenter$loadClientScenario$$inlined$mapNotNull$1$2$1.label;
                        if (i25 != 0) {
                            SafeTrace.throwOnFailure(obj61);
                            BlockersHelper.BlockersAction blockersAction = (BlockersHelper.BlockersAction) obj;
                            if (blockersAction instanceof BlockersHelper.BlockersAction.ShowError) {
                                obj3 = new SupportScreens$SupportDialogs$SupportFlowCheckConnectionScreen((String) null, ((BlockersHelper.BlockersAction.ShowError) blockersAction).message, 5);
                            } else if (blockersAction instanceof BlockersHelper.BlockersAction.ShowScreen) {
                                obj3 = ((BlockersHelper.BlockersAction.ShowScreen) blockersAction).screen;
                            }
                            if (obj3 != null) {
                                supportLoadClientScenarioPresenter$loadClientScenario$$inlined$mapNotNull$1$2$1.label = 1;
                                if (flowCollector.emit(obj3, supportLoadClientScenarioPresenter$loadClientScenario$$inlined$mapNotNull$1$2$1) == obj63) {
                                    break;
                                }
                            }
                        } else if (i25 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj61);
                        }
                        break;
                    }
                }
                supportLoadClientScenarioPresenter$loadClientScenario$$inlined$mapNotNull$1$2$1 = new SupportLoadClientScenarioPresenter$loadClientScenario$$inlined$mapNotNull$1$2$1(this, continuation);
                Object obj612 = supportLoadClientScenarioPresenter$loadClientScenario$$inlined$mapNotNull$1$2$1.result;
                Object obj632 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i25 = supportLoadClientScenarioPresenter$loadClientScenario$$inlined$mapNotNull$1$2$1.label;
                if (i25 != 0) {
                }
            case 25:
                if (continuation instanceof SupportSearchPresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) {
                    supportSearchPresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = (SupportSearchPresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) continuation;
                    int i57 = supportSearchPresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                    if ((i57 & PKIFailureInfo.systemUnavail) != 0) {
                        supportSearchPresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = i57 - PKIFailureInfo.systemUnavail;
                        Object obj64 = supportSearchPresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                        Object obj65 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i26 = supportSearchPresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                        if (i26 != 0) {
                            SafeTrace.throwOnFailure(obj64);
                            if (obj instanceof SupportSearchViewEvent.SearchTextChanged) {
                                supportSearchPresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, supportSearchPresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) == obj65) {
                                    break;
                                }
                            }
                        } else if (i26 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj64);
                        }
                        break;
                    }
                }
                supportSearchPresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = new SupportSearchPresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj642 = supportSearchPresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                Object obj652 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i26 = supportSearchPresenter$models$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                if (i26 != 0) {
                }
            case 26:
                if (continuation instanceof RealLocalTabProvider$showLocal$lambda$0$$inlined$map$1$2$1) {
                    realLocalTabProvider$showLocal$lambda$0$$inlined$map$1$2$1 = (RealLocalTabProvider$showLocal$lambda$0$$inlined$map$1$2$1) continuation;
                    int i58 = realLocalTabProvider$showLocal$lambda$0$$inlined$map$1$2$1.label;
                    if ((i58 & PKIFailureInfo.systemUnavail) != 0) {
                        realLocalTabProvider$showLocal$lambda$0$$inlined$map$1$2$1.label = i58 - PKIFailureInfo.systemUnavail;
                        Object obj66 = realLocalTabProvider$showLocal$lambda$0$$inlined$map$1$2$1.result;
                        Object obj67 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i27 = realLocalTabProvider$showLocal$lambda$0$$inlined$map$1$2$1.label;
                        if (i27 != 0) {
                            SafeTrace.throwOnFailure(obj66);
                            Object valueOf3 = Boolean.valueOf(!((List) obj).isEmpty());
                            realLocalTabProvider$showLocal$lambda$0$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(valueOf3, realLocalTabProvider$showLocal$lambda$0$$inlined$map$1$2$1) == obj67) {
                                break;
                            }
                        } else if (i27 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj66);
                        }
                        break;
                    }
                }
                realLocalTabProvider$showLocal$lambda$0$$inlined$map$1$2$1 = new RealLocalTabProvider$showLocal$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj662 = realLocalTabProvider$showLocal$lambda$0$$inlined$map$1$2$1.result;
                Object obj672 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i27 = realLocalTabProvider$showLocal$lambda$0$$inlined$map$1$2$1.label;
                if (i27 != 0) {
                }
            case 27:
                if (continuation instanceof TabToolbarPresenter$models$lambda$10$$inlined$map$1$2$1) {
                    tabToolbarPresenter$models$lambda$10$$inlined$map$1$2$1 = (TabToolbarPresenter$models$lambda$10$$inlined$map$1$2$1) continuation;
                    int i59 = tabToolbarPresenter$models$lambda$10$$inlined$map$1$2$1.label;
                    if ((i59 & PKIFailureInfo.systemUnavail) != 0) {
                        tabToolbarPresenter$models$lambda$10$$inlined$map$1$2$1.label = i59 - PKIFailureInfo.systemUnavail;
                        Object obj68 = tabToolbarPresenter$models$lambda$10$$inlined$map$1$2$1.result;
                        Object obj69 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i28 = tabToolbarPresenter$models$lambda$10$$inlined$map$1$2$1.label;
                        if (i28 != 0) {
                            SafeTrace.throwOnFailure(obj68);
                            Object valueOf4 = Boolean.valueOf(((SessionState) obj) instanceof SwitchingState);
                            tabToolbarPresenter$models$lambda$10$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(valueOf4, tabToolbarPresenter$models$lambda$10$$inlined$map$1$2$1) == obj69) {
                                break;
                            }
                        } else if (i28 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj68);
                        }
                        break;
                    }
                }
                tabToolbarPresenter$models$lambda$10$$inlined$map$1$2$1 = new TabToolbarPresenter$models$lambda$10$$inlined$map$1$2$1(this, continuation);
                Object obj682 = tabToolbarPresenter$models$lambda$10$$inlined$map$1$2$1.result;
                Object obj692 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i28 = tabToolbarPresenter$models$lambda$10$$inlined$map$1$2$1.label;
                if (i28 != 0) {
                }
            case 28:
                if (continuation instanceof RealTapToPayEligibilityProvider$isActivated$$inlined$map$1$2$1) {
                    realTapToPayEligibilityProvider$isActivated$$inlined$map$1$2$1 = (RealTapToPayEligibilityProvider$isActivated$$inlined$map$1$2$1) continuation;
                    int i60 = realTapToPayEligibilityProvider$isActivated$$inlined$map$1$2$1.label;
                    if ((i60 & PKIFailureInfo.systemUnavail) != 0) {
                        realTapToPayEligibilityProvider$isActivated$$inlined$map$1$2$1.label = i60 - PKIFailureInfo.systemUnavail;
                        Object obj70 = realTapToPayEligibilityProvider$isActivated$$inlined$map$1$2$1.result;
                        Object obj71 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i29 = realTapToPayEligibilityProvider$isActivated$$inlined$map$1$2$1.label;
                        if (i29 != 0) {
                            SafeTrace.throwOnFailure(obj70);
                            TapToPay tapToPay = (TapToPay) obj;
                            Object valueOf5 = Boolean.valueOf((tapToPay != null ? tapToPay.onboarding_status : null) == TapToPay.OnboardingStatus.ACTIVATED);
                            realTapToPayEligibilityProvider$isActivated$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(valueOf5, realTapToPayEligibilityProvider$isActivated$$inlined$map$1$2$1) == obj71) {
                                break;
                            }
                        } else if (i29 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj70);
                        }
                        break;
                    }
                }
                realTapToPayEligibilityProvider$isActivated$$inlined$map$1$2$1 = new RealTapToPayEligibilityProvider$isActivated$$inlined$map$1$2$1(this, continuation);
                Object obj702 = realTapToPayEligibilityProvider$isActivated$$inlined$map$1$2$1.result;
                Object obj712 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i29 = realTapToPayEligibilityProvider$isActivated$$inlined$map$1$2$1.label;
                if (i29 != 0) {
                }
            default:
                if (continuation instanceof RealTapToPayEligibilityProvider$isEligibleForOnboarding$$inlined$map$1$2$1) {
                    realTapToPayEligibilityProvider$isEligibleForOnboarding$$inlined$map$1$2$1 = (RealTapToPayEligibilityProvider$isEligibleForOnboarding$$inlined$map$1$2$1) continuation;
                    int i61 = realTapToPayEligibilityProvider$isEligibleForOnboarding$$inlined$map$1$2$1.label;
                    if ((i61 & PKIFailureInfo.systemUnavail) != 0) {
                        realTapToPayEligibilityProvider$isEligibleForOnboarding$$inlined$map$1$2$1.label = i61 - PKIFailureInfo.systemUnavail;
                        Object obj73 = realTapToPayEligibilityProvider$isEligibleForOnboarding$$inlined$map$1$2$1.result;
                        Object obj74 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i30 = realTapToPayEligibilityProvider$isEligibleForOnboarding$$inlined$map$1$2$1.label;
                        if (i30 != 0) {
                            SafeTrace.throwOnFailure(obj73);
                            Iterator it = ((List) obj).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    if (((TapToPay) obj2).onboarding_status != null) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            TapToPay tapToPay2 = (TapToPay) obj2;
                            TapToPay.OnboardingStatus onboardingStatus = tapToPay2 != null ? tapToPay2.onboarding_status : null;
                            int i62 = onboardingStatus == null ? -1 : RealTapToPayEligibilityProvider.WhenMappings.$EnumSwitchMapping$0[onboardingStatus.ordinal()];
                            if (i62 != 1 && i62 != 2 && i62 != 3) {
                                r1 = true;
                            }
                            Object valueOf6 = Boolean.valueOf(r1);
                            realTapToPayEligibilityProvider$isEligibleForOnboarding$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(valueOf6, realTapToPayEligibilityProvider$isEligibleForOnboarding$$inlined$map$1$2$1) == obj74) {
                                break;
                            }
                        } else if (i30 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj73);
                        }
                        break;
                    }
                }
                realTapToPayEligibilityProvider$isEligibleForOnboarding$$inlined$map$1$2$1 = new RealTapToPayEligibilityProvider$isEligibleForOnboarding$$inlined$map$1$2$1(this, continuation);
                Object obj732 = realTapToPayEligibilityProvider$isEligibleForOnboarding$$inlined$map$1$2$1.result;
                Object obj742 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i30 = realTapToPayEligibilityProvider$isEligibleForOnboarding$$inlined$map$1$2$1.label;
                if (i30 != 0) {
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ RealTabProvider$setup$lambda$0$$inlined$map$1$2(FlowCollector flowCollector, int i) {
        this.$r8$classId = i;
        this.$this_unsafeFlow = flowCollector;
    }
}
