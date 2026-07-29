package com.facebook.ads.internal.adapters;

import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static final Set<h> f4925a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private static final Map<AdPlacementType, String> f4926b = new ConcurrentHashMap();

    static {
        for (h hVar : h.a()) {
            Class cls = null;
            switch (hVar.l) {
                case BANNER:
                    cls = BannerAdapter.class;
                    break;
                case INTERSTITIAL:
                    cls = InterstitialAdapter.class;
                    break;
                case NATIVE:
                    cls = ab.class;
                    break;
                case INSTREAM:
                    cls = u.class;
                    break;
                case REWARDED_VIDEO:
                    cls = ae.class;
                    break;
            }
            if (cls != null) {
                Class<?> cls2 = hVar.i;
                if (cls2 == null) {
                    try {
                        cls2 = Class.forName(hVar.j);
                    } catch (ClassNotFoundException unused) {
                    }
                }
                if (cls2 != null && cls.isAssignableFrom(cls2)) {
                    f4925a.add(hVar);
                }
            }
        }
    }

    public static AdAdapter a(g gVar, AdPlacementType adPlacementType) {
        try {
            h b2 = b(gVar, adPlacementType);
            if (b2 == null || !f4925a.contains(b2)) {
                return null;
            }
            Class<?> cls = b2.i;
            if (cls == null) {
                cls = Class.forName(b2.j);
            }
            return (AdAdapter) cls.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static AdAdapter a(String str, AdPlacementType adPlacementType) {
        return a(g.a(str), adPlacementType);
    }

    public static String a(AdPlacementType adPlacementType) {
        if (f4926b.containsKey(adPlacementType)) {
            return f4926b.get(adPlacementType);
        }
        HashSet hashSet = new HashSet();
        for (h hVar : f4925a) {
            if (hVar.l == adPlacementType) {
                hashSet.add(hVar.k.toString());
            }
        }
        String a2 = com.facebook.ads.internal.q.a.t.a(hashSet, ",");
        f4926b.put(adPlacementType, a2);
        return a2;
    }

    private static h b(g gVar, AdPlacementType adPlacementType) {
        for (h hVar : f4925a) {
            if (hVar.k == gVar && hVar.l == adPlacementType) {
                return hVar;
            }
        }
        return null;
    }
}
