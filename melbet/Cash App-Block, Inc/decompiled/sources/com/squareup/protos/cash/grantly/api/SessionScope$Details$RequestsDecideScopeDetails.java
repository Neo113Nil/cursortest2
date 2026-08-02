package com.squareup.protos.cash.grantly.api;

import com.squareup.protos.cash.grantly.api.SessionScope;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SessionScope$Details$RequestsDecideScopeDetails {
    public final SessionScope.RequestsDecideScopeDetails value;

    public SessionScope$Details$RequestsDecideScopeDetails(SessionScope.RequestsDecideScopeDetails requestsDecideScopeDetails) {
        requestsDecideScopeDetails.getClass();
        this.value = requestsDecideScopeDetails;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SessionScope$Details$RequestsDecideScopeDetails) && Intrinsics.areEqual(this.value, ((SessionScope$Details$RequestsDecideScopeDetails) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "RequestsDecideScopeDetails(value=" + this.value + ")";
    }
}
