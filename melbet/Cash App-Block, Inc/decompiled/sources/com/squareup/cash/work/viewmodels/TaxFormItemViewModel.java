package com.squareup.cash.work.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class TaxFormItemViewModel {
    public final String downloadUrl;
    public final String title;
    public final String token;

    public TaxFormItemViewModel(String str, String str2, String str3) {
        str2.getClass();
        this.token = str;
        this.title = str2;
        this.downloadUrl = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxFormItemViewModel)) {
            return false;
        }
        TaxFormItemViewModel taxFormItemViewModel = (TaxFormItemViewModel) obj;
        return this.token.equals(taxFormItemViewModel.token) && Intrinsics.areEqual(this.title, taxFormItemViewModel.title) && Intrinsics.areEqual(this.downloadUrl, taxFormItemViewModel.downloadUrl);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.hashCode() * 31, 31, this.title);
        String str = this.downloadUrl;
        return m + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TaxFormItemViewModel(token=", this.token, ", title=", this.title, ", downloadUrl="), this.downloadUrl, ")");
    }
}
