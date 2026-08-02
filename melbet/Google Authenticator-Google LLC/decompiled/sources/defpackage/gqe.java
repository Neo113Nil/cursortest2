package defpackage;

import j$.time.Instant;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class gqe implements Callable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ gqe(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v25, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object, java.util.Collection] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        long epochMilli;
        jkj k;
        int i = this.b;
        if (i == 0) {
            hfk hfkVar = new hfk();
            Object obj = this.a;
            try {
                Iterator it = ((gqh) obj).a().f.iterator();
                while (it.hasNext()) {
                    hfkVar.c(frv.a(((Integer) it.next()).intValue()));
                }
                return hfkVar.g();
            } catch (IOException e) {
                ((gqh) obj).g(e);
                return hfkVar.g();
            }
        }
        boolean z = false;
        boolean z2 = true;
        z2 = true;
        z2 = true;
        if (i == 1) {
            ?? r9 = this.a;
            iwq iwqVar = gjw.m;
            if (!(r9 instanceof Collection) || !r9.isEmpty()) {
                ListIterator listIterator = ((kpt) r9).listIterator(0);
                while (listIterator.hasNext()) {
                    Object aR = hnu.aR((hvi) listIterator.next());
                    aR.getClass();
                    if (!((Boolean) aR).booleanValue()) {
                        break;
                    }
                }
            }
            z = true;
            return Boolean.valueOf(z);
        }
        if (i != 2) {
            if (i == 3) {
                return this.a.keySet();
            }
            if (i != 4) {
                Object obj2 = this.a;
                if (i != 5) {
                    return ((ikx) obj2).b();
                }
                return cqw.a.a(((jeb) obj2).g);
            }
            idg idgVar = (idg) this.a;
            return idgVar.e.b(idgVar.d, (String) idgVar.h.a, idgVar.f);
        }
        Object obj3 = this.a;
        gqh gqhVar = (gqh) obj3;
        gqhVar.b.writeLock().lock();
        try {
            if (((gqh) obj3).d.get()) {
                obj3 = Long.valueOf(((gqh) obj3).e);
            } else {
                try {
                    gsa a = ((gqh) obj3).a();
                    epochMilli = a.c;
                    k = a.C();
                } catch (IOException e2) {
                    ((gqh) obj3).g(e2);
                    epochMilli = Instant.now().toEpochMilli();
                    k = gsa.a.k();
                }
                if (epochMilli > 0) {
                    ((gqh) obj3).e = epochMilli;
                    ((gqh) obj3).d.set(true);
                    obj3 = Long.valueOf(((gqh) obj3).e);
                } else {
                    long epochMilli2 = Instant.now().toEpochMilli();
                    ((gqh) obj3).e = epochMilli2;
                    if (!k.b.M()) {
                        k.t();
                    }
                    gsa gsaVar = (gsa) k.b;
                    gsaVar.b |= 1;
                    gsaVar.c = epochMilli2;
                    try {
                        try {
                            ((gqh) obj3).f((gsa) k.q());
                            ((gqh) obj3).d.set(true);
                        } catch (Throwable th) {
                            ((gqh) obj3).d.set(z2);
                            throw th;
                        }
                    } catch (IOException e3) {
                        ((hkf) ((hkf) ((hkf) gqh.a.g()).h(e3)).i("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "getSyncEpoch", 124, "SyncManagerDataStore.java")).s("Could not write sync epoch. Using current time but future runs may be delayed.");
                        AtomicBoolean atomicBoolean = ((gqh) obj3).d;
                        atomicBoolean.set(false);
                        z2 = atomicBoolean;
                    }
                    obj3 = Long.valueOf(((gqh) obj3).e);
                }
            }
            return obj3;
        } finally {
            gqhVar.b.writeLock().unlock();
        }
    }
}
