package com.squareup.protos.franklin.api;

import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class UiAlias$Type$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        UiAlias.Type.Companion.getClass();
        if (i == 1) {
            return UiAlias.Type.SMS;
        }
        if (i == 2) {
            return UiAlias.Type.EMAIL;
        }
        if (i != 3) {
            return null;
        }
        return UiAlias.Type.APP;
    }
}
