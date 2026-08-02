package com.squareup.protos.cash.groups;

import com.bugsnag.android.IOUtils;
import com.squareup.protos.cash.groups.GroupParticipant;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GroupParticipant$Type$Customer extends IOUtils {
    public final GroupParticipant.Customer value;

    public GroupParticipant$Type$Customer(GroupParticipant.Customer customer) {
        customer.getClass();
        this.value = customer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GroupParticipant$Type$Customer) && Intrinsics.areEqual(this.value, ((GroupParticipant$Type$Customer) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Customer(value=" + this.value + ")";
    }
}
