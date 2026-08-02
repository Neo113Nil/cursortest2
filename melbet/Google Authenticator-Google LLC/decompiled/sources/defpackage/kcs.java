package defpackage;

import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class kcs implements IBinder.DeathRecipient {
    public static final Logger b = Logger.getLogger(kcs.class.getName());
    public static final jws c = new jws("internal:remote-uid");
    public static final jws d = new jws("internal:server-authority");
    public static final jws e = new jws("internal:inbound-parcelable-policy");
    private final jyp a;
    public final kjm f;
    public final ScheduledExecutorService g;
    protected jwt k;
    public kbq l;
    public kdo m;
    public long o;
    public long p;
    public final LinkedHashSet j = new LinkedHashSet();
    private final List r = new ArrayList();
    public int q = 1;
    public final kdi h = new kdi(new kdh() { // from class: kcr
        @Override // defpackage.kdh
        public final boolean a(int i, Parcel parcel) {
            kdq c2;
            kdp kdpVar;
            kmp kmpVar;
            kcs kcsVar = kcs.this;
            try {
                if (i < 1001) {
                    synchronized (kcsVar) {
                        if (i != 1) {
                            if (i == 2) {
                                kcsVar.j(kbq.l.e("transport shutdown by peer"), true);
                            } else if (i == 3) {
                                if (kcsVar.n.a(parcel.readLong())) {
                                    kcs.b.logp(Level.FINE, "io.grpc.binder.internal.BinderTransport", "handleAcknowledgedBytes", "handleAcknowledgedBytes: Transmit Window No-Longer Full. Unblock calls: ".concat(kcsVar.toString()));
                                    LinkedHashSet linkedHashSet = kcsVar.j;
                                    ConcurrentHashMap concurrentHashMap = kcsVar.i;
                                    linkedHashSet.addAll(concurrentHashMap.keySet());
                                    Iterator it = linkedHashSet.iterator();
                                    while (kcsVar.l() && it.hasNext()) {
                                        kde kdeVar = (kde) concurrentHashMap.get(it.next());
                                        it.remove();
                                        if (kdeVar != null) {
                                            synchronized (kdeVar) {
                                                kdpVar = kdeVar.d;
                                                kmpVar = kdeVar.f;
                                            }
                                            if (kmpVar != null) {
                                                kmpVar.e();
                                            }
                                            if (kdpVar != null) {
                                                try {
                                                    synchronized (kdpVar) {
                                                        kdpVar.d();
                                                    }
                                                } catch (kbr e2) {
                                                    synchronized (kdeVar) {
                                                        kbq kbqVar = e2.a;
                                                        kdeVar.f(kbqVar, kbqVar, false);
                                                    }
                                                }
                                            } else {
                                                continue;
                                            }
                                        }
                                    }
                                }
                            } else if (i == 4) {
                                int readInt = parcel.readInt();
                                if (kcsVar.q == 3) {
                                    try {
                                        c2 = kdq.c();
                                        try {
                                            c2.a().writeInt(readInt);
                                            kcsVar.m.a(5, c2);
                                            c2.close();
                                        } finally {
                                        }
                                    } catch (RemoteException unused) {
                                    }
                                }
                            } else if (i != 5) {
                                return false;
                            }
                        }
                    }
                } else {
                    int dataSize = parcel.dataSize();
                    ConcurrentHashMap concurrentHashMap2 = kcsVar.i;
                    Integer valueOf = Integer.valueOf(i);
                    kde kdeVar2 = (kde) concurrentHashMap2.get(valueOf);
                    if (kdeVar2 == null) {
                        synchronized (kcsVar) {
                            if (!kcsVar.m()) {
                                kdeVar2 = kcsVar.b(i);
                                kde kdeVar3 = (kde) kcsVar.i.put(valueOf, kdeVar2);
                                hoq.t(kdeVar3 == null, "impossible appearance of %s", kdeVar3);
                            }
                        }
                    }
                    if (kdeVar2 != null) {
                        kdeVar2.i(parcel);
                    }
                    long j = kcsVar.o + dataSize;
                    kcsVar.o = j;
                    if (j - kcsVar.p <= 16384) {
                        return true;
                    }
                    synchronized (kcsVar) {
                        kdo kdoVar = kcsVar.m;
                        kdoVar.getClass();
                        long j2 = kcsVar.o;
                        try {
                            c2 = kdq.c();
                            try {
                                c2.a().writeLong(j2);
                                kdoVar.a(3, c2);
                                c2.close();
                            } finally {
                            }
                        } catch (RemoteException e3) {
                            kcsVar.j(kcs.h(e3), true);
                        }
                    }
                    kcsVar.p = kcsVar.o;
                }
                return true;
            } catch (RuntimeException e4) {
                kcs.b.logp(Level.SEVERE, "io.grpc.binder.internal.BinderTransport", "handleTransaction", a.Y(i, "Terminating transport for uncaught Exception in transaction "), (Throwable) e4);
                synchronized (kcsVar) {
                    kcsVar.j(kbq.k.d(e4), true);
                    return false;
                }
            }
        }
    });
    protected final ConcurrentHashMap i = new ConcurrentHashMap();
    public final kda n = new kda();

    protected kcs(kjm kjmVar, jwt jwtVar, jyp jypVar) {
        this.f = kjmVar;
        this.k = jwtVar;
        this.a = jypVar;
        this.g = (ScheduledExecutorService) kjmVar.a();
    }

    private final void a() {
        kdo kdoVar = this.m;
        if (kdoVar != null) {
            try {
                kdoVar.b.unlinkToDeath(this, 0);
            } catch (NoSuchElementException unused) {
            }
            try {
                kdq c2 = kdq.c();
                try {
                    c2.a().writeInt(0);
                    this.m.a(2, c2);
                    c2.close();
                } finally {
                }
            } catch (RemoteException unused2) {
            }
        }
    }

    public static kbq h(RemoteException remoteException) {
        return ((remoteException instanceof DeadObjectException) || (remoteException instanceof TransactionTooLargeException)) ? kbq.l.d(remoteException) : kbq.k.d(remoteException);
    }

    protected kde b(int i) {
        throw null;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final synchronized void binderDied() {
        j(kbq.l.e("Peer process crashed, exited or was killed (binderDied)"), true);
    }

    public final jyp c() {
        return this.a;
    }

    public abstract void d();

    final void i(int i, kdq kdqVar) {
        int dataSize = kdqVar.a().dataSize();
        try {
            this.m.a(i, kdqVar);
            if (this.n.b(dataSize)) {
                b.logp(Level.FINE, "io.grpc.binder.internal.BinderTransport", "sendTransaction", "transmit window now full ".concat(toString()));
            }
        } catch (RemoteException e2) {
            throw new kbr(h(e2));
        }
    }

    public final void j(kbq kbqVar, boolean z) {
        if (!m()) {
            this.l = kbqVar;
            n(4);
        }
        if (o(5)) {
            return;
        }
        if (z || this.i.isEmpty()) {
            this.h.a = null;
            n(5);
            a();
            ConcurrentHashMap concurrentHashMap = this.i;
            ArrayList arrayList = new ArrayList(concurrentHashMap.values());
            concurrentHashMap.clear();
            List list = this.r;
            ArrayList arrayList2 = new ArrayList(list);
            list.clear();
            this.g.execute(new fv(this, arrayList, kbqVar, arrayList2, 10, null));
        }
    }

    final void k(int i) {
        ConcurrentHashMap concurrentHashMap = this.i;
        if (concurrentHashMap.remove(Integer.valueOf(i)) == null || !concurrentHashMap.isEmpty()) {
            return;
        }
        this.g.execute(new iaq(this, 13));
    }

    final boolean l() {
        return !this.n.a;
    }

    final boolean m() {
        return o(4) || o(5);
    }

    final void n(int i) {
        int i2 = this.q;
        int i3 = i - 1;
        if (i3 == 2) {
            hoq.H(i2 == 1 || i2 == 2);
        } else if (i3 != 3) {
            hoq.H(i2 == 4);
        } else {
            hoq.H(i2 == 1 || i2 == 2 || i2 == 3);
        }
        this.q = i;
    }

    public final boolean o(int i) {
        return this.q == i;
    }
}
