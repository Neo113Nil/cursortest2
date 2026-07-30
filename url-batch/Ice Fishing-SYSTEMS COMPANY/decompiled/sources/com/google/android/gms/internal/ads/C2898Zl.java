package com.google.android.gms.internal.ads;

import q2.InterfaceC4922x;

/* renamed from: com.google.android.gms.internal.ads.Zl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2898Zl implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29058a;

    /* renamed from: b, reason: collision with root package name */
    public final C2881Yl f29059b;

    public /* synthetic */ C2898Zl(C2881Yl c2881Yl, int i) {
        this.f29058a = i;
        this.f29059b = c2881Yl;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f29058a) {
            case 0:
                return (InterfaceC4922x) this.f29059b.f28863v;
            case 1:
                return this.f29059b;
            default:
                C4133wm c4133wm = (C4133wm) this.f29059b.f28862u;
                AbstractC3137eE.h(c4133wm);
                return c4133wm;
        }
    }
}
