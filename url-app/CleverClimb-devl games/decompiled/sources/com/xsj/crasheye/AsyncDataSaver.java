package com.xsj.crasheye;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public class AsyncDataSaver extends BaseDataSaver {
    @Override // com.xsj.crasheye.BaseDataSaver
    public synchronized void save(String str) {
        save(str, CrasheyeFileFilter.createNewFile());
    }

    public synchronized void save(final String str, final String str2) {
        Thread newThread = new LowPriorityThreadFactory().newThread(new Runnable() { // from class: com.xsj.crasheye.AsyncDataSaver.1
            @Override // java.lang.Runnable
            public void run() {
                BufferedWriter bufferedWriter;
                File file = new File(str2);
                DataSaverResponse dataSaverResponse = new DataSaverResponse(str, file.getAbsolutePath());
                if (!file.exists()) {
                    try {
                        file.createNewFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                BufferedWriter bufferedWriter2 = null;
                try {
                    try {
                        bufferedWriter = new BufferedWriter(new FileWriter(file, true));
                    } catch (IOException e2) {
                        e = e2;
                    }
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    bufferedWriter.append((CharSequence) str);
                    bufferedWriter.flush();
                    bufferedWriter.close();
                    try {
                        bufferedWriter.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                    dataSaverResponse.setSavedSuccessfully(true);
                    if (Crasheye.crasheyeCallback == null) {
                        return;
                    }
                } catch (IOException e4) {
                    e = e4;
                    bufferedWriter2 = bufferedWriter;
                    e.printStackTrace();
                    dataSaverResponse.setException(e);
                    dataSaverResponse.setSavedSuccessfully(false);
                    if (Crasheye.crasheyeCallback != null) {
                        Crasheye.crasheyeCallback.dataSaverResponse(dataSaverResponse);
                    }
                    if (bufferedWriter2 != null) {
                        try {
                            bufferedWriter2.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    }
                    dataSaverResponse.setSavedSuccessfully(true);
                    if (Crasheye.crasheyeCallback == null) {
                        return;
                    }
                    Crasheye.crasheyeCallback.dataSaverResponse(dataSaverResponse);
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter2 = bufferedWriter;
                    if (bufferedWriter2 != null) {
                        try {
                            bufferedWriter2.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                        }
                    }
                    dataSaverResponse.setSavedSuccessfully(true);
                    if (Crasheye.crasheyeCallback != null) {
                        Crasheye.crasheyeCallback.dataSaverResponse(dataSaverResponse);
                        throw th;
                    }
                    throw th;
                }
                Crasheye.crasheyeCallback.dataSaverResponse(dataSaverResponse);
            }
        });
        if (getExecutor() != null) {
            getExecutor().execute(newThread);
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
