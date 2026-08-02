package com.withpersona.sdk2.inquiry.internal.network;

import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/VerifyDeviceIntegrityRequest;", "", "Meta", "inquiry-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class VerifyDeviceIntegrityRequest {
    public final Meta meta;

    public /* synthetic */ VerifyDeviceIntegrityRequest(Meta meta, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : meta);
    }

    public VerifyDeviceIntegrityRequest(Meta meta) {
        this.meta = meta;
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/VerifyDeviceIntegrityRequest$Meta;", "", "inquiry-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Meta {
        public final String integrityToken;
        public final String packageName;

        public /* synthetic */ Meta(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }

        public Meta(String str, String str2) {
            this.packageName = str;
            this.integrityToken = str2;
        }
    }
}
