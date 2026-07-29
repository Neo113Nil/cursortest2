package com.umeng.commonsdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.umeng.commonsdk.debug.UMDebugLog;
import com.umeng.commonsdk.debug.UMNullDebugLog;
import com.umeng.commonsdk.proguard.d;
import com.umeng.commonsdk.stateless.UMSLEnvelopeBuild;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.SdkVersion;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.utils.UMUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class UMConfigure {
    public static final int DEVICE_TYPE_BOX = 2;
    public static final int DEVICE_TYPE_PHONE = 1;
    private static final String KEY_FILE_NAME_APPKEY = "APPKEY";
    private static final String KEY_FILE_NAME_LOG = "LOG";
    private static final String KEY_METHOD_NAME_PUSH_SETCHANNEL = "setMessageChannel";
    private static final String KEY_METHOD_NAME_PUSH_SET_SECRET = "setSecret";
    private static final String KEY_METHOD_NAME_SETAPPKEY = "setAppkey";
    private static final String KEY_METHOD_NAME_SETCHANNEL = "setChannel";
    private static final String KEY_METHOD_NAME_SETDEBUGMODE = "setDebugMode";
    private static final String TAG = "UMConfigure";
    private static final String WRAPER_TYPE_COCOS2DX_X = "Cocos2d-x";
    private static final String WRAPER_TYPE_COCOS2DX_XLUA = "Cocos2d-x_lua";
    private static final String WRAPER_TYPE_HYBRID = "hybrid";
    private static final String WRAPER_TYPE_NATIVE = "native";
    private static final String WRAPER_TYPE_PHONEGAP = "phonegap";
    private static final String WRAPER_TYPE_REACTNATIVE = "react-native";
    private static final String WRAPER_TYPE_UNITY = "Unity";
    private static final String WRAPER_TYPE_WEEX = "weex";
    private static boolean debugLog;
    private static boolean isFinish;
    private static boolean isUMDebug;
    private static Object lockObject = new Object();
    public static UMDebugLog umDebugLog;

    private static Class<?> getClass(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private Object getInstanceObject(Class<?> cls) {
        if (cls != null) {
            try {
                return cls.newInstance();
            } catch (IllegalAccessException | InstantiationException unused) {
            }
        }
        return null;
    }

    private static Object getDecInstanceObject(Class<?> cls) {
        Constructor<?> constructor;
        if (cls != null) {
            try {
                constructor = cls.getDeclaredConstructor(new Class[0]);
            } catch (NoSuchMethodException unused) {
                constructor = null;
            }
            if (constructor != null) {
                constructor.setAccessible(true);
                try {
                    return constructor.newInstance(new Object[0]);
                } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException unused2) {
                }
            }
        }
        return null;
    }

    private static Method getDecMethod(Class<?> cls, String str, Class<?>[] clsArr) {
        Method method = null;
        if (cls != null) {
            try {
                method = cls.getDeclaredMethod(str, clsArr);
            } catch (NoSuchMethodException unused) {
            }
            if (method != null) {
                method.setAccessible(true);
            }
        }
        return method;
    }

    private static void invoke(Method method, Object obj, Object[] objArr) {
        if (method == null || obj == null) {
            return;
        }
        try {
            method.invoke(obj, objArr);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
        }
    }

    private static void invoke(Method method, Object[] objArr) {
        if (method != null) {
            try {
                method.invoke(null, objArr);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    private static void setFile(Class<?> cls, String str, String str2) {
        if (cls != null) {
            try {
                cls.getField(str).set(str, str2);
            } catch (Exception unused) {
            }
        }
    }

    private static void setFile(Class<?> cls, String str, boolean z) {
        if (cls != null) {
            try {
                cls.getField(str).set(str, Boolean.valueOf(z));
            } catch (Exception unused) {
            }
        }
    }

    private static void saveSDKComponent() {
        StringBuffer stringBuffer = new StringBuffer();
        if (getClass("com.umeng.analytics.vismode.V") != null) {
            stringBuffer.append("v");
        } else if (getClass("com.umeng.analytics.MobclickAgent") != null) {
            stringBuffer.append("a");
        }
        if (getClass("com.umeng.visual.UMVisualAgent") != null) {
            stringBuffer.append("x");
        }
        if (getClass("com.umeng.message.PushAgent") != null) {
            stringBuffer.append(d.ao);
        }
        if (getClass("com.umeng.socialize.UMShareAPI") != null) {
            stringBuffer.append(d.ap);
        }
        if (getClass("com.umeng.error.UMError") != null) {
            stringBuffer.append("e");
        }
        stringBuffer.append(d.aq);
        if (SdkVersion.SDK_TYPE != 1 && getClass("com.umeng.commonsdk.internal.UMOplus") != null) {
            stringBuffer.append("o");
        }
        if (TextUtils.isEmpty(stringBuffer)) {
            return;
        }
        com.umeng.commonsdk.statistics.b.f9127a = stringBuffer.toString();
        UMSLEnvelopeBuild.module = stringBuffer.toString();
    }

    public static boolean getInitStatus() {
        boolean z;
        synchronized (lockObject) {
            z = isFinish;
        }
        return z;
    }

    public static void init(Context context, int i, String str) {
        init(context, null, null, i, str);
    }

    public static void init(Context context, String str, String str2, int i, String str3) {
        Method declaredMethod;
        Method declaredMethod2;
        Method declaredMethod3;
        Method declaredMethod4;
        Method declaredMethod5;
        Method declaredMethod6;
        Object invoke;
        Method declaredMethod7;
        Method declaredMethod8;
        Object invoke2;
        Method declaredMethod9;
        Method declaredMethod10;
        String str4 = str;
        try {
            try {
                if (debugLog) {
                    Log.i(TAG, "common version is 1.5.2+000");
                    Log.i(TAG, "common type is " + SdkVersion.SDK_TYPE);
                }
                if (context == null) {
                    if (debugLog) {
                        Log.e(TAG, "context is null !!!");
                        return;
                    }
                    return;
                }
                Context applicationContext = context.getApplicationContext();
                try {
                    umDebugLog = (UMDebugLog) Class.forName("com.umeng.debug.log.UMLogImp").newInstance();
                    isUMDebug = true;
                    String appkeyByXML = UMUtils.getAppkeyByXML(applicationContext);
                    if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(appkeyByXML) && !str4.equals(appkeyByXML)) {
                        umDebugLog.mutlInfo("SC_10011", 3, "", new String[]{"@", "#"}, new String[]{str4, appkeyByXML});
                    }
                } catch (ClassNotFoundException | Exception unused) {
                }
                if (umDebugLog == null) {
                    umDebugLog = new UMNullDebugLog();
                    isUMDebug = false;
                }
                if (TextUtils.isEmpty(str)) {
                    str4 = UMUtils.getAppkeyByXML(applicationContext);
                }
                String channelByXML = TextUtils.isEmpty(str2) ? UMUtils.getChannelByXML(applicationContext) : str2;
                if (TextUtils.isEmpty(channelByXML)) {
                    channelByXML = "Unknown";
                }
                UMUtils.setChannel(applicationContext, channelByXML);
                if (debugLog) {
                    Log.i(TAG, "channel is " + channelByXML);
                }
                saveSDKComponent();
                try {
                    Class<?> cls = Class.forName("com.umeng.analytics.MobclickAgent");
                    if (cls != null && (declaredMethod10 = cls.getDeclaredMethod("init", Context.class)) != null) {
                        declaredMethod10.setAccessible(true);
                        declaredMethod10.invoke(cls, applicationContext);
                        if (debugLog) {
                            Log.i(TAG, "---->>>> init analytics is OK ~~");
                        }
                        umDebugLog.mutlInfo("SC_10003", 2, "");
                    }
                } catch (Exception unused2) {
                }
                try {
                    Class<?> cls2 = Class.forName("com.umeng.message.PushAgent");
                    if (cls2 != null && (declaredMethod8 = cls2.getDeclaredMethod(com.cmplay.base.util.ipc.a.FORCE_STATIC_METHOD, Context.class)) != null && (invoke2 = declaredMethod8.invoke(cls2, applicationContext)) != null && (declaredMethod9 = cls2.getDeclaredMethod(KEY_METHOD_NAME_SETAPPKEY, String.class)) != null) {
                        declaredMethod9.setAccessible(true);
                        declaredMethod9.invoke(invoke2, str4);
                        if (debugLog) {
                            Log.i(TAG, "---->>>> init Push app key is OK ~~");
                        }
                        umDebugLog.mutlInfo("SC_10004", 2, "");
                    }
                } catch (Exception unused3) {
                }
                try {
                    Class<?> cls3 = Class.forName("com.umeng.message.PushAgent");
                    if (cls3 != null && (declaredMethod6 = cls3.getDeclaredMethod(com.cmplay.base.util.ipc.a.FORCE_STATIC_METHOD, Context.class)) != null && (invoke = declaredMethod6.invoke(cls3, applicationContext)) != null && (declaredMethod7 = cls3.getDeclaredMethod(KEY_METHOD_NAME_PUSH_SETCHANNEL, String.class)) != null) {
                        declaredMethod7.setAccessible(true);
                        declaredMethod7.invoke(invoke, channelByXML);
                        if (debugLog) {
                            Log.i(TAG, "---->>>> init Push channel is OK ~~");
                        }
                        umDebugLog.mutlInfo("SC_10005", 2, "");
                    }
                } catch (Exception unused4) {
                }
                try {
                    Class<?> cls4 = getClass("com.umeng.socialize.UMShareAPI");
                    setFile(cls4, KEY_FILE_NAME_APPKEY, str4);
                    if (cls4 != null && (declaredMethod5 = cls4.getDeclaredMethod("init", Context.class, String.class)) != null) {
                        declaredMethod5.setAccessible(true);
                        declaredMethod5.invoke(cls4, applicationContext, str4);
                        if (debugLog) {
                            Log.i(TAG, "---->>>> init share appkey is OK ~~");
                        }
                        umDebugLog.mutlInfo("SC_10006", 2, "");
                    }
                } catch (Throwable unused5) {
                }
                if (TextUtils.isEmpty(str4)) {
                    if (debugLog) {
                        Log.e(TAG, "appkey is null !!!");
                    }
                    umDebugLog.aq("SC_10007", 0, "\\|");
                    return;
                }
                UMUtils.setAppkey(applicationContext, str4);
                String lastAppkey = UMUtils.getLastAppkey(applicationContext);
                if (!TextUtils.isEmpty(str4) && !str4.equals(lastAppkey)) {
                    if (!TextUtils.isEmpty(lastAppkey)) {
                        if (debugLog) {
                            Log.i(TAG, "appkey is change !!!");
                        }
                        umDebugLog.mutlInfo("SC_10008", 2, "");
                    }
                    UMUtils.setLastAppkey(applicationContext, str4);
                }
                if (debugLog) {
                    Log.i(TAG, "current appkey is " + str4 + ", last appkey is " + lastAppkey);
                }
                AnalyticsConstants.setDeviceType(i);
                if (TextUtils.isEmpty(str3)) {
                    boolean z = debugLog;
                } else {
                    if (debugLog) {
                        Log.i(TAG, "push secret is " + str3);
                    }
                    try {
                        Class<?> cls5 = Class.forName("com.umeng.message.PushAgent");
                        if (cls5 != null && (declaredMethod = cls5.getDeclaredMethod(com.cmplay.base.util.ipc.a.FORCE_STATIC_METHOD, Context.class)) != null) {
                            declaredMethod.setAccessible(true);
                            Object invoke3 = declaredMethod.invoke(cls5, applicationContext);
                            if (invoke3 != null && (declaredMethod2 = cls5.getDeclaredMethod(KEY_METHOD_NAME_PUSH_SET_SECRET, String.class)) != null) {
                                declaredMethod2.setAccessible(true);
                                declaredMethod2.invoke(invoke3, str3);
                                if (debugLog) {
                                    Log.i(TAG, "---->>>> init push secret is OK ~~");
                                }
                                umDebugLog.mutlInfo("SC_10009", 2, "");
                            }
                        }
                    } catch (Throwable unused6) {
                    }
                }
                try {
                    Class<?> cls6 = Class.forName("com.umeng.error.UMError");
                    if (cls6 != null && (declaredMethod4 = cls6.getDeclaredMethod("init", Context.class)) != null) {
                        declaredMethod4.setAccessible(true);
                        declaredMethod4.invoke(cls6, applicationContext);
                        if (debugLog) {
                            Log.i(TAG, "---->>>> init um e is ok ~~");
                        }
                        umDebugLog.mutlInfo("SC_10010", 2, "");
                    }
                } catch (Throwable unused7) {
                }
                if (SdkVersion.SDK_TYPE != 1) {
                    try {
                        Class<?> cls7 = Class.forName("com.umeng.commonsdk.UMConfigureImpl");
                        if (cls7 != null && (declaredMethod3 = cls7.getDeclaredMethod("init", Context.class)) != null) {
                            declaredMethod3.setAccessible(true);
                            declaredMethod3.invoke(cls7, applicationContext);
                        }
                    } catch (Throwable unused8) {
                    }
                } else {
                    c.a(applicationContext);
                }
                try {
                    Method method = Class.forName("com.umeng.visual.UMVisualAgent").getMethod("init", Context.class, String.class);
                    if (!TextUtils.isEmpty(str4)) {
                        method.invoke(null, context, str4);
                    } else if (AnalyticsConstants.UM_DEBUG) {
                        MLog.e("initDebugSDK appkey  is null");
                    }
                } catch (ClassNotFoundException unused9) {
                    Class.forName("com.umeng.analytics.vismode.event.VisualHelper").getMethod("init", Context.class).invoke(null, context);
                } catch (Throwable unused10) {
                }
                synchronized (lockObject) {
                    isFinish = true;
                }
            } catch (Throwable th) {
                if (debugLog) {
                    Log.e(TAG, "init e is " + th);
                }
            }
        } catch (Exception e) {
            if (debugLog) {
                Log.e(TAG, "init e is " + e);
            }
        }
    }

    public static boolean isDebugLog() {
        return isUMDebug;
    }

    public static void setLogEnabled(boolean z) {
        try {
            debugLog = z;
            MLog.DEBUG = z;
            Class<?> cls = getClass("com.umeng.message.PushAgent");
            invoke(getDecMethod(cls, KEY_METHOD_NAME_SETDEBUGMODE, new Class[]{Boolean.TYPE}), getDecInstanceObject(cls), new Object[]{Boolean.valueOf(z)});
            setFile(getClass("com.umeng.socialize.Config"), "DEBUG", z);
        } catch (Exception e) {
            if (debugLog) {
                Log.e(TAG, "set log enabled e is " + e);
            }
        } catch (Throwable th) {
            if (debugLog) {
                Log.e(TAG, "set log enabled e is " + th);
            }
        }
    }

    public static void setEncryptEnabled(boolean z) {
        com.umeng.commonsdk.statistics.b.a(z);
        UMSLEnvelopeBuild.setEncryptEnabled(z);
    }

    public static String getUMIDString(Context context) {
        if (context != null) {
            return UMUtils.getUMId(context.getApplicationContext());
        }
        return null;
    }

    private static void setLatencyWindow(long j) {
        com.umeng.commonsdk.statistics.a.f9125c = ((int) j) * 1000;
    }

    private static void setCheckDevice(boolean z) {
        AnalyticsConstants.CHECK_DEVICE = z;
    }

    private static void setWraperType(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (str.equals("native")) {
                com.umeng.commonsdk.stateless.a.f9096a = "native";
                com.umeng.commonsdk.statistics.a.f9123a = "native";
            } else if (str.equals(WRAPER_TYPE_COCOS2DX_X)) {
                com.umeng.commonsdk.stateless.a.f9096a = WRAPER_TYPE_COCOS2DX_X;
                com.umeng.commonsdk.statistics.a.f9123a = WRAPER_TYPE_COCOS2DX_X;
            } else if (str.equals(WRAPER_TYPE_COCOS2DX_XLUA)) {
                com.umeng.commonsdk.stateless.a.f9096a = WRAPER_TYPE_COCOS2DX_XLUA;
                com.umeng.commonsdk.statistics.a.f9123a = WRAPER_TYPE_COCOS2DX_XLUA;
            } else if (str.equals(WRAPER_TYPE_UNITY)) {
                com.umeng.commonsdk.stateless.a.f9096a = WRAPER_TYPE_UNITY;
                com.umeng.commonsdk.statistics.a.f9123a = WRAPER_TYPE_UNITY;
            } else if (str.equals(WRAPER_TYPE_REACTNATIVE)) {
                com.umeng.commonsdk.stateless.a.f9096a = WRAPER_TYPE_REACTNATIVE;
                com.umeng.commonsdk.statistics.a.f9123a = WRAPER_TYPE_REACTNATIVE;
            } else if (str.equals("phonegap")) {
                com.umeng.commonsdk.stateless.a.f9096a = "phonegap";
                com.umeng.commonsdk.statistics.a.f9123a = "phonegap";
            } else if (str.equals(WRAPER_TYPE_WEEX)) {
                com.umeng.commonsdk.stateless.a.f9096a = WRAPER_TYPE_WEEX;
                com.umeng.commonsdk.statistics.a.f9123a = WRAPER_TYPE_WEEX;
            } else if (str.equals(WRAPER_TYPE_HYBRID)) {
                com.umeng.commonsdk.stateless.a.f9096a = WRAPER_TYPE_HYBRID;
                com.umeng.commonsdk.statistics.a.f9123a = WRAPER_TYPE_HYBRID;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        com.umeng.commonsdk.stateless.a.f9097b = str2;
        com.umeng.commonsdk.statistics.a.f9124b = str2;
    }

    public static String[] getTestDeviceInfo(Context context) {
        String[] strArr = new String[2];
        if (context != null) {
            try {
                strArr[0] = DeviceConfig.getDeviceIdForGeneral(context);
                strArr[1] = DeviceConfig.getMac(context);
            } catch (Exception unused) {
            }
        }
        return strArr;
    }
}
