package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleObserver;

/* loaded from: classes.dex */
public final /* synthetic */ class Uo implements S1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6773a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6774b;

    public /* synthetic */ Uo(int i3, Object obj) {
        this.f6773a = i3;
        this.f6774b = obj;
    }

    @Override // io.appmetrica.analytics.impl.S1
    public final void a(Intent intent) {
        switch (this.f6773a) {
            case 0:
                C0543hd.a((ModuleServiceLifecycleObserver) this.f6774b, intent);
                break;
            case 1:
                C0543hd.b((ModuleServiceLifecycleObserver) this.f6774b, intent);
                break;
            default:
                ((M1) this.f6774b).d(intent);
                break;
        }
    }
}
