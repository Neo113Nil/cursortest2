package E1;

import a.AbstractC0124a;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.A1;
import com.google.android.gms.internal.play_billing.AbstractBinderC0301b;
import com.google.android.gms.internal.play_billing.AbstractC0352w;
import com.google.android.gms.internal.play_billing.B1;
import com.google.android.gms.internal.play_billing.C0298a;
import com.google.android.gms.internal.play_billing.C0312e1;
import com.google.android.gms.internal.play_billing.C0315f1;
import com.google.android.gms.internal.play_billing.C0318g1;
import com.google.android.gms.internal.play_billing.C0321h1;
import com.google.android.gms.internal.play_billing.C0324i1;
import com.google.android.gms.internal.play_billing.C0327j1;
import com.google.android.gms.internal.play_billing.C0330k1;
import com.google.android.gms.internal.play_billing.C0337o;
import com.google.android.gms.internal.play_billing.C1;
import com.google.android.gms.internal.play_billing.D1;
import com.google.android.gms.internal.play_billing.InterfaceC0304c;
import com.google.android.gms.internal.play_billing.z1;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class K implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0030f f501a;

    /* renamed from: b, reason: collision with root package name */
    public final C0337o f502b;

    /* renamed from: c, reason: collision with root package name */
    public final C0337o f503c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0029e f504d;

    public K(C0029e c0029e, InterfaceC0030f interfaceC0030f) {
        this.f504d = c0029e;
        AbstractC0124a abstractC0124a = c0029e.f593G;
        this.f502b = new C0337o(abstractC0124a);
        this.f503c = new C0337o(abstractC0124a);
        this.f501a = interfaceC0030f;
    }

    public final Long a(boolean z) {
        if (z) {
            C0337o c0337o = this.f502b;
            if (!c0337o.f5985b) {
                return null;
            }
            long U4 = c0337o.f5984a.U();
            if (!c0337o.f5985b) {
                throw new IllegalStateException("This stopwatch is already stopped.");
            }
            c0337o.f5985b = false;
            long j4 = (U4 - c0337o.f5987d) + c0337o.f5986c;
            c0337o.f5986c = j4;
            return Long.valueOf(TimeUnit.MILLISECONDS.convert(j4, TimeUnit.NANOSECONDS));
        }
        C0337o c0337o2 = this.f503c;
        if (!c0337o2.f5985b) {
            return null;
        }
        long U5 = c0337o2.f5984a.U();
        if (!c0337o2.f5985b) {
            throw new IllegalStateException("This stopwatch is already stopped.");
        }
        c0337o2.f5985b = false;
        long j5 = (U5 - c0337o2.f5987d) + c0337o2.f5986c;
        c0337o2.f5986c = j5;
        return Long.valueOf(TimeUnit.MILLISECONDS.convert(j5, TimeUnit.NANOSECONDS));
    }

    public final void b(C0037m c0037m, int i4, String str, boolean z) {
        try {
            C0324i1 s4 = C0327j1.s();
            int i5 = c0037m.f633a;
            s4.c();
            C0327j1.r((C0327j1) s4.f6024b, i5);
            String str2 = c0037m.f635c;
            s4.c();
            C0327j1.o((C0327j1) s4.f6024b, str2);
            s4.d(i4);
            if (str != null) {
                s4.c();
                C0327j1.n((C0327j1) s4.f6024b, str);
            }
            Long a3 = a(z);
            C0029e c0029e = this.f504d;
            if (!z) {
                z1 p2 = A1.p();
                p2.c();
                A1.n((A1) p2.f6024b, (C0327j1) s4.a());
                if (a3 != null) {
                    long longValue = a3.longValue();
                    p2.c();
                    A1.o((A1) p2.f6024b, longValue);
                }
                c0029e.f601h.E((A1) p2.a());
                return;
            }
            C1 r4 = D1.r();
            r4.d(false);
            r4.e();
            if (a3 != null) {
                long longValue2 = a3.longValue();
                r4.c();
                D1.p((D1) r4.f6024b, longValue2);
            }
            C0312e1 v = C0315f1.v();
            v.d(s4);
            v.f(6);
            v.e(r4);
            c0029e.q((C0315f1) v.a());
        } catch (Throwable th) {
            AbstractC0352w.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void c(C0037m c0037m) {
        C0029e c0029e = this.f504d;
        synchronized (c0029e.f594a) {
            try {
                if (c0029e.f595b == 3) {
                    return;
                }
                try {
                    this.f501a.onBillingSetupFinished(c0037m);
                } catch (Throwable th) {
                    AbstractC0352w.i("BillingClient", "Exception while calling onBillingSetupFinished.", th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        boolean z;
        AbstractC0352w.h("BillingClient", "Billing service died.");
        try {
            C0029e c0029e = this.f504d;
            synchronized (c0029e.f594a) {
                z = true;
                if (c0029e.f595b != 1) {
                    z = false;
                }
            }
            if (z) {
                l2.e eVar = c0029e.f601h;
                C0312e1 v = C0315f1.v();
                v.f(6);
                C0324i1 s4 = C0327j1.s();
                s4.d(110);
                v.d(s4);
                C1 r4 = D1.r();
                r4.d(false);
                r4.e();
                v.e(r4);
                eVar.v((C0315f1) v.a());
            } else {
                c0029e.f601h.D(C0330k1.n());
            }
        } catch (Throwable th) {
            AbstractC0352w.i("BillingClient", "Unable to log.", th);
        }
        C0029e c0029e2 = this.f504d;
        synchronized (c0029e2.f594a) {
            if (c0029e2.f595b != 3 && c0029e2.f595b != 0) {
                c0029e2.t(0);
                c0029e2.v();
                try {
                    this.f501a.onBillingServiceDisconnected();
                } catch (Throwable th2) {
                    AbstractC0352w.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th2);
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC0304c c0298a;
        AbstractC0352w.g("BillingClient", "Billing service connected.");
        C0029e c0029e = this.f504d;
        synchronized (c0029e.f594a) {
            try {
                if (c0029e.f595b == 3) {
                    return;
                }
                int i4 = AbstractBinderC0301b.f5932b;
                if (iBinder == null) {
                    c0298a = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
                    c0298a = queryLocalInterface instanceof InterfaceC0304c ? (InterfaceC0304c) queryLocalInterface : new C0298a(iBinder, "com.android.vending.billing.IInAppBillingService", 0);
                }
                c0029e.f602i = c0298a;
                if (C0029e.j(new Callable() { // from class: E1.J
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Bundle bundle;
                        InterfaceC0304c interfaceC0304c;
                        int i5;
                        K k4 = K.this;
                        C0029e c0029e2 = k4.f504d;
                        synchronized (c0029e2.f594a) {
                            try {
                                if (c0029e2.f595b == 3) {
                                    return null;
                                }
                                boolean z = c0029e2.f595b == 1;
                                if (TextUtils.isEmpty(null)) {
                                    bundle = null;
                                } else {
                                    bundle = new Bundle();
                                    bundle.putString("accountName", null);
                                    AbstractC0352w.b(bundle, c0029e2.f596c, c0029e2.f597d, c0029e2.f592F.longValue());
                                }
                                synchronized (c0029e2.f594a) {
                                    interfaceC0304c = c0029e2.f602i;
                                }
                                if (interfaceC0304c == null) {
                                    C0029e c0029e3 = k4.f504d;
                                    c0029e3.t(0);
                                    C0037m c0037m = W.f542j;
                                    c0029e3.s(107, c0037m);
                                    k4.c(c0037m);
                                    return null;
                                }
                                C0029e c0029e4 = k4.f504d;
                                String packageName = c0029e4.f600g.getPackageName();
                                int i6 = 3;
                                int i7 = 25;
                                while (true) {
                                    if (i7 < 3) {
                                        i7 = 0;
                                        break;
                                    }
                                    if (bundle == null) {
                                        try {
                                            C0298a c0298a2 = (C0298a) interfaceC0304c;
                                            Parcel a3 = c0298a2.a();
                                            a3.writeInt(i7);
                                            a3.writeString(packageName);
                                            a3.writeString("subs");
                                            Parcel b4 = c0298a2.b(a3, 1);
                                            int readInt = b4.readInt();
                                            b4.recycle();
                                            i6 = readInt;
                                        } catch (Exception e4) {
                                            AbstractC0352w.i("BillingClient", "Exception while checking if billing is supported; try to reconnect", e4);
                                            boolean z4 = e4 instanceof DeadObjectException;
                                            int i8 = z4 ? 91 : e4 instanceof RemoteException ? 90 : e4 instanceof SecurityException ? 92 : 42;
                                            String a4 = M.j.a(i8, 42) ? U.a(e4) : null;
                                            k4.f504d.t(0);
                                            k4.b(z4 ? W.f542j : W.f540h, i8, a4, z);
                                            k4.c(z4 ? W.f542j : W.f540h);
                                        }
                                    } else {
                                        i6 = ((C0298a) interfaceC0304c).d(i7, packageName, "subs", bundle);
                                    }
                                    if (i6 == 0) {
                                        AbstractC0352w.g("BillingClient", "highestLevelSupportedForSubs: " + i7);
                                        break;
                                    }
                                    i7--;
                                }
                                c0029e4.f605l = i7 >= 5;
                                c0029e4.f604k = i7 >= 3;
                                if (i7 < 3) {
                                    AbstractC0352w.g("BillingClient", "In-app billing API does not support subscription on this device.");
                                    i5 = 9;
                                } else {
                                    i5 = 1;
                                }
                                int i9 = 25;
                                while (true) {
                                    if (i9 < 3) {
                                        break;
                                    }
                                    if (bundle == null) {
                                        C0298a c0298a3 = (C0298a) interfaceC0304c;
                                        Parcel a5 = c0298a3.a();
                                        a5.writeInt(i9);
                                        a5.writeString(packageName);
                                        a5.writeString("inapp");
                                        Parcel b5 = c0298a3.b(a5, 1);
                                        int readInt2 = b5.readInt();
                                        b5.recycle();
                                        i6 = readInt2;
                                    } else {
                                        i6 = ((C0298a) interfaceC0304c).d(i9, packageName, "inapp", bundle);
                                    }
                                    if (i6 == 0) {
                                        c0029e4.f606m = i9;
                                        AbstractC0352w.g("BillingClient", "mHighestLevelSupportedForInApp: " + i9);
                                        break;
                                    }
                                    i9--;
                                }
                                C0029e.z(c0029e4, c0029e4.f606m);
                                if (c0029e4.f606m < 3) {
                                    AbstractC0352w.h("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                    i5 = 36;
                                }
                                C0029e.A(c0029e4, i6);
                                if (i6 != 0) {
                                    C0037m c0037m2 = W.f534b;
                                    k4.b(c0037m2, i5, null, z);
                                    k4.c(c0037m2);
                                    return null;
                                }
                                try {
                                    Long a6 = k4.a(z);
                                    if (z) {
                                        C0318g1 t4 = C0321h1.t();
                                        t4.c();
                                        C0321h1.s((C0321h1) t4.f6024b, 6);
                                        C1 r4 = D1.r();
                                        r4.d(false);
                                        r4.e();
                                        if (a6 != null) {
                                            long longValue = a6.longValue();
                                            r4.c();
                                            D1.p((D1) r4.f6024b, longValue);
                                        }
                                        C0029e c0029e5 = k4.f504d;
                                        t4.c();
                                        C0321h1.r((C0321h1) t4.f6024b, (D1) r4.a());
                                        c0029e5.r((C0321h1) t4.a());
                                    } else {
                                        z1 p2 = A1.p();
                                        C0324i1 s4 = C0327j1.s();
                                        s4.c();
                                        C0327j1.r((C0327j1) s4.f6024b, 0);
                                        p2.c();
                                        A1.n((A1) p2.f6024b, (C0327j1) s4.a());
                                        if (a6 != null) {
                                            long longValue2 = a6.longValue();
                                            p2.c();
                                            A1.o((A1) p2.f6024b, longValue2);
                                        }
                                        k4.f504d.f601h.E((A1) p2.a());
                                    }
                                } catch (Throwable th) {
                                    AbstractC0352w.i("BillingClient", "Unable to log.", th);
                                }
                                k4.c(W.f541i);
                                return null;
                            } finally {
                            }
                        }
                    }
                }, 30000L, new B.b(1, this), c0029e.B(), c0029e.i()) == null) {
                    C0037m E4 = c0029e.E();
                    c0029e.s(25, E4);
                    c(E4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        boolean z;
        AbstractC0352w.h("BillingClient", "Billing service disconnected.");
        try {
            C0029e c0029e = this.f504d;
            synchronized (c0029e.f594a) {
                z = true;
                if (c0029e.f595b != 1) {
                    z = false;
                }
            }
            if (z) {
                l2.e eVar = c0029e.f601h;
                C0312e1 v = C0315f1.v();
                v.f(6);
                C0324i1 s4 = C0327j1.s();
                s4.d(109);
                v.d(s4);
                C1 r4 = D1.r();
                r4.d(false);
                r4.e();
                v.e(r4);
                eVar.v((C0315f1) v.a());
            } else {
                c0029e.f601h.F(B1.n());
            }
        } catch (Throwable th) {
            AbstractC0352w.i("BillingClient", "Unable to log.", th);
        }
        C0337o c0337o = this.f503c;
        c0337o.f5986c = 0L;
        c0337o.f5985b = false;
        c0337o.a();
        C0029e c0029e2 = this.f504d;
        synchronized (c0029e2.f594a) {
            try {
                if (c0029e2.f595b == 3) {
                    return;
                }
                c0029e2.t(0);
                try {
                    this.f501a.onBillingServiceDisconnected();
                } catch (Throwable th2) {
                    AbstractC0352w.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th2);
                }
            } finally {
            }
        }
    }
}
