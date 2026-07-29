package com.applovin.impl.sdk.d;

import android.text.TextUtils;
import com.applovin.impl.sdk.d.q;
import com.applovin.impl.sdk.network.a;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class w<T> extends a implements a.b<T> {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.network.b<T> f3142a;

    /* renamed from: c, reason: collision with root package name */
    private final a.b<T> f3143c;

    /* renamed from: d, reason: collision with root package name */
    protected a.C0312a f3144d;
    private q.a e;
    private com.applovin.impl.sdk.b.b<String> f;
    private com.applovin.impl.sdk.b.b<String> g;

    public w(com.applovin.impl.sdk.network.b<T> bVar, com.applovin.impl.sdk.j jVar) {
        this(bVar, jVar, false);
    }

    public w(com.applovin.impl.sdk.network.b<T> bVar, final com.applovin.impl.sdk.j jVar, boolean z) {
        super("TaskRepeatRequest", jVar, z);
        this.e = q.a.BACKGROUND;
        this.f = null;
        this.g = null;
        if (bVar == null) {
            throw new IllegalArgumentException("No request specified");
        }
        this.f3142a = bVar;
        this.f3144d = new a.C0312a();
        this.f3143c = new a.b<T>() { // from class: com.applovin.impl.sdk.d.w.1
            @Override // com.applovin.impl.sdk.network.a.b
            public void a(int i) {
                w wVar;
                com.applovin.impl.sdk.b.b bVar2;
                boolean z2 = i < 200 || i >= 500;
                boolean z3 = i != -103;
                if (z2 && z3) {
                    String e = w.this.f3142a.e();
                    if (w.this.f3142a.i() > 0) {
                        w.this.c("Unable to send request due to server failure (code " + i + "). " + w.this.f3142a.i() + " attempts left, retrying in " + TimeUnit.MILLISECONDS.toSeconds(w.this.f3142a.k()) + " seconds...");
                        int i2 = w.this.f3142a.i() - 1;
                        w.this.f3142a.a(i2);
                        if (i2 == 0) {
                            w.this.c(w.this.f);
                            if (com.applovin.impl.sdk.e.i.b(e) && e.length() >= 4) {
                                w.this.f3142a.a(e);
                                w.this.b("Switching to backup endpoint " + e);
                            }
                        }
                        jVar.C().a(w.this, w.this.e, w.this.f3142a.k());
                        return;
                    }
                    if (e == null || !e.equals(w.this.f3142a.a())) {
                        wVar = w.this;
                        bVar2 = w.this.f;
                    } else {
                        wVar = w.this;
                        bVar2 = w.this.g;
                    }
                    wVar.c(bVar2);
                }
                w.this.a(i);
            }

            @Override // com.applovin.impl.sdk.network.a.b
            public void a(T t, int i) {
                w.this.f3142a.a(0);
                w.this.a((w) t, i);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <ST> void c(com.applovin.impl.sdk.b.b<ST> bVar) {
        if (bVar != null) {
            com.applovin.impl.sdk.b.c v = b().v();
            v.a((com.applovin.impl.sdk.b.b<?>) bVar, (Object) bVar.b());
            v.a();
        }
    }

    @Override // com.applovin.impl.sdk.d.a
    public com.applovin.impl.sdk.c.i a() {
        return com.applovin.impl.sdk.c.i.e;
    }

    public void a(int i) {
    }

    public void a(com.applovin.impl.sdk.b.b<String> bVar) {
        this.f = bVar;
    }

    public void a(q.a aVar) {
        this.e = aVar;
    }

    public void a(T t, int i) {
    }

    public void b(com.applovin.impl.sdk.b.b<String> bVar) {
        this.g = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i;
        com.applovin.impl.sdk.network.a B = b().B();
        if (!b().c() && !b().d()) {
            d("AppLovin SDK is disabled: please check your connection");
            b().u().e("AppLovinSdk", "AppLovin SDK is disabled: please check your connection");
            i = -22;
        } else {
            if (com.applovin.impl.sdk.e.i.b(this.f3142a.a()) && this.f3142a.a().length() >= 4) {
                if (TextUtils.isEmpty(this.f3142a.c())) {
                    this.f3142a.b(this.f3142a.d() != null ? "POST" : "GET");
                }
                B.a(this.f3142a, this.f3144d, this.f3143c);
                return;
            }
            d("Task has an invalid or null request endpoint.");
            i = AppLovinErrorCodes.INVALID_URL;
        }
        a(i);
    }
}
