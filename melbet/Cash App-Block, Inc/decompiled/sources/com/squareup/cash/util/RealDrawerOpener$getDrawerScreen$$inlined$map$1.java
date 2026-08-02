package com.squareup.cash.util;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.browsersdk.model.FillrWidget;
import com.squareup.cash.data.profile.PublicProfile;
import com.squareup.cash.earnings.backend.real.RealEarningsChartRepository$header$$inlined$map$1$2;
import com.squareup.cash.graphics.swampgl.components.Camera$special$$inlined$map$1;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.investing.backend.real.metrics.RealInvestingMetrics$createMetricsFlow$1;
import com.squareup.cash.investing.presenters.InvestingPortfolioPresenter$models$lambda$6$$inlined$map$1$2;
import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$17$$inlined$map$1;
import com.squareup.cash.payments.backend.api.P2pSettingsManager$P2pSettings;
import com.squareup.cash.payments.backend.real.RealP2pSettingsManager$select$$inlined$map$1$2;
import com.squareup.cash.permissions.AndroidPermissionChecker$granted$$inlined$filter$1$2;
import com.squareup.cash.profile.presenters.ProfileSecurityPresenter$special$$inlined$map$1$2;
import com.squareup.cash.session.backend.RealUrlAuthenticator$special$$inlined$filter$1$2;
import com.squareup.cash.tabprovider.real.RealTabProvider$setup$lambda$0$$inlined$map$1$2;
import com.squareup.cash.taptopay.backend.real.RealTapToPayRepository$getTapToPayDescriptionSuggestions$$inlined$map$1$2$1;
import com.squareup.cash.tax.web.TaxWebAppBridge$4$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.transfers.backend.api.TransfersWithdrawManager;
import com.squareup.cash.transfers.backend.real.RealTransfersWithdrawManager;
import com.squareup.cash.transfers.backend.real.RealTransfersWithdrawManager$feeDataFromProfile$$inlined$map$1$2$1;
import com.squareup.cash.transfers.presenters.BalanceBasedAutoReloadConfirmationPresenter$models$lambda$6$$inlined$map$1$2$1;
import com.squareup.cash.ui.qrcodes.widget.CashQrWidgetDataKt$cashQrWidgetDataFlow$1$1$1$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.cash.ui.qrcodes.widget.QrWidgetRefreshApplicationWorker$work$2$1$1$2$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.cash.wallet.data.RealCashAppTagManager$getAllCashAppTags$$inlined$map$1$2$1;
import com.squareup.cash.wallet.data.RealCashAppTagManager$getAllCashAppTags$$inlined$map$2$2$1;
import com.squareup.cash.wallet.data.RealCashAppTagManager$getShowTagActivation$$inlined$map$1$2$1;
import com.squareup.cash.wallet.data.RealCashAppTagManager$getShowTagSupport$$inlined$map$1$2$1;
import com.squareup.cash.wallet.data.RealIssuedCardManager;
import com.squareup.cash.wallet.data.RealIssuedCardManager$getIssuedCardState$$inlined$map$1$2$1;
import com.squareup.cash.wallet.data.RealIssuedCardManager$hasActiveIssuedCard$$inlined$map$1$2$1;
import com.squareup.cash.wallet.db.IssuedCardFactory;
import com.squareup.cash.wallet.presenters.CardSchemePresenter$models$10$1$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.cash.wallet.presenters.CardSchemePresenter$models$6$1$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.cash.wallet.presenters.CardSchemePresenter$models$8$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.wallet.presenters.CardSchemePresenter$models$9$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.wallet.presenters.CardSchemePresenter$toCardUpsellModule$1$content$2$1$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.cash.wallet.presenters.CardSchemePresenter$toCardUpsellModule$lambda$2$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.wallet.presenters.CardSchemePresenter$toCardUpsellModule$lambda$2$$inlined$map$1$2$1;
import com.squareup.cash.wallet.presenters.CardSchemePresenter$toHeroModule$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.wallet.presenters.CardSchemePresenter$toHeroModule$1$1$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.cash.wallet.presenters.CardSchemePresenter$toHeroModule$3$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.wallet.presenters.PresenterEvents;
import com.squareup.cash.wallet.presenters.RealCardAppletTileRepository$installedModelFlow$$inlined$map$1$2$1;
import com.squareup.cash.wallet.presenters.WalletHomePresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.wallet.presenters.WalletHomePresenter$models$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import com.squareup.cash.wallet.viewmodels.WalletHomeViewEvent;
import com.squareup.cash.wallet.views.CoreInteractiveCardKt$InteractiveCardEffect$12$1$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.wallet.views.CoreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1$1$2$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.wallet.views.CoreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.wallet.views.CoreInteractiveCardKt$InteractiveCardEffect$15$1$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.work.data.api.AssignedJobProviderKt$jobs$$inlined$map$1;
import com.squareup.protos.cash.cashbusinessaccounts.TapToPayDescriptionSuggestions;
import com.squareup.protos.cash.postcard.CashAppCard;
import com.squareup.protos.cash.taply.syncvalues.CashAppTag;
import com.squareup.protos.franklin.api.DepositPreference;
import com.squareup.protos.franklin.cards.CardThemeDefinitions;
import com.squareup.protos.franklin.common.DepositPreferenceData;
import com.squareup.protos.franklin.common.DepositPreferenceOption;
import com.squareup.protos.franklin.common.FeeData;
import com.squareup.protos.franklin.ui.FullCashtag;
import com.squareup.util.android.ActivityResult;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealDrawerOpener$getDrawerScreen$$inlined$map$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ChannelFlowTransformLatest $this_unsafeTransform$inlined;

    public /* synthetic */ RealDrawerOpener$getDrawerScreen$$inlined$map$1(ChannelFlowTransformLatest channelFlowTransformLatest, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = channelFlowTransformLatest;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        int i2 = 4;
        int i3 = 21;
        int i4 = 26;
        int i5 = 9;
        int i6 = 27;
        int i7 = 5;
        int i8 = 24;
        int i9 = 11;
        ChannelFlowTransformLatest channelFlowTransformLatest = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = channelFlowTransformLatest.collect(new AnonymousClass2(flowCollector, 0), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object collect2 = channelFlowTransformLatest.collect(new RealEarningsChartRepository$header$$inlined$map$1$2(flowCollector, i3), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object collect3 = channelFlowTransformLatest.collect(new RealEarningsChartRepository$header$$inlined$map$1$2(flowCollector, 22), continuation);
                if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object collect4 = channelFlowTransformLatest.collect(new RealEarningsChartRepository$header$$inlined$map$1$2(flowCollector, i6), continuation);
                if (collect4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object collect5 = channelFlowTransformLatest.collect(new Camera$special$$inlined$map$1.AnonymousClass2(flowCollector, i9), continuation);
                if (collect5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object collect6 = channelFlowTransformLatest.collect(new RealInvestingMetrics$createMetricsFlow$1.AnonymousClass1.C00621(flowCollector, i2), continuation);
                if (collect6 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object collect7 = channelFlowTransformLatest.collect(new RealInvestingMetrics$createMetricsFlow$1.AnonymousClass1.C00621(flowCollector, 15), continuation);
                if (collect7 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object collect8 = channelFlowTransformLatest.collect(new InvestingPortfolioPresenter$models$lambda$6$$inlined$map$1$2(flowCollector, 3), continuation);
                if (collect8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object collect9 = channelFlowTransformLatest.collect(new InvestingPortfolioPresenter$models$lambda$6$$inlined$map$1$2(flowCollector, i2), continuation);
                if (collect9 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object collect10 = channelFlowTransformLatest.collect(new InvestingPortfolioPresenter$models$lambda$6$$inlined$map$1$2(flowCollector, i7), continuation);
                if (collect10 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object collect11 = channelFlowTransformLatest.collect(new InvestingPortfolioPresenter$models$lambda$6$$inlined$map$1$2(flowCollector, 10), continuation);
                if (collect11 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object collect12 = channelFlowTransformLatest.collect(new InvestingPortfolioPresenter$models$lambda$6$$inlined$map$1$2(flowCollector, i9), continuation);
                if (collect12 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                Object collect13 = channelFlowTransformLatest.collect(new MoneyTabPresenter$models$lambda$17$$inlined$map$1.AnonymousClass2(flowCollector, i4), continuation);
                if (collect13 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 13:
                Object collect14 = channelFlowTransformLatest.collect(new RealP2pSettingsManager$select$$inlined$map$1$2(flowCollector, i5), continuation);
                if (collect14 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                Object collect15 = channelFlowTransformLatest.collect(new RealP2pSettingsManager$select$$inlined$map$1$2(flowCollector, 28), continuation);
                if (collect15 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 15:
                Object collect16 = channelFlowTransformLatest.collect(new AndroidPermissionChecker$granted$$inlined$filter$1$2(flowCollector, 1), continuation);
                if (collect16 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 16:
                Object collect17 = channelFlowTransformLatest.collect(new AndroidPermissionChecker$granted$$inlined$filter$1$2(flowCollector, i9), continuation);
                if (collect17 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 17:
                Object collect18 = channelFlowTransformLatest.collect(new AndroidPermissionChecker$granted$$inlined$filter$1$2(flowCollector, 16), continuation);
                if (collect18 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 18:
                Object collect19 = channelFlowTransformLatest.collect(new AndroidPermissionChecker$granted$$inlined$filter$1$2(flowCollector, i3), continuation);
                if (collect19 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 19:
                Object collect20 = channelFlowTransformLatest.collect(new ProfileSecurityPresenter$special$$inlined$map$1$2(flowCollector, 19), continuation);
                if (collect20 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 20:
                Object collect21 = channelFlowTransformLatest.collect(new ProfileSecurityPresenter$special$$inlined$map$1$2(flowCollector, i4), continuation);
                if (collect21 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 21:
                Object collect22 = channelFlowTransformLatest.collect(new RealUrlAuthenticator$special$$inlined$filter$1$2(flowCollector, i5), continuation);
                if (collect22 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 22:
                Object collect23 = channelFlowTransformLatest.collect(new RealUrlAuthenticator$special$$inlined$filter$1$2(flowCollector, 17), continuation);
                if (collect23 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 23:
                Object collect24 = channelFlowTransformLatest.collect(new RealUrlAuthenticator$special$$inlined$filter$1$2(flowCollector, 18), continuation);
                if (collect24 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 24:
                Object collect25 = channelFlowTransformLatest.collect(new RealUrlAuthenticator$special$$inlined$filter$1$2(flowCollector, i6), continuation);
                if (collect25 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 25:
                Object collect26 = channelFlowTransformLatest.collect(new RealTabProvider$setup$lambda$0$$inlined$map$1$2(flowCollector, i8), continuation);
                if (collect26 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 26:
                Object collect27 = channelFlowTransformLatest.collect(new AnonymousClass2(flowCollector, i7), continuation);
                if (collect27 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 27:
                Object collect28 = channelFlowTransformLatest.collect(new AnonymousClass2(flowCollector, 6), continuation);
                if (collect28 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 28:
                Object collect29 = channelFlowTransformLatest.collect(new AnonymousClass2(flowCollector, 23), continuation);
                if (collect29 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect30 = channelFlowTransformLatest.collect(new AssignedJobProviderKt$jobs$$inlined$map$1.AnonymousClass2(flowCollector, i8), continuation);
                if (collect30 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: com.squareup.cash.util.RealDrawerOpener$getDrawerScreen$$inlined$map$1$2, reason: invalid class name */
    /* loaded from: classes7.dex */
    public final class AnonymousClass2 implements FlowCollector {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ FlowCollector $this_unsafeFlow;

        /* renamed from: com.squareup.cash.util.RealDrawerOpener$getDrawerScreen$$inlined$map$1$2$1, reason: invalid class name */
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
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(FlowCollector flowCollector, RealTransfersWithdrawManager realTransfersWithdrawManager) {
            this.$r8$classId = 3;
            this.$this_unsafeFlow = flowCollector;
        }

        /* JADX WARN: Removed duplicated region for block: B:109:0x0174  */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x017e  */
        /* JADX WARN: Removed duplicated region for block: B:129:0x01b0  */
        /* JADX WARN: Removed duplicated region for block: B:135:0x01ba  */
        /* JADX WARN: Removed duplicated region for block: B:152:0x01f7  */
        /* JADX WARN: Removed duplicated region for block: B:158:0x0201  */
        /* JADX WARN: Removed duplicated region for block: B:172:0x0233  */
        /* JADX WARN: Removed duplicated region for block: B:178:0x023d  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:190:0x0274  */
        /* JADX WARN: Removed duplicated region for block: B:196:0x027e  */
        /* JADX WARN: Removed duplicated region for block: B:210:0x02b0  */
        /* JADX WARN: Removed duplicated region for block: B:216:0x02ba  */
        /* JADX WARN: Removed duplicated region for block: B:228:0x02ed  */
        /* JADX WARN: Removed duplicated region for block: B:234:0x02f7  */
        /* JADX WARN: Removed duplicated region for block: B:248:0x0329  */
        /* JADX WARN: Removed duplicated region for block: B:254:0x0333  */
        /* JADX WARN: Removed duplicated region for block: B:269:0x036e  */
        /* JADX WARN: Removed duplicated region for block: B:275:0x0378  */
        /* JADX WARN: Removed duplicated region for block: B:289:0x03aa  */
        /* JADX WARN: Removed duplicated region for block: B:295:0x03b4  */
        /* JADX WARN: Removed duplicated region for block: B:309:0x03e6  */
        /* JADX WARN: Removed duplicated region for block: B:315:0x03f0  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:350:0x045a  */
        /* JADX WARN: Removed duplicated region for block: B:356:0x0464  */
        /* JADX WARN: Removed duplicated region for block: B:371:0x049d  */
        /* JADX WARN: Removed duplicated region for block: B:377:0x04a7  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:394:0x04e3  */
        /* JADX WARN: Removed duplicated region for block: B:400:0x04ed  */
        /* JADX WARN: Removed duplicated region for block: B:423:0x053b  */
        /* JADX WARN: Removed duplicated region for block: B:429:0x0545  */
        /* JADX WARN: Removed duplicated region for block: B:444:0x058a  */
        /* JADX WARN: Removed duplicated region for block: B:450:0x0594  */
        /* JADX WARN: Removed duplicated region for block: B:465:0x05d9  */
        /* JADX WARN: Removed duplicated region for block: B:471:0x05e3  */
        /* JADX WARN: Removed duplicated region for block: B:483:0x0618  */
        /* JADX WARN: Removed duplicated region for block: B:489:0x0622  */
        /* JADX WARN: Removed duplicated region for block: B:501:0x0657  */
        /* JADX WARN: Removed duplicated region for block: B:507:0x0661  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:522:0x0698  */
        /* JADX WARN: Removed duplicated region for block: B:528:0x06a2  */
        /* JADX WARN: Removed duplicated region for block: B:540:0x06d5  */
        /* JADX WARN: Removed duplicated region for block: B:546:0x06df  */
        /* JADX WARN: Removed duplicated region for block: B:558:0x0712  */
        /* JADX WARN: Removed duplicated region for block: B:564:0x071e  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x00bf  */
        /* JADX WARN: Removed duplicated region for block: B:622:0x07f0  */
        /* JADX WARN: Removed duplicated region for block: B:628:0x07fa  */
        /* JADX WARN: Removed duplicated region for block: B:644:0x0833  */
        /* JADX WARN: Removed duplicated region for block: B:650:0x083d  */
        /* JADX WARN: Removed duplicated region for block: B:667:0x0876  */
        /* JADX WARN: Removed duplicated region for block: B:673:0x0880  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x00f6  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0100  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x0137  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x0141  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1;
            int i;
            RealTapToPayRepository$getTapToPayDescriptionSuggestions$$inlined$map$1$2$1 realTapToPayRepository$getTapToPayDescriptionSuggestions$$inlined$map$1$2$1;
            int i2;
            TaxWebAppBridge$4$invokeSuspend$$inlined$filter$1$2$1 taxWebAppBridge$4$invokeSuspend$$inlined$filter$1$2$1;
            int i3;
            RealTransfersWithdrawManager$feeDataFromProfile$$inlined$map$1$2$1 realTransfersWithdrawManager$feeDataFromProfile$$inlined$map$1$2$1;
            int i4;
            List list;
            Object obj2;
            FeeData feeData;
            BalanceBasedAutoReloadConfirmationPresenter$models$lambda$6$$inlined$map$1$2$1 balanceBasedAutoReloadConfirmationPresenter$models$lambda$6$$inlined$map$1$2$1;
            int i5;
            CashQrWidgetDataKt$cashQrWidgetDataFlow$1$1$1$invokeSuspend$$inlined$map$1$2$1 cashQrWidgetDataKt$cashQrWidgetDataFlow$1$1$1$invokeSuspend$$inlined$map$1$2$1;
            int i6;
            QrWidgetRefreshApplicationWorker$work$2$1$1$2$invokeSuspend$$inlined$map$1$2$1 qrWidgetRefreshApplicationWorker$work$2$1$1$2$invokeSuspend$$inlined$map$1$2$1;
            int i7;
            RealCashAppTagManager$getAllCashAppTags$$inlined$map$1$2$1 realCashAppTagManager$getAllCashAppTags$$inlined$map$1$2$1;
            int i8;
            RealCashAppTagManager$getAllCashAppTags$$inlined$map$2$2$1 realCashAppTagManager$getAllCashAppTags$$inlined$map$2$2$1;
            int i9;
            RealCashAppTagManager$getShowTagActivation$$inlined$map$1$2$1 realCashAppTagManager$getShowTagActivation$$inlined$map$1$2$1;
            int i10;
            RealCashAppTagManager$getShowTagSupport$$inlined$map$1$2$1 realCashAppTagManager$getShowTagSupport$$inlined$map$1$2$1;
            int i11;
            RealIssuedCardManager$getIssuedCardState$$inlined$map$1$2$1 realIssuedCardManager$getIssuedCardState$$inlined$map$1$2$1;
            int i12;
            Object obj3;
            RealIssuedCardManager$hasActiveIssuedCard$$inlined$map$1$2$1 realIssuedCardManager$hasActiveIssuedCard$$inlined$map$1$2$1;
            int i13;
            CardSchemePresenter$models$10$1$invokeSuspend$$inlined$map$1$2$1 cardSchemePresenter$models$10$1$invokeSuspend$$inlined$map$1$2$1;
            int i14;
            CardSchemePresenter$models$6$1$invokeSuspend$$inlined$map$1$2$1 cardSchemePresenter$models$6$1$invokeSuspend$$inlined$map$1$2$1;
            int i15;
            CardSchemePresenter$models$8$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 cardSchemePresenter$models$8$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
            int i16;
            CardSchemePresenter$models$9$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 cardSchemePresenter$models$9$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
            int i17;
            CardSchemePresenter$toCardUpsellModule$1$content$2$1$invokeSuspend$$inlined$map$1$2$1 cardSchemePresenter$toCardUpsellModule$1$content$2$1$invokeSuspend$$inlined$map$1$2$1;
            int i18;
            CardSchemePresenter$toCardUpsellModule$lambda$2$$inlined$filterIsInstance$1$2$1 cardSchemePresenter$toCardUpsellModule$lambda$2$$inlined$filterIsInstance$1$2$1;
            int i19;
            CardSchemePresenter$toCardUpsellModule$lambda$2$$inlined$map$1$2$1 cardSchemePresenter$toCardUpsellModule$lambda$2$$inlined$map$1$2$1;
            int i20;
            CardSchemePresenter$toHeroModule$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 cardSchemePresenter$toHeroModule$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
            int i21;
            CardSchemePresenter$toHeroModule$1$1$invokeSuspend$$inlined$map$1$2$1 cardSchemePresenter$toHeroModule$1$1$invokeSuspend$$inlined$map$1$2$1;
            int i22;
            CardSchemePresenter$toHeroModule$3$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 cardSchemePresenter$toHeroModule$3$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
            int i23;
            RealCardAppletTileRepository$installedModelFlow$$inlined$map$1$2$1 realCardAppletTileRepository$installedModelFlow$$inlined$map$1$2$1;
            int i24;
            WalletHomePresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1 walletHomePresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1;
            int i25;
            WalletHomePresenter$models$lambda$0$$inlined$map$1$2$1 walletHomePresenter$models$lambda$0$$inlined$map$1$2$1;
            int i26;
            CoreInteractiveCardKt$InteractiveCardEffect$12$1$invokeSuspend$$inlined$filter$1$2$1 coreInteractiveCardKt$InteractiveCardEffect$12$1$invokeSuspend$$inlined$filter$1$2$1;
            int i27;
            CoreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1$1$2$invokeSuspend$$inlined$filter$1$2$1 coreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1$1$2$invokeSuspend$$inlined$filter$1$2$1;
            int i28;
            CoreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1$invokeSuspend$$inlined$filter$1$2$1 coreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1$invokeSuspend$$inlined$filter$1$2$1;
            int i29;
            CoreInteractiveCardKt$InteractiveCardEffect$15$1$invokeSuspend$$inlined$filter$1$2$1 coreInteractiveCardKt$InteractiveCardEffect$15$1$invokeSuspend$$inlined$filter$1$2$1;
            int i30;
            int i31 = this.$r8$classId;
            r5 = 0;
            int i32 = 0;
            r5 = false;
            boolean z = false;
            FlowCollector flowCollector = this.$this_unsafeFlow;
            r10 = null;
            r10 = null;
            r10 = null;
            Object obj4 = null;
            switch (i31) {
                case 0:
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i33 = anonymousClass1.label;
                        if ((i33 & PKIFailureInfo.systemUnavail) != 0) {
                            anonymousClass1.label = i33 - PKIFailureInfo.systemUnavail;
                            Object obj5 = anonymousClass1.result;
                            Object obj6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                SafeTrace.throwOnFailure(obj5);
                                Object walletHomeScreen = ((BalanceSnapshot) obj) != null ? new WalletHomeScreen(7, (Integer) null, (String) null) : null;
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(walletHomeScreen, anonymousClass1) == obj6) {
                                    return obj6;
                                }
                            } else {
                                if (i != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj5);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj52 = anonymousClass1.result;
                    Object obj62 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                case 1:
                    if (continuation instanceof RealTapToPayRepository$getTapToPayDescriptionSuggestions$$inlined$map$1$2$1) {
                        realTapToPayRepository$getTapToPayDescriptionSuggestions$$inlined$map$1$2$1 = (RealTapToPayRepository$getTapToPayDescriptionSuggestions$$inlined$map$1$2$1) continuation;
                        int i34 = realTapToPayRepository$getTapToPayDescriptionSuggestions$$inlined$map$1$2$1.label;
                        if ((i34 & PKIFailureInfo.systemUnavail) != 0) {
                            realTapToPayRepository$getTapToPayDescriptionSuggestions$$inlined$map$1$2$1.label = i34 - PKIFailureInfo.systemUnavail;
                            Object obj7 = realTapToPayRepository$getTapToPayDescriptionSuggestions$$inlined$map$1$2$1.result;
                            Object obj8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i2 = realTapToPayRepository$getTapToPayDescriptionSuggestions$$inlined$map$1$2$1.label;
                            if (i2 != 0) {
                                SafeTrace.throwOnFailure(obj7);
                                TapToPayDescriptionSuggestions tapToPayDescriptionSuggestions = (TapToPayDescriptionSuggestions) obj;
                                Object obj9 = tapToPayDescriptionSuggestions != null ? tapToPayDescriptionSuggestions.payment_description_suggestions : null;
                                if (obj9 == null) {
                                    obj9 = EmptyList.INSTANCE;
                                }
                                realTapToPayRepository$getTapToPayDescriptionSuggestions$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(obj9, realTapToPayRepository$getTapToPayDescriptionSuggestions$$inlined$map$1$2$1) == obj8) {
                                    return obj8;
                                }
                            } else {
                                if (i2 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj7);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realTapToPayRepository$getTapToPayDescriptionSuggestions$$inlined$map$1$2$1 = new RealTapToPayRepository$getTapToPayDescriptionSuggestions$$inlined$map$1$2$1(this, continuation);
                    Object obj72 = realTapToPayRepository$getTapToPayDescriptionSuggestions$$inlined$map$1$2$1.result;
                    Object obj82 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = realTapToPayRepository$getTapToPayDescriptionSuggestions$$inlined$map$1$2$1.label;
                    if (i2 != 0) {
                    }
                    return Unit.INSTANCE;
                case 2:
                    if (continuation instanceof TaxWebAppBridge$4$invokeSuspend$$inlined$filter$1$2$1) {
                        taxWebAppBridge$4$invokeSuspend$$inlined$filter$1$2$1 = (TaxWebAppBridge$4$invokeSuspend$$inlined$filter$1$2$1) continuation;
                        int i35 = taxWebAppBridge$4$invokeSuspend$$inlined$filter$1$2$1.label;
                        if ((i35 & PKIFailureInfo.systemUnavail) != 0) {
                            taxWebAppBridge$4$invokeSuspend$$inlined$filter$1$2$1.label = i35 - PKIFailureInfo.systemUnavail;
                            Object obj10 = taxWebAppBridge$4$invokeSuspend$$inlined$filter$1$2$1.result;
                            Object obj11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i3 = taxWebAppBridge$4$invokeSuspend$$inlined$filter$1$2$1.label;
                            if (i3 != 0) {
                                SafeTrace.throwOnFailure(obj10);
                                int i36 = ((ActivityResult) obj).requestCode;
                                if (i36 == 7 || i36 == 8) {
                                    taxWebAppBridge$4$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, taxWebAppBridge$4$invokeSuspend$$inlined$filter$1$2$1) == obj11) {
                                        return obj11;
                                    }
                                }
                            } else {
                                if (i3 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj10);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    taxWebAppBridge$4$invokeSuspend$$inlined$filter$1$2$1 = new TaxWebAppBridge$4$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    Object obj102 = taxWebAppBridge$4$invokeSuspend$$inlined$filter$1$2$1.result;
                    Object obj112 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i3 = taxWebAppBridge$4$invokeSuspend$$inlined$filter$1$2$1.label;
                    if (i3 != 0) {
                    }
                    return Unit.INSTANCE;
                case 3:
                    if (continuation instanceof RealTransfersWithdrawManager$feeDataFromProfile$$inlined$map$1$2$1) {
                        realTransfersWithdrawManager$feeDataFromProfile$$inlined$map$1$2$1 = (RealTransfersWithdrawManager$feeDataFromProfile$$inlined$map$1$2$1) continuation;
                        int i37 = realTransfersWithdrawManager$feeDataFromProfile$$inlined$map$1$2$1.label;
                        if ((i37 & PKIFailureInfo.systemUnavail) != 0) {
                            realTransfersWithdrawManager$feeDataFromProfile$$inlined$map$1$2$1.label = i37 - PKIFailureInfo.systemUnavail;
                            Object obj12 = realTransfersWithdrawManager$feeDataFromProfile$$inlined$map$1$2$1.result;
                            Object obj13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i4 = realTransfersWithdrawManager$feeDataFromProfile$$inlined$map$1$2$1.label;
                            if (i4 != 0) {
                                SafeTrace.throwOnFailure(obj12);
                                DepositPreferenceData depositPreferenceData = ((P2pSettingsManager$P2pSettings) obj).depositPreferenceData;
                                if (depositPreferenceData != null && (list = depositPreferenceData.cash_out_options) != null) {
                                    Iterator it = list.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            obj2 = it.next();
                                            if (((DepositPreferenceOption) obj2).deposit_preference == DepositPreference.TRANSFER_INSTANTLY_WITH_FEE) {
                                            }
                                        } else {
                                            obj2 = null;
                                        }
                                    }
                                    DepositPreferenceOption depositPreferenceOption = (DepositPreferenceOption) obj2;
                                    if (depositPreferenceOption != null && (feeData = depositPreferenceOption.fee_data) != null) {
                                        Long l = feeData.fee_bps;
                                        if (l == null) {
                                            a$$ExternalSyntheticBUOutline0.m$3("feeBps must be non-null");
                                            return null;
                                        }
                                        long longValue = l.longValue();
                                        if (longValue < 0) {
                                            a$$ExternalSyntheticBUOutline0.m$3("feeBps must be non-negative");
                                            return null;
                                        }
                                        Long l2 = feeData.minimum_fee_cents;
                                        if (l2 == null) {
                                            a$$ExternalSyntheticBUOutline0.m$3("minimumFeeCents must be non-null");
                                            return null;
                                        }
                                        long longValue2 = l2.longValue();
                                        if (longValue2 < 0) {
                                            a$$ExternalSyntheticBUOutline0.m$3("minimumFeeCents must be non-negative");
                                            return null;
                                        }
                                        Long l3 = feeData.maximum_fee_cents;
                                        if (l3 == null) {
                                            a$$ExternalSyntheticBUOutline0.m$3("maximumFeeCents must be non-null");
                                            return null;
                                        }
                                        long longValue3 = l3.longValue();
                                        if (longValue3 <= 0) {
                                            a$$ExternalSyntheticBUOutline0.m$3("maximumFeeCents must be positive");
                                            return null;
                                        }
                                        TreeMap treeMap = new TreeMap(MapsKt__MapsJVMKt.mapOf(new Pair(0L, new TransfersWithdrawManager.FeeData.FeeStepTier(0L, longValue, longValue2, longValue3))));
                                        if (treeMap.isEmpty()) {
                                            a$$ExternalSyntheticBUOutline0.m$3("tiers must not be empty");
                                            return null;
                                        }
                                        obj4 = new TransfersWithdrawManager.FeeData(treeMap);
                                    }
                                }
                                realTransfersWithdrawManager$feeDataFromProfile$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(obj4, realTransfersWithdrawManager$feeDataFromProfile$$inlined$map$1$2$1) == obj13) {
                                    return obj13;
                                }
                            } else {
                                if (i4 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj12);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realTransfersWithdrawManager$feeDataFromProfile$$inlined$map$1$2$1 = new RealTransfersWithdrawManager$feeDataFromProfile$$inlined$map$1$2$1(this, continuation);
                    Object obj122 = realTransfersWithdrawManager$feeDataFromProfile$$inlined$map$1$2$1.result;
                    Object obj132 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i4 = realTransfersWithdrawManager$feeDataFromProfile$$inlined$map$1$2$1.label;
                    if (i4 != 0) {
                    }
                    return Unit.INSTANCE;
                case 4:
                    if (continuation instanceof BalanceBasedAutoReloadConfirmationPresenter$models$lambda$6$$inlined$map$1$2$1) {
                        balanceBasedAutoReloadConfirmationPresenter$models$lambda$6$$inlined$map$1$2$1 = (BalanceBasedAutoReloadConfirmationPresenter$models$lambda$6$$inlined$map$1$2$1) continuation;
                        int i38 = balanceBasedAutoReloadConfirmationPresenter$models$lambda$6$$inlined$map$1$2$1.label;
                        if ((i38 & PKIFailureInfo.systemUnavail) != 0) {
                            balanceBasedAutoReloadConfirmationPresenter$models$lambda$6$$inlined$map$1$2$1.label = i38 - PKIFailureInfo.systemUnavail;
                            Object obj14 = balanceBasedAutoReloadConfirmationPresenter$models$lambda$6$$inlined$map$1$2$1.result;
                            Object obj15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i5 = balanceBasedAutoReloadConfirmationPresenter$models$lambda$6$$inlined$map$1$2$1.label;
                            if (i5 != 0) {
                                SafeTrace.throwOnFailure(obj14);
                                Object obj16 = ((BalanceSnapshot) obj).balance;
                                balanceBasedAutoReloadConfirmationPresenter$models$lambda$6$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(obj16, balanceBasedAutoReloadConfirmationPresenter$models$lambda$6$$inlined$map$1$2$1) == obj15) {
                                    return obj15;
                                }
                            } else {
                                if (i5 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj14);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    balanceBasedAutoReloadConfirmationPresenter$models$lambda$6$$inlined$map$1$2$1 = new BalanceBasedAutoReloadConfirmationPresenter$models$lambda$6$$inlined$map$1$2$1(this, continuation);
                    Object obj142 = balanceBasedAutoReloadConfirmationPresenter$models$lambda$6$$inlined$map$1$2$1.result;
                    Object obj152 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i5 = balanceBasedAutoReloadConfirmationPresenter$models$lambda$6$$inlined$map$1$2$1.label;
                    if (i5 != 0) {
                    }
                    return Unit.INSTANCE;
                case 5:
                    if (continuation instanceof CashQrWidgetDataKt$cashQrWidgetDataFlow$1$1$1$invokeSuspend$$inlined$map$1$2$1) {
                        cashQrWidgetDataKt$cashQrWidgetDataFlow$1$1$1$invokeSuspend$$inlined$map$1$2$1 = (CashQrWidgetDataKt$cashQrWidgetDataFlow$1$1$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                        int i39 = cashQrWidgetDataKt$cashQrWidgetDataFlow$1$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                        if ((i39 & PKIFailureInfo.systemUnavail) != 0) {
                            cashQrWidgetDataKt$cashQrWidgetDataFlow$1$1$1$invokeSuspend$$inlined$map$1$2$1.label = i39 - PKIFailureInfo.systemUnavail;
                            Object obj17 = cashQrWidgetDataKt$cashQrWidgetDataFlow$1$1$1$invokeSuspend$$inlined$map$1$2$1.result;
                            Object obj18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i6 = cashQrWidgetDataKt$cashQrWidgetDataFlow$1$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                            if (i6 != 0) {
                                SafeTrace.throwOnFailure(obj17);
                                Object obj19 = ((PublicProfile) obj).fullCashtag;
                                cashQrWidgetDataKt$cashQrWidgetDataFlow$1$1$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(obj19, cashQrWidgetDataKt$cashQrWidgetDataFlow$1$1$1$invokeSuspend$$inlined$map$1$2$1) == obj18) {
                                    return obj18;
                                }
                            } else {
                                if (i6 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj17);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    cashQrWidgetDataKt$cashQrWidgetDataFlow$1$1$1$invokeSuspend$$inlined$map$1$2$1 = new CashQrWidgetDataKt$cashQrWidgetDataFlow$1$1$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    Object obj172 = cashQrWidgetDataKt$cashQrWidgetDataFlow$1$1$1$invokeSuspend$$inlined$map$1$2$1.result;
                    Object obj182 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i6 = cashQrWidgetDataKt$cashQrWidgetDataFlow$1$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                    if (i6 != 0) {
                    }
                    return Unit.INSTANCE;
                case 6:
                    if (continuation instanceof QrWidgetRefreshApplicationWorker$work$2$1$1$2$invokeSuspend$$inlined$map$1$2$1) {
                        qrWidgetRefreshApplicationWorker$work$2$1$1$2$invokeSuspend$$inlined$map$1$2$1 = (QrWidgetRefreshApplicationWorker$work$2$1$1$2$invokeSuspend$$inlined$map$1$2$1) continuation;
                        int i40 = qrWidgetRefreshApplicationWorker$work$2$1$1$2$invokeSuspend$$inlined$map$1$2$1.label;
                        if ((i40 & PKIFailureInfo.systemUnavail) != 0) {
                            qrWidgetRefreshApplicationWorker$work$2$1$1$2$invokeSuspend$$inlined$map$1$2$1.label = i40 - PKIFailureInfo.systemUnavail;
                            Object obj20 = qrWidgetRefreshApplicationWorker$work$2$1$1$2$invokeSuspend$$inlined$map$1$2$1.result;
                            Object obj21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i7 = qrWidgetRefreshApplicationWorker$work$2$1$1$2$invokeSuspend$$inlined$map$1$2$1.label;
                            if (i7 != 0) {
                                SafeTrace.throwOnFailure(obj20);
                                FullCashtag fullCashtag = ((PublicProfile) obj).fullCashtag;
                                Object obj22 = fullCashtag != null ? fullCashtag.cashtag_qr_image_url : null;
                                qrWidgetRefreshApplicationWorker$work$2$1$1$2$invokeSuspend$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(obj22, qrWidgetRefreshApplicationWorker$work$2$1$1$2$invokeSuspend$$inlined$map$1$2$1) == obj21) {
                                    return obj21;
                                }
                            } else {
                                if (i7 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj20);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    qrWidgetRefreshApplicationWorker$work$2$1$1$2$invokeSuspend$$inlined$map$1$2$1 = new QrWidgetRefreshApplicationWorker$work$2$1$1$2$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    Object obj202 = qrWidgetRefreshApplicationWorker$work$2$1$1$2$invokeSuspend$$inlined$map$1$2$1.result;
                    Object obj212 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i7 = qrWidgetRefreshApplicationWorker$work$2$1$1$2$invokeSuspend$$inlined$map$1$2$1.label;
                    if (i7 != 0) {
                    }
                    return Unit.INSTANCE;
                case 7:
                    if (continuation instanceof RealCashAppTagManager$getAllCashAppTags$$inlined$map$1$2$1) {
                        realCashAppTagManager$getAllCashAppTags$$inlined$map$1$2$1 = (RealCashAppTagManager$getAllCashAppTags$$inlined$map$1$2$1) continuation;
                        int i41 = realCashAppTagManager$getAllCashAppTags$$inlined$map$1$2$1.label;
                        if ((i41 & PKIFailureInfo.systemUnavail) != 0) {
                            realCashAppTagManager$getAllCashAppTags$$inlined$map$1$2$1.label = i41 - PKIFailureInfo.systemUnavail;
                            Object obj23 = realCashAppTagManager$getAllCashAppTags$$inlined$map$1$2$1.result;
                            Object obj24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i8 = realCashAppTagManager$getAllCashAppTags$$inlined$map$1$2$1.label;
                            if (i8 != 0) {
                                SafeTrace.throwOnFailure(obj23);
                                Object firstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) obj);
                                realCashAppTagManager$getAllCashAppTags$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(firstOrNull, realCashAppTagManager$getAllCashAppTags$$inlined$map$1$2$1) == obj24) {
                                    return obj24;
                                }
                            } else {
                                if (i8 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj23);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realCashAppTagManager$getAllCashAppTags$$inlined$map$1$2$1 = new RealCashAppTagManager$getAllCashAppTags$$inlined$map$1$2$1(this, continuation);
                    Object obj232 = realCashAppTagManager$getAllCashAppTags$$inlined$map$1$2$1.result;
                    Object obj242 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i8 = realCashAppTagManager$getAllCashAppTags$$inlined$map$1$2$1.label;
                    if (i8 != 0) {
                    }
                    return Unit.INSTANCE;
                case 8:
                    if (continuation instanceof RealCashAppTagManager$getAllCashAppTags$$inlined$map$2$2$1) {
                        realCashAppTagManager$getAllCashAppTags$$inlined$map$2$2$1 = (RealCashAppTagManager$getAllCashAppTags$$inlined$map$2$2$1) continuation;
                        int i42 = realCashAppTagManager$getAllCashAppTags$$inlined$map$2$2$1.label;
                        if ((i42 & PKIFailureInfo.systemUnavail) != 0) {
                            realCashAppTagManager$getAllCashAppTags$$inlined$map$2$2$1.label = i42 - PKIFailureInfo.systemUnavail;
                            Object obj25 = realCashAppTagManager$getAllCashAppTags$$inlined$map$2$2$1.result;
                            Object obj26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i9 = realCashAppTagManager$getAllCashAppTags$$inlined$map$2$2$1.label;
                            if (i9 != 0) {
                                SafeTrace.throwOnFailure(obj25);
                                Object firstOrNull2 = CollectionsKt.firstOrNull((List<? extends Object>) obj);
                                realCashAppTagManager$getAllCashAppTags$$inlined$map$2$2$1.label = 1;
                                if (flowCollector.emit(firstOrNull2, realCashAppTagManager$getAllCashAppTags$$inlined$map$2$2$1) == obj26) {
                                    return obj26;
                                }
                            } else {
                                if (i9 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj25);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realCashAppTagManager$getAllCashAppTags$$inlined$map$2$2$1 = new RealCashAppTagManager$getAllCashAppTags$$inlined$map$2$2$1(this, continuation);
                    Object obj252 = realCashAppTagManager$getAllCashAppTags$$inlined$map$2$2$1.result;
                    Object obj262 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i9 = realCashAppTagManager$getAllCashAppTags$$inlined$map$2$2$1.label;
                    if (i9 != 0) {
                    }
                    return Unit.INSTANCE;
                case 9:
                    if (continuation instanceof RealCashAppTagManager$getShowTagActivation$$inlined$map$1$2$1) {
                        realCashAppTagManager$getShowTagActivation$$inlined$map$1$2$1 = (RealCashAppTagManager$getShowTagActivation$$inlined$map$1$2$1) continuation;
                        int i43 = realCashAppTagManager$getShowTagActivation$$inlined$map$1$2$1.label;
                        if ((i43 & PKIFailureInfo.systemUnavail) != 0) {
                            realCashAppTagManager$getShowTagActivation$$inlined$map$1$2$1.label = i43 - PKIFailureInfo.systemUnavail;
                            Object obj27 = realCashAppTagManager$getShowTagActivation$$inlined$map$1$2$1.result;
                            Object obj28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = realCashAppTagManager$getShowTagActivation$$inlined$map$1$2$1.label;
                            if (i10 != 0) {
                                SafeTrace.throwOnFailure(obj27);
                                CashAppTag cashAppTag = (CashAppTag) CollectionsKt.firstOrNull((List) obj);
                                Object valueOf = Boolean.valueOf(cashAppTag != null ? Intrinsics.areEqual(cashAppTag.show_tag_activation, Boolean.TRUE) : false);
                                realCashAppTagManager$getShowTagActivation$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(valueOf, realCashAppTagManager$getShowTagActivation$$inlined$map$1$2$1) == obj28) {
                                    return obj28;
                                }
                            } else {
                                if (i10 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj27);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realCashAppTagManager$getShowTagActivation$$inlined$map$1$2$1 = new RealCashAppTagManager$getShowTagActivation$$inlined$map$1$2$1(this, continuation);
                    Object obj272 = realCashAppTagManager$getShowTagActivation$$inlined$map$1$2$1.result;
                    Object obj282 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = realCashAppTagManager$getShowTagActivation$$inlined$map$1$2$1.label;
                    if (i10 != 0) {
                    }
                    return Unit.INSTANCE;
                case 10:
                    if (continuation instanceof RealCashAppTagManager$getShowTagSupport$$inlined$map$1$2$1) {
                        realCashAppTagManager$getShowTagSupport$$inlined$map$1$2$1 = (RealCashAppTagManager$getShowTagSupport$$inlined$map$1$2$1) continuation;
                        int i44 = realCashAppTagManager$getShowTagSupport$$inlined$map$1$2$1.label;
                        if ((i44 & PKIFailureInfo.systemUnavail) != 0) {
                            realCashAppTagManager$getShowTagSupport$$inlined$map$1$2$1.label = i44 - PKIFailureInfo.systemUnavail;
                            Object obj29 = realCashAppTagManager$getShowTagSupport$$inlined$map$1$2$1.result;
                            Object obj30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i11 = realCashAppTagManager$getShowTagSupport$$inlined$map$1$2$1.label;
                            if (i11 != 0) {
                                SafeTrace.throwOnFailure(obj29);
                                CashAppTag cashAppTag2 = (CashAppTag) CollectionsKt.firstOrNull((List) obj);
                                Object valueOf2 = Boolean.valueOf(cashAppTag2 != null ? Intrinsics.areEqual(cashAppTag2.show_tag_support, Boolean.TRUE) : false);
                                realCashAppTagManager$getShowTagSupport$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(valueOf2, realCashAppTagManager$getShowTagSupport$$inlined$map$1$2$1) == obj30) {
                                    return obj30;
                                }
                            } else {
                                if (i11 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj29);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realCashAppTagManager$getShowTagSupport$$inlined$map$1$2$1 = new RealCashAppTagManager$getShowTagSupport$$inlined$map$1$2$1(this, continuation);
                    Object obj292 = realCashAppTagManager$getShowTagSupport$$inlined$map$1$2$1.result;
                    Object obj302 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i11 = realCashAppTagManager$getShowTagSupport$$inlined$map$1$2$1.label;
                    if (i11 != 0) {
                    }
                    return Unit.INSTANCE;
                case 11:
                    if (continuation instanceof RealIssuedCardManager$getIssuedCardState$$inlined$map$1$2$1) {
                        realIssuedCardManager$getIssuedCardState$$inlined$map$1$2$1 = (RealIssuedCardManager$getIssuedCardState$$inlined$map$1$2$1) continuation;
                        int i45 = realIssuedCardManager$getIssuedCardState$$inlined$map$1$2$1.label;
                        if ((i45 & PKIFailureInfo.systemUnavail) != 0) {
                            realIssuedCardManager$getIssuedCardState$$inlined$map$1$2$1.label = i45 - PKIFailureInfo.systemUnavail;
                            Object obj31 = realIssuedCardManager$getIssuedCardState$$inlined$map$1$2$1.result;
                            Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i12 = realIssuedCardManager$getIssuedCardState$$inlined$map$1$2$1.label;
                            if (i12 != 0) {
                                SafeTrace.throwOnFailure(obj31);
                                IssuedCardFactory.IssuedCard issuedCard = (IssuedCardFactory.IssuedCard) obj;
                                CashAppCard.PhysicalCardOrderState physicalCardOrderState = issuedCard != null ? issuedCard.physicalCardOrderState : null;
                                int i46 = physicalCardOrderState == null ? -1 : RealIssuedCardManager.WhenMappings.$EnumSwitchMapping$0[physicalCardOrderState.ordinal()];
                                if (i46 == -1 || i46 == 1) {
                                    obj3 = CashAppCard.PhysicalCardOrderState.NO_CARD;
                                } else {
                                    obj3 = issuedCard.physicalCardOrderState;
                                    obj3.getClass();
                                }
                                realIssuedCardManager$getIssuedCardState$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(obj3, realIssuedCardManager$getIssuedCardState$$inlined$map$1$2$1) == obj32) {
                                    return obj32;
                                }
                            } else {
                                if (i12 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj31);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realIssuedCardManager$getIssuedCardState$$inlined$map$1$2$1 = new RealIssuedCardManager$getIssuedCardState$$inlined$map$1$2$1(this, continuation);
                    Object obj312 = realIssuedCardManager$getIssuedCardState$$inlined$map$1$2$1.result;
                    Object obj322 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i12 = realIssuedCardManager$getIssuedCardState$$inlined$map$1$2$1.label;
                    if (i12 != 0) {
                    }
                    return Unit.INSTANCE;
                case 12:
                    if (continuation instanceof RealIssuedCardManager$hasActiveIssuedCard$$inlined$map$1$2$1) {
                        realIssuedCardManager$hasActiveIssuedCard$$inlined$map$1$2$1 = (RealIssuedCardManager$hasActiveIssuedCard$$inlined$map$1$2$1) continuation;
                        int i47 = realIssuedCardManager$hasActiveIssuedCard$$inlined$map$1$2$1.label;
                        if ((i47 & PKIFailureInfo.systemUnavail) != 0) {
                            realIssuedCardManager$hasActiveIssuedCard$$inlined$map$1$2$1.label = i47 - PKIFailureInfo.systemUnavail;
                            Object obj33 = realIssuedCardManager$hasActiveIssuedCard$$inlined$map$1$2$1.result;
                            Object obj34 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i13 = realIssuedCardManager$hasActiveIssuedCard$$inlined$map$1$2$1.label;
                            if (i13 != 0) {
                                SafeTrace.throwOnFailure(obj33);
                                IssuedCardFactory.IssuedCard issuedCard2 = (IssuedCardFactory.IssuedCard) obj;
                                if (issuedCard2 != null && issuedCard2.activated) {
                                    z = true;
                                }
                                Object valueOf3 = Boolean.valueOf(z);
                                realIssuedCardManager$hasActiveIssuedCard$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(valueOf3, realIssuedCardManager$hasActiveIssuedCard$$inlined$map$1$2$1) == obj34) {
                                    return obj34;
                                }
                            } else {
                                if (i13 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj33);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realIssuedCardManager$hasActiveIssuedCard$$inlined$map$1$2$1 = new RealIssuedCardManager$hasActiveIssuedCard$$inlined$map$1$2$1(this, continuation);
                    Object obj332 = realIssuedCardManager$hasActiveIssuedCard$$inlined$map$1$2$1.result;
                    Object obj342 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i13 = realIssuedCardManager$hasActiveIssuedCard$$inlined$map$1$2$1.label;
                    if (i13 != 0) {
                    }
                    return Unit.INSTANCE;
                case 13:
                    if (continuation instanceof CardSchemePresenter$models$10$1$invokeSuspend$$inlined$map$1$2$1) {
                        cardSchemePresenter$models$10$1$invokeSuspend$$inlined$map$1$2$1 = (CardSchemePresenter$models$10$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                        int i48 = cardSchemePresenter$models$10$1$invokeSuspend$$inlined$map$1$2$1.label;
                        if ((i48 & PKIFailureInfo.systemUnavail) != 0) {
                            cardSchemePresenter$models$10$1$invokeSuspend$$inlined$map$1$2$1.label = i48 - PKIFailureInfo.systemUnavail;
                            Object obj35 = cardSchemePresenter$models$10$1$invokeSuspend$$inlined$map$1$2$1.result;
                            Object obj36 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i14 = cardSchemePresenter$models$10$1$invokeSuspend$$inlined$map$1$2$1.label;
                            if (i14 != 0) {
                                SafeTrace.throwOnFailure(obj35);
                                IssuedCardFactory.IssuedCard issuedCard3 = (IssuedCardFactory.IssuedCard) obj;
                                Object valueOf4 = issuedCard3 != null ? Boolean.valueOf(issuedCard3.enabled) : null;
                                cardSchemePresenter$models$10$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(valueOf4, cardSchemePresenter$models$10$1$invokeSuspend$$inlined$map$1$2$1) == obj36) {
                                    return obj36;
                                }
                            } else {
                                if (i14 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj35);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    cardSchemePresenter$models$10$1$invokeSuspend$$inlined$map$1$2$1 = new CardSchemePresenter$models$10$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    Object obj352 = cardSchemePresenter$models$10$1$invokeSuspend$$inlined$map$1$2$1.result;
                    Object obj362 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i14 = cardSchemePresenter$models$10$1$invokeSuspend$$inlined$map$1$2$1.label;
                    if (i14 != 0) {
                    }
                    return Unit.INSTANCE;
                case 14:
                    if (continuation instanceof CardSchemePresenter$models$6$1$invokeSuspend$$inlined$map$1$2$1) {
                        cardSchemePresenter$models$6$1$invokeSuspend$$inlined$map$1$2$1 = (CardSchemePresenter$models$6$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                        int i49 = cardSchemePresenter$models$6$1$invokeSuspend$$inlined$map$1$2$1.label;
                        if ((i49 & PKIFailureInfo.systemUnavail) != 0) {
                            cardSchemePresenter$models$6$1$invokeSuspend$$inlined$map$1$2$1.label = i49 - PKIFailureInfo.systemUnavail;
                            Object obj37 = cardSchemePresenter$models$6$1$invokeSuspend$$inlined$map$1$2$1.result;
                            Object obj38 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i15 = cardSchemePresenter$models$6$1$invokeSuspend$$inlined$map$1$2$1.label;
                            if (i15 != 0) {
                                SafeTrace.throwOnFailure(obj37);
                                List list2 = (List) obj;
                                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                    Iterator it2 = list2.iterator();
                                    while (it2.hasNext()) {
                                        String str = ((com.squareup.cash.wallet.data.CashAppTag) it2.next()).tagThemeToken;
                                        if (str != null && str.length() != 0 && (i32 = i32 + 1) < 0) {
                                            CollectionsKt__CollectionsKt.throwCountOverflow();
                                            throw null;
                                        }
                                    }
                                }
                                Object num = new Integer(i32);
                                cardSchemePresenter$models$6$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(num, cardSchemePresenter$models$6$1$invokeSuspend$$inlined$map$1$2$1) == obj38) {
                                    return obj38;
                                }
                            } else {
                                if (i15 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj37);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    cardSchemePresenter$models$6$1$invokeSuspend$$inlined$map$1$2$1 = new CardSchemePresenter$models$6$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    Object obj372 = cardSchemePresenter$models$6$1$invokeSuspend$$inlined$map$1$2$1.result;
                    Object obj382 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i15 = cardSchemePresenter$models$6$1$invokeSuspend$$inlined$map$1$2$1.label;
                    if (i15 != 0) {
                    }
                    return Unit.INSTANCE;
                case 15:
                    if (continuation instanceof CardSchemePresenter$models$8$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) {
                        cardSchemePresenter$models$8$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = (CardSchemePresenter$models$8$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) continuation;
                        int i50 = cardSchemePresenter$models$8$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                        if ((i50 & PKIFailureInfo.systemUnavail) != 0) {
                            cardSchemePresenter$models$8$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = i50 - PKIFailureInfo.systemUnavail;
                            Object obj39 = cardSchemePresenter$models$8$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                            Object obj40 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i16 = cardSchemePresenter$models$8$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                            if (i16 != 0) {
                                SafeTrace.throwOnFailure(obj39);
                                if (obj instanceof PresenterEvents.NewTagPeekConsumed) {
                                    cardSchemePresenter$models$8$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, cardSchemePresenter$models$8$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) == obj40) {
                                        return obj40;
                                    }
                                }
                            } else {
                                if (i16 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj39);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    cardSchemePresenter$models$8$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = new CardSchemePresenter$models$8$1$invokeSuspend$$inlined$filterIsInstance$1$2$1(this, continuation);
                    Object obj392 = cardSchemePresenter$models$8$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                    Object obj402 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i16 = cardSchemePresenter$models$8$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                    if (i16 != 0) {
                    }
                    return Unit.INSTANCE;
                case 16:
                    if (continuation instanceof CardSchemePresenter$models$9$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) {
                        cardSchemePresenter$models$9$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = (CardSchemePresenter$models$9$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) continuation;
                        int i51 = cardSchemePresenter$models$9$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                        if ((i51 & PKIFailureInfo.systemUnavail) != 0) {
                            cardSchemePresenter$models$9$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = i51 - PKIFailureInfo.systemUnavail;
                            Object obj41 = cardSchemePresenter$models$9$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                            Object obj42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i17 = cardSchemePresenter$models$9$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                            if (i17 != 0) {
                                SafeTrace.throwOnFailure(obj41);
                                if (obj instanceof PresenterEvents.PageChanged) {
                                    cardSchemePresenter$models$9$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, cardSchemePresenter$models$9$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) == obj42) {
                                        return obj42;
                                    }
                                }
                            } else {
                                if (i17 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj41);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    cardSchemePresenter$models$9$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = new CardSchemePresenter$models$9$1$invokeSuspend$$inlined$filterIsInstance$1$2$1(this, continuation);
                    Object obj412 = cardSchemePresenter$models$9$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                    Object obj422 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i17 = cardSchemePresenter$models$9$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                    if (i17 != 0) {
                    }
                    return Unit.INSTANCE;
                case 17:
                    if (continuation instanceof CardSchemePresenter$toCardUpsellModule$1$content$2$1$invokeSuspend$$inlined$map$1$2$1) {
                        cardSchemePresenter$toCardUpsellModule$1$content$2$1$invokeSuspend$$inlined$map$1$2$1 = (CardSchemePresenter$toCardUpsellModule$1$content$2$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                        int i52 = cardSchemePresenter$toCardUpsellModule$1$content$2$1$invokeSuspend$$inlined$map$1$2$1.label;
                        if ((i52 & PKIFailureInfo.systemUnavail) != 0) {
                            cardSchemePresenter$toCardUpsellModule$1$content$2$1$invokeSuspend$$inlined$map$1$2$1.label = i52 - PKIFailureInfo.systemUnavail;
                            Object obj43 = cardSchemePresenter$toCardUpsellModule$1$content$2$1$invokeSuspend$$inlined$map$1$2$1.result;
                            Object obj44 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i18 = cardSchemePresenter$toCardUpsellModule$1$content$2$1$invokeSuspend$$inlined$map$1$2$1.label;
                            if (i18 != 0) {
                                SafeTrace.throwOnFailure(obj43);
                                CardThemeDefinitions cardThemeDefinitions = (CardThemeDefinitions) CollectionsKt.firstOrNull((List) obj);
                                Object obj45 = cardThemeDefinitions != null ? cardThemeDefinitions.card_theme_definitions : null;
                                cardSchemePresenter$toCardUpsellModule$1$content$2$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(obj45, cardSchemePresenter$toCardUpsellModule$1$content$2$1$invokeSuspend$$inlined$map$1$2$1) == obj44) {
                                    return obj44;
                                }
                            } else {
                                if (i18 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj43);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    cardSchemePresenter$toCardUpsellModule$1$content$2$1$invokeSuspend$$inlined$map$1$2$1 = new CardSchemePresenter$toCardUpsellModule$1$content$2$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    Object obj432 = cardSchemePresenter$toCardUpsellModule$1$content$2$1$invokeSuspend$$inlined$map$1$2$1.result;
                    Object obj442 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i18 = cardSchemePresenter$toCardUpsellModule$1$content$2$1$invokeSuspend$$inlined$map$1$2$1.label;
                    if (i18 != 0) {
                    }
                    return Unit.INSTANCE;
                case 18:
                    if (continuation instanceof CardSchemePresenter$toCardUpsellModule$lambda$2$$inlined$filterIsInstance$1$2$1) {
                        cardSchemePresenter$toCardUpsellModule$lambda$2$$inlined$filterIsInstance$1$2$1 = (CardSchemePresenter$toCardUpsellModule$lambda$2$$inlined$filterIsInstance$1$2$1) continuation;
                        int i53 = cardSchemePresenter$toCardUpsellModule$lambda$2$$inlined$filterIsInstance$1$2$1.label;
                        if ((i53 & PKIFailureInfo.systemUnavail) != 0) {
                            cardSchemePresenter$toCardUpsellModule$lambda$2$$inlined$filterIsInstance$1$2$1.label = i53 - PKIFailureInfo.systemUnavail;
                            Object obj46 = cardSchemePresenter$toCardUpsellModule$lambda$2$$inlined$filterIsInstance$1$2$1.result;
                            Object obj47 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i19 = cardSchemePresenter$toCardUpsellModule$lambda$2$$inlined$filterIsInstance$1$2$1.label;
                            if (i19 != 0) {
                                SafeTrace.throwOnFailure(obj46);
                                if (obj instanceof PresenterEvents.CarouselEvents) {
                                    cardSchemePresenter$toCardUpsellModule$lambda$2$$inlined$filterIsInstance$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, cardSchemePresenter$toCardUpsellModule$lambda$2$$inlined$filterIsInstance$1$2$1) == obj47) {
                                        return obj47;
                                    }
                                }
                            } else {
                                if (i19 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj46);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    cardSchemePresenter$toCardUpsellModule$lambda$2$$inlined$filterIsInstance$1$2$1 = new CardSchemePresenter$toCardUpsellModule$lambda$2$$inlined$filterIsInstance$1$2$1(this, continuation);
                    Object obj462 = cardSchemePresenter$toCardUpsellModule$lambda$2$$inlined$filterIsInstance$1$2$1.result;
                    Object obj472 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i19 = cardSchemePresenter$toCardUpsellModule$lambda$2$$inlined$filterIsInstance$1$2$1.label;
                    if (i19 != 0) {
                    }
                    return Unit.INSTANCE;
                case 19:
                    if (continuation instanceof CardSchemePresenter$toCardUpsellModule$lambda$2$$inlined$map$1$2$1) {
                        cardSchemePresenter$toCardUpsellModule$lambda$2$$inlined$map$1$2$1 = (CardSchemePresenter$toCardUpsellModule$lambda$2$$inlined$map$1$2$1) continuation;
                        int i54 = cardSchemePresenter$toCardUpsellModule$lambda$2$$inlined$map$1$2$1.label;
                        if ((i54 & PKIFailureInfo.systemUnavail) != 0) {
                            cardSchemePresenter$toCardUpsellModule$lambda$2$$inlined$map$1$2$1.label = i54 - PKIFailureInfo.systemUnavail;
                            Object obj48 = cardSchemePresenter$toCardUpsellModule$lambda$2$$inlined$map$1$2$1.result;
                            Object obj49 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i20 = cardSchemePresenter$toCardUpsellModule$lambda$2$$inlined$map$1$2$1.label;
                            if (i20 != 0) {
                                SafeTrace.throwOnFailure(obj48);
                                Object obj50 = ((PresenterEvents.CarouselEvents) obj).carouselViewEvent;
                                cardSchemePresenter$toCardUpsellModule$lambda$2$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(obj50, cardSchemePresenter$toCardUpsellModule$lambda$2$$inlined$map$1$2$1) == obj49) {
                                    return obj49;
                                }
                            } else {
                                if (i20 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj48);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    cardSchemePresenter$toCardUpsellModule$lambda$2$$inlined$map$1$2$1 = new CardSchemePresenter$toCardUpsellModule$lambda$2$$inlined$map$1$2$1(this, continuation);
                    Object obj482 = cardSchemePresenter$toCardUpsellModule$lambda$2$$inlined$map$1$2$1.result;
                    Object obj492 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i20 = cardSchemePresenter$toCardUpsellModule$lambda$2$$inlined$map$1$2$1.label;
                    if (i20 != 0) {
                    }
                    return Unit.INSTANCE;
                case 20:
                    if (continuation instanceof CardSchemePresenter$toHeroModule$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) {
                        cardSchemePresenter$toHeroModule$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = (CardSchemePresenter$toHeroModule$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) continuation;
                        int i55 = cardSchemePresenter$toHeroModule$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                        if ((i55 & PKIFailureInfo.systemUnavail) != 0) {
                            cardSchemePresenter$toHeroModule$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = i55 - PKIFailureInfo.systemUnavail;
                            Object obj51 = cardSchemePresenter$toHeroModule$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                            Object obj53 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i21 = cardSchemePresenter$toHeroModule$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                            if (i21 != 0) {
                                SafeTrace.throwOnFailure(obj51);
                                if (obj instanceof PresenterEvents.ExecutingScenario) {
                                    cardSchemePresenter$toHeroModule$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, cardSchemePresenter$toHeroModule$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) == obj53) {
                                        return obj53;
                                    }
                                }
                            } else {
                                if (i21 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj51);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    cardSchemePresenter$toHeroModule$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = new CardSchemePresenter$toHeroModule$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1(this, continuation);
                    Object obj512 = cardSchemePresenter$toHeroModule$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                    Object obj532 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i21 = cardSchemePresenter$toHeroModule$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                    if (i21 != 0) {
                    }
                    return Unit.INSTANCE;
                case 21:
                    if (continuation instanceof CardSchemePresenter$toHeroModule$1$1$invokeSuspend$$inlined$map$1$2$1) {
                        cardSchemePresenter$toHeroModule$1$1$invokeSuspend$$inlined$map$1$2$1 = (CardSchemePresenter$toHeroModule$1$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                        int i56 = cardSchemePresenter$toHeroModule$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                        if ((i56 & PKIFailureInfo.systemUnavail) != 0) {
                            cardSchemePresenter$toHeroModule$1$1$invokeSuspend$$inlined$map$1$2$1.label = i56 - PKIFailureInfo.systemUnavail;
                            Object obj54 = cardSchemePresenter$toHeroModule$1$1$invokeSuspend$$inlined$map$1$2$1.result;
                            Object obj55 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i22 = cardSchemePresenter$toHeroModule$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                            if (i22 != 0) {
                                SafeTrace.throwOnFailure(obj54);
                                Object valueOf5 = Boolean.valueOf(((PresenterEvents.ExecutingScenario) obj).inProgress);
                                cardSchemePresenter$toHeroModule$1$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(valueOf5, cardSchemePresenter$toHeroModule$1$1$invokeSuspend$$inlined$map$1$2$1) == obj55) {
                                    return obj55;
                                }
                            } else {
                                if (i22 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj54);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    cardSchemePresenter$toHeroModule$1$1$invokeSuspend$$inlined$map$1$2$1 = new CardSchemePresenter$toHeroModule$1$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    Object obj542 = cardSchemePresenter$toHeroModule$1$1$invokeSuspend$$inlined$map$1$2$1.result;
                    Object obj552 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i22 = cardSchemePresenter$toHeroModule$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                    if (i22 != 0) {
                    }
                    return Unit.INSTANCE;
                case 22:
                    if (continuation instanceof CardSchemePresenter$toHeroModule$3$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) {
                        cardSchemePresenter$toHeroModule$3$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = (CardSchemePresenter$toHeroModule$3$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) continuation;
                        int i57 = cardSchemePresenter$toHeroModule$3$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                        if ((i57 & PKIFailureInfo.systemUnavail) != 0) {
                            cardSchemePresenter$toHeroModule$3$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = i57 - PKIFailureInfo.systemUnavail;
                            Object obj56 = cardSchemePresenter$toHeroModule$3$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                            Object obj57 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i23 = cardSchemePresenter$toHeroModule$3$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                            if (i23 != 0) {
                                SafeTrace.throwOnFailure(obj56);
                                if (obj instanceof PresenterEvents.ExecuteCopy) {
                                    cardSchemePresenter$toHeroModule$3$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, cardSchemePresenter$toHeroModule$3$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) == obj57) {
                                        return obj57;
                                    }
                                }
                            } else {
                                if (i23 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj56);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    cardSchemePresenter$toHeroModule$3$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = new CardSchemePresenter$toHeroModule$3$1$invokeSuspend$$inlined$filterIsInstance$1$2$1(this, continuation);
                    Object obj562 = cardSchemePresenter$toHeroModule$3$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                    Object obj572 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i23 = cardSchemePresenter$toHeroModule$3$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                    if (i23 != 0) {
                    }
                    return Unit.INSTANCE;
                case 23:
                    if (continuation instanceof RealCardAppletTileRepository$installedModelFlow$$inlined$map$1$2$1) {
                        realCardAppletTileRepository$installedModelFlow$$inlined$map$1$2$1 = (RealCardAppletTileRepository$installedModelFlow$$inlined$map$1$2$1) continuation;
                        int i58 = realCardAppletTileRepository$installedModelFlow$$inlined$map$1$2$1.label;
                        if ((i58 & PKIFailureInfo.systemUnavail) != 0) {
                            realCardAppletTileRepository$installedModelFlow$$inlined$map$1$2$1.label = i58 - PKIFailureInfo.systemUnavail;
                            Object obj58 = realCardAppletTileRepository$installedModelFlow$$inlined$map$1$2$1.result;
                            Object obj59 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i24 = realCardAppletTileRepository$installedModelFlow$$inlined$map$1$2$1.label;
                            if (i24 != 0) {
                                SafeTrace.throwOnFailure(obj58);
                                FullCashtag fullCashtag2 = ((PublicProfile) obj).fullCashtag;
                                Object cashtagWithCurrencySymbol = fullCashtag2 != null ? FillrWidget.WidgetType.AnonymousClass1.cashtagWithCurrencySymbol(fullCashtag2) : null;
                                if (cashtagWithCurrencySymbol == null) {
                                    cashtagWithCurrencySymbol = "";
                                }
                                realCardAppletTileRepository$installedModelFlow$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(cashtagWithCurrencySymbol, realCardAppletTileRepository$installedModelFlow$$inlined$map$1$2$1) == obj59) {
                                    return obj59;
                                }
                            } else {
                                if (i24 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj58);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realCardAppletTileRepository$installedModelFlow$$inlined$map$1$2$1 = new RealCardAppletTileRepository$installedModelFlow$$inlined$map$1$2$1(this, continuation);
                    Object obj582 = realCardAppletTileRepository$installedModelFlow$$inlined$map$1$2$1.result;
                    Object obj592 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i24 = realCardAppletTileRepository$installedModelFlow$$inlined$map$1$2$1.label;
                    if (i24 != 0) {
                    }
                    return Unit.INSTANCE;
                case 24:
                    if (continuation instanceof WalletHomePresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1) {
                        walletHomePresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1 = (WalletHomePresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1) continuation;
                        int i59 = walletHomePresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.label;
                        if ((i59 & PKIFailureInfo.systemUnavail) != 0) {
                            walletHomePresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.label = i59 - PKIFailureInfo.systemUnavail;
                            Object obj60 = walletHomePresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.result;
                            Object obj61 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i25 = walletHomePresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.label;
                            if (i25 != 0) {
                                SafeTrace.throwOnFailure(obj60);
                                if (obj instanceof WalletHomeViewEvent.TabToolbarEvent) {
                                    walletHomePresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, walletHomePresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1) == obj61) {
                                        return obj61;
                                    }
                                }
                            } else {
                                if (i25 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj60);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    walletHomePresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1 = new WalletHomePresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1(this, continuation);
                    Object obj602 = walletHomePresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.result;
                    Object obj612 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i25 = walletHomePresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.label;
                    if (i25 != 0) {
                    }
                    return Unit.INSTANCE;
                case 25:
                    if (continuation instanceof WalletHomePresenter$models$lambda$0$$inlined$map$1$2$1) {
                        walletHomePresenter$models$lambda$0$$inlined$map$1$2$1 = (WalletHomePresenter$models$lambda$0$$inlined$map$1$2$1) continuation;
                        int i60 = walletHomePresenter$models$lambda$0$$inlined$map$1$2$1.label;
                        if ((i60 & PKIFailureInfo.systemUnavail) != 0) {
                            walletHomePresenter$models$lambda$0$$inlined$map$1$2$1.label = i60 - PKIFailureInfo.systemUnavail;
                            Object obj63 = walletHomePresenter$models$lambda$0$$inlined$map$1$2$1.result;
                            Object obj64 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i26 = walletHomePresenter$models$lambda$0$$inlined$map$1$2$1.label;
                            if (i26 != 0) {
                                SafeTrace.throwOnFailure(obj63);
                                Object obj65 = ((WalletHomeViewEvent.TabToolbarEvent) obj).event;
                                walletHomePresenter$models$lambda$0$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(obj65, walletHomePresenter$models$lambda$0$$inlined$map$1$2$1) == obj64) {
                                    return obj64;
                                }
                            } else {
                                if (i26 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj63);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    walletHomePresenter$models$lambda$0$$inlined$map$1$2$1 = new WalletHomePresenter$models$lambda$0$$inlined$map$1$2$1(this, continuation);
                    Object obj632 = walletHomePresenter$models$lambda$0$$inlined$map$1$2$1.result;
                    Object obj642 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i26 = walletHomePresenter$models$lambda$0$$inlined$map$1$2$1.label;
                    if (i26 != 0) {
                    }
                    return Unit.INSTANCE;
                case 26:
                    if (continuation instanceof CoreInteractiveCardKt$InteractiveCardEffect$12$1$invokeSuspend$$inlined$filter$1$2$1) {
                        coreInteractiveCardKt$InteractiveCardEffect$12$1$invokeSuspend$$inlined$filter$1$2$1 = (CoreInteractiveCardKt$InteractiveCardEffect$12$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                        int i61 = coreInteractiveCardKt$InteractiveCardEffect$12$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if ((i61 & PKIFailureInfo.systemUnavail) != 0) {
                            coreInteractiveCardKt$InteractiveCardEffect$12$1$invokeSuspend$$inlined$filter$1$2$1.label = i61 - PKIFailureInfo.systemUnavail;
                            Object obj66 = coreInteractiveCardKt$InteractiveCardEffect$12$1$invokeSuspend$$inlined$filter$1$2$1.result;
                            Object obj67 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i27 = coreInteractiveCardKt$InteractiveCardEffect$12$1$invokeSuspend$$inlined$filter$1$2$1.label;
                            if (i27 != 0) {
                                SafeTrace.throwOnFailure(obj66);
                                if (((Boolean) obj).booleanValue()) {
                                    coreInteractiveCardKt$InteractiveCardEffect$12$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, coreInteractiveCardKt$InteractiveCardEffect$12$1$invokeSuspend$$inlined$filter$1$2$1) == obj67) {
                                        return obj67;
                                    }
                                }
                            } else {
                                if (i27 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj66);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    coreInteractiveCardKt$InteractiveCardEffect$12$1$invokeSuspend$$inlined$filter$1$2$1 = new CoreInteractiveCardKt$InteractiveCardEffect$12$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    Object obj662 = coreInteractiveCardKt$InteractiveCardEffect$12$1$invokeSuspend$$inlined$filter$1$2$1.result;
                    Object obj672 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i27 = coreInteractiveCardKt$InteractiveCardEffect$12$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if (i27 != 0) {
                    }
                    return Unit.INSTANCE;
                case 27:
                    if (continuation instanceof CoreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1$1$2$invokeSuspend$$inlined$filter$1$2$1) {
                        coreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1$1$2$invokeSuspend$$inlined$filter$1$2$1 = (CoreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1$1$2$invokeSuspend$$inlined$filter$1$2$1) continuation;
                        int i62 = coreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1$1$2$invokeSuspend$$inlined$filter$1$2$1.label;
                        if ((i62 & PKIFailureInfo.systemUnavail) != 0) {
                            coreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1$1$2$invokeSuspend$$inlined$filter$1$2$1.label = i62 - PKIFailureInfo.systemUnavail;
                            Object obj68 = coreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1$1$2$invokeSuspend$$inlined$filter$1$2$1.result;
                            Object obj69 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i28 = coreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1$1$2$invokeSuspend$$inlined$filter$1$2$1.label;
                            if (i28 != 0) {
                                SafeTrace.throwOnFailure(obj68);
                                if (((Boolean) obj).booleanValue()) {
                                    coreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1$1$2$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, coreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1$1$2$invokeSuspend$$inlined$filter$1$2$1) == obj69) {
                                        return obj69;
                                    }
                                }
                            } else {
                                if (i28 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj68);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    coreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1$1$2$invokeSuspend$$inlined$filter$1$2$1 = new CoreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1$1$2$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    Object obj682 = coreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1$1$2$invokeSuspend$$inlined$filter$1$2$1.result;
                    Object obj692 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i28 = coreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1$1$2$invokeSuspend$$inlined$filter$1$2$1.label;
                    if (i28 != 0) {
                    }
                    return Unit.INSTANCE;
                case 28:
                    if (continuation instanceof CoreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1$invokeSuspend$$inlined$filter$1$2$1) {
                        coreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1$invokeSuspend$$inlined$filter$1$2$1 = (CoreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                        int i63 = coreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if ((i63 & PKIFailureInfo.systemUnavail) != 0) {
                            coreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1$invokeSuspend$$inlined$filter$1$2$1.label = i63 - PKIFailureInfo.systemUnavail;
                            Object obj70 = coreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1$invokeSuspend$$inlined$filter$1$2$1.result;
                            Object obj71 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i29 = coreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1$invokeSuspend$$inlined$filter$1$2$1.label;
                            if (i29 != 0) {
                                SafeTrace.throwOnFailure(obj70);
                                if (((Boolean) obj).booleanValue()) {
                                    coreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, coreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1$invokeSuspend$$inlined$filter$1$2$1) == obj71) {
                                        return obj71;
                                    }
                                }
                            } else {
                                if (i29 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj70);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    coreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1$invokeSuspend$$inlined$filter$1$2$1 = new CoreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    Object obj702 = coreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1$invokeSuspend$$inlined$filter$1$2$1.result;
                    Object obj712 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i29 = coreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if (i29 != 0) {
                    }
                    return Unit.INSTANCE;
                default:
                    if (continuation instanceof CoreInteractiveCardKt$InteractiveCardEffect$15$1$invokeSuspend$$inlined$filter$1$2$1) {
                        coreInteractiveCardKt$InteractiveCardEffect$15$1$invokeSuspend$$inlined$filter$1$2$1 = (CoreInteractiveCardKt$InteractiveCardEffect$15$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                        int i64 = coreInteractiveCardKt$InteractiveCardEffect$15$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if ((i64 & PKIFailureInfo.systemUnavail) != 0) {
                            coreInteractiveCardKt$InteractiveCardEffect$15$1$invokeSuspend$$inlined$filter$1$2$1.label = i64 - PKIFailureInfo.systemUnavail;
                            Object obj73 = coreInteractiveCardKt$InteractiveCardEffect$15$1$invokeSuspend$$inlined$filter$1$2$1.result;
                            Object obj74 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i30 = coreInteractiveCardKt$InteractiveCardEffect$15$1$invokeSuspend$$inlined$filter$1$2$1.label;
                            if (i30 != 0) {
                                SafeTrace.throwOnFailure(obj73);
                                if (((Boolean) obj).booleanValue()) {
                                    coreInteractiveCardKt$InteractiveCardEffect$15$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, coreInteractiveCardKt$InteractiveCardEffect$15$1$invokeSuspend$$inlined$filter$1$2$1) == obj74) {
                                        return obj74;
                                    }
                                }
                            } else {
                                if (i30 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj73);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    coreInteractiveCardKt$InteractiveCardEffect$15$1$invokeSuspend$$inlined$filter$1$2$1 = new CoreInteractiveCardKt$InteractiveCardEffect$15$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    Object obj732 = coreInteractiveCardKt$InteractiveCardEffect$15$1$invokeSuspend$$inlined$filter$1$2$1.result;
                    Object obj742 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i30 = coreInteractiveCardKt$InteractiveCardEffect$15$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if (i30 != 0) {
                    }
                    return Unit.INSTANCE;
            }
        }

        public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, int i) {
            this.$r8$classId = i;
            this.$this_unsafeFlow = flowCollector;
        }
    }
}
