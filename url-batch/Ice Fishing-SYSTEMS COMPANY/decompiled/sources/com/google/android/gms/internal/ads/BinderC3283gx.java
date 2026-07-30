package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.gx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3283gx extends AbstractBinderC3186f8 implements InterfaceC3229fx {
    public BinderC3283gx() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3229fx
    public final void A(int i) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                V2.b.u0(parcel.readStrongBinder());
                parcel.readString();
                AbstractC3241g8.f(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                AbstractC3241g8.f(parcel);
                break;
            case 5:
                parcel.createByteArray();
                AbstractC3241g8.f(parcel);
                break;
            case 6:
                parcel.readInt();
                AbstractC3241g8.f(parcel);
                break;
            case 7:
                parcel.readInt();
                AbstractC3241g8.f(parcel);
                break;
            case 8:
                V2.b.u0(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                AbstractC3241g8.f(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3229fx
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3229fx
    public final void c2(byte[] bArr) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3229fx
    public final void e0(int i) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3229fx
    public final void k3() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3229fx
    public final void v3(V2.b bVar, String str) {
    }
}
