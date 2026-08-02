package com.squareup.cash.transfers.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class BalanceBasedAddCashDisabledDialogViewModel {
    public final String message;
    public final String negativeButtonLabel;
    public final String positiveButtonLabel;
    public final String title;

    public BalanceBasedAddCashDisabledDialogViewModel(String str, String str2, String str3, String str4) {
        Request$Priority$EnumUnboxingLocalUtility.m(str, str2, str3, str4);
        this.title = str;
        this.message = str2;
        this.positiveButtonLabel = str3;
        this.negativeButtonLabel = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BalanceBasedAddCashDisabledDialogViewModel)) {
            return false;
        }
        BalanceBasedAddCashDisabledDialogViewModel balanceBasedAddCashDisabledDialogViewModel = (BalanceBasedAddCashDisabledDialogViewModel) obj;
        return Intrinsics.areEqual(this.title, balanceBasedAddCashDisabledDialogViewModel.title) && Intrinsics.areEqual(this.message, balanceBasedAddCashDisabledDialogViewModel.message) && Intrinsics.areEqual(this.positiveButtonLabel, balanceBasedAddCashDisabledDialogViewModel.positiveButtonLabel) && Intrinsics.areEqual(this.negativeButtonLabel, balanceBasedAddCashDisabledDialogViewModel.negativeButtonLabel);
    }

    public final int hashCode() {
        return this.negativeButtonLabel.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.message), 31, this.positiveButtonLabel);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BalanceBasedAddCashDisabledDialogViewModel(title=", this.title, ", message=", this.message, ", positiveButtonLabel="), this.positiveButtonLabel, ", negativeButtonLabel=", this.negativeButtonLabel, ")");
    }
}
