package com.xsj.crasheye;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.xsj.crasheye.Crasheye;
import com.xsj.crasheye.log.Logger;

/* loaded from: classes2.dex */
public final class NativeExceptionHandler {
    private static volatile NativeExceptionHandler INSTANCE;
    private static boolean handleUserspaceSig;
    private static Handler handler;
    private static boolean initialized;
    private static String lastDmpFile;
    public static Crasheye.NDKExceptionCallback ndkExceptionCallback;
    private static Thread thread;

    private native boolean nativeInstallHandler(String str);

    private native boolean nativeInstallHandlerWithMono(String str, String str2);

    public native boolean nativeHandlerInstalled();

    public native void nativeReInstallHandler();

    public native void nativeSetSystemLogFilter(boolean z, int i, String str);

    public native void nativeSetUnhandleException();

    public native void nativeTestNativeCrash();

    public native void nativeWriteMinidump();

    private NativeExceptionHandler() {
    }

    public static NativeExceptionHandler getInstance() {
        if (INSTANCE == null) {
            synchronized (NativeExceptionHandler.class) {
                if (INSTANCE == null) {
                    INSTANCE = new NativeExceptionHandler();
                }
            }
        }
        return INSTANCE;
    }

    public void updateSystemLogConfigs() {
        if (initialized) {
            try {
                nativeSetSystemLogFilter(Properties.SEND_LOG, Properties.LOG_LINES, Properties.LOG_FILTER);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void handleUserspaceSig() {
        handleUserspaceSig = true;
        nativeSetUnhandleException();
        handler = new Handler(Looper.getMainLooper()) { // from class: com.xsj.crasheye.NativeExceptionHandler.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                try {
                    CrasheyeFileFilter.DeleteNativeFile();
                    NativeExceptionHandler.this.nativeReInstallHandler();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        thread = new Thread(new Runnable() { // from class: com.xsj.crasheye.NativeExceptionHandler.2
            @Override // java.lang.Runnable
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000L);
                        if (!NativeExceptionHandler.handler.hasMessages(1) && !NativeExceptionHandler.this.nativeHandlerInstalled()) {
                            NativeExceptionHandler.handler.sendEmptyMessageDelayed(1, 500L);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        return;
                    }
                }
            }
        });
        thread.setPriority(1);
        thread.start();
    }

    public boolean init() {
        if (initialized) {
            Logger.logWarning("native exception hanle is already init!");
            return true;
        }
        if (!Properties.isPluginInitialized()) {
            return false;
        }
        try {
            System.loadLibrary("CrasheyeNDK");
            updateSystemLogConfigs();
            if (!nativeInstallHandler(Properties.FILES_PATH)) {
                return false;
            }
            initialized = true;
            return true;
        } catch (UnsatisfiedLinkError unused) {
            Logger.logError("load CrasheyeNDK so fail");
            return false;
        }
    }

    public boolean initWithMono() {
        if (initialized) {
            Logger.logWarning("native exception hanle is already init!");
            return true;
        }
        if (!Properties.isPluginInitialized()) {
            return false;
        }
        try {
            System.loadLibrary("CrasheyeNDK");
            if (Properties.FILES_PATH == null) {
                Logger.logError("FILES_PATH is null, Mono init is fail!");
                return false;
            }
            if (Properties.LIB_MONOPATH == null) {
                Logger.logError("LIB_MONOPATH is null, Mono init is fail!");
                return false;
            }
            if (!nativeInstallHandlerWithMono(Properties.FILES_PATH, Properties.LIB_MONOPATH)) {
                return false;
            }
            initialized = true;
            return true;
        } catch (UnsatisfiedLinkError unused) {
            Logger.logError("load CrasheyeNDK so fail");
            return false;
        }
    }

    public boolean initWithHandleUserspaceSig() {
        if (initialized) {
            Logger.logWarning("unity native exception handle is already init!");
            return true;
        }
        if (!init()) {
            return false;
        }
        handleUserspaceSig();
        return true;
    }

    public static void hanleNativeException(String str) {
        if (!initialized) {
            Logger.logWarning("native exception hanle is not init!");
            return;
        }
        if (Properties.isPluginInitialized()) {
            lastDmpFile = str;
            ActionNativeError actionNativeError = new ActionNativeError(str);
            if (ndkExceptionCallback != null) {
                ndkExceptionCallback.execute();
            }
            actionNativeError.save(null);
            if (!handleUserspaceSig || handler.hasMessages(1)) {
                return;
            }
            handler.sendEmptyMessageDelayed(1, 2000L);
        }
    }
}
