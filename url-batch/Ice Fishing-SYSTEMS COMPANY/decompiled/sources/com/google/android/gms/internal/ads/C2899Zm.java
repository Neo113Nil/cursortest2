package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Zm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2899Zm implements CD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29060a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3945tD f29061b;

    public /* synthetic */ C2899Zm(C3945tD c3945tD, int i) {
        this.f29060a = i;
        this.f29061b = c3945tD;
    }

    @Override // com.google.android.gms.internal.ads.CD
    public final J3.a b(Object obj) {
        InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) obj;
        switch (this.f29060a) {
            case 0:
                if (interfaceC3858rh != null) {
                    return this.f29061b;
                }
                throw new C3059cr(1, "Retrieve Web View from image ad response failed.");
            default:
                if (interfaceC3858rh == null || interfaceC3858rh.g() == null) {
                    throw new C3059cr(1, "Retrieve video view in html5 ad response failed.");
                }
                return this.f29061b;
        }
    }
}
