package com.baidu.ar.cloud;

import com.baidu.ar.c0;
import com.baidu.ar.e2;
import com.baidu.ar.e3;
import com.baidu.ar.h2;
import com.baidu.ar.statistic.StatisticApi;
import com.baidu.ar.statistic.StatisticConstants;
import java.util.HashMap;

/* loaded from: classes.dex */
public class CloudAR extends c0 implements ICloudIR, CloudCallback {

    /* renamed from: v, reason: collision with root package name */
    public e2 f1979v;

    /* renamed from: w, reason: collision with root package name */
    public ICloudIRStateChangedListener f1980w;

    @Override // com.baidu.ar.cloud.CloudCallback
    public void onRecognizeResult(int i8, String str, String str2, String str3) {
        ICloudIRStateChangedListener iCloudIRStateChangedListener;
        CloudIRState cloudIRState;
        if (this.f1980w != null) {
            h2 h2Var = new h2();
            h2Var.f2354a = i8 == 0;
            if (i8 == 0) {
                StatisticApi.onEvent(StatisticConstants.CLOUD_SEARCH_SUCCESS);
                h2Var.f2355b = str2;
                h2Var.f2356c = Integer.parseInt(str3);
                iCloudIRStateChangedListener = this.f1980w;
                cloudIRState = CloudIRState.SUCCESS;
            } else {
                h2Var.f2357d = str;
                iCloudIRStateChangedListener = this.f1980w;
                cloudIRState = CloudIRState.ERROR;
            }
            iCloudIRStateChangedListener.onStateChanged(cloudIRState, h2Var);
        }
    }

    @Override // com.baidu.ar.cloud.CloudCallback
    public void onStart() {
        ICloudIRStateChangedListener iCloudIRStateChangedListener = this.f1980w;
        if (iCloudIRStateChangedListener != null) {
            iCloudIRStateChangedListener.onStateChanged(CloudIRState.START, null);
        }
    }

    @Override // com.baidu.ar.c0, com.baidu.ar.cloud.ICloudIR
    public void pause() {
        super.pause();
        e2 e2Var = this.f1979v;
        if (e2Var != null) {
            e2Var.h();
        }
    }

    @Override // com.baidu.ar.c0
    public void release() {
        this.f1980w = null;
        e2 e2Var = this.f1979v;
        if (e2Var != null) {
            e2Var.g();
            a(this.f1979v);
        }
        super.release();
    }

    @Override // com.baidu.ar.c0, com.baidu.ar.cloud.ICloudIR
    public void resume() {
        super.resume();
        e2 e2Var = this.f1979v;
        if (e2Var != null) {
            e2Var.i();
        }
    }

    public void setProcessFlag(int i8) {
        e2 e2Var = this.f1979v;
        if (e2Var != null) {
            e2Var.a(i8);
        }
    }

    @Override // com.baidu.ar.cloud.ICloudIR
    public void setStateChangedListener(ICloudIRStateChangedListener iCloudIRStateChangedListener) {
        this.f1980w = iCloudIRStateChangedListener;
    }

    @Override // com.baidu.ar.c0
    public void setup(HashMap<String, Object> hashMap) {
        super.setup(hashMap);
        e2 e2Var = new e2(c());
        this.f1979v = e2Var;
        e2Var.a(this);
        a(this.f1979v, (e3) null);
    }
}
