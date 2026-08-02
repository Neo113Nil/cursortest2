package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.rum.internal.utils.ViewUtilsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GetShortlinkResponse$Action$EducationalSheet extends ViewUtilsKt {
    public final EducationalSheet value;

    public GetShortlinkResponse$Action$EducationalSheet(EducationalSheet educationalSheet) {
        educationalSheet.getClass();
        this.value = educationalSheet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetShortlinkResponse$Action$EducationalSheet) && Intrinsics.areEqual(this.value, ((GetShortlinkResponse$Action$EducationalSheet) obj).value);
    }

    public final EducationalSheet getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "EducationalSheet(value=" + this.value + ")";
    }
}
