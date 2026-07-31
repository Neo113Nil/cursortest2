package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import io.appmetrica.analytics.BuildConfig;

/* renamed from: io.appmetrica.analytics.impl.ok, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0411ok extends Kc {

    /* renamed from: a, reason: collision with root package name */
    public final xo f1419a;

    public C0411ok() {
        this(C0401oa.k().D().b());
    }

    @Override // io.appmetrica.analytics.impl.Kc
    public final void a(int i) {
        xo xoVar = this.f1419a;
        synchronized (xoVar) {
            zo zoVar = xoVar.f1572a;
            zoVar.a(zoVar.a().put("last_migration_api_level", i));
        }
    }

    @Override // io.appmetrica.analytics.impl.Kc
    public final int b() {
        int optInt;
        xo xoVar = this.f1419a;
        synchronized (xoVar) {
            optInt = xoVar.f1572a.a().optInt("last_migration_api_level", -1);
        }
        return optInt;
    }

    @Override // io.appmetrica.analytics.impl.Kc
    public final SparseArray<Jc> c() {
        SparseArray<Jc> sparseArray = new SparseArray<>(1);
        sparseArray.put(112, new C0436pk(this.f1419a));
        sparseArray.put(115, new C0461qk());
        sparseArray.put(BuildConfig.API_LEVEL, new C0535tk());
        return sparseArray;
    }

    public C0411ok(xo xoVar) {
        this.f1419a = xoVar;
    }
}
