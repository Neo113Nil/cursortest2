package com.squareup.cash.support.chat.views.transcript.message.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.support.chat.viewmodels.ChatContentViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class MessageFileKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ChatContentViewModel.MessageViewModel f$0;
    public final /* synthetic */ Modifier f$1;
    public final /* synthetic */ Function1 f$2;
    public final /* synthetic */ Function1 f$3;

    public /* synthetic */ MessageFileKt$$ExternalSyntheticLambda1(ChatContentViewModel.MessageViewModel messageViewModel, Modifier modifier, Function1 function1, Function1 function12, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = messageViewModel;
        this.f$1 = modifier;
        this.f$2 = function1;
        this.f$3 = function12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(1);
                MessageFileKt.MessageFile(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, updateChangedFlags);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(1);
                MessageFileKt.MessageTextCustomer(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, updateChangedFlags2);
                break;
        }
        return Unit.INSTANCE;
    }
}
