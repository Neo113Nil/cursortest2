package org.apache.a.f.b;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;

/* compiled from: DefaultHttpRequestRetryHandler.java */
/* loaded from: classes2.dex */
public class i implements org.apache.a.b.h {

    /* renamed from: a, reason: collision with root package name */
    private final int f9773a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f9774b;

    public i(int i, boolean z) {
        this.f9773a = i;
        this.f9774b = z;
    }

    public i() {
        this(3, false);
    }

    @Override // org.apache.a.b.h
    public boolean a(IOException iOException, int i, org.apache.a.j.e eVar) {
        if (iOException == null) {
            throw new IllegalArgumentException("Exception parameter may not be null");
        }
        if (eVar == null) {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
        if (i > this.f9773a || (iOException instanceof InterruptedIOException) || (iOException instanceof UnknownHostException) || (iOException instanceof ConnectException) || (iOException instanceof SSLException)) {
            return false;
        }
        if (a((org.apache.a.p) eVar.a("http.request"))) {
            return true;
        }
        Boolean bool = (Boolean) eVar.a("http.request_sent");
        return !(bool != null && bool.booleanValue()) || this.f9774b;
    }

    private boolean a(org.apache.a.p pVar) {
        return !(pVar instanceof org.apache.a.k);
    }
}
