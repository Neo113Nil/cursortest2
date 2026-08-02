package com.squareup.protos.cash.cashsuggest.api;

import com.google.android.gms.internal.mlkit_vision_barcode.zzuv;
import com.squareup.protos.cash.cashsuggest.api.AppletCardSection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AppletCardSection$Content$TransactionList extends zzuv {
    public final AppletCardSection.TransactionList value;

    public AppletCardSection$Content$TransactionList(AppletCardSection.TransactionList transactionList) {
        transactionList.getClass();
        this.value = transactionList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppletCardSection$Content$TransactionList) && Intrinsics.areEqual(this.value, ((AppletCardSection$Content$TransactionList) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "TransactionList(value=" + this.value + ")";
    }
}
