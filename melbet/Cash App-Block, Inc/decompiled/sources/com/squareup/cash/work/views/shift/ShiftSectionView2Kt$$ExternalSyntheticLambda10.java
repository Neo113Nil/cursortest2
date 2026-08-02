package com.squareup.cash.work.views.shift;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.work.viewmodels.ShiftCardModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class ShiftSectionView2Kt$$ExternalSyntheticLambda10 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ShiftCardModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ ShiftSectionView2Kt$$ExternalSyntheticLambda10(ShiftCardModel shiftCardModel, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = shiftCardModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ShiftSectionView2Kt.ShiftSection2Card(this.f$0, this.f$1, composer, Updater.updateChangedFlags(1));
                break;
            default:
                ShiftSectionView2Kt.ShiftCardActions(this.f$0, this.f$1, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
