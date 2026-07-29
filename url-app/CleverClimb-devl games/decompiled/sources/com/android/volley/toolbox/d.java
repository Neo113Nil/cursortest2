package com.android.volley.toolbox;

import com.aiming.mdt.utils.Constants;
import com.mopub.volley.toolbox.HttpClientStack;
import java.io.IOException;
import java.net.URI;
import java.util.Map;
import org.apache.a.r;

/* compiled from: HttpClientStack.java */
/* loaded from: classes.dex */
public class d implements f {

    /* renamed from: a, reason: collision with root package name */
    protected final org.apache.a.b.g f2342a;

    protected void a(org.apache.a.b.b.k kVar) throws IOException {
    }

    public d(org.apache.a.b.g gVar) {
        this.f2342a = gVar;
    }

    private static void a(org.apache.a.b.b.k kVar, Map<String, String> map) {
        for (String str : map.keySet()) {
            kVar.setHeader(str, map.get(str));
        }
    }

    @Override // com.android.volley.toolbox.f
    public r a(com.android.volley.l<?> lVar, Map<String, String> map) throws IOException, com.android.volley.a {
        org.apache.a.b.b.k b2 = b(lVar, map);
        a(b2, map);
        a(b2, lVar.h());
        a(b2);
        org.apache.a.i.d params = b2.getParams();
        int s = lVar.s();
        org.apache.a.i.c.c(params, 5000);
        org.apache.a.i.c.a(params, s);
        return this.f2342a.execute(b2);
    }

    static org.apache.a.b.b.k b(com.android.volley.l<?> lVar, Map<String, String> map) throws com.android.volley.a {
        switch (lVar.a()) {
            case -1:
                byte[] l = lVar.l();
                if (l != null) {
                    org.apache.a.b.b.g gVar = new org.apache.a.b.b.g(lVar.c());
                    gVar.addHeader(Constants.KEY_CONTENT_TYPE, lVar.k());
                    gVar.setEntity(new org.apache.a.e.d(l));
                    return gVar;
                }
                return new org.apache.a.b.b.d(lVar.c());
            case 0:
                return new org.apache.a.b.b.d(lVar.c());
            case 1:
                org.apache.a.b.b.g gVar2 = new org.apache.a.b.b.g(lVar.c());
                gVar2.addHeader(Constants.KEY_CONTENT_TYPE, lVar.o());
                a(gVar2, lVar);
                return gVar2;
            case 2:
                org.apache.a.b.b.h hVar = new org.apache.a.b.b.h(lVar.c());
                hVar.addHeader(Constants.KEY_CONTENT_TYPE, lVar.o());
                a(hVar, lVar);
                return hVar;
            case 3:
                return new org.apache.a.b.b.b(lVar.c());
            case 4:
                return new org.apache.a.b.b.e(lVar.c());
            case 5:
                return new org.apache.a.b.b.f(lVar.c());
            case 6:
                return new org.apache.a.b.b.j(lVar.c());
            case 7:
                a aVar = new a(lVar.c());
                aVar.addHeader(Constants.KEY_CONTENT_TYPE, lVar.o());
                a(aVar, lVar);
                return aVar;
            default:
                throw new IllegalStateException("Unknown request method.");
        }
    }

    private static void a(org.apache.a.b.b.c cVar, com.android.volley.l<?> lVar) throws com.android.volley.a {
        byte[] p = lVar.p();
        if (p != null) {
            cVar.setEntity(new org.apache.a.e.d(p));
        }
    }

    /* compiled from: HttpClientStack.java */
    public static final class a extends org.apache.a.b.b.c {
        @Override // org.apache.a.b.b.i, org.apache.a.b.b.k
        public String getMethod() {
            return HttpClientStack.HttpPatch.METHOD_NAME;
        }

        public a() {
        }

        public a(String str) {
            setURI(URI.create(str));
        }
    }
}
