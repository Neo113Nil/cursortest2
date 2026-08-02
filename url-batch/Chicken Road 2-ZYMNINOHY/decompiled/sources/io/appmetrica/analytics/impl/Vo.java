package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleObserver;

/* loaded from: classes.dex */
public final /* synthetic */ class Vo implements I1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11152a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11153b;

    public /* synthetic */ Vo(int i4, Object obj) {
        this.f11152a = i4;
        this.f11153b = obj;
    }

    @Override // io.appmetrica.analytics.impl.I1
    public final void a(Intent intent) {
        switch (this.f11152a) {
            case 0:
                C0484ad.a((ModuleServiceLifecycleObserver) this.f11153b, intent);
                break;
            case 1:
                C0484ad.b((ModuleServiceLifecycleObserver) this.f11153b, intent);
                break;
            default:
                ((B1) this.f11153b).d(intent);
                break;
        }
    }
}
