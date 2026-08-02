package com.stripe.android.core.networking;

/* loaded from: classes8.dex */
public final class RequestId {
    public final String value;

    public RequestId(String str) {
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RequestId) && this.value.equals(((RequestId) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return this.value;
    }
}
