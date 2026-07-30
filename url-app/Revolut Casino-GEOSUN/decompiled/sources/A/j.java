package A;

import A.j;
import D.C0003d;
import D.C0019u;
import D.InterfaceC0008i;
import D.d0;
import D.f0;
import D.m0;
import D.n0;
import L.C0026b;
import L.Q;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.Size;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.profileinstaller.ProfileInstallReceiver;
import c0.AbstractActivityC0104f;
import c0.H;
import d0.k;
import e0.C0114b;
import e0.C0119g;
import e0.C0121i;
import g.C0134f;
import g.RunnableC0133e;
import g.ViewOnKeyListenerC0135g;
import g.t;
import g0.C0140d;
import h.C0156i;
import h.C0165s;
import h.InterfaceC0159l;
import h.K;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import m0.C0196f;
import m0.C0198h;
import m0.C0199i;
import m0.C0200j;
import m0.C0201k;
import m0.EnumC0195e;
import m0.EnumC0197g;
import n0.InterfaceC0210b;
import n0.InterfaceC0212d;
import u0.C0247g;

/* loaded from: classes.dex */
public class j implements P0.d, InterfaceC0008i, J.e, InterfaceC0212d, n0.f, K, g.o, InterfaceC0159l, InterfaceC0210b, n0.k {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f29e;

    /* renamed from: f, reason: collision with root package name */
    public Object f30f;

    public /* synthetic */ j(int i2, Object obj) {
        this.f29e = i2;
        this.f30f = obj;
    }

    public static int y(int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            i4++;
            if (i4 == i3) {
                i5++;
                i4 = 0;
            } else if (i4 > i3) {
                i5++;
                i4 = 1;
            }
        }
        return i4 + 1 > i3 ? i5 + 1 : i5;
    }

    public static boolean z(int i2) {
        return (48 <= i2 && i2 <= 57) || i2 == 35 || i2 == 42;
    }

    public void A(int i2, double d2, double d3) {
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) this.f30f;
        if (kVar.g(i2)) {
            return;
        }
        Log.e("PlatformViewsController", "Setting offset for unknown platform view with id: " + i2);
    }

    public void B(C0198h c0198h) {
        PriorityQueue priorityQueue;
        LongSparseArray longSparseArray;
        long j2;
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) this.f30f;
        float f2 = kVar.f2478f.getResources().getDisplayMetrics().density;
        int i2 = c0198h.f2725a;
        if (!kVar.g(i2)) {
            if (kVar.f2487o.get(i2) != null) {
                throw new ClassCastException();
            }
            Log.e("PlatformViewsController", "Sending touch to an unknown view with id: " + i2);
            return;
        }
        io.flutter.plugin.platform.q qVar = (io.flutter.plugin.platform.q) kVar.f2485m.get(Integer.valueOf(i2));
        H h2 = new H(c0198h.f2740p);
        while (true) {
            Q q2 = kVar.f2495x;
            priorityQueue = (PriorityQueue) q2.f516g;
            boolean isEmpty = priorityQueue.isEmpty();
            longSparseArray = (LongSparseArray) q2.f515f;
            j2 = h2.f1674a;
            if (isEmpty || ((Long) priorityQueue.peek()).longValue() >= j2) {
                break;
            } else {
                longSparseArray.remove(((Long) priorityQueue.poll()).longValue());
            }
        }
        if (!priorityQueue.isEmpty() && ((Long) priorityQueue.peek()).longValue() == j2) {
            priorityQueue.poll();
        }
        longSparseArray.remove(j2);
        List<List> list = (List) c0198h.f2731g;
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
        int i3 = c0198h.f2729e;
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) arrayList.toArray(new MotionEvent.PointerCoords[i3]);
        List<List> list3 = (List) c0198h.f2730f;
        ArrayList arrayList2 = new ArrayList();
        for (List list4 : list3) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerProperties.id = ((Integer) list4.get(0)).intValue();
            pointerProperties.toolType = ((Integer) list4.get(1)).intValue();
            arrayList2.add(pointerProperties);
        }
        MotionEvent.obtain(c0198h.f2726b.longValue(), c0198h.f2727c.longValue(), c0198h.f2728d, c0198h.f2729e, (MotionEvent.PointerProperties[]) arrayList2.toArray(new MotionEvent.PointerProperties[i3]), pointerCoordsArr, c0198h.f2732h, c0198h.f2733i, c0198h.f2734j, c0198h.f2735k, c0198h.f2736l, c0198h.f2737m, c0198h.f2738n, c0198h.f2739o);
        qVar.getClass();
    }

    public void C(C0200j c0200j, C0199i c0199i) {
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) this.f30f;
        int i2 = kVar.i(c0200j.f2742b);
        int i3 = kVar.i(c0200j.f2743c);
        int i4 = c0200j.f2741a;
        if (!kVar.g(i4)) {
            if (kVar.f2487o.get(i4) != null) {
                throw new ClassCastException();
            }
            Log.e("PlatformViewsController", "Resizing unknown platform view with id: " + i4);
            return;
        }
        float f2 = kVar.f2478f.getResources().getDisplayMetrics().density;
        io.flutter.plugin.platform.q qVar = (io.flutter.plugin.platform.q) kVar.f2485m.get(Integer.valueOf(i4));
        io.flutter.plugin.editing.l lVar = kVar.f2482j;
        if (lVar != null) {
            if (lVar.f2440e.f578b == 3) {
                lVar.f2451p = true;
            }
            qVar.getClass();
        }
        qVar.getClass();
        if (i2 == 0 && i3 == 0) {
            throw null;
        }
        if (Build.VERSION.SDK_INT < 31) {
            throw null;
        }
        throw null;
    }

    public void D(int i2, int i3) {
        if (i3 != 0 && i3 != 1) {
            throw new IllegalStateException("Trying to set unknown direction value: " + i3 + "(view id: " + i2 + ")");
        }
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) this.f30f;
        if (kVar.g(i2)) {
            ((io.flutter.plugin.platform.q) kVar.f2485m.get(Integer.valueOf(i2))).getClass();
            Log.e("PlatformViewsController", "Setting direction to a null view with id: " + i2);
            return;
        }
        if (kVar.f2487o.get(i2) != null) {
            throw new ClassCastException();
        }
        Log.e("PlatformViewsController", "Setting direction to an unknown view with id: " + i2);
    }

    public void E(ArrayList arrayList) {
        io.flutter.plugin.platform.e eVar = (io.flutter.plugin.platform.e) this.f30f;
        if (eVar.f2463f) {
            eVar.f2463f = false;
            o.g.y(eVar.f2458a.getWindow(), true);
        }
        int i2 = arrayList.isEmpty() ? 5894 : 1798;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            int ordinal = ((EnumC0197g) arrayList.get(i3)).ordinal();
            if (ordinal == 0) {
                i2 &= -5;
            } else if (ordinal == 1) {
                i2 &= -515;
            }
        }
        eVar.f2462e = i2;
        eVar.b();
    }

    public void F(int i2) {
        int i3;
        io.flutter.plugin.platform.e eVar = (io.flutter.plugin.platform.e) this.f30f;
        eVar.getClass();
        AbstractActivityC0104f abstractActivityC0104f = eVar.f2458a;
        if (i2 != 4 && eVar.f2463f) {
            eVar.f2463f = false;
            o.g.y(abstractActivityC0104f.getWindow(), true);
        }
        if (i2 == 1) {
            i3 = 1798;
        } else if (i2 == 2) {
            i3 = 3846;
        } else {
            if (i2 != 3) {
                if (i2 != 4 || Build.VERSION.SDK_INT < 29) {
                    return;
                }
                eVar.f2463f = true;
                o.g.y(abstractActivityC0104f.getWindow(), false);
                C0196f c0196f = eVar.f2461d;
                if (c0196f != null) {
                    eVar.a(c0196f);
                    return;
                }
                return;
            }
            i3 = 5894;
        }
        eVar.f2462e = i3;
        eVar.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r7.f243a > r3.f243a) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void G(m0 m0Var) {
        P0.q qVar;
        Object obj;
        Object obj2;
        F0.i.e(m0Var, "newState");
        do {
            qVar = (P0.q) this.f30f;
            qVar.getClass();
            obj = Q0.l.f852a;
            Object obj3 = P0.q.f824i.get(qVar);
            obj2 = obj3;
            if (obj3 == obj) {
                obj2 = null;
            }
            m0 m0Var2 = (m0) obj2;
            if (!(m0Var2 instanceof f0 ? true : F0.i.a(m0Var2, n0.f248b))) {
                if (!(m0Var2 instanceof C0003d)) {
                    if (!(m0Var2 instanceof d0)) {
                        throw new M.c();
                    }
                }
                if (obj2 == null) {
                    obj2 = obj;
                }
                if (m0Var2 != null) {
                    obj = m0Var2;
                }
            }
            m0Var2 = m0Var;
            if (obj2 == null) {
            }
            if (m0Var2 != null) {
            }
        } while (!qVar.b(obj2, obj));
    }

    public void H(int i2) {
        View decorView = ((io.flutter.plugin.platform.e) this.f30f).f2458a.getWindow().getDecorView();
        switch (F.j.b(i2)) {
            case 0:
                decorView.performHapticFeedback(0);
                break;
            case 1:
                decorView.performHapticFeedback(1);
                break;
            case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                decorView.performHapticFeedback(3);
                break;
            case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                decorView.performHapticFeedback(6);
                break;
            case F.k.LONG_FIELD_NUMBER /* 4 */:
                decorView.performHapticFeedback(4);
                break;
            case F.k.STRING_FIELD_NUMBER /* 5 */:
                if (Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(16);
                    break;
                }
                break;
            case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                if (Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(3);
                    break;
                }
                break;
            case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                if (Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(17);
                    break;
                }
                break;
        }
    }

    @Override // g.o
    public void a(g.j jVar, boolean z2) {
        if (jVar instanceof t) {
            ((t) jVar).f2053v.j().c(false);
        }
        g.o oVar = ((C0156i) this.f30f).f2203i;
        if (oVar != null) {
            oVar.a(jVar, z2);
        }
    }

    @Override // n0.f
    public void b(String str, InterfaceC0212d interfaceC0212d, E.a aVar) {
        ((C0121i) this.f30f).b(str, interfaceC0212d, aVar);
    }

    @Override // n0.f
    public void c(String str, InterfaceC0212d interfaceC0212d) {
        ((C0121i) this.f30f).b(str, interfaceC0212d, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Type inference failed for: r7v8, types: [E0.p, y0.f] */
    @Override // P0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(P0.e eVar, w0.d dVar) {
        P0.a aVar;
        int i2;
        Throwable th;
        Q0.n nVar;
        switch (this.f29e) {
            case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                Object d2 = ((Q) this.f30f).d(new C0019u(eVar, 0), dVar);
                return d2 == x0.a.f3094e ? d2 : C0247g.f3005a;
            default:
                if (dVar instanceof P0.a) {
                    aVar = (P0.a) dVar;
                    int i3 = aVar.f765k;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        aVar.f765k = i3 - Integer.MIN_VALUE;
                        Object obj = aVar.f763i;
                        x0.a aVar2 = x0.a.f3094e;
                        i2 = aVar.f765k;
                        C0247g c0247g = C0247g.f3005a;
                        if (i2 != 0) {
                            o.g.z(obj);
                            w0.i iVar = aVar.f3098f;
                            F0.i.b(iVar);
                            Q0.n nVar2 = new Q0.n(eVar, iVar);
                            try {
                                aVar.f762h = nVar2;
                                aVar.f765k = 1;
                                Object f2 = ((y0.f) this.f30f).f(nVar2, aVar);
                                if (f2 != aVar2) {
                                    f2 = c0247g;
                                }
                                if (f2 == aVar2) {
                                    return aVar2;
                                }
                                nVar = nVar2;
                            } catch (Throwable th2) {
                                th = th2;
                                nVar = nVar2;
                                nVar.m();
                                throw th;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            nVar = aVar.f762h;
                            try {
                                o.g.z(obj);
                            } catch (Throwable th3) {
                                th = th3;
                                nVar.m();
                                throw th;
                            }
                        }
                        nVar.m();
                        return c0247g;
                    }
                }
                aVar = new P0.a(this, dVar);
                Object obj2 = aVar.f763i;
                x0.a aVar22 = x0.a.f3094e;
                i2 = aVar.f765k;
                C0247g c0247g2 = C0247g.f3005a;
                if (i2 != 0) {
                }
                nVar.m();
                return c0247g2;
        }
    }

    @Override // D.InterfaceC0008i
    public Object e(E0.p pVar, y0.f fVar) {
        return ((InterfaceC0008i) this.f30f).e(new G.c(pVar, null), fVar);
    }

    @Override // h.K
    public void f(g.j jVar, g.k kVar) {
        ((ViewOnKeyListenerC0135g) this.f30f).f1953j.removeCallbacksAndMessages(jVar);
    }

    @Override // J.e
    public void g(int i2, Serializable serializable) {
        String str;
        switch (i2) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case F.k.LONG_FIELD_NUMBER /* 4 */:
                str = "RESULT_NOT_WRITABLE";
                break;
            case F.k.STRING_FIELD_NUMBER /* 5 */:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case F.k.BYTES_FIELD_NUMBER /* 8 */:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i2 == 6 || i2 == 7 || i2 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f30f).setResultCode(i2);
    }

    @Override // J.e
    public void h() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // n0.InterfaceC0210b
    public void i(Object obj, Q q2) {
        HashMap hashMap;
        HashMap hashMap2;
        C0026b c0026b = (C0026b) this.f30f;
        if (((io.flutter.view.b) c0026b.f522h) == null) {
            q2.e(null);
            return;
        }
        hashMap = (HashMap) obj;
        String str = (String) hashMap.get("type");
        hashMap2 = (HashMap) hashMap.get("data");
        str.getClass();
        switch (str) {
            case "tooltip":
                String str2 = (String) hashMap2.get("message");
                if (str2 != null) {
                    io.flutter.view.b bVar = (io.flutter.view.b) c0026b.f522h;
                    if (Build.VERSION.SDK_INT < 28) {
                        io.flutter.view.h hVar = (io.flutter.view.h) bVar.f2507a;
                        AccessibilityEvent d2 = hVar.d(0, 32);
                        d2.getText().add(str2);
                        hVar.h(d2);
                        break;
                    } else {
                        bVar.getClass();
                        break;
                    }
                }
                break;
            case "announce":
                String str3 = (String) hashMap2.get("message");
                if (str3 != null) {
                    io.flutter.view.b bVar2 = (io.flutter.view.b) c0026b.f522h;
                    if (Build.VERSION.SDK_INT >= 36) {
                        bVar2.getClass();
                        Log.w("AccessibilityBridge", "Using AnnounceSemanticsEvent for accessibility is deprecated on Android. Migrate to using semantic properties for a more robust and accessible user experience.\nFlutter: If you are unsure why you are seeing this bug, it might be because you are using a widget that calls this method. See https://github.com/flutter/flutter/issues/165510 for more details.\nAndroid documentation: https://developer.android.com/reference/android/view/View#announceForAccessibility(java.lang.CharSequence)");
                    }
                    ((io.flutter.view.h) bVar2.f2507a).f2597a.announceForAccessibility(str3);
                    break;
                }
                break;
            case "tap":
                Integer num = (Integer) hashMap.get("nodeId");
                if (num != null) {
                    io.flutter.view.b bVar3 = (io.flutter.view.b) c0026b.f522h;
                    ((io.flutter.view.h) bVar3.f2507a).g(num.intValue(), 1);
                    break;
                }
                break;
            case "focus":
                Integer num2 = (Integer) hashMap.get("nodeId");
                if (num2 != null) {
                    io.flutter.view.b bVar4 = (io.flutter.view.b) c0026b.f522h;
                    ((io.flutter.view.h) bVar4.f2507a).g(num2.intValue(), 8);
                    break;
                }
                break;
            case "longPress":
                Integer num3 = (Integer) hashMap.get("nodeId");
                if (num3 != null) {
                    io.flutter.view.b bVar5 = (io.flutter.view.b) c0026b.f522h;
                    ((io.flutter.view.h) bVar5.f2507a).g(num3.intValue(), 2);
                    break;
                }
                break;
        }
        q2.e(null);
    }

    @Override // D.InterfaceC0008i
    public P0.d j() {
        return ((InterfaceC0008i) this.f30f).j();
    }

    @Override // n0.f
    public void l(String str, ByteBuffer byteBuffer, n0.e eVar) {
        ((C0121i) this.f30f).l(str, byteBuffer, eVar);
    }

    @Override // g.o
    public boolean m(t tVar) {
        if (tVar == null) {
            return false;
        }
        tVar.f2054w.getClass();
        C0156i c0156i = (C0156i) this.f30f;
        c0156i.getClass();
        g.o oVar = c0156i.f2203i;
        if (oVar != null) {
            return oVar.m(tVar);
        }
        return false;
    }

    @Override // n0.k
    public void n(Q q2, C0201k c0201k) {
        ((E.a) this.f30f).getClass();
    }

    @Override // n0.f
    public E.a o(n0.i iVar) {
        return ((C0121i) this.f30f).o(iVar);
    }

    @Override // n0.InterfaceC0212d
    public void p(ByteBuffer byteBuffer, C0119g c0119g) {
        n0.p.f2791b.getClass();
        n0.p.c(byteBuffer);
        ((C0114b) this.f30f).getClass();
    }

    @Override // h.K
    public void q(g.j jVar, g.k kVar) {
        ViewOnKeyListenerC0135g viewOnKeyListenerC0135g = (ViewOnKeyListenerC0135g) this.f30f;
        viewOnKeyListenerC0135g.f1953j.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC0135g.f1955l;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (jVar == ((C0134f) arrayList.get(i2)).f1943b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return;
        }
        int i3 = i2 + 1;
        viewOnKeyListenerC0135g.f1953j.postAtTime(new RunnableC0133e(this, i3 < arrayList.size() ? (C0134f) arrayList.get(i3) : null, kVar, jVar), jVar, SystemClock.uptimeMillis() + 200);
    }

    public void r(int i2) {
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) this.f30f;
        if (kVar.g(i2)) {
            ((io.flutter.plugin.platform.q) kVar.f2485m.get(Integer.valueOf(i2))).getClass();
            Log.e("PlatformViewsController", "Clearing focus on a null view with id: " + i2);
            return;
        }
        if (kVar.f2487o.get(i2) != null) {
            throw new ClassCastException();
        }
        Log.e("PlatformViewsController", "Clearing focus on an unknown view with id: " + i2);
    }

    public void s(C0165s c0165s) {
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) this.f30f;
        io.flutter.plugin.platform.k.b(kVar, c0165s);
        if (kVar.f2480h.IsSurfaceControlEnabled()) {
            throw new IllegalStateException("Trying to create a Hybrid Composition view with HC++ enabled.");
        }
        HashMap hashMap = kVar.f2477e.f1845a;
        String str = (String) c0165s.f2273c;
        if (hashMap.get(str) != null) {
            throw new ClassCastException();
        }
        throw new IllegalStateException(F0.h.f("Trying to create a platform view of unregistered type: ", str));
    }

    public long t(C0165s c0165s) {
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) this.f30f;
        io.flutter.plugin.platform.k.b(kVar, c0165s);
        SparseArray sparseArray = kVar.r;
        int i2 = c0165s.f2271a;
        if (sparseArray.get(i2) != null) {
            throw new IllegalStateException(F0.h.e("Trying to create an already created platform view, view id: ", i2));
        }
        if (kVar.f2481i == null) {
            throw new IllegalStateException(F0.h.e("Texture registry is null. This means that platform views controller was detached, view id: ", i2));
        }
        if (kVar.f2479g == null) {
            throw new IllegalStateException(F0.h.e("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: ", i2));
        }
        HashMap hashMap = kVar.f2477e.f1845a;
        String str = (String) c0165s.f2273c;
        if (hashMap.get(str) == null) {
            throw new IllegalStateException(F0.h.f("Trying to create a platform view of unregistered type: ", str));
        }
        throw new ClassCastException();
    }

    public String toString() {
        switch (this.f29e) {
            case 11:
                return "<" + ((String) this.f30f) + '>';
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [g0.a] */
    public Bitmap u(ByteBuffer byteBuffer, C0140d c0140d) {
        ImageDecoder.Source createSource;
        Bitmap decodeBitmap;
        createSource = ImageDecoder.createSource(byteBuffer);
        try {
            decodeBitmap = ImageDecoder.decodeBitmap(createSource, new ImageDecoder.OnHeaderDecodedListener() { // from class: g0.a
                @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                    ColorSpace.Named named;
                    ColorSpace colorSpace;
                    Size size;
                    j jVar = j.this;
                    jVar.getClass();
                    named = ColorSpace.Named.SRGB;
                    colorSpace = ColorSpace.get(named);
                    imageDecoder.setTargetColorSpace(colorSpace);
                    imageDecoder.setAllocator(1);
                    k kVar = (k) jVar.f30f;
                    if (kVar != null) {
                        size = imageInfo.getSize();
                        FlutterJNI.nativeImageHeaderCallback(kVar.f1846a, size.getWidth(), size.getHeight());
                    }
                }
            });
            return decodeBitmap;
        } catch (IOException e2) {
            Log.e("FlutterImageDecoderImplDefault", "Failed to decode image", e2);
            return null;
        }
    }

    public void v(int i2) {
        switch (this.f29e) {
            case 26:
                F0.h.h(((io.flutter.plugin.platform.k) this.f30f).f2487o.get(i2));
                Log.e("PlatformViewsController", "Disposing unknown platform view with id: " + i2);
                break;
            default:
                io.flutter.plugin.platform.j jVar = (io.flutter.plugin.platform.j) this.f30f;
                jVar.f2476q.remove(Integer.valueOf(i2));
                F0.h.h(jVar.f2470k.get(i2));
                Log.e("PlatformViewsController2", "Disposing unknown platform view with id: " + i2);
                break;
        }
    }

    public CharSequence w(EnumC0195e enumC0195e) {
        AbstractActivityC0104f abstractActivityC0104f = ((io.flutter.plugin.platform.e) this.f30f).f2458a;
        ClipboardManager clipboardManager = (ClipboardManager) abstractActivityC0104f.getSystemService("clipboard");
        CharSequence charSequence = null;
        if (!clipboardManager.hasPrimaryClip()) {
            return null;
        }
        try {
            try {
                ClipData primaryClip = clipboardManager.getPrimaryClip();
                if (primaryClip == null) {
                    return null;
                }
                if (enumC0195e != null && enumC0195e != EnumC0195e.f2711f) {
                    return null;
                }
                ClipData.Item itemAt = primaryClip.getItemAt(0);
                CharSequence text = itemAt.getText();
                if (text != null) {
                    return text;
                }
                try {
                    Uri uri = itemAt.getUri();
                    if (uri == null) {
                        Log.w("PlatformPlugin", "Clipboard item contained no textual content nor a URI to retrieve it from.");
                    } else {
                        String scheme = uri.getScheme();
                        if (scheme.equals("content")) {
                            AssetFileDescriptor openTypedAssetFileDescriptor = abstractActivityC0104f.getContentResolver().openTypedAssetFileDescriptor(uri, "text/*", null);
                            CharSequence coerceToText = itemAt.coerceToText(abstractActivityC0104f);
                            if (openTypedAssetFileDescriptor != null) {
                                try {
                                    openTypedAssetFileDescriptor.close();
                                } catch (IOException e2) {
                                    charSequence = coerceToText;
                                    e = e2;
                                    Log.w("PlatformPlugin", "Failed to close AssetFileDescriptor while trying to read text from URI.", e);
                                    return charSequence;
                                }
                            }
                            charSequence = coerceToText;
                        } else {
                            Log.w("PlatformPlugin", "Clipboard item contains a Uri with scheme '" + scheme + "'that is unhandled.");
                        }
                    }
                    return charSequence;
                } catch (IOException e3) {
                    e = e3;
                    charSequence = text;
                }
            } catch (IOException e4) {
                e = e4;
            }
        } catch (FileNotFoundException unused) {
            Log.w("PlatformPlugin", "Clipboard text was unable to be received from content URI.");
            return null;
        } catch (SecurityException e5) {
            Log.w("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e5);
            return null;
        }
    }

    public m0 x() {
        P0.q qVar = (P0.q) this.f30f;
        qVar.getClass();
        j jVar = Q0.l.f852a;
        Object obj = P0.q.f824i.get(qVar);
        if (obj == jVar) {
            obj = null;
        }
        return (m0) obj;
    }

    public /* synthetic */ j(int i2, boolean z2) {
        this.f29e = i2;
    }

    public j(int i2) {
        this.f29e = i2;
        switch (i2) {
            case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                this.f30f = new P0.q(n0.f248b);
                break;
            case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                this.f30f = new SparseIntArray();
                break;
            default:
                this.f30f = new AtomicInteger(0);
                break;
        }
    }

    public j(boolean z2) {
        this.f29e = 4;
        this.f30f = new AtomicBoolean(z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(E0.p pVar) {
        this.f29e = 10;
        this.f30f = (y0.f) pVar;
    }
}
