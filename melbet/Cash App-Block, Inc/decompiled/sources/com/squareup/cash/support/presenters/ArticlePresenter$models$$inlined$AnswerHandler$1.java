package com.squareup.cash.support.presenters;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import app.cash.broadway.presenter.molecule.AnswerDispatcher;
import com.squareup.cash.instruments.screens.InstrumentSelectionResult;
import com.squareup.cash.instruments.screens.TransferOptionPickerAnswer;
import com.squareup.cash.instruments.screens.TransferOptionPickerQuestion;
import com.squareup.cash.instruments.screens.WhichInstrument;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.moneybot.screens.MoneybotAmountInputAnswer;
import com.squareup.cash.moneybot.screens.MoneybotAmountInputQuestion;
import com.squareup.cash.moneybot.screens.MoneybotFeedbackAnswer;
import com.squareup.cash.moneybot.screens.MoneybotFeedbackQuestion;
import com.squareup.cash.moneybot.screens.MoneybotStaticPickerAnswer;
import com.squareup.cash.moneybot.screens.MoneybotStaticPickerQuestion;
import com.squareup.cash.moneybot.screens.MoneybotTextInputAnswer;
import com.squareup.cash.moneybot.screens.MoneybotTextInputQuestion;
import com.squareup.cash.music.screens.MusicScreen;
import com.squareup.cash.paychecks.screens.CustomAllocationQuestion;
import com.squareup.cash.paychecks.screens.EditDistributionScreen;
import com.squareup.cash.payments.screens.PaymentAmountQuestion;
import com.squareup.cash.payments.screens.PaymentAmountResult;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.screens.PersonalizePaymentResult;
import com.squareup.cash.pools.screens.PoolInvitePeopleQuestion;
import com.squareup.cash.pools.screens.PoolInvitePeopleResult;
import com.squareup.cash.qrcodes.screens.CashtagQrScanQuestion;
import com.squareup.cash.qrcodes.screens.CashtagQrScanResult;
import com.squareup.cash.shopping.screens.AutofillQuestion;
import com.squareup.cash.support.chat.screens.ChatTransactionPickerResult;
import com.squareup.cash.support.chat.screens.ChatTransactionQuestion;
import com.squareup.cash.support.chat.screens.SupportChatScreens;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.support.screens.SupportScreens$FlowScreens$SupportActivityPickerFullScreen$SelectTransactionResult$Success;
import com.squareup.cash.transfers.screens.RecurringReloadConfigurationQuestion;
import com.squareup.cash.transfers.screens.RecurringReloadConfigurationResult;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;

/* loaded from: classes6.dex */
public final class ArticlePresenter$models$$inlined$AnswerHandler$1 implements Function1 {
    public final /* synthetic */ AnswerDispatcher $answerDispatcher;
    public final /* synthetic */ Function2 $block;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ArticlePresenter$models$$inlined$AnswerHandler$1(Function2 function2, AnswerDispatcher answerDispatcher, int i) {
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
                final AnswerDispatcher.AnswerReceiver answerReceiver = new AnswerDispatcher.AnswerReceiver(reflectionFactory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportArticleIncidentsSheetScreen.IncidentsSheetQuestion.Result.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportArticleIncidentsSheetScreen.IncidentsSheetQuestion.class), answerReceiver);
                final int i2 = 0;
                return new DisposableEffectResult() { // from class: com.squareup.cash.support.presenters.ArticlePresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i3 = i2;
                        AnswerDispatcher.AnswerReceiver answerReceiver2 = answerReceiver;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i3) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportArticleIncidentsSheetScreen.IncidentsSheetQuestion.class), answerReceiver2);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.SelectStockQuestion.class), answerReceiver2);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.UpdateCategoryFilterQuestion.class), answerReceiver2);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotFeedbackQuestion.class), answerReceiver2);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotAmountInputQuestion.class), answerReceiver2);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotStaticPickerQuestion.class), answerReceiver2);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(TransferOptionPickerQuestion.class), answerReceiver2);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotTextInputQuestion.class), answerReceiver2);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver2);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(EditDistributionScreen.UpdatedAllocationQuestion.class), answerReceiver2);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver2);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver2);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.DuplicatePayment.DuplicatePaymentQuestion.class), answerReceiver2);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver2);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.SchedulePayment.SchedulePaymentQuestion.class), answerReceiver2);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CashtagQrScanQuestion.class), answerReceiver2);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver2);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentAmountQuestion.class), answerReceiver2);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MusicScreen.MusicQuestion.class), answerReceiver2);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver2);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver2);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PoolInvitePeopleQuestion.class), answerReceiver2);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AutofillQuestion.class), answerReceiver2);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChatTransactionQuestion.class), answerReceiver2);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportActivityPickerFullScreen.SelectTransactionQuestion.class), answerReceiver2);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptQuestion.class), answerReceiver2);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetQuestion.class), answerReceiver2);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationQuestion.class), answerReceiver2);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.SupportHomeContactOptionsSheetQuestion.class), answerReceiver2);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(RecurringReloadConfigurationQuestion.class), answerReceiver2);
                                break;
                        }
                    }
                };
            case 1:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory2 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver2 = new AnswerDispatcher.AnswerReceiver(reflectionFactory2.getOrCreateKotlinClass(Pair.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory2.getOrCreateKotlinClass(InvestingScreens.SelectStockQuestion.class), answerReceiver2);
                final int i3 = 1;
                return new DisposableEffectResult() { // from class: com.squareup.cash.support.presenters.ArticlePresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i3;
                        AnswerDispatcher.AnswerReceiver answerReceiver22 = answerReceiver2;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportArticleIncidentsSheetScreen.IncidentsSheetQuestion.class), answerReceiver22);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.SelectStockQuestion.class), answerReceiver22);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.UpdateCategoryFilterQuestion.class), answerReceiver22);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotFeedbackQuestion.class), answerReceiver22);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotAmountInputQuestion.class), answerReceiver22);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotStaticPickerQuestion.class), answerReceiver22);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(TransferOptionPickerQuestion.class), answerReceiver22);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotTextInputQuestion.class), answerReceiver22);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver22);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(EditDistributionScreen.UpdatedAllocationQuestion.class), answerReceiver22);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver22);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.DuplicatePayment.DuplicatePaymentQuestion.class), answerReceiver22);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.SchedulePayment.SchedulePaymentQuestion.class), answerReceiver22);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CashtagQrScanQuestion.class), answerReceiver22);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver22);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentAmountQuestion.class), answerReceiver22);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MusicScreen.MusicQuestion.class), answerReceiver22);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver22);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PoolInvitePeopleQuestion.class), answerReceiver22);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AutofillQuestion.class), answerReceiver22);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChatTransactionQuestion.class), answerReceiver22);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportActivityPickerFullScreen.SelectTransactionQuestion.class), answerReceiver22);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptQuestion.class), answerReceiver22);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetQuestion.class), answerReceiver22);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationQuestion.class), answerReceiver22);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.SupportHomeContactOptionsSheetQuestion.class), answerReceiver22);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(RecurringReloadConfigurationQuestion.class), answerReceiver22);
                                break;
                        }
                    }
                };
            case 2:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory3 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver3 = new AnswerDispatcher.AnswerReceiver(reflectionFactory3.getOrCreateKotlinClass(Map.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory3.getOrCreateKotlinClass(InvestingScreens.UpdateCategoryFilterQuestion.class), answerReceiver3);
                final int i4 = 2;
                return new DisposableEffectResult() { // from class: com.squareup.cash.support.presenters.ArticlePresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i4;
                        AnswerDispatcher.AnswerReceiver answerReceiver22 = answerReceiver3;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportArticleIncidentsSheetScreen.IncidentsSheetQuestion.class), answerReceiver22);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.SelectStockQuestion.class), answerReceiver22);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.UpdateCategoryFilterQuestion.class), answerReceiver22);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotFeedbackQuestion.class), answerReceiver22);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotAmountInputQuestion.class), answerReceiver22);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotStaticPickerQuestion.class), answerReceiver22);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(TransferOptionPickerQuestion.class), answerReceiver22);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotTextInputQuestion.class), answerReceiver22);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver22);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(EditDistributionScreen.UpdatedAllocationQuestion.class), answerReceiver22);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver22);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.DuplicatePayment.DuplicatePaymentQuestion.class), answerReceiver22);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.SchedulePayment.SchedulePaymentQuestion.class), answerReceiver22);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CashtagQrScanQuestion.class), answerReceiver22);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver22);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentAmountQuestion.class), answerReceiver22);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MusicScreen.MusicQuestion.class), answerReceiver22);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver22);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PoolInvitePeopleQuestion.class), answerReceiver22);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AutofillQuestion.class), answerReceiver22);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChatTransactionQuestion.class), answerReceiver22);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportActivityPickerFullScreen.SelectTransactionQuestion.class), answerReceiver22);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptQuestion.class), answerReceiver22);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetQuestion.class), answerReceiver22);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationQuestion.class), answerReceiver22);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.SupportHomeContactOptionsSheetQuestion.class), answerReceiver22);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(RecurringReloadConfigurationQuestion.class), answerReceiver22);
                                break;
                        }
                    }
                };
            case 3:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory4 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver4 = new AnswerDispatcher.AnswerReceiver(reflectionFactory4.getOrCreateKotlinClass(MoneybotFeedbackAnswer.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory4.getOrCreateKotlinClass(MoneybotFeedbackQuestion.class), answerReceiver4);
                final int i5 = 3;
                return new DisposableEffectResult() { // from class: com.squareup.cash.support.presenters.ArticlePresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i5;
                        AnswerDispatcher.AnswerReceiver answerReceiver22 = answerReceiver4;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportArticleIncidentsSheetScreen.IncidentsSheetQuestion.class), answerReceiver22);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.SelectStockQuestion.class), answerReceiver22);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.UpdateCategoryFilterQuestion.class), answerReceiver22);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotFeedbackQuestion.class), answerReceiver22);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotAmountInputQuestion.class), answerReceiver22);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotStaticPickerQuestion.class), answerReceiver22);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(TransferOptionPickerQuestion.class), answerReceiver22);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotTextInputQuestion.class), answerReceiver22);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver22);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(EditDistributionScreen.UpdatedAllocationQuestion.class), answerReceiver22);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver22);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.DuplicatePayment.DuplicatePaymentQuestion.class), answerReceiver22);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.SchedulePayment.SchedulePaymentQuestion.class), answerReceiver22);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CashtagQrScanQuestion.class), answerReceiver22);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver22);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentAmountQuestion.class), answerReceiver22);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MusicScreen.MusicQuestion.class), answerReceiver22);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver22);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PoolInvitePeopleQuestion.class), answerReceiver22);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AutofillQuestion.class), answerReceiver22);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChatTransactionQuestion.class), answerReceiver22);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportActivityPickerFullScreen.SelectTransactionQuestion.class), answerReceiver22);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptQuestion.class), answerReceiver22);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetQuestion.class), answerReceiver22);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationQuestion.class), answerReceiver22);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.SupportHomeContactOptionsSheetQuestion.class), answerReceiver22);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(RecurringReloadConfigurationQuestion.class), answerReceiver22);
                                break;
                        }
                    }
                };
            case 4:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory5 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver5 = new AnswerDispatcher.AnswerReceiver(reflectionFactory5.getOrCreateKotlinClass(MoneybotAmountInputAnswer.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory5.getOrCreateKotlinClass(MoneybotAmountInputQuestion.class), answerReceiver5);
                final int i6 = 4;
                return new DisposableEffectResult() { // from class: com.squareup.cash.support.presenters.ArticlePresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i6;
                        AnswerDispatcher.AnswerReceiver answerReceiver22 = answerReceiver5;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportArticleIncidentsSheetScreen.IncidentsSheetQuestion.class), answerReceiver22);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.SelectStockQuestion.class), answerReceiver22);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.UpdateCategoryFilterQuestion.class), answerReceiver22);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotFeedbackQuestion.class), answerReceiver22);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotAmountInputQuestion.class), answerReceiver22);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotStaticPickerQuestion.class), answerReceiver22);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(TransferOptionPickerQuestion.class), answerReceiver22);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotTextInputQuestion.class), answerReceiver22);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver22);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(EditDistributionScreen.UpdatedAllocationQuestion.class), answerReceiver22);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver22);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.DuplicatePayment.DuplicatePaymentQuestion.class), answerReceiver22);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.SchedulePayment.SchedulePaymentQuestion.class), answerReceiver22);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CashtagQrScanQuestion.class), answerReceiver22);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver22);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentAmountQuestion.class), answerReceiver22);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MusicScreen.MusicQuestion.class), answerReceiver22);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver22);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PoolInvitePeopleQuestion.class), answerReceiver22);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AutofillQuestion.class), answerReceiver22);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChatTransactionQuestion.class), answerReceiver22);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportActivityPickerFullScreen.SelectTransactionQuestion.class), answerReceiver22);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptQuestion.class), answerReceiver22);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetQuestion.class), answerReceiver22);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationQuestion.class), answerReceiver22);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.SupportHomeContactOptionsSheetQuestion.class), answerReceiver22);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(RecurringReloadConfigurationQuestion.class), answerReceiver22);
                                break;
                        }
                    }
                };
            case 5:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory6 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver6 = new AnswerDispatcher.AnswerReceiver(reflectionFactory6.getOrCreateKotlinClass(MoneybotStaticPickerAnswer.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory6.getOrCreateKotlinClass(MoneybotStaticPickerQuestion.class), answerReceiver6);
                final int i7 = 5;
                return new DisposableEffectResult() { // from class: com.squareup.cash.support.presenters.ArticlePresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i7;
                        AnswerDispatcher.AnswerReceiver answerReceiver22 = answerReceiver6;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportArticleIncidentsSheetScreen.IncidentsSheetQuestion.class), answerReceiver22);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.SelectStockQuestion.class), answerReceiver22);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.UpdateCategoryFilterQuestion.class), answerReceiver22);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotFeedbackQuestion.class), answerReceiver22);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotAmountInputQuestion.class), answerReceiver22);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotStaticPickerQuestion.class), answerReceiver22);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(TransferOptionPickerQuestion.class), answerReceiver22);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotTextInputQuestion.class), answerReceiver22);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver22);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(EditDistributionScreen.UpdatedAllocationQuestion.class), answerReceiver22);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver22);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.DuplicatePayment.DuplicatePaymentQuestion.class), answerReceiver22);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.SchedulePayment.SchedulePaymentQuestion.class), answerReceiver22);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CashtagQrScanQuestion.class), answerReceiver22);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver22);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentAmountQuestion.class), answerReceiver22);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MusicScreen.MusicQuestion.class), answerReceiver22);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver22);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PoolInvitePeopleQuestion.class), answerReceiver22);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AutofillQuestion.class), answerReceiver22);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChatTransactionQuestion.class), answerReceiver22);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportActivityPickerFullScreen.SelectTransactionQuestion.class), answerReceiver22);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptQuestion.class), answerReceiver22);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetQuestion.class), answerReceiver22);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationQuestion.class), answerReceiver22);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.SupportHomeContactOptionsSheetQuestion.class), answerReceiver22);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(RecurringReloadConfigurationQuestion.class), answerReceiver22);
                                break;
                        }
                    }
                };
            case 6:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory7 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver7 = new AnswerDispatcher.AnswerReceiver(reflectionFactory7.getOrCreateKotlinClass(TransferOptionPickerAnswer.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory7.getOrCreateKotlinClass(TransferOptionPickerQuestion.class), answerReceiver7);
                final int i8 = 6;
                return new DisposableEffectResult() { // from class: com.squareup.cash.support.presenters.ArticlePresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i8;
                        AnswerDispatcher.AnswerReceiver answerReceiver22 = answerReceiver7;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportArticleIncidentsSheetScreen.IncidentsSheetQuestion.class), answerReceiver22);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.SelectStockQuestion.class), answerReceiver22);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.UpdateCategoryFilterQuestion.class), answerReceiver22);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotFeedbackQuestion.class), answerReceiver22);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotAmountInputQuestion.class), answerReceiver22);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotStaticPickerQuestion.class), answerReceiver22);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(TransferOptionPickerQuestion.class), answerReceiver22);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotTextInputQuestion.class), answerReceiver22);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver22);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(EditDistributionScreen.UpdatedAllocationQuestion.class), answerReceiver22);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver22);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.DuplicatePayment.DuplicatePaymentQuestion.class), answerReceiver22);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.SchedulePayment.SchedulePaymentQuestion.class), answerReceiver22);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CashtagQrScanQuestion.class), answerReceiver22);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver22);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentAmountQuestion.class), answerReceiver22);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MusicScreen.MusicQuestion.class), answerReceiver22);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver22);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PoolInvitePeopleQuestion.class), answerReceiver22);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AutofillQuestion.class), answerReceiver22);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChatTransactionQuestion.class), answerReceiver22);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportActivityPickerFullScreen.SelectTransactionQuestion.class), answerReceiver22);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptQuestion.class), answerReceiver22);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetQuestion.class), answerReceiver22);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationQuestion.class), answerReceiver22);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.SupportHomeContactOptionsSheetQuestion.class), answerReceiver22);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(RecurringReloadConfigurationQuestion.class), answerReceiver22);
                                break;
                        }
                    }
                };
            case 7:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory8 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver8 = new AnswerDispatcher.AnswerReceiver(reflectionFactory8.getOrCreateKotlinClass(MoneybotTextInputAnswer.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory8.getOrCreateKotlinClass(MoneybotTextInputQuestion.class), answerReceiver8);
                final int i9 = 7;
                return new DisposableEffectResult() { // from class: com.squareup.cash.support.presenters.ArticlePresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i9;
                        AnswerDispatcher.AnswerReceiver answerReceiver22 = answerReceiver8;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportArticleIncidentsSheetScreen.IncidentsSheetQuestion.class), answerReceiver22);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.SelectStockQuestion.class), answerReceiver22);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.UpdateCategoryFilterQuestion.class), answerReceiver22);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotFeedbackQuestion.class), answerReceiver22);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotAmountInputQuestion.class), answerReceiver22);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotStaticPickerQuestion.class), answerReceiver22);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(TransferOptionPickerQuestion.class), answerReceiver22);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotTextInputQuestion.class), answerReceiver22);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver22);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(EditDistributionScreen.UpdatedAllocationQuestion.class), answerReceiver22);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver22);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.DuplicatePayment.DuplicatePaymentQuestion.class), answerReceiver22);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.SchedulePayment.SchedulePaymentQuestion.class), answerReceiver22);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CashtagQrScanQuestion.class), answerReceiver22);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver22);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentAmountQuestion.class), answerReceiver22);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MusicScreen.MusicQuestion.class), answerReceiver22);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver22);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PoolInvitePeopleQuestion.class), answerReceiver22);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AutofillQuestion.class), answerReceiver22);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChatTransactionQuestion.class), answerReceiver22);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportActivityPickerFullScreen.SelectTransactionQuestion.class), answerReceiver22);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptQuestion.class), answerReceiver22);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetQuestion.class), answerReceiver22);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationQuestion.class), answerReceiver22);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.SupportHomeContactOptionsSheetQuestion.class), answerReceiver22);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(RecurringReloadConfigurationQuestion.class), answerReceiver22);
                                break;
                        }
                    }
                };
            case 8:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory9 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver9 = new AnswerDispatcher.AnswerReceiver(reflectionFactory9.getOrCreateKotlinClass(Float.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory9.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver9);
                final int i10 = 8;
                return new DisposableEffectResult() { // from class: com.squareup.cash.support.presenters.ArticlePresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i10;
                        AnswerDispatcher.AnswerReceiver answerReceiver22 = answerReceiver9;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportArticleIncidentsSheetScreen.IncidentsSheetQuestion.class), answerReceiver22);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.SelectStockQuestion.class), answerReceiver22);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.UpdateCategoryFilterQuestion.class), answerReceiver22);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotFeedbackQuestion.class), answerReceiver22);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotAmountInputQuestion.class), answerReceiver22);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotStaticPickerQuestion.class), answerReceiver22);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(TransferOptionPickerQuestion.class), answerReceiver22);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotTextInputQuestion.class), answerReceiver22);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver22);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(EditDistributionScreen.UpdatedAllocationQuestion.class), answerReceiver22);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver22);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.DuplicatePayment.DuplicatePaymentQuestion.class), answerReceiver22);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.SchedulePayment.SchedulePaymentQuestion.class), answerReceiver22);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CashtagQrScanQuestion.class), answerReceiver22);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver22);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentAmountQuestion.class), answerReceiver22);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MusicScreen.MusicQuestion.class), answerReceiver22);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver22);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PoolInvitePeopleQuestion.class), answerReceiver22);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AutofillQuestion.class), answerReceiver22);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChatTransactionQuestion.class), answerReceiver22);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportActivityPickerFullScreen.SelectTransactionQuestion.class), answerReceiver22);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptQuestion.class), answerReceiver22);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetQuestion.class), answerReceiver22);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationQuestion.class), answerReceiver22);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.SupportHomeContactOptionsSheetQuestion.class), answerReceiver22);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(RecurringReloadConfigurationQuestion.class), answerReceiver22);
                                break;
                        }
                    }
                };
            case 9:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory10 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver10 = new AnswerDispatcher.AnswerReceiver(reflectionFactory10.getOrCreateKotlinClass(Map.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory10.getOrCreateKotlinClass(EditDistributionScreen.UpdatedAllocationQuestion.class), answerReceiver10);
                final int i11 = 9;
                return new DisposableEffectResult() { // from class: com.squareup.cash.support.presenters.ArticlePresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i11;
                        AnswerDispatcher.AnswerReceiver answerReceiver22 = answerReceiver10;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportArticleIncidentsSheetScreen.IncidentsSheetQuestion.class), answerReceiver22);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.SelectStockQuestion.class), answerReceiver22);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.UpdateCategoryFilterQuestion.class), answerReceiver22);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotFeedbackQuestion.class), answerReceiver22);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotAmountInputQuestion.class), answerReceiver22);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotStaticPickerQuestion.class), answerReceiver22);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(TransferOptionPickerQuestion.class), answerReceiver22);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotTextInputQuestion.class), answerReceiver22);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver22);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(EditDistributionScreen.UpdatedAllocationQuestion.class), answerReceiver22);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver22);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.DuplicatePayment.DuplicatePaymentQuestion.class), answerReceiver22);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.SchedulePayment.SchedulePaymentQuestion.class), answerReceiver22);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CashtagQrScanQuestion.class), answerReceiver22);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver22);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentAmountQuestion.class), answerReceiver22);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MusicScreen.MusicQuestion.class), answerReceiver22);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver22);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PoolInvitePeopleQuestion.class), answerReceiver22);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AutofillQuestion.class), answerReceiver22);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChatTransactionQuestion.class), answerReceiver22);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportActivityPickerFullScreen.SelectTransactionQuestion.class), answerReceiver22);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptQuestion.class), answerReceiver22);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetQuestion.class), answerReceiver22);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationQuestion.class), answerReceiver22);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.SupportHomeContactOptionsSheetQuestion.class), answerReceiver22);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(RecurringReloadConfigurationQuestion.class), answerReceiver22);
                                break;
                        }
                    }
                };
            case 10:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory11 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver11 = new AnswerDispatcher.AnswerReceiver(reflectionFactory11.getOrCreateKotlinClass(Float.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory11.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver11);
                final int i12 = 10;
                return new DisposableEffectResult() { // from class: com.squareup.cash.support.presenters.ArticlePresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i12;
                        AnswerDispatcher.AnswerReceiver answerReceiver22 = answerReceiver11;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportArticleIncidentsSheetScreen.IncidentsSheetQuestion.class), answerReceiver22);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.SelectStockQuestion.class), answerReceiver22);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.UpdateCategoryFilterQuestion.class), answerReceiver22);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotFeedbackQuestion.class), answerReceiver22);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotAmountInputQuestion.class), answerReceiver22);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotStaticPickerQuestion.class), answerReceiver22);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(TransferOptionPickerQuestion.class), answerReceiver22);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotTextInputQuestion.class), answerReceiver22);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver22);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(EditDistributionScreen.UpdatedAllocationQuestion.class), answerReceiver22);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver22);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.DuplicatePayment.DuplicatePaymentQuestion.class), answerReceiver22);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.SchedulePayment.SchedulePaymentQuestion.class), answerReceiver22);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CashtagQrScanQuestion.class), answerReceiver22);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver22);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentAmountQuestion.class), answerReceiver22);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MusicScreen.MusicQuestion.class), answerReceiver22);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver22);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PoolInvitePeopleQuestion.class), answerReceiver22);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AutofillQuestion.class), answerReceiver22);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChatTransactionQuestion.class), answerReceiver22);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportActivityPickerFullScreen.SelectTransactionQuestion.class), answerReceiver22);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptQuestion.class), answerReceiver22);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetQuestion.class), answerReceiver22);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationQuestion.class), answerReceiver22);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.SupportHomeContactOptionsSheetQuestion.class), answerReceiver22);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(RecurringReloadConfigurationQuestion.class), answerReceiver22);
                                break;
                        }
                    }
                };
            case 11:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory12 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver12 = new AnswerDispatcher.AnswerReceiver(reflectionFactory12.getOrCreateKotlinClass(InstrumentSelectionResult.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory12.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver12);
                final int i13 = 11;
                return new DisposableEffectResult() { // from class: com.squareup.cash.support.presenters.ArticlePresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i13;
                        AnswerDispatcher.AnswerReceiver answerReceiver22 = answerReceiver12;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportArticleIncidentsSheetScreen.IncidentsSheetQuestion.class), answerReceiver22);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.SelectStockQuestion.class), answerReceiver22);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.UpdateCategoryFilterQuestion.class), answerReceiver22);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotFeedbackQuestion.class), answerReceiver22);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotAmountInputQuestion.class), answerReceiver22);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotStaticPickerQuestion.class), answerReceiver22);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(TransferOptionPickerQuestion.class), answerReceiver22);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotTextInputQuestion.class), answerReceiver22);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver22);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(EditDistributionScreen.UpdatedAllocationQuestion.class), answerReceiver22);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver22);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.DuplicatePayment.DuplicatePaymentQuestion.class), answerReceiver22);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.SchedulePayment.SchedulePaymentQuestion.class), answerReceiver22);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CashtagQrScanQuestion.class), answerReceiver22);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver22);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentAmountQuestion.class), answerReceiver22);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MusicScreen.MusicQuestion.class), answerReceiver22);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver22);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PoolInvitePeopleQuestion.class), answerReceiver22);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AutofillQuestion.class), answerReceiver22);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChatTransactionQuestion.class), answerReceiver22);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportActivityPickerFullScreen.SelectTransactionQuestion.class), answerReceiver22);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptQuestion.class), answerReceiver22);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetQuestion.class), answerReceiver22);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationQuestion.class), answerReceiver22);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.SupportHomeContactOptionsSheetQuestion.class), answerReceiver22);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(RecurringReloadConfigurationQuestion.class), answerReceiver22);
                                break;
                        }
                    }
                };
            case 12:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory13 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver13 = new AnswerDispatcher.AnswerReceiver(reflectionFactory13.getOrCreateKotlinClass(PaymentScreens.DuplicatePayment.DuplicatePaymentResult.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory13.getOrCreateKotlinClass(PaymentScreens.DuplicatePayment.DuplicatePaymentQuestion.class), answerReceiver13);
                final int i14 = 12;
                return new DisposableEffectResult() { // from class: com.squareup.cash.support.presenters.ArticlePresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i14;
                        AnswerDispatcher.AnswerReceiver answerReceiver22 = answerReceiver13;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportArticleIncidentsSheetScreen.IncidentsSheetQuestion.class), answerReceiver22);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.SelectStockQuestion.class), answerReceiver22);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.UpdateCategoryFilterQuestion.class), answerReceiver22);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotFeedbackQuestion.class), answerReceiver22);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotAmountInputQuestion.class), answerReceiver22);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotStaticPickerQuestion.class), answerReceiver22);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(TransferOptionPickerQuestion.class), answerReceiver22);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotTextInputQuestion.class), answerReceiver22);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver22);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(EditDistributionScreen.UpdatedAllocationQuestion.class), answerReceiver22);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver22);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.DuplicatePayment.DuplicatePaymentQuestion.class), answerReceiver22);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.SchedulePayment.SchedulePaymentQuestion.class), answerReceiver22);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CashtagQrScanQuestion.class), answerReceiver22);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver22);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentAmountQuestion.class), answerReceiver22);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MusicScreen.MusicQuestion.class), answerReceiver22);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver22);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PoolInvitePeopleQuestion.class), answerReceiver22);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AutofillQuestion.class), answerReceiver22);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChatTransactionQuestion.class), answerReceiver22);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportActivityPickerFullScreen.SelectTransactionQuestion.class), answerReceiver22);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptQuestion.class), answerReceiver22);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetQuestion.class), answerReceiver22);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationQuestion.class), answerReceiver22);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.SupportHomeContactOptionsSheetQuestion.class), answerReceiver22);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(RecurringReloadConfigurationQuestion.class), answerReceiver22);
                                break;
                        }
                    }
                };
            case 13:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory14 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver14 = new AnswerDispatcher.AnswerReceiver(reflectionFactory14.getOrCreateKotlinClass(InstrumentSelectionResult.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory14.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver14);
                final int i15 = 13;
                return new DisposableEffectResult() { // from class: com.squareup.cash.support.presenters.ArticlePresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i15;
                        AnswerDispatcher.AnswerReceiver answerReceiver22 = answerReceiver14;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportArticleIncidentsSheetScreen.IncidentsSheetQuestion.class), answerReceiver22);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.SelectStockQuestion.class), answerReceiver22);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.UpdateCategoryFilterQuestion.class), answerReceiver22);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotFeedbackQuestion.class), answerReceiver22);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotAmountInputQuestion.class), answerReceiver22);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotStaticPickerQuestion.class), answerReceiver22);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(TransferOptionPickerQuestion.class), answerReceiver22);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotTextInputQuestion.class), answerReceiver22);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver22);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(EditDistributionScreen.UpdatedAllocationQuestion.class), answerReceiver22);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver22);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.DuplicatePayment.DuplicatePaymentQuestion.class), answerReceiver22);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.SchedulePayment.SchedulePaymentQuestion.class), answerReceiver22);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CashtagQrScanQuestion.class), answerReceiver22);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver22);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentAmountQuestion.class), answerReceiver22);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MusicScreen.MusicQuestion.class), answerReceiver22);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver22);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PoolInvitePeopleQuestion.class), answerReceiver22);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AutofillQuestion.class), answerReceiver22);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChatTransactionQuestion.class), answerReceiver22);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportActivityPickerFullScreen.SelectTransactionQuestion.class), answerReceiver22);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptQuestion.class), answerReceiver22);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetQuestion.class), answerReceiver22);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationQuestion.class), answerReceiver22);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.SupportHomeContactOptionsSheetQuestion.class), answerReceiver22);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(RecurringReloadConfigurationQuestion.class), answerReceiver22);
                                break;
                        }
                    }
                };
            case 14:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory15 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver15 = new AnswerDispatcher.AnswerReceiver(reflectionFactory15.getOrCreateKotlinClass(PaymentScreens.SchedulePayment.SchedulePaymentAnswer.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory15.getOrCreateKotlinClass(PaymentScreens.SchedulePayment.SchedulePaymentQuestion.class), answerReceiver15);
                final int i16 = 14;
                return new DisposableEffectResult() { // from class: com.squareup.cash.support.presenters.ArticlePresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i16;
                        AnswerDispatcher.AnswerReceiver answerReceiver22 = answerReceiver15;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportArticleIncidentsSheetScreen.IncidentsSheetQuestion.class), answerReceiver22);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.SelectStockQuestion.class), answerReceiver22);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.UpdateCategoryFilterQuestion.class), answerReceiver22);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotFeedbackQuestion.class), answerReceiver22);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotAmountInputQuestion.class), answerReceiver22);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotStaticPickerQuestion.class), answerReceiver22);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(TransferOptionPickerQuestion.class), answerReceiver22);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotTextInputQuestion.class), answerReceiver22);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver22);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(EditDistributionScreen.UpdatedAllocationQuestion.class), answerReceiver22);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver22);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.DuplicatePayment.DuplicatePaymentQuestion.class), answerReceiver22);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.SchedulePayment.SchedulePaymentQuestion.class), answerReceiver22);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CashtagQrScanQuestion.class), answerReceiver22);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver22);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentAmountQuestion.class), answerReceiver22);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MusicScreen.MusicQuestion.class), answerReceiver22);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver22);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PoolInvitePeopleQuestion.class), answerReceiver22);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AutofillQuestion.class), answerReceiver22);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChatTransactionQuestion.class), answerReceiver22);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportActivityPickerFullScreen.SelectTransactionQuestion.class), answerReceiver22);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptQuestion.class), answerReceiver22);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetQuestion.class), answerReceiver22);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationQuestion.class), answerReceiver22);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.SupportHomeContactOptionsSheetQuestion.class), answerReceiver22);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(RecurringReloadConfigurationQuestion.class), answerReceiver22);
                                break;
                        }
                    }
                };
            case 15:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory16 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver16 = new AnswerDispatcher.AnswerReceiver(reflectionFactory16.getOrCreateKotlinClass(CashtagQrScanResult.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory16.getOrCreateKotlinClass(CashtagQrScanQuestion.class), answerReceiver16);
                final int i17 = 15;
                return new DisposableEffectResult() { // from class: com.squareup.cash.support.presenters.ArticlePresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i17;
                        AnswerDispatcher.AnswerReceiver answerReceiver22 = answerReceiver16;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportArticleIncidentsSheetScreen.IncidentsSheetQuestion.class), answerReceiver22);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.SelectStockQuestion.class), answerReceiver22);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.UpdateCategoryFilterQuestion.class), answerReceiver22);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotFeedbackQuestion.class), answerReceiver22);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotAmountInputQuestion.class), answerReceiver22);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotStaticPickerQuestion.class), answerReceiver22);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(TransferOptionPickerQuestion.class), answerReceiver22);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotTextInputQuestion.class), answerReceiver22);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver22);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(EditDistributionScreen.UpdatedAllocationQuestion.class), answerReceiver22);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver22);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.DuplicatePayment.DuplicatePaymentQuestion.class), answerReceiver22);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.SchedulePayment.SchedulePaymentQuestion.class), answerReceiver22);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CashtagQrScanQuestion.class), answerReceiver22);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver22);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentAmountQuestion.class), answerReceiver22);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MusicScreen.MusicQuestion.class), answerReceiver22);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver22);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PoolInvitePeopleQuestion.class), answerReceiver22);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AutofillQuestion.class), answerReceiver22);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChatTransactionQuestion.class), answerReceiver22);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportActivityPickerFullScreen.SelectTransactionQuestion.class), answerReceiver22);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptQuestion.class), answerReceiver22);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetQuestion.class), answerReceiver22);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationQuestion.class), answerReceiver22);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.SupportHomeContactOptionsSheetQuestion.class), answerReceiver22);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(RecurringReloadConfigurationQuestion.class), answerReceiver22);
                                break;
                        }
                    }
                };
            case 16:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory17 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver17 = new AnswerDispatcher.AnswerReceiver(reflectionFactory17.getOrCreateKotlinClass(PersonalizePaymentResult.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory17.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver17);
                final int i18 = 16;
                return new DisposableEffectResult() { // from class: com.squareup.cash.support.presenters.ArticlePresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i18;
                        AnswerDispatcher.AnswerReceiver answerReceiver22 = answerReceiver17;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportArticleIncidentsSheetScreen.IncidentsSheetQuestion.class), answerReceiver22);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.SelectStockQuestion.class), answerReceiver22);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.UpdateCategoryFilterQuestion.class), answerReceiver22);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotFeedbackQuestion.class), answerReceiver22);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotAmountInputQuestion.class), answerReceiver22);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotStaticPickerQuestion.class), answerReceiver22);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(TransferOptionPickerQuestion.class), answerReceiver22);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotTextInputQuestion.class), answerReceiver22);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver22);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(EditDistributionScreen.UpdatedAllocationQuestion.class), answerReceiver22);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver22);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.DuplicatePayment.DuplicatePaymentQuestion.class), answerReceiver22);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.SchedulePayment.SchedulePaymentQuestion.class), answerReceiver22);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CashtagQrScanQuestion.class), answerReceiver22);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver22);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentAmountQuestion.class), answerReceiver22);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MusicScreen.MusicQuestion.class), answerReceiver22);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver22);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PoolInvitePeopleQuestion.class), answerReceiver22);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AutofillQuestion.class), answerReceiver22);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChatTransactionQuestion.class), answerReceiver22);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportActivityPickerFullScreen.SelectTransactionQuestion.class), answerReceiver22);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptQuestion.class), answerReceiver22);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetQuestion.class), answerReceiver22);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationQuestion.class), answerReceiver22);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.SupportHomeContactOptionsSheetQuestion.class), answerReceiver22);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(RecurringReloadConfigurationQuestion.class), answerReceiver22);
                                break;
                        }
                    }
                };
            case 17:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory18 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver18 = new AnswerDispatcher.AnswerReceiver(reflectionFactory18.getOrCreateKotlinClass(PaymentAmountResult.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory18.getOrCreateKotlinClass(PaymentAmountQuestion.class), answerReceiver18);
                final int i19 = 17;
                return new DisposableEffectResult() { // from class: com.squareup.cash.support.presenters.ArticlePresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i19;
                        AnswerDispatcher.AnswerReceiver answerReceiver22 = answerReceiver18;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportArticleIncidentsSheetScreen.IncidentsSheetQuestion.class), answerReceiver22);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.SelectStockQuestion.class), answerReceiver22);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.UpdateCategoryFilterQuestion.class), answerReceiver22);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotFeedbackQuestion.class), answerReceiver22);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotAmountInputQuestion.class), answerReceiver22);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotStaticPickerQuestion.class), answerReceiver22);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(TransferOptionPickerQuestion.class), answerReceiver22);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotTextInputQuestion.class), answerReceiver22);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver22);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(EditDistributionScreen.UpdatedAllocationQuestion.class), answerReceiver22);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver22);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.DuplicatePayment.DuplicatePaymentQuestion.class), answerReceiver22);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.SchedulePayment.SchedulePaymentQuestion.class), answerReceiver22);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CashtagQrScanQuestion.class), answerReceiver22);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver22);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentAmountQuestion.class), answerReceiver22);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MusicScreen.MusicQuestion.class), answerReceiver22);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver22);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PoolInvitePeopleQuestion.class), answerReceiver22);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AutofillQuestion.class), answerReceiver22);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChatTransactionQuestion.class), answerReceiver22);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportActivityPickerFullScreen.SelectTransactionQuestion.class), answerReceiver22);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptQuestion.class), answerReceiver22);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetQuestion.class), answerReceiver22);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationQuestion.class), answerReceiver22);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.SupportHomeContactOptionsSheetQuestion.class), answerReceiver22);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(RecurringReloadConfigurationQuestion.class), answerReceiver22);
                                break;
                        }
                    }
                };
            case 18:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory19 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver19 = new AnswerDispatcher.AnswerReceiver(reflectionFactory19.getOrCreateKotlinClass(MusicScreen.SelectedTrackResult.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory19.getOrCreateKotlinClass(MusicScreen.MusicQuestion.class), answerReceiver19);
                final int i20 = 18;
                return new DisposableEffectResult() { // from class: com.squareup.cash.support.presenters.ArticlePresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i20;
                        AnswerDispatcher.AnswerReceiver answerReceiver22 = answerReceiver19;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportArticleIncidentsSheetScreen.IncidentsSheetQuestion.class), answerReceiver22);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.SelectStockQuestion.class), answerReceiver22);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.UpdateCategoryFilterQuestion.class), answerReceiver22);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotFeedbackQuestion.class), answerReceiver22);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotAmountInputQuestion.class), answerReceiver22);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotStaticPickerQuestion.class), answerReceiver22);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(TransferOptionPickerQuestion.class), answerReceiver22);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotTextInputQuestion.class), answerReceiver22);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver22);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(EditDistributionScreen.UpdatedAllocationQuestion.class), answerReceiver22);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver22);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.DuplicatePayment.DuplicatePaymentQuestion.class), answerReceiver22);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.SchedulePayment.SchedulePaymentQuestion.class), answerReceiver22);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CashtagQrScanQuestion.class), answerReceiver22);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver22);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentAmountQuestion.class), answerReceiver22);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MusicScreen.MusicQuestion.class), answerReceiver22);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver22);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PoolInvitePeopleQuestion.class), answerReceiver22);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AutofillQuestion.class), answerReceiver22);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChatTransactionQuestion.class), answerReceiver22);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportActivityPickerFullScreen.SelectTransactionQuestion.class), answerReceiver22);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptQuestion.class), answerReceiver22);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetQuestion.class), answerReceiver22);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationQuestion.class), answerReceiver22);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.SupportHomeContactOptionsSheetQuestion.class), answerReceiver22);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(RecurringReloadConfigurationQuestion.class), answerReceiver22);
                                break;
                        }
                    }
                };
            case 19:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory20 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver20 = new AnswerDispatcher.AnswerReceiver(reflectionFactory20.getOrCreateKotlinClass(PersonalizePaymentResult.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory20.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver20);
                final int i21 = 19;
                return new DisposableEffectResult() { // from class: com.squareup.cash.support.presenters.ArticlePresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i21;
                        AnswerDispatcher.AnswerReceiver answerReceiver22 = answerReceiver20;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportArticleIncidentsSheetScreen.IncidentsSheetQuestion.class), answerReceiver22);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.SelectStockQuestion.class), answerReceiver22);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.UpdateCategoryFilterQuestion.class), answerReceiver22);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotFeedbackQuestion.class), answerReceiver22);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotAmountInputQuestion.class), answerReceiver22);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotStaticPickerQuestion.class), answerReceiver22);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(TransferOptionPickerQuestion.class), answerReceiver22);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotTextInputQuestion.class), answerReceiver22);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver22);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(EditDistributionScreen.UpdatedAllocationQuestion.class), answerReceiver22);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver22);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.DuplicatePayment.DuplicatePaymentQuestion.class), answerReceiver22);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.SchedulePayment.SchedulePaymentQuestion.class), answerReceiver22);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CashtagQrScanQuestion.class), answerReceiver22);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver22);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentAmountQuestion.class), answerReceiver22);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MusicScreen.MusicQuestion.class), answerReceiver22);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver22);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PoolInvitePeopleQuestion.class), answerReceiver22);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AutofillQuestion.class), answerReceiver22);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChatTransactionQuestion.class), answerReceiver22);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportActivityPickerFullScreen.SelectTransactionQuestion.class), answerReceiver22);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptQuestion.class), answerReceiver22);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetQuestion.class), answerReceiver22);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationQuestion.class), answerReceiver22);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.SupportHomeContactOptionsSheetQuestion.class), answerReceiver22);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(RecurringReloadConfigurationQuestion.class), answerReceiver22);
                                break;
                        }
                    }
                };
            case 20:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory21 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver21 = new AnswerDispatcher.AnswerReceiver(reflectionFactory21.getOrCreateKotlinClass(InstrumentSelectionResult.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory21.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver21);
                final int i22 = 20;
                return new DisposableEffectResult() { // from class: com.squareup.cash.support.presenters.ArticlePresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i22;
                        AnswerDispatcher.AnswerReceiver answerReceiver22 = answerReceiver21;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportArticleIncidentsSheetScreen.IncidentsSheetQuestion.class), answerReceiver22);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.SelectStockQuestion.class), answerReceiver22);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.UpdateCategoryFilterQuestion.class), answerReceiver22);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotFeedbackQuestion.class), answerReceiver22);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotAmountInputQuestion.class), answerReceiver22);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotStaticPickerQuestion.class), answerReceiver22);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(TransferOptionPickerQuestion.class), answerReceiver22);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotTextInputQuestion.class), answerReceiver22);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver22);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(EditDistributionScreen.UpdatedAllocationQuestion.class), answerReceiver22);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver22);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.DuplicatePayment.DuplicatePaymentQuestion.class), answerReceiver22);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.SchedulePayment.SchedulePaymentQuestion.class), answerReceiver22);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CashtagQrScanQuestion.class), answerReceiver22);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver22);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentAmountQuestion.class), answerReceiver22);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MusicScreen.MusicQuestion.class), answerReceiver22);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver22);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver22);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PoolInvitePeopleQuestion.class), answerReceiver22);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AutofillQuestion.class), answerReceiver22);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChatTransactionQuestion.class), answerReceiver22);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportActivityPickerFullScreen.SelectTransactionQuestion.class), answerReceiver22);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptQuestion.class), answerReceiver22);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetQuestion.class), answerReceiver22);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationQuestion.class), answerReceiver22);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.SupportHomeContactOptionsSheetQuestion.class), answerReceiver22);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(RecurringReloadConfigurationQuestion.class), answerReceiver22);
                                break;
                        }
                    }
                };
            case 21:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory22 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver22 = new AnswerDispatcher.AnswerReceiver(reflectionFactory22.getOrCreateKotlinClass(PoolInvitePeopleResult.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory22.getOrCreateKotlinClass(PoolInvitePeopleQuestion.class), answerReceiver22);
                final int i23 = 21;
                return new DisposableEffectResult() { // from class: com.squareup.cash.support.presenters.ArticlePresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i23;
                        AnswerDispatcher.AnswerReceiver answerReceiver222 = answerReceiver22;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportArticleIncidentsSheetScreen.IncidentsSheetQuestion.class), answerReceiver222);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.SelectStockQuestion.class), answerReceiver222);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.UpdateCategoryFilterQuestion.class), answerReceiver222);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotFeedbackQuestion.class), answerReceiver222);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotAmountInputQuestion.class), answerReceiver222);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotStaticPickerQuestion.class), answerReceiver222);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(TransferOptionPickerQuestion.class), answerReceiver222);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotTextInputQuestion.class), answerReceiver222);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver222);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(EditDistributionScreen.UpdatedAllocationQuestion.class), answerReceiver222);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver222);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver222);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.DuplicatePayment.DuplicatePaymentQuestion.class), answerReceiver222);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver222);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.SchedulePayment.SchedulePaymentQuestion.class), answerReceiver222);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CashtagQrScanQuestion.class), answerReceiver222);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver222);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentAmountQuestion.class), answerReceiver222);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MusicScreen.MusicQuestion.class), answerReceiver222);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver222);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver222);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PoolInvitePeopleQuestion.class), answerReceiver222);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AutofillQuestion.class), answerReceiver222);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChatTransactionQuestion.class), answerReceiver222);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportActivityPickerFullScreen.SelectTransactionQuestion.class), answerReceiver222);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptQuestion.class), answerReceiver222);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetQuestion.class), answerReceiver222);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationQuestion.class), answerReceiver222);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.SupportHomeContactOptionsSheetQuestion.class), answerReceiver222);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(RecurringReloadConfigurationQuestion.class), answerReceiver222);
                                break;
                        }
                    }
                };
            case 22:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory23 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver23 = new AnswerDispatcher.AnswerReceiver(reflectionFactory23.getOrCreateKotlinClass(AutofillQuestion.Result.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory23.getOrCreateKotlinClass(AutofillQuestion.class), answerReceiver23);
                final int i24 = 22;
                return new DisposableEffectResult() { // from class: com.squareup.cash.support.presenters.ArticlePresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i24;
                        AnswerDispatcher.AnswerReceiver answerReceiver222 = answerReceiver23;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportArticleIncidentsSheetScreen.IncidentsSheetQuestion.class), answerReceiver222);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.SelectStockQuestion.class), answerReceiver222);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.UpdateCategoryFilterQuestion.class), answerReceiver222);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotFeedbackQuestion.class), answerReceiver222);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotAmountInputQuestion.class), answerReceiver222);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotStaticPickerQuestion.class), answerReceiver222);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(TransferOptionPickerQuestion.class), answerReceiver222);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotTextInputQuestion.class), answerReceiver222);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver222);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(EditDistributionScreen.UpdatedAllocationQuestion.class), answerReceiver222);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver222);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver222);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.DuplicatePayment.DuplicatePaymentQuestion.class), answerReceiver222);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver222);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.SchedulePayment.SchedulePaymentQuestion.class), answerReceiver222);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CashtagQrScanQuestion.class), answerReceiver222);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver222);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentAmountQuestion.class), answerReceiver222);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MusicScreen.MusicQuestion.class), answerReceiver222);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver222);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver222);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PoolInvitePeopleQuestion.class), answerReceiver222);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AutofillQuestion.class), answerReceiver222);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChatTransactionQuestion.class), answerReceiver222);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportActivityPickerFullScreen.SelectTransactionQuestion.class), answerReceiver222);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptQuestion.class), answerReceiver222);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetQuestion.class), answerReceiver222);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationQuestion.class), answerReceiver222);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.SupportHomeContactOptionsSheetQuestion.class), answerReceiver222);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(RecurringReloadConfigurationQuestion.class), answerReceiver222);
                                break;
                        }
                    }
                };
            case 23:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory24 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver24 = new AnswerDispatcher.AnswerReceiver(reflectionFactory24.getOrCreateKotlinClass(ChatTransactionPickerResult.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory24.getOrCreateKotlinClass(ChatTransactionQuestion.class), answerReceiver24);
                final int i25 = 23;
                return new DisposableEffectResult() { // from class: com.squareup.cash.support.presenters.ArticlePresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i25;
                        AnswerDispatcher.AnswerReceiver answerReceiver222 = answerReceiver24;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportArticleIncidentsSheetScreen.IncidentsSheetQuestion.class), answerReceiver222);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.SelectStockQuestion.class), answerReceiver222);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.UpdateCategoryFilterQuestion.class), answerReceiver222);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotFeedbackQuestion.class), answerReceiver222);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotAmountInputQuestion.class), answerReceiver222);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotStaticPickerQuestion.class), answerReceiver222);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(TransferOptionPickerQuestion.class), answerReceiver222);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotTextInputQuestion.class), answerReceiver222);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver222);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(EditDistributionScreen.UpdatedAllocationQuestion.class), answerReceiver222);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver222);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver222);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.DuplicatePayment.DuplicatePaymentQuestion.class), answerReceiver222);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver222);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.SchedulePayment.SchedulePaymentQuestion.class), answerReceiver222);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CashtagQrScanQuestion.class), answerReceiver222);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver222);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentAmountQuestion.class), answerReceiver222);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MusicScreen.MusicQuestion.class), answerReceiver222);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver222);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver222);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PoolInvitePeopleQuestion.class), answerReceiver222);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AutofillQuestion.class), answerReceiver222);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChatTransactionQuestion.class), answerReceiver222);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportActivityPickerFullScreen.SelectTransactionQuestion.class), answerReceiver222);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptQuestion.class), answerReceiver222);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetQuestion.class), answerReceiver222);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationQuestion.class), answerReceiver222);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.SupportHomeContactOptionsSheetQuestion.class), answerReceiver222);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(RecurringReloadConfigurationQuestion.class), answerReceiver222);
                                break;
                        }
                    }
                };
            case 24:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory25 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver25 = new AnswerDispatcher.AnswerReceiver(reflectionFactory25.getOrCreateKotlinClass(SupportScreens$FlowScreens$SupportActivityPickerFullScreen$SelectTransactionResult$Success.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory25.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportActivityPickerFullScreen.SelectTransactionQuestion.class), answerReceiver25);
                final int i26 = 24;
                return new DisposableEffectResult() { // from class: com.squareup.cash.support.presenters.ArticlePresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i26;
                        AnswerDispatcher.AnswerReceiver answerReceiver222 = answerReceiver25;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportArticleIncidentsSheetScreen.IncidentsSheetQuestion.class), answerReceiver222);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.SelectStockQuestion.class), answerReceiver222);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.UpdateCategoryFilterQuestion.class), answerReceiver222);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotFeedbackQuestion.class), answerReceiver222);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotAmountInputQuestion.class), answerReceiver222);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotStaticPickerQuestion.class), answerReceiver222);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(TransferOptionPickerQuestion.class), answerReceiver222);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotTextInputQuestion.class), answerReceiver222);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver222);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(EditDistributionScreen.UpdatedAllocationQuestion.class), answerReceiver222);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver222);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver222);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.DuplicatePayment.DuplicatePaymentQuestion.class), answerReceiver222);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver222);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.SchedulePayment.SchedulePaymentQuestion.class), answerReceiver222);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CashtagQrScanQuestion.class), answerReceiver222);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver222);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentAmountQuestion.class), answerReceiver222);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MusicScreen.MusicQuestion.class), answerReceiver222);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver222);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver222);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PoolInvitePeopleQuestion.class), answerReceiver222);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AutofillQuestion.class), answerReceiver222);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChatTransactionQuestion.class), answerReceiver222);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportActivityPickerFullScreen.SelectTransactionQuestion.class), answerReceiver222);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptQuestion.class), answerReceiver222);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetQuestion.class), answerReceiver222);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationQuestion.class), answerReceiver222);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.SupportHomeContactOptionsSheetQuestion.class), answerReceiver222);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(RecurringReloadConfigurationQuestion.class), answerReceiver222);
                                break;
                        }
                    }
                };
            case 25:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory26 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver26 = new AnswerDispatcher.AnswerReceiver(reflectionFactory26.getOrCreateKotlinClass(SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptResult.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory26.getOrCreateKotlinClass(SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptQuestion.class), answerReceiver26);
                final int i27 = 25;
                return new DisposableEffectResult() { // from class: com.squareup.cash.support.presenters.ArticlePresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i27;
                        AnswerDispatcher.AnswerReceiver answerReceiver222 = answerReceiver26;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportArticleIncidentsSheetScreen.IncidentsSheetQuestion.class), answerReceiver222);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.SelectStockQuestion.class), answerReceiver222);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.UpdateCategoryFilterQuestion.class), answerReceiver222);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotFeedbackQuestion.class), answerReceiver222);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotAmountInputQuestion.class), answerReceiver222);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotStaticPickerQuestion.class), answerReceiver222);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(TransferOptionPickerQuestion.class), answerReceiver222);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotTextInputQuestion.class), answerReceiver222);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver222);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(EditDistributionScreen.UpdatedAllocationQuestion.class), answerReceiver222);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver222);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver222);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.DuplicatePayment.DuplicatePaymentQuestion.class), answerReceiver222);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver222);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.SchedulePayment.SchedulePaymentQuestion.class), answerReceiver222);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CashtagQrScanQuestion.class), answerReceiver222);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver222);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentAmountQuestion.class), answerReceiver222);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MusicScreen.MusicQuestion.class), answerReceiver222);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver222);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver222);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PoolInvitePeopleQuestion.class), answerReceiver222);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AutofillQuestion.class), answerReceiver222);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChatTransactionQuestion.class), answerReceiver222);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportActivityPickerFullScreen.SelectTransactionQuestion.class), answerReceiver222);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptQuestion.class), answerReceiver222);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetQuestion.class), answerReceiver222);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationQuestion.class), answerReceiver222);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.SupportHomeContactOptionsSheetQuestion.class), answerReceiver222);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(RecurringReloadConfigurationQuestion.class), answerReceiver222);
                                break;
                        }
                    }
                };
            case 26:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory27 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver27 = new AnswerDispatcher.AnswerReceiver(reflectionFactory27.getOrCreateKotlinClass(SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetResult.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory27.getOrCreateKotlinClass(SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetQuestion.class), answerReceiver27);
                final int i28 = 26;
                return new DisposableEffectResult() { // from class: com.squareup.cash.support.presenters.ArticlePresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i28;
                        AnswerDispatcher.AnswerReceiver answerReceiver222 = answerReceiver27;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportArticleIncidentsSheetScreen.IncidentsSheetQuestion.class), answerReceiver222);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.SelectStockQuestion.class), answerReceiver222);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.UpdateCategoryFilterQuestion.class), answerReceiver222);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotFeedbackQuestion.class), answerReceiver222);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotAmountInputQuestion.class), answerReceiver222);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotStaticPickerQuestion.class), answerReceiver222);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(TransferOptionPickerQuestion.class), answerReceiver222);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotTextInputQuestion.class), answerReceiver222);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver222);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(EditDistributionScreen.UpdatedAllocationQuestion.class), answerReceiver222);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver222);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver222);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.DuplicatePayment.DuplicatePaymentQuestion.class), answerReceiver222);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver222);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.SchedulePayment.SchedulePaymentQuestion.class), answerReceiver222);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CashtagQrScanQuestion.class), answerReceiver222);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver222);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentAmountQuestion.class), answerReceiver222);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MusicScreen.MusicQuestion.class), answerReceiver222);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver222);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver222);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PoolInvitePeopleQuestion.class), answerReceiver222);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AutofillQuestion.class), answerReceiver222);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChatTransactionQuestion.class), answerReceiver222);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportActivityPickerFullScreen.SelectTransactionQuestion.class), answerReceiver222);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptQuestion.class), answerReceiver222);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetQuestion.class), answerReceiver222);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationQuestion.class), answerReceiver222);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.SupportHomeContactOptionsSheetQuestion.class), answerReceiver222);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(RecurringReloadConfigurationQuestion.class), answerReceiver222);
                                break;
                        }
                    }
                };
            case 27:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory28 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver28 = new AnswerDispatcher.AnswerReceiver(reflectionFactory28.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationResult.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory28.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationQuestion.class), answerReceiver28);
                final int i29 = 27;
                return new DisposableEffectResult() { // from class: com.squareup.cash.support.presenters.ArticlePresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i29;
                        AnswerDispatcher.AnswerReceiver answerReceiver222 = answerReceiver28;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportArticleIncidentsSheetScreen.IncidentsSheetQuestion.class), answerReceiver222);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.SelectStockQuestion.class), answerReceiver222);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.UpdateCategoryFilterQuestion.class), answerReceiver222);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotFeedbackQuestion.class), answerReceiver222);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotAmountInputQuestion.class), answerReceiver222);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotStaticPickerQuestion.class), answerReceiver222);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(TransferOptionPickerQuestion.class), answerReceiver222);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotTextInputQuestion.class), answerReceiver222);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver222);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(EditDistributionScreen.UpdatedAllocationQuestion.class), answerReceiver222);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver222);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver222);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.DuplicatePayment.DuplicatePaymentQuestion.class), answerReceiver222);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver222);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.SchedulePayment.SchedulePaymentQuestion.class), answerReceiver222);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CashtagQrScanQuestion.class), answerReceiver222);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver222);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentAmountQuestion.class), answerReceiver222);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MusicScreen.MusicQuestion.class), answerReceiver222);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver222);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver222);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PoolInvitePeopleQuestion.class), answerReceiver222);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AutofillQuestion.class), answerReceiver222);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChatTransactionQuestion.class), answerReceiver222);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportActivityPickerFullScreen.SelectTransactionQuestion.class), answerReceiver222);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptQuestion.class), answerReceiver222);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetQuestion.class), answerReceiver222);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationQuestion.class), answerReceiver222);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.SupportHomeContactOptionsSheetQuestion.class), answerReceiver222);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(RecurringReloadConfigurationQuestion.class), answerReceiver222);
                                break;
                        }
                    }
                };
            case 28:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory29 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver29 = new AnswerDispatcher.AnswerReceiver(reflectionFactory29.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.SupportHomeContactOptionsSheetResult.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory29.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.SupportHomeContactOptionsSheetQuestion.class), answerReceiver29);
                final int i30 = 28;
                return new DisposableEffectResult() { // from class: com.squareup.cash.support.presenters.ArticlePresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i30;
                        AnswerDispatcher.AnswerReceiver answerReceiver222 = answerReceiver29;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportArticleIncidentsSheetScreen.IncidentsSheetQuestion.class), answerReceiver222);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.SelectStockQuestion.class), answerReceiver222);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.UpdateCategoryFilterQuestion.class), answerReceiver222);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotFeedbackQuestion.class), answerReceiver222);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotAmountInputQuestion.class), answerReceiver222);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotStaticPickerQuestion.class), answerReceiver222);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(TransferOptionPickerQuestion.class), answerReceiver222);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotTextInputQuestion.class), answerReceiver222);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver222);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(EditDistributionScreen.UpdatedAllocationQuestion.class), answerReceiver222);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver222);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver222);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.DuplicatePayment.DuplicatePaymentQuestion.class), answerReceiver222);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver222);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.SchedulePayment.SchedulePaymentQuestion.class), answerReceiver222);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CashtagQrScanQuestion.class), answerReceiver222);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver222);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentAmountQuestion.class), answerReceiver222);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MusicScreen.MusicQuestion.class), answerReceiver222);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver222);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver222);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PoolInvitePeopleQuestion.class), answerReceiver222);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AutofillQuestion.class), answerReceiver222);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChatTransactionQuestion.class), answerReceiver222);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportActivityPickerFullScreen.SelectTransactionQuestion.class), answerReceiver222);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptQuestion.class), answerReceiver222);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetQuestion.class), answerReceiver222);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationQuestion.class), answerReceiver222);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.SupportHomeContactOptionsSheetQuestion.class), answerReceiver222);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(RecurringReloadConfigurationQuestion.class), answerReceiver222);
                                break;
                        }
                    }
                };
            default:
                ((DisposableEffectScope) obj).getClass();
                ReflectionFactory reflectionFactory30 = Reflection.factory;
                final AnswerDispatcher.AnswerReceiver answerReceiver30 = new AnswerDispatcher.AnswerReceiver(reflectionFactory30.getOrCreateKotlinClass(RecurringReloadConfigurationResult.class), function2);
                answerDispatcher.registerReceiver(reflectionFactory30.getOrCreateKotlinClass(RecurringReloadConfigurationQuestion.class), answerReceiver30);
                final int i31 = 29;
                return new DisposableEffectResult() { // from class: com.squareup.cash.support.presenters.ArticlePresenter$models$$inlined$AnswerHandler$1.1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i31;
                        AnswerDispatcher.AnswerReceiver answerReceiver222 = answerReceiver30;
                        AnswerDispatcher answerDispatcher2 = answerDispatcher;
                        switch (i32) {
                            case 0:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportArticleIncidentsSheetScreen.IncidentsSheetQuestion.class), answerReceiver222);
                                break;
                            case 1:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.SelectStockQuestion.class), answerReceiver222);
                                break;
                            case 2:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(InvestingScreens.UpdateCategoryFilterQuestion.class), answerReceiver222);
                                break;
                            case 3:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotFeedbackQuestion.class), answerReceiver222);
                                break;
                            case 4:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotAmountInputQuestion.class), answerReceiver222);
                                break;
                            case 5:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotStaticPickerQuestion.class), answerReceiver222);
                                break;
                            case 6:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(TransferOptionPickerQuestion.class), answerReceiver222);
                                break;
                            case 7:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MoneybotTextInputQuestion.class), answerReceiver222);
                                break;
                            case 8:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver222);
                                break;
                            case 9:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(EditDistributionScreen.UpdatedAllocationQuestion.class), answerReceiver222);
                                break;
                            case 10:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CustomAllocationQuestion.class), answerReceiver222);
                                break;
                            case 11:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver222);
                                break;
                            case 12:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.DuplicatePayment.DuplicatePaymentQuestion.class), answerReceiver222);
                                break;
                            case 13:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver222);
                                break;
                            case 14:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.SchedulePayment.SchedulePaymentQuestion.class), answerReceiver222);
                                break;
                            case 15:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(CashtagQrScanQuestion.class), answerReceiver222);
                                break;
                            case 16:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver222);
                                break;
                            case 17:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentAmountQuestion.class), answerReceiver222);
                                break;
                            case 18:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(MusicScreen.MusicQuestion.class), answerReceiver222);
                                break;
                            case 19:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.class), answerReceiver222);
                                break;
                            case 20:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(WhichInstrument.class), answerReceiver222);
                                break;
                            case 21:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(PoolInvitePeopleQuestion.class), answerReceiver222);
                                break;
                            case 22:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(AutofillQuestion.class), answerReceiver222);
                                break;
                            case 23:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(ChatTransactionQuestion.class), answerReceiver222);
                                break;
                            case 24:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.FlowScreens.SupportActivityPickerFullScreen.SelectTransactionQuestion.class), answerReceiver222);
                                break;
                            case 25:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatDialogs.ChatExitPrompt.ChatExitPromptQuestion.class), answerReceiver222);
                                break;
                            case 26:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportChatScreens.SupportChatSheets.ChatExitPromptSheet.ChatExitPromptSheetQuestion.class), answerReceiver222);
                                break;
                            case 27:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationQuestion.class), answerReceiver222);
                                break;
                            case 28:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.SupportHomeContactOptionsSheetQuestion.class), answerReceiver222);
                                break;
                            default:
                                answerDispatcher2.unregisterReceiver(Reflection.factory.getOrCreateKotlinClass(RecurringReloadConfigurationQuestion.class), answerReceiver222);
                                break;
                        }
                    }
                };
        }
    }
}
