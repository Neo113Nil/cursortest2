package com.anythink.core.common;

import android.text.TextUtils;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.h.au;
import com.anythink.core.common.h.bv;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static String f12402a = "c";

    /* renamed from: f, reason: collision with root package name */
    private static volatile c f12403f;

    /* renamed from: b, reason: collision with root package name */
    ConcurrentHashMap<String, Long> f12404b = new ConcurrentHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    ConcurrentHashMap<String, Long> f12405c = new ConcurrentHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    Map<String, a> f12406d = new ConcurrentHashMap(5);

    /* renamed from: e, reason: collision with root package name */
    Map<String, au> f12407e;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        String f12410a;

        /* renamed from: b, reason: collision with root package name */
        String f12411b;

        /* renamed from: c, reason: collision with root package name */
        long f12412c;
    }

    private c() {
    }

    public static c a() {
        if (f12403f == null) {
            synchronized (c.class) {
                try {
                    if (f12403f == null) {
                        f12403f = new c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f12403f;
    }

    public final boolean b(bv bvVar) {
        if (bvVar.q() == 7) {
            return false;
        }
        if (bvVar.N() == 0) {
            return false;
        }
        return bvVar.N() + (this.f12405c.get(bvVar.z()) != null ? this.f12405c.get(bvVar.z()).longValue() : 0L) >= System.currentTimeMillis();
    }

    private void b(String str, long j9) {
        this.f12405c.put(str, Long.valueOf(j9));
    }

    public final boolean a(bv bvVar) {
        if (bvVar.M() == 0) {
            return false;
        }
        return bvVar.M() + (this.f12404b.get(bvVar.z()) != null ? this.f12404b.get(bvVar.z()).longValue() : 0L) >= System.currentTimeMillis();
    }

    public final void b(String str) {
        JSONObject optJSONObject;
        this.f12407e = new ConcurrentHashMap(3);
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                try {
                    String next = keys.next();
                    if (!TextUtils.isEmpty(next) && (optJSONObject = jSONObject.optJSONObject(next)) != null) {
                        this.f12407e.put(next, new au(optJSONObject));
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
    }

    public final void a(String str, long j9) {
        this.f12404b.put(str, Long.valueOf(j9));
    }

    public final long a(String str) {
        Long l9 = this.f12405c.get(str);
        if (l9 != null) {
            return l9.longValue();
        }
        return 0L;
    }

    public final void a(String str, long j9, AdError adError) {
        if (TextUtils.equals(adError.getCode(), ErrorCode.noADError)) {
            a aVar = this.f12406d.get(str);
            if (aVar == null) {
                aVar = new a();
            }
            aVar.f12410a = adError.getPlatformCode();
            aVar.f12411b = adError.getPlatformMSG();
            aVar.f12412c = j9;
            this.f12406d.put(str, aVar);
        }
    }

    public final boolean a(int i, com.anythink.core.d.l lVar, bv bvVar) {
        int i4;
        if (this.f12407e == null) {
            return false;
        }
        List<Integer> z8 = lVar.z();
        if (z8.isEmpty()) {
            return false;
        }
        a aVar = this.f12406d.get(bvVar.z());
        if (aVar == null) {
            return false;
        }
        switch (i) {
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                i4 = 3;
                break;
            case 2:
            default:
                i4 = 1;
                break;
            case 8:
                i4 = 2;
                break;
        }
        if (!z8.contains(Integer.valueOf(i4))) {
            return false;
        }
        au auVar = this.f12407e.get(String.valueOf(bvVar.g()));
        if (auVar == null) {
            return false;
        }
        List<au.a> a9 = auVar.a();
        if (a9.isEmpty()) {
            return false;
        }
        return a(a9, aVar);
    }

    private static boolean a(List<au.a> list, a aVar) {
        if (aVar != null && list != null) {
            try {
                list.toString();
                for (int i = 0; i < list.size(); i++) {
                    au.a aVar2 = list.get(i);
                    if (aVar2 != null) {
                        String a9 = aVar2.a();
                        if (TextUtils.isEmpty(a9)) {
                            continue;
                        } else {
                            long b9 = aVar2.b();
                            Map<String, Long> c4 = aVar2.c();
                            if (a9.equals("-88888")) {
                                if (!TextUtils.isEmpty(aVar.f12411b) && c4 != null && !c4.isEmpty()) {
                                    for (Map.Entry<String, Long> entry : c4.entrySet()) {
                                        String key = entry.getKey();
                                        Long value = entry.getValue();
                                        if (value.longValue() > 0 && !TextUtils.isEmpty(key) && aVar.f12411b.contains(key) && aVar.f12412c + value.longValue() > System.currentTimeMillis()) {
                                            return true;
                                        }
                                    }
                                }
                            } else if (TextUtils.isEmpty(aVar.f12410a)) {
                                continue;
                            } else if (TextUtils.isEmpty(aVar.f12411b)) {
                                if (a9.equals(aVar.f12410a) && ((c4 == null || c4.isEmpty()) && b9 > 0 && aVar.f12412c + b9 > System.currentTimeMillis())) {
                                    return true;
                                }
                            } else if (c4 != null && !c4.isEmpty()) {
                                for (Map.Entry<String, Long> entry2 : c4.entrySet()) {
                                    String key2 = entry2.getKey();
                                    Long value2 = entry2.getValue();
                                    if (value2.longValue() > 0 && !TextUtils.isEmpty(key2) && aVar.f12411b.contains(key2) && aVar.f12412c + value2.longValue() > System.currentTimeMillis()) {
                                        return true;
                                    }
                                }
                            } else if (b9 > 0 && aVar.f12412c + b9 > System.currentTimeMillis()) {
                                return true;
                            }
                        }
                    }
                }
            } catch (Exception e6) {
                e6.printStackTrace();
            }
        }
        return false;
    }
}
