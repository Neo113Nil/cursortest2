package org.apache.a.c.a;

import java.net.InetAddress;
import org.apache.a.m;

/* compiled from: ConnRouteParams.java */
/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final m f9663a = new m("127.0.0.255", 0, "no-host");

    /* renamed from: b, reason: collision with root package name */
    public static final org.apache.a.c.b.b f9664b = new org.apache.a.c.b.b(f9663a);

    public static m a(org.apache.a.i.d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("Parameters must not be null.");
        }
        m mVar = (m) dVar.a("http.route.default-proxy");
        if (mVar == null || !f9663a.equals(mVar)) {
            return mVar;
        }
        return null;
    }

    public static org.apache.a.c.b.b b(org.apache.a.i.d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("Parameters must not be null.");
        }
        org.apache.a.c.b.b bVar = (org.apache.a.c.b.b) dVar.a("http.route.forced-route");
        if (bVar == null || !f9664b.equals(bVar)) {
            return bVar;
        }
        return null;
    }

    public static InetAddress c(org.apache.a.i.d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("Parameters must not be null.");
        }
        return (InetAddress) dVar.a("http.route.local-address");
    }
}
