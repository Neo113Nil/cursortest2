package com.squareup.protos.cash.whimsicard.flows.v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class PresentationMode$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PresentationMode.Companion.getClass();
        if (i == 0) {
            return PresentationMode.PRESENTATION_MODE_UNSPECIFIED;
        }
        if (i == 1) {
            return PresentationMode.ONBOARDING;
        }
        if (i == 2) {
            return PresentationMode.GRID;
        }
        if (i != 3) {
            return null;
        }
        return PresentationMode.DEVICE_VIEW;
    }
}
