package com.squareup.workflow1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes8.dex */
public abstract class StatefulWorkflow {

    public final class RenderContext implements BaseRenderContext {
        public final /* synthetic */ BaseRenderContext $$delegate_0;

        public RenderContext(StatefulWorkflow statefulWorkflow, BaseRenderContext baseRenderContext) {
            statefulWorkflow.getClass();
            baseRenderContext.getClass();
            this.$$delegate_0 = baseRenderContext;
        }

        @Override // com.squareup.workflow1.BaseRenderContext
        public final Sink getActionSink() {
            return this.$$delegate_0.getActionSink();
        }

        @Override // com.squareup.workflow1.BaseRenderContext
        public final Object renderChild(StatefulWorkflow statefulWorkflow, Object obj, String str, Function1 function1) {
            statefulWorkflow.getClass();
            str.getClass();
            function1.getClass();
            return this.$$delegate_0.renderChild(statefulWorkflow, obj, str, function1);
        }

        @Override // com.squareup.workflow1.BaseRenderContext
        public final void runningSideEffect(String str, Function2 function2) {
            str.getClass();
            this.$$delegate_0.runningSideEffect(str, function2);
        }
    }

    public abstract Object initialState(Object obj, Snapshot snapshot);

    public Object onPropsChanged(Object obj, Object obj2, Object obj3) {
        return obj3;
    }

    public abstract Object render(Object obj, Object obj2, RenderContext renderContext);

    public abstract Snapshot snapshotState(Object obj);
}
