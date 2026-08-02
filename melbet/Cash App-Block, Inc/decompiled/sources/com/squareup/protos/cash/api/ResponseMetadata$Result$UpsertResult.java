package com.squareup.protos.cash.api;

import com.squareup.protos.cash.api.ResponseMetadata;

/* loaded from: classes7.dex */
public final class ResponseMetadata$Result$UpsertResult {
    public final ResponseMetadata.UpsertResult value;

    public ResponseMetadata$Result$UpsertResult(ResponseMetadata.UpsertResult upsertResult) {
        upsertResult.getClass();
        this.value = upsertResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResponseMetadata$Result$UpsertResult) && this.value == ((ResponseMetadata$Result$UpsertResult) obj).value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "UpsertResult(value=" + this.value + ")";
    }
}
