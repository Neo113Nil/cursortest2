package com.squareup.stafftasks.resources;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class TargetEntityType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        TargetEntityType.Companion.getClass();
        if (i == 0) {
            return TargetEntityType.DO_NOT_USE_TARGET_ENTITY_TYPE;
        }
        if (i != 1) {
            return null;
        }
        return TargetEntityType.TEAM_MEMBER;
    }
}
