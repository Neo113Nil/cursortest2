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
    public final Context f6640a;

    /* renamed from: b, reason: collision with root package name */
    public final ib f6641b;

    /* renamed from: c, reason: collision with root package name */
    public final AdPreferences f6642c;

    /* renamed from: d, reason: collision with root package name */
    public final MetaDataRequest$RequestReason f6643d;

    /* renamed from: e, reason: collision with root package name */
    public MetaData f6644e;

    /* renamed from: f, reason: collision with root package name */
    public BannerMetaData f6645f;

    /* renamed from: g, reason: collision with root package name */
    public CacheMetaData f6646g;

    /* renamed from: h, reason: collision with root package name */
    public AdInformationMetaData f6647h;

    /* renamed from: i, reason: collision with root package name */
    public AdsCommonMetaData f6648i;

    /* renamed from: j, reason: collision with root package name */
    public final i7 f6649j;

    /* renamed from: k, reason: collision with root package name */
    public final int f6650k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f6651l;

    public a8(Context context, ib ibVar, AdPreferences adPreferences, MetaDataRequest$RequestReason metaDataRequest$RequestReason, i7 i7Var, int i4) {
        this.f6640a = context;
        this.f6641b = ibVar;
        this.f6642c = adPreferences;
        this.f6643d = metaDataRequest$RequestReason;
        this.f6649j = i7Var;
        this.f6650k = i4;
    }

    public final void a(Boolean bool) {
        k8 k8Var = (k8) com.startapp.sdk.components.a.a(this.f6640a).f6581y.a();
        k8Var.f7181a.post(new R1.e(this, 24, bool));
    }

    public final void b() {
        ((Executor) com.startapp.sdk.components.a.a(this.f6640a).f6541A.a()).execute(new R1.n(17, this));
    }

    public final /* synthetic */ void c() {
        a(a());
    }

    public final void d() {
        synchronized (MetaData.H()) {
            try {
                if ((this.f6649j == null ? true : Integer.valueOf(this.f6650k).equals(this.f6649j.a())) && this.f6644e != null) {
                    WeakHashMap weakHashMap = si.f7575a;
                    if (this.f6648i != null) {
                        try {
                            if (!si.a((Object) AdsCommonMetaData.k(), (Object) this.f6648i)) {
                                this.f6651l = true;
                                AdsCommonMetaData.a(this.f6640a, this.f6648i);
                            }
                        } catch (Throwable th) {
                            d9.a(th);
                        }
                    }
                    WeakHashMap weakHashMap2 = si.f7575a;
                    if (this.f6645f != null) {
                        try {
                            if (!si.a((Object) BannerMetaData.c(), (Object) this.f6645f)) {
                                this.f6651l = true;
                                BannerMetaData.a(this.f6640a, this.f6645f);
                            }
                        } catch (Throwable th2) {
                            d9.a(th2);
                        }
                    }
                    WeakHashMap weakHashMap3 = si.f7575a;
                    if (this.f6646g != null) {
                        try {
                            if (!si.a((Object) CacheMetaData.b(), (Object) this.f6646g)) {
                                this.f6651l = true;
                                CacheMetaData.a(this.f6640a, this.f6646g);
                            }
                        } catch (Throwable th3) {
                            d9.a(th3);
                        }
                    }
                    WeakHashMap weakHashMap4 = si.f7575a;
                    if (this.f6647h != null) {
                        try {
                            if (!si.a((Object) AdInformationMetaData.c(), (Object) this.f6647h)) {
                                this.f6651l = true;
                                AdInformationMetaData.a(this.f6640a, this.f6647h);
                            }
                        } catch (Throwable th4) {
                            d9.a(th4);
                        }
                    }
                    try {
                        MetaData.a(this.f6640a, this.f6644e.k());
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
        WeakHashMap weakHashMap = si.f7575a;
        synchronized (MetaData.H()) {
            try {
                if (this.f6649j == null ? true : Integer.valueOf(this.f6650k).equals(this.f6649j.a())) {
                    if (!Boolean.TRUE.equals(bool) || (metaData = this.f6644e) == null) {
                        MetaData.a(this.f6643d);
                    } else {
                        MetaData.a(this.f6640a, metaData, this.f6643d, this.f6651l);
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
            jc jcVar = new jc(this.f6640a, (sf) com.startapp.sdk.components.a.a(this.f6640a).f6547G.a(), this.f6643d);
            jcVar.a(this.f6640a, this.f6642c);
            String a3 = a(this.f6640a, jcVar);
            if (TextUtils.isEmpty(a3)) {
                return Boolean.FALSE;
            }
            MetaData metaData = (MetaData) JsonParser.fromJson(a3, MetaData.class);
            this.f6644e = metaData;
            if (metaData == null) {
                return Boolean.FALSE;
            }
            if (metaData.m() != null) {
                q0 q0Var = (q0) com.startapp.sdk.components.a.a(this.f6640a).f6572m.a();
                String m4 = this.f6644e.m();
                if (m4 != null) {
                    m4 = m4.trim();
                }
                synchronized (q0Var.f7466a) {
                    rf edit = q0Var.f7467b.edit();
                    edit.a("31721150b470a3b9", m4);
                    edit.f7532a.putString("31721150b470a3b9", m4);
                    edit.f7532a.commit();
                }
            }
            WeakHashMap weakHashMap = si.f7575a;
            AdsCommonMetaData adsCommonMetaData = (AdsCommonMetaData) JsonParser.fromJson(a3, AdsCommonMetaData.class);
            if (adsCommonMetaData != null) {
                this.f6648i = adsCommonMetaData;
            }
            BannerMetaData bannerMetaData = (BannerMetaData) JsonParser.fromJson(a3, BannerMetaData.class);
            if (bannerMetaData != null) {
                this.f6645f = bannerMetaData;
            }
            CacheMetaData cacheMetaData = (CacheMetaData) JsonParser.fromJson(a3, CacheMetaData.class);
            if (cacheMetaData != null) {
                this.f6646g = cacheMetaData;
            }
            AdInformationMetaData adInformationMetaData = (AdInformationMetaData) JsonParser.fromJson(a3, AdInformationMetaData.class);
            if (adInformationMetaData != null) {
                this.f6647h = adInformationMetaData;
            }
            d();
            return Boolean.TRUE;
        } catch (Throwable th) {
            d9.a(th);
            return Boolean.FALSE;
        }
    }

    public final Void b(n8 n8Var) {
        x6 x6Var = (x6) this.f6641b.a();
        WeakHashMap weakHashMap = si.f7575a;
        n8Var.getClass();
        ((y6) x6Var).a(this, n8Var);
        return null;
    }

    public final String a(Context context, jc jcVar) {
        r8 a3;
        o8 o8Var = (o8) com.startapp.sdk.components.a.a(context).n.a();
        MetaData metaData = this.f6644e;
        double y4 = metaData != null ? metaData.y() : 0.0d;
        for (String str : MetaData.E().I()) {
            if (si.a(y4)) {
                n8 n8Var = new n8(o8Var, str + h0.f7038d);
                n8Var.f7327c = jcVar.a(((HttpClientConfig) o8Var.f7374f.a()).e());
                a(n8Var);
                n8Var.f7328d = ((HttpClientConfig) o8Var.f7374f.a()).a(2);
                a3 = n8Var.b();
            } else {
                n8 n8Var2 = new n8(o8Var, jcVar.a(str + h0.f7038d));
                b(n8Var2);
                n8Var2.f7328d = ((HttpClientConfig) o8Var.f7374f.a()).a(2);
                a3 = n8Var2.a();
            }
            String str2 = a3 != null ? a3.f7523b : null;
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
            if (!((f6) com.startapp.sdk.components.a.a(context).f6577t.a()).b()) {
                break;
            }
        }
        return null;
    }

    public final Void a(n8 n8Var) {
        x6 x6Var = (x6) this.f6641b.a();
        WeakHashMap weakHashMap = si.f7575a;
        n8Var.getClass();
        ((y6) x6Var).a(this, n8Var);
        return null;
    }
}
