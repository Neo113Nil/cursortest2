package com.squareup.protos.cash.whimsicard.flows.v1;

import com.squareup.protos.cash.spendinginsights.TextSize;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum PresentationMode implements WireEnum {
    PRESENTATION_MODE_UNSPECIFIED(0),
    ONBOARDING(1),
    GRID(2),
    DEVICE_VIEW(3);

    public static final PresentationMode$Companion$ADAPTER$1 ADAPTER;
    public static final TextSize.Companion Companion;
    public final int value;

    static {
        PresentationMode presentationMode = PRESENTATION_MODE_UNSPECIFIED;
        Companion = new TextSize.Companion();
        ADAPTER = new PresentationMode$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(PresentationMode.class), Syntax.PROTO_2, presentationMode);
    }

    PresentationMode(int i) {
        this.value = i;
    }

    public static final PresentationMode fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return PRESENTATION_MODE_UNSPECIFIED;
        }
        if (i == 1) {
            return ONBOARDING;
        }
        if (i == 2) {
            return GRID;
        }
        if (i != 3) {
            return null;
        }
        return DEVICE_VIEW;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
