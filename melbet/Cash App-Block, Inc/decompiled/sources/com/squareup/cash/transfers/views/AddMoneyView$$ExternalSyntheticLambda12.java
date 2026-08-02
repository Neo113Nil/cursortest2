package com.squareup.cash.transfers.views;

import app.cash.local.viewmodels.wallet.BrandCollectionEvent;
import com.squareup.cash.maps.viewmodels.CashMapViewEvent;
import com.squareup.cash.transfers.viewmodels.AddMoneyViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class AddMoneyView$$ExternalSyntheticLambda12 implements Function1 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Function0 f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ AddMoneyView$$ExternalSyntheticLambda12(Function0 function0, Function1 function1) {
        this.f$0 = function0;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Function0 function0 = this.f$0;
        Function1 function1 = this.f$1;
        switch (i) {
            case 0:
                AddMoneyViewEvent addMoneyViewEvent = (AddMoneyViewEvent) obj;
                addMoneyViewEvent.getClass();
                if (addMoneyViewEvent instanceof AddMoneyViewEvent.InstrumentPickerDoneClick) {
                    function0.invoke();
                }
                function1.invoke(addMoneyViewEvent);
                break;
            default:
                BrandCollectionEvent brandCollectionEvent = (BrandCollectionEvent) obj;
                brandCollectionEvent.getClass();
                if (brandCollectionEvent instanceof BrandCollectionEvent.LocationRowClicked) {
                    function1.invoke(new CashMapViewEvent.MarkerClicked(((BrandCollectionEvent.LocationRowClicked) brandCollectionEvent).clientRoute));
                    function0.invoke();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ AddMoneyView$$ExternalSyntheticLambda12(Function1 function1, Function0 function0) {
        this.f$1 = function1;
        this.f$0 = function0;
    }
}
