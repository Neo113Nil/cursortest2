package com.squareup.stafftasks.resources;

import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;
import net.oneformapp.helper.matching.POPMatchingFactory;

/* loaded from: classes8.dex */
public enum TaskType implements WireEnum {
    DO_NOT_USE_TASK_TYPE(0),
    REVIEW_PROFILE(1),
    UPLOAD_DOCUMENT(2),
    PAYROLL_ONBOARDING(3),
    REVIEW_DOCUMENT(4);

    public static final TaskType$Companion$ADAPTER$1 ADAPTER;
    public static final POPMatchingFactory Companion;
    public final int value;

    static {
        TaskType taskType = DO_NOT_USE_TASK_TYPE;
        Companion = new POPMatchingFactory(9);
        ADAPTER = new TaskType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TaskType.class), Syntax.PROTO_2, taskType);
    }

    TaskType(int i) {
        this.value = i;
    }

    public static final TaskType fromValue(int i) {
        Companion.getClass();
        return POPMatchingFactory.m4317fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
