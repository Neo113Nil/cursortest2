package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class Rl implements NetworkResponseHandler {

    /* renamed from: a, reason: collision with root package name */
    public final Yl f38216a;

    /* renamed from: b, reason: collision with root package name */
    public final C2925r3 f38217b;

    public Rl() {
        this(new Yl(), new C2925r3());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2580dm handle(@NonNull ResponseDataHolder responseDataHolder) {
        String str;
        String str2;
        if (200 == responseDataHolder.getResponseCode()) {
            byte[] responseData = responseDataHolder.getResponseData();
            Map<String, List<String>> responseHeaders = responseDataHolder.getResponseHeaders();
            List list = responseHeaders != null ? (List) CollectionUtils.getFromMapIgnoreCase(responseHeaders, "Content-Encoding") : null;
            if (!AbstractC2713io.a((Collection) list) && "encrypted".equals(list.get(0))) {
                responseData = this.f38217b.a(responseDataHolder.getResponseData());
            }
            if (responseData != null) {
                Yl yl = this.f38216a;
                yl.getClass();
                C2580dm c2580dm = new C2580dm();
                try {
                    yl.f38580i.getClass();
                    Ab ab = new Ab(new String(responseData, "UTF-8"));
                    JSONObject optJSONObject = ab.optJSONObject("device_id");
                    if (optJSONObject != null) {
                        str = optJSONObject.optString("hash");
                        str2 = optJSONObject.optString("value");
                    } else {
                        str = "";
                        str2 = "";
                    }
                    c2580dm.f38866h = str2;
                    c2580dm.f38867i = str;
                    yl.a(c2580dm, ab);
                    c2580dm.f38859a = TextUtils.isEmpty(c2580dm.f38867i) ? 1 : 2;
                } catch (Throwable unused) {
                    c2580dm = new C2580dm();
                    c2580dm.f38859a = 1;
                }
                if (2 == c2580dm.f38859a) {
                    return c2580dm;
                }
            }
        }
        return null;
    }

    public Rl(Yl yl, C2925r3 c2925r3) {
        this.f38216a = yl;
        this.f38217b = c2925r3;
    }
}
