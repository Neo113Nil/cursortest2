package q2;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC2598Ia;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.BinderC2646Ko;
import com.google.android.gms.internal.ads.BinderC3317hd;
import com.google.android.gms.internal.ads.C2837Wb;
import com.google.android.gms.internal.ads.C4015uc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import k2.EnumC4631b;
import u2.AbstractC5108b;

/* loaded from: classes.dex */
public final class J0 {

    /* renamed from: k, reason: collision with root package name */
    public static J0 f39960k;

    /* renamed from: a, reason: collision with root package name */
    public H0 f39961a;

    /* renamed from: b, reason: collision with root package name */
    public H0 f39962b;

    /* renamed from: c, reason: collision with root package name */
    public H0 f39963c;
    public InterfaceC4890g0 i;

    /* renamed from: d, reason: collision with root package name */
    public final Object f39964d = new Object();

    /* renamed from: f, reason: collision with root package name */
    public boolean f39966f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f39967g = false;

    /* renamed from: h, reason: collision with root package name */
    public final Object f39968h = new Object();

    /* renamed from: j, reason: collision with root package name */
    public k2.r f39969j = new k2.r(new ArrayList(), -1, 1);

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f39965e = new ArrayList();

    static {
        new HashSet(Arrays.asList(EnumC4631b.APP_OPEN_AD, EnumC4631b.INTERSTITIAL, EnumC4631b.REWARDED));
    }

    public static C2837Wb a(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashMap.put(((C4015uc) it.next()).f34620n, new C2837Wb(1));
        }
        return new C2837Wb(2);
    }

    public static J0 c() {
        J0 j02;
        synchronized (J0.class) {
            try {
                if (f39960k == null) {
                    f39960k = new J0();
                }
                j02 = f39960k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j02;
    }

    public final void b() {
        InterfaceC4890g0 interfaceC4890g0 = this.i;
        if (interfaceC4890g0 == null) {
            return;
        }
        try {
            interfaceC4890g0.c();
            this.i.A1(new V2.b(null), null);
        } catch (RemoteException e6) {
            u2.i.g("MobileAdsSettingManager initialization failed", e6);
        }
    }

    public final void d(Context context, com.icefishing.icefishingliveapp.y yVar) {
        InterfaceC4890g0 interfaceC4890g0;
        synchronized (this.f39964d) {
            try {
                if (this.f39966f) {
                    if (yVar != null) {
                        this.f39965e.add(yVar);
                    }
                    return;
                }
                if (this.f39967g) {
                    if (yVar != null) {
                        e();
                    }
                    return;
                }
                this.f39966f = true;
                if (yVar != null) {
                    this.f39965e.add(yVar);
                }
                if (context == null) {
                    throw new IllegalArgumentException("Context cannot be null.");
                }
                synchronized (this.f39968h) {
                    try {
                        if (this.i == null) {
                            this.i = (InterfaceC4890g0) new C4899l(C4907p.f40108g.f40110b, context).d(context, false);
                        }
                        InterfaceC4890g0 interfaceC4890g02 = this.i;
                        if (interfaceC4890g02 != null) {
                            interfaceC4890g02.O0(new BinderC2646Ko(this));
                            this.i.z2(new BinderC3317hd());
                        }
                        k2.r rVar = this.f39969j;
                        if (rVar.f38727a != -1 && (interfaceC4890g0 = this.i) != null) {
                            try {
                                interfaceC4890g0.g2(new X0(rVar));
                            } catch (RemoteException e6) {
                                u2.i.d("Unable to set request configuration parcel.", e6);
                            }
                        }
                    } catch (RemoteException e9) {
                        u2.i.g("MobileAdsSettingManager initialization failed", e9);
                    } finally {
                    }
                    AbstractC3368ia.a(context);
                    if (((Boolean) AbstractC2598Ia.f25566a.r()).booleanValue()) {
                        if (((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.Bc)).booleanValue()) {
                            u2.i.a("Initializing on bg thread");
                            final int i = 1;
                            AbstractC5108b.f41222a.execute(new Runnable(this) { // from class: q2.I0

                                /* renamed from: u, reason: collision with root package name */
                                public final /* synthetic */ J0 f39959u;

                                {
                                    this.f39959u = this;
                                }

                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    switch (i) {
                                        case 0:
                                            J0 j02 = this.f39959u;
                                            synchronized (j02.f39968h) {
                                                j02.b();
                                            }
                                            return;
                                        default:
                                            J0 j03 = this.f39959u;
                                            synchronized (j03.f39968h) {
                                                j03.b();
                                            }
                                            return;
                                    }
                                }
                            });
                            this.f39961a = new H0(context, EnumC4631b.INTERSTITIAL);
                            this.f39962b = new H0(context, EnumC4631b.REWARDED);
                            this.f39963c = new H0(context, EnumC4631b.APP_OPEN_AD);
                        }
                    }
                    if (((Boolean) AbstractC2598Ia.f25567b.r()).booleanValue()) {
                        if (((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.Bc)).booleanValue()) {
                            final int i4 = 0;
                            AbstractC5108b.f41223b.execute(new Runnable(this) { // from class: q2.I0

                                /* renamed from: u, reason: collision with root package name */
                                public final /* synthetic */ J0 f39959u;

                                {
                                    this.f39959u = this;
                                }

                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    switch (i4) {
                                        case 0:
                                            J0 j02 = this.f39959u;
                                            synchronized (j02.f39968h) {
                                                j02.b();
                                            }
                                            return;
                                        default:
                                            J0 j03 = this.f39959u;
                                            synchronized (j03.f39968h) {
                                                j03.b();
                                            }
                                            return;
                                    }
                                }
                            });
                            this.f39961a = new H0(context, EnumC4631b.INTERSTITIAL);
                            this.f39962b = new H0(context, EnumC4631b.REWARDED);
                            this.f39963c = new H0(context, EnumC4631b.APP_OPEN_AD);
                        }
                    }
                    u2.i.a("Initializing on calling thread");
                    b();
                    this.f39961a = new H0(context, EnumC4631b.INTERSTITIAL);
                    this.f39962b = new H0(context, EnumC4631b.REWARDED);
                    this.f39963c = new H0(context, EnumC4631b.APP_OPEN_AD);
                }
            } finally {
            }
        }
    }

    public final void e() {
        synchronized (this.f39968h) {
            O2.w.j("MobileAds.initialize() must be called prior to getting initialization status.", this.i != null);
            InterfaceC4890g0 interfaceC4890g0 = this.i;
            if (interfaceC4890g0 == null) {
                return;
            }
            try {
                a(interfaceC4890g0.n());
            } catch (RemoteException unused) {
                u2.i.c("Unable to get Initialization status.");
            }
        }
    }
}
