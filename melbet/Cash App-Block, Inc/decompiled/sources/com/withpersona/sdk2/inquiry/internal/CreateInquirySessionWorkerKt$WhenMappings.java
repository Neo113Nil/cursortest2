package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.network.dto.GpsCollectionRequirement;
import com.withpersona.sdk2.inquiry.network.dto.GpsPrecisionRequirement;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class CreateInquirySessionWorkerKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[GpsCollectionRequirement.values().length];
        try {
            iArr[GpsCollectionRequirement.REQUIRE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[GpsCollectionRequirement.OPTIONAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[GpsCollectionRequirement.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[GpsPrecisionRequirement.values().length];
        try {
            iArr2[GpsPrecisionRequirement.PRECISE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[GpsPrecisionRequirement.ROUGH.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
