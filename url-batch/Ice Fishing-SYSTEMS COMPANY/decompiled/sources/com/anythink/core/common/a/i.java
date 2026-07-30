package com.anythink.core.common.a;

import android.content.Context;
import com.anythink.core.common.d.u;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.v.af;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static String f12335a = "i";

    /* renamed from: b, reason: collision with root package name */
    private static i f12336b;

    /* renamed from: c, reason: collision with root package name */
    private Context f12337c;

    /* renamed from: f, reason: collision with root package name */
    private final String f12340f = "rpr_";

    /* renamed from: g, reason: collision with root package name */
    private final String f12341g = "bid_";

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, a> f12338d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, Long> f12339e = new ConcurrentHashMap(5);

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public long f12342a;

        /* renamed from: b, reason: collision with root package name */
        public int f12343b;

        /* renamed from: c, reason: collision with root package name */
        public long f12344c;
    }

    private i(Context context) {
        this.f12337c = context.getApplicationContext();
    }

    public static i a(Context context) {
        if (f12336b == null) {
            synchronized (i.class) {
                try {
                    if (f12336b == null) {
                        f12336b = new i(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f12336b;
    }

    private static String c(String str) {
        return "rpr_".concat(String.valueOf(str));
    }

    private static String d(String str) {
        return "bid_".concat(String.valueOf(str));
    }

    public final Boolean b(String str) {
        a aVar = this.f12338d.get(str);
        if (aVar == null) {
            return null;
        }
        long j9 = aVar.f12344c;
        if (j9 <= 0) {
            return Boolean.FALSE;
        }
        long a9 = com.anythink.core.common.c.a().a(str);
        return a9 <= 0 ? Boolean.FALSE : System.currentTimeMillis() - a9 > j9 ? Boolean.FALSE : Boolean.TRUE;
    }

    public final void a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            this.f12338d.remove(str);
            af.a(this.f12337c, u.b.f13017o, c(str));
            af.a(this.f12337c, u.b.f13017o, d(str));
        } else {
            this.f12338d.put(str, a(jSONObject));
            af.b(this.f12337c, u.b.f13017o, c(str), jSONObject.toString());
        }
    }

    private static a a(JSONObject jSONObject) {
        a aVar = new a();
        aVar.f12342a = jSONObject.optLong("bid_inr", 0L);
        aVar.f12343b = jSONObject.optInt(com.anythink.core.common.k.aa, 2);
        aVar.f12344c = jSONObject.optLong(com.anythink.core.common.k.f14455V, 0L);
        return aVar;
    }

    public final void a() {
        try {
            Map<String, ?> b9 = af.b(this.f12337c, u.b.f13017o);
            if (b9 == null || b9.size() <= 0) {
                return;
            }
            for (Map.Entry<String, ?> entry : b9.entrySet()) {
                String key = entry.getKey();
                if (key != null) {
                    if (key.startsWith("rpr_")) {
                        Object value = entry.getValue();
                        if (value instanceof String) {
                            try {
                                a a9 = a(new JSONObject((String) value));
                                this.f12338d.put(key.replace("rpr_", ""), a9);
                            } catch (Throwable unused) {
                            }
                        }
                    } else if (key.startsWith("bid_")) {
                        Object value2 = entry.getValue();
                        if (value2 instanceof Long) {
                            this.f12339e.put(key.replace("bid_", ""), (Long) value2);
                        }
                    }
                }
            }
        } catch (Throwable unused2) {
        }
    }

    public final void a(String str, long j9) {
        this.f12339e.put(str, Long.valueOf(j9));
        af.a(this.f12337c, u.b.f13017o, d(str), j9);
    }

    public final boolean a(String str) {
        Long l9;
        a aVar = this.f12338d.get(str);
        if (aVar == null) {
            return false;
        }
        long j9 = aVar.f12342a;
        return j9 > 0 && (l9 = this.f12339e.get(str)) != null && System.currentTimeMillis() - l9.longValue() <= j9;
    }

    public final Boolean a(bv bvVar) {
        a aVar = this.f12338d.get(bvVar.z());
        if (aVar == null) {
            return null;
        }
        if (aVar.f12343b == 2) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
