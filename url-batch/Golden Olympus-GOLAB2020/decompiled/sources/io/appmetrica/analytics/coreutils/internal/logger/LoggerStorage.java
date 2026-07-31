package io.appmetrica.analytics.coreutils.internal.logger;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;

/* loaded from: classes3.dex */
public abstract class LoggerStorage {

    /* renamed from: a, reason: collision with root package name */
    private static HashMap f37028a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f37029b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static volatile PublicLogger f37030c = PublicLogger.getAnonymousInstance();

    @NonNull
    public static PublicLogger getMainPublicOrAnonymousLogger() {
        return f37030c;
    }

    @NonNull
    public static PublicLogger getOrCreateMainPublicLogger(@NonNull String str) {
        f37030c = getOrCreatePublicLogger(str);
        return f37030c;
    }

    @NonNull
    public static PublicLogger getOrCreatePublicLogger(String str) {
        PublicLogger publicLogger;
        if (TextUtils.isEmpty(str)) {
            return PublicLogger.getAnonymousInstance();
        }
        PublicLogger publicLogger2 = (PublicLogger) f37028a.get(str);
        if (publicLogger2 != null) {
            return publicLogger2;
        }
        synchronized (f37029b) {
            try {
                publicLogger = (PublicLogger) f37028a.get(str);
                if (publicLogger == null) {
                    publicLogger = new PublicLogger(ApiKeyUtils.createPartialApiKey(str));
                    f37028a.put(str, publicLogger);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return publicLogger;
    }

    public static void unsetPublicLoggers() {
        f37028a = new HashMap();
        f37030c = PublicLogger.getAnonymousInstance();
    }
}
