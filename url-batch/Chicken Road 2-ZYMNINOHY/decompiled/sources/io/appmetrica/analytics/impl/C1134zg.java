package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.identifiers.internal.AdvIdentifiersProvider;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: io.appmetrica.analytics.impl.zg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1134zg implements K {

    /* renamed from: a, reason: collision with root package name */
    public final String f13104a;

    /* renamed from: b, reason: collision with root package name */
    public final C1108yg f13105b;

    public C1134zg(String str) {
        this(str, new C1108yg());
    }

    @Override // io.appmetrica.analytics.impl.K
    public final AdTrackingInfoResult a(Context context) {
        return a(context, new Xd());
    }

    public final AdTrackingInfoResult b(Context context) {
        int i4 = AdvIdentifiersProvider.f9875a;
        Method method = AdvIdentifiersProvider.class.getMethod("requestIdentifiers", Context.class, Bundle.class);
        Bundle bundle = new Bundle();
        bundle.putString("io.appmetrica.analytics.identifiers.extra.PROVIDER", this.f13104a);
        C1108yg c1108yg = this.f13105b;
        Object[] objArr = {context, bundle};
        AdTrackingInfo adTrackingInfo = null;
        Bundle bundle2 = (Bundle) method.invoke(null, objArr);
        c1108yg.getClass();
        if (bundle2 == null) {
            return null;
        }
        Bundle bundle3 = bundle2.getBundle("io.appmetrica.analytics.identifiers.extra.TRACKING_INFO");
        if (bundle3 != null) {
            Object obj = AbstractC1019v5.f12869a.get(bundle3.getString("io.appmetrica.analytics.identifiers.extra.PROVIDER"));
            if (obj == null) {
                throw new IllegalArgumentException(("Provider " + bundle3.getString("io.appmetrica.analytics.identifiers.extra.PROVIDER") + " is invalid").toString());
            }
            adTrackingInfo = new AdTrackingInfo((AdTrackingInfo.Provider) obj, bundle3.getString("io.appmetrica.analytics.identifiers.extra.ID"), bundle3.containsKey("io.appmetrica.analytics.identifiers.extra.LIMITED") ? Boolean.valueOf(bundle3.getBoolean("io.appmetrica.analytics.identifiers.extra.LIMITED")) : null);
        }
        return new AdTrackingInfoResult(adTrackingInfo, IdentifierStatus.Companion.from(bundle2.getString("io.appmetrica.analytics.identifiers.extra.STATUS")), bundle2.getString("io.appmetrica.analytics.identifiers.extra.ERROR_MESSAGE"));
    }

    public C1134zg(String str, C1108yg c1108yg) {
        this.f13104a = str;
        this.f13105b = c1108yg;
    }

    @Override // io.appmetrica.analytics.impl.K
    public final AdTrackingInfoResult a(Context context, Gi gi) {
        AdTrackingInfoResult adTrackingInfoResult;
        AdTrackingInfoResult adTrackingInfoResult2;
        if (ReflectionUtils.detectClassExists("io.appmetrica.analytics.identifiers.internal.AdvIdentifiersProvider")) {
            Jn jn = (Jn) gi;
            jn.f10506c = 0;
            adTrackingInfoResult = null;
            while (jn.b()) {
                try {
                    return b(context);
                } catch (InvocationTargetException e4) {
                    String message = e4.getTargetException() != null ? e4.getTargetException().getMessage() : null;
                    adTrackingInfoResult2 = new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, "exception while fetching " + this.f13104a + " adv_id: " + message);
                    adTrackingInfoResult = adTrackingInfoResult2;
                    try {
                        Thread.sleep(((Jn) gi).f10505b);
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    adTrackingInfoResult2 = new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, "exception while fetching " + this.f13104a + " adv_id: " + th.getMessage());
                    adTrackingInfoResult = adTrackingInfoResult2;
                    Thread.sleep(((Jn) gi).f10505b);
                }
            }
        } else {
            adTrackingInfoResult = new AdTrackingInfoResult(null, IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, "Module io.appmetrica.analytics:analytics-identifiers does not exist");
        }
        return adTrackingInfoResult == null ? new AdTrackingInfoResult() : adTrackingInfoResult;
    }
}
