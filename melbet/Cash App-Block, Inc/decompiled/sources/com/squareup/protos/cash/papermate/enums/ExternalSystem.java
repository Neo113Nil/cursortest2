package com.squareup.protos.cash.papermate.enums;

import com.squareup.protos.cash.groups.SliceStatus;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum ExternalSystem implements WireEnum {
    EXTERNAL_SYSTEM_DO_NOT_USE(0),
    VDBS(1),
    ISTL(2),
    BHN_BARCODE(3),
    BHN_SWIPE(4);

    public static final ExternalSystem$Companion$ADAPTER$1 ADAPTER;
    public static final SliceStatus.Companion Companion;
    public final int value;

    static {
        ExternalSystem externalSystem = EXTERNAL_SYSTEM_DO_NOT_USE;
        Companion = new SliceStatus.Companion();
        ADAPTER = new ExternalSystem$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ExternalSystem.class), Syntax.PROTO_2, externalSystem);
    }

    ExternalSystem(int i) {
        this.value = i;
    }

    public static final ExternalSystem fromValue(int i) {
        Companion.getClass();
        return SliceStatus.Companion.m3878fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
