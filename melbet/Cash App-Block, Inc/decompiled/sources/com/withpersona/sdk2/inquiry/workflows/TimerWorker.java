package com.withpersona.sdk2.inquiry.workflows;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.rx3.RxConvertKt$asFlow$1;

/* loaded from: classes9.dex */
public final class TimerWorker implements WorkflowWorker {
    public final long delayMs;

    public TimerWorker(long j) {
        this.delayMs = j;
    }

    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowWorker
    public final boolean doesSameWorkAs(WorkflowWorker workflowWorker) {
        return (workflowWorker instanceof TimerWorker) && ((TimerWorker) workflowWorker).delayMs == this.delayMs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TimerWorker) && this.delayMs == ((TimerWorker) obj).delayMs;
    }

    public final int hashCode() {
        return Long.hashCode(this.delayMs);
    }

    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowWorker
    public final Flow run() {
        return new SafeFlow(new RxConvertKt$asFlow$1(this, null, 6));
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m(this.delayMs, "TimerWorker(delayMs=", ")");
    }
}
