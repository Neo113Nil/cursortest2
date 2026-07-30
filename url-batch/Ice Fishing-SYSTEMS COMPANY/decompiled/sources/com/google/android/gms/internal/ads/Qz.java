package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final /* synthetic */ class Qz implements XA {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27292a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Sz f27293b;

    public /* synthetic */ Qz(Sz sz, int i) {
        this.f27292a = i;
        this.f27293b = sz;
    }

    @Override // com.google.android.gms.internal.ads.XA
    public final Object apply(Object obj) {
        byte[] bArr = (byte[]) obj;
        switch (this.f27292a) {
            case 0:
                Sz sz = this.f27293b;
                sz.getClass();
                sz.i(new M.h(2), bArr, false);
                break;
            default:
                Sz sz2 = this.f27293b;
                sz2.getClass();
                sz2.i(new M.h(2), bArr, true);
                break;
        }
        return null;
    }
}
