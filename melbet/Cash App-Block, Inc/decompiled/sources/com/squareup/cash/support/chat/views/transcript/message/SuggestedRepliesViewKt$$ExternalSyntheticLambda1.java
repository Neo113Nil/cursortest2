package com.squareup.cash.support.chat.views.transcript.message;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.support.chat.viewmodels.ChatRowViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class SuggestedRepliesViewKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ ChatRowViewModel.SuggestedRepliesRowViewModel f$0;

    public /* synthetic */ SuggestedRepliesViewKt$$ExternalSyntheticLambda1(ChatRowViewModel.SuggestedRepliesRowViewModel suggestedRepliesRowViewModel) {
        this.f$0 = suggestedRepliesRowViewModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        ChatRowViewModel.SuggestedRepliesRowViewModel suggestedRepliesRowViewModel = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                ActionBodyViewKt.SuggestedRepliesButtons(suggestedRepliesRowViewModel, composer, Updater.updateChangedFlags(1));
                break;
            default:
                int intValue = num.intValue();
                int i2 = EnhancedSuggestedRepliesView.$r8$clinit;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ActionBodyViewKt.EnhancedSuggestedReplies(suggestedRepliesRowViewModel.model.replies, suggestedRepliesRowViewModel.onReplySelected, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
