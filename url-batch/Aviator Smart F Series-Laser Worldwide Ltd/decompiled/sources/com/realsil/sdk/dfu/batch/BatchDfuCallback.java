package com.realsil.sdk.dfu.batch;

import com.realsil.sdk.dfu.model.DfuProgressInfo;

/* loaded from: classes4.dex */
public abstract class BatchDfuCallback {
    public void onError(String str, int i8) {
    }

    public void onProgressChanged(String str, DfuProgressInfo dfuProgressInfo) {
    }

    public void onStateChanged(String str, int i8) {
    }
}
