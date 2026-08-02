package com.withpersona.sdk2.inquiry.permissions;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.withpersona.sdk2.inquiry.launchers.RequestPermissionResult;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestDialogWorker;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.PermissionTrackingEventData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class PermissionRequestDialogWorker$run$1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ PermissionRequestDialogWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionRequestDialogWorker$run$1(PermissionRequestDialogWorker permissionRequestDialogWorker, Continuation continuation) {
        super(2, continuation);
        this.this$0 = permissionRequestDialogWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PermissionRequestDialogWorker$run$1 permissionRequestDialogWorker$run$1 = new PermissionRequestDialogWorker$run$1(this.this$0, continuation);
        permissionRequestDialogWorker$run$1.L$0 = obj;
        return permissionRequestDialogWorker$run$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PermissionRequestDialogWorker$run$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PermissionRequestDialogWorker permissionRequestDialogWorker = this.this$0;
        ActivityResultLauncher activityResultLauncher = permissionRequestDialogWorker.requestPermissionsLauncher;
        Permission permission = permissionRequestDialogWorker.permission;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            TrackingEventsLogger.DefaultImpls.logPermissionEvent$default(permissionRequestDialogWorker.trackingEventsLogger, new PermissionTrackingEventData(PermissionsStateKt.toPermissionString(permission), "requested", null, 4, null), false, 2, null);
            ActivityResultContract.SynchronousResult synchronousResult = activityResultLauncher.getContract().getSynchronousResult(permissionRequestDialogWorker.context, PermissionsStateKt.toPermissionString(permission));
            if (!Intrinsics.areEqual(synchronousResult != null ? synchronousResult.value : null, Boolean.TRUE)) {
                activityResultLauncher.launch(PermissionsStateKt.toPermissionString(permission));
                RequestPermissionResult requestPermissionResult = new RequestPermissionResult();
                DeviceFeatureRequestWorker$run$1$1 deviceFeatureRequestWorker$run$1$1 = new DeviceFeatureRequestWorker$run$1$1(flowCollector, 3);
                this.label = 2;
                requestPermissionResult.collect(deviceFeatureRequestWorker$run$1$1, this);
                return coroutineSingletons;
            }
            this.label = 1;
            if (flowCollector.emit(PermissionRequestDialogWorker.Output.Success.INSTANCE, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    throw Recorder$$ExternalSyntheticOutline2.m(obj);
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
