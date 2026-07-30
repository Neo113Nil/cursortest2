package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* renamed from: com.google.android.gms.internal.consent_sdk.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4325e implements a3 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f35828n;

    /* renamed from: u, reason: collision with root package name */
    public final C4399w2 f35829u;

    public /* synthetic */ C4325e(C4399w2 c4399w2, int i) {
        this.f35828n = i;
        this.f35829u = c4399w2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.b3
    public final Object d() {
        switch (this.f35828n) {
            case 0:
                return new C4321d((Application) this.f35829u.f35944u);
            case 1:
                return new C4333g((Application) this.f35829u.f35944u);
            case 2:
                return new r((Application) this.f35829u.f35944u);
            default:
                return new C4396w((Application) this.f35829u.f35944u);
        }
    }
}
