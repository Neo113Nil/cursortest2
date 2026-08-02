package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import io.appmetrica.analytics.BuildConfig;

/* renamed from: io.appmetrica.analytics.impl.rk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0808rk extends Qc {

    /* renamed from: a, reason: collision with root package name */
    public final yo f8252a;

    public C0808rk() {
        this(C0876ua.k().D().b());
    }

    @Override // io.appmetrica.analytics.impl.Qc
    public final void a(int i3) {
        yo yoVar = this.f8252a;
        synchronized (yoVar) {
            Ao ao = yoVar.f8654a;
            ao.a(ao.a().put("last_migration_api_level", i3));
        }
    }

    @Override // io.appmetrica.analytics.impl.Qc
    public final int b() {
        int optInt;
        yo yoVar = this.f8252a;
        synchronized (yoVar) {
            optInt = yoVar.f8654a.a().optInt("last_migration_api_level", -1);
        }
        return optInt;
    }

    @Override // io.appmetrica.analytics.impl.Qc
    public final SparseArray<Pc> c() {
        SparseArray<Pc> sparseArray = new SparseArray<>(1);
        sparseArray.put(112, new C0834sk(this.f8252a));
        sparseArray.put(115, new C0860tk());
        sparseArray.put(BuildConfig.API_LEVEL, new C0964xk());
        return sparseArray;
    }

    public C0808rk(yo yoVar) {
        this.f8252a = yoVar;
    }
}
