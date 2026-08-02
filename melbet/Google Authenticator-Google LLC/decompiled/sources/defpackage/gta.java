package defpackage;

import android.os.Build;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gta {
    public static boolean a;
    public static boolean b;
    public static final WeakHashMap c;
    public static final Deque d;
    public static final Deque e;
    public static final Object f;
    public static final Runnable g;
    public static int h;
    public static int i;
    public static guq j;
    static final bst k;
    private static final hfm l;
    private static hfm m;
    private static final AtomicReference n;
    private static final gsz o;

    static {
        hfm s = hfm.s("android.support.v4.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl", "com.google.apps.tiktok.tracing.contrib.mdd.MddTraceFlush", new String[0]);
        l = s;
        m = s;
        a = true;
        b = false;
        n = new AtomicReference(hjb.a);
        k = new bst("tiktok_systrace", (byte[]) null);
        c = new WeakHashMap();
        o = new gsz();
        d = new ArrayDeque();
        e = new ArrayDeque();
        f = new Object();
        g = new cov(10);
        i = 0;
    }

    public static gun a() {
        return (gun) o.get();
    }

    public static guq b() {
        return a().c;
    }

    static guq c() {
        return (guq) e.peek();
    }

    public static guq d(boolean z) {
        gun a2 = a();
        guq guqVar = a2.c;
        return (guqVar == null || (guqVar == gtw.a && !z)) ? gtk.m(a2) : guqVar;
    }

    public static guq e() {
        guq guqVar = j;
        if (guqVar == null) {
            return null;
        }
        j = null;
        return guqVar;
    }

    public static guq f(guq guqVar) {
        return g(a(), guqVar);
    }

    public static guq g(gun gunVar, guq guqVar) {
        return gunVar.f != null ? w(gunVar, guqVar, 2) : w(gunVar, guqVar, 4);
    }

    public static guq h(gun gunVar, guq guqVar) {
        guq guqVar2 = gunVar.d;
        gunVar.d = guqVar;
        return guqVar2;
    }

    public static gut i() {
        q(false);
        return new gsw(1);
    }

    public static gut j() {
        gun a2 = a();
        if (!a2.a) {
            return new gsw(0);
        }
        gtt gttVar = a2.c;
        if (gttVar == null) {
            gttVar = gtk.m(a2);
        }
        d.add(gttVar);
        fao.e(g);
        return new gsw(2);
    }

    static hfm k() {
        return (hfm) n.get();
    }

    public static String l(String str) {
        return str.length() > 127 ? str.substring(0, 127) : str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00a1, code lost:
    
        r10 = r1.c.d;
        r16 = r7;
        r7 = java.lang.Integer.valueOf(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00af, code lost:
    
        if (r10.containsKey(r7) != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b1, code lost:
    
        r1.c.d.put(r7, new defpackage.guh(r8, 1073741824));
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00bd, code lost:
    
        if (r15 == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00bf, code lost:
    
        r15.c = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00cf, code lost:
    
        if (r15 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00d1, code lost:
    
        r15.c = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00d5, code lost:
    
        r1.d = r8;
        r1.e++;
        r1.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d7, code lost:
    
        if (r1.c(r12, r13, r14, (r14 + r13) - r12) != false) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m(guq guqVar) {
        int i2;
        int i3;
        gui guiVar;
        guh guhVar;
        gug gugVar;
        int i4;
        String str;
        int i5 = 0;
        int i6 = 0;
        guq guqVar2 = guqVar;
        while (guqVar2 != null) {
            i5++;
            i6 += guqVar2.c().length();
            guqVar2 = guqVar2.a();
            if (guqVar2 != null) {
                i6 += 4;
            }
        }
        if (i5 > 250) {
            String[] strArr = new String[i5];
            guq guqVar3 = guqVar;
            for (int i7 = i5 - 1; i7 >= 0; i7--) {
                strArr[i7] = guqVar3.c();
                guqVar3 = guqVar3.a();
            }
            hen henVar = new hen(4);
            hjr it = hfm.o(strArr).iterator();
            int i8 = 0;
            while (it.hasNext()) {
                henVar.g(it.next(), Integer.valueOf(i8));
                i8++;
            }
            int i9 = 1;
            her d2 = henVar.d(true);
            int i10 = ((hix) d2).d;
            int i11 = i5 >> 2;
            if (i10 <= i11) {
                int i12 = i5 + 1;
                int[] iArr = new int[i12];
                for (int i13 = 0; i13 < i5; i13++) {
                    iArr[i13] = ((Integer) d2.get(strArr[i13])).intValue();
                }
                iArr[i5] = i10;
                guj gujVar = new guj(iArr);
                int i14 = 0;
                while (true) {
                    int i15 = -1;
                    if (i14 >= i12) {
                        break;
                    }
                    gujVar.f += i9;
                    int[] iArr2 = gujVar.a;
                    int i16 = iArr2[i14];
                    while (true) {
                        guh guhVar2 = null;
                        while (true) {
                            if (gujVar.f <= 0) {
                                i4 = i9;
                                break;
                            }
                            if (gujVar.e == 0) {
                                break;
                            }
                            i4 = i9;
                            int i17 = ((guh) gujVar.c.d.get(Integer.valueOf(iArr2[gujVar.d]))).a;
                            int i18 = gujVar.e;
                            if (iArr2[i17 + i18] == i16) {
                                if (guhVar2 != null) {
                                    guhVar2.c = gujVar.c;
                                }
                                gujVar.e = i18 + 1;
                                gujVar.b();
                            } else {
                                guh guhVar3 = (guh) gujVar.c.d.get(Integer.valueOf(iArr2[gujVar.d]));
                                int i19 = i15;
                                guh guhVar4 = new guh(guhVar3.a, (gujVar.e + r0) - 1);
                                gujVar.c.d.put(Integer.valueOf(iArr2[gujVar.d]), guhVar4);
                                Map map = guhVar4.d;
                                int i20 = guhVar4.b + 1;
                                map.put(Integer.valueOf(iArr2[i20]), guhVar3);
                                guhVar3.a = i20;
                                if (guhVar2 != null) {
                                    guhVar2.c = guhVar4;
                                }
                                map.put(Integer.valueOf(i16), new guh(i14, 1073741824));
                                gujVar.f--;
                                gujVar.a();
                                guhVar2 = guhVar4;
                                i9 = i4;
                                i15 = i19;
                            }
                        }
                        gujVar.f += i15;
                        gujVar.a();
                        i9 = i4;
                    }
                    i14++;
                    i9 = i4;
                }
                int i21 = i9;
                ArrayDeque arrayDeque = new ArrayDeque();
                guh guhVar5 = gujVar.b;
                gug gugVar2 = new gug(guhVar5, 0, -1, -1);
                arrayDeque.push(gugVar2);
                while (!arrayDeque.isEmpty()) {
                    gug gugVar3 = (gug) arrayDeque.pop();
                    for (guh guhVar6 : ((guh) gugVar3.d).d.values()) {
                        int i22 = gugVar3.b;
                        int i23 = gugVar3.c;
                        int i24 = guhVar6.a;
                        int i25 = guhVar6.b;
                        if (gujVar.c(i22, i23, i24, i25)) {
                            guhVar = guhVar5;
                        } else {
                            if (guhVar6.d.isEmpty()) {
                                int i26 = guhVar6.a;
                                guhVar = guhVar5;
                            } else {
                                guhVar = guhVar5;
                            }
                            gugVar = new gug(guhVar6, i21, guhVar6.a, i25);
                            if (gugVar2.a >= gugVar.a) {
                                gugVar2 = gugVar;
                            }
                            arrayDeque.push(gugVar);
                            guhVar5 = guhVar;
                            i21 = 1;
                        }
                        gugVar = new gug(guhVar6, gugVar3.a + i21, i22, i23);
                        if (gugVar2.a >= gugVar.a) {
                        }
                        arrayDeque.push(gugVar);
                        guhVar5 = guhVar;
                        i21 = 1;
                    }
                    i21 = 1;
                }
                int[] iArr3 = gujVar.a;
                int min = Math.min(iArr3.length, gugVar2.c + 1);
                guh guhVar7 = guhVar5;
                int i27 = 0;
                loop9: while (true) {
                    i2 = gugVar2.b;
                    i3 = min - i2;
                    guhVar7 = (guh) guhVar7.d.get(Integer.valueOf(iArr3[(i27 % i3) + i2]));
                    if (guhVar7 == null) {
                        break;
                    }
                    for (int i28 = guhVar7.a; i28 < guhVar7.b + 1 && i28 < iArr3.length; i28++) {
                        if (iArr3[(i27 % i3) + i2] != iArr3[i28]) {
                            break loop9;
                        }
                        i27++;
                    }
                }
                gui guiVar2 = new gui(i2, min, i27 / i3);
                if (guiVar2.c * (guiVar2.b - guiVar2.a) >= i11) {
                    guiVar = guiVar2;
                    str = "";
                    if (guiVar != null) {
                        int i29 = guiVar.a;
                        String concat = i29 > 0 ? String.valueOf(TextUtils.join(" -> ", Arrays.copyOf(strArr, i29))).concat(" -> ") : "";
                        int i30 = guiVar.b;
                        int i31 = guiVar.c;
                        int i32 = ((i30 - i29) * i31) + i29;
                        str = String.format(Locale.US, "%s{%s}x%d%s", concat, TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i29, i30)), Integer.valueOf(i31), i32 < i5 ? " -> ".concat(String.valueOf(TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i32, i5)))) : "");
                    }
                    if (!str.isEmpty()) {
                        return str;
                    }
                }
            }
            guiVar = null;
            str = "";
            if (guiVar != null) {
            }
            if (!str.isEmpty()) {
            }
        }
        char[] cArr = new char[i6];
        guq guqVar4 = guqVar;
        while (guqVar4 != null) {
            String c2 = guqVar4.c();
            i6 -= c2.length();
            c2.getChars(0, c2.length(), cArr, i6);
            guqVar4 = guqVar4.a();
            if (guqVar4 != null) {
                i6 -= 4;
                " -> ".getChars(0, 4, cArr, i6);
            }
        }
        return new String(cArr);
    }

    static void n(guq guqVar) {
        gun a2 = a();
        guq guqVar2 = a2.c;
        if (guqVar2 == null) {
            throw new gsx("Tried to end [" + guqVar.c() + "], but no trace was active. This is caused by mismatched or missing calls to beginSpan.");
        }
        if (guqVar == guqVar2) {
            g(a2, guqVar2.a());
            return;
        }
        throw new gsy("Tried to end span " + guqVar.c() + ", but that span is not the current span. The current span is " + guqVar2.c() + ".");
    }

    public static void o() {
        int i2 = h;
        int i3 = i2 - 1;
        h = i3;
        if (i3 < 0) {
            throw new IllegalStateException("More calls to pause than to resume");
        }
        if (i == i2) {
            hoq.I(!e.isEmpty(), "current async trace should not be null");
            f(null);
            i = 0;
        }
    }

    public static void p() {
        j = b();
        fao.e(new cov(9));
    }

    static void q(boolean z) {
        IllegalStateException y;
        gur gurVar = gus.a;
        gur gurVar2 = gur.b;
        h++;
        if (i == 0) {
            boolean z2 = z & (gurVar == gurVar2);
            gun a2 = a();
            guq guqVar = a2.c;
            if (guqVar != null) {
                if (z2 && (guqVar instanceof gsr) && !((gsr) guqVar).i()) {
                    IllegalStateException y2 = y(guqVar);
                    y2.printStackTrace();
                    h--;
                    throw y2;
                }
                return;
            }
            guq c2 = c();
            if (!z2 || (y = y(c2)) == null) {
                if (c2 != null) {
                    g(a2, c2);
                    i = h;
                    return;
                }
                return;
            }
            if (!z(c2, y)) {
                y.printStackTrace();
                h--;
                throw y;
            }
            if (c2 == null) {
                gsp gspVar = gtk.a;
                UUID b2 = gtb.a.b();
                String bK = gse.bK(b2);
                gtk.s();
                gtk gtkVar = new gtk(b2, bK, y, true, a2);
                e.push(gtkVar);
                g(a2, gtkVar);
            } else {
                g(a2, c2);
            }
            i = h;
        }
    }

    public static void r() {
        guq c2;
        h++;
        if (i == 0) {
            gun a2 = a();
            if (a2.c != null || (c2 = c()) == null) {
                return;
            }
            g(a2, c2);
            i = h;
        }
    }

    static void s(hfm hfmVar) {
        hfk hfkVar = new hfk();
        hfkVar.j(hfmVar);
        hfkVar.j(l);
        m = hfkVar.g();
    }

    public static boolean t(Throwable th) {
        if (m.isEmpty()) {
            return false;
        }
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            String stackTraceElement2 = stackTraceElement.toString();
            hjr it = m.iterator();
            while (it.hasNext()) {
                if (stackTraceElement2.startsWith((String) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean u() {
        guq b2 = b();
        return (b2 == null || b2 == gtw.a) ? false : true;
    }

    public static boolean v() {
        guq c2 = c();
        if (c2 == null) {
            return false;
        }
        if ((c2 instanceof gsr) && !((gsr) c2).i()) {
            return false;
        }
        r();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x009f, code lost:
    
        if (r8.q() != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a9, code lost:
    
        if (r0.q() != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ab, code lost:
    
        r3 = (int) android.os.SystemClock.currentThreadTimeMillis();
        r4 = r3 - r7.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b4, code lost:
    
        if (r4 <= 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00b6, code lost:
    
        if (r0 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00bc, code lost:
    
        if (r0.q() == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00be, code lost:
    
        r0.o(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c1, code lost:
    
        r7.e = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static guq w(gun gunVar, guq guqVar, int i2) {
        guq guqVar2;
        guq guqVar3;
        guq guqVar4;
        guq guqVar5 = gunVar.c;
        if (guqVar5 != guqVar || (i2 != 2 && i2 != 4 && guqVar5 != null)) {
            if (guqVar5 == null) {
                gunVar.b = Build.VERSION.SDK_INT >= 29 ? Trace.isEnabled() : exf.p(k);
            }
            hrz hrzVar = gunVar.f;
            if (gunVar.b) {
                if (hrzVar != null) {
                    int i3 = i2 - 1;
                    if (i3 == 0) {
                        guqVar3 = guqVar;
                        guqVar4 = null;
                    } else if (i3 != 2) {
                        guqVar3 = guqVar;
                        guqVar4 = guqVar5;
                    } else {
                        guqVar4 = guqVar5;
                        guqVar3 = null;
                    }
                    if (guqVar4 != null) {
                        if (guqVar3 != null) {
                            if (guqVar4.a() == guqVar3 && !hrzVar.d(guqVar4)) {
                                Trace.endSection();
                            } else if (guqVar4 == guqVar3.a() && !hrzVar.d(guqVar3)) {
                                hrz.a(guqVar3);
                            }
                        }
                        hrzVar.c(guqVar4);
                    }
                    if (guqVar3 != null) {
                        hrzVar.b(guqVar3);
                    }
                } else {
                    if (guqVar5 != null) {
                        if (guqVar == null) {
                            guqVar2 = null;
                        } else if (guqVar5.a() == guqVar && !hoq.aM(guqVar5)) {
                            Trace.endSection();
                        } else if (guqVar5 != guqVar.a() || hoq.aM(guqVar)) {
                            guqVar2 = guqVar;
                        } else {
                            hoq.aJ(guqVar);
                        }
                        hoq.aL(guqVar5);
                    } else {
                        guqVar2 = guqVar;
                    }
                    if (guqVar2 != null) {
                        hoq.aK(guqVar2);
                    }
                }
            }
            if (guqVar5 != guqVar) {
                if (guqVar == null) {
                    guqVar = null;
                }
                if (guqVar5 != null) {
                }
                gunVar.c = guqVar;
                if (i2 == 2) {
                    hrzVar.getClass();
                    hrzVar.a = guqVar;
                }
                return guqVar5;
            }
        }
        return guqVar;
    }

    public static void x(boolean z) {
        if (gus.a()) {
            guq b2 = b();
            IllegalStateException illegalStateException = (b2 == null || (b2 instanceof gtw)) ? new IllegalStateException("Was supposed to have a trace - did you forget to propagate or create one? See http://go/tiktok-tracing for more details.") : b2 instanceof gsr ? new IllegalStateException("Was supposed to have a trace - did you forget to propagate or create one? See this exception's cause for the last place a trace was missing. See http://go/tiktok-tracing for more details.", ((gsr) b2).h()) : null;
            if (illegalStateException == null || z(b2, illegalStateException)) {
                return;
            }
            if (!z && gus.a != gur.c) {
                throw illegalStateException;
            }
            Log.e("Tracer", "Missing trace", illegalStateException);
        }
    }

    private static IllegalStateException y(guq guqVar) {
        if (guqVar == null || (guqVar instanceof gtw)) {
            return new IllegalStateException("Was supposed to have a trace - did you commit a FragmentManager transaction without one? Most fragment transactions should use commitNow(), as trace can be lost in async operations like commit(). If you have to use commit(), refer to http://go/tiktok-tracing/handling_missing_traces.md#fragment-transactions for more details.");
        }
        if (guqVar instanceof gsr) {
            return new IllegalStateException("Was supposed to have a trace - did you commit a FragmentManager transaction without one? See this exception's cause for the last place a trace was missing. Note most fragment transactions should use commitNow(), as trace can be lost in async operations like commit(). If you have to use commit(), refer to http://go/tiktok-tracing/handling_missing_traces.md#fragment-transactions for more details.", ((gsr) guqVar).h());
        }
        return null;
    }

    private static boolean z(guq guqVar, IllegalStateException illegalStateException) {
        return guqVar instanceof gsr ? ((gsr) guqVar).i() : t(illegalStateException);
    }
}
