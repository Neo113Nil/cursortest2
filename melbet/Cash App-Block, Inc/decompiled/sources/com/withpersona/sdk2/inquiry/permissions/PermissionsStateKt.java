package com.withpersona.sdk2.inquiry.permissions;

import android.content.Context;
import com.squareup.util.Strings;
import com.squareup.workflow1.StatefulWorkflow;
import com.withpersona.sdk2.inquiry.modal.ModalContainerScreen;
import com.withpersona.sdk2.inquiry.modal.ModalContainerScreenKt;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.sandbox.SandboxFlags_Factory;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public abstract class PermissionsStateKt {
    public static final SandboxFlags_Factory INSTANCE = new SandboxFlags_Factory(19);

    public static final ArrayList getMissingPermissions(Context context, ArrayList arrayList) {
        context.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!hasPermission(context, (Permission) obj)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static final boolean hasPermission(Context context, Permission permission) {
        context.getClass();
        permission.getClass();
        return Strings.checkSelfPermission(context, toPermissionString(permission)) == 0;
    }

    public static final String toPermissionResultString(PermissionResult permissionResult) {
        permissionResult.getClass();
        int ordinal = permissionResult.ordinal();
        if (ordinal == 0) {
            return "granted";
        }
        if (ordinal == 1) {
            return "denied";
        }
        if (ordinal == 2) {
            return "settings_opened";
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final String toPermissionString(Permission permission) {
        permission.getClass();
        int ordinal = permission.ordinal();
        if (ordinal == 0) {
            return "android.permission.CAMERA";
        }
        if (ordinal == 1) {
            return "android.permission.RECORD_AUDIO";
        }
        if (ordinal == 2) {
            return "android.permission.ACCESS_COARSE_LOCATION";
        }
        if (ordinal == 3) {
            return "android.permission.ACCESS_FINE_LOCATION";
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final ModalContainerScreen withRequestPermissionsIfNeeded(Object obj, StatefulWorkflow.RenderContext renderContext, boolean z, Permission permission, boolean z2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, PermissionRequestWorkflow permissionRequestWorkflow, StepStyle stepStyle, String str9, Function1 function1) {
        Object renderChild;
        renderContext.getClass();
        str2.getClass();
        str3.getClass();
        permissionRequestWorkflow.getClass();
        str9.getClass();
        if (z && (renderChild = renderContext.renderChild(permissionRequestWorkflow, new PermissionRequestWorkflow.Props(permission, z2, str, str2, str3, str4, str5, str6, str7, str8, stepStyle), str9, function1)) != null) {
            return ModalContainerScreenKt.firstInModalStack("PermissionFlowModal", renderChild, obj);
        }
        return new ModalContainerScreen(obj, "PermissionFlowModal", EmptyList.INSTANCE);
    }
}
