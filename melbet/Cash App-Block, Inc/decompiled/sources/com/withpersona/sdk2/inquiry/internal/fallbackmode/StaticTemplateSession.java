package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.lifecycle.SavedStateHandle;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.withpersona.sdk2.inquiry.internal.InquiryState;
import com.withpersona.sdk2.inquiry.internal.network.ConversionsKt;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class StaticTemplateSession {
    public final String authorization;
    public final String inquiryId;
    public final SavedStateHandle savedStateHandle;
    public final List steps;

    public StaticTemplateSession(List list, String str, SavedStateHandle savedStateHandle) {
        list.getClass();
        str.getClass();
        savedStateHandle.getClass();
        this.steps = list;
        this.savedStateHandle = savedStateHandle;
        this.inquiryId = Boxes$$ExternalSyntheticOutline1.m();
        this.authorization = Recorder$$ExternalSyntheticOutline2.m("Bearer ", str);
    }

    public final InquiryState currentStepAsInquiryState$inquiry_internal_release() {
        NextStep nextStep = (NextStep) this.steps.get(getCurrentStepIndex());
        if (nextStep instanceof NextStep.Ui) {
            return ConversionsKt.toInquiryState((NextStep.Ui) nextStep, this.authorization, this.inquiryId, "fake_status", (Map) null, InquirySessionConfig.Default, (String) null);
        }
        boolean z = nextStep instanceof NextStep.GovernmentId;
        String str = this.inquiryId;
        String str2 = this.authorization;
        if (z) {
            return ConversionsKt.toInquiryState((NextStep.GovernmentId) nextStep, str2, str, (String) null, InquirySessionConfig.Default);
        }
        if (nextStep instanceof NextStep.Selfie) {
            return ConversionsKt.toInquiryState((NextStep.Selfie) nextStep, str2, str, InquirySessionConfig.Default);
        }
        if (nextStep instanceof NextStep.Document) {
            return ConversionsKt.toInquiryState((NextStep.Document) nextStep, str2, str, InquirySessionConfig.Default);
        }
        if (nextStep instanceof NextStep.Complete) {
            return ConversionsKt.toInquiryState((NextStep.Complete) nextStep, this.authorization, this.inquiryId, "fake_status", (Map) null, InquirySessionConfig.Default, (String) null);
        }
        if (nextStep instanceof NextStep.Integration) {
            return ConversionsKt.toInquiryState((NextStep.Integration) nextStep, str2, str, "fake_status", InquirySessionConfig.Default);
        }
        if (Intrinsics.areEqual(nextStep, NextStep.Unknown.INSTANCE)) {
            a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m("Unknown type for step ", nextStep.getName()));
            return null;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public final int getCurrentStepIndex() {
        Integer num = (Integer) this.savedStateHandle.get("current_fallback_mode_step_index");
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
