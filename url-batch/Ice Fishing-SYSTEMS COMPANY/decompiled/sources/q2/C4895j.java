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

/* renamed from: q2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4895j extends AbstractC4905o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f40086b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f40087c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BinderC3317hd f40088d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4903n f40089e;

    public C4895j(C4903n c4903n, Context context, String str, BinderC3317hd binderC3317hd) {
        this.f40086b = context;
        this.f40087c = str;
        this.f40088d = binderC3317hd;
        Objects.requireNonNull(c4903n);
        this.f40089e = c4903n;
    }

    @Override // q2.AbstractC4905o
    public final Object a() {
        C4903n.p(this.f40086b, "native_ad");
        return new P0();
    }

    @Override // q2.AbstractC4905o
    public final Object b() {
        H h9;
        Context context = this.f40086b;
        AbstractC3368ia.a(context);
        boolean booleanValue = ((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.cc)).booleanValue();
        BinderC3317hd binderC3317hd = this.f40088d;
        C4903n c4903n = this.f40089e;
        String str = this.f40087c;
        if (!booleanValue) {
            C2684Nb c2684Nb = (C2684Nb) c4903n.f40102v;
            try {
                V2.b bVar = new V2.b(context);
                H h10 = (H) c2684Nb.j(context);
                Parcel A02 = h10.A0();
                AbstractC3241g8.e(A02, bVar);
                A02.writeString(str);
                AbstractC3241g8.e(A02, binderC3317hd);
                A02.writeInt(261710000);
                Parcel D02 = h10.D0(A02, 1);
                IBinder readStrongBinder = D02.readStrongBinder();
                D02.recycle();
                if (readStrongBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return queryLocalInterface instanceof G ? (G) queryLocalInterface : new E(readStrongBinder);
            } catch (V2.c e6) {
                e = e6;
                u2.i.g("Could not create remote builder for AdLoader.", e);
                return null;
            } catch (RemoteException e9) {
                e = e9;
                u2.i.g("Could not create remote builder for AdLoader.", e);
                return null;
            }
        }
        try {
            V2.b bVar2 = new V2.b(context);
            try {
                IBinder b9 = AbstractC0415a.I(context).b("com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl");
                if (b9 == null) {
                    h9 = null;
                } else {
                    IInterface queryLocalInterface2 = b9.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    h9 = queryLocalInterface2 instanceof H ? (H) queryLocalInterface2 : new H(b9);
                }
                Parcel A03 = h9.A0();
                AbstractC3241g8.e(A03, bVar2);
                A03.writeString(str);
                AbstractC3241g8.e(A03, binderC3317hd);
                A03.writeInt(261710000);
                Parcel D03 = h9.D0(A03, 1);
                IBinder readStrongBinder2 = D03.readStrongBinder();
                D03.recycle();
                if (readStrongBinder2 == null) {
                    return null;
                }
                IInterface queryLocalInterface3 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return queryLocalInterface3 instanceof G ? (G) queryLocalInterface3 : new E(readStrongBinder2);
            } catch (Exception e10) {
                throw new u2.j(e10);
            }
        } catch (RemoteException e11) {
            e = e11;
            InterfaceC2466Ae a9 = C4287ze.a(context);
            c4903n.getClass();
            a9.e("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        } catch (NullPointerException e12) {
            e = e12;
            InterfaceC2466Ae a92 = C4287ze.a(context);
            c4903n.getClass();
            a92.e("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        } catch (u2.j e13) {
            e = e13;
            InterfaceC2466Ae a922 = C4287ze.a(context);
            c4903n.getClass();
            a922.e("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        }
    }

    @Override // q2.AbstractC4905o
    public final Object c(X x3) {
        return x3.J1(new V2.b(this.f40086b), this.f40087c, this.f40088d, 261710000);
    }
}
