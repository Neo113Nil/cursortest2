package com.squareup.protos.multipass.common;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import net.oneformapp.helper.matching.POPMatchingFactory;

/* loaded from: classes8.dex */
public final class ScopedSession$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ScopedSession.Companion.getClass();
        return POPMatchingFactory.fromValue(i);
    }
}
