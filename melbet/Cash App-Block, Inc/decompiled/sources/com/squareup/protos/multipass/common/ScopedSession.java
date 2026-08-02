package com.squareup.protos.multipass.common;

import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;
import net.oneformapp.helper.matching.POPMatchingFactory;

/* loaded from: classes8.dex */
public enum ScopedSession implements WireEnum {
    SQUARE(0),
    CAPITAL_PARTNERSHIPS(1),
    BUYER(2),
    CAPITAL_CONSUMER(3),
    HIRING_WEB(4),
    SQUARE_BUYER(5);

    public static final ScopedSession$Companion$ADAPTER$1 ADAPTER;
    public static final POPMatchingFactory Companion;
    public final int value;

    static {
        ScopedSession scopedSession = SQUARE;
        Companion = new POPMatchingFactory(1);
        ADAPTER = new ScopedSession$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ScopedSession.class), Syntax.PROTO_2, scopedSession);
    }

    ScopedSession(int i) {
        this.value = i;
    }

    public static final ScopedSession fromValue(int i) {
        Companion.getClass();
        return POPMatchingFactory.fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
