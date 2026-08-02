package com.squareup.cash.support.chat.views.transcript.message;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class TypingIndicatorBodyView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TypingIndicatorBodyView f$0;

    public /* synthetic */ TypingIndicatorBodyView$$ExternalSyntheticLambda0(TypingIndicatorBodyView typingIndicatorBodyView) {
        this.$r8$classId = 0;
        this.f$0 = typingIndicatorBodyView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        TypingIndicatorBodyView typingIndicatorBodyView = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                int i2 = TypingIndicatorBodyView.$r8$clinit;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    typingIndicatorBodyView.LottieTypingIndicator(gapComposer, 8);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                num.getClass();
                int i3 = TypingIndicatorBodyView.$r8$clinit;
                typingIndicatorBodyView.Content(composer, Updater.updateChangedFlags(1));
                break;
            default:
                num.getClass();
                int i4 = TypingIndicatorBodyView.$r8$clinit;
                typingIndicatorBodyView.LottieTypingIndicator(composer, Updater.updateChangedFlags(9));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ TypingIndicatorBodyView$$ExternalSyntheticLambda0(TypingIndicatorBodyView typingIndicatorBodyView, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = typingIndicatorBodyView;
    }
}
