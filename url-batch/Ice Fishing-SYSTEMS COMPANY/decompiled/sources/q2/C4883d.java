package q2;

import a.AbstractC0415a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.BinderC3317hd;
import com.google.android.gms.internal.ads.C4287ze;
import java.util.Objects;

/* renamed from: q2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4883d extends AbstractC4905o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OutOfContextTestingActivity f40006b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BinderC3317hd f40007c;

    public C4883d(C4903n c4903n, OutOfContextTestingActivity outOfContextTestingActivity, BinderC3317hd binderC3317hd) {
        this.f40006b = outOfContextTestingActivity;
        this.f40007c = binderC3317hd;
        Objects.requireNonNull(c4903n);
    }

    @Override // q2.AbstractC4905o
    public final /* bridge */ /* synthetic */ Object a() {
        C4903n.p(this.f40006b, "out_of_context_tester");
        return null;
    }

    @Override // q2.AbstractC4905o
    public final Object b() {
        C4917u0 c4917u0;
        OutOfContextTestingActivity outOfContextTestingActivity = this.f40006b;
        V2.b bVar = new V2.b(outOfContextTestingActivity);
        AbstractC3368ia.a(outOfContextTestingActivity);
        if (((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.Ja)).booleanValue()) {
            try {
                try {
                    IBinder b9 = AbstractC0415a.I(outOfContextTestingActivity).b("com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl");
                    if (b9 == null) {
                        c4917u0 = null;
                    } else {
                        IInterface queryLocalInterface = b9.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                        c4917u0 = queryLocalInterface instanceof C4917u0 ? (C4917u0) queryLocalInterface : new C4917u0(b9, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator", 2);
                    }
                    return c4917u0.R0(bVar, this.f40007c);
                } catch (Exception e6) {
                    throw new u2.j(e6);
                }
            } catch (RemoteException e9) {
                e = e9;
                C4287ze.a(outOfContextTestingActivity).e("ClientApiBroker.getOutOfContextTester", e);
                return null;
            } catch (NullPointerException e10) {
                e = e10;
                C4287ze.a(outOfContextTestingActivity).e("ClientApiBroker.getOutOfContextTester", e);
                return null;
            } catch (u2.j e11) {
                e = e11;
                C4287ze.a(outOfContextTestingActivity).e("ClientApiBroker.getOutOfContextTester", e);
                return null;
            }
        }
        return null;
    }

    @Override // q2.AbstractC4905o
    public final Object c(X x3) {
        OutOfContextTestingActivity outOfContextTestingActivity = this.f40006b;
        V2.b bVar = new V2.b(outOfContextTestingActivity);
        AbstractC3368ia.a(outOfContextTestingActivity);
        if (((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.Ja)).booleanValue()) {
            return x3.U1(bVar, this.f40007c, 261710000);
        }
        return null;
    }
}
