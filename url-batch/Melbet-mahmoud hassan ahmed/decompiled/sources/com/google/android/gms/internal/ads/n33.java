package com.google.android.gms.internal.ads;

import java.net.HttpURLConnection;
import java.util.Objects;

/* loaded from: classes.dex */
public final class n33 extends f33 {

    /* renamed from: f, reason: collision with root package name */
    private c53<Integer> f8918f;

    /* renamed from: g, reason: collision with root package name */
    private c53<Integer> f8919g;

    /* renamed from: h, reason: collision with root package name */
    private m33 f8920h;

    /* renamed from: i, reason: collision with root package name */
    private HttpURLConnection f8921i;

    n33() {
        this(new c53() { // from class: com.google.android.gms.internal.ads.k33
            @Override // com.google.android.gms.internal.ads.c53
            public final Object zza() {
                return n33.f();
            }
        }, new c53() { // from class: com.google.android.gms.internal.ads.l33
            @Override // com.google.android.gms.internal.ads.c53
            public final Object zza() {
                return n33.h();
            }
        }, null);
    }

    n33(c53<Integer> c53Var, c53<Integer> c53Var2, m33 m33Var) {
        this.f8918f = c53Var;
        this.f8919g = c53Var2;
        this.f8920h = m33Var;
    }

    static /* synthetic */ Integer f() {
        return -1;
    }

    static /* synthetic */ Integer h() {
        return -1;
    }

    public static void w(HttpURLConnection httpURLConnection) {
        g33.a();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        w(this.f8921i);
    }

    public HttpURLConnection u() {
        g33.b(this.f8918f.zza().intValue(), this.f8919g.zza().intValue());
        m33 m33Var = this.f8920h;
        Objects.requireNonNull(m33Var);
        HttpURLConnection httpURLConnection = (HttpURLConnection) m33Var.zza();
        this.f8921i = httpURLConnection;
        return httpURLConnection;
    }

    public HttpURLConnection v(m33 m33Var, final int i7, final int i8) {
        this.f8918f = new c53() { // from class: com.google.android.gms.internal.ads.h33
            @Override // com.google.android.gms.internal.ads.c53
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i7);
                return valueOf;
            }
        };
        this.f8919g = new c53() { // from class: com.google.android.gms.internal.ads.j33
            @Override // com.google.android.gms.internal.ads.c53
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i8);
                return valueOf;
            }
        };
        this.f8920h = m33Var;
        return u();
    }
}
