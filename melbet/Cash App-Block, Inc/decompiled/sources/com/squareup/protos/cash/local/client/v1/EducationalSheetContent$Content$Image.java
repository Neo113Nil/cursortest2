package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.ndk.internal.NdkCrashLog;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class EducationalSheetContent$Content$Image extends NdkCrashLog.Companion {
    public final EducationalSheetImage value;

    public EducationalSheetContent$Content$Image(EducationalSheetImage educationalSheetImage) {
        educationalSheetImage.getClass();
        this.value = educationalSheetImage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EducationalSheetContent$Content$Image) && Intrinsics.areEqual(this.value, ((EducationalSheetContent$Content$Image) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Image(value=" + this.value + ")";
    }
}
