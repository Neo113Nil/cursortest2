package com.bytedance.sdk.openadsdk.core.rt.zmn;

import androidx.annotation.NonNull;
import com.pubmatic.sdk.video.POBVastError;

/* loaded from: classes4.dex */
public enum zmn {
    XML_PARSING_ERROR(100),
    SCHEMA_VALIDATION_ERROR(101),
    WRAPPER_TIMEOUT(301),
    NO_ADS_VAST_RESPONSE(POBVastError.NO_VAST_RESPONSE),
    GENERAL_LINEAR_AD_ERROR(400),
    GENERAL_COMPANION_AD_ERROR(600),
    UNDEFINED_ERROR(POBVastError.UNDEFINED_ERROR);

    private final int zg;

    zmn(int i) {
        this.zg = i;
    }

    @NonNull
    public String zmn() {
        return String.valueOf(this.zg);
    }
}
