package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzje;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ShortlinkAppAction$Action$EducationalSheet extends zzje {
    public final EducationalSheet value;

    public ShortlinkAppAction$Action$EducationalSheet(EducationalSheet educationalSheet) {
        educationalSheet.getClass();
        this.value = educationalSheet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShortlinkAppAction$Action$EducationalSheet) && Intrinsics.areEqual(this.value, ((ShortlinkAppAction$Action$EducationalSheet) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "EducationalSheet(value=" + this.value + ")";
    }
}
