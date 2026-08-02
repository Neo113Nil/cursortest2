package com.squareup.workflow1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes8.dex */
public interface BaseRenderContext {
    Sink getActionSink();

    Object renderChild(StatefulWorkflow statefulWorkflow, Object obj, String str, Function1 function1);

    void runningSideEffect(String str, Function2 function2);
}
