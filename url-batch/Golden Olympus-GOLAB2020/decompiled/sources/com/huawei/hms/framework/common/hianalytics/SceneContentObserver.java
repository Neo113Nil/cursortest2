package com.huawei.hms.framework.common.hianalytics;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: classes.dex */
public class SceneContentObserver extends ContentObserver {
    public SceneContentObserver(Handler handler) {
        super(handler);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z4) {
        onChangeForMp();
    }

    public native void onChangeForMp();
}
