package defpackage;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.os.Trace;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.work.impl.WorkDatabase;
import j$.time.Instant;
import java.util.IdentityHashMap;
import java.util.ListIterator;
import java.util.concurrent.Future;
import java.util.logging.Level;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fv implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public fv(View view, brn brnVar, yx yxVar, ValueAnimator valueAnimator, int i) {
        this.e = i;
        this.a = view;
        this.b = brnVar;
        this.c = yxVar;
        this.d = valueAnimator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.MenuItem, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v15, types: [dqy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25, types: [gel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kri] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, kmh] */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r9v17, types: [gdn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.lang.Object, java.util.List] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                Object obj = this.a;
                if (obj != null) {
                    fx fxVar = ((fw) this.d).a;
                    fxVar.f = true;
                    ((gd) ((evt) obj).c).i(false);
                    fxVar.f = false;
                }
                ?? r0 = this.b;
                if (r0.isEnabled() && r0.hasSubMenu()) {
                    ((gd) this.c).z(r0, null, 4);
                    return;
                }
                return;
            case 1:
                Object obj2 = this.d;
                Object obj3 = this.b;
                Object obj4 = this.c;
                bd bdVar = (bd) this.a;
                bdVar.R = bdVar.I((LayoutInflater) obj4, (ViewGroup) obj3, (Bundle) obj2);
                return;
            case 2:
                zc.f((View) this.a, (brn) this.b, (yx) this.c);
                ((ValueAnimator) this.d).start();
                return;
            case 3:
                Object obj5 = this.c;
                ?? r1 = this.b;
                Object obj6 = this.a;
                Object obj7 = this.d;
                boolean g = yk.g();
                if (g) {
                    try {
                        yk.f((String) obj5);
                    } finally {
                    }
                }
                try {
                    r1.a();
                    asu asuVar = asv.a;
                    ((afc) obj6).k(asuVar);
                    ((rm) obj7).c(asuVar);
                } catch (Throwable th) {
                    ((afc) obj6).k(new ass(th));
                    ((rm) obj7).d(th);
                }
                if (g) {
                    Trace.endSection();
                    return;
                }
                return;
            case 4:
                Object obj8 = this.a;
                int i = aub.a;
                WorkDatabase workDatabase = (WorkDatabase) obj8;
                axu C = workDatabase.C();
                String str = ((axl) this.c).a;
                if (C.u(str)) {
                    return;
                }
                ?? r12 = this.b;
                ListIterator listIterator = ((kpt) r12).listIterator(0);
                while (listIterator.hasNext()) {
                    ((atz) listIterator.next()).b(str);
                }
                aub.a((arv) this.d, workDatabase, r12);
                return;
            case 5:
                this.d.f((dja) this.a);
                Object obj9 = this.c;
                if (obj9 != null) {
                    ((fwm) obj9).t("TIMEOUT", (String) this.b);
                    return;
                }
                return;
            case 6:
                this.b.execute(new ajx(this.a, this.c, this.d, 20, (short[]) null));
                return;
            case 7:
                ((hkf) ((hkf) etj.a.a((Level) this.c).h((Throwable) this.a)).i("com/google/android/libraries/phenotype/client/Phlogger", "logInternal", 44, "Phlogger.java")).y((String) this.d, (Object[]) this.b);
                return;
            case 8:
                Object obj10 = ((gpj) this.b).b;
                final geh gehVar = (geh) this.a;
                ((ger) obj10).a(this.d, new gev() { // from class: gdq
                    @Override // defpackage.gev
                    public final int a(Instant instant, gdm gdmVar, boolean z) {
                        if (gdmVar.d() && gdmVar.e()) {
                            if (!gdmVar.b().isBefore(instant.minus(geh.this.k))) {
                                return 2;
                            }
                        }
                        if (z || !gdmVar.d()) {
                            return gdmVar.d() ? 3 : 1;
                        }
                        return 2;
                    }
                }, this.c);
                return;
            case 9:
                jed jedVar = (jed) this.c;
                iyh iyhVar = (iyh) jedVar.a;
                iyhVar.b = this.d;
                Object obj11 = new iyi(iyhVar).a;
                Object obj12 = "NA";
                if (obj11 != null) {
                    Object obj13 = ((jdd) obj11).e;
                    if (!hoq.S((String) obj13)) {
                        oy.at(obj13);
                        obj12 = obj13;
                    }
                }
                Object obj14 = this.b;
                Object obj15 = this.a;
                jdc jdcVar = new jdc();
                jeb jebVar = (jeb) obj15;
                jdcVar.a = jebVar.a;
                jdcVar.b = jebVar.b;
                jdcVar.e = jeb.a();
                jdcVar.h = true;
                jdcVar.d = (String) obj12;
                jdcVar.c = (String) obj14;
                ddi ddiVar = jebVar.f;
                jdcVar.f = ddiVar.f() ? (String) ddiVar.d() : jebVar.d.b();
                Integer num = 10;
                num.getClass();
                jdcVar.j = num;
                jdcVar.k = Integer.valueOf(jebVar.h);
                jedVar.b = jdcVar;
                jebVar.c.a(jedVar);
                return;
            case 10:
                ?? r02 = this.c;
                Object obj16 = this.d;
                Object obj17 = this.a;
                int size = r02.size();
                for (int i2 = 0; i2 < size; i2++) {
                    kde kdeVar = (kde) r02.get(i2);
                    synchronized (kdeVar) {
                        kdeVar.f((kbq) obj16, (kbq) obj16, false);
                    }
                }
                ?? r9 = this.b;
                int size2 = r9.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ((Future) r9.get(i3)).cancel(false);
                }
                synchronized (obj17) {
                    ((kcs) obj17).d();
                }
                kcs kcsVar = (kcs) obj17;
                kcsVar.f.b(kcsVar.g);
                return;
            case 11:
                ((kel) this.c).d((kbq) this.a, (kfh) this.b, (kaa) this.d);
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ((kgg) this.b).a.a((kbq) this.a, (kfh) this.c, (kaa) this.d);
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                kky kkyVar = (kky) this.b;
                kkyVar.A = true;
                kkyVar.w.a((kbq) this.a, (kfh) this.c, (kaa) this.d);
                return;
            default:
                Object obj18 = this.c;
                synchronized (obj18) {
                    if (((kmg) this.d).b != 0) {
                        return;
                    }
                    IdentityHashMap identityHashMap = ((kmi) obj18).a;
                    ?? r3 = this.a;
                    identityHashMap.remove(r3);
                    if (identityHashMap.isEmpty()) {
                        ((kmi) obj18).b.shutdown();
                        ((kmi) obj18).b = null;
                    }
                    r3.b(this.b);
                    return;
                }
        }
    }

    public /* synthetic */ fv(dqy dqyVar, drx drxVar, fwm fwmVar, String str, int i) {
        this.e = i;
        this.d = dqyVar;
        this.a = drxVar;
        this.c = fwmVar;
        this.b = str;
    }

    public fv(fw fwVar, evt evtVar, MenuItem menuItem, gd gdVar, int i) {
        this.e = i;
        this.d = fwVar;
        this.a = evtVar;
        this.b = menuItem;
        this.c = gdVar;
    }

    public /* synthetic */ fv(gpj gpjVar, gdn gdnVar, geh gehVar, gel gelVar, int i) {
        this.e = i;
        this.b = gpjVar;
        this.d = gdnVar;
        this.a = gehVar;
        this.c = gelVar;
    }

    public /* synthetic */ fv(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.e = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
        this.d = obj4;
    }

    public /* synthetic */ fv(Object obj, Object obj2, Object obj3, Object obj4, int i, byte[] bArr) {
        this.e = i;
        this.a = obj;
        this.c = obj2;
        this.d = obj3;
        this.b = obj4;
    }

    public fv(Object obj, kbq kbqVar, kfh kfhVar, kaa kaaVar, int i) {
        this.e = i;
        this.a = kbqVar;
        this.c = kfhVar;
        this.d = kaaVar;
        this.b = obj;
    }

    public /* synthetic */ fv(String str, kri kriVar, afc afcVar, rm rmVar, int i) {
        this.e = i;
        this.c = str;
        this.b = kriVar;
        this.a = afcVar;
        this.d = rmVar;
    }

    public /* synthetic */ fv(Level level, Throwable th, String str, Object[] objArr, int i) {
        this.e = i;
        this.c = level;
        this.a = th;
        this.d = str;
        this.b = objArr;
    }

    public fv(kel kelVar, kbq kbqVar, kfh kfhVar, kaa kaaVar, int i) {
        this.e = i;
        this.a = kbqVar;
        this.b = kfhVar;
        this.d = kaaVar;
        this.c = kelVar;
    }

    public fv(kmi kmiVar, kmg kmgVar, kmh kmhVar, Object obj, int i) {
        this.e = i;
        this.d = kmgVar;
        this.a = kmhVar;
        this.b = obj;
        this.c = kmiVar;
    }
}
