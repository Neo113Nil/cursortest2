package org.apache.a.h;

/* compiled from: AbstractHttpMessage.java */
/* loaded from: classes2.dex */
public abstract class a implements org.apache.a.o {
    protected q headergroup;
    protected org.apache.a.i.d params;

    protected a(org.apache.a.i.d dVar) {
        this.headergroup = new q();
        this.params = dVar;
    }

    protected a() {
        this(null);
    }

    @Override // org.apache.a.o
    public boolean containsHeader(String str) {
        return this.headergroup.d(str);
    }

    @Override // org.apache.a.o
    public org.apache.a.d[] getHeaders(String str) {
        return this.headergroup.a(str);
    }

    @Override // org.apache.a.o
    public org.apache.a.d getFirstHeader(String str) {
        return this.headergroup.b(str);
    }

    public org.apache.a.d getLastHeader(String str) {
        return this.headergroup.c(str);
    }

    @Override // org.apache.a.o
    public org.apache.a.d[] getAllHeaders() {
        return this.headergroup.b();
    }

    @Override // org.apache.a.o
    public void addHeader(org.apache.a.d dVar) {
        this.headergroup.a(dVar);
    }

    @Override // org.apache.a.o
    public void addHeader(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Header name may not be null");
        }
        this.headergroup.a(new b(str, str2));
    }

    public void setHeader(org.apache.a.d dVar) {
        this.headergroup.c(dVar);
    }

    @Override // org.apache.a.o
    public void setHeader(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Header name may not be null");
        }
        this.headergroup.c(new b(str, str2));
    }

    @Override // org.apache.a.o
    public void setHeaders(org.apache.a.d[] dVarArr) {
        this.headergroup.a(dVarArr);
    }

    public void removeHeader(org.apache.a.d dVar) {
        this.headergroup.b(dVar);
    }

    public void removeHeaders(String str) {
        if (str == null) {
            return;
        }
        org.apache.a.g c2 = this.headergroup.c();
        while (c2.hasNext()) {
            if (str.equalsIgnoreCase(((org.apache.a.d) c2.next()).c())) {
                c2.remove();
            }
        }
    }

    @Override // org.apache.a.o
    public org.apache.a.g headerIterator() {
        return this.headergroup.c();
    }

    @Override // org.apache.a.o
    public org.apache.a.g headerIterator(String str) {
        return this.headergroup.e(str);
    }

    @Override // org.apache.a.o
    public org.apache.a.i.d getParams() {
        if (this.params == null) {
            this.params = new org.apache.a.i.b();
        }
        return this.params;
    }

    @Override // org.apache.a.o
    public void setParams(org.apache.a.i.d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        this.params = dVar;
    }
}
