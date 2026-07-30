package com.crrepa.ble.conn.listener;

import java.util.List;

/* loaded from: classes3.dex */
public interface CRPPhotoWatchFaceTransListener {
    public static final int FILE_CRC_ERROR = 3;
    public static final int FILE_NULL = 1;
    public static final int FILE_TIMEOUT = 2;
    public static final int FILE_TRANS_ERROR = 4;

    void onError(int i8, List<String> list);

    void onTransCompleted();

    void onTransProgressChanged(int i8);

    void onTransProgressStarting();
}
