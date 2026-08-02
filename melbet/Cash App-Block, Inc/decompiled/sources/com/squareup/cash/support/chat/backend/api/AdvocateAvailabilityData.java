package com.squareup.cash.support.chat.backend.api;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/support/chat/backend/api/AdvocateAvailabilityData;", "", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AdvocateAvailabilityData {
    public final String idempotenceToken;
    public final long timestamp;

    public AdvocateAvailabilityData(String str, long j) {
        this.idempotenceToken = str;
        this.timestamp = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvocateAvailabilityData)) {
            return false;
        }
        AdvocateAvailabilityData advocateAvailabilityData = (AdvocateAvailabilityData) obj;
        return this.idempotenceToken.equals(advocateAvailabilityData.idempotenceToken) && this.timestamp == advocateAvailabilityData.timestamp;
    }

    public final int hashCode() {
        return Long.hashCode(this.timestamp) + (this.idempotenceToken.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("AdvocateAvailabilityData(idempotenceToken=", this.idempotenceToken, ", timestamp=", this.timestamp);
        m.append(")");
        return m.toString();
    }
}
