package com.squareup.stafftasks.resources;

import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.full.KClasses$$Lambda$1;

/* loaded from: classes8.dex */
public enum TaskStatus implements WireEnum {
    UNKNOWN(0),
    COMPLETE(1),
    INCOMPLETE(2);

    public static final TaskStatus$Companion$ADAPTER$1 ADAPTER;
    public static final KClasses$$Lambda$1 Companion;
    public final int value;

    static {
        TaskStatus taskStatus = UNKNOWN;
        Companion = new KClasses$$Lambda$1(8);
        ADAPTER = new TaskStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TaskStatus.class), Syntax.PROTO_2, taskStatus);
    }

    TaskStatus(int i) {
        this.value = i;
    }

    public static final TaskStatus fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return COMPLETE;
        }
        if (i != 2) {
            return null;
        }
        return INCOMPLETE;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
