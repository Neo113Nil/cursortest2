package com.startapp.sdk.internal;

import android.content.Context;
import android.text.TextUtils;
import com.startapp.json.JsonParser;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.adinformation.AdInformationMetaData;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.HttpClientConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class l7 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f316a;
    public final pa b;
    public final AdPreferences c;
    public final MetaDataRequest$RequestReason d;
    public MetaData e;
    public BannerMetaData f;
    public CacheMetaData g;
    public AdInformationMetaData h;
    public AdsCommonMetaData i;
    public final c7 j;
    public final int k;
    public boolean l;

    public l7(Context context, pa paVar, AdPreferences adPreferences, MetaDataRequest$RequestReason metaDataRequest$RequestReason, c7 c7Var, int i) {
        this.f316a = context;
        this.b = paVar;
        this.c = adPreferences;
        this.d = metaDataRequest$RequestReason;
        this.j = c7Var;
        this.k = i;
    }

    public final void a(final Boolean bool) {
        v7 v7Var = (v7) com.startapp.sdk.components.a.a(this.f316a).y.a();
        v7Var.f464a.post(new Runnable() { // from class: com.startapp.sdk.internal.l7$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                l7.this.b(bool);
            }
        });
    }

    public final void b() {
        ((Executor) com.startapp.sdk.components.a.a(this.f316a).A.a()).execute(new Runnable() { // from class: com.startapp.sdk.internal.l7$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                l7.this.c();
            }
        });
    }

    public final /* synthetic */ void c() {
        a(a());
    }

    public final void d() {
        synchronized (MetaData.D()) {
            if ((this.j == null ? true : Integer.valueOf(this.k).equals(this.j.call())) && this.e != null) {
                WeakHashMap weakHashMap = zh.f528a;
                if (this.i != null) {
                    try {
                        if (!zh.a((Object) AdsCommonMetaData.k(), (Object) this.i)) {
                            this.l = true;
                            AdsCommonMetaData.a(this.f316a, this.i);
                        }
                    } catch (Throwable th) {
                        n8.a(th);
                    }
                }
                WeakHashMap weakHashMap2 = zh.f528a;
                if (this.f != null) {
                    try {
                        if (!zh.a((Object) BannerMetaData.c(), (Object) this.f)) {
                            this.l = true;
                            BannerMetaData.a(this.f316a, this.f);
                        }
                    } catch (Throwable th2) {
                        n8.a(th2);
                    }
                }
                WeakHashMap weakHashMap3 = zh.f528a;
                if (this.g != null) {
                    try {
                        if (!zh.a((Object) CacheMetaData.b(), (Object) this.g)) {
                            this.l = true;
                            CacheMetaData.a(this.f316a, this.g);
                        }
                    } catch (Throwable th3) {
                        n8.a(th3);
                    }
                }
                WeakHashMap weakHashMap4 = zh.f528a;
                if (this.h != null) {
                    try {
                        if (!zh.a((Object) AdInformationMetaData.c(), (Object) this.h)) {
                            this.l = true;
                            AdInformationMetaData.a(this.f316a, this.h);
                        }
                    } catch (Throwable th4) {
                        n8.a(th4);
                    }
                }
                try {
                    MetaData.a(this.f316a, this.e.j());
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(Boolean bool) {
        MetaData metaData;
        WeakHashMap weakHashMap = zh.f528a;
        synchronized (MetaData.D()) {
            if (this.j == null ? true : Integer.valueOf(this.k).equals(this.j.call())) {
                if (!Boolean.TRUE.equals(bool) || (metaData = this.e) == null) {
                    MetaData.a(this.d);
                } else {
                    try {
                        MetaData.a(this.f316a, metaData, this.d, this.l);
                    } catch (Throwable th) {
                        n8.a(th);
                    }
                }
            }
        }
    }

    public Boolean a() {
        try {
            rb rbVar = new rb(this.f316a, (af) com.startapp.sdk.components.a.a(this.f316a).G.a(), this.d);
            rbVar.a(this.f316a, this.c);
            String a2 = a(this.f316a, rbVar);
            if (TextUtils.isEmpty(a2)) {
                return Boolean.FALSE;
            }
            MetaData metaData = (MetaData) JsonParser.fromJson(a2, MetaData.class);
            this.e = metaData;
            if (metaData == null) {
                return Boolean.FALSE;
            }
            if (metaData.l() != null) {
                n0 n0Var = (n0) com.startapp.sdk.components.a.a(this.f316a).l.a();
                String l = this.e.l();
                if (l != null) {
                    l = l.trim();
                }
                synchronized (n0Var.f343a) {
                    ze edit = n0Var.b.edit();
                    edit.a("31721150b470a3b9", l);
                    edit.f526a.putString("31721150b470a3b9", l);
                    edit.f526a.commit();
                }
            }
            WeakHashMap weakHashMap = zh.f528a;
            AdsCommonMetaData adsCommonMetaData = (AdsCommonMetaData) JsonParser.fromJson(a2, AdsCommonMetaData.class);
            if (adsCommonMetaData != null) {
                this.i = adsCommonMetaData;
            }
            BannerMetaData bannerMetaData = (BannerMetaData) JsonParser.fromJson(a2, BannerMetaData.class);
            if (bannerMetaData != null) {
                this.f = bannerMetaData;
            }
            CacheMetaData cacheMetaData = (CacheMetaData) JsonParser.fromJson(a2, CacheMetaData.class);
            if (cacheMetaData != null) {
                this.g = cacheMetaData;
            }
            AdInformationMetaData adInformationMetaData = (AdInformationMetaData) JsonParser.fromJson(a2, AdInformationMetaData.class);
            if (adInformationMetaData != null) {
                this.h = adInformationMetaData;
            }
            d();
            return Boolean.TRUE;
        } catch (Throwable th) {
            n8.a(th);
            return Boolean.FALSE;
        }
    }

    public final Void b(y7 y7Var) {
        w6 w6Var = (w6) this.b.a();
        WeakHashMap weakHashMap = zh.f528a;
        y7Var.getClass();
        w6Var.a(this, y7Var);
        return null;
    }

    public final String a(Context context, rb rbVar) {
        c8 a2;
        z7 z7Var = (z7) com.startapp.sdk.components.a.a(context).m.a();
        MetaData metaData = this.e;
        double v = metaData != null ? metaData.v() : 0.0d;
        for (String str : MetaData.A().E()) {
            if (zh.a(v)) {
                y7 y7Var = new y7(z7Var, str + f0.d);
                y7Var.c = rbVar.a(((HttpClientConfig) z7Var.f.a()).e());
                new a7() { // from class: com.startapp.sdk.internal.l7$$ExternalSyntheticLambda1
                    @Override // com.startapp.sdk.internal.a7
                    public final Object a(Object obj) {
                        return l7.this.a((y7) obj);
                    }
                }.a(y7Var);
                y7Var.d = z7Var.a(2);
                try {
                    a2 = z7Var.b(y7Var);
                } catch (Throwable th) {
                    if (z7Var.b(4)) {
                        n8.a(th);
                    }
                    a2 = null;
                }
            } else {
                y7 y7Var2 = new y7(z7Var, rbVar.a(str + f0.d));
                new a7() { // from class: com.startapp.sdk.internal.l7$$ExternalSyntheticLambda2
                    @Override // com.startapp.sdk.internal.a7
                    public final Object a(Object obj) {
                        return l7.this.b((y7) obj);
                    }
                }.a(y7Var2);
                y7Var2.d = z7Var.a(2);
                a2 = y7Var2.a();
            }
            String str2 = a2 != null ? a2.b : null;
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
            if (!((w5) com.startapp.sdk.components.a.a(context).t.a()).b()) {
                break;
            }
        }
        return null;
    }

    public final Void a(y7 y7Var) {
        w6 w6Var = (w6) this.b.a();
        WeakHashMap weakHashMap = zh.f528a;
        y7Var.getClass();
        w6Var.a(this, y7Var);
        return null;
    }
}
