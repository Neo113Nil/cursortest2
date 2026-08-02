package com.squareup.cash.support.chat.views.transcript.viewholder;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.support.chat.viewmodels.ChatContentViewModel;
import com.squareup.cash.support.chat.views.transcript.message.compose.MessageFileKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class MessageImageComposeView$$ExternalSyntheticLambda6 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ChatContentViewModel.MessageViewModel f$0;
    public final /* synthetic */ MessageImageComposeView f$1;

    public /* synthetic */ MessageImageComposeView$$ExternalSyntheticLambda6(ChatContentViewModel.MessageViewModel messageViewModel, MessageImageComposeView messageImageComposeView, int i) {
        this.$r8$classId = i;
        this.f$0 = messageViewModel;
        this.f$1 = messageImageComposeView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        MessageImageComposeView messageImageComposeView = this.f$1;
        int i2 = 1;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(808796964, new MessageImageComposeView$$ExternalSyntheticLambda6(this.f$0, messageImageComposeView, i2), gapComposer), gapComposer, 3072, 7);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    MessageFileKt.MessageImage(this.f$0, messageImageComposeView.onImageClick, messageImageComposeView.onImageLoadFailed, messageImageComposeView.onRetryImageLoadClick, null, messageImageComposeView.onResendMessage, messageImageComposeView.onDeleteMessage, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
