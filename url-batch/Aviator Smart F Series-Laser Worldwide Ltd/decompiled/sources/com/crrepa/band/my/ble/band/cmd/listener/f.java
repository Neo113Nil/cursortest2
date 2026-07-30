package com.crrepa.band.my.ble.band.cmd.listener;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.crrepa.band.my.device.camera.GoogleCameraActivity;
import com.crrepa.ble.conn.listener.CRPCameraOperationListener;
import java.util.List;

/* loaded from: classes2.dex */
public class f implements CRPCameraOperationListener {
    private final Context context;

    public f(Context context) {
        this.context = context;
    }

    private void showCameraNotification() {
        m1.a.showCameraNotification(this.context);
    }

    private void startCameraActivity() {
        Context context = this.context;
        context.startActivity(GoogleCameraActivity.getCallingIntent(context));
    }

    public boolean isCameraActivity() {
        List<String> classNameList = com.moyoung.dafit.module.common.baseui.a.getInstance().getClassNameList();
        int size = classNameList.size() - 1;
        if (size < 0) {
            return false;
        }
        return TextUtils.equals(classNameList.get(size), GoogleCameraActivity.class.getName());
    }

    @Override // com.crrepa.ble.conn.listener.CRPCameraOperationListener
    public void onExitCamera() {
        com.orhanobut.logger.f.d("onExitCamera");
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.camera.a(true));
    }

    @Override // com.crrepa.ble.conn.listener.CRPCameraOperationListener
    public void onTakePhoto() {
        com.orhanobut.logger.f.d("onTakePhoto");
        if (isCameraActivity()) {
            org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.camera.a(false));
            return;
        }
        if (com.moyoung.dafit.module.common.baseui.a.getInstance().getActivityCount() > 0) {
            startCameraActivity();
        } else if (Build.VERSION.SDK_INT < 29) {
            startCameraActivity();
        } else {
            showCameraNotification();
        }
    }
}
