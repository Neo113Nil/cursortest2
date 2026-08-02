package com.squareup.protos.timecards;

import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import io.noties.markwon.LinkResolverDef;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum ShiftOptions implements WireEnum {
    DO_NOT_USE(1),
    TIMECARDS_ONLY(2),
    SCHEDULES_AND_TIMECARDS(3);

    public final int value;
    public static final LinkResolverDef Companion = new LinkResolverDef(5);
    public static final ShiftOptions$Companion$ADAPTER$1 ADAPTER = new ShiftOptions$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ShiftOptions.class), Syntax.PROTO_2, null);

    ShiftOptions(int i) {
        this.value = i;
    }

    public static final ShiftOptions fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return DO_NOT_USE;
        }
        if (i == 2) {
            return TIMECARDS_ONLY;
        }
        if (i != 3) {
            return null;
        }
        return SCHEDULES_AND_TIMECARDS;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
