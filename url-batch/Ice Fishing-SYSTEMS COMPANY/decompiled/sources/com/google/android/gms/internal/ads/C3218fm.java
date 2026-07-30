package com.google.android.gms.internal.ads;

import org.json.JSONObject;
import p2.C4856a;

/* renamed from: com.google.android.gms.internal.ads.fm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3218fm implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30880a;

    /* renamed from: b, reason: collision with root package name */
    public final C2518Df f30881b;

    public /* synthetic */ C3218fm(C2518Df c2518Df, int i) {
        this.f30880a = i;
        this.f30881b = c2518Df;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f30880a) {
            case 0:
                JSONObject jSONObject = (JSONObject) this.f30881b.f24453u;
                AbstractC3137eE.h(jSONObject);
                return jSONObject;
            case 1:
                C4026un c4026un = (C4026un) this.f30881b.f24454v;
                AbstractC3137eE.h(c4026un);
                return c4026un;
            case 2:
                return (C4856a) this.f30881b.f24455w;
            default:
                return (C4072vf) this.f30881b.f24456x;
        }
    }
}
