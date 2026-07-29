package org.apache.a;

/* compiled from: HttpMessage.java */
/* loaded from: classes2.dex */
public interface o {
    void addHeader(String str, String str2);

    void addHeader(d dVar);

    boolean containsHeader(String str);

    d[] getAllHeaders();

    d getFirstHeader(String str);

    d[] getHeaders(String str);

    org.apache.a.i.d getParams();

    aa getProtocolVersion();

    g headerIterator();

    g headerIterator(String str);

    void setHeader(String str, String str2);

    void setHeaders(d[] dVarArr);

    void setParams(org.apache.a.i.d dVar);
}
