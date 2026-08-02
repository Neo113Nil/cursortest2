package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.ndk.internal.NdkCrashLog;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class EducationalSheetContent$Content$List extends NdkCrashLog.Companion {
    public final LocalNumberedList value;

    public EducationalSheetContent$Content$List(LocalNumberedList localNumberedList) {
        localNumberedList.getClass();
        this.value = localNumberedList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EducationalSheetContent$Content$List) && Intrinsics.areEqual(this.value, ((EducationalSheetContent$Content$List) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "List(value=" + this.value + ")";
    }
}
