package com.squareup.workflow1;

import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.TweenSpec;
import androidx.recyclerview.widget.RecyclerView;
import com.datadog.android.telemetry.model.TelemetryDebugEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonObject;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.data.blockers.FlowStarter$$ExternalSyntheticLambda0;
import com.squareup.cash.work.applets.views.WorkApplet$applet$1;
import com.squareup.scannerview.ScannerView;
import com.squareup.util.coroutines.StateFlowKt$combineState$2;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.internal.WorkflowNode;

/* loaded from: classes8.dex */
public abstract class WorkflowInterceptorKt {
    public static TelemetryDebugEvent.Session fromJsonObject(JsonObject jsonObject) {
        try {
            String asString = jsonObject.get("id").getAsString();
            asString.getClass();
            return new TelemetryDebugEvent.Session(asString);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Session", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Session", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Session", e3);
            return null;
        }
    }

    public static final StatefulWorkflow intercept(final NoopWorkflowInterceptor noopWorkflowInterceptor, final StatefulWorkflow statefulWorkflow, final WorkflowNode workflowNode) {
        noopWorkflowInterceptor.getClass();
        statefulWorkflow.getClass();
        return noopWorkflowInterceptor == NoopWorkflowInterceptor.INSTANCE ? statefulWorkflow : new StatefulWorkflow() { // from class: com.squareup.workflow1.WorkflowInterceptorKt$intercept$1
            @Override // com.squareup.workflow1.StatefulWorkflow
            public final Object initialState(Object obj, Snapshot snapshot) {
                WorkApplet$applet$1 workApplet$applet$1 = new WorkApplet$applet$1(2, statefulWorkflow, StatefulWorkflow.class, "initialState", "initialState(Ljava/lang/Object;Lcom/squareup/workflow1/Snapshot;)Ljava/lang/Object;", 0, 22);
                NoopWorkflowInterceptor.this.getClass();
                return workApplet$applet$1.invoke(obj, snapshot);
            }

            @Override // com.squareup.workflow1.StatefulWorkflow
            public final Object onPropsChanged(Object obj, Object obj2, Object obj3) {
                StateFlowKt$combineState$2 stateFlowKt$combineState$2 = new StateFlowKt$combineState$2(3, statefulWorkflow, StatefulWorkflow.class, "onPropsChanged", "onPropsChanged(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0, 2);
                NoopWorkflowInterceptor.this.getClass();
                return stateFlowKt$combineState$2.invoke(obj, obj2, obj3);
            }

            @Override // com.squareup.workflow1.StatefulWorkflow
            public final Object render(Object obj, Object obj2, StatefulWorkflow.RenderContext renderContext) {
                WorkflowInterceptorKt$intercept$1$render$1 workflowInterceptorKt$intercept$1$render$1 = new WorkflowInterceptorKt$intercept$1$render$1(0, renderContext, statefulWorkflow, this);
                NoopWorkflowInterceptor.this.getClass();
                return workflowInterceptorKt$intercept$1$render$1.invoke(obj, obj2, null);
            }

            @Override // com.squareup.workflow1.StatefulWorkflow
            public final Snapshot snapshotState(Object obj) {
                ScannerView.AnonymousClass3 anonymousClass3 = new ScannerView.AnonymousClass3(1, statefulWorkflow, StatefulWorkflow.class, "snapshotState", "snapshotState(Ljava/lang/Object;)Lcom/squareup/workflow1/Snapshot;", 0, 25);
                NoopWorkflowInterceptor.this.getClass();
                return (Snapshot) anonymousClass3.invoke(obj);
            }

            public final String toString() {
                return "InterceptedWorkflow(" + statefulWorkflow + ", " + this + "@intercept)";
            }
        };
    }

    public static final ContentTransform verticalSlide(float f, boolean z) {
        return new ContentTransform(z ? EnterExitTransitionKt.slideInVertically(new TweenSpec(EnumC0170g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, 75, new CubicBezierEasing(0.17f, 0.17f, RecyclerView.DECELERATION_RATE, 1.0f)), new FlowStarter$$ExternalSyntheticLambda0(9)).plus(EnterExitTransitionKt.fadeIn$default(new TweenSpec(EnumC0170g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, 75, new CubicBezierEasing(0.17f, 0.17f, RecyclerView.DECELERATION_RATE, 1.0f)), 2)) : EnterExitTransitionKt.fadeIn$default(new TweenSpec(350, 109, new CubicBezierEasing(0.17f, 0.17f, RecyclerView.DECELERATION_RATE, 1.0f)), 2), z ? EnterExitTransitionKt.fadeOut$default(AnimatableKt.tween$default(83, 0, new CubicBezierEasing(0.17f, 0.17f, 0.67f, 1.0f), 2), 2) : EnterExitTransitionKt.slideOutVertically(AnimatableKt.tween$default(117, 0, new CubicBezierEasing(0.17f, 0.17f, 0.84f, 1.0f), 2), new FlowStarter$$ExternalSyntheticLambda0(10)).plus(EnterExitTransitionKt.fadeOut$default(AnimatableKt.tween$default(117, 0, new CubicBezierEasing(0.16f, RecyclerView.DECELERATION_RATE, 0.84f, 1.0f), 2), 2)), f, 8);
    }
}
