package com.squareup.cash.support.chat.presenters;

import app.cash.broadway.screen.AskedQuestion;
import com.squareup.cash.support.chat.screens.SupportChatScreens;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class ChatPresenter$models$4$5 implements Function1 {
    public static final ChatPresenter$models$4$5 INSTANCE = new ChatPresenter$models$4$5();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AskedQuestion askedQuestion = (AskedQuestion) obj;
        askedQuestion.getClass();
        return new SupportChatScreens.FlowScreen.ChatTransactionPicker(askedQuestion);
    }
}
