package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001b\u0010\u0006\u001a\u00020\u00058GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0007R\u001b\u0010\t\u001a\u00020\u00058GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000f"}, d2 = {"Lcom/appsflyer/internal/AFg1zSDK;", "", "", "AFInAppEventType", "()J", "", "AFInAppEventParameterName", "()Z", "Lcom/appsflyer/internal/AFd1sSDK;", "AFKeystoreWrapper", "Lcom/appsflyer/internal/AFd1sSDK;", "valueOf", "values", "Lkotlin/Lazy;", "Lcom/appsflyer/internal/AFg1xSDK;", "Lcom/appsflyer/internal/AFg1xSDK;", "p0", "p1", "<init>", "(Lcom/appsflyer/internal/AFd1sSDK;Lcom/appsflyer/internal/AFg1xSDK;)V", "AFa1ySDK"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AFg1zSDK {

    /* renamed from: AFInAppEventParameterName, reason: from kotlin metadata */
    private final AFg1xSDK AFInAppEventType;

    /* renamed from: AFKeystoreWrapper, reason: from kotlin metadata */
    private final AFd1sSDK valueOf;

    /* renamed from: valueOf, reason: from kotlin metadata */
    private final Lazy AFKeystoreWrapper;

    /* renamed from: values, reason: from kotlin metadata */
    private final Lazy AFInAppEventParameterName;
    private static final long AFInAppEventType = TimeUnit.HOURS.toSeconds(24);

    public AFg1zSDK(AFd1sSDK aFd1sSDK, AFg1xSDK aFg1xSDK) {
        Intrinsics.checkNotNullParameter(aFd1sSDK, "");
        Intrinsics.checkNotNullParameter(aFg1xSDK, "");
        this.valueOf = aFd1sSDK;
        this.AFInAppEventType = aFg1xSDK;
        this.AFInAppEventParameterName = LazyKt.lazy(new Function0<Boolean>() { // from class: com.appsflyer.internal.AFg1zSDK.3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: AFKeystoreWrapper, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(Boolean.parseBoolean(AFg1zSDK.this.valueOf.AFInAppEventType("com.appsflyer.rc.sandbox")));
            }
        });
        this.AFKeystoreWrapper = LazyKt.lazy(new Function0<Boolean>() { // from class: com.appsflyer.internal.AFg1zSDK.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: values, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(Boolean.parseBoolean(AFg1zSDK.this.valueOf.AFInAppEventType("com.appsflyer.rc.staging")));
            }
        });
    }

    public final boolean values() {
        return ((Boolean) this.AFInAppEventParameterName.getValue()).booleanValue();
    }

    public final boolean AFKeystoreWrapper() {
        return ((Boolean) this.AFKeystoreWrapper.getValue()).booleanValue();
    }

    public final long AFInAppEventType() {
        Object m6819constructorimpl;
        String AFInAppEventType2 = this.valueOf.AFInAppEventType("com.appsflyer.rc.cache.max-age-fallback");
        if (AFInAppEventType2 != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                AFg1zSDK aFg1zSDK = this;
                m6819constructorimpl = Result.m6819constructorimpl(Long.valueOf(Long.parseLong(AFInAppEventType2)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m6819constructorimpl = Result.m6819constructorimpl(ResultKt.createFailure(th));
            }
            Throwable m6822exceptionOrNullimpl = Result.m6822exceptionOrNullimpl(m6819constructorimpl);
            if (m6822exceptionOrNullimpl != null) {
                AFLogger.afErrorLog(new StringBuilder("Can't read maxAgeFallback from Manifest: ").append(m6822exceptionOrNullimpl.getMessage()).toString(), m6822exceptionOrNullimpl);
                m6819constructorimpl = Long.valueOf(AFInAppEventType);
            }
            return ((Number) m6819constructorimpl).longValue();
        }
        return AFInAppEventType;
    }

    public final boolean AFInAppEventParameterName() {
        AFh1hSDK aFh1hSDK;
        AFi1zSDK aFi1zSDK = this.AFInAppEventType.valueOf;
        if (aFi1zSDK == null) {
            AFg1fSDK.i$default(AFLogger.INSTANCE, AFg1aSDK.REMOTE_CONTROL, "active config is missing - fetching from CDN", false, 4, null);
            return true;
        }
        AFh1gSDK aFh1gSDK = aFi1zSDK.AFInAppEventParameterName;
        return ((aFh1gSDK == null || (aFh1hSDK = aFh1gSDK.AFInAppEventType) == null) ? false : aFh1hSDK.AFInAppEventParameterName()) || System.currentTimeMillis() - this.AFInAppEventType.AFInAppEventType > TimeUnit.SECONDS.toMillis(this.AFInAppEventType.AFInAppEventParameterName);
    }
}
