package defpackage;

import android.animation.Animator;
import android.app.Activity;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kee {
    public final /* synthetic */ Object a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kee(gns gnsVar) {
        this((byte[]) null);
        this.a = gnsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void J(fss fssVar, fsv fsvVar) {
        int i;
        Class<?> cls;
        Object obj = this.a;
        fsl fslVar = (fsl) obj;
        if (!fslVar.g) {
            if (fssVar.i) {
                fslVar.f.h();
                return;
            } else {
                fslVar.e.k(fsvVar);
                return;
            }
        }
        hoq hoqVar = fsl.j;
        gtz aY = hoq.aY(hoqVar);
        if (aY.b()) {
            Object a = aY.a();
            a.getClass();
            i = ((Number) a).intValue();
        } else {
            i = 0;
        }
        int i2 = i + 1;
        if (i2 > 10) {
            gzp gzpVar = fslVar.d;
            if (gzpVar.f()) {
                cls = gzpVar.b().getClass();
            } else {
                jpu jpuVar = fslVar.b;
                int d = jpuVar.d() - 1;
                cls = (d != 0 ? d != 1 ? jpuVar.b() : jpuVar.e() : jpuVar.a()).getClass();
            }
            ((hkf) fsl.a.f().i("com/google/apps/tiktok/account/api/controller/AccountControllerImpl$HandleAccountAction", "fallbackOrSetErrorDetectingInfiniteLoop", 1202, "AccountControllerImpl.kt")).u("A highly probable infinite loop detected in host: %s", new ekn(cls));
            throw new IllegalStateException("Account error triggered too many times in the same call chain, the app is likely trapped in an infinite loop. This is likely an app bug where the onNoAccountAvailable method is triggering the account error again. Please check the preceding log in logcat to see which host is causing the problem.", gwd.c());
        }
        gua b = guc.b();
        b.a(hoqVar, Integer.valueOf(i2));
        gty aB = hoq.aB(74, "AccountController account error", ((guc) b).f(), true);
        try {
            if (fssVar.i) {
                ((fsl) obj).f.h();
            } else {
                ((fsl) obj).e.k(fsvVar);
            }
            ixf.j(aB, null);
        } finally {
        }
    }

    public final void A(int i, int i2) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        recyclerView.N(i, i2, true);
        recyclerView.N = true;
        recyclerView.M.c += i2;
    }

    public final int B() {
        return ((RecyclerView) this.a).getChildCount();
    }

    public final int C(View view) {
        return ((RecyclerView) this.a).indexOfChild(view);
    }

    public final View D(int i) {
        return ((RecyclerView) this.a).getChildAt(i);
    }

    public final void E(View view) {
        lp h = RecyclerView.h(view);
        if (h != null) {
            ((RecyclerView) this.a).an(h, h.o);
            h.o = 0;
        }
    }

    public final void F(int i) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.z(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    public final void G(lp lpVar) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        recyclerView.m.aR(lpVar.a, recyclerView.e);
    }

    public final void H(lp lpVar, xp xpVar, xp xpVar2) {
        int i;
        int i2;
        lpVar.m(false);
        RecyclerView recyclerView = (RecyclerView) this.a;
        kv kvVar = recyclerView.C;
        if (xpVar == null || ((i = xpVar.b) == (i2 = xpVar2.b) && xpVar.a == xpVar2.a)) {
            kvVar.f(lpVar);
            lpVar.a.setAlpha(0.0f);
            kvVar.c.add(lpVar);
        } else if (!kvVar.g(lpVar, i, xpVar.a, i2, xpVar2.a)) {
            return;
        }
        recyclerView.Q();
    }

    public final void I(lp lpVar, xp xpVar, xp xpVar2) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        recyclerView.e.l(lpVar);
        recyclerView.q(lpVar);
        lpVar.m(false);
        kv kvVar = recyclerView.C;
        int i = xpVar.b;
        int i2 = xpVar.a;
        View view = lpVar.a;
        int left = xpVar2 == null ? view.getLeft() : xpVar2.b;
        int top = xpVar2 == null ? view.getTop() : xpVar2.a;
        if (lpVar.u() || (i == left && i2 == top)) {
            kvVar.f(lpVar);
            kvVar.b.add(lpVar);
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            if (!kvVar.g(lpVar, i, i2, left, top)) {
                return;
            }
        }
        recyclerView.Q();
    }

    public final void a(Object obj, Writer writer) {
        ibn ibnVar = (ibn) this.a;
        boolean z = ibnVar.d;
        ibg ibgVar = ibnVar.c;
        ibo iboVar = new ibo(writer, ibnVar.a, ibnVar.b, ibgVar, z);
        iboVar.i(obj);
        iboVar.a.flush();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [gzf, java.lang.Object] */
    public final Object b(Object obj) {
        return this.a.a(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.Map] */
    public final ggn c(String str, String str2) {
        ghh ghhVar;
        iwq iwqVar = (iwq) this.a;
        ?? r1 = iwqVar.a;
        String d = ((kee) iwqVar.b).d(str);
        Object obj = r1.get(d);
        obj.getClass();
        ghn ghnVar = (ghn) obj;
        try {
            Boolean bool = null;
            if (ghnVar.q.e()) {
                ghhVar = (ghh) hnu.aR(ghnVar.q.c());
            } else {
                gty aC = hoq.aC(160, "Blocking for: " + ghnVar.r);
                try {
                    ghh ghhVar2 = (ghh) ghnVar.h.b(new fxs(ghnVar, 9));
                    ixf.j(aC, null);
                    ghhVar = ghhVar2;
                } finally {
                }
            }
            ghhVar.getClass();
            ggn a = ghhVar.a(str2, new dwd(ghnVar, 13));
            Iterator it = iwqVar.d.iterator();
            while (it.hasNext()) {
                ((ghi) it.next()).a();
            }
            gzp gzpVar = (gzp) iwqVar.c;
            if (!gzpVar.f()) {
                return a;
            }
            Object obj2 = iwqVar.a.get(d);
            obj2.getClass();
            ghn ghnVar2 = (ghn) obj2;
            bry bryVar = (bry) gzpVar.b();
            String str3 = ghnVar2.r;
            koe koeVar = ghnVar2.j;
            Uri a2 = etb.a(str3);
            ggn a3 = ((ggo) koeVar.b()).a(str2);
            if (a3 == null) {
                throw new IllegalArgumentException("No known flag " + str2 + ", known flags: " + ((ggo) koeVar.b()).b());
            }
            String e = bryVar.e(a2, null, str2);
            if (e != null) {
                int i = a3.g - 1;
                if (i == 0) {
                    return hnu.bC(Long.parseLong(e));
                }
                int i2 = 0;
                if (i == 1) {
                    if (dem.c.matcher(e).matches()) {
                        bool = true;
                    } else if (dem.d.matcher(e).matches()) {
                        bool = false;
                    }
                    return hnu.bA(bool != null ? bool.booleanValue() : a3.c());
                }
                if (i == 2) {
                    return hnu.bB(Double.parseDouble(e));
                }
                if (i == 3) {
                    return hnu.bD(e);
                }
                if (i == 4) {
                    return new ggn(new ggy(e, i2), 5, null, false);
                }
                try {
                    awb awbVar = new awb(a3, e, 12, null == true ? 1 : 0);
                    jll jllVar = a3.e;
                    jllVar.getClass();
                    return new ggn(awbVar, 6, jllVar, false);
                } catch (jld unused) {
                }
            }
            return a3;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2.getCause());
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final String d(String str) {
        str.getClass();
        String str2 = (String) this.a.get(str);
        if (str2 != null) {
            return str2;
        }
        throw new IllegalStateException("Unknown package ".concat(str));
    }

    public final void e(ProtoParsers$InternalDontUse protoParsers$InternalDontUse, Throwable th) {
        gty aC;
        fsi fsiVar;
        jll a = protoParsers$InternalDontUse.a(fss.a, jkd.a());
        a.getClass();
        fss fssVar = (fss) a;
        fsl.v(fssVar);
        Object obj = this.a;
        fsl fslVar = (fsl) obj;
        fsi fsiVar2 = fslVar.i;
        if (fsiVar2 == null) {
            ksp.a("viewModel");
            fsiVar2 = null;
        }
        if (ksp.b(fssVar, fsiVar2.a())) {
            fslVar.q();
            if (th instanceof gbq) {
                int i = fssVar.h;
                if (i < 4) {
                    int H = a.H(fssVar.e);
                    if (H == 0) {
                        H = 1;
                    }
                    ((hkf) ((hkf) fsl.a.g()).h(th).i("com/google/apps/tiktok/account/api/controller/AccountControllerImpl$HandleAccountAction", "onFailure", 1053, "AccountControllerImpl.kt")).x("Android killed the app process before the account operation completes.retrying the failed operation. AccountControllerOperation type enum number: %s, time(s) attempted: %s, exit reason code: %s", new ekm(H - 1), new eki(i), new eki(((Number) ((gbq) th).a.d(-1)).intValue()));
                    int H2 = a.H(fssVar.e);
                    if (H2 == 0) {
                        H2 = 1;
                    }
                    int i2 = hel.d;
                    heg hegVar = new heg(4);
                    if (H2 == 2 || H2 == 3 || H2 == 6) {
                        jkx jkxVar = fssVar.f;
                        jkxVar.getClass();
                        Iterator it = jkxVar.iterator();
                        while (it.hasNext()) {
                            try {
                                hegVar.h(Class.forName((String) it.next()).asSubclass(ftl.class));
                            } catch (ClassNotFoundException e) {
                                throw new IllegalStateException(e);
                            }
                        }
                    }
                    gzp gzpVar = gyf.a;
                    if (H2 == 6) {
                        if ((fssVar.b & 64) == 0) {
                            throw new IllegalStateException("Check failed.");
                        }
                        gzpVar = gzp.g(Integer.valueOf(fssVar.j));
                    }
                    int i3 = fssVar.h;
                    int i4 = H2 - 1;
                    if (i4 == 1) {
                        Object obj2 = this.a;
                        hel g = hegVar.g();
                        g.getClass();
                        ((fsl) obj2).u(g, i3);
                        return;
                    }
                    if (i4 == 2) {
                        aC = hoq.aC(75, "Retry Switch Account Interactive with Specified Selectors");
                        try {
                            hel g2 = hegVar.g();
                            g2.getClass();
                            ((fsl) obj).s(g2, i3);
                            ixf.j(aC, null);
                            return;
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    if (i4 == 3) {
                        int i5 = fssVar.d;
                        if (i5 < 0) {
                            throw new IllegalStateException("Check failed.");
                        }
                        fslVar.t(frv.a(i5), fssVar.g, i3);
                        return;
                    }
                    if (i4 == 4) {
                        fsi fsiVar3 = fslVar.i;
                        if (fsiVar3 == null) {
                            ksp.a("viewModel");
                            fsiVar = null;
                        } else {
                            fsiVar = fsiVar3;
                        }
                        fsiVar.c = true;
                        fslVar.m(i3);
                        return;
                    }
                    if (i4 != 5) {
                        throw new IllegalStateException("AccountControllerOperation type is UNKNOWN. Shouldn't reach here because we already checked this field at the beginning of the method.");
                    }
                    Object obj3 = this.a;
                    hel g3 = hegVar.g();
                    g3.getClass();
                    int intValue = ((Number) gzpVar.b()).intValue();
                    fsl fslVar2 = (fsl) obj3;
                    fuc fucVar = fslVar2.f;
                    gbh gbhVar = fucVar.a;
                    fub fubVar = (fub) gbhVar.b(intValue);
                    fslVar2.o();
                    if (g3.isEmpty()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    fslVar2.p();
                    fsi fsiVar4 = fslVar2.i;
                    if (fsiVar4 == null) {
                        ksp.a("viewModel");
                        fsiVar4 = null;
                    }
                    fsi fsiVar5 = fslVar2.i;
                    if (fsiVar5 == null) {
                        ksp.a("viewModel");
                        fsiVar5 = null;
                    }
                    fsiVar4.c = fsiVar5.b;
                    fao.c();
                    fucVar.g();
                    fucVar.b = new ftp(gbhVar.a(fubVar), 0);
                    aC = hoq.aC(81, "Switch Account With Custom Selectors Keep State");
                    try {
                        hvi k = ((fsl) obj3).k(g3, new frx(), true);
                        if (k.isDone()) {
                            ProtoParsers$InternalDontUse protoParsers$InternalDontUse2 = new ProtoParsers$InternalDontUse(null, ((fsl) obj3).x(6, null, gzp.g(g3), gyf.a, true, gzp.g(fubVar), i3));
                            try {
                                kee keeVar = ((fsl) obj3).k;
                                Object aR = hnu.aR(k);
                                aR.getClass();
                                keeVar.f(protoParsers$InternalDontUse2, (fry) aR);
                            } catch (ExecutionException e2) {
                                e = e2;
                                kee keeVar2 = ((fsl) obj3).k;
                                Throwable cause = e.getCause();
                                if (cause != null) {
                                    e = cause;
                                }
                                keeVar2.e(protoParsers$InternalDontUse2, e);
                            }
                        } else {
                            fao.c();
                            ftp ftpVar = fucVar.b;
                            ftpVar.getClass();
                            if (ftpVar.b != 1) {
                                ftpVar.b = 1;
                                ((fub) gbhVar.b(ftpVar.a)).b();
                            }
                            ((fsl) obj3).y(6, null, gzp.g(g3), gyf.a, true, gzp.g(fubVar), k, i3);
                        }
                        ixf.j(aC, null);
                        return;
                    } finally {
                    }
                } else {
                    J(fssVar, new fsx(th));
                }
            } else {
                J(fssVar, th instanceof fsv ? (fsv) th : new fsz(th));
            }
            if ((fssVar.b & 2) != 0) {
                frv a2 = frv.a(fssVar.d);
                if (th instanceof fsv) {
                    ((hkf) ((hkf) fsl.a.e()).h(th).i("com/google/apps/tiktok/account/api/controller/AccountControllerImpl$HandleAccountAction", "onFailure", 1078, "AccountControllerImpl.kt")).u("Failed to use %s.", a2);
                } else {
                    ((hkf) ((hkf) fsl.a.f()).h(th).i("com/google/apps/tiktok/account/api/controller/AccountControllerImpl$HandleAccountAction", "onFailure", 1081, "AccountControllerImpl.kt")).u("Failed to use %s.", a2);
                }
            }
            ((fsl) this.a).r();
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Set] */
    public final void f(ProtoParsers$InternalDontUse protoParsers$InternalDontUse, fry fryVar) {
        frv frvVar;
        jll a = protoParsers$InternalDontUse.a(fss.a, jkd.a());
        a.getClass();
        fss fssVar = (fss) a;
        fsl.v(fssVar);
        fsl fslVar = (fsl) this.a;
        fsi fsiVar = fslVar.i;
        ftt fttVar = null;
        if (fsiVar == null) {
            ksp.a("viewModel");
            fsiVar = null;
        }
        if (ksp.b(fssVar, fsiVar.a())) {
            if ((fssVar.b & 2) != 0) {
                frv frvVar2 = fryVar.a;
                frvVar2.getClass();
                int i = fssVar.d;
                if (frvVar2.a != i) {
                    throw new IllegalStateException("Check failed.");
                }
                frvVar = frv.a(i);
            } else {
                if (fryVar.d != null) {
                    fsl fslVar2 = (fsl) this.a;
                    ftr ftrVar = fslVar2.e;
                    if (!ftrVar.m()) {
                        ftrVar.l();
                    }
                    Intent intent = fryVar.d;
                    intent.getClass();
                    if (ftrVar.m()) {
                        ftc.a(intent, frv.a(ftrVar.g()));
                    }
                    fslVar2.c.c().b(intent);
                    fslVar2.f.g();
                    return;
                }
                if (fryVar.c == null) {
                    J(fssVar, new fta());
                    fsl fslVar3 = (fsl) this.a;
                    fslVar3.q();
                    fslVar3.r();
                    return;
                }
                frvVar = fryVar.a;
            }
            fue fueVar = fryVar.c;
            if (fueVar == null) {
                throw new IllegalStateException("Required value was null.");
            }
            frx frxVar = fryVar.e;
            if (fueVar.a) {
                ftr ftrVar2 = fslVar.e;
                frv frvVar3 = fryVar.a;
                frvVar3.getClass();
                ful fulVar = fryVar.b;
                fulVar.getClass();
                frxVar.getClass();
                if (ftrVar2.n(new ftw(frvVar3.a, fulVar))) {
                    iyi iyiVar = ftrVar2.d;
                    iyiVar.m();
                    hoq.H(!fulVar.equals(ful.a));
                    hoq.H((fulVar.b & 256) != 0);
                    gty aC = hoq.aC(88, "onAccountReady");
                    try {
                        bst bstVar = new bst(new fwm(frvVar3, fulVar.k, (char[]) null));
                        Iterator it = iyiVar.c.iterator();
                        while (it.hasNext()) {
                            ((ftm) it.next()).e(bstVar);
                        }
                        Iterator it2 = ((ArrayList) iyiVar.a).iterator();
                        while (it2.hasNext()) {
                            ((ftm) it2.next()).e(bstVar);
                        }
                        aC.close();
                        ftrVar2.j();
                        ftrVar2.d.l(fulVar);
                    } catch (Throwable th) {
                        try {
                            aC.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                ((fsl) this.a).q();
            } else {
                fsl fslVar4 = (fsl) this.a;
                fsj fsjVar = fslVar4.c;
                if (!fsjVar.e()) {
                    fslVar4.q();
                    fsy fsyVar = new fsy();
                    J(fssVar, fsyVar);
                    ((hkf) ((hkf) fsl.a.e()).h(fsyVar).i("com/google/apps/tiktok/account/api/controller/AccountControllerImpl$HandleAccountAction", "onSuccess", 1007, "AccountControllerImpl.kt")).u("Account with id %s does not fulfill all the requirements.", frvVar);
                    fslVar4.r();
                    return;
                }
                if (fueVar.b) {
                    fslVar4.e.l();
                }
                Intent intent2 = fueVar.c;
                intent2.getClass();
                ftc.a(intent2, frvVar);
                intent2.putExtra("$tiktok$for_requirement_activity", true);
                ftt fttVar2 = fslVar4.h;
                if (fttVar2 == null) {
                    ksp.a("config");
                } else {
                    fttVar = fttVar2;
                }
                intent2.putExtra("$tiktok$canRestartAccountSelector", fttVar.b);
                intent2.addFlags(65536);
                fsjVar.b().b(intent2);
            }
            ((fsl) this.a).r();
        }
    }

    public final void g(TextInputLayout textInputLayout) {
        fqs fqsVar = (fqs) this.a;
        EditText editText = fqsVar.j;
        if (editText == textInputLayout.c) {
            return;
        }
        if (editText != null) {
            editText.removeTextChangedListener(fqsVar.k);
            if (fqsVar.j.getOnFocusChangeListener() == fqsVar.c().d()) {
                fqsVar.j.setOnFocusChangeListener(null);
            }
        }
        fqsVar.j = textInputLayout.c;
        EditText editText2 = fqsVar.j;
        if (editText2 != null) {
            editText2.addTextChangedListener(fqsVar.k);
        }
        fqsVar.c().g(fqsVar.j);
        fqsVar.o(fqsVar.c());
    }

    public final void h(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        ((fpk) this.a).e(0);
    }

    public final fnw i(fnw fnwVar) {
        return fnwVar instanceof fod ? fnwVar : new fnu(-((fob) this.a).v(), fnwVar);
    }

    public final void j() {
        ((Animator) this.a).start();
    }

    public final void k(Drawable drawable) {
        if (drawable != null) {
            super/*fkc*/.setBackgroundDrawable(drawable);
        }
    }

    public final boolean l() {
        return ((FloatingActionButton) this.a).e;
    }

    public final void m(float f) {
        fmt fmtVar = (fmt) this.a;
        ColorStateList colorStateList = fmtVar.C;
        if (colorStateList != null) {
            fmtVar.G.M(ColorStateList.valueOf(fhq.e(fmtVar.B, colorStateList.getDefaultColor(), f)));
        }
    }

    public final void n() {
        Object obj = this.a;
        synchronized (((fdl) obj).h) {
            int i = ((fdl) obj).k;
            hoq.J(i > 0, "Refcount went negative!", i);
            ((fdl) obj).k--;
            ((fdl) obj).c();
        }
    }

    public final void o() {
        Object obj = this.a;
        synchronized (((fdl) obj).h) {
            int i = ((fdl) obj).k;
            if (i == 0) {
                throw new CancellationException("database is closed");
            }
            hoq.J(i > 0, "Refcount went negative!", i);
            ((fdl) obj).k++;
        }
    }

    public final boolean p(String str, String str2) {
        return ((bry) ((evh) this.a).b.get(str)) != null && str2.equals("");
    }

    public final int q(int i) {
        return ((dpb) this.a).a.e(i);
    }

    public final hvi r() {
        return ((dev) this.a).e().e();
    }

    public final Activity s() {
        return ((dev) this.a).d;
    }

    public final void t(Activity activity) {
        ((dev) this.a).d = activity;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cot, java.lang.Object] */
    public final void u(clg clgVar) {
        this.a.i(clgVar);
    }

    public final lp v(int i) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        int c = recyclerView.h.c();
        int i2 = 0;
        lp lpVar = null;
        while (true) {
            if (i2 >= c) {
                break;
            }
            lp h = RecyclerView.h(recyclerView.h.f(i2));
            if (h != null && !h.u() && h.c == i) {
                if (!recyclerView.h.k(h.a)) {
                    lpVar = h;
                    break;
                }
                lpVar = h;
            }
            i2++;
        }
        if (lpVar == null || recyclerView.h.k(lpVar.a)) {
            return null;
        }
        return lpVar;
    }

    public final void w(hp hpVar) {
        int i = hpVar.a;
        if (i == 1) {
            ((RecyclerView) this.a).m.x(hpVar.b, hpVar.d);
            return;
        }
        if (i == 2) {
            ((RecyclerView) this.a).m.A(hpVar.b, hpVar.d);
            return;
        }
        if (i != 4) {
            if (i != 8) {
                return;
            }
            ((RecyclerView) this.a).m.z(hpVar.b, hpVar.d);
        } else {
            ky kyVar = ((RecyclerView) this.a).m;
            int i2 = hpVar.b;
            int i3 = hpVar.d;
            Object obj = hpVar.c;
            kyVar.B(i2, i3);
        }
    }

    public final void x(int i, int i2, Object obj) {
        int i3;
        int i4;
        int i5;
        RecyclerView recyclerView = (RecyclerView) this.a;
        int c = recyclerView.h.c();
        int i6 = 0;
        while (true) {
            i3 = i + i2;
            if (i6 >= c) {
                break;
            }
            View f = recyclerView.h.f(i6);
            lp h = RecyclerView.h(f);
            if (h != null && !h.z() && (i5 = h.c) >= i && i5 < i3) {
                h.e(2);
                h.d(obj);
                ((kz) f.getLayoutParams()).e = true;
            }
            i6++;
        }
        le leVar = recyclerView.e;
        ArrayList arrayList = leVar.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                recyclerView.O = true;
                return;
            }
            lp lpVar = (lp) arrayList.get(size);
            if (lpVar != null && (i4 = lpVar.c) >= i && i4 < i3) {
                lpVar.e(2);
                leVar.h(size);
            }
        }
    }

    public final void y(int i, int i2) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        int c = recyclerView.h.c();
        for (int i3 = 0; i3 < c; i3++) {
            lp h = RecyclerView.h(recyclerView.h.f(i3));
            if (h != null && !h.z() && h.c >= i) {
                h.j(i2, false);
                recyclerView.M.f = true;
            }
        }
        ArrayList arrayList = recyclerView.e.c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            lp lpVar = (lp) arrayList.get(i4);
            if (lpVar != null && lpVar.c >= i) {
                lpVar.j(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.N = true;
    }

    public final void z(int i, int i2) {
        int i3;
        RecyclerView recyclerView = (RecyclerView) this.a;
        int c = recyclerView.h.c();
        int i4 = 0;
        while (true) {
            if (i4 >= c) {
                break;
            }
            lp h = RecyclerView.h(recyclerView.h.f(i4));
            if (h != null) {
                int i5 = i < i2 ? i : i2;
                int i6 = h.c;
                if (i6 >= i5) {
                    if (i6 <= (i < i2 ? i2 : i)) {
                        if (i6 == i) {
                            h.j(i2 - i, false);
                        } else {
                            h.j(i >= i2 ? 1 : -1, false);
                        }
                        recyclerView.M.f = true;
                    }
                }
            }
            i4++;
        }
        le leVar = recyclerView.e;
        int i7 = i < i2 ? i2 : i;
        int i8 = i < i2 ? i : i2;
        ArrayList arrayList = leVar.c;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            lp lpVar = (lp) arrayList.get(i9);
            if (lpVar != null && (i3 = lpVar.c) >= i8 && i3 <= i7) {
                if (i3 == i) {
                    lpVar.j(i2 - i, false);
                } else {
                    lpVar.j(i < i2 ? -1 : 1, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.N = true;
    }

    public kee() {
        throw null;
    }

    public kee(Object obj) {
        this.a = obj;
    }

    public /* synthetic */ kee(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public kee(byte[] bArr) {
    }
}
