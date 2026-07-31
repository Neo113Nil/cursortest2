package B0;

import F.C0022d;
import F.C0032n;
import F.InterfaceC0027i;
import F.b0;
import F.d0;
import F.l0;
import F.m0;
import a.AbstractC0086a;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseIntArray;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import androidx.datastore.preferences.protobuf.k0;
import androidx.profileinstaller.ProfileInstallReceiver;
import f0.C0130a;
import g0.C0131a;
import g0.C0132b;
import g0.C0133c;
import h.C0139f;
import h.MenuC0143j;
import h.MenuItemC0144k;
import h.RunnableC0138e;
import h.ViewOnKeyListenerC0140g;
import h0.ServiceConnectionC0145a;
import i.C0162i;
import i.C0172t;
import i.InterfaceC0165l;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import l.AbstractC0194b;
import l.AbstractC0195c;
import l.AbstractC0196d;
import l.C0197e;
import p.AbstractC0215a;
import u0.EnumC0233e;
import u0.EnumC0235g;
import v0.C0244i;
import v0.InterfaceC0239d;
import v0.InterfaceC0240e;
import v0.InterfaceC0241f;

/* loaded from: classes.dex */
public final class E implements Z0.d, InterfaceC0027i, L.f, i.L, h.o, InterfaceC0165l, u0.j, InterfaceC0241f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f19e;

    /* renamed from: f, reason: collision with root package name */
    public Object f20f;

    public /* synthetic */ E(int i2, Object obj) {
        this.f19e = i2;
        this.f20f = obj;
    }

    public static int A(int i2, int i3) {
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

    public static boolean B(int i2) {
        return (48 <= i2 && i2 <= 57) || i2 == 35 || i2 == 42;
    }

    public static C0132b x(Map map) {
        Integer valueOf;
        C0008i c2;
        C0008i c3;
        C0008i c4;
        String str;
        Integer valueOf2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Boolean bool;
        Boolean bool2;
        Set set;
        Map map2;
        Double d2;
        Integer valueOf3;
        Boolean bool3;
        Double d3;
        Double d4;
        Boolean bool4;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        if (map == null) {
            return null;
        }
        Map map3 = (Map) map.get("colorSchemes");
        if (map3 == null) {
            c4 = null;
            valueOf = null;
            c2 = null;
            c3 = null;
        } else {
            Long l2 = (Long) map3.get("colorScheme");
            valueOf = l2 != null ? Integer.valueOf((int) l2.longValue()) : null;
            c2 = k0.c((Map) map3.get("lightParams"));
            c3 = k0.c((Map) map3.get("darkParams"));
            c4 = k0.c((Map) map3.get("defaultParams"));
        }
        C0032n c0032n = new C0032n(valueOf, c2, c3, c4);
        Boolean bool5 = (Boolean) map.get("urlBarHidingEnabled");
        Long l3 = (Long) map.get("shareState");
        Integer valueOf4 = l3 != null ? Integer.valueOf((int) l3.longValue()) : null;
        Boolean bool6 = (Boolean) map.get("showTitle");
        Boolean bool7 = (Boolean) map.get("instantAppsEnabled");
        Boolean bool8 = (Boolean) map.get("bookmarksButtonEnabled");
        Boolean bool9 = (Boolean) map.get("downloadButtonEnabled");
        Boolean bool10 = (Boolean) map.get("shareIdentityEnabled");
        Map map4 = (Map) map.get("closeButton");
        if (map4 == null) {
            valueOf2 = null;
            str = null;
        } else {
            str = (String) map4.get("icon");
            Long l4 = (Long) map4.get("position");
            valueOf2 = l4 != null ? Integer.valueOf((int) l4.longValue()) : null;
        }
        N.P p2 = new N.P(7, str, valueOf2);
        Map map5 = (Map) map.get("animations");
        if (map5 == null) {
            str5 = null;
            str2 = null;
            str3 = null;
            str4 = null;
        } else {
            str2 = (String) map5.get("startEnter");
            str3 = (String) map5.get("startExit");
            str4 = (String) map5.get("endEnter");
            str5 = (String) map5.get("endExit");
        }
        C0032n c0032n2 = new C0032n(str2, str3, str4, str5);
        Map map6 = (Map) map.get("browser");
        if (map6 == null) {
            bool = null;
            bool2 = null;
            set = null;
            map2 = null;
            str6 = null;
        } else {
            Boolean bool11 = (Boolean) map6.get("prefersExternalBrowser");
            Boolean bool12 = (Boolean) map6.get("prefersDefaultBrowser");
            List list = (List) map6.get("fallbackCustomTabs");
            Set T2 = list != null ? E0.f.T(list) : null;
            Map map7 = (Map) map6.get("headers");
            str6 = (String) map6.get("sessionPackageName");
            bool = bool11;
            bool2 = bool12;
            set = T2;
            map2 = map7;
        }
        C0131a c0131a = new C0131a(bool, bool2, set, map2, str6);
        Map map8 = (Map) map.get("partial");
        if (map8 == null) {
            d2 = null;
            num = null;
            d3 = null;
            d4 = null;
            bool4 = null;
            num2 = null;
            num3 = null;
            num4 = null;
            valueOf3 = null;
            bool3 = null;
        } else {
            Double d5 = (Double) map8.get("initialHeight");
            Long l5 = (Long) map8.get("activityHeightResizeBehavior");
            Integer valueOf5 = l5 != null ? Integer.valueOf((int) l5.longValue()) : null;
            Double d6 = (Double) map8.get("initialWidth");
            Double d7 = (Double) map8.get("activitySideSheetBreakpoint");
            Boolean bool13 = (Boolean) map8.get("activitySideSheetMaximizationEnabled");
            Long l6 = (Long) map8.get("activitySideSheetPosition");
            Integer num5 = valueOf5;
            Integer valueOf6 = l6 != null ? Integer.valueOf((int) l6.longValue()) : null;
            Long l7 = (Long) map8.get("activitySideSheetDecorationType");
            Integer num6 = valueOf6;
            Integer valueOf7 = l7 != null ? Integer.valueOf((int) l7.longValue()) : null;
            Long l8 = (Long) map8.get("activitySideSheetRoundedCornersPosition");
            Integer num7 = valueOf7;
            Integer valueOf8 = l8 != null ? Integer.valueOf((int) l8.longValue()) : null;
            Boolean bool14 = (Boolean) map8.get("backgroundInteractionEnabled");
            Integer num8 = valueOf8;
            Long l9 = (Long) map8.get("cornerRadius");
            d2 = d5;
            valueOf3 = l9 != null ? Integer.valueOf((int) l9.longValue()) : null;
            bool3 = bool14;
            d3 = d6;
            d4 = d7;
            bool4 = bool13;
            num = num5;
            num2 = num6;
            num3 = num7;
            num4 = num8;
        }
        return new C0132b(c0032n, bool5, valueOf4, bool6, bool7, bool8, bool9, bool10, p2, c0032n2, c0131a, new C0133c(d2, num, d3, d4, bool4, num2, num3, num4, valueOf3, bool3));
    }

    public void C(ArrayList arrayList) {
        io.flutter.plugin.platform.e eVar = (io.flutter.plugin.platform.e) this.f20f;
        int i2 = arrayList.isEmpty() ? 5894 : 1798;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            int ordinal = ((EnumC0235g) arrayList.get(i3)).ordinal();
            if (ordinal == 0) {
                i2 &= -5;
            } else if (ordinal == 1) {
                i2 &= -515;
            }
        }
        eVar.f2466e = i2;
        eVar.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r7.f398a > r3.f398a) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void D(l0 l0Var) {
        Object obj;
        Object obj2;
        P0.h.e(l0Var, "newState");
        Z0.p pVar = (Z0.p) this.f20f;
        do {
            pVar.getClass();
            Object obj3 = Z0.p.f1129i.get(pVar);
            obj = a1.l.f1161a;
            obj2 = obj3;
            if (obj3 == obj) {
                obj2 = null;
            }
            l0 l0Var2 = (l0) obj2;
            if (!(l0Var2 instanceof d0 ? true : P0.h.a(l0Var2, m0.f408b))) {
                if (!(l0Var2 instanceof C0022d)) {
                    if (!(l0Var2 instanceof b0)) {
                        throw new D0.b();
                    }
                }
                if (obj2 == null) {
                    obj2 = obj;
                }
                if (l0Var2 != null) {
                    obj = l0Var2;
                }
            }
            l0Var2 = l0Var;
            if (obj2 == null) {
            }
            if (l0Var2 != null) {
            }
        } while (!pVar.b(obj2, obj));
    }

    public void E(int i2) {
        View decorView = ((io.flutter.plugin.platform.e) this.f20f).f2462a.getWindow().getDecorView();
        switch (H.j.a(i2)) {
            case 0:
                decorView.performHapticFeedback(0);
                break;
            case 1:
                decorView.performHapticFeedback(1);
                break;
            case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                decorView.performHapticFeedback(3);
                break;
            case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                decorView.performHapticFeedback(6);
                break;
            case H.k.LONG_FIELD_NUMBER /* 4 */:
                decorView.performHapticFeedback(4);
                break;
            case H.k.STRING_FIELD_NUMBER /* 5 */:
                if (Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(16);
                    break;
                }
                break;
            case H.k.STRING_SET_FIELD_NUMBER /* 6 */:
                if (Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(3);
                    break;
                }
                break;
            case H.k.DOUBLE_FIELD_NUMBER /* 7 */:
                if (Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(17);
                    break;
                }
                break;
        }
    }

    @Override // h.o
    public void a(MenuC0143j menuC0143j, boolean z2) {
        if (menuC0143j instanceof h.t) {
            ((h.t) menuC0143j).f2086v.j().c(false);
        }
        h.o oVar = ((C0162i) this.f20f).f2231i;
        if (oVar != null) {
            oVar.a(menuC0143j, z2);
        }
    }

    @Override // u0.j
    public void b(boolean z2) {
        ((io.flutter.plugin.platform.l) this.f20f).f2495u = z2;
    }

    @Override // u0.j
    public void c(int i2, double d2, double d3) {
        io.flutter.plugin.platform.l lVar = (io.flutter.plugin.platform.l) this.f20f;
        if (lVar.e(i2)) {
            return;
        }
        Log.e("PlatformViewsController", "Setting offset for unknown platform view with id: " + i2);
    }

    @Override // u0.j
    public void d(int i2, int i3) {
        io.flutter.plugin.platform.l lVar = (io.flutter.plugin.platform.l) this.f20f;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalStateException("Trying to set unknown direction value: " + i3 + "(view id: " + i2 + ")");
        }
        if (lVar.e(i2)) {
            ((io.flutter.plugin.platform.r) lVar.f2488m.get(Integer.valueOf(i2))).getClass();
            Log.e("PlatformViewsController", "Setting direction to a null view with id: " + i2);
            return;
        }
        if (lVar.f2490o.get(i2) != null) {
            throw new ClassCastException();
        }
        Log.e("PlatformViewsController", "Setting direction to an unknown view with id: " + i2);
    }

    @Override // v0.InterfaceC0241f
    public void e(String str, ByteBuffer byteBuffer, InterfaceC0240e interfaceC0240e) {
        ((m0.i) this.f20f).e(str, byteBuffer, interfaceC0240e);
    }

    @Override // F.InterfaceC0027i
    public Object f(O0.p pVar, I0.g gVar) {
        return ((InterfaceC0027i) this.f20f).f(new I.c(pVar, null), gVar);
    }

    @Override // v0.InterfaceC0241f
    public C0000a g(C0244i c0244i) {
        return ((m0.i) this.f20f).g(c0244i);
    }

    @Override // v0.InterfaceC0241f
    public void h(String str, InterfaceC0239d interfaceC0239d) {
        ((m0.i) this.f20f).v(str, interfaceC0239d, null);
    }

    @Override // u0.j
    public long i(C0172t c0172t) {
        io.flutter.plugin.platform.l lVar = (io.flutter.plugin.platform.l) this.f20f;
        io.flutter.plugin.platform.l.b(lVar, c0172t);
        int i2 = c0172t.f2310a;
        if (lVar.f2493r.get(i2) != null) {
            throw new IllegalStateException(L.d.e("Trying to create an already created platform view, view id: ", i2));
        }
        if (lVar.f2484i == null) {
            throw new IllegalStateException(L.d.e("Texture registry is null. This means that platform views controller was detached, view id: ", i2));
        }
        if (lVar.f2482g == null) {
            throw new IllegalStateException(L.d.e("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: ", i2));
        }
        l0.h hVar = lVar.f2480e;
        String str = (String) c0172t.f2312c;
        if (hVar.f2816a.get(str) == null) {
            throw new IllegalStateException(L.d.g("Trying to create a platform view of unregistered type: ", str));
        }
        throw new ClassCastException();
    }

    @Override // u0.j
    public void j(u0.i iVar, l0.i iVar2) {
        io.flutter.plugin.platform.l lVar = (io.flutter.plugin.platform.l) this.f20f;
        int i2 = lVar.i(iVar.f3022b);
        int i3 = lVar.i(iVar.f3023c);
        int i4 = iVar.f3021a;
        if (!lVar.e(i4)) {
            if (lVar.f2490o.get(i4) != null) {
                throw new ClassCastException();
            }
            Log.e("PlatformViewsController", "Resizing unknown platform view with id: " + i4);
            return;
        }
        float f2 = lVar.f2481f.getResources().getDisplayMetrics().density;
        io.flutter.plugin.platform.r rVar = (io.flutter.plugin.platform.r) lVar.f2488m.get(Integer.valueOf(i4));
        io.flutter.plugin.editing.l lVar2 = lVar.f2485j;
        if (lVar2 != null) {
            if (lVar2.f2444e.f756b == 3) {
                lVar2.f2455p = true;
            }
            rVar.getClass();
        }
        rVar.getClass();
        if (i2 == 0 && i3 == 0) {
            throw null;
        }
        if (Build.VERSION.SDK_INT < 31) {
            throw null;
        }
        throw null;
    }

    @Override // u0.j
    public void k(int i2) {
        io.flutter.plugin.platform.l lVar = (io.flutter.plugin.platform.l) this.f20f;
        if (lVar.e(i2)) {
            ((io.flutter.plugin.platform.r) lVar.f2488m.get(Integer.valueOf(i2))).getClass();
            Log.e("PlatformViewsController", "Clearing focus on a null view with id: " + i2);
            return;
        }
        if (lVar.f2490o.get(i2) != null) {
            throw new ClassCastException();
        }
        Log.e("PlatformViewsController", "Clearing focus on an unknown view with id: " + i2);
    }

    @Override // i.L
    public void l(MenuC0143j menuC0143j, MenuItem menuItem) {
        ((ViewOnKeyListenerC0140g) this.f20f).f1986j.removeCallbacksAndMessages(menuC0143j);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Type inference failed for: r6v8, types: [I0.g, O0.p] */
    @Override // Z0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m(Z0.e eVar, G0.d dVar) {
        Z0.a aVar;
        int i2;
        Throwable th;
        a1.n nVar;
        switch (this.f19e) {
            case 0:
                Object m2 = ((Z0.d) this.f20f).m(new D(eVar, 0), dVar);
                return m2 == H0.a.f511e ? m2 : D0.h.f206a;
            case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                Object m3 = ((N.P) this.f20f).m(new D(eVar, 1), dVar);
                return m3 == H0.a.f511e ? m3 : D0.h.f206a;
            default:
                if (dVar instanceof Z0.a) {
                    aVar = (Z0.a) dVar;
                    int i3 = aVar.f1074k;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        aVar.f1074k = i3 - Integer.MIN_VALUE;
                        Object obj = aVar.f1072i;
                        i2 = aVar.f1074k;
                        D0.h hVar = D0.h.f206a;
                        if (i2 != 0) {
                            AbstractC0086a.I(obj);
                            G0.i iVar = aVar.f527f;
                            P0.h.b(iVar);
                            a1.n nVar2 = new a1.n(eVar, iVar);
                            try {
                                aVar.f1071h = nVar2;
                                aVar.f1074k = 1;
                                Object i4 = ((I0.g) this.f20f).i(nVar2, aVar);
                                H0.a aVar2 = H0.a.f511e;
                                if (i4 != aVar2) {
                                    i4 = hVar;
                                }
                                if (i4 == aVar2) {
                                    return aVar2;
                                }
                                nVar = nVar2;
                            } catch (Throwable th2) {
                                th = th2;
                                nVar = nVar2;
                                nVar.o();
                                throw th;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            nVar = aVar.f1071h;
                            try {
                                AbstractC0086a.I(obj);
                            } catch (Throwable th3) {
                                th = th3;
                                nVar.o();
                                throw th;
                            }
                        }
                        nVar.o();
                        return hVar;
                    }
                }
                aVar = new Z0.a(this, dVar);
                Object obj2 = aVar.f1072i;
                i2 = aVar.f1074k;
                D0.h hVar2 = D0.h.f206a;
                if (i2 != 0) {
                }
                nVar.o();
                return hVar2;
        }
    }

    @Override // h.o
    public boolean n(MenuC0143j menuC0143j) {
        C0162i c0162i = (C0162i) this.f20f;
        if (menuC0143j == null) {
            return false;
        }
        ((h.t) menuC0143j).f2087w.getClass();
        c0162i.getClass();
        h.o oVar = c0162i.f2231i;
        if (oVar != null) {
            return oVar.n(menuC0143j);
        }
        return false;
    }

    @Override // L.f
    public void o() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // i.L
    public void p(MenuC0143j menuC0143j, MenuItemC0144k menuItemC0144k) {
        ViewOnKeyListenerC0140g viewOnKeyListenerC0140g = (ViewOnKeyListenerC0140g) this.f20f;
        Handler handler = viewOnKeyListenerC0140g.f1986j;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC0140g.f1988l;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (menuC0143j == ((C0139f) arrayList.get(i2)).f1976b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return;
        }
        int i3 = i2 + 1;
        handler.postAtTime(new RunnableC0138e(this, i3 < arrayList.size() ? (C0139f) arrayList.get(i3) : null, menuItemC0144k, menuC0143j), menuC0143j, SystemClock.uptimeMillis() + 200);
    }

    @Override // L.f
    public void q(int i2, Object obj) {
        String str;
        switch (i2) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case H.k.LONG_FIELD_NUMBER /* 4 */:
                str = "RESULT_NOT_WRITABLE";
                break;
            case H.k.STRING_FIELD_NUMBER /* 5 */:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case H.k.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case H.k.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case H.k.BYTES_FIELD_NUMBER /* 8 */:
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
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f20f).setResultCode(i2);
    }

    @Override // u0.j
    public void r(u0.h hVar) {
        int i2 = hVar.f3005a;
        io.flutter.plugin.platform.l lVar = (io.flutter.plugin.platform.l) this.f20f;
        float f2 = lVar.f2481f.getResources().getDisplayMetrics().density;
        if (!lVar.e(i2)) {
            if (lVar.f2490o.get(i2) != null) {
                throw new ClassCastException();
            }
            Log.e("PlatformViewsController", "Sending touch to an unknown view with id: " + i2);
            return;
        }
        io.flutter.plugin.platform.r rVar = (io.flutter.plugin.platform.r) lVar.f2488m.get(Integer.valueOf(i2));
        long j2 = hVar.f3020p;
        int i3 = hVar.f3009e;
        N.P p2 = lVar.f2498x;
        p2.getClass();
        LongSparseArray longSparseArray = (LongSparseArray) p2.f698f;
        PriorityQueue priorityQueue = (PriorityQueue) p2.f699g;
        while (!priorityQueue.isEmpty() && ((Long) priorityQueue.peek()).longValue() < j2) {
            longSparseArray.remove(((Long) priorityQueue.poll()).longValue());
        }
        if (!priorityQueue.isEmpty() && ((Long) priorityQueue.peek()).longValue() == j2) {
            priorityQueue.poll();
        }
        longSparseArray.remove(j2);
        List<List> list = (List) hVar.f3011g;
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
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) arrayList.toArray(new MotionEvent.PointerCoords[i3]);
        List<List> list3 = (List) hVar.f3010f;
        ArrayList arrayList2 = new ArrayList();
        for (List list4 : list3) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerProperties.id = ((Integer) list4.get(0)).intValue();
            pointerProperties.toolType = ((Integer) list4.get(1)).intValue();
            arrayList2.add(pointerProperties);
        }
        MotionEvent.obtain(hVar.f3006b.longValue(), hVar.f3007c.longValue(), hVar.f3008d, hVar.f3009e, (MotionEvent.PointerProperties[]) arrayList2.toArray(new MotionEvent.PointerProperties[i3]), pointerCoordsArr, hVar.f3012h, hVar.f3013i, hVar.f3014j, hVar.f3015k, hVar.f3016l, hVar.f3017m, hVar.f3018n, hVar.f3019o);
        rVar.getClass();
    }

    @Override // u0.j
    public void s(int i2) {
        switch (this.f19e) {
            case 24:
                if (((io.flutter.plugin.platform.l) this.f20f).f2490o.get(i2) != null) {
                    throw new ClassCastException();
                }
                Log.e("PlatformViewsController", "Disposing unknown platform view with id: " + i2);
                return;
            default:
                if (((io.flutter.plugin.platform.k) this.f20f).f2473k.get(i2) != null) {
                    throw new ClassCastException();
                }
                Log.e("PlatformViewsController2", "Disposing unknown platform view with id: " + i2);
                return;
        }
    }

    @Override // u0.j
    public void t(C0172t c0172t) {
        io.flutter.plugin.platform.l lVar = (io.flutter.plugin.platform.l) this.f20f;
        io.flutter.plugin.platform.l.b(lVar, c0172t);
        if (lVar.f2483h.IsSurfaceControlEnabled()) {
            throw new IllegalStateException("Trying to create a Hybrid Composition view with HC++ enabled.");
        }
        l0.h hVar = lVar.f2480e;
        String str = (String) c0172t.f2312c;
        if (hVar.f2816a.get(str) != null) {
            throw new ClassCastException();
        }
        throw new IllegalStateException(L.d.g("Trying to create a platform view of unregistered type: ", str));
    }

    public String toString() {
        switch (this.f19e) {
            case 14:
                return "<" + ((String) this.f20f) + '>';
            default:
                return super.toString();
        }
    }

    @Override // F.InterfaceC0027i
    public Z0.d u() {
        return ((InterfaceC0027i) this.f20f).u();
    }

    @Override // v0.InterfaceC0241f
    public void v(String str, InterfaceC0239d interfaceC0239d, C0000a c0000a) {
        ((m0.i) this.f20f).v(str, interfaceC0239d, c0000a);
    }

    public N.P w(Context context, C0132b c0132b, E e2) {
        C0130a c0130a;
        boolean z2;
        Bundle bundle;
        Drawable b2;
        Parcelable parcelable;
        ServiceConnectionC0145a serviceConnectionC0145a;
        C0130a c0130a2 = (C0130a) this.f20f;
        P0.h.e(context, "context");
        P0.h.e(e2, "sessionProvider");
        C0131a c0131a = c0132b.f1944k;
        String str = c0131a.f1929b;
        C0197e c0197e = new C0197e((str == null || (serviceConnectionC0145a = (ServiceConnectionC0145a) ((LinkedHashMap) e2.f20f).get(str)) == null) ? null : serviceConnectionC0145a.f2091d);
        C0032n c0032n = c0132b.f1934a;
        Integer num = (Integer) c0032n.f409a;
        Intent intent = c0197e.f2764a;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue < 0 || intValue > 2) {
                throw new IllegalArgumentException("Invalid value for the colorScheme argument");
            }
            intent.putExtra("androidx.browser.customtabs.extra.COLOR_SCHEME", intValue);
        }
        C0008i c0008i = (C0008i) c0032n.f410b;
        if (c0008i != null) {
            c0197e.a(1, c0008i);
        }
        C0008i c0008i2 = (C0008i) c0032n.f411c;
        if (c0008i2 != null) {
            c0197e.a(2, c0008i2);
        }
        C0008i c0008i3 = (C0008i) c0032n.f412d;
        if (c0008i3 != null) {
            c0197e.f2768e = c0008i3.J();
        }
        Boolean bool = c0132b.f1935b;
        if (bool != null) {
            intent.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", bool.booleanValue());
        }
        Integer num2 = c0132b.f1936c;
        if (num2 != null) {
            int intValue2 = num2.intValue();
            if (intValue2 < 0 || intValue2 > 2) {
                throw new IllegalArgumentException("Invalid value for the shareState argument");
            }
            c0197e.f2769f = intValue2;
            if (intValue2 == 1) {
                intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
            } else if (intValue2 == 2) {
                intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
            } else {
                intent.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
            }
        }
        Boolean bool2 = c0132b.f1937d;
        if (bool2 != null) {
            intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = c0132b.f1938e;
        if (bool3 != null) {
            c0197e.f2770g = bool3.booleanValue();
        }
        if (c0132b.f1939f != null) {
            intent.putExtra("org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_STAR_BUTTON", !r3.booleanValue());
        }
        if (c0132b.f1940g != null) {
            intent.putExtra("org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_DOWNLOAD_BUTTON", !r3.booleanValue());
        }
        Boolean bool4 = c0132b.f1941h;
        if (bool4 != null) {
            c0197e.f2771h = bool4.booleanValue();
        }
        N.P p2 = c0132b.f1942i;
        String str2 = (String) p2.f698f;
        if (str2 != null) {
            c0130a2.getClass();
            int a2 = C0130a.a(context, "drawable", str2);
            if (a2 == 0 || (b2 = AbstractC0215a.b(context, a2)) == null) {
                c0130a = c0130a2;
                z2 = true;
                parcelable = null;
            } else {
                int intrinsicWidth = b2.getIntrinsicWidth();
                int intrinsicHeight = b2.getIntrinsicHeight();
                if (b2 instanceof BitmapDrawable) {
                    BitmapDrawable bitmapDrawable = (BitmapDrawable) b2;
                    if (bitmapDrawable.getBitmap() == null) {
                        throw new IllegalArgumentException("bitmap is null");
                    }
                    parcelable = (intrinsicWidth == bitmapDrawable.getBitmap().getWidth() && intrinsicHeight == bitmapDrawable.getBitmap().getHeight()) ? bitmapDrawable.getBitmap() : Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), intrinsicWidth, intrinsicHeight, true);
                    c0130a = c0130a2;
                    z2 = true;
                } else {
                    Rect bounds = b2.getBounds();
                    z2 = true;
                    int i2 = bounds.left;
                    int i3 = bounds.top;
                    int i4 = bounds.right;
                    int i5 = bounds.bottom;
                    Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
                    c0130a = c0130a2;
                    b2.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                    b2.draw(new Canvas(createBitmap));
                    b2.setBounds(i2, i3, i4, i5);
                    parcelable = createBitmap;
                }
            }
            if (parcelable != null) {
                intent.putExtra("android.support.customtabs.extra.CLOSE_BUTTON_ICON", parcelable);
            }
        } else {
            c0130a = c0130a2;
            z2 = true;
        }
        Integer num3 = (Integer) p2.f699g;
        if (num3 != null) {
            int intValue3 = num3.intValue();
            if (intValue3 < 0 || intValue3 > 2) {
                throw new IllegalArgumentException("Invalid value for the position argument");
            }
            intent.putExtra("androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION", intValue3);
        }
        C0032n c0032n2 = c0132b.f1943j;
        String str3 = (String) c0032n2.f409a;
        c0130a.getClass();
        int a3 = C0130a.a(context, "anim", str3);
        int a4 = C0130a.a(context, "anim", (String) c0032n2.f410b);
        if (a3 != 0 && a4 != 0) {
            c0197e.f2766c = ActivityOptions.makeCustomAnimation(context, a3, a4);
        }
        int a5 = C0130a.a(context, "anim", (String) c0032n2.f411c);
        int a6 = C0130a.a(context, "anim", (String) c0032n2.f412d);
        if (a5 != 0 && a6 != 0) {
            intent.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", ActivityOptions.makeCustomAnimation(context, a5, a6).toBundle());
        }
        C0133c c0133c = c0132b.f1945l;
        Double d2 = c0133c.f1946a;
        if (d2 != null) {
            double doubleValue = d2.doubleValue();
            c0130a.getClass();
            int i6 = (int) ((doubleValue * context.getResources().getDisplayMetrics().density) + 0.5d);
            Integer num4 = c0133c.f1947b;
            if (num4 == null) {
                c0197e.b(i6, 0);
            } else {
                c0197e.b(i6, num4.intValue());
            }
        }
        Double d3 = c0133c.f1948c;
        if (d3 != null) {
            double doubleValue2 = d3.doubleValue();
            c0130a.getClass();
            int i7 = (int) ((doubleValue2 * context.getResources().getDisplayMetrics().density) + 0.5d);
            if (i7 <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialWidthPx argument");
            }
            intent.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_WIDTH_PX", i7);
        }
        Double d4 = c0133c.f1949d;
        if (d4 != null) {
            int doubleValue3 = (int) d4.doubleValue();
            if (doubleValue3 <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialWidthPx argument");
            }
            intent.putExtra("androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_BREAKPOINT_DP", doubleValue3);
        }
        Boolean bool5 = c0133c.f1950e;
        if (bool5 != null) {
            intent.putExtra("androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_ENABLE_MAXIMIZATION", bool5.booleanValue());
        }
        Integer num5 = c0133c.f1951f;
        if (num5 != null) {
            int intValue4 = num5.intValue();
            if (intValue4 < 0 || intValue4 > 2) {
                throw new IllegalArgumentException("Invalid value for the sideSheetPosition argument");
            }
            intent.putExtra("androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_POSITION", intValue4);
        }
        Integer num6 = c0133c.f1952g;
        if (num6 != null) {
            int intValue5 = num6.intValue();
            if (intValue5 < 0 || intValue5 > 3) {
                throw new IllegalArgumentException("Invalid value for the decorationType argument");
            }
            intent.putExtra("androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_DECORATION_TYPE", intValue5);
        }
        Integer num7 = c0133c.f1953h;
        if (num7 != null) {
            int intValue6 = num7.intValue();
            if (intValue6 < 0 || intValue6 > 2) {
                throw new IllegalArgumentException("Invalid value for the roundedCornersPosition./ argument");
            }
            intent.putExtra("androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION", intValue6);
        }
        Integer num8 = c0133c.f1954i;
        if (num8 != null) {
            int intValue7 = num8.intValue();
            if (intValue7 < 0 || intValue7 > 16) {
                throw new IllegalArgumentException("Invalid value for the cornerRadiusDp argument");
            }
            intent.putExtra("androidx.browser.customtabs.extra.TOOLBAR_CORNER_RADIUS_DP", intValue7);
        }
        if (c0133c.f1955j != null) {
            intent.putExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", !r1.booleanValue());
        }
        if (intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            bundle = null;
        } else {
            Bundle bundle2 = new Bundle();
            bundle = null;
            bundle2.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle2);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", c0197e.f2770g);
        c0197e.f2765b.getClass();
        intent.putExtras(new Bundle());
        Bundle bundle3 = c0197e.f2768e;
        if (bundle3 != null) {
            intent.putExtras(bundle3);
        }
        if (c0197e.f2767d != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", c0197e.f2767d);
            intent.putExtras(bundle4);
        }
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", c0197e.f2769f);
        int i8 = Build.VERSION.SDK_INT;
        String a7 = AbstractC0195c.a();
        if (!TextUtils.isEmpty(a7)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", a7);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        if (i8 >= 34) {
            if (c0197e.f2766c == null) {
                c0197e.f2766c = AbstractC0194b.a();
            }
            AbstractC0196d.a(c0197e.f2766c, c0197e.f2771h);
        }
        ActivityOptions activityOptions = c0197e.f2766c;
        N.P p3 = new N.P(14, intent, activityOptions != null ? activityOptions.toBundle() : bundle);
        Map map = (Map) c0131a.f1933f;
        if (map != null) {
            intent.putExtra("com.android.browser.headers", k0.d(map));
        }
        if (intent.getPackage() != null) {
            return p3;
        }
        if (str != null) {
            intent.setPackage(str);
            return p3;
        }
        E a8 = c0131a.a(context);
        if (P0.h.a((Boolean) c0131a.f1931d, Boolean.TRUE)) {
            intent.setPackage(k0.t(context, false, a8));
            return p3;
        }
        intent.setPackage(k0.t(context, z2, a8));
        return p3;
    }

    public CharSequence y(EnumC0233e enumC0233e) {
        Activity activity = ((io.flutter.plugin.platform.e) this.f20f).f2462a;
        ClipboardManager clipboardManager = (ClipboardManager) activity.getSystemService("clipboard");
        CharSequence charSequence = null;
        if (clipboardManager.hasPrimaryClip()) {
            try {
                try {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null) {
                        if (enumC0233e != null) {
                            if (enumC0233e == EnumC0233e.f2992e) {
                            }
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
                                return null;
                            }
                            String scheme = uri.getScheme();
                            if (!scheme.equals("content")) {
                                Log.w("PlatformPlugin", "Clipboard item contains a Uri with scheme '" + scheme + "'that is unhandled.");
                                return null;
                            }
                            AssetFileDescriptor openTypedAssetFileDescriptor = activity.getContentResolver().openTypedAssetFileDescriptor(uri, "text/*", null);
                            CharSequence coerceToText = itemAt.coerceToText(activity);
                            if (openTypedAssetFileDescriptor == null) {
                                return coerceToText;
                            }
                            try {
                                openTypedAssetFileDescriptor.close();
                                return coerceToText;
                            } catch (IOException e2) {
                                charSequence = coerceToText;
                                e = e2;
                                Log.w("PlatformPlugin", "Failed to close AssetFileDescriptor while trying to read text from URI.", e);
                                return charSequence;
                            }
                        } catch (IOException e3) {
                            e = e3;
                            charSequence = text;
                        }
                    }
                } catch (IOException e4) {
                    e = e4;
                }
            } catch (FileNotFoundException unused) {
                Log.w("PlatformPlugin", "Clipboard text was unable to be received from content URI.");
                return charSequence;
            } catch (SecurityException e5) {
                Log.w("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e5);
                return charSequence;
            }
        }
        return null;
    }

    public l0 z() {
        Z0.p pVar = (Z0.p) this.f20f;
        pVar.getClass();
        Object obj = Z0.p.f1129i.get(pVar);
        if (obj == a1.l.f1161a) {
            obj = null;
        }
        return (l0) obj;
    }

    public /* synthetic */ E(int i2, boolean z2) {
        this.f19e = i2;
    }

    public E(Set set) {
        this.f19e = 15;
        P0.h.e(set, "packages");
        this.f20f = set;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Set set2 = c0.c.f1786a;
            if (c0.c.f1786a.contains(str)) {
                throw new IllegalArgumentException("Packages must not contain any Chrome packages.");
            }
        }
    }

    public E(int i2) {
        this.f19e = i2;
        switch (i2) {
            case H.k.LONG_FIELD_NUMBER /* 4 */:
                this.f20f = new Z0.p(m0.f408b);
                break;
            case H.k.BYTES_FIELD_NUMBER /* 8 */:
                this.f20f = new SparseIntArray();
                break;
            case 16:
                this.f20f = new C0130a();
                break;
            case 18:
                this.f20f = new LinkedHashMap();
                break;
            default:
                this.f20f = new AtomicInteger(0);
                break;
        }
    }

    public E(boolean z2) {
        this.f19e = 5;
        this.f20f = new AtomicBoolean(z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public E(O0.p pVar) {
        this.f19e = 12;
        this.f20f = (I0.g) pVar;
    }
}
