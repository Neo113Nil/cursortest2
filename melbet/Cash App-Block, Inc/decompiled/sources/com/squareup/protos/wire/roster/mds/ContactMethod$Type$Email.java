package com.squareup.protos.wire.roster.mds;

import com.google.android.gms.internal.mlkit_vision_face.zzko;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class ContactMethod$Type$Email extends zzko {
    public final EmailContactMethod value;

    public ContactMethod$Type$Email(EmailContactMethod emailContactMethod) {
        emailContactMethod.getClass();
        this.value = emailContactMethod;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ContactMethod$Type$Email) && Intrinsics.areEqual(this.value, ((ContactMethod$Type$Email) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Email(value=" + this.value + ")";
    }
}
