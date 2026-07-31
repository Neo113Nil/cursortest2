package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import com.ironsource.InterfaceC1490j3;
import io.appmetrica.analytics.BuildConfig;

/* renamed from: io.appmetrica.analytics.impl.uk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3020uk extends AbstractC2597ed {

    /* renamed from: a, reason: collision with root package name */
    public final C2998to f39946a;

    public C3020uk() {
        this(Ia.j().B().b());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2597ed
    public final void a(int i4) {
        C2998to c2998to = this.f39946a;
        synchronized (c2998to) {
            C3050vo c3050vo = c2998to.f39884a;
            c3050vo.a(c3050vo.a().put("last_migration_api_level", i4));
        }
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2597ed
    public final int b() {
        int optInt;
        C2998to c2998to = this.f39946a;
        synchronized (c2998to) {
            optInt = c2998to.f39884a.a().optInt("last_migration_api_level", -1);
        }
        return optInt;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2597ed
    public final SparseArray<InterfaceC2571dd> c() {
        SparseArray<InterfaceC2571dd> sparseArray = new SparseArray<>(1);
        sparseArray.put(InterfaceC1490j3.d.b.f16818j, new C3046vk(this.f39946a));
        sparseArray.put(BuildConfig.API_LEVEL, new C3072wk());
        return sparseArray;
    }

    public C3020uk(C2998to c2998to) {
        this.f39946a = c2998to;
    }
}
