package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.os.UserManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.authenticator2.R;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.material.speeddial.expandable.ExpandableFloatingActionButton;
import com.google.android.material.button.MaterialButton;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dih {
    public dih(Context context, kee keeVar) {
        if (jtl.a.bB().a((Context) keeVar.a)) {
            List list = cji.n;
            cjd cjdVar = new cjd(context, "PROFILE_SYNC_VERBOSE");
            cjdVar.b(cjy.c);
            cjdVar.a();
        } else {
            new cji(context, "PROFILE_SYNC_VERBOSE", null);
        }
    }

    public static cmn A() {
        dih dihVar = cwz.b;
        cmp cmpVar = new cmp(-1, -1, 0, true);
        Parcelable.Creator creator = cmn.CREATOR;
        return ox.x(cmpVar, false, false);
    }

    public static cmn B() {
        cmn A = A();
        return ox.x(A.b, true, A.d);
    }

    public static final ijx D(cve cveVar) {
        cvc cvcVar = (cvc) cveVar;
        if ((cvcVar.b & 1) == 0) {
            return null;
        }
        ijx ijxVar = cvcVar.c;
        return ijxVar == null ? ijx.a : ijxVar;
    }

    public static final void E(Runnable runnable) {
        Thread thread = new Thread(runnable, "PsdCollector");
        thread.setPriority(4);
        thread.start();
    }

    public static final Bitmap F(Activity activity) {
        try {
            return cms.l(activity.getWindow().getDecorView().getRootView());
        } catch (Exception e) {
            Log.w("gF_FeedbackClient", "Get screenshot failed!", e);
            return null;
        }
    }

    public static final Object G(dqy dqyVar, dov dovVar, jit jitVar) {
        hel g = ((dsg) dqyVar).g();
        g.getClass();
        boolean z = false;
        hjs listIterator = g.listIterator(0);
        Object obj = null;
        while (listIterator.hasNext()) {
            Object next = listIterator.next();
            if (ksp.b(dovVar.c(next), jitVar.c)) {
                if (z) {
                    return null;
                }
                z = true;
                obj = next;
            }
        }
        if (z) {
            return obj;
        }
        return null;
    }

    public static final ehv H(dqy dqyVar, dov dovVar) {
        Object a = dqyVar.a();
        ehs at = a != null ? at(a, dovVar) : null;
        hel g = ((dsg) dqyVar).g();
        g.getClass();
        ArrayList arrayList = new ArrayList();
        hjs listIterator = g.listIterator(0);
        while (listIterator.hasNext()) {
            E next = listIterator.next();
            if (!ksp.b(next, a)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(ixc.w(arrayList));
        for (Object obj : arrayList) {
            obj.getClass();
            arrayList2.add(at(obj, dovVar));
        }
        return new eht(at, arrayList2);
    }

    public static final void I(View view, String str) {
        if (str == null) {
            yq.l(view, null);
        } else {
            yq.l(view, new ehk(str));
        }
    }

    public static final String J(jhh jhhVar, Context context) {
        String string;
        jhhVar.getClass();
        jhc jhcVar = jhhVar.a;
        if (jhcVar instanceof jhg) {
            return ((jhg) jhcVar).a;
        }
        if (!(jhcVar instanceof jhe)) {
            if (jhcVar instanceof jhd) {
                context.getResources();
                throw null;
            }
            if (!(jhcVar instanceof jhf)) {
                throw new koj();
            }
            throw null;
        }
        jhe jheVar = (jhe) jhcVar;
        List list = jheVar.b;
        if (list.isEmpty()) {
            string = context.getString(jheVar.a);
        } else {
            int i = jheVar.a;
            Object[] array = list.toArray(new Object[0]);
            string = context.getString(i, Arrays.copyOf(array, array.length));
        }
        string.getClass();
        return string;
    }

    public static hvi K(final cmz cmzVar, final gzf gzfVar, final Executor executor) {
        final hvw hvwVar = new hvw();
        cmzVar.f(new cnd() { // from class: ehb
            @Override // defpackage.cnd
            public final void a(final cnc cncVar) {
                Status b = cncVar.b();
                if (b.f == 14) {
                    throw new AssertionError("We never use the blocking API for these calls: ".concat(String.valueOf(String.valueOf(cncVar))));
                }
                final hvw hvwVar2 = hvw.this;
                if (b.c()) {
                    final gzf gzfVar2 = gzfVar;
                    executor.execute(new Runnable() { // from class: eha
                        @Override // java.lang.Runnable
                        public final void run() {
                            gzf gzfVar3 = gzfVar2;
                            hvw hvwVar3 = hvw.this;
                            cnc cncVar2 = cncVar;
                            try {
                                try {
                                    hvwVar3.o(gzfVar3.a(cncVar2));
                                } catch (RuntimeException e) {
                                    hvwVar3.p(e);
                                }
                            } finally {
                                dih.L(cncVar2);
                            }
                        }
                    });
                } else {
                    hvwVar2.p(new egw(cncVar, b));
                    dih.L(cncVar);
                }
            }
        }, TimeUnit.SECONDS);
        hvwVar.c(gvx.h(new Runnable() { // from class: ehc
            @Override // java.lang.Runnable
            public final void run() {
                if (hvw.this.isCancelled()) {
                    cmzVar.d();
                }
            }
        }), huf.a);
        return hvwVar;
    }

    public static void L(cnc cncVar) {
        if (cncVar instanceof cna) {
            ((cna) cncVar).a();
        }
    }

    public static final void M(String str, List list, Map map) {
        if (map.containsKey(str)) {
            return;
        }
        list.add(str);
        efz a = ega.a();
        a.b(str);
        map.put(str, a);
    }

    public static /* synthetic */ String N(int i) {
        return i != 1 ? "MENAGERIE" : "MDI";
    }

    public static int O(int i) {
        if (i == 32) {
            return 0;
        }
        if (i == 48) {
            return 1;
        }
        if (i != 120) {
            return i != 240 ? 2 : 5;
        }
        return 3;
    }

    public static int P(Context context, int i) {
        if (i <= 0) {
            return 64;
        }
        float f = i / context.getResources().getDisplayMetrics().density;
        int[] iArr = {32, 48, 64, 120, 240};
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                throw null;
            }
            if (f <= i3) {
                return i3;
            }
        }
        return 240;
    }

    public static /* synthetic */ String Q(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "SECURITY_ADVISOR" : "OBAKE" : "CRITICAL_ALERT" : "UNKNOWN";
    }

    public static gzp R(ImageView imageView) {
        Object tag = imageView.getTag(R.id.og_avatar_size_hint);
        return tag instanceof Integer ? gzp.h((Integer) tag) : gyf.a;
    }

    public static final Drawable S(Context context) {
        Drawable f = e.f(context, R.drawable.quantum_gm_ic_account_circle_vd_theme_24);
        af(f, ab(context) ? am(context, R.attr.colorPrimaryGoogle) : ecy.b(context).a(ecw.BLUE));
        return f;
    }

    public static void T(View view) {
        view.setSystemUiVisibility(view.getSystemUiVisibility() | 1280);
        view.setSystemUiVisibility(view.getSystemUiVisibility() | 512);
    }

    public static void U(View view, boolean z, boolean z2) {
        if (!z) {
            view.setSystemUiVisibility(view.getSystemUiVisibility() & (-8193));
            return;
        }
        view.setSystemUiVisibility(view.getSystemUiVisibility() & (-8193));
        if (z2) {
            view.setSystemUiVisibility(view.getSystemUiVisibility() | 8192);
        }
    }

    public static final aer V(bd bdVar) {
        if (bdVar.R == null) {
            return bdVar;
        }
        try {
            return bdVar.M();
        } catch (IllegalStateException unused) {
            return bdVar;
        }
    }

    public static void W(Runnable runnable) {
        if (fao.g()) {
            runnable.run();
        } else {
            fao.e(runnable);
        }
    }

    public static boolean X(Context context) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        return (accessibilityManager == null || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || enabledAccessibilityServiceList.isEmpty()) ? false : true;
    }

    public static final void Y(View view, int i) {
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setGravity(i | 16);
        }
    }

    public static float Z(DisplayMetrics displayMetrics, int i) {
        return i * displayMetrics.density;
    }

    public static int aa(DisplayMetrics displayMetrics, int i) {
        return (int) Z(displayMetrics, i);
    }

    public static boolean ab(Context context) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.isMaterialTheme, R.attr.colorPrimaryGoogle});
        boolean z = false;
        try {
            if (obtainStyledAttributes.getBoolean(0, false)) {
                if (obtainStyledAttributes.hasValue(1)) {
                    z = true;
                }
            }
            return z;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static Drawable ac(Context context, int i, int i2) {
        Drawable f = e.f(context, i);
        af(f, i2);
        return f;
    }

    public static int ad(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.actionBarItemBackground});
        try {
            return obtainStyledAttributes.getResourceId(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static void ae(Drawable drawable, ColorStateList colorStateList) {
        boolean z = true;
        if (!fao.g() && drawable.getCallback() != null) {
            z = false;
        }
        hoq.I(z, "Tinting drawables with callback from background thread might trigger UI code on the background thread.");
        drawable.mutate().setTintList(colorStateList);
    }

    public static void af(Drawable drawable, int i) {
        ae(drawable, ColorStateList.valueOf(i));
    }

    public static final Intent ag(String str, iiw iiwVar, gzp gzpVar) {
        str.getClass();
        iiwVar.getClass();
        Intent intent = new Intent();
        intent.setAction("com.google.android.gms.accountsettings.action.VIEW_SETTINGS");
        intent.setPackage("com.google.android.gms").putExtra("extra.screenId", iiwVar.c).putExtra("extra.utmSource", "OG").putExtra("extra.accountName", str).putExtra("extra.themeChoice", 0);
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(iiwVar.d);
        unmodifiableMap.getClass();
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            str2.getClass();
            intent.putExtra("extra.screen.".concat(str2), str3);
        }
        String str4 = (String) gzpVar.e();
        if (str4 != null) {
            intent.putExtra("extra.utmMedium", str4);
        }
        return intent;
    }

    public static ThreadFactory ah() {
        ids idsVar = new ids((char[]) null, (byte[]) null);
        idsVar.n("OneGoogle #%d");
        idsVar.m(false);
        hoq.D(true, "Thread priority (%s) must be >= %s", 5, 1);
        hoq.D(true, "Thread priority (%s) must be <= %s", 5, 10);
        idsVar.a = 5;
        idsVar.b = new dfq(2);
        return ids.p(idsVar);
    }

    public static void ai(afc afcVar, Object obj) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            afcVar.i(obj);
        } else {
            afcVar.k(obj);
        }
    }

    public static String aj(Throwable th) {
        String simpleName = th.getClass().getSimpleName();
        return simpleName.endsWith("Exception") ? simpleName.contains("$") ? simpleName.substring(simpleName.lastIndexOf(36) + 1) : simpleName : th instanceof cmm ? "ApiException" : "ObfuscatedException";
    }

    public static Throwable ak(Throwable th, Class cls) {
        if (th == null) {
            return null;
        }
        return th.getClass().equals(cls) ? th : ak(th.getCause(), cls);
    }

    public static Object al(Context context, Class cls) {
        context.getClass();
        for (int i = 0; i < 1000; i++) {
            if (cls.isInstance(context)) {
                return cls.cast(context);
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static int am(Context context, int i) {
        return context.getResources().getColor(ao(context, i).resourceId);
    }

    public static int an(Context context, int i) {
        return TypedValue.complexToDimensionPixelSize(ao(context, i).data, context.getResources().getDisplayMetrics());
    }

    public static TypedValue ao(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        throw new IllegalStateException("Attribute not available.");
    }

    public static boolean ap(Context context) {
        UserManager userManager = (UserManager) context.getSystemService("user");
        return userManager == null || !userManager.hasUserRestriction("no_modify_accounts");
    }

    public static Object aq(dov dovVar, Object obj, her herVar, Object obj2) {
        if (obj == null || !dovVar.i(obj)) {
            return null;
        }
        Object obj3 = herVar.get(dovVar.d(obj));
        return obj3 != null ? obj3 : obj2;
    }

    public static Object ar(Class cls, String str, fwm... fwmVarArr) {
        int length = fwmVarArr.length;
        Class<?>[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        for (int i = 0; i < fwmVarArr.length; i++) {
            fwm fwmVar = fwmVarArr[i];
            fwmVar.getClass();
            clsArr[i] = (Class) fwmVar.a;
            objArr[i] = fwmVarArr[i].b;
        }
        return cls.getDeclaredMethod(str, clsArr).invoke(null, objArr);
    }

    private static Object as(ddi ddiVar) {
        if (ddiVar.f()) {
            return ddiVar.d();
        }
        if (((ddm) ddiVar).c) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(ddiVar.c());
    }

    private static final ehs at(Object obj, dov dovVar) {
        int i;
        String f = dovVar.f(obj);
        String h = dovVar.h(obj);
        String g = dovVar.g(obj);
        jkj k = jit.a.k();
        k.getClass();
        String c = dovVar.c(obj);
        c.getClass();
        ilo.b(c, k);
        jit a = ilo.a(k);
        boolean i2 = dovVar.i(obj);
        String d = dovVar.d(obj);
        d.getClass();
        dox b = dovVar.b(obj);
        ehr ehrVar = new ehr(a, i2, f, d, h, g, b != null ? b.a : false);
        String e = dovVar.e(obj);
        dke a2 = dovVar.a(obj);
        dox b2 = dovVar.b(obj);
        int i3 = 3;
        if (b2 != null && (i = b2.b) != 0) {
            i3 = i;
        }
        return new ehs(ehrVar, e, a2, i3);
    }

    public static boolean b(Context context) {
        return "com.google.android.gms".equals(context.getPackageName());
    }

    public static final long c() {
        return Instant.now().toEpochMilli();
    }

    public static hvi d(ddi ddiVar) {
        final djt djtVar = new djt(ddiVar);
        ddiVar.h(huf.a, new ddc() { // from class: djs
            @Override // defpackage.ddc
            public final void a(ddi ddiVar2) {
                boolean z = ((ddm) ddiVar2).c;
                djt djtVar2 = djt.this;
                if (z) {
                    djtVar2.cancel(false);
                    return;
                }
                if (ddiVar2.f()) {
                    djtVar2.o(ddiVar2.d());
                    return;
                }
                Exception c = ddiVar2.c();
                if (c == null) {
                    throw new IllegalStateException();
                }
                djtVar2.p(c);
            }
        });
        return djtVar;
    }

    public static final void e(RuntimeException runtimeException) {
        ((hlk) ((hlk) ((hlk) dlz.a.f()).h(runtimeException)).i("com/google/android/libraries/logging/ve/handlers/result/flogger/FloggerResultDaggerModule", "provideErrorHandler", 18, "FloggerResultDaggerModule.java")).q();
    }

    public static dkx f(dlv dlvVar) {
        return (dkx) dlvVar.b().get(r1.size() - 1);
    }

    public static dkx g(dlv dlvVar) {
        return (dkx) dlvVar.b().get(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        if (r0.l.l((defpackage.jko) r6.c) != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void h(dks dksVar, List list) {
        while (dksVar != null) {
            dkx a = dksVar.a();
            boolean z = false;
            if (a != null) {
                hre hreVar = a.d;
                if (hreVar == null) {
                    hreVar = hre.a;
                }
                hoq.I((hreVar.b & 8) != 0, "Instrumented view has no VE ID.");
                list.add(a);
            }
            dks c = dksVar.b.c();
            if (c == null) {
                if (!dksVar.b.h()) {
                    iwq iwqVar = dmc.a;
                    a.g(iwqVar);
                }
                z = true;
                hoq.K(z, "Activity's content root (android.R.id.content) must be annotated with a VE. CVE root was: %s", dksVar);
                return;
            }
            dksVar = c;
        }
    }

    public static dkr i() {
        iwq iwqVar = dlf.a;
        jkj k = dle.a.k();
        if (!k.b.M()) {
            k.t();
        }
        dle dleVar = (dle) k.b;
        dleVar.d = 2;
        dleVar.b = 2 | dleVar.b;
        return new dkr(iwqVar, (dle) k.q());
    }

    public static dkr j(String str) {
        iwq iwqVar = dlf.a;
        jkj k = dle.a.k();
        if (!k.b.M()) {
            k.t();
        }
        jkp jkpVar = k.b;
        dle dleVar = (dle) jkpVar;
        dleVar.d = 1;
        dleVar.b |= 2;
        if (!jkpVar.M()) {
            k.t();
        }
        dle dleVar2 = (dle) k.b;
        dleVar2.b |= 1;
        dleVar2.c = str;
        return new dkr(iwqVar, (dle) k.q());
    }

    public static dkr k() {
        iwq iwqVar = dlf.a;
        jkj k = dle.a.k();
        if (!k.b.M()) {
            k.t();
        }
        dle dleVar = (dle) k.b;
        dleVar.d = 3;
        dleVar.b |= 2;
        return new dkr(iwqVar, (dle) k.q());
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        if (defpackage.ksp.g(r3.b, "glimitedaccount.com", false) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (defpackage.ksp.s(r0, "/seed/") == true) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final doy l(Object obj, dov dovVar) {
        boolean z;
        String d = dovVar.d(obj);
        boolean i = dovVar.i(obj);
        d.getClass();
        if (i) {
            hjt hjtVar = new hjt(d);
            if (hjtVar.c) {
                String str = hjtVar.a;
                z = false;
                if (str != null) {
                }
            }
        }
        z = true;
        return new doy(!z);
    }

    public static frt m(ikc ikcVar) {
        if (ikcVar.b.isEmpty()) {
            return null;
        }
        frq frqVar = ((ikd) ikcVar.b.get(0)).b;
        if (frqVar == null) {
            frqVar = frq.a;
        }
        jkx<frt> jkxVar = frqVar.d;
        if (jkxVar.isEmpty()) {
            return null;
        }
        for (frt frtVar : jkxVar) {
            if ((frtVar.b & 1) != 0) {
                frr frrVar = frtVar.c;
                if (frrVar == null) {
                    frrVar = frr.a;
                }
                if (frrVar.b) {
                    return frtVar;
                }
            }
        }
        return (frt) jkxVar.get(0);
    }

    public static void n(InputStream inputStream) {
        try {
            inputStream.close();
        } catch (IOException unused) {
        }
    }

    public static ExpandableFloatingActionButton o(CoordinatorLayout coordinatorLayout, View view) {
        return (ExpandableFloatingActionButton) p(coordinatorLayout, view, ExpandableFloatingActionButton.class);
    }

    public static Object p(CoordinatorLayout coordinatorLayout, View view, Class cls) {
        List a = coordinatorLayout.a(view);
        int size = a.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) a.get(i);
            if (cls.isInstance(view2)) {
                return cls.cast(view2);
            }
        }
        return null;
    }

    public static final long q() {
        return dfn.a ? SystemClock.elapsedRealtimeNanos() : SystemClock.elapsedRealtime() * 1000000;
    }

    public static final Instant r() {
        return Instant.now();
    }

    public static final Duration s() {
        return Duration.ofMillis(SystemClock.uptimeMillis());
    }

    public static final hvi t(fcu fcuVar, gzf gzfVar) {
        return fcuVar.a(gzfVar, huf.a);
    }

    public static final hvi u(hvi hviVar, gzf gzfVar) {
        huf hufVar = huf.a;
        hufVar.getClass();
        return hti.f(hviVar, gzfVar, hufVar);
    }

    public static ddi v(Exception exc) {
        ddm ddmVar = new ddm();
        ddmVar.o(exc);
        return ddmVar;
    }

    public static ddi w(Object obj) {
        ddm ddmVar = new ddm();
        ddmVar.p(obj);
        return ddmVar;
    }

    public static Object x(ddi ddiVar) {
        oy.ao("Must not be called on the main application thread");
        Looper myLooper = Looper.myLooper();
        if (myLooper != null && Objects.equals(myLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
        if (ddiVar.e()) {
            return as(ddiVar);
        }
        ddn ddnVar = new ddn();
        Executor executor = ddl.b;
        ddiVar.j(executor, ddnVar);
        ddiVar.i(executor, ddnVar);
        ddiVar.g(executor, ddnVar);
        ddnVar.a.await();
        return as(ddiVar);
    }

    public static boolean y(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void z(String str, Throwable th) {
        if (Log.isLoggable("PeopleClient", 5)) {
            Log.w("PeopleClient", str, th);
        }
    }

    public final dig a() {
        dig digVar = new dig(dij.b, Process.myTid(), true, -21, false, false);
        dij.c = digVar;
        return digVar;
    }

    public dih() {
    }
}
