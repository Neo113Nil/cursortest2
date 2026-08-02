package n0;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.AbstractBinderC0211c;
import com.google.android.gms.internal.play_billing.AbstractC0248o0;
import com.google.android.gms.internal.play_billing.C0208b;
import com.google.android.gms.internal.play_billing.InterfaceC0214d;
import com.google.android.gms.internal.play_billing.P1;
import com.google.android.gms.internal.play_billing.Q1;
import com.google.android.gms.internal.play_billing.T1;
import com.google.android.gms.internal.play_billing.U1;
import com.google.android.gms.internal.play_billing.W1;
import com.google.android.gms.internal.play_billing.k2;
import com.google.android.gms.internal.play_billing.l2;
import com.google.android.gms.internal.play_billing.m2;
import f0.C0322a;
import java.util.concurrent.Callable;

/* renamed from: n0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC1164z implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1144f f10140a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1143e f10141b;

    public /* synthetic */ ServiceConnectionC1164z(C1143e c1143e, InterfaceC1144f interfaceC1144f) {
        this.f10141b = c1143e;
        this.f10140a = interfaceC1144f;
    }

    public final void a(C1147i c1147i) {
        synchronized (this.f10141b.f10065a) {
            try {
                if (this.f10141b.f10066b == 3) {
                    return;
                }
                this.f10140a.onBillingSetupFinished(c1147i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        boolean z;
        AbstractC0248o0.g("BillingClient", "Billing service died.");
        try {
            C1143e c1143e = this.f10141b;
            synchronized (c1143e.f10065a) {
                z = true;
                if (c1143e.f10066b != 1) {
                    z = false;
                }
            }
            if (z) {
                C0322a c0322a = this.f10141b.f10070g;
                P1 r3 = Q1.r();
                r3.f(6);
                T1 r4 = U1.r();
                r4.f(122);
                r3.e(r4);
                c0322a.v((Q1) r3.b());
            } else {
                this.f10141b.f10070g.y(W1.n());
            }
        } catch (Throwable th) {
            AbstractC0248o0.h("BillingClient", "Unable to log.", th);
        }
        synchronized (this.f10141b.f10065a) {
            if (this.f10141b.f10066b != 3 && this.f10141b.f10066b != 0) {
                this.f10141b.t(0);
                this.f10141b.u();
                this.f10140a.onBillingServiceDisconnected();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC0214d c0208b;
        AbstractC0248o0.f("BillingClient", "Billing service connected.");
        synchronized (this.f10141b.f10065a) {
            try {
                if (this.f10141b.f10066b == 3) {
                    return;
                }
                C1143e c1143e = this.f10141b;
                int i3 = AbstractBinderC0211c.f2834c;
                if (iBinder == null) {
                    c0208b = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
                    c0208b = queryLocalInterface instanceof InterfaceC0214d ? (InterfaceC0214d) queryLocalInterface : new C0208b(iBinder, "com.android.vending.billing.IInAppBillingService", 1);
                }
                c1143e.f10071h = c0208b;
                C1143e c1143e2 = this.f10141b;
                if (C1143e.m(new Callable() { // from class: n0.y
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:114:0x0278  */
                    /* JADX WARN: Removed duplicated region for block: B:127:0x0237 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:187:0x0224  */
                    /* JADX WARN: Removed duplicated region for block: B:189:0x0229  */
                    @Override // java.util.concurrent.Callable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object call() {
                        Bundle bundle;
                        String str;
                        int i4;
                        int i5;
                        String str2;
                        boolean z;
                        int i6;
                        InterfaceC0214d interfaceC0214d;
                        ServiceConnectionC1164z serviceConnectionC1164z = ServiceConnectionC1164z.this;
                        synchronized (serviceConnectionC1164z.f10141b.f10065a) {
                            try {
                                if (serviceConnectionC1164z.f10141b.f10066b == 3) {
                                    return null;
                                }
                                int i7 = serviceConnectionC1164z.f10141b.f10066b;
                                if (TextUtils.isEmpty(null)) {
                                    bundle = null;
                                } else {
                                    bundle = new Bundle();
                                    bundle.putString("accountName", null);
                                    C1143e c1143e3 = serviceConnectionC1164z.f10141b;
                                    AbstractC0248o0.b(bundle, c1143e3.f10067c, c1143e3.f10064E.longValue());
                                }
                                try {
                                    synchronized (serviceConnectionC1164z.f10141b.f10065a) {
                                        try {
                                            try {
                                                interfaceC0214d = serviceConnectionC1164z.f10141b.f10071h;
                                            } catch (Throwable th) {
                                                th = th;
                                                while (true) {
                                                    try {
                                                        throw th;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                    }
                                                }
                                            }
                                        } catch (Exception e3) {
                                            e = e3;
                                            boolean z2 = i7 != 1;
                                            AbstractC0248o0.h("BillingClient", "Exception while checking if billing is supported; try to reconnect", e);
                                            if (e instanceof DeadObjectException) {
                                                i5 = 101;
                                            } else if (e instanceof RemoteException) {
                                                i5 = 100;
                                            } else {
                                                if (!(e instanceof SecurityException)) {
                                                    i4 = 42;
                                                    String a3 = i4 != 42 ? AbstractC1133M.a(e) : str;
                                                    serviceConnectionC1164z.f10141b.t(0);
                                                    boolean z3 = z2;
                                                    str2 = a3;
                                                    z = z3;
                                                    i6 = 6;
                                                    if (i6 == 0) {
                                                    }
                                                    return str;
                                                }
                                                i5 = 102;
                                            }
                                            i4 = i5;
                                            if (i4 != 42) {
                                            }
                                            serviceConnectionC1164z.f10141b.t(0);
                                            boolean z32 = z2;
                                            str2 = a3;
                                            z = z32;
                                            i6 = 6;
                                            if (i6 == 0) {
                                            }
                                            return str;
                                        }
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    str = null;
                                }
                                if (interfaceC0214d == null) {
                                    serviceConnectionC1164z.f10141b.t(0);
                                    C1143e c1143e4 = serviceConnectionC1164z.f10141b;
                                    C1147i c1147i = AbstractC1135O.f10026k;
                                    c1143e4.H(119, 6, c1147i);
                                    serviceConnectionC1164z.a(c1147i);
                                    return null;
                                }
                                String packageName = serviceConnectionC1164z.f10141b.f.getPackageName();
                                i6 = 3;
                                int i8 = 23;
                                while (true) {
                                    if (i8 < 3) {
                                        str = null;
                                        i8 = 0;
                                        break;
                                    }
                                    if (bundle == null) {
                                        C0208b c0208b2 = (C0208b) interfaceC0214d;
                                        Parcel a4 = c0208b2.a();
                                        a4.writeInt(i8);
                                        a4.writeString(packageName);
                                        a4.writeString("subs");
                                        Parcel b3 = c0208b2.b(a4, 1);
                                        int readInt = b3.readInt();
                                        b3.recycle();
                                        i6 = readInt;
                                    } else {
                                        i6 = ((C0208b) interfaceC0214d).d(i8, packageName, "subs", bundle);
                                    }
                                    if (i6 == 0) {
                                        StringBuilder sb = new StringBuilder();
                                        str = null;
                                        sb.append("highestLevelSupportedForSubs: ");
                                        sb.append(i8);
                                        AbstractC0248o0.f("BillingClient", sb.toString());
                                        break;
                                    }
                                    i8--;
                                }
                                C1143e c1143e5 = serviceConnectionC1164z.f10141b;
                                c1143e5.f10074k = i8 >= 5;
                                c1143e5.f10073j = i8 >= 3;
                                if (i8 < 3) {
                                    AbstractC0248o0.f("BillingClient", "In-app billing API does not support subscription on this device.");
                                    i4 = 9;
                                } else {
                                    i4 = 1;
                                }
                                int i9 = 23;
                                while (true) {
                                    if (i9 < 3) {
                                        break;
                                    }
                                    if (bundle == null) {
                                        C0208b c0208b3 = (C0208b) interfaceC0214d;
                                        Parcel a5 = c0208b3.a();
                                        a5.writeInt(i9);
                                        a5.writeString(packageName);
                                        a5.writeString("inapp");
                                        Parcel b4 = c0208b3.b(a5, 1);
                                        i6 = b4.readInt();
                                        b4.recycle();
                                    } else {
                                        i6 = ((C0208b) interfaceC0214d).d(i9, packageName, "inapp", bundle);
                                    }
                                    if (i6 == 0) {
                                        serviceConnectionC1164z.f10141b.f10075l = i9;
                                        AbstractC0248o0.f("BillingClient", "mHighestLevelSupportedForInApp: " + i9);
                                        break;
                                    }
                                    i9--;
                                }
                                C1143e c1143e6 = serviceConnectionC1164z.f10141b;
                                int i10 = c1143e6.f10075l;
                                c1143e6.z = i10 >= 23;
                                c1143e6.f10086y = i10 >= 22;
                                c1143e6.f10085x = i10 >= 21;
                                c1143e6.f10084w = i10 >= 20;
                                c1143e6.v = i10 >= 19;
                                c1143e6.f10083u = i10 >= 18;
                                c1143e6.f10082t = i10 >= 17;
                                c1143e6.f10081s = i10 >= 16;
                                c1143e6.f10080r = i10 >= 15;
                                c1143e6.f10079q = i10 >= 14;
                                c1143e6.f10078p = i10 >= 12;
                                c1143e6.o = i10 >= 9;
                                c1143e6.f10077n = i10 >= 8;
                                c1143e6.f10076m = i10 >= 6;
                                if (i10 < 3) {
                                    AbstractC0248o0.g("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                    i4 = 36;
                                }
                                if (i6 == 0) {
                                    synchronized (serviceConnectionC1164z.f10141b.f10065a) {
                                        try {
                                            if (serviceConnectionC1164z.f10141b.f10066b == 3) {
                                                return str;
                                            }
                                            z = i7 != 1;
                                            serviceConnectionC1164z.f10141b.t(2);
                                            C1137Q c1137q = serviceConnectionC1164z.f10141b.f10069e != null ? serviceConnectionC1164z.f10141b.f10069e : str;
                                            if (c1137q != 0) {
                                                c1137q.a(serviceConnectionC1164z.f10141b.f10085x);
                                            }
                                        } finally {
                                        }
                                    }
                                } else {
                                    z = i7 != 1;
                                    serviceConnectionC1164z.f10141b.t(0);
                                }
                                str2 = str;
                                if (i6 == 0) {
                                    try {
                                        if (true != z) {
                                            serviceConnectionC1164z.f10141b.J(6);
                                        } else {
                                            C0322a c0322a = serviceConnectionC1164z.f10141b.f10070g;
                                            k2 o = l2.o();
                                            T1 r3 = U1.r();
                                            r3.e(0);
                                            o.d();
                                            l2.n((l2) o.f2860b, (U1) r3.b());
                                            c0322a.z((l2) o.b());
                                        }
                                    } catch (Throwable th3) {
                                        AbstractC0248o0.h("BillingClient", "Unable to log.", th3);
                                    }
                                    serviceConnectionC1164z.a(AbstractC1135O.f10025j);
                                } else {
                                    C1147i c1147i2 = AbstractC1135O.f10017a;
                                    try {
                                        if (true != z) {
                                            serviceConnectionC1164z.f10141b.I(i4, 6, c1147i2, str2);
                                        } else {
                                            T1 r4 = U1.r();
                                            r4.e(c1147i2.f10092a);
                                            String str3 = c1147i2.f10093b;
                                            r4.d();
                                            U1.o((U1) r4.f2860b, str3);
                                            r4.f(i4);
                                            if (str2 != null) {
                                                r4.d();
                                                U1.n((U1) r4.f2860b, str2);
                                            }
                                            C0322a c0322a2 = serviceConnectionC1164z.f10141b.f10070g;
                                            k2 o3 = l2.o();
                                            U1 u12 = (U1) r4.b();
                                            o3.d();
                                            l2.n((l2) o3.f2860b, u12);
                                            c0322a2.z((l2) o3.b());
                                        }
                                    } catch (Throwable th4) {
                                        AbstractC0248o0.h("BillingClient", "Unable to log.", th4);
                                    }
                                    serviceConnectionC1164z.a(AbstractC1135O.f10017a);
                                }
                                return str;
                            } finally {
                            }
                        }
                    }
                }, 30000L, new B.b(16, this), c1143e2.D(), c1143e2.q()) == null) {
                    C1143e c1143e3 = this.f10141b;
                    C1147i n3 = c1143e3.n();
                    c1143e3.H(25, 6, n3);
                    a(n3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        boolean z;
        AbstractC0248o0.g("BillingClient", "Billing service disconnected.");
        try {
            C1143e c1143e = this.f10141b;
            synchronized (c1143e.f10065a) {
                z = true;
                if (c1143e.f10066b != 1) {
                    z = false;
                }
            }
            if (z) {
                C0322a c0322a = this.f10141b.f10070g;
                P1 r3 = Q1.r();
                r3.f(6);
                T1 r4 = U1.r();
                r4.f(121);
                r3.e(r4);
                c0322a.v((Q1) r3.b());
            } else {
                this.f10141b.f10070g.A(m2.n());
            }
        } catch (Throwable th) {
            AbstractC0248o0.h("BillingClient", "Unable to log.", th);
        }
        synchronized (this.f10141b.f10065a) {
            try {
                if (this.f10141b.f10066b == 3) {
                    return;
                }
                this.f10141b.t(0);
                this.f10140a.onBillingServiceDisconnected();
            } finally {
            }
        }
    }
}
