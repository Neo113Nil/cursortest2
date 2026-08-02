package com.withpersona.sdk2.inquiry.permissions;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final class CheckRequestPermissionRationaleStateView {
    public final Function1 callback;
    public final boolean isPermanentPermissionRejectionCheck;
    public final Permission permission;

    public CheckRequestPermissionRationaleStateView(Permission permission, boolean z, Function1 function1) {
        permission.getClass();
        this.permission = permission;
        this.isPermanentPermissionRejectionCheck = z;
        this.callback = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckRequestPermissionRationaleStateView)) {
            return false;
        }
        CheckRequestPermissionRationaleStateView checkRequestPermissionRationaleStateView = (CheckRequestPermissionRationaleStateView) obj;
        return this.permission == checkRequestPermissionRationaleStateView.permission && this.isPermanentPermissionRejectionCheck == checkRequestPermissionRationaleStateView.isPermanentPermissionRejectionCheck && this.callback.equals(checkRequestPermissionRationaleStateView.callback);
    }

    public final int hashCode() {
        return this.callback.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.permission.hashCode() * 31, 31, this.isPermanentPermissionRejectionCheck);
    }

    public final String toString() {
        return "CheckRequestPermissionRationaleStateView(permission=" + this.permission + ", isPermanentPermissionRejectionCheck=" + this.isPermanentPermissionRejectionCheck + ", callback=" + this.callback + ")";
    }
}
