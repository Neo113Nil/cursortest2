package com.withpersona.sdk2.inquiry.internal.workflows;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes9.dex */
public final class InquiryWorkflowFragment$special$$inlined$lazyViewModel$2 extends Lambda implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InquiryWorkflowFragment $this_viewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InquiryWorkflowFragment$special$$inlined$lazyViewModel$2(InquiryWorkflowFragment inquiryWorkflowFragment, int i) {
        super(0);
        this.$r8$classId = i;
        this.$this_viewModels = inquiryWorkflowFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        return this.$this_viewModels;
    }
}
