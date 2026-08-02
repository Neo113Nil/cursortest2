package com.withpersona.sdk2.inquiry.featureflag.network;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse;", "", "FeatureFlagDataResponse", "feature-flag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class FeatureFlagResponse {
    public final List data;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse$FeatureFlagDataResponse;", "", "", "id", "type", "", "enabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "feature-flag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FeatureFlagDataResponse {
        public final boolean enabled;
        public final String id;

        /* renamed from: type, reason: collision with root package name */
        public final String f1452type;

        public FeatureFlagDataResponse(@Json(name = "id") String str, @Json(name = "type") String str2, @Json(name = "enabled") boolean z) {
            str.getClass();
            str2.getClass();
            this.id = str;
            this.f1452type = str2;
            this.enabled = z;
        }
    }

    public FeatureFlagResponse(List list) {
        this.data = list;
    }
}
