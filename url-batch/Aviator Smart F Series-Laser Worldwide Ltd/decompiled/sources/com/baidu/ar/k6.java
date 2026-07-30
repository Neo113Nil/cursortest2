package com.baidu.ar;

/* loaded from: classes.dex */
public interface k6 {
    void onCreateSessionFail();

    void onCreateVpasAlgoFail();

    void onPositionSuccess(int i8);

    void onVpasAlgoStatePrint(int i8, int i9, float f8);

    void onVpasLocationSuccess();

    void onVpasSendFrame();

    void onVpasTrackingState(int i8);
}
