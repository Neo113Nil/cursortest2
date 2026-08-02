package com.stripe.android.uicore.elements;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewModel;
import com.squareup.cash.moneybot.views.chat.EmptyChatKt;
import com.squareup.cash.moneybot.widgets.KeyboardState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class TextFieldUIKt$$ExternalSyntheticLambda8 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ Modifier f$3;
    public final /* synthetic */ Function1 f$4;
    public final /* synthetic */ int f$5;
    public final /* synthetic */ int f$6;
    public final /* synthetic */ Object f$7;
    public final /* synthetic */ boolean f$8;
    public final /* synthetic */ boolean f$9;

    public /* synthetic */ TextFieldUIKt$$ExternalSyntheticLambda8(MoneybotChatViewModel.Content.Empty empty, boolean z, Modifier modifier, KeyboardState keyboardState, int i, int i2, boolean z2, Function1 function1, int i3) {
        this.f$0 = empty;
        this.f$8 = z;
        this.f$3 = modifier;
        this.f$7 = keyboardState;
        this.f$2 = i;
        this.f$5 = i2;
        this.f$9 = z2;
        this.f$4 = function1;
        this.f$6 = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object obj3 = this.f$7;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(1);
                TextFieldUIKt.m4072TextFieldZkbtPhE((SimpleTextFieldController) obj4, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, (FocusRequester) obj3, this.f$8, this.f$9, (Composer) obj, updateChangedFlags);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(this.f$6 | 1);
                EmptyChatKt.EmptyChat((MoneybotChatViewModel.Content.Empty) obj4, this.f$8, this.f$3, (KeyboardState) obj3, this.f$2, this.f$5, this.f$9, this.f$4, (Composer) obj, updateChangedFlags2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ TextFieldUIKt$$ExternalSyntheticLambda8(SimpleTextFieldController simpleTextFieldController, int i, Modifier modifier, Function1 function1, int i2, int i3, FocusRequester focusRequester, boolean z, boolean z2, int i4) {
        this.f$0 = simpleTextFieldController;
        this.f$2 = i;
        this.f$3 = modifier;
        this.f$4 = function1;
        this.f$5 = i2;
        this.f$6 = i3;
        this.f$7 = focusRequester;
        this.f$8 = z;
        this.f$9 = z2;
    }
}
