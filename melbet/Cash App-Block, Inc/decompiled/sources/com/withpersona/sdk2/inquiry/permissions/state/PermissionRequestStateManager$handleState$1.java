package com.withpersona.sdk2.inquiry.permissions.state;

import android.content.Context;
import android.location.LocationManager;
import com.squareup.workflow1.internal.SubtreeManager;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.PermissionResult;
import com.withpersona.sdk2.inquiry.permissions.PermissionState;
import com.withpersona.sdk2.inquiry.permissions.PermissionsStateKt;
import com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class PermissionRequestStateManager$handleState$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PermissionRequestWorkflow.Props $renderProps;
    public final /* synthetic */ PermissionRequestStateManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PermissionRequestStateManager$handleState$1(PermissionRequestStateManager permissionRequestStateManager, PermissionRequestWorkflow.Props props, Continuation continuation, int i) {
        super(1, continuation);
        this.$r8$classId = i;
        this.this$0 = permissionRequestStateManager;
        this.$renderProps = props;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        int i = this.$r8$classId;
        PermissionRequestWorkflow.Props props = this.$renderProps;
        PermissionRequestStateManager permissionRequestStateManager = this.this$0;
        switch (i) {
            case 0:
                return new PermissionRequestStateManager$handleState$1(permissionRequestStateManager, props, continuation, 0);
            case 1:
                return new PermissionRequestStateManager$handleState$1(permissionRequestStateManager, props, continuation, 1);
            default:
                return new PermissionRequestStateManager$handleState$1(permissionRequestStateManager, props, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.$r8$classId) {
        }
        return ((PermissionRequestStateManager$handleState$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        PermissionRequestWorkflow.Props props = this.$renderProps;
        PermissionRequestStateManager permissionRequestStateManager = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                boolean hasPermission = PermissionsStateKt.hasPermission(permissionRequestStateManager.applicationContext, props.permission);
                SubtreeManager subtreeManager = (SubtreeManager) permissionRequestStateManager.lastChild;
                if (hasPermission) {
                    subtreeManager.updateState(PermissionRequestStateManager.PermissionRequestState.RequestDeviceFeature.INSTANCE);
                } else {
                    subtreeManager.updateState(PermissionRequestStateManager.PermissionRequestState.CheckPermissionRationaleState.INSTANCE);
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Context context = permissionRequestStateManager.applicationContext;
                context.getClass();
                Object systemService = context.getSystemService("location");
                systemService.getClass();
                if (((LocationManager) systemService).isProviderEnabled("gps")) {
                    permissionRequestStateManager.complete(new PermissionState(props.permission, PermissionResult.PermissionGranted));
                } else {
                    ((SubtreeManager) permissionRequestStateManager.lastChild).updateState(PermissionRequestStateManager.DeviceFeatureRequestState.ShowDeviceFeaturePrompt.INSTANCE);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                permissionRequestStateManager.complete(new PermissionState(props.permission, PermissionResult.PermissionGranted));
                break;
        }
        return Unit.INSTANCE;
    }
}
