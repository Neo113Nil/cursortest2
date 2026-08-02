package com.withpersona.sdk2.inquiry.shared.external_inquiry_controller;

import com.google.android.play.core.splitcompat.zzd;
import com.withpersona.sdk2.inquiry.inline_inquiry.InquiryEvent;
import com.withpersona.sdk2.inquiry.internal.InquiryFragment$createInquiryComponentIfNeeded$externalInquiryController$1;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker$run$1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes9.dex */
public final class ExternalEventLogger {
    public final ContextScope coroutineScope;
    public zzd currentPage;
    public final InquiryFragment$createInquiryComponentIfNeeded$externalInquiryController$1 externalInquiryController;

    public ExternalEventLogger(InquiryFragment$createInquiryComponentIfNeeded$externalInquiryController$1 inquiryFragment$createInquiryComponentIfNeeded$externalInquiryController$1) {
        inquiryFragment$createInquiryComponentIfNeeded$externalInquiryController$1.getClass();
        this.externalInquiryController = inquiryFragment$createInquiryComponentIfNeeded$externalInquiryController$1;
        this.coroutineScope = JobKt.CoroutineScope(Dispatchers.Default.plus(JobKt.SupervisorJob$default()));
    }

    public final void logPageChange(zzd zzdVar) {
        if (Intrinsics.areEqual(this.currentPage, zzdVar)) {
            return;
        }
        this.currentPage = zzdVar;
        JobKt.launch$default(this.coroutineScope, null, null, new TransitionWorker$run$1(this, new InquiryEvent.PageChange(zzdVar.getStepName(), zzdVar.toString()), null, 25), 3);
    }
}
