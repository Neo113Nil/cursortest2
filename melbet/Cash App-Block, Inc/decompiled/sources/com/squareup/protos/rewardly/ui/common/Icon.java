package com.squareup.protos.rewardly.ui.common;

import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import io.noties.markwon.LinkResolverDef;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes9.dex */
public enum Icon implements WireEnum {
    TRENDING_ARROW(1),
    MAX_UP_ARROW(2),
    CLOCK(3),
    LOCK(4),
    PRICE_TAG(5),
    RECURRING_ARROW(6),
    RATE_LIMITING_PAUSE(7),
    UNLOCKED(8),
    PLAY(9),
    CARD(10),
    GLOBE(11);

    public final int value;
    public static final LinkResolverDef Companion = new LinkResolverDef(3);
    public static final Icon$Companion$ADAPTER$1 ADAPTER = new Icon$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Icon.class), Syntax.PROTO_2, null);

    Icon(int i) {
        this.value = i;
    }

    public static final Icon fromValue(int i) {
        Companion.getClass();
        return LinkResolverDef.m4117fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
