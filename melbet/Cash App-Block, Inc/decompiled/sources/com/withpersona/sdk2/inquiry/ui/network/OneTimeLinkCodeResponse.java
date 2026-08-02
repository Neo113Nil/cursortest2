package com.withpersona.sdk2.inquiry.ui.network;

import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/OneTimeLinkCodeResponse;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class OneTimeLinkCodeResponse {
    public final Metadata meta;

    public OneTimeLinkCodeResponse(Metadata metadata) {
        this.meta = metadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OneTimeLinkCodeResponse) && Intrinsics.areEqual(this.meta, ((OneTimeLinkCodeResponse) obj).meta);
    }

    public final int hashCode() {
        Metadata metadata = this.meta;
        if (metadata == null) {
            return 0;
        }
        return metadata.hashCode();
    }

    public final String toString() {
        return "OneTimeLinkCodeResponse(meta=" + this.meta + ")";
    }
}
