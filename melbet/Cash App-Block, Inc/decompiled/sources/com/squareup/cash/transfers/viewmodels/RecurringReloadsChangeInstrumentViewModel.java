package com.squareup.cash.transfers.viewmodels;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class RecurringReloadsChangeInstrumentViewModel {
    public final String body;
    public final String buttonLabel;
    public final String title;

    public RecurringReloadsChangeInstrumentViewModel(String str, String str2, String str3) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.title = str;
        this.body = str2;
        this.buttonLabel = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecurringReloadsChangeInstrumentViewModel)) {
            return false;
        }
        RecurringReloadsChangeInstrumentViewModel recurringReloadsChangeInstrumentViewModel = (RecurringReloadsChangeInstrumentViewModel) obj;
        return Intrinsics.areEqual(this.title, recurringReloadsChangeInstrumentViewModel.title) && Intrinsics.areEqual(this.body, recurringReloadsChangeInstrumentViewModel.body) && Intrinsics.areEqual(this.buttonLabel, recurringReloadsChangeInstrumentViewModel.buttonLabel);
    }

    public final int hashCode() {
        return this.buttonLabel.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.body);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RecurringReloadsChangeInstrumentViewModel(title=", this.title, ", body=", this.body, ", buttonLabel="), this.buttonLabel, ")");
    }
}
