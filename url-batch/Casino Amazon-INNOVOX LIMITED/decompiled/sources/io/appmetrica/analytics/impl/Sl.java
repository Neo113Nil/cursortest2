package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class Sl implements NetworkResponseHandler {

    /* renamed from: a, reason: collision with root package name */
    public final Zl f1048a;
    public final W2 b;

    public Sl() {
        this(new Zl(), new W2());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0157em handle(ResponseDataHolder responseDataHolder) {
        String str;
        String str2;
        if (200 == responseDataHolder.getResponseCode()) {
            byte[] responseData = responseDataHolder.getResponseData();
            Map<String, List<String>> responseHeaders = responseDataHolder.getResponseHeaders();
            List list = responseHeaders != null ? (List) CollectionUtils.getFromMapIgnoreCase(responseHeaders, "Content-Encoding") : null;
            if (!mo.a((Collection) list) && "encrypted".equals(list.get(0))) {
                responseData = this.b.a(responseDataHolder.getResponseData());
            }
            if (responseData != null) {
                Zl zl = this.f1048a;
                zl.getClass();
                C0157em c0157em = new C0157em();
                try {
                    zl.h.getClass();
                    C0198gb c0198gb = new C0198gb(new String(responseData, CharEncoding.UTF_8));
                    JSONObject optJSONObject = c0198gb.optJSONObject("device_id");
                    if (optJSONObject != null) {
                        str = optJSONObject.optString("hash");
                        str2 = optJSONObject.optString("value");
                    } else {
                        str = "";
                        str2 = "";
                    }
                    c0157em.h = str2;
                    c0157em.i = str;
                    zl.a(c0157em, c0198gb);
                    c0157em.f1241a = TextUtils.isEmpty(c0157em.i) ? 1 : 2;
                } catch (Throwable unused) {
                    c0157em = new C0157em();
                    c0157em.f1241a = 1;
                }
                if (2 == c0157em.f1241a) {
                    return c0157em;
                }
            }
        }
        return null;
    }

    public Sl(Zl zl, W2 w2) {
        this.f1048a = zl;
        this.b = w2;
    }
}
