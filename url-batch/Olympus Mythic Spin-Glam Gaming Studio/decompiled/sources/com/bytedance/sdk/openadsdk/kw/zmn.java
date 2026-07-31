package com.bytedance.sdk.openadsdk.kw;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.component.utils.phc;
import com.bytedance.sdk.openadsdk.uqh.btk;
import com.ironsource.X3;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes15.dex */
public class zmn {
    private static final AtomicBoolean fs = new AtomicBoolean(false);
    private static boolean zmn = true;

    public static void zmn(Context context) {
        if (context != null && zmn && fs.compareAndSet(false, true)) {
            try {
                if (Build.VERSION.SDK_INT >= 28) {
                    if (phc.zmn(context)) {
                        if (btk.zmn("webview_defend", false)) {
                            fs(context);
                            return;
                        }
                        return;
                    }
                    String fs2 = phc.fs(context);
                    try {
                        if (TextUtils.isEmpty(fs2)) {
                            fs2 = context.getPackageName() + Process.myPid();
                        }
                        WebView.setDataDirectorySuffix(fs2);
                        iqz.zmn("TTAD.TTMultiInitHelper", "init: WebView.setDataDirectorySuffix with ".concat(String.valueOf(fs2)));
                    } catch (IllegalStateException e) {
                        iqz.zmn("TTAD.TTMultiInitHelper", "init: ", e);
                        zmn(fs2);
                    } catch (Exception e2) {
                        iqz.zmn("TTAD.TTMultiInitHelper", "init: ", e2);
                    }
                }
            } catch (Throwable th) {
                iqz.zmn("TTAD.TTMultiInitHelper", "init: ", th);
            }
        }
    }

    public static void zmn() {
        zmn = false;
    }

    private static void zmn(String str) {
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
        } catch (Throwable th) {
            Log.e("TTAD.TTMultiInitHelper", "trySetDataDirectorySuffix: ", th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void fs(Context context) {
        RandomAccessFile randomAccessFile;
        FileChannel fileChannel;
        Throwable th;
        String fs2 = fs();
        File file = new File(context.getDir(TextUtils.isEmpty(fs2) ? X3.i.K : "webview_".concat(String.valueOf(fs2)), 0).getPath(), "webview_data.lock");
        file.getAbsolutePath();
        if (!file.exists()) {
            return;
        }
        FileChannel fileChannel2 = null;
        FileLock tryLock = null;
        fileChannel2 = null;
        fileChannel2 = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                try {
                    fileChannel = randomAccessFile.getChannel();
                    if (fileChannel != null) {
                        try {
                            tryLock = fileChannel.tryLock();
                        } catch (Exception unused) {
                            fileChannel2 = fileChannel;
                            zmn(file);
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
                            if (fileChannel != null) {
                            }
                            if (randomAccessFile != null) {
                            }
                        }
                    }
                    if (tryLock != null) {
                        tryLock.close();
                    } else {
                        zmn(file);
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
                fileChannel = fileChannel2;
                th = th;
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (Throwable th8) {
                        th8.getMessage();
                    }
                }
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
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
            randomAccessFile = null;
            fileChannel = null;
            th = th;
            if (fileChannel != null) {
            }
            if (randomAccessFile != null) {
            }
        }
    }

    private static void zmn(File file) {
        zmn(file, file.exists() ? file.delete() : false);
    }

    private static void zmn(File file, boolean z) {
        if (!z || file.exists()) {
            return;
        }
        try {
            file.createNewFile();
        } catch (IOException e) {
            iqz.zn("TTAD.TTMultiInitHelper", e.getMessage());
        }
    }

    private static String fs() {
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
