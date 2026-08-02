package com.squareup.protos.policychecker.v1;

import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.full.KClasses$$Lambda$1;

/* loaded from: classes9.dex */
public enum EvaluationVerdict implements WireEnum {
    PASSED(1),
    FAILED(2),
    NOT_EVALUATED(3),
    BYPASSED(4),
    RULE_MISSING_SIGNAL(5);

    public final int value;
    public static final KClasses$$Lambda$1 Companion = new KClasses$$Lambda$1(2);
    public static final EvaluationVerdict$Companion$ADAPTER$1 ADAPTER = new EvaluationVerdict$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(EvaluationVerdict.class), Syntax.PROTO_2, null);

    EvaluationVerdict(int i) {
        this.value = i;
    }

    public static final EvaluationVerdict fromValue(int i) {
        Companion.getClass();
        return KClasses$$Lambda$1.fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
