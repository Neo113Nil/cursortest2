package com.squareup.stafftasks.resources;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import net.oneformapp.helper.matching.POPMatchingFactory;

/* loaded from: classes8.dex */
public final class TaskType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        TaskType.Companion.getClass();
        return POPMatchingFactory.m4317fromValue(i);
    }
}
