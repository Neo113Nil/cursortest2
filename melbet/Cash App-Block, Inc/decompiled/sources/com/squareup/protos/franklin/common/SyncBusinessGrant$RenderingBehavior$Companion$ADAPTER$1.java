package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.SyncBusinessGrant;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class SyncBusinessGrant$RenderingBehavior$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SyncBusinessGrant.RenderingBehavior.Companion.getClass();
        if (i == 0) {
            return SyncBusinessGrant.RenderingBehavior.DEFAULT;
        }
        if (i != 1) {
            return null;
        }
        return SyncBusinessGrant.RenderingBehavior.AFTERPAY;
    }
}
