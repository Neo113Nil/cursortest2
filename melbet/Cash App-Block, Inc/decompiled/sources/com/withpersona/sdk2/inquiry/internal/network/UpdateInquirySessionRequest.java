package com.withpersona.sdk2.inquiry.internal.network;

import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;", "", "Data", "Attributes", "AppdomeThreatEvent", "inquiry-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class UpdateInquirySessionRequest {
    public final Data data;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$AppdomeThreatEvent;", "", "inquiry-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AppdomeThreatEvent {
        public final String name;
        public final String reasonData;
        public final String timestamp;

        public AppdomeThreatEvent(String str, String str2, String str3) {
            this.name = str;
            this.timestamp = str2;
            this.reasonData = str3;
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$Data;", "", "inquiry-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data {
        public final Attributes attributes;

        public Data(Attributes attributes) {
            this.attributes = attributes;
        }
    }

    public UpdateInquirySessionRequest(Data data) {
        this.data = data;
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$Attributes;", "", "inquiry-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Attributes {
        public final List appdomeThreatEvents;
        public final Double gpsLatitude;
        public final Double gpsLongitude;
        public final String gpsPrecision;
        public final String silentNetworkAuthenticationCode;
        public final String silentNetworkAuthenticationErrorMessage;
        public final String silentNetworkAuthenticationErrorName;

        public /* synthetic */ Attributes(Double d, Double d2, String str, List list, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : d2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4);
        }

        public Attributes(Double d, Double d2, String str, List list, String str2, String str3, String str4) {
            this.gpsLongitude = d;
            this.gpsLatitude = d2;
            this.gpsPrecision = str;
            this.appdomeThreatEvents = list;
            this.silentNetworkAuthenticationCode = str2;
            this.silentNetworkAuthenticationErrorName = str3;
            this.silentNetworkAuthenticationErrorMessage = str4;
        }
    }
}
