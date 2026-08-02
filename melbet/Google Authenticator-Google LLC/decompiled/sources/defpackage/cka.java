package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.SystemClock;
import j$.util.Map;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cka {
    private static volatile cka b;
    public final Object a;

    public cka(frv frvVar, fwm fwmVar, fwm fwmVar2, gzp gzpVar) {
        this.a = new gbc(new fca(fwmVar, frvVar, fwmVar2, gzpVar, 6), huf.a);
    }

    public static cka a() {
        if (b == null) {
            synchronized (cka.class) {
                if (b == null) {
                    b = new cka();
                }
            }
        }
        return b;
    }

    public static final void g(boolean z) {
        if (z) {
            return;
        }
        dih.e(new IllegalStateException());
    }

    public static final bqd h(int i) {
        jkj k = hre.a.k();
        if (!k.b.M()) {
            k.t();
        }
        hre hreVar = (hre) k.b;
        hreVar.b |= 8;
        hreVar.d = i;
        return new bqd(new cfe(k));
    }

    public static boolean k(eet eetVar) {
        return eetVar.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final gut l(String str) {
        gtd gtdVar = new gtd(0);
        gua b2 = guc.b();
        b2.a(gul.c, gtdVar);
        return hoq.aB(220, str, ((guc) b2).f(), true);
    }

    public static cka q(aer aerVar, agl aglVar) {
        gmx gmxVar = (gmx) new agj(aglVar.O(), new agw(2)).a(gmx.class);
        if (Map.EL.putIfAbsent(gmxVar.a, aerVar, new qk(0)) == null) {
            aerVar.L().a(gmxVar);
            if (!gmxVar.b) {
                gmxVar.b = true;
                gmxVar.c = aerVar;
            }
        }
        return new cka(gmxVar);
    }

    public final ApplicationInfo b(String str, int i) {
        return ((Context) this.a).getPackageManager().getApplicationInfo(str, i);
    }

    public final PackageInfo c(String str, int i) {
        return ((Context) this.a).getPackageManager().getPackageInfo(str, i);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Set] */
    public final void d(Object obj) {
        ?? r7 = this.a;
        if (r7.isEmpty()) {
            return;
        }
        Iterator it = r7.iterator();
        while (it.hasNext()) {
            Object obj2 = ((kee) it.next()).a;
            long c = dih.c();
            if (c != -1) {
                jkl jklVar = ((dks) obj).c;
                long j = c * 1000;
                if (!jklVar.b.M()) {
                    jklVar.t();
                }
                dkx dkxVar = (dkx) jklVar.b;
                dkx dkxVar2 = dkx.a;
                dkxVar.b |= 4;
                dkxVar.f = j;
            }
            dks dksVar = (dks) obj;
            dla dlaVar = dksVar.b;
            if (dlaVar instanceof dla) {
                if (!dksVar.c.an(dmc.a)) {
                    dlaVar.j(false);
                } else if (!dlaVar.h()) {
                    dlaVar.j(true);
                }
            }
            dlk dlkVar = (dlk) obj2;
            dln dlnVar = dlkVar.c;
            jkl jklVar2 = dksVar.c;
            dla dlaVar2 = dksVar.b;
            hre hreVar = ((dkx) jklVar2.b).d;
            if (hreVar == null) {
                hreVar = hre.a;
            }
            if ((hreVar.b & 2048) != 0) {
                int k = dlaVar2.k();
                int A = a.A(((dkx) jklVar2.b).e);
                if ((A != 0 ? A : 1) != k && dlnVar.d(dksVar, k)) {
                }
            } else {
                dlnVar.a.add(obj);
            }
            dlkVar.b();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    public final void e(Object obj) {
        ?? r1 = this.a;
        if (r1.isEmpty()) {
            return;
        }
        for (kee keeVar : r1) {
            ((dks) obj).e();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    public final boolean f() {
        return !this.a.isEmpty();
    }

    public final hvi i(egj egjVar, String str, int i) {
        gwu g = gwu.g(egjVar.a(((jdd) this.a).a(new Account(str, "com.google")), new dog(), dih.O(i)));
        drv drvVar = new drv(9);
        huf hufVar = huf.a;
        gwu h = g.d(doh.class, drvVar, hufVar).e(cmm.class, new bwu(15), hufVar).e(IOException.class, new bwu(16), hufVar).h(new drv(10), hufVar);
        hoq.av(h, new dkp(3), hufVar);
        return h;
    }

    public final Bitmap j(eet eetVar, int i) {
        hoq.y(i >= 0, "Size must be bigger or equal to 0");
        hoq.y(k(eetVar), "handles(key) must be true");
        ArrayList arrayList = new ArrayList();
        String str = eetVar.b;
        if (str != null) {
            arrayList.add(str);
        }
        if (i == 0) {
            i = 120;
        }
        String str2 = eetVar.a;
        arrayList.add(str2);
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        fel felVar = new fel(new fen(((Context) this.a).getApplicationContext(), new hug()));
        int[] iArr = fek.a;
        fel felVar2 = new fel(felVar);
        exj exjVar = feo.a;
        felVar2.b(null);
        fel.a(null);
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        int a = fel.a(str2);
        CharSequence b2 = felVar2.b(new kee(strArr, null));
        Canvas canvas = new Canvas(createBitmap);
        int height = createBitmap.getHeight();
        int width = createBitmap.getWidth();
        exj exjVar2 = feo.a;
        Paint paint = (Paint) exjVar2.a();
        synchronized (exjVar2) {
            paint.setColor(a);
            int height2 = canvas.getHeight();
            int width2 = canvas.getWidth();
            canvas.drawCircle(width2 / 2, height2 / 2, Math.min(width2, height2) / 2, paint);
            if (b2 != null) {
                paint.setColor(-1);
                paint.setTextSize(Math.min(height, width) * 0.47f);
                String charSequence = b2.toString();
                int length = b2.length();
                Rect rect = feo.b;
                paint.getTextBounds(charSequence, 0, length, rect);
                canvas.drawText(b2, 0, b2.length(), width / 2, (height / 2) - rect.exactCenterY(), paint);
            }
        }
        return createBitmap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.concurrent.Executor, java.util.concurrent.ScheduledExecutorService] */
    public final hvi m(htq htqVar, hfm hfmVar) {
        ?? r3;
        int i;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashSet<grm> hashSet = new HashSet();
        Iterator it = hfmVar.iterator();
        while (true) {
            r3 = this.a;
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            grn grnVar = (grn) it.next();
            grnVar.getClass();
            hvi as = hoq.as(gvx.b(new fxs(grnVar, 17)), r3);
            gaj.d(209, as, "Future Monitor failed", new Object[0]);
            hashSet.add(new grm(grnVar, as));
        }
        htq b2 = gvx.b(htqVar);
        huf hufVar = huf.a;
        hvi as2 = hoq.as(b2, hufVar);
        hvi bL = hnu.bL(as2, gvx.i(new grl(elapsedRealtime, i)), hufVar);
        HashSet hashSet2 = new HashSet();
        for (grm grmVar : hashSet) {
            hvi t = hoq.aV(grmVar.b, bL, as2).t(new cap(grmVar, bL, as2, 19), r3);
            gaj.d(208, t, "Future Monitor failed", new Object[0]);
            hashSet2.add(t);
        }
        return hoq.aV(as2, hnu.aQ(hnu.aK(hnu.aV(hashSet2).a(gvx.i(new bws(18)), hufVar)), 10L, TimeUnit.SECONDS, r3)).t(gvx.b(new fxs(as2, 16)), hufVar);
    }

    public final Object n(int i, aer aerVar, gmw gmwVar, gmv gmvVar) {
        return ((gmx) this.a).g(i, aerVar, gmwVar, gmvVar);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [agl, java.lang.Object] */
    public final agj o(frv frvVar) {
        return new agj((agl) this.a, new gml(this, frvVar));
    }

    public final Object p(frv frvVar) {
        return hnu.br(frvVar, (bd) this.a).a.C();
    }

    public cka(hvm hvmVar) {
        this.a = hvmVar;
    }

    public cka(Object obj) {
        this.a = obj;
    }

    public cka(byte[] bArr) {
        this.a = "";
    }

    private cka() {
        this.a = new CopyOnWriteArrayList();
    }

    public cka(cka ckaVar) {
        this.a = new dlb(ckaVar);
    }

    public cka(gva gvaVar) {
        gvaVar.getClass();
        this.a = gvaVar;
    }
}
