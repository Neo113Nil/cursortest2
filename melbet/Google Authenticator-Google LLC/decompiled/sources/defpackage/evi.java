package defpackage;

import android.content.pm.ApplicationInfo;
import android.os.StrictMode;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class evi {
    public static final evh a = new evh();
    static final evd b = new evd(new esh(4), false, hjb.a);
    public final etd c;
    public final String d;
    public final String e;
    public final boolean f;
    public final bst g;
    private final hfm h;
    private final ewc i;
    private volatile iwq j;

    public evi(etd etdVar, evd evdVar) {
        this.c = etdVar;
        String a2 = evdVar.a(etdVar.c);
        this.d = a2;
        this.e = "";
        boolean z = evdVar.a;
        this.f = z;
        boolean z2 = evdVar.b;
        this.h = evdVar.c;
        this.j = null;
        this.g = new bst((byte[]) null, (byte[]) null);
        this.i = new ewc(etdVar, a2, "", z);
    }

    public final void a() {
        ewc ewcVar = this.i;
        hvi a2 = ewcVar.a(this.e);
        doj dojVar = new doj(ewcVar, 4);
        etd etdVar = this.c;
        hti.g(a2, dojVar, etdVar.d()).c(new evb(this, a2, 0), etdVar.d());
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, java.util.Map] */
    public final /* synthetic */ void b(hvi hviVar) {
        evt evtVar;
        try {
            iwq iwqVar = new iwq((ewd) hnu.aR(hviVar), new ewb(6, 2, false));
            iwq iwqVar2 = this.j;
            if (iwqVar2 == null) {
                synchronized (this) {
                    iwqVar2 = this.j;
                    if (iwqVar2 == null) {
                        this.j = iwqVar;
                        ((AtomicInteger) this.g.a).incrementAndGet();
                        return;
                    }
                }
            }
            if (hnu.B(iwqVar2.d, iwqVar.d) || (evtVar = (evt) this.c.d.bB()) == null) {
                return;
            }
            evtVar.a();
        } catch (CancellationException | ExecutionException e) {
            if (e.getCause() instanceof SecurityException) {
                return;
            }
            Log.w("FlagStore", "Unable to update local snapshot for " + this.d + ", may result in stale flags.", e);
        }
    }

    public final void c() {
        hvi a2;
        iwq d = d();
        Object obj = d.c;
        etd etdVar = this.c;
        evx c = etdVar.f.c(this.f);
        int i = 4;
        if (c.e) {
            String str = (String) obj;
            if (hoq.S(str) && !c.d) {
                hvi hviVar = hve.a;
                return;
            }
            jkj k = etm.a.k();
            Object obj2 = d.a;
            jkj k2 = etl.a.k();
            if (!k2.b.M()) {
                k2.t();
            }
            ewb ewbVar = (ewb) obj2;
            int i2 = ewbVar.b;
            jkp jkpVar = k2.b;
            etl etlVar = (etl) jkpVar;
            etlVar.c = i2 - 2;
            etlVar.b |= 1;
            int i3 = ewbVar.c;
            if (!jkpVar.M()) {
                k2.t();
            }
            etl etlVar2 = (etl) k2.b;
            etlVar2.d = eos.M(i3);
            etlVar2.b |= 2;
            etl etlVar3 = (etl) k2.q();
            if (!k.b.M()) {
                k.t();
            }
            jkp jkpVar2 = k.b;
            etm etmVar = (etm) jkpVar2;
            etlVar3.getClass();
            etmVar.d = etlVar3;
            etmVar.b |= 2;
            if (!hoq.S(str)) {
                if (!jkpVar2.M()) {
                    k.t();
                }
                etm etmVar2 = (etm) k.b;
                obj.getClass();
                etmVar2.b |= 1;
                etmVar2.c = str;
            }
            if (c.d) {
                String str2 = this.d;
                if (!k.b.M()) {
                    k.t();
                }
                etm etmVar3 = (etm) k.b;
                str2.getClass();
                etmVar3.b |= 4;
                etmVar3.e = str2;
            }
            a2 = etdVar.b().b((etm) k.q());
        } else {
            String str3 = (String) obj;
            if (hoq.S(str3)) {
                hvi hviVar2 = hve.a;
                return;
            }
            a2 = etdVar.b().a(str3);
        }
        hso.g(a2, etq.class, new egl(this, d, i), etdVar.d());
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x02c0, code lost:
    
        if (r0.o == false) goto L98;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final iwq d() {
        iwq iwqVar;
        ewa ewaVar;
        File file;
        FileInputStream fileInputStream;
        ewa ewaVar2;
        iwq iwqVar2;
        iwq iwqVar3 = this.j;
        if (iwqVar3 != null) {
            return iwqVar3;
        }
        synchronized (this) {
            iwqVar = this.j;
            if (iwqVar == null) {
                StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                try {
                    ewc ewcVar = this.i;
                    boolean z = ewcVar.e;
                    int i = 17;
                    int i2 = 16;
                    if (!z && djl.h(ewcVar.a.c)) {
                        iwqVar2 = new iwq(ewd.a, new ewb(3, 17, false));
                    } else if (etb.d()) {
                        iwqVar2 = new iwq(ewd.a, new ewb(3, 18, false));
                    } else {
                        etd etdVar = ewcVar.a;
                        evx c = etdVar.f.c(z);
                        iac iacVar = iac.FILE;
                        String str = ewcVar.c;
                        int a2 = c.a(iacVar, etb.c(str));
                        if (a2 != 0) {
                            ewaVar = new ewa(null, new ewb(a2, true));
                        } else {
                            try {
                                String str2 = c.c;
                                try {
                                    try {
                                        if (str2.isEmpty()) {
                                            gzp gzpVar = (gzp) etdVar.g.bB();
                                            if (!gzpVar.f()) {
                                                eos.N(Level.WARNING, etdVar.d(), null, "Unable to get GMS application info, using defaults.", new Object[0]);
                                                ewaVar2 = new ewa(eub.a, new ewb(3, 7, false));
                                                ewaVar = ewaVar2;
                                            } else if (z) {
                                                int i3 = djl.a;
                                                str2 = ((ApplicationInfo) gzpVar.b()).deviceProtectedDataDir;
                                            } else {
                                                str2 = ((ApplicationInfo) gzpVar.b()).dataDir;
                                            }
                                        }
                                        ewaVar2 = new ewa((!c.f.b || file.length() <= 12288) ? eub.c(jju.L(fileInputStream, 4096), false) : eub.c(jju.L(fileInputStream, 4096), true), new ewb(5, 2, false));
                                        fileInputStream.close();
                                        ewaVar = ewaVar2;
                                    } finally {
                                    }
                                    fileInputStream = new FileInputStream(file);
                                } catch (FileNotFoundException unused) {
                                    eos.N(Level.INFO, ewcVar.a.d(), null, "Shared storage file not found for %s", ewcVar.c);
                                    ewaVar = new ewa(null, new ewb(8, false));
                                } catch (jld e) {
                                    eos.N(Level.SEVERE, ewcVar.a.d(), e, "Failed to parse snapshot from shared storage for %s", ewcVar.c);
                                    ewaVar = new ewa(null, new ewb(9, false));
                                }
                                iyi iyiVar = new iyi(c.a, str, ewcVar.d);
                                file = new File(str2 + File.separator + c.b + File.separator + iyiVar.v().toString());
                            } catch (Exception e2) {
                                eos.N(Level.WARNING, ewcVar.a.d(), e2, "Failed to read shared file for %s", ewcVar.c);
                                ewaVar = new ewa(eub.a, new ewb(3, 10, false));
                            }
                        }
                        eub eubVar = ewaVar.a;
                        if (eubVar != null) {
                            iwqVar2 = new iwq(eubVar, ewaVar.b);
                        } else {
                            ewb ewbVar = ewaVar.b;
                            try {
                                FileInputStream fileInputStream2 = new FileInputStream((String) ewcVar.b.bB());
                                try {
                                    iwq iwqVar4 = new iwq((ewd) jkp.t(ewd.a, fileInputStream2, jkd.a), new ewb(4, ewbVar.c, ewbVar.a));
                                    fileInputStream2.close();
                                    iwqVar2 = iwqVar4;
                                } finally {
                                }
                            } catch (IOException | RuntimeException unused2) {
                                eos.N(Level.INFO, ewcVar.a.d(), null, "Unable to retrieve flag snapshot for %s, using defaults.", ewcVar.c);
                                iwqVar2 = ewbVar.a ? new iwq(ewd.a, new ewb(3, 11, true)) : new iwq(eub.a, new ewb(3, 16, false));
                            }
                        }
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    Object obj = iwqVar2.a;
                    int i4 = ((ewb) obj).c - 2;
                    if (i4 != 15 && i4 != 16) {
                        etd etdVar2 = this.c;
                        etdVar2.f.f();
                        if (iwqVar2.n() && ((String) iwqVar2.c).isEmpty()) {
                            etdVar2.d().execute(new ect(this, i2));
                            iwqVar = new iwq(ewd.a, (ewb) obj);
                            this.j = iwqVar;
                        } else {
                            etdVar2.d().execute(new ect(this, i));
                            etdVar2.i.k((jjq) iwqVar2.b, this.h, "", this.d, false, false);
                            if (!this.e.equals("")) {
                                etdVar2.d().execute(new ect(this, 18));
                            }
                            ewc ewcVar2 = this.i;
                            ewg ewgVar = ewcVar2.a.f;
                            boolean z2 = ewcVar2.e;
                            iac iacVar2 = iac.FILE;
                            if (z2) {
                                euf b2 = ewgVar.b();
                                if (b2.e && new jkv(b2.i, euf.a).contains(iacVar2) && !b2.n) {
                                    etdVar2.d().execute(new ect(this, 19));
                                }
                            } else {
                                eud a3 = ewgVar.a();
                                if (a3.e) {
                                    if (new jkv(a3.j, eud.a).contains(iacVar2)) {
                                    }
                                }
                            }
                            this.j = iwqVar;
                        }
                    }
                    iwqVar = iwqVar2;
                    this.j = iwqVar;
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            }
        }
        return iwqVar;
    }
}
