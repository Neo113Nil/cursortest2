package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.GroupActivityRenderData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class GroupActivityRenderData$Params$MemberAdded {
    public final GroupActivityRenderData.MemberAdded value;

    public GroupActivityRenderData$Params$MemberAdded(GroupActivityRenderData.MemberAdded memberAdded) {
        memberAdded.getClass();
        this.value = memberAdded;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GroupActivityRenderData$Params$MemberAdded) && Intrinsics.areEqual(this.value, ((GroupActivityRenderData$Params$MemberAdded) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "MemberAdded(value=" + this.value + ")";
    }
}
