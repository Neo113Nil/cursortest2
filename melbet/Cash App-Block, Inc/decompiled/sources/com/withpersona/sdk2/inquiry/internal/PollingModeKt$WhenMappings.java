package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class PollingModeKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[CheckInquiryResponse.PollingMode.values().length];
        try {
            iArr[CheckInquiryResponse.PollingMode.Blocking.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CheckInquiryResponse.PollingMode.Background.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CheckInquiryResponse.PollingMode.None.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
