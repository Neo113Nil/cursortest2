package com.squareup.cash.support.chat.views.transcript;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.arcade.components.ModalKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class DividerView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ DividerView f$0;

    public /* synthetic */ DividerView$$ExternalSyntheticLambda0(DividerView dividerView) {
        this.f$0 = dividerView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        DividerView dividerView = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                int i2 = DividerView.$r8$clinit;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ModalKt.HorizontalDivider(0, 0, gapComposer, SpacerKt.m299paddingVpY3zN4(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), 16.0f, ((Boolean) dividerView.chatUiUpliftEnabled$delegate.getValue()).booleanValue() ? 8.0f : 24.0f));
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                int i3 = DividerView.$r8$clinit;
                dividerView.Content(composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ DividerView$$ExternalSyntheticLambda0(DividerView dividerView, int i) {
        this.f$0 = dividerView;
    }
}
