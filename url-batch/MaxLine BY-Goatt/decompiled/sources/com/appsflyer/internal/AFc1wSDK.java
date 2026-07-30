package com.appsflyer.internal;

import android.os.Build;
import android.view.View;
import com.appsflyer.AFLogger;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.internal.AFc1uSDK;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.ServerProtocol;
import com.google.firebase.encoders.json.BuildConfig;
import defpackage.li1;
import defpackage.mi1;
import defpackage.o81;
import defpackage.s50;
import defpackage.y91;
import defpackage.ya1;
import defpackage.yt;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFc1wSDK implements AFc1vSDK {
    private static char AFLogger$LogLevel = 18427;
    private static int AFVersionDeclaration = 1;
    private static char afErrorLog = 3476;
    private static int afErrorLogForExcManagerOnly = 0;
    private static char afWarnLog = 13891;
    private static char getLevel = 44979;
    private AFc1zSDK AFInAppEventParameterName;
    private final y91 AFInAppEventType;
    private final y91 AFKeystoreWrapper;
    private final y91 AFLogger;
    private final String afDebugLog;
    private final y91 afInfoLog;
    private final y91 afRDLog;
    private final y91 valueOf;
    private final y91 values;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    /* renamed from: com.appsflyer.internal.AFc1wSDK$1, reason: invalid class name */
    public static final class AnonymousClass1 extends o81 implements Function0<AFc1tSDK> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: AFKeystoreWrapper, reason: merged with bridge method [inline-methods] */
        public final AFc1tSDK invoke() {
            AFc1tSDK afDebugLog = AFc1wSDK.AFKeystoreWrapper(AFc1wSDK.this).afDebugLog();
            afDebugLog.getClass();
            return afDebugLog;
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    /* renamed from: com.appsflyer.internal.AFc1wSDK$10, reason: invalid class name */
    public static final class AnonymousClass10 extends o81 implements Function0<AFe1xSDK> {
        public AnonymousClass10() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: AFInAppEventParameterName, reason: merged with bridge method [inline-methods] */
        public final AFe1xSDK invoke() {
            AFe1xSDK AFVersionDeclaration = AFc1wSDK.AFKeystoreWrapper(AFc1wSDK.this).AFVersionDeclaration();
            AFVersionDeclaration.getClass();
            return AFVersionDeclaration;
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    /* renamed from: com.appsflyer.internal.AFc1wSDK$2, reason: invalid class name */
    public static final class AnonymousClass2 extends o81 implements Function0<AFa1cSDK> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
        public final AFa1cSDK invoke() {
            AFb1bSDK onAppOpenAttributionNative = AFc1wSDK.AFKeystoreWrapper(AFc1wSDK.this).onAppOpenAttributionNative();
            onAppOpenAttributionNative.getClass();
            return new AFa1cSDK(onAppOpenAttributionNative);
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    /* renamed from: com.appsflyer.internal.AFc1wSDK$3, reason: invalid class name */
    public static final class AnonymousClass3 extends o81 implements Function0<AFb1fSDK> {
        public AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: valueOf, reason: merged with bridge method [inline-methods] */
        public final AFb1fSDK invoke() {
            AFb1fSDK AFKeystoreWrapper = AFc1wSDK.AFKeystoreWrapper(AFc1wSDK.this).AFKeystoreWrapper();
            AFKeystoreWrapper.getClass();
            return AFKeystoreWrapper;
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    /* renamed from: com.appsflyer.internal.AFc1wSDK$4, reason: invalid class name */
    public static final class AnonymousClass4 extends o81 implements Function0<AFb1cSDK> {
        public AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: valueOf, reason: merged with bridge method [inline-methods] */
        public final AFb1cSDK invoke() {
            AFb1cSDK AFInAppEventParameterName = AFc1wSDK.AFKeystoreWrapper(AFc1wSDK.this).AFInAppEventParameterName();
            AFInAppEventParameterName.getClass();
            return AFInAppEventParameterName;
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    /* renamed from: com.appsflyer.internal.AFc1wSDK$5, reason: invalid class name */
    public static final class AnonymousClass5 extends o81 implements Function0<ExecutorService> {
        public AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: valueOf, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            ExecutorService valueOf = AFc1wSDK.AFKeystoreWrapper(AFc1wSDK.this).valueOf();
            valueOf.getClass();
            return valueOf;
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    /* renamed from: com.appsflyer.internal.AFc1wSDK$6, reason: invalid class name */
    public static final class AnonymousClass6 extends o81 implements Function0<CreateOneLinkHttpTask> {
        public AnonymousClass6() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: values, reason: merged with bridge method [inline-methods] */
        public final CreateOneLinkHttpTask invoke() {
            return new CreateOneLinkHttpTask(AFc1wSDK.this.valueOf());
        }
    }

    public AFc1wSDK(AFc1zSDK aFc1zSDK) {
        aFc1zSDK.getClass();
        this.AFInAppEventParameterName = aFc1zSDK;
        this.valueOf = ya1.b(new AnonymousClass1());
        this.values = ya1.b(new AnonymousClass4());
        this.AFKeystoreWrapper = ya1.b(new AnonymousClass3());
        this.AFInAppEventType = ya1.b(new AnonymousClass10());
        this.afRDLog = ya1.b(new AnonymousClass5());
        this.afDebugLog = "6.12.1";
        this.AFLogger = ya1.b(new AnonymousClass2());
        this.afInfoLog = ya1.b(new AnonymousClass6());
    }

    private final Map<String, String> AFInAppEventParameterName(AFe1pSDK aFe1pSDK) {
        Object[] objArr = new Object[1];
        AFInAppEventParameterName("섇\uf6fd굱꿜盧骑", 5 - View.MeasureSpec.getMode(0), objArr);
        Pair pair = new Pair(((String) objArr[0]).intern(), Build.BRAND);
        Pair pair2 = new Pair(DeviceRequestsHelper.DEVICE_INFO_MODEL, Build.MODEL);
        Pair pair3 = new Pair("app_id", afErrorLog().values.AFInAppEventParameterName.getPackageName());
        Pair pair4 = new Pair("p_ex", new AFb1xSDK().values());
        Pair pair5 = new Pair("api", String.valueOf(Build.VERSION.SDK_INT));
        Pair pair6 = new Pair(ServerProtocol.DIALOG_PARAM_SDK_VERSION, afDebugLog());
        AFb1cSDK afErrorLog2 = afErrorLog();
        Map<String, String> f = mi1.f(pair, pair2, pair3, pair4, pair5, pair6, new Pair("uid", AFa1aSDK.AFInAppEventParameterName(afErrorLog2.values, afErrorLog2.AFInAppEventType)), new Pair("exc_config", aFe1pSDK.values()));
        AFVersionDeclaration = (afErrorLogForExcManagerOnly + 115) % 128;
        return f;
    }

    private final boolean AFInAppEventType(AFe1pSDK aFe1pSDK) {
        long currentTimeMillis = System.currentTimeMillis();
        long values = AFLogger().values("af_send_exc_to_server_window", -1L);
        if (aFe1pSDK.valueOf < currentTimeMillis / 1000) {
            return false;
        }
        if (values != -1) {
            afErrorLogForExcManagerOnly = (AFVersionDeclaration + 53) % 128;
            if (values >= currentTimeMillis) {
                int AFInAppEventType = AFLogger().AFInAppEventType("af_send_exc_min", -1);
                if (AFInAppEventType != -1) {
                    afErrorLogForExcManagerOnly = (AFVersionDeclaration + 121) % 128;
                    if (valueOf().AFInAppEventType() >= AFInAppEventType) {
                        String str = aFe1pSDK.AFInAppEventType;
                        str.getClass();
                        if (AFc1uSDK.AFa1wSDK.valueOf(str) == AFc1uSDK.AFa1wSDK.valueOf(afDebugLog())) {
                            AFVersionDeclaration = (afErrorLogForExcManagerOnly + 35) % 128;
                            return true;
                        }
                    }
                }
                return false;
            }
        }
        int i = afErrorLogForExcManagerOnly + 59;
        AFVersionDeclaration = i % 128;
        if (i % 2 != 0) {
            return false;
        }
        throw null;
    }

    private final AFb1fSDK AFLogger() {
        int i = afErrorLogForExcManagerOnly + 79;
        AFVersionDeclaration = i % 128;
        int i2 = i % 2;
        AFb1fSDK aFb1fSDK = (AFb1fSDK) this.AFKeystoreWrapper.getValue();
        if (i2 == 0) {
            int i3 = 76 / 0;
        }
        return aFb1fSDK;
    }

    private AFc1uSDK AFLogger$LogLevel() {
        int i = afErrorLogForExcManagerOnly + 49;
        AFVersionDeclaration = i % 128;
        int i2 = i % 2;
        AFc1uSDK aFc1uSDK = (AFc1uSDK) this.afInfoLog.getValue();
        if (i2 == 0) {
            int i3 = 30 / 0;
        }
        return aFc1uSDK;
    }

    private final synchronized void AFVersionDeclaration() {
        AFe1pSDK afErrorLogForExcManagerOnly2 = afErrorLogForExcManagerOnly();
        if (afErrorLogForExcManagerOnly2 != null) {
            if (afErrorLogForExcManagerOnly2.AFKeystoreWrapper == -1) {
                AFVersionDeclaration = (afErrorLogForExcManagerOnly + 41) % 128;
                AFLogger().AFInAppEventType("af_send_exc_to_server_window");
                return;
            }
            if (AFLogger().values("af_send_exc_to_server_window", -1L) == -1) {
                int i = afErrorLogForExcManagerOnly2.values;
                long currentTimeMillis = System.currentTimeMillis() + TimeUnit.DAYS.toMillis(afErrorLogForExcManagerOnly2.AFKeystoreWrapper);
                AFb1fSDK AFLogger = AFLogger();
                AFLogger.AFInAppEventType("af_send_exc_to_server_window", currentTimeMillis);
                AFLogger.valueOf("af_send_exc_min", i);
                AFVersionDeclaration = (afErrorLogForExcManagerOnly + 61) % 128;
            }
        }
    }

    private String afDebugLog() {
        int i = (afErrorLogForExcManagerOnly + 17) % 128;
        AFVersionDeclaration = i;
        String str = this.afDebugLog;
        afErrorLogForExcManagerOnly = (i + 65) % 128;
        return str;
    }

    private final AFb1cSDK afErrorLog() {
        afErrorLogForExcManagerOnly = (AFVersionDeclaration + 103) % 128;
        AFb1cSDK aFb1cSDK = (AFb1cSDK) this.values.getValue();
        int i = AFVersionDeclaration + 91;
        afErrorLogForExcManagerOnly = i % 128;
        if (i % 2 != 0) {
            int i2 = 2 / 0;
        }
        return aFb1cSDK;
    }

    private final AFe1pSDK afErrorLogForExcManagerOnly() {
        AFe1mSDK aFe1mSDK;
        int i = afErrorLogForExcManagerOnly + 95;
        AFVersionDeclaration = i % 128;
        if (i % 2 == 0) {
            AFInAppEventParameterName().valueOf();
            throw null;
        }
        AFf1vSDK valueOf = AFInAppEventParameterName().valueOf();
        if (valueOf == null || (aFe1mSDK = valueOf.AFInAppEventType) == null) {
            return null;
        }
        int i2 = AFVersionDeclaration + 59;
        afErrorLogForExcManagerOnly = i2 % 128;
        int i3 = i2 % 2;
        AFe1pSDK aFe1pSDK = aFe1mSDK.values;
        if (i3 != 0) {
            int i4 = 83 / 0;
        }
        return aFe1pSDK;
    }

    private final AFe1xSDK afInfoLog() {
        int i = AFVersionDeclaration + 73;
        afErrorLogForExcManagerOnly = i % 128;
        int i2 = i % 2;
        AFe1xSDK aFe1xSDK = (AFe1xSDK) this.AFInAppEventType.getValue();
        if (i2 != 0) {
            int i3 = 96 / 0;
        }
        return aFe1xSDK;
    }

    private final ExecutorService afRDLog() {
        int i = AFVersionDeclaration + 39;
        afErrorLogForExcManagerOnly = i % 128;
        int i2 = i % 2;
        ExecutorService executorService = (ExecutorService) this.afRDLog.getValue();
        if (i2 != 0) {
            throw null;
        }
        int i3 = afErrorLogForExcManagerOnly + 101;
        AFVersionDeclaration = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 28 / 0;
        }
        return executorService;
    }

    private final void afWarnLog() {
        String str;
        int i = AFVersionDeclaration + 35;
        afErrorLogForExcManagerOnly = i % 128;
        if (i % 2 != 0) {
            afErrorLogForExcManagerOnly();
            throw null;
        }
        AFe1pSDK afErrorLogForExcManagerOnly2 = afErrorLogForExcManagerOnly();
        if (afErrorLogForExcManagerOnly2 != null) {
            if (!AFInAppEventType(afErrorLogForExcManagerOnly2)) {
                AFLogger.afRDLog("[Exception Manager]: ".concat("skipping"));
                AFVersionDeclaration = (afErrorLogForExcManagerOnly + 115) % 128;
                return;
            }
            int i2 = AFVersionDeclaration + 7;
            afErrorLogForExcManagerOnly = i2 % 128;
            if (i2 % 2 != 0) {
                str = afInfoLog().AFInAppEventType;
                int i3 = 46 / 0;
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
            jSONObject.getClass();
            AFInAppEventType(jSONObject, str);
        }
    }

    private final synchronized void getLevel() {
        String str;
        try {
            AFe1pSDK afErrorLogForExcManagerOnly2 = afErrorLogForExcManagerOnly();
            long j = afErrorLogForExcManagerOnly2 != null ? afErrorLogForExcManagerOnly2.valueOf : -1L;
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            try {
                AFe1pSDK afErrorLogForExcManagerOnly3 = afErrorLogForExcManagerOnly();
                if (afErrorLogForExcManagerOnly3 != null) {
                    str = afErrorLogForExcManagerOnly3.AFInAppEventType;
                } else {
                    AFVersionDeclaration = (afErrorLogForExcManagerOnly + 95) % 128;
                    str = null;
                }
                if (str == null) {
                    str = BuildConfig.FLAVOR;
                }
            } catch (NullPointerException unused) {
                str = "NOT_DETECTED";
            }
            if (j >= currentTimeMillis) {
                if (AFc1uSDK.AFa1wSDK.valueOf(str) != -1) {
                    afErrorLogForExcManagerOnly = (AFVersionDeclaration + 13) % 128;
                    if (AFc1uSDK.AFa1wSDK.valueOf(str) <= AFc1uSDK.AFa1wSDK.valueOf(afDebugLog())) {
                        valueOf().AFInAppEventParameterName(afDebugLog());
                        return;
                    }
                }
                AFLogger().AFInAppEventType("af_send_exc_to_server_window");
                valueOf().AFKeystoreWrapper();
                return;
            }
            int i = AFVersionDeclaration + 71;
            afErrorLogForExcManagerOnly = i % 128;
            if (i % 2 == 0) {
                AFLogger.afRDLog("[Exception Manager]: ".concat("TTL is already passed"));
                AFLogger().AFInAppEventType("af_send_exc_to_server_window");
                valueOf().AFKeystoreWrapper();
            } else {
                AFLogger.afRDLog("[Exception Manager]: ".concat("TTL is already passed"));
                AFLogger().AFInAppEventType("af_send_exc_to_server_window");
                valueOf().AFKeystoreWrapper();
                int i2 = 83 / 0;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0049, code lost:
    
        if (r9 >= r7) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        r14 = r14.AFInAppEventType;
        r14.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005d, code lost:
    
        if (com.appsflyer.internal.AFc1uSDK.AFa1wSDK.valueOf(r14) != com.appsflyer.internal.AFc1uSDK.AFa1wSDK.valueOf(afDebugLog())) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        com.appsflyer.internal.AFc1wSDK.afErrorLogForExcManagerOnly = (r0 + 101) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if (r14.valueOf >= (r7 / 1000)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if (r14.valueOf >= (1000 ^ r7)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003b, code lost:
    
        r0 = (com.appsflyer.internal.AFc1wSDK.afErrorLogForExcManagerOnly + 103) % 128;
        com.appsflyer.internal.AFc1wSDK.AFVersionDeclaration = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0045, code lost:
    
        if (r9 == (-1)) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean valueOf(AFe1pSDK aFe1pSDK) {
        long currentTimeMillis;
        long values;
        int i = afErrorLogForExcManagerOnly + 79;
        AFVersionDeclaration = i % 128;
        if (i % 2 == 0) {
            currentTimeMillis = System.currentTimeMillis();
            values = AFLogger().values("af_send_exc_to_server_window", -1L);
        } else {
            currentTimeMillis = System.currentTimeMillis();
            values = AFLogger().values("af_send_exc_to_server_window", -1L);
        }
        return false;
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    public final void AFKeystoreWrapper() {
        afErrorLogForExcManagerOnly = (AFVersionDeclaration + 5) % 128;
        afRDLog().execute(new f(this, 1));
        int i = AFVersionDeclaration + 29;
        afErrorLogForExcManagerOnly = i % 128;
        if (i % 2 != 0) {
            int i2 = 14 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    public final void values(Throwable th, String str) {
        int i = AFVersionDeclaration + 7;
        afErrorLogForExcManagerOnly = i % 128;
        int i2 = 9;
        if (i % 2 == 0) {
            th.getClass();
            str.getClass();
            afRDLog().execute(new s50(this, th, str, i2));
        } else {
            th.getClass();
            str.getClass();
            afRDLog().execute(new s50(this, th, str, i2));
            throw null;
        }
    }

    public static final /* synthetic */ AFc1zSDK AFKeystoreWrapper(AFc1wSDK aFc1wSDK) {
        int i = AFVersionDeclaration + 79;
        int i2 = i % 128;
        afErrorLogForExcManagerOnly = i2;
        int i3 = i % 2;
        AFc1zSDK aFc1zSDK = aFc1wSDK.AFInAppEventParameterName;
        if (i3 != 0) {
            int i4 = 29 / 0;
        }
        AFVersionDeclaration = (i2 + 113) % 128;
        return aFc1zSDK;
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    public final void values() {
        AFVersionDeclaration = (afErrorLogForExcManagerOnly + 1) % 128;
        afRDLog().execute(new f(this, 2));
        int i = afErrorLogForExcManagerOnly + 31;
        AFVersionDeclaration = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void values(AFc1wSDK aFc1wSDK) {
        AFVersionDeclaration = (afErrorLogForExcManagerOnly + 3) % 128;
        aFc1wSDK.getClass();
        aFc1wSDK.AFVersionDeclaration();
        int i = afErrorLogForExcManagerOnly + 15;
        AFVersionDeclaration = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final AFc1ySDK valueOf() {
        int i = AFVersionDeclaration + 103;
        afErrorLogForExcManagerOnly = i % 128;
        int i2 = i % 2;
        AFc1ySDK aFc1ySDK = (AFc1ySDK) this.AFLogger.getValue();
        if (i2 != 0) {
            throw null;
        }
        AFVersionDeclaration = (afErrorLogForExcManagerOnly + 73) % 128;
        return aFc1ySDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void valueOf(AFc1wSDK aFc1wSDK) {
        AFVersionDeclaration = (afErrorLogForExcManagerOnly + 57) % 128;
        aFc1wSDK.getClass();
        aFc1wSDK.getLevel();
        int i = AFVersionDeclaration + 55;
        afErrorLogForExcManagerOnly = i % 128;
        if (i % 2 != 0) {
            int i2 = 55 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void valueOf(AFc1wSDK aFc1wSDK, Throwable th, String str) {
        aFc1wSDK.getClass();
        th.getClass();
        str.getClass();
        AFe1pSDK afErrorLogForExcManagerOnly2 = aFc1wSDK.afErrorLogForExcManagerOnly();
        if (afErrorLogForExcManagerOnly2 != null) {
            AFVersionDeclaration = (afErrorLogForExcManagerOnly + 97) % 128;
            if (!aFc1wSDK.valueOf(afErrorLogForExcManagerOnly2)) {
                AFVersionDeclaration = (afErrorLogForExcManagerOnly + 101) % 128;
                return;
            }
            int i = AFVersionDeclaration + 29;
            afErrorLogForExcManagerOnly = i % 128;
            if (i % 2 != 0) {
                return;
            }
            aFc1wSDK.valueOf().AFKeystoreWrapper(th, str);
        }
    }

    private static Map<String, Object> AFInAppEventType(Map<String, ? extends Object> map, List<AFb1aSDK> list) {
        Map<String, Object> f;
        int i = AFVersionDeclaration + 19;
        afErrorLogForExcManagerOnly = i % 128;
        if (i % 2 != 0) {
            Pair[] pairArr = new Pair[5];
            pairArr[1] = new Pair("deviceInfo", map);
            pairArr[0] = new Pair("excs", AFc1uSDK.AFa1wSDK.valueOf(list));
            f = mi1.f(pairArr);
        } else {
            f = mi1.f(new Pair("deviceInfo", map), new Pair("excs", AFc1uSDK.AFa1wSDK.valueOf(list)));
        }
        int i2 = AFVersionDeclaration + 21;
        afErrorLogForExcManagerOnly = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 74 / 0;
        }
        return f;
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    public final void AFInAppEventType() {
        int i = afErrorLogForExcManagerOnly + 67;
        AFVersionDeclaration = i % 128;
        if (i % 2 != 0) {
            afRDLog().execute(new f(this, 0));
        } else {
            afRDLog().execute(new f(this, 0));
            int i2 = 37 / 0;
        }
    }

    private final void AFInAppEventType(String str, String str2) {
        afErrorLogForExcManagerOnly = (AFVersionDeclaration + 37) % 128;
        byte[] bytes = str.getBytes(yt.b);
        bytes.getClass();
        AFLogger$LogLevel().valueOf(bytes, li1.b(new Pair("Authorization", AFb1zSDK.AFKeystoreWrapper(str, str2))), 2000);
        AFVersionDeclaration = (afErrorLogForExcManagerOnly + 85) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFInAppEventParameterName(AFc1wSDK aFc1wSDK) {
        afErrorLogForExcManagerOnly = (AFVersionDeclaration + 71) % 128;
        aFc1wSDK.getClass();
        aFc1wSDK.afWarnLog();
        AFVersionDeclaration = (afErrorLogForExcManagerOnly + 89) % 128;
    }

    private final AFc1tSDK AFInAppEventParameterName() {
        afErrorLogForExcManagerOnly = (AFVersionDeclaration + 93) % 128;
        AFc1tSDK aFc1tSDK = (AFc1tSDK) this.valueOf.getValue();
        afErrorLogForExcManagerOnly = (AFVersionDeclaration + 91) % 128;
        return aFc1tSDK;
    }

    private static void AFInAppEventParameterName(String str, int i, Object[] objArr) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (AFg1kSDK.AFKeystoreWrapper) {
            try {
                char[] cArr3 = new char[cArr2.length];
                AFg1kSDK.AFInAppEventType = 0;
                char[] cArr4 = new char[2];
                while (true) {
                    int i2 = AFg1kSDK.AFInAppEventType;
                    if (i2 < cArr2.length) {
                        cArr4[0] = cArr2[i2];
                        cArr4[1] = cArr2[i2 + 1];
                        int i3 = 58224;
                        for (int i4 = 0; i4 < 16; i4++) {
                            char c = cArr4[1];
                            char c2 = cArr4[0];
                            char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + getLevel)) ^ ((c2 >>> 5) + afWarnLog)));
                            cArr4[1] = c3;
                            cArr4[0] = (char) (c2 - (((c3 >>> 5) + AFLogger$LogLevel) ^ ((c3 + i3) ^ ((c3 << 4) + afErrorLog))));
                            i3 -= 40503;
                        }
                        int i5 = AFg1kSDK.AFInAppEventType;
                        cArr3[i5] = cArr4[0];
                        cArr3[i5 + 1] = cArr4[1];
                        AFg1kSDK.AFInAppEventType = i5 + 2;
                    } else {
                        str2 = new String(cArr3, 0, i);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        objArr[0] = str2;
    }
}
