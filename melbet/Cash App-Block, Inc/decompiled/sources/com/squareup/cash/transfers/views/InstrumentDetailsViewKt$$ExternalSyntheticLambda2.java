package com.squareup.cash.transfers.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import coil3.RealImageLoader;
import com.squareup.cash.transfers.viewmodels.InstrumentDetailsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class InstrumentDetailsViewKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InstrumentDetailsViewModel f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ RealImageLoader f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ InstrumentDetailsViewKt$$ExternalSyntheticLambda2(InstrumentDetailsViewModel instrumentDetailsViewModel, Function1 function1, RealImageLoader realImageLoader, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = instrumentDetailsViewModel;
        this.f$1 = function1;
        this.f$2 = realImageLoader;
        this.f$3 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$3;
        RealImageLoader realImageLoader = this.f$2;
        Function1 function1 = this.f$1;
        InstrumentDetailsViewModel instrumentDetailsViewModel = this.f$0;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                AddMoneyViewKt.InstrumentDetailsSheet(instrumentDetailsViewModel, function1, realImageLoader, composer, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                AddMoneyViewKt.InstrumentDetailsFullscreenView(instrumentDetailsViewModel, function1, realImageLoader, composer, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
