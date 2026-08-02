package com.squareup.protos.multipass.service;

import com.google.android.gms.internal.mlkit_vision_face.zzjo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class ClientCredentials$Session$Cookie extends zzjo {
    public final ClientSessionCookie value;

    public ClientCredentials$Session$Cookie(ClientSessionCookie clientSessionCookie) {
        clientSessionCookie.getClass();
        this.value = clientSessionCookie;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClientCredentials$Session$Cookie) && Intrinsics.areEqual(this.value, ((ClientCredentials$Session$Cookie) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Cookie(value=" + this.value + ")";
    }
}
