package com.baidu.ar.record;

import android.view.Surface;

/* loaded from: classes.dex */
public interface MovieRecorderCallback {
    void onRecorderComplete(boolean z7, String str);

    void onRecorderError(int i8);

    void onRecorderInit(Surface surface);

    void onRecorderProcess(int i8);

    void onRecorderStart(boolean z7);
}
