package com.squareup.protos.cash.api;

import com.squareup.cash.work.service.real.WorkCookieJar;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class InternalRegion implements WireEnum {
    public static final /* synthetic */ InternalRegion[] $VALUES;
    public static final InternalRegion$Companion$ADAPTER$1 ADAPTER;
    public static final InternalRegion CASH_US_WEST_2;
    public static final WorkCookieJar Companion;

    static {
        InternalRegion internalRegion = new InternalRegion("CASH_US_WEST_2", 0);
        CASH_US_WEST_2 = internalRegion;
        $VALUES = new InternalRegion[]{internalRegion};
        Companion = new WorkCookieJar(16);
        ADAPTER = new InternalRegion$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(InternalRegion.class), Syntax.PROTO_2, null);
    }

    public static final InternalRegion fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return CASH_US_WEST_2;
        }
        return null;
    }

    public static InternalRegion valueOf(String str) {
        return (InternalRegion) Enum.valueOf(InternalRegion.class, str);
    }

    public static InternalRegion[] values() {
        return (InternalRegion[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return 1;
    }
}
