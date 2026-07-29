package com.xsj.crasheye;

import com.xsj.crasheye.util.Utils;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
class SyncDataSaver extends BaseDataSaver {
    SyncDataSaver() {
    }

    @Override // com.xsj.crasheye.BaseDataSaver
    public synchronized void save(String str) {
        File file = new File(CrasheyeFileFilter.createNewFile());
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Utils.writeFile(file.getAbsolutePath(), str);
    }

    @Override // com.xsj.crasheye.BaseDataSaver, com.xsj.crasheye.InterfaceExecutor
    public ExecutorService getExecutor() {
        if (executor == null) {
            executor = Executors.newFixedThreadPool(1);
        }
        return executor;
    }
}
