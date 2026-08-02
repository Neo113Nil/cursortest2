package com.withpersona.sdk2.inquiry.internal.network;

import com.squareup.moshi.JsonClass;
import com.withpersona.sdk2.inquiry.network.dto.InquirySessionData;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeResponse;", "", "Metadata", "inquiry-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ExchangeOneTimeLinkCodeResponse {
    public final InquirySessionData data;
    public final Metadata meta;

    @JsonClass(generateAdapter = true)
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeResponse$Metadata;", "", "inquiry-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Metadata {
        public final String accessToken;

        public Metadata(String str) {
            this.accessToken = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Metadata) && Intrinsics.areEqual(this.accessToken, ((Metadata) obj).accessToken);
        }

        public final int hashCode() {
            String str = this.accessToken;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Metadata(accessToken=", this.accessToken, ")");
        }
    }

    public ExchangeOneTimeLinkCodeResponse(InquirySessionData inquirySessionData, Metadata metadata) {
        this.data = inquirySessionData;
        this.meta = metadata;
    }
}
