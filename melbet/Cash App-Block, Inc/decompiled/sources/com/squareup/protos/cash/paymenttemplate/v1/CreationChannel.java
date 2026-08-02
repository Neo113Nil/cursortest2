package com.squareup.protos.cash.paymenttemplate.v1;

import com.squareup.protos.cash.groups.SliceStatus;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum CreationChannel implements WireEnum {
    CREATION_CHANNEL_UNSPECIFIED(0),
    CREATION_CHANNEL_PAY_LINK(1),
    CREATION_CHANNEL_NEARBY(2),
    CREATION_CHANNEL_LITE_SEND(3),
    CREATION_CHANNEL_REQUEST_INITIATOR(4);

    public static final CreationChannel$Companion$ADAPTER$1 ADAPTER;
    public static final SliceStatus.Companion Companion;
    public final int value;

    static {
        CreationChannel creationChannel = CREATION_CHANNEL_UNSPECIFIED;
        Companion = new SliceStatus.Companion();
        ADAPTER = new CreationChannel$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(CreationChannel.class), Syntax.PROTO_2, creationChannel);
    }

    CreationChannel(int i) {
        this.value = i;
    }

    public static final CreationChannel fromValue(int i) {
        Companion.getClass();
        return SliceStatus.Companion.m3879fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
