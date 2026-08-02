package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzjf;
import com.squareup.protos.cash.local.client.v1.TagDefinition;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class TagDefinition$FilterType$Membership extends zzjf {
    public final TagDefinition.Membership value;

    public TagDefinition$FilterType$Membership(TagDefinition.Membership membership) {
        membership.getClass();
        this.value = membership;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TagDefinition$FilterType$Membership) && Intrinsics.areEqual(this.value, ((TagDefinition$FilterType$Membership) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Membership(value=" + this.value + ")";
    }
}
