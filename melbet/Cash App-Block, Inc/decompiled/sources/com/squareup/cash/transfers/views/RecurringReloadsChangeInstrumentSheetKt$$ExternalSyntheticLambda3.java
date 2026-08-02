package com.squareup.cash.transfers.views;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import coil3.size.SizeKt;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.tax.views.TaxReturnsViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.transfers.viewmodels.RecurringReloadsChangeInstrumentViewModel;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda5;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes7.dex */
public final /* synthetic */ class RecurringReloadsChangeInstrumentSheetKt$$ExternalSyntheticLambda3 implements Function3 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ RecurringReloadsChangeInstrumentViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ RecurringReloadsChangeInstrumentSheetKt$$ExternalSyntheticLambda3(RecurringReloadsChangeInstrumentViewModel recurringReloadsChangeInstrumentViewModel, Function1 function1) {
        this.f$0 = recurringReloadsChangeInstrumentViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        RecurringReloadsChangeInstrumentViewModel recurringReloadsChangeInstrumentViewModel = this.f$0;
        Function1 function1 = this.f$1;
        switch (i) {
            case 0:
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                paddingValues.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(paddingValues) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 19) != 18)) {
                    AddMoneyViewKt.RecurringReloadsChangeInstrumentContent(SpacerKt.padding(Modifier.Companion.$$INSTANCE, paddingValues), recurringReloadsChangeInstrumentViewModel, function1, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    boolean changed = gapComposer2.changed(function1);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new HeroCardViewKt$$ExternalSyntheticLambda5(10, function1);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue, null, null, false, false, null, Expect_jvmKt.rememberComposableLambda(1793044283, new TaxReturnsViewKt$$ExternalSyntheticLambda5(recurringReloadsChangeInstrumentViewModel, 18), gapComposer2), gapComposer2, 1572864, 62);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ RecurringReloadsChangeInstrumentSheetKt$$ExternalSyntheticLambda3(Function1 function1, RecurringReloadsChangeInstrumentViewModel recurringReloadsChangeInstrumentViewModel) {
        this.f$1 = function1;
        this.f$0 = recurringReloadsChangeInstrumentViewModel;
    }
}
