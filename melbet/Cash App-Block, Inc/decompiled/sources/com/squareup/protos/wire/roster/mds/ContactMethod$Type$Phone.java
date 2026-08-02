package com.squareup.protos.wire.roster.mds;

import com.google.android.gms.internal.mlkit_vision_face.zzko;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class ContactMethod$Type$Phone extends zzko {
    public final PhoneContactMethod value;

    public ContactMethod$Type$Phone(PhoneContactMethod phoneContactMethod) {
        phoneContactMethod.getClass();
        this.value = phoneContactMethod;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ContactMethod$Type$Phone) && Intrinsics.areEqual(this.value, ((ContactMethod$Type$Phone) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Phone(value=" + this.value + ")";
    }
}
