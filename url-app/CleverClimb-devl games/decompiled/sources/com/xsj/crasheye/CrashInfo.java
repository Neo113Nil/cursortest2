package com.xsj.crasheye;

import com.xsj.crasheye.log.Logger;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
class CrashInfo extends BaseExecutor implements InterfaceExecutor {
    CrashInfo() {
    }

    protected static int getTotalCrashesNum() {
        BufferedReader bufferedReader;
        Integer num;
        Integer num2 = 0;
        if (Properties.FILES_PATH == null) {
            Logger.logWarning("Please use getTotalCrashesNum after initializing the plugin! Returning 0.");
            return 0;
        }
        File file = new File(String.valueOf(Properties.FILES_PATH) + "/crashCounter");
        if (!file.exists()) {
            try {
                file.createNewFile();
                return num2.intValue();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        BufferedReader bufferedReader2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new FileReader(file));
            } catch (Throwable th) {
                th = th;
            }
            try {
                try {
                    try {
                        num = Integer.valueOf(Integer.parseInt(bufferedReader.readLine().trim()));
                    } catch (Exception e2) {
                        e = e2;
                        bufferedReader2 = bufferedReader;
                        Logger.logWarning("There was a problem getting the crash counter");
                        if (Crasheye.DEBUG) {
                            e.printStackTrace();
                        }
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                        return 0;
                    }
                } catch (Exception unused) {
                    num = 0;
                }
                int intValue = num.intValue();
                try {
                    bufferedReader.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
                return intValue;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception e6) {
            e = e6;
        }
    }

    protected void clearCrashCounter() {
        Thread newThread = new LowPriorityThreadFactory().newThread(new Runnable() { // from class: com.xsj.crasheye.CrashInfo.1
            @Override // java.lang.Runnable
            public void run() {
                File file = new File(String.valueOf(Properties.FILES_PATH) + "/crashCounter");
                if (file.exists()) {
                    file.delete();
                }
            }
        });
        ExecutorService executor = getExecutor();
        if (newThread == null || executor == null) {
            return;
        }
        executor.submit(newThread);
    }

    protected void saveCrashCounter() {
        Thread newThread = new LowPriorityThreadFactory().newThread(new Runnable() { // from class: com.xsj.crasheye.CrashInfo.2
            /* JADX WARN: Removed duplicated region for block: B:56:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:63:? A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:64:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void run() {
                BufferedReader bufferedReader;
                BufferedWriter bufferedWriter;
                int i;
                File file = new File(String.valueOf(Properties.FILES_PATH) + "/crashCounter");
                if (!file.exists()) {
                    try {
                        file.createNewFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                BufferedWriter bufferedWriter2 = null;
                bufferedWriter2 = null;
                BufferedReader bufferedReader2 = null;
                try {
                    bufferedReader = new BufferedReader(new FileReader(file));
                } catch (IOException e2) {
                    e = e2;
                    bufferedWriter = null;
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = null;
                }
                try {
                    Integer.valueOf(0);
                    try {
                        i = Integer.valueOf(Integer.parseInt(bufferedReader.readLine().trim()));
                    } catch (Exception unused) {
                        i = 0;
                    }
                    bufferedWriter = new BufferedWriter(new FileWriter(file));
                } catch (IOException e3) {
                    e = e3;
                    bufferedWriter = null;
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedReader != null) {
                    }
                    if (bufferedWriter2 != null) {
                    }
                }
                try {
                    bufferedWriter.write(String.valueOf(i));
                    bufferedWriter.newLine();
                    bufferedWriter.flush();
                    bufferedWriter.close();
                    try {
                        bufferedReader.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                    try {
                        bufferedWriter.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                } catch (IOException e6) {
                    e = e6;
                    bufferedReader2 = bufferedReader;
                    try {
                        Logger.logWarning("There was a problem saving the crash counter");
                        if (Crasheye.DEBUG) {
                            e.printStackTrace();
                        }
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (IOException e7) {
                                e7.printStackTrace();
                            }
                        }
                        if (bufferedWriter != null) {
                            try {
                                bufferedWriter.close();
                            } catch (IOException e8) {
                                e8.printStackTrace();
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedReader = bufferedReader2;
                        bufferedWriter2 = bufferedWriter;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e9) {
                                e9.printStackTrace();
                            }
                        }
                        if (bufferedWriter2 != null) {
                            try {
                                bufferedWriter2.close();
                                throw th;
                            } catch (IOException e10) {
                                e10.printStackTrace();
                                throw th;
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    bufferedWriter2 = bufferedWriter;
                    if (bufferedReader != null) {
                    }
                    if (bufferedWriter2 != null) {
                    }
                }
            }
        });
        ExecutorService executor = getExecutor();
        if (newThread == null || executor == null) {
            return;
        }
        executor.submit(newThread);
    }

    protected void saveLastCrashID(final String str) {
        if (str != null) {
            Thread newThread = new LowPriorityThreadFactory().newThread(new Runnable() { // from class: com.xsj.crasheye.CrashInfo.3
                @Override // java.lang.Runnable
                public void run() {
                    BufferedWriter bufferedWriter;
                    File file = new File(String.valueOf(Properties.FILES_PATH) + "/lastCrashID");
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
                            bufferedWriter = new BufferedWriter(new FileWriter(file));
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (IOException e2) {
                        e = e2;
                    }
                    try {
                        bufferedWriter.write(str);
                        bufferedWriter.newLine();
                        bufferedWriter.flush();
                        bufferedWriter.close();
                        try {
                            bufferedWriter.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    } catch (IOException e4) {
                        e = e4;
                        bufferedWriter2 = bufferedWriter;
                        Logger.logWarning("There was a problem saving the last crash id");
                        if (Crasheye.DEBUG) {
                            e.printStackTrace();
                        }
                        if (bufferedWriter2 != null) {
                            try {
                                bufferedWriter2.close();
                            } catch (IOException e5) {
                                e5.printStackTrace();
                            }
                        }
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
                        throw th;
                    }
                }
            });
            ExecutorService executor = getExecutor();
            if (newThread == null || executor == null) {
                return;
            }
            executor.submit(newThread);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected static String getLastCrashID() {
        BufferedReader bufferedReader;
        String str;
        File file = new File(String.valueOf(Properties.FILES_PATH) + "/lastCrashID");
        if (!file.exists()) {
            try {
                file.createNewFile();
                return null;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            try {
                try {
                    str = bufferedReader.readLine().trim();
                } catch (Exception e2) {
                    try {
                        e2.printStackTrace();
                        str = null;
                    } catch (Exception e3) {
                        e = e3;
                        Logger.logWarning("There was a problem getting the last crash id");
                        if (Crasheye.DEBUG) {
                            e.printStackTrace();
                        }
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                        return null;
                    }
                }
                try {
                    bufferedReader.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
                return str;
            } catch (Throwable th) {
                th = th;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception e7) {
            e = e7;
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
            if (bufferedReader != null) {
            }
            throw th;
        }
    }

    @Override // com.xsj.crasheye.InterfaceExecutor
    public ExecutorService getExecutor() {
        if (executor == null) {
            executor = Executors.newFixedThreadPool(1);
        }
        return executor;
    }
}
