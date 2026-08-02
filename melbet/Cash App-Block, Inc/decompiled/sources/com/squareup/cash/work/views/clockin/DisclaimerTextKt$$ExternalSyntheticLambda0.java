package com.squareup.cash.work.views.clockin;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.afterpayapplet.views.homesection.v3.AfterpayCardKt;
import com.squareup.cash.deposits.physical.view.address.AddressSearchKt;
import com.squareup.cash.support.chat.views.transcript.message.ActionBodyViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class DisclaimerTextKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ Function0 f$2;

    public /* synthetic */ DisclaimerTextKt$$ExternalSyntheticLambda0(int i, int i2, String str, String str2, Function0 function0) {
        this.$r8$classId = i2;
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                DisclaimerTextKt.DisclaimerText(this.f$0, this.f$1, this.f$2, composer, Updater.updateChangedFlags(1));
                break;
            case 1:
                AfterpayCardKt.SecondaryLabelRow(this.f$0, this.f$1, this.f$2, composer, Updater.updateChangedFlags(1));
                break;
            case 2:
                AddressSearchKt.AddressCell(this.f$0, this.f$1, this.f$2, composer, Updater.updateChangedFlags(1));
                break;
            case 3:
                ActionBodyViewKt.ActionBody(this.f$0, this.f$1, this.f$2, composer, Updater.updateChangedFlags(1));
                break;
            default:
                DisclaimerTextKt.DisclaimerText(this.f$0, this.f$1, this.f$2, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
