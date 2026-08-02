package com.withpersona.sdk2.inquiry.sna;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;

/* loaded from: classes9.dex */
public final class SnaClient$Response$Error {
    public final String errorMessage;
    public final String errorName;

    public SnaClient$Response$Error(String str, String str2) {
        this.errorName = str;
        this.errorMessage = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SnaClient$Response$Error)) {
            return false;
        }
        SnaClient$Response$Error snaClient$Response$Error = (SnaClient$Response$Error) obj;
        return this.errorName.equals(snaClient$Response$Error.errorName) && this.errorMessage.equals(snaClient$Response$Error.errorMessage);
    }

    public final int hashCode() {
        return this.errorMessage.hashCode() + (this.errorName.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("Error(errorName=", this.errorName, ", errorMessage=", this.errorMessage, ")");
    }
}
