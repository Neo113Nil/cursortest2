package com.squareup.cash.transfers.presenters;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import app.cash.broadway.presenter.molecule.AnswerDispatcher;
import com.squareup.cash.transfers.screens.InstrumentLinkingOption;
import com.squareup.cash.transfers.screens.InstrumentLinkingOptionsQuestion;
import com.squareup.cash.transfers.screens.RecurringReloadConfigurationQuestion;
import com.squareup.cash.transfers.screens.RecurringReloadConfigurationResult;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;

/* loaded from: classes7.dex */
public final class LinkedAccountsPresenter$models$$inlined$AnswerHandler$1 implements Function1 {
    public final /* synthetic */ AnswerDispatcher $answerDispatcher;
    public final /* synthetic */ Function2 $block;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ LinkedAccountsPresenter$models$$inlined$AnswerHandler$1(Function2 function2, AnswerDispatcher answerDispatcher, int i) {
        this.$r8$classId = i;
        this.$block = function2;
        this.$answerDispatcher = answerDispatcher;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        final AnswerDispatcher answerDispatcher = this.$answerDispatcher;
        Function2 function2 = this.$block;
        switch (i) {
            case 0:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver = new AnswerDispatcher.AnswerReceiver(reflectionFactory.getOrCreateKotlinClass(InstrumentLinkingOption.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory.getOrCreateKotlinClass(InstrumentLinkingOptionsQuestion.class), answerReceiver);
                final int i2 = 0;
                return new DisposableEffectResult() { // from class: com.squareup.cash.transfers.presenters.LinkedAccountsPresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i3 = i2;
                        AnswerDispatcher.AnswerReceiver answerReceiver2 = answerReceiver;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i3) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InstrumentLinkingOptionsQuestion.class), answerReceiver2);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(RecurringReloadConfigurationQuestion.class), answerReceiver2);
                                break;
                        }
                    }
                };
            default:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory2 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver2 = new AnswerDispatcher.AnswerReceiver(reflectionFactory2.getOrCreateKotlinClass(RecurringReloadConfigurationResult.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory2.getOrCreateKotlinClass(RecurringReloadConfigurationQuestion.class), answerReceiver2);
                final int i3 = 1;
                return new DisposableEffectResult() { // from class: com.squareup.cash.transfers.presenters.LinkedAccountsPresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i3;
                        AnswerDispatcher.AnswerReceiver answerReceiver22 = answerReceiver2;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InstrumentLinkingOptionsQuestion.class), answerReceiver22);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(RecurringReloadConfigurationQuestion.class), answerReceiver22);
                                break;
                        }
                    }
                };
        }
    }
}
