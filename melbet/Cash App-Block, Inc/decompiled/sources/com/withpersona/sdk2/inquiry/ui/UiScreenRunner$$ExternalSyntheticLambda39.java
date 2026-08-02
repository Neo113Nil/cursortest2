package com.withpersona.sdk2.inquiry.ui;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import app.cash.broadway.ui.Ui;
import app.cash.directoryui.viewmodels.DirectoryListItem;
import com.braze.models.cards.Card;
import com.braze.models.inappmessage.IInAppMessageImmersive;
import com.braze.models.inappmessage.MessageButton;
import com.braze.ui.actions.UriAction;
import com.braze.ui.contentcards.view.BaseContentCardView;
import com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper;
import com.nimbusds.jose.util.DeflateUtils;
import com.squareup.cash.db.EnumListAdapter$encode$1;
import com.squareup.cash.directory_ui.views.MooncakeFlatRowItemView;
import com.squareup.cash.investing.components.InvestingHomeRowAdapter;
import com.squareup.cash.investing.components.categories.InvestingSubFilterSelection;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.investing.viewmodels.InvestingHomeViewEvent;
import com.squareup.cash.investing.viewmodels.InvestingHomeViewModel;
import com.squareup.cash.investing.viewmodels.StockSource$Discovery;
import com.squareup.cash.investing.viewmodels.StockSource$Following;
import com.squareup.cash.investing.viewmodels.StockSource$Portfolio;
import com.squareup.cash.investing.viewmodels.categories.FilterSubFiltersViewEvent;
import com.squareup.cash.investing.viewmodels.categories.SubFilterViewModel;
import com.squareup.protos.franklin.common.SyncInvestmentFilterGroup;
import com.withpersona.sdk2.inquiry.steps.ui.components.ClickableStackComponent;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final /* synthetic */ class UiScreenRunner$$ExternalSyntheticLambda39 implements View.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ UiScreenRunner$$ExternalSyntheticLambda39(MooncakeFlatRowItemView mooncakeFlatRowItemView, DirectoryListItem.ItemViewModel itemViewModel, String str, Ui.EventReceiver eventReceiver) {
        this.$r8$classId = 3;
        this.f$0 = itemViewModel;
        this.f$1 = str;
        this.f$2 = eventReceiver;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        DeflateUtils deflateUtils;
        int i = this.$r8$classId;
        Object obj = this.f$2;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                ClickableStackComponent clickableStackComponent = (ClickableStackComponent) obj3;
                clickableStackComponent.isActive = true;
                ((UiScreenRunner) obj2).onClick.invoke(clickableStackComponent, Boolean.valueOf(((ConstraintLayout) obj).getVisibility() == 0));
                return;
            case 1:
                BaseContentCardView.bindViewHolder$lambda$0((BaseContentCardView) obj3, (Card) obj2, (UriAction) obj, view);
                return;
            case 2:
                DefaultInAppMessageViewWrapper.createButtonClickListeners$lambda$0$1$0$0((DefaultInAppMessageViewWrapper) obj3, (MessageButton) obj2, (IInAppMessageImmersive) obj, view);
                return;
            case 3:
                MooncakeFlatRowItemView.sendActionUrlEvent((DirectoryListItem.ItemViewModel) obj3, (String) obj2, (Ui.EventReceiver) obj);
                return;
            case 4:
                DirectoryListItem.ItemViewModel itemViewModel = (DirectoryListItem.ItemViewModel) obj2;
                ((MooncakeFlatRowItemView) obj3).onActionButtonClick.invoke();
                MooncakeFlatRowItemView.sendActionUrlEvent(itemViewModel, itemViewModel.itemActionUrl, (Ui.EventReceiver) obj);
                return;
            case 5:
                InvestingHomeViewModel.InvestingHomeRow.Stock stock = (InvestingHomeViewModel.InvestingHomeRow.Stock) obj;
                ((InvestingHomeRowAdapter.ViewHolder.StockViewHolder) obj3).stockView.setWasClicked(true);
                Ui.EventReceiver eventReceiver = ((InvestingHomeRowAdapter) obj2).eventReceiver;
                if (eventReceiver == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                    throw null;
                }
                InvestmentEntityToken investmentEntityToken = stock.getContentModel().investmentEntityToken;
                if (stock instanceof InvestingHomeViewModel.InvestingHomeRow.Stock.Portfolio) {
                    deflateUtils = StockSource$Portfolio.INSTANCE;
                } else if (stock instanceof InvestingHomeViewModel.InvestingHomeRow.Stock.Discovery) {
                    deflateUtils = new StockSource$Discovery(((InvestingHomeViewModel.InvestingHomeRow.Stock.Discovery) stock).sectionHeader);
                } else {
                    if (!(stock instanceof InvestingHomeViewModel.InvestingHomeRow.Stock.Following)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    deflateUtils = StockSource$Following.INSTANCE;
                }
                eventReceiver.sendEvent(new InvestingHomeViewEvent.SelectStock(investmentEntityToken, deflateUtils));
                return;
            default:
                int i2 = InvestingSubFilterSelection.$r8$clinit;
                String str = ((SubFilterViewModel.SubFilterSelectionViewModel) obj2).subFilterToken;
                String str2 = ((SyncInvestmentFilterGroup.SubfilterOption) obj).token;
                str2.getClass();
                ((EnumListAdapter$encode$1) obj3).invoke(new FilterSubFiltersViewEvent.OptionClick(str, str2));
                return;
        }
    }

    public /* synthetic */ UiScreenRunner$$ExternalSyntheticLambda39(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }
}
