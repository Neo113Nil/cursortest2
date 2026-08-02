package com.squareup.cash.ui.gcm;

import android.app.Application;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.workflow1.internal.WorkflowNode$tick$1$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class InstanceIdService extends SuspendingFirebaseMessagingService {
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.squareup.cash.ui.gcm.SuspendingFirebaseMessagingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onNewTokenSuspend(Continuation continuation) {
        InstanceIdService$onNewTokenSuspend$1 instanceIdService$onNewTokenSuspend$1;
        int i;
        if (continuation instanceof InstanceIdService$onNewTokenSuspend$1) {
            instanceIdService$onNewTokenSuspend$1 = (InstanceIdService$onNewTokenSuspend$1) continuation;
            int i2 = instanceIdService$onNewTokenSuspend$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                instanceIdService$onNewTokenSuspend$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = instanceIdService$onNewTokenSuspend$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = instanceIdService$onNewTokenSuspend$1.label;
                Continuation continuation2 = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Application application = getApplication();
                    application.getClass();
                    WorkflowNode$tick$1$1 workflowNode$tick$1$1 = new WorkflowNode$tick$1$1(application, continuation2, 11);
                    instanceIdService$onNewTokenSuspend$1.label = 1;
                    if (JobKt.coroutineScope(workflowNode$tick$1$1, instanceIdService$onNewTokenSuspend$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
        instanceIdService$onNewTokenSuspend$1 = new InstanceIdService$onNewTokenSuspend$1(this, (ContinuationImpl) continuation);
        Object obj2 = instanceIdService$onNewTokenSuspend$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = instanceIdService$onNewTokenSuspend$1.label;
        Continuation continuation22 = null;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
