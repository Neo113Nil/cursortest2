package com.squareup.workflow1;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.ExitTransitionImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import com.squareup.workflow1.StatefulWorkflow;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class WorkflowInterceptorKt$intercept$1$render$1 extends Lambda implements Function3 {
    public final /* synthetic */ Object $context;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $workflow;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WorkflowInterceptorKt$intercept$1$render$1(int i, Object obj, Object obj2, Object obj3) {
        super(3);
        this.$r8$classId = i;
        this.$context = obj;
        this.$workflow = obj2;
        this.this$0 = obj3;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Object obj4 = this.this$0;
        Object obj5 = this.$workflow;
        Object obj6 = this.$context;
        switch (i) {
            case 0:
                StatefulWorkflow.RenderContext renderContext = (StatefulWorkflow.RenderContext) obj6;
                StatefulWorkflow statefulWorkflow = (StatefulWorkflow) obj5;
                WorkflowInterceptorKt$intercept$1 workflowInterceptorKt$intercept$1 = (WorkflowInterceptorKt$intercept$1) obj4;
                StatefulWorkflow.RenderContext renderContext2 = renderContext instanceof StatefulWorkflow.RenderContext ? renderContext : null;
                if (renderContext2 == null) {
                    renderContext2 = new StatefulWorkflow.RenderContext(workflowInterceptorKt$intercept$1, renderContext);
                }
                return statefulWorkflow.render(obj, obj2, renderContext2);
            default:
                ((Number) obj3).intValue();
                GapComposer gapComposer = (GapComposer) ((Composer) obj2);
                gapComposer.startReplaceGroup(1840112047);
                Modifier then = ((Modifier) obj).then(EnterExitTransitionKt.createModifier(((AnimatedVisibilityScope) obj6).getTransition(), (EnterTransitionImpl) obj5, (ExitTransitionImpl) obj4, null, "animateEnterExit", gapComposer, 0, 12));
                gapComposer.end(false);
                return then;
        }
    }
}
