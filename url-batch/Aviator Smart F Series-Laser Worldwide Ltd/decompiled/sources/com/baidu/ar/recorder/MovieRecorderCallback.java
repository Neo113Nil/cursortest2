package com.baidu.ar.recorder;

/* loaded from: classes.dex */
public interface MovieRecorderCallback {
    void onRecorderComplete(boolean z7, String str);

    void onRecorderError(int i8);

    void onRecorderProcess(int i8);

    void onRecorderStart(boolean z7);
}
