package com.applovin.impl.a;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.e.l;
import com.applovin.impl.sdk.e.m;
import com.applovin.impl.sdk.p;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static DateFormat f2420a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");

    /* renamed from: b, reason: collision with root package name */
    private static Random f2421b = new Random(System.currentTimeMillis());

    public static Uri a(String str, long j, Uri uri, d dVar, com.applovin.impl.sdk.j jVar) {
        if (!URLUtil.isValidUrl(str)) {
            jVar.u().d("VastUtils", "Unable to replace macros in invalid URL string.");
            return null;
        }
        try {
            String replace = str.replace("[ERRORCODE]", Integer.toString(dVar.a()));
            if (j >= 0) {
                replace = replace.replace("[CONTENTPLAYHEAD]", a(j));
            }
            if (uri != null) {
                replace = replace.replace("[ASSETURI]", uri.toString());
            }
            return Uri.parse(replace.replace("[CACHEBUSTING]", a()).replace("[TIMESTAMP]", b()));
        } catch (Throwable th) {
            jVar.u().b("VastUtils", "Unable to replace macros in URL string " + str, th);
            return null;
        }
    }

    public static d a(a aVar) {
        if (b(aVar) || c(aVar)) {
            return null;
        }
        return d.GENERAL_WRAPPER_ERROR;
    }

    private static String a() {
        return Integer.toString(f2421b.nextInt(89999999) + 10000000);
    }

    private static String a(long j) {
        return j > 0 ? String.format("%02d:%02d:%02d.000", Long.valueOf(TimeUnit.SECONDS.toHours(j)), Long.valueOf(TimeUnit.SECONDS.toMinutes(j) % TimeUnit.MINUTES.toSeconds(1L)), Long.valueOf(j % TimeUnit.MINUTES.toSeconds(1L))) : "00:00:00.000";
    }

    public static String a(c cVar) {
        m c2;
        if (cVar == null) {
            throw new IllegalArgumentException("Unable to get resolution uri string for fetching the next wrapper or inline response in the chain");
        }
        List<m> b2 = cVar.b();
        int size = cVar.b().size();
        if (size <= 0 || (c2 = b2.get(size - 1).c("VASTAdTagURI")) == null) {
            return null;
        }
        return c2.c();
    }

    public static String a(m mVar, String str, String str2) {
        m b2 = mVar.b(str);
        if (b2 != null) {
            String c2 = b2.c();
            if (com.applovin.impl.sdk.e.i.b(c2)) {
                return c2;
            }
        }
        return str2;
    }

    private static Set<g> a(c cVar, com.applovin.impl.sdk.j jVar) {
        if (cVar == null) {
            return null;
        }
        List<m> b2 = cVar.b();
        Set<g> hashSet = new HashSet<>(b2.size());
        for (m mVar : b2) {
            m c2 = mVar.c("Wrapper");
            if (c2 == null) {
                c2 = mVar.c("InLine");
            }
            hashSet = a(hashSet, c2 != null ? c2.a("Error") : mVar.a("Error"), cVar, jVar);
        }
        jVar.u().a("VastUtils", "Retrieved " + hashSet.size() + " top level error trackers: " + hashSet);
        return hashSet;
    }

    private static Set<g> a(Set<g> set, List<m> list, c cVar, com.applovin.impl.sdk.j jVar) {
        if (list != null) {
            Iterator<m> it = list.iterator();
            while (it.hasNext()) {
                g a2 = g.a(it.next(), cVar, jVar);
                if (a2 != null) {
                    set.add(a2);
                }
            }
        }
        return set;
    }

    public static void a(c cVar, AppLovinAdLoadListener appLovinAdLoadListener, d dVar, int i, com.applovin.impl.sdk.j jVar) {
        if (jVar == null) {
            throw new IllegalArgumentException("Unable to handle failure. No sdk specified.");
        }
        l.a(appLovinAdLoadListener, cVar.g(), i, jVar);
        a(a(cVar, jVar), dVar, jVar);
    }

    public static void a(m mVar, Map<String, Set<g>> map, c cVar, com.applovin.impl.sdk.j jVar) {
        List<m> a2;
        p u;
        String str;
        String str2;
        if (jVar == null) {
            throw new IllegalArgumentException("Unable to render event trackers. No sdk specified.");
        }
        if (mVar == null) {
            u = jVar.u();
            str = "VastUtils";
            str2 = "Unable to render event trackers; null node provided";
        } else {
            if (map != null) {
                m b2 = mVar.b("TrackingEvents");
                if (b2 == null || (a2 = b2.a("Tracking")) == null) {
                    return;
                }
                for (m mVar2 : a2) {
                    String str3 = mVar2.b().get("event");
                    if (com.applovin.impl.sdk.e.i.b(str3)) {
                        g a3 = g.a(mVar2, cVar, jVar);
                        if (a3 != null) {
                            Set<g> set = map.get(str3);
                            if (set != null) {
                                set.add(a3);
                            } else {
                                HashSet hashSet = new HashSet();
                                hashSet.add(a3);
                                map.put(str3, hashSet);
                            }
                        }
                    } else {
                        jVar.u().d("VastUtils", "Could not find event for tracking node = " + mVar2);
                    }
                }
                return;
            }
            u = jVar.u();
            str = "VastUtils";
            str2 = "Unable to render event trackers; null event trackers provided";
        }
        u.d(str, str2);
    }

    public static void a(List<m> list, Set<g> set, c cVar, com.applovin.impl.sdk.j jVar) {
        p u;
        String str;
        String str2;
        if (jVar == null) {
            throw new IllegalArgumentException("Unable to render trackers. No sdk specified.");
        }
        if (list == null) {
            u = jVar.u();
            str = "VastUtils";
            str2 = "Unable to render trackers; null nodes provided";
        } else {
            if (set != null) {
                Iterator<m> it = list.iterator();
                while (it.hasNext()) {
                    g a2 = g.a(it.next(), cVar, jVar);
                    if (a2 != null) {
                        set.add(a2);
                    }
                }
                return;
            }
            u = jVar.u();
            str = "VastUtils";
            str2 = "Unable to render trackers; null trackers provided";
        }
        u.d(str, str2);
    }

    public static void a(Set<g> set, long j, Uri uri, d dVar, com.applovin.impl.sdk.j jVar) {
        if (jVar == null) {
            throw new IllegalArgumentException("Unable to fire trackers. No sdk specified.");
        }
        if (set == null || set.isEmpty()) {
            return;
        }
        Iterator<g> it = set.iterator();
        while (it.hasNext()) {
            Uri a2 = a(it.next().b(), j, uri, dVar, jVar);
            if (a2 != null) {
                jVar.F().a(com.applovin.impl.sdk.network.e.j().a(a2.toString()).a(false).a(), false);
            }
        }
    }

    public static void a(Set<g> set, d dVar, com.applovin.impl.sdk.j jVar) {
        a(set, -1L, (Uri) null, dVar, jVar);
    }

    public static void a(Set<g> set, com.applovin.impl.sdk.j jVar) {
        a(set, -1L, (Uri) null, d.UNSPECIFIED, jVar);
    }

    public static boolean a(m mVar) {
        if (mVar != null) {
            return mVar.c("Wrapper") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains a wrapper response");
    }

    private static String b() {
        f2420a.setTimeZone(TimeZone.getDefault());
        return f2420a.format(new Date());
    }

    public static boolean b(a aVar) {
        j a2;
        List<k> a3;
        return (aVar == null || (a2 = aVar.a()) == null || (a3 = a2.a()) == null || a3.isEmpty()) ? false : true;
    }

    public static boolean b(m mVar) {
        if (mVar != null) {
            return mVar.c("InLine") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains an inline response");
    }

    public static boolean c(a aVar) {
        b d2;
        e b2;
        if (aVar == null || (d2 = aVar.d()) == null || (b2 = d2.b()) == null) {
            return false;
        }
        return b2.b() != null || com.applovin.impl.sdk.e.i.b(b2.c());
    }
}
