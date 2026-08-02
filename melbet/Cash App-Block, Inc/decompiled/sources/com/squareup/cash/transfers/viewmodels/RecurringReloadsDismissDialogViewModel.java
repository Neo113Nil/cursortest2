package com.squareup.cash.transfers.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class RecurringReloadsDismissDialogViewModel {
    public final String body;
    public final String primaryButtonLabel;
    public final String secondaryButtonLabel;
    public final String title;

    public RecurringReloadsDismissDialogViewModel(String str, String str2, String str3, String str4) {
        Request$Priority$EnumUnboxingLocalUtility.m(str, str2, str3, str4);
        this.title = str;
        this.body = str2;
        this.primaryButtonLabel = str3;
        this.secondaryButtonLabel = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecurringReloadsDismissDialogViewModel)) {
            return false;
        }
        RecurringReloadsDismissDialogViewModel recurringReloadsDismissDialogViewModel = (RecurringReloadsDismissDialogViewModel) obj;
        return Intrinsics.areEqual(this.title, recurringReloadsDismissDialogViewModel.title) && Intrinsics.areEqual(this.body, recurringReloadsDismissDialogViewModel.body) && Intrinsics.areEqual(this.primaryButtonLabel, recurringReloadsDismissDialogViewModel.primaryButtonLabel) && Intrinsics.areEqual(this.secondaryButtonLabel, recurringReloadsDismissDialogViewModel.secondaryButtonLabel);
    }

    public final int hashCode() {
        return this.secondaryButtonLabel.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.body), 31, this.primaryButtonLabel);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RecurringReloadsDismissDialogViewModel(title=", this.title, ", body=", this.body, ", primaryButtonLabel="), this.primaryButtonLabel, ", secondaryButtonLabel=", this.secondaryButtonLabel, ")");
    }
}
