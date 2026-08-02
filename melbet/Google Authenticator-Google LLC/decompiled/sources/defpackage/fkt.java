package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.app.ApplicationErrorReport;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import com.google.android.apps.authenticator2.R;
import com.google.android.apps.authenticator2.howitworks.HowItWorksActivity;
import com.google.android.apps.authenticator2.migration.MigrationActivity;
import com.google.android.apps.authenticator2.settings.SettingsActivity;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;
import com.google.android.material.navigation.NavigationView;
import java.io.File;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fkt implements gb {
    final /* synthetic */ NavigationView a;

    public fkt(NavigationView navigationView) {
        this.a = navigationView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.gb
    public final boolean J(gd gdVar, MenuItem menuItem) {
        Object obj;
        hel helVar;
        int i;
        hvi s;
        Object g;
        bvm bvmVar;
        hvi aI;
        fkv fkvVar = this.a.h;
        int i2 = 0;
        if (fkvVar == null) {
            return false;
        }
        gxa gxaVar = (gxa) fkvVar;
        fkv fkvVar2 = gxaVar.b;
        gtt f = ((gva) gxaVar.c.a).f(gxaVar.a, 270);
        try {
            bvm bvmVar2 = ((buj) fkvVar2).a;
            int i3 = ((gf) menuItem).a;
            if (i3 == R.id.how_it_works) {
                Context context = bvmVar2.e;
                gvx.l(context, new Intent(context, (Class<?>) HowItWorksActivity.class).putExtra("intro_wizard_first_appearance", false));
            } else if (i3 == R.id.settings) {
                hoq.am(bvmVar2.c, new Intent(bvmVar2.e, (Class<?>) SettingsActivity.class));
            } else if (i3 == R.id.migration) {
                Intent intent = new Intent(bvmVar2.e, (Class<?>) MigrationActivity.class);
                ftc.a(intent, bvmVar2.d);
                hoq.an(bvmVar2.c, intent, 12);
            } else if (i3 == R.id.help_and_feedback) {
                ids idsVar = new ids();
                idsVar.b = "home";
                buf bufVar = bvmVar2.c;
                idsVar.o(0, bufVar.bs().getString(R.string.terms_preference_title), new Intent("android.intent.action.VIEW").setData(Uri.parse(bufVar.bs().getString(R.string.terms_page_url))));
                idsVar.o(1, bufVar.bs().getString(R.string.privacy_preference_title), new Intent("android.intent.action.VIEW").setData(Uri.parse(bufVar.bs().getString(R.string.privacy_page_url))));
                String string = bufVar.bs().getString(R.string.open_source_licenses_preference_title);
                Context context2 = bvmVar2.e;
                idsVar.o(2, string, new Intent(context2, (Class<?>) LicenseMenuActivity.class));
                Uri parse = Uri.parse(bufVar.bs().getString(R.string.fallback_url));
                if (parse == null) {
                    throw new NullPointerException("Null fallbackSupportUri");
                }
                idsVar.c = parse;
                Object obj2 = idsVar.a;
                if (obj2 != null) {
                    idsVar.d = ((heg) obj2).g();
                } else if (idsVar.d == null) {
                    int i4 = hel.d;
                    idsVar.d = his.a;
                }
                Object obj3 = idsVar.b;
                if (obj3 != null && (obj = idsVar.c) != null) {
                    final gnz gnzVar = new gnz((String) obj3, (Uri) obj, (hel) idsVar.d);
                    gyf gyfVar = gyf.a;
                    final gnt gntVar = new gnt(String.valueOf(context2.getApplicationContext().getPackageName()).concat("feedback"), gyfVar, hix.b, true, true, gyfVar, gyfVar, gyfVar);
                    gnx gnxVar = bvmVar2.p;
                    final iwq iwqVar = (iwq) gnxVar.e.b();
                    gzp gzpVar = gnxVar.d;
                    Activity activity = gnxVar.b;
                    Object obj4 = iwqVar.c;
                    Object obj5 = ((fym) obj4).f;
                    ggf ggfVar = new ggf();
                    ggfVar.a(false);
                    ggfVar.b(Long.MAX_VALUE);
                    ggfVar.e = 2;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                    ggfVar.b(2000L);
                    ggfVar.a(gntVar.d);
                    hel r = hel.r(gga.b, gga.a);
                    if (r == null) {
                        throw new NullPointerException("Null acceptTypes");
                    }
                    ggfVar.a = r;
                    if (ggfVar.d == 3 && (helVar = ggfVar.a) != null && (i = ggfVar.e) != 0) {
                        ggg gggVar = new ggg(helVar, ggfVar.b, ggfVar.c, i);
                        Map f2 = gzpVar.f() ? ((gnr) hnu.bq((Context) ((fym) obj4).a, gnr.class, (frv) gzpVar.b())).f() : (Map) ((jrx) ((fym) obj4).b).a;
                        her herVar = gntVar.c;
                        ArrayList arrayList = new ArrayList(f2.size());
                        for (Map.Entry entry : f2.entrySet()) {
                            String str = (String) entry.getKey();
                            try {
                                aI = ((gge) entry.getValue()).a();
                            } catch (Throwable th) {
                                aI = hnu.aI(th);
                            }
                            arrayList.add(((cfe) obj5).f(gggVar, str, aI));
                        }
                        for (Map.Entry entry2 : herVar.entrySet()) {
                            arrayList.add(((cfe) obj5).f(gggVar, (String) entry2.getKey(), (hvi) entry2.getValue()));
                        }
                        hvi f3 = hti.f(hnu.aG(arrayList), new fxn(8), ((cfe) obj5).g(gggVar));
                        if (gzpVar.f()) {
                            hvi b = ((fug) ((fym) obj4).c).b((frv) gzpVar.b());
                            hvi c = ((fwm) ((fym) obj4).e).c((frv) gzpVar.b());
                            s = hoq.aV(b, c).s(new gnq(b, c, i2), ((fym) obj4).d);
                        } else {
                            s = hnu.aJ(gyf.a);
                        }
                        hvi hviVar = s;
                        if (gntVar.e) {
                            g = gzp.g(dih.F(activity));
                        } else {
                            g = gyf.a;
                        }
                        gnxVar.c.i(new cbp(hti.f(hnu.aY(hviVar, f3).a(gvx.i(new bqi(hviVar, f3, g, 6, null)), ((fym) obj4).d), gvx.a(new gzf() { // from class: gnu
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:25:0x01d4  */
                            /* JADX WARN: Removed duplicated region for block: B:28:0x01ea  */
                            /* JADX WARN: Removed duplicated region for block: B:55:0x02c4  */
                            /* JADX WARN: Removed duplicated region for block: B:56:0x01db  */
                            /* JADX WARN: Type inference failed for: r49v1 */
                            /* JADX WARN: Type inference failed for: r49v2 */
                            @Override // defpackage.gzf
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object a(Object obj6) {
                                String e;
                                boolean z;
                                int i5;
                                boolean z2;
                                String str2;
                                ContentResolver contentResolver;
                                den denVar;
                                boolean z3;
                                boolean z4;
                                gns gnsVar = (gns) obj6;
                                ArrayList arrayList2 = new ArrayList();
                                ArrayList arrayList3 = new ArrayList();
                                ArrayList arrayList4 = new ArrayList();
                                ErrorReport errorReport = new ErrorReport();
                                ArrayList arrayList5 = new ArrayList();
                                ArrayList arrayList6 = new ArrayList();
                                ArrayList arrayList7 = new ArrayList();
                                gnz gnzVar2 = gnzVar;
                                GoogleHelp googleHelp = new GoogleHelp(23, gnzVar2.a, null, null, null, null, null, true, true, arrayList2, null, null, null, 0, 0, null, null, arrayList3, 3, null, arrayList4, false, errorReport, null, 0, null, -1, false, false, 200, null, false, null, false, null, false, arrayList5, null, 0, 0, arrayList6, null, null, arrayList7);
                                googleHelp.q = gnzVar2.b;
                                hel helVar2 = gnzVar2.c;
                                int i6 = ((his) helVar2).c;
                                for (int i7 = 0; i7 < i6; i7++) {
                                    gny gnyVar = (gny) helVar2.get(i7);
                                    googleHelp.r.add(new cuy(gnyVar.a, gnyVar.b, gnyVar.c));
                                }
                                ctw ctwVar = new ctw(3, 0);
                                ctwVar.a = 3;
                                googleHelp.s = ctwVar;
                                gzp gzpVar2 = gnsVar.a;
                                if (gzpVar2.f()) {
                                    googleHelp.c = new Account((String) gzpVar2.b(), "com.google");
                                }
                                Context context3 = (Context) iwq.this.b;
                                des.a(context3);
                                Bundle bundle = new Bundle();
                                ArrayList arrayList8 = new ArrayList();
                                new ApplicationErrorReport();
                                try {
                                    try {
                                        des desVar = cub.a;
                                        str2 = desVar.b;
                                        contentResolver = des.a;
                                        ((Boolean) desVar.c).booleanValue();
                                        denVar = del.a;
                                        ((der) denVar).e(contentResolver);
                                        ((der) denVar).c(contentResolver);
                                        ((der) denVar).d.lock();
                                    } catch (SecurityException unused) {
                                        obj6 = 1;
                                        e = csp.e();
                                        z = obj6;
                                        gzp gzpVar3 = gnsVar.c;
                                        if (gzpVar3.f()) {
                                        }
                                        gnt gntVar2 = gntVar;
                                        ctw ctwVar2 = new ctw(3, 0);
                                        i5 = gntVar2.h;
                                        int i8 = i5 - 1;
                                        if (i5 == 0) {
                                        }
                                    }
                                } catch (SecurityException unused2) {
                                    e = csp.e();
                                    z = obj6;
                                    gzp gzpVar32 = gnsVar.c;
                                    if (gzpVar32.f()) {
                                    }
                                    gnt gntVar22 = gntVar;
                                    ctw ctwVar22 = new ctw(3, 0);
                                    i5 = gntVar22.h;
                                    int i82 = i5 - 1;
                                    if (i5 == 0) {
                                    }
                                }
                                try {
                                    Object obj7 = ((der) denVar).i;
                                    Boolean bool = false;
                                    z = true;
                                    z = true;
                                    try {
                                        Boolean bool2 = (Boolean) ((der) denVar).b(((der) denVar).f, str2, bool, der.a);
                                        ((der) denVar).d.unlock();
                                        if (bool2 != null) {
                                            z4 = bool2.booleanValue();
                                        } else {
                                            String a = ((der) denVar).a(contentResolver, str2);
                                            if (a != null && !a.isEmpty()) {
                                                if (dem.c.matcher(a).matches()) {
                                                    bool = true;
                                                    z3 = true;
                                                    ((der) denVar).d(obj7, ((der) denVar).f, str2, bool, der.a);
                                                    z4 = z3;
                                                } else if (dem.d.matcher(a).matches()) {
                                                    z3 = false;
                                                    ((der) denVar).d(obj7, ((der) denVar).f, str2, bool, der.a);
                                                    z4 = z3;
                                                } else {
                                                    Log.w("Gservices", "attempt to read Gservices key " + str2 + " (value \"" + a + "\") as boolean");
                                                }
                                            }
                                            bool = bool2;
                                            z3 = false;
                                            ((der) denVar).d(obj7, ((der) denVar).f, str2, bool, der.a);
                                            z4 = z3;
                                        }
                                        Boolean.valueOf(z4).getClass();
                                        e = z4 ? System.currentTimeMillis() + "_" + Math.abs(new SecureRandom().nextLong()) : csp.e();
                                        gzp gzpVar322 = gnsVar.c;
                                        Bitmap bitmap = gzpVar322.f() ? (Bitmap) gzpVar322.b() : null;
                                        gnt gntVar222 = gntVar;
                                        ctw ctwVar222 = new ctw(3, 0);
                                        i5 = gntVar222.h;
                                        int i822 = i5 - 1;
                                        if (i5 == 0) {
                                            throw null;
                                        }
                                        if (i822 != 0) {
                                            throw new RuntimeException(null, null);
                                        }
                                        ctwVar222.a = 3;
                                        String str3 = gzpVar2.f() ? (String) gzpVar2.b() : null;
                                        hjr it = gnsVar.b.values().iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                z2 = z;
                                                break;
                                            }
                                            if (((ggc) it.next()).c) {
                                                z2 = false;
                                                break;
                                            }
                                        }
                                        kee keeVar = new kee(gnsVar);
                                        if (!(bundle.isEmpty() && arrayList8.isEmpty()) && z2) {
                                            throw new IllegalStateException("Can't mix pii-full psd and pii-free psd");
                                        }
                                        String str4 = gntVar222.a;
                                        cto ctoVar = new cto(null, null, null, new ApplicationErrorReport(), null, null, null, null, true, null, null, false, null, null, false, 0L, false, null, null, null);
                                        ctoVar.m = bitmap;
                                        ctoVar.f = null;
                                        ctoVar.a = str3;
                                        ctoVar.c = null;
                                        ctoVar.b = bundle;
                                        ctoVar.e = str4;
                                        ctoVar.h = arrayList8;
                                        ctoVar.i = false;
                                        ctoVar.j = ctwVar222;
                                        ctoVar.k = null;
                                        ctoVar.l = z2;
                                        ctoVar.u = keeVar;
                                        ctoVar.n = e;
                                        ctoVar.o = false;
                                        ctoVar.p = 0L;
                                        ctoVar.q = false;
                                        ctoVar.r = null;
                                        ctoVar.s = null;
                                        ctoVar.t = null;
                                        File file = new File(context3.getCacheDir(), "feedback");
                                        googleHelp.R = ctoVar.u;
                                        googleHelp.v = new ErrorReport(ctoVar, file);
                                        googleHelp.v.X = "GoogleHelp";
                                        return new Intent("com.google.android.gms.googlehelp.HELP").setPackage("com.google.android.gms").putExtra("EXTRA_GOOGLE_HELP", googleHelp);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        ((der) denVar).d.unlock();
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                        }), iwqVar.d)), gnxVar.f);
                        bvmVar = bvmVar2;
                        bvm.d(bvmVar.c).t();
                        f.close();
                        return false;
                    }
                    StringBuilder sb = new StringBuilder();
                    if (ggfVar.a == null) {
                        sb.append(" acceptTypes");
                    }
                    if ((ggfVar.d & 1) == 0) {
                        sb.append(" allowPii");
                    }
                    if ((ggfVar.d & 2) == 0) {
                        sb.append(" timeLimitMs");
                    }
                    if (ggfVar.e == 0) {
                        sb.append(" size");
                    }
                    throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                }
                StringBuilder sb2 = new StringBuilder();
                if (idsVar.b == null) {
                    sb2.append(" helpCenterContext");
                }
                if (idsVar.c == null) {
                    sb2.append(" fallbackSupportUri");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
            }
            bvmVar = bvmVar2;
            bvm.d(bvmVar.c).t();
            f.close();
            return false;
        } finally {
        }
    }

    @Override // defpackage.gb
    public final void F(gd gdVar) {
    }
}
