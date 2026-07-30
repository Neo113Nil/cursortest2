package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Aj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2471Aj implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23884a;

    /* renamed from: b, reason: collision with root package name */
    public final C2881Yl f23885b;

    public /* synthetic */ C2471Aj(C2881Yl c2881Yl, int i) {
        this.f23884a = i;
        this.f23885b = c2881Yl;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f23884a) {
            case 0:
                C3378il c3378il = (C3378il) this.f23885b.f28863v;
                return c3378il != null ? new C2473Al(c3378il, AbstractC3212fg.f30745h) : new C2473Al(new C4292zj(), AbstractC3212fg.f30745h);
            case 1:
                return (C3378il) this.f23885b.f28863v;
            default:
                return (C2863Xk) this.f23885b.f28862u;
        }
    }
}
