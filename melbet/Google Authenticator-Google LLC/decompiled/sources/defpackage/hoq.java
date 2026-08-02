package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Trace;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewParent;
import j$.time.Duration;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.io.File;
import java.io.Serializable;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class hoq {
    private hoq() {
    }

    public static void A(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalArgumentException(w(str, Integer.valueOf(i)));
        }
    }

    public static void B(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(w(str, Long.valueOf(j)));
        }
    }

    public static void C(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(w(str, obj));
        }
    }

    public static void D(boolean z, String str, int i, int i2) {
        if (!z) {
            throw new IllegalArgumentException(w(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public static void E(boolean z, String str, Object obj, int i) {
        if (!z) {
            throw new IllegalArgumentException(w(str, obj, Integer.valueOf(i)));
        }
    }

    public static void F(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(w(str, obj, obj2));
        }
    }

    public static void G(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? bb(i, i3, "start index") : (i2 < 0 || i2 > i3) ? bb(i2, i3, "end index") : w("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static void H(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void I(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException((String) obj);
        }
    }

    public static void J(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalStateException(w(str, Integer.valueOf(i)));
        }
    }

    public static void K(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalStateException(w(str, obj));
        }
    }

    public static void L(boolean z, String str, int i, int i2) {
        if (!z) {
            throw new IllegalStateException(w(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public static void M(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalStateException(w(str, obj, obj2));
        }
    }

    public static void N(boolean z, String str, Object obj, Object obj2, Object obj3) {
        if (!z) {
            throw new IllegalStateException(w(str, obj, obj2, obj3));
        }
    }

    public static void O(int i, int i2) {
        String w;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                w = w("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(a.Y(i2, "negative size: "));
                }
                w = w("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(w);
        }
    }

    public static void P(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(bb(i, i2, "index"));
        }
    }

    public static String Q(String str) {
        if (S(str)) {
            return null;
        }
        return str;
    }

    public static String R(String str) {
        return str == null ? "" : str;
    }

    public static boolean S(String str) {
        return str == null || str.isEmpty();
    }

    public static gzo T(Object obj) {
        return new gzo(obj.getClass().getSimpleName());
    }

    public static void U(Context context) {
    }

    public static void V(Context context) {
    }

    public static void W(Activity activity, Class cls, gxu gxuVar) {
        View findViewById = activity.findViewById(R.id.content);
        findViewById.getClass();
        Y(com.google.android.apps.authenticator2.R.id.tiktok_event_activity_listeners, findViewById, cls, gxuVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void X(bd bdVar, Class cls, gxu gxuVar) {
        View view = bdVar.R;
        if (view != null) {
            Y(com.google.android.apps.authenticator2.R.id.tiktok_event_fragment_listeners, view, cls, gxuVar);
        } else {
            y(bdVar instanceof gxy, "Fragments without views must implement EventReceiver to add a listener!");
            ((gxy) bdVar).o(cls, gxuVar);
        }
    }

    public static void Y(int i, View view, Class cls, gxu gxuVar) {
        fao.c();
        qy bd = bd(i, view);
        if (bd == null) {
            bd = new qi();
            view.setTag(i, bd);
        }
        for (int i2 = 0; i2 < bd.d; i2++) {
            Class<?> cls2 = (Class) bd.c(i2);
            if (cls.equals(cls2)) {
                throw new IllegalArgumentException(String.format(Locale.US, "Class %s is already registered as a listener. Are you adding the same View instance twice?", cls.getSimpleName()));
            }
            if (cls.isAssignableFrom(cls2)) {
                throw new IllegalArgumentException(String.format(Locale.US, "For class %s, a listener is already registered as a subtype: %s", cls.getSimpleName(), cls2.getSimpleName()));
            }
            if (cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(String.format(Locale.US, "For class %s, a listener is already registered as a supertype: %s", cls.getSimpleName(), cls2.getSimpleName()));
            }
        }
        bd.put(cls, gxuVar);
    }

    public static void Z(gxq gxqVar, ar arVar) {
        View af = af(arVar);
        af.getClass();
        bf(com.google.android.apps.authenticator2.R.id.tiktok_event_fragment_listeners, gxqVar, af);
    }

    public static void a(String str, Object... objArr) {
        System.err.println(hoq.class.toString() + ": " + String.format(str, objArr));
    }

    public static gty aA(int i, Class cls, String str) {
        return aC(i, cls.getName() + ": " + str);
    }

    public static gty aB(int i, String str, guc gucVar, boolean z) {
        boolean z2;
        guq guqVar;
        boolean z3;
        gtl gtlVar;
        gun a = gta.a();
        guq guqVar2 = a.c;
        if (guqVar2 == gtw.a) {
            guqVar2 = null;
            gta.g(a, null);
            z2 = true;
        } else {
            z2 = false;
        }
        if (guqVar2 == null) {
            UUID b = gtb.a.b();
            String bK = gse.bK(b);
            if (gus.a()) {
                gsp gspVar = new gsp();
                gtl.m();
                z3 = z;
                gtlVar = new gtl(b, bK, str, gucVar, gspVar, z3, gta.t(gspVar), a);
            } else {
                z3 = z;
                gsp gspVar2 = gtk.a;
                gtl.m();
                gtlVar = new gtl(b, bK, str, gucVar, gspVar2, z3, false, a);
            }
            boolean z4 = gtlVar.a;
            guqVar = gtlVar;
            guqVar = gtlVar;
            if (!z4 && z3) {
                gta.x(true);
                guqVar = gtlVar;
            }
        } else {
            guqVar = guqVar2 instanceof gsr ? ((gsr) guqVar2).b(str, gucVar, z, a) : guqVar2.r(str, i, gucVar, a);
        }
        gta.g(a, guqVar);
        return new gty(guqVar, z2);
    }

    public static gty aC(int i, String str) {
        return aB(i, str, gub.a, true);
    }

    public static boolean aD(long j, float f) {
        return (((int) j) & 1073741823) < ((int) (f * 1.0737418E9f));
    }

    public static int aE(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static gva aF(Context context) {
        return ((gvd) imq.a(context, gvd.class)).e();
    }

    public static gva aG(Context context) {
        return ((gve) imq.a(context, gve.class)).e();
    }

    public static Set aH(Context context) {
        return ((gve) imq.a(context, gve.class)).g();
    }

    public static boolean aI() {
        guq b = gta.b();
        if (b == null || ksp.b(b, gtw.a)) {
            return true;
        }
        if (!(b instanceof gum) || !((gum) b).a()) {
            return false;
        }
        if (!fao.g()) {
            return true;
        }
        fao.c();
        return true;
    }

    public static void aJ(guq guqVar) {
        Trace.beginSection(gta.l(guqVar.c()));
    }

    public static void aK(guq guqVar) {
        if (aM(guqVar) || guqVar.a() == null) {
            Trace.beginSection(guqVar.d());
            aJ(guqVar);
        } else {
            aK(guqVar.a());
            aJ(guqVar);
        }
    }

    public static void aL(guq guqVar) {
        if (aM(guqVar) || guqVar.a() == null) {
            Trace.endSection();
            Trace.endSection();
        } else {
            Trace.endSection();
            aL(guqVar.a());
        }
    }

    public static boolean aM(guq guqVar) {
        return guqVar.e() != Thread.currentThread();
    }

    public static guq aN(Intent intent) {
        long j = gvx.a;
        return gvx.m(intent, false);
    }

    public static gut aO(Service service, String str) {
        fao.c();
        return aG(service).f(str, 235);
    }

    public static boolean aP(Context context) {
        if (context == null) {
            return true;
        }
        if (context instanceof bg) {
            return !((bg) context).a().X();
        }
        if (context instanceof ContextWrapper) {
            return aP(((ContextWrapper) context).getBaseContext());
        }
        return true;
    }

    public static /* synthetic */ String aQ(int i) {
        return i != 1 ? "PERIODIC" : "ONETIME";
    }

    public static String aR(ary aryVar) {
        boolean z = aryVar.c;
        int i = aryVar.j;
        return z ? i != 3 ? i == 2 ? "charger_connected" : "charger" : "charger_unmetered" : i != 3 ? i == 2 ? "connected" : "none" : "unmetered";
    }

    public static gpv aS(gpp gppVar, koe koeVar) {
        I(koeVar != null, "Every SyncletBinding must have a non-null Synclet.");
        return new gpv(true, gppVar, koeVar);
    }

    public static String aT() {
        String I = eos.I();
        int indexOf = I.indexOf(58);
        return indexOf == -1 ? "" : I.substring(indexOf + 1);
    }

    public static brn aU(Iterable iterable) {
        return new brn(hnu.aV(iterable), (byte[]) null);
    }

    @SafeVarargs
    public static brn aV(hvi... hviVarArr) {
        return new brn(hnu.aW(hviVarArr), (byte[]) null);
    }

    public static brn aW(Iterable iterable) {
        return new brn(hnu.aX(iterable), (byte[]) null);
    }

    @SafeVarargs
    public static brn aX(hvi... hviVarArr) {
        return new brn(hnu.aY(hviVarArr), (byte[]) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        r2 = r0.k(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        if ((r2.c() - 1) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        r0 = r0.a();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static gtz aY(hoq hoqVar) {
        guq b = gta.b();
        List list = gsl.b;
        if (b == null) {
            return gtz.d(2);
        }
        gtz d = gtz.d(3);
        loop0: while (b != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (b.k((hoq) it.next()).b()) {
                    break loop0;
                }
            }
        }
        return d;
    }

    private static jkj aZ(Throwable th, boolean z) {
        StackTraceElement[] stackTraceElementArr;
        jkj k = hrj.a.k();
        String name = th.getClass().getName();
        if (!k.b.M()) {
            k.t();
        }
        hrj hrjVar = (hrj) k.b;
        name.getClass();
        hrjVar.b |= 1;
        hrjVar.c = name;
        if (z && th.getMessage() != null) {
            String message = th.getMessage();
            if (!k.b.M()) {
                k.t();
            }
            hrj hrjVar2 = (hrj) k.b;
            message.getClass();
            hrjVar2.b |= 2;
            hrjVar2.d = message;
        }
        try {
            stackTraceElementArr = th.getStackTrace();
        } catch (NullPointerException unused) {
            stackTraceElementArr = null;
        }
        if (stackTraceElementArr != null) {
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                jkj k2 = hri.a.k();
                if (stackTraceElement != null) {
                    String className = stackTraceElement.getClassName();
                    if (!k2.b.M()) {
                        k2.t();
                    }
                    hri hriVar = (hri) k2.b;
                    className.getClass();
                    hriVar.b |= 1;
                    hriVar.c = className;
                    String methodName = stackTraceElement.getMethodName();
                    if (!k2.b.M()) {
                        k2.t();
                    }
                    hri hriVar2 = (hri) k2.b;
                    methodName.getClass();
                    hriVar2.b |= 2;
                    hriVar2.d = methodName;
                    int lineNumber = stackTraceElement.getLineNumber();
                    if (!k2.b.M()) {
                        k2.t();
                    }
                    hri hriVar3 = (hri) k2.b;
                    hriVar3.b |= 8;
                    hriVar3.f = lineNumber;
                    if (stackTraceElement.getFileName() != null) {
                        String fileName = stackTraceElement.getFileName();
                        if (!k2.b.M()) {
                            k2.t();
                        }
                        hri hriVar4 = (hri) k2.b;
                        fileName.getClass();
                        hriVar4.b |= 4;
                        hriVar4.e = fileName;
                    }
                }
                if (!k.b.M()) {
                    k.t();
                }
                hrj hrjVar3 = (hrj) k.b;
                hri hriVar5 = (hri) k2.q();
                hriVar5.getClass();
                jkx jkxVar = hrjVar3.f;
                if (!jkxVar.c()) {
                    hrjVar3.f = jkp.A(jkxVar);
                }
                hrjVar3.f.add(hriVar5);
            }
        }
        return k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void aa(gxq gxqVar, bd bdVar) {
        View view = bdVar.R;
        if (view != null) {
            bf(com.google.android.apps.authenticator2.R.id.tiktok_event_fragment_listeners, gxqVar, view);
            return;
        }
        fao.c();
        if (bdVar instanceof gxy) {
            gxv n = ((gxy) bdVar).n(gxqVar);
            if (n == gxv.a) {
                return;
            }
            if (n != gxv.b) {
                gxqVar = n.c;
            }
        }
        bd bdVar2 = bdVar.F;
        if (bdVar2 != null) {
            aa(gxqVar, bdVar2);
            return;
        }
        bg D = bdVar.D();
        y(D != null, "Fragments must be attached to an Activity to receive events!");
        View findViewById = D.findViewById(R.id.content);
        findViewById.getClass();
        bf(com.google.android.apps.authenticator2.R.id.tiktok_event_activity_listeners, gxqVar, findViewById);
    }

    public static void ab(gxq gxqVar, View view) {
        view.getClass();
        bf(com.google.android.apps.authenticator2.R.id.tiktok_event_view_listeners, gxqVar, view);
    }

    public static void ac(Activity activity) {
        ((gxr) imq.a(activity, gxr.class)).c();
    }

    public static void ad(bd bdVar) {
        ((gxs) imq.a(bdVar, gxs.class)).s();
    }

    public static void ae(View view) {
        ((gxt) imq.a(view, gxt.class)).i();
    }

    public static View af(ar arVar) {
        View view = arVar.R;
        if (view != null) {
            return view;
        }
        Dialog dialog = arVar.e;
        if (dialog != null) {
            return dialog.findViewById(R.id.content);
        }
        return null;
    }

    public static void ag(ar arVar) {
        ah(arVar);
        View af = af(arVar);
        bd bdVar = arVar.F;
        View findViewById = bdVar == null ? arVar.D().findViewById(R.id.content) : bdVar instanceof ar ? af((ar) bdVar) : bdVar.R;
        af.getClass();
        af.setTag(com.google.android.apps.authenticator2.R.id.tiktok_event_parent, findViewById);
    }

    public static void ah(ar arVar) {
        if (arVar.d && af(arVar) == null) {
            throw new IllegalStateException("DialogFragment is being used as a dialog. Must return a valid view in onCreateView() or a valid Dialog in onCreateDialog().");
        }
        if (!arVar.d && arVar.R == null) {
            throw new IllegalStateException("DialogFragment not being used as a dialog. Must return a valid view in onCreateView() -- onCreateDialog() is not called.");
        }
    }

    public static long ai(long j, long j2) {
        long j3 = (j ^ j2) & Long.MAX_VALUE;
        if (j3 == 0) {
            return 1L;
        }
        return j3;
    }

    public static long aj(gvy gvyVar) {
        return ai(gvyVar.c, gvyVar.d);
    }

    public static gxp ak(gvy gvyVar, SparseArray sparseArray, float f, eoc eocVar, hel helVar, boolean z) {
        gvyVar.getClass();
        gxl gxlVar = new gxl(gvyVar, sparseArray, f, eocVar, helVar, z);
        jkj jkjVar = gxlVar.n;
        H(((lfs) jkjVar.q()).equals(lfs.a));
        gvy gvyVar2 = gxlVar.d;
        H(gvyVar2.e.size() > 0);
        jmh b = jmx.b(gvyVar2.f);
        if (!jkjVar.b.M()) {
            jkjVar.t();
        }
        lfs lfsVar = (lfs) jkjVar.b;
        b.getClass();
        lfsVar.g = b;
        lfsVar.b |= 16;
        long aj = aj(gvyVar2);
        if (!jkjVar.b.M()) {
            jkjVar.t();
        }
        lfs lfsVar2 = (lfs) jkjVar.b;
        lfsVar2.b |= 1;
        lfsVar2.c = aj;
        float f2 = gxlVar.e;
        if (f2 > 0.0f) {
            jkj k = lfq.a.k();
            if (!k.b.M()) {
                k.t();
            }
            lfq lfqVar = (lfq) k.b;
            lfqVar.b = 2;
            lfqVar.c = Float.valueOf(f2);
            if (!jkjVar.b.M()) {
                jkjVar.t();
            }
            lfs lfsVar3 = (lfs) jkjVar.b;
            lfq lfqVar2 = (lfq) k.q();
            lfqVar2.getClass();
            lfsVar3.e = lfqVar2;
            lfsVar3.b |= 4;
        }
        if ((gvyVar2.b & 32) != 0) {
            gsk gskVar = gvyVar2.i;
            if (gskVar == null) {
                gskVar = gsk.a;
            }
            if ((gskVar.b & 1) != 0) {
                gsj gsjVar = gskVar.c;
                if (gsjVar == null) {
                    gsjVar = gsj.a;
                }
                int i = gsjVar.c;
                if (!jkjVar.b.M()) {
                    jkjVar.t();
                }
                lfs lfsVar4 = (lfs) jkjVar.b;
                lfsVar4.b |= 64;
                lfsVar4.i = i;
            }
            if ((gskVar.b & 2) != 0) {
                jkj k2 = lfr.a.k();
                gsi gsiVar = gskVar.d;
                if (gsiVar == null) {
                    gsiVar = gsi.a;
                }
                jkb a = jmv.a(gsiVar.c);
                if (!k2.b.M()) {
                    k2.t();
                }
                lfr lfrVar = (lfr) k2.b;
                a.getClass();
                lfrVar.c = a;
                lfrVar.b |= 1;
                if (!jkjVar.b.M()) {
                    jkjVar.t();
                }
                lfs lfsVar5 = (lfs) jkjVar.b;
                lfr lfrVar2 = (lfr) k2.q();
                lfrVar2.getClass();
                lfsVar5.j = lfrVar2;
                lfsVar5.b |= 128;
            }
        }
        Iterator it = gvyVar2.e.iterator();
        while (it.hasNext()) {
            gxlVar.b((gtx) it.next());
        }
        Long l = gxlVar.b;
        if (l != null) {
            Map map = gxlVar.c;
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                jkj k3 = lfn.a.k();
                long longValue = ((Long) entry.getKey()).longValue();
                if (!k3.b.M()) {
                    k3.t();
                }
                lfn lfnVar = (lfn) k3.b;
                lfnVar.b |= 1;
                lfnVar.c = longValue;
                long longValue2 = ((Long) entry.getValue()).longValue();
                if (!k3.b.M()) {
                    k3.t();
                }
                lfn lfnVar2 = (lfn) k3.b;
                lfnVar2.b |= 2;
                lfnVar2.d = longValue2;
                arrayList.add((lfn) k3.q());
            }
            jkj k4 = lfo.a.k();
            if (!k4.b.M()) {
                k4.t();
            }
            lfo lfoVar = (lfo) k4.b;
            lfoVar.e = 2;
            lfoVar.b |= 1;
            l.longValue();
            if (!k4.b.M()) {
                k4.t();
            }
            lfo lfoVar2 = (lfo) k4.b;
            lfoVar2.c = 2;
            lfoVar2.d = l;
            if (!k4.b.M()) {
                k4.t();
            }
            lfo lfoVar3 = (lfo) k4.b;
            jkx jkxVar = lfoVar3.f;
            if (!jkxVar.c()) {
                lfoVar3.f = jkp.A(jkxVar);
            }
            jiz.f(arrayList, lfoVar3.f);
            if (!jkjVar.b.M()) {
                jkjVar.t();
            }
            lfs lfsVar6 = (lfs) jkjVar.b;
            lfo lfoVar4 = (lfo) k4.q();
            lfoVar4.getClass();
            jkx jkxVar2 = lfsVar6.f;
            if (!jkxVar2.c()) {
                lfsVar6.f = jkp.A(jkxVar2);
            }
            lfsVar6.f.add(lfoVar4);
        }
        if (gxlVar.j == null) {
            gxlVar.j = gxlVar.i;
        }
        String str = gxlVar.j.c;
        if (!jkjVar.b.M()) {
            jkjVar.t();
        }
        lfs lfsVar7 = (lfs) jkjVar.b;
        str.getClass();
        lfsVar7.b = 2 | lfsVar7.b;
        lfsVar7.d = str;
        H(gxlVar.g != Long.MAX_VALUE);
        H(gxlVar.h != Long.MIN_VALUE);
        long j = gxlVar.h - gxlVar.g;
        if (gxlVar.m) {
            if (gvyVar2.e.size() == 1 && j == 0) {
                r4 = (gvyVar2.b & 32) == 0;
                j = 0;
            }
        } else if (gvyVar2.e.size() == 1 && gvyVar2.g == gxlVar.f && (gvyVar2.b & 32) == 0) {
            r4 = true;
        }
        boolean z2 = r4;
        jkb b2 = jmv.b(j);
        if (!jkjVar.b.M()) {
            jkjVar.t();
        }
        lfs lfsVar8 = (lfs) jkjVar.b;
        b2.getClass();
        lfsVar8.h = b2;
        lfsVar8.b |= 32;
        jkj k5 = lha.a.k();
        jkb b3 = jmv.b((gvyVar2.g * 1000000) + gvyVar2.h);
        if (!k5.b.M()) {
            k5.t();
        }
        lha lhaVar = (lha) k5.b;
        b3.getClass();
        lhaVar.d = b3;
        lhaVar.b |= 1;
        Iterator it2 = gxlVar.a.values().iterator();
        while (it2.hasNext()) {
            lgz lgzVar = (lgz) ((jkj) it2.next()).q();
            if (!k5.b.M()) {
                k5.t();
            }
            lha lhaVar2 = (lha) k5.b;
            lgzVar.getClass();
            jkx jkxVar3 = lhaVar2.c;
            if (!jkxVar3.c()) {
                lhaVar2.c = jkp.A(jkxVar3);
            }
            lhaVar2.c.add(lgzVar);
        }
        if (gvyVar2.k.size() > 0 && gvyVar2.l.size() > 0) {
            jkx jkxVar4 = gvyVar2.k;
            if (!jkjVar.b.M()) {
                jkjVar.t();
            }
            lfs lfsVar9 = (lfs) jkjVar.b;
            jkx jkxVar5 = lfsVar9.m;
            if (!jkxVar5.c()) {
                lfsVar9.m = jkp.A(jkxVar5);
            }
            jiz.f(jkxVar4, lfsVar9.m);
            jkx jkxVar6 = gvyVar2.l;
            if (!jkjVar.b.M()) {
                jkjVar.t();
            }
            lfs lfsVar10 = (lfs) jkjVar.b;
            jkx jkxVar7 = lfsVar10.n;
            if (!jkxVar7.c()) {
                lfsVar10.n = jkp.A(jkxVar7);
            }
            jiz.f(jkxVar6, lfsVar10.n);
            int i2 = gxlVar.j.b;
            if ((i2 & 2048) != 0 && (i2 & 4096) != 0 && (i2 & 8192) != 0) {
                jkj k6 = lfl.a.k();
                int i3 = gxlVar.j.n;
                if (!k6.b.M()) {
                    k6.t();
                }
                jkp jkpVar = k6.b;
                lfl lflVar = (lfl) jkpVar;
                lflVar.b |= 8;
                lflVar.d = i3;
                int i4 = gxlVar.j.o;
                if (!jkpVar.M()) {
                    k6.t();
                }
                jkp jkpVar2 = k6.b;
                lfl lflVar2 = (lfl) jkpVar2;
                lflVar2.b |= 16;
                lflVar2.e = i4;
                int i5 = gxlVar.j.p;
                if (!jkpVar2.M()) {
                    k6.t();
                }
                lfl lflVar3 = (lfl) k6.b;
                lflVar3.b |= 4;
                lflVar3.c = i5;
                if (!jkjVar.b.M()) {
                    jkjVar.t();
                }
                lfs lfsVar11 = (lfs) jkjVar.b;
                lfl lflVar4 = (lfl) k6.q();
                lflVar4.getClass();
                lfsVar11.l = lflVar4;
                lfsVar11.b |= 256;
            }
        }
        hel helVar2 = gxlVar.l;
        if (!helVar2.isEmpty()) {
            jkj k7 = lfp.a.k();
            if (!k7.b.M()) {
                k7.t();
            }
            lfp lfpVar = (lfp) k7.b;
            jkx jkxVar8 = lfpVar.b;
            if (!jkxVar8.c()) {
                lfpVar.b = jkp.A(jkxVar8);
            }
            jiz.f(helVar2, lfpVar.b);
            if (!jkjVar.b.M()) {
                jkjVar.t();
            }
            lfs lfsVar12 = (lfs) jkjVar.b;
            lfp lfpVar2 = (lfp) k7.q();
            lfpVar2.getClass();
            lfsVar12.o = lfpVar2;
            lfsVar12.b |= 512;
        }
        gtx gtxVar = gxlVar.j;
        eik eikVar = new eik(gtxVar.c);
        lew lewVar = (lew) gxlVar.a(gtxVar).e();
        long j2 = gvyVar2.g;
        return new gxp(eikVar, lewVar, j2, j2 + gxlVar.f, z2, (lfs) jkjVar.q(), (lha) k5.q(), gxlVar.k);
    }

    /* JADX WARN: Removed duplicated region for block: B:219:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0617  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static gxm al(gxo gxoVar) {
        boolean z;
        boolean z2;
        Optional empty;
        float f;
        lhg lhgVar;
        jkx jkxVar;
        jkx jkxVar2;
        int i;
        gvy gvyVar;
        int i2;
        Duration ofNanos = Duration.ofNanos(Long.MAX_VALUE);
        Duration ofNanos2 = Duration.ofNanos(Long.MIN_VALUE);
        int i3 = hel.d;
        int i4 = 4;
        heg hegVar = new heg(4);
        gvy gvyVar2 = gxoVar.a;
        Iterator it = gvyVar2.e.iterator();
        String str = null;
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            gtx gtxVar = (gtx) it.next();
            SparseArray sparseArray = gxoVar.b;
            jkj k = lhf.a.k();
            if ((gtxVar.b & 1) != 0) {
                String str2 = gtxVar.c;
                i = i4;
                if (!k.b.M()) {
                    k.t();
                }
                lhf lhfVar = (lhf) k.b;
                str2.getClass();
                lhfVar.b |= 1;
                lhfVar.c = str2;
            } else {
                i = i4;
            }
            if ((gtxVar.b & 2) != 0) {
                int i5 = gtxVar.d;
                if (!k.b.M()) {
                    k.t();
                }
                lhf lhfVar2 = (lhf) k.b;
                lhfVar2.b |= 2;
                lhfVar2.d = i5;
            }
            if ((gtxVar.b & 4) != 0) {
                int i6 = gtxVar.e;
                if (!k.b.M()) {
                    k.t();
                }
                lhf lhfVar3 = (lhf) k.b;
                lhfVar3.b |= 4;
                lhfVar3.e = i6;
            }
            int i7 = gtxVar.b;
            if ((i7 & 8) == 0 && (i7 & 16) == 0) {
                gvyVar = gvyVar2;
                i2 = -1;
            } else {
                i2 = -1;
                gvyVar = gvyVar2;
                jkb a = imk.a(Duration.ofMillis(gtxVar.f).plusNanos(gtxVar.g));
                if (!k.b.M()) {
                    k.t();
                }
                lhf lhfVar4 = (lhf) k.b;
                a.getClass();
                lhfVar4.f = a;
                lhfVar4.b |= 8;
            }
            int i8 = gtxVar.b;
            if ((i8 & 32) != 0 || (i8 & 64) != 0) {
                jkb a2 = imk.a(Duration.ofMillis(gtxVar.h).plusNanos(gtxVar.i));
                if (!k.b.M()) {
                    k.t();
                }
                lhf lhfVar5 = (lhf) k.b;
                a2.getClass();
                lhfVar5.g = a2;
                lhfVar5.b |= 16;
            }
            if ((gtxVar.b & 128) != 0) {
                jkb a3 = jmv.a(gtxVar.j);
                if (!k.b.M()) {
                    k.t();
                }
                lhf lhfVar6 = (lhf) k.b;
                a3.getClass();
                lhfVar6.h = a3;
                lhfVar6.b |= 32;
            }
            if ((gtxVar.b & 512) != 0) {
                int y = a.y(gtxVar.l);
                if (y == 0) {
                    y = 1;
                }
                int i9 = y - 1;
                int i10 = i9 != 0 ? i9 != 1 ? i9 != 2 ? i : 3 : 2 : 1;
                if (!k.b.M()) {
                    k.t();
                }
                lhf lhfVar7 = (lhf) k.b;
                lhfVar7.j = i10 - 1;
                lhfVar7.b |= 128;
            }
            if ((gtxVar.b & 1024) != 0) {
                boolean z3 = gtxVar.m;
                if (!k.b.M()) {
                    k.t();
                }
                lhf lhfVar8 = (lhf) k.b;
                lhfVar8.b |= 256;
                lhfVar8.k = z3;
            }
            if ((gtxVar.b & 32) != 0) {
                jkb a4 = imk.a(Duration.ofMillis(gtxVar.h).plusNanos(gtxVar.i));
                if (!k.b.M()) {
                    k.t();
                }
                lhf lhfVar9 = (lhf) k.b;
                a4.getClass();
                lhfVar9.g = a4;
                lhfVar9.b |= 16;
            }
            if (gtxVar.e == i2) {
                str = gtxVar.c;
            }
            if ((gtxVar.b & 256) != 0) {
                boolean z4 = gtxVar.k;
                if (!k.b.M()) {
                    k.t();
                }
                lhf lhfVar10 = (lhf) k.b;
                lhfVar10.b |= 64;
                lhfVar10.i = z4;
            }
            gtz bg = bg(gtxVar.d, gxf.a, sparseArray);
            if (bg.b()) {
                if (((gxe) bg.a()).a().f()) {
                    lew lewVar = (lew) ((gxe) bg.a()).a().b();
                    if (!k.b.M()) {
                        k.t();
                    }
                    lhf lhfVar11 = (lhf) k.b;
                    lhfVar11.m = lewVar;
                    lhfVar11.b |= 1024;
                }
                if (((gxe) bg.a()).b()) {
                    if (!k.b.M()) {
                        k.t();
                    }
                    lhf lhfVar12 = (lhf) k.b;
                    lhfVar12.b |= 512;
                    lhfVar12.l = true;
                }
            }
            gtz bg2 = bg(gtxVar.d, eif.a, sparseArray);
            if (bg2.b()) {
                long longValue = ((Long) bg2.a()).longValue();
                if (!k.b.M()) {
                    k.t();
                }
                lhf lhfVar13 = (lhf) k.b;
                lhfVar13.b |= 2048;
                lhfVar13.n = longValue;
            }
            gtz bg3 = bg(gtxVar.d, eif.b, sparseArray);
            if (bg3.b()) {
                long longValue2 = ((Long) bg3.a()).longValue();
                if (!k.b.M()) {
                    k.t();
                }
                lhf lhfVar14 = (lhf) k.b;
                lhfVar14.b |= 4096;
                lhfVar14.o = longValue2;
            }
            Duration plusNanos = Duration.ofMillis(gtxVar.f).plusNanos(gtxVar.g);
            Duration plus = plusNanos.plus(Duration.ofMillis(gtxVar.h).plusNanos(gtxVar.i));
            if (plusNanos.compareTo(ofNanos) < 0) {
                ofNanos = plusNanos;
            }
            if (plus.compareTo(ofNanos2) > 0) {
                ofNanos2 = plus;
            }
            int i11 = gtxVar.b;
            if ((i11 & 2048) != 0 && (i11 & 4096) != 0 && (i11 & 8192) != 0) {
                int i12 = gtxVar.n;
                if (!k.b.M()) {
                    k.t();
                }
                jkp jkpVar = k.b;
                lhf lhfVar15 = (lhf) jkpVar;
                lhfVar15.b |= 8192;
                lhfVar15.p = i12;
                int i13 = gtxVar.o;
                if (!jkpVar.M()) {
                    k.t();
                }
                jkp jkpVar2 = k.b;
                lhf lhfVar16 = (lhf) jkpVar2;
                lhfVar16.b |= 16384;
                lhfVar16.q = i13;
                int i14 = gtxVar.p;
                if (!jkpVar2.M()) {
                    k.t();
                }
                lhf lhfVar17 = (lhf) k.b;
                lhfVar17.b |= 32768;
                lhfVar17.u = i14;
            }
            hegVar.h((lhf) k.q());
            gvyVar2 = gvyVar;
            i4 = i;
        }
        gvy gvyVar3 = gvyVar2;
        jkj k2 = lhg.a.k();
        long aj = aj(gvyVar3);
        if (!k2.b.M()) {
            k2.t();
        }
        jkp jkpVar3 = k2.b;
        lhg lhgVar2 = (lhg) jkpVar3;
        lhgVar2.b |= 1;
        lhgVar2.c = aj;
        boolean z5 = gxoVar.c;
        if (!jkpVar3.M()) {
            k2.t();
        }
        lhg lhgVar3 = (lhg) k2.b;
        lhgVar3.b |= 32;
        lhgVar3.i = z5;
        hel g = hegVar.g();
        if (!k2.b.M()) {
            k2.t();
        }
        lhg lhgVar4 = (lhg) k2.b;
        jkx jkxVar3 = lhgVar4.d;
        if (!jkxVar3.c()) {
            lhgVar4.d = jkp.A(jkxVar3);
        }
        jiz.f(g, lhgVar4.d);
        hel helVar = gxoVar.f;
        if (!k2.b.M()) {
            k2.t();
        }
        lhg lhgVar5 = (lhg) k2.b;
        jkx jkxVar4 = lhgVar5.m;
        if (!jkxVar4.c()) {
            lhgVar5.m = jkp.A(jkxVar4);
        }
        jiz.f(helVar, lhgVar5.m);
        if ((gvyVar3.b & 4) != 0) {
            jmh b = jmx.b(gvyVar3.f);
            if (!k2.b.M()) {
                k2.t();
            }
            lhg lhgVar6 = (lhg) k2.b;
            b.getClass();
            lhgVar6.e = b;
            lhgVar6.b |= 2;
        }
        int i15 = gvyVar3.b;
        if ((i15 & 8) != 0 || (i15 & 16) != 0) {
            jkb a5 = imk.a(Duration.ofMillis(gvyVar3.g).plusNanos(gvyVar3.h));
            if (!k2.b.M()) {
                k2.t();
            }
            lhg lhgVar7 = (lhg) k2.b;
            a5.getClass();
            lhgVar7.f = a5;
            lhgVar7.b |= 4;
        }
        if ((gvyVar3.b & 64) != 0) {
            int aE = aE(gvyVar3.j);
            if (aE == 0) {
                aE = 1;
            }
            int i16 = aE - 1;
            int i17 = i16 != 0 ? i16 != 1 ? 3 : 2 : 1;
            if (!k2.b.M()) {
                k2.t();
            }
            lhg lhgVar8 = (lhg) k2.b;
            lhgVar8.h = i17 - 1;
            lhgVar8.b |= 16;
        }
        gsk gskVar = gvyVar3.i;
        if (gskVar == null) {
            gskVar = gsk.a;
        }
        jkj k3 = lhe.a.k();
        if ((gskVar.b & 1) != 0) {
            jkj k4 = lhd.a.k();
            gsj gsjVar = gskVar.c;
            if (gsjVar == null) {
                gsjVar = gsj.a;
            }
            int i18 = gsjVar.c;
            if (!k4.b.M()) {
                k4.t();
            }
            lhd lhdVar = (lhd) k4.b;
            lhdVar.b |= 1;
            lhdVar.c = i18;
            lhd lhdVar2 = (lhd) k4.q();
            if (!k3.b.M()) {
                k3.t();
            }
            lhe lheVar = (lhe) k3.b;
            lhdVar2.getClass();
            lheVar.c = lhdVar2;
            lheVar.b |= 1;
            z2 = true;
        } else {
            z2 = false;
        }
        if ((gskVar.b & 2) != 0) {
            jkj k5 = lhc.a.k();
            gsi gsiVar = gskVar.d;
            if (gsiVar == null) {
                gsiVar = gsi.a;
            }
            jkb a6 = jmv.a(gsiVar.c);
            if (!k5.b.M()) {
                k5.t();
            }
            jkp jkpVar4 = k5.b;
            lhc lhcVar = (lhc) jkpVar4;
            a6.getClass();
            lhcVar.c = a6;
            lhcVar.b |= 1;
            gsi gsiVar2 = gskVar.d;
            if (gsiVar2 == null) {
                gsiVar2 = gsi.a;
            }
            int i19 = gsiVar2.d;
            if (!jkpVar4.M()) {
                k5.t();
            }
            lhc lhcVar2 = (lhc) k5.b;
            lhcVar2.b |= 2;
            lhcVar2.d = i19;
            lhc lhcVar3 = (lhc) k5.q();
            if (!k3.b.M()) {
                k3.t();
            }
            lhe lheVar2 = (lhe) k3.b;
            lhcVar3.getClass();
            lheVar2.d = lhcVar3;
            lheVar2.b |= 2;
        } else if (!z2) {
            empty = Optional.empty();
            if (empty.isPresent()) {
                Object obj = empty.get();
                if (!k2.b.M()) {
                    k2.t();
                }
                lhg lhgVar9 = (lhg) k2.b;
                lhgVar9.g = (lhe) obj;
                lhgVar9.b |= 8;
            }
            f = gxoVar.d;
            if (f > 0.0f) {
                if (!k2.b.M()) {
                    k2.t();
                }
                lhg lhgVar10 = (lhg) k2.b;
                lhgVar10.b |= 64;
                lhgVar10.l = f;
            }
            if (gvyVar3.k.size() > 0 && gvyVar3.l.size() > 0) {
                jkx jkxVar5 = gvyVar3.k;
                if (!k2.b.M()) {
                    k2.t();
                }
                lhg lhgVar11 = (lhg) k2.b;
                jkxVar = lhgVar11.j;
                if (!jkxVar.c()) {
                    lhgVar11.j = jkp.A(jkxVar);
                }
                jiz.f(jkxVar5, lhgVar11.j);
                jkx jkxVar6 = gvyVar3.l;
                if (!k2.b.M()) {
                    k2.t();
                }
                lhg lhgVar12 = (lhg) k2.b;
                jkxVar2 = lhgVar12.k;
                if (!jkxVar2.c()) {
                    lhgVar12.k = jkp.A(jkxVar2);
                }
                jiz.f(jkxVar6, lhgVar12.k);
            }
            if (gxoVar.e ? gvyVar3.e.size() != 1 || !Duration.ofMillis(gvyVar3.g).plusNanos(gvyVar3.h).equals(ofNanos2) || (gvyVar3.b & 32) != 0 : gvyVar3.e.size() != 1 || !ofNanos.equals(ofNanos2) || (gvyVar3.b & 32) != 0) {
            }
            lhgVar = (lhg) k2.q();
            if (lhgVar == null) {
                return new gxm(lhgVar, new eik(str), z);
            }
            throw new NullPointerException("Null traceRecord");
        }
        empty = Optional.of((lhe) k3.q());
        if (empty.isPresent()) {
        }
        f = gxoVar.d;
        if (f > 0.0f) {
        }
        if (gvyVar3.k.size() > 0) {
            jkx jkxVar52 = gvyVar3.k;
            if (!k2.b.M()) {
            }
            lhg lhgVar112 = (lhg) k2.b;
            jkxVar = lhgVar112.j;
            if (!jkxVar.c()) {
            }
            jiz.f(jkxVar52, lhgVar112.j);
            jkx jkxVar62 = gvyVar3.l;
            if (!k2.b.M()) {
            }
            lhg lhgVar122 = (lhg) k2.b;
            jkxVar2 = lhgVar122.k;
            if (!jkxVar2.c()) {
            }
            jiz.f(jkxVar62, lhgVar122.k);
        }
        z = gxoVar.e ? false : false;
        lhgVar = (lhg) k2.q();
        if (lhgVar == null) {
        }
    }

    public static void am(bd bdVar, Intent intent) {
        Intent intent2 = new Intent(intent);
        gvr o = gvx.o(intent2);
        try {
            Context x = bdVar.x();
            if (glo.aS(intent2, x == null ? null : x.getApplicationContext())) {
                gvx.k(intent2);
            }
            bdVar.ay(intent2);
            o.close();
        } catch (Throwable th) {
            try {
                o.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void an(bd bdVar, Intent intent, int i) {
        Intent intent2 = new Intent(intent);
        gvr o = gvx.o(intent2);
        try {
            bdVar.az(intent2, i);
            o.close();
        } catch (Throwable th) {
            try {
                o.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static hvi ao(hvi hviVar, Class cls, gzf gzfVar, Executor executor) {
        return hso.f(hviVar, cls, gvx.a(gzfVar), executor);
    }

    public static hvi ap(hvi hviVar, Class cls, htr htrVar, Executor executor) {
        return hso.g(hviVar, cls, gvx.c(htrVar), executor);
    }

    public static hvi aq(Runnable runnable, Executor executor) {
        return hnu.aL(gvx.h(runnable), executor);
    }

    public static hvi ar(Callable callable, Executor executor) {
        return hnu.aM(gvx.i(callable), executor);
    }

    public static hvi as(htq htqVar, Executor executor) {
        return hnu.aN(gvx.b(htqVar), executor);
    }

    public static hvi at(hvi hviVar, gzf gzfVar, Executor executor) {
        return hti.f(hviVar, gvx.a(gzfVar), executor);
    }

    public static hvi au(hvi hviVar, htr htrVar, Executor executor) {
        return hti.g(hviVar, gvx.c(htrVar), executor);
    }

    public static void av(hvi hviVar, hut hutVar, Executor executor) {
        hnu.aS(hviVar, gvx.f(hutVar), executor);
    }

    public static hvi aw(hvi hviVar, Callable callable, Executor executor) {
        return hnu.bL(hviVar, gvx.i(callable), executor);
    }

    public static hvi ax(hvi hviVar, htq htqVar, Executor executor) {
        hvi aN = hnu.aN(new gvt(gvx.b(htqVar), hviVar, 1), new fwo(hviVar, executor, 2));
        hnu.bM(hviVar, aN);
        return aN;
    }

    public static void ay() {
        gta.x(false);
    }

    public static boolean az(guq guqVar) {
        return (guqVar == null || (guqVar instanceof gsr) || (guqVar instanceof gtm) || (guqVar instanceof gtw) || (guqVar instanceof gtq)) ? false : true;
    }

    public static Object b(Deque deque) {
        Iterator it = (Iterator) deque.getFirst();
        if (!it.hasNext()) {
            deque.removeFirst();
            return null;
        }
        Object next = it.next();
        next.getClass();
        return next;
    }

    private static String ba(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String str = obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj));
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str), (Throwable) e);
            return "<" + str + " threw " + e.getClass().getName() + ">";
        }
    }

    private static String bb(int i, int i2, String str) {
        if (i < 0) {
            return w("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return w("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(a.Y(i2, "negative size: "));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static View bc(ViewParent viewParent) {
        if (viewParent instanceof View) {
            return (View) viewParent;
        }
        if (viewParent != 0) {
            return bc(viewParent.getParent());
        }
        return null;
    }

    private static qy bd(int i, View view) {
        return (qy) view.getTag(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [gxq, java.lang.Object] */
    private static gzp be(int i, View view, gzp gzpVar) {
        gxv gxvVar;
        if (gzpVar.f()) {
            ?? b = gzpVar.b();
            qy bd = bd(i, view);
            if (bd != null && !bd.isEmpty()) {
                Class<?> cls = b.getClass();
                int i2 = 0;
                while (true) {
                    if (i2 >= bd.d) {
                        gxvVar = gxv.b;
                        break;
                    }
                    Class cls2 = (Class) bd.c(i2);
                    gxu gxuVar = (gxu) bd.f(i2);
                    if (cls2.isAssignableFrom(cls)) {
                        gxvVar = gxuVar.a(b);
                        break;
                    }
                    i2++;
                }
            } else {
                gxvVar = gxv.b;
            }
            if (gxvVar == gxv.a) {
                return gyf.a;
            }
            if (gxvVar != gxv.b) {
                return gzp.h(gxvVar.c);
            }
        }
        return gzpVar;
    }

    private static void bf(int i, gxq gxqVar, View view) {
        fao.c();
        gzp h = gzp.h(gxqVar);
        View view2 = view;
        while (view2 != null) {
            if (view2 != view || i == com.google.android.apps.authenticator2.R.id.tiktok_event_view_listeners) {
                h = be(com.google.android.apps.authenticator2.R.id.tiktok_event_view_listeners, view2, h);
            }
            if (view2 != view || i != com.google.android.apps.authenticator2.R.id.tiktok_event_activity_listeners) {
                h = be(com.google.android.apps.authenticator2.R.id.tiktok_event_fragment_listeners, view2, h);
            }
            h = be(com.google.android.apps.authenticator2.R.id.tiktok_event_activity_listeners, view2, h);
            if (!h.f()) {
                return;
            }
            Object tag = view2.getTag(com.google.android.apps.authenticator2.R.id.tiktok_event_parent);
            if (tag != null && !(tag instanceof View)) {
                throw new IllegalStateException("Invalid tag returned: " + String.valueOf(tag.getClass()) + tag.toString() + " for view " + view2.toString());
            }
            View view3 = (View) tag;
            view2 = view3 != null ? view3 : bc(view2.getParent());
        }
    }

    private static gtz bg(int i, hoq hoqVar, SparseArray sparseArray) {
        return guc.j(hoqVar, (guc) sparseArray.get(i, gub.a));
    }

    public static /* synthetic */ boolean c(int i, hkq hkqVar, StringBuilder sb) {
        if (i - 1 != 0 || hkqVar == hkq.a) {
            return false;
        }
        sb.append(hkqVar.b());
        sb.append('.');
        sb.append(hkqVar.d());
        sb.append(':');
        sb.append(hkqVar.a());
        return true;
    }

    public static void d(char c, String str, Map map) {
        map.put(Character.valueOf(c), str);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010e A[EDGE_INSN: B:75:0x010e->B:69:0x010e BREAK  A[LOOP:2: B:35:0x009a->B:73:0x0108], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0026 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static hpn e(String str) {
        int i;
        char[] cArr;
        int length;
        int i2;
        String str2 = str;
        hnu hnuVar = hpm.a;
        int length2 = str2.length();
        int i3 = 0;
        while (i3 != length2) {
            int i4 = i3 + 1;
            char charAt = str2.charAt(i3);
            if (charAt <= '~') {
                if (charAt >= ' ') {
                    i3 = i4;
                }
                if (charAt < 55296) {
                    if (charAt > 57343) {
                        if (charAt >= 64976) {
                            if (charAt > 65007) {
                                if (charAt >= 65534) {
                                }
                            }
                        }
                        i3 = i4;
                    } else {
                        int codePointAt = Character.codePointAt(str2, i3);
                        if (codePointAt >= 65536 && (codePointAt & 65534) != 65534) {
                            i3 += 2;
                        }
                    }
                    length = str2.length();
                    StringBuilder sb = new StringBuilder(length);
                    i2 = 0;
                    while (i2 < length) {
                    }
                    str2 = sb.toString();
                    hnu hnuVar2 = hpm.a;
                    str2.getClass();
                    i = 0;
                    while (true) {
                        if (i >= str2.length()) {
                        }
                        char c = r5.c;
                        i++;
                    }
                    return new hpn(str2);
                }
                if (charAt != '\n' && charAt != '\r' && charAt != '\t' && charAt != '\f') {
                    length = str2.length();
                    StringBuilder sb2 = new StringBuilder(length);
                    i2 = 0;
                    while (i2 < length) {
                        char charAt2 = str2.charAt(i2);
                        if (ikg.o(charAt2)) {
                            sb2.append(charAt2);
                            i2++;
                        } else {
                            int codePointAt2 = Character.codePointAt(str2, i2);
                            sb2.appendCodePoint(true != ikg.o(codePointAt2) ? 65533 : codePointAt2);
                            i2 += Character.charCount(codePointAt2);
                        }
                    }
                    str2 = sb2.toString();
                    hnu hnuVar22 = hpm.a;
                    str2.getClass();
                    i = 0;
                    while (true) {
                        if (i >= str2.length()) {
                            break;
                        }
                        char charAt3 = str2.charAt(i);
                        hjv hjvVar = (hjv) hnuVar22;
                        int i5 = hjvVar.b;
                        if (charAt3 < i5) {
                            char[][] cArr2 = hjvVar.a;
                            if (cArr2[charAt3] != null) {
                                int length3 = str2.length();
                                char[] a = hjx.a();
                                int length4 = a.length;
                                int i6 = 0;
                                int i7 = 0;
                                while (i < length3) {
                                    int i8 = i + 1;
                                    char charAt4 = str2.charAt(i);
                                    if (charAt4 >= i5 || (cArr = cArr2[charAt4]) == null) {
                                        char c2 = hjvVar.c;
                                        cArr = null;
                                    }
                                    if (cArr != null) {
                                        int i9 = i - i6;
                                        int i10 = i7 + i9;
                                        int length5 = cArr.length;
                                        int i11 = i10 + length5;
                                        if (length4 < i11) {
                                            int i12 = length3 - i;
                                            length4 = i12 + i12 + i11;
                                            a = hjv.a(a, i7, length4);
                                        }
                                        if (i9 > 0) {
                                            str2.getChars(i6, i, a, i7);
                                            i7 = i10;
                                        }
                                        if (length5 > 0) {
                                            System.arraycopy(cArr, 0, a, i7, length5);
                                            i7 += length5;
                                        }
                                        i6 = i8;
                                    }
                                    i = i8;
                                }
                                int i13 = length3 - i6;
                                if (i13 > 0) {
                                    int i14 = i13 + i7;
                                    if (length4 < i14) {
                                        a = hjv.a(a, i7, i14);
                                    }
                                    str2.getChars(i6, length3, a, i7);
                                    i7 = i14;
                                }
                                str2 = new String(a, 0, i7);
                            }
                        }
                        char c3 = hjvVar.c;
                        i++;
                    }
                    return new hpn(str2);
                }
                i3 = i4;
            } else {
                if (charAt < 55296 && charAt >= 160) {
                    i3 = i4;
                }
                if (charAt < 55296) {
                }
            }
        }
        hnu hnuVar222 = hpm.a;
        str2.getClass();
        i = 0;
        while (true) {
            if (i >= str2.length()) {
            }
            char c32 = hjvVar.c;
            i++;
        }
        return new hpn(str2);
    }

    public static hpo f(hpn hpnVar) {
        jkj k = hpo.a.k();
        if (!k.b.M()) {
            k.t();
        }
        String str = hpnVar.a;
        hpo hpoVar = (hpo) k.b;
        hpoVar.b |= 1;
        hpoVar.c = str;
        return (hpo) k.q();
    }

    public static void g(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void h(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public static boolean i(char c) {
        if (c < 'a' || c > 'z') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    public static Collection j(Collection collection) {
        ArrayList arrayList = new ArrayList(collection);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).getClass();
        }
        return arrayList;
    }

    public static void k(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static int l(int i, int i2, RoundingMode roundingMode) {
        roundingMode.getClass();
        if (i2 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i3 = i / i2;
        int i4 = i - (i2 * i3);
        if (i4 == 0) {
            return i3;
        }
        int i5 = ((i ^ i2) >> 31) | 1;
        switch (hro.a[roundingMode.ordinal()]) {
            case 1:
                k(false);
                return i3;
            case 2:
                return i3;
            case 3:
                if (i5 >= 0) {
                    return i3;
                }
                break;
            case 4:
                break;
            case 5:
                if (i5 <= 0) {
                    return i3;
                }
                break;
            case 6:
            case 7:
            case 8:
                int abs = Math.abs(i4);
                int abs2 = abs - (Math.abs(i2) - abs);
                if (abs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if ((i3 & 1 & (roundingMode != RoundingMode.HALF_EVEN ? 0 : 1)) == 0) {
                            return i3;
                        }
                    }
                } else if (abs2 <= 0) {
                    return i3;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i3 + i5;
    }

    public static int m(int i, int i2) {
        return hnu.ba(i + i2);
    }

    public static jkj n(Throwable th, boolean z) {
        jkj k = hrm.a.k();
        jkj k2 = hrj.a.k();
        if (!k2.b.M()) {
            k2.t();
        }
        hrj hrjVar = (hrj) k2.b;
        hrjVar.b |= 1;
        hrjVar.c = "";
        if (!k.b.M()) {
            k.t();
        }
        hrm hrmVar = (hrm) k.b;
        hrj hrjVar2 = (hrj) k2.q();
        hrjVar2.getClass();
        hrmVar.e = hrjVar2;
        hrmVar.b |= 1;
        IdentityHashMap identityHashMap = new IdentityHashMap();
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(th);
        identityHashMap.put(th, 0);
        arrayList.add(o(th, z));
        while (!arrayDeque.isEmpty()) {
            Throwable th2 = (Throwable) arrayDeque.remove();
            Integer num = (Integer) identityHashMap.get(th2);
            num.getClass();
            int intValue = num.intValue();
            if (th2.getCause() != null) {
                Throwable cause = th2.getCause();
                if (!identityHashMap.containsKey(cause)) {
                    identityHashMap.put(cause, Integer.valueOf(identityHashMap.size()));
                    arrayList.add(o(cause, z));
                    arrayDeque.add(cause);
                }
                jkj jkjVar = (jkj) arrayList.get(intValue);
                int intValue2 = ((Integer) identityHashMap.get(cause)).intValue();
                if (!jkjVar.b.M()) {
                    jkjVar.t();
                }
                hrl hrlVar = (hrl) jkjVar.b;
                hrl hrlVar2 = hrl.a;
                hrlVar.b |= 2;
                hrlVar.d = intValue2;
            }
            for (Throwable th3 : th2.getSuppressed()) {
                if (!identityHashMap.containsKey(th3)) {
                    identityHashMap.put(th3, Integer.valueOf(identityHashMap.size()));
                    arrayList.add(o(th3, z));
                    arrayDeque.add(th3);
                }
                jkj jkjVar2 = (jkj) arrayList.get(intValue);
                int intValue3 = ((Integer) identityHashMap.get(th3)).intValue();
                if (!jkjVar2.b.M()) {
                    jkjVar2.t();
                }
                hrl hrlVar3 = (hrl) jkjVar2.b;
                hrl hrlVar4 = hrl.a;
                jkt jktVar = hrlVar3.e;
                if (!jktVar.c()) {
                    hrlVar3.e = jkp.y(jktVar);
                }
                hrlVar3.e.g(intValue3);
            }
        }
        jkj k3 = hrk.a.k();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            jkj jkjVar3 = (jkj) arrayList.get(i);
            if (!k3.b.M()) {
                k3.t();
            }
            hrk hrkVar = (hrk) k3.b;
            hrl hrlVar5 = (hrl) jkjVar3.q();
            hrlVar5.getClass();
            hrkVar.b();
            hrkVar.b.add(hrlVar5);
        }
        if (!k.b.M()) {
            k.t();
        }
        hrm hrmVar2 = (hrm) k.b;
        hrk hrkVar2 = (hrk) k3.q();
        hrkVar2.getClass();
        hrmVar2.d = hrkVar2;
        hrmVar2.c = 4;
        return k;
    }

    public static jkj o(Throwable th, boolean z) {
        jkj k = hrl.a.k();
        jkj aZ = aZ(th, z);
        if (!k.b.M()) {
            k.t();
        }
        hrl hrlVar = (hrl) k.b;
        hrj hrjVar = (hrj) aZ.q();
        hrjVar.getClass();
        hrlVar.c = hrjVar;
        hrlVar.b |= 1;
        return k;
    }

    public static jkj p(Throwable th) {
        jkj k = hrm.a.k();
        jkj aZ = aZ(th, false);
        if (!k.b.M()) {
            k.t();
        }
        hrm hrmVar = (hrm) k.b;
        hrj hrjVar = (hrj) aZ.q();
        hrjVar.getClass();
        hrmVar.e = hrjVar;
        hrmVar.b |= 1;
        while (true) {
            th = th.getCause();
            if (th == null) {
                return k;
            }
            jkj aZ2 = aZ(th, false);
            if (!k.b.M()) {
                k.t();
            }
            hrm hrmVar2 = (hrm) k.b;
            hrj hrjVar2 = (hrj) aZ2.q();
            hrjVar2.getClass();
            hrmVar2.b();
            hrmVar2.f.add(hrjVar2);
        }
    }

    public static int q(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return 13;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return 14;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case 35:
                return 36;
            case 36:
                return 37;
            case 37:
                return 38;
            case 38:
                return 39;
            case 39:
                return 40;
            case 40:
                return 41;
            case 41:
                return 42;
            case 42:
            case 43:
            case 44:
            default:
                return 0;
            case 45:
                return 46;
            case 46:
                return 47;
            case 47:
                return 48;
            case 48:
                return 49;
            case 49:
                return 50;
            case 50:
                return 51;
            case 51:
                return 52;
            case 52:
                return 53;
            case 53:
                return 54;
            case 54:
                return 55;
            case 55:
                return 56;
        }
    }

    public static Iterable r(Object obj) {
        File[] listFiles;
        File file = (File) obj;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            return DesugarCollections.unmodifiableList(Arrays.asList(listFiles));
        }
        int i = hel.d;
        return his.a;
    }

    public static void s(boolean z) {
        if (!z) {
            throw new haj();
        }
    }

    public static void t(boolean z, String str, Object obj) {
        if (!z) {
            throw new haj(w(str, obj));
        }
    }

    public static void u(Object obj) {
        Object[] objArr = new Object[0];
        if (obj == null) {
            throw new haj(w("expected a non-null reference", objArr));
        }
    }

    public static hac v(hac hacVar) {
        return ((hacVar instanceof hae) || (hacVar instanceof had)) ? hacVar : hacVar instanceof Serializable ? new had(hacVar) : new hae(hacVar);
    }

    public static String w(String str, Object... objArr) {
        int length;
        int indexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (indexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i2, indexOf);
            sb.append(ba(objArr[i]));
            i2 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(ba(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static void x(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void y(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void z(boolean z, String str, char c) {
        if (!z) {
            throw new IllegalArgumentException(w(str, Character.valueOf(c)));
        }
    }

    protected hoq(byte[] bArr, byte[] bArr2) {
    }
}
