package com.squareup.cash.work.views.timecard;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.squareup.cash.investing.components.holding.InvestingEtfHoldingDetailsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class TimecardDetailViewKt$$ExternalSyntheticLambda12 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ ComposableLambdaImpl f$1;

    public /* synthetic */ TimecardDetailViewKt$$ExternalSyntheticLambda12(String str, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = str;
        this.f$1 = composableLambdaImpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        ComposableLambdaImpl composableLambdaImpl = this.f$1;
        String str = this.f$0;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                TimecardDetailViewKt.SummaryRow(str, composableLambdaImpl, composer, Updater.updateChangedFlags(49));
                break;
            default:
                InvestingEtfHoldingDetailsKt.TimestampColumn(str, composableLambdaImpl, composer, Updater.updateChangedFlags(391));
                break;
        }
        return Unit.INSTANCE;
    }
}
