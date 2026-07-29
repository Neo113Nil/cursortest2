package com.applovin.impl.a;

import android.net.Uri;
import com.applovin.impl.sdk.e.m;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private int f2394a;

    /* renamed from: b, reason: collision with root package name */
    private int f2395b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f2396c;

    /* renamed from: d, reason: collision with root package name */
    private e f2397d;
    private Set<g> e = new HashSet();
    private Map<String, Set<g>> f = new HashMap();

    private b() {
    }

    public static b a(m mVar, b bVar, c cVar, com.applovin.impl.sdk.j jVar) {
        m b2;
        if (mVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (jVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (bVar == null) {
            try {
                bVar = new b();
            } catch (Throwable th) {
                jVar.u().b("VastCompanionAd", "Error occurred while initializing", th);
                return null;
            }
        }
        if (bVar.f2394a == 0 && bVar.f2395b == 0) {
            int a2 = com.applovin.impl.sdk.e.i.a(mVar.b().get("width"));
            int a3 = com.applovin.impl.sdk.e.i.a(mVar.b().get("height"));
            if (a2 > 0 && a3 > 0) {
                bVar.f2394a = a2;
                bVar.f2395b = a3;
            }
        }
        bVar.f2397d = e.a(mVar, bVar.f2397d, jVar);
        if (bVar.f2396c == null && (b2 = mVar.b("CompanionClickThrough")) != null) {
            String c2 = b2.c();
            if (com.applovin.impl.sdk.e.i.b(c2)) {
                bVar.f2396c = Uri.parse(c2);
            }
        }
        i.a(mVar.a("CompanionClickTracking"), bVar.e, cVar, jVar);
        i.a(mVar, bVar.f, cVar, jVar);
        return bVar;
    }

    public Uri a() {
        return this.f2396c;
    }

    public e b() {
        return this.f2397d;
    }

    public Set<g> c() {
        return this.e;
    }

    public Map<String, Set<g>> d() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f2394a != bVar.f2394a || this.f2395b != bVar.f2395b) {
            return false;
        }
        if (this.f2396c == null ? bVar.f2396c != null : !this.f2396c.equals(bVar.f2396c)) {
            return false;
        }
        if (this.f2397d == null ? bVar.f2397d != null : !this.f2397d.equals(bVar.f2397d)) {
            return false;
        }
        if (this.e == null ? bVar.e == null : this.e.equals(bVar.e)) {
            return this.f != null ? this.f.equals(bVar.f) : bVar.f == null;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.f2394a * 31) + this.f2395b) * 31) + (this.f2396c != null ? this.f2396c.hashCode() : 0)) * 31) + (this.f2397d != null ? this.f2397d.hashCode() : 0)) * 31) + (this.e != null ? this.e.hashCode() : 0)) * 31) + (this.f != null ? this.f.hashCode() : 0);
    }

    public String toString() {
        return "VastCompanionAd{width=" + this.f2394a + ", height=" + this.f2395b + ", destinationUri=" + this.f2396c + ", nonVideoResource=" + this.f2397d + ", clickTrackers=" + this.e + ", eventTrackers=" + this.f + '}';
    }
}
