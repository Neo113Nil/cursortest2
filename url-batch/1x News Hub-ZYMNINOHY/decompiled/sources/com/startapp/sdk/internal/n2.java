package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.cache.FailuresHandler;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class n2 extends p2 {

    /* renamed from: e, reason: collision with root package name */
    public final FailuresHandler f4181e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4182g;

    public n2(w2 w2Var) {
        super(w2Var);
        this.f4181e = CacheMetaData.b().a().c();
        this.f = 0;
        this.f4182g = false;
    }

    @Override // com.startapp.sdk.internal.p2
    public final boolean a() {
        FailuresHandler failuresHandler;
        gh ghVar = fh.f3800a;
        if (ghVar.f3880c || ghVar.f3882e || (failuresHandler = this.f4181e) == null || failuresHandler.a() == null) {
            return false;
        }
        if (this.f4182g) {
            return this.f4181e.b();
        }
        return true;
    }

    @Override // com.startapp.sdk.internal.p2
    public final long b() {
        Long l3;
        if (this.f >= this.f4181e.a().size() || (l3 = this.f4297c) == null) {
            return -1L;
        }
        long millis = TimeUnit.SECONDS.toMillis(((Integer) this.f4181e.a().get(this.f)).intValue()) - (System.currentTimeMillis() - l3.longValue());
        if (millis >= 0) {
            return millis;
        }
        return 0L;
    }

    @Override // com.startapp.sdk.internal.p2
    public final void c() {
        if (this.f == this.f4181e.a().size() - 1) {
            this.f4182g = true;
        } else {
            this.f++;
        }
        super.c();
    }
}
