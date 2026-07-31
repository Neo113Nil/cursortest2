package com.bytedance.sdk.openadsdk;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.zg.zmn.hhw;
import com.bytedance.sdk.openadsdk.kgc.fs;
import com.bytedance.sdk.openadsdk.kgc.fs.zmn;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes5.dex */
public class BusMonitorDependWrapper implements fs {
    private hhw fs;
    private fs zmn;

    public BusMonitorDependWrapper(fs fsVar) {
        this.zmn = fsVar;
    }

    @Override // com.bytedance.sdk.openadsdk.kgc.fs
    public Context getContext() {
        fs fsVar = this.zmn;
        if (fsVar != null && fsVar.getContext() != null) {
            return this.zmn.getContext();
        }
        return getReflectContext();
    }

    @Override // com.bytedance.sdk.openadsdk.kgc.fs
    public hhw getHandler() {
        fs fsVar = this.zmn;
        if (fsVar != null && fsVar.getHandler() != null) {
            return this.zmn.getHandler();
        }
        if (this.fs == null) {
            this.fs = new hhw(new Handler(getSafeHandlerThread("pag_monitor", 0).getLooper())) { // from class: com.bytedance.sdk.openadsdk.BusMonitorDependWrapper.1
                @Override // com.bytedance.sdk.component.zg.zmn.hhw
                public boolean zmn() {
                    return false;
                }
            };
        }
        return this.fs;
    }

    @Override // com.bytedance.sdk.openadsdk.kgc.fs
    public int getUploadIntervalTime() {
        int uploadIntervalTime;
        fs fsVar = this.zmn;
        return (fsVar == null || (uploadIntervalTime = fsVar.getUploadIntervalTime()) < 3600000) ? BrandSafetyUtils.g : uploadIntervalTime;
    }

    @Override // com.bytedance.sdk.openadsdk.kgc.fs
    public boolean isMonitorOpen() {
        fs fsVar = this.zmn;
        if (fsVar != null) {
            return fsVar.isMonitorOpen();
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.kgc.fs
    public void onMonitorUpload(List<zmn> list) {
        fs fsVar = this.zmn;
        if (fsVar != null) {
            fsVar.onMonitorUpload(list);
        }
    }

    public static Context getReflectContext() {
        try {
            Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", null);
            method.setAccessible(true);
            Object invoke = method.invoke(null, null);
            return (Application) invoke.getClass().getMethod("getApplication", null).invoke(invoke, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.kgc.fs
    public int getOnceLogCount() {
        fs fsVar = this.zmn;
        if (fsVar != null) {
            return fsVar.getOnceLogCount();
        }
        return 20;
    }

    @Override // com.bytedance.sdk.openadsdk.kgc.fs
    public int getOnceLogInterval() {
        fs fsVar = this.zmn;
        if (fsVar != null) {
            return fsVar.getOnceLogInterval();
        }
        return 1000;
    }

    @Override // com.bytedance.sdk.openadsdk.kgc.fs
    public HandlerThread getSafeHandlerThread(String str, int i) {
        HandlerThread safeHandlerThread;
        fs fsVar = this.zmn;
        if (fsVar != null && (safeHandlerThread = fsVar.getSafeHandlerThread(str, i)) != null) {
            return safeHandlerThread;
        }
        HandlerThread handlerThread = new HandlerThread("pag_monitor");
        handlerThread.start();
        return handlerThread;
    }
}
