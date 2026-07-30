package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public enum BoundType {
    OPEN(false),
    CLOSED(true);

    final boolean inclusive;

    BoundType(boolean z7) {
        this.inclusive = z7;
    }

    static BoundType forBoolean(boolean z7) {
        return z7 ? CLOSED : OPEN;
    }
}
