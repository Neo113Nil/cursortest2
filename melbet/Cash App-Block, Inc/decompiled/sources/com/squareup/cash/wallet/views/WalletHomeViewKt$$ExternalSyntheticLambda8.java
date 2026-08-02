package com.squareup.cash.wallet.views;

import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ValueInsets;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.bitcoin.screens.BitcoinMapErrorQuestion;
import com.squareup.cash.bitcoin.screens.BitcoinMapErrorSelectedAction;
import com.squareup.cash.shopping.views.ActionPillKt$$ExternalSyntheticLambda0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class WalletHomeViewKt$$ExternalSyntheticLambda8 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ParcelableSnapshotMutableIntState f$0;

    public /* synthetic */ WalletHomeViewKt$$ExternalSyntheticLambda8(int i, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState) {
        this.$r8$classId = i;
        this.f$0 = parcelableSnapshotMutableIntState;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = 6;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new WalletHomeViewKt$$ExternalSyntheticLambda21(0, parcelableSnapshotMutableIntState);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    SpacerKt.Spacer(gapComposer, ValueInsets.layout(companion, new ActionPillKt$$ExternalSyntheticLambda0(i2, (Function0) rememberedValue)));
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                BitcoinMapErrorSelectedAction bitcoinMapErrorSelectedAction = (BitcoinMapErrorSelectedAction) obj2;
                ((BitcoinMapErrorQuestion) obj).getClass();
                if (bitcoinMapErrorSelectedAction == BitcoinMapErrorSelectedAction.POSITIVE) {
                    NavAction$$ExternalSyntheticOutline0.m(1, parcelableSnapshotMutableIntState);
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new WalletHomeViewKt$$ExternalSyntheticLambda21(11, parcelableSnapshotMutableIntState);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    SpacerKt.Spacer(gapComposer2, ValueInsets.layout(companion, new ActionPillKt$$ExternalSyntheticLambda0(i2, (Function0) rememberedValue2)));
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
