package defpackage;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.firebase.encoders.json.BuildConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class uv2 implements i22 {
    public final View a;
    public final mh b;
    public final vv2 c;
    public boolean d;
    public Function1 e;
    public Function1 f;
    public nv2 g;
    public c11 h;
    public final ArrayList i;
    public final y91 j;
    public Rect k;
    public final o50 l;
    public final eo1 m;
    public k3 n;

    public uv2(View view, t7 t7Var) {
        mh mhVar = new mh(view);
        vv2 vv2Var = new vv2(Choreographer.getInstance());
        this.a = view;
        this.b = mhVar;
        this.c = vv2Var;
        this.e = cv2.p;
        this.f = cv2.q;
        this.g = new nv2(BuildConfig.FLAVOR, 4, jw2.b);
        this.h = c11.g;
        this.i = new ArrayList();
        this.j = ya1.a(kc1.m, new ng2(2, this));
        this.l = new o50(t7Var, mhVar);
        this.m = new eo1(new tv2[16]);
    }

    @Override // defpackage.i22
    public final void a() {
        i(tv2.m);
    }

    @Override // defpackage.i22
    public final void b(nv2 nv2Var, c11 c11Var, oc ocVar, d40 d40Var) {
        this.d = true;
        this.g = nv2Var;
        this.h = c11Var;
        this.e = ocVar;
        this.f = d40Var;
        i(tv2.m);
    }

    @Override // defpackage.i22
    public final void c(nv2 nv2Var, nv2 nv2Var2) {
        boolean z = (jw2.a(this.g.b, nv2Var2.b) && Intrinsics.b(this.g.c, nv2Var2.c)) ? false : true;
        this.g = nv2Var2;
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            t72 t72Var = (t72) ((WeakReference) this.i.get(i)).get();
            if (t72Var != null) {
                t72Var.d = nv2Var2;
            }
        }
        o50 o50Var = this.l;
        synchronized (o50Var.c) {
            o50Var.j = null;
            o50Var.l = null;
            o50Var.k = null;
            o50Var.m = o3.J;
            o50Var.n = null;
            o50Var.o = null;
            Unit unit = Unit.a;
        }
        if (Intrinsics.b(nv2Var, nv2Var2)) {
            if (z) {
                mh mhVar = this.b;
                int e = jw2.e(nv2Var2.b);
                int d = jw2.d(nv2Var2.b);
                jw2 jw2Var = this.g.c;
                int e2 = jw2Var != null ? jw2.e(jw2Var.a) : -1;
                jw2 jw2Var2 = this.g.c;
                ((InputMethodManager) ((y91) mhVar.o).getValue()).updateSelection((View) mhVar.n, e, d, e2, jw2Var2 != null ? jw2.d(jw2Var2.a) : -1);
                return;
            }
            return;
        }
        if (nv2Var != null && (!Intrinsics.b(nv2Var.a.n, nv2Var2.a.n) || (jw2.a(nv2Var.b, nv2Var2.b) && !Intrinsics.b(nv2Var.c, nv2Var2.c)))) {
            mh mhVar2 = this.b;
            ((InputMethodManager) ((y91) mhVar2.o).getValue()).restartInput((View) mhVar2.n);
            return;
        }
        int size2 = this.i.size();
        for (int i2 = 0; i2 < size2; i2++) {
            t72 t72Var2 = (t72) ((WeakReference) this.i.get(i2)).get();
            if (t72Var2 != null) {
                nv2 nv2Var3 = this.g;
                mh mhVar3 = this.b;
                if (t72Var2.h) {
                    t72Var2.d = nv2Var3;
                    if (t72Var2.f) {
                        ((InputMethodManager) ((y91) mhVar3.o).getValue()).updateExtractedText((View) mhVar3.n, t72Var2.e, bd3.M(nv2Var3));
                    }
                    jw2 jw2Var3 = nv2Var3.c;
                    long j = nv2Var3.b;
                    int e3 = jw2Var3 != null ? jw2.e(jw2Var3.a) : -1;
                    jw2 jw2Var4 = nv2Var3.c;
                    ((InputMethodManager) ((y91) mhVar3.o).getValue()).updateSelection((View) mhVar3.n, jw2.e(j), jw2.d(j), e3, jw2Var4 != null ? jw2.d(jw2Var4.a) : -1);
                }
            }
        }
    }

    @Override // defpackage.i22
    public final void d() {
        i(tv2.o);
    }

    @Override // defpackage.i22
    public final void e() {
        i(tv2.p);
    }

    @Override // defpackage.i22
    public final void f(nv2 nv2Var, cu1 cu1Var, bw2 bw2Var, s72 s72Var, w72 w72Var, w72 w72Var2) {
        o50 o50Var = this.l;
        synchronized (o50Var.c) {
            try {
                o50Var.j = nv2Var;
                o50Var.l = cu1Var;
                o50Var.k = bw2Var;
                o50Var.m = s72Var;
                o50Var.n = w72Var;
                o50Var.o = w72Var2;
                if (!o50Var.e) {
                    if (o50Var.d) {
                    }
                    Unit unit = Unit.a;
                }
                o50Var.a();
                Unit unit2 = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.i22
    public final void g() {
        this.d = false;
        this.e = cv2.r;
        this.f = cv2.s;
        this.k = null;
        i(tv2.n);
    }

    @Override // defpackage.i22
    public final void h(w72 w72Var) {
        Rect rect;
        this.k = new Rect(si1.b(w72Var.a), si1.b(w72Var.b), si1.b(w72Var.c), si1.b(w72Var.d));
        if (!this.i.isEmpty() || (rect = this.k) == null) {
            return;
        }
        this.a.requestRectangleOnScreen(new Rect(rect));
    }

    public final void i(tv2 tv2Var) {
        this.m.b(tv2Var);
        if (this.n == null) {
            k3 k3Var = new k3(24, this);
            this.c.execute(k3Var);
            this.n = k3Var;
        }
    }
}
