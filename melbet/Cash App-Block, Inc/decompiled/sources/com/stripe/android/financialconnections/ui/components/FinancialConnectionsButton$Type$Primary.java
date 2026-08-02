package com.stripe.android.financialconnections.ui.components;

import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.DefaultButtonColors;
import androidx.compose.material.DefaultButtonElevation;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsColors;
import com.stripe.android.financialconnections.ui.theme.ThemeKt;

/* loaded from: classes8.dex */
public final class FinancialConnectionsButton$Type$Primary extends TextKt {
    public static final FinancialConnectionsButton$Type$Primary INSTANCE = new FinancialConnectionsButton$Type$Primary();

    @Override // com.stripe.android.financialconnections.ui.components.TextKt
    public final DefaultButtonColors buttonColors(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-585272451);
        float f = ButtonDefaults.MinWidth;
        StaticProvidableCompositionLocal staticProvidableCompositionLocal = ThemeKt.LocalColors;
        DefaultButtonColors m464buttonColorsro_MJ88 = ButtonDefaults.m464buttonColorsro_MJ88(((FinancialConnectionsColors) gapComposer.consume(staticProvidableCompositionLocal)).primary, ((FinancialConnectionsColors) gapComposer.consume(staticProvidableCompositionLocal)).primaryAccent, ((FinancialConnectionsColors) gapComposer.consume(staticProvidableCompositionLocal)).primary, Color.m675copywmQWz5c$default(0.4f, ((FinancialConnectionsColors) gapComposer.consume(staticProvidableCompositionLocal)).primaryAccent, 14), gapComposer, 0, 0);
        gapComposer.end(false);
        return m464buttonColorsro_MJ88;
    }

    @Override // com.stripe.android.financialconnections.ui.components.TextKt
    public final DefaultButtonElevation elevation(GapComposer gapComposer) {
        gapComposer.startReplaceGroup(1046173141);
        DefaultButtonElevation m465elevationR_JCAzs = ButtonDefaults.m465elevationR_JCAzs(0, 31, gapComposer);
        gapComposer.end(false);
        return m465elevationR_JCAzs;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof FinancialConnectionsButton$Type$Primary);
    }

    public final int hashCode() {
        return -1748817615;
    }

    public final String toString() {
        return "Primary";
    }
}
