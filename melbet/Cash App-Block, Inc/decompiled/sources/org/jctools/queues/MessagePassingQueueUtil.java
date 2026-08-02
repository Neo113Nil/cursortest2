package org.jctools.queues;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.trace.core.PendingTraceBuffer;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import org.jctools.queues.MessagePassingQueue;

/* loaded from: classes10.dex */
public abstract class MessagePassingQueueUtil {
    public static <E> int drain(MessagePassingQueue messagePassingQueue, MessagePassingQueue.Consumer consumer, int i) {
        int i2 = 0;
        if (consumer == null) {
            a$$ExternalSyntheticBUOutline0.m$3("c is null");
            return 0;
        }
        if (i < 0) {
            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "limit is negative: "));
            return 0;
        }
        if (i == 0) {
            return 0;
        }
        while (i2 < i) {
            Object relaxedPoll = ((MpscBlockingConsumerArrayQueue) messagePassingQueue).relaxedPoll();
            if (relaxedPoll == null) {
                break;
            }
            ((PendingTraceBuffer.Element) relaxedPoll).write();
            i2++;
        }
        return i2;
    }
}
