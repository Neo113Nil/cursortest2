package com.squareup.picasso;

import android.net.NetworkInfo;
import com.squareup.picasso.q;
import com.squareup.picasso.v;
import java.io.IOException;
import okhttp3.CacheControl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
class o extends v {

    /* renamed from: a, reason: collision with root package name */
    private final d1.c f21749a;

    /* renamed from: b, reason: collision with root package name */
    private final x f21750b;

    static class a extends IOException {
        a(String str) {
            super(str);
        }
    }

    static final class b extends IOException {

        /* renamed from: b, reason: collision with root package name */
        final int f21751b;

        /* renamed from: c, reason: collision with root package name */
        final int f21752c;

        b(int i4, int i5) {
            super("HTTP " + i4);
            this.f21751b = i4;
            this.f21752c = i5;
        }
    }

    o(d1.c cVar, x xVar) {
        this.f21749a = cVar;
        this.f21750b = xVar;
    }

    private static Request j(t tVar, int i4) {
        CacheControl cacheControl;
        if (i4 == 0) {
            cacheControl = null;
        } else if (n.a(i4)) {
            cacheControl = CacheControl.f42166p;
        } else {
            CacheControl.Builder builder = new CacheControl.Builder();
            if (!n.b(i4)) {
                builder.d();
            }
            if (!n.c(i4)) {
                builder.e();
            }
            cacheControl = builder.a();
        }
        Request.Builder i5 = new Request.Builder().i(tVar.f21808d.toString());
        if (cacheControl != null) {
            i5.b(cacheControl);
        }
        return i5.a();
    }

    @Override // com.squareup.picasso.v
    public boolean c(t tVar) {
        String scheme = tVar.f21808d.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }

    @Override // com.squareup.picasso.v
    int e() {
        return 2;
    }

    @Override // com.squareup.picasso.v
    public v.a f(t tVar, int i4) {
        Response a4 = this.f21749a.a(j(tVar, i4));
        ResponseBody m4 = a4.m();
        if (!a4.X()) {
            m4.close();
            throw new b(a4.J(), tVar.f21807c);
        }
        q.e eVar = a4.o() == null ? q.e.NETWORK : q.e.DISK;
        if (eVar == q.e.DISK && m4.o() == 0) {
            m4.close();
            throw new a("Received response with 0 content-length header.");
        }
        if (eVar == q.e.NETWORK && m4.o() > 0) {
            this.f21750b.f(m4.o());
        }
        return new v.a(m4.J(), eVar);
    }

    @Override // com.squareup.picasso.v
    boolean h(boolean z4, NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    @Override // com.squareup.picasso.v
    boolean i() {
        return true;
    }
}
