package io.flutter.plugin.platform;

import E1.C0025a;
import E1.C0034j;
import E1.I;
import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class r implements k {

    /* renamed from: x, reason: collision with root package name */
    public static final Class[] f9294x = {SurfaceView.class};

    /* renamed from: b, reason: collision with root package name */
    public C0025a f9296b;

    /* renamed from: c, reason: collision with root package name */
    public Activity f9297c;

    /* renamed from: d, reason: collision with root package name */
    public E1.t f9298d;
    public io.flutter.embedding.engine.renderer.j f;

    /* renamed from: g, reason: collision with root package name */
    public io.flutter.plugin.editing.k f9300g;

    /* renamed from: h, reason: collision with root package name */
    public V0.e f9301h;

    /* renamed from: u, reason: collision with root package name */
    public final V0.e f9313u;

    /* renamed from: e, reason: collision with root package name */
    public FlutterJNI f9299e = null;

    /* renamed from: p, reason: collision with root package name */
    public int f9308p = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f9309q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f9310r = true;
    public boolean v = false;

    /* renamed from: w, reason: collision with root package name */
    public final o f9314w = new o(0, this);

    /* renamed from: a, reason: collision with root package name */
    public final o f9295a = new o(2);

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f9303j = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final C1043a f9302i = new C1043a();

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f9304k = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final SparseArray f9307n = new SparseArray();

    /* renamed from: s, reason: collision with root package name */
    public final HashSet f9311s = new HashSet();

    /* renamed from: t, reason: collision with root package name */
    public final HashSet f9312t = new HashSet();
    public final SparseArray o = new SparseArray();

    /* renamed from: l, reason: collision with root package name */
    public final SparseArray f9305l = new SparseArray();

    /* renamed from: m, reason: collision with root package name */
    public final SparseArray f9306m = new SparseArray();

    public r() {
        if (V0.e.f1597e == null) {
            V0.e.f1597e = new V0.e(5);
        }
        this.f9313u = V0.e.f1597e;
    }

    public static void a(r rVar, O1.e eVar) {
        rVar.getClass();
        int i3 = eVar.f1156g;
        if (i3 == 0 || i3 == 1) {
            return;
        }
        throw new IllegalStateException("Trying to create a view with unknown direction value: " + i3 + "(view id: " + eVar.f1151a + ")");
    }

    public static i i(io.flutter.embedding.engine.renderer.j jVar) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 29) {
            return i3 >= 29 ? new U.A(jVar.c()) : new y(jVar.e());
        }
        TextureRegistry$SurfaceProducer d3 = jVar.d(i3 <= 34 ? 2 : 1);
        o oVar = new o(4);
        oVar.f9273b = d3;
        return oVar;
    }

    public final g b(O1.e eVar, boolean z) {
        HashMap hashMap = (HashMap) this.f9295a.f9273b;
        String str = eVar.f1152b;
        h hVar = (h) hashMap.get(str);
        if (hVar == null) {
            throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str);
        }
        ByteBuffer byteBuffer = eVar.f1158i;
        Object decodeMessage = byteBuffer != null ? hVar.getCreateArgsCodec().decodeMessage(byteBuffer) : null;
        Context mutableContextWrapper = z ? new MutableContextWrapper(this.f9297c) : this.f9297c;
        int i3 = eVar.f1151a;
        g create = hVar.create(mutableContextWrapper, i3, decodeMessage);
        View view = create.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        view.setLayoutDirection(eVar.f1156g);
        this.f9305l.put(i3, create);
        E1.t tVar = this.f9298d;
        if (tVar == null) {
            return create;
        }
        create.onFlutterViewAttached(tVar);
        return create;
    }

    @Override // io.flutter.plugin.platform.k
    public final void c(io.flutter.view.i iVar) {
        this.f9302i.f9244a = iVar;
    }

    public final void d() {
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.f9307n;
            if (i3 >= sparseArray.size()) {
                return;
            }
            C1045c c1045c = (C1045c) sparseArray.valueAt(i3);
            c1045c.a();
            c1045c.f357a.close();
            i3++;
        }
    }

    public final void e(boolean z) {
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.f9307n;
            if (i3 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i3);
            C1045c c1045c = (C1045c) sparseArray.valueAt(i3);
            if (this.f9311s.contains(Integer.valueOf(keyAt))) {
                FlutterEngine flutterEngine = this.f9298d.f392i;
                if (flutterEngine != null) {
                    c1045c.d(flutterEngine.f9100b);
                }
                z &= c1045c.e();
            } else {
                if (!this.f9309q) {
                    c1045c.a();
                }
                c1045c.setVisibility(8);
                this.f9298d.removeView(c1045c);
            }
            i3++;
        }
        int i4 = 0;
        while (true) {
            SparseArray sparseArray2 = this.f9306m;
            if (i4 >= sparseArray2.size()) {
                return;
            }
            int keyAt2 = sparseArray2.keyAt(i4);
            View view = (View) sparseArray2.get(keyAt2);
            if (!this.f9312t.contains(Integer.valueOf(keyAt2)) || (!z && this.f9310r)) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
            i4++;
        }
    }

    @Override // io.flutter.plugin.platform.k
    public final boolean f(int i3) {
        return this.f9303j.containsKey(Integer.valueOf(i3));
    }

    public final float g() {
        return this.f9297c.getResources().getDisplayMetrics().density;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.m] */
    public final void h() {
        if (!this.f9310r || this.f9309q) {
            return;
        }
        E1.t tVar = this.f9298d;
        tVar.f389e.b();
        C0034j c0034j = tVar.f388d;
        if (c0034j == null) {
            C0034j c0034j2 = new C0034j(tVar.getContext(), tVar.getWidth(), tVar.getHeight(), 1);
            tVar.f388d = c0034j2;
            tVar.addView(c0034j2);
        } else {
            c0034j.g(tVar.getWidth(), tVar.getHeight());
        }
        tVar.f = tVar.f389e;
        C0034j c0034j3 = tVar.f388d;
        tVar.f389e = c0034j3;
        FlutterEngine flutterEngine = tVar.f392i;
        if (flutterEngine != null) {
            c0034j3.d(flutterEngine.f9100b);
        }
        this.f9309q = true;
    }

    @Override // io.flutter.plugin.platform.k
    public final View j(int i3) {
        if (f(i3)) {
            return ((D) this.f9303j.get(Integer.valueOf(i3))).a();
        }
        g gVar = (g) this.f9305l.get(i3);
        if (gVar == null) {
            return null;
        }
        return gVar.getView();
    }

    public final void k() {
        for (D d3 : this.f9303j.values()) {
            int width = d3.f.getWidth();
            i iVar = d3.f;
            int height = iVar.getHeight();
            boolean isFocused = d3.a().isFocused();
            w detachState = d3.f9235a.detachState();
            d3.f9241h.setSurface(null);
            d3.f9241h.release();
            d3.f9241h = ((DisplayManager) d3.f9236b.getSystemService("display")).createVirtualDisplay("flutter-vd#" + d3.f9239e, width, height, d3.f9238d, iVar.getSurface(), 0, D.f9234i, null);
            SingleViewPresentation singleViewPresentation = new SingleViewPresentation(d3.f9236b, d3.f9241h.getDisplay(), d3.f9237c, detachState, d3.f9240g, isFocused);
            singleViewPresentation.show();
            d3.f9235a.cancel();
            d3.f9235a = singleViewPresentation;
        }
    }

    public final MotionEvent l(float f, O1.f fVar, boolean z) {
        MotionEvent D3 = this.f9313u.D(new I(fVar.f1172p));
        List<List> list = (List) fVar.f1164g;
        ArrayList arrayList = new ArrayList();
        for (List list2 : list) {
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            pointerCoords.orientation = (float) ((Double) list2.get(0)).doubleValue();
            pointerCoords.pressure = (float) ((Double) list2.get(1)).doubleValue();
            pointerCoords.size = (float) ((Double) list2.get(2)).doubleValue();
            double d3 = f;
            pointerCoords.toolMajor = (float) (((Double) list2.get(3)).doubleValue() * d3);
            pointerCoords.toolMinor = (float) (((Double) list2.get(4)).doubleValue() * d3);
            pointerCoords.touchMajor = (float) (((Double) list2.get(5)).doubleValue() * d3);
            pointerCoords.touchMinor = (float) (((Double) list2.get(6)).doubleValue() * d3);
            pointerCoords.x = (float) (((Double) list2.get(7)).doubleValue() * d3);
            pointerCoords.y = (float) (((Double) list2.get(8)).doubleValue() * d3);
            arrayList.add(pointerCoords);
        }
        int i3 = fVar.f1163e;
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) arrayList.toArray(new MotionEvent.PointerCoords[i3]);
        List<List> list3 = (List) fVar.f;
        ArrayList arrayList2 = new ArrayList();
        for (List list4 : list3) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerProperties.id = ((Integer) list4.get(0)).intValue();
            pointerProperties.toolType = ((Integer) list4.get(1)).intValue();
            arrayList2.add(pointerProperties);
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = (MotionEvent.PointerProperties[]) arrayList2.toArray(new MotionEvent.PointerProperties[i3]);
        if (z || D3 == null) {
            return MotionEvent.obtain(fVar.f1160b.longValue(), fVar.f1161c.longValue(), fVar.f1162d, fVar.f1163e, pointerPropertiesArr, pointerCoordsArr, fVar.f1165h, fVar.f1166i, fVar.f1167j, fVar.f1168k, fVar.f1169l, fVar.f1170m, fVar.f1171n, fVar.o);
        }
        if (D3.getPointerCount() == i3 && D3.getAction() == fVar.f1162d) {
            if (pointerCoordsArr.length < 1) {
                return D3;
            }
            D3.offsetLocation(pointerCoordsArr[0].x - D3.getX(), pointerCoordsArr[0].y - D3.getY());
            return D3;
        }
        return MotionEvent.obtain(D3.getDownTime(), D3.getEventTime(), fVar.f1162d, fVar.f1163e, pointerPropertiesArr, pointerCoordsArr, D3.getMetaState(), D3.getButtonState(), D3.getXPrecision(), D3.getYPrecision(), D3.getDeviceId(), D3.getEdgeFlags(), D3.getSource(), D3.getFlags());
    }

    @Override // io.flutter.plugin.platform.k
    public final void m() {
        this.f9302i.f9244a = null;
    }

    public final int n(double d3) {
        return (int) Math.round(d3 * g());
    }
}
