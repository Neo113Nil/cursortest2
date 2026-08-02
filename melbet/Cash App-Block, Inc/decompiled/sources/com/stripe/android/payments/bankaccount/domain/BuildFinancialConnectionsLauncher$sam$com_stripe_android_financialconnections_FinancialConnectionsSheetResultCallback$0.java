package com.stripe.android.payments.bankaccount.domain;

import com.stripe.android.uicore.elements.TextFieldUIKt$TextField$4$1;
import kotlin.Function;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final /* synthetic */ class BuildFinancialConnectionsLauncher$sam$com_stripe_android_financialconnections_FinancialConnectionsSheetResultCallback$0 implements FunctionAdapter {
    public final /* synthetic */ TextFieldUIKt$TextField$4$1 function;

    public BuildFinancialConnectionsLauncher$sam$com_stripe_android_financialconnections_FinancialConnectionsSheetResultCallback$0(TextFieldUIKt$TextField$4$1 textFieldUIKt$TextField$4$1) {
        this.function = textFieldUIKt$TextField$4$1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof BuildFinancialConnectionsLauncher$sam$com_stripe_android_financialconnections_FinancialConnectionsSheetResultCallback$0) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
