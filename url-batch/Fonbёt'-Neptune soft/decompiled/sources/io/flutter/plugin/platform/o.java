package io.flutter.plugin.platform;

import D0.C0059t;
import D0.C0060u;
import P.O;
import android.app.Activity;
import android.content.MutableContextWrapper;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import m0.C0261a;
import m0.G;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: w, reason: collision with root package name */
    public static final Class[] f2654w = {SurfaceView.class};

    /* renamed from: a, reason: collision with root package name */
    public final n f2655a;

    /* renamed from: b, reason: collision with root package name */
    public C0261a f2656b;

    /* renamed from: c, reason: collision with root package name */
    public Activity f2657c;

    /* renamed from: d, reason: collision with root package name */
    public m0.q f2658d;

    /* renamed from: e, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.l f2659e;

    /* renamed from: f, reason: collision with root package name */
    public io.flutter.plugin.editing.j f2660f;

    /* renamed from: g, reason: collision with root package name */
    public O f2661g;

    /* renamed from: h, reason: collision with root package name */
    public final C0223a f2662h;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f2663i;

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f2664j;

    /* renamed from: k, reason: collision with root package name */
    public final SparseArray f2665k;

    /* renamed from: l, reason: collision with root package name */
    public final SparseArray f2666l;

    /* renamed from: m, reason: collision with root package name */
    public final SparseArray f2667m;

    /* renamed from: n, reason: collision with root package name */
    public final SparseArray f2668n;

    /* renamed from: r, reason: collision with root package name */
    public final HashSet f2672r;

    /* renamed from: s, reason: collision with root package name */
    public final HashSet f2673s;

    /* renamed from: t, reason: collision with root package name */
    public final O f2674t;

    /* renamed from: o, reason: collision with root package name */
    public int f2669o = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2670p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2671q = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2675u = false;
    public final n v = new n(this);

    public o() {
        n nVar = new n();
        nVar.f2653a = new HashMap();
        this.f2655a = nVar;
        this.f2663i = new HashMap();
        this.f2662h = new C0223a();
        this.f2664j = new HashMap();
        this.f2667m = new SparseArray();
        this.f2672r = new HashSet();
        this.f2673s = new HashSet();
        this.f2668n = new SparseArray();
        this.f2665k = new SparseArray();
        this.f2666l = new SparseArray();
        if (O.f872h == null) {
            O.f872h = new O(12);
        }
        this.f2674t = O.f872h;
    }

    public static void a(o oVar, v0.f fVar) {
        oVar.getClass();
        int i2 = fVar.f3492g;
        if (i2 == 0 || i2 == 1) {
            return;
        }
        throw new IllegalStateException("Trying to create a view with unknown direction value: " + i2 + "(view id: " + fVar.f3486a + ")");
    }

    public static void d(int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= i2) {
            return;
        }
        throw new IllegalStateException("Trying to use platform views with API " + i3 + ", required API level is: " + i2);
    }

    public static h i(io.flutter.embedding.engine.renderer.l lVar) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29) {
            return i2 >= 29 ? new P.B(lVar.b()) : new w(lVar.d());
        }
        TextureRegistry$SurfaceProducer c2 = lVar.c();
        n nVar = new n();
        nVar.f2653a = c2;
        return nVar;
    }

    public final g b(v0.f fVar, boolean z2) {
        g c0059t;
        HashMap hashMap = (HashMap) this.f2655a.f2653a;
        String str = fVar.f3487b;
        C0060u c0060u = (C0060u) hashMap.get(str);
        if (c0060u == null) {
            throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str);
        }
        ByteBuffer byteBuffer = fVar.f3494i;
        Object a2 = byteBuffer != null ? c0060u.f409a.a(byteBuffer) : null;
        if (z2) {
            new MutableContextWrapper(this.f2657c);
        }
        if (((Integer) a2) == null) {
            throw new IllegalStateException("An identifier is required to retrieve a View instance.");
        }
        Object e2 = c0060u.f410b.e(r6.intValue());
        if (e2 instanceof g) {
            c0059t = (g) e2;
        } else {
            if (!(e2 instanceof View)) {
                throw new IllegalStateException("Unable to find a PlatformView or View instance: " + a2 + ", " + e2);
            }
            c0059t = new C0059t((View) e2);
        }
        View view = c0059t.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        view.setLayoutDirection(fVar.f3492g);
        this.f2665k.put(fVar.f3486a, c0059t);
        return c0059t;
    }

    public final void c() {
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f2667m;
            if (i2 >= sparseArray.size()) {
                return;
            }
            c cVar = (c) sparseArray.valueAt(i2);
            cVar.c();
            cVar.f3162e.close();
            i2++;
        }
    }

    public final void e(boolean z2) {
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f2667m;
            if (i2 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i2);
            c cVar = (c) sparseArray.valueAt(i2);
            if (this.f2672r.contains(Integer.valueOf(keyAt))) {
                n0.c cVar2 = this.f2658d.f3190l;
                if (cVar2 != null) {
                    cVar.a(cVar2.f3264b);
                }
                z2 &= cVar.e();
            } else {
                if (!this.f2670p) {
                    cVar.c();
                }
                cVar.setVisibility(8);
                this.f2658d.removeView(cVar);
            }
            i2++;
        }
        int i3 = 0;
        while (true) {
            SparseArray sparseArray2 = this.f2666l;
            if (i3 >= sparseArray2.size()) {
                return;
            }
            int keyAt2 = sparseArray2.keyAt(i3);
            View view = (View) sparseArray2.get(keyAt2);
            if (!this.f2673s.contains(Integer.valueOf(keyAt2)) || (!z2 && this.f2671q)) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
            i3++;
        }
    }

    public final float f() {
        return this.f2657c.getResources().getDisplayMetrics().density;
    }

    public final View g(int i2) {
        if (m(i2)) {
            return ((A) this.f2663i.get(Integer.valueOf(i2))).a();
        }
        g gVar = (g) this.f2665k.get(i2);
        if (gVar == null) {
            return null;
        }
        return gVar.getView();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.n] */
    public final void h() {
        if (!this.f2671q || this.f2670p) {
            return;
        }
        m0.q qVar = this.f2658d;
        qVar.f3186h.b();
        m0.j jVar = qVar.f3185g;
        if (jVar == null) {
            m0.j jVar2 = new m0.j(qVar.getContext(), qVar.getWidth(), qVar.getHeight(), 1);
            qVar.f3185g = jVar2;
            qVar.addView(jVar2);
        } else {
            jVar.g(qVar.getWidth(), qVar.getHeight());
        }
        qVar.f3187i = qVar.f3186h;
        m0.j jVar3 = qVar.f3185g;
        qVar.f3186h = jVar3;
        n0.c cVar = qVar.f3190l;
        if (cVar != null) {
            jVar3.a(cVar.f3264b);
        }
        this.f2670p = true;
    }

    public final void j() {
        for (A a2 : this.f2663i.values()) {
            int width = a2.f2617f.getWidth();
            h hVar = a2.f2617f;
            int height = hVar.getHeight();
            boolean isFocused = a2.a().isFocused();
            t detachState = a2.f2612a.detachState();
            a2.f2619h.setSurface(null);
            a2.f2619h.release();
            a2.f2619h = ((DisplayManager) a2.f2613b.getSystemService("display")).createVirtualDisplay("flutter-vd#" + a2.f2616e, width, height, a2.f2615d, hVar.getSurface(), 0, A.f2611i, null);
            SingleViewPresentation singleViewPresentation = new SingleViewPresentation(a2.f2613b, a2.f2619h.getDisplay(), a2.f2614c, detachState, a2.f2618g, isFocused);
            singleViewPresentation.show();
            a2.f2612a.cancel();
            a2.f2612a = singleViewPresentation;
        }
    }

    public final MotionEvent k(float f2, v0.h hVar, boolean z2) {
        PriorityQueue priorityQueue;
        LongSparseArray longSparseArray;
        long j2;
        G g2 = new G(hVar.f3513p);
        while (true) {
            O o2 = this.f2674t;
            priorityQueue = (PriorityQueue) o2.f876g;
            boolean isEmpty = priorityQueue.isEmpty();
            longSparseArray = (LongSparseArray) o2.f875f;
            j2 = g2.f3133a;
            if (isEmpty || ((Long) priorityQueue.peek()).longValue() >= j2) {
                break;
            }
            longSparseArray.remove(((Long) priorityQueue.poll()).longValue());
        }
        if (!priorityQueue.isEmpty() && ((Long) priorityQueue.peek()).longValue() == j2) {
            priorityQueue.poll();
        }
        MotionEvent motionEvent = (MotionEvent) longSparseArray.get(j2);
        longSparseArray.remove(j2);
        List<List> list = (List) hVar.f3504g;
        ArrayList arrayList = new ArrayList();
        for (List list2 : list) {
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            pointerCoords.orientation = (float) ((Double) list2.get(0)).doubleValue();
            pointerCoords.pressure = (float) ((Double) list2.get(1)).doubleValue();
            pointerCoords.size = (float) ((Double) list2.get(2)).doubleValue();
            double d2 = f2;
            pointerCoords.toolMajor = (float) (((Double) list2.get(3)).doubleValue() * d2);
            pointerCoords.toolMinor = (float) (((Double) list2.get(4)).doubleValue() * d2);
            pointerCoords.touchMajor = (float) (((Double) list2.get(5)).doubleValue() * d2);
            pointerCoords.touchMinor = (float) (((Double) list2.get(6)).doubleValue() * d2);
            pointerCoords.x = (float) (((Double) list2.get(7)).doubleValue() * d2);
            pointerCoords.y = (float) (((Double) list2.get(8)).doubleValue() * d2);
            arrayList.add(pointerCoords);
        }
        int i2 = hVar.f3502e;
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) arrayList.toArray(new MotionEvent.PointerCoords[i2]);
        if (!z2 && motionEvent != null) {
            if (pointerCoordsArr.length >= 1) {
                motionEvent.offsetLocation(pointerCoordsArr[0].x - motionEvent.getX(), pointerCoordsArr[0].y - motionEvent.getY());
            }
            return motionEvent;
        }
        List<List> list3 = (List) hVar.f3503f;
        ArrayList arrayList2 = new ArrayList();
        for (List list4 : list3) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerProperties.id = ((Integer) list4.get(0)).intValue();
            pointerProperties.toolType = ((Integer) list4.get(1)).intValue();
            arrayList2.add(pointerProperties);
        }
        return MotionEvent.obtain(hVar.f3499b.longValue(), hVar.f3500c.longValue(), hVar.f3501d, hVar.f3502e, (MotionEvent.PointerProperties[]) arrayList2.toArray(new MotionEvent.PointerProperties[i2]), pointerCoordsArr, hVar.f3505h, hVar.f3506i, hVar.f3507j, hVar.f3508k, hVar.f3509l, hVar.f3510m, hVar.f3511n, hVar.f3512o);
    }

    public final int l(double d2) {
        return (int) Math.round(d2 * f());
    }

    public final boolean m(int i2) {
        return this.f2663i.containsKey(Integer.valueOf(i2));
    }
}
