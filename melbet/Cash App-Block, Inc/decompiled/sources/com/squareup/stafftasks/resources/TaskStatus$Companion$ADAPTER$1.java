package com.squareup.stafftasks.resources;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class TaskStatus$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        TaskStatus.Companion.getClass();
        if (i == 0) {
            return TaskStatus.UNKNOWN;
        }
        if (i == 1) {
            return TaskStatus.COMPLETE;
        }
        if (i != 2) {
            return null;
        }
        return TaskStatus.INCOMPLETE;
    }
}
