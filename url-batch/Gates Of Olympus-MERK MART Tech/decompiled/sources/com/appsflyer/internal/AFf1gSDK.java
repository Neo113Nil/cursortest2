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

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u001b\u0010\u0003\u001a\u00020\u00058GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\f\u0010\u0007R\u001b\u0010\f\u001a\u00020\u00058GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u0006\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f"}, d2 = {"Lcom/appsflyer/internal/AFf1gSDK;", "", "", "AFInAppEventType", "()J", "", "AFInAppEventParameterName", "()Z", "Lcom/appsflyer/internal/AFd1pSDK;", "Lcom/appsflyer/internal/AFd1pSDK;", "valueOf", "Lkotlin/Lazy;", "values", "AFKeystoreWrapper", "Lcom/appsflyer/internal/AFf1cSDK;", "Lcom/appsflyer/internal/AFf1cSDK;", "p0", "p1", "<init>", "(Lcom/appsflyer/internal/AFd1pSDK;Lcom/appsflyer/internal/AFf1cSDK;)V", "AFa1vSDK"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AFf1gSDK {
    private static final long valueOf = TimeUnit.HOURS.toSeconds(24);

    /* renamed from: AFInAppEventParameterName, reason: from kotlin metadata */
    private final Lazy AFInAppEventType;

    /* renamed from: AFInAppEventType, reason: from kotlin metadata */
    private final AFd1pSDK valueOf;

    /* renamed from: AFKeystoreWrapper, reason: from kotlin metadata */
    private final AFf1cSDK AFInAppEventParameterName;
    private final Lazy values;

    public AFf1gSDK(AFd1pSDK aFd1pSDK, AFf1cSDK aFf1cSDK) {
        Intrinsics.checkNotNullParameter(aFd1pSDK, "");
        Intrinsics.checkNotNullParameter(aFf1cSDK, "");
        this.valueOf = aFd1pSDK;
        this.AFInAppEventParameterName = aFf1cSDK;
        this.AFInAppEventType = LazyKt.lazy(new Function0<Boolean>() { // from class: com.appsflyer.internal.AFf1gSDK.3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: AFKeystoreWrapper, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(Boolean.parseBoolean(AFf1gSDK.this.valueOf.AFInAppEventParameterName("com.appsflyer.rc.sandbox")));
            }
        });
        this.values = LazyKt.lazy(new Function0<Boolean>() { // from class: com.appsflyer.internal.AFf1gSDK.4
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: valueOf, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(Boolean.parseBoolean(AFf1gSDK.this.valueOf.AFInAppEventParameterName("com.appsflyer.rc.staging")));
            }
        });
    }

    public final boolean values() {
        return ((Boolean) this.AFInAppEventType.getValue()).booleanValue();
    }

    public final boolean AFKeystoreWrapper() {
        return ((Boolean) this.values.getValue()).booleanValue();
    }

    public final long AFInAppEventType() {
        Object m9577constructorimpl;
        String AFInAppEventParameterName = this.valueOf.AFInAppEventParameterName("com.appsflyer.rc.cache.max-age-fallback");
        if (AFInAppEventParameterName != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                AFf1gSDK aFf1gSDK = this;
                m9577constructorimpl = Result.m9577constructorimpl(Long.valueOf(Long.parseLong(AFInAppEventParameterName)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m9577constructorimpl = Result.m9577constructorimpl(ResultKt.createFailure(th));
            }
            Throwable m9580exceptionOrNullimpl = Result.m9580exceptionOrNullimpl(m9577constructorimpl);
            if (m9580exceptionOrNullimpl != null) {
                AFLogger.afErrorLog(new StringBuilder("Can't read maxAgeFallback from Manifest: ").append(m9580exceptionOrNullimpl.getMessage()).toString(), m9580exceptionOrNullimpl);
                m9577constructorimpl = Long.valueOf(valueOf);
            }
            return ((Number) m9577constructorimpl).longValue();
        }
        return valueOf;
    }

    public final boolean AFInAppEventParameterName() {
        AFh1sSDK aFh1sSDK;
        AFh1oSDK aFh1oSDK = this.AFInAppEventParameterName.valueOf;
        if (aFh1oSDK == null) {
            AFg1pSDK.i$default(AFLogger.INSTANCE, AFg1jSDK.REMOTE_CONTROL, "active config is missing - fetching from CDN", false, 4, null);
            return true;
        }
        AFh1qSDK aFh1qSDK = aFh1oSDK.AFInAppEventParameterName;
        return ((aFh1qSDK == null || (aFh1sSDK = aFh1qSDK.values) == null) ? false : aFh1sSDK.valueOf()) || System.currentTimeMillis() - this.AFInAppEventParameterName.AFInAppEventType > TimeUnit.SECONDS.toMillis(this.AFInAppEventParameterName.values);
    }
}
