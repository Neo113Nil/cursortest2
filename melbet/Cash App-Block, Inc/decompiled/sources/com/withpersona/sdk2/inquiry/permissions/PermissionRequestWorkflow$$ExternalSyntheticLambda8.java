package com.withpersona.sdk2.inquiry.permissions;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.Workflows;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes9.dex */
public final /* synthetic */ class PermissionRequestWorkflow$$ExternalSyntheticLambda8 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ StatefulWorkflow.RenderContext f$0;
    public final /* synthetic */ PermissionRequestWorkflow f$1;
    public final /* synthetic */ PermissionRequestWorkflow.Props f$2;

    public /* synthetic */ PermissionRequestWorkflow$$ExternalSyntheticLambda8(PermissionRequestWorkflow permissionRequestWorkflow, StatefulWorkflow.RenderContext renderContext, PermissionRequestWorkflow.Props props) {
        this.$r8$classId = 1;
        this.f$1 = permissionRequestWorkflow;
        this.f$0 = renderContext;
        this.f$2 = props;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        PermissionRequestWorkflow.Props props = this.f$2;
        PermissionRequestWorkflow permissionRequestWorkflow = this.f$1;
        StatefulWorkflow.RenderContext renderContext = this.f$0;
        switch (i) {
            case 0:
                renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(permissionRequestWorkflow, new PermissionRequestWorkflow$$ExternalSyntheticLambda1(permissionRequestWorkflow, props, 2)));
                break;
            case 1:
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.addFlags(268435456);
                Context context = permissionRequestWorkflow.applicationContext;
                intent.setData(Uri.fromParts("package", context.getPackageName(), null));
                context.startActivity(intent);
                renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(permissionRequestWorkflow, new PermissionRequestWorkflow$$ExternalSyntheticLambda1(permissionRequestWorkflow, props, 3)));
                break;
            default:
                renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(permissionRequestWorkflow, new PermissionRequestWorkflow$$ExternalSyntheticLambda1(permissionRequestWorkflow, props, 1)));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ PermissionRequestWorkflow$$ExternalSyntheticLambda8(StatefulWorkflow.RenderContext renderContext, PermissionRequestWorkflow permissionRequestWorkflow, PermissionRequestWorkflow.Props props, int i) {
        this.$r8$classId = i;
        this.f$0 = renderContext;
        this.f$1 = permissionRequestWorkflow;
        this.f$2 = props;
    }
}
