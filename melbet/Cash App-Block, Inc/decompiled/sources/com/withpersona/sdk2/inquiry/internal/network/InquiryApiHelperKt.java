package com.withpersona.sdk2.inquiry.internal.network;

import com.withpersona.sdk2.inquiry.internal.CreateInquirySessionWorkerKt$WhenMappings;
import com.withpersona.sdk2.inquiry.network.dto.Attributes;
import com.withpersona.sdk2.inquiry.sandbox.SandboxFlags_Factory;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsCollectionRequirement;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsPrecisionRequirement;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public abstract class InquiryApiHelperKt {
    public static final SandboxFlags_Factory INSTANCE = new SandboxFlags_Factory(14);
    public static final SandboxFlags_Factory INSTANCE$1 = new SandboxFlags_Factory(15);
    public static final SandboxFlags_Factory INSTANCE$2 = new SandboxFlags_Factory(16);
    public static final SandboxFlags_Factory INSTANCE$3 = new SandboxFlags_Factory(17);

    public static final InquirySessionConfig toInquirySessionConfig(Attributes attributes) {
        GpsCollectionRequirement gpsCollectionRequirement;
        GpsPrecisionRequirement gpsPrecisionRequirement;
        attributes.getClass();
        com.withpersona.sdk2.inquiry.network.dto.GpsCollectionRequirement gpsCollectionRequirement2 = attributes.getGpsCollectionRequirement();
        if (gpsCollectionRequirement2 != null) {
            int i = CreateInquirySessionWorkerKt$WhenMappings.$EnumSwitchMapping$0[gpsCollectionRequirement2.ordinal()];
            if (i == 1) {
                gpsCollectionRequirement = GpsCollectionRequirement.REQUIRED;
            } else if (i == 2) {
                gpsCollectionRequirement = GpsCollectionRequirement.OPTIONAL;
            } else {
                if (i != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                gpsCollectionRequirement = GpsCollectionRequirement.NONE;
            }
        } else {
            gpsCollectionRequirement = GpsCollectionRequirement.NONE;
        }
        com.withpersona.sdk2.inquiry.network.dto.GpsPrecisionRequirement gpsPrecisionRequirement2 = attributes.getGpsPrecisionRequirement();
        if (gpsPrecisionRequirement2 != null) {
            int i2 = CreateInquirySessionWorkerKt$WhenMappings.$EnumSwitchMapping$1[gpsPrecisionRequirement2.ordinal()];
            if (i2 == 1) {
                gpsPrecisionRequirement = GpsPrecisionRequirement.PRECISE;
            } else {
                if (i2 != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                gpsPrecisionRequirement = GpsPrecisionRequirement.ROUGH;
            }
        } else {
            gpsPrecisionRequirement = GpsPrecisionRequirement.PRECISE;
        }
        return new InquirySessionConfig(gpsCollectionRequirement, gpsPrecisionRequirement, attributes.getPlayIntegrityProjectId() != null);
    }
}
