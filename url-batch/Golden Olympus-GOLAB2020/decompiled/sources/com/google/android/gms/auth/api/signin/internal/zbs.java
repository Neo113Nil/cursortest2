package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.ironsource.InterfaceC1490j3;

/* loaded from: classes.dex */
public final class zbs extends com.google.android.gms.internal.p000authapi.zba implements IInterface {
    zbs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void zbc(zbr zbrVar, GoogleSignInOptions googleSignInOptions) {
        Parcel zba = zba();
        com.google.android.gms.internal.p000authapi.zbc.zbd(zba, zbrVar);
        com.google.android.gms.internal.p000authapi.zbc.zbc(zba, googleSignInOptions);
        zbb(InterfaceC1490j3.d.b.f16812d, zba);
    }

    public final void zbd(zbr zbrVar, GoogleSignInOptions googleSignInOptions) {
        Parcel zba = zba();
        com.google.android.gms.internal.p000authapi.zbc.zbd(zba, zbrVar);
        com.google.android.gms.internal.p000authapi.zbc.zbc(zba, googleSignInOptions);
        zbb(102, zba);
    }

    public final void zbe(zbr zbrVar, GoogleSignInOptions googleSignInOptions) {
        Parcel zba = zba();
        com.google.android.gms.internal.p000authapi.zbc.zbd(zba, zbrVar);
        com.google.android.gms.internal.p000authapi.zbc.zbc(zba, googleSignInOptions);
        zbb(InterfaceC1490j3.d.b.f16810b, zba);
    }
}
