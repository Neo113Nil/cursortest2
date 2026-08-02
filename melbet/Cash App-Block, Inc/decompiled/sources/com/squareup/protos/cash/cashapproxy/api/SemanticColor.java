package com.squareup.protos.cash.cashapproxy.api;

import com.squareup.cash.work.service.real.WorkCookieJar;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes6.dex */
public enum SemanticColor implements WireEnum {
    SEMANTIC_COLOR_LABEL(1),
    SEMANTIC_COLOR_SECONDARY_LABEL(2),
    SEMANTIC_COLOR_ERROR(3),
    SEMANTIC_COLOR_TERTIARY_LABEL(4),
    SEMANTIC_COLOR_VERIFICATION_TINT(5);

    public final int value;
    public static final WorkCookieJar Companion = new WorkCookieJar(20);
    public static final SemanticColor$Companion$ADAPTER$1 ADAPTER = new SemanticColor$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(SemanticColor.class), Syntax.PROTO_2, null);

    SemanticColor(int i) {
        this.value = i;
    }

    public static final SemanticColor fromValue(int i) {
        Companion.getClass();
        return WorkCookieJar.m3797fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
