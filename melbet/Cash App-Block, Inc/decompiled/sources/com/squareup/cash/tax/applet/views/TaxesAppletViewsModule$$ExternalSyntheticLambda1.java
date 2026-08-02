package com.squareup.cash.tax.applet.views;

import app.cash.broadway.presenter.Presenter;
import com.squareup.cash.afterpayapplet.applets.viewmodels.AfterpayAppletTileViewEvent;
import com.squareup.cash.agents.applets.viewmodels.AgentsAppletTileViewEvent$AgentsAppletOnClickTile;
import com.squareup.cash.benefits.applets.viewmodels.BankingBenefitsAppletTileEvent;
import com.squareup.cash.bitcoin.applets.viewmodels.BitcoinAppletTileEvent$BitcoinAppletOnClickTile;
import com.squareup.cash.borrow.applets.presenters.BorrowAppletTileViewEvent$BorrowAppletOnClickTile;
import com.squareup.cash.cashapplite.viewmodels.KycAppletTileEvent$OnClickStart;
import com.squareup.cash.earnings.applets.viewmodels.EarnerAppletTileEvent$OnClickTile;
import com.squareup.cash.earningstracker.applets.viewmodels.EarningsAppletTileEvent$EarningsAppletOnClickTile;
import com.squareup.cash.family.applets.viewmodels.ApprovedContactsAppletTileViewEvent$ApprovedContactsAppletOnClickTile;
import com.squareup.cash.family.applets.viewmodels.FamilyAppletTileViewEvent$FamilyAppletOnClickTile;
import com.squareup.cash.incentives.finishsetup.applets.viewmodels.FinishSetupAppletTileViewEvent$FinishSetupOnClickTile;
import com.squareup.cash.investing.applets.viewmodels.StocksAppletTileEvent$StocksAppletOnClickTile;
import com.squareup.cash.paychecks.applets.viewmodels.PaychecksAppletTileEvent$PaychecksAppletOnClickTile;
import com.squareup.cash.pools.applets.presenters.PoolsAppletTileEvent$ClickedAppletTile;
import com.squareup.cash.tax.viewmodels.TaxesAppletTileEvent$TaxesAppletOnClickTile;
import com.squareup.cash.wallet.viewmodels.CardAppletTileViewEvent;
import com.squareup.cash.work.applets.viewmodels.WorkAppletTileEvent$OnAppletTileClick;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class TaxesAppletViewsModule$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Presenter.Binding f$0;

    public /* synthetic */ TaxesAppletViewsModule$$ExternalSyntheticLambda1(Presenter.Binding binding, int i) {
        this.$r8$classId = i;
        this.f$0 = binding;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Presenter.Binding binding = this.f$0;
        switch (i) {
            case 0:
                binding.sendEvent(TaxesAppletTileEvent$TaxesAppletOnClickTile.INSTANCE);
                break;
            case 1:
                binding.sendEvent(new AfterpayAppletTileViewEvent.AfterpayAppletOnClickTile());
                break;
            case 2:
                binding.sendEvent(AfterpayAppletTileViewEvent.ItemViewed.INSTANCE);
                break;
            case 3:
                binding.sendEvent(AgentsAppletTileViewEvent$AgentsAppletOnClickTile.INSTANCE);
                break;
            case 4:
                binding.sendEvent(BankingBenefitsAppletTileEvent.OnAppletTileClick.INSTANCE);
                break;
            case 5:
                binding.sendEvent(BankingBenefitsAppletTileEvent.OnPromotedAppletTileClick.INSTANCE);
                break;
            case 6:
                binding.sendEvent(BitcoinAppletTileEvent$BitcoinAppletOnClickTile.INSTANCE);
                break;
            case 7:
                binding.sendEvent(BorrowAppletTileViewEvent$BorrowAppletOnClickTile.INSTANCE);
                break;
            case 8:
                binding.sendEvent(KycAppletTileEvent$OnClickStart.INSTANCE);
                break;
            case 9:
                binding.sendEvent(EarnerAppletTileEvent$OnClickTile.INSTANCE);
                break;
            case 10:
                binding.sendEvent(EarningsAppletTileEvent$EarningsAppletOnClickTile.INSTANCE);
                break;
            case 11:
                binding.sendEvent(ApprovedContactsAppletTileViewEvent$ApprovedContactsAppletOnClickTile.INSTANCE);
                break;
            case 12:
                binding.sendEvent(FamilyAppletTileViewEvent$FamilyAppletOnClickTile.INSTANCE);
                break;
            case 13:
                binding.sendEvent(FinishSetupAppletTileViewEvent$FinishSetupOnClickTile.INSTANCE);
                break;
            case 14:
                binding.sendEvent(StocksAppletTileEvent$StocksAppletOnClickTile.INSTANCE);
                break;
            case 15:
                binding.sendEvent(PaychecksAppletTileEvent$PaychecksAppletOnClickTile.INSTANCE);
                break;
            case 16:
                binding.sendEvent(PoolsAppletTileEvent$ClickedAppletTile.INSTANCE);
                break;
            case 17:
                binding.sendEvent(CardAppletTileViewEvent.CardAppletOnClickTile.INSTANCE);
                break;
            case 18:
                binding.sendEvent(CardAppletTileViewEvent.CardAppletOnClickPromotedTile.INSTANCE);
                break;
            case 19:
                binding.sendEvent(CardAppletTileViewEvent.CardAppletOnClickUninstalledRow.INSTANCE);
                break;
            default:
                binding.sendEvent(WorkAppletTileEvent$OnAppletTileClick.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
