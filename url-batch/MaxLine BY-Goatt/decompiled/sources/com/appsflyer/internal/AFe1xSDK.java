package com.appsflyer.internal;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
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

    private boolean valueOf() {
        Map<String, Object> map = this.AFInAppEventParameterName;
        return (map == null || map.isEmpty()) ? false : true;
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
            r10 = this;
            java.lang.String r0 = "com.appsflyer.lvl.AppsFlyerLVL"
            java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L85
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.ClassNotFoundException -> L85
            com.appsflyer.internal.AFe1wSDK r3 = r10.afRDLog     // Catch: java.lang.ClassNotFoundException -> L85
            com.appsflyer.internal.AFb1bSDK r4 = r10.AFKeystoreWrapper     // Catch: java.lang.ClassNotFoundException -> L85
            android.content.Context r4 = r4.AFInAppEventParameterName     // Catch: java.lang.ClassNotFoundException -> L85
            com.appsflyer.internal.AFe1xSDK$4 r5 = new com.appsflyer.internal.AFe1xSDK$4     // Catch: java.lang.ClassNotFoundException -> L85
            r5.<init>()     // Catch: java.lang.ClassNotFoundException -> L85
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L4a java.lang.IllegalAccessException -> L4c java.lang.NoSuchMethodException -> L4e java.lang.ClassNotFoundException -> L50
            java.lang.String r6 = "com.appsflyer.lvl.AppsFlyerLVL$resultListener"
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L4a java.lang.IllegalAccessException -> L4c java.lang.NoSuchMethodException -> L4e java.lang.ClassNotFoundException -> L50
            java.lang.String r7 = "checkLicense"
            java.lang.Class r8 = java.lang.Long.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L4a java.lang.IllegalAccessException -> L4c java.lang.NoSuchMethodException -> L4e java.lang.ClassNotFoundException -> L50
            java.lang.Class<android.content.Context> r9 = android.content.Context.class
            java.lang.Class[] r8 = new java.lang.Class[]{r8, r9, r6}     // Catch: java.lang.reflect.InvocationTargetException -> L4a java.lang.IllegalAccessException -> L4c java.lang.NoSuchMethodException -> L4e java.lang.ClassNotFoundException -> L50
            java.lang.reflect.Method r0 = r0.getMethod(r7, r8)     // Catch: java.lang.reflect.InvocationTargetException -> L4a java.lang.IllegalAccessException -> L4c java.lang.NoSuchMethodException -> L4e java.lang.ClassNotFoundException -> L50
            com.appsflyer.internal.AFe1wSDK$3 r7 = new com.appsflyer.internal.AFe1wSDK$3     // Catch: java.lang.reflect.InvocationTargetException -> L4a java.lang.IllegalAccessException -> L4c java.lang.NoSuchMethodException -> L4e java.lang.ClassNotFoundException -> L50
            r7.<init>()     // Catch: java.lang.reflect.InvocationTargetException -> L4a java.lang.IllegalAccessException -> L4c java.lang.NoSuchMethodException -> L4e java.lang.ClassNotFoundException -> L50
            java.lang.ClassLoader r3 = r6.getClassLoader()     // Catch: java.lang.reflect.InvocationTargetException -> L4a java.lang.IllegalAccessException -> L4c java.lang.NoSuchMethodException -> L4e java.lang.ClassNotFoundException -> L50
            java.lang.Class[] r6 = new java.lang.Class[]{r6}     // Catch: java.lang.reflect.InvocationTargetException -> L4a java.lang.IllegalAccessException -> L4c java.lang.NoSuchMethodException -> L4e java.lang.ClassNotFoundException -> L50
            java.lang.Object r3 = java.lang.reflect.Proxy.newProxyInstance(r3, r6, r7)     // Catch: java.lang.reflect.InvocationTargetException -> L4a java.lang.IllegalAccessException -> L4c java.lang.NoSuchMethodException -> L4e java.lang.ClassNotFoundException -> L50
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L4a java.lang.IllegalAccessException -> L4c java.lang.NoSuchMethodException -> L4e java.lang.ClassNotFoundException -> L50
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r4, r3}     // Catch: java.lang.reflect.InvocationTargetException -> L4a java.lang.IllegalAccessException -> L4c java.lang.NoSuchMethodException -> L4e java.lang.ClassNotFoundException -> L50
            r2 = 0
            r0.invoke(r2, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L4a java.lang.IllegalAccessException -> L4c java.lang.NoSuchMethodException -> L4e java.lang.ClassNotFoundException -> L50
            goto L81
        L4a:
            r0 = move-exception
            goto L52
        L4c:
            r0 = move-exception
            goto L5e
        L4e:
            r0 = move-exception
            goto L6a
        L50:
            r0 = move-exception
            goto L76
        L52:
            java.lang.Class r1 = r0.getClass()     // Catch: java.lang.ClassNotFoundException -> L85
            java.lang.String r1 = r1.getSimpleName()     // Catch: java.lang.ClassNotFoundException -> L85
            r5.valueOf(r1, r0)     // Catch: java.lang.ClassNotFoundException -> L85
            goto L81
        L5e:
            java.lang.Class r1 = r0.getClass()     // Catch: java.lang.ClassNotFoundException -> L85
            java.lang.String r1 = r1.getSimpleName()     // Catch: java.lang.ClassNotFoundException -> L85
            r5.valueOf(r1, r0)     // Catch: java.lang.ClassNotFoundException -> L85
            goto L81
        L6a:
            java.lang.Class r1 = r0.getClass()     // Catch: java.lang.ClassNotFoundException -> L85
            java.lang.String r1 = r1.getSimpleName()     // Catch: java.lang.ClassNotFoundException -> L85
            r5.valueOf(r1, r0)     // Catch: java.lang.ClassNotFoundException -> L85
            goto L81
        L76:
            java.lang.Class r1 = r0.getClass()     // Catch: java.lang.ClassNotFoundException -> L85
            java.lang.String r1 = r1.getSimpleName()     // Catch: java.lang.ClassNotFoundException -> L85
            r5.valueOf(r1, r0)     // Catch: java.lang.ClassNotFoundException -> L85
        L81:
            r0 = 1
            r10.afInfoLog = r0     // Catch: java.lang.ClassNotFoundException -> L85
            goto L88
        L85:
            r0 = 0
            r10.afInfoLog = r0
        L88:
            boolean r10 = r10.afInfoLog
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1xSDK.AFInAppEventParameterName():boolean");
    }

    public final String AFInAppEventType(AFb1fSDK aFb1fSDK) {
        String str;
        boolean z = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI, false);
        String valueOf = aFb1fSDK.valueOf("imeiCached", (String) null);
        if (z && AFb1vSDK.AFInAppEventParameterName(this.valueOf)) {
            Context context = this.AFKeystoreWrapper.AFInAppEventParameterName;
            if (context != null && AFInAppEventParameterName(context)) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    str = (String) telephonyManager.getClass().getMethod("getDeviceId", null).invoke(telephonyManager, null);
                } catch (InvocationTargetException e) {
                    if (valueOf != null) {
                        AFLogger.afDebugLog("use cached IMEI: ".concat(valueOf));
                    } else {
                        valueOf = null;
                    }
                    StringBuilder sb = new StringBuilder("WARNING: Can't collect IMEI because of missing permissions: ");
                    sb.append(e.getMessage());
                    AFLogger.afErrorLog(sb.toString(), e);
                } catch (Exception e2) {
                    if (valueOf != null) {
                        AFLogger.afDebugLog("use cached IMEI: ".concat(valueOf));
                    } else {
                        valueOf = null;
                    }
                    StringBuilder sb2 = new StringBuilder("WARNING: Can't collect IMEI: other reason: ");
                    sb2.append(e2.getMessage());
                    AFLogger.afErrorLog(sb2.toString(), e2);
                }
                if (str == null) {
                    if (valueOf != null) {
                        AFLogger.afDebugLog("use cached IMEI: ".concat(valueOf));
                    } else {
                        valueOf = null;
                    }
                    str = valueOf;
                }
            }
            str = null;
        } else {
            if (this.valueOf != null) {
                str = this.valueOf;
            }
            str = null;
        }
        if (AFb1vSDK.AFInAppEventParameterName(str)) {
            AFLogger.afInfoLog("IMEI was not collected.");
            return null;
        }
        aFb1fSDK.values("imeiCached", str);
        return str;
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
            hashMap2.put("error", "operation timed out.");
            hashMap.put("lvl", this.AFInAppEventParameterName);
        }
        return hashMap;
    }

    public final boolean values() {
        return this.values;
    }

    private static boolean AFInAppEventParameterName(Context context) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) || AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            return true;
        }
        AFa1dSDK.valueOf();
        return !AFa1dSDK.AFKeystoreWrapper(context);
    }

    public final boolean AFInAppEventType() {
        return this.afInfoLog && !valueOf();
    }
}
