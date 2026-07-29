package com.xsj.crasheye;

import com.tapjoy.TapjoyConstants;
import com.xsj.crasheye.util.Utils;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
class NativeExceptionDataSaver extends BaseDataSaver {
    NativeExceptionDataSaver() {
    }

    @Override // com.xsj.crasheye.BaseDataSaver
    public synchronized void save(String str) {
        if (Properties.crasheyeInitType == TapjoyConstants.TJC_PLUGIN_UNITY) {
            Utils.writeFile(CrasheyeFileFilter.NativeErrorFile, str);
        } else {
            Utils.writeFile(String.valueOf(Properties.FILES_PATH) + "/" + CrasheyeFileFilter.NATIVEPREFIX + String.valueOf(System.currentTimeMillis()) + CrasheyeFileFilter.POSTFIX, str);
        }
    }

    @Override // com.xsj.crasheye.BaseDataSaver, com.xsj.crasheye.InterfaceExecutor
    public ExecutorService getExecutor() {
        if (executor == null) {
            executor = Executors.newFixedThreadPool(1);
        }
        return executor;
    }
}
