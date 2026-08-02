package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzjf;
import com.squareup.protos.cash.local.client.v1.TagDefinition;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class TagDefinition$FilterType$OpenNow extends zzjf {
    public final TagDefinition.OpenNow value;

    public TagDefinition$FilterType$OpenNow(TagDefinition.OpenNow openNow) {
        openNow.getClass();
        this.value = openNow;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TagDefinition$FilterType$OpenNow) && Intrinsics.areEqual(this.value, ((TagDefinition$FilterType$OpenNow) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "OpenNow(value=" + this.value + ")";
    }
}
