package com.squareup.cash.wallet.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class PageTagSlotKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PageTagSlot f$0;

    public /* synthetic */ PageTagSlotKt$$ExternalSyntheticLambda1(PageTagSlot pageTagSlot, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = pageTagSlot;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        PageTagSlot pageTagSlot = this.f$0;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                UtilsKt.MoneyOverlaySettleLoop(pageTagSlot, composer, Updater.updateChangedFlags(1));
                break;
            default:
                UtilsKt.HostControllerTickLoop(pageTagSlot, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
