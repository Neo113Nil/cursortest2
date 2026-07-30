package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Fj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2556Fj implements InterfaceC2573Gj {

    /* renamed from: a, reason: collision with root package name */
    public final Map f25008a;

    public C2556Fj(Map map) {
        this.f25008a = map;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2573Gj
    public final InterfaceC3436jq a(int i, String str) {
        return (InterfaceC3436jq) this.f25008a.get(str);
    }
}
