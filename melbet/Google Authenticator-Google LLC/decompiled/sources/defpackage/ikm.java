package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.SystemClock;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.FilenameFilter;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ikm {
    public final Object a;
    public final Object b;

    public ikm(Context context) {
        this.a = new AtomicLong(-1L);
        this.b = new crv(context, new crh("mlkit:vision"));
    }

    public static String j(int i, String str) {
        return i + "." + str;
    }

    public static String k(frv frvVar, String str) {
        return j(frvVar.a, str);
    }

    public final synchronized void a(int i, long j, long j2) {
        Object obj = this.a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((AtomicLong) obj).get() != -1) {
            long j3 = elapsedRealtime - ((AtomicLong) obj).get();
            TimeUnit timeUnit = TimeUnit.MINUTES;
            if (j3 <= 1800000) {
                return;
            }
        }
        ((crv) this.b).a(new crg(0, Arrays.asList(new cqy(24323, i, 0, j, j2, null, null, 0, -1)))).m(new jec(this, elapsedRealtime, 0));
    }

    public final kqn b(ScheduledExecutorService scheduledExecutorService) {
        kqn plus;
        if (((Boolean) ((gzp) this.b).d(true)).booleanValue() && ((Boolean) ((gzp) this.a).d(false)).booleanValue()) {
            plus = new kwn(new gdk(scheduledExecutorService)).plus(gdj.a);
        } else {
            gdh gdhVar = new gdh(scheduledExecutorService);
            plus = new kwn(gdhVar).plus(gdhVar);
        }
        return plus.plus(new gwe(new hoq(), false));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [hvl, java.lang.Object] */
    public final hvi c(File file) {
        return this.a.submit(gvx.i(new avc(file, 18)));
    }

    public final hel d(final hfm hfmVar, final hfm hfmVar2, final boolean z) {
        boolean z2 = true;
        if ((hfmVar != null || hfmVar2 == null) && (hfmVar == null || hfmVar2 != null)) {
            z2 = false;
        }
        hoq.x(z2);
        int i = hel.d;
        heg hegVar = new heg(4);
        hjr it = ((gpj) this.b).a().iterator();
        while (it.hasNext()) {
            File[] listFiles = new File((File) it.next(), "accounts").listFiles(new FilenameFilter() { // from class: fxj
                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str) {
                    File file2 = new File(file, str);
                    try {
                        Integer valueOf = Integer.valueOf(str);
                        if (valueOf.intValue() < 0) {
                            return false;
                        }
                        hfm hfmVar3 = hfm.this;
                        if (hfmVar3 != null && hfmVar3.contains(valueOf)) {
                            return false;
                        }
                        hfm hfmVar4 = hfmVar;
                        if ((hfmVar4 != null && !hfmVar4.contains(valueOf)) || !file2.isDirectory()) {
                            return false;
                        }
                        if (z) {
                            return file2.canWrite();
                        }
                        return true;
                    } catch (NumberFormatException unused) {
                        return false;
                    }
                }
            });
            if (listFiles != null) {
                hegVar.i(listFiles);
            }
        }
        return hegVar.g();
    }

    public final hel e(boolean z) {
        return d(null, hjb.a, z);
    }

    public final hvi f(hel helVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < ((his) helVar).c; i++) {
            arrayList.add(((ikm) this.a).c((File) helVar.get(i)));
        }
        return hnu.aV(arrayList).a(new avc(arrayList, 17), huf.a);
    }

    public final Uri g() {
        iyi iyiVar = (iyi) this.a;
        iyiVar.d().getParentFile().mkdirs();
        Object obj = iyiVar.a;
        return ((gpj) iyiVar.b).c((gpk) iyiVar.c, (String) obj);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final int h() {
        return this.a.getInt("count", 0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final String i(frv frvVar, String str) {
        return this.a.getString(k(frvVar, str), null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final boolean l(frv frvVar, String str) {
        return this.a.getBoolean(k(frvVar, str), false);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, koe] */
    public final fcu m(gpm gpmVar, iyi iyiVar) {
        Executor executor = gpmVar.f;
        if (executor == null) {
            executor = (Executor) this.a.b();
        }
        Executor executor2 = executor;
        Object obj = this.b;
        executor2.getClass();
        hvi ar = hoq.ar(new bsp(gpmVar, obj, 18, null), executor2);
        fcu s = exf.s(gpmVar.a, ar, gpmVar.b, jkd.a(), executor2, gpmVar.e, iyiVar);
        hel helVar = gpmVar.d;
        if (!helVar.isEmpty()) {
            s.c(new fci(helVar, executor2));
        }
        return s;
    }

    public ikm(Object obj, Object obj2, byte[] bArr) {
        this.a = obj;
        this.b = obj2;
    }

    public ikm(Object obj, Object obj2, char[] cArr) {
        this.b = obj;
        this.a = obj2;
    }

    public ikm(Object obj, Object obj2, short[] sArr) {
        this.b = obj;
        this.a = obj2;
    }

    public ikm(SharedPreferences sharedPreferences) {
        this.b = new ArrayList();
        this.a = sharedPreferences;
    }

    public ikm(gzp gzpVar, gzp gzpVar2) {
        gzpVar.getClass();
        gzpVar2.getClass();
        this.b = gzpVar;
        this.a = gzpVar2;
    }

    public ikm(char[] cArr) {
        this.b = new HashMap();
        this.a = new HashMap();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public ikm(ikm ikmVar) {
        this.b = new HashMap((Map) ikmVar.b);
        this.a = new HashMap((Map) ikmVar.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public ikm(ikm ikmVar, byte[] bArr) {
        this.b = new HashMap((Map) ikmVar.b);
        this.a = new HashMap((Map) ikmVar.a);
    }

    public ikm(kbq kbqVar, kaa kaaVar, byte[] bArr) {
        kbqVar.getClass();
        this.b = kbqVar;
        kaaVar.getClass();
        this.a = kaaVar;
    }

    public ikm(kbq kbqVar, kaa kaaVar) {
        hoq.I(!kbqVar.g(), "Error status must not be OK");
        this.b = kbqVar;
        this.a = kaaVar;
    }

    public ikm() {
        this.a = new ReferenceQueue();
        this.b = DesugarCollections.synchronizedSet(new HashSet());
    }

    public ikm(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public ikm(byte[] bArr) {
        kys h = ixj.h(0, 0, 7);
        this.b = h;
        this.a = new kzm(h, kqo.a, -3, 1);
    }
}
