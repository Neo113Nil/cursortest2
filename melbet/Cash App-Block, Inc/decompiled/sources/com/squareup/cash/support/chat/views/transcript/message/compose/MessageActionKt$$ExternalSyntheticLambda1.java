package com.squareup.cash.support.chat.views.transcript.message.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.support.chat.viewmodels.ChatContentViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class MessageActionKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ChatContentViewModel.MessageViewModel f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ Modifier f$2;

    public /* synthetic */ MessageActionKt$$ExternalSyntheticLambda1(ChatContentViewModel.MessageViewModel messageViewModel, Function1 function1, Modifier modifier, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = messageViewModel;
        this.f$1 = function1;
        this.f$2 = modifier;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Modifier modifier = this.f$2;
        Function1 function1 = this.f$1;
        ChatContentViewModel.MessageViewModel messageViewModel = this.f$0;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                MessageFileKt.MessageAction(messageViewModel, function1, modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 1:
                MessageFileKt.MessageTextAdvocate(messageViewModel, function1, modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 2:
                MessageFileKt.MessageTextBot(messageViewModel, function1, modifier, composer, Updater.updateChangedFlags(1));
                break;
            default:
                MessageFileKt.MessageTextSystem(messageViewModel, function1, modifier, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
