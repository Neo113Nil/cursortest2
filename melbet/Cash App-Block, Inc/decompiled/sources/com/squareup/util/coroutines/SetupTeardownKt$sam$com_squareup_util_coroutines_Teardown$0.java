package com.squareup.util.coroutines;

import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class SetupTeardownKt$sam$com_squareup_util_coroutines_Teardown$0 implements Teardown, FunctionAdapter {
    public final /* synthetic */ Function0 function;

    public SetupTeardownKt$sam$com_squareup_util_coroutines_Teardown$0(Function0 function0) {
        this.function = function0;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Teardown) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // com.squareup.util.coroutines.Teardown
    public final /* synthetic */ void teardown() {
        this.function.invoke();
    }
}
