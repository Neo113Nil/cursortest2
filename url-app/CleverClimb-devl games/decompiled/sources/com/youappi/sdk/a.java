package com.youappi.sdk;

import android.content.Context;
import android.os.Handler;
import com.youappi.sdk.BaseAd;
import com.youappi.sdk.logic.Logger;
import com.youappi.sdk.logic.impl.cache.d;
import com.youappi.sdk.net.model.AdItem;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9414a = "a";

    /* renamed from: b, reason: collision with root package name */
    private final Context f9415b;

    /* renamed from: c, reason: collision with root package name */
    private com.youappi.sdk.logic.impl.b f9416c;

    /* renamed from: d, reason: collision with root package name */
    private String f9417d;
    private String e;
    private com.youappi.sdk.net.a f;
    private com.youappi.sdk.logic.impl.c g;
    private Handler h;
    private d i;
    private Logger l;
    private ScheduledExecutorService m = Executors.newSingleThreadScheduledExecutor();
    private HashMap<AdItem, BaseAd> j = new HashMap<>();
    private HashMap<AdType, AdItem> k = new HashMap<>();

    a(Context context, String str, String str2) {
        this.f9415b = context;
        this.f9417d = str;
        this.e = str2;
        i();
    }

    private void i() {
        this.l = new Logger(this.m);
        this.i = new com.youappi.sdk.logic.impl.cache.c(this.f9415b);
        this.g = new com.youappi.sdk.logic.impl.c(this.f9415b, this.l);
        this.f = new com.youappi.sdk.net.a(this.g, c(), this.f9417d, this.e, this.f9415b);
        com.youappi.sdk.trackers.b.a().a(this.f9415b);
        this.l.setYouAPPiAPI(this.f);
        this.f9416c = new com.youappi.sdk.logic.impl.b(this.f9415b, j(), this.l);
        this.m.submit(new Runnable() { // from class: com.youappi.sdk.a.1
            @Override // java.lang.Runnable
            public void run() {
                a.this.g.e();
            }
        });
    }

    private Handler j() {
        if (this.h == null) {
            this.h = new Handler(this.f9415b.getMainLooper());
        }
        return this.h;
    }

    @Override // com.youappi.sdk.b
    public Context a() {
        return this.f9415b;
    }

    @Override // com.youappi.sdk.b
    public <T extends BaseAd> T a(AdType adType, Class<T> cls, String str) {
        T t;
        Exception e;
        try {
            t = cls.newInstance();
        } catch (Exception e2) {
            t = null;
            e = e2;
        }
        try {
            t.setAdUnitId(str);
            t.setAdImpl(new com.youappi.sdk.logic.impl.a(this.f9415b, this.f, this.i, this.l, this.h));
            t.setDeviceId(this.g.a());
        } catch (Exception e3) {
            e = e3;
            this.l.log(6, f9414a, "Interface type error\n" + e.toString());
            return t;
        }
        return t;
    }

    @Override // com.youappi.sdk.b
    public void a(int i) {
        if (this.l != null) {
            this.l.setUserLogLevel(i);
        }
    }

    @Override // com.youappi.sdk.b
    public void a(BaseAd.a aVar) {
        this.g.a(aVar);
    }

    @Override // com.youappi.sdk.b
    public void a(Logger.LogListener logListener) {
        if (this.l != null) {
            this.l.setLogListener(logListener);
        }
    }

    @Override // com.youappi.sdk.b
    public void a(AdItem adItem) {
        AdItem adItem2 = this.k.get(adItem.getAdType());
        if (adItem.equals(adItem2)) {
            this.k.remove(adItem2.getAdType());
        }
    }

    @Override // com.youappi.sdk.b
    public boolean a(AdItem adItem, BaseAd baseAd) {
        if (this.k.get(adItem.getAdType()) != null) {
            return false;
        }
        this.j.put(adItem, baseAd);
        this.k.put(adItem.getAdType(), adItem);
        return true;
    }

    @Override // com.youappi.sdk.b
    public BaseAd b(AdItem adItem) {
        return this.j.remove(adItem);
    }

    @Override // com.youappi.sdk.b
    public void b() {
        this.j.clear();
        this.f9416c.a();
        this.f.b();
        this.m.shutdownNow();
    }

    public String c() {
        return "https://sdk.youappi.com";
    }

    @Override // com.youappi.sdk.b
    public String d() {
        return this.f9417d;
    }

    @Override // com.youappi.sdk.b
    public String e() {
        return this.e;
    }

    @Override // com.youappi.sdk.b
    public Logger f() {
        return this.l;
    }

    @Override // com.youappi.sdk.b
    public void g() {
        this.f.a();
    }

    @Override // com.youappi.sdk.b
    public boolean h() {
        return this.g.f();
    }
}
