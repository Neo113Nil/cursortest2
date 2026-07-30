package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* loaded from: classes2.dex */
public final class E1 implements a3 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f35668n;

    /* renamed from: u, reason: collision with root package name */
    public final C4399w2 f35669u;

    /* renamed from: v, reason: collision with root package name */
    public final Z2 f35670v;

    public /* synthetic */ E1(C4399w2 c4399w2, Z2 z22, int i) {
        this.f35668n = i;
        this.f35669u = c4399w2;
        this.f35670v = z22;
    }

    public C4357m a() {
        return new C4357m((Application) this.f35669u.f35944u, (C4333g) this.f35670v.d());
    }

    @Override // com.google.android.gms.internal.consent_sdk.b3
    public final Object d() {
        switch (this.f35668n) {
            case 0:
                return new C4375q1((Application) this.f35669u.f35944u, (C4321d) this.f35670v.d());
            default:
                return a();
        }
    }
}
