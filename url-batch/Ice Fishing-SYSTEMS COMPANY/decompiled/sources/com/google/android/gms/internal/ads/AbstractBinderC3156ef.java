package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import q2.C4908p0;
import q2.InterfaceC4911r0;
import q2.InterfaceC4921w0;

/* renamed from: com.google.android.gms.internal.ads.ef, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC3156ef extends AbstractBinderC3186f8 implements InterfaceC3211ff {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f30447n = 0;

    public AbstractBinderC3156ef() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC3587mf interfaceC3587mf = null;
        InterfaceC3587mf interfaceC3587mf2 = null;
        C4908p0 c4908p0 = null;
        C3641nf c3641nf = null;
        Cif cif = null;
        switch (i) {
            case 1:
                q2.d1 d1Var = (q2.d1) AbstractC3241g8.b(parcel, q2.d1.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    interfaceC3587mf = queryLocalInterface instanceof InterfaceC3587mf ? (InterfaceC3587mf) queryLocalInterface : new C3479kf(readStrongBinder);
                }
                AbstractC3241g8.f(parcel);
                f2(d1Var, interfaceC3587mf);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    cif = queryLocalInterface2 instanceof Cif ? (Cif) queryLocalInterface2 : new C3265gf(readStrongBinder2, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback", 2);
                }
                AbstractC3241g8.f(parcel);
                h1(cif);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean l9 = l();
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC3241g8.f30958a;
                parcel2.writeInt(l9 ? 1 : 0);
                return true;
            case 4:
                String h9 = h();
                parcel2.writeNoException();
                parcel2.writeString(h9);
                return true;
            case 5:
                V2.a u02 = V2.b.u0(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                i3(u02);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    c3641nf = queryLocalInterface3 instanceof C3641nf ? (C3641nf) queryLocalInterface3 : new C3641nf(readStrongBinder3, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener", 2);
                }
                AbstractC3241g8.f(parcel);
                n3(c3641nf);
                parcel2.writeNoException();
                return true;
            case 7:
                C3856rf c3856rf = (C3856rf) AbstractC3241g8.b(parcel, C3856rf.CREATOR);
                AbstractC3241g8.f(parcel);
                o3(c3856rf);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
                    c4908p0 = queryLocalInterface4 instanceof C4908p0 ? (C4908p0) queryLocalInterface4 : new C4908p0(readStrongBinder4, "com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener", 2);
                }
                AbstractC3241g8.f(parcel);
                I0(c4908p0);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle e6 = e();
                parcel2.writeNoException();
                AbstractC3241g8.d(parcel2, e6);
                return true;
            case 10:
                V2.a u03 = V2.b.u0(parcel.readStrongBinder());
                ClassLoader classLoader2 = AbstractC3241g8.f30958a;
                boolean z8 = parcel.readInt() != 0;
                AbstractC3241g8.f(parcel);
                M1(u03, z8);
                parcel2.writeNoException();
                return true;
            case 11:
                InterfaceC3047cf k6 = k();
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, k6);
                return true;
            case 12:
                InterfaceC4921w0 m8 = m();
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, m8);
                return true;
            case 13:
                InterfaceC4911r0 G32 = q2.V0.G3(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                p1(G32);
                parcel2.writeNoException();
                return true;
            case 14:
                q2.d1 d1Var2 = (q2.d1) AbstractC3241g8.b(parcel, q2.d1.CREATOR);
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    interfaceC3587mf2 = queryLocalInterface5 instanceof InterfaceC3587mf ? (InterfaceC3587mf) queryLocalInterface5 : new C3479kf(readStrongBinder5);
                }
                AbstractC3241g8.f(parcel);
                H2(d1Var2, interfaceC3587mf2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean a9 = AbstractC3241g8.a(parcel);
                AbstractC3241g8.f(parcel);
                C3(a9);
                parcel2.writeNoException();
                return true;
            case 16:
                String p6 = p();
                parcel2.writeNoException();
                parcel2.writeString(p6);
                return true;
            case 17:
                long n9 = n();
                parcel2.writeNoException();
                parcel2.writeLong(n9);
                return true;
            case 18:
                long readLong = parcel.readLong();
                AbstractC3241g8.f(parcel);
                v2(readLong);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
