package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.Uc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2804Uc implements InterfaceC2583Hc, InterfaceC2787Tc {

    /* renamed from: n, reason: collision with root package name */
    public final C2634Kc f28043n;

    /* renamed from: u, reason: collision with root package name */
    public final HashSet f28044u = new HashSet();

    public C2804Uc(C2634Kc c2634Kc) {
        this.f28043n = c2634Kc;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2583Hc, com.google.android.gms.internal.ads.InterfaceC2651Lc
    public final void d(String str) {
        this.f28043n.d(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2787Tc
    public final void e(String str, InterfaceC2990bc interfaceC2990bc) {
        this.f28043n.e(str, interfaceC2990bc);
        this.f28044u.remove(new AbstractMap.SimpleEntry(str, interfaceC2990bc));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2787Tc
    public final void f(String str, InterfaceC2990bc interfaceC2990bc) {
        this.f28043n.f(str, interfaceC2990bc);
        this.f28044u.add(new AbstractMap.SimpleEntry(str, interfaceC2990bc));
    }
}
