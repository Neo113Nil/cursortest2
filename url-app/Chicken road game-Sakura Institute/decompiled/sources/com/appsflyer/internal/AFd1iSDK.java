package com.appsflyer.internal;

import M2.p;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1jSDK;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.t;
import org.json.JSONObject;
import y2.C1336k;
import y2.InterfaceC1335j;
import z2.C1411O;
import z2.C1412P;

/* loaded from: classes.dex */
public final class AFd1iSDK implements AFd1jSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long afInfoLog = -3294779024785760528L;
    private static int force = 680283152;

    /* renamed from: i, reason: collision with root package name */
    private static char f5864i = 19472;

    /* renamed from: v, reason: collision with root package name */
    private static int f5865v = 0;

    /* renamed from: w, reason: collision with root package name */
    private static int f5866w = 1;
    private final InterfaceC1335j AFInAppEventParameterName;
    private final InterfaceC1335j AFInAppEventType;
    private AFd1kSDK AFKeystoreWrapper;
    private AFd1jSDK.AFa1zSDK AFLogger;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1335j f5867d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC1335j f5868e;
    private final String registerClient;
    private final InterfaceC1335j unregisterClient;
    private final InterfaceC1335j valueOf;
    private final InterfaceC1335j values;

    @Metadata
    /* renamed from: com.appsflyer.internal.AFd1iSDK$1, reason: invalid class name */
    public static final class AnonymousClass1 extends p implements Function0<AFf1bSDK> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: valueOf, reason: merged with bridge method [inline-methods] */
        public final AFf1bSDK invoke() {
            AFf1bSDK registerClient = AFd1iSDK.AFKeystoreWrapper(AFd1iSDK.this).registerClient();
            Intrinsics.checkNotNullExpressionValue(registerClient, "");
            return registerClient;
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.internal.AFd1iSDK$2, reason: invalid class name */
    public static final class AnonymousClass2 extends p implements Function0<ExecutorService> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: valueOf, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            ExecutorService values = AFd1iSDK.AFKeystoreWrapper(AFd1iSDK.this).values();
            Intrinsics.checkNotNullExpressionValue(values, "");
            return values;
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.internal.AFd1iSDK$3, reason: invalid class name */
    public static final class AnonymousClass3 extends p implements Function0<AFd1qSDK> {
        public AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: values, reason: merged with bridge method [inline-methods] */
        public final AFd1qSDK invoke() {
            AFd1qSDK valueOf = AFd1iSDK.AFKeystoreWrapper(AFd1iSDK.this).valueOf();
            Intrinsics.checkNotNullExpressionValue(valueOf, "");
            return valueOf;
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.internal.AFd1iSDK$4, reason: invalid class name */
    public static final class AnonymousClass4 extends p implements Function0<AFd1hSDK> {
        public AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: AFInAppEventParameterName, reason: merged with bridge method [inline-methods] */
        public final AFd1hSDK invoke() {
            AFd1lSDK w4 = AFd1iSDK.AFKeystoreWrapper(AFd1iSDK.this).w();
            Intrinsics.checkNotNullExpressionValue(w4, "");
            return new AFd1hSDK(w4);
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.internal.AFd1iSDK$5, reason: invalid class name */
    public static final class AnonymousClass5 extends p implements Function0<AFd1sSDK> {
        public AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: values, reason: merged with bridge method [inline-methods] */
        public final AFd1sSDK invoke() {
            AFd1sSDK AFInAppEventType = AFd1iSDK.AFKeystoreWrapper(AFd1iSDK.this).AFInAppEventType();
            Intrinsics.checkNotNullExpressionValue(AFInAppEventType, "");
            return AFInAppEventType;
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.internal.AFd1iSDK$7, reason: invalid class name */
    public static final class AnonymousClass7 extends p implements Function0<AFd1cSDK> {
        public AnonymousClass7() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
        public final AFd1cSDK invoke() {
            return new AFd1cSDK(AFd1iSDK.this.valueOf());
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.internal.AFd1iSDK$8, reason: invalid class name */
    public static final class AnonymousClass8 extends p implements Function0<AFg1wSDK> {
        public AnonymousClass8() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
        public final AFg1wSDK invoke() {
            AFg1wSDK i2 = AFd1iSDK.AFKeystoreWrapper(AFd1iSDK.this).i();
            Intrinsics.checkNotNullExpressionValue(i2, "");
            return i2;
        }
    }

    public AFd1iSDK(AFd1kSDK aFd1kSDK) {
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        this.AFKeystoreWrapper = aFd1kSDK;
        this.values = C1336k.a(new AnonymousClass1());
        this.AFInAppEventType = C1336k.a(new AnonymousClass5());
        this.AFInAppEventParameterName = C1336k.a(new AnonymousClass3());
        this.valueOf = C1336k.a(new AnonymousClass8());
        this.unregisterClient = C1336k.a(new AnonymousClass2());
        this.registerClient = "6.14.0";
        this.f5867d = C1336k.a(new AnonymousClass4());
        this.f5868e = C1336k.a(new AnonymousClass7());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFInAppEventParameterName(AFd1iSDK aFd1iSDK, Throwable th, String str) {
        Intrinsics.checkNotNullParameter(aFd1iSDK, "");
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        AFh1fSDK e4 = aFd1iSDK.e();
        if (e4 == null || !aFd1iSDK.AFKeystoreWrapper(e4)) {
            return;
        }
        int i2 = (((f5866w + 103) % 128) + 93) % 128;
        f5866w = i2;
        f5865v = (i2 + 3) % 128;
        aFd1iSDK.valueOf().AFInAppEventParameterName(th, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFInAppEventType(AFd1iSDK aFd1iSDK) {
        f5866w = (f5865v + 93) % 128;
        Intrinsics.checkNotNullParameter(aFd1iSDK, "");
        aFd1iSDK.w();
        int i2 = f5866w + 35;
        f5865v = i2 % 128;
        if (i2 % 2 != 0) {
            int i4 = 87 / 0;
        }
    }

    public static final /* synthetic */ AFd1kSDK AFKeystoreWrapper(AFd1iSDK aFd1iSDK) {
        int i2 = f5865v + 25;
        int i4 = i2 % 128;
        f5866w = i4;
        int i5 = i2 % 2;
        AFd1kSDK aFd1kSDK = aFd1iSDK.AFKeystoreWrapper;
        if (i5 == 0) {
            throw null;
        }
        int i6 = i4 + 87;
        f5865v = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 67 / 0;
        }
        return aFd1kSDK;
    }

    private final ExecutorService AFLogger() {
        f5865v = (f5866w + 15) % 128;
        ExecutorService executorService = (ExecutorService) this.unregisterClient.getValue();
        int i2 = f5866w + 101;
        f5865v = i2 % 128;
        if (i2 % 2 != 0) {
            int i4 = 89 / 0;
        }
        return executorService;
    }

    private final AFh1fSDK e() {
        AFi1zSDK aFi1zSDK;
        int i2 = f5865v + 125;
        f5866w = i2 % 128;
        if (i2 % 2 == 0) {
            aFi1zSDK = AFKeystoreWrapper().valueOf.valueOf;
            int i4 = 85 / 0;
            if (aFi1zSDK == null) {
                return null;
            }
        } else {
            aFi1zSDK = AFKeystoreWrapper().valueOf.valueOf;
            if (aFi1zSDK == null) {
                return null;
            }
        }
        AFh1gSDK aFh1gSDK = aFi1zSDK.AFInAppEventParameterName;
        if (aFh1gSDK == null) {
            return null;
        }
        AFh1fSDK aFh1fSDK = aFh1gSDK.valueOf;
        f5865v = (f5866w + 27) % 128;
        return aFh1fSDK;
    }

    private final void i() {
        f5866w = (f5865v + 51) % 128;
        AFh1fSDK e4 = e();
        if (e4 != null) {
            if (!values(e4)) {
                AFg1fSDK.v$default(AFLogger.INSTANCE, AFg1aSDK.EXCEPTION_MANAGER, "skipping", false, 4, null);
                int i2 = f5866w + 57;
                f5865v = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                return;
            }
            f5866w = (f5865v + 81) % 128;
            String str = unregisterClient().AFLogger;
            if (str != null) {
                String jSONObject = new JSONObject(AFInAppEventParameterName(AFInAppEventParameterName(e4), valueOf().AFInAppEventParameterName())).toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject, "");
                Intrinsics.checkNotNullExpressionValue(str, "");
                valueOf(jSONObject, str);
            }
        }
    }

    private final AFd1qSDK registerClient() {
        f5866w = (f5865v + 123) % 128;
        AFd1qSDK aFd1qSDK = (AFd1qSDK) this.AFInAppEventParameterName.getValue();
        f5866w = (f5865v + 37) % 128;
        return aFd1qSDK;
    }

    private final AFg1wSDK unregisterClient() {
        f5866w = (f5865v + 123) % 128;
        AFg1wSDK aFg1wSDK = (AFg1wSDK) this.valueOf.getValue();
        f5866w = (f5865v + 25) % 128;
        return aFg1wSDK;
    }

    private final synchronized void v() {
        boolean z4;
        try {
            f5866w = (f5865v + 121) % 128;
            AFh1fSDK e4 = e();
            if (e4 != null) {
                if (e4.AFInAppEventType == -1) {
                    registerClient().AFKeystoreWrapper("af_send_exc_to_server_window");
                } else if (registerClient().values("af_send_exc_to_server_window", -1L) == -1) {
                    valueOf(e4);
                }
                z4 = AFKeystoreWrapper(e4);
                f5865v = (f5866w + 13) % 128;
            } else {
                z4 = false;
            }
            AFd1jSDK.AFa1zSDK aFa1zSDK = this.AFLogger;
            if (aFa1zSDK != null) {
                f5865v = (f5866w + 11) % 128;
                aFa1zSDK.onConfigurationChanged(z4);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final AFd1sSDK values() {
        int i2 = f5866w + 81;
        f5865v = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        AFd1sSDK aFd1sSDK = (AFd1sSDK) this.AFInAppEventType.getValue();
        int i4 = f5865v + 29;
        f5866w = i4 % 128;
        if (i4 % 2 != 0) {
            return aFd1sSDK;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x012f, code lost:
    
        if (r0.intValue() != (-1)) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x00e9, code lost:
    
        if (r0 != null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0062, code lost:
    
        if (AFInAppEventType(r0) == true) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e0, code lost:
    
        if (r0 != null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00eb, code lost:
    
        r0 = r0.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01d5, code lost:
    
        if (r1 != null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01e0, code lost:
    
        r2 = AFKeystoreWrapper(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01de, code lost:
    
        if (r1 != null) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x012b A[Catch: all -> 0x000a, TryCatch #3 {all -> 0x000a, blocks: (B:3:0x0001, B:5:0x0007, B:6:0x000f, B:8:0x001d, B:12:0x0043, B:14:0x004b, B:16:0x0057, B:19:0x0064, B:21:0x006c, B:23:0x0070, B:25:0x0082, B:27:0x0092, B:29:0x0096, B:31:0x009c, B:32:0x00a2, B:34:0x00ae, B:36:0x00b2, B:38:0x00b8, B:39:0x00be, B:41:0x00ca, B:43:0x00ce, B:45:0x00d9, B:50:0x00eb, B:51:0x00f1, B:52:0x00f4, B:53:0x00fa, B:55:0x0100, B:57:0x010c, B:58:0x0112, B:60:0x0118, B:62:0x011c, B:64:0x0122, B:66:0x0133, B:67:0x01bf, B:69:0x01c3, B:71:0x01ce, B:76:0x01e4, B:79:0x01e0, B:82:0x01d9, B:83:0x01da, B:88:0x0144, B:90:0x014f, B:96:0x016b, B:97:0x016c, B:99:0x0186, B:100:0x019e, B:101:0x012b, B:106:0x00e4, B:107:0x00e5, B:114:0x005e, B:116:0x01af, B:48:0x00df, B:74:0x01d4, B:93:0x0168), top: B:2:0x0001, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0122 A[Catch: all -> 0x000a, TryCatch #3 {all -> 0x000a, blocks: (B:3:0x0001, B:5:0x0007, B:6:0x000f, B:8:0x001d, B:12:0x0043, B:14:0x004b, B:16:0x0057, B:19:0x0064, B:21:0x006c, B:23:0x0070, B:25:0x0082, B:27:0x0092, B:29:0x0096, B:31:0x009c, B:32:0x00a2, B:34:0x00ae, B:36:0x00b2, B:38:0x00b8, B:39:0x00be, B:41:0x00ca, B:43:0x00ce, B:45:0x00d9, B:50:0x00eb, B:51:0x00f1, B:52:0x00f4, B:53:0x00fa, B:55:0x0100, B:57:0x010c, B:58:0x0112, B:60:0x0118, B:62:0x011c, B:64:0x0122, B:66:0x0133, B:67:0x01bf, B:69:0x01c3, B:71:0x01ce, B:76:0x01e4, B:79:0x01e0, B:82:0x01d9, B:83:0x01da, B:88:0x0144, B:90:0x014f, B:96:0x016b, B:97:0x016c, B:99:0x0186, B:100:0x019e, B:101:0x012b, B:106:0x00e4, B:107:0x00e5, B:114:0x005e, B:116:0x01af, B:48:0x00df, B:74:0x01d4, B:93:0x0168), top: B:2:0x0001, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0133 A[Catch: all -> 0x000a, TryCatch #3 {all -> 0x000a, blocks: (B:3:0x0001, B:5:0x0007, B:6:0x000f, B:8:0x001d, B:12:0x0043, B:14:0x004b, B:16:0x0057, B:19:0x0064, B:21:0x006c, B:23:0x0070, B:25:0x0082, B:27:0x0092, B:29:0x0096, B:31:0x009c, B:32:0x00a2, B:34:0x00ae, B:36:0x00b2, B:38:0x00b8, B:39:0x00be, B:41:0x00ca, B:43:0x00ce, B:45:0x00d9, B:50:0x00eb, B:51:0x00f1, B:52:0x00f4, B:53:0x00fa, B:55:0x0100, B:57:0x010c, B:58:0x0112, B:60:0x0118, B:62:0x011c, B:64:0x0122, B:66:0x0133, B:67:0x01bf, B:69:0x01c3, B:71:0x01ce, B:76:0x01e4, B:79:0x01e0, B:82:0x01d9, B:83:0x01da, B:88:0x0144, B:90:0x014f, B:96:0x016b, B:97:0x016c, B:99:0x0186, B:100:0x019e, B:101:0x012b, B:106:0x00e4, B:107:0x00e5, B:114:0x005e, B:116:0x01af, B:48:0x00df, B:74:0x01d4, B:93:0x0168), top: B:2:0x0001, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c3 A[Catch: all -> 0x000a, TryCatch #3 {all -> 0x000a, blocks: (B:3:0x0001, B:5:0x0007, B:6:0x000f, B:8:0x001d, B:12:0x0043, B:14:0x004b, B:16:0x0057, B:19:0x0064, B:21:0x006c, B:23:0x0070, B:25:0x0082, B:27:0x0092, B:29:0x0096, B:31:0x009c, B:32:0x00a2, B:34:0x00ae, B:36:0x00b2, B:38:0x00b8, B:39:0x00be, B:41:0x00ca, B:43:0x00ce, B:45:0x00d9, B:50:0x00eb, B:51:0x00f1, B:52:0x00f4, B:53:0x00fa, B:55:0x0100, B:57:0x010c, B:58:0x0112, B:60:0x0118, B:62:0x011c, B:64:0x0122, B:66:0x0133, B:67:0x01bf, B:69:0x01c3, B:71:0x01ce, B:76:0x01e4, B:79:0x01e0, B:82:0x01d9, B:83:0x01da, B:88:0x0144, B:90:0x014f, B:96:0x016b, B:97:0x016c, B:99:0x0186, B:100:0x019e, B:101:0x012b, B:106:0x00e4, B:107:0x00e5, B:114:0x005e, B:116:0x01af, B:48:0x00df, B:74:0x01d4, B:93:0x0168), top: B:2:0x0001, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e9 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0144 A[Catch: all -> 0x000a, TryCatch #3 {all -> 0x000a, blocks: (B:3:0x0001, B:5:0x0007, B:6:0x000f, B:8:0x001d, B:12:0x0043, B:14:0x004b, B:16:0x0057, B:19:0x0064, B:21:0x006c, B:23:0x0070, B:25:0x0082, B:27:0x0092, B:29:0x0096, B:31:0x009c, B:32:0x00a2, B:34:0x00ae, B:36:0x00b2, B:38:0x00b8, B:39:0x00be, B:41:0x00ca, B:43:0x00ce, B:45:0x00d9, B:50:0x00eb, B:51:0x00f1, B:52:0x00f4, B:53:0x00fa, B:55:0x0100, B:57:0x010c, B:58:0x0112, B:60:0x0118, B:62:0x011c, B:64:0x0122, B:66:0x0133, B:67:0x01bf, B:69:0x01c3, B:71:0x01ce, B:76:0x01e4, B:79:0x01e0, B:82:0x01d9, B:83:0x01da, B:88:0x0144, B:90:0x014f, B:96:0x016b, B:97:0x016c, B:99:0x0186, B:100:0x019e, B:101:0x012b, B:106:0x00e4, B:107:0x00e5, B:114:0x005e, B:116:0x01af, B:48:0x00df, B:74:0x01d4, B:93:0x0168), top: B:2:0x0001, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final synchronized void w() {
        AFd1jSDK.AFa1zSDK aFa1zSDK;
        AFh1fSDK e4;
        Integer num;
        Pair<Integer, Integer> pair;
        AFh1fSDK e5;
        String str;
        String str2;
        int i2;
        String str3;
        Integer f4;
        String str4;
        Integer f5;
        String str5;
        Integer f6;
        try {
            AFh1fSDK e6 = e();
            if ((e6 != null ? e6.AFInAppEventParameterName : -1L) < TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
                f5865v = (f5866w + 81) % 128;
                AFg1fSDK.v$default(AFLogger.INSTANCE, AFg1aSDK.EXCEPTION_MANAGER, "TTL is already passed", false, 4, null);
                registerClient().AFKeystoreWrapper("af_send_exc_to_server_window");
                valueOf().AFInAppEventType();
                return;
            }
            AFh1fSDK e7 = e();
            boolean z4 = false;
            if (e7 != null) {
                int i4 = f5866w + 107;
                f5865v = i4 % 128;
                if (i4 % 2 != 0) {
                    if (!AFInAppEventType(e7)) {
                        AFh1fSDK e8 = e();
                        Pair<Integer, Integer> pair2 = null;
                        if (e8 == null || (str2 = e8.AFKeystoreWrapper) == null) {
                            num = null;
                        } else {
                            Intrinsics.checkNotNullParameter(str2, "");
                            kotlin.text.j a4 = new Regex("(\\d+).(\\d+).(\\d+).*").a(str2);
                            if (a4 != null) {
                                f5865v = (f5866w + 41) % 128;
                                MatchGroup h4 = a4.f7539c.h(1);
                                int intValue = ((h4 == null || (str5 = h4.f7512a) == null || (f6 = t.f(str5)) == null) ? 0 : f6.intValue()) * 1000000;
                                MatchGroup h5 = a4.f7539c.h(2);
                                int intValue2 = (((h5 == null || (str4 = h5.f7512a) == null || (f5 = t.f(str4)) == null) ? 0 : f5.intValue()) * 1000) + intValue;
                                MatchGroup h6 = a4.f7539c.h(3);
                                if (h6 != null && (str3 = h6.f7512a) != null) {
                                    int i5 = f5866w + 93;
                                    f5865v = i5 % 128;
                                    if (i5 % 2 != 0) {
                                        f4 = t.f(str3);
                                        int i6 = 15 / 0;
                                    } else {
                                        f4 = t.f(str3);
                                    }
                                    i2 = intValue2 + r0;
                                }
                                int i7 = 0;
                                i2 = intValue2 + i7;
                            } else {
                                i2 = -1;
                            }
                            num = Integer.valueOf(i2);
                        }
                        AFh1fSDK e9 = e();
                        if (e9 != null) {
                            f5865v = (f5866w + 29) % 128;
                            String str6 = e9.AFKeystoreWrapper;
                            if (str6 != null) {
                                pair = AFe1vSDK.values(str6);
                                e5 = e();
                                if (e5 != null && (str = e5.AFKeystoreWrapper) != null) {
                                    pair2 = AFe1vSDK.valueOf(str);
                                }
                                if (num != null) {
                                    f5866w = (f5865v + 67) % 128;
                                }
                                if (pair == null) {
                                    valueOf().AFInAppEventType(this.registerClient);
                                    aFa1zSDK = this.AFLogger;
                                    if (aFa1zSDK == null) {
                                        int i8 = f5866w + 85;
                                        f5865v = i8 % 128;
                                        if (i8 % 2 != 0) {
                                            e4 = e();
                                            int i9 = 34 / 0;
                                        } else {
                                            e4 = e();
                                        }
                                        aFa1zSDK.onConfigurationChanged(z4);
                                        return;
                                    }
                                    return;
                                }
                                if (pair == null) {
                                    int i10 = f5866w + 39;
                                    f5865v = i10 % 128;
                                    if (i10 % 2 != 0) {
                                        valueOf().AFInAppEventType(((Number) pair.f7485d).intValue(), ((Number) pair.f7486e).intValue());
                                        int i11 = 38 / 0;
                                    } else {
                                        valueOf().AFInAppEventType(((Number) pair.f7485d).intValue(), ((Number) pair.f7486e).intValue());
                                    }
                                } else if (pair2 != null) {
                                    valueOf().AFInAppEventType(((Number) pair2.f7485d).intValue(), ((Number) pair2.f7486e).intValue());
                                } else {
                                    registerClient().AFKeystoreWrapper("af_send_exc_to_server_window");
                                    valueOf().AFInAppEventType();
                                }
                                aFa1zSDK = this.AFLogger;
                                if (aFa1zSDK == null) {
                                }
                            }
                        }
                        pair = null;
                        e5 = e();
                        if (e5 != null) {
                            pair2 = AFe1vSDK.valueOf(str);
                        }
                        if (num != null) {
                        }
                        if (pair == null) {
                        }
                        if (pair == null) {
                        }
                        aFa1zSDK = this.AFLogger;
                        if (aFa1zSDK == null) {
                        }
                    }
                }
            }
            registerClient().AFKeystoreWrapper("af_send_exc_to_server_window");
            valueOf().AFInAppEventType();
            aFa1zSDK = this.AFLogger;
            if (aFa1zSDK == null) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final AFd1gSDK valueOf() {
        int i2 = f5865v + 41;
        f5866w = i2 % 128;
        if (i2 % 2 != 0) {
            return (AFd1gSDK) this.f5867d.getValue();
        }
        throw null;
    }

    private final AFf1bSDK AFKeystoreWrapper() {
        f5865v = (f5866w + 95) % 128;
        AFf1bSDK aFf1bSDK = (AFf1bSDK) this.values.getValue();
        int i2 = f5866w + 41;
        f5865v = i2 % 128;
        if (i2 % 2 != 0) {
            int i4 = 64 / 0;
        }
        return aFf1bSDK;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void a(int i2, char c4, String str, String str2, String str3, Object[] objArr) {
        $11 = ($10 + 61) % 128;
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        char[] charArray2 = str2 != null ? str2.toCharArray() : str2;
        char[] charArray3 = str != 0 ? str.toCharArray() : str;
        AFj1eSDK aFj1eSDK = new AFj1eSDK();
        int length = charArray.length;
        char[] cArr = new char[length];
        int length2 = charArray2.length;
        char[] cArr2 = new char[length2];
        System.arraycopy(charArray, 0, cArr, 0, length);
        System.arraycopy(charArray2, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c4);
        cArr2[2] = (char) (cArr2[2] + ((char) i2));
        int length3 = charArray3.length;
        char[] cArr3 = new char[length3];
        aFj1eSDK.valueOf = 0;
        while (true) {
            int i4 = aFj1eSDK.valueOf;
            if (i4 >= length3) {
                objArr[0] = new String(cArr3);
                return;
            }
            $11 = ($10 + 3) % 128;
            int i5 = (i4 + 3) % 4;
            int i6 = cArr[i4 % 4] * 32718;
            char c5 = cArr2[(i4 + 2) % 4];
            char c6 = (char) ((i6 + c5) % 65535);
            aFj1eSDK.AFKeystoreWrapper = c6;
            cArr2[i5] = (char) (((cArr[i5] * 32718) + c5) / 65535);
            cArr[i5] = c6;
            cArr3[i4] = (char) ((((charArray3[i4] ^ c6) ^ (afInfoLog ^ (-2499805256334160880L))) ^ ((int) (force ^ (-2499805256334160880L)))) ^ ((char) (f5864i ^ (-2499805256334160880L))));
            aFj1eSDK.valueOf = i4 + 1;
        }
    }

    private AFd1bSDK d() {
        f5865v = (f5866w + 39) % 128;
        AFd1bSDK aFd1bSDK = (AFd1bSDK) this.f5868e.getValue();
        f5865v = (f5866w + 17) % 128;
        return aFd1bSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void valueOf(AFd1iSDK aFd1iSDK) {
        f5866w = (f5865v + 69) % 128;
        Intrinsics.checkNotNullParameter(aFd1iSDK, "");
        aFd1iSDK.v();
        int i2 = f5865v + 63;
        f5866w = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1jSDK
    public final void values(Throwable th, String str) {
        int i2 = f5865v + 9;
        f5866w = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(th, "");
            Intrinsics.checkNotNullParameter(str, "");
            AFLogger().execute(new c(this, th, str, 1));
        } else {
            Intrinsics.checkNotNullParameter(th, "");
            Intrinsics.checkNotNullParameter(str, "");
            AFLogger().execute(new c(this, th, str, 1));
            throw null;
        }
    }

    private final boolean AFKeystoreWrapper(AFh1fSDK aFh1fSDK) {
        int i2 = f5866w + 13;
        f5865v = i2 % 128;
        if (i2 % 2 == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            long values = registerClient().values("af_send_exc_to_server_window", -1L);
            if (aFh1fSDK.AFInAppEventParameterName < TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis)) {
                int i4 = f5866w + 109;
                f5865v = i4 % 128;
                return i4 % 2 != 0;
            }
            if (values == -1 || values < currentTimeMillis) {
                return false;
            }
            return AFInAppEventType(aFh1fSDK);
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        registerClient().values("af_send_exc_to_server_window", -1L);
        long j4 = aFh1fSDK.AFInAppEventParameterName;
        TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis2);
        throw null;
    }

    @Override // com.appsflyer.internal.AFd1jSDK
    public final void AFInAppEventParameterName() {
        f5865v = (f5866w + 67) % 128;
        AFLogger().execute(new e(this, 1));
        int i2 = f5865v + 99;
        f5866w = i2 % 128;
        if (i2 % 2 == 0) {
            int i4 = 95 / 0;
        }
    }

    private final Map<String, String> AFInAppEventParameterName(AFh1fSDK aFh1fSDK) {
        Object[] objArr = new Object[1];
        a(View.MeasureSpec.makeMeasureSpec(0, 0) - 801052847, (char) (TextUtils.indexOf("", "", 0, 0) + 25652), "텤\ue8cd㘏跣艷", "틠\udeb0羳༈", "册䃧㓐蹤", objArr);
        Pair pair = new Pair(((String) objArr[0]).intern(), Build.BRAND);
        Pair pair2 = new Pair("model", Build.MODEL);
        Pair pair3 = new Pair("app_id", values().valueOf.AFKeystoreWrapper.getPackageName());
        Pair pair4 = new Pair("p_ex", new AFb1hSDK().valueOf());
        Pair pair5 = new Pair("api", String.valueOf(Build.VERSION.SDK_INT));
        Pair pair6 = new Pair("sdk", this.registerClient);
        AFd1sSDK values = values();
        Map<String, String> e4 = C1412P.e(pair, pair2, pair3, pair4, pair5, pair6, new Pair("uid", AFb1kSDK.valueOf(values.valueOf, values.AFKeystoreWrapper)), new Pair("exc_config", aFh1fSDK.valueOf()));
        f5865v = (f5866w + 33) % 128;
        return e4;
    }

    @Override // com.appsflyer.internal.AFd1jSDK
    public final void AFInAppEventType() {
        f5865v = (f5866w + 103) % 128;
        AFLogger().execute(new e(this, 0));
        f5865v = (f5866w + 95) % 128;
    }

    private final boolean AFInAppEventType(AFh1fSDK aFh1fSDK) {
        new AFe1zSDK();
        String str = this.registerClient;
        String str2 = aFh1fSDK.AFKeystoreWrapper;
        Intrinsics.checkNotNullExpressionValue(str2, "");
        boolean AFInAppEventType = AFe1zSDK.AFInAppEventType(str, str2);
        int i2 = f5865v + 51;
        f5866w = i2 % 128;
        if (i2 % 2 != 0) {
            return AFInAppEventType;
        }
        throw null;
    }

    private final void valueOf(AFh1fSDK aFh1fSDK) {
        int i2;
        long millis;
        int i4 = f5865v + 83;
        f5866w = i4 % 128;
        if (i4 % 2 == 0) {
            i2 = aFh1fSDK.valueOf;
            millis = TimeUnit.DAYS.toMillis(aFh1fSDK.AFInAppEventType) * System.currentTimeMillis();
        } else {
            i2 = aFh1fSDK.valueOf;
            millis = TimeUnit.DAYS.toMillis(aFh1fSDK.AFInAppEventType) + System.currentTimeMillis();
        }
        AFd1qSDK registerClient = registerClient();
        registerClient.AFKeystoreWrapper("af_send_exc_to_server_window", millis);
        registerClient.AFInAppEventParameterName("af_send_exc_min", i2);
    }

    @Override // com.appsflyer.internal.AFd1jSDK
    public final void values(AFd1jSDK.AFa1zSDK aFa1zSDK) {
        int i2 = f5866w + 77;
        f5865v = i2 % 128;
        if (i2 % 2 == 0) {
            this.AFLogger = aFa1zSDK;
            AFLogger().execute(new e(this, 2));
        } else {
            this.AFLogger = aFa1zSDK;
            AFLogger().execute(new e(this, 2));
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void values(AFd1iSDK aFd1iSDK) {
        int i2 = f5865v + 59;
        f5866w = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(aFd1iSDK, "");
            aFd1iSDK.i();
            throw null;
        }
        Intrinsics.checkNotNullParameter(aFd1iSDK, "");
        aFd1iSDK.i();
        f5865v = (f5866w + 51) % 128;
    }

    private final boolean values(AFh1fSDK aFh1fSDK) {
        int valueOf;
        f5865v = (f5866w + 13) % 128;
        long currentTimeMillis = System.currentTimeMillis();
        long values = registerClient().values("af_send_exc_to_server_window", -1L);
        if (aFh1fSDK.AFInAppEventParameterName >= TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis) && values != -1 && values >= currentTimeMillis && (valueOf = registerClient().valueOf("af_send_exc_min", -1)) != -1) {
            int i2 = f5866w + 73;
            f5865v = i2 % 128;
            if (i2 % 2 != 0) {
                valueOf().values();
                throw null;
            }
            if (valueOf().values() >= valueOf) {
                return AFInAppEventType(aFh1fSDK);
            }
        }
        return false;
    }

    private final void valueOf(String str, String str2) {
        f5866w = (f5865v + 37) % 128;
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        d().valueOf(bytes, C1411O.b(new Pair("Authorization", AFb1lSDK.AFKeystoreWrapper(str, str2))), 2000);
        f5865v = (f5866w + 83) % 128;
    }

    private static Map<String, Object> AFInAppEventParameterName(Map<String, ? extends Object> map, List<AFd1fSDK> list) {
        Map<String, Object> e4;
        int i2 = f5865v + 63;
        f5866w = i2 % 128;
        if (i2 % 2 == 0) {
            e4 = C1412P.e(new Pair("deviceInfo", map), new Pair("excs", AFd1eSDK.AFInAppEventType(list)));
        } else {
            e4 = C1412P.e(new Pair("deviceInfo", map), new Pair("excs", AFd1eSDK.AFInAppEventType(list)));
        }
        f5865v = (f5866w + 73) % 128;
        return e4;
    }
}
