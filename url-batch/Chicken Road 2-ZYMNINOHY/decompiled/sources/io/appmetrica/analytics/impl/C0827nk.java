package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import io.appmetrica.analytics.BuildConfig;

/* renamed from: io.appmetrica.analytics.impl.nk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0827nk extends Jc {

    /* renamed from: a, reason: collision with root package name */
    public final C1064wo f12470a;

    public C0827nk() {
        this(C0817na.k().D().b());
    }

    @Override // io.appmetrica.analytics.impl.Jc
    public final void a(int i4) {
        C1064wo c1064wo = this.f12470a;
        synchronized (c1064wo) {
            C1116yo c1116yo = c1064wo.f12987a;
            c1116yo.a(c1116yo.a().put("last_migration_api_level", i4));
        }
    }

    @Override // io.appmetrica.analytics.impl.Jc
    public final int b() {
        int optInt;
        C1064wo c1064wo = this.f12470a;
        synchronized (c1064wo) {
            optInt = c1064wo.f12987a.a().optInt("last_migration_api_level", -1);
        }
        return optInt;
    }

    @Override // io.appmetrica.analytics.impl.Jc
    public final SparseArray<Ic> c() {
        SparseArray<Ic> sparseArray = new SparseArray<>(1);
        sparseArray.put(112, new C0853ok(this.f12470a));
        sparseArray.put(115, new C0879pk());
        sparseArray.put(BuildConfig.API_LEVEL, new C0956sk());
        return sparseArray;
    }

    public C0827nk(C1064wo c1064wo) {
        this.f12470a = c1064wo;
    }
}
