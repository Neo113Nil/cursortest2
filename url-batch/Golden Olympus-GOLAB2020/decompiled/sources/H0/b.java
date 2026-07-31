package H0;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import org.json.JSONException;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f717a;

    /* renamed from: b, reason: collision with root package name */
    private final GrsBaseInfo f718b;

    /* renamed from: c, reason: collision with root package name */
    private final F0.a f719c;

    public b(Context context, F0.a aVar, GrsBaseInfo grsBaseInfo) {
        this.f717a = context;
        this.f718b = grsBaseInfo;
        this.f719c = aVar;
    }

    public String a(boolean z4) {
        String str;
        String str2 = (String) E0.a.h(this.f719c.a().a("geoipCountryCode", ""), "geoip.countrycode").get("ROOT");
        Logger.i("GeoipCountry", "geoIpCountry is: " + str2);
        String a4 = this.f719c.a().a("geoipCountryCodetime", "0");
        long j4 = 0;
        if (!TextUtils.isEmpty(a4) && a4.matches("\\d+")) {
            try {
                j4 = Long.parseLong(a4);
            } catch (NumberFormatException e4) {
                Logger.w("GeoipCountry", "convert urlParamKey from String to Long catch NumberFormatException.", e4);
            }
        }
        if (TextUtils.isEmpty(str2) || K0.e.a(Long.valueOf(j4))) {
            J0.c cVar = new J0.c(this.f718b, this.f717a);
            cVar.b("geoip.countrycode");
            F0.c i4 = this.f719c.i();
            if (i4 != null) {
                try {
                    str = h.a(i4.a("services", ""), cVar.d());
                } catch (JSONException e5) {
                    Logger.w("GeoipCountry", "getGeoipCountry merge services occure jsonException. %s", StringUtils.anonymizeMessage(e5.getMessage()));
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    i4.f("services", str);
                }
            }
            if (z4) {
                d b4 = this.f719c.g().b(cVar, "geoip.countrycode", i4, -1);
                if (b4 != null) {
                    str2 = (String) E0.a.h(b4.y(), "geoip.countrycode").get("ROOT");
                }
                Logger.i("GeoipCountry", "sync request to query geoip.countrycode is:" + str2);
            } else {
                Logger.i("GeoipCountry", "async request to query geoip.countrycode");
                this.f719c.g().g(cVar, null, "geoip.countrycode", i4, -1);
            }
        }
        return str2;
    }
}
