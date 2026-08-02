package com.withpersona.sdk2.inquiry.permissions;

import com.squareup.workflow1.InterceptedRenderContext$send$1;
import com.squareup.workflow1.ui.AndroidViewRendering;
import com.squareup.workflow1.ui.DecorativeViewFactory;
import com.squareup.workflow1.ui.ViewFactory;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes9.dex */
public final class OldCheckRequestPermissionRationaleStateView implements AndroidViewRendering {
    public final Function1 callback;
    public final boolean isPermanentPermissionRejectionCheck;
    public final Permission permission;
    public final DecorativeViewFactory viewFactory;

    public OldCheckRequestPermissionRationaleStateView(Permission permission, boolean z, Function1 function1) {
        permission.getClass();
        this.permission = permission;
        this.isPermanentPermissionRejectionCheck = z;
        this.callback = function1;
        this.viewFactory = new DecorativeViewFactory(Reflection.factory.getOrCreateKotlinClass(OldCheckRequestPermissionRationaleStateView.class), OldCheckRequestPermissionRationaleStateView$viewFactory$1.INSTANCE, new InterceptedRenderContext$send$1(this, 7));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OldCheckRequestPermissionRationaleStateView)) {
            return false;
        }
        OldCheckRequestPermissionRationaleStateView oldCheckRequestPermissionRationaleStateView = (OldCheckRequestPermissionRationaleStateView) obj;
        return this.permission == oldCheckRequestPermissionRationaleStateView.permission && this.isPermanentPermissionRejectionCheck == oldCheckRequestPermissionRationaleStateView.isPermanentPermissionRejectionCheck && this.callback.equals(oldCheckRequestPermissionRationaleStateView.callback);
    }

    @Override // com.squareup.workflow1.ui.AndroidViewRendering
    public final ViewFactory getViewFactory() {
        return this.viewFactory;
    }

    public final int hashCode() {
        return this.callback.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.permission.hashCode() * 31, 31, this.isPermanentPermissionRejectionCheck);
    }

    public final String toString() {
        return "OldCheckRequestPermissionRationaleStateView(permission=" + this.permission + ", isPermanentPermissionRejectionCheck=" + this.isPermanentPermissionRejectionCheck + ", callback=" + this.callback + ")";
    }
}
