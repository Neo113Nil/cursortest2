package com.applovin.impl.a;

import com.applovin.impl.sdk.e.m;
import com.mopub.mobileads.VastIconXmlManager;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private String f2415a;

    /* renamed from: b, reason: collision with root package name */
    private String f2416b;

    /* renamed from: c, reason: collision with root package name */
    private String f2417c;

    /* renamed from: d, reason: collision with root package name */
    private long f2418d = -1;
    private int e = -1;

    private g() {
    }

    private static int a(String str, c cVar) {
        if ("start".equalsIgnoreCase(str)) {
            return 0;
        }
        if ("firstQuartile".equalsIgnoreCase(str)) {
            return 25;
        }
        if ("midpoint".equalsIgnoreCase(str)) {
            return 50;
        }
        if ("thirdQuartile".equalsIgnoreCase(str)) {
            return 75;
        }
        if (!"complete".equalsIgnoreCase(str)) {
            return -1;
        }
        if (cVar != null) {
            return cVar.i();
        }
        return 95;
    }

    public static g a(m mVar, c cVar, com.applovin.impl.sdk.j jVar) {
        long seconds;
        if (mVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (jVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        try {
            String c2 = mVar.c();
            if (!com.applovin.impl.sdk.e.i.b(c2)) {
                jVar.u().d("VastTracker", "Unable to create tracker. Could not find URL.");
                return null;
            }
            g gVar = new g();
            gVar.f2417c = c2;
            gVar.f2415a = mVar.b().get("id");
            gVar.f2416b = mVar.b().get("event");
            gVar.e = a(gVar.a(), cVar);
            String str = mVar.b().get(VastIconXmlManager.OFFSET);
            if (com.applovin.impl.sdk.e.i.b(str)) {
                String trim = str.trim();
                if (trim.contains("%")) {
                    gVar.e = com.applovin.impl.sdk.e.i.a(trim.substring(0, trim.length() - 1));
                } else if (trim.contains(":")) {
                    List<String> a2 = com.applovin.impl.sdk.e.c.a(trim, ":");
                    int size = a2.size();
                    if (size > 0) {
                        int i = size - 1;
                        long j = 0;
                        for (int i2 = i; i2 >= 0; i2--) {
                            String str2 = a2.get(i2);
                            if (com.applovin.impl.sdk.e.i.d(str2)) {
                                int parseInt = Integer.parseInt(str2);
                                if (i2 == i) {
                                    seconds = parseInt;
                                } else if (i2 == size - 2) {
                                    seconds = TimeUnit.MINUTES.toSeconds(parseInt);
                                } else if (i2 == size - 3) {
                                    seconds = TimeUnit.HOURS.toSeconds(parseInt);
                                }
                                j += seconds;
                            }
                        }
                        gVar.f2418d = j;
                        gVar.e = -1;
                    }
                } else {
                    jVar.u().d("VastTracker", "Unable to parse time offset from rawOffsetString = " + trim);
                }
            }
            return gVar;
        } catch (Throwable th) {
            jVar.u().b("VastTracker", "Error occurred while initializing", th);
            return null;
        }
    }

    public String a() {
        return this.f2416b;
    }

    public boolean a(long j, int i) {
        return (((this.f2418d > 0L ? 1 : (this.f2418d == 0L ? 0 : -1)) >= 0) && ((j > this.f2418d ? 1 : (j == this.f2418d ? 0 : -1)) >= 0)) || ((this.e >= 0) && (i >= this.e));
    }

    public String b() {
        return this.f2417c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f2418d != gVar.f2418d || this.e != gVar.e) {
            return false;
        }
        if (this.f2415a == null ? gVar.f2415a != null : !this.f2415a.equals(gVar.f2415a)) {
            return false;
        }
        if (this.f2416b == null ? gVar.f2416b == null : this.f2416b.equals(gVar.f2416b)) {
            return this.f2417c.equals(gVar.f2417c);
        }
        return false;
    }

    public int hashCode() {
        return ((((((((this.f2415a != null ? this.f2415a.hashCode() : 0) * 31) + (this.f2416b != null ? this.f2416b.hashCode() : 0)) * 31) + this.f2417c.hashCode()) * 31) + ((int) (this.f2418d ^ (this.f2418d >>> 32)))) * 31) + this.e;
    }

    public String toString() {
        return "VastTracker{identifier='" + this.f2415a + "', event='" + this.f2416b + "', uriString='" + this.f2417c + "', offsetSeconds=" + this.f2418d + ", offsetPercent=" + this.e + '}';
    }
}
