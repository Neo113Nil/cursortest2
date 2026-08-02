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

/* loaded from: classes.dex */
public class a8 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3540a;

    /* renamed from: b, reason: collision with root package name */
    public final ib f3541b;

    /* renamed from: c, reason: collision with root package name */
    public final AdPreferences f3542c;

    /* renamed from: d, reason: collision with root package name */
    public final MetaDataRequest$RequestReason f3543d;

    /* renamed from: e, reason: collision with root package name */
    public MetaData f3544e;
    public BannerMetaData f;

    /* renamed from: g, reason: collision with root package name */
    public CacheMetaData f3545g;

    /* renamed from: h, reason: collision with root package name */
    public AdInformationMetaData f3546h;

    /* renamed from: i, reason: collision with root package name */
    public AdsCommonMetaData f3547i;

    /* renamed from: j, reason: collision with root package name */
    public final i7 f3548j;

    /* renamed from: k, reason: collision with root package name */
    public final int f3549k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3550l;

    public a8(Context context, ib ibVar, AdPreferences adPreferences, MetaDataRequest$RequestReason metaDataRequest$RequestReason, i7 i7Var, int i3) {
        this.f3540a = context;
        this.f3541b = ibVar;
        this.f3542c = adPreferences;
        this.f3543d = metaDataRequest$RequestReason;
        this.f3548j = i7Var;
        this.f3549k = i3;
    }

    public final void a(Boolean bool) {
        k8 k8Var = (k8) com.startapp.sdk.components.a.a(this.f3540a).f3483y.a();
        k8Var.f4053a.post(new A1.a(this, 8, bool));
    }

    public final void b() {
        ((Executor) com.startapp.sdk.components.a.a(this.f3540a).f3443A.a()).execute(new B0.n(10, this));
    }

    public final /* synthetic */ void c() {
        a(a());
    }

    public final void d() {
        synchronized (MetaData.H()) {
            try {
                if ((this.f3548j == null ? true : Integer.valueOf(this.f3549k).equals(this.f3548j.a())) && this.f3544e != null) {
                    WeakHashMap weakHashMap = si.f4438a;
                    if (this.f3547i != null) {
                        try {
                            if (!si.a((Object) AdsCommonMetaData.k(), (Object) this.f3547i)) {
                                this.f3550l = true;
                                AdsCommonMetaData.a(this.f3540a, this.f3547i);
                            }
                        } catch (Throwable th) {
                            d9.a(th);
                        }
                    }
                    WeakHashMap weakHashMap2 = si.f4438a;
                    if (this.f != null) {
                        try {
                            if (!si.a((Object) BannerMetaData.c(), (Object) this.f)) {
                                this.f3550l = true;
                                BannerMetaData.a(this.f3540a, this.f);
                            }
                        } catch (Throwable th2) {
                            d9.a(th2);
                        }
                    }
                    WeakHashMap weakHashMap3 = si.f4438a;
                    if (this.f3545g != null) {
                        try {
                            if (!si.a((Object) CacheMetaData.b(), (Object) this.f3545g)) {
                                this.f3550l = true;
                                CacheMetaData.a(this.f3540a, this.f3545g);
                            }
                        } catch (Throwable th3) {
                            d9.a(th3);
                        }
                    }
                    WeakHashMap weakHashMap4 = si.f4438a;
                    if (this.f3546h != null) {
                        try {
                            if (!si.a((Object) AdInformationMetaData.c(), (Object) this.f3546h)) {
                                this.f3550l = true;
                                AdInformationMetaData.a(this.f3540a, this.f3546h);
                            }
                        } catch (Throwable th4) {
                            d9.a(th4);
                        }
                    }
                    try {
                        MetaData.a(this.f3540a, this.f3544e.k());
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(Boolean bool) {
        MetaData metaData;
        WeakHashMap weakHashMap = si.f4438a;
        synchronized (MetaData.H()) {
            try {
                if (this.f3548j == null ? true : Integer.valueOf(this.f3549k).equals(this.f3548j.a())) {
                    if (!Boolean.TRUE.equals(bool) || (metaData = this.f3544e) == null) {
                        MetaData.a(this.f3543d);
                    } else {
                        MetaData.a(this.f3540a, metaData, this.f3543d, this.f3550l);
                    }
                }
            } catch (Throwable th) {
                d9.a(th);
            } finally {
            }
        }
    }

    public Boolean a() {
        try {
            jc jcVar = new jc(this.f3540a, (sf) com.startapp.sdk.components.a.a(this.f3540a).f3449G.a(), this.f3543d);
            jcVar.a(this.f3540a, this.f3542c);
            String a3 = a(this.f3540a, jcVar);
            if (TextUtils.isEmpty(a3)) {
                return Boolean.FALSE;
            }
            MetaData metaData = (MetaData) JsonParser.fromJson(a3, MetaData.class);
            this.f3544e = metaData;
            if (metaData == null) {
                return Boolean.FALSE;
            }
            if (metaData.m() != null) {
                q0 q0Var = (q0) com.startapp.sdk.components.a.a(this.f3540a).f3473m.a();
                String m3 = this.f3544e.m();
                if (m3 != null) {
                    m3 = m3.trim();
                }
                synchronized (q0Var.f4330a) {
                    rf edit = q0Var.f4331b.edit();
                    edit.a("31721150b470a3b9", m3);
                    edit.f4395a.putString("31721150b470a3b9", m3);
                    edit.f4395a.commit();
                }
            }
            WeakHashMap weakHashMap = si.f4438a;
            AdsCommonMetaData adsCommonMetaData = (AdsCommonMetaData) JsonParser.fromJson(a3, AdsCommonMetaData.class);
            if (adsCommonMetaData != null) {
                this.f3547i = adsCommonMetaData;
            }
            BannerMetaData bannerMetaData = (BannerMetaData) JsonParser.fromJson(a3, BannerMetaData.class);
            if (bannerMetaData != null) {
                this.f = bannerMetaData;
            }
            CacheMetaData cacheMetaData = (CacheMetaData) JsonParser.fromJson(a3, CacheMetaData.class);
            if (cacheMetaData != null) {
                this.f3545g = cacheMetaData;
            }
            AdInformationMetaData adInformationMetaData = (AdInformationMetaData) JsonParser.fromJson(a3, AdInformationMetaData.class);
            if (adInformationMetaData != null) {
                this.f3546h = adInformationMetaData;
            }
            d();
            return Boolean.TRUE;
        } catch (Throwable th) {
            d9.a(th);
            return Boolean.FALSE;
        }
    }

    public final Void b(n8 n8Var) {
        x6 x6Var = (x6) this.f3541b.a();
        WeakHashMap weakHashMap = si.f4438a;
        n8Var.getClass();
        ((y6) x6Var).a(this, n8Var);
        return null;
    }

    public final String a(Context context, jc jcVar) {
        r8 a3;
        o8 o8Var = (o8) com.startapp.sdk.components.a.a(context).f3474n.a();
        MetaData metaData = this.f3544e;
        double y3 = metaData != null ? metaData.y() : 0.0d;
        for (String str : MetaData.E().I()) {
            if (si.a(y3)) {
                n8 n8Var = new n8(o8Var, str + h0.f3914d);
                n8Var.f4194c = jcVar.a(((HttpClientConfig) o8Var.f.a()).e());
                a(n8Var);
                n8Var.f4195d = ((HttpClientConfig) o8Var.f.a()).a(2);
                a3 = n8Var.b();
            } else {
                n8 n8Var2 = new n8(o8Var, jcVar.a(str + h0.f3914d));
                b(n8Var2);
                n8Var2.f4195d = ((HttpClientConfig) o8Var.f.a()).a(2);
                a3 = n8Var2.a();
            }
            String str2 = a3 != null ? a3.f4386b : null;
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
            if (!((f6) com.startapp.sdk.components.a.a(context).f3479t.a()).b()) {
                break;
            }
        }
        return null;
    }

    public final Void a(n8 n8Var) {
        x6 x6Var = (x6) this.f3541b.a();
        WeakHashMap weakHashMap = si.f4438a;
        n8Var.getClass();
        ((y6) x6Var).a(this, n8Var);
        return null;
    }
}
