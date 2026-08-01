package com.bytedance.sdk.openadsdk.multipro;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.component.utils.cR;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: TTMultiInitHelper.java */
/* loaded from: classes2.dex */
public class vG {
    private static final AtomicBoolean icD = new AtomicBoolean(false);
    private static boolean pvs = true;

    public static void pvs(Context context) {
        if (context != null && pvs && icD.compareAndSet(false, true)) {
            try {
                if (Build.VERSION.SDK_INT >= 28) {
                    if (cR.pvs(context)) {
                        icD(context);
                        return;
                    }
                    String icD2 = cR.icD(context);
                    try {
                        if (TextUtils.isEmpty(icD2)) {
                            icD2 = context.getPackageName() + Process.myPid();
                        }
                        WebView.setDataDirectorySuffix(icD2);
                    } catch (IllegalStateException unused) {
                        pvs(icD2);
                    } catch (Exception unused2) {
                    }
                }
            } catch (Throwable th) {
                Ju.icD(th.getMessage());
            }
        }
    }

    public static void pvs() {
        pvs = false;
    }

    private static void pvs(String str) {
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("forName", String.class);
            Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            declaredMethod2.setAccessible(true);
            Class cls = (Class) declaredMethod.invoke(null, "android.webkit.WebViewFactory");
            Field field = (Field) declaredMethod2.invoke(cls, "sDataDirectorySuffix");
            field.setAccessible(true);
            if (TextUtils.isEmpty((String) field.get(cls))) {
                field.set(cls, str);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void icD(Context context) {
        String str;
        FileChannel fileChannel;
        RandomAccessFile randomAccessFile;
        Throwable th;
        RandomAccessFile randomAccessFile2;
        String icD2 = icD();
        String str2 = "webview_data.lock";
        File file = new File(context.getDir(TextUtils.isEmpty(icD2) ? "webview" : "webview_".concat(String.valueOf(icD2)), 0).getPath(), "webview_data.lock");
        file.getAbsolutePath();
        if (!file.exists()) {
            return;
        }
        FileChannel fileChannel2 = null;
        FileLock tryLock = null;
        fileChannel2 = null;
        try {
            try {
                randomAccessFile = new RandomAccessFile(file, "rw");
                try {
                    fileChannel = randomAccessFile.getChannel();
                    if (fileChannel != null) {
                        try {
                            tryLock = fileChannel.tryLock();
                        } catch (Exception unused) {
                            fileChannel2 = fileChannel;
                            pvs(file);
                            if (fileChannel2 != null) {
                                try {
                                    fileChannel2.close();
                                } catch (Throwable th2) {
                                    th2.getMessage();
                                }
                            }
                            if (randomAccessFile != null) {
                                try {
                                    randomAccessFile.close();
                                    return;
                                } catch (Throwable th3) {
                                    th3.getMessage();
                                    return;
                                }
                            }
                            return;
                        } catch (Throwable th4) {
                            th = th4;
                            randomAccessFile2 = randomAccessFile;
                            if (fileChannel != null) {
                            }
                            if (randomAccessFile2 != 0) {
                            }
                        }
                    }
                    if (tryLock != null) {
                        tryLock.close();
                    } else {
                        pvs(file);
                    }
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (Throwable th5) {
                            th5.getMessage();
                        }
                    }
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th6) {
                        th6.getMessage();
                    }
                } catch (Exception unused2) {
                }
            } catch (Throwable th7) {
                th = th7;
                fileChannel = null;
                str = str2;
                th = th;
                randomAccessFile2 = str;
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (Throwable th8) {
                        th8.getMessage();
                    }
                }
                if (randomAccessFile2 != 0) {
                    try {
                        randomAccessFile2.close();
                        throw th;
                    } catch (Throwable th9) {
                        th9.getMessage();
                        throw th;
                    }
                }
                throw th;
            }
        } catch (Exception unused3) {
            randomAccessFile = null;
        } catch (Throwable th10) {
            th = th10;
            str = null;
            fileChannel = null;
            th = th;
            randomAccessFile2 = str;
            if (fileChannel != null) {
            }
            if (randomAccessFile2 != 0) {
            }
        }
    }

    private static void pvs(File file) {
        pvs(file, file.exists() ? file.delete() : false);
    }

    private static void pvs(File file, boolean z) {
        if (!z || file.exists()) {
            return;
        }
        try {
            file.createNewFile();
        } catch (IOException e) {
            Ju.pvs("TTAD.TTMultiInitHelper", e.getMessage());
        }
    }

    private static String icD() {
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("forName", String.class);
            Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            declaredMethod2.setAccessible(true);
            Class cls = (Class) declaredMethod.invoke(null, "android.webkit.WebViewFactory");
            return (String) ((Field) declaredMethod2.invoke(cls, "sDataDirectorySuffix")).get(cls);
        } catch (Throwable unused) {
            return null;
        }
    }
}
