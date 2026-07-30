package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import q2.C4927z0;

/* renamed from: com.google.android.gms.internal.ads.nd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC3639nd extends AbstractBinderC3186f8 implements InterfaceC3693od {
    public AbstractBinderC3639nd() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static InterfaceC3693od G3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return queryLocalInterface instanceof InterfaceC3693od ? (InterfaceC3693od) queryLocalInterface : new C3585md(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC3047cf c2993bf;
        switch (i) {
            case 1:
                c();
                break;
            case 2:
                f();
                break;
            case 3:
                int readInt = parcel.readInt();
                AbstractC3241g8.f(parcel);
                l0(readInt);
                break;
            case 4:
                g();
                break;
            case 5:
                l();
                break;
            case 6:
                h();
                break;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                }
                AbstractC3241g8.f(parcel);
                break;
            case 8:
                j();
                break;
            case 9:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                AbstractC3241g8.f(parcel);
                e3(readString, readString2);
                break;
            case 10:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    boolean z8 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd") instanceof InterfaceC4284zb;
                }
                parcel.readString();
                AbstractC3241g8.f(parcel);
                break;
            case 11:
                Y();
                break;
            case 12:
                parcel.readString();
                AbstractC3241g8.f(parcel);
                break;
            case 13:
                q();
                break;
            case 14:
                C2938af c2938af = (C2938af) AbstractC3241g8.b(parcel, C2938af.CREATOR);
                AbstractC3241g8.f(parcel);
                H0(c2938af);
                break;
            case 15:
                y();
                break;
            case 16:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 == null) {
                    c2993bf = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    c2993bf = queryLocalInterface instanceof InterfaceC3047cf ? (InterfaceC3047cf) queryLocalInterface : new C2993bf(readStrongBinder3);
                }
                AbstractC3241g8.f(parcel);
                u1(c2993bf);
                break;
            case 17:
                int readInt2 = parcel.readInt();
                AbstractC3241g8.f(parcel);
                T(readInt2);
                break;
            case 18:
                k2();
                break;
            case 19:
                AbstractC3241g8.f(parcel);
                break;
            case 20:
                u();
                break;
            case 21:
                String readString3 = parcel.readString();
                AbstractC3241g8.f(parcel);
                W(readString3);
                break;
            case 22:
                int readInt3 = parcel.readInt();
                String readString4 = parcel.readString();
                AbstractC3241g8.f(parcel);
                A3(readInt3, readString4);
                break;
            case 23:
                C4927z0 c4927z0 = (C4927z0) AbstractC3241g8.b(parcel, C4927z0.CREATOR);
                AbstractC3241g8.f(parcel);
                d3(c4927z0);
                break;
            case 24:
                C4927z0 c4927z02 = (C4927z0) AbstractC3241g8.b(parcel, C4927z0.CREATOR);
                AbstractC3241g8.f(parcel);
                Z0(c4927z02);
                break;
            case 25:
                S();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
