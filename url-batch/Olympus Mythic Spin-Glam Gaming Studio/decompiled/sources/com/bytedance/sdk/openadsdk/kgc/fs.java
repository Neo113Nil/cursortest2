package com.bytedance.sdk.openadsdk.kgc;

import android.content.Context;
import android.os.HandlerThread;
import com.bytedance.sdk.component.zg.zmn.hhw;
import java.util.List;

/* loaded from: classes6.dex */
public interface fs {
    Context getContext();

    hhw getHandler();

    int getOnceLogCount();

    int getOnceLogInterval();

    HandlerThread getSafeHandlerThread(String str, int i);

    int getUploadIntervalTime();

    boolean isMonitorOpen();

    void onMonitorUpload(List<com.bytedance.sdk.openadsdk.kgc.fs.zmn> list);
}
