package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gsh {
    public guq a;
    public boolean b;
    public guq c;
    public boolean d;
    public gut e;
    private final bg f;
    private final Context g;
    private guq h;
    private boolean i;
    private boolean j;
    private gut k;
    private gut l;

    public gsh(bg bgVar, Context context) {
        this.f = bgVar;
        this.g = context;
    }

    private final guc A(guc gucVar) {
        guc e = guc.e(gucVar, guc.d(((gvg) imq.a(this.g, gvg.class)).g()));
        e.getClass();
        return e;
    }

    private final String B(String str) {
        return str + " " + this.g.getClass().getSimpleName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void C(String str, String str2, Intent intent) {
        guc A;
        this.c = gta.b();
        long j = gvx.a;
        guq m = gvx.m(intent, true);
        guc gucVar = gul.a;
        gua b = guc.b();
        b.a(gul.c, new gtd(1));
        guc f = ((guc) b).f();
        if (m != null) {
            gta.f(m);
            this.a = m;
            gucVar.getClass();
            A = A(gucVar);
        } else {
            guq guqVar = this.a;
            if (guqVar != null) {
                gta.f(guqVar);
                gucVar.getClass();
                A = A(gucVar);
            } else {
                this.j = gta.v();
                if (hoq.aI()) {
                    guq e = gta.e();
                    if (e != null) {
                        this.k = e;
                        gta.f(e);
                        this.l = hoq.aB(213, B(str), guc.e(f, gul.a(guk.h)), true);
                    } else {
                        gva e2 = ((gvf) hnu.bp(this.g, gvf.class)).e();
                        String B = B(str);
                        guc e3 = guc.e(gucVar, gul.a(guk.h));
                        e3.getClass();
                        this.k = e2.c(212, B, e3);
                    }
                }
                gucVar.getClass();
                A = A(gucVar);
                this.a = gta.b();
            }
        }
        this.e = hoq.aB(211, B(str2), guc.e(A, gul.a(guk.b)), true);
        fao.e(new gfm(this, 13));
    }

    private final void D() {
        if (this.i) {
            this.a = null;
            this.i = false;
        }
    }

    private final void E() {
        guq guqVar = this.h;
        if (guqVar != null) {
            this.a = guqVar;
            this.h = null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [guq, gut] */
    private final void F() {
        ?? r1;
        if (this.b) {
            return;
        }
        synchronized (gvx.c) {
            r1 = gvx.d;
            gvx.d = null;
        }
        if (r1 != 0) {
            this.b = true;
            this.a = r1;
        }
    }

    private final void G() {
        gut gutVar = this.e;
        if (gutVar == null) {
            return;
        }
        Objects.toString(gutVar);
        throw new IllegalStateException("Expected lifecycleStepSpan to be null but was: ".concat(gutVar.toString()));
    }

    public final gut a() {
        guc gucVar = gsl.a;
        gut n = n("finish", gsl.a);
        guq b = gta.b();
        this.h = b;
        b.getClass();
        synchronized (gvx.c) {
            gvx.d = b;
        }
        return new gsf((Object) n, (gut) new gsg((gut) b, 6), 1);
    }

    public final gut b() {
        G();
        return n("onAttachedToWindow", null);
    }

    public final gut c() {
        G();
        return new gsf((Object) n("Back pressed", null), gta.j(), 2);
    }

    public final gut d() {
        E();
        r("onDestroy", gul.a(guk.g));
        return new gsg(this, 0);
    }

    public final gut e(Intent intent) {
        intent.getClass();
        C("Reintenting into", "onNewIntent", intent);
        return new gsg(this, 2);
    }

    public final gut f() {
        E();
        r("onPause", gul.a(guk.e));
        return new gsg(this, 1);
    }

    public final gut g() {
        this.c = gta.b();
        gta.f(this.a);
        return new gsf(n("onPostResume", null), this, 3);
    }

    public final gut h() {
        D();
        guc gucVar = gub.a;
        gucVar.getClass();
        r("onRestart", gucVar);
        return new gsg(this, 2);
    }

    public final gut i() {
        D();
        F();
        r("onResume", gul.a(guk.d));
        return new gsg(this, 2);
    }

    public final gut j() {
        D();
        F();
        r("onStart", gul.a(guk.c));
        return new gsg(this, 2);
    }

    public final gut k() {
        E();
        r("onStop", gul.a(guk.f));
        return new gsg(this, 1);
    }

    public final gut l() {
        G();
        return n("onSupportNavigateUp", null);
    }

    public final gut m() {
        G();
        return n("onUserInteraction", null);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, koe] */
    public final gut n(String str, guc gucVar) {
        if (gta.u()) {
            if (gucVar == null) {
                gucVar = gub.a;
            }
            gucVar.getClass();
            return hoq.aB(219, str, A(gucVar), true);
        }
        gva aF = hoq.aF(this.g);
        aF.getClass();
        if (gucVar == null) {
            return aF.f(str, 217);
        }
        Object obj = aF.d;
        guc e = guc.e((guc) aF.b.b(), gucVar);
        e.getClass();
        return ((gvn) obj).c(str, e, 2, 218);
    }

    public final void o() {
        this.f.a().Y(new gux(hoq.aF(this.g)));
    }

    public final void p(aej aejVar) {
        int ordinal = aejVar.ordinal();
        if (ordinal == 0) {
            if (this.d) {
                s();
                this.d = false;
                return;
            }
            return;
        }
        if (ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 5) {
            s();
        } else {
            Objects.toString(aejVar);
            throw new UnsupportedOperationException("Unknown lifecycle: ".concat(aejVar.toString()));
        }
    }

    public final void q() {
        this.i = true;
        bg bgVar = this.f;
        if (bgVar.isChangingConfigurations() || bgVar.isFinishing()) {
            return;
        }
        this.a = null;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, koe] */
    public final void r(String str, guc gucVar) {
        this.c = gta.b();
        guc e = guc.e(gul.a, gucVar);
        guq guqVar = this.a;
        if (guqVar != null) {
            gta.f(guqVar);
            e.getClass();
            e = A(e);
        } else {
            this.j = gta.v();
            if (gta.u()) {
                e.getClass();
                e = A(e);
            } else {
                Context context = this.g;
                gva aF = hoq.aF(context);
                e.getClass();
                Class<?> cls = context.getClass();
                cls.getClass();
                String str2 = cls.getSimpleName() + ": " + str;
                Object obj = aF.d;
                guc e2 = guc.e((guc) aF.b.b(), e);
                e2.getClass();
                int i = aF.a;
                this.k = ((gvn) obj).c(str2, e2, 2, 216);
            }
            this.a = gta.b();
        }
        this.e = hoq.aB(215, B(str), e, true);
    }

    public final void s() {
        gut gutVar = this.e;
        if (gutVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        gutVar.close();
        this.e = null;
        if (this.j) {
            this.j = false;
            gta.o();
        }
        gut gutVar2 = this.l;
        if (gutVar2 != null) {
            gutVar2.close();
        }
        this.l = null;
        gut gutVar3 = this.k;
        if (gutVar3 != null) {
            gutVar3.close();
        }
        this.k = null;
        gta.f(this.c);
        this.c = null;
    }

    public final gut t() {
        G();
        D();
        F();
        if (this.a == null) {
            return n("onActivityResult", null);
        }
        guq b = gta.b();
        gta.f(this.a);
        return new gsf(n("onActivityResult", null), (Object) b, 0);
    }

    public final gut u() {
        F();
        Intent intent = this.f.getIntent();
        intent.getClass();
        C("Intenting into", "onCreate", intent);
        return new gsg(this, 2);
    }

    public final gut v() {
        gut i = gta.i();
        if (gta.u()) {
            return i;
        }
        Context context = this.g;
        Class<?> cls = context.getClass();
        gva aF = hoq.aF(context);
        cls.getClass();
        return new gsg((Object) aF.f(String.valueOf(cls.getSimpleName()).concat(": onCreatePanelMenu"), 214), 3);
    }

    public final gut w() {
        G();
        return n("onOptionsItemSelected", null);
    }

    public final gut x() {
        G();
        return n("onPictureInPictureModeChanged", null);
    }

    public final gut y() {
        D();
        guc gucVar = gub.a;
        gucVar.getClass();
        r("onPostCreate", gucVar);
        return new gsg(this, 2);
    }

    public final gut z() {
        guc gucVar = gub.a;
        gucVar.getClass();
        r("onSaveInstanceState", gucVar);
        return new gsg(this, 1);
    }
}
