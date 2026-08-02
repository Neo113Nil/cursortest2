package io.appmetrica.analytics.coreutils.internal.logger;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class LoggerStorage {

    /* renamed from: a, reason: collision with root package name */
    private static HashMap f5489a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f5490b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static volatile PublicLogger f5491c = PublicLogger.getAnonymousInstance();

    public static PublicLogger getMainPublicOrAnonymousLogger() {
        return f5491c;
    }

    public static PublicLogger getOrCreateMainPublicLogger(String str) {
        f5491c = getOrCreatePublicLogger(str);
        return f5491c;
    }

    public static PublicLogger getOrCreatePublicLogger(String str) {
        PublicLogger publicLogger;
        if (TextUtils.isEmpty(str)) {
            return PublicLogger.getAnonymousInstance();
        }
        PublicLogger publicLogger2 = (PublicLogger) f5489a.get(str);
        if (publicLogger2 != null) {
            return publicLogger2;
        }
        synchronized (f5490b) {
            try {
                publicLogger = (PublicLogger) f5489a.get(str);
                if (publicLogger == null) {
                    publicLogger = new PublicLogger(ApiKeyUtils.createPartialApiKey(str));
                    f5489a.put(str, publicLogger);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return publicLogger;
    }

    public static void unsetPublicLoggers() {
        f5489a = new HashMap();
        f5491c = PublicLogger.getAnonymousInstance();
    }
}
