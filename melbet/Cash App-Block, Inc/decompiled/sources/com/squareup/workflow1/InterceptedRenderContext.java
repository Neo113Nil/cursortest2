package com.squareup.workflow1;

import androidx.glance.layout.SpacerKt$Spacer$3;
import com.squareup.cash.mri.android.RealMRIFactory$sign$2;
import com.squareup.workflow1.internal.ChainedWorkflowInterceptor$wrap$1;
import com.squareup.workflow1.ui.DecorativeViewFactory;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes8.dex */
public final class InterceptedRenderContext implements BaseRenderContext, Sink {
    public final BaseRenderContext baseRenderContext;

    public InterceptedRenderContext(BaseRenderContext baseRenderContext, ChainedWorkflowInterceptor$wrap$1 chainedWorkflowInterceptor$wrap$1) {
        chainedWorkflowInterceptor$wrap$1.getClass();
        this.baseRenderContext = baseRenderContext;
    }

    @Override // com.squareup.workflow1.BaseRenderContext
    public final Sink getActionSink() {
        return this;
    }

    @Override // com.squareup.workflow1.BaseRenderContext
    public final Object renderChild(StatefulWorkflow statefulWorkflow, Object obj, String str, Function1 function1) {
        statefulWorkflow.getClass();
        str.getClass();
        function1.getClass();
        new DecorativeViewFactory.AnonymousClass2(this, 2);
        throw null;
    }

    @Override // com.squareup.workflow1.BaseRenderContext
    public final void runningSideEffect(String str, Function2 function2) {
        str.getClass();
        new RealMRIFactory$sign$2.AnonymousClass1(function2, this, null, 23);
        new SpacerKt$Spacer$3(this, 7);
        throw null;
    }

    @Override // com.squareup.workflow1.Sink
    public final void send(Object obj) {
        new InterceptedRenderContext$send$1(this, 0);
        throw null;
    }
}
