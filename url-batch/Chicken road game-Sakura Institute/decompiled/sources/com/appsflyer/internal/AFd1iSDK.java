package com.appsflyer.internal;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1jSDK;
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
public final class AFd1iSDK implements AFd1jSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long afInfoLog = -3294779024785760528L;
    private static int force = 680283152;
    private static char i = 19472;
    private static int v = 0;
    private static int w = 1;
    private final Lazy AFInAppEventParameterName;
    private final Lazy AFInAppEventType;
    private AFd1kSDK AFKeystoreWrapper;
    private AFd1jSDK.AFa1zSDK AFLogger;
    private final Lazy d;
    private final Lazy e;
    private final String registerClient;
    private final Lazy unregisterClient;
    private final Lazy valueOf;
    private final Lazy values;

    public AFd1iSDK(AFd1kSDK aFd1kSDK) {
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        this.AFKeystoreWrapper = aFd1kSDK;
        this.values = LazyKt.lazy(new Function0<AFf1bSDK>() { // from class: com.appsflyer.internal.AFd1iSDK.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: valueOf, reason: merged with bridge method [inline-methods] */
            public final AFf1bSDK invoke() {
                AFf1bSDK registerClient = AFd1iSDK.AFKeystoreWrapper(AFd1iSDK.this).registerClient();
                Intrinsics.checkNotNullExpressionValue(registerClient, "");
                return registerClient;
            }
        });
        this.AFInAppEventType = LazyKt.lazy(new Function0<AFd1sSDK>() { // from class: com.appsflyer.internal.AFd1iSDK.5
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: values, reason: merged with bridge method [inline-methods] */
            public final AFd1sSDK invoke() {
                AFd1sSDK AFInAppEventType = AFd1iSDK.AFKeystoreWrapper(AFd1iSDK.this).AFInAppEventType();
                Intrinsics.checkNotNullExpressionValue(AFInAppEventType, "");
                return AFInAppEventType;
            }
        });
        this.AFInAppEventParameterName = LazyKt.lazy(new Function0<AFd1qSDK>() { // from class: com.appsflyer.internal.AFd1iSDK.3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: values, reason: merged with bridge method [inline-methods] */
            public final AFd1qSDK invoke() {
                AFd1qSDK valueOf = AFd1iSDK.AFKeystoreWrapper(AFd1iSDK.this).valueOf();
                Intrinsics.checkNotNullExpressionValue(valueOf, "");
                return valueOf;
            }
        });
        this.valueOf = LazyKt.lazy(new Function0<AFg1wSDK>() { // from class: com.appsflyer.internal.AFd1iSDK.8
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
            public final AFg1wSDK invoke() {
                AFg1wSDK i2 = AFd1iSDK.AFKeystoreWrapper(AFd1iSDK.this).i();
                Intrinsics.checkNotNullExpressionValue(i2, "");
                return i2;
            }
        });
        this.unregisterClient = LazyKt.lazy(new Function0<ExecutorService>() { // from class: com.appsflyer.internal.AFd1iSDK.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: valueOf, reason: merged with bridge method [inline-methods] */
            public final ExecutorService invoke() {
                ExecutorService values = AFd1iSDK.AFKeystoreWrapper(AFd1iSDK.this).values();
                Intrinsics.checkNotNullExpressionValue(values, "");
                return values;
            }
        });
        this.registerClient = "6.14.0";
        this.d = LazyKt.lazy(new Function0<AFd1hSDK>() { // from class: com.appsflyer.internal.AFd1iSDK.4
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: AFInAppEventParameterName, reason: merged with bridge method [inline-methods] */
            public final AFd1hSDK invoke() {
                AFd1lSDK w2 = AFd1iSDK.AFKeystoreWrapper(AFd1iSDK.this).w();
                Intrinsics.checkNotNullExpressionValue(w2, "");
                return new AFd1hSDK(w2);
            }
        });
        this.e = LazyKt.lazy(new Function0<AFd1cSDK>() { // from class: com.appsflyer.internal.AFd1iSDK.7
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
            public final AFd1cSDK invoke() {
                return new AFd1cSDK(AFd1iSDK.this.valueOf());
            }
        });
    }

    public static final /* synthetic */ AFd1kSDK AFKeystoreWrapper(AFd1iSDK aFd1iSDK) {
        int i2 = 2 % 2;
        int i3 = v + 25;
        int i4 = i3 % 128;
        w = i4;
        int i5 = i3 % 2;
        AFd1kSDK aFd1kSDK = aFd1iSDK.AFKeystoreWrapper;
        if (i5 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i4 + 87;
        v = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 67 / 0;
        }
        return aFd1kSDK;
    }

    private final AFf1bSDK AFKeystoreWrapper() {
        int i2 = 2 % 2;
        int i3 = w + 95;
        v = i3 % 128;
        int i4 = i3 % 2;
        AFf1bSDK aFf1bSDK = (AFf1bSDK) this.values.getValue();
        int i5 = w + 41;
        v = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 64 / 0;
        }
        return aFf1bSDK;
    }

    private final AFd1sSDK values() {
        int i2 = 2 % 2;
        int i3 = w + 81;
        v = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        AFd1sSDK aFd1sSDK = (AFd1sSDK) this.AFInAppEventType.getValue();
        int i4 = v + 29;
        w = i4 % 128;
        if (i4 % 2 != 0) {
            return aFd1sSDK;
        }
        throw null;
    }

    private final AFd1qSDK registerClient() {
        int i2 = 2 % 2;
        int i3 = v + 123;
        w = i3 % 128;
        int i4 = i3 % 2;
        AFd1qSDK aFd1qSDK = (AFd1qSDK) this.AFInAppEventParameterName.getValue();
        int i5 = v + 37;
        w = i5 % 128;
        int i6 = i5 % 2;
        return aFd1qSDK;
    }

    private final AFg1wSDK unregisterClient() {
        int i2 = 2 % 2;
        int i3 = v + 123;
        w = i3 % 128;
        int i4 = i3 % 2;
        AFg1wSDK aFg1wSDK = (AFg1wSDK) this.valueOf.getValue();
        int i5 = v + 25;
        w = i5 % 128;
        int i6 = i5 % 2;
        return aFg1wSDK;
    }

    private final ExecutorService AFLogger() {
        int i2 = 2 % 2;
        int i3 = w + 15;
        v = i3 % 128;
        int i4 = i3 % 2;
        ExecutorService executorService = (ExecutorService) this.unregisterClient.getValue();
        int i5 = w + 101;
        v = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 89 / 0;
        }
        return executorService;
    }

    public final AFd1gSDK valueOf() {
        int i2 = 2 % 2;
        int i3 = v + 41;
        w = i3 % 128;
        int i4 = i3 % 2;
        AFd1gSDK aFd1gSDK = (AFd1gSDK) this.d.getValue();
        if (i4 != 0) {
            return aFd1gSDK;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private AFd1bSDK d() {
        int i2 = 2 % 2;
        int i3 = w + 39;
        v = i3 % 128;
        int i4 = i3 % 2;
        AFd1bSDK aFd1bSDK = (AFd1bSDK) this.e.getValue();
        int i5 = w + 17;
        v = i5 % 128;
        int i6 = i5 % 2;
        return aFd1bSDK;
    }

    @Override // com.appsflyer.internal.AFd1jSDK
    public final void values(final Throwable th, final String str) {
        int i2 = 2 % 2;
        int i3 = v + 9;
        w = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(th, "");
            Intrinsics.checkNotNullParameter(str, "");
            AFLogger().execute(new Runnable() { // from class: com.appsflyer.internal.AFd1iSDK$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1iSDK.AFInAppEventParameterName(AFd1iSDK.this, th, str);
                }
            });
        } else {
            Intrinsics.checkNotNullParameter(th, "");
            Intrinsics.checkNotNullParameter(str, "");
            AFLogger().execute(new Runnable() { // from class: com.appsflyer.internal.AFd1iSDK$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1iSDK.AFInAppEventParameterName(AFd1iSDK.this, th, str);
                }
            });
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFInAppEventParameterName(AFd1iSDK aFd1iSDK, Throwable th, String str) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(aFd1iSDK, "");
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        AFh1fSDK e = aFd1iSDK.e();
        if (e == null || !aFd1iSDK.AFKeystoreWrapper(e)) {
            return;
        }
        int i3 = w + 103;
        int i4 = i3 % 128;
        v = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 93;
        int i7 = i6 % 128;
        w = i7;
        int i8 = i6 % 2;
        int i9 = i7 + 3;
        v = i9 % 128;
        int i10 = i9 % 2;
        aFd1iSDK.valueOf().AFInAppEventParameterName(th, str);
    }

    @Override // com.appsflyer.internal.AFd1jSDK
    public final void values(AFd1jSDK.AFa1zSDK aFa1zSDK) {
        int i2 = 2 % 2;
        int i3 = w + 77;
        v = i3 % 128;
        if (i3 % 2 == 0) {
            this.AFLogger = aFa1zSDK;
            AFLogger().execute(new Runnable() { // from class: com.appsflyer.internal.AFd1iSDK$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1iSDK.AFInAppEventType(AFd1iSDK.this);
                }
            });
        } else {
            this.AFLogger = aFa1zSDK;
            AFLogger().execute(new Runnable() { // from class: com.appsflyer.internal.AFd1iSDK$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1iSDK.AFInAppEventType(AFd1iSDK.this);
                }
            });
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFInAppEventType(AFd1iSDK aFd1iSDK) {
        int i2 = 2 % 2;
        int i3 = v + 93;
        w = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(aFd1iSDK, "");
        aFd1iSDK.w();
        int i5 = w + 35;
        v = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 87 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFd1jSDK
    public final void AFInAppEventType() {
        int i2 = 2 % 2;
        int i3 = w + 103;
        v = i3 % 128;
        int i4 = i3 % 2;
        AFLogger().execute(new Runnable() { // from class: com.appsflyer.internal.AFd1iSDK$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AFd1iSDK.values(AFd1iSDK.this);
            }
        });
        int i5 = w + 95;
        v = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void values(AFd1iSDK aFd1iSDK) {
        int i2 = 2 % 2;
        int i3 = v + 59;
        w = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(aFd1iSDK, "");
            aFd1iSDK.i();
            throw null;
        }
        Intrinsics.checkNotNullParameter(aFd1iSDK, "");
        aFd1iSDK.i();
        int i4 = w + 51;
        v = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.internal.AFd1jSDK
    public final void AFInAppEventParameterName() {
        int i2 = 2 % 2;
        int i3 = w + 67;
        v = i3 % 128;
        int i4 = i3 % 2;
        AFLogger().execute(new Runnable() { // from class: com.appsflyer.internal.AFd1iSDK$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AFd1iSDK.valueOf(AFd1iSDK.this);
            }
        });
        int i5 = v + 99;
        w = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 95 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void valueOf(AFd1iSDK aFd1iSDK) {
        int i2 = 2 % 2;
        int i3 = v + 69;
        w = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(aFd1iSDK, "");
        aFd1iSDK.v();
        int i5 = v + 63;
        w = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0145, code lost:
    
        if (r1.intValue() != (-1)) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00fb, code lost:
    
        if (r1 != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0065, code lost:
    
        if (AFInAppEventType(r1) == true) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f2, code lost:
    
        if (r1 != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fd, code lost:
    
        r1 = r1.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01fa, code lost:
    
        if (r0 != null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0205, code lost:
    
        r2 = AFKeystoreWrapper(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0203, code lost:
    
        if (r0 != null) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0141 A[Catch: all -> 0x0210, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x000a, B:7:0x000f, B:9:0x001d, B:13:0x0047, B:15:0x004e, B:17:0x005a, B:20:0x0067, B:22:0x006f, B:24:0x0073, B:26:0x0087, B:28:0x009a, B:30:0x00a0, B:32:0x00a6, B:33:0x00ac, B:35:0x00ba, B:37:0x00c0, B:39:0x00c6, B:40:0x00cc, B:42:0x00da, B:44:0x00e0, B:46:0x00eb, B:51:0x00fd, B:52:0x0103, B:53:0x0106, B:54:0x010c, B:56:0x0112, B:58:0x011f, B:59:0x0127, B:61:0x012d, B:63:0x0131, B:65:0x0137, B:67:0x0149, B:68:0x01e4, B:70:0x01e8, B:72:0x01f3, B:77:0x0209, B:80:0x0205, B:83:0x01fe, B:84:0x01ff, B:89:0x015a, B:91:0x0165, B:97:0x0185, B:98:0x0186, B:100:0x01a4, B:101:0x01c0, B:102:0x01d0, B:103:0x0141, B:105:0x0124, B:108:0x00f6, B:109:0x00f7, B:116:0x0061, B:118:0x01d3, B:94:0x0182, B:49:0x00f1, B:75:0x01f9), top: B:3:0x0002, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0137 A[Catch: all -> 0x0210, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x000a, B:7:0x000f, B:9:0x001d, B:13:0x0047, B:15:0x004e, B:17:0x005a, B:20:0x0067, B:22:0x006f, B:24:0x0073, B:26:0x0087, B:28:0x009a, B:30:0x00a0, B:32:0x00a6, B:33:0x00ac, B:35:0x00ba, B:37:0x00c0, B:39:0x00c6, B:40:0x00cc, B:42:0x00da, B:44:0x00e0, B:46:0x00eb, B:51:0x00fd, B:52:0x0103, B:53:0x0106, B:54:0x010c, B:56:0x0112, B:58:0x011f, B:59:0x0127, B:61:0x012d, B:63:0x0131, B:65:0x0137, B:67:0x0149, B:68:0x01e4, B:70:0x01e8, B:72:0x01f3, B:77:0x0209, B:80:0x0205, B:83:0x01fe, B:84:0x01ff, B:89:0x015a, B:91:0x0165, B:97:0x0185, B:98:0x0186, B:100:0x01a4, B:101:0x01c0, B:102:0x01d0, B:103:0x0141, B:105:0x0124, B:108:0x00f6, B:109:0x00f7, B:116:0x0061, B:118:0x01d3, B:94:0x0182, B:49:0x00f1, B:75:0x01f9), top: B:3:0x0002, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0149 A[Catch: all -> 0x0210, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x000a, B:7:0x000f, B:9:0x001d, B:13:0x0047, B:15:0x004e, B:17:0x005a, B:20:0x0067, B:22:0x006f, B:24:0x0073, B:26:0x0087, B:28:0x009a, B:30:0x00a0, B:32:0x00a6, B:33:0x00ac, B:35:0x00ba, B:37:0x00c0, B:39:0x00c6, B:40:0x00cc, B:42:0x00da, B:44:0x00e0, B:46:0x00eb, B:51:0x00fd, B:52:0x0103, B:53:0x0106, B:54:0x010c, B:56:0x0112, B:58:0x011f, B:59:0x0127, B:61:0x012d, B:63:0x0131, B:65:0x0137, B:67:0x0149, B:68:0x01e4, B:70:0x01e8, B:72:0x01f3, B:77:0x0209, B:80:0x0205, B:83:0x01fe, B:84:0x01ff, B:89:0x015a, B:91:0x0165, B:97:0x0185, B:98:0x0186, B:100:0x01a4, B:101:0x01c0, B:102:0x01d0, B:103:0x0141, B:105:0x0124, B:108:0x00f6, B:109:0x00f7, B:116:0x0061, B:118:0x01d3, B:94:0x0182, B:49:0x00f1, B:75:0x01f9), top: B:3:0x0002, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e8 A[Catch: all -> 0x0210, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x000a, B:7:0x000f, B:9:0x001d, B:13:0x0047, B:15:0x004e, B:17:0x005a, B:20:0x0067, B:22:0x006f, B:24:0x0073, B:26:0x0087, B:28:0x009a, B:30:0x00a0, B:32:0x00a6, B:33:0x00ac, B:35:0x00ba, B:37:0x00c0, B:39:0x00c6, B:40:0x00cc, B:42:0x00da, B:44:0x00e0, B:46:0x00eb, B:51:0x00fd, B:52:0x0103, B:53:0x0106, B:54:0x010c, B:56:0x0112, B:58:0x011f, B:59:0x0127, B:61:0x012d, B:63:0x0131, B:65:0x0137, B:67:0x0149, B:68:0x01e4, B:70:0x01e8, B:72:0x01f3, B:77:0x0209, B:80:0x0205, B:83:0x01fe, B:84:0x01ff, B:89:0x015a, B:91:0x0165, B:97:0x0185, B:98:0x0186, B:100:0x01a4, B:101:0x01c0, B:102:0x01d0, B:103:0x0141, B:105:0x0124, B:108:0x00f6, B:109:0x00f7, B:116:0x0061, B:118:0x01d3, B:94:0x0182, B:49:0x00f1, B:75:0x01f9), top: B:3:0x0002, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x020e A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x015a A[Catch: all -> 0x0210, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x000a, B:7:0x000f, B:9:0x001d, B:13:0x0047, B:15:0x004e, B:17:0x005a, B:20:0x0067, B:22:0x006f, B:24:0x0073, B:26:0x0087, B:28:0x009a, B:30:0x00a0, B:32:0x00a6, B:33:0x00ac, B:35:0x00ba, B:37:0x00c0, B:39:0x00c6, B:40:0x00cc, B:42:0x00da, B:44:0x00e0, B:46:0x00eb, B:51:0x00fd, B:52:0x0103, B:53:0x0106, B:54:0x010c, B:56:0x0112, B:58:0x011f, B:59:0x0127, B:61:0x012d, B:63:0x0131, B:65:0x0137, B:67:0x0149, B:68:0x01e4, B:70:0x01e8, B:72:0x01f3, B:77:0x0209, B:80:0x0205, B:83:0x01fe, B:84:0x01ff, B:89:0x015a, B:91:0x0165, B:97:0x0185, B:98:0x0186, B:100:0x01a4, B:101:0x01c0, B:102:0x01d0, B:103:0x0141, B:105:0x0124, B:108:0x00f6, B:109:0x00f7, B:116:0x0061, B:118:0x01d3, B:94:0x0182, B:49:0x00f1, B:75:0x01f9), top: B:3:0x0002, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final synchronized void w() {
        AFd1jSDK.AFa1zSDK aFa1zSDK;
        AFh1fSDK e;
        Integer num;
        Pair<Integer, Integer> pair;
        AFh1fSDK e2;
        String str;
        String str2;
        int i2;
        String value;
        Integer intOrNull;
        String value2;
        Integer intOrNull2;
        String value3;
        Integer intOrNull3;
        int i3 = 2 % 2;
        AFh1fSDK e3 = e();
        if ((e3 != null ? e3.AFInAppEventParameterName : -1L) < TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
            int i4 = w + 81;
            v = i4 % 128;
            int i5 = i4 % 2;
            AFg1fSDK.v$default(AFLogger.INSTANCE, AFg1aSDK.EXCEPTION_MANAGER, "TTL is already passed", false, 4, null);
            registerClient().AFKeystoreWrapper("af_send_exc_to_server_window");
            valueOf().AFInAppEventType();
            return;
        }
        AFh1fSDK e4 = e();
        boolean z = false;
        if (e4 != null) {
            int i6 = w + 107;
            v = i6 % 128;
            if (i6 % 2 != 0) {
                if (!AFInAppEventType(e4)) {
                    AFh1fSDK e5 = e();
                    Pair<Integer, Integer> pair2 = null;
                    if (e5 == null || (str2 = e5.AFKeystoreWrapper) == null) {
                        num = null;
                    } else {
                        Intrinsics.checkNotNullParameter(str2, "");
                        MatchResult matchEntire = new Regex("(\\d+).(\\d+).(\\d+).*").matchEntire(str2);
                        if (matchEntire != null) {
                            int i7 = w + 41;
                            v = i7 % 128;
                            int i8 = i7 % 2;
                            MatchGroup matchGroup = matchEntire.getGroups().get(1);
                            int intValue = ((matchGroup == null || (value3 = matchGroup.getValue()) == null || (intOrNull3 = StringsKt.toIntOrNull(value3)) == null) ? 0 : intOrNull3.intValue()) * DurationKt.NANOS_IN_MILLIS;
                            MatchGroup matchGroup2 = matchEntire.getGroups().get(2);
                            int intValue2 = intValue + (((matchGroup2 == null || (value2 = matchGroup2.getValue()) == null || (intOrNull2 = StringsKt.toIntOrNull(value2)) == null) ? 0 : intOrNull2.intValue()) * 1000);
                            MatchGroup matchGroup3 = matchEntire.getGroups().get(3);
                            if (matchGroup3 != null && (value = matchGroup3.getValue()) != null) {
                                int i9 = w + 93;
                                v = i9 % 128;
                                if (i9 % 2 != 0) {
                                    intOrNull = StringsKt.toIntOrNull(value);
                                    int i10 = 15 / 0;
                                } else {
                                    intOrNull = StringsKt.toIntOrNull(value);
                                }
                                i2 = intValue2 + r1;
                            }
                            int i11 = 0;
                            i2 = intValue2 + i11;
                        } else {
                            i2 = -1;
                        }
                        num = Integer.valueOf(i2);
                    }
                    AFh1fSDK e6 = e();
                    if (e6 != null) {
                        int i12 = w + 29;
                        v = i12 % 128;
                        int i13 = i12 % 2;
                        String str3 = e6.AFKeystoreWrapper;
                        if (str3 != null) {
                            pair = AFe1vSDK.values(str3);
                            e2 = e();
                            if (e2 != null && (str = e2.AFKeystoreWrapper) != null) {
                                pair2 = AFe1vSDK.valueOf(str);
                            }
                            if (num != null) {
                                int i14 = v + 67;
                                w = i14 % 128;
                                int i15 = i14 % 2;
                            }
                            if (pair == null) {
                                valueOf().AFInAppEventType(this.registerClient);
                            }
                            if (pair == null) {
                                int i16 = w + 39;
                                v = i16 % 128;
                                if (i16 % 2 != 0) {
                                    valueOf().AFInAppEventType(pair.getFirst().intValue(), pair.getSecond().intValue());
                                    int i17 = 38 / 0;
                                } else {
                                    valueOf().AFInAppEventType(pair.getFirst().intValue(), pair.getSecond().intValue());
                                }
                            } else if (pair2 != null) {
                                valueOf().AFInAppEventType(pair2.getFirst().intValue(), pair2.getSecond().intValue());
                            } else {
                                registerClient().AFKeystoreWrapper("af_send_exc_to_server_window");
                                valueOf().AFInAppEventType();
                                int i18 = 2 % 2;
                            }
                        }
                    }
                    int i19 = 2 % 2;
                    pair = null;
                    e2 = e();
                    if (e2 != null) {
                        pair2 = AFe1vSDK.valueOf(str);
                    }
                    if (num != null) {
                    }
                    if (pair == null) {
                    }
                    if (pair == null) {
                    }
                }
            }
            aFa1zSDK = this.AFLogger;
            if (aFa1zSDK == null) {
                int i20 = w + 85;
                v = i20 % 128;
                if (i20 % 2 != 0) {
                    e = e();
                    int i21 = 34 / 0;
                } else {
                    e = e();
                }
                aFa1zSDK.onConfigurationChanged(z);
                return;
            }
            return;
        }
        registerClient().AFKeystoreWrapper("af_send_exc_to_server_window");
        valueOf().AFInAppEventType();
        int i182 = 2 % 2;
        aFa1zSDK = this.AFLogger;
        if (aFa1zSDK == null) {
        }
    }

    private final void i() {
        int i2 = 2 % 2;
        int i3 = v + 51;
        w = i3 % 128;
        int i4 = i3 % 2;
        AFh1fSDK e = e();
        if (e != null) {
            if (!(!values(e))) {
                int i5 = v + 81;
                w = i5 % 128;
                int i6 = i5 % 2;
                String str = unregisterClient().AFLogger;
                if (str != null) {
                    String jSONObject = new JSONObject(AFInAppEventParameterName(AFInAppEventParameterName(e), valueOf().AFInAppEventParameterName())).toString();
                    Intrinsics.checkNotNullExpressionValue(jSONObject, "");
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    valueOf(jSONObject, str);
                    return;
                }
                return;
            }
            AFg1fSDK.v$default(AFLogger.INSTANCE, AFg1aSDK.EXCEPTION_MANAGER, "skipping", false, 4, null);
            int i7 = w + 57;
            v = i7 % 128;
            if (i7 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private final synchronized void v() {
        boolean z;
        int i2 = 2 % 2;
        int i3 = v + 121;
        w = i3 % 128;
        int i4 = i3 % 2;
        AFh1fSDK e = e();
        if (e != null) {
            if (e.AFInAppEventType == -1) {
                registerClient().AFKeystoreWrapper("af_send_exc_to_server_window");
            } else if (registerClient().values("af_send_exc_to_server_window", -1L) == -1) {
                valueOf(e);
                int i5 = 2 % 2;
            }
            z = AFKeystoreWrapper(e);
            int i6 = w + 13;
            v = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        } else {
            z = false;
        }
        AFd1jSDK.AFa1zSDK aFa1zSDK = this.AFLogger;
        if (aFa1zSDK != null) {
            int i9 = w + 11;
            v = i9 % 128;
            int i10 = i9 % 2;
            aFa1zSDK.onConfigurationChanged(z);
        }
    }

    private final void valueOf(AFh1fSDK aFh1fSDK) {
        int i2;
        long currentTimeMillis;
        int i3 = 2 % 2;
        int i4 = v + 83;
        w = i4 % 128;
        if (i4 % 2 == 0) {
            i2 = aFh1fSDK.valueOf;
            currentTimeMillis = System.currentTimeMillis() * TimeUnit.DAYS.toMillis(aFh1fSDK.AFInAppEventType);
        } else {
            i2 = aFh1fSDK.valueOf;
            currentTimeMillis = System.currentTimeMillis() + TimeUnit.DAYS.toMillis(aFh1fSDK.AFInAppEventType);
        }
        AFd1qSDK registerClient = registerClient();
        registerClient.AFKeystoreWrapper("af_send_exc_to_server_window", currentTimeMillis);
        registerClient.AFInAppEventParameterName("af_send_exc_min", i2);
    }

    private final Map<String, String> AFInAppEventParameterName(AFh1fSDK aFh1fSDK) {
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        a(View.MeasureSpec.makeMeasureSpec(0, 0) - 801052847, (char) (TextUtils.indexOf("", "", 0, 0) + 25652), "텤\ue8cd㘏跣艷", "틠\udeb0羳༈", "册䃧㓐蹤", objArr);
        AFd1sSDK values = values();
        Map<String, String> mapOf = MapsKt.mapOf(TuplesKt.to(((String) objArr[0]).intern(), Build.BRAND), TuplesKt.to("model", Build.MODEL), TuplesKt.to("app_id", values().valueOf.AFKeystoreWrapper.getPackageName()), TuplesKt.to("p_ex", new AFb1hSDK().valueOf()), TuplesKt.to("api", String.valueOf(Build.VERSION.SDK_INT)), TuplesKt.to("sdk", this.registerClient), TuplesKt.to("uid", AFb1kSDK.valueOf(values.valueOf, values.AFKeystoreWrapper)), TuplesKt.to("exc_config", aFh1fSDK.valueOf()));
        int i3 = w + 33;
        v = i3 % 128;
        int i4 = i3 % 2;
        return mapOf;
    }

    private static Map<String, Object> AFInAppEventParameterName(Map<String, ? extends Object> map, List<AFd1fSDK> list) {
        int i2 = 2 % 2;
        int i3 = v + 63;
        w = i3 % 128;
        Map<String, Object> mapOf = i3 % 2 == 0 ? MapsKt.mapOf(TuplesKt.to("deviceInfo", map), TuplesKt.to("excs", AFd1eSDK.AFInAppEventType(list))) : MapsKt.mapOf(TuplesKt.to("deviceInfo", map), TuplesKt.to("excs", AFd1eSDK.AFInAppEventType(list)));
        int i4 = w + 73;
        v = i4 % 128;
        int i5 = i4 % 2;
        return mapOf;
    }

    private final boolean values(AFh1fSDK aFh1fSDK) {
        int valueOf;
        int i2 = 2 % 2;
        int i3 = w + 13;
        v = i3 % 128;
        int i4 = i3 % 2;
        long currentTimeMillis = System.currentTimeMillis();
        long values = registerClient().values("af_send_exc_to_server_window", -1L);
        if (aFh1fSDK.AFInAppEventParameterName >= TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis) && values != -1 && values >= currentTimeMillis && (valueOf = registerClient().valueOf("af_send_exc_min", -1)) != -1) {
            int i5 = w + 73;
            v = i5 % 128;
            if (i5 % 2 != 0) {
                valueOf().values();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (valueOf().values() >= valueOf) {
                return AFInAppEventType(aFh1fSDK);
            }
        }
        return false;
    }

    private final boolean AFKeystoreWrapper(AFh1fSDK aFh1fSDK) {
        int i2 = 2 % 2;
        int i3 = w + 13;
        v = i3 % 128;
        if (i3 % 2 == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            long values = registerClient().values("af_send_exc_to_server_window", -1L);
            if (aFh1fSDK.AFInAppEventParameterName < TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis)) {
                int i4 = w + 109;
                v = i4 % 128;
                return i4 % 2 != 0;
            }
            if (values == -1 || values < currentTimeMillis) {
                return false;
            }
            return AFInAppEventType(aFh1fSDK);
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        registerClient().values("af_send_exc_to_server_window", -1L);
        long j = aFh1fSDK.AFInAppEventParameterName;
        TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean AFInAppEventType(AFh1fSDK aFh1fSDK) {
        int i2 = 2 % 2;
        new AFe1zSDK();
        String str = this.registerClient;
        String str2 = aFh1fSDK.AFKeystoreWrapper;
        Intrinsics.checkNotNullExpressionValue(str2, "");
        boolean AFInAppEventType = AFe1zSDK.AFInAppEventType(str, str2);
        int i3 = v + 51;
        w = i3 % 128;
        if (i3 % 2 != 0) {
            return AFInAppEventType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final AFh1fSDK e() {
        AFi1zSDK aFi1zSDK;
        int i2 = 2 % 2;
        int i3 = v + 125;
        w = i3 % 128;
        if (i3 % 2 == 0) {
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
        int i5 = w + 27;
        v = i5 % 128;
        int i6 = i5 % 2;
        return aFh1fSDK;
    }

    private final void valueOf(String str, String str2) {
        int i2 = 2 % 2;
        int i3 = v + 37;
        w = i3 % 128;
        int i4 = i3 % 2;
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        d().valueOf(bytes, MapsKt.mapOf(TuplesKt.to("Authorization", AFb1lSDK.AFKeystoreWrapper(str, str2))), 2000);
        int i5 = w + 83;
        v = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void a(int i2, char c, String str, String str2, String str3, Object[] objArr) {
        int i3 = 2 % 2;
        int i4 = $10 + 61;
        $11 = i4 % 128;
        int i5 = i4 % 2;
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
        cArr[0] = (char) (cArr[0] ^ c);
        cArr2[2] = (char) (cArr2[2] + ((char) i2));
        int length3 = charArray3.length;
        char[] cArr3 = new char[length3];
        aFj1eSDK.valueOf = 0;
        while (aFj1eSDK.valueOf < length3) {
            int i6 = $10 + 3;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = (aFj1eSDK.valueOf + 2) % 4;
            int i9 = (aFj1eSDK.valueOf + 3) % 4;
            aFj1eSDK.AFKeystoreWrapper = (char) (((cArr[aFj1eSDK.valueOf % 4] * 32718) + cArr2[i8]) % 65535);
            cArr2[i9] = (char) (((cArr[i9] * 32718) + cArr2[i8]) / 65535);
            cArr[i9] = aFj1eSDK.AFKeystoreWrapper;
            cArr3[aFj1eSDK.valueOf] = (char) ((((cArr[i9] ^ charArray3[aFj1eSDK.valueOf]) ^ (afInfoLog ^ (-2499805256334160880L))) ^ ((int) (force ^ (-2499805256334160880L)))) ^ ((char) (i ^ (-2499805256334160880L))));
            aFj1eSDK.valueOf++;
        }
        objArr[0] = new String(cArr3);
    }
}
