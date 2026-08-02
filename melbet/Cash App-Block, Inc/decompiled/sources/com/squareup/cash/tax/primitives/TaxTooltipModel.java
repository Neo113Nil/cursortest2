package com.squareup.cash.tax.primitives;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class TaxTooltipModel {
    public final String body;
    public final String button;
    public final String title;

    public TaxTooltipModel(String str, String str2, String str3) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.title = str;
        this.body = str2;
        this.button = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxTooltipModel)) {
            return false;
        }
        TaxTooltipModel taxTooltipModel = (TaxTooltipModel) obj;
        return Intrinsics.areEqual(this.title, taxTooltipModel.title) && Intrinsics.areEqual(this.body, taxTooltipModel.body) && Intrinsics.areEqual(this.button, taxTooltipModel.button);
    }

    public final int hashCode() {
        return this.button.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.body);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TaxTooltipModel(title=", this.title, ", body=", this.body, ", button="), this.button, ")");
    }
}
