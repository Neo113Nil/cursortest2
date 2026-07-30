package com.crrepa.band.my.device.appmarket.openharmony.bridge.bean;

import android.os.Build;
import android.util.Log;
import com.baidu.bbalbscesium.a;
import com.crrepa.band.my.device.watchfacenew.delegate.img.m;

/* loaded from: classes2.dex */
public class NativeCallJavascriptResponse {
    private static final String TAG = "test-server";
    private Object body;
    private final NativeCommonDataBean common = c();

    private NativeCommonDataBean c() {
        NativeCommonDataBean nativeCommonDataBean = new NativeCommonDataBean();
        nativeCommonDataBean.setBridgeVersion("1");
        nativeCommonDataBean.setChannel("hisi");
        nativeCommonDataBean.setDeviceModel(Build.MODEL);
        nativeCommonDataBean.setManufacturer(Build.MANUFACTURER);
        nativeCommonDataBean.setNetWorkType("2g");
        nativeCommonDataBean.setOs("Android");
        nativeCommonDataBean.setPid("adasdsdsasd");
        nativeCommonDataBean.setSysVersion("1.10");
        nativeCommonDataBean.setVersion(a.f3864e);
        nativeCommonDataBean.setVersionCode(m.NEW_CUSTOM_WATCH_FACE_PRESET_IMG);
        nativeCommonDataBean.setAppId("appId");
        return nativeCommonDataBean;
    }

    public Object getBody() {
        Log.i(TAG, "NativeCallJavascriptResponse::getBody");
        return this.body;
    }

    public NativeCommonDataBean getCommon() {
        Log.i(TAG, "NativeCallJavascriptResponse::getCommon");
        return this.common;
    }

    public NativeCallJavascriptResponse setBody(Object obj) {
        this.body = obj;
        return this;
    }
}
