package com.squareup.cash.transfers.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class PendingTransfersConfirmationViewModel {
    public final String message;
    public final String negativeButton;
    public final String positiveButton;
    public final String title;

    public PendingTransfersConfirmationViewModel(String str, String str2, String str3, String str4) {
        Request$Priority$EnumUnboxingLocalUtility.m(str, str2, str3, str4);
        this.title = str;
        this.message = str2;
        this.positiveButton = str3;
        this.negativeButton = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PendingTransfersConfirmationViewModel)) {
            return false;
        }
        PendingTransfersConfirmationViewModel pendingTransfersConfirmationViewModel = (PendingTransfersConfirmationViewModel) obj;
        return Intrinsics.areEqual(this.title, pendingTransfersConfirmationViewModel.title) && Intrinsics.areEqual(this.message, pendingTransfersConfirmationViewModel.message) && Intrinsics.areEqual(this.positiveButton, pendingTransfersConfirmationViewModel.positiveButton) && Intrinsics.areEqual(this.negativeButton, pendingTransfersConfirmationViewModel.negativeButton);
    }

    public final int hashCode() {
        return this.negativeButton.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.message), 31, this.positiveButton);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PendingTransfersConfirmationViewModel(title=", this.title, ", message=", this.message, ", positiveButton="), this.positiveButton, ", negativeButton=", this.negativeButton, ")");
    }
}
