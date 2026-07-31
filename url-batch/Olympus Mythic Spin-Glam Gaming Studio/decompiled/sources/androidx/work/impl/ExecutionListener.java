package androidx.work.impl;

import androidx.annotation.RestrictTo;
import androidx.work.impl.model.WorkGenerationalId;

@RestrictTo
/* loaded from: classes6.dex */
public interface ExecutionListener {
    void onExecuted(WorkGenerationalId workGenerationalId, boolean z);
}
