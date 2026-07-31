package com.my.tracker.obfuscated;

import android.content.Intent;
import android.net.Uri;

/* renamed from: com.my.tracker.obfuscated.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1709z {

    /* renamed from: a, reason: collision with root package name */
    private final C1631f0 f21583a;

    private C1709z(C1631f0 c1631f0) {
        this.f21583a = c1631f0;
    }

    public String a(Intent intent) {
        AbstractC1708y2.a("DeeplinkHandler: handling deeplink");
        if (intent == null) {
            AbstractC1708y2.a("DeeplinkHandler: intent is null");
            return null;
        }
        try {
            Uri data = intent.getData();
            if (data == null) {
                AbstractC1708y2.a("DeeplinkHandler: intent data is null");
                return null;
            }
            AbstractC1708y2.a("DeeplinkHandler: intent data: " + data);
            String queryParameter = data.getQueryParameter("mt_deeplink");
            String queryParameter2 = data.getQueryParameter("mt_click_id");
            if (queryParameter != null) {
                AbstractC1708y2.a("DeeplinkHandler: found mt_deeplink in intent");
            } else {
                AbstractC1708y2.a("DeeplinkHandler: mt_deeplink not found in intent");
                queryParameter = data.toString();
            }
            AbstractC1708y2.a("DeeplinkHandler: deeplink " + queryParameter);
            AbstractC1708y2.a("DeeplinkHandler: clickId " + queryParameter2);
            this.f21583a.a(queryParameter, queryParameter2);
            return queryParameter;
        } catch (Throwable th) {
            AbstractC1708y2.b("DeeplinkHandler error: ", th);
            return null;
        }
    }

    public static C1709z a(C1631f0 c1631f0) {
        return new C1709z(c1631f0);
    }
}
