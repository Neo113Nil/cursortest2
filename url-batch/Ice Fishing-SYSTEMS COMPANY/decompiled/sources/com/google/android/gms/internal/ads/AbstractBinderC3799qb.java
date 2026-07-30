package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.qb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC3799qb extends AbstractBinderC3186f8 implements InterfaceC3852rb {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f33733n = 0;

    public AbstractBinderC3799qb() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC3529lb c3475kb;
        switch (i) {
            case 1:
                String readString = parcel.readString();
                V2.a u02 = V2.b.u0(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                L1(u02, readString);
                parcel2.writeNoException();
                return true;
            case 2:
                String readString2 = parcel.readString();
                AbstractC3241g8.f(parcel);
                V2.a N8 = N(readString2);
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, N8);
                return true;
            case 3:
                V2.a u03 = V2.b.u0(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                w2(u03);
                parcel2.writeNoException();
                return true;
            case 4:
                c();
                parcel2.writeNoException();
                return true;
            case 5:
                V2.b.u0(parcel.readStrongBinder());
                parcel.readInt();
                AbstractC3241g8.f(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
                V2.a u04 = V2.b.u0(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                n1(u04);
                parcel2.writeNoException();
                return true;
            case 7:
                V2.a u05 = V2.b.u0(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                l2(u05);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    c3475kb = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    c3475kb = queryLocalInterface instanceof InterfaceC3529lb ? (InterfaceC3529lb) queryLocalInterface : new C3475kb(readStrongBinder);
                }
                AbstractC3241g8.f(parcel);
                b2(c3475kb);
                parcel2.writeNoException();
                return true;
            case 9:
                V2.a u06 = V2.b.u0(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                Q1(u06);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
