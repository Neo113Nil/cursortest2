package I0;

import C0.J;
import a0.C0239d;
import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import h2.AbstractC0508a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import r0.C0929z;
import u0.C1123s;
import x.C1204q;

/* loaded from: classes.dex */
public final class C implements u {

    /* renamed from: a, reason: collision with root package name */
    public final View f3012a;

    /* renamed from: b, reason: collision with root package name */
    public final G1.m f3013b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f3014c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3015d;

    /* renamed from: e, reason: collision with root package name */
    public f2.k f3016e;

    /* renamed from: f, reason: collision with root package name */
    public f2.k f3017f;

    /* renamed from: g, reason: collision with root package name */
    public z f3018g;

    /* renamed from: h, reason: collision with root package name */
    public m f3019h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f3020i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f3021j;

    /* renamed from: k, reason: collision with root package name */
    public Rect f3022k;

    /* renamed from: l, reason: collision with root package name */
    public final C0192e f3023l;

    /* renamed from: m, reason: collision with root package name */
    public final K.d f3024m;

    /* renamed from: n, reason: collision with root package name */
    public E.t f3025n;

    public C(View view, C1123s c1123s) {
        G1.m mVar = new G1.m(view);
        final Choreographer choreographer = Choreographer.getInstance();
        Executor executor = new Executor() { // from class: I0.D
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                choreographer.postFrameCallback(new E(runnable, 0));
            }
        };
        this.f3012a = view;
        this.f3013b = mVar;
        this.f3014c = executor;
        this.f3016e = C0191d.f3038h;
        this.f3017f = C0191d.f3039i;
        this.f3018g = new z("", J.f567b, 4);
        this.f3019h = m.f3071g;
        this.f3020i = new ArrayList();
        this.f3021j = R1.a.c(R1.g.f4148e, new A.h(10, this));
        this.f3023l = new C0192e(c1123s, mVar);
        this.f3024m = new K.d(new B[16]);
    }

    @Override // I0.u
    public final void a() {
        i(B.f3009f);
    }

    @Override // I0.u
    public final void b(C0239d c0239d) {
        Rect rect;
        this.f3022k = new Rect(AbstractC0508a.Q(c0239d.f4724a), AbstractC0508a.Q(c0239d.f4725b), AbstractC0508a.Q(c0239d.f4726c), AbstractC0508a.Q(c0239d.f4727d));
        if (!this.f3020i.isEmpty() || (rect = this.f3022k) == null) {
            return;
        }
        this.f3012a.requestRectangleOnScreen(new Rect(rect));
    }

    @Override // I0.u
    public final void c() {
        i(B.f3010g);
    }

    @Override // I0.u
    public final void d(z zVar, m mVar, R.h hVar, C1204q c1204q) {
        this.f3015d = true;
        this.f3018g = zVar;
        this.f3019h = mVar;
        this.f3016e = hVar;
        this.f3017f = c1204q;
        i(B.f3007d);
    }

    @Override // I0.u
    public final void e() {
        this.f3015d = false;
        this.f3016e = C0191d.f3040j;
        this.f3017f = C0191d.f3041k;
        this.f3022k = null;
        i(B.f3008e);
    }

    /* JADX WARN: Type inference failed for: r12v14, types: [R1.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v22, types: [R1.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v8, types: [R1.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [R1.f, java.lang.Object] */
    @Override // I0.u
    public final void f(z zVar, z zVar2) {
        boolean z3 = (J.a(this.f3018g.f3098b, zVar2.f3098b) && f2.j.a(this.f3018g.f3099c, zVar2.f3099c)) ? false : true;
        this.f3018g = zVar2;
        int size = this.f3020i.size();
        for (int i3 = 0; i3 < size; i3++) {
            v vVar = (v) ((WeakReference) this.f3020i.get(i3)).get();
            if (vVar != null) {
                vVar.f3086d = zVar2;
            }
        }
        C0192e c0192e = this.f3023l;
        synchronized (c0192e.f3045c) {
            c0192e.f3052j = null;
            c0192e.f3054l = null;
            c0192e.f3053k = null;
            c0192e.f3055m = C0191d.f3036f;
            c0192e.f3056n = null;
            c0192e.f3057o = null;
        }
        if (f2.j.a(zVar, zVar2)) {
            if (z3) {
                G1.m mVar = this.f3013b;
                int e3 = J.e(zVar2.f3098b);
                int d3 = J.d(zVar2.f3098b);
                J j3 = this.f3018g.f3099c;
                int e4 = j3 != null ? J.e(j3.f569a) : -1;
                J j4 = this.f3018g.f3099c;
                ((InputMethodManager) mVar.f2117c.getValue()).updateSelection((View) mVar.f2116b, e3, d3, e4, j4 != null ? J.d(j4.f569a) : -1);
                return;
            }
            return;
        }
        if (zVar != null && (!f2.j.a(zVar.f3097a.f596a, zVar2.f3097a.f596a) || (J.a(zVar.f3098b, zVar2.f3098b) && !f2.j.a(zVar.f3099c, zVar2.f3099c)))) {
            G1.m mVar2 = this.f3013b;
            ((InputMethodManager) mVar2.f2117c.getValue()).restartInput((View) mVar2.f2116b);
            return;
        }
        int size2 = this.f3020i.size();
        for (int i4 = 0; i4 < size2; i4++) {
            v vVar2 = (v) ((WeakReference) this.f3020i.get(i4)).get();
            if (vVar2 != null) {
                z zVar3 = this.f3018g;
                G1.m mVar3 = this.f3013b;
                if (vVar2.f3090h) {
                    vVar2.f3086d = zVar3;
                    if (vVar2.f3088f) {
                        ((InputMethodManager) mVar3.f2117c.getValue()).updateExtractedText((View) mVar3.f2116b, vVar2.f3087e, l0.c.P(zVar3));
                    }
                    J j5 = zVar3.f3099c;
                    int e5 = j5 != null ? J.e(j5.f569a) : -1;
                    J j6 = zVar3.f3099c;
                    int d4 = j6 != null ? J.d(j6.f569a) : -1;
                    long j7 = zVar3.f3098b;
                    ((InputMethodManager) mVar3.f2117c.getValue()).updateSelection((View) mVar3.f2116b, J.e(j7), J.d(j7), e5, d4);
                }
            }
        }
    }

    @Override // I0.u
    public final void g(z zVar, t tVar, C0.H h3, C0929z c0929z, C0239d c0239d, C0239d c0239d2) {
        C0192e c0192e = this.f3023l;
        synchronized (c0192e.f3045c) {
            try {
                c0192e.f3052j = zVar;
                c0192e.f3054l = tVar;
                c0192e.f3053k = h3;
                c0192e.f3055m = c0929z;
                c0192e.f3056n = c0239d;
                c0192e.f3057o = c0239d2;
                if (!c0192e.f3047e) {
                    if (c0192e.f3046d) {
                    }
                }
                c0192e.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // I0.u
    public final void h() {
        i(B.f3007d);
    }

    public final void i(B b3) {
        this.f3024m.b(b3);
        if (this.f3025n == null) {
            E.t tVar = new E.t(1, this);
            this.f3014c.execute(tVar);
            this.f3025n = tVar;
        }
    }
}
