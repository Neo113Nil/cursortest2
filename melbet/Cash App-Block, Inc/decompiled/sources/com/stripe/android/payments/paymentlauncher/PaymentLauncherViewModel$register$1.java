package com.stripe.android.payments.paymentlauncher;

import androidx.activity.result.ActivityResultCallback;
import androidx.lifecycle.ViewModelKt;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetInstantDebitsResult;
import com.stripe.android.payments.PaymentFlowResult$Unvalidated;
import com.stripe.android.uicore.elements.TextFieldUIKt$TextField$4$1;
import com.valentinilk.shimmer.ShimmerModifierKt$shimmer$1$1;
import kotlin.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobKt;

/* loaded from: classes8.dex */
public final /* synthetic */ class PaymentLauncherViewModel$register$1 implements ActivityResultCallback, FunctionAdapter {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $tmp0;

    public /* synthetic */ PaymentLauncherViewModel$register$1(Object obj, int i) {
        this.$r8$classId = i;
        this.$tmp0 = obj;
    }

    public final boolean equals(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                if ((obj instanceof ActivityResultCallback) && (obj instanceof FunctionAdapter)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof ActivityResultCallback) && (obj instanceof FunctionAdapter)) {
                    break;
                }
                break;
        }
        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        int i = this.$r8$classId;
        Object obj = this.$tmp0;
        switch (i) {
            case 0:
                return new FunctionReferenceImpl(1, 0, PaymentLauncherViewModel.class, (PaymentLauncherViewModel) obj, "onPaymentFlowResult", "onPaymentFlowResult$payments_core_release(Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;)V");
            default:
                return new FunctionReferenceImpl(1, 0, Function1.class, (TextFieldUIKt$TextField$4$1) obj, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;");
        }
    }

    public final int hashCode() {
        switch (this.$r8$classId) {
        }
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public final void onActivityResult(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.$tmp0;
        switch (i) {
            case 0:
                PaymentFlowResult$Unvalidated paymentFlowResult$Unvalidated = (PaymentFlowResult$Unvalidated) obj;
                paymentFlowResult$Unvalidated.getClass();
                PaymentLauncherViewModel paymentLauncherViewModel = (PaymentLauncherViewModel) obj2;
                JobKt.launch$default(ViewModelKt.getViewModelScope(paymentLauncherViewModel), null, null, new ShimmerModifierKt$shimmer$1$1(paymentLauncherViewModel, paymentFlowResult$Unvalidated, null, 20), 3);
                break;
            default:
                FinancialConnectionsSheetInstantDebitsResult financialConnectionsSheetInstantDebitsResult = (FinancialConnectionsSheetInstantDebitsResult) obj;
                financialConnectionsSheetInstantDebitsResult.getClass();
                ((TextFieldUIKt$TextField$4$1) obj2).invoke(financialConnectionsSheetInstantDebitsResult);
                break;
        }
    }
}
