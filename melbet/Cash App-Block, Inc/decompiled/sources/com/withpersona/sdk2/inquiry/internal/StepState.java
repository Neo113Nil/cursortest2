package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;

/* loaded from: classes9.dex */
public interface StepState {
    String getInquiryId();

    InquirySessionConfig getInquirySessionConfig();

    String getSessionToken();

    StepStyle getStyles();
}
