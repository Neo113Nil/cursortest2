package com.stripe.android.uicore.elements;

import android.content.Context;
import android.content.Intent;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda0;
import androidx.lifecycle.ViewModelKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.android.trace.model.SpanEvent;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda0;
import com.stripe.android.core.Logger$Companion;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.financialconnections.FinancialConnectionsSheetResult;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.features.exit.ExitViewModel$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerState;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel;
import com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel;
import com.stripe.android.financialconnections.features.notice.NoticeSheetState;
import com.stripe.android.financialconnections.features.notice.NoticeSheetViewModel;
import com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel;
import com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentViewModel;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetInstantDebitsResult;
import com.stripe.android.financialconnections.model.PartnerAccount;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.presentation.WebAuthFlowState;
import com.stripe.android.model.Source;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.PaymentFlowResult$Unvalidated;
import com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel;
import com.stripe.android.payments.core.analytics.ErrorReporter$Companion;
import com.stripe.android.payments.core.analytics.ErrorReporter$ExpectedErrorEvent;
import com.stripe.android.view.PaymentAuthWebViewActivity;
import com.stripe.android.view.PaymentAuthWebViewActivityViewModel;
import com.valentinilk.shimmer.ShimmerModifierKt$shimmer$1$1;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager;
import dagger.internal.Preconditions;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* loaded from: classes8.dex */
public final /* synthetic */ class TextFieldUIKt$TextField$4$1 extends FunctionReferenceImpl implements Function1 {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextFieldUIKt$TextField$4$1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.$r8$classId = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        NoticeSheetState.NoticeSheetContent computeDrawerPayload;
        Map additionalParamsFromStripeException;
        Collection searchMethodsByNameWithoutBuiltinMagic;
        int i = 17;
        int i2 = 0;
        EmptyMap emptyMap = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        switch (this.$r8$classId) {
            case 0:
                throw Boxes$$ExternalSyntheticOutline1.m(obj);
            case 1:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((FinancialConnectionsSheetNativeViewModel) this.receiver).onCloseFromErrorClick(th);
                return Unit.INSTANCE;
            case 2:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((FinancialConnectionsSheetNativeViewModel) this.receiver).onCloseFromErrorClick(th2);
                return Unit.INSTANCE;
            case 3:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((FinancialConnectionsSheetNativeViewModel) this.receiver).onCloseFromErrorClick(th3);
                return Unit.INSTANCE;
            case 4:
                String str = (String) obj;
                str.getClass();
                InstitutionPickerViewModel institutionPickerViewModel = (InstitutionPickerViewModel) this.receiver;
                institutionPickerViewModel.getClass();
                institutionPickerViewModel.searchJob.plusAssign(FinancialConnectionsViewModel.execute$default(institutionPickerViewModel, new InstitutionPickerViewModel.AnonymousClass1(str, institutionPickerViewModel, null), new ExitViewModel$$ExternalSyntheticLambda0(i)));
                return Unit.INSTANCE;
            case 5:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ((FinancialConnectionsSheetNativeViewModel) this.receiver).onCloseFromErrorClick(th4);
                return Unit.INSTANCE;
            case 6:
                PartnerAccount partnerAccount = (PartnerAccount) obj;
                partnerAccount.getClass();
                LinkAccountPickerViewModel linkAccountPickerViewModel = (LinkAccountPickerViewModel) this.receiver;
                linkAccountPickerViewModel.getClass();
                String str2 = partnerAccount.id;
                ReadonlyStateFlow readonlyStateFlow = linkAccountPickerViewModel.stateFlow;
                LinkAccountPickerState.Payload payload = (LinkAccountPickerState.Payload) ((LinkAccountPickerState) readonlyStateFlow.$$delegate_0.getValue()).payload.invoke();
                if (payload != null) {
                    linkAccountPickerViewModel.eventTracker.track(new FinancialConnectionsAnalyticsEvent.Click(LinkAccountPickerViewModel.PANE, !payload.selectedAccountIds.contains(str2), payload.singleAccount, str2));
                }
                Object invoke = ((LinkAccountPickerState) readonlyStateFlow.$$delegate_0.getValue()).payload.invoke();
                if (invoke == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                    return null;
                }
                LinkAccountPickerState.Payload payload2 = (LinkAccountPickerState.Payload) invoke;
                List list = payload2.selectedAccountIds;
                if (payload2.acquireConsentOnPrimaryCtaClick || (computeDrawerPayload = LinkAccountPickerViewModel.computeDrawerPayload(partnerAccount, payload2)) == null) {
                    linkAccountPickerViewModel.setState(new HeroCardViewKt$$ExternalSyntheticLambda0(i, payload2, payload2.singleAccount ? CollectionsKt__CollectionsJVMKt.listOf(str2) : list.contains(str2) ? CollectionsKt.minus(list, str2) : CollectionsKt.plus((Collection) list, (Object) str2)));
                } else {
                    linkAccountPickerViewModel.present(computeDrawerPayload);
                }
                return Unit.INSTANCE;
            case 7:
                String str3 = (String) obj;
                str3.getClass();
                ManualEntryViewModel manualEntryViewModel = (ManualEntryViewModel) this.receiver;
                manualEntryViewModel.getClass();
                StringBuilder sb = new StringBuilder();
                int length = str3.length();
                while (i2 < length) {
                    char charAt = str3.charAt(i2);
                    if (Character.isDigit(charAt)) {
                        sb.append(charAt);
                    }
                    i2++;
                }
                manualEntryViewModel._routing$delegate.setValue(sb.toString());
                return Unit.INSTANCE;
            case 8:
                String str4 = (String) obj;
                str4.getClass();
                ManualEntryViewModel manualEntryViewModel2 = (ManualEntryViewModel) this.receiver;
                manualEntryViewModel2.getClass();
                StringBuilder sb2 = new StringBuilder();
                int length2 = str4.length();
                while (i2 < length2) {
                    char charAt2 = str4.charAt(i2);
                    if (Character.isDigit(charAt2)) {
                        sb2.append(charAt2);
                    }
                    i2++;
                }
                manualEntryViewModel2._account$delegate.setValue(sb2.toString());
                return Unit.INSTANCE;
            case 9:
                String str5 = (String) obj;
                str5.getClass();
                ManualEntryViewModel manualEntryViewModel3 = (ManualEntryViewModel) this.receiver;
                manualEntryViewModel3.getClass();
                StringBuilder sb3 = new StringBuilder();
                int length3 = str5.length();
                while (i2 < length3) {
                    char charAt3 = str5.charAt(i2);
                    if (Character.isDigit(charAt3)) {
                        sb3.append(charAt3);
                    }
                    i2++;
                }
                manualEntryViewModel3._accountConfirm$delegate.setValue(sb3.toString());
                return Unit.INSTANCE;
            case 10:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                ((FinancialConnectionsSheetNativeViewModel) this.receiver).onCloseFromErrorClick(th5);
                return Unit.INSTANCE;
            case 11:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                ((FinancialConnectionsSheetNativeViewModel) this.receiver).onCloseFromErrorClick(th6);
                return Unit.INSTANCE;
            case 12:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                ((FinancialConnectionsSheetNativeViewModel) this.receiver).onCloseFromErrorClick(th7);
                return Unit.INSTANCE;
            case 13:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                ((FinancialConnectionsSheetNativeViewModel) this.receiver).onCloseFromErrorClick(th8);
                return Unit.INSTANCE;
            case 14:
                String str6 = (String) obj;
                str6.getClass();
                NoticeSheetViewModel noticeSheetViewModel = (NoticeSheetViewModel) this.receiver;
                noticeSheetViewModel.getClass();
                JobKt.launch$default(ViewModelKt.getViewModelScope(noticeSheetViewModel), null, null, new ShimmerModifierKt$shimmer$1$1(noticeSheetViewModel, str6, objArr == true ? 1 : 0, 6), 3);
                return Unit.INSTANCE;
            case 15:
                WebAuthFlowState webAuthFlowState = (WebAuthFlowState) obj;
                webAuthFlowState.getClass();
                PartnerAuthViewModel partnerAuthViewModel = (PartnerAuthViewModel) this.receiver;
                partnerAuthViewModel.getClass();
                partnerAuthViewModel.logger.debug("Web AuthFlow status received " + webAuthFlowState);
                JobKt.launch$default(ViewModelKt.getViewModelScope(partnerAuthViewModel), null, null, new ShimmerModifierKt$shimmer$1$1(webAuthFlowState, partnerAuthViewModel, objArr2 == true ? 1 : 0, 7), 3);
                return Unit.INSTANCE;
            case 16:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                ((FinancialConnectionsSheetNativeViewModel) this.receiver).onCloseFromErrorClick(th9);
                return Unit.INSTANCE;
            case 17:
                String str7 = (String) obj;
                str7.getClass();
                IDConsentContentViewModel iDConsentContentViewModel = (IDConsentContentViewModel) this.receiver;
                iDConsentContentViewModel.getClass();
                JobKt.launch$default(ViewModelKt.getViewModelScope(iDConsentContentViewModel), null, null, new ShimmerModifierKt$shimmer$1$1(iDConsentContentViewModel, str7, objArr3 == true ? 1 : 0, 8), 3);
                return Unit.INSTANCE;
            case 18:
                Throwable th10 = (Throwable) obj;
                th10.getClass();
                ((FinancialConnectionsSheetNativeViewModel) this.receiver).onCloseFromErrorClick(th10);
                return Unit.INSTANCE;
            case 19:
                FinancialConnectionsSheetInstantDebitsResult financialConnectionsSheetInstantDebitsResult = (FinancialConnectionsSheetInstantDebitsResult) obj;
                financialConnectionsSheetInstantDebitsResult.getClass();
                CollectBankAccountViewModel collectBankAccountViewModel = (CollectBankAccountViewModel) this.receiver;
                collectBankAccountViewModel.getClass();
                collectBankAccountViewModel.savedStateHandle.set(Boolean.FALSE, "key_has_launched");
                JobKt.launch$default(ViewModelKt.getViewModelScope(collectBankAccountViewModel), null, null, new ShimmerModifierKt$shimmer$1$1(financialConnectionsSheetInstantDebitsResult, collectBankAccountViewModel, objArr4 == true ? 1 : 0, 19), 3);
                return Unit.INSTANCE;
            case 20:
                FinancialConnectionsSheetResult financialConnectionsSheetResult = (FinancialConnectionsSheetResult) obj;
                financialConnectionsSheetResult.getClass();
                CollectBankAccountViewModel collectBankAccountViewModel2 = (CollectBankAccountViewModel) this.receiver;
                collectBankAccountViewModel2.getClass();
                collectBankAccountViewModel2.savedStateHandle.set(Boolean.FALSE, "key_has_launched");
                JobKt.launch$default(ViewModelKt.getViewModelScope(collectBankAccountViewModel2), null, null, new ShimmerModifierKt$shimmer$1$1(financialConnectionsSheetResult, collectBankAccountViewModel2, objArr5 == true ? 1 : 0, 18), 3);
                return Unit.INSTANCE;
            case 21:
                String str8 = (String) obj;
                str8.getClass();
                PhoneNumberController phoneNumberController = (PhoneNumberController) this.receiver;
                phoneNumberController.getClass();
                StateFlowImpl stateFlowImpl = phoneNumberController._fieldValue;
                String userInputFilter = ((PhoneNumberFormatter) phoneNumberController.phoneNumberFormatter.produceValue.invoke()).userInputFilter(str8);
                stateFlowImpl.getClass();
                stateFlowImpl.updateState(null, userInputFilter);
                return Unit.INSTANCE;
            case 22:
                if (obj == null) {
                    ((SimpleTextFieldController) this.receiver).getClass();
                    return Unit.INSTANCE;
                }
                a$$ExternalSyntheticBUOutline0.m$1();
                return null;
            case 23:
                ((PaymentAuthWebViewActivity) this.receiver).startActivity((Intent) obj);
                return Unit.INSTANCE;
            case 24:
                Throwable th11 = (Throwable) obj;
                PaymentAuthWebViewActivity paymentAuthWebViewActivity = (PaymentAuthWebViewActivity) this.receiver;
                if (th11 != null) {
                    paymentAuthWebViewActivity.getClass();
                    Context applicationContext = paymentAuthWebViewActivity.getApplicationContext();
                    applicationContext.getClass();
                    EmptySet emptySet = EmptySet.INSTANCE;
                    emptySet.getClass();
                    Context applicationContext2 = applicationContext.getApplicationContext();
                    applicationContext2.getClass();
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                    Preconditions.checkNotNullFromProvides(defaultIoScheduler);
                    DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor = new DefaultAnalyticsRequestExecutor(Logger$Companion.NOOP_LOGGER, defaultIoScheduler);
                    PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = new PaymentAnalyticsRequestFactory(applicationContext2, new CameraX$$ExternalSyntheticLambda0(applicationContext2, 14), emptySet);
                    ErrorReporter$ExpectedErrorEvent errorReporter$ExpectedErrorEvent = ErrorReporter$ExpectedErrorEvent.AUTH_WEB_VIEW_FAILURE;
                    int i3 = StripeException.$r8$clinit;
                    StripeException create = SpanEvent.Account.create(th11);
                    if ((4 & 2) != 0) {
                        create = null;
                    }
                    if ((4 & 4) != 0) {
                        emptyMap = EmptyMap.INSTANCE;
                        emptyMap.getClass();
                    }
                    emptyMap.getClass();
                    if (create == null) {
                        additionalParamsFromStripeException = EmptyMap.INSTANCE;
                        additionalParamsFromStripeException.getClass();
                    } else {
                        additionalParamsFromStripeException = ErrorReporter$Companion.getAdditionalParamsFromStripeException(create);
                    }
                    defaultAnalyticsRequestExecutor.executeAsync(paymentAnalyticsRequestFactory.createRequest(errorReporter$ExpectedErrorEvent, MapsKt__MapsKt.plus(additionalParamsFromStripeException, emptyMap)));
                    PaymentAuthWebViewActivityViewModel viewModel = paymentAuthWebViewActivity.getViewModel();
                    viewModel.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(viewModel.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds1ChallengeError, null, null, null, null, 62));
                    String str9 = paymentAuthWebViewActivity.getViewModel().getPaymentResult$payments_core_release().clientSecret;
                    StripeException create2 = SpanEvent.Account.create(th11);
                    String str10 = paymentAuthWebViewActivity.getViewModel().getPaymentResult$payments_core_release().sourceId;
                    paymentAuthWebViewActivity.getViewModel().getPaymentResult$payments_core_release();
                    Intent putExtras = new Intent().putExtras(new PaymentFlowResult$Unvalidated(str9, 2, create2, true, str10, (Source) null, paymentAuthWebViewActivity.getViewModel().getPaymentResult$payments_core_release().stripeAccountId).toBundle());
                    putExtras.getClass();
                    paymentAuthWebViewActivity.setResult(-1, putExtras);
                } else {
                    PaymentAuthWebViewActivityViewModel viewModel2 = paymentAuthWebViewActivity.getViewModel();
                    viewModel2.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(viewModel2.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds1ChallengeComplete, null, null, null, null, 62));
                }
                paymentAuthWebViewActivity.finish();
                return Unit.INSTANCE;
            case 25:
                GovernmentIdWorkflow.Output output = (GovernmentIdWorkflow.Output) obj;
                output.getClass();
                ((GovernmentIdStepStateManager) this.receiver).setOutput(output);
                return Unit.INSTANCE;
            case 26:
                GovernmentIdWorkflow.Output output2 = (GovernmentIdWorkflow.Output) obj;
                output2.getClass();
                ((GovernmentIdStepStateManager) this.receiver).setOutput(output2);
                return Unit.INSTANCE;
            case 27:
                UiWorkflow.Output output3 = (UiWorkflow.Output) obj;
                output3.getClass();
                ((UiStepStateManager) this.receiver).setOutput(output3);
                return Unit.INSTANCE;
            case 28:
                obj.getClass();
                return AbstractAnnotationTypeQualifierResolver.access$extractMutability((AbstractAnnotationTypeQualifierResolver) this.receiver, obj);
            default:
                Name name = (Name) obj;
                name.getClass();
                searchMethodsByNameWithoutBuiltinMagic = ((LazyJavaClassMemberScope) this.receiver).searchMethodsByNameWithoutBuiltinMagic(name);
                return searchMethodsByNameWithoutBuiltinMagic;
        }
    }
}
