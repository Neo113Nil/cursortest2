package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class BN implements InterfaceC4279zN {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f24032c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile InterfaceC4063vN f24033a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f24034b;

    public static InterfaceC4279zN a(InterfaceC4063vN interfaceC4063vN) {
        if ((interfaceC4063vN instanceof BN) || (interfaceC4063vN instanceof C4009uN)) {
            return interfaceC4063vN;
        }
        BN bn = new BN();
        bn.f24034b = f24032c;
        bn.f24033a = interfaceC4063vN;
        return bn;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        Object obj = this.f24034b;
        if (obj != f24032c) {
            return obj;
        }
        InterfaceC4063vN interfaceC4063vN = this.f24033a;
        if (interfaceC4063vN == null) {
            return this.f24034b;
        }
        Object d2 = interfaceC4063vN.d();
        this.f24034b = d2;
        this.f24033a = null;
        return d2;
    }
}
