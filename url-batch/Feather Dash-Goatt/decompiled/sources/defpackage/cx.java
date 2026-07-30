package defpackage;

import com.appsflyer.AppsFlyerConversionListener;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class cx implements AppsFlyerConversionListener {
    @Override // com.appsflyer.AppsFlyerConversionListener
    public final void onAppOpenAttribution(Map map) {
        hx hxVar = hx.a;
        Map e = map != null ? ik0.e(map) : null;
        if (e == null) {
            e = ov.d;
            e.getClass();
        }
        hx.e = e;
        Objects.toString(hx.e);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public final void onAttributionFailure(String str) {
        hx hxVar = hx.a;
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public final void onConversionDataFail(String str) {
        hx hxVar = hx.a;
        String str2 = str == null ? "" : str;
        if (StringsKt.k(str2, "Unable to resolve host") || StringsKt.k(str2, "UnknownHostException") || StringsKt.k(str2, "No address associated with hostname") || StringsKt.k(str2, "timeout")) {
            return;
        }
        Pair pair = new Pair("af_status", "Organic");
        if (str == null) {
            str = "";
        }
        hx.d = ik0.c(pair, new Pair("af_message", "AppsFlyer conversion data failed: ".concat(str)));
        wc1 wc1Var = new wc1(hx.d);
        ej ejVar = hx.b;
        if (ejVar.W()) {
            return;
        }
        ejVar.Y(wc1Var);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public final void onConversionDataSuccess(Map map) {
        hx hxVar = hx.a;
        Map e = map != null ? ik0.e(map) : null;
        if (e == null) {
            e = ov.d;
            e.getClass();
        }
        hx.d = e;
        hx hxVar2 = hx.a;
        Object obj = hx.d.get("af_status");
        Object obj2 = hx.d.get("media_source");
        Object obj3 = hx.d.get("campaign");
        Objects.toString(obj);
        Objects.toString(obj2);
        Objects.toString(obj3);
        wc1 wc1Var = new wc1(hx.d, hx.e);
        ej ejVar = hx.b;
        if (ejVar.W()) {
            return;
        }
        ejVar.Y(wc1Var);
    }
}
