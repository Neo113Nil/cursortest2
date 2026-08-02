package com.withpersona.sdk2.inquiry.permissions.permissionRequest;

import com.withpersona.sdk2.inquiry.internal.fallbackmode.StaticTemplateSession_Factory;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;

/* loaded from: classes9.dex */
public final class PermissionRequestWorker_Factory_Impl {
    public final StaticTemplateSession_Factory delegateFactory;

    public PermissionRequestWorker_Factory_Impl(StaticTemplateSession_Factory staticTemplateSession_Factory) {
        this.delegateFactory = staticTemplateSession_Factory;
    }

    public final PermissionRequestWorker create(PermissionRequestWorkflow.Props props) {
        return new PermissionRequestWorker((PermissionsHelper) this.delegateFactory.savedStateHandleProvider.get(), props);
    }
}
