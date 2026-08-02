package com.squareup.cash.support.chat.views;

import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.media3.common.PlayerExtensionsKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.support.chat.viewmodels.ChatAttachmentViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class ChatView$$ExternalSyntheticLambda52 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ChatView f$0;

    public /* synthetic */ ChatView$$ExternalSyntheticLambda52(ChatView chatView, int i) {
        this.$r8$classId = i;
        this.f$0 = chatView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        ChatView chatView = this.f$0;
        int i2 = 1;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1008657406, new ChatView$$ExternalSyntheticLambda52(chatView, i2), gapComposer), gapComposer, 3072, 7);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Object rememberedValue = gapComposer2.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = Updater.derivedStateOf(new ChatView$$ExternalSyntheticLambda1(chatView, 13));
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    ChatAttachmentViewModel chatAttachmentViewModel = (ChatAttachmentViewModel) chatView.chatInputAreaAttachment.getValue();
                    TextFieldState textFieldState = chatView.textFieldState;
                    boolean booleanValue = ((Boolean) chatView.chatInputAreaAttachmentButtonEnabled.getValue()).booleanValue();
                    boolean booleanValue2 = ((Boolean) ((State) rememberedValue).getValue()).booleanValue();
                    boolean booleanValue3 = ((Boolean) chatView.chatInputAreaShowAttachmentButton.getValue()).booleanValue();
                    boolean changedInstance = gapComposer2.changedInstance(chatView);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new ChatView$$ExternalSyntheticLambda1(chatView, 14);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    Function0 function0 = (Function0) rememberedValue2;
                    boolean changedInstance2 = gapComposer2.changedInstance(chatView);
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new ChatView$$ExternalSyntheticLambda1(chatView, 15);
                        gapComposer2.updateRememberedValue(rememberedValue3);
                    }
                    Function0 function02 = (Function0) rememberedValue3;
                    boolean changedInstance3 = gapComposer2.changedInstance(chatView);
                    Object rememberedValue4 = gapComposer2.rememberedValue();
                    if (changedInstance3 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new ChatView$$ExternalSyntheticLambda1(chatView, 16);
                        gapComposer2.updateRememberedValue(rememberedValue4);
                    }
                    PlayerExtensionsKt.ChatInputAreaContent(chatAttachmentViewModel, textFieldState, booleanValue, booleanValue2, booleanValue3, function0, function02, (Function0) rememberedValue4, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
