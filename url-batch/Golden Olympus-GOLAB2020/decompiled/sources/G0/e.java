package G0;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f696a = "e";

    /* renamed from: b, reason: collision with root package name */
    public static final Set f697b = Collections.unmodifiableSet(new a(16));

    class a extends HashSet {
        a(int i4) {
            super(i4);
            add("ser_country");
            add("reg_country");
            add("issue_country");
            add("geo_ip");
        }
    }

    private static String a(Context context, F0.a aVar, String str, GrsBaseInfo grsBaseInfo, boolean z4) {
        String serCountry = grsBaseInfo.getSerCountry();
        String regCountry = grsBaseInfo.getRegCountry();
        String issueCountry = grsBaseInfo.getIssueCountry();
        for (String str2 : str.split(">")) {
            if (f697b.contains(str2.trim())) {
                if ("ser_country".equals(str2.trim()) && !TextUtils.isEmpty(serCountry) && !GrsBaseInfo.CountryCodeSource.UNKNOWN.equals(serCountry)) {
                    Logger.i(f696a, "current route_by is serCountry and routerCountry is: " + serCountry);
                    return serCountry;
                }
                if ("reg_country".equals(str2.trim()) && !TextUtils.isEmpty(regCountry) && !GrsBaseInfo.CountryCodeSource.UNKNOWN.equals(regCountry)) {
                    Logger.i(f696a, "current route_by is regCountry and routerCountry is: " + regCountry);
                    return regCountry;
                }
                if ("issue_country".equals(str2.trim()) && !TextUtils.isEmpty(issueCountry) && !GrsBaseInfo.CountryCodeSource.UNKNOWN.equals(issueCountry)) {
                    Logger.i(f696a, "current route_by is issueCountry and routerCountry is: " + issueCountry);
                    return issueCountry;
                }
                if ("geo_ip".equals(str2.trim())) {
                    String a4 = new H0.b(context, aVar, grsBaseInfo).a(z4);
                    Logger.i(f696a, "current route_by is geo_ip and routerCountry is: " + a4);
                    return a4;
                }
            }
        }
        return "";
    }

    public static String b(Context context, F0.a aVar, String str, GrsBaseInfo grsBaseInfo, boolean z4) {
        if (TextUtils.isEmpty(str)) {
            Logger.w(f696a, "routeBy must be not empty string or null.");
            return null;
        }
        if (!"no_route".equals(str) && !"unconditional".equals(str)) {
            return a(context, aVar, str, grsBaseInfo, z4);
        }
        Logger.v(f696a, "routeBy equals NO_ROUTE_POLICY");
        return "no_route_country";
    }
}
