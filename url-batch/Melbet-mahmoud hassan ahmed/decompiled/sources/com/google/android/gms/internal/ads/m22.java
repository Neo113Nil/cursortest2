package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class m22 extends mi0 {

    /* renamed from: f, reason: collision with root package name */
    private final Context f8374f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f8375g;

    /* renamed from: h, reason: collision with root package name */
    private final hj0 f8376h;

    /* renamed from: i, reason: collision with root package name */
    private final i11 f8377i;

    /* renamed from: j, reason: collision with root package name */
    private final ArrayDeque<j22> f8378j;

    /* renamed from: k, reason: collision with root package name */
    private final ij0 f8379k;

    /* renamed from: l, reason: collision with root package name */
    private final r22 f8380l;

    /* JADX WARN: Multi-variable type inference failed */
    public m22(Context context, Context context2, Executor executor, ij0 ij0Var, i11 i11Var, hj0 hj0Var, ArrayDeque<j22> arrayDeque, r22 r22Var) {
        m10.c(context);
        this.f8374f = context;
        this.f8375g = context2;
        this.f8379k = executor;
        this.f8376h = i11Var;
        this.f8377i = ij0Var;
        this.f8378j = hj0Var;
        this.f8380l = arrayDeque;
    }

    private static cc3<JSONObject> A6(vi0 vi0Var, nw2 nw2Var, final bk2 bk2Var) {
        xa3 xa3Var = new xa3() { // from class: com.google.android.gms.internal.ads.a22
            @Override // com.google.android.gms.internal.ads.xa3
            public final cc3 c(Object obj) {
                return bk2.this.b().a(y2.t.q().M((Bundle) obj));
            }
        };
        return nw2Var.b(gw2.GMS_SIGNALS, rb3.i(vi0Var.f13401f)).f(xa3Var).e(new pv2() { // from class: com.google.android.gms.internal.ads.x12
            @Override // com.google.android.gms.internal.ads.pv2
            public final Object c(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                a3.r1.k("Ad request signals:");
                a3.r1.k(jSONObject.toString(2));
                return jSONObject;
            }
        }).a();
    }

    private final synchronized void B6(j22 j22Var) {
        r();
        this.f8378j.addLast(j22Var);
    }

    private final void C6(cc3<InputStream> cc3Var, ri0 ri0Var) {
        rb3.r(rb3.n(cc3Var, new xa3() { // from class: com.google.android.gms.internal.ads.y12
            @Override // com.google.android.gms.internal.ads.xa3
            public final cc3 c(Object obj) {
                final InputStream inputStream = (InputStream) obj;
                ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
                final ParcelFileDescriptor parcelFileDescriptor2 = createPipe[1];
                wo0.f13894a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ct2
                    @Override // java.lang.Runnable
                    public final void run() {
                        InputStream inputStream2 = inputStream;
                        try {
                            try {
                                ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor2);
                                try {
                                    v3.j.b(inputStream2, autoCloseOutputStream);
                                    autoCloseOutputStream.close();
                                    if (inputStream2 != null) {
                                        inputStream2.close();
                                    }
                                } catch (Throwable th) {
                                    try {
                                        autoCloseOutputStream.close();
                                    } catch (Throwable unused) {
                                    }
                                    throw th;
                                }
                            } catch (IOException unused2) {
                            }
                        } catch (Throwable th2) {
                            if (inputStream2 != null) {
                                try {
                                    inputStream2.close();
                                } catch (Throwable unused3) {
                                }
                            }
                            throw th2;
                        }
                    }
                });
                return rb3.i(parcelFileDescriptor);
            }
        }, wo0.f13894a), new i22(this, ri0Var), wo0.f13899f);
    }

    private final synchronized void r() {
        int intValue = h30.f6056c.e().intValue();
        while (this.f8378j.size() >= intValue) {
            this.f8378j.removeFirst();
        }
    }

    private final synchronized j22 x6(String str) {
        Iterator<j22> it = this.f8378j.iterator();
        while (it.hasNext()) {
            j22 next = it.next();
            if (next.f6942d.equals(str)) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    private final synchronized j22 y6(String str) {
        Iterator<j22> it = this.f8378j.iterator();
        while (it.hasNext()) {
            j22 next = it.next();
            if (next.f6941c.equals(str)) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    private static cc3<yi0> z6(cc3<JSONObject> cc3Var, nw2 nw2Var, cc0 cc0Var) {
        return nw2Var.b(gw2.BUILD_URL, cc3Var).f(cc0Var.a("AFMA_getAdDictionary", zb0.f15062b, new tb0() { // from class: com.google.android.gms.internal.ads.w12
            @Override // com.google.android.gms.internal.ads.tb0
            public final Object b(JSONObject jSONObject) {
                return new yi0(jSONObject);
            }
        })).a();
    }

    @Override // com.google.android.gms.internal.ads.ni0
    public final void Q0(vi0 vi0Var, ri0 ri0Var) {
        C6(u6(vi0Var, Binder.getCallingUid()), ri0Var);
    }

    @Override // com.google.android.gms.internal.ads.ni0
    public final void Z0(String str, ri0 ri0Var) {
        C6(v6(str), ri0Var);
    }

    @Override // com.google.android.gms.internal.ads.ni0
    public final void h2(vi0 vi0Var, ri0 ri0Var) {
        C6(s6(vi0Var, Binder.getCallingUid()), ri0Var);
    }

    final /* synthetic */ void j() {
        zo0.a(this.f8376h.a(), "persistFlags");
    }

    @Override // com.google.android.gms.internal.ads.ni0
    public final void m5(vi0 vi0Var, ri0 ri0Var) {
        cc3<InputStream> t6 = t6(vi0Var, Binder.getCallingUid());
        C6(t6, ri0Var);
        t6.b(new Runnable() { // from class: com.google.android.gms.internal.ads.b22
            @Override // java.lang.Runnable
            public final void run() {
                m22.this.j();
            }
        }, this.f8375g);
    }

    public final cc3<InputStream> s6(final vi0 vi0Var, int i7) {
        if (!h30.f6054a.e().booleanValue()) {
            return rb3.h(new Exception("Split request is disabled."));
        }
        au2 au2Var = vi0Var.f13409n;
        if (au2Var == null) {
            return rb3.h(new Exception("Pool configuration missing from request."));
        }
        if (au2Var.f2971j == 0 || au2Var.f2972k == 0) {
            return rb3.h(new Exception("Caching is disabled."));
        }
        cc0 b7 = y2.t.g().b(this.f8374f, po0.c());
        bk2 a7 = this.f8377i.a(vi0Var, i7);
        nw2 c7 = a7.c();
        final cc3<JSONObject> A6 = A6(vi0Var, c7, a7);
        final cc3<yi0> z6 = z6(A6, c7, b7);
        return c7.a(gw2.GET_URL_AND_CACHE_KEY, A6, z6).a(new Callable() { // from class: com.google.android.gms.internal.ads.c22
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return m22.this.w6(z6, A6, vi0Var);
            }
        }).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final cc3<InputStream> t6(vi0 vi0Var, int i7) {
        j22 x6;
        String str;
        dw2 a7;
        cc0 b7 = y2.t.g().b(this.f8374f, po0.c());
        bk2 a8 = this.f8377i.a(vi0Var, i7);
        rb0 a9 = b7.a("google.afma.response.normalize", l22.f7787d, zb0.f15063c);
        t22 t22Var = new t22(vi0Var.f13407l);
        q22 q22Var = new q22(this.f8374f, vi0Var.f13402g.f10301f, this.f8379k, i7, null);
        nw2 c7 = a8.c();
        j22 j22Var = null;
        if (h30.f6054a.e().booleanValue()) {
            if (h30.f6057d.e().booleanValue()) {
                x6 = y6(vi0Var.f13408m);
            } else {
                if (!TextUtils.isEmpty(vi0Var.f13410o)) {
                    x6 = x6(vi0Var.f13410o);
                }
                if (j22Var == null) {
                    str = "Request contained a PoolKey but no matching parameters were found.";
                    a3.r1.k(str);
                }
            }
            j22Var = x6;
            if (j22Var == null) {
            }
        } else {
            String str2 = vi0Var.f13410o;
            if (str2 != null && !str2.isEmpty()) {
                str = "Request contained a PoolKey but split request is disabled.";
                a3.r1.k(str);
            }
        }
        if (j22Var == null) {
            final cc3<JSONObject> A6 = A6(vi0Var, c7, a8);
            final cc3<yi0> z6 = z6(A6, c7, b7);
            final rv2 a10 = c7.a(gw2.HTTP, z6, A6).a(new Callable() { // from class: com.google.android.gms.internal.ads.d22
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new s22((JSONObject) cc3.this.get(), (yi0) z6.get());
                }
            }).e(t22Var).e(q22Var).a();
            a7 = c7.a(gw2.PRE_PROCESS, A6, z6, a10).a(new Callable() { // from class: com.google.android.gms.internal.ads.g22
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new l22((p22) cc3.this.get(), (JSONObject) A6.get(), (yi0) z6.get());
                }
            });
        } else {
            final rv2 a11 = c7.b(gw2.HTTP, rb3.i(new s22(j22Var.f6940b, j22Var.f6939a))).e(t22Var).e(q22Var).a();
            final cc3<?> i8 = rb3.i(j22Var);
            a7 = c7.a(gw2.PRE_PROCESS, a11, i8).a(new Callable() { // from class: com.google.android.gms.internal.ads.f22
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    cc3 cc3Var = cc3.this;
                    cc3 cc3Var2 = i8;
                    return new l22((p22) cc3Var.get(), ((j22) cc3Var2.get()).f6940b, ((j22) cc3Var2.get()).f6939a);
                }
            });
        }
        return a7.f(a9).a();
    }

    public final cc3<InputStream> u6(vi0 vi0Var, int i7) {
        cc0 b7 = y2.t.g().b(this.f8374f, po0.c());
        if (!m30.f8391a.e().booleanValue()) {
            return rb3.h(new Exception("Signal collection disabled."));
        }
        bk2 a7 = this.f8377i.a(vi0Var, i7);
        final lj2<JSONObject> a8 = a7.a();
        return a7.c().b(gw2.GET_SIGNALS, rb3.i(vi0Var.f13401f)).f(new xa3() { // from class: com.google.android.gms.internal.ads.z12
            @Override // com.google.android.gms.internal.ads.xa3
            public final cc3 c(Object obj) {
                return lj2.this.a(y2.t.q().M((Bundle) obj));
            }
        }).b(gw2.JS_SIGNALS).f(b7.a("google.afma.request.getSignals", zb0.f15062b, zb0.f15063c)).a();
    }

    public final cc3<InputStream> v6(String str) {
        if (!h30.f6054a.e().booleanValue()) {
            return rb3.h(new Exception("Split request is disabled."));
        }
        h22 h22Var = new h22(this);
        if ((h30.f6057d.e().booleanValue() ? y6(str) : x6(str)) != null) {
            return rb3.i(h22Var);
        }
        String valueOf = String.valueOf(str);
        return rb3.h(new Exception(valueOf.length() != 0 ? "URL to be removed not found for cache key: ".concat(valueOf) : new String("URL to be removed not found for cache key: ")));
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ InputStream w6(cc3 cc3Var, cc3 cc3Var2, vi0 vi0Var) {
        String c7 = ((yi0) cc3Var.get()).c();
        B6(new j22((yi0) cc3Var.get(), (JSONObject) cc3Var2.get(), vi0Var.f13408m, c7));
        return new ByteArrayInputStream(c7.getBytes(c43.f3729c));
    }
}
