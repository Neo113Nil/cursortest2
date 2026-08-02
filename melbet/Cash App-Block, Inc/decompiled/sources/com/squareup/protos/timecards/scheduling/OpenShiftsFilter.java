package com.squareup.protos.timecards.scheduling;

import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;
import net.oneformapp.helper.matching.POPMatchingFactory;

/* loaded from: classes8.dex */
public enum OpenShiftsFilter implements WireEnum {
    INCLUDE(0),
    EXCLUDE(1),
    ONLY(2);

    public static final OpenShiftsFilter$Companion$ADAPTER$1 ADAPTER;
    public static final POPMatchingFactory Companion;
    public final int value;

    static {
        OpenShiftsFilter openShiftsFilter = INCLUDE;
        Companion = new POPMatchingFactory(6);
        ADAPTER = new OpenShiftsFilter$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(OpenShiftsFilter.class), Syntax.PROTO_2, openShiftsFilter);
    }

    OpenShiftsFilter(int i) {
        this.value = i;
    }

    public static final OpenShiftsFilter fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return INCLUDE;
        }
        if (i == 1) {
            return EXCLUDE;
        }
        if (i != 2) {
            return null;
        }
        return ONLY;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
