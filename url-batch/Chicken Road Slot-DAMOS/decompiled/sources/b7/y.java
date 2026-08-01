package b7;

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
import m.g2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class y implements i0, a7.k {

    /* renamed from: d, reason: collision with root package name */
    public final Lock f1397d;

    /* renamed from: e, reason: collision with root package name */
    public final Condition f1398e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f1399f;
    public final z6.g g;

    /* renamed from: h, reason: collision with root package name */
    public final t f1400h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f1401i;
    public final HashMap j = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    public final g2 f1402k;

    /* renamed from: l, reason: collision with root package name */
    public final Map f1403l;

    /* renamed from: m, reason: collision with root package name */
    public final a.a f1404m;

    /* renamed from: n, reason: collision with root package name */
    public volatile w f1405n;

    /* renamed from: o, reason: collision with root package name */
    public int f1406o;

    /* renamed from: p, reason: collision with root package name */
    public final v f1407p;

    /* renamed from: q, reason: collision with root package name */
    public final h0 f1408q;

    public y(Context context, v vVar, Lock lock, Looper looper, z6.g gVar, s.e eVar, g2 g2Var, s.e eVar2, a.a aVar, ArrayList arrayList, h0 h0Var) {
        this.f1399f = context;
        this.f1397d = lock;
        this.g = gVar;
        this.f1401i = eVar;
        this.f1402k = g2Var;
        this.f1403l = eVar2;
        this.f1404m = aVar;
        this.f1407p = vVar;
        this.f1408q = h0Var;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((u0) arrayList.get(i3)).f1364f = this;
        }
        this.f1400h = new t(this, looper, 1);
        this.f1398e = lock.newCondition();
        this.f1405n = new d9.c(5, this);
    }

    @Override // b7.i0
    public final void a() {
        this.f1405n.a();
    }

    @Override // b7.i0
    public final void b() {
        if (this.f1405n.e()) {
            this.j.clear();
        }
    }

    @Override // b7.i0
    public final boolean c() {
        return this.f1405n instanceof j;
    }

    @Override // b7.i0
    public final void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i3;
        IInterface iInterface;
        c7.y yVar;
        long j;
        printWriter.append((CharSequence) str).append("mState=").println(this.f1405n);
        for (a7.d dVar : this.f1403l.keySet()) {
            printWriter.append((CharSequence) str).append((CharSequence) dVar.f315c).println(":");
            c7.i iVar = (c7.i) this.f1401i.get(dVar.f314b);
            c7.c0.g(iVar);
            String concat = str.concat("  ");
            c7.i iVar2 = iVar;
            synchronized (iVar2.f1887l) {
                i3 = iVar2.f1894s;
                iInterface = iVar2.f1891p;
            }
            synchronized (iVar2.f1888m) {
                yVar = iVar2.f1889n;
            }
            printWriter.append((CharSequence) concat).append("mConnectState=");
            if (i3 == 1) {
                printWriter.print("DISCONNECTED");
            } else if (i3 == 2) {
                printWriter.print("REMOTE_CONNECTING");
            } else if (i3 == 3) {
                printWriter.print("LOCAL_CONNECTING");
            } else if (i3 == 4) {
                printWriter.print("CONNECTED");
            } else if (i3 != 5) {
                printWriter.print("UNKNOWN");
            } else {
                printWriter.print("DISCONNECTING");
            }
            printWriter.append(" mService=");
            if (iInterface == null) {
                printWriter.append("null");
            } else {
                printWriter.append((CharSequence) iVar2.n()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
            }
            printWriter.append(" mServiceBroker=");
            if (yVar == null) {
                printWriter.println("null");
            } else {
                printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(yVar.f2005d)));
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
            if (iVar2.f1880c > 0) {
                PrintWriter append = printWriter.append((CharSequence) concat).append("lastConnectedTime=");
                long j3 = iVar2.f1880c;
                j = 0;
                String format = simpleDateFormat.format(new Date(j3));
                StringBuilder sb2 = new StringBuilder(String.valueOf(j3).length() + 1 + String.valueOf(format).length());
                sb2.append(j3);
                sb2.append(" ");
                sb2.append(format);
                append.println(sb2.toString());
            } else {
                j = 0;
            }
            if (iVar2.f1879b > j) {
                printWriter.append((CharSequence) concat).append("lastSuspendedCause=");
                int i10 = iVar2.f1878a;
                if (i10 == 1) {
                    printWriter.append("CAUSE_SERVICE_DISCONNECTED");
                } else if (i10 == 2) {
                    printWriter.append("CAUSE_NETWORK_LOST");
                } else if (i10 != 3) {
                    printWriter.append((CharSequence) String.valueOf(i10));
                } else {
                    printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
                }
                PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
                long j10 = iVar2.f1879b;
                String format2 = simpleDateFormat.format(new Date(j10));
                StringBuilder sb3 = new StringBuilder(String.valueOf(j10).length() + 1 + String.valueOf(format2).length());
                sb3.append(j10);
                sb3.append(" ");
                sb3.append(format2);
                append2.println(sb3.toString());
            }
            if (iVar2.f1882e > j) {
                printWriter.append((CharSequence) concat).append("lastFailedStatus=").append((CharSequence) c6.f.I(iVar2.f1881d));
                PrintWriter append3 = printWriter.append(" lastFailedTime=");
                long j11 = iVar2.f1882e;
                String format3 = simpleDateFormat.format(new Date(j11));
                StringBuilder sb4 = new StringBuilder(String.valueOf(j11).length() + 1 + String.valueOf(format3).length());
                sb4.append(j11);
                sb4.append(" ");
                sb4.append(format3);
                append3.println(sb4.toString());
            }
        }
    }

    public final void e() {
        this.f1397d.lock();
        try {
            this.f1405n = new d9.c(5, this);
            this.f1405n.g();
            this.f1398e.signalAll();
        } finally {
            this.f1397d.unlock();
        }
    }

    @Override // a7.k
    public final void onConnected(Bundle bundle) {
        this.f1397d.lock();
        try {
            this.f1405n.d(bundle);
        } finally {
            this.f1397d.unlock();
        }
    }

    @Override // a7.k
    public final void onConnectionSuspended(int i3) {
        this.f1397d.lock();
        try {
            this.f1405n.b(i3);
        } finally {
            this.f1397d.unlock();
        }
    }
}
