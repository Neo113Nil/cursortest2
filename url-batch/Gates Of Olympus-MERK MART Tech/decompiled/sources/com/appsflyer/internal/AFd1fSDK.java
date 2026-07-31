package com.appsflyer.internal;

import android.os.Build;
import android.text.TextUtils;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.compose.runtime.ComposerImplKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1hSDK;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
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
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.time.DurationKt;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class AFd1fSDK implements AFd1hSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int[] afInfoLog = {-1254990934, -2139714730, 1134248112, 1828953655, 1197013469, 603219996, -2093188521, -1856271027, -412079969, -512124133, 129440203, -424271832, 921990966, 1748148755, -1530135464, 749113556, 803841057, 985358990};
    private static int i = 1;
    private static int v;
    private final Lazy AFInAppEventParameterName;
    private final Lazy AFInAppEventType;
    private final Lazy AFKeystoreWrapper;
    private final String AFLogger;
    private final Lazy d;
    private final Lazy e;
    private final Lazy registerClient;
    private AFd1hSDK.AFa1ySDK unregisterClient;
    private AFd1mSDK valueOf;
    private final Lazy values;

    public AFd1fSDK(AFd1mSDK aFd1mSDK) {
        Intrinsics.checkNotNullParameter(aFd1mSDK, "");
        this.valueOf = aFd1mSDK;
        this.values = LazyKt.lazy(new Function0<AFf1eSDK>() { // from class: com.appsflyer.internal.AFd1fSDK.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: AFKeystoreWrapper, reason: merged with bridge method [inline-methods] */
            public final AFf1eSDK invoke() {
                AFf1eSDK registerClient = AFd1fSDK.AFKeystoreWrapper(AFd1fSDK.this).registerClient();
                Intrinsics.checkNotNullExpressionValue(registerClient, "");
                return registerClient;
            }
        });
        this.AFInAppEventType = LazyKt.lazy(new Function0<AFd1pSDK>() { // from class: com.appsflyer.internal.AFd1fSDK.4
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
            public final AFd1pSDK invoke() {
                AFd1pSDK values = AFd1fSDK.AFKeystoreWrapper(AFd1fSDK.this).values();
                Intrinsics.checkNotNullExpressionValue(values, "");
                return values;
            }
        });
        this.AFInAppEventParameterName = LazyKt.lazy(new Function0<AFd1xSDK>() { // from class: com.appsflyer.internal.AFd1fSDK.5
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: AFKeystoreWrapper, reason: merged with bridge method [inline-methods] */
            public final AFd1xSDK invoke() {
                AFd1xSDK valueOf = AFd1fSDK.AFKeystoreWrapper(AFd1fSDK.this).valueOf();
                Intrinsics.checkNotNullExpressionValue(valueOf, "");
                return valueOf;
            }
        });
        this.AFKeystoreWrapper = LazyKt.lazy(new Function0<AFg1xSDK>() { // from class: com.appsflyer.internal.AFd1fSDK.6
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: AFKeystoreWrapper, reason: merged with bridge method [inline-methods] */
            public final AFg1xSDK invoke() {
                AFg1xSDK force = AFd1fSDK.AFKeystoreWrapper(AFd1fSDK.this).force();
                Intrinsics.checkNotNullExpressionValue(force, "");
                return force;
            }
        });
        this.registerClient = LazyKt.lazy(new Function0<ExecutorService>() { // from class: com.appsflyer.internal.AFd1fSDK.3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: values, reason: merged with bridge method [inline-methods] */
            public final ExecutorService invoke() {
                ExecutorService AFInAppEventParameterName = AFd1fSDK.AFKeystoreWrapper(AFd1fSDK.this).AFInAppEventParameterName();
                Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName, "");
                return AFInAppEventParameterName;
            }
        });
        this.AFLogger = "6.12.6";
        this.d = LazyKt.lazy(new Function0<AFd1gSDK>() { // from class: com.appsflyer.internal.AFd1fSDK.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: valueOf, reason: merged with bridge method [inline-methods] */
            public final AFd1gSDK invoke() {
                AFd1nSDK v2 = AFd1fSDK.AFKeystoreWrapper(AFd1fSDK.this).v();
                Intrinsics.checkNotNullExpressionValue(v2, "");
                return new AFd1gSDK(v2);
            }
        });
        this.e = LazyKt.lazy(new Function0<AFd1bSDK>() { // from class: com.appsflyer.internal.AFd1fSDK.7
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
            public final AFd1bSDK invoke() {
                return new AFd1bSDK(AFd1fSDK.this.AFKeystoreWrapper());
            }
        });
    }

    public static final /* synthetic */ AFd1mSDK AFKeystoreWrapper(AFd1fSDK aFd1fSDK) {
        int i2 = 2 % 2;
        int i3 = i + 45;
        v = i3 % 128;
        int i4 = i3 % 2;
        AFd1mSDK aFd1mSDK = aFd1fSDK.valueOf;
        if (i4 != 0) {
            int i5 = 47 / 0;
        }
        return aFd1mSDK;
    }

    private final AFf1eSDK values() {
        int i2 = 2 % 2;
        int i3 = v + 63;
        i = i3 % 128;
        int i4 = i3 % 2;
        AFf1eSDK aFf1eSDK = (AFf1eSDK) this.values.getValue();
        int i5 = v + 63;
        i = i5 % 128;
        int i6 = i5 % 2;
        return aFf1eSDK;
    }

    private final AFd1pSDK valueOf() {
        int i2 = 2 % 2;
        int i3 = i + 17;
        v = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        AFd1pSDK aFd1pSDK = (AFd1pSDK) this.AFInAppEventType.getValue();
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i + 53;
        v = i5 % 128;
        if (i5 % 2 == 0) {
            return aFd1pSDK;
        }
        obj.hashCode();
        throw null;
    }

    private final AFd1xSDK d() {
        int i2 = 2 % 2;
        int i3 = i + 81;
        v = i3 % 128;
        int i4 = i3 % 2;
        AFd1xSDK aFd1xSDK = (AFd1xSDK) this.AFInAppEventParameterName.getValue();
        int i5 = i + ComposerImplKt.nodeKey;
        v = i5 % 128;
        if (i5 % 2 == 0) {
            return aFd1xSDK;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final AFg1xSDK e() {
        int i2 = 2 % 2;
        int i3 = v + 9;
        i = i3 % 128;
        int i4 = i3 % 2;
        AFg1xSDK aFg1xSDK = (AFg1xSDK) this.AFKeystoreWrapper.getValue();
        int i5 = v + 23;
        i = i5 % 128;
        int i6 = i5 % 2;
        return aFg1xSDK;
    }

    private final ExecutorService unregisterClient() {
        int i2 = 2 % 2;
        int i3 = i + 41;
        v = i3 % 128;
        int i4 = i3 % 2;
        ExecutorService executorService = (ExecutorService) this.registerClient.getValue();
        int i5 = i + 105;
        v = i5 % 128;
        int i6 = i5 % 2;
        return executorService;
    }

    public final AFd1jSDK AFKeystoreWrapper() {
        int i2 = 2 % 2;
        int i3 = v + 123;
        i = i3 % 128;
        int i4 = i3 % 2;
        AFd1jSDK aFd1jSDK = (AFd1jSDK) this.d.getValue();
        if (i4 == 0) {
            int i5 = 12 / 0;
        }
        int i6 = v + 57;
        i = i6 % 128;
        int i7 = i6 % 2;
        return aFd1jSDK;
    }

    private AFd1iSDK registerClient() {
        int i2 = 2 % 2;
        int i3 = v + 95;
        i = i3 % 128;
        int i4 = i3 % 2;
        AFd1iSDK aFd1iSDK = (AFd1iSDK) this.e.getValue();
        int i5 = v + 9;
        i = i5 % 128;
        int i6 = i5 % 2;
        return aFd1iSDK;
    }

    @Override // com.appsflyer.internal.AFd1hSDK
    public final void AFKeystoreWrapper(final Throwable th, final String str) {
        int i2 = 2 % 2;
        int i3 = v + 115;
        i = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(th, "");
            Intrinsics.checkNotNullParameter(str, "");
            unregisterClient().execute(new Runnable() { // from class: com.appsflyer.internal.AFd1fSDK$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1fSDK.AFInAppEventType(AFd1fSDK.this, th, str);
                }
            });
            int i4 = 4 / 0;
        } else {
            Intrinsics.checkNotNullParameter(th, "");
            Intrinsics.checkNotNullParameter(str, "");
            unregisterClient().execute(new Runnable() { // from class: com.appsflyer.internal.AFd1fSDK$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1fSDK.AFInAppEventType(AFd1fSDK.this, th, str);
                }
            });
        }
        int i5 = i + 53;
        v = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 59 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFInAppEventType(AFd1fSDK aFd1fSDK, Throwable th, String str) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(aFd1fSDK, "");
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        AFh1pSDK AFLogger = aFd1fSDK.AFLogger();
        if (AFLogger != null) {
            int i3 = i + 113;
            v = i3 % 128;
            int i4 = i3 % 2;
            if (!aFd1fSDK.values(AFLogger)) {
                int i5 = i + 113;
                v = i5 % 128;
                int i6 = i5 % 2;
            } else {
                int i7 = v + 91;
                i = i7 % 128;
                if (i7 % 2 == 0) {
                    return;
                }
                aFd1fSDK.AFKeystoreWrapper().AFInAppEventParameterName(th, str);
            }
        }
    }

    @Override // com.appsflyer.internal.AFd1hSDK
    public final void AFInAppEventParameterName(AFd1hSDK.AFa1ySDK aFa1ySDK) {
        int i2 = 2 % 2;
        int i3 = v + 15;
        i = i3 % 128;
        if (i3 % 2 != 0) {
            this.unregisterClient = aFa1ySDK;
            unregisterClient().execute(new Runnable() { // from class: com.appsflyer.internal.AFd1fSDK$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1fSDK.AFInAppEventType(AFd1fSDK.this);
                }
            });
        } else {
            this.unregisterClient = aFa1ySDK;
            unregisterClient().execute(new Runnable() { // from class: com.appsflyer.internal.AFd1fSDK$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1fSDK.AFInAppEventType(AFd1fSDK.this);
                }
            });
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFInAppEventType(AFd1fSDK aFd1fSDK) {
        int i2 = 2 % 2;
        int i3 = i + 5;
        v = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(aFd1fSDK, "");
        aFd1fSDK.afInfoLog();
        int i5 = v + 27;
        i = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.internal.AFd1hSDK
    public final void AFInAppEventParameterName() {
        int i2 = 2 % 2;
        int i3 = v + 99;
        i = i3 % 128;
        if (i3 % 2 == 0) {
            unregisterClient().execute(new Runnable() { // from class: com.appsflyer.internal.AFd1fSDK$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1fSDK.AFInAppEventParameterName(AFd1fSDK.this);
                }
            });
            int i4 = 11 / 0;
        } else {
            unregisterClient().execute(new Runnable() { // from class: com.appsflyer.internal.AFd1fSDK$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1fSDK.AFInAppEventParameterName(AFd1fSDK.this);
                }
            });
        }
        int i5 = v + 39;
        i = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFInAppEventParameterName(AFd1fSDK aFd1fSDK) {
        int i2 = 2 % 2;
        int i3 = v + ModuleDescriptor.MODULE_VERSION;
        i = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(aFd1fSDK, "");
        aFd1fSDK.w();
        int i5 = v + 89;
        i = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1hSDK
    public final void AFInAppEventType() {
        int i2 = 2 % 2;
        int i3 = i + AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY;
        v = i3 % 128;
        int i4 = i3 % 2;
        unregisterClient().execute(new Runnable() { // from class: com.appsflyer.internal.AFd1fSDK$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AFd1fSDK.values(AFd1fSDK.this);
            }
        });
        int i5 = i + 87;
        v = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 50 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void values(AFd1fSDK aFd1fSDK) {
        int i2 = 2 % 2;
        int i3 = i + 31;
        v = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(aFd1fSDK, "");
            aFd1fSDK.v();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(aFd1fSDK, "");
        aFd1fSDK.v();
        int i4 = v + 67;
        i = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0117, code lost:
    
        if (r1 != null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0097, code lost:
    
        if (r6 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x010e, code lost:
    
        if (r1 != null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0119, code lost:
    
        r1 = kotlin.text.StringsKt.toIntOrNull(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011d, code lost:
    
        if (r1 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x011f, code lost:
    
        r7 = com.appsflyer.internal.AFd1fSDK.i + 61;
        com.appsflyer.internal.AFd1fSDK.v = r7 % 128;
        r7 = r7 % 2;
        r1 = r1.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0181, code lost:
    
        if (r1.intValue() != (-1)) goto L96;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca A[Catch: all -> 0x0236, TryCatch #1 {, blocks: (B:4:0x0002, B:7:0x0010, B:9:0x0016, B:10:0x001d, B:12:0x002b, B:16:0x004c, B:18:0x0053, B:20:0x005a, B:22:0x0061, B:24:0x0065, B:26:0x0079, B:28:0x0084, B:31:0x0099, B:33:0x00a4, B:35:0x00aa, B:37:0x00b0, B:38:0x00bc, B:40:0x00ca, B:42:0x00d9, B:44:0x00e8, B:45:0x00ee, B:47:0x00fc, B:49:0x0107, B:53:0x0119, B:55:0x011f, B:56:0x0130, B:57:0x0133, B:58:0x013b, B:60:0x0141, B:62:0x0145, B:63:0x014d, B:65:0x0153, B:67:0x0157, B:69:0x0162, B:71:0x0173, B:73:0x0185, B:74:0x021d, B:76:0x0221, B:78:0x0227, B:79:0x022b, B:85:0x0196, B:87:0x01a1, B:88:0x01bd, B:94:0x01dd, B:96:0x01e0, B:97:0x01fc, B:98:0x017d, B:100:0x0167, B:106:0x016f, B:108:0x014a, B:129:0x0112, B:109:0x0113, B:111:0x012d, B:113:0x00b5, B:118:0x00ba, B:120:0x008f, B:124:0x020d, B:126:0x0232, B:51:0x010d, B:127:0x0235, B:115:0x00b8, B:90:0x01d8, B:91:0x01db, B:102:0x016a, B:103:0x016d), top: B:3:0x0002, inners: #0, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fc A[Catch: all -> 0x0236, TryCatch #1 {, blocks: (B:4:0x0002, B:7:0x0010, B:9:0x0016, B:10:0x001d, B:12:0x002b, B:16:0x004c, B:18:0x0053, B:20:0x005a, B:22:0x0061, B:24:0x0065, B:26:0x0079, B:28:0x0084, B:31:0x0099, B:33:0x00a4, B:35:0x00aa, B:37:0x00b0, B:38:0x00bc, B:40:0x00ca, B:42:0x00d9, B:44:0x00e8, B:45:0x00ee, B:47:0x00fc, B:49:0x0107, B:53:0x0119, B:55:0x011f, B:56:0x0130, B:57:0x0133, B:58:0x013b, B:60:0x0141, B:62:0x0145, B:63:0x014d, B:65:0x0153, B:67:0x0157, B:69:0x0162, B:71:0x0173, B:73:0x0185, B:74:0x021d, B:76:0x0221, B:78:0x0227, B:79:0x022b, B:85:0x0196, B:87:0x01a1, B:88:0x01bd, B:94:0x01dd, B:96:0x01e0, B:97:0x01fc, B:98:0x017d, B:100:0x0167, B:106:0x016f, B:108:0x014a, B:129:0x0112, B:109:0x0113, B:111:0x012d, B:113:0x00b5, B:118:0x00ba, B:120:0x008f, B:124:0x020d, B:126:0x0232, B:51:0x010d, B:127:0x0235, B:115:0x00b8, B:90:0x01d8, B:91:0x01db, B:102:0x016a, B:103:0x016d), top: B:3:0x0002, inners: #0, #2, #3, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final synchronized void afInfoLog() {
        long j;
        Integer num;
        Pair<Integer, Integer> pair;
        Pair<Integer, Integer> pair2;
        String str;
        String str2;
        String str3;
        int i2;
        MatchGroup matchGroup;
        int i3;
        MatchGroup matchGroup2;
        int i4;
        MatchGroup matchGroup3;
        String value;
        Integer intOrNull;
        int i5 = 2 % 2;
        int i6 = i + 71;
        v = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            AFLogger();
            throw null;
        }
        AFh1pSDK AFLogger = AFLogger();
        if (AFLogger != null) {
            j = AFLogger.AFInAppEventType;
            int i7 = 2 % 2;
        } else {
            j = -1;
        }
        if (j < TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
            AFg1pSDK.v$default(AFLogger.INSTANCE, AFg1jSDK.EXCEPTION_MANAGER, "TTL is already passed", false, 4, null);
            d().AFKeystoreWrapper("af_send_exc_to_server_window");
            AFKeystoreWrapper().values();
            return;
        }
        AFh1pSDK AFLogger2 = AFLogger();
        if (AFLogger2 == null || !AFInAppEventType(AFLogger2)) {
            d().AFKeystoreWrapper("af_send_exc_to_server_window");
            AFKeystoreWrapper().values();
        } else {
            AFh1pSDK AFLogger3 = AFLogger();
            if (AFLogger3 == null || (str3 = AFLogger3.values) == null) {
                num = null;
            } else {
                Intrinsics.checkNotNullParameter(str3, "");
                MatchResult matchEntire = new Regex("(\\d+).(\\d+).(\\d+).*").matchEntire(str3);
                if (matchEntire != null) {
                    int i8 = i + 59;
                    v = i8 % 128;
                    if (i8 % 2 != 0) {
                        matchGroup = matchEntire.getGroups().get(0);
                        if (matchGroup != null) {
                            int i9 = v + 53;
                            i = i9 % 128;
                            if (i9 % 2 == 0) {
                                matchGroup.getValue();
                                throw null;
                            }
                            String value2 = matchGroup.getValue();
                            if (value2 != null && (intOrNull = StringsKt.toIntOrNull(value2)) != null) {
                                i3 = intOrNull.intValue();
                                int i10 = i3 * DurationKt.NANOS_IN_MILLIS;
                                matchGroup2 = matchEntire.getGroups().get(2);
                                if (matchGroup2 != null) {
                                    int i11 = i + 57;
                                    v = i11 % 128;
                                    int i12 = i11 % 2;
                                    String value3 = matchGroup2.getValue();
                                    if (value3 != null) {
                                        int i13 = i + 9;
                                        v = i13 % 128;
                                        int i14 = i13 % 2;
                                        Integer intOrNull2 = StringsKt.toIntOrNull(value3);
                                        if (intOrNull2 != null) {
                                            i4 = intOrNull2.intValue();
                                            int i15 = i10 + (i4 * 1000);
                                            matchGroup3 = matchEntire.getGroups().get(3);
                                            if (matchGroup3 != null) {
                                                int i16 = v + 53;
                                                i = i16 % 128;
                                                if (i16 % 2 == 0) {
                                                    value = matchGroup3.getValue();
                                                    int i17 = 81 / 0;
                                                } else {
                                                    value = matchGroup3.getValue();
                                                }
                                                i2 = i15 + r1;
                                            }
                                            int i18 = 2 % 2;
                                            int i19 = 0;
                                            i2 = i15 + i19;
                                        }
                                    }
                                }
                                i4 = 0;
                                int i152 = i10 + (i4 * 1000);
                                matchGroup3 = matchEntire.getGroups().get(3);
                                if (matchGroup3 != null) {
                                }
                                int i182 = 2 % 2;
                                int i192 = 0;
                                i2 = i152 + i192;
                            }
                        }
                        i3 = 0;
                        int i102 = i3 * DurationKt.NANOS_IN_MILLIS;
                        matchGroup2 = matchEntire.getGroups().get(2);
                        if (matchGroup2 != null) {
                        }
                        i4 = 0;
                        int i1522 = i102 + (i4 * 1000);
                        matchGroup3 = matchEntire.getGroups().get(3);
                        if (matchGroup3 != null) {
                        }
                        int i1822 = 2 % 2;
                        int i1922 = 0;
                        i2 = i1522 + i1922;
                    } else {
                        matchGroup = matchEntire.getGroups().get(1);
                    }
                } else {
                    i2 = -1;
                }
                num = Integer.valueOf(i2);
                int i20 = 2 % 2;
            }
            AFh1pSDK AFLogger4 = AFLogger();
            if (AFLogger4 == null || (str2 = AFLogger4.values) == null) {
                int i21 = 2 % 2;
                pair = null;
            } else {
                pair = AFe1zSDK.AFKeystoreWrapper(str2);
            }
            AFh1pSDK AFLogger5 = AFLogger();
            if (AFLogger5 == null || (str = AFLogger5.values) == null) {
                pair2 = null;
            } else {
                int i22 = v + 103;
                i = i22 % 128;
                if (i22 % 2 == 0) {
                    AFe1zSDK.AFInAppEventType(str);
                    obj.hashCode();
                    throw null;
                }
                pair2 = AFe1zSDK.AFInAppEventType(str);
            }
            if (num == null) {
                int i23 = i + 15;
                v = i23 % 128;
                int i24 = i23 % 2;
            }
            if (pair == null) {
                AFKeystoreWrapper().AFInAppEventType(this.AFLogger);
            }
            if (pair != null) {
                int i25 = v + 69;
                i = i25 % 128;
                if (i25 % 2 == 0) {
                    AFKeystoreWrapper().AFKeystoreWrapper(pair.getFirst().intValue(), pair.getSecond().intValue());
                    obj.hashCode();
                    throw null;
                }
                AFKeystoreWrapper().AFKeystoreWrapper(pair.getFirst().intValue(), pair.getSecond().intValue());
            } else if (pair2 != null) {
                AFKeystoreWrapper().AFKeystoreWrapper(pair2.getFirst().intValue(), pair2.getSecond().intValue());
            } else {
                d().AFKeystoreWrapper("af_send_exc_to_server_window");
                AFKeystoreWrapper().values();
            }
        }
        AFd1hSDK.AFa1ySDK aFa1ySDK = this.unregisterClient;
        if (aFa1ySDK != null) {
            AFh1pSDK AFLogger6 = AFLogger();
            aFa1ySDK.onConfigurationChanged(AFLogger6 != null ? values(AFLogger6) : false);
        }
    }

    private final void w() {
        int i2 = 2 % 2;
        int i3 = v + 3;
        i = i3 % 128;
        int i4 = i3 % 2;
        AFh1pSDK AFLogger = AFLogger();
        if (AFLogger != null) {
            int i5 = v + 87;
            i = i5 % 128;
            if (i5 % 2 != 0) {
                if (!AFKeystoreWrapper(AFLogger)) {
                    AFg1pSDK.v$default(AFLogger.INSTANCE, AFg1jSDK.EXCEPTION_MANAGER, "skipping", false, 4, null);
                    return;
                }
                String str = e().unregisterClient;
                if (str != null) {
                    String jSONObject = new JSONObject(valueOf(AFInAppEventParameterName(AFLogger), AFKeystoreWrapper().AFKeystoreWrapper())).toString();
                    Intrinsics.checkNotNullExpressionValue(jSONObject, "");
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    valueOf(jSONObject, str);
                    return;
                }
                return;
            }
            AFKeystoreWrapper(AFLogger);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private final synchronized void v() {
        boolean z;
        int i2 = 2 % 2;
        int i3 = i + 45;
        v = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            AFLogger();
            throw null;
        }
        AFh1pSDK AFLogger = AFLogger();
        if (AFLogger != null) {
            if (AFLogger.AFInAppEventParameterName == -1) {
                int i4 = v + 63;
                i = i4 % 128;
                if (i4 % 2 == 0) {
                    d().AFKeystoreWrapper("af_send_exc_to_server_window");
                    obj.hashCode();
                    throw null;
                }
                d().AFKeystoreWrapper("af_send_exc_to_server_window");
                int i5 = 2 % 2;
            } else if (d().AFInAppEventType("af_send_exc_to_server_window", -1L) == -1) {
                valueOf(AFLogger);
            }
            z = values(AFLogger);
        } else {
            int i6 = i + 81;
            v = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            z = false;
        }
        AFd1hSDK.AFa1ySDK aFa1ySDK = this.unregisterClient;
        if (aFa1ySDK != null) {
            int i9 = i + 85;
            v = i9 % 128;
            int i10 = i9 % 2;
            aFa1ySDK.onConfigurationChanged(z);
            return;
        }
        return;
    }

    private final void valueOf(AFh1pSDK aFh1pSDK) {
        int i2 = 2 % 2;
        int i3 = v + 27;
        i = i3 % 128;
        int i4 = i3 % 2;
        int i5 = aFh1pSDK.AFKeystoreWrapper;
        long currentTimeMillis = System.currentTimeMillis() + TimeUnit.DAYS.toMillis(aFh1pSDK.AFInAppEventParameterName);
        AFd1xSDK d = d();
        d.AFInAppEventParameterName("af_send_exc_to_server_window", currentTimeMillis);
        d.AFInAppEventParameterName("af_send_exc_min", i5);
        int i6 = v + 25;
        i = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 9 / 0;
        }
    }

    private final Map<String, String> AFInAppEventParameterName(AFh1pSDK aFh1pSDK) {
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        a(new int[]{1161035676, 1494396897, 1699181089, -696007385}, TextUtils.getOffsetBefore("", 0) + 5, objArr);
        AFd1pSDK valueOf = valueOf();
        Map<String, String> mapOf = MapsKt.mapOf(TuplesKt.to(((String) objArr[0]).intern(), Build.BRAND), TuplesKt.to("model", Build.MODEL), TuplesKt.to("app_id", valueOf().AFInAppEventParameterName.AFKeystoreWrapper.getPackageName()), TuplesKt.to("p_ex", new AFb1aSDK().AFInAppEventParameterName()), TuplesKt.to("api", String.valueOf(Build.VERSION.SDK_INT)), TuplesKt.to("sdk", this.AFLogger), TuplesKt.to("uid", AFb1iSDK.AFKeystoreWrapper(valueOf.AFInAppEventParameterName, valueOf.valueOf)), TuplesKt.to("exc_config", aFh1pSDK.AFKeystoreWrapper()));
        int i3 = i + 15;
        v = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 91 / 0;
        }
        return mapOf;
    }

    private static Map<String, Object> valueOf(Map<String, ? extends Object> map, List<AFd1lSDK> list) {
        int i2 = 2 % 2;
        int i3 = i + 107;
        v = i3 % 128;
        if (i3 % 2 == 0) {
            return MapsKt.mapOf(TuplesKt.to("deviceInfo", map), TuplesKt.to("excs", AFd1cSDK.AFInAppEventParameterName(list)));
        }
        Pair[] pairArr = new Pair[3];
        pairArr[1] = TuplesKt.to("deviceInfo", map);
        pairArr[0] = TuplesKt.to("excs", AFd1cSDK.AFInAppEventParameterName(list));
        return MapsKt.mapOf(pairArr);
    }

    private final boolean AFKeystoreWrapper(AFh1pSDK aFh1pSDK) {
        int i2 = 2 % 2;
        int i3 = v + 105;
        i = i3 % 128;
        int i4 = i3 % 2;
        long currentTimeMillis = System.currentTimeMillis();
        long AFInAppEventType = d().AFInAppEventType("af_send_exc_to_server_window", -1L);
        if (aFh1pSDK.AFInAppEventType >= TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis) && AFInAppEventType != -1 && AFInAppEventType >= currentTimeMillis) {
            int AFKeystoreWrapper = d().AFKeystoreWrapper("af_send_exc_min", -1);
            if (AFKeystoreWrapper != -1) {
                int i5 = i + 113;
                v = i5 % 128;
                if (i5 % 2 != 0) {
                    AFKeystoreWrapper().AFInAppEventParameterName();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (AFKeystoreWrapper().AFInAppEventParameterName() >= AFKeystoreWrapper) {
                    return AFInAppEventType(aFh1pSDK);
                }
            }
            int i6 = i + 85;
            v = i6 % 128;
            int i7 = i6 % 2;
        }
        return false;
    }

    private final boolean values(AFh1pSDK aFh1pSDK) {
        int i2 = 2 % 2;
        int i3 = v + 47;
        i = i3 % 128;
        int i4 = i3 % 2;
        long currentTimeMillis = System.currentTimeMillis();
        long AFInAppEventType = d().AFInAppEventType("af_send_exc_to_server_window", -1L);
        if (aFh1pSDK.AFInAppEventType < TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis)) {
            return false;
        }
        if (AFInAppEventType != -1 && AFInAppEventType >= currentTimeMillis) {
            return AFInAppEventType(aFh1pSDK);
        }
        int i5 = v + 71;
        i = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    private final boolean AFInAppEventType(AFh1pSDK aFh1pSDK) {
        int i2 = 2 % 2;
        new AFd1dSDK();
        String str = this.AFLogger;
        String str2 = aFh1pSDK.values;
        Intrinsics.checkNotNullExpressionValue(str2, "");
        boolean AFInAppEventType = AFd1dSDK.AFInAppEventType(str, str2);
        int i3 = i + 105;
        v = i3 % 128;
        if (i3 % 2 == 0) {
            return AFInAppEventType;
        }
        throw null;
    }

    private final AFh1pSDK AFLogger() {
        int i2 = 2 % 2;
        AFh1oSDK aFh1oSDK = values().AFInAppEventParameterName.valueOf;
        Object obj = null;
        if (aFh1oSDK != null) {
            int i3 = v + 63;
            i = i3 % 128;
            int i4 = i3 % 2;
            AFh1qSDK aFh1qSDK = aFh1oSDK.AFInAppEventParameterName;
            if (aFh1qSDK != null) {
                int i5 = v + 89;
                i = i5 % 128;
                int i6 = i5 % 2;
                AFh1pSDK aFh1pSDK = aFh1qSDK.AFKeystoreWrapper;
                if (i6 != 0) {
                    return aFh1pSDK;
                }
                obj.hashCode();
                throw null;
            }
        }
        int i7 = v + 73;
        i = i7 % 128;
        if (i7 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private final void valueOf(String str, String str2) {
        int i2 = 2 % 2;
        int i3 = v + 5;
        i = i3 % 128;
        int i4 = i3 % 2;
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        registerClient().AFInAppEventParameterName(bytes, MapsKt.mapOf(TuplesKt.to(HttpHeaders.AUTHORIZATION, AFb1lSDK.AFInAppEventParameterName(str, str2))), 2000);
        int i5 = v + 45;
        i = i5 % 128;
        int i6 = i5 % 2;
    }

    private static void a(int[] iArr, int i2, Object[] objArr) {
        int i3 = 2 % 2;
        AFj1xSDK aFj1xSDK = new AFj1xSDK();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = afInfoLog;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            for (int i4 = 0; i4 < length; i4++) {
                int i5 = $11 + 43;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                iArr3[i4] = (int) (iArr2[i4] ^ 1030351785054471086L);
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = afInfoLog;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i7 = 0; i7 < length3; i7++) {
                int i8 = $11 + 9;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                iArr6[i7] = (int) (iArr5[i7] ^ 1030351785054471086L);
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        aFj1xSDK.AFKeystoreWrapper = 0;
        while (aFj1xSDK.AFKeystoreWrapper < iArr.length) {
            int i10 = $11 + 67;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            cArr[0] = (char) (iArr[aFj1xSDK.AFKeystoreWrapper] >> 16);
            cArr[1] = (char) iArr[aFj1xSDK.AFKeystoreWrapper];
            cArr[2] = (char) (iArr[aFj1xSDK.AFKeystoreWrapper + 1] >> 16);
            cArr[3] = (char) iArr[aFj1xSDK.AFKeystoreWrapper + 1];
            aFj1xSDK.values = (cArr[0] << 16) + cArr[1];
            aFj1xSDK.AFInAppEventType = (cArr[2] << 16) + cArr[3];
            AFj1xSDK.values(iArr4);
            for (int i12 = 0; i12 < 16; i12++) {
                int i13 = $11 + TypedValues.TYPE_TARGET;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                aFj1xSDK.values ^= iArr4[i12];
                aFj1xSDK.AFInAppEventType = AFj1xSDK.AFKeystoreWrapper(aFj1xSDK.values) ^ aFj1xSDK.AFInAppEventType;
                int i15 = aFj1xSDK.values;
                aFj1xSDK.values = aFj1xSDK.AFInAppEventType;
                aFj1xSDK.AFInAppEventType = i15;
            }
            int i16 = aFj1xSDK.values;
            aFj1xSDK.values = aFj1xSDK.AFInAppEventType;
            aFj1xSDK.AFInAppEventType = i16;
            aFj1xSDK.AFInAppEventType ^= iArr4[16];
            aFj1xSDK.values ^= iArr4[17];
            int i17 = aFj1xSDK.values;
            int i18 = aFj1xSDK.AFInAppEventType;
            cArr[0] = (char) (aFj1xSDK.values >>> 16);
            cArr[1] = (char) aFj1xSDK.values;
            cArr[2] = (char) (aFj1xSDK.AFInAppEventType >>> 16);
            cArr[3] = (char) aFj1xSDK.AFInAppEventType;
            AFj1xSDK.values(iArr4);
            cArr2[aFj1xSDK.AFKeystoreWrapper * 2] = cArr[0];
            cArr2[(aFj1xSDK.AFKeystoreWrapper * 2) + 1] = cArr[1];
            cArr2[(aFj1xSDK.AFKeystoreWrapper * 2) + 2] = cArr[2];
            cArr2[(aFj1xSDK.AFKeystoreWrapper * 2) + 3] = cArr[3];
            aFj1xSDK.AFKeystoreWrapper += 2;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }
}
