package com.squareup.protos.multipass.service;

import com.google.android.gms.internal.mlkit_vision_face.zzjo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class ClientCredentials$Session$Headers extends zzjo {
    public final SessionHeaders value;

    public ClientCredentials$Session$Headers(SessionHeaders sessionHeaders) {
        sessionHeaders.getClass();
        this.value = sessionHeaders;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClientCredentials$Session$Headers) && Intrinsics.areEqual(this.value, ((ClientCredentials$Session$Headers) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Headers(value=" + this.value + ")";
    }
}
