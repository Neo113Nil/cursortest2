package g2;

import a2.h0;
import a2.j0;
import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.r0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import s1.l0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class z implements r {

    /* renamed from: a, reason: collision with root package name */
    public final View f4075a;

    /* renamed from: b, reason: collision with root package name */
    public final b1.b f4076b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f4077c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4078d;

    /* renamed from: e, reason: collision with root package name */
    public r6.l f4079e;

    /* renamed from: f, reason: collision with root package name */
    public q6.c f4080f;

    /* renamed from: g, reason: collision with root package name */
    public w f4081g;

    /* renamed from: h, reason: collision with root package name */
    public m f4082h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f4083i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f4084j;

    /* renamed from: k, reason: collision with root package name */
    public Rect f4085k;

    /* renamed from: l, reason: collision with root package name */
    public final e f4086l;

    /* renamed from: m, reason: collision with root package name */
    public final i0.d f4087m;

    /* renamed from: n, reason: collision with root package name */
    public androidx.lifecycle.c0 f4088n;

    public z(View view, s1.r rVar) {
        b1.b bVar = new b1.b(view);
        a0 a0Var = new a0(Choreographer.getInstance());
        this.f4075a = view;
        this.f4076b = bVar;
        this.f4077c = a0Var;
        this.f4079e = d.f4005j;
        this.f4080f = d.f4006k;
        this.f4081g = new w(4, j0.f406b, "");
        this.f4082h = m.f4041g;
        this.f4083i = new ArrayList();
        this.f4084j = d6.a.c(d6.h.f2616g, new r0(10, this));
        this.f4086l = new e(rVar, bVar);
        this.f4087m = new i0.d(new y[16]);
    }

    @Override // g2.r
    public final void a(w wVar, q qVar, h0 h0Var, l0 l0Var, y0.d dVar, y0.d dVar2) {
        e eVar = this.f4086l;
        synchronized (eVar.f4014c) {
            try {
                eVar.f4021j = wVar;
                eVar.f4023l = qVar;
                eVar.f4022k = h0Var;
                eVar.f4024m = l0Var;
                eVar.f4025n = dVar;
                eVar.f4026o = dVar2;
                if (!eVar.f4016e) {
                    if (eVar.f4015d) {
                    }
                }
                eVar.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // g2.r
    public final void b(y0.d dVar) {
        Rect rect;
        this.f4085k = new Rect(t6.a.O(dVar.f9780a), t6.a.O(dVar.f9781b), t6.a.O(dVar.f9782c), t6.a.O(dVar.f9783d));
        if (!this.f4083i.isEmpty() || (rect = this.f4085k) == null) {
            return;
        }
        this.f4075a.requestRectangleOnScreen(new Rect(rect));
    }

    /* JADX WARN: Type inference failed for: r14v14, types: [d6.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v22, types: [d6.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v8, types: [d6.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [d6.g, java.lang.Object] */
    @Override // g2.r
    public final void c(w wVar, w wVar2) {
        boolean z8 = (j0.a(this.f4081g.f4066b, wVar2.f4066b) && r6.k.a(this.f4081g.f4067c, wVar2.f4067c)) ? false : true;
        this.f4081g = wVar2;
        int size = this.f4083i.size();
        for (int i7 = 0; i7 < size; i7++) {
            s sVar = (s) ((WeakReference) this.f4083i.get(i7)).get();
            if (sVar != null) {
                sVar.f4054d = wVar2;
            }
        }
        e eVar = this.f4086l;
        synchronized (eVar.f4014c) {
            eVar.f4021j = null;
            eVar.f4023l = null;
            eVar.f4022k = null;
            eVar.f4024m = d.f4003h;
            eVar.f4025n = null;
            eVar.f4026o = null;
        }
        if (r6.k.a(wVar, wVar2)) {
            if (z8) {
                b1.b bVar = this.f4076b;
                int e9 = j0.e(wVar2.f4066b);
                int d8 = j0.d(wVar2.f4066b);
                j0 j0Var = this.f4081g.f4067c;
                int e10 = j0Var != null ? j0.e(j0Var.f408a) : -1;
                j0 j0Var2 = this.f4081g.f4067c;
                ((InputMethodManager) bVar.f1231h.getValue()).updateSelection((View) bVar.f1230g, e9, d8, e10, j0Var2 != null ? j0.d(j0Var2.f408a) : -1);
                return;
            }
            return;
        }
        if (wVar != null && (!r6.k.a(wVar.f4065a.f373f, wVar2.f4065a.f373f) || (j0.a(wVar.f4066b, wVar2.f4066b) && !r6.k.a(wVar.f4067c, wVar2.f4067c)))) {
            b1.b bVar2 = this.f4076b;
            ((InputMethodManager) bVar2.f1231h.getValue()).restartInput((View) bVar2.f1230g);
            return;
        }
        int size2 = this.f4083i.size();
        for (int i8 = 0; i8 < size2; i8++) {
            s sVar2 = (s) ((WeakReference) this.f4083i.get(i8)).get();
            if (sVar2 != null) {
                w wVar3 = this.f4081g;
                b1.b bVar3 = this.f4076b;
                if (sVar2.f4058h) {
                    sVar2.f4054d = wVar3;
                    if (sVar2.f4056f) {
                        ((InputMethodManager) bVar3.f1231h.getValue()).updateExtractedText((View) bVar3.f1230g, sVar2.f4055e, a.a.O(wVar3));
                    }
                    j0 j0Var3 = wVar3.f4067c;
                    long j8 = wVar3.f4066b;
                    int e11 = j0Var3 != null ? j0.e(j0Var3.f408a) : -1;
                    j0 j0Var4 = wVar3.f4067c;
                    ((InputMethodManager) bVar3.f1231h.getValue()).updateSelection((View) bVar3.f1230g, j0.e(j8), j0.d(j8), e11, j0Var4 != null ? j0.d(j0Var4.f408a) : -1);
                }
            }
        }
    }

    @Override // g2.r
    public final void d(w wVar, m mVar, c.h hVar, w.p pVar) {
        this.f4078d = true;
        this.f4081g = wVar;
        this.f4082h = mVar;
        this.f4079e = hVar;
        this.f4080f = pVar;
        i(y.f4070f);
    }

    @Override // g2.r
    public final void e() {
        i(y.f4070f);
    }

    @Override // g2.r
    public final void f() {
        i(y.f4072h);
    }

    @Override // g2.r
    public final void g() {
        i(y.f4073i);
    }

    @Override // g2.r
    public final void h() {
        this.f4078d = false;
        this.f4079e = d.f4007l;
        this.f4080f = d.f4008m;
        this.f4085k = null;
        i(y.f4071g);
    }

    public final void i(y yVar) {
        this.f4087m.b(yVar);
        if (this.f4088n == null) {
            androidx.lifecycle.c0 c0Var = new androidx.lifecycle.c0(5, this);
            this.f4077c.execute(c0Var);
            this.f4088n = c0Var;
        }
    }
}
