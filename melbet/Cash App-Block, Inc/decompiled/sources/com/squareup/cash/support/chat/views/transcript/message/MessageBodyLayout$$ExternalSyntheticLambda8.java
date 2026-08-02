package com.squareup.cash.support.chat.views.transcript.message;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.internal.Expect_jvmKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.storage.RealSandboxer$$ExternalSyntheticLambda0;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$ActivityBodyViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatContentViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class MessageBodyLayout$$ExternalSyntheticLambda8 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MessageBodyLayout f$0;

    public /* synthetic */ MessageBodyLayout$$ExternalSyntheticLambda8(MessageBodyLayout messageBodyLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = messageBodyLayout;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        MessageBodyLayout messageBodyLayout = this.f$0;
        int i2 = 2;
        int i3 = 1;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1058493772, new MessageBodyLayout$$ExternalSyntheticLambda8(messageBodyLayout, i2), gapComposer), gapComposer, 3072, 7);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ActionBodyViewKt.ActivityTransactionBody(messageBodyLayout.activityItemLoader, messageBodyLayout.imageLoader, (BodyViewModel$ActivityBodyViewModel) messageBodyLayout.activityBodyViewModel$delegate.getValue(), messageBodyLayout.onActivityTransactionClick, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 2:
                GapComposer gapComposer3 = (GapComposer) composer;
                if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    String str = (String) messageBodyLayout.textContent$delegate.getValue();
                    ChatContentViewModel.EntryViewModel.Sender sender = (ChatContentViewModel.EntryViewModel.Sender) messageBodyLayout.sender$delegate.getValue();
                    boolean z = messageBodyLayout.textHasLinks;
                    boolean changedInstance = gapComposer3.changedInstance(messageBodyLayout);
                    Object rememberedValue = gapComposer3.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (changedInstance || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new RealSandboxer$$ExternalSyntheticLambda0(messageBodyLayout, 24);
                        gapComposer3.updateRememberedValue(rememberedValue);
                    }
                    Function1 function1 = (Function1) rememberedValue;
                    boolean changedInstance2 = gapComposer3.changedInstance(messageBodyLayout);
                    Object rememberedValue2 = gapComposer3.rememberedValue();
                    if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new MessageBodyLayout$$ExternalSyntheticLambda0(messageBodyLayout, 1);
                        gapComposer3.updateRememberedValue(rememberedValue2);
                    }
                    ActionBodyViewKt.MessageContent(str, sender, z, function1, (Function0) rememberedValue2, gapComposer3, 0);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            default:
                GapComposer gapComposer4 = (GapComposer) composer;
                if (gapComposer4.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-79579423, new MessageBodyLayout$$ExternalSyntheticLambda8(messageBodyLayout, i3), gapComposer4), gapComposer4, 3072, 7);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
