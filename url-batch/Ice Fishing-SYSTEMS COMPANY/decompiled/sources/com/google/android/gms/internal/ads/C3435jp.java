package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.jp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3435jp implements CD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32201a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2687Ne f32202b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f32203c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f32204d;

    public /* synthetic */ C3435jp(Object obj, C2687Ne c2687Ne, int i, int i4) {
        this.f32201a = i4;
        this.f32204d = obj;
        this.f32202b = c2687Ne;
        this.f32203c = i;
    }

    @Override // com.google.android.gms.internal.ads.CD
    public final /* synthetic */ J3.a b(Object obj) {
        Bundle bundle;
        Bundle bundle2;
        switch (this.f32201a) {
            case 0:
                C2518Df c2518Df = (C2518Df) this.f32204d;
                C2687Ne c2687Ne = this.f32202b;
                if (c2687Ne != null && (bundle = c2687Ne.f26578F) != null) {
                    bundle.putBoolean("ls", true);
                }
                return C3686oN.y(((BinderC2630Jp) ((InterfaceC3901sN) c2518Df.f24456x).d()).G3(c2687Ne, this.f32203c), new C3489kp(c2687Ne, 0), (C3157eg) c2518Df.f24454v);
            default:
                r rVar = (r) this.f32204d;
                C2687Ne c2687Ne2 = this.f32202b;
                if (c2687Ne2 != null && (bundle2 = c2687Ne2.f26578F) != null) {
                    bundle2.putBoolean("ls", true);
                }
                return C3686oN.y(((BinderC2630Jp) ((InterfaceC3901sN) rVar.f33923y).d()).J3(c2687Ne2, this.f32203c), new C3489kp(c2687Ne2, 1), (C3157eg) rVar.f33920v);
        }
    }
}
