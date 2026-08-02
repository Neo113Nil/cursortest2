package com.squareup.cash.support.viewmodels;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SupportTransactionConfirmationViewModel {
    public final String noButtonText;
    public final String title;
    public final String yesButtonText;

    public SupportTransactionConfirmationViewModel(String str, String str2, String str3) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.title = str;
        this.yesButtonText = str2;
        this.noButtonText = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SupportTransactionConfirmationViewModel)) {
            return false;
        }
        SupportTransactionConfirmationViewModel supportTransactionConfirmationViewModel = (SupportTransactionConfirmationViewModel) obj;
        return Intrinsics.areEqual(this.title, supportTransactionConfirmationViewModel.title) && Intrinsics.areEqual(this.yesButtonText, supportTransactionConfirmationViewModel.yesButtonText) && Intrinsics.areEqual(this.noButtonText, supportTransactionConfirmationViewModel.noButtonText);
    }

    public final int hashCode() {
        return this.noButtonText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.yesButtonText);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SupportTransactionConfirmationViewModel(title=", this.title, ", yesButtonText=", this.yesButtonText, ", noButtonText="), this.noButtonText, ")");
    }
}
