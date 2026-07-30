package O2;

import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import g1.C4523c;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: O2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0369f {

    /* renamed from: V, reason: collision with root package name */
    public static final L2.d[] f2381V = new L2.d[0];

    /* renamed from: A, reason: collision with root package name */
    public final Context f2382A;

    /* renamed from: B, reason: collision with root package name */
    public final I f2383B;

    /* renamed from: C, reason: collision with root package name */
    public final L2.f f2384C;

    /* renamed from: D, reason: collision with root package name */
    public final z f2385D;

    /* renamed from: G, reason: collision with root package name */
    public v f2388G;

    /* renamed from: H, reason: collision with root package name */
    public InterfaceC0367d f2389H;

    /* renamed from: I, reason: collision with root package name */
    public IInterface f2390I;

    /* renamed from: K, reason: collision with root package name */
    public B f2391K;

    /* renamed from: M, reason: collision with root package name */
    public final InterfaceC0365b f2393M;

    /* renamed from: N, reason: collision with root package name */
    public final InterfaceC0366c f2394N;

    /* renamed from: O, reason: collision with root package name */
    public final int f2395O;

    /* renamed from: P, reason: collision with root package name */
    public final String f2396P;

    /* renamed from: Q, reason: collision with root package name */
    public volatile String f2397Q;

    /* renamed from: n, reason: collision with root package name */
    public int f2402n;

    /* renamed from: u, reason: collision with root package name */
    public long f2403u;

    /* renamed from: v, reason: collision with root package name */
    public long f2404v;

    /* renamed from: w, reason: collision with root package name */
    public int f2405w;

    /* renamed from: x, reason: collision with root package name */
    public long f2406x;

    /* renamed from: z, reason: collision with root package name */
    public J f2408z;

    /* renamed from: y, reason: collision with root package name */
    public volatile String f2407y = null;

    /* renamed from: E, reason: collision with root package name */
    public final Object f2386E = new Object();

    /* renamed from: F, reason: collision with root package name */
    public final Object f2387F = new Object();
    public final ArrayList J = new ArrayList();

    /* renamed from: L, reason: collision with root package name */
    public int f2392L = 1;

    /* renamed from: R, reason: collision with root package name */
    public L2.b f2398R = null;

    /* renamed from: S, reason: collision with root package name */
    public boolean f2399S = false;

    /* renamed from: T, reason: collision with root package name */
    public volatile E f2400T = null;

    /* renamed from: U, reason: collision with root package name */
    public final AtomicInteger f2401U = new AtomicInteger(0);

    public AbstractC0369f(Context context, Looper looper, I i, L2.f fVar, int i4, InterfaceC0365b interfaceC0365b, InterfaceC0366c interfaceC0366c, String str) {
        w.i(context, "Context must not be null");
        this.f2382A = context;
        w.i(looper, "Looper must not be null");
        w.i(i, "Supervisor must not be null");
        this.f2383B = i;
        w.i(fVar, "API availability must not be null");
        this.f2384C = fVar;
        this.f2385D = new z(this, looper);
        this.f2395O = i4;
        this.f2393M = interfaceC0365b;
        this.f2394N = interfaceC0366c;
        this.f2396P = str;
    }

    public final void a(C4523c c4523c) {
        ((N2.C) c4523c.f37856u).f1987F.f2052F.post(new F3.C(6, c4523c));
    }

    public final void c(String str) {
        this.f2407y = str;
        h();
    }

    public final boolean d() {
        boolean z8;
        synchronized (this.f2386E) {
            int i = this.f2392L;
            z8 = true;
            if (i != 2 && i != 3) {
                z8 = false;
            }
        }
        return z8;
    }

    public final void e(String str, PrintWriter printWriter) {
        int i;
        IInterface iInterface;
        v vVar;
        long j9;
        synchronized (this.f2386E) {
            i = this.f2392L;
            iInterface = this.f2390I;
        }
        synchronized (this.f2387F) {
            vVar = this.f2388G;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i == 4) {
            printWriter.print("CONNECTED");
        } else if (i != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) v()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (vVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(vVar.f2481n)));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f2404v > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j10 = this.f2404v;
            String format = simpleDateFormat.format(new Date(j10));
            j9 = 0;
            StringBuilder sb = new StringBuilder(String.valueOf(j10).length() + 1 + String.valueOf(format).length());
            sb.append(j10);
            sb.append(" ");
            sb.append(format);
            append.println(sb.toString());
        } else {
            j9 = 0;
        }
        if (this.f2403u > j9) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i4 = this.f2402n;
            if (i4 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i4 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i4 != 3) {
                printWriter.append((CharSequence) String.valueOf(i4));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j11 = this.f2403u;
            String format2 = simpleDateFormat.format(new Date(j11));
            StringBuilder sb2 = new StringBuilder(String.valueOf(j11).length() + 1 + String.valueOf(format2).length());
            sb2.append(j11);
            sb2.append(" ");
            sb2.append(format2);
            append2.println(sb2.toString());
        }
        if (this.f2406x > j9) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) com.bumptech.glide.h.n(this.f2405w));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j12 = this.f2406x;
            String format3 = simpleDateFormat.format(new Date(j12));
            StringBuilder sb3 = new StringBuilder(String.valueOf(j12).length() + 1 + String.valueOf(format3).length());
            sb3.append(j12);
            sb3.append(" ");
            sb3.append(format3);
            append3.println(sb3.toString());
        }
    }

    public final void f() {
        if (!j() || this.f2408z == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(InterfaceC0373j interfaceC0373j, Set set) {
        Bundle s3 = s();
        String str = Build.VERSION.SDK_INT < 31 ? this.f2397Q : this.f2397Q;
        int i = this.f2395O;
        int i4 = L2.f.f1725a;
        Scope[] scopeArr = C0371h.f2415H;
        Bundle bundle = new Bundle();
        L2.d[] dVarArr = C0371h.f2416I;
        C0371h c0371h = new C0371h(6, i, i4, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        c0371h.f2427w = this.f2382A.getPackageName();
        c0371h.f2430z = s3;
        if (set != null) {
            c0371h.f2429y = (Scope[]) set.toArray(new Scope[0]);
        }
        if (n()) {
            Account q6 = q();
            if (q6 == null) {
                q6 = new Account("<<default account>>", "com.google");
            }
            c0371h.f2417A = q6;
            if (interfaceC0373j != 0) {
                c0371h.f2428x = ((Z2.a) interfaceC0373j).f4243u;
            }
        }
        c0371h.f2418B = f2381V;
        c0371h.f2419C = r();
        if (this instanceof Y2.b) {
            c0371h.f2422F = true;
        }
        try {
            synchronized (this.f2387F) {
                try {
                    v vVar = this.f2388G;
                    if (vVar != null) {
                        vVar.i0(new A(this, this.f2401U.get()), c0371h);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (DeadObjectException e6) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e6);
            int i9 = this.f2401U.get();
            z zVar = this.f2385D;
            zVar.sendMessage(zVar.obtainMessage(6, i9, 3));
        } catch (RemoteException e9) {
            e = e9;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i10 = this.f2401U.get();
            C c4 = new C(this, 8, null, null);
            z zVar2 = this.f2385D;
            zVar2.sendMessage(zVar2.obtainMessage(1, i10, -1, c4));
        } catch (SecurityException e10) {
            throw e10;
        } catch (RuntimeException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i102 = this.f2401U.get();
            C c42 = new C(this, 8, null, null);
            z zVar22 = this.f2385D;
            zVar22.sendMessage(zVar22.obtainMessage(1, i102, -1, c42));
        }
    }

    public final void h() {
        this.f2401U.incrementAndGet();
        ArrayList arrayList = this.J;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    u uVar = (u) arrayList.get(i);
                    synchronized (uVar) {
                        uVar.f2475a = null;
                    }
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f2387F) {
            this.f2388G = null;
        }
        z(1, null);
    }

    public final void i(InterfaceC0367d interfaceC0367d) {
        w.i(interfaceC0367d, "Connection progress callbacks cannot be null.");
        this.f2389H = interfaceC0367d;
        z(2, null);
    }

    public final boolean j() {
        boolean z8;
        synchronized (this.f2386E) {
            z8 = this.f2392L == 4;
        }
        return z8;
    }

    public int k() {
        return L2.f.f1725a;
    }

    public final L2.d[] l() {
        E e6 = this.f2400T;
        if (e6 == null) {
            return null;
        }
        return e6.f2355u;
    }

    public final String m() {
        return this.f2407y;
    }

    public boolean n() {
        return false;
    }

    public final void o() {
        int c4 = this.f2384C.c(this.f2382A, k());
        if (c4 == 0) {
            i(new C0368e(this));
            return;
        }
        z(1, null);
        this.f2389H = new C0368e(this);
        int i = this.f2401U.get();
        z zVar = this.f2385D;
        zVar.sendMessage(zVar.obtainMessage(3, i, c4, null));
    }

    public abstract IInterface p(IBinder iBinder);

    public Account q() {
        return null;
    }

    public L2.d[] r() {
        return f2381V;
    }

    public Bundle s() {
        return new Bundle();
    }

    public Set t() {
        return Collections.EMPTY_SET;
    }

    public final IInterface u() {
        IInterface iInterface;
        synchronized (this.f2386E) {
            try {
                if (this.f2392L == 5) {
                    throw new DeadObjectException();
                }
                if (!j()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.f2390I;
                w.i(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String v();

    public abstract String w();

    public boolean x() {
        return k() >= 211700000;
    }

    public final /* synthetic */ boolean y(int i, int i4, IInterface iInterface) {
        synchronized (this.f2386E) {
            try {
                if (this.f2392L != i) {
                    return false;
                }
                z(i4, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(int i, IInterface iInterface) {
        J j9;
        w.b((i == 4) == (iInterface != null));
        synchronized (this.f2386E) {
            try {
                this.f2392L = i;
                this.f2390I = iInterface;
                Bundle bundle = null;
                if (i == 1) {
                    B b9 = this.f2391K;
                    if (b9 != null) {
                        I i4 = this.f2383B;
                        String str = this.f2408z.f2378b;
                        w.h(str);
                        this.f2408z.getClass();
                        if (this.f2396P == null) {
                            this.f2382A.getClass();
                        }
                        i4.c(str, b9, this.f2408z.f2377a);
                        this.f2391K = null;
                    }
                } else if (i == 2 || i == 3) {
                    B b10 = this.f2391K;
                    if (b10 != null && (j9 = this.f2408z) != null) {
                        String str2 = j9.f2378b;
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 70 + "com.google.android.gms".length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(str2);
                        sb.append(" on com.google.android.gms");
                        Log.e("GmsClient", sb.toString());
                        I i9 = this.f2383B;
                        String str3 = this.f2408z.f2378b;
                        w.h(str3);
                        this.f2408z.getClass();
                        if (this.f2396P == null) {
                            this.f2382A.getClass();
                        }
                        i9.c(str3, b10, this.f2408z.f2377a);
                        this.f2401U.incrementAndGet();
                    }
                    B b11 = new B(this, this.f2401U.get());
                    this.f2391K = b11;
                    String w9 = w();
                    boolean x3 = x();
                    this.f2408z = new J(w9, x3);
                    if (x3 && k() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f2408z.f2378b)));
                    }
                    I i10 = this.f2383B;
                    String str4 = this.f2408z.f2378b;
                    w.h(str4);
                    this.f2408z.getClass();
                    String str5 = this.f2396P;
                    if (str5 == null) {
                        str5 = this.f2382A.getClass().getName();
                    }
                    L2.b b12 = i10.b(new F(str4, this.f2408z.f2377a), b11, str5, null);
                    if (!b12.b()) {
                        String str6 = this.f2408z.f2378b;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str6).length() + 34 + "com.google.android.gms".length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(str6);
                        sb2.append(" on com.google.android.gms");
                        Log.w("GmsClient", sb2.toString());
                        int i11 = b12.f1712u;
                        if (i11 == -1) {
                            i11 = 16;
                        }
                        if (b12.f1713v != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", b12.f1713v);
                        }
                        int i12 = this.f2401U.get();
                        D d2 = new D(this, i11, bundle);
                        z zVar = this.f2385D;
                        zVar.sendMessage(zVar.obtainMessage(7, i12, -1, d2));
                    }
                } else if (i == 4) {
                    w.h(iInterface);
                    this.f2404v = System.currentTimeMillis();
                }
            } finally {
            }
        }
    }
}
