package com.squareup.cash.work.wages.real;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class EmployerIdentity {
    public final String name;
    public final String token;

    public EmployerIdentity(String str, String str2) {
        str2.getClass();
        this.name = str;
        this.token = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmployerIdentity)) {
            return false;
        }
        EmployerIdentity employerIdentity = (EmployerIdentity) obj;
        return this.name.equals(employerIdentity.name) && Intrinsics.areEqual(this.token, employerIdentity.token);
    }

    public final int hashCode() {
        return this.token.hashCode() + (this.name.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("EmployerIdentity(name=", this.name, ", token=", this.token, ")");
    }
}
