package com.squareup.cash.transfers.viewmodels;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class InstrumentNotLinkedViewModel {
    public final String backButtonLabel;
    public final String continueButtonLabel;
    public final String header;
    public final String headerIcon;

    public InstrumentNotLinkedViewModel(String str, String str2, String str3, String str4) {
        re$$ExternalSyntheticOutline0.m1432m(str, str3, str4);
        this.header = str;
        this.headerIcon = str2;
        this.continueButtonLabel = str3;
        this.backButtonLabel = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstrumentNotLinkedViewModel)) {
            return false;
        }
        InstrumentNotLinkedViewModel instrumentNotLinkedViewModel = (InstrumentNotLinkedViewModel) obj;
        return Intrinsics.areEqual(this.header, instrumentNotLinkedViewModel.header) && this.headerIcon.equals(instrumentNotLinkedViewModel.headerIcon) && Intrinsics.areEqual(this.continueButtonLabel, instrumentNotLinkedViewModel.continueButtonLabel) && Intrinsics.areEqual(this.backButtonLabel, instrumentNotLinkedViewModel.backButtonLabel);
    }

    public final int hashCode() {
        return this.backButtonLabel.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.header.hashCode() * 31, 31, this.headerIcon), 31, this.continueButtonLabel);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InstrumentNotLinkedViewModel(header=", this.header, ", headerIcon=", this.headerIcon, ", continueButtonLabel="), this.continueButtonLabel, ", backButtonLabel=", this.backButtonLabel, ")");
    }
}
