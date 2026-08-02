package com.withpersona.sdk2.inquiry;

import kotlin.Metadata;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryActivityBroadcastManager;", "", "<init>", "()V", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "_eventFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent;", "eventFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "getEventFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "cancelRunningInquiries", "", "skipBackendCall", "", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InquiryActivityBroadcastManager {
    public static final InquiryActivityBroadcastManager INSTANCE = new InquiryActivityBroadcastManager();
    private static final CoroutineScope coroutineScope = JobKt.CoroutineScope(Dispatchers.Default.plus(JobKt.SupervisorJob$default()));
    private static final MutableSharedFlow _eventFlow = FlowKt.MutableSharedFlow$default(0, 0, null, 7);

    private InquiryActivityBroadcastManager() {
    }

    public static /* synthetic */ void cancelRunningInquiries$default(InquiryActivityBroadcastManager inquiryActivityBroadcastManager, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        inquiryActivityBroadcastManager.cancelRunningInquiries(z);
    }

    public final void cancelRunningInquiries(boolean skipBackendCall) {
        JobKt.launch$default(coroutineScope, null, null, new InquiryActivityBroadcastManager$cancelRunningInquiries$1(skipBackendCall, null), 3);
    }

    public final SharedFlow getEventFlow() {
        return _eventFlow;
    }
}
