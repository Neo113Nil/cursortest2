package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.dn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3110dn implements InterfaceC3725p8 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f30228n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3858rh f30229u;

    public /* synthetic */ C3110dn(InterfaceC3858rh interfaceC3858rh, int i) {
        this.f30228n = i;
        this.f30229u = interfaceC3858rh;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3725p8
    public final /* synthetic */ void A(C3671o8 c3671o8) {
        switch (this.f30228n) {
            case 0:
                HashMap hashMap = new HashMap();
                hashMap.put("isVisible", true != c3671o8.f33111j ? "0" : "1");
                this.f30229u.a("onAdVisibilityChanged", hashMap);
                break;
            case 1:
                Rect rect = c3671o8.f33106d;
                this.f30229u.j0().i(rect.left, rect.top);
                break;
            default:
                Rect rect2 = c3671o8.f33106d;
                this.f30229u.j0().i(rect2.left, rect2.top);
                break;
        }
    }
}
