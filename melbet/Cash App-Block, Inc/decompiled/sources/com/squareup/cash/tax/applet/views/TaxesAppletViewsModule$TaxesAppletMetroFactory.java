package com.squareup.cash.tax.applet.views;

import android.app.Activity;
import androidx.compose.foundation.pager.PagerLayoutInfoKt;
import androidx.core.view.DisplayCutoutCompat;
import androidx.lifecycle.LifecycleOwner;
import coil3.RealImageLoader;
import com.datadog.android.trace.DatadogTracing;
import com.google.android.gms.internal.mlkit_common.zzs;
import com.google.android.gms.internal.mlkit_genai_prompt.zzagn;
import com.google.android.gms.internal.mlkit_genai_prompt.zzahv;
import com.google.android.gms.internal.mlkit_genai_prompt.zzjo;
import com.google.crypto.tink.subtle.Bytes;
import com.google.mlkit.vision.common.internal.CommonConvertUtils;
import com.squareup.cash.afterpayapplet.applets.presenters.AfterpayAppletTilePresenter$Factory$Impl;
import com.squareup.cash.afterpayapplet.applets.presenters.RealAfterpayAppletAvailabilityStateManager;
import com.squareup.cash.afterpayapplet.applets.views.AfterpayAppletTileViewModule$Companion;
import com.squareup.cash.agents.applets.presenters.AgentsAppletTilePresenter$Factory$Impl;
import com.squareup.cash.agents.applets.presenters.RealAgentsAppletTileRepository;
import com.squareup.cash.amountchooser.views.AtmPickerGridKt$$ExternalSyntheticLambda4;
import com.squareup.cash.attribution.ActivityTransitionsSideEffectsPerformer;
import com.squareup.cash.attribution.wrappers.AppsFlyerClient;
import com.squareup.cash.banking.applets.presenters.BalanceAppletTilePresenter$Factory$Impl;
import com.squareup.cash.banking.applets.presenters.LiteBalanceAppletTilePresenter$Factory$Impl;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.borrow.applets.presenters.BorrowAppletTilePresenter$Factory$Impl;
import com.squareup.cash.borrow.applets.presenters.RealBorrowAppletRepository;
import com.squareup.cash.cashapplite.CashAppLiteReleaseModule$$ExternalSyntheticLambda0;
import com.squareup.cash.clientrouting.ClientRouteRouter;
import com.squareup.cash.clientrouting.LiteClientRouteRouter$Factory$Impl;
import com.squareup.cash.crypto.scenarioplans.plans.InitiateBitcoinWithdrawalScenarioPlan$Factory$Impl;
import com.squareup.cash.crypto.scenarioplans.plans.InitiateCashLiteBitcoinWithdrawalScenarioPlan$Factory$Impl;
import com.squareup.cash.earnings.applets.presenters.EarnerAppletTilePresenter$Factory$Impl;
import com.squareup.cash.earnings.applets.presenters.RealEarnerAppletAvailabilityState;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.family.applets.data.RealAllowanceAppletTileRepository;
import com.squareup.cash.family.applets.data.RealApprovedContactsAppletTileRepository;
import com.squareup.cash.family.applets.presenters.AllowanceAppletTilePresenter$Factory$Impl;
import com.squareup.cash.family.applets.presenters.ApprovedContactsAppletTilePresenter$Factory$Impl;
import com.squareup.cash.incentives.finishsetup.applets.presenters.FinishSetupAppletTilePresenter$Factory$Impl;
import com.squareup.cash.incentives.finishsetup.applets.presenters.RealFinishSetupAppletTileRepository;
import com.squareup.cash.investing.applets.presenters.RealStocksAppletTileRepository;
import com.squareup.cash.investing.applets.presenters.StocksAppletTilePresenter$Factory$Impl;
import com.squareup.cash.money.applets.viewmodels.Applet;
import com.squareup.cash.money.core.ids.AppletId;
import com.squareup.cash.paychecks.applets.presenters.PaychecksAppletTilePresenter$Factory$Impl;
import com.squareup.cash.paychecks.applets.presenters.RealPaychecksAppletTileRepository;
import com.squareup.cash.phoneplans.applets.presenters.PhonePlansAppletTilePresenter$Factory$Impl;
import com.squareup.cash.phoneplans.applets.presenters.RealPhonePlansAppletTileAvailabilityManager;
import com.squareup.cash.pools.applets.presenters.PoolsAppletTilePresenter$Factory$Impl;
import com.squareup.cash.pools.applets.views.PoolsAppletTileKt;
import com.squareup.cash.pools.backend.real.RealPoolsRepository;
import com.squareup.cash.savings.applets.presenters.RealSavingsAppletTileRepository;
import com.squareup.cash.savings.applets.presenters.SavingsAppletTilePresenter$Factory$Impl;
import com.squareup.cash.tax.applets.presenters.RealTaxesAppletTileRepository;
import com.squareup.cash.tax.applets.presenters.TaxesAppletTilePresenter$Factory$Impl;
import com.squareup.cash.tax.applets.presenters.TaxesAppletTileRepository;
import com.squareup.cash.tax.views.TaxTooltipView$$ExternalSyntheticLambda0;
import com.squareup.cash.work.applets.presenters.WorkAppletTilePresenter$Factory$Impl;
import com.squareup.scannerview.TextSetter;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import kotlinx.coroutines.flow.Flow;
import okio.Path;

/* loaded from: classes.dex */
public final class TaxesAppletViewsModule$TaxesAppletMetroFactory implements Factory {
    public final /* synthetic */ int $r8$classId;
    public final InstanceFactory applet;
    public final InstanceFactory lifecycleOwner;
    public final Provider repository;

    public TaxesAppletViewsModule$TaxesAppletMetroFactory(Path.Companion companion, InstanceFactory instanceFactory, InstanceFactory instanceFactory2, DoubleCheck doubleCheck) {
        this.$r8$classId = 18;
        this.applet = instanceFactory;
        this.lifecycleOwner = instanceFactory2;
        this.repository = doubleCheck;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Provider provider = this.repository;
        InstanceFactory instanceFactory = this.lifecycleOwner;
        InstanceFactory instanceFactory2 = this.applet;
        switch (i) {
            case 0:
                TaxesAppletTileRepository taxesAppletTileRepository = (TaxesAppletTileRepository) provider.invoke();
                TaxesAppletTilePresenter$Factory$Impl taxesAppletTilePresenter$Factory$Impl = (TaxesAppletTilePresenter$Factory$Impl) instanceFactory2.value;
                LifecycleOwner lifecycleOwner = (LifecycleOwner) instanceFactory.value;
                taxesAppletTileRepository.getClass();
                taxesAppletTilePresenter$Factory$Impl.getClass();
                lifecycleOwner.getClass();
                return new Applet(AppletId.TAXES, ((RealTaxesAppletTileRepository) taxesAppletTileRepository).getAvailabilityState(), new TaxTooltipView$$ExternalSyntheticLambda0(26, taxesAppletTilePresenter$Factory$Impl, lifecycleOwner));
            case 1:
                AfterpayAppletTilePresenter$Factory$Impl afterpayAppletTilePresenter$Factory$Impl = (AfterpayAppletTilePresenter$Factory$Impl) instanceFactory2.value;
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) instanceFactory.value;
                RealAfterpayAppletAvailabilityStateManager realAfterpayAppletAvailabilityStateManager = (RealAfterpayAppletAvailabilityStateManager) provider.invoke();
                afterpayAppletTilePresenter$Factory$Impl.getClass();
                lifecycleOwner2.getClass();
                realAfterpayAppletAvailabilityStateManager.getClass();
                return AfterpayAppletTileViewModule$Companion.afterpayAppletTile(afterpayAppletTilePresenter$Factory$Impl, lifecycleOwner2, realAfterpayAppletAvailabilityStateManager);
            case 2:
                RealAgentsAppletTileRepository realAgentsAppletTileRepository = (RealAgentsAppletTileRepository) provider.invoke();
                AgentsAppletTilePresenter$Factory$Impl agentsAppletTilePresenter$Factory$Impl = (AgentsAppletTilePresenter$Factory$Impl) instanceFactory2.value;
                LifecycleOwner lifecycleOwner3 = (LifecycleOwner) instanceFactory.value;
                realAgentsAppletTileRepository.getClass();
                agentsAppletTilePresenter$Factory$Impl.getClass();
                lifecycleOwner3.getClass();
                return new Applet(AppletId.AGENTS, realAgentsAppletTileRepository.getAvailabilityState(), new AtmPickerGridKt$$ExternalSyntheticLambda4(27, agentsAppletTilePresenter$Factory$Impl, lifecycleOwner3));
            case 3:
                Flow flow = (Flow) instanceFactory2.value;
                AppsFlyerClient appsFlyerClient = (AppsFlyerClient) provider.invoke();
                Activity activity = (Activity) instanceFactory.value;
                flow.getClass();
                appsFlyerClient.getClass();
                activity.getClass();
                return new ActivityTransitionsSideEffectsPerformer(0, flow, appsFlyerClient, activity);
            case 4:
                BalanceAppletTilePresenter$Factory$Impl balanceAppletTilePresenter$Factory$Impl = (BalanceAppletTilePresenter$Factory$Impl) instanceFactory2.value;
                LifecycleOwner lifecycleOwner4 = (LifecycleOwner) instanceFactory.value;
                ElementBoundsRegistry elementBoundsRegistry = (ElementBoundsRegistry) provider.invoke();
                balanceAppletTilePresenter$Factory$Impl.getClass();
                lifecycleOwner4.getClass();
                elementBoundsRegistry.getClass();
                return PagerLayoutInfoKt.balanceApplet(balanceAppletTilePresenter$Factory$Impl, lifecycleOwner4, elementBoundsRegistry);
            case 5:
                LiteBalanceAppletTilePresenter$Factory$Impl liteBalanceAppletTilePresenter$Factory$Impl = (LiteBalanceAppletTilePresenter$Factory$Impl) instanceFactory2.value;
                LifecycleOwner lifecycleOwner5 = (LifecycleOwner) instanceFactory.value;
                ElementBoundsRegistry elementBoundsRegistry2 = (ElementBoundsRegistry) provider.invoke();
                liteBalanceAppletTilePresenter$Factory$Impl.getClass();
                lifecycleOwner5.getClass();
                elementBoundsRegistry2.getClass();
                return PagerLayoutInfoKt.liteBalanceApplet(liteBalanceAppletTilePresenter$Factory$Impl, lifecycleOwner5, elementBoundsRegistry2);
            case 6:
                RealBorrowAppletRepository realBorrowAppletRepository = (RealBorrowAppletRepository) provider.invoke();
                BorrowAppletTilePresenter$Factory$Impl borrowAppletTilePresenter$Factory$Impl = (BorrowAppletTilePresenter$Factory$Impl) instanceFactory2.value;
                LifecycleOwner lifecycleOwner6 = (LifecycleOwner) instanceFactory.value;
                realBorrowAppletRepository.getClass();
                borrowAppletTilePresenter$Factory$Impl.getClass();
                lifecycleOwner6.getClass();
                return new Applet(AppletId.BORROW, realBorrowAppletRepository.getAvailabilityState(), new SetPinViewKt$$ExternalSyntheticLambda2(28, borrowAppletTilePresenter$Factory$Impl, lifecycleOwner6));
            case 7:
                ClientRouteRouter.Factory factory = (ClientRouteRouter.Factory) instanceFactory2.value;
                LiteClientRouteRouter$Factory$Impl liteClientRouteRouter$Factory$Impl = (LiteClientRouteRouter$Factory$Impl) instanceFactory.value;
                CashAppLiteReleaseModule$$ExternalSyntheticLambda0 cashAppLiteReleaseModule$$ExternalSyntheticLambda0 = (CashAppLiteReleaseModule$$ExternalSyntheticLambda0) provider.invoke();
                factory.getClass();
                liteClientRouteRouter$Factory$Impl.getClass();
                cashAppLiteReleaseModule$$ExternalSyntheticLambda0.getClass();
                return cashAppLiteReleaseModule$$ExternalSyntheticLambda0.f$0 ? liteClientRouteRouter$Factory$Impl : factory;
            case 8:
                InitiateBitcoinWithdrawalScenarioPlan$Factory$Impl initiateBitcoinWithdrawalScenarioPlan$Factory$Impl = (InitiateBitcoinWithdrawalScenarioPlan$Factory$Impl) instanceFactory2.value;
                InitiateCashLiteBitcoinWithdrawalScenarioPlan$Factory$Impl initiateCashLiteBitcoinWithdrawalScenarioPlan$Factory$Impl = (InitiateCashLiteBitcoinWithdrawalScenarioPlan$Factory$Impl) instanceFactory.value;
                CashAppLiteReleaseModule$$ExternalSyntheticLambda0 cashAppLiteReleaseModule$$ExternalSyntheticLambda02 = (CashAppLiteReleaseModule$$ExternalSyntheticLambda0) provider.invoke();
                initiateBitcoinWithdrawalScenarioPlan$Factory$Impl.getClass();
                initiateCashLiteBitcoinWithdrawalScenarioPlan$Factory$Impl.getClass();
                cashAppLiteReleaseModule$$ExternalSyntheticLambda02.getClass();
                return DatadogTracing.provideInitiateBitcoinWithdrawalScenarioPlanFactory(initiateBitcoinWithdrawalScenarioPlan$Factory$Impl, initiateCashLiteBitcoinWithdrawalScenarioPlan$Factory$Impl, cashAppLiteReleaseModule$$ExternalSyntheticLambda02);
            case 9:
                RealEarnerAppletAvailabilityState realEarnerAppletAvailabilityState = (RealEarnerAppletAvailabilityState) provider.invoke();
                EarnerAppletTilePresenter$Factory$Impl earnerAppletTilePresenter$Factory$Impl = (EarnerAppletTilePresenter$Factory$Impl) instanceFactory2.value;
                LifecycleOwner lifecycleOwner7 = (LifecycleOwner) instanceFactory.value;
                realEarnerAppletAvailabilityState.getClass();
                earnerAppletTilePresenter$Factory$Impl.getClass();
                lifecycleOwner7.getClass();
                return zzs.earnerApplet(realEarnerAppletAvailabilityState, earnerAppletTilePresenter$Factory$Impl, lifecycleOwner7);
            case 10:
                RealApprovedContactsAppletTileRepository realApprovedContactsAppletTileRepository = (RealApprovedContactsAppletTileRepository) provider.invoke();
                ApprovedContactsAppletTilePresenter$Factory$Impl approvedContactsAppletTilePresenter$Factory$Impl = (ApprovedContactsAppletTilePresenter$Factory$Impl) instanceFactory2.value;
                LifecycleOwner lifecycleOwner8 = (LifecycleOwner) instanceFactory.value;
                realApprovedContactsAppletTileRepository.getClass();
                approvedContactsAppletTilePresenter$Factory$Impl.getClass();
                lifecycleOwner8.getClass();
                return zzjo.approvedContactsApplet(realApprovedContactsAppletTileRepository, approvedContactsAppletTilePresenter$Factory$Impl, lifecycleOwner8);
            case 11:
                RealAllowanceAppletTileRepository realAllowanceAppletTileRepository = (RealAllowanceAppletTileRepository) provider.invoke();
                AllowanceAppletTilePresenter$Factory$Impl allowanceAppletTilePresenter$Factory$Impl = (AllowanceAppletTilePresenter$Factory$Impl) instanceFactory2.value;
                LifecycleOwner lifecycleOwner9 = (LifecycleOwner) instanceFactory.value;
                realAllowanceAppletTileRepository.getClass();
                allowanceAppletTilePresenter$Factory$Impl.getClass();
                lifecycleOwner9.getClass();
                return zzjo.provideAllowanceApplet(realAllowanceAppletTileRepository, allowanceAppletTilePresenter$Factory$Impl, lifecycleOwner9);
            case 12:
                RealFinishSetupAppletTileRepository realFinishSetupAppletTileRepository = (RealFinishSetupAppletTileRepository) provider.invoke();
                FinishSetupAppletTilePresenter$Factory$Impl finishSetupAppletTilePresenter$Factory$Impl = (FinishSetupAppletTilePresenter$Factory$Impl) instanceFactory2.value;
                LifecycleOwner lifecycleOwner10 = (LifecycleOwner) instanceFactory.value;
                realFinishSetupAppletTileRepository.getClass();
                finishSetupAppletTilePresenter$Factory$Impl.getClass();
                lifecycleOwner10.getClass();
                return Bytes.finishSetupApplet(realFinishSetupAppletTileRepository, finishSetupAppletTilePresenter$Factory$Impl, lifecycleOwner10);
            case 13:
                StocksAppletTilePresenter$Factory$Impl stocksAppletTilePresenter$Factory$Impl = (StocksAppletTilePresenter$Factory$Impl) instanceFactory2.value;
                RealStocksAppletTileRepository realStocksAppletTileRepository = (RealStocksAppletTileRepository) provider.invoke();
                LifecycleOwner lifecycleOwner11 = (LifecycleOwner) instanceFactory.value;
                stocksAppletTilePresenter$Factory$Impl.getClass();
                realStocksAppletTileRepository.getClass();
                lifecycleOwner11.getClass();
                return CommonConvertUtils.stocksApplet(stocksAppletTilePresenter$Factory$Impl, realStocksAppletTileRepository, lifecycleOwner11);
            case 14:
                RealPaychecksAppletTileRepository realPaychecksAppletTileRepository = (RealPaychecksAppletTileRepository) provider.invoke();
                PaychecksAppletTilePresenter$Factory$Impl paychecksAppletTilePresenter$Factory$Impl = (PaychecksAppletTilePresenter$Factory$Impl) instanceFactory2.value;
                LifecycleOwner lifecycleOwner12 = (LifecycleOwner) instanceFactory.value;
                realPaychecksAppletTileRepository.getClass();
                paychecksAppletTilePresenter$Factory$Impl.getClass();
                lifecycleOwner12.getClass();
                return zzagn.paychecksApplet(realPaychecksAppletTileRepository, paychecksAppletTilePresenter$Factory$Impl, lifecycleOwner12);
            case 15:
                RealPhonePlansAppletTileAvailabilityManager realPhonePlansAppletTileAvailabilityManager = (RealPhonePlansAppletTileAvailabilityManager) provider.invoke();
                LifecycleOwner lifecycleOwner13 = (LifecycleOwner) instanceFactory2.value;
                PhonePlansAppletTilePresenter$Factory$Impl phonePlansAppletTilePresenter$Factory$Impl = (PhonePlansAppletTilePresenter$Factory$Impl) instanceFactory.value;
                realPhonePlansAppletTileAvailabilityManager.getClass();
                lifecycleOwner13.getClass();
                phonePlansAppletTilePresenter$Factory$Impl.getClass();
                return zzahv.phonePlansApplet(realPhonePlansAppletTileAvailabilityManager, lifecycleOwner13, phonePlansAppletTilePresenter$Factory$Impl);
            case 16:
                RealPoolsRepository realPoolsRepository = (RealPoolsRepository) provider.invoke();
                PoolsAppletTilePresenter$Factory$Impl poolsAppletTilePresenter$Factory$Impl = (PoolsAppletTilePresenter$Factory$Impl) instanceFactory2.value;
                LifecycleOwner lifecycleOwner14 = (LifecycleOwner) instanceFactory.value;
                realPoolsRepository.getClass();
                poolsAppletTilePresenter$Factory$Impl.getClass();
                lifecycleOwner14.getClass();
                return PoolsAppletTileKt.poolsApplet(realPoolsRepository, poolsAppletTilePresenter$Factory$Impl, lifecycleOwner14);
            case 17:
                RealSavingsAppletTileRepository realSavingsAppletTileRepository = (RealSavingsAppletTileRepository) provider.invoke();
                SavingsAppletTilePresenter$Factory$Impl savingsAppletTilePresenter$Factory$Impl = (SavingsAppletTilePresenter$Factory$Impl) instanceFactory2.value;
                LifecycleOwner lifecycleOwner15 = (LifecycleOwner) instanceFactory.value;
                realSavingsAppletTileRepository.getClass();
                savingsAppletTilePresenter$Factory$Impl.getClass();
                lifecycleOwner15.getClass();
                return DisplayCutoutCompat.Api28Impl.savingsApplet(realSavingsAppletTileRepository, savingsAppletTilePresenter$Factory$Impl, lifecycleOwner15);
            default:
                LifecycleOwner lifecycleOwner16 = (LifecycleOwner) instanceFactory2.value;
                WorkAppletTilePresenter$Factory$Impl workAppletTilePresenter$Factory$Impl = (WorkAppletTilePresenter$Factory$Impl) instanceFactory.value;
                RealImageLoader realImageLoader = (RealImageLoader) provider.invoke();
                lifecycleOwner16.getClass();
                workAppletTilePresenter$Factory$Impl.getClass();
                realImageLoader.getClass();
                return new TextSetter(workAppletTilePresenter$Factory$Impl, lifecycleOwner16, realImageLoader);
        }
    }

    public /* synthetic */ TaxesAppletViewsModule$TaxesAppletMetroFactory(InstanceFactory instanceFactory, DoubleCheck doubleCheck, InstanceFactory instanceFactory2, int i) {
        this.$r8$classId = i;
        this.applet = instanceFactory;
        this.repository = doubleCheck;
        this.lifecycleOwner = instanceFactory2;
    }

    public /* synthetic */ TaxesAppletViewsModule$TaxesAppletMetroFactory(InstanceFactory instanceFactory, InstanceFactory instanceFactory2, Provider provider, int i) {
        this.$r8$classId = i;
        this.applet = instanceFactory;
        this.lifecycleOwner = instanceFactory2;
        this.repository = provider;
    }

    public /* synthetic */ TaxesAppletViewsModule$TaxesAppletMetroFactory(Object obj, Provider provider, InstanceFactory instanceFactory, InstanceFactory instanceFactory2, int i) {
        this.$r8$classId = i;
        this.repository = provider;
        this.applet = instanceFactory;
        this.lifecycleOwner = instanceFactory2;
    }

    public /* synthetic */ TaxesAppletViewsModule$TaxesAppletMetroFactory(Provider provider, InstanceFactory instanceFactory, InstanceFactory instanceFactory2, int i) {
        this.$r8$classId = i;
        this.repository = provider;
        this.applet = instanceFactory;
        this.lifecycleOwner = instanceFactory2;
    }
}
