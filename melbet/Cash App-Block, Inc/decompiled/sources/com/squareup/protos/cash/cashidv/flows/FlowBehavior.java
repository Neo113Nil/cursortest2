package com.squareup.protos.cash.cashidv.flows;

import com.squareup.cropview.Edge;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class FlowBehavior implements WireEnum {
    public static final /* synthetic */ FlowBehavior[] $VALUES;
    public static final FlowBehavior$Companion$ADAPTER$1 ADAPTER;
    public static final Edge.Companion Companion;
    public static final FlowBehavior ONLY_EIDV_WITH_NO_FALLBACK_DIDV;

    static {
        FlowBehavior flowBehavior = new FlowBehavior("ONLY_EIDV_WITH_NO_FALLBACK_DIDV", 0);
        ONLY_EIDV_WITH_NO_FALLBACK_DIDV = flowBehavior;
        $VALUES = new FlowBehavior[]{flowBehavior};
        Companion = new Edge.Companion(29);
        ADAPTER = new FlowBehavior$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(FlowBehavior.class), Syntax.PROTO_2, null);
    }

    public static final FlowBehavior fromValue(int i) {
        Companion.getClass();
        if (i == 3) {
            return ONLY_EIDV_WITH_NO_FALLBACK_DIDV;
        }
        return null;
    }

    public static FlowBehavior valueOf(String str) {
        return (FlowBehavior) Enum.valueOf(FlowBehavior.class, str);
    }

    public static FlowBehavior[] values() {
        return (FlowBehavior[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return 3;
    }
}
