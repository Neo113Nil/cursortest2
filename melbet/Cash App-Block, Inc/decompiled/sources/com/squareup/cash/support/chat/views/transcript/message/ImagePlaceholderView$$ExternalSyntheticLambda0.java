package com.squareup.cash.support.chat.views.transcript.message;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.support.chat.views.transcript.message.ImagePlaceholderView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class ImagePlaceholderView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ ImagePlaceholderView f$0;

    public /* synthetic */ ImagePlaceholderView$$ExternalSyntheticLambda0(ImagePlaceholderView imagePlaceholderView) {
        this.f$0 = imagePlaceholderView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        ImagePlaceholderView imagePlaceholderView = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ActionBodyViewKt.ImagePlaceholder((ImagePlaceholderView.State) imagePlaceholderView.state.getValue(), imagePlaceholderView.onRetryClick, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                imagePlaceholderView.Content(composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ImagePlaceholderView$$ExternalSyntheticLambda0(ImagePlaceholderView imagePlaceholderView, int i) {
        this.f$0 = imagePlaceholderView;
    }
}
