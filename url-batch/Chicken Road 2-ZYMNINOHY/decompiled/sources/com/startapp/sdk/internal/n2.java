package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.cache.FailuresHandler;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class n2 extends p2 {

    /* renamed from: e, reason: collision with root package name */
    public final FailuresHandler f7312e;

    /* renamed from: f, reason: collision with root package name */
    public int f7313f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7314g;

    public n2(w2 w2Var) {
        super(w2Var);
        this.f7312e = CacheMetaData.b().a().c();
        this.f7313f = 0;
        this.f7314g = false;
    }

    @Override // com.startapp.sdk.internal.p2
    public final boolean a() {
        FailuresHandler failuresHandler;
        gh ghVar = fh.f6918a;
        if (ghVar.f7002c || ghVar.f7004e || (failuresHandler = this.f7312e) == null || failuresHandler.a() == null) {
            return false;
        }
        if (this.f7314g) {
            return this.f7312e.b();
        }
        return true;
    }

    @Override // com.startapp.sdk.internal.p2
    public final long b() {
        Long l4;
        if (this.f7313f >= this.f7312e.a().size() || (l4 = this.f7432c) == null) {
            return -1L;
        }
        long millis = TimeUnit.SECONDS.toMillis(((Integer) this.f7312e.a().get(this.f7313f)).intValue()) - (System.currentTimeMillis() - l4.longValue());
        if (millis >= 0) {
            return millis;
        }
        return 0L;
    }

    @Override // com.startapp.sdk.internal.p2
    public final void c() {
        if (this.f7313f == this.f7312e.a().size() - 1) {
            this.f7314g = true;
        } else {
            this.f7313f++;
        }
        super.c();
    }
}
