package com.squareup.cash.support.chat.views.transcript.message;

import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.support.chat.views.survey.ChatSurveyKt$$ExternalSyntheticLambda11;
import com.squareup.cash.tax.views.TaxReturnsViewKt$$ExternalSyntheticLambda5;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class StatusTimestampView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ StatusTimestampView f$0;

    public /* synthetic */ StatusTimestampView$$ExternalSyntheticLambda0(StatusTimestampView statusTimestampView) {
        this.$r8$classId = 1;
        this.f$0 = statusTimestampView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        StatusTimestampView statusTimestampView = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                int i2 = StatusTimestampView.$r8$clinit;
                statusTimestampView.Content(composer, Updater.updateChangedFlags(1));
                break;
            case 1:
                int intValue = num.intValue();
                int i3 = StatusTimestampView.$r8$clinit;
                int i4 = 2;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new ChatSurveyKt$$ExternalSyntheticLambda11(14);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    OffsetKt.FlowRow(SemanticsModifierKt.clearAndSetSemantics(m302paddingqDBjuR0$default, (Function1) rememberedValue), SpacerKt.End, SpacerKt.Center, null, 0, 0, Expect_jvmKt.rememberComposableLambda(-1225826449, new TaxReturnsViewKt$$ExternalSyntheticLambda5(statusTimestampView, i4), gapComposer), gapComposer, 1573296, 56);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                int i5 = StatusTimestampView.$r8$clinit;
                statusTimestampView.Content(composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ StatusTimestampView$$ExternalSyntheticLambda0(StatusTimestampView statusTimestampView, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = statusTimestampView;
    }
}
