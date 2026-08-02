package com.squareup.cash.work.data.api;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class TaxFormData {
    public final String displayTitle;
    public final String downloadUrl;
    public final String id;

    public TaxFormData(String str, String str2, String str3) {
        this.id = str;
        this.displayTitle = str2;
        this.downloadUrl = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxFormData)) {
            return false;
        }
        TaxFormData taxFormData = (TaxFormData) obj;
        return this.id.equals(taxFormData.id) && Intrinsics.areEqual(this.displayTitle, taxFormData.displayTitle) && Intrinsics.areEqual(this.downloadUrl, taxFormData.downloadUrl);
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.displayTitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.downloadUrl;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TaxFormData(id=", this.id, ", displayTitle=", this.displayTitle, ", downloadUrl="), this.downloadUrl, ")");
    }
}
