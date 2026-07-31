package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import x3.a;

/* loaded from: classes.dex */
public abstract class mx extends ae implements nx {
    public mx() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        IInterface m7;
        boolean K0;
        Parcelable e7;
        String p7;
        zw zwVar = null;
        by byVar = null;
        dx dxVar = null;
        wy wyVar = null;
        rx rxVar = null;
        yx yxVar = null;
        ww wwVar = null;
        ux uxVar = null;
        switch (i7) {
            case 1:
                m7 = m();
                parcel2.writeNoException();
                be.f(parcel2, m7);
                return true;
            case 2:
                N();
                parcel2.writeNoException();
                return true;
            case 3:
                K0 = K0();
                parcel2.writeNoException();
                be.c(parcel2, K0);
                return true;
            case 4:
                K0 = F4((kv) be.a(parcel, kv.CREATOR));
                parcel2.writeNoException();
                be.c(parcel2, K0);
                return true;
            case 5:
                V();
                parcel2.writeNoException();
                return true;
            case 6:
                H();
                parcel2.writeNoException();
                return true;
            case c4.w0.f2149o /* 7 */:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zwVar = queryLocalInterface instanceof zw ? (zw) queryLocalInterface : new xw(readStrongBinder);
                }
                v3(zwVar);
                parcel2.writeNoException();
                return true;
            case c4.w0.f2150p /* 8 */:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    uxVar = queryLocalInterface2 instanceof ux ? (ux) queryLocalInterface2 : new sx(readStrongBinder2);
                }
                M3(uxVar);
                parcel2.writeNoException();
                return true;
            case 9:
                v0();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                G();
                parcel2.writeNoException();
                return true;
            case 12:
                e7 = e();
                parcel2.writeNoException();
                be.e(parcel2, e7);
                return true;
            case 13:
                R3((pv) be.a(parcel, pv.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                x5(ih0.s6(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                O1(lh0.s6(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                p7 = p();
                parcel2.writeNoException();
                parcel2.writeString(p7);
                return true;
            case 19:
                r4(h20.s6(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    wwVar = queryLocalInterface3 instanceof ww ? (ww) queryLocalInterface3 : new uw(readStrongBinder3);
                }
                b1(wwVar);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    yxVar = queryLocalInterface4 instanceof yx ? (yx) queryLocalInterface4 : new yx(readStrongBinder4);
                }
                E4(yxVar);
                parcel2.writeNoException();
                return true;
            case 22:
                b6(be.g(parcel));
                parcel2.writeNoException();
                return true;
            case 23:
                K0 = B4();
                parcel2.writeNoException();
                be.c(parcel2, K0);
                return true;
            case 24:
                L2(rj0.s6(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 25:
                j4(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 26:
                m7 = k();
                parcel2.writeNoException();
                be.f(parcel2, m7);
                return true;
            case 29:
                c6((s00) be.a(parcel, s00.CREATOR));
                parcel2.writeNoException();
                return true;
            case 30:
                x4((hz) be.a(parcel, hz.CREATOR));
                parcel2.writeNoException();
                return true;
            case 31:
                p7 = t();
                parcel2.writeNoException();
                parcel2.writeString(p7);
                return true;
            case 32:
                m7 = i();
                parcel2.writeNoException();
                be.f(parcel2, m7);
                return true;
            case 33:
                m7 = h();
                parcel2.writeNoException();
                be.f(parcel2, m7);
                return true;
            case 34:
                K3(be.g(parcel));
                parcel2.writeNoException();
                return true;
            case 35:
                p7 = q();
                parcel2.writeNoException();
                parcel2.writeString(p7);
                return true;
            case 36:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    rxVar = queryLocalInterface5 instanceof rx ? (rx) queryLocalInterface5 : new px(readStrongBinder5);
                }
                z5(rxVar);
                parcel2.writeNoException();
                return true;
            case 37:
                e7 = g();
                parcel2.writeNoException();
                be.e(parcel2, e7);
                return true;
            case 38:
                l1(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 39:
                L4((vv) be.a(parcel, vv.CREATOR));
                parcel2.writeNoException();
                return true;
            case 40:
                q5(vp.s6(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 41:
                m7 = j();
                parcel2.writeNoException();
                be.f(parcel2, m7);
                return true;
            case 42:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    wyVar = queryLocalInterface6 instanceof wy ? (wy) queryLocalInterface6 : new uy(readStrongBinder6);
                }
                r5(wyVar);
                parcel2.writeNoException();
                return true;
            case 43:
                kv kvVar = (kv) be.a(parcel, kv.CREATOR);
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    dxVar = queryLocalInterface7 instanceof dx ? (dx) queryLocalInterface7 : new ax(readStrongBinder7);
                }
                r2(kvVar, dxVar);
                parcel2.writeNoException();
                return true;
            case 44:
                c5(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    byVar = queryLocalInterface8 instanceof by ? (by) queryLocalInterface8 : new zx(readStrongBinder8);
                }
                D2(byVar);
                parcel2.writeNoException();
                return true;
        }
    }
}
