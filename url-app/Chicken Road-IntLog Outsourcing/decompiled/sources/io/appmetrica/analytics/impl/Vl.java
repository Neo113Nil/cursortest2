package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Vl implements NetworkResponseHandler {

    /* renamed from: a, reason: collision with root package name */
    public final C0574cm f7638a;

    /* renamed from: b, reason: collision with root package name */
    public final C0581d3 f7639b;

    public Vl() {
        this(new C0574cm(), new C0581d3());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0703hm handle(ResponseDataHolder responseDataHolder) {
        String str;
        String str2;
        if (200 == responseDataHolder.getResponseCode()) {
            byte[] responseData = responseDataHolder.getResponseData();
            Map<String, List<String>> responseHeaders = responseDataHolder.getResponseHeaders();
            List list = responseHeaders != null ? (List) CollectionUtils.getFromMapIgnoreCase(responseHeaders, "Content-Encoding") : null;
            if (!AbstractC0860no.a((Collection) list) && "encrypted".equals(list.get(0))) {
                responseData = this.f7639b.a(responseDataHolder.getResponseData());
            }
            if (responseData != null) {
                C0574cm c0574cm = this.f7638a;
                c0574cm.getClass();
                C0703hm c0703hm = new C0703hm();
                try {
                    c0574cm.f8015h.getClass();
                    C0821mb c0821mb = new C0821mb(new String(responseData, "UTF-8"));
                    JSONObject optJSONObject = c0821mb.optJSONObject("device_id");
                    if (optJSONObject != null) {
                        str = optJSONObject.optString("hash");
                        str2 = optJSONObject.optString("value");
                    } else {
                        str = "";
                        str2 = "";
                    }
                    c0703hm.f8348h = str2;
                    c0703hm.f8349i = str;
                    c0574cm.a(c0703hm, c0821mb);
                    c0703hm.f8341a = TextUtils.isEmpty(c0703hm.f8349i) ? 1 : 2;
                } catch (Throwable unused) {
                    c0703hm = new C0703hm();
                    c0703hm.f8341a = 1;
                }
                if (2 == c0703hm.f8341a) {
                    return c0703hm;
                }
            }
        }
        return null;
    }

    public Vl(C0574cm c0574cm, C0581d3 c0581d3) {
        this.f7638a = c0574cm;
        this.f7639b = c0581d3;
    }
}
