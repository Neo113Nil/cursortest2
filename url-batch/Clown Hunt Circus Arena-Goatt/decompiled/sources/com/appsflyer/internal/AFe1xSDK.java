package com.appsflyer.internal;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.google.firebase.messaging.Constants;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class AFe1xSDK {
    Map<String, Object> AFInAppEventParameterName;
    public volatile String AFInAppEventType;
    public final AFb1bSDK AFKeystoreWrapper;
    private final AFe1wSDK afRDLog;
    public volatile String valueOf;
    private boolean afInfoLog = false;
    public volatile boolean values = false;

    public AFe1xSDK(AFb1bSDK aFb1bSDK, AFe1wSDK aFe1wSDK) {
        this.AFKeystoreWrapper = aFb1bSDK;
        this.afRDLog = aFe1wSDK;
    }

    public final boolean values() {
        return this.values;
    }

    public final String AFInAppEventType(AFb1fSDK aFb1fSDK) {
        String str;
        boolean z = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI, false);
        String valueOf = aFb1fSDK.valueOf("imeiCached", (String) null);
        if (!z || !AFb1vSDK.AFInAppEventParameterName(this.valueOf)) {
            if (this.valueOf != null) {
                str = this.valueOf;
            }
            str = null;
        } else {
            Context context = this.AFKeystoreWrapper.AFInAppEventParameterName;
            if (context != null && AFInAppEventParameterName(context)) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    str = (String) telephonyManager.getClass().getMethod("getDeviceId", new Class[0]).invoke(telephonyManager, new Object[0]);
                } catch (InvocationTargetException e) {
                    if (valueOf != null) {
                        AFLogger.afDebugLog("use cached IMEI: ".concat(String.valueOf(valueOf)));
                    } else {
                        valueOf = null;
                    }
                    AFLogger.afErrorLog(new StringBuilder("WARNING: Can't collect IMEI because of missing permissions: ").append(e.getMessage()).toString(), e);
                } catch (Exception e2) {
                    if (valueOf != null) {
                        AFLogger.afDebugLog("use cached IMEI: ".concat(String.valueOf(valueOf)));
                    } else {
                        valueOf = null;
                    }
                    AFLogger.afErrorLog(new StringBuilder("WARNING: Can't collect IMEI: other reason: ").append(e2.getMessage()).toString(), e2);
                }
                if (str == null) {
                    if (valueOf != null) {
                        AFLogger.afDebugLog("use cached IMEI: ".concat(String.valueOf(valueOf)));
                    } else {
                        valueOf = null;
                    }
                    str = valueOf;
                }
            }
            str = null;
        }
        if (!AFb1vSDK.AFInAppEventParameterName(str)) {
            aFb1fSDK.values("imeiCached", str);
            return str;
        }
        AFLogger.afInfoLog("IMEI was not collected.");
        return null;
    }

    public final Map<String, Object> AFKeystoreWrapper() {
        HashMap hashMap = new HashMap();
        if (valueOf()) {
            hashMap.put("lvl", this.AFInAppEventParameterName);
            return hashMap;
        }
        if (this.afInfoLog) {
            HashMap hashMap2 = new HashMap();
            this.AFInAppEventParameterName = hashMap2;
            hashMap2.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, "operation timed out.");
            hashMap.put("lvl", this.AFInAppEventParameterName);
        }
        return hashMap;
    }

    private boolean valueOf() {
        Map<String, Object> map = this.AFInAppEventParameterName;
        return (map == null || map.isEmpty()) ? false : true;
    }

    public final boolean AFInAppEventType() {
        return this.afInfoLog && !valueOf();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.appsflyer.internal.AFe1wSDK.3.<init>(com.appsflyer.internal.AFe1wSDK, com.appsflyer.internal.AFe1wSDK$AFa1zSDK):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:290)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:193)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    public final boolean AFInAppEventParameterName() {
        /*
            r12 = this;
            java.lang.String r0 = "com.appsflyer.lvl.AppsFlyerLVL"
            r1 = 0
            java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L88
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.ClassNotFoundException -> L88
            com.appsflyer.internal.AFe1wSDK r4 = r12.afRDLog     // Catch: java.lang.ClassNotFoundException -> L88
            com.appsflyer.internal.AFb1bSDK r5 = r12.AFKeystoreWrapper     // Catch: java.lang.ClassNotFoundException -> L88
            android.content.Context r5 = r5.AFInAppEventParameterName     // Catch: java.lang.ClassNotFoundException -> L88
            com.appsflyer.internal.AFe1xSDK$4 r6 = new com.appsflyer.internal.AFe1xSDK$4     // Catch: java.lang.ClassNotFoundException -> L88
            r6.<init>()     // Catch: java.lang.ClassNotFoundException -> L88
            r7 = 1
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L52 java.lang.IllegalAccessException -> L5f java.lang.NoSuchMethodException -> L6c java.lang.ClassNotFoundException -> L79
            java.lang.String r8 = "com.appsflyer.lvl.AppsFlyerLVL$resultListener"
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch: java.lang.reflect.InvocationTargetException -> L52 java.lang.IllegalAccessException -> L5f java.lang.NoSuchMethodException -> L6c java.lang.ClassNotFoundException -> L79
            java.lang.String r9 = "checkLicense"
            r10 = 3
            java.lang.Class[] r10 = new java.lang.Class[r10]     // Catch: java.lang.reflect.InvocationTargetException -> L52 java.lang.IllegalAccessException -> L5f java.lang.NoSuchMethodException -> L6c java.lang.ClassNotFoundException -> L79
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L52 java.lang.IllegalAccessException -> L5f java.lang.NoSuchMethodException -> L6c java.lang.ClassNotFoundException -> L79
            r10[r1] = r11     // Catch: java.lang.reflect.InvocationTargetException -> L52 java.lang.IllegalAccessException -> L5f java.lang.NoSuchMethodException -> L6c java.lang.ClassNotFoundException -> L79
            java.lang.Class<android.content.Context> r11 = android.content.Context.class
            r10[r7] = r11     // Catch: java.lang.reflect.InvocationTargetException -> L52 java.lang.IllegalAccessException -> L5f java.lang.NoSuchMethodException -> L6c java.lang.ClassNotFoundException -> L79
            r11 = 2
            r10[r11] = r8     // Catch: java.lang.reflect.InvocationTargetException -> L52 java.lang.IllegalAccessException -> L5f java.lang.NoSuchMethodException -> L6c java.lang.ClassNotFoundException -> L79
            java.lang.reflect.Method r0 = r0.getMethod(r9, r10)     // Catch: java.lang.reflect.InvocationTargetException -> L52 java.lang.IllegalAccessException -> L5f java.lang.NoSuchMethodException -> L6c java.lang.ClassNotFoundException -> L79
            com.appsflyer.internal.AFe1wSDK$3 r9 = new com.appsflyer.internal.AFe1wSDK$3     // Catch: java.lang.reflect.InvocationTargetException -> L52 java.lang.IllegalAccessException -> L5f java.lang.NoSuchMethodException -> L6c java.lang.ClassNotFoundException -> L79
            r9.<init>()     // Catch: java.lang.reflect.InvocationTargetException -> L52 java.lang.IllegalAccessException -> L5f java.lang.NoSuchMethodException -> L6c java.lang.ClassNotFoundException -> L79
            java.lang.ClassLoader r4 = r8.getClassLoader()     // Catch: java.lang.reflect.InvocationTargetException -> L52 java.lang.IllegalAccessException -> L5f java.lang.NoSuchMethodException -> L6c java.lang.ClassNotFoundException -> L79
            java.lang.Class[] r10 = new java.lang.Class[r7]     // Catch: java.lang.reflect.InvocationTargetException -> L52 java.lang.IllegalAccessException -> L5f java.lang.NoSuchMethodException -> L6c java.lang.ClassNotFoundException -> L79
            r10[r1] = r8     // Catch: java.lang.reflect.InvocationTargetException -> L52 java.lang.IllegalAccessException -> L5f java.lang.NoSuchMethodException -> L6c java.lang.ClassNotFoundException -> L79
            java.lang.Object r4 = java.lang.reflect.Proxy.newProxyInstance(r4, r10, r9)     // Catch: java.lang.reflect.InvocationTargetException -> L52 java.lang.IllegalAccessException -> L5f java.lang.NoSuchMethodException -> L6c java.lang.ClassNotFoundException -> L79
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L52 java.lang.IllegalAccessException -> L5f java.lang.NoSuchMethodException -> L6c java.lang.ClassNotFoundException -> L79
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r5, r4}     // Catch: java.lang.reflect.InvocationTargetException -> L52 java.lang.IllegalAccessException -> L5f java.lang.NoSuchMethodException -> L6c java.lang.ClassNotFoundException -> L79
            r3 = 0
            r0.invoke(r3, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L52 java.lang.IllegalAccessException -> L5f java.lang.NoSuchMethodException -> L6c java.lang.ClassNotFoundException -> L79
            goto L85
        L52:
            r0 = move-exception
            java.lang.Class r2 = r0.getClass()     // Catch: java.lang.ClassNotFoundException -> L88
            java.lang.String r2 = r2.getSimpleName()     // Catch: java.lang.ClassNotFoundException -> L88
            r6.valueOf(r2, r0)     // Catch: java.lang.ClassNotFoundException -> L88
            goto L85
        L5f:
            r0 = move-exception
            java.lang.Class r2 = r0.getClass()     // Catch: java.lang.ClassNotFoundException -> L88
            java.lang.String r2 = r2.getSimpleName()     // Catch: java.lang.ClassNotFoundException -> L88
            r6.valueOf(r2, r0)     // Catch: java.lang.ClassNotFoundException -> L88
            goto L85
        L6c:
            r0 = move-exception
            java.lang.Class r2 = r0.getClass()     // Catch: java.lang.ClassNotFoundException -> L88
            java.lang.String r2 = r2.getSimpleName()     // Catch: java.lang.ClassNotFoundException -> L88
            r6.valueOf(r2, r0)     // Catch: java.lang.ClassNotFoundException -> L88
            goto L85
        L79:
            r0 = move-exception
            java.lang.Class r2 = r0.getClass()     // Catch: java.lang.ClassNotFoundException -> L88
            java.lang.String r2 = r2.getSimpleName()     // Catch: java.lang.ClassNotFoundException -> L88
            r6.valueOf(r2, r0)     // Catch: java.lang.ClassNotFoundException -> L88
        L85:
            r12.afInfoLog = r7     // Catch: java.lang.ClassNotFoundException -> L88
            goto L8a
        L88:
            r12.afInfoLog = r1
        L8a:
            boolean r12 = r12.afInfoLog
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1xSDK.AFInAppEventParameterName():boolean");
    }

    private static boolean AFInAppEventParameterName(Context context) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) || AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            return true;
        }
        AFa1dSDK.valueOf();
        return !AFa1dSDK.AFKeystoreWrapper(context);
    }
}
