package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.gm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3272gm implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31099a;

    /* renamed from: b, reason: collision with root package name */
    public final C2860Xh f31100b;

    public /* synthetic */ C3272gm(C2860Xh c2860Xh, int i) {
        this.f31099a = i;
        this.f31100b = c2860Xh;
    }

    public C3278gs a() {
        C5107a b9 = this.f31100b.b();
        C3157eg c3157eg = AbstractC3212fg.f30738a;
        AbstractC3137eE.h(c3157eg);
        return new C3278gs(b9, c3157eg);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f31099a) {
            case 0:
                C5107a b9 = this.f31100b.b();
                t2.G g9 = p2.j.f39798C.f39803c;
                return new C3617n8(UUID.randomUUID().toString(), b9, com.anythink.expressad.foundation.g.a.f.f19277a, new JSONObject(), true);
            default:
                return a();
        }
    }
}
