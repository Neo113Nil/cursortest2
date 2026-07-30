package q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3186f8;
import com.google.android.gms.internal.ads.AbstractC3241g8;
import com.google.android.gms.internal.ads.C2463Ab;
import com.google.android.gms.internal.ads.C2464Ac;
import com.google.android.gms.internal.ads.C2480Bb;
import com.google.android.gms.internal.ads.C2497Cb;
import com.google.android.gms.internal.ads.C2531Eb;
import com.google.android.gms.internal.ads.C2532Ec;
import com.google.android.gms.internal.ads.C2582Hb;
import com.google.android.gms.internal.ads.C2599Ib;
import com.google.android.gms.internal.ads.C3261gb;
import com.google.android.gms.internal.ads.InterfaceC2514Db;
import com.google.android.gms.internal.ads.InterfaceC2548Fb;
import com.google.android.gms.internal.ads.InterfaceC2616Jb;
import n2.C4805a;
import n2.C4808d;

/* loaded from: classes.dex */
public abstract class F extends AbstractBinderC3186f8 implements G {
    public F() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC2548Fb c2531Eb;
        InterfaceC4922x interfaceC4922x = null;
        C2532Ec c2532Ec = null;
        InterfaceC2616Jb interfaceC2616Jb = null;
        C2582Hb c2582Hb = null;
        Y y6 = null;
        InterfaceC2514Db interfaceC2514Db = null;
        C2480Bb c2480Bb = null;
        C2463Ab c2463Ab = null;
        switch (i) {
            case 1:
                InterfaceC4876D c4 = c();
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, c4);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    interfaceC4922x = queryLocalInterface instanceof InterfaceC4922x ? (InterfaceC4922x) queryLocalInterface : new C4918v(readStrongBinder);
                }
                AbstractC3241g8.f(parcel);
                A2(interfaceC4922x);
                parcel2.writeNoException();
                return true;
            case 3:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
                    c2463Ab = queryLocalInterface2 instanceof C2463Ab ? (C2463Ab) queryLocalInterface2 : new C2463Ab(readStrongBinder2, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener", 2);
                }
                AbstractC3241g8.f(parcel);
                q1(c2463Ab);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
                    c2480Bb = queryLocalInterface3 instanceof C2480Bb ? (C2480Bb) queryLocalInterface3 : new C2480Bb(readStrongBinder3, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener", 2);
                }
                AbstractC3241g8.f(parcel);
                a3(c2480Bb);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 == null) {
                    c2531Eb = null;
                } else {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
                    c2531Eb = queryLocalInterface4 instanceof InterfaceC2548Fb ? (InterfaceC2548Fb) queryLocalInterface4 : new C2531Eb(readStrongBinder4, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener", 2);
                }
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
                    interfaceC2514Db = queryLocalInterface5 instanceof InterfaceC2514Db ? (InterfaceC2514Db) queryLocalInterface5 : new C2497Cb(readStrongBinder5, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener", 2);
                }
                AbstractC3241g8.f(parcel);
                u3(readString, c2531Eb, interfaceC2514Db);
                parcel2.writeNoException();
                return true;
            case 6:
                C3261gb c3261gb = (C3261gb) AbstractC3241g8.b(parcel, C3261gb.CREATOR);
                AbstractC3241g8.f(parcel);
                t0(c3261gb);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    y6 = queryLocalInterface6 instanceof Y ? (Y) queryLocalInterface6 : new Y(readStrongBinder6);
                }
                AbstractC3241g8.f(parcel);
                z3(y6);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
                    c2582Hb = queryLocalInterface7 instanceof C2582Hb ? (C2582Hb) queryLocalInterface7 : new C2582Hb(readStrongBinder7, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener", 2);
                }
                g1 g1Var = (g1) AbstractC3241g8.b(parcel, g1.CREATOR);
                AbstractC3241g8.f(parcel);
                F0(c2582Hb, g1Var);
                parcel2.writeNoException();
                return true;
            case 9:
                C4808d c4808d = (C4808d) AbstractC3241g8.b(parcel, C4808d.CREATOR);
                AbstractC3241g8.f(parcel);
                s2(c4808d);
                parcel2.writeNoException();
                return true;
            case 10:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
                    interfaceC2616Jb = queryLocalInterface8 instanceof InterfaceC2616Jb ? (InterfaceC2616Jb) queryLocalInterface8 : new C2599Ib(readStrongBinder8, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener", 2);
                }
                AbstractC3241g8.f(parcel);
                q2(interfaceC2616Jb);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                C2464Ac c2464Ac = (C2464Ac) AbstractC3241g8.b(parcel, C2464Ac.CREATOR);
                AbstractC3241g8.f(parcel);
                b3(c2464Ac);
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
                    c2532Ec = queryLocalInterface9 instanceof C2532Ec ? (C2532Ec) queryLocalInterface9 : new C2532Ec(readStrongBinder9, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback", 2);
                }
                AbstractC3241g8.f(parcel);
                E3(c2532Ec);
                parcel2.writeNoException();
                return true;
            case 15:
                C4805a c4805a = (C4805a) AbstractC3241g8.b(parcel, C4805a.CREATOR);
                AbstractC3241g8.f(parcel);
                X0(c4805a);
                parcel2.writeNoException();
                return true;
        }
    }
}
