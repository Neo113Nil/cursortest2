package com.squareup.cash.work.viewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class PayHistorySection {
    public final ArrayList stubs;
    public final String title;

    public PayHistorySection(String str, ArrayList arrayList) {
        str.getClass();
        this.title = str;
        this.stubs = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayHistorySection)) {
            return false;
        }
        PayHistorySection payHistorySection = (PayHistorySection) obj;
        return Intrinsics.areEqual(this.title, payHistorySection.title) && this.stubs.equals(payHistorySection.stubs);
    }

    public final int hashCode() {
        return this.stubs.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return NavAction$$ExternalSyntheticOutline0.m(this.stubs, "PayHistorySection(title=", this.title, ", stubs=", ")");
    }
}
