package com.squareup.cash.support.chat.views.transcript;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.support.chat.viewmodels.ChatRowViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class DisclaimerView$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ChatRowViewModel.DisclaimerRowViewModel f$0;

    public /* synthetic */ DisclaimerView$$ExternalSyntheticLambda1(ChatRowViewModel.DisclaimerRowViewModel disclaimerRowViewModel, int i) {
        this.$r8$classId = 2;
        this.f$0 = disclaimerRowViewModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        ChatRowViewModel.DisclaimerRowViewModel disclaimerRowViewModel = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                int i2 = DisclaimerView.$r8$clinit;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    DisclaimerViewKt.DisclaimerViewContent(disclaimerRowViewModel, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                ((String) obj2).getClass();
                disclaimerRowViewModel.onLinkClicked.invoke(str);
                break;
            default:
                ((Integer) obj2).getClass();
                DisclaimerViewKt.DisclaimerViewContent(disclaimerRowViewModel, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ DisclaimerView$$ExternalSyntheticLambda1(ChatRowViewModel.DisclaimerRowViewModel disclaimerRowViewModel, int i, byte b) {
        this.$r8$classId = i;
        this.f$0 = disclaimerRowViewModel;
    }
}
