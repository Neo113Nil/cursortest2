package com.squareup.cash.work.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class DeclareCashTipBottomSheetViewModel {
    public final String currencyCode;
    public final String currencySymbol;
    public final boolean isLoading;
    public final ToastState toastState;

    public DeclareCashTipBottomSheetViewModel(String str, String str2, boolean z, ToastState toastState) {
        str.getClass();
        str2.getClass();
        this.currencySymbol = str;
        this.currencyCode = str2;
        this.isLoading = z;
        this.toastState = toastState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeclareCashTipBottomSheetViewModel)) {
            return false;
        }
        DeclareCashTipBottomSheetViewModel declareCashTipBottomSheetViewModel = (DeclareCashTipBottomSheetViewModel) obj;
        return Intrinsics.areEqual(this.currencySymbol, declareCashTipBottomSheetViewModel.currencySymbol) && Intrinsics.areEqual(this.currencyCode, declareCashTipBottomSheetViewModel.currencyCode) && this.isLoading == declareCashTipBottomSheetViewModel.isLoading && Intrinsics.areEqual(this.toastState, declareCashTipBottomSheetViewModel.toastState);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.currencySymbol.hashCode() * 31, 31, this.currencyCode), 31, this.isLoading);
        ToastState toastState = this.toastState;
        return m + (toastState == null ? 0 : toastState.hashCode());
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DeclareCashTipBottomSheetViewModel(currencySymbol=", this.currencySymbol, ", currencyCode=", this.currencyCode, ", isLoading=");
        m.append(this.isLoading);
        m.append(", toastState=");
        m.append(this.toastState);
        m.append(")");
        return m.toString();
    }
}
