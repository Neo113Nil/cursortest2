package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import io.appmetrica.analytics.BuildConfig;

/* renamed from: io.appmetrica.analytics.impl.rk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0959rk extends Qc {

    /* renamed from: a, reason: collision with root package name */
    public final yo f9187a;

    public C0959rk() {
        this(C1027ua.k().D().b());
    }

    @Override // io.appmetrica.analytics.impl.Qc
    public final void a(int i2) {
        yo yoVar = this.f9187a;
        synchronized (yoVar) {
            Ao ao = yoVar.f9611a;
            ao.a(ao.a().put("last_migration_api_level", i2));
        }
    }

    @Override // io.appmetrica.analytics.impl.Qc
    public final int b() {
        int optInt;
        yo yoVar = this.f9187a;
        synchronized (yoVar) {
            optInt = yoVar.f9611a.a().optInt("last_migration_api_level", -1);
        }
        return optInt;
    }

    @Override // io.appmetrica.analytics.impl.Qc
    public final SparseArray<Pc> c() {
        SparseArray<Pc> sparseArray = new SparseArray<>(1);
        sparseArray.put(112, new C0985sk(this.f9187a));
        sparseArray.put(115, new C1011tk());
        sparseArray.put(BuildConfig.API_LEVEL, new C1115xk());
        return sparseArray;
    }

    public C0959rk(yo yoVar) {
        this.f9187a = yoVar;
    }
}
