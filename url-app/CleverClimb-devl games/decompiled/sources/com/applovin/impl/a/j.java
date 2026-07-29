package com.applovin.impl.a;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.applovin.impl.sdk.e.m;
import com.youappi.sdk.net.model.VideoEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private List<k> f2422a;

    /* renamed from: b, reason: collision with root package name */
    private List<String> f2423b;

    /* renamed from: c, reason: collision with root package name */
    private int f2424c;

    /* renamed from: d, reason: collision with root package name */
    private Uri f2425d;
    private final Set<g> e;
    private final Map<String, Set<g>> f;

    public enum a {
        UNSPECIFIED,
        LOW,
        MEDIUM,
        HIGH
    }

    private j() {
        this.f2422a = Collections.EMPTY_LIST;
        this.f2423b = Collections.EMPTY_LIST;
        this.e = new HashSet();
        this.f = new HashMap();
    }

    private j(c cVar) {
        this.f2422a = Collections.EMPTY_LIST;
        this.f2423b = Collections.EMPTY_LIST;
        this.e = new HashSet();
        this.f = new HashMap();
        this.f2423b = cVar.h();
    }

    private static int a(String str, com.applovin.impl.sdk.j jVar) {
        try {
            if (com.applovin.impl.sdk.e.c.a(str, ":").size() == 3) {
                return (int) (TimeUnit.HOURS.toSeconds(com.applovin.impl.sdk.e.i.a(r1.get(0))) + TimeUnit.MINUTES.toSeconds(com.applovin.impl.sdk.e.i.a(r1.get(1))) + com.applovin.impl.sdk.e.i.a(r1.get(2)));
            }
        } catch (Throwable unused) {
            jVar.u().d("VastVideoCreative", "Unable to parse duration from \"" + str + "\"");
        }
        return 0;
    }

    public static j a(m mVar, j jVar, c cVar, com.applovin.impl.sdk.j jVar2) {
        m b2;
        List<k> a2;
        m b3;
        int a3;
        if (mVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (cVar == null) {
            throw new IllegalArgumentException("No context specified.");
        }
        if (jVar2 == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (jVar == null) {
            try {
                jVar = new j(cVar);
            } catch (Throwable th) {
                jVar2.u().b("VastVideoCreative", "Error occurred while initializing", th);
                return null;
            }
        }
        if (jVar.f2424c == 0 && (b3 = mVar.b("Duration")) != null && (a3 = a(b3.c(), jVar2)) > 0) {
            jVar.f2424c = a3;
        }
        m b4 = mVar.b("MediaFiles");
        if (b4 != null && (a2 = a(b4, jVar2)) != null && a2.size() > 0) {
            if (jVar.f2422a != null) {
                a2.addAll(jVar.f2422a);
            }
            jVar.f2422a = a2;
        }
        m b5 = mVar.b("VideoClicks");
        if (b5 != null) {
            if (jVar.f2425d == null && (b2 = b5.b(VideoEvent.EVENT_CLICK_THROUGH)) != null) {
                String c2 = b2.c();
                if (com.applovin.impl.sdk.e.i.b(c2)) {
                    jVar.f2425d = Uri.parse(c2);
                }
            }
            i.a(b5.a("ClickTracking"), jVar.e, cVar, jVar2);
        }
        i.a(mVar, jVar.f, cVar, jVar2);
        return jVar;
    }

    private static List<k> a(m mVar, com.applovin.impl.sdk.j jVar) {
        List<m> a2 = mVar.a("MediaFile");
        ArrayList arrayList = new ArrayList(a2.size());
        List<String> a3 = com.applovin.impl.sdk.e.c.a((String) jVar.a(com.applovin.impl.sdk.b.b.eO));
        List<String> a4 = com.applovin.impl.sdk.e.c.a((String) jVar.a(com.applovin.impl.sdk.b.b.eN));
        Iterator<m> it = a2.iterator();
        while (it.hasNext()) {
            k a5 = k.a(it.next(), jVar);
            if (a5 != null) {
                try {
                    String d2 = a5.d();
                    if (!com.applovin.impl.sdk.e.i.b(d2) || a3.contains(d2)) {
                        if (((Boolean) jVar.a(com.applovin.impl.sdk.b.b.eP)).booleanValue()) {
                            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(a5.b().toString());
                            if (com.applovin.impl.sdk.e.i.b(fileExtensionFromUrl) && !a4.contains(fileExtensionFromUrl)) {
                            }
                        }
                        jVar.u().c("VastVideoCreative", "Video file not supported: " + a5);
                    }
                    arrayList.add(a5);
                } catch (Throwable th) {
                    jVar.u().b("VastVideoCreative", "Failed to validate vidoe file: " + a5, th);
                }
            }
        }
        return arrayList;
    }

    public k a(a aVar) {
        if (this.f2422a == null || this.f2422a.size() == 0) {
            return null;
        }
        List arrayList = new ArrayList(3);
        for (String str : this.f2423b) {
            for (k kVar : this.f2422a) {
                String d2 = kVar.d();
                if (com.applovin.impl.sdk.e.i.b(d2) && str.equalsIgnoreCase(d2)) {
                    arrayList.add(kVar);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = this.f2422a;
        }
        Collections.sort(arrayList, new Comparator<k>() { // from class: com.applovin.impl.a.j.1
            @Override // java.util.Comparator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(k kVar2, k kVar3) {
                return Integer.compare(kVar2.e(), kVar3.e());
            }
        });
        return (k) arrayList.get(aVar == a.LOW ? 0 : aVar == a.MEDIUM ? arrayList.size() / 2 : arrayList.size() - 1);
    }

    public List<k> a() {
        return this.f2422a;
    }

    public int b() {
        return this.f2424c;
    }

    public Uri c() {
        return this.f2425d;
    }

    public Set<g> d() {
        return this.e;
    }

    public Map<String, Set<g>> e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f2424c != jVar.f2424c) {
            return false;
        }
        if (this.f2422a == null ? jVar.f2422a != null : !this.f2422a.equals(jVar.f2422a)) {
            return false;
        }
        if (this.f2425d == null ? jVar.f2425d != null : !this.f2425d.equals(jVar.f2425d)) {
            return false;
        }
        if (this.e == null ? jVar.e == null : this.e.equals(jVar.e)) {
            return this.f != null ? this.f.equals(jVar.f) : jVar.f == null;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((this.f2422a != null ? this.f2422a.hashCode() : 0) * 31) + this.f2424c) * 31) + (this.f2425d != null ? this.f2425d.hashCode() : 0)) * 31) + (this.e != null ? this.e.hashCode() : 0)) * 31) + (this.f != null ? this.f.hashCode() : 0);
    }

    public String toString() {
        return "VastVideoCreative{videoFiles=" + this.f2422a + ", durationSeconds=" + this.f2424c + ", destinationUri=" + this.f2425d + ", clickTrackers=" + this.e + ", eventTrackers=" + this.f + '}';
    }
}
