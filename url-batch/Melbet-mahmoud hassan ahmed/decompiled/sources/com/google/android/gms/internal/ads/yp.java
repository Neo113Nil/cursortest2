package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class yp extends zd implements cq {
    yp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.cq
    public final void C0(cv cvVar) {
        Parcel E = E();
        be.d(E, cvVar);
        O0(3, E);
    }

    @Override // com.google.android.gms.internal.ads.cq
    public final void a() {
        O0(5, E());
    }

    @Override // com.google.android.gms.internal.ads.cq
    public final void b() {
        O0(4, E());
    }

    @Override // com.google.android.gms.internal.ads.cq
    public final void c() {
        O0(2, E());
    }

    @Override // com.google.android.gms.internal.ads.cq
    public final void d() {
        O0(1, E());
    }
}
