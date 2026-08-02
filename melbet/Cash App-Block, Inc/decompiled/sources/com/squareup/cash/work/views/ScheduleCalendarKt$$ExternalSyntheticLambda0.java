package com.squareup.cash.work.views;

import androidx.compose.foundation.lazy.grid.LazyGridItemScopeImpl;
import androidx.compose.foundation.pager.PagerScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import bo.app.j1$$ExternalSyntheticLambda14;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.offers.viewmodels.OffersHomeViewModelV2;
import com.squareup.cash.offers.views.home.OfferTileKt;
import com.squareup.cash.work.viewmodels.ScheduleCalendarViewModel;
import java.time.YearMonth;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* loaded from: classes6.dex */
public final /* synthetic */ class ScheduleCalendarKt$$ExternalSyntheticLambda0 implements Function4 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ ScheduleCalendarKt$$ExternalSyntheticLambda0(Object obj, Function1 function1, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = function1;
        this.f$2 = obj2;
        this.f$3 = i;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.$r8$classId;
        Object obj5 = this.f$2;
        Object obj6 = this.f$0;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                ((Integer) obj4).getClass();
                ((PagerScopeImpl) obj).getClass();
                YearMonth plusMonths = ((YearMonth) obj5).plusMonths(intValue - this.f$3);
                plusMonths.getClass();
                SellerCardKt.ScheduleCalendarMonthGrid(plusMonths, (ScheduleCalendarViewModel) obj6, this.f$1, (Composer) obj3, 0);
                break;
            default:
                List list = (List) obj6;
                OffersHomeViewModelV2.Loaded.OffersSection offersSection = (OffersHomeViewModelV2.Loaded.OffersSection) obj5;
                int intValue2 = ((Integer) obj2).intValue();
                Composer composer = (Composer) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                ((LazyGridItemScopeImpl) obj).getClass();
                if ((intValue3 & 48) == 0) {
                    intValue3 |= ((GapComposer) composer).changed(intValue2) ? 32 : 16;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue3 & 1, (intValue3 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
                    OffersHomeViewModelV2.Loaded.OfferItem offerItem = (OffersHomeViewModelV2.Loaded.OfferItem) list.get(intValue2);
                    Function1 function1 = this.f$1;
                    boolean changed = gapComposer.changed(function1) | gapComposer.changedInstance(offerItem) | gapComposer.changedInstance(offersSection);
                    int i2 = this.f$3;
                    boolean changed2 = gapComposer.changed(i2) | changed | gapComposer.changedInstance(list);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue == Composer.Companion.Empty) {
                        j1$$ExternalSyntheticLambda14 j1__externalsyntheticlambda14 = new j1$$ExternalSyntheticLambda14(function1, offerItem, offersSection, i2, list);
                        gapComposer.updateRememberedValue(j1__externalsyntheticlambda14);
                        rememberedValue = j1__externalsyntheticlambda14;
                    }
                    OfferTileKt.OfferTile(0, gapComposer, VisibleKt.onVisible$default(Modifier.Companion.$$INSTANCE, (Function0) rememberedValue), offerItem, function1);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
