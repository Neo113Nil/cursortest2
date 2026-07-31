package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class ez extends zd implements gz {
    ez(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.internal.ads.gz
    public final void S3(boolean z6) {
        Parcel E = E();
        be.c(E, z6);
        O0(5, E);
    }

    @Override // com.google.android.gms.internal.ads.gz
    public final void b() {
        O0(4, E());
    }

    @Override // com.google.android.gms.internal.ads.gz
    public final void e() {
        O0(3, E());
    }

    @Override // com.google.android.gms.internal.ads.gz
    public final void f() {
        O0(2, E());
    }

    @Override // com.google.android.gms.internal.ads.gz
    public final void h() {
        O0(1, E());
    }
}
