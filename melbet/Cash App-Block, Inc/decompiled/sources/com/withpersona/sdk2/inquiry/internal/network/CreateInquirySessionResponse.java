package com.withpersona.sdk2.inquiry.internal.network;

import com.squareup.moshi.JsonClass;
import com.withpersona.sdk2.inquiry.network.dto.InquirySessionData;
import kotlin.Metadata;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse;", "", "Meta", "inquiry-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CreateInquirySessionResponse {
    public final InquirySessionData data;
    public final Meta meta;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Meta;", "", "inquiry-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Meta {
        public final String accessToken;

        public Meta(String str) {
            this.accessToken = str;
        }
    }

    public CreateInquirySessionResponse(InquirySessionData inquirySessionData, Meta meta) {
        this.data = inquirySessionData;
        this.meta = meta;
    }
}
