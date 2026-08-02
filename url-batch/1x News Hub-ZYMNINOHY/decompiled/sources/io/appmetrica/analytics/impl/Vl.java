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

/* loaded from: classes.dex */
public final class Vl implements NetworkResponseHandler {

    /* renamed from: a, reason: collision with root package name */
    public final C0423cm f6805a;

    /* renamed from: b, reason: collision with root package name */
    public final C0430d3 f6806b;

    public Vl() {
        this(new C0423cm(), new C0430d3());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0552hm handle(ResponseDataHolder responseDataHolder) {
        String str;
        String str2;
        if (200 == responseDataHolder.getResponseCode()) {
            byte[] responseData = responseDataHolder.getResponseData();
            Map<String, List<String>> responseHeaders = responseDataHolder.getResponseHeaders();
            List list = responseHeaders != null ? (List) CollectionUtils.getFromMapIgnoreCase(responseHeaders, "Content-Encoding") : null;
            if (!AbstractC0709no.a((Collection) list) && "encrypted".equals(list.get(0))) {
                responseData = this.f6806b.a(responseDataHolder.getResponseData());
            }
            if (responseData != null) {
                C0423cm c0423cm = this.f6805a;
                c0423cm.getClass();
                C0552hm c0552hm = new C0552hm();
                try {
                    c0423cm.f7158h.getClass();
                    C0670mb c0670mb = new C0670mb(new String(responseData, CharEncoding.UTF_8));
                    JSONObject optJSONObject = c0670mb.optJSONObject("device_id");
                    if (optJSONObject != null) {
                        str = optJSONObject.optString("hash");
                        str2 = optJSONObject.optString("value");
                    } else {
                        str = "";
                        str2 = "";
                    }
                    c0552hm.f7469h = str2;
                    c0552hm.f7470i = str;
                    c0423cm.a(c0552hm, c0670mb);
                    c0552hm.f7463a = TextUtils.isEmpty(c0552hm.f7470i) ? 1 : 2;
                } catch (Throwable unused) {
                    c0552hm = new C0552hm();
                    c0552hm.f7463a = 1;
                }
                if (2 == c0552hm.f7463a) {
                    return c0552hm;
                }
            }
        }
        return null;
    }

    public Vl(C0423cm c0423cm, C0430d3 c0430d3) {
        this.f6805a = c0423cm;
        this.f6806b = c0430d3;
    }
}
