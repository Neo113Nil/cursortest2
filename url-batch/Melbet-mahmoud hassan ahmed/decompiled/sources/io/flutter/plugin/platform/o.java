package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import io.flutter.embedding.android.g;
import io.flutter.embedding.android.s;
import io.flutter.embedding.engine.FlutterOverlaySurface;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.plugin.platform.o;
import io.flutter.view.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import l5.k;

/* loaded from: classes.dex */
public class o implements i {

    /* renamed from: w, reason: collision with root package name */
    private static Class[] f17389w = {SurfaceView.class};

    /* renamed from: b, reason: collision with root package name */
    private io.flutter.embedding.android.a f17391b;

    /* renamed from: c, reason: collision with root package name */
    private Context f17392c;

    /* renamed from: d, reason: collision with root package name */
    private io.flutter.embedding.android.k f17393d;

    /* renamed from: e, reason: collision with root package name */
    private io.flutter.view.d f17394e;

    /* renamed from: f, reason: collision with root package name */
    private io.flutter.plugin.editing.f f17395f;

    /* renamed from: g, reason: collision with root package name */
    private l5.k f17396g;

    /* renamed from: o, reason: collision with root package name */
    private int f17404o = 0;

    /* renamed from: p, reason: collision with root package name */
    private boolean f17405p = false;

    /* renamed from: q, reason: collision with root package name */
    private boolean f17406q = true;

    /* renamed from: u, reason: collision with root package name */
    private boolean f17410u = false;

    /* renamed from: v, reason: collision with root package name */
    private final k.g f17411v = new a();

    /* renamed from: a, reason: collision with root package name */
    private final g f17390a = new g();

    /* renamed from: i, reason: collision with root package name */
    final HashMap<Integer, p> f17398i = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private final io.flutter.plugin.platform.a f17397h = new io.flutter.plugin.platform.a();

    /* renamed from: j, reason: collision with root package name */
    final HashMap<Context, View> f17399j = new HashMap<>();

    /* renamed from: m, reason: collision with root package name */
    private final SparseArray<io.flutter.embedding.android.g> f17402m = new SparseArray<>();

    /* renamed from: r, reason: collision with root package name */
    private final HashSet<Integer> f17407r = new HashSet<>();

    /* renamed from: s, reason: collision with root package name */
    private final HashSet<Integer> f17408s = new HashSet<>();

    /* renamed from: n, reason: collision with root package name */
    private final SparseArray<h> f17403n = new SparseArray<>();

    /* renamed from: k, reason: collision with root package name */
    private final SparseArray<d> f17400k = new SparseArray<>();

    /* renamed from: l, reason: collision with root package name */
    private final SparseArray<d5.a> f17401l = new SparseArray<>();

    /* renamed from: t, reason: collision with root package name */
    private final s f17409t = s.a();

    class a implements k.g {
        a() {
        }

        private void m(int i7) {
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= i7) {
                return;
            }
            throw new IllegalStateException("Trying to use platform views with API " + i8 + ", required API level is: " + i7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n(k.d dVar, View view, boolean z6) {
            if (z6) {
                o.this.f17396g.d(dVar.f18713a);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o(int i7, View view, boolean z6) {
            o oVar = o.this;
            if (z6) {
                oVar.f17396g.d(i7);
            } else if (oVar.f17395f != null) {
                o.this.f17395f.l(i7);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void p(p pVar, k.b bVar) {
            o.this.j0(pVar);
            bVar.a(new k.c(o.this.g0(pVar.d()), o.this.g0(pVar.c())));
        }

        @Override // l5.k.g
        public void a(boolean z6) {
            o.this.f17406q = z6;
        }

        @Override // l5.k.g
        public void b(int i7, double d7, double d8) {
            if (o.this.b(i7)) {
                return;
            }
            h hVar = (h) o.this.f17403n.get(i7);
            if (hVar == null) {
                z4.b.b("PlatformViewsController", "Setting offset for unknown platform view with id: " + i7);
                return;
            }
            int i02 = o.this.i0(d7);
            int i03 = o.this.i0(d8);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) hVar.getLayoutParams();
            layoutParams.topMargin = i02;
            layoutParams.leftMargin = i03;
            hVar.j(layoutParams);
        }

        @Override // l5.k.g
        @TargetApi(17)
        public void c(int i7, int i8) {
            View view;
            StringBuilder sb;
            String str;
            if (!o.k0(i8)) {
                throw new IllegalStateException("Trying to set unknown direction value: " + i8 + "(view id: " + i7 + ")");
            }
            if (o.this.b(i7)) {
                view = o.this.f17398i.get(Integer.valueOf(i7)).e();
            } else {
                d dVar = (d) o.this.f17400k.get(i7);
                if (dVar == null) {
                    sb = new StringBuilder();
                    str = "Setting direction to an unknown view with id: ";
                    sb.append(str);
                    sb.append(i7);
                    z4.b.b("PlatformViewsController", sb.toString());
                }
                view = dVar.getView();
            }
            if (view != null) {
                view.setLayoutDirection(i8);
                return;
            }
            sb = new StringBuilder();
            str = "Setting direction to a null view with id: ";
            sb.append(str);
            sb.append(i7);
            z4.b.b("PlatformViewsController", sb.toString());
        }

        @Override // l5.k.g
        @TargetApi(20)
        public long d(final k.d dVar) {
            h hVar;
            long j7;
            final int i7 = dVar.f18713a;
            if (o.this.f17403n.get(i7) != null) {
                throw new IllegalStateException("Trying to create an already created platform view, view id: " + i7);
            }
            if (!o.k0(dVar.f18719g)) {
                throw new IllegalStateException("Trying to create a view with unknown direction value: " + dVar.f18719g + "(view id: " + i7 + ")");
            }
            if (o.this.f17394e == null) {
                throw new IllegalStateException("Texture registry is null. This means that platform views controller was detached, view id: " + i7);
            }
            if (o.this.f17393d == null) {
                throw new IllegalStateException("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: " + i7);
            }
            e b7 = o.this.f17390a.b(dVar.f18714b);
            if (b7 == null) {
                throw new IllegalStateException("Trying to create a platform view of unregistered type: " + dVar.f18714b);
            }
            Object b8 = dVar.f18720h != null ? b7.b().b(dVar.f18720h) : null;
            d a7 = b7.a(new MutableContextWrapper(o.this.f17392c), i7, b8);
            o.this.f17400k.put(i7, a7);
            View view = a7.getView();
            if (view == null) {
                throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
            }
            if (view.getParent() != null) {
                throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            }
            view.setLayoutDirection(dVar.f18719g);
            int i02 = o.this.i0(dVar.f18715c);
            int i03 = o.this.i0(dVar.f18716d);
            boolean z6 = u5.h.f(view, o.f17389w) || Build.VERSION.SDK_INT < 23;
            if (!o.this.f17410u && z6) {
                z4.b.d("PlatformViewsController", "Hosting view in a virtual display for platform view: " + i7);
                m(20);
                d.c a8 = o.this.f17394e.a();
                p a9 = p.a(o.this.f17392c, o.this.f17397h, a7, a8, i02, i03, dVar.f18713a, b8, new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.m
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view2, boolean z7) {
                        o.a.this.n(dVar, view2, z7);
                    }
                });
                if (a9 != null) {
                    if (o.this.f17393d != null) {
                        a9.f(o.this.f17393d);
                    }
                    o.this.f17398i.put(Integer.valueOf(dVar.f18713a), a9);
                    o.this.f17399j.put(view.getContext(), view);
                    return a8.e();
                }
                throw new IllegalStateException("Failed creating virtual display for a " + dVar.f18714b + " with id: " + dVar.f18713a);
            }
            m(23);
            z4.b.d("PlatformViewsController", "Hosting view in view hierarchy for platform view: " + i7);
            if (o.this.f17410u) {
                hVar = new h(o.this.f17392c);
                j7 = -1;
            } else {
                d.c a10 = o.this.f17394e.a();
                h hVar2 = new h(o.this.f17392c, a10);
                long e7 = a10.e();
                hVar = hVar2;
                j7 = e7;
            }
            hVar.m(o.this.f17391b);
            hVar.i(i02, i03);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i02, i03);
            int i04 = o.this.i0(dVar.f18717e);
            int i05 = o.this.i0(dVar.f18718f);
            layoutParams.topMargin = i04;
            layoutParams.leftMargin = i05;
            hVar.j(layoutParams);
            view.setLayoutParams(new FrameLayout.LayoutParams(i02, i03));
            view.setImportantForAccessibility(4);
            hVar.addView(view);
            hVar.k(new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.l
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view2, boolean z7) {
                    o.a.this.o(i7, view2, z7);
                }
            });
            o.this.f17393d.addView(hVar);
            o.this.f17403n.append(i7, hVar);
            return j7;
        }

        @Override // l5.k.g
        public void e(k.e eVar, final k.b bVar) {
            int i02 = o.this.i0(eVar.f18722b);
            int i03 = o.this.i0(eVar.f18723c);
            int i7 = eVar.f18721a;
            if (o.this.b(i7)) {
                final p pVar = o.this.f17398i.get(Integer.valueOf(i7));
                o.this.S(pVar);
                pVar.i(i02, i03, new Runnable() { // from class: io.flutter.plugin.platform.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        o.a.this.p(pVar, bVar);
                    }
                });
                return;
            }
            d dVar = (d) o.this.f17400k.get(i7);
            h hVar = (h) o.this.f17403n.get(i7);
            if (dVar == null || hVar == null) {
                z4.b.b("PlatformViewsController", "Resizing unknown platform view with id: " + i7);
                return;
            }
            if (i02 > hVar.e() || i03 > hVar.d()) {
                hVar.i(i02, i03);
            }
            ViewGroup.LayoutParams layoutParams = hVar.getLayoutParams();
            layoutParams.width = i02;
            layoutParams.height = i03;
            hVar.setLayoutParams(layoutParams);
            View view = dVar.getView();
            if (view != null) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.width = i02;
                layoutParams2.height = i03;
                view.setLayoutParams(layoutParams2);
            }
            bVar.a(new k.c(o.this.g0(hVar.e()), o.this.g0(hVar.d())));
        }

        @Override // l5.k.g
        public void f(int i7) {
            View view;
            StringBuilder sb;
            String str;
            if (o.this.b(i7)) {
                view = o.this.f17398i.get(Integer.valueOf(i7)).e();
            } else {
                d dVar = (d) o.this.f17400k.get(i7);
                if (dVar == null) {
                    sb = new StringBuilder();
                    str = "Clearing focus on an unknown view with id: ";
                    sb.append(str);
                    sb.append(i7);
                    z4.b.b("PlatformViewsController", sb.toString());
                }
                view = dVar.getView();
            }
            if (view != null) {
                view.clearFocus();
                return;
            }
            sb = new StringBuilder();
            str = "Clearing focus on a null view with id: ";
            sb.append(str);
            sb.append(i7);
            z4.b.b("PlatformViewsController", sb.toString());
        }

        @Override // l5.k.g
        public void g(k.f fVar) {
            int i7 = fVar.f18724a;
            float f7 = o.this.f17392c.getResources().getDisplayMetrics().density;
            if (o.this.b(i7)) {
                o.this.f17398i.get(Integer.valueOf(i7)).b(o.this.h0(f7, fVar, true));
                return;
            }
            d dVar = (d) o.this.f17400k.get(i7);
            if (dVar == null) {
                z4.b.b("PlatformViewsController", "Sending touch to an unknown view with id: " + i7);
                return;
            }
            View view = dVar.getView();
            if (view != null) {
                view.dispatchTouchEvent(o.this.h0(f7, fVar, false));
                return;
            }
            z4.b.b("PlatformViewsController", "Sending touch to a null view with id: " + i7);
        }

        @Override // l5.k.g
        public void h(int i7) {
            d dVar = (d) o.this.f17400k.get(i7);
            if (dVar == null) {
                z4.b.b("PlatformViewsController", "Disposing unknown platform view with id: " + i7);
                return;
            }
            o.this.f17400k.remove(i7);
            try {
                dVar.d();
            } catch (RuntimeException e7) {
                z4.b.c("PlatformViewsController", "Disposing platform view threw an exception", e7);
            }
            if (o.this.b(i7)) {
                View e8 = o.this.f17398i.get(Integer.valueOf(i7)).e();
                if (e8 != null) {
                    o.this.f17399j.remove(e8.getContext());
                }
                o.this.f17398i.remove(Integer.valueOf(i7));
                return;
            }
            h hVar = (h) o.this.f17403n.get(i7);
            if (hVar != null) {
                hVar.removeAllViews();
                hVar.h();
                hVar.o();
                ViewGroup viewGroup = (ViewGroup) hVar.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(hVar);
                }
                o.this.f17403n.remove(i7);
                return;
            }
            d5.a aVar = (d5.a) o.this.f17401l.get(i7);
            if (aVar != null) {
                aVar.removeAllViews();
                aVar.b();
                ViewGroup viewGroup2 = (ViewGroup) aVar.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(aVar);
                }
                o.this.f17401l.remove(i7);
            }
        }

        @Override // l5.k.g
        @TargetApi(19)
        public void i(k.d dVar) {
            m(19);
            int i7 = dVar.f18713a;
            if (!o.k0(dVar.f18719g)) {
                throw new IllegalStateException("Trying to create a view with unknown direction value: " + dVar.f18719g + "(view id: " + i7 + ")");
            }
            e b7 = o.this.f17390a.b(dVar.f18714b);
            if (b7 == null) {
                throw new IllegalStateException("Trying to create a platform view of unregistered type: " + dVar.f18714b);
            }
            d a7 = b7.a(o.this.f17392c, i7, dVar.f18720h != null ? b7.b().b(dVar.f18720h) : null);
            a7.getView().setLayoutDirection(dVar.f18719g);
            o.this.f17400k.put(i7, a7);
            z4.b.d("PlatformViewsController", "Using hybrid composition for platform view: " + i7);
        }
    }

    private void K() {
        while (this.f17400k.size() > 0) {
            this.f17411v.h(this.f17400k.keyAt(0));
        }
    }

    private void L(boolean z6) {
        for (int i7 = 0; i7 < this.f17402m.size(); i7++) {
            int keyAt = this.f17402m.keyAt(i7);
            io.flutter.embedding.android.g valueAt = this.f17402m.valueAt(i7);
            if (this.f17407r.contains(Integer.valueOf(keyAt))) {
                this.f17393d.m(valueAt);
                z6 &= valueAt.c();
            } else {
                if (!this.f17405p) {
                    valueAt.a();
                }
                valueAt.setVisibility(8);
            }
        }
        for (int i8 = 0; i8 < this.f17401l.size(); i8++) {
            int keyAt2 = this.f17401l.keyAt(i8);
            d5.a aVar = this.f17401l.get(keyAt2);
            if (!this.f17408s.contains(Integer.valueOf(keyAt2)) || (!z6 && this.f17406q)) {
                aVar.setVisibility(8);
            } else {
                aVar.setVisibility(0);
            }
        }
    }

    private float M() {
        return this.f17392c.getResources().getDisplayMetrics().density;
    }

    private void P() {
        if (!this.f17406q || this.f17405p) {
            return;
        }
        this.f17393d.p();
        this.f17405p = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q(int i7, View view, boolean z6) {
        if (z6) {
            this.f17396g.d(i7);
            return;
        }
        io.flutter.plugin.editing.f fVar = this.f17395f;
        if (fVar != null) {
            fVar.l(i7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R() {
        L(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(p pVar) {
        io.flutter.plugin.editing.f fVar = this.f17395f;
        if (fVar == null) {
            return;
        }
        fVar.u();
        pVar.g();
    }

    private static MotionEvent.PointerCoords a0(Object obj, float f7) {
        List list = (List) obj;
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        pointerCoords.orientation = (float) ((Double) list.get(0)).doubleValue();
        pointerCoords.pressure = (float) ((Double) list.get(1)).doubleValue();
        pointerCoords.size = (float) ((Double) list.get(2)).doubleValue();
        pointerCoords.toolMajor = ((float) ((Double) list.get(3)).doubleValue()) * f7;
        pointerCoords.toolMinor = ((float) ((Double) list.get(4)).doubleValue()) * f7;
        pointerCoords.touchMajor = ((float) ((Double) list.get(5)).doubleValue()) * f7;
        pointerCoords.touchMinor = ((float) ((Double) list.get(6)).doubleValue()) * f7;
        pointerCoords.x = ((float) ((Double) list.get(7)).doubleValue()) * f7;
        pointerCoords.y = ((float) ((Double) list.get(8)).doubleValue()) * f7;
        return pointerCoords;
    }

    private static List<MotionEvent.PointerCoords> b0(Object obj, float f7) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(a0(it.next(), f7));
        }
        return arrayList;
    }

    private static MotionEvent.PointerProperties c0(Object obj) {
        List list = (List) obj;
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        pointerProperties.id = ((Integer) list.get(0)).intValue();
        pointerProperties.toolType = ((Integer) list.get(1)).intValue();
        return pointerProperties;
    }

    private static List<MotionEvent.PointerProperties> d0(Object obj) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(c0(it.next()));
        }
        return arrayList;
    }

    private void e0() {
        if (this.f17393d == null) {
            z4.b.b("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
            return;
        }
        for (int i7 = 0; i7 < this.f17402m.size(); i7++) {
            this.f17393d.removeView(this.f17402m.valueAt(i7));
        }
        this.f17402m.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int g0(double d7) {
        double M = M();
        Double.isNaN(M);
        return (int) Math.round(d7 / M);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int i0(double d7) {
        double M = M();
        Double.isNaN(M);
        return (int) Math.round(d7 * M);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(p pVar) {
        io.flutter.plugin.editing.f fVar = this.f17395f;
        if (fVar == null) {
            return;
        }
        fVar.G();
        pVar.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean k0(int i7) {
        return i7 == 0 || i7 == 1;
    }

    public void A(io.flutter.plugin.editing.f fVar) {
        this.f17395f = fVar;
    }

    public void B(k5.a aVar) {
        this.f17391b = new io.flutter.embedding.android.a(aVar, true);
    }

    public void C(io.flutter.embedding.android.k kVar) {
        this.f17393d = kVar;
        for (int i7 = 0; i7 < this.f17403n.size(); i7++) {
            this.f17393d.addView(this.f17403n.valueAt(i7));
        }
        for (int i8 = 0; i8 < this.f17401l.size(); i8++) {
            this.f17393d.addView(this.f17401l.valueAt(i8));
        }
        for (int i9 = 0; i9 < this.f17400k.size(); i9++) {
            this.f17400k.valueAt(i9).f(this.f17393d);
        }
    }

    public boolean D(View view) {
        if (view == null || !this.f17399j.containsKey(view.getContext())) {
            return false;
        }
        View view2 = this.f17399j.get(view.getContext());
        if (view2 == view) {
            return true;
        }
        return view2.checkInputConnectionProxy(view);
    }

    @TargetApi(19)
    public FlutterOverlaySurface E() {
        return F(new io.flutter.embedding.android.g(this.f17393d.getContext(), this.f17393d.getWidth(), this.f17393d.getHeight(), g.b.overlay));
    }

    @TargetApi(19)
    public FlutterOverlaySurface F(io.flutter.embedding.android.g gVar) {
        int i7 = this.f17404o;
        this.f17404o = i7 + 1;
        this.f17402m.put(i7, gVar);
        return new FlutterOverlaySurface(i7, gVar.getSurface());
    }

    public void G() {
        for (int i7 = 0; i7 < this.f17402m.size(); i7++) {
            io.flutter.embedding.android.g valueAt = this.f17402m.valueAt(i7);
            valueAt.a();
            valueAt.e();
        }
    }

    public void H() {
        l5.k kVar = this.f17396g;
        if (kVar != null) {
            kVar.e(null);
        }
        G();
        this.f17396g = null;
        this.f17392c = null;
        this.f17394e = null;
    }

    public void I() {
        for (int i7 = 0; i7 < this.f17403n.size(); i7++) {
            this.f17393d.removeView(this.f17403n.valueAt(i7));
        }
        for (int i8 = 0; i8 < this.f17401l.size(); i8++) {
            this.f17393d.removeView(this.f17401l.valueAt(i8));
        }
        G();
        e0();
        this.f17393d = null;
        this.f17405p = false;
        for (int i9 = 0; i9 < this.f17400k.size(); i9++) {
            this.f17400k.valueAt(i9).g();
        }
    }

    public void J() {
        this.f17395f = null;
    }

    public f N() {
        return this.f17390a;
    }

    @TargetApi(19)
    void O(final int i7) {
        d dVar = this.f17400k.get(i7);
        if (dVar == null) {
            throw new IllegalStateException("Platform view hasn't been initialized from the platform view channel.");
        }
        if (this.f17401l.get(i7) != null) {
            return;
        }
        View view = dVar.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        if (view.getParent() != null) {
            throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
        }
        Context context = this.f17392c;
        d5.a aVar = new d5.a(context, context.getResources().getDisplayMetrics().density, this.f17391b);
        aVar.setOnDescendantFocusChangeListener(new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.j
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z6) {
                o.this.Q(i7, view2, z6);
            }
        });
        this.f17401l.put(i7, aVar);
        view.setImportantForAccessibility(4);
        aVar.addView(view);
        this.f17393d.addView(aVar);
    }

    public void T() {
    }

    public void U() {
        this.f17407r.clear();
        this.f17408s.clear();
    }

    public void V() {
        K();
    }

    public void W(int i7, int i8, int i9, int i10, int i11) {
        if (this.f17402m.get(i7) == null) {
            throw new IllegalStateException("The overlay surface (id:" + i7 + ") doesn't exist");
        }
        P();
        io.flutter.embedding.android.g gVar = this.f17402m.get(i7);
        if (gVar.getParent() == null) {
            this.f17393d.addView(gVar);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i10, i11);
        layoutParams.leftMargin = i8;
        layoutParams.topMargin = i9;
        gVar.setLayoutParams(layoutParams);
        gVar.setVisibility(0);
        gVar.bringToFront();
        this.f17407r.add(Integer.valueOf(i7));
    }

    public void X(int i7, int i8, int i9, int i10, int i11, int i12, int i13, FlutterMutatorsStack flutterMutatorsStack) {
        P();
        O(i7);
        d5.a aVar = this.f17401l.get(i7);
        aVar.a(flutterMutatorsStack, i8, i9, i10, i11);
        aVar.setVisibility(0);
        aVar.bringToFront();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i12, i13);
        View view = this.f17400k.get(i7).getView();
        if (view != null) {
            view.setLayoutParams(layoutParams);
            view.bringToFront();
        }
        this.f17408s.add(Integer.valueOf(i7));
    }

    public void Y() {
        boolean z6 = false;
        if (this.f17405p && this.f17408s.isEmpty()) {
            this.f17405p = false;
            this.f17393d.B(new Runnable() { // from class: io.flutter.plugin.platform.k
                @Override // java.lang.Runnable
                public final void run() {
                    o.this.R();
                }
            });
        } else {
            if (this.f17405p && this.f17393d.j()) {
                z6 = true;
            }
            L(z6);
        }
    }

    public void Z() {
        K();
    }

    @Override // io.flutter.plugin.platform.i
    public void a(io.flutter.view.c cVar) {
        this.f17397h.b(cVar);
    }

    @Override // io.flutter.plugin.platform.i
    public boolean b(int i7) {
        return this.f17398i.containsKey(Integer.valueOf(i7));
    }

    @Override // io.flutter.plugin.platform.i
    public View c(int i7) {
        if (b(i7)) {
            return this.f17398i.get(Integer.valueOf(i7)).e();
        }
        d dVar = this.f17400k.get(i7);
        if (dVar == null) {
            return null;
        }
        return dVar.getView();
    }

    @Override // io.flutter.plugin.platform.i
    public void d() {
        this.f17397h.b(null);
    }

    public void f0(boolean z6) {
        this.f17410u = z6;
    }

    public MotionEvent h0(float f7, k.f fVar, boolean z6) {
        MotionEvent b7 = this.f17409t.b(s.a.c(fVar.f18739p));
        MotionEvent.PointerProperties[] pointerPropertiesArr = (MotionEvent.PointerProperties[]) d0(fVar.f18729f).toArray(new MotionEvent.PointerProperties[fVar.f18728e]);
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) b0(fVar.f18730g, f7).toArray(new MotionEvent.PointerCoords[fVar.f18728e]);
        return (z6 || b7 == null) ? MotionEvent.obtain(fVar.f18725b.longValue(), fVar.f18726c.longValue(), fVar.f18727d, fVar.f18728e, pointerPropertiesArr, pointerCoordsArr, fVar.f18731h, fVar.f18732i, fVar.f18733j, fVar.f18734k, fVar.f18735l, fVar.f18736m, fVar.f18737n, fVar.f18738o) : MotionEvent.obtain(b7.getDownTime(), b7.getEventTime(), b7.getAction(), fVar.f18728e, pointerPropertiesArr, pointerCoordsArr, b7.getMetaState(), b7.getButtonState(), b7.getXPrecision(), b7.getYPrecision(), b7.getDeviceId(), b7.getEdgeFlags(), b7.getSource(), b7.getFlags());
    }

    public void z(Context context, io.flutter.view.d dVar, a5.a aVar) {
        if (this.f17392c != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        this.f17392c = context;
        this.f17394e = dVar;
        l5.k kVar = new l5.k(aVar);
        this.f17396g = kVar;
        kVar.e(this.f17411v);
    }
}
