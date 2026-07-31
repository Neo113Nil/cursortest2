package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class xg0 extends zd implements zg0 {
    xg0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.zg0
    public final void L(Bundle bundle) {
        Parcel E = E();
        be.d(E, bundle);
        Parcel q02 = q0(6, E);
        if (q02.readInt() != 0) {
            bundle.readFromParcel(q02);
        }
        q02.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zg0
    public final boolean M() {
        Parcel q02 = q0(11, E());
        boolean g7 = be.g(q02);
        q02.recycle();
        return g7;
    }

    @Override // com.google.android.gms.internal.ads.zg0
    public final void P2(Bundle bundle) {
        Parcel E = E();
        be.d(E, bundle);
        O0(1, E);
    }

    @Override // com.google.android.gms.internal.ads.zg0
    public final void d0(x3.a aVar) {
        Parcel E = E();
        be.f(E, aVar);
        O0(13, E);
    }

    @Override // com.google.android.gms.internal.ads.zg0
    public final void f() {
        O0(10, E());
    }

    @Override // com.google.android.gms.internal.ads.zg0
    public final void j5(int i7, int i8, Intent intent) {
        Parcel E = E();
        E.writeInt(i7);
        E.writeInt(i8);
        be.d(E, intent);
        O0(12, E);
    }

    @Override // com.google.android.gms.internal.ads.zg0
    public final void k() {
        O0(8, E());
    }

    @Override // com.google.android.gms.internal.ads.zg0
    public final void l() {
        O0(4, E());
    }

    @Override // com.google.android.gms.internal.ads.zg0
    public final void m() {
        O0(5, E());
    }

    @Override // com.google.android.gms.internal.ads.zg0
    public final void n() {
        O0(2, E());
    }

    @Override // com.google.android.gms.internal.ads.zg0
    public final void p() {
        O0(7, E());
    }

    @Override // com.google.android.gms.internal.ads.zg0
    public final void q() {
        O0(14, E());
    }

    @Override // com.google.android.gms.internal.ads.zg0
    public final void t() {
        O0(3, E());
    }

    @Override // com.google.android.gms.internal.ads.zg0
    public final void x() {
        O0(9, E());
    }
}
