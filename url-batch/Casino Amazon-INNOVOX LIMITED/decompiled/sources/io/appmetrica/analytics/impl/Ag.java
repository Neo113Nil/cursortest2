package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class Ag implements K {

    /* renamed from: a, reason: collision with root package name */
    public final String f763a;
    public final C0681zg b;

    public Ag(String str) {
        this(str, new C0681zg());
    }

    @Override // io.appmetrica.analytics.impl.K
    public final AdTrackingInfoResult a(Context context) {
        return a(context, new Yd());
    }

    public final AdTrackingInfoResult b(Context context) {
        Method method = Class.forName("io.appmetrica.analytics.identifiers.internal.AdvIdentifiersProvider").getMethod("requestIdentifiers", Context.class, Bundle.class);
        Bundle bundle = new Bundle();
        bundle.putString("io.appmetrica.analytics.identifiers.extra.PROVIDER", this.f763a);
        C0681zg c0681zg = this.b;
        Object[] objArr = {context, bundle};
        AdTrackingInfo adTrackingInfo = null;
        Bundle bundle2 = (Bundle) method.invoke(null, objArr);
        c0681zg.getClass();
        if (bundle2 == null) {
            return null;
        }
        Bundle bundle3 = bundle2.getBundle("io.appmetrica.analytics.identifiers.extra.TRACKING_INFO");
        if (bundle3 != null) {
            Object obj = AbstractC0595w5.f1546a.get(bundle3.getString("io.appmetrica.analytics.identifiers.extra.PROVIDER"));
            if (obj == null) {
                throw new IllegalArgumentException(("Provider " + bundle3.getString("io.appmetrica.analytics.identifiers.extra.PROVIDER") + " is invalid").toString());
            }
            adTrackingInfo = new AdTrackingInfo((AdTrackingInfo.Provider) obj, bundle3.getString("io.appmetrica.analytics.identifiers.extra.ID"), bundle3.containsKey("io.appmetrica.analytics.identifiers.extra.LIMITED") ? Boolean.valueOf(bundle3.getBoolean("io.appmetrica.analytics.identifiers.extra.LIMITED")) : null);
        }
        return new AdTrackingInfoResult(adTrackingInfo, IdentifierStatus.INSTANCE.from(bundle2.getString("io.appmetrica.analytics.identifiers.extra.STATUS")), bundle2.getString("io.appmetrica.analytics.identifiers.extra.ERROR_MESSAGE"));
    }

    public Ag(String str, C0681zg c0681zg) {
        this.f763a = str;
        this.b = c0681zg;
    }

    @Override // io.appmetrica.analytics.impl.K
    public final AdTrackingInfoResult a(Context context, Hi hi) {
        AdTrackingInfoResult adTrackingInfoResult;
        AdTrackingInfoResult adTrackingInfoResult2;
        if (ReflectionUtils.detectClassExists("io.appmetrica.analytics.identifiers.internal.AdvIdentifiersProvider")) {
            Kn kn = (Kn) hi;
            kn.c = 0;
            adTrackingInfoResult = null;
            while (kn.b()) {
                try {
                    return b(context);
                } catch (InvocationTargetException e) {
                    adTrackingInfoResult2 = new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, "exception while fetching " + this.f763a + " adv_id: " + (e.getTargetException() != null ? e.getTargetException().getMessage() : null));
                    adTrackingInfoResult = adTrackingInfoResult2;
                    try {
                        Thread.sleep(((Kn) hi).b);
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    adTrackingInfoResult2 = new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, "exception while fetching " + this.f763a + " adv_id: " + th.getMessage());
                    adTrackingInfoResult = adTrackingInfoResult2;
                    Thread.sleep(((Kn) hi).b);
                }
            }
        } else {
            adTrackingInfoResult = new AdTrackingInfoResult(null, IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, "Module io.appmetrica.analytics:analytics-identifiers does not exist");
        }
        return adTrackingInfoResult == null ? new AdTrackingInfoResult() : adTrackingInfoResult;
    }
}
