package com.squareup.protos.roster.business_hours;

import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;
import net.idrnd.face.iad.capture.internal.y0;

/* loaded from: classes8.dex */
public enum DayOfWeek implements WireEnum {
    SUN(0),
    MON(1),
    TUE(2),
    WED(3),
    THU(4),
    FRI(5),
    SAT(6);

    public static final DayOfWeek$Companion$ADAPTER$1 ADAPTER;
    public static final y0 Companion;
    public final int value;

    static {
        DayOfWeek dayOfWeek = SUN;
        Companion = new y0();
        ADAPTER = new DayOfWeek$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(DayOfWeek.class), Syntax.PROTO_2, dayOfWeek);
    }

    DayOfWeek(int i) {
        this.value = i;
    }

    public static final DayOfWeek fromValue(int i) {
        Companion.getClass();
        switch (i) {
            case 0:
                return SUN;
            case 1:
                return MON;
            case 2:
                return TUE;
            case 3:
                return WED;
            case 4:
                return THU;
            case 5:
                return FRI;
            case 6:
                return SAT;
            default:
                return null;
        }
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
