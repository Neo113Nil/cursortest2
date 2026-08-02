package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzic;
import com.squareup.protos.cash.local.client.v1.GetEditorialResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GetEditorialResponse$EditorialContent$ContentType$Preview extends zzic {
    public final GetEditorialResponse.EditorialContent.Preview value;

    public GetEditorialResponse$EditorialContent$ContentType$Preview(GetEditorialResponse.EditorialContent.Preview preview) {
        preview.getClass();
        this.value = preview;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetEditorialResponse$EditorialContent$ContentType$Preview) && Intrinsics.areEqual(this.value, ((GetEditorialResponse$EditorialContent$ContentType$Preview) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Preview(value=" + this.value + ")";
    }
}
