package q2;

import a.AbstractC0415a;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC3241g8;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.BinderC3317hd;
import com.google.android.gms.internal.ads.C2684Nb;
import com.google.android.gms.internal.ads.C4287ze;
import com.google.android.gms.internal.ads.InterfaceC2466Ae;
import java.util.Objects;

/* renamed from: q2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4897k extends AbstractC4905o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f40091b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BinderC3317hd f40092c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C4903n f40093d;

    public C4897k(C4903n c4903n, Context context, BinderC3317hd binderC3317hd) {
        this.f40091b = context;
        this.f40092c = binderC3317hd;
        Objects.requireNonNull(c4903n);
        this.f40093d = c4903n;
    }

    @Override // q2.AbstractC4905o
    public final /* bridge */ /* synthetic */ Object a() {
        C4903n.p(this.f40091b, "ads_preloader");
        return null;
    }

    @Override // q2.AbstractC4905o
    public final Object b() {
        T t9;
        S q6;
        Context context = this.f40091b;
        V2.b bVar = new V2.b(context);
        AbstractC3368ia.a(context);
        boolean booleanValue = ((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.cc)).booleanValue();
        BinderC3317hd binderC3317hd = this.f40092c;
        C4903n c4903n = this.f40093d;
        if (!booleanValue) {
            C2684Nb c2684Nb = (C2684Nb) c4903n.f40106z;
            try {
                V2.b bVar2 = new V2.b(context);
                T t10 = (T) c2684Nb.j(context);
                Parcel A02 = t10.A0();
                AbstractC3241g8.e(A02, bVar2);
                AbstractC3241g8.e(A02, binderC3317hd);
                A02.writeInt(261710000);
                Parcel D02 = t10.D0(A02, 1);
                IBinder readStrongBinder = D02.readStrongBinder();
                D02.recycle();
                if (readStrongBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                return queryLocalInterface instanceof S ? (S) queryLocalInterface : new Q(readStrongBinder);
            } catch (V2.c e6) {
                e = e6;
                u2.i.g("Could not get remote AdPreloaderCreator.", e);
                return null;
            } catch (RemoteException e9) {
                e = e9;
                u2.i.g("Could not get remote AdPreloaderCreator.", e);
                return null;
            } catch (NullPointerException e10) {
                e = e10;
                u2.i.g("Could not get remote AdPreloaderCreator.", e);
                return null;
            }
        }
        try {
            try {
                IBinder b9 = AbstractC0415a.I(context).b("com.google.android.gms.ads.ChimeraAdPreloaderCreatorImpl");
                if (b9 == null) {
                    t9 = null;
                } else {
                    IInterface queryLocalInterface2 = b9.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
                    t9 = queryLocalInterface2 instanceof T ? (T) queryLocalInterface2 : new T(b9);
                }
                Parcel A03 = t9.A0();
                AbstractC3241g8.e(A03, bVar);
                AbstractC3241g8.e(A03, binderC3317hd);
                A03.writeInt(261710000);
                Parcel D03 = t9.D0(A03, 1);
                IBinder readStrongBinder2 = D03.readStrongBinder();
                D03.recycle();
                if (readStrongBinder2 == null) {
                    q6 = null;
                } else {
                    IInterface queryLocalInterface3 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                    q6 = queryLocalInterface3 instanceof S ? (S) queryLocalInterface3 : new Q(readStrongBinder2);
                }
                q6.m2(binderC3317hd);
                return q6;
            } catch (Exception e11) {
                throw new u2.j(e11);
            }
        } catch (RemoteException e12) {
            e = e12;
            InterfaceC2466Ae a9 = C4287ze.a(context);
            c4903n.getClass();
            a9.e("ClientApiBroker.getAdPreloader", e);
            return null;
        } catch (NullPointerException e13) {
            e = e13;
            InterfaceC2466Ae a92 = C4287ze.a(context);
            c4903n.getClass();
            a92.e("ClientApiBroker.getAdPreloader", e);
            return null;
        } catch (u2.j e14) {
            e = e14;
            InterfaceC2466Ae a922 = C4287ze.a(context);
            c4903n.getClass();
            a922.e("ClientApiBroker.getAdPreloader", e);
            return null;
        }
    }

    @Override // q2.AbstractC4905o
    public final Object c(X x3) {
        return x3.s0(new V2.b(this.f40091b), this.f40092c, 261710000);
    }
}
