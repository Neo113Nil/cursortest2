package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzic;
import com.squareup.protos.cash.local.client.v1.GetEditorialResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GetEditorialResponse$EditorialContent$ContentType$Row extends zzic {
    public final GetEditorialResponse.EditorialContent.Row value;

    public GetEditorialResponse$EditorialContent$ContentType$Row(GetEditorialResponse.EditorialContent.Row row) {
        row.getClass();
        this.value = row;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetEditorialResponse$EditorialContent$ContentType$Row) && Intrinsics.areEqual(this.value, ((GetEditorialResponse$EditorialContent$ContentType$Row) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Row(value=" + this.value + ")";
    }
}
