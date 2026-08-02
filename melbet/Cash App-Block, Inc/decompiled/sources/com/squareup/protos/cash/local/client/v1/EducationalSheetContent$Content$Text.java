package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.ndk.internal.NdkCrashLog;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class EducationalSheetContent$Content$Text extends NdkCrashLog.Companion {
    public final EducationalSheetText value;

    public EducationalSheetContent$Content$Text(EducationalSheetText educationalSheetText) {
        educationalSheetText.getClass();
        this.value = educationalSheetText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EducationalSheetContent$Content$Text) && Intrinsics.areEqual(this.value, ((EducationalSheetContent$Content$Text) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Text(value=" + this.value + ")";
    }
}
