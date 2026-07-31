package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes.dex */
final class i22 implements nb3<ParcelFileDescriptor> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ri0 f6496a;

    i22(m22 m22Var, ri0 ri0Var) {
        this.f6496a = ri0Var;
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final /* bridge */ /* synthetic */ void a(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            this.f6496a.U0(parcelFileDescriptor);
        } catch (RemoteException e7) {
            a3.r1.l("Service can't call client", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final void b(Throwable th) {
        try {
            this.f6496a.z1(a3.f0.c(th));
        } catch (RemoteException e7) {
            a3.r1.l("Service can't call client", e7);
        }
    }
}
