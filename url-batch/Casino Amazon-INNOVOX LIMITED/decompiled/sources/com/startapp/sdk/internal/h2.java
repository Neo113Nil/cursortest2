package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.cache.FailuresHandler;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class h2 extends j2 {
    public final FailuresHandler e;
    public int f;
    public boolean g;

    public h2(q2 q2Var) {
        super(q2Var);
        this.e = CacheMetaData.b().a().c();
        this.f = 0;
        this.g = false;
    }

    @Override // com.startapp.sdk.internal.j2
    public final boolean a() {
        FailuresHandler failuresHandler;
        qg qgVar = pg.f382a;
        if (qgVar.c || qgVar.d || (failuresHandler = this.e) == null || failuresHandler.a() == null) {
            return false;
        }
        if (this.g) {
            return this.e.b();
        }
        return true;
    }

    @Override // com.startapp.sdk.internal.j2
    public final long b() {
        Long l;
        if (this.f >= this.e.a().size() || (l = this.c) == null) {
            return -1L;
        }
        long millis = TimeUnit.SECONDS.toMillis(((Integer) this.e.a().get(this.f)).intValue()) - (System.currentTimeMillis() - l.longValue());
        if (millis >= 0) {
            return millis;
        }
        return 0L;
    }

    @Override // com.startapp.sdk.internal.j2
    public final void c() {
        if (this.f == this.e.a().size() - 1) {
            this.g = true;
        } else {
            this.f++;
        }
        super.c();
    }
}
