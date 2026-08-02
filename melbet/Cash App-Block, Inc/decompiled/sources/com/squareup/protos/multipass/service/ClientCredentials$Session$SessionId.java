package com.squareup.protos.multipass.service;

import com.google.android.gms.internal.mlkit_vision_face.zzjo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class ClientCredentials$Session$SessionId extends zzjo {
    public final ClientSessionToken value;

    public ClientCredentials$Session$SessionId(ClientSessionToken clientSessionToken) {
        clientSessionToken.getClass();
        this.value = clientSessionToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClientCredentials$Session$SessionId) && Intrinsics.areEqual(this.value, ((ClientCredentials$Session$SessionId) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SessionId(value=" + this.value + ")";
    }
}
