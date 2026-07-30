package com.baidu.ar.baidumap;

import com.baidu.ar.DuMixInput;
import com.baidu.ar.DuMixOutput;

/* loaded from: classes.dex */
public interface MapDuMixCallback {
    void onError();

    void onRelease(boolean z7);

    void onSetup(boolean z7, DuMixInput duMixInput, DuMixOutput duMixOutput);
}
