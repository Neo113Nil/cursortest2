package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.PeriodicWorkRequest;
import com.bytedance.sdk.openadsdk.AdSlot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.util.Properties;

/* compiled from: TTCrashHandler.java */
/* loaded from: classes2.dex */
public class dX implements Thread.UncaughtExceptionHandler {
    public static volatile boolean pvs;
    private final Thread.UncaughtExceptionHandler icD = Thread.getDefaultUncaughtExceptionHandler();
    private String vG;

    public static dX pvs() {
        return new dX();
    }

    private dX() {
        Thread.setDefaultUncaughtExceptionHandler(this);
        icD();
    }

    private void icD() {
        Context pvs2 = com.bytedance.sdk.openadsdk.core.mnm.pvs();
        if (pvs2 == null) {
            return;
        }
        try {
            File file = new File(pvs2.getFilesDir(), "TTCache");
            file.mkdirs();
            this.vG = file.getPath();
        } catch (Throwable unused) {
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        pvs = true;
        boolean z = false;
        com.bytedance.sdk.component.so.sUS.pvs(false);
        try {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            if (stringWriter2 != null) {
                z = stringWriter2.contains(AdSlot.class.getPackage().getName());
            }
        } catch (Throwable unused) {
        }
        if (z) {
            pvs(thread, th);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.icD;
        if (uncaughtExceptionHandler == null || uncaughtExceptionHandler == this) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.Properties] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.Properties] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void pvs(Thread thread, Throwable th) {
        ?? r2;
        ?? r22;
        boolean z;
        int i;
        FileInputStream fileInputStream = null;
        try {
            if (TextUtils.isEmpty(this.vG)) {
                icD();
            }
            if (TextUtils.isEmpty(this.vG)) {
                return;
            }
            File file = new File(this.vG, "tt_crash_count.properties");
            if (file.exists() && file.isFile() && file.canRead()) {
                ?? properties = new Properties();
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    properties.load(fileInputStream2);
                    String property = properties.getProperty("crash_count", "0");
                    String property2 = properties.getProperty("crash_last_time", "0");
                    int intValue = Integer.valueOf(property).intValue();
                    int i2 = 0;
                    boolean z2 = true;
                    if (System.currentTimeMillis() - Long.valueOf(property2).longValue() < PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS) {
                        i = intValue + 1;
                        z = false;
                    } else {
                        z = true;
                        i = 1;
                    }
                    if (i < 3) {
                        z2 = false;
                    }
                    if (!z2) {
                        i2 = i;
                    }
                    com.bytedance.sdk.component.utils.Ju.pvs("TTCrashHandler", "==" + i2 + ", " + z2 + ", " + z);
                    if (z2) {
                        try {
                            file.delete();
                        } catch (Throwable unused) {
                        }
                    } else {
                        properties.setProperty("crash_count", String.valueOf(i2));
                        if (z) {
                            properties.setProperty("crash_last_time", String.valueOf(System.currentTimeMillis()));
                        }
                        r2 = new FileOutputStream(file);
                        try {
                            properties.store(r2, "tt_crash_info");
                            fileInputStream = r2;
                        } catch (Throwable th2) {
                            th = th2;
                            fileInputStream = fileInputStream2;
                            com.bytedance.sdk.component.utils.Ju.pvs("TTCrashHandler", "crash count error", th);
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Throwable unused2) {
                                }
                            }
                            if (r2 == 0) {
                                try {
                                    r2.close();
                                    return;
                                } catch (Throwable unused3) {
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    if (z2) {
                        vG();
                    }
                    r22 = fileInputStream;
                    fileInputStream = fileInputStream2;
                } catch (Throwable th3) {
                    th = th3;
                    r2 = fileInputStream;
                }
            } else {
                ?? properties2 = new Properties();
                properties2.setProperty("crash_count", "1");
                properties2.setProperty("crash_last_time", String.valueOf(System.currentTimeMillis()));
                r2 = new FileOutputStream(file);
                try {
                    properties2.store(r2, "tt_crash_info");
                    com.bytedance.sdk.component.utils.Ju.pvs("TTCrashHandler", "==first");
                    r22 = r2;
                } catch (Throwable th4) {
                    th = th4;
                    try {
                        com.bytedance.sdk.component.utils.Ju.pvs("TTCrashHandler", "crash count error", th);
                        if (fileInputStream != null) {
                        }
                        if (r2 == 0) {
                        }
                    } finally {
                    }
                }
            }
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (Throwable unused4) {
                }
            }
            if (r22 != 0) {
                try {
                    r22.close();
                } catch (Throwable unused5) {
                }
            }
        } catch (Throwable th5) {
            th = th5;
            r2 = 0;
        }
    }

    private void vG() {
        try {
            Method pvs2 = com.bytedance.sdk.component.utils.ZhG.pvs("com.bytedance.sdk.openadsdk.TTC2Proxy", "a", Context.class);
            if (pvs2 != null) {
                pvs2.invoke(null, com.bytedance.sdk.openadsdk.core.mnm.pvs());
            }
        } catch (Throwable unused) {
        }
        try {
            Method pvs3 = com.bytedance.sdk.component.utils.ZhG.pvs("com.bytedance.sdk.openadsdk.TTC3Proxy", "a", Context.class);
            if (pvs3 != null) {
                pvs3.invoke(null, com.bytedance.sdk.openadsdk.core.mnm.pvs());
            }
        } catch (Throwable unused2) {
        }
        try {
            com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().pvs();
        } catch (Throwable unused3) {
        }
        try {
            com.bytedance.sdk.component.adexpress.pvs.icD.icD.icD();
        } catch (Throwable unused4) {
        }
    }
}
