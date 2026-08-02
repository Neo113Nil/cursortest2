package com.squareup.cash.work.views.pay;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.agents.applets.views.AgentsHomeViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class PayHomeViewKt$$ExternalSyntheticLambda18 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ PayHomeViewKt$$ExternalSyntheticLambda18(String str, int i, int i2, String str2) {
        this.$r8$classId = i2;
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.$r8$classId) {
            case 0:
                num.intValue();
                PayCellViewKt.SummaryRow(this.f$0, this.f$1, composer, Updater.updateChangedFlags(this.f$2 | 1));
                break;
            default:
                num.getClass();
                AgentsHomeViewKt.EmptyOrFailureContent(this.f$0, this.f$1, composer, Updater.updateChangedFlags(this.f$2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
