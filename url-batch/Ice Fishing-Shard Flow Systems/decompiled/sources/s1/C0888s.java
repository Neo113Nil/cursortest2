package s1;

import android.content.Context;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import n.w1;
import r1.InterfaceC0844c;
import u.C0934e;
import z1.AbstractC1053a;

/* renamed from: s1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0888s implements InterfaceC0859A, r1.k {

    /* renamed from: e, reason: collision with root package name */
    public final Lock f7720e;

    /* renamed from: f, reason: collision with root package name */
    public final Condition f7721f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f7722g;

    /* renamed from: h, reason: collision with root package name */
    public final q1.f f7723h;

    /* renamed from: i, reason: collision with root package name */
    public final HandlerC0884o f7724i;
    public final Map j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f7725k = new HashMap();

    /* renamed from: l, reason: collision with root package name */
    public final w1 f7726l;

    /* renamed from: m, reason: collision with root package name */
    public final Map f7727m;

    /* renamed from: n, reason: collision with root package name */
    public final AbstractC1053a f7728n;

    /* renamed from: o, reason: collision with root package name */
    public volatile InterfaceC0886q f7729o;

    /* renamed from: p, reason: collision with root package name */
    public int f7730p;

    /* renamed from: q, reason: collision with root package name */
    public final C0885p f7731q;

    /* renamed from: r, reason: collision with root package name */
    public final z f7732r;

    public C0888s(Context context, C0885p c0885p, Lock lock, Looper looper, q1.f fVar, C0934e c0934e, w1 w1Var, C0934e c0934e2, AbstractC1053a abstractC1053a, ArrayList arrayList, z zVar) {
        this.f7722g = context;
        this.f7720e = lock;
        this.f7723h = fVar;
        this.j = c0934e;
        this.f7726l = w1Var;
        this.f7727m = c0934e2;
        this.f7728n = abstractC1053a;
        this.f7731q = c0885p;
        this.f7732r = zVar;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C0868J) arrayList.get(i2)).f7624g = this;
        }
        this.f7724i = new HandlerC0884o(this, looper, 1);
        this.f7721f = lock.newCondition();
        this.f7729o = new l4.b(17, this);
    }

    @Override // s1.InterfaceC0859A
    public final void a() {
        this.f7729o.a();
    }

    @Override // s1.InterfaceC0859A
    public final void b() {
        if (this.f7729o.i()) {
            this.f7725k.clear();
        }
    }

    @Override // s1.InterfaceC0859A
    public final boolean c() {
        return this.f7729o instanceof C0876g;
    }

    @Override // s1.InterfaceC0859A
    public final void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i2;
        IInterface iInterface;
        t1.t tVar;
        long j;
        printWriter.append((CharSequence) str).append("mState=").println(this.f7729o);
        for (r1.e eVar : this.f7727m.keySet()) {
            String valueOf = String.valueOf(str);
            printWriter.append((CharSequence) str).append((CharSequence) eVar.f7437c).println(":");
            InterfaceC0844c interfaceC0844c = (InterfaceC0844c) this.j.get(eVar.f7436b);
            t1.u.f(interfaceC0844c);
            String concat = valueOf.concat("  ");
            com.google.android.gms.common.internal.a aVar = (com.google.android.gms.common.internal.a) interfaceC0844c;
            synchronized (aVar.f4386k) {
                i2 = aVar.f4393r;
                iInterface = aVar.f4390o;
            }
            synchronized (aVar.f4387l) {
                tVar = aVar.f4388m;
            }
            printWriter.append((CharSequence) concat).append("mConnectState=");
            if (i2 == 1) {
                printWriter.print("DISCONNECTED");
            } else if (i2 == 2) {
                printWriter.print("REMOTE_CONNECTING");
            } else if (i2 == 3) {
                printWriter.print("LOCAL_CONNECTING");
            } else if (i2 == 4) {
                printWriter.print("CONNECTED");
            } else if (i2 != 5) {
                printWriter.print("UNKNOWN");
            } else {
                printWriter.print("DISCONNECTING");
            }
            printWriter.append(" mService=");
            if (iInterface == null) {
                printWriter.append("null");
            } else {
                printWriter.append((CharSequence) aVar.j()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
            }
            printWriter.append(" mServiceBroker=");
            if (tVar == null) {
                printWriter.println("null");
            } else {
                printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(tVar.f8000e)));
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
            if (aVar.f4379c > 0) {
                PrintWriter append = printWriter.append((CharSequence) concat).append("lastConnectedTime=");
                long j7 = aVar.f4379c;
                j = 0;
                String format = simpleDateFormat.format(new Date(j7));
                StringBuilder sb = new StringBuilder(String.valueOf(j7).length() + 1 + String.valueOf(format).length());
                sb.append(j7);
                sb.append(" ");
                sb.append(format);
                append.println(sb.toString());
            } else {
                j = 0;
            }
            if (aVar.f4378b > j) {
                printWriter.append((CharSequence) concat).append("lastSuspendedCause=");
                int i5 = aVar.f4377a;
                if (i5 == 1) {
                    printWriter.append("CAUSE_SERVICE_DISCONNECTED");
                } else if (i5 == 2) {
                    printWriter.append("CAUSE_NETWORK_LOST");
                } else if (i5 != 3) {
                    printWriter.append((CharSequence) String.valueOf(i5));
                } else {
                    printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
                }
                PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
                long j8 = aVar.f4378b;
                String format2 = simpleDateFormat.format(new Date(j8));
                StringBuilder sb2 = new StringBuilder(String.valueOf(j8).length() + 1 + String.valueOf(format2).length());
                sb2.append(j8);
                sb2.append(" ");
                sb2.append(format2);
                append2.println(sb2.toString());
            }
            if (aVar.f4381e > j) {
                printWriter.append((CharSequence) concat).append("lastFailedStatus=").append((CharSequence) O6.g.N(aVar.f4380d));
                PrintWriter append3 = printWriter.append(" lastFailedTime=");
                long j9 = aVar.f4381e;
                String format3 = simpleDateFormat.format(new Date(j9));
                StringBuilder sb3 = new StringBuilder(String.valueOf(j9).length() + 1 + String.valueOf(format3).length());
                sb3.append(j9);
                sb3.append(" ");
                sb3.append(format3);
                append3.println(sb3.toString());
            }
        }
    }

    public final void e() {
        this.f7720e.lock();
        try {
            this.f7729o = new l4.b(17, this);
            this.f7729o.l();
            this.f7721f.signalAll();
        } finally {
            this.f7720e.unlock();
        }
    }

    @Override // r1.k
    public final void onConnected(Bundle bundle) {
        this.f7720e.lock();
        try {
            this.f7729o.h(bundle);
        } finally {
            this.f7720e.unlock();
        }
    }

    @Override // r1.k
    public final void onConnectionSuspended(int i2) {
        this.f7720e.lock();
        try {
            this.f7729o.c(i2);
        } finally {
            this.f7720e.unlock();
        }
    }
}
