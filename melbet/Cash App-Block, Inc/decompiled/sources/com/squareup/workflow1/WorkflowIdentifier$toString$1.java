package com.squareup.workflow1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class WorkflowIdentifier$toString$1 extends Lambda implements Function1 {
    public static final WorkflowIdentifier$toString$1 INSTANCE;
    public static final WorkflowIdentifier$toString$1 INSTANCE$1;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 1;
        INSTANCE$1 = new WorkflowIdentifier$toString$1(i, 1);
        INSTANCE = new WorkflowIdentifier$toString$1(i, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WorkflowIdentifier$toString$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                WorkflowIdentifier workflowIdentifier = (WorkflowIdentifier) obj;
                workflowIdentifier.getClass();
                Object value = workflowIdentifier.typeName$delegate.getValue();
                value.getClass();
                return (String) value;
            default:
                WorkflowIdentifier workflowIdentifier2 = (WorkflowIdentifier) obj;
                workflowIdentifier2.getClass();
                return workflowIdentifier2.proxiedIdentifier;
        }
    }
}
