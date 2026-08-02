package com.squareup.protos.franklin.investing.common;

import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;
import okio.AsyncTimeout;

/* loaded from: classes.dex */
public enum HistoricalRange implements WireEnum {
    DAY(1),
    WEEK(2),
    MONTH(3),
    YEAR(6),
    ALL(7);

    public final int value;
    public static final AsyncTimeout.Companion Companion = new AsyncTimeout.Companion();
    public static final HistoricalRange$Companion$ADAPTER$1 ADAPTER = new HistoricalRange$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(HistoricalRange.class), Syntax.PROTO_2, null);

    HistoricalRange(int i) {
        this.value = i;
    }

    public static final HistoricalRange fromValue(int i) {
        Companion.getClass();
        return AsyncTimeout.Companion.m4331fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
