package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.safedk.android.internal.partials.PangleFilesBridge;
import java.io.File;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.util.Properties;

/* loaded from: classes4.dex */
public class fkt implements Thread.UncaughtExceptionHandler {
    public static volatile boolean zmn;
    private final Thread.UncaughtExceptionHandler fs = Thread.getDefaultUncaughtExceptionHandler();
    private String zn;

    public static fkt zmn() {
        return new fkt();
    }

    private fkt() {
        Thread.setDefaultUncaughtExceptionHandler(this);
        fs();
    }

    private void fs() {
        Context zmn2 = com.bytedance.sdk.openadsdk.core.kgc.zmn();
        if (zmn2 == null) {
            return;
        }
        try {
            File file = new File(zmn2.getFilesDir(), "TTCache");
            file.mkdirs();
            this.zn = file.getPath();
        } catch (Throwable unused) {
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        zmn = true;
        com.bytedance.sdk.component.utils.zg.zmn = true;
        com.bytedance.sdk.component.zg.fs.btk.zn = true;
        boolean z = false;
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
            zmn(thread, th);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.fs;
        if (uncaughtExceptionHandler == null || uncaughtExceptionHandler == this) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.util.Properties] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.Properties] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.FileOutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zmn(Thread thread, Throwable th) {
        ?? r1;
        ?? r12;
        boolean z;
        int i;
        FileInputStream fileInputStream = null;
        try {
            if (TextUtils.isEmpty(this.zn)) {
                fs();
            }
            if (TextUtils.isEmpty(this.zn)) {
                return;
            }
            File file = new File(this.zn, "tt_crash_count.properties");
            if (file.exists() && file.isFile() && file.canRead()) {
                ?? properties = new Properties();
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    properties.load(fileInputStream2);
                    String property = properties.getProperty("crash_count", "0");
                    String property2 = properties.getProperty("crash_last_time", "0");
                    int intValue = Integer.valueOf(property).intValue();
                    if (System.currentTimeMillis() - Long.valueOf(property2).longValue() < 300000) {
                        i = intValue + 1;
                        z = false;
                    } else {
                        z = true;
                        i = 1;
                    }
                    boolean z2 = i >= 3;
                    int i2 = z2 ? 0 : i;
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
                        ?? fileOutputStreamCtor = PangleFilesBridge.fileOutputStreamCtor(file);
                        try {
                            properties.store(fileOutputStreamCtor, "tt_crash_info");
                            fileInputStream = fileOutputStreamCtor;
                        } catch (Throwable th2) {
                            r1 = fileOutputStreamCtor;
                            th = th2;
                            fileInputStream = fileInputStream2;
                            com.bytedance.sdk.component.utils.iqz.zmn("TTCrashHandler", "crash count error", th);
                            if (fileInputStream != null) {
                            }
                            if (r1 == 0) {
                            }
                        }
                    }
                    if (z2) {
                        zn();
                    }
                    r12 = fileInputStream;
                    fileInputStream = fileInputStream2;
                } catch (Throwable th3) {
                    th = th3;
                    r1 = fileInputStream;
                }
            } else {
                ?? properties2 = new Properties();
                properties2.setProperty("crash_count", "1");
                properties2.setProperty("crash_last_time", String.valueOf(System.currentTimeMillis()));
                r1 = PangleFilesBridge.fileOutputStreamCtor(file);
                try {
                    properties2.store(r1, "tt_crash_info");
                    r12 = r1;
                } catch (Throwable th4) {
                    th = th4;
                    try {
                        com.bytedance.sdk.component.utils.iqz.zmn("TTCrashHandler", "crash count error", th);
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable unused2) {
                            }
                        }
                        if (r1 == 0) {
                            try {
                                r1.close();
                                return;
                            } catch (Throwable unused3) {
                                return;
                            }
                        }
                        return;
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
            if (r12 != 0) {
                try {
                    r12.close();
                } catch (Throwable unused5) {
                }
            }
        } catch (Throwable th5) {
            th = th5;
            r1 = 0;
        }
    }

    private void zn() {
        try {
            com.bytedance.sdk.openadsdk.component.nps.zmn.zmn(com.bytedance.sdk.openadsdk.core.kgc.zmn());
        } catch (Throwable unused) {
        }
        try {
            if (fs.zn()) {
                com.bytedance.sdk.openadsdk.component.reward.kgc.zmn(com.bytedance.sdk.openadsdk.core.kgc.zmn()).btk();
            } else {
                com.bytedance.sdk.openadsdk.component.reward.olo.zmn(com.bytedance.sdk.openadsdk.core.kgc.zmn()).zmn();
            }
        } catch (Throwable unused2) {
        }
        try {
            if (fs.zn()) {
                com.bytedance.sdk.openadsdk.component.reward.nps.zmn(com.bytedance.sdk.openadsdk.core.kgc.zmn()).btk();
            } else {
                com.bytedance.sdk.openadsdk.component.reward.hhw.zmn(com.bytedance.sdk.openadsdk.core.kgc.zmn()).zmn();
            }
        } catch (Throwable unused3) {
        }
        try {
            com.bytedance.sdk.openadsdk.core.settings.rc.fs().zmn();
        } catch (Throwable unused4) {
        }
        try {
            com.bytedance.sdk.component.adexpress.zmn.fs.fs.fs();
        } catch (Throwable unused5) {
        }
    }
}
