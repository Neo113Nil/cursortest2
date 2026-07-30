package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.oa, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3690oa extends AbstractBinderC3186f8 {

    /* renamed from: n, reason: collision with root package name */
    public final p2.d f33144n;

    /* renamed from: u, reason: collision with root package name */
    public final String f33145u;

    /* renamed from: v, reason: collision with root package name */
    public final String f33146v;

    public BinderC3690oa(p2.d dVar, String str, String str2) {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
        this.f33144n = dVar;
        this.f33145u = str;
        this.f33146v = str2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f33145u);
            return true;
        }
        if (i == 2) {
            parcel2.writeNoException();
            parcel2.writeString(this.f33146v);
            return true;
        }
        p2.d dVar = this.f33144n;
        if (i == 3) {
            V2.a u02 = V2.b.u0(parcel.readStrongBinder());
            AbstractC3241g8.f(parcel);
            if (u02 != null) {
                dVar.v((View) V2.b.A0(u02));
            }
            parcel2.writeNoException();
            return true;
        }
        if (i == 4) {
            dVar.d();
            parcel2.writeNoException();
            return true;
        }
        if (i != 5) {
            return false;
        }
        dVar.i();
        parcel2.writeNoException();
        return true;
    }
}
