package com.withpersona.sdk2.inquiry.permissions;

import com.squareup.workflow1.WorkflowAction;
import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final /* synthetic */ class DeviceFeatureRequestWorkflow$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DeviceFeatureRequestWorkflow.Props f$1;

    public /* synthetic */ DeviceFeatureRequestWorkflow$$ExternalSyntheticLambda3(DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow, DeviceFeatureRequestWorkflow.Props props, int i) {
        this.$r8$classId = i;
        this.f$1 = props;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        DeviceFeatureRequestWorkflow.Props props = this.f$1;
        WorkflowAction.Updater updater = (WorkflowAction.Updater) obj;
        switch (i) {
            case 0:
                updater.getClass();
                updater.setOutput(new DeviceFeatureRequestWorkflow.Output(new DeviceFeatureState(props.feature, FeatureRequestResult.Success)));
                break;
            case 1:
                updater.getClass();
                updater.setOutput(new DeviceFeatureRequestWorkflow.Output(new DeviceFeatureState(props.feature, FeatureRequestResult.Failure)));
                break;
            case 2:
                updater.getClass();
                updater.setOutput(new DeviceFeatureRequestWorkflow.Output(new DeviceFeatureState(props.feature, FeatureRequestResult.SettingsLaunched)));
                break;
            case 3:
                updater.getClass();
                updater.setOutput(new DeviceFeatureRequestWorkflow.Output(new DeviceFeatureState(props.feature, FeatureRequestResult.Failure)));
                break;
            default:
                updater.setOutput(new DeviceFeatureRequestWorkflow.Output(new DeviceFeatureState(props.feature, FeatureRequestResult.Success)));
                break;
        }
        return Unit.INSTANCE;
    }
}
