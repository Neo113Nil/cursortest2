package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleObserver;

/* loaded from: classes.dex */
public final /* synthetic */ class Uo implements S1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7605a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7606b;

    public /* synthetic */ Uo(int i2, Object obj) {
        this.f7605a = i2;
        this.f7606b = obj;
    }

    @Override // io.appmetrica.analytics.impl.S1
    public final void a(Intent intent) {
        switch (this.f7605a) {
            case 0:
                C0694hd.a((ModuleServiceLifecycleObserver) this.f7606b, intent);
                break;
            case 1:
                C0694hd.b((ModuleServiceLifecycleObserver) this.f7606b, intent);
                break;
            default:
                ((M1) this.f7606b).d(intent);
                break;
        }
    }
}
