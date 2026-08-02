package com.squareup.cash.tax.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class TaxReturnsViewModel {
    public final String bodyText;
    public final String buttonText;
    public final String deeplink;
    public final String headerText;
    public final String toolbarText;

    public TaxReturnsViewModel(String str, String str2, String str3, String str4, String str5) {
        this.toolbarText = str;
        this.headerText = str2;
        this.bodyText = str3;
        this.buttonText = str4;
        this.deeplink = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxReturnsViewModel)) {
            return false;
        }
        TaxReturnsViewModel taxReturnsViewModel = (TaxReturnsViewModel) obj;
        return Intrinsics.areEqual(this.toolbarText, taxReturnsViewModel.toolbarText) && Intrinsics.areEqual(this.headerText, taxReturnsViewModel.headerText) && Intrinsics.areEqual(this.bodyText, taxReturnsViewModel.bodyText) && Intrinsics.areEqual(this.buttonText, taxReturnsViewModel.buttonText) && Intrinsics.areEqual(this.deeplink, taxReturnsViewModel.deeplink);
    }

    public final int hashCode() {
        String str = this.toolbarText;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.headerText;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bodyText;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.buttonText;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.deeplink;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TaxReturnsViewModel(toolbarText=", this.toolbarText, ", headerText=", this.headerText, ", bodyText=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.bodyText, ", buttonText=", this.buttonText, ", deeplink=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.deeplink, ")");
    }
}
