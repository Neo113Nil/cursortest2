package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzic;
import com.squareup.protos.cash.local.client.v1.GetEditorialResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GetEditorialResponse$EditorialContent$ContentType$Spacer extends zzic {
    public final GetEditorialResponse.EditorialContent.Spacer value;

    public GetEditorialResponse$EditorialContent$ContentType$Spacer(GetEditorialResponse.EditorialContent.Spacer spacer) {
        spacer.getClass();
        this.value = spacer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetEditorialResponse$EditorialContent$ContentType$Spacer) && Intrinsics.areEqual(this.value, ((GetEditorialResponse$EditorialContent$ContentType$Spacer) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Spacer(value=" + this.value + ")";
    }
}
