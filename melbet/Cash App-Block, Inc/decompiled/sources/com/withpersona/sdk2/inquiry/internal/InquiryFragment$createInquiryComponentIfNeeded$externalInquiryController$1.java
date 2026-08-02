package com.withpersona.sdk2.inquiry.internal;

import android.os.Bundle;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes9.dex */
public final class InquiryFragment$createInquiryComponentIfNeeded$externalInquiryController$1 {
    public final SharedFlowImpl controllerRequestFlow;
    public final SharedFlowImpl eventFlow;
    public final boolean handleBackPress;
    public final boolean isNavBarEnabled;
    public final StateFlowImpl screenStateFlow;

    public InquiryFragment$createInquiryComponentIfNeeded$externalInquiryController$1(InquiryFragment inquiryFragment) {
        this.controllerRequestFlow = inquiryFragment.getViewModel$1().controllerRequestFlow;
        this.screenStateFlow = inquiryFragment.getViewModel$1().screenStateFlow;
        this.eventFlow = inquiryFragment.getViewModel$1().eventFlow;
        Bundle bundle = inquiryFragment.getArgs$1().bundle;
        this.isNavBarEnabled = bundle != null ? bundle.getBoolean("IS_NAV_BAR_ENABLED", true) : true;
        Bundle bundle2 = inquiryFragment.getArgs$1().bundle;
        this.handleBackPress = bundle2 != null ? bundle2.getBoolean("HANDLE_BACK_PRESS", true) : true;
    }
}
