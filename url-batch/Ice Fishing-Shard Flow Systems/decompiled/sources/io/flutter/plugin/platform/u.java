package io.flutter.plugin.platform;

import android.content.MutableContextWrapper;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import h4.AbstractActivityC0488c;
import h4.C0483D;
import h4.C0486a;
import i4.C0547c;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class u implements m {

    /* renamed from: F, reason: collision with root package name */
    public static final Class[] f5747F = {SurfaceView.class};

    /* renamed from: C, reason: collision with root package name */
    public final P0.c f5750C;

    /* renamed from: e, reason: collision with root package name */
    public C0486a f5754e;

    /* renamed from: i, reason: collision with root package name */
    public AbstractActivityC0488c f5755i;

    /* renamed from: l, reason: collision with root package name */
    public h4.p f5756l;

    /* renamed from: n, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.j f5758n;

    /* renamed from: o, reason: collision with root package name */
    public io.flutter.plugin.editing.i f5759o;

    /* renamed from: p, reason: collision with root package name */
    public P0.s f5760p;

    /* renamed from: m, reason: collision with root package name */
    public FlutterJNI f5757m = null;

    /* renamed from: x, reason: collision with root package name */
    public int f5768x = 0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f5769y = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f5770z = true;

    /* renamed from: D, reason: collision with root package name */
    public boolean f5751D = false;

    /* renamed from: E, reason: collision with root package name */
    public final q f5752E = new q(0, this);

    /* renamed from: d, reason: collision with root package name */
    public final q f5753d = new q(2);

    /* renamed from: r, reason: collision with root package name */
    public final HashMap f5762r = new HashMap();

    /* renamed from: q, reason: collision with root package name */
    public final C0555a f5761q = new C0555a();

    /* renamed from: s, reason: collision with root package name */
    public final HashMap f5763s = new HashMap();

    /* renamed from: v, reason: collision with root package name */
    public final SparseArray f5766v = new SparseArray();

    /* renamed from: A, reason: collision with root package name */
    public final HashSet f5748A = new HashSet();

    /* renamed from: B, reason: collision with root package name */
    public final HashSet f5749B = new HashSet();

    /* renamed from: w, reason: collision with root package name */
    public final SparseArray f5767w = new SparseArray();

    /* renamed from: t, reason: collision with root package name */
    public final SparseArray f5764t = new SparseArray();

    /* renamed from: u, reason: collision with root package name */
    public final SparseArray f5765u = new SparseArray();

    public u() {
        if (P0.c.f2186l == null) {
            P0.c.f2186l = new P0.c(7);
        }
        this.f5750C = P0.c.f2186l;
    }

    public static void a(u uVar, r4.h hVar) {
        int i2 = hVar.f7478g;
        if (i2 == 0 || i2 == 1) {
            return;
        }
        throw new IllegalStateException("Trying to create a view with unknown direction value: " + i2 + "(view id: " + hVar.f7472a + ")");
    }

    public static j h(io.flutter.embedding.engine.renderer.j jVar) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29) {
            return i2 >= 29 ? new D6.n(jVar.c()) : new C(jVar.e());
        }
        TextureRegistry$SurfaceProducer d7 = jVar.d(i2 <= 34 ? 2 : 1);
        q qVar = new q(4);
        qVar.f5724e = d7;
        return qVar;
    }

    public final InterfaceC0561g b(r4.h hVar, boolean z7) {
        String str = hVar.f7473b;
        int i2 = hVar.f7472a;
        ByteBuffer byteBuffer = hVar.f7480i;
        AbstractC0562h abstractC0562h = (AbstractC0562h) ((HashMap) this.f5753d.f5724e).get(str);
        if (abstractC0562h == null) {
            throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str);
        }
        InterfaceC0561g create = abstractC0562h.create(z7 ? new MutableContextWrapper(this.f5755i) : this.f5755i, i2, byteBuffer != null ? abstractC0562h.getCreateArgsCodec().b(byteBuffer) : null);
        View view = create.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        view.setLayoutDirection(hVar.f7478g);
        this.f5764t.put(i2, create);
        h4.p pVar = this.f5756l;
        if (pVar == null) {
            return create;
        }
        create.onFlutterViewAttached(pVar);
        return create;
    }

    public final void c() {
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f5766v;
            if (i2 >= sparseArray.size()) {
                return;
            }
            C0557c c0557c = (C0557c) sparseArray.valueAt(i2);
            c0557c.a();
            c0557c.f5209d.close();
            i2++;
        }
    }

    @Override // io.flutter.plugin.platform.m
    public final void d(io.flutter.view.g gVar) {
        this.f5761q.f5690a = gVar;
    }

    public final void e(boolean z7) {
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f5766v;
            if (i2 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i2);
            C0557c c0557c = (C0557c) sparseArray.valueAt(i2);
            if (this.f5748A.contains(Integer.valueOf(keyAt))) {
                C0547c c0547c = this.f5756l.f5250q;
                if (c0547c != null) {
                    c0557c.c(c0547c.f5502b);
                }
                z7 &= c0557c.e();
            } else {
                if (!this.f5769y) {
                    c0557c.a();
                }
                c0557c.setVisibility(8);
                this.f5756l.removeView(c0557c);
            }
            i2++;
        }
        int i5 = 0;
        while (true) {
            SparseArray sparseArray2 = this.f5765u;
            if (i5 >= sparseArray2.size()) {
                return;
            }
            int keyAt2 = sparseArray2.keyAt(i5);
            View view = (View) sparseArray2.get(keyAt2);
            if (!this.f5749B.contains(Integer.valueOf(keyAt2)) || (!z7 && this.f5770z)) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
            i5++;
        }
    }

    public final float f() {
        return this.f5755i.getResources().getDisplayMetrics().density;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.m] */
    public final void g() {
        if (!this.f5770z || this.f5769y) {
            return;
        }
        h4.p pVar = this.f5756l;
        pVar.f5246m.d();
        h4.i iVar = pVar.f5245l;
        if (iVar == null) {
            h4.i iVar2 = new h4.i(pVar.getContext(), pVar.getWidth(), pVar.getHeight(), 1);
            pVar.f5245l = iVar2;
            pVar.addView(iVar2);
        } else {
            iVar.g(pVar.getWidth(), pVar.getHeight());
        }
        pVar.f5247n = pVar.f5246m;
        h4.i iVar3 = pVar.f5245l;
        pVar.f5246m = iVar3;
        C0547c c0547c = pVar.f5250q;
        if (c0547c != null) {
            iVar3.c(c0547c.f5502b);
        }
        this.f5769y = true;
    }

    public final void i() {
        for (G g7 : this.f5762r.values()) {
            j jVar = g7.f5685f;
            j jVar2 = g7.f5685f;
            int width = jVar.getWidth();
            int height = jVar2.getHeight();
            boolean isFocused = g7.a().isFocused();
            z detachState = g7.f5680a.detachState();
            g7.f5687h.setSurface(null);
            g7.f5687h.release();
            g7.f5687h = ((DisplayManager) g7.f5681b.getSystemService("display")).createVirtualDisplay("flutter-vd#" + g7.f5684e, width, height, g7.f5683d, jVar2.getSurface(), 0, G.f5679i, null);
            SingleViewPresentation singleViewPresentation = new SingleViewPresentation(g7.f5681b, g7.f5687h.getDisplay(), g7.f5682c, detachState, g7.f5686g, isFocused);
            singleViewPresentation.show();
            g7.f5680a.cancel();
            g7.f5680a = singleViewPresentation;
        }
    }

    @Override // io.flutter.plugin.platform.m
    public final boolean j(int i2) {
        return this.f5762r.containsKey(Integer.valueOf(i2));
    }

    public final MotionEvent k(float f7, r4.i iVar, boolean z7) {
        long j = iVar.f7495p;
        int i2 = iVar.f7485e;
        MotionEvent x7 = this.f5750C.x(new C0483D(j));
        List<List> list = (List) iVar.f7487g;
        ArrayList arrayList = new ArrayList();
        for (List list2 : list) {
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            pointerCoords.orientation = (float) ((Double) list2.get(0)).doubleValue();
            pointerCoords.pressure = (float) ((Double) list2.get(1)).doubleValue();
            pointerCoords.size = (float) ((Double) list2.get(2)).doubleValue();
            double d7 = f7;
            pointerCoords.toolMajor = (float) (((Double) list2.get(3)).doubleValue() * d7);
            pointerCoords.toolMinor = (float) (((Double) list2.get(4)).doubleValue() * d7);
            pointerCoords.touchMajor = (float) (((Double) list2.get(5)).doubleValue() * d7);
            pointerCoords.touchMinor = (float) (((Double) list2.get(6)).doubleValue() * d7);
            pointerCoords.x = (float) (((Double) list2.get(7)).doubleValue() * d7);
            pointerCoords.y = (float) (((Double) list2.get(8)).doubleValue() * d7);
            arrayList.add(pointerCoords);
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) arrayList.toArray(new MotionEvent.PointerCoords[i2]);
        List<List> list3 = (List) iVar.f7486f;
        ArrayList arrayList2 = new ArrayList();
        for (List list4 : list3) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerProperties.id = ((Integer) list4.get(0)).intValue();
            pointerProperties.toolType = ((Integer) list4.get(1)).intValue();
            arrayList2.add(pointerProperties);
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = (MotionEvent.PointerProperties[]) arrayList2.toArray(new MotionEvent.PointerProperties[i2]);
        if (z7 || x7 == null) {
            return MotionEvent.obtain(iVar.f7482b.longValue(), iVar.f7483c.longValue(), iVar.f7484d, iVar.f7485e, pointerPropertiesArr, pointerCoordsArr, iVar.f7488h, iVar.f7489i, iVar.j, iVar.f7490k, iVar.f7491l, iVar.f7492m, iVar.f7493n, iVar.f7494o);
        }
        if (x7.getPointerCount() != i2 || x7.getAction() != iVar.f7484d) {
            return MotionEvent.obtain(x7.getDownTime(), x7.getEventTime(), iVar.f7484d, iVar.f7485e, pointerPropertiesArr, pointerCoordsArr, x7.getMetaState(), x7.getButtonState(), x7.getXPrecision(), x7.getYPrecision(), x7.getDeviceId(), x7.getEdgeFlags(), x7.getSource(), x7.getFlags());
        }
        if (pointerCoordsArr.length < 1) {
            return x7;
        }
        x7.offsetLocation(pointerCoordsArr[0].x - x7.getX(), pointerCoordsArr[0].y - x7.getY());
        return x7;
    }

    public final int l(double d7) {
        return (int) Math.round(d7 * f());
    }

    @Override // io.flutter.plugin.platform.m
    public final View m(int i2) {
        if (j(i2)) {
            return ((G) this.f5762r.get(Integer.valueOf(i2))).a();
        }
        InterfaceC0561g interfaceC0561g = (InterfaceC0561g) this.f5764t.get(i2);
        if (interfaceC0561g == null) {
            return null;
        }
        return interfaceC0561g.getView();
    }

    @Override // io.flutter.plugin.platform.m
    public final void q() {
        this.f5761q.f5690a = null;
    }
}
