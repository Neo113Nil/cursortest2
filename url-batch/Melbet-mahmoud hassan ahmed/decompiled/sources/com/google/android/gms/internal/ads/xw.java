package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class xw extends zd implements zw {
    xw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zw
    public final void D(int i7) {
        Parcel E = E();
        E.writeInt(i7);
        O0(2, E);
    }

    @Override // com.google.android.gms.internal.ads.zw
    public final void c() {
        O0(6, E());
    }

    @Override // com.google.android.gms.internal.ads.zw
    public final void e() {
        O0(7, E());
    }

    @Override // com.google.android.gms.internal.ads.zw
    public final void f() {
        O0(3, E());
    }

    @Override // com.google.android.gms.internal.ads.zw
    public final void g() {
        O0(1, E());
    }

    @Override // com.google.android.gms.internal.ads.zw
    public final void h() {
        O0(4, E());
    }

    @Override // com.google.android.gms.internal.ads.zw
    public final void i() {
        O0(5, E());
    }

    @Override // com.google.android.gms.internal.ads.zw
    public final void w(cv cvVar) {
        Parcel E = E();
        be.d(E, cvVar);
        O0(8, E);
    }
}
