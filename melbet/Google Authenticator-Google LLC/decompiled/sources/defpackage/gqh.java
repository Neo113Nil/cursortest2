package defpackage;

import android.content.Context;
import j$.time.Instant;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gqh {
    public static final hkh a = hkh.l("com/google/apps/tiktok/sync/impl/SyncManagerDataStore");
    public final hvl c;
    private final Context f;
    private final fwm g;
    public final ReentrantReadWriteLock b = new ReentrantReadWriteLock();
    public final AtomicBoolean d = new AtomicBoolean(false);
    public long e = -1;

    public gqh(Context context, hvl hvlVar, fwm fwmVar) {
        this.g = fwmVar;
        this.f = context;
        this.c = hvlVar;
    }

    static File e(Context context) {
        return new File(context.getFilesDir(), "103795117_".concat(String.valueOf(eos.I().replaceAll("[^A-Za-z0-9\\-_:]", "_"))));
    }

    public final gsa a() {
        Context context = this.f;
        File e = e(context);
        this.b.readLock().lock();
        try {
            if (!e.exists() && this.g.l()) {
                try {
                    File file = new File(context.getFilesDir().getPath(), "103795117");
                    if (file.exists()) {
                        if (!e(context).exists()) {
                            if (!file.renameTo(e(context))) {
                                ((hkf) ((hkf) a.g()).i("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "tryMigrateToPerProcessDatabase", 199, "SyncManagerDataStore.java")).s("Failed to rename old sync database file.");
                            }
                        }
                        if (!file.delete()) {
                            ((hkf) ((hkf) a.f()).i("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "tryMigrateToPerProcessDatabase", 205, "SyncManagerDataStore.java")).s("Unable to delete old Sync database file.");
                        }
                    }
                } catch (RuntimeException e2) {
                    ((hkf) ((hkf) ((hkf) a.f()).h(e2)).i("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "tryMigrateToPerProcessDatabase", (char) 210, "SyncManagerDataStore.java")).s("Error while migrating Sync datastore file.");
                }
            }
            gsa gsaVar = null;
            FileInputStream fileInputStream = null;
            if (e.exists()) {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(e);
                    try {
                        gsaVar = (gsa) gsa.q(gsa.a, fileInputStream2);
                        a.r(fileInputStream2);
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        a.r(fileInputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            return gsaVar == null ? gsa.a : gsaVar;
        } finally {
            this.b.readLock().unlock();
        }
    }

    public final hvi b() {
        return hti.f(c(), gvx.a(new gia(this, 18)), this.c);
    }

    final hvi c() {
        return this.d.get() ? hnu.aJ(Long.valueOf(this.e)) : this.c.submit(gvx.i(new gqe(this, 2)));
    }

    final hvi d(final gqs gqsVar, final long j, final boolean z) {
        return this.c.submit(new Callable() { // from class: gqf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                gqs gqsVar2;
                gqh gqhVar = gqh.this;
                gqhVar.b.writeLock().lock();
                long j2 = j;
                try {
                    gsa gsaVar = gsa.a;
                    try {
                        gsaVar = gqhVar.a();
                    } catch (IOException e) {
                        if (!gqhVar.g(e)) {
                            ((hkf) ((hkf) ((hkf) gqh.a.f()).h(e)).i("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "updateLastSyncTime", 324, "SyncManagerDataStore.java")).s("Unable to read or clear store, will not update sync time. Sync may run too frequently.");
                        }
                    }
                    jkj k = gsa.a.k();
                    k.w(gsaVar);
                    if (!k.b.M()) {
                        k.t();
                    }
                    ((gsa) k.b).d = jlu.a;
                    Iterator it = gsaVar.d.iterator();
                    grz grzVar = null;
                    while (true) {
                        boolean hasNext = it.hasNext();
                        gqsVar2 = gqsVar;
                        if (!hasNext) {
                            break;
                        }
                        grz grzVar2 = (grz) it.next();
                        gsc gscVar = grzVar2.c;
                        if (gscVar == null) {
                            gscVar = gsc.a;
                        }
                        if (gqsVar2.equals(new gqs(gscVar))) {
                            grzVar = grzVar2;
                        } else {
                            k.D(grzVar2);
                        }
                    }
                    if (grzVar != null) {
                        if (gsaVar.c < 0) {
                            long j3 = gqhVar.e;
                            if (j3 < 0) {
                                j3 = Instant.now().toEpochMilli();
                                gqhVar.e = j3;
                            }
                            if (!k.b.M()) {
                                k.t();
                            }
                            gsa gsaVar2 = (gsa) k.b;
                            gsaVar2.b |= 1;
                            gsaVar2.c = j3;
                        }
                        jkj k2 = grz.a.k();
                        gsc gscVar2 = gqsVar2.a;
                        if (!k2.b.M()) {
                            k2.t();
                        }
                        jkp jkpVar = k2.b;
                        grz grzVar3 = (grz) jkpVar;
                        gscVar2.getClass();
                        grzVar3.c = gscVar2;
                        grzVar3.b |= 1;
                        if (!jkpVar.M()) {
                            k2.t();
                        }
                        jkp jkpVar2 = k2.b;
                        grz grzVar4 = (grz) jkpVar2;
                        grzVar4.b |= 4;
                        grzVar4.e = j2;
                        if (z) {
                            if (!jkpVar2.M()) {
                                k2.t();
                            }
                            jkp jkpVar3 = k2.b;
                            grz grzVar5 = (grz) jkpVar3;
                            grzVar5.b |= 2;
                            grzVar5.d = j2;
                            if (!jkpVar3.M()) {
                                k2.t();
                            }
                            grz grzVar6 = (grz) k2.b;
                            grzVar6.b |= 8;
                            grzVar6.f = 0;
                        } else {
                            long j4 = grzVar.d;
                            if (!jkpVar2.M()) {
                                k2.t();
                            }
                            jkp jkpVar4 = k2.b;
                            grz grzVar7 = (grz) jkpVar4;
                            grzVar7.b |= 2;
                            grzVar7.d = j4;
                            int i = grzVar.f + 1;
                            if (!jkpVar4.M()) {
                                k2.t();
                            }
                            grz grzVar8 = (grz) k2.b;
                            grzVar8.b |= 8;
                            grzVar8.f = i;
                        }
                        k.D((grz) k2.q());
                        try {
                            gqhVar.f((gsa) k.q());
                        } catch (IOException e2) {
                            ((hkf) ((hkf) ((hkf) gqh.a.f()).h(e2)).i("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "updateLastSyncTime", 384, "SyncManagerDataStore.java")).s("Error writing sync data file after sync. Sync may run too frequently.");
                        }
                    }
                    return null;
                } finally {
                    gqhVar.b.writeLock().unlock();
                }
            }
        });
    }

    public final void f(gsa gsaVar) {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(e(this.f));
            try {
                int c = gsaVar.c(null);
                jjy jjyVar = new jjy(fileOutputStream2, jjz.L(((352 - (Integer.numberOfLeadingZeros(c) * 9)) >>> 6) + c));
                jjyVar.v(c);
                gsaVar.K(jjyVar);
                jjyVar.c();
                fileOutputStream2.close();
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [gqh] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock] */
    public final boolean g(Throwable th) {
        ((hkf) ((hkf) ((hkf) a.g()).h(th)).i("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "clearStore", (char) 577, "SyncManagerDataStore.java")).s("Could not read sync datastore. There was probably a write error. Wiping store.");
        this.b.writeLock().lock();
        try {
            boolean z = false;
            this.d.set(false);
            long j = this.e;
            if (j <= 0) {
                j = Instant.now().toEpochMilli();
            }
            jkj k = gsa.a.k();
            if (!k.b.M()) {
                k.t();
            }
            gsa gsaVar = (gsa) k.b;
            gsaVar.b |= 1;
            gsaVar.c = j;
            try {
                try {
                    f((gsa) k.q());
                    this.d.set(true);
                    z = true;
                } catch (IOException e) {
                    ((hkf) ((hkf) ((hkf) a.f()).h(e)).i("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "clearStore", 597, "SyncManagerDataStore.java")).s("Could not write to datastore to clear store.");
                    this.d.set(false);
                }
                return z;
            } finally {
            }
        } finally {
            this.b.writeLock().unlock();
        }
    }
}
