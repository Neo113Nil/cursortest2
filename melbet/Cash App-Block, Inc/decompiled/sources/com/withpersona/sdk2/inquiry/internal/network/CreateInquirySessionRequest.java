package com.withpersona.sdk2.inquiry.internal.network;

import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionRequest;", "", "Data", "Meta", "inquiry-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CreateInquirySessionRequest {
    public final Data data;
    public final Meta meta;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionRequest$Meta;", "", "inquiry-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Meta {
        public final String inquiryId;

        public Meta(String str) {
            str.getClass();
            this.inquiryId = str;
        }
    }

    public CreateInquirySessionRequest(Data data, Meta meta) {
        this.data = data;
        this.meta = meta;
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionRequest$Data;", "", "inquiry-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data {

        /* renamed from: type, reason: collision with root package name */
        public final String f1457type;

        public /* synthetic */ Data(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "inquiry-session" : str);
        }

        public Data(String str) {
            str.getClass();
            this.f1457type = str;
        }
    }
}
