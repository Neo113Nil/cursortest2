package com.withpersona.sdk2.inquiry.permissions;

import com.squareup.workflow1.BaseRenderContext;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.Workflows;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda79;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class PermissionRequestWorkflow$render$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ StatefulWorkflow.RenderContext $context;
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ PermissionRequestWorkflow.Props $renderProps;
    public final /* synthetic */ PermissionRequestWorkflow this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionRequestWorkflow$render$1(StatefulWorkflow.RenderContext renderContext, PermissionRequestWorkflow permissionRequestWorkflow, PermissionRequestWorkflow.Props props, Continuation continuation) {
        super(2, continuation);
        this.$context = renderContext;
        this.this$0 = permissionRequestWorkflow;
        this.$renderProps = props;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        PermissionRequestWorkflow.Props props = this.$renderProps;
        PermissionRequestWorkflow permissionRequestWorkflow = this.this$0;
        StatefulWorkflow.RenderContext renderContext = this.$context;
        switch (i) {
            case 0:
                return new PermissionRequestWorkflow$render$1(permissionRequestWorkflow, props, renderContext, continuation);
            default:
                return new PermissionRequestWorkflow$render$1(renderContext, permissionRequestWorkflow, props, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((PermissionRequestWorkflow$render$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        PermissionRequestWorkflow.Props props = this.$renderProps;
        PermissionRequestWorkflow permissionRequestWorkflow = this.this$0;
        StatefulWorkflow.RenderContext renderContext = this.$context;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                boolean hasPermission = PermissionsStateKt.hasPermission(permissionRequestWorkflow.applicationContext, props.permission);
                BaseRenderContext baseRenderContext = renderContext.$$delegate_0;
                if (hasPermission) {
                    baseRenderContext.getActionSink().send(Workflows.action$default(permissionRequestWorkflow, new SelfieWorkflow$$ExternalSyntheticLambda79(14)));
                } else {
                    baseRenderContext.getActionSink().send(Workflows.action$default(permissionRequestWorkflow, new SelfieWorkflow$$ExternalSyntheticLambda79(15)));
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(permissionRequestWorkflow, new PermissionRequestWorkflow$$ExternalSyntheticLambda1(permissionRequestWorkflow, props, 6)));
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionRequestWorkflow$render$1(PermissionRequestWorkflow permissionRequestWorkflow, PermissionRequestWorkflow.Props props, StatefulWorkflow.RenderContext renderContext, Continuation continuation) {
        super(2, continuation);
        this.this$0 = permissionRequestWorkflow;
        this.$renderProps = props;
        this.$context = renderContext;
    }
}
