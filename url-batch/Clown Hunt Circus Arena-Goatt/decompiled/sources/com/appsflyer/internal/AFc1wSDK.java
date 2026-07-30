package com.appsflyer.internal;

import android.os.Build;
import android.view.View;
import com.appsflyer.AFLogger;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.internal.AFc1uSDK;
import com.google.common.net.HttpHeaders;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFc1wSDK implements AFc1vSDK {
    private static char AFLogger$LogLevel = 18427;
    private static int AFVersionDeclaration = 1;
    private static char afErrorLog = 3476;
    private static int afErrorLogForExcManagerOnly = 0;
    private static char afWarnLog = 13891;
    private static char getLevel = 44979;
    private AFc1zSDK AFInAppEventParameterName;
    private final Lazy AFInAppEventType;
    private final Lazy AFKeystoreWrapper;
    private final Lazy AFLogger;
    private final String afDebugLog;
    private final Lazy afInfoLog;
    private final Lazy afRDLog;
    private final Lazy valueOf;
    private final Lazy values;

    public AFc1wSDK(AFc1zSDK aFc1zSDK) {
        Intrinsics.checkNotNullParameter(aFc1zSDK, "");
        this.AFInAppEventParameterName = aFc1zSDK;
        this.valueOf = LazyKt.lazy(new Function0<AFc1tSDK>() { // from class: com.appsflyer.internal.AFc1wSDK.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: AFKeystoreWrapper, reason: merged with bridge method [inline-methods] */
            public final AFc1tSDK invoke() {
                AFc1tSDK afDebugLog = AFc1wSDK.AFKeystoreWrapper(AFc1wSDK.this).afDebugLog();
                Intrinsics.checkNotNullExpressionValue(afDebugLog, "");
                return afDebugLog;
            }
        });
        this.values = LazyKt.lazy(new Function0<AFb1cSDK>() { // from class: com.appsflyer.internal.AFc1wSDK.4
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: valueOf, reason: merged with bridge method [inline-methods] */
            public final AFb1cSDK invoke() {
                AFb1cSDK AFInAppEventParameterName = AFc1wSDK.AFKeystoreWrapper(AFc1wSDK.this).AFInAppEventParameterName();
                Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName, "");
                return AFInAppEventParameterName;
            }
        });
        this.AFKeystoreWrapper = LazyKt.lazy(new Function0<AFb1fSDK>() { // from class: com.appsflyer.internal.AFc1wSDK.3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: valueOf, reason: merged with bridge method [inline-methods] */
            public final AFb1fSDK invoke() {
                AFb1fSDK AFKeystoreWrapper = AFc1wSDK.AFKeystoreWrapper(AFc1wSDK.this).AFKeystoreWrapper();
                Intrinsics.checkNotNullExpressionValue(AFKeystoreWrapper, "");
                return AFKeystoreWrapper;
            }
        });
        this.AFInAppEventType = LazyKt.lazy(new Function0<AFe1xSDK>() { // from class: com.appsflyer.internal.AFc1wSDK.10
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: AFInAppEventParameterName, reason: merged with bridge method [inline-methods] */
            public final AFe1xSDK invoke() {
                AFe1xSDK AFVersionDeclaration2 = AFc1wSDK.AFKeystoreWrapper(AFc1wSDK.this).AFVersionDeclaration();
                Intrinsics.checkNotNullExpressionValue(AFVersionDeclaration2, "");
                return AFVersionDeclaration2;
            }
        });
        this.afRDLog = LazyKt.lazy(new Function0<ExecutorService>() { // from class: com.appsflyer.internal.AFc1wSDK.5
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: valueOf, reason: merged with bridge method [inline-methods] */
            public final ExecutorService invoke() {
                ExecutorService valueOf = AFc1wSDK.AFKeystoreWrapper(AFc1wSDK.this).valueOf();
                Intrinsics.checkNotNullExpressionValue(valueOf, "");
                return valueOf;
            }
        });
        this.afDebugLog = "6.12.1";
        this.AFLogger = LazyKt.lazy(new Function0<AFa1cSDK>() { // from class: com.appsflyer.internal.AFc1wSDK.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
            public final AFa1cSDK invoke() {
                AFb1bSDK onAppOpenAttributionNative = AFc1wSDK.AFKeystoreWrapper(AFc1wSDK.this).onAppOpenAttributionNative();
                Intrinsics.checkNotNullExpressionValue(onAppOpenAttributionNative, "");
                return new AFa1cSDK(onAppOpenAttributionNative);
            }
        });
        this.afInfoLog = LazyKt.lazy(new Function0<CreateOneLinkHttpTask>() { // from class: com.appsflyer.internal.AFc1wSDK.6
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: values, reason: merged with bridge method [inline-methods] */
            public final CreateOneLinkHttpTask invoke() {
                return new CreateOneLinkHttpTask(AFc1wSDK.this.valueOf());
            }
        });
    }

    public static final /* synthetic */ AFc1zSDK AFKeystoreWrapper(AFc1wSDK aFc1wSDK) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 79;
        int i3 = i2 % 128;
        afErrorLogForExcManagerOnly = i3;
        int i4 = i2 % 2;
        AFc1zSDK aFc1zSDK = aFc1wSDK.AFInAppEventParameterName;
        if (i4 != 0) {
            int i5 = 29 / 0;
        }
        int i6 = i3 + 113;
        AFVersionDeclaration = i6 % 128;
        int i7 = i6 % 2;
        return aFc1zSDK;
    }

    private final AFc1tSDK AFInAppEventParameterName() {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 93;
        afErrorLogForExcManagerOnly = i2 % 128;
        int i3 = i2 % 2;
        AFc1tSDK aFc1tSDK = (AFc1tSDK) this.valueOf.getValue();
        int i4 = AFVersionDeclaration + 91;
        afErrorLogForExcManagerOnly = i4 % 128;
        int i5 = i4 % 2;
        return aFc1tSDK;
    }

    private final AFb1cSDK afErrorLog() {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 103;
        afErrorLogForExcManagerOnly = i2 % 128;
        int i3 = i2 % 2;
        AFb1cSDK aFb1cSDK = (AFb1cSDK) this.values.getValue();
        int i4 = AFVersionDeclaration + 91;
        afErrorLogForExcManagerOnly = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 2 / 0;
        }
        return aFb1cSDK;
    }

    private final AFb1fSDK AFLogger() {
        int i = 2 % 2;
        int i2 = afErrorLogForExcManagerOnly + 79;
        AFVersionDeclaration = i2 % 128;
        int i3 = i2 % 2;
        AFb1fSDK aFb1fSDK = (AFb1fSDK) this.AFKeystoreWrapper.getValue();
        if (i3 == 0) {
            int i4 = 76 / 0;
        }
        return aFb1fSDK;
    }

    private final AFe1xSDK afInfoLog() {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 73;
        afErrorLogForExcManagerOnly = i2 % 128;
        int i3 = i2 % 2;
        AFe1xSDK aFe1xSDK = (AFe1xSDK) this.AFInAppEventType.getValue();
        if (i3 != 0) {
            int i4 = 96 / 0;
        }
        return aFe1xSDK;
    }

    private final ExecutorService afRDLog() {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 39;
        afErrorLogForExcManagerOnly = i2 % 128;
        int i3 = i2 % 2;
        ExecutorService executorService = (ExecutorService) this.afRDLog.getValue();
        if (i3 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i4 = afErrorLogForExcManagerOnly + 101;
        AFVersionDeclaration = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 28 / 0;
        }
        return executorService;
    }

    private String afDebugLog() {
        int i = 2 % 2;
        int i2 = afErrorLogForExcManagerOnly + 17;
        int i3 = i2 % 128;
        AFVersionDeclaration = i3;
        int i4 = i2 % 2;
        String str = this.afDebugLog;
        int i5 = i3 + 65;
        afErrorLogForExcManagerOnly = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final AFc1ySDK valueOf() {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 103;
        afErrorLogForExcManagerOnly = i2 % 128;
        int i3 = i2 % 2;
        AFc1ySDK aFc1ySDK = (AFc1ySDK) this.AFLogger.getValue();
        if (i3 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i4 = afErrorLogForExcManagerOnly + 73;
        AFVersionDeclaration = i4 % 128;
        int i5 = i4 % 2;
        return aFc1ySDK;
    }

    private AFc1uSDK AFLogger$LogLevel() {
        int i = 2 % 2;
        int i2 = afErrorLogForExcManagerOnly + 49;
        AFVersionDeclaration = i2 % 128;
        int i3 = i2 % 2;
        AFc1uSDK aFc1uSDK = (AFc1uSDK) this.afInfoLog.getValue();
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        return aFc1uSDK;
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    public final void values(final Throwable th, final String str) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 7;
        afErrorLogForExcManagerOnly = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(th, "");
            Intrinsics.checkNotNullParameter(str, "");
            afRDLog().execute(new Runnable() { // from class: com.appsflyer.internal.AFc1wSDK$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    AFc1wSDK.valueOf(AFc1wSDK.this, th, str);
                }
            });
        } else {
            Intrinsics.checkNotNullParameter(th, "");
            Intrinsics.checkNotNullParameter(str, "");
            afRDLog().execute(new Runnable() { // from class: com.appsflyer.internal.AFc1wSDK$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    AFc1wSDK.valueOf(AFc1wSDK.this, th, str);
                }
            });
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void valueOf(AFc1wSDK aFc1wSDK, Throwable th, String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(aFc1wSDK, "");
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        AFe1pSDK afErrorLogForExcManagerOnly2 = aFc1wSDK.afErrorLogForExcManagerOnly();
        boolean z = false;
        if (afErrorLogForExcManagerOnly2 != null) {
            int i2 = afErrorLogForExcManagerOnly + 97;
            AFVersionDeclaration = i2 % 128;
            int i3 = i2 % 2;
            if (aFc1wSDK.valueOf(afErrorLogForExcManagerOnly2)) {
                int i4 = AFVersionDeclaration + 29;
                afErrorLogForExcManagerOnly = i4 % 128;
                if (i4 % 2 == 0) {
                    z = true;
                }
            } else {
                int i5 = afErrorLogForExcManagerOnly + 101;
                AFVersionDeclaration = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        if (!(!z)) {
            aFc1wSDK.valueOf().AFKeystoreWrapper(th, str);
        }
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    public final void AFInAppEventType() {
        int i = 2 % 2;
        int i2 = afErrorLogForExcManagerOnly + 67;
        AFVersionDeclaration = i2 % 128;
        int i3 = i2 % 2;
        ExecutorService afRDLog = afRDLog();
        if (i3 != 0) {
            afRDLog.execute(new Runnable() { // from class: com.appsflyer.internal.AFc1wSDK$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AFc1wSDK.valueOf(AFc1wSDK.this);
                }
            });
        } else {
            afRDLog.execute(new Runnable() { // from class: com.appsflyer.internal.AFc1wSDK$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AFc1wSDK.valueOf(AFc1wSDK.this);
                }
            });
            int i4 = 37 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void valueOf(AFc1wSDK aFc1wSDK) {
        int i = 2 % 2;
        int i2 = afErrorLogForExcManagerOnly + 57;
        AFVersionDeclaration = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(aFc1wSDK, "");
        aFc1wSDK.getLevel();
        int i4 = AFVersionDeclaration + 55;
        afErrorLogForExcManagerOnly = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 55 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    public final void AFKeystoreWrapper() {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 5;
        afErrorLogForExcManagerOnly = i2 % 128;
        int i3 = i2 % 2;
        afRDLog().execute(new Runnable() { // from class: com.appsflyer.internal.AFc1wSDK$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                AFc1wSDK.AFInAppEventParameterName(AFc1wSDK.this);
            }
        });
        int i4 = AFVersionDeclaration + 29;
        afErrorLogForExcManagerOnly = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFInAppEventParameterName(AFc1wSDK aFc1wSDK) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 71;
        afErrorLogForExcManagerOnly = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(aFc1wSDK, "");
        aFc1wSDK.afWarnLog();
        int i4 = afErrorLogForExcManagerOnly + 89;
        AFVersionDeclaration = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    public final void values() {
        int i = 2 % 2;
        int i2 = afErrorLogForExcManagerOnly + 1;
        AFVersionDeclaration = i2 % 128;
        int i3 = i2 % 2;
        afRDLog().execute(new Runnable() { // from class: com.appsflyer.internal.AFc1wSDK$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                AFc1wSDK.values(AFc1wSDK.this);
            }
        });
        int i4 = afErrorLogForExcManagerOnly + 31;
        AFVersionDeclaration = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void values(AFc1wSDK aFc1wSDK) {
        int i = 2 % 2;
        int i2 = afErrorLogForExcManagerOnly + 3;
        AFVersionDeclaration = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(aFc1wSDK, "");
        aFc1wSDK.AFVersionDeclaration();
        int i4 = afErrorLogForExcManagerOnly + 15;
        AFVersionDeclaration = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private final synchronized void getLevel() {
        long j;
        String str;
        int i = 2 % 2;
        AFe1pSDK afErrorLogForExcManagerOnly2 = afErrorLogForExcManagerOnly();
        if (afErrorLogForExcManagerOnly2 != null) {
            j = afErrorLogForExcManagerOnly2.valueOf;
        } else {
            int i2 = 2 % 2;
            j = -1;
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        try {
            AFe1pSDK afErrorLogForExcManagerOnly3 = afErrorLogForExcManagerOnly();
            if (afErrorLogForExcManagerOnly3 != null) {
                str = afErrorLogForExcManagerOnly3.AFInAppEventType;
                int i3 = 2 % 2;
            } else {
                int i4 = afErrorLogForExcManagerOnly + 95;
                AFVersionDeclaration = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
                str = null;
            }
            if (str == null) {
                str = "";
            }
        } catch (NullPointerException unused) {
            str = "NOT_DETECTED";
        }
        if (j >= currentTimeMillis) {
            if (AFc1uSDK.AFa1wSDK.valueOf(str) != -1) {
                int i7 = AFVersionDeclaration + 13;
                afErrorLogForExcManagerOnly = i7 % 128;
                int i8 = i7 % 2;
                if (AFc1uSDK.AFa1wSDK.valueOf(str) <= AFc1uSDK.AFa1wSDK.valueOf(afDebugLog())) {
                    valueOf().AFInAppEventParameterName(afDebugLog());
                    return;
                }
            }
            AFLogger().AFInAppEventType("af_send_exc_to_server_window");
            valueOf().AFKeystoreWrapper();
            return;
        }
        int i9 = AFVersionDeclaration + 71;
        afErrorLogForExcManagerOnly = i9 % 128;
        if (i9 % 2 == 0) {
            Intrinsics.checkNotNullParameter("TTL is already passed", "");
            AFLogger.afRDLog("[Exception Manager]: ".concat(String.valueOf("TTL is already passed")));
            AFLogger().AFInAppEventType("af_send_exc_to_server_window");
            valueOf().AFKeystoreWrapper();
            return;
        }
        Intrinsics.checkNotNullParameter("TTL is already passed", "");
        AFLogger.afRDLog("[Exception Manager]: ".concat(String.valueOf("TTL is already passed")));
        AFLogger().AFInAppEventType("af_send_exc_to_server_window");
        valueOf().AFKeystoreWrapper();
        int i10 = 83 / 0;
    }

    private final void afWarnLog() {
        String str;
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 35;
        afErrorLogForExcManagerOnly = i2 % 128;
        if (i2 % 2 != 0) {
            afErrorLogForExcManagerOnly();
            throw null;
        }
        AFe1pSDK afErrorLogForExcManagerOnly2 = afErrorLogForExcManagerOnly();
        if (afErrorLogForExcManagerOnly2 != null) {
            if (!AFInAppEventType(afErrorLogForExcManagerOnly2)) {
                Intrinsics.checkNotNullParameter("skipping", "");
                AFLogger.afRDLog("[Exception Manager]: ".concat(String.valueOf("skipping")));
                int i3 = afErrorLogForExcManagerOnly + 115;
                AFVersionDeclaration = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            int i5 = AFVersionDeclaration + 7;
            afErrorLogForExcManagerOnly = i5 % 128;
            if (i5 % 2 != 0) {
                str = afInfoLog().AFInAppEventType;
                int i6 = 46 / 0;
                if (str == null) {
                    return;
                }
            } else {
                str = afInfoLog().AFInAppEventType;
                if (str == null) {
                    return;
                }
            }
            String jSONObject = new JSONObject(AFInAppEventType(AFInAppEventParameterName(afErrorLogForExcManagerOnly2), valueOf().values())).toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "");
            Intrinsics.checkNotNullExpressionValue(str, "");
            AFInAppEventType(jSONObject, str);
        }
    }

    private final synchronized void AFVersionDeclaration() {
        int i = 2 % 2;
        AFe1pSDK afErrorLogForExcManagerOnly2 = afErrorLogForExcManagerOnly();
        if (afErrorLogForExcManagerOnly2 != null) {
            if (afErrorLogForExcManagerOnly2.AFKeystoreWrapper == -1) {
                int i2 = afErrorLogForExcManagerOnly + 41;
                AFVersionDeclaration = i2 % 128;
                int i3 = i2 % 2;
                AFLogger().AFInAppEventType("af_send_exc_to_server_window");
                return;
            }
            if (AFLogger().values("af_send_exc_to_server_window", -1L) == -1) {
                int i4 = afErrorLogForExcManagerOnly2.values;
                long currentTimeMillis = System.currentTimeMillis() + TimeUnit.DAYS.toMillis(afErrorLogForExcManagerOnly2.AFKeystoreWrapper);
                AFb1fSDK AFLogger = AFLogger();
                AFLogger.AFInAppEventType("af_send_exc_to_server_window", currentTimeMillis);
                AFLogger.valueOf("af_send_exc_min", i4);
                int i5 = afErrorLogForExcManagerOnly + 61;
                AFVersionDeclaration = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 4 % 2;
                } else {
                    int i7 = 2 % 2;
                }
            }
        }
    }

    private final Map<String, String> AFInAppEventParameterName(AFe1pSDK aFe1pSDK) {
        int i = 2 % 2;
        Object[] objArr = new Object[1];
        AFInAppEventParameterName("섇\uf6fd굱꿜盧骑", 5 - View.MeasureSpec.getMode(0), objArr);
        AFb1cSDK afErrorLog2 = afErrorLog();
        Map<String, String> mapOf = MapsKt.mapOf(TuplesKt.to(((String) objArr[0]).intern(), Build.BRAND), TuplesKt.to("model", Build.MODEL), TuplesKt.to("app_id", afErrorLog().values.AFInAppEventParameterName.getPackageName()), TuplesKt.to("p_ex", new AFb1xSDK().values()), TuplesKt.to("api", String.valueOf(Build.VERSION.SDK_INT)), TuplesKt.to("sdk", afDebugLog()), TuplesKt.to("uid", AFa1aSDK.AFInAppEventParameterName(afErrorLog2.values, afErrorLog2.AFInAppEventType)), TuplesKt.to("exc_config", aFe1pSDK.values()));
        int i2 = afErrorLogForExcManagerOnly + 115;
        AFVersionDeclaration = i2 % 128;
        int i3 = i2 % 2;
        return mapOf;
    }

    private static Map<String, Object> AFInAppEventType(Map<String, ? extends Object> map, List<AFb1aSDK> list) {
        Map<String, Object> mapOf;
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 19;
        afErrorLogForExcManagerOnly = i2 % 128;
        if (i2 % 2 != 0) {
            Pair[] pairArr = new Pair[5];
            pairArr[1] = TuplesKt.to("deviceInfo", map);
            pairArr[0] = TuplesKt.to("excs", AFc1uSDK.AFa1wSDK.valueOf(list));
            mapOf = MapsKt.mapOf(pairArr);
        } else {
            mapOf = MapsKt.mapOf(TuplesKt.to("deviceInfo", map), TuplesKt.to("excs", AFc1uSDK.AFa1wSDK.valueOf(list)));
        }
        int i3 = AFVersionDeclaration + 21;
        afErrorLogForExcManagerOnly = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 74 / 0;
        }
        return mapOf;
    }

    private final boolean AFInAppEventType(AFe1pSDK aFe1pSDK) {
        int i = 2 % 2;
        long currentTimeMillis = System.currentTimeMillis();
        long values = AFLogger().values("af_send_exc_to_server_window", -1L);
        if (aFe1pSDK.valueOf < currentTimeMillis / 1000) {
            return false;
        }
        if (values != -1) {
            int i2 = AFVersionDeclaration + 53;
            afErrorLogForExcManagerOnly = i2 % 128;
            int i3 = i2 % 2;
            if (values >= currentTimeMillis) {
                int AFInAppEventType = AFLogger().AFInAppEventType("af_send_exc_min", -1);
                if (AFInAppEventType != -1) {
                    int i4 = AFVersionDeclaration + 121;
                    afErrorLogForExcManagerOnly = i4 % 128;
                    int i5 = i4 % 2;
                    if (valueOf().AFInAppEventType() >= AFInAppEventType) {
                        String str = aFe1pSDK.AFInAppEventType;
                        Intrinsics.checkNotNullExpressionValue(str, "");
                        if (AFc1uSDK.AFa1wSDK.valueOf(str) == AFc1uSDK.AFa1wSDK.valueOf(afDebugLog())) {
                            int i6 = afErrorLogForExcManagerOnly + 35;
                            AFVersionDeclaration = i6 % 128;
                            int i7 = i6 % 2;
                            return true;
                        }
                    }
                }
                return false;
            }
        }
        int i8 = afErrorLogForExcManagerOnly + 59;
        AFVersionDeclaration = i8 % 128;
        if (i8 % 2 != 0) {
            return false;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004c, code lost:
    
        if (r10 >= r8) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004f, code lost:
    
        r15 = r15.AFInAppEventType;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0062, code lost:
    
        if (com.appsflyer.internal.AFc1uSDK.AFa1wSDK.valueOf(r15) != com.appsflyer.internal.AFc1uSDK.AFa1wSDK.valueOf(afDebugLog())) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0064, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
    
        r3 = r3 + 101;
        com.appsflyer.internal.AFc1wSDK.afErrorLogForExcManagerOnly = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        if (r15.valueOf >= (r8 / 1000)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0026, code lost:
    
        if (r15.valueOf >= (1000 ^ r8)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003d, code lost:
    
        r1 = com.appsflyer.internal.AFc1wSDK.afErrorLogForExcManagerOnly + 103;
        r3 = r1 % 128;
        com.appsflyer.internal.AFc1wSDK.AFVersionDeclaration = r3;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0048, code lost:
    
        if (r10 == (-1)) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean valueOf(AFe1pSDK aFe1pSDK) {
        long currentTimeMillis;
        long values;
        int i = 2 % 2;
        int i2 = afErrorLogForExcManagerOnly + 79;
        AFVersionDeclaration = i2 % 128;
        if (i2 % 2 == 0) {
            currentTimeMillis = System.currentTimeMillis();
            values = AFLogger().values("af_send_exc_to_server_window", -1L);
        } else {
            currentTimeMillis = System.currentTimeMillis();
            values = AFLogger().values("af_send_exc_to_server_window", -1L);
        }
        return false;
    }

    private final AFe1pSDK afErrorLogForExcManagerOnly() {
        AFe1mSDK aFe1mSDK;
        int i = 2 % 2;
        int i2 = afErrorLogForExcManagerOnly + 95;
        AFVersionDeclaration = i2 % 128;
        if (i2 % 2 != 0) {
            AFf1vSDK valueOf = AFInAppEventParameterName().valueOf();
            if (valueOf == null || (aFe1mSDK = valueOf.AFInAppEventType) == null) {
                return null;
            }
            int i3 = AFVersionDeclaration + 59;
            afErrorLogForExcManagerOnly = i3 % 128;
            int i4 = i3 % 2;
            AFe1pSDK aFe1pSDK = aFe1mSDK.values;
            if (i4 != 0) {
                int i5 = 83 / 0;
            }
            return aFe1pSDK;
        }
        AFInAppEventParameterName().valueOf();
        throw null;
    }

    private final void AFInAppEventType(String str, String str2) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 37;
        afErrorLogForExcManagerOnly = i2 % 128;
        int i3 = i2 % 2;
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        AFLogger$LogLevel().valueOf(bytes, MapsKt.mapOf(TuplesKt.to(HttpHeaders.AUTHORIZATION, AFb1zSDK.AFKeystoreWrapper(str, str2))), 2000);
        int i4 = afErrorLogForExcManagerOnly + 85;
        AFVersionDeclaration = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void AFInAppEventParameterName(String str, int i, Object[] objArr) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (AFg1kSDK.AFKeystoreWrapper) {
            char[] cArr3 = new char[cArr2.length];
            AFg1kSDK.AFInAppEventType = 0;
            char[] cArr4 = new char[2];
            while (AFg1kSDK.AFInAppEventType < cArr2.length) {
                cArr4[0] = cArr2[AFg1kSDK.AFInAppEventType];
                cArr4[1] = cArr2[AFg1kSDK.AFInAppEventType + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    char c = cArr4[1];
                    char c2 = cArr4[0];
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + getLevel)) ^ ((c2 >>> 5) + afWarnLog)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + AFLogger$LogLevel) ^ ((c3 + i2) ^ ((c3 << 4) + afErrorLog))));
                    i2 -= 40503;
                }
                cArr3[AFg1kSDK.AFInAppEventType] = cArr4[0];
                cArr3[AFg1kSDK.AFInAppEventType + 1] = cArr4[1];
                AFg1kSDK.AFInAppEventType += 2;
            }
            str2 = new String(cArr3, 0, i);
        }
        objArr[0] = str2;
    }
}
