package com.squareup.cash.wallet.viewmodels;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SpendingInsightsListItemViewModel {
    public final String clientRoute;
    public final String subtitle;
    public final String title;

    public SpendingInsightsListItemViewModel(String str, String str2, String str3) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.title = str;
        this.subtitle = str2;
        this.clientRoute = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpendingInsightsListItemViewModel)) {
            return false;
        }
        SpendingInsightsListItemViewModel spendingInsightsListItemViewModel = (SpendingInsightsListItemViewModel) obj;
        return Intrinsics.areEqual(this.title, spendingInsightsListItemViewModel.title) && Intrinsics.areEqual(this.subtitle, spendingInsightsListItemViewModel.subtitle) && Intrinsics.areEqual(this.clientRoute, spendingInsightsListItemViewModel.clientRoute);
    }

    public final int hashCode() {
        return this.clientRoute.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SpendingInsightsListItemViewModel(title=", this.title, ", subtitle=", this.subtitle, ", clientRoute="), this.clientRoute, ")");
    }
}
