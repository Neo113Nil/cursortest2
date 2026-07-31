package androidx.work.impl;

import androidx.annotation.RestrictTo;
import androidx.work.impl.model.WorkSpec;

@RestrictTo
/* loaded from: classes14.dex */
public interface Scheduler {
    void cancel(String str);

    boolean hasLimitedSchedulingSlots();

    void schedule(WorkSpec... workSpecArr);
}
