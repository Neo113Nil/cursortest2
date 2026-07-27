package com.appsflyer.internal;

import M2.p;
import com.appsflyer.AFLogger;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1341p;
import y2.AbstractC1343r;
import y2.C1336k;
import y2.InterfaceC1335j;

@Metadata
/* loaded from: classes.dex */
public final class AFg1zSDK {
    private final AFg1xSDK AFInAppEventParameterName;
    private final AFd1sSDK AFKeystoreWrapper;
    private final InterfaceC1335j valueOf;
    private final InterfaceC1335j values;
    public static final AFa1ySDK AFa1ySDK = new AFa1ySDK(null);
    private static final long AFInAppEventType = TimeUnit.HOURS.toSeconds(24);

    @Metadata
    /* renamed from: com.appsflyer.internal.AFg1zSDK$1, reason: invalid class name */
    public static final class AnonymousClass1 extends p implements Function0<Boolean> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: values, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(Boolean.parseBoolean(AFg1zSDK.this.AFKeystoreWrapper.AFInAppEventType("com.appsflyer.rc.staging")));
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.internal.AFg1zSDK$3, reason: invalid class name */
    public static final class AnonymousClass3 extends p implements Function0<Boolean> {
        public AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: AFKeystoreWrapper, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(Boolean.parseBoolean(AFg1zSDK.this.AFKeystoreWrapper.AFInAppEventType("com.appsflyer.rc.sandbox")));
        }
    }

    @Metadata
    public static final class AFa1ySDK {
        private AFa1ySDK() {
        }

        public /* synthetic */ AFa1ySDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AFg1zSDK(AFd1sSDK aFd1sSDK, AFg1xSDK aFg1xSDK) {
        Intrinsics.checkNotNullParameter(aFd1sSDK, "");
        Intrinsics.checkNotNullParameter(aFg1xSDK, "");
        this.AFKeystoreWrapper = aFd1sSDK;
        this.AFInAppEventParameterName = aFg1xSDK;
        this.values = C1336k.a(new AnonymousClass3());
        this.valueOf = C1336k.a(new AnonymousClass1());
    }

    public final long AFInAppEventType() {
        Object a4;
        String AFInAppEventType2 = this.AFKeystoreWrapper.AFInAppEventType("com.appsflyer.rc.cache.max-age-fallback");
        if (AFInAppEventType2 == null) {
            return AFInAppEventType;
        }
        try {
            AbstractC1341p.a aVar = AbstractC1341p.f11673d;
            a4 = Long.valueOf(Long.parseLong(AFInAppEventType2));
        } catch (Throwable th) {
            AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
            a4 = AbstractC1343r.a(th);
        }
        Throwable a5 = AbstractC1341p.a(a4);
        if (a5 != null) {
            StringBuilder sb = new StringBuilder("Can't read maxAgeFallback from Manifest: ");
            sb.append(a5.getMessage());
            AFLogger.afErrorLog(sb.toString(), a5);
            a4 = Long.valueOf(AFInAppEventType);
        }
        return ((Number) a4).longValue();
    }

    public final boolean AFKeystoreWrapper() {
        return ((Boolean) this.valueOf.getValue()).booleanValue();
    }

    public final boolean values() {
        return ((Boolean) this.values.getValue()).booleanValue();
    }

    public final boolean AFInAppEventParameterName() {
        AFh1hSDK aFh1hSDK;
        AFi1zSDK aFi1zSDK = this.AFInAppEventParameterName.valueOf;
        if (aFi1zSDK == null) {
            AFg1fSDK.i$default(AFLogger.INSTANCE, AFg1aSDK.REMOTE_CONTROL, "active config is missing - fetching from CDN", false, 4, null);
            return true;
        }
        AFh1gSDK aFh1gSDK = aFi1zSDK.AFInAppEventParameterName;
        boolean AFInAppEventParameterName = (aFh1gSDK == null || (aFh1hSDK = aFh1gSDK.AFInAppEventType) == null) ? false : aFh1hSDK.AFInAppEventParameterName();
        long currentTimeMillis = System.currentTimeMillis();
        AFg1xSDK aFg1xSDK = this.AFInAppEventParameterName;
        return AFInAppEventParameterName || currentTimeMillis - aFg1xSDK.AFInAppEventType > TimeUnit.SECONDS.toMillis(aFg1xSDK.AFInAppEventParameterName);
    }
}
