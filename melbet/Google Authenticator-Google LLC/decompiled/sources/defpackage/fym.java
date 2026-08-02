package defpackage;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.authenticator2.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fym {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    /* JADX WARN: Type inference failed for: r1v20, types: [dpd, java.lang.Object] */
    public fym(fyl fylVar, frv frvVar, gpj gpjVar, fug fugVar, fyx fyxVar, fyw fywVar, gnh gnhVar, drz drzVar, dja djaVar, gzp gzpVar, ScheduledExecutorService scheduledExecutorService, dme dmeVar) {
        dsg dsgVar;
        dov dovVar;
        drz drzVar2;
        ebv ebvVar;
        efc efcVar;
        ebr ebrVar;
        dpd dpdVar;
        ExecutorService executorService;
        dme dmeVar2;
        efu efuVar;
        gpjVar.getClass();
        fyxVar.getClass();
        gnhVar.getClass();
        scheduledExecutorService.getClass();
        dmeVar.getClass();
        this.a = frvVar;
        this.b = gpjVar;
        this.c = fugVar;
        this.d = fyxVar;
        this.e = fywVar;
        fyz fyzVar = new fyz(gzpVar);
        dsg dsgVar2 = fyxVar.d;
        Context x = fylVar.x();
        final dse dseVar = new dse();
        Context applicationContext = x.getApplicationContext();
        if (applicationContext == null) {
            throw new NullPointerException("Null applicationContext");
        }
        dseVar.b = applicationContext;
        dseVar.f = ebv.a().a();
        dseVar.h = ebr.a().a();
        int i = 1;
        dseVar.n = new eeb(1);
        dseVar.d = fyzVar;
        if (dsgVar2 == null) {
            throw new NullPointerException("Null accountsModel");
        }
        dseVar.c = dsgVar2;
        dseVar.e = drzVar;
        ebu a = ebv.a();
        gzp gzpVar2 = gyf.a;
        a.b = gzp.h(new eco(gzpVar2));
        ebu ebuVar = new ebu(a.a());
        ebuVar.l = djaVar;
        dseVar.f = ebuVar.a();
        dseVar.j = fhr.k(gnhVar, fylVar, fyzVar);
        dseVar.g = new efb(fyzVar, fylVar.x());
        dseVar.h = ebr.a().a();
        dseVar.a = scheduledExecutorService;
        dseVar.m = dmeVar;
        ThreadFactory ah = dih.ah();
        ExecutorService executorService2 = dseVar.l;
        if (!(executorService2 == null ? gzpVar2 : gzp.h(executorService2)).f()) {
            ExecutorService executorService3 = dseVar.a;
            executorService3 = executorService3 == null ? Executors.newCachedThreadPool(ah) : executorService3;
            if (executorService3 == null) {
                throw new NullPointerException("Null backgroundExecutor");
            }
            dseVar.l = executorService3;
        }
        if (dseVar.a == null) {
            dseVar.a = Executors.newSingleThreadScheduledExecutor(ah);
        }
        if (!dseVar.e().f()) {
            throw new IllegalStateException("Exactly one of setAvatarRetriever and setCustomAvatarImageLoader have to be called.");
        }
        dseVar.k = dseVar.e().b();
        if (dseVar.q == null) {
            dseVar.q = new fwm(dseVar.a(), dseVar.a);
        }
        dseVar.c().a.c = new dra() { // from class: dsb
            @Override // defpackage.dra
            public final void a(hel helVar, Object obj) {
                dse dseVar2 = dse.this;
                dseVar2.q.t("SUCCESS_LEGACY", dseVar2.a().getPackageName());
            }
        };
        drz drzVar3 = dseVar.e;
        if (!(drzVar3 != null ? gzp.h(drzVar3) : gzpVar2).f()) {
            dov b = dseVar.b();
            dseVar.d();
            dsa dsaVar = new dsa(b, dseVar.c(), dseVar.q);
            dseVar.e = new drz(new dsd(dsaVar, 0), new dsd(dsaVar, i), new dsc());
        }
        dseVar.c();
        dseVar.d();
        dseVar.d();
        dme dmeVar3 = dseVar.m;
        if (dmeVar3 == null) {
            throw new IllegalStateException("Property \"vePrimitives\" has not been set");
        }
        if (!(dmeVar3 instanceof dmd)) {
            dseVar.n = new efv(dseVar.b(), dseVar.c(), dmeVar3, (hac) dseVar.p.c(new csm(8)));
        }
        ebu ebuVar2 = new ebu(dseVar.d());
        if (!dseVar.d().g.f()) {
            dseVar.f();
            Context a2 = dseVar.a();
            dov b2 = dseVar.b();
            dseVar.d();
            ebuVar2.d = gzp.h(new dqv(a2, b2));
        }
        if (!dseVar.d().h.f()) {
            dseVar.f();
            if (jtp.a.bB().l(dseVar.a())) {
                ebuVar2.e = gzp.h(new ebw(dseVar.b(), dseVar.a(), dseVar.q));
            }
        }
        if (!dseVar.d().d.f()) {
            ebuVar2.a = gzp.h(new dih());
        }
        if (jtp.a.bB().j(dseVar.a())) {
            ebuVar2.b(true);
        }
        dseVar.f = ebuVar2.a();
        Context context = dseVar.b;
        if (context != null && (dsgVar = dseVar.c) != null && (dovVar = dseVar.d) != null && (drzVar2 = dseVar.e) != null && (ebvVar = dseVar.f) != null && (efcVar = dseVar.g) != null && (ebrVar = dseVar.h) != null && (dpdVar = dseVar.k) != null && (executorService = dseVar.l) != null && (dmeVar2 = dseVar.m) != null && (efuVar = dseVar.n) != null) {
            this.f = new dsf(context, dsgVar, dovVar, drzVar2, ebvVar, efcVar, ebrVar, dseVar.i, dseVar.j, dpdVar, executorService, dmeVar2, efuVar, dseVar.q, dseVar.o, dseVar.p);
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (dseVar.b == null) {
            sb.append(" applicationContext");
        }
        if (dseVar.c == null) {
            sb.append(" accountsModel");
        }
        if (dseVar.d == null) {
            sb.append(" accountConverter");
        }
        if (dseVar.e == null) {
            sb.append(" clickListeners");
        }
        if (dseVar.f == null) {
            sb.append(" features");
        }
        if (dseVar.g == null) {
            sb.append(" oneGoogleEventLogger");
        }
        if (dseVar.h == null) {
            sb.append(" configuration");
        }
        if (dseVar.k == null) {
            sb.append(" avatarImageLoader");
        }
        if (dseVar.l == null) {
            sb.append(" backgroundExecutor");
        }
        if (dseVar.m == null) {
            sb.append(" vePrimitives");
        }
        if (dseVar.n == null) {
            sb.append(" visualElements");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    private static final Drawable l(Context context, int i, int i2, int i3) {
        return new LayerDrawable(new Drawable[]{dih.ac(context, i2, i3), dih.ac(context, R.drawable.card_exclamation_vd, i)});
    }

    private static String m(String str) {
        if (str != null) {
            return hoq.Q(str.trim());
        }
        return null;
    }

    private final iyi n() {
        Object obj = this.b;
        if (obj != null) {
            return (iyi) obj;
        }
        throw new UnsupportedOperationException("Account support is not present");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v1, types: [htr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final fcu a(fck fckVar) {
        ?? r0 = this.d;
        Uri uri = fckVar.a;
        Pair pair = (Pair) r0.get(uri);
        if (pair == null) {
            hoq.C(uri.isHierarchical(), "Uri must be hierarchical: %s", uri);
            String R = hoq.R(uri.getLastPathSegment());
            int lastIndexOf = R.lastIndexOf(46);
            hoq.C((lastIndexOf == -1 ? "" : R.substring(lastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", uri);
            hoq.y(fckVar.b != null, "Proto schema cannot be null");
            hoq.y(fckVar.c != null, "Handler cannot be null");
            fcs fcsVar = fckVar.e;
            ?? r6 = this.e;
            String a = fcsVar.a();
            fcw fcwVar = (fcw) r6.get(a);
            hoq.C(fcwVar != 0, "No XDataStoreVariantFactory registered for ID %s", a);
            String R2 = hoq.R(uri.getLastPathSegment());
            int lastIndexOf2 = R2.lastIndexOf(46);
            if (lastIndexOf2 != -1) {
                R2 = R2.substring(0, lastIndexOf2);
            }
            hvi g = hti.g(hnu.aJ(uri), this.c, huf.a);
            ?? r7 = this.b;
            fcv b = fcwVar.b(fckVar, R2, r7, (iyi) this.f);
            fcwVar.a();
            fcu fcuVar = new fcu(b, g, false);
            hel helVar = fckVar.d;
            if (!helVar.isEmpty()) {
                fcuVar.c(new fci(helVar, r7));
            }
            pair = Pair.create(fcuVar, fckVar);
            Pair pair2 = (Pair) r0.putIfAbsent(uri, pair);
            if (pair2 != null) {
                pair = pair2;
            }
        }
        fcu fcuVar2 = (fcu) pair.first;
        fck fckVar2 = (fck) pair.second;
        if (fckVar.equals(fckVar2)) {
            return fcuVar2;
        }
        jll jllVar = fckVar.b;
        String w = hoq.w("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", jllVar.getClass().getSimpleName(), uri);
        hoq.C(uri.equals(fckVar2.a), w, "uri");
        hoq.C(jllVar.equals(fckVar2.b), w, "schema");
        hoq.C(fckVar.c.equals(fckVar2.c), w, "handler");
        hoq.C(hnu.H(fckVar.d, fckVar2.d), w, "migrations");
        hoq.C(fckVar.e.equals(fckVar2.e), w, "variantConfig");
        hoq.C(fckVar.f == fckVar2.f, w, "useGeneratedExtensionRegistry");
        hoq.C(true, w, "enableTracing");
        throw new IllegalArgumentException(hoq.w(w, "unknown"));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, koi] */
    public final hvi b(String str, etm etmVar) {
        String str2 = etmVar.c;
        str2.getClass();
        if (str2.length() == 0) {
            Object obj = this.b;
            if (!((etd) obj).f.c(((cfe) this.e).e(str)).d) {
                return hve.a;
            }
        }
        ghj ghjVar = new ghj(this, str, etmVar);
        ghj ghjVar2 = (ghj) ((ConcurrentHashMap) this.f.a()).put(str, ghjVar);
        if (ghjVar2 == null || !ksp.b(ghjVar2.b.c, etmVar.c)) {
            ghjVar2 = ghjVar;
        }
        hvw hvwVar = ghjVar.c;
        hvwVar.q(ghjVar2.d.c());
        return hvwVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, koe] */
    public final hvi c(String str) {
        String d = ((kee) this.e).d(str);
        ggh gghVar = (ggh) this.d.get(d);
        if (gghVar == ggh.c || gghVar == ggh.a) {
            return ((ghf) this.f.b()).a(d, true);
        }
        throw new IllegalStateException("Package " + d + " was not a device package. Instead was " + gghVar);
    }

    public final hvi d(String str) {
        return e(((kee) this.e).d(str), true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, jpt] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, koe] */
    public final hvi e(String str, boolean z) {
        ggh gghVar = (ggh) this.d.get(str);
        if (gghVar == null) {
            Log.w("ConfigurationUpdater", "No Mendel package registered for ".concat(String.valueOf(str)));
            return hnu.aJ(null);
        }
        int ordinal = gghVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw new koj();
                    }
                }
            }
            iyi n = n();
            str.getClass();
            return hti.g(((fug) n.a.b()).c(), gvx.c(new ggp(n, str, z, 0)), huf.a);
        }
        return ((ghf) this.f.b()).a(str, z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final hvi f(boolean z) {
        Set keySet = this.c.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (h()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(ixc.w(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((kee) this.e).d((String) it.next()));
        }
        ArrayList arrayList3 = new ArrayList(ixc.w(arrayList2));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(e((String) it2.next(), z));
        }
        return hnu.bx(arrayList3);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, jpt] */
    public final hvi g(String str, frv frvVar) {
        String d = ((kee) this.e).d(str);
        ggh gghVar = (ggh) this.d.get(d);
        if (gghVar == ggh.d || gghVar == ggh.b) {
            iyi n = n();
            return hti.g(((fug) n.a.b()).b(frvVar), gvx.c(new bpp((Object) n, d, (Object) frvVar, 13)), huf.a);
        }
        throw new IllegalStateException("Package " + d + " was not a user package. Instead was " + gghVar);
    }

    public final boolean h() {
        ggx ggxVar = new ggx(new dvm(15), 0);
        Object obj = this.a;
        Optional optional = (Optional) obj;
        if (true == optional.isPresent()) {
            obj = Optional.ofNullable(ggxVar.a.a(optional.get()));
        }
        return ((Boolean) ksy.c((Optional) obj, true)).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r11v58, types: [java.lang.Object, jpt] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, jpt] */
    /* JADX WARN: Type inference failed for: r9v102, types: [java.lang.Object, jpt] */
    /* JADX WARN: Type inference failed for: r9v109, types: [java.lang.Object, jpt] */
    /* JADX WARN: Type inference failed for: r9v113, types: [java.lang.Object, jpt] */
    /* JADX WARN: Type inference failed for: r9v117, types: [java.lang.Object, jpt] */
    /* JADX WARN: Type inference failed for: r9v122, types: [java.lang.Object, jpt] */
    /* JADX WARN: Type inference failed for: r9v127, types: [java.lang.Object, jpt] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.Object, jpt] */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.lang.Object, jpt] */
    /* JADX WARN: Type inference failed for: r9v30, types: [java.lang.Object, jpt] */
    /* JADX WARN: Type inference failed for: r9v36, types: [java.lang.Object, jpt] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, jpt] */
    /* JADX WARN: Type inference failed for: r9v42, types: [java.lang.Object, jpt] */
    /* JADX WARN: Type inference failed for: r9v47, types: [java.lang.Object, jpt] */
    /* JADX WARN: Type inference failed for: r9v52, types: [java.lang.Object, jpt] */
    /* JADX WARN: Type inference failed for: r9v57, types: [java.lang.Object, jpt] */
    /* JADX WARN: Type inference failed for: r9v62, types: [java.lang.Object, jpt] */
    /* JADX WARN: Type inference failed for: r9v67, types: [java.lang.Object, jpt] */
    /* JADX WARN: Type inference failed for: r9v82, types: [java.lang.Object, jpt] */
    /* JADX WARN: Type inference failed for: r9v91, types: [java.lang.Object, jpt] */
    /* JADX WARN: Type inference failed for: r9v97, types: [java.lang.Object, jpt] */
    public final Drawable i(Context context, jgu jguVar) {
        Drawable drawable;
        Drawable ac;
        Drawable ac2;
        Drawable ac3;
        Drawable drawable2;
        Drawable ac4;
        Drawable ac5;
        r2 = null;
        Drawable drawable3 = null;
        if (!(jguVar instanceof jha)) {
            if (jguVar instanceof jhl) {
                fln flnVar = new fln(context, null, 0, R.style.Widget_Material3_CircularProgressIndicator);
                int i = flx.c;
                return flx.a(context, flnVar, new flc(flnVar));
            }
            if (!(jguVar instanceof jhs)) {
                throw new koj();
            }
            jfp jfpVar = jguVar instanceof jfp ? (jfp) jguVar : null;
            if (jfpVar == null) {
                throw new IllegalArgumentException("TintAwareImage should be the only implementation of TintAwareImageInterface.");
            }
            if (jfpVar instanceof jfn) {
                drawable = e.f(context, ((jfn) jfpVar).a);
                drawable.getClass();
            } else {
                if (!(jfpVar instanceof jfl)) {
                    throw new koj();
                }
                drawable = ((jfl) jfpVar).a;
            }
            if (!jfpVar.a()) {
                return drawable;
            }
            dih.af(drawable, ((ehi) this.e.b()).a(jhb.c));
            drawable.getClass();
            return drawable;
        }
        int i2 = ((jha) jguVar).b - 1;
        int i3 = R.color.google_grey900;
        switch (i2) {
            case 0:
                ?? r9 = this.e;
                if (true == ((ehi) r9.b()).b()) {
                    i3 = R.color.google_white;
                }
                return l(context, context.getColor(i3), R.drawable.card_alert_bg_vd, ((ehi) r9.b()).a(jhb.f));
            case 1:
                return l(context, context.getColor(R.color.google_grey900), R.drawable.card_alert_bg_vd, ((ehi) this.e.b()).a(jhb.p));
            case 2:
                dwz dwzVar = (dwz) ((gzp) this.c).e();
                if (dwzVar != null) {
                    Drawable f = e.f(context, ((ehi) this.e.b()).b() ? dwzVar.b() : dwzVar.a());
                    if (f != null) {
                        return f;
                    }
                }
                throw new IllegalStateException("Missing build dependencies for Storage card resources.");
            case 3:
                dww dwwVar = (dww) ((gzp) this.b).e();
                if (dwwVar == null || (ac = dih.ac(context, dwwVar.c(), ((ehi) this.e.b()).a(jhb.c))) == null) {
                    throw new IllegalStateException("Missing build dependencies for BackupSync card resources.");
                }
                return ac;
            case 4:
                dww dwwVar2 = (dww) ((gzp) this.b).e();
                if (dwwVar2 == null || (ac2 = dih.ac(context, dwwVar2.a(), ((ehi) this.e.b()).a(jhb.r))) == null) {
                    throw new IllegalStateException("Missing build dependencies for BackupSync card resources.");
                }
                return ac2;
            case 5:
                dww dwwVar3 = (dww) ((gzp) this.b).e();
                if (dwwVar3 == null || (ac3 = dih.ac(context, dwwVar3.b(), ((ehi) this.e.b()).a(jhb.c))) == null) {
                    throw new IllegalStateException("Missing build dependencies for BackupSync card resources.");
                }
                return ac3;
            case 6:
                ?? r92 = this.e;
                Drawable ac6 = dih.ac(context, R.drawable.gs_add_vd_theme_24, ((ehi) r92.b()).a(jhb.e));
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(((ehi) r92.b()).a(jhb.j));
                return new LayerDrawable(new Drawable[]{shapeDrawable, ac6});
            case 7:
                String str = dsk.a;
                DevicePolicyManager devicePolicyManager = (DevicePolicyManager) context.getSystemService("device_policy");
                int i4 = R.drawable.gs_work_vd_theme_24;
                if (devicePolicyManager == null) {
                    Log.e(dsk.a, "Failed to get DevicePolicyManager");
                } else {
                    List<ComponentName> activeAdmins = devicePolicyManager.getActiveAdmins();
                    if (activeAdmins != null) {
                        Iterator<ComponentName> it = activeAdmins.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (devicePolicyManager.isProfileOwnerApp(it.next().getPackageName())) {
                                    i4 = R.drawable.gs_account_circle_vd_theme_24;
                                }
                            }
                        }
                    }
                }
                Drawable ac7 = dih.ac(context, i4, ((ehi) this.e.b()).a(jhb.e));
                ac7.getClass();
                return ac7;
            case 8:
                Drawable ac8 = dih.ac(context, R.drawable.quantum_gm_ic_manage_accounts_vd_theme_24, ((ehi) this.e.b()).a(jhb.c));
                ac8.getClass();
                return ac8;
            case 9:
                Drawable ac9 = dih.ac(context, R.drawable.gs_no_accounts_vd_theme_24, ((ehi) this.e.b()).a(jhb.c));
                ac9.getClass();
                return ac9;
            case 10:
                return l(context, context.getColor(R.color.gm3_ref_palette_neutral10), R.drawable.gs_shield_fill1_vd_theme_24, ((ehi) this.e.b()).a(jhb.p));
            case 11:
                ?? r11 = this.e;
                int a = ((ehi) r11.b()).a(jhb.e);
                int a2 = ((ehi) r11.b()).a(jhb.b);
                int aa = dih.aa(context.getResources().getDisplayMetrics(), 24);
                int i5 = true != ((bst) ((gzs) this.a).a).i() ? R.drawable.gs_photo_camera_vd_theme_24 : R.drawable.gs_edit_vd_theme_24;
                ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, new int[]{android.R.attr.state_enabled}, new int[]{-16842910}}, new int[]{a, a2, a2});
                Drawable f2 = e.f(context, i5);
                dih.ae(f2, colorStateList);
                Drawable[] drawableArr = new Drawable[2];
                drawableArr[0] = new InsetDrawable(f2, aa / 6);
                int ad = dih.ad(context);
                if (ad != 0 && (drawable2 = context.getDrawable(ad)) != null) {
                    if (drawable2 instanceof RippleDrawable) {
                        ((RippleDrawable) drawable2).setRadius(aa / 2);
                    }
                    drawable3 = drawable2;
                }
                drawableArr[1] = drawable3;
                return new LayerDrawable(drawableArr);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Drawable ac10 = dih.ac(context, R.drawable.googlelogo_standard_color_74x24_vd, ((ehi) this.e.b()).a(jhb.b));
                ac10.getClass();
                return ac10;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Drawable f3 = e.f(context, R.drawable.super_g_color_24);
                int aa2 = dih.aa(context.getResources().getDisplayMetrics(), 4);
                return new InsetDrawable(f3, aa2, aa2, aa2, aa2);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                gzp gzpVar = (gzp) this.d;
                if (((dwy) gzpVar.e()) == null || (ac4 = dih.ac(context, ((dwy) gzpVar.b()).b(), ((ehi) this.e.b()).a(jhb.c))) == null) {
                    throw new IllegalStateException("Missing build dependencies for Incognito resources.");
                }
                return ac4;
            case 15:
                gzp gzpVar2 = (gzp) this.d;
                if (((dwy) gzpVar2.e()) == null || (ac5 = dih.ac(context, ((dwy) gzpVar2.b()).a(), ((ehi) this.e.b()).a(jhb.d))) == null) {
                    throw new IllegalStateException("Missing build dependencies for Incognito resources.");
                }
                return ac5;
            case 16:
                PaintDrawable paintDrawable = new PaintDrawable(((ehi) this.e.b()).a(jhb.l));
                paintDrawable.setCornerRadius(dih.Z(context.getResources().getDisplayMetrics(), 8));
                paintDrawable.setIntrinsicWidth(-1);
                paintDrawable.setIntrinsicHeight(-1);
                return paintDrawable;
            case 17:
                ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                shapeDrawable2.getPaint().setColor(((ehi) this.e.b()).a(jhb.l));
                shapeDrawable2.setIntrinsicWidth(-1);
                shapeDrawable2.setIntrinsicHeight(-1);
                return shapeDrawable2;
            case 18:
                return new InsetDrawable(dih.ac(context, R.drawable.gs_key_vd_theme_20, ((ehi) this.e.b()).a(jhb.o)), 2, 2, 2, 2);
            case 19:
                Drawable ac11 = dih.ac(context, R.drawable.quantum_ic_expand_more_vd_theme_24, ((ehi) this.e.b()).a(jhb.c));
                ac11.getClass();
                return ac11;
            case 20:
                Drawable ac12 = dih.ac(context, R.drawable.gs_info_vd_theme_24, ((ehi) this.e.b()).a(jhb.c));
                ac12.getClass();
                return ac12;
            default:
                Drawable ac13 = dih.ac(context, R.drawable.gs_spark_vd_theme_24, ((ehi) this.e.b()).a(jhb.c));
                ac13.getClass();
                return ac13;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, jpt] */
    public final Map j(List list, Map map, gjl gjlVar) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            ((ehs) obj).a.g((jfi) ((gzp) this.e).e());
            arrayList.add(obj);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(ksl.f(ixd.m(ixc.w(arrayList)), 16));
        for (Object obj2 : arrayList) {
            linkedHashMap.put(obj2, ((dvk) this.f.b()).b(((ehs) obj2).a, false, map, gjlVar));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dov, java.lang.Object] */
    public final void k(Object obj, dqs dqsVar) {
        ?? r0 = this.d;
        String m = m(r0.f(obj));
        String m2 = m(r0.d(obj));
        dqu dquVar = (dqu) this.b;
        dih dihVar = dquVar.b;
        if (true == dih.l(obj, r0).a) {
            m2 = null;
        }
        if (m == null) {
            m = m2;
        }
        String str = true != iwo.b(m, m2) ? m2 : null;
        m.getClass();
        String replace = m.replace('-', (char) 8209);
        TextView textView = (TextView) this.a;
        textView.setText(replace);
        if (str != null) {
            String replace2 = str.replace('-', (char) 8209);
            Object obj2 = this.f;
            int i = yq.a;
            ((View) obj2).setImportantForAccessibility(2);
            replace = a.ag(replace2, replace, "\n");
            TextView textView2 = (TextView) obj2;
            textView2.setText(replace2);
            textView2.setVisibility(0);
        } else {
            ((TextView) this.f).setVisibility(8);
        }
        Object obj3 = this.e;
        if (obj3 != null) {
            ((TextView) this.f).getVisibility();
            gzp gzpVar = dquVar.a;
            ((TextView) obj3).setVisibility(8);
        }
        String a = dqsVar.a(replace);
        AccountParticleDisc accountParticleDisc = (AccountParticleDisc) this.c;
        accountParticleDisc.h(obj);
        String c = accountParticleDisc.c();
        if (c != null) {
            a = a.ag(c, a, "\n");
        }
        textView.setContentDescription(a);
    }

    public fym(ejl ejlVar, gzp gzpVar, koe koeVar, koe koeVar2, koe koeVar3, koe koeVar4) {
        this.a = ejlVar;
        this.e = gzpVar;
        this.c = koeVar;
        this.b = koeVar2;
        this.f = koeVar3;
        this.d = koeVar4;
    }

    public fym(fym fymVar, hvm hvmVar, Random random, koe koeVar, koe koeVar2, koe koeVar3) {
        this.b = fymVar;
        this.a = hvmVar;
        this.d = random;
        this.c = koeVar;
        this.f = koeVar2;
        this.e = koeVar3;
    }

    public fym(hwm hwmVar) {
        this.d = hwmVar.c;
        this.c = hwmVar.e;
        this.b = hwmVar.d;
        this.f = hwmVar.a;
        this.e = hwmVar.b;
        this.a = hwmVar.f;
    }

    public fym(dqt dqtVar, dov dovVar, dqu dquVar) {
        this.c = dqtVar.i();
        this.a = dqtVar.g();
        this.f = dqtVar.h();
        this.e = dqtVar.f();
        dovVar.getClass();
        this.d = dovVar;
        this.b = dquVar;
    }

    public fym(Executor executor, iyi iyiVar, fcy fcyVar, Map map) {
        this.d = new ConcurrentHashMap();
        executor.getClass();
        this.b = executor;
        iyiVar.getClass();
        this.f = iyiVar;
        this.a = fcyVar;
        this.e = map;
        hoq.x(!map.isEmpty());
        this.c = new bwu(18);
    }

    public fym(dqy dqyVar, efd efdVar, jnu jnuVar, efu efuVar, drd drdVar) {
        this.e = dqyVar;
        this.f = efdVar;
        jkj C = jnuVar.C();
        if (!C.b.M()) {
            C.t();
        }
        jnu jnuVar2 = (jnu) C.b;
        jnuVar2.c = 3;
        jnuVar2.b |= 1;
        this.b = (jnu) C.q();
        jkj C2 = jnuVar.C();
        if (!C2.b.M()) {
            C2.t();
        }
        jnu jnuVar3 = (jnu) C2.b;
        jnuVar3.c = 4;
        jnuVar3.b |= 1;
        this.c = (jnu) C2.q();
        this.d = efuVar;
        this.a = drdVar;
    }

    public fym(Context context, hvm hvmVar, cfe cfeVar, koe koeVar, fwm fwmVar, fug fugVar) {
        this.a = context;
        this.d = hvmVar;
        this.f = cfeVar;
        this.b = koeVar;
        this.e = fwmVar;
        this.c = fugVar;
    }

    public fym(jiw jiwVar, iyh iyhVar, cvd cvdVar, Optional optional, Context context, bst bstVar) {
        optional.getClass();
        this.b = jiwVar;
        this.c = iyhVar;
        this.e = cvdVar;
        this.d = optional;
        this.a = context;
        this.f = bstVar;
    }

    public fym(jpt jptVar, jpt jptVar2, gzp gzpVar, jpt jptVar3, jpt jptVar4, Context context) {
        jptVar.getClass();
        jptVar2.getClass();
        gzpVar.getClass();
        jptVar3.getClass();
        jptVar4.getClass();
        this.c = jptVar;
        this.f = jptVar2;
        this.e = gzpVar;
        this.b = jptVar3;
        this.a = context;
        this.d = new LinkedHashSet();
    }

    public fym(jpt jptVar, gzp gzpVar, gzp gzpVar2, gzp gzpVar3, gzp gzpVar4, gzp gzpVar5, gzp gzpVar6) {
        jptVar.getClass();
        gzpVar.getClass();
        gzpVar2.getClass();
        gzpVar4.getClass();
        gzpVar5.getClass();
        this.e = jptVar;
        this.c = gzpVar;
        this.d = gzpVar2;
        this.f = gzpVar3;
        this.b = gzpVar4;
        this.a = gzpVar6;
    }

    public fym(Optional optional, kee keeVar, koe koeVar, Map map, Map map2, Optional optional2) {
        keeVar.getClass();
        koeVar.getClass();
        map.getClass();
        map2.getClass();
        optional2.getClass();
        this.e = keeVar;
        this.f = koeVar;
        this.c = map;
        this.d = map2;
        this.a = optional2;
        this.b = (iyi) optional.orElse(null);
    }

    public fym(koe koeVar, koe koeVar2, hvl hvlVar, etd etdVar, cfe cfeVar) {
        koeVar.getClass();
        koeVar2.getClass();
        hvlVar.getClass();
        etdVar.getClass();
        this.d = koeVar;
        this.c = koeVar2;
        this.a = hvlVar;
        this.b = etdVar;
        this.e = cfeVar;
        this.f = new kop(new ggy(this, 2));
    }

    public fym(hvl hvlVar, koe koeVar, cfe cfeVar, cfe cfeVar2, etd etdVar) {
        hvlVar.getClass();
        koeVar.getClass();
        cfeVar2.getClass();
        etdVar.getClass();
        this.f = hvlVar;
        this.d = koeVar;
        this.e = cfeVar;
        this.c = cfeVar2;
        this.a = etdVar;
        this.b = new kop(new aji(15));
    }
}
