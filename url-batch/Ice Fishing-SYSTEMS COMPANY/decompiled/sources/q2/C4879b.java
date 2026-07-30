package q2;

import a.AbstractC0415a;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.BinderC3317hd;
import com.google.android.gms.internal.ads.C3102df;
import com.google.android.gms.internal.ads.C3425jf;
import com.google.android.gms.internal.ads.InterfaceC3211ff;
import java.util.Objects;

/* renamed from: q2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4879b extends AbstractC4905o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f39998b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f39999c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BinderC3317hd f40000d;

    public C4879b(C4903n c4903n, Context context, String str, BinderC3317hd binderC3317hd) {
        this.f39998b = context;
        this.f39999c = str;
        this.f40000d = binderC3317hd;
        Objects.requireNonNull(c4903n);
    }

    @Override // q2.AbstractC4905o
    public final Object a() {
        C4903n.p(this.f39998b, "rewarded");
        return new U0();
    }

    @Override // q2.AbstractC4905o
    public final Object b() {
        C3425jf c3425jf;
        IBinder R02;
        String str = this.f39999c;
        BinderC3317hd binderC3317hd = this.f40000d;
        Context context = this.f39998b;
        V2.b bVar = new V2.b(context);
        try {
            try {
                IBinder b9 = AbstractC0415a.I(context).b("com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl");
                if (b9 == null) {
                    c3425jf = null;
                } else {
                    IInterface queryLocalInterface = b9.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    c3425jf = queryLocalInterface instanceof C3425jf ? (C3425jf) queryLocalInterface : new C3425jf(b9, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator", 2);
                }
                R02 = c3425jf.R0(bVar, str, binderC3317hd);
            } catch (Exception e6) {
                throw new u2.j(e6);
            }
        } catch (RemoteException e9) {
            e = e9;
            u2.i.i("#007 Could not call remote method.", e);
            return null;
        } catch (u2.j e10) {
            e = e10;
            u2.i.i("#007 Could not call remote method.", e);
            return null;
        }
        if (R02 == null) {
            return null;
        }
        IInterface queryLocalInterface2 = R02.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return queryLocalInterface2 instanceof InterfaceC3211ff ? (InterfaceC3211ff) queryLocalInterface2 : new C3102df(R02);
    }

    @Override // q2.AbstractC4905o
    public final Object c(X x3) {
        return x3.z1(new V2.b(this.f39998b), this.f39999c, this.f40000d, 261710000);
    }
}
