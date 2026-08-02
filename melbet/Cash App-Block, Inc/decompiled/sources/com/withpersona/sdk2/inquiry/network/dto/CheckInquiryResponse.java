package com.withpersona.sdk2.inquiry.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.Tags;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0015\u0016\u0017\u0018\u0019B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;", "", "data", "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Data;", "token", "", "included", "", "Lcom/withpersona/sdk2/inquiry/network/dto/Included;", "meta", "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Meta;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Data;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Meta;)V", "getData", "()Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Data;", "getToken", "()Ljava/lang/String;", "getIncluded", "()Ljava/util/List;", "getMeta", "()Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Meta;", "Meta", "Data", "Attributes", "WaitForTransitionConfig", "PollingMode", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CheckInquiryResponse {
    private final Data data;
    private final List<Included> included;
    private final Meta meta;
    private final String token;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Attributes;", "", "selectedCountryCode", "", "status", "nextStep", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "fields", "", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "waitForTransitionConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$WaitForTransitionConfig;", "environment", "redirectUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$WaitForTransitionConfig;Ljava/lang/String;Ljava/lang/String;)V", "getSelectedCountryCode", "()Ljava/lang/String;", "getStatus", "getNextStep", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "getFields", "()Ljava/util/Map;", "getWaitForTransitionConfig", "()Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$WaitForTransitionConfig;", "getEnvironment", "getRedirectUri", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Attributes {
        private final String environment;
        private final Map<String, InquiryField> fields;
        private final NextStep nextStep;
        private final String redirectUri;
        private final String selectedCountryCode;
        private final String status;
        private final WaitForTransitionConfig waitForTransitionConfig;

        /* JADX WARN: Multi-variable type inference failed */
        public Attributes(String str, String str2, NextStep nextStep, Map<String, ? extends InquiryField> map, @Json(name = "waitForTransition") WaitForTransitionConfig waitForTransitionConfig, String str3, String str4) {
            nextStep.getClass();
            waitForTransitionConfig.getClass();
            this.selectedCountryCode = str;
            this.status = str2;
            this.nextStep = nextStep;
            this.fields = map;
            this.waitForTransitionConfig = waitForTransitionConfig;
            this.environment = str3;
            this.redirectUri = str4;
        }

        public final String getEnvironment() {
            return this.environment;
        }

        public final Map<String, InquiryField> getFields() {
            return this.fields;
        }

        public final NextStep getNextStep() {
            return this.nextStep;
        }

        public final String getRedirectUri() {
            return this.redirectUri;
        }

        public final String getSelectedCountryCode() {
            return this.selectedCountryCode;
        }

        public final String getStatus() {
            return this.status;
        }

        public final WaitForTransitionConfig getWaitForTransitionConfig() {
            return this.waitForTransitionConfig;
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Meta;", "", "accessToken", "", "<init>", "(Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Meta {
        private final String accessToken;

        public Meta(String str) {
            this.accessToken = str;
        }

        public final String getAccessToken() {
            return this.accessToken;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$PollingMode;", "", "<init>", "(Ljava/lang/String;I)V", "Blocking", "Background", "None", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PollingMode {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PollingMode[] $VALUES;

        @Json(name = "blocking")
        public static final PollingMode Blocking = new PollingMode("Blocking", 0);

        @Json(name = "background")
        public static final PollingMode Background = new PollingMode("Background", 1);

        @Json(name = "none")
        public static final PollingMode None = new PollingMode("None", 2);

        private static final /* synthetic */ PollingMode[] $values() {
            return new PollingMode[]{Blocking, Background, None};
        }

        static {
            PollingMode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
        }

        private PollingMode(String str, int i) {
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static PollingMode valueOf(String str) {
            return (PollingMode) Enum.valueOf(PollingMode.class, str);
        }

        public static PollingMode[] values() {
            return (PollingMode[]) $VALUES.clone();
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$WaitForTransitionConfig;", "", "intervalMs", "", "maxAttempts", "pollingMode", "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$PollingMode;", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$PollingMode;)V", "getIntervalMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMaxAttempts", "getPollingMode", "()Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$PollingMode;", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class WaitForTransitionConfig {
        private final Long intervalMs;
        private final Long maxAttempts;
        private final PollingMode pollingMode;

        public WaitForTransitionConfig(Long l, Long l2, PollingMode pollingMode) {
            pollingMode.getClass();
            this.intervalMs = l;
            this.maxAttempts = l2;
            this.pollingMode = pollingMode;
        }

        public final Long getIntervalMs() {
            return this.intervalMs;
        }

        public final Long getMaxAttempts() {
            return this.maxAttempts;
        }

        public final PollingMode getPollingMode() {
            return this.pollingMode;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CheckInquiryResponse(Data data, String str, List<? extends Included> list, Meta meta) {
        data.getClass();
        this.data = data;
        this.token = str;
        this.included = list;
        this.meta = meta;
    }

    public final Data getData() {
        return this.data;
    }

    public final List<Included> getIncluded() {
        return this.included;
    }

    public final Meta getMeta() {
        return this.meta;
    }

    public final String getToken() {
        return this.token;
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Data;", "", "id", "", "type", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Attributes;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Attributes;)V", "getId", "()Ljava/lang/String;", "getType", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Attributes;", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data {
        private final Attributes attributes;
        private final String id;
        private final String type;

        public /* synthetic */ Data(String str, String str2, Attributes attributes, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? new Attributes(null, null, NextStep.Unknown.INSTANCE, null, new WaitForTransitionConfig(null, null, PollingMode.None), null, null) : attributes);
        }

        public final Attributes getAttributes() {
            return this.attributes;
        }

        public final String getId() {
            return this.id;
        }

        public final String getType() {
            return this.type;
        }

        public Data(String str, String str2, Attributes attributes) {
            str.getClass();
            str2.getClass();
            attributes.getClass();
            this.id = str;
            this.type = str2;
            this.attributes = attributes;
        }
    }
}
