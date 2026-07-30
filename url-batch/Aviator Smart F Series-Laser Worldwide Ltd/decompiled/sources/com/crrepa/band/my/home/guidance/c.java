package com.crrepa.band.my.home.guidance;

import android.os.Bundle;
import com.baidu.location.LocationConst;
import com.moyoung.dafit.module.common.utils.s0;

/* loaded from: classes2.dex */
public class c {
    public static void appPermissionDialog(String str, boolean z7) {
        String str2 = z7 ? "开启" : "暂不";
        Bundle bundle = new Bundle();
        bundle.putString(LocationConst.PermissionType.KEY_PERMISSION_TYPE, str);
        bundle.putString("result", str2);
        bundle.putString("trigger_scene", "弹窗");
        s0.logEvent("点击_首次引导权限", bundle);
    }

    public static void appPermissionOnGuidancePage(String str, boolean z7) {
        String str2 = z7 ? "开启" : "暂不";
        Bundle bundle = new Bundle();
        bundle.putString(LocationConst.PermissionType.KEY_PERMISSION_TYPE, str);
        bundle.putString("result", str2);
        bundle.putString("trigger_scene", "引导页");
        s0.logEvent("点击_首次引导权限", bundle);
    }

    public static void systemPermission(String str, boolean z7) {
        String str2 = z7 ? "允许" : "不允许";
        Bundle bundle = new Bundle();
        bundle.putString(LocationConst.PermissionType.KEY_PERMISSION_TYPE, str);
        bundle.putString("result", str2);
        bundle.putString("trigger_scene", "引导页");
        s0.logEvent("点击_系统权限弹窗", bundle);
    }

    public static void systemPermissionOnGuidancePage(String str, boolean z7) {
        String str2 = z7 ? "允许" : "不允许";
        Bundle bundle = new Bundle();
        bundle.putString(LocationConst.PermissionType.KEY_PERMISSION_TYPE, str);
        bundle.putString("result", str2);
        bundle.putString("trigger_scene", "引导页");
        s0.logEvent("点击_系统权限弹窗", bundle);
    }
}
