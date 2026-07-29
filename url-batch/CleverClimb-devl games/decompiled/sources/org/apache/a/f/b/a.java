package org.apache.a.f.b;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* compiled from: AbstractAuthenticationHandler.java */
/* loaded from: classes2.dex */
public abstract class a implements org.apache.a.b.b {

    /* renamed from: b, reason: collision with root package name */
    private static final List<String> f9760b = Collections.unmodifiableList(Arrays.asList("negotiate", "NTLM", "Digest", "Basic"));

    /* renamed from: a, reason: collision with root package name */
    private final Log f9761a = LogFactory.getLog(getClass());

    protected Map<String, org.apache.a.d> a(org.apache.a.d[] dVarArr) throws org.apache.a.a.j {
        org.apache.a.k.b bVar;
        int i;
        HashMap hashMap = new HashMap(dVarArr.length);
        for (org.apache.a.d dVar : dVarArr) {
            if (dVar instanceof org.apache.a.c) {
                org.apache.a.c cVar = (org.apache.a.c) dVar;
                bVar = cVar.a();
                i = cVar.b();
            } else {
                String d2 = dVar.d();
                if (d2 == null) {
                    throw new org.apache.a.a.j("Header value is null");
                }
                bVar = new org.apache.a.k.b(d2.length());
                bVar.a(d2);
                i = 0;
            }
            while (i < bVar.c() && org.apache.a.j.d.a(bVar.a(i))) {
                i++;
            }
            int i2 = i;
            while (i2 < bVar.c() && !org.apache.a.j.d.a(bVar.a(i2))) {
                i2++;
            }
            hashMap.put(bVar.a(i, i2).toLowerCase(Locale.ENGLISH), dVar);
        }
        return hashMap;
    }

    protected List<String> a() {
        return f9760b;
    }

    protected List<String> c(org.apache.a.r rVar, org.apache.a.j.e eVar) {
        return a();
    }

    @Override // org.apache.a.b.b
    public org.apache.a.a.a a(Map<String, org.apache.a.d> map, org.apache.a.r rVar, org.apache.a.j.e eVar) throws org.apache.a.a.f {
        org.apache.a.a.c cVar = (org.apache.a.a.c) eVar.a("http.authscheme-registry");
        if (cVar == null) {
            throw new IllegalStateException("AuthScheme registry not set in HTTP context");
        }
        List<String> c2 = c(rVar, eVar);
        if (c2 == null) {
            c2 = f9760b;
        }
        if (this.f9761a.isDebugEnabled()) {
            this.f9761a.debug("Authentication schemes in the order of preference: " + c2);
        }
        org.apache.a.a.a aVar = null;
        Iterator<String> it = c2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            if (map.get(next.toLowerCase(Locale.ENGLISH)) != null) {
                if (this.f9761a.isDebugEnabled()) {
                    this.f9761a.debug(next + " authentication scheme selected");
                }
                try {
                    aVar = cVar.a(next, rVar.getParams());
                    break;
                } catch (IllegalStateException unused) {
                    if (this.f9761a.isWarnEnabled()) {
                        this.f9761a.warn("Authentication scheme " + next + " not supported");
                    }
                }
            } else if (this.f9761a.isDebugEnabled()) {
                this.f9761a.debug("Challenge for " + next + " authentication scheme not available");
            }
        }
        if (aVar != null) {
            return aVar;
        }
        throw new org.apache.a.a.f("Unable to respond to any of these challenges: " + map);
    }
}
