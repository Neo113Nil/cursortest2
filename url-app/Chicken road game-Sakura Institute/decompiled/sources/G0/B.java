package G0;

import A0.I;
import A0.K;
import B1.C0097d;
import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import s0.C1160o0;
import s0.C1166s;
import w.C1277q;
import y2.C1336k;
import y2.EnumC1337l;

/* loaded from: classes.dex */
public final class B implements t {

    /* renamed from: a, reason: collision with root package name */
    public final View f3008a;

    /* renamed from: b, reason: collision with root package name */
    public final C0097d f3009b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f3010c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3011d;

    /* renamed from: e, reason: collision with root package name */
    public M2.p f3012e;

    /* renamed from: f, reason: collision with root package name */
    public M2.p f3013f;

    /* renamed from: g, reason: collision with root package name */
    public y f3014g;

    /* renamed from: h, reason: collision with root package name */
    public m f3015h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f3016i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f3017j;

    /* renamed from: k, reason: collision with root package name */
    public Rect f3018k;

    /* renamed from: l, reason: collision with root package name */
    public final C0241e f3019l;

    /* renamed from: m, reason: collision with root package name */
    public final I.d f3020m;

    /* renamed from: n, reason: collision with root package name */
    public C.t f3021n;

    public B(View view, C1166s c1166s) {
        C0097d c0097d = new C0097d(view);
        final Choreographer choreographer = Choreographer.getInstance();
        Executor executor = new Executor() { // from class: G0.C
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                choreographer.postFrameCallback(new D(runnable, 0));
            }
        };
        this.f3008a = view;
        this.f3009b = c0097d;
        this.f3010c = executor;
        this.f3012e = C0240d.f3034j;
        this.f3013f = C0240d.f3035k;
        this.f3014g = new y(4, K.f299b, "");
        this.f3015h = m.f3067g;
        this.f3016i = new ArrayList();
        this.f3017j = C1336k.b(EnumC1337l.f11671e, new A3.e(6, this));
        this.f3019l = new C0241e(c1166s, c0097d);
        this.f3020m = new I.d(new A[16]);
    }

    @Override // G0.t
    public final void a(Y.d dVar) {
        Rect rect;
        this.f3018k = new Rect(O2.c.a(dVar.f4374a), O2.c.a(dVar.f4375b), O2.c.a(dVar.f4376c), O2.c.a(dVar.f4377d));
        if (!this.f3016i.isEmpty() || (rect = this.f3018k) == null) {
            return;
        }
        this.f3008a.requestRectangleOnScreen(new Rect(rect));
    }

    @Override // G0.t
    public final void b() {
        i(A.f3005i);
    }

    @Override // G0.t
    public final void c() {
        i(A.f3006j);
    }

    @Override // G0.t
    public final void d() {
        this.f3011d = false;
        this.f3012e = C0240d.f3036l;
        this.f3013f = C0240d.f3037m;
        this.f3018k = null;
        i(A.f3004e);
    }

    @Override // G0.t
    public final void e(y yVar, m mVar, P.h hVar, C1277q c1277q) {
        this.f3011d = true;
        this.f3014g = yVar;
        this.f3015h = mVar;
        this.f3012e = hVar;
        this.f3013f = c1277q;
        i(A.f3003d);
    }

    @Override // G0.t
    public final void f(y yVar, s sVar, I i2, C1160o0 c1160o0, Y.d dVar, Y.d dVar2) {
        C0241e c0241e = this.f3019l;
        synchronized (c0241e.f3041c) {
            try {
                c0241e.f3048j = yVar;
                c0241e.f3050l = sVar;
                c0241e.f3049k = i2;
                c0241e.f3051m = c1160o0;
                c0241e.f3052n = dVar;
                c0241e.f3053o = dVar2;
                if (!c0241e.f3043e) {
                    if (c0241e.f3042d) {
                    }
                    Unit unit = Unit.f7487a;
                }
                c0241e.a();
                Unit unit2 = Unit.f7487a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // G0.t
    public final void g() {
        i(A.f3003d);
    }

    /* JADX WARN: Type inference failed for: r13v14, types: [java.lang.Object, y2.j] */
    /* JADX WARN: Type inference failed for: r13v22, types: [java.lang.Object, y2.j] */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Object, y2.j] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, y2.j] */
    @Override // G0.t
    public final void h(y yVar, y yVar2) {
        boolean z4 = (K.a(this.f3014g.f3094b, yVar2.f3094b) && Intrinsics.a(this.f3014g.f3095c, yVar2.f3095c)) ? false : true;
        this.f3014g = yVar2;
        int size = this.f3016i.size();
        for (int i2 = 0; i2 < size; i2++) {
            u uVar = (u) ((WeakReference) this.f3016i.get(i2)).get();
            if (uVar != null) {
                uVar.f3082d = yVar2;
            }
        }
        C0241e c0241e = this.f3019l;
        synchronized (c0241e.f3041c) {
            c0241e.f3048j = null;
            c0241e.f3050l = null;
            c0241e.f3049k = null;
            c0241e.f3051m = C0240d.f3032e;
            c0241e.f3052n = null;
            c0241e.f3053o = null;
            Unit unit = Unit.f7487a;
        }
        if (Intrinsics.a(yVar, yVar2)) {
            if (z4) {
                C0097d c0097d = this.f3009b;
                int e4 = K.e(yVar2.f3094b);
                int d4 = K.d(yVar2.f3094b);
                K k4 = this.f3014g.f3095c;
                int e5 = k4 != null ? K.e(k4.f301a) : -1;
                K k5 = this.f3014g.f3095c;
                ((InputMethodManager) c0097d.f988i.getValue()).updateSelection((View) c0097d.f987e, e4, d4, e5, k5 != null ? K.d(k5.f301a) : -1);
                return;
            }
            return;
        }
        if (yVar != null && (!Intrinsics.a(yVar.f3093a.f328a, yVar2.f3093a.f328a) || (K.a(yVar.f3094b, yVar2.f3094b) && !Intrinsics.a(yVar.f3095c, yVar2.f3095c)))) {
            C0097d c0097d2 = this.f3009b;
            ((InputMethodManager) c0097d2.f988i.getValue()).restartInput((View) c0097d2.f987e);
            return;
        }
        int size2 = this.f3016i.size();
        for (int i4 = 0; i4 < size2; i4++) {
            u uVar2 = (u) ((WeakReference) this.f3016i.get(i4)).get();
            if (uVar2 != null) {
                y yVar3 = this.f3014g;
                C0097d c0097d3 = this.f3009b;
                if (uVar2.f3086h) {
                    uVar2.f3082d = yVar3;
                    if (uVar2.f3084f) {
                        ((InputMethodManager) c0097d3.f988i.getValue()).updateExtractedText((View) c0097d3.f987e, uVar2.f3083e, j0.c.S(yVar3));
                    }
                    K k6 = yVar3.f3095c;
                    int e6 = k6 != null ? K.e(k6.f301a) : -1;
                    K k7 = yVar3.f3095c;
                    int d5 = k7 != null ? K.d(k7.f301a) : -1;
                    long j4 = yVar3.f3094b;
                    ((InputMethodManager) c0097d3.f988i.getValue()).updateSelection((View) c0097d3.f987e, K.e(j4), K.d(j4), e6, d5);
                }
            }
        }
    }

    public final void i(A a4) {
        this.f3020m.b(a4);
        if (this.f3021n == null) {
            C.t tVar = new C.t(1, this);
            this.f3010c.execute(tVar);
            this.f3021n = tVar;
        }
    }
}
