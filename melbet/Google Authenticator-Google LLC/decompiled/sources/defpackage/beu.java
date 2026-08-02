package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class beu implements bes {
    private final File a;
    private ban b;
    private final brr d = new brr((byte[]) null);
    private final brr c = new brr();

    public beu(File file) {
        this.a = file;
    }

    private final synchronized ban d() {
        ban banVar;
        banVar = this.b;
        if (banVar == null) {
            File file = this.a;
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    ban.f(file2, file3, false);
                }
            }
            ban banVar2 = new ban(file);
            if (banVar2.b.exists()) {
                try {
                    banVar2.d();
                    ban.c(banVar2.c);
                    Iterator it = banVar2.h.values().iterator();
                    while (it.hasNext()) {
                        bam bamVar = (bam) it.next();
                        if (bamVar.f == null) {
                            for (int i = 0; i < banVar2.d; i = 1) {
                                banVar2.f += bamVar.b[0];
                            }
                        } else {
                            bamVar.f = null;
                            for (int i2 = 0; i2 < banVar2.d; i2 = 1) {
                                ban.c(bamVar.c());
                                ban.c(bamVar.d());
                            }
                            it.remove();
                        }
                    }
                } catch (IOException e) {
                    System.out.println("DiskLruCache " + file.toString() + " is corrupt: " + e.getMessage() + ", removing");
                    banVar2.b();
                }
                banVar = banVar2;
                this.b = banVar;
            }
            file.mkdirs();
            banVar2 = new ban(file);
            banVar2.e();
            banVar = banVar2;
            this.b = banVar;
        }
        return banVar;
    }

    private final synchronized void e() {
        this.b = null;
    }

    @Override // defpackage.bes
    public final File a(bbh bbhVar) {
        try {
            bdi k = d().k(this.c.a(bbhVar));
            if (k == null) {
                return null;
            }
            Object obj = k.c;
            if (obj != null) {
                return ((File[]) obj)[0];
            }
            return new File(((ban) k.b).a, ((String) k.a) + ".0");
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    @Override // defpackage.bes
    public final synchronized void b() {
        try {
            try {
                d().b();
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to clear disk cache or disk cache cleared externally", e);
                }
            }
        } finally {
            e();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.concurrent.locks.Lock] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v3, types: [bax, java.lang.Object] */
    @Override // defpackage.bes
    public final void c(bbh bbhVar, bvw bvwVar) {
        ckm ckmVar;
        File d;
        ckm ckmVar2;
        String a = this.c.a(bbhVar);
        brr brrVar = this.d;
        synchronized (brrVar) {
            ckmVar = (ckm) brrVar.a.get(a);
            if (ckmVar == null) {
                ?? r1 = ((brn) brrVar.b).a;
                synchronized (r1) {
                    ckmVar2 = (ckm) r1.poll();
                }
                ckmVar = ckmVar2 == null ? new ckm((byte[]) null) : ckmVar2;
                brrVar.a.put(a, ckmVar);
            }
            ckmVar.a++;
        }
        ckmVar.b.lock();
        try {
            try {
                ban d2 = d();
                if (d2.k(a) == null) {
                    bal i = d2.i(a);
                    if (i == null) {
                        throw new IllegalStateException(a.ah(a, "Had two simultaneous puts for: "));
                    }
                    try {
                        ban banVar = i.d;
                        synchronized (banVar) {
                            bam bamVar = i.a;
                            if (bamVar.f != i) {
                                throw new IllegalStateException();
                            }
                            if (!bamVar.e) {
                                i.b[0] = true;
                            }
                            d = bamVar.d();
                            banVar.a.mkdirs();
                        }
                        if (bvwVar.b.a(bvwVar.a, d, (bbl) bvwVar.c)) {
                            banVar.a(i, true);
                            i.c = true;
                        }
                    } finally {
                        i.b();
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
        } finally {
            this.d.b(a);
        }
    }
}
