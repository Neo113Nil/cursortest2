package com.squareup.protos.cash.groups;

import com.bugsnag.android.IOUtils;
import com.squareup.protos.cash.groups.GroupParticipant;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GroupParticipant$Type$Anonymous extends IOUtils {
    public final GroupParticipant.Anonymous value;

    public GroupParticipant$Type$Anonymous(GroupParticipant.Anonymous anonymous) {
        anonymous.getClass();
        this.value = anonymous;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GroupParticipant$Type$Anonymous) && Intrinsics.areEqual(this.value, ((GroupParticipant$Type$Anonymous) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Anonymous(value=" + this.value + ")";
    }
}
