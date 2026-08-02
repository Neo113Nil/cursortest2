package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.data.LinkResult;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum BuildType implements WireEnum {
    RELEASE(0),
    BETA(1),
    DOGFOOD(2),
    ALPHA(3);

    public static final BuildType$Companion$ADAPTER$1 ADAPTER;
    public static final LinkResult.Companion Companion;
    public final int value;

    static {
        BuildType buildType = RELEASE;
        Companion = new LinkResult.Companion();
        ADAPTER = new BuildType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(BuildType.class), Syntax.PROTO_2, buildType);
    }

    BuildType(int i) {
        this.value = i;
    }

    public static final BuildType fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return RELEASE;
        }
        if (i == 1) {
            return BETA;
        }
        if (i == 2) {
            return DOGFOOD;
        }
        if (i != 3) {
            return null;
        }
        return ALPHA;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
