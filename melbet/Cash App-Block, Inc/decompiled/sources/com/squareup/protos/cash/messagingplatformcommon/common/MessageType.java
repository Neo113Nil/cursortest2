package com.squareup.protos.cash.messagingplatformcommon.common;

import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;
import okio.Path;

/* loaded from: classes.dex */
public enum MessageType implements WireEnum {
    ADVERTISING(1),
    INFORMATION(2),
    USER_ACTIVITY(3),
    CRITICAL(4),
    TRANSACTIONAL_CRITICAL(5),
    TRANSACTIONAL_URGENT_ACCOUNT_NOTICE(6),
    TRANSACTIONAL_CUSTOMER_DRIVEN_MESSAGING(7),
    TRANSACTIONAL_NON_URGENT_ACCOUNT_NOTICE(8),
    MARKETING_ONBOARDING_AND_EDUCATION(9),
    MARKETING_ENGAGEMENT(10),
    MARKETING_CROSS_SELL(11),
    MARKETING_BRAND(12),
    MARKETING_TIME_SENSITIVE(13);

    public final int value;
    public static final Path.Companion Companion = new Path.Companion();
    public static final MessageType$Companion$ADAPTER$1 ADAPTER = new MessageType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(MessageType.class), Syntax.PROTO_2, null);

    MessageType(int i) {
        this.value = i;
    }

    public static final MessageType fromValue(int i) {
        Companion.getClass();
        return Path.Companion.m4346fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
