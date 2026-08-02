package com.squareup.protos.timecards;

import com.squareup.protos.timecards.OvertimeRule;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import net.idrnd.face.iad.capture.Plane;

/* loaded from: classes9.dex */
public final class OvertimeRule$Reason$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        OvertimeRule.Reason.Companion.getClass();
        return Plane.m4214fromValue(i);
    }
}
