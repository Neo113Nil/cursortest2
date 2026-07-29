package org.apache.a.f.b;

import java.net.URI;
import java.net.URISyntaxException;
import org.apache.a.aa;
import org.apache.a.ac;
import org.apache.a.z;

/* compiled from: RequestWrapper.java */
/* loaded from: classes2.dex */
public class r extends org.apache.a.h.a implements org.apache.a.b.b.k {

    /* renamed from: a, reason: collision with root package name */
    private final org.apache.a.p f9786a;

    /* renamed from: b, reason: collision with root package name */
    private URI f9787b;

    /* renamed from: c, reason: collision with root package name */
    private String f9788c;

    /* renamed from: d, reason: collision with root package name */
    private aa f9789d;
    private int e;

    public boolean a() {
        return true;
    }

    public r(org.apache.a.p pVar) throws z {
        if (pVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        this.f9786a = pVar;
        setParams(pVar.getParams());
        setHeaders(pVar.getAllHeaders());
        if (pVar instanceof org.apache.a.b.b.k) {
            org.apache.a.b.b.k kVar = (org.apache.a.b.b.k) pVar;
            this.f9787b = kVar.getURI();
            this.f9788c = kVar.getMethod();
            this.f9789d = null;
        } else {
            ac requestLine = pVar.getRequestLine();
            try {
                this.f9787b = new URI(requestLine.c());
                this.f9788c = requestLine.a();
                this.f9789d = pVar.getProtocolVersion();
            } catch (URISyntaxException e) {
                throw new z("Invalid request URI: " + requestLine.c(), e);
            }
        }
        this.e = 0;
    }

    public void b() {
        this.headergroup.a();
        setHeaders(this.f9786a.getAllHeaders());
    }

    @Override // org.apache.a.b.b.k
    public String getMethod() {
        return this.f9788c;
    }

    @Override // org.apache.a.o
    public aa getProtocolVersion() {
        if (this.f9789d == null) {
            this.f9789d = org.apache.a.i.e.b(getParams());
        }
        return this.f9789d;
    }

    @Override // org.apache.a.b.b.k
    public URI getURI() {
        return this.f9787b;
    }

    public void a(URI uri) {
        this.f9787b = uri;
    }

    @Override // org.apache.a.p
    public ac getRequestLine() {
        String method = getMethod();
        aa protocolVersion = getProtocolVersion();
        String aSCIIString = this.f9787b != null ? this.f9787b.toASCIIString() : null;
        if (aSCIIString == null || aSCIIString.length() == 0) {
            aSCIIString = "/";
        }
        return new org.apache.a.h.m(method, aSCIIString, protocolVersion);
    }

    public org.apache.a.p c() {
        return this.f9786a;
    }

    public int d() {
        return this.e;
    }

    public void e() {
        this.e++;
    }
}
