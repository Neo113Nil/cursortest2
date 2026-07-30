package com.crrepa.ble.spp.hisilicon.write;

/* loaded from: classes3.dex */
public interface CRPSPPFileTransListener {
    void onComplete();

    void onError(int i8);

    void onStart();

    void onTransProgress(int i8);
}
