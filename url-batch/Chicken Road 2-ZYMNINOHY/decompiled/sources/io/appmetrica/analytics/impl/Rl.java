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
public final class Rl implements NetworkResponseHandler {

    /* renamed from: a, reason: collision with root package name */
    public final Yl f10896a;

    /* renamed from: b, reason: collision with root package name */
    public final V2 f10897b;

    public Rl() {
        this(new Yl(), new V2());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0571dm handle(ResponseDataHolder responseDataHolder) {
        String str;
        String str2;
        if (200 == responseDataHolder.getResponseCode()) {
            byte[] responseData = responseDataHolder.getResponseData();
            Map<String, List<String>> responseHeaders = responseDataHolder.getResponseHeaders();
            List list = responseHeaders != null ? (List) CollectionUtils.getFromMapIgnoreCase(responseHeaders, "Content-Encoding") : null;
            if (!AbstractC0779lo.a((Collection) list) && "encrypted".equals(list.get(0))) {
                responseData = this.f10897b.a(responseDataHolder.getResponseData());
            }
            if (responseData != null) {
                Yl yl = this.f10896a;
                yl.getClass();
                C0571dm c0571dm = new C0571dm();
                try {
                    yl.f11325h.getClass();
                    C0611fb c0611fb = new C0611fb(new String(responseData, CharEncoding.UTF_8));
                    JSONObject optJSONObject = c0611fb.optJSONObject("device_id");
                    if (optJSONObject != null) {
                        str = optJSONObject.optString("hash");
                        str2 = optJSONObject.optString("value");
                    } else {
                        str = "";
                        str2 = "";
                    }
                    c0571dm.f11694h = str2;
                    c0571dm.f11695i = str;
                    yl.a(c0571dm, c0611fb);
                    c0571dm.f11687a = TextUtils.isEmpty(c0571dm.f11695i) ? 1 : 2;
                } catch (Throwable unused) {
                    c0571dm = new C0571dm();
                    c0571dm.f11687a = 1;
                }
                if (2 == c0571dm.f11687a) {
                    return c0571dm;
                }
            }
        }
        return null;
    }

    public Rl(Yl yl, V2 v22) {
        this.f10896a = yl;
        this.f10897b = v22;
    }
}
