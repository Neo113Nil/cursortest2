package F0;

import H0.d;
import H0.g;
import K0.e;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    private static final String f643e = "a";

    /* renamed from: f, reason: collision with root package name */
    private static final Map f644f = new ConcurrentHashMap(16);

    /* renamed from: a, reason: collision with root package name */
    private final Map f645a = new ConcurrentHashMap(16);

    /* renamed from: b, reason: collision with root package name */
    private final c f646b;

    /* renamed from: c, reason: collision with root package name */
    private final c f647c;

    /* renamed from: d, reason: collision with root package name */
    private final g f648d;

    public a(c cVar, c cVar2, g gVar) {
        this.f647c = cVar2;
        this.f646b = cVar;
        this.f648d = gVar;
        gVar.d(this);
    }

    private void c(GrsBaseInfo grsBaseInfo, b bVar, Context context, String str) {
        Long l4 = (Long) this.f645a.get(grsBaseInfo.getGrsParasKey(true, true, context));
        if (e.a(l4)) {
            bVar.a(2);
            return;
        }
        if (e.b(l4, 300000L)) {
            this.f648d.g(new J0.c(grsBaseInfo, context), null, str, this.f647c, -1);
        }
        bVar.a(1);
    }

    private void f(GrsBaseInfo grsBaseInfo, String str, Context context) {
        if (e.b((Long) this.f645a.get(str), 300000L)) {
            this.f648d.g(new J0.c(grsBaseInfo, context), null, null, this.f647c, -1);
        }
    }

    public c a() {
        return this.f646b;
    }

    public Map b(GrsBaseInfo grsBaseInfo, String str, b bVar, Context context) {
        String grsParasKey = grsBaseInfo.getGrsParasKey(true, true, context);
        Map map = f644f;
        Map map2 = (Map) map.get(grsParasKey);
        if (map2 != null && !map2.isEmpty()) {
            c(grsBaseInfo, bVar, context, str);
            return (Map) map2.get(str);
        }
        Logger.d(f643e, "Cache size is: " + map.size());
        return new HashMap();
    }

    public void d(GrsBaseInfo grsBaseInfo, d dVar, Context context, J0.c cVar) {
        if (dVar.t() == 2) {
            Logger.w(f643e, "update cache from server failed");
            return;
        }
        if (cVar.e().size() == 0) {
            String grsParasKey = grsBaseInfo.getGrsParasKey(true, true, context);
            if (dVar.B()) {
                f644f.put(grsParasKey, E0.a.e(this.f646b.a(grsParasKey, "")));
            } else {
                this.f646b.f(grsParasKey, dVar.y());
                f644f.put(grsParasKey, E0.a.e(dVar.y()));
            }
            if (!TextUtils.isEmpty(dVar.r())) {
                this.f646b.f(grsParasKey + "ETag", dVar.r());
            }
            this.f646b.f(grsParasKey + CrashHianalyticsData.TIME, dVar.a());
            this.f645a.put(grsParasKey, Long.valueOf(Long.parseLong(dVar.a())));
        } else {
            this.f646b.f("geoipCountryCode", dVar.y());
            this.f646b.f("geoipCountryCodetime", dVar.a());
        }
        Logger.d(f643e, "Cache size is: " + f644f.size());
    }

    public void e(GrsBaseInfo grsBaseInfo, Context context) {
        String grsParasKey = grsBaseInfo.getGrsParasKey(true, true, context);
        this.f646b.f(grsParasKey + CrashHianalyticsData.TIME, "0");
        this.f645a.remove(grsParasKey + CrashHianalyticsData.TIME);
        Map map = f644f;
        map.remove(grsParasKey);
        Logger.d(f643e, "Cache size is: " + map.size());
        this.f648d.h(grsParasKey);
    }

    public g g() {
        return this.f648d;
    }

    public void h(GrsBaseInfo grsBaseInfo, Context context) {
        String grsParasKey = grsBaseInfo.getGrsParasKey(true, true, context);
        String a4 = this.f646b.a(grsParasKey, "");
        String a5 = this.f646b.a(grsParasKey + CrashHianalyticsData.TIME, "0");
        long j4 = 0;
        if (!TextUtils.isEmpty(a5) && a5.matches("\\d+")) {
            try {
                j4 = Long.parseLong(a5);
            } catch (NumberFormatException e4) {
                Logger.w(f643e, "convert urlParamKey from String to Long catch NumberFormatException.", e4);
            }
        }
        Map map = f644f;
        map.put(grsParasKey, E0.a.e(a4));
        Logger.d(f643e, "Cache size is: " + map.size());
        this.f645a.put(grsParasKey, Long.valueOf(j4));
        f(grsBaseInfo, grsParasKey, context);
    }

    public c i() {
        return this.f647c;
    }
}
