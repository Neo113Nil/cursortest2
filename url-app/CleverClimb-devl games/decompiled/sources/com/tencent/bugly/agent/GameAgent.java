package com.tencent.bugly.agent;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.umeng.commonsdk.proguard.d;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* loaded from: classes2.dex */
public class GameAgent {
    private static final String CLASS_COCOS_ACTIVITY = "org.cocos2dx.lib.Cocos2dxActivity";
    private static final String CLASS_UNITY_PLAYER = "com.unity3d.player.UnityPlayer";
    private static final String CRASH_REPORT_CLASS_SUFFIX = "crashreport.CrashReport";
    public static final int GAME_TYPE_COCOS = 1;
    public static final int GAME_TYPE_UNITY = 2;
    public static final int GAME_TYPE_UNKNOWN = 0;
    private static final int LOG_LEVEL_DEBUG = 1;
    private static final int LOG_LEVEL_ERROR = 4;
    private static final int LOG_LEVEL_INFO = 2;
    private static final int LOG_LEVEL_VERBOSE = 0;
    private static final int LOG_LEVEL_WARN = 3;
    private static final String LOG_TAG = "CrashReport-GameAgent";
    private static final String OLD_STRATEGY_CLASS_SUFFIX = "crashreport.CrashReport$UserStrategy";
    private static final String STRATEGY_CLASS_SUFFIX = "BuglyStrategy";
    private static final int TYPE_COCOS2DX_JS_CRASH = 5;
    private static final int TYPE_COCOS2DX_LUA_CRASH = 6;
    private static final int TYPE_U3D_CRASH = 4;
    private static final String VERSION = "3.2";
    private static boolean hasGuessed = false;
    private static WeakReference<Activity> sActivity = null;
    private static String sAppChannel = null;
    private static String sAppVersion = null;
    private static WeakReference<Context> sContext = null;
    private static int sGameType = 0;
    private static Handler sHandler = null;
    private static boolean sIsDebug = false;
    private static String sUserId = null;
    private static String sdkPackageName = "com.tencent.bugly";

    public static String getVersion() {
        return VERSION;
    }

    public static void printLog(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.startsWith("<Log>")) {
            printLog(2, str);
            return;
        }
        if (str.startsWith("<LogDebug>")) {
            printLog(1, str);
            return;
        }
        if (str.startsWith("<LogInfo>")) {
            printLog(2, str);
            return;
        }
        if (str.startsWith("<LogWarning>")) {
            printLog(3, str);
            return;
        }
        if (str.startsWith("<LogAssert>")) {
            printLog(3, str);
            return;
        }
        if (str.startsWith("<LogError>")) {
            printLog(4, str);
        } else if (str.startsWith("<LogException>")) {
            printLog(4, str);
        } else {
            printLog(0, str);
        }
    }

    private static void printLog(int i, String str) {
        setLog(i, LOG_TAG, str);
    }

    public static Activity getUnityActivity() {
        try {
            Object b2 = a.b(CLASS_UNITY_PLAYER, "currentActivity", (Object) null);
            if (b2 != null && (b2 instanceof Activity)) {
                return (Activity) b2;
            }
        } catch (Exception unused) {
            Log.w(LOG_TAG, "Failed to get activity of Unity.");
        }
        return null;
    }

    public static Activity getCocosActivity() {
        try {
            Object b2 = a.b(CLASS_COCOS_ACTIVITY, "getContext", null, new Class[0]);
            if (b2 != null && (b2 instanceof Activity)) {
                return (Activity) b2;
            }
        } catch (Exception unused) {
            Log.w(LOG_TAG, "Failed to get activity of Cocos.");
        }
        return null;
    }

    private static Activity guessActivity() {
        if (hasGuessed) {
            return null;
        }
        hasGuessed = true;
        Activity activity = sGameType != 0 ? getActivity() : null;
        if (activity == null) {
            sGameType = 1;
            activity = getActivity();
        }
        if (activity == null) {
            sGameType = 2;
            activity = getActivity();
        }
        if (activity == null) {
            sGameType = 0;
        }
        return activity;
    }

    private static Activity getActivity() {
        Activity cocosActivity;
        if (sActivity == null || sActivity.get() == null) {
            switch (sGameType) {
                case 1:
                    cocosActivity = getCocosActivity();
                    break;
                case 2:
                    cocosActivity = getUnityActivity();
                    break;
                default:
                    Log.w(LOG_TAG, "Game type has not been set.");
                    cocosActivity = guessActivity();
                    break;
            }
            if (cocosActivity != null) {
                sActivity = new WeakReference<>(cocosActivity);
            }
        }
        if (sActivity != null) {
            return sActivity.get();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Context getApplicationContext() {
        Activity activity;
        if ((sContext == null || sContext.get() == null) && (activity = getActivity()) != null) {
            sContext = new WeakReference<>(activity.getApplicationContext());
        }
        if (sContext != null) {
            return sContext.get();
        }
        return null;
    }

    private static void runTaskInUiThread(Runnable runnable) {
        Activity activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(runnable);
        } else {
            new Thread(runnable).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void exitApplication() {
        int myPid = Process.myPid();
        printLog(3, String.format(Locale.US, "Exit application by kill process[%d]", Integer.valueOf(myPid)));
        Process.killProcess(myPid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void delayExit(long j) {
        long max = Math.max(0L, j);
        if (sHandler != null) {
            sHandler.postDelayed(new Runnable() { // from class: com.tencent.bugly.agent.GameAgent.1
                @Override // java.lang.Runnable
                public void run() {
                    GameAgent.exitApplication();
                }
            }, max);
            return;
        }
        try {
            Thread.sleep(max);
            exitApplication();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String convertToCanonicalName(String str) {
        StringBuilder sb = new StringBuilder();
        if (sdkPackageName == null) {
            sdkPackageName = "com.tencent.bugly";
        }
        sb.append(sdkPackageName);
        sb.append(".");
        sb.append(str);
        return sb.toString();
    }

    public static void setSdkPackageName(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        sdkPackageName = str;
    }

    public static void setGameType(int i) {
        sGameType = i;
    }

    public static void setLogEnable(boolean z) {
        sIsDebug = z;
    }

    private static Object newStrategy(Context context, String str, String str2, long j) {
        Object b2;
        if (context != null && ((!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) && (b2 = a.b(convertToCanonicalName(OLD_STRATEGY_CLASS_SUFFIX), new Object[]{context}, (Class<?>[]) new Class[]{Context.class})) != null)) {
            try {
                Class<?> cls = Class.forName(convertToCanonicalName(STRATEGY_CLASS_SUFFIX));
                cls.getDeclaredMethod("setAppChannel", String.class).invoke(b2, str);
                cls.getDeclaredMethod("setAppVersion", String.class).invoke(b2, str2);
                cls.getDeclaredMethod("setAppReportDelay", Long.TYPE).invoke(b2, Long.valueOf(j));
                return b2;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (IllegalArgumentException e2) {
                e2.printStackTrace();
            } catch (NoSuchMethodException e3) {
                e3.printStackTrace();
            } catch (InvocationTargetException e4) {
                e4.printStackTrace();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        return null;
    }

    public static void initCrashReport(String str, boolean z) {
        setLogEnable(z);
        initCrashReport(str, sAppChannel, sAppVersion, sUserId, 0L);
    }

    private static void initCrashReport(final String str, String str2, String str3, final String str4, long j) {
        final Context applicationContext = getApplicationContext();
        if (applicationContext == null) {
            printLog(4, "Context is null. bugly initialize terminated.");
        } else {
            if (TextUtils.isEmpty(str)) {
                printLog(4, "Please input appid when initCrashReport.");
                return;
            }
            sHandler = new Handler(Looper.getMainLooper());
            final Object newStrategy = newStrategy(applicationContext, str2, str3, j);
            runTaskInUiThread(new Runnable() { // from class: com.tencent.bugly.agent.GameAgent.6
                /* JADX WARN: Removed duplicated region for block: B:10:0x0059  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void run() {
                    boolean z;
                    boolean z2 = GameAgent.sIsDebug;
                    if (newStrategy != null) {
                        Class<?> cls = null;
                        try {
                            cls = Class.forName(GameAgent.convertToCanonicalName(GameAgent.OLD_STRATEGY_CLASS_SUFFIX));
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                        if (cls != null) {
                            a.b(GameAgent.convertToCanonicalName(GameAgent.CRASH_REPORT_CLASS_SUFFIX), "initCrashReport", new Object[]{applicationContext, str, Boolean.valueOf(z2), newStrategy}, Context.class, String.class, Boolean.TYPE, cls);
                            z = true;
                            if (!z) {
                                a.b(GameAgent.convertToCanonicalName(GameAgent.CRASH_REPORT_CLASS_SUFFIX), "initCrashReport", new Object[]{applicationContext, str, Boolean.valueOf(z2)}, Context.class, String.class, Boolean.TYPE);
                            }
                            GameAgent.setUserId(str4);
                        }
                    }
                    z = false;
                    if (!z) {
                    }
                    GameAgent.setUserId(str4);
                }
            });
        }
    }

    public static void setAppVersion(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        sAppVersion = str;
        runTaskInUiThread(new Runnable() { // from class: com.tencent.bugly.agent.GameAgent.7
            @Override // java.lang.Runnable
            public void run() {
                a.b(GameAgent.convertToCanonicalName(GameAgent.CRASH_REPORT_CLASS_SUFFIX), "setAppVersion", new Object[]{GameAgent.getApplicationContext(), str}, Context.class, String.class);
            }
        });
    }

    public static void setAppChannel(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        sAppChannel = str;
        runTaskInUiThread(new Runnable() { // from class: com.tencent.bugly.agent.GameAgent.8
            @Override // java.lang.Runnable
            public void run() {
                a.b(GameAgent.convertToCanonicalName(GameAgent.CRASH_REPORT_CLASS_SUFFIX), "setAppChannel", new Object[]{GameAgent.getApplicationContext(), str}, Context.class, String.class);
            }
        });
    }

    public static void setUserId(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        sUserId = str;
        runTaskInUiThread(new Runnable() { // from class: com.tencent.bugly.agent.GameAgent.9
            @Override // java.lang.Runnable
            public void run() {
                a.b(GameAgent.convertToCanonicalName(GameAgent.CRASH_REPORT_CLASS_SUFFIX), "setUserId", new Object[]{GameAgent.getApplicationContext(), str}, Context.class, String.class);
            }
        });
    }

    public static void setUserSceneTag(final int i) {
        runTaskInUiThread(new Runnable() { // from class: com.tencent.bugly.agent.GameAgent.10
            @Override // java.lang.Runnable
            public void run() {
                a.b(GameAgent.convertToCanonicalName(GameAgent.CRASH_REPORT_CLASS_SUFFIX), "setUserSceneTag", new Object[]{GameAgent.getApplicationContext(), Integer.valueOf(i)}, Context.class, Integer.TYPE);
            }
        });
    }

    public static void putUserData(final String str, final String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        runTaskInUiThread(new Runnable() { // from class: com.tencent.bugly.agent.GameAgent.11
            @Override // java.lang.Runnable
            public void run() {
                a.b(GameAgent.convertToCanonicalName(GameAgent.CRASH_REPORT_CLASS_SUFFIX), "putUserData", new Object[]{GameAgent.getApplicationContext(), str, str2}, Context.class, String.class, String.class);
            }
        });
    }

    public static void removeUserData(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        runTaskInUiThread(new Runnable() { // from class: com.tencent.bugly.agent.GameAgent.12
            @Override // java.lang.Runnable
            public void run() {
                a.b(GameAgent.convertToCanonicalName(GameAgent.CRASH_REPORT_CLASS_SUFFIX), "removeUserData", new Object[]{GameAgent.getApplicationContext(), str}, Context.class, String.class);
            }
        });
    }

    public static void setSdkConfig(final String str, final String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        runTaskInUiThread(new Runnable() { // from class: com.tencent.bugly.agent.GameAgent.13
            @Override // java.lang.Runnable
            public void run() {
                a.b(GameAgent.convertToCanonicalName(GameAgent.CRASH_REPORT_CLASS_SUFFIX), "putSdkData", new Object[]{GameAgent.getApplicationContext(), "SDK_" + str, str2}, Context.class, String.class, String.class);
            }
        });
    }

    public static void setLog(int i, final String str, final String str2) {
        final String str3;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        switch (i) {
            case 0:
                str3 = "v";
                break;
            case 1:
                str3 = d.am;
                break;
            case 2:
                str3 = d.aq;
                break;
            case 3:
                str3 = "w";
                break;
            case 4:
                str3 = "e";
                break;
            default:
                str3 = null;
                break;
        }
        if (str3 != null) {
            runTaskInUiThread(new Runnable() { // from class: com.tencent.bugly.agent.GameAgent.2
                @Override // java.lang.Runnable
                public void run() {
                    a.b(GameAgent.convertToCanonicalName("crashreport.BuglyLog"), str3, new Object[]{str, str2}, String.class, String.class);
                }
            });
        }
    }

    private static void postCocosLuaException(final int i, String str, final String str2, String str3, final boolean z) {
        final String str4;
        try {
            if (str3.startsWith("stack traceback")) {
                str3 = str3.substring(str3.indexOf("\n") + 1, str3.length()).trim();
            }
            int indexOf = str3.indexOf("\n");
            if (indexOf > 0) {
                str3 = str3.substring(indexOf + 1, str3.length());
            }
            int indexOf2 = str3.indexOf("\n");
            String substring = indexOf2 > 0 ? str3.substring(0, indexOf2) : str3;
            int indexOf3 = substring.indexOf("]:");
            if (str == null || str.length() == 0) {
                str = indexOf3 != -1 ? substring.substring(0, indexOf3 + 1) : str2;
            }
        } catch (Throwable unused) {
            if (str == null || str.length() == 0) {
                str4 = str2;
            }
        }
        str4 = str;
        final String str5 = str3;
        runTaskInUiThread(new Runnable() { // from class: com.tencent.bugly.agent.GameAgent.3
            @Override // java.lang.Runnable
            public void run() {
                a.b(GameAgent.convertToCanonicalName("crashreport.inner.InnerApi"), "postCocos2dxCrashAsync", new Object[]{Integer.valueOf(i), str4, str2, str5}, Integer.TYPE, String.class, String.class, String.class);
                if (z) {
                    GameAgent.delayExit(3000L);
                }
            }
        });
    }

    private static void postCocosJsException(final int i, final String str, final String str2, final String str3, final boolean z) {
        runTaskInUiThread(new Runnable() { // from class: com.tencent.bugly.agent.GameAgent.4
            @Override // java.lang.Runnable
            public void run() {
                a.b(GameAgent.convertToCanonicalName("crashreport.inner.InnerApi"), "postCocos2dxCrashAsync", new Object[]{Integer.valueOf(i), str, str2, str3}, Integer.TYPE, String.class, String.class, String.class);
                if (z) {
                    GameAgent.delayExit(3000L);
                }
            }
        });
    }

    private static void postUnityException(final String str, final String str2, final String str3, final boolean z) {
        runTaskInUiThread(new Runnable() { // from class: com.tencent.bugly.agent.GameAgent.5
            @Override // java.lang.Runnable
            public void run() {
                a.b(GameAgent.convertToCanonicalName("crashreport.inner.InnerApi"), "postU3dCrashAsync", new Object[]{str, str2, str3}, String.class, String.class, String.class);
                if (z) {
                    GameAgent.delayExit(3000L);
                }
            }
        });
    }

    public static void postException(int i, String str, String str2, String str3, boolean z) {
        switch (i) {
            case 4:
                postUnityException(str, str2, str3, z);
                break;
            case 5:
                postCocosJsException(i, str, str2, str3, z);
                break;
            case 6:
                postCocosLuaException(i, str, str2, str3, z);
                break;
            default:
                printLog(4, "The category of exception posted is unknown: " + String.valueOf(i));
                break;
        }
    }

    private static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static Object b(String str, String str2, Object obj) {
            try {
                Field declaredField = Class.forName(str).getDeclaredField(str2);
                declaredField.setAccessible(true);
                return declaredField.get(obj);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                return null;
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
                return null;
            } catch (NoSuchFieldException e3) {
                e3.printStackTrace();
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Object b(String str, String str2, Object[] objArr, Class<?>... clsArr) {
            try {
                Method declaredMethod = Class.forName(str).getDeclaredMethod(str2, clsArr);
                declaredMethod.setAccessible(true);
                return declaredMethod.invoke(null, objArr);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                return null;
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
                return null;
            } catch (NoSuchMethodException e3) {
                e3.printStackTrace();
                return null;
            } catch (InvocationTargetException e4) {
                e4.printStackTrace();
                return null;
            } catch (Exception e5) {
                e5.printStackTrace();
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Object b(String str, Object[] objArr, Class<?>... clsArr) {
            try {
                Class<?> cls = Class.forName(str);
                if (objArr == null) {
                    return cls.newInstance();
                }
                return cls.getConstructor(clsArr).newInstance(objArr);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                return null;
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
                return null;
            } catch (InstantiationException e3) {
                e3.printStackTrace();
                return null;
            } catch (NoSuchMethodException e4) {
                e4.printStackTrace();
                return null;
            } catch (InvocationTargetException e5) {
                e5.printStackTrace();
                return null;
            } catch (Exception e6) {
                e6.printStackTrace();
                return null;
            }
        }
    }
}
