package k0;

import B0.C0008i;
import F.C0032n;
import N.C0056m;
import N.P;
import W0.AbstractC0061a;
import W0.AbstractC0081v;
import W0.C0079t;
import W0.J;
import W0.T;
import W0.e0;
import a.AbstractC0086a;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Insets;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.provider.Settings;
import android.text.Selection;
import android.text.format.DateFormat;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textservice.SpellCheckerInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.TextServicesManager;
import android.widget.FrameLayout;
import androidx.datastore.preferences.protobuf.k0;
import i.AbstractC0171s;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import o0.C0211b;
import v0.InterfaceC0241f;
import w0.C0248b;
import x0.InterfaceC0250a;

/* loaded from: classes.dex */
public final class o extends FrameLayout implements InterfaceC0250a, z {

    /* renamed from: A, reason: collision with root package name */
    public final D.a f2713A;

    /* renamed from: B, reason: collision with root package name */
    public final m f2714B;

    /* renamed from: C, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.a f2715C;

    /* renamed from: D, reason: collision with root package name */
    public W.i f2716D;

    /* renamed from: E, reason: collision with root package name */
    public int f2717E;

    /* renamed from: F, reason: collision with root package name */
    public int f2718F;
    public q G;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f2719e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2720f;

    /* renamed from: g, reason: collision with root package name */
    public final j f2721g;

    /* renamed from: h, reason: collision with root package name */
    public final l f2722h;

    /* renamed from: i, reason: collision with root package name */
    public C0191h f2723i;

    /* renamed from: j, reason: collision with root package name */
    public View f2724j;

    /* renamed from: k, reason: collision with root package name */
    public View f2725k;

    /* renamed from: l, reason: collision with root package name */
    public final HashSet f2726l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2727m;

    /* renamed from: n, reason: collision with root package name */
    public l0.c f2728n;

    /* renamed from: o, reason: collision with root package name */
    public final HashSet f2729o;

    /* renamed from: p, reason: collision with root package name */
    public P f2730p;

    /* renamed from: q, reason: collision with root package name */
    public io.flutter.plugin.editing.l f2731q;

    /* renamed from: r, reason: collision with root package name */
    public io.flutter.plugin.editing.h f2732r;

    /* renamed from: s, reason: collision with root package name */
    public C0248b f2733s;
    public C0008i t;

    /* renamed from: u, reason: collision with root package name */
    public C0184a f2734u;

    /* renamed from: v, reason: collision with root package name */
    public io.flutter.view.i f2735v;

    /* renamed from: w, reason: collision with root package name */
    public TextServicesManager f2736w;

    /* renamed from: x, reason: collision with root package name */
    public B0.E f2737x;

    /* renamed from: y, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.h f2738y;

    /* renamed from: z, reason: collision with root package name */
    public final B0.E f2739z;

    public o(AbstractActivityC0187d abstractActivityC0187d, j jVar) {
        super(abstractActivityC0187d, null);
        this.f2719e = new AtomicBoolean(true);
        this.f2720f = false;
        this.f2726l = new HashSet();
        this.f2729o = new HashSet();
        this.f2738y = new io.flutter.embedding.engine.renderer.h();
        this.f2739z = new B0.E(26, this);
        this.f2713A = new D.a(this, new Handler(Looper.getMainLooper()), 2);
        this.f2714B = new m(this);
        this.f2715C = new io.flutter.embedding.engine.renderer.a(2, this);
        this.G = new q();
        this.f2721g = jVar;
        this.f2724j = jVar;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v38, types: [android.view.View, io.flutter.embedding.engine.renderer.l] */
    public final void a() {
        Objects.toString(this.f2728n);
        if (c()) {
            Iterator it = this.f2729o.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            getContext().getContentResolver().unregisterContentObserver(this.f2713A);
            io.flutter.plugin.platform.l lVar = this.f2728n.f2793s;
            SparseArray sparseArray = lVar.f2490o;
            SparseArray sparseArray2 = lVar.f2491p;
            SparseArray sparseArray3 = lVar.f2493r;
            for (int i2 = 0; i2 < sparseArray3.size(); i2++) {
                lVar.f2482g.removeView((io.flutter.plugin.platform.g) sparseArray3.valueAt(i2));
            }
            for (int i3 = 0; i3 < sparseArray2.size(); i3++) {
                if (sparseArray2.valueAt(i3) != null) {
                    throw new ClassCastException();
                }
                lVar.f2482g.removeView(null);
            }
            lVar.c();
            SparseArray sparseArray4 = lVar.f2492q;
            if (lVar.f2482g == null) {
                Log.e("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
            } else {
                for (int i4 = 0; i4 < sparseArray4.size(); i4++) {
                    lVar.f2482g.removeView((View) sparseArray4.valueAt(i4));
                }
                sparseArray4.clear();
            }
            lVar.f2482g = null;
            lVar.t = false;
            if (sparseArray.size() > 0) {
                sparseArray.valueAt(0).getClass();
                throw new ClassCastException();
            }
            io.flutter.plugin.platform.k kVar = this.f2728n.t;
            SparseArray sparseArray5 = kVar.f2473k;
            SparseArray sparseArray6 = kVar.f2474l;
            for (int i5 = 0; i5 < sparseArray6.size(); i5++) {
                if (sparseArray6.valueAt(i5) != null) {
                    throw new ClassCastException();
                }
                kVar.f2469g.removeView(null);
            }
            Surface surface = kVar.f2477o;
            if (surface != null) {
                surface.release();
                kVar.f2477o = null;
                kVar.f2478p = null;
            }
            kVar.f2469g = null;
            if (sparseArray5.size() > 0) {
                sparseArray5.valueAt(0).getClass();
                throw new ClassCastException();
            }
            this.f2728n.f2793s.g();
            this.f2728n.t.g();
            io.flutter.view.i iVar = this.f2735v;
            iVar.t = true;
            iVar.f2600e.g();
            iVar.f2613r = null;
            AccessibilityManager accessibilityManager = iVar.f2598c;
            accessibilityManager.removeAccessibilityStateChangeListener(iVar.f2615u);
            accessibilityManager.removeTouchExplorationStateChangeListener(iVar.f2616v);
            iVar.f2601f.unregisterContentObserver(iVar.f2617w);
            C0008i c0008i = iVar.f2597b;
            c0008i.f86h = null;
            ((FlutterJNI) c0008i.f85g).setAccessibilityDelegate(null);
            this.f2735v = null;
            this.f2731q.f2441b.restartInput(this);
            this.f2731q.b();
            int size = ((HashSet) this.t.f85g).size();
            if (size > 0) {
                Log.w("KeyboardManager", "A KeyboardManager was destroyed with " + size + " unhandled redispatch event(s).");
            }
            io.flutter.plugin.editing.h hVar = this.f2732r;
            if (hVar != null) {
                hVar.f2424a.f2915f = null;
                SpellCheckerSession spellCheckerSession = hVar.f2426c;
                if (spellCheckerSession != null) {
                    spellCheckerSession.close();
                }
            }
            P p2 = this.f2730p;
            if (p2 != null) {
                ((C0211b) p2.f699g).f2915f = null;
            }
            io.flutter.embedding.engine.renderer.i iVar2 = this.f2728n.f2776b;
            this.f2727m = false;
            iVar2.c(this.f2715C);
            FlutterJNI flutterJNI = iVar2.f2389a;
            if (this.f2720f) {
                flutterJNI.removeResizingFlutterUiListener(this.f2714B);
            }
            iVar2.e();
            flutterJNI.setSemanticsEnabled(false);
            View view = this.f2725k;
            if (view != null && this.f2724j == this.f2723i) {
                this.f2724j = view;
            }
            this.f2724j.a();
            C0191h c0191h = this.f2723i;
            if (c0191h != null) {
                c0191h.f2690e.close();
                removeView(this.f2723i);
                this.f2723i = null;
            }
            this.f2725k = null;
            this.f2728n = null;
        }
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        C0032n c0032n;
        C0032n c0032n2;
        CharSequence textValue;
        io.flutter.plugin.editing.l lVar = this.f2731q;
        if (Build.VERSION.SDK_INT < 26) {
            lVar.getClass();
            return;
        }
        u0.o oVar = lVar.f2445f;
        if (oVar == null || lVar.f2446g == null || (c0032n = oVar.f3047j) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            u0.o oVar2 = (u0.o) lVar.f2446g.get(sparseArray.keyAt(i2));
            if (oVar2 != null && (c0032n2 = oVar2.f3047j) != null) {
                String str = (String) c0032n2.f409a;
                textValue = AbstractC0171s.g(sparseArray.valueAt(i2)).getTextValue();
                String charSequence = textValue.toString();
                u0.q qVar = new u0.q(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                if (str.equals((String) c0032n.f409a)) {
                    lVar.f2447h.f(qVar);
                } else {
                    hashMap.put(str, qVar);
                }
            }
        }
        P p2 = lVar.f2443d;
        int i3 = lVar.f2444e.f757c;
        p2.getClass();
        hashMap.size();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            u0.q qVar2 = (u0.q) entry.getValue();
            hashMap2.put((String) entry.getKey(), P.x(qVar2.f3054a, qVar2.f3055b, qVar2.f3056c, -1, -1));
        }
        ((C0008i) p2.f698f).B("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i3), hashMap2), null);
    }

    public final void b() {
        j jVar = this.f2721g;
        if (jVar != null) {
            addView(jVar);
        } else {
            l lVar = this.f2722h;
            if (lVar != null) {
                addView(lVar);
            } else {
                addView(this.f2723i);
            }
        }
        this.f2720f = k0.v(getContext());
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.l] */
    public final boolean c() {
        l0.c cVar = this.f2728n;
        return cVar != null && cVar.f2776b == this.f2724j.getAttachedRenderer();
    }

    @Override // android.view.View
    public final boolean checkInputConnectionProxy(View view) {
        l0.c cVar = this.f2728n;
        if (cVar == null) {
            return super.checkInputConnectionProxy(view);
        }
        HashMap hashMap = cVar.f2793s.f2489n;
        if (view == null || !hashMap.containsKey(view.getContext())) {
            return false;
        }
        View view2 = (View) hashMap.get(view.getContext());
        if (view2 == view) {
            return true;
        }
        return view2.checkInputConnectionProxy(view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if (r1 != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        boolean z2;
        C0032n c0032n;
        HashMap hashMap;
        String str;
        List enabledSpellCheckerInfos;
        boolean z3;
        boolean isSpellCheckerEnabled;
        char c2 = (getResources().getConfiguration().uiMode & 48) == 32 ? (char) 2 : (char) 1;
        TextServicesManager textServicesManager = this.f2736w;
        if (textServicesManager != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                enabledSpellCheckerInfos = textServicesManager.getEnabledSpellCheckerInfos();
                Iterator it = enabledSpellCheckerInfos.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z3 = false;
                        break;
                    } else if (((SpellCheckerInfo) it.next()).getPackageName().equals("com.google.android.inputmethod.latin")) {
                        z3 = true;
                        break;
                    }
                }
                isSpellCheckerEnabled = this.f2736w.isSpellCheckerEnabled();
                if (isSpellCheckerEnabled) {
                }
            }
            z2 = true;
            u0.n nVar = this.f2728n.f2789o;
            nVar.getClass();
            c0032n = nVar.f3037b;
            hashMap = new HashMap();
            hashMap.put("textScaleFactor", Float.valueOf(getResources().getConfiguration().fontScale));
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            hashMap.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z2));
            hashMap.put("brieflyShowPassword", Boolean.valueOf(Settings.System.getInt(getContext().getContentResolver(), "show_password", 1) == 1));
            hashMap.put("alwaysUse24HourFormat", Boolean.valueOf(DateFormat.is24HourFormat(getContext())));
            if (c2 != 1) {
                str = "light";
            } else {
                if (c2 != 2) {
                    throw null;
                }
                str = "dark";
            }
            hashMap.put("platformBrightness", str);
            Objects.toString(hashMap.get("textScaleFactor"));
            Objects.toString(hashMap.get("alwaysUse24HourFormat"));
            Objects.toString(hashMap.get("platformBrightness"));
            if (Build.VERSION.SDK_INT >= 34 || displayMetrics == null) {
                c0032n.i(hashMap, null);
            }
            u0.m mVar = new u0.m(displayMetrics);
            C0008i c0008i = nVar.f3036a;
            ((ConcurrentLinkedQueue) c0008i.f84f).add(mVar);
            u0.m mVar2 = (u0.m) c0008i.f86h;
            c0008i.f86h = mVar;
            P p2 = mVar2 != null ? new P(c0008i, mVar2, 20, false) : null;
            hashMap.put("configurationId", Integer.valueOf(mVar.f3034a));
            c0032n.i(hashMap, p2);
            return;
        }
        z2 = false;
        u0.n nVar2 = this.f2728n.f2789o;
        nVar2.getClass();
        c0032n = nVar2.f3037b;
        hashMap = new HashMap();
        hashMap.put("textScaleFactor", Float.valueOf(getResources().getConfiguration().fontScale));
        DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
        hashMap.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z2));
        hashMap.put("brieflyShowPassword", Boolean.valueOf(Settings.System.getInt(getContext().getContentResolver(), "show_password", 1) == 1));
        hashMap.put("alwaysUse24HourFormat", Boolean.valueOf(DateFormat.is24HourFormat(getContext())));
        if (c2 != 1) {
        }
        hashMap.put("platformBrightness", str);
        Objects.toString(hashMap.get("textScaleFactor"));
        Objects.toString(hashMap.get("alwaysUse24HourFormat"));
        Objects.toString(hashMap.get("platformBrightness"));
        if (Build.VERSION.SDK_INT >= 34) {
        }
        c0032n.i(hashMap, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (c() && this.t.z(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    public final void e() {
        if (!c()) {
            Log.w("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        float f2 = getResources().getDisplayMetrics().density;
        io.flutter.embedding.engine.renderer.h hVar = this.f2738y;
        hVar.f2368a = f2;
        hVar.t = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        io.flutter.embedding.engine.renderer.i iVar = this.f2728n.f2776b;
        iVar.getClass();
        int i2 = hVar.f2369b;
        ArrayList arrayList = hVar.f2388v;
        ArrayList arrayList2 = hVar.f2387u;
        if (i2 == 0) {
            int i3 = hVar.f2371d;
            int i4 = hVar.f2372e;
            if (i3 <= 0 && i4 <= 0) {
                return;
            }
        } else {
            int i5 = hVar.f2370c;
            if (i5 == 0) {
                int i6 = hVar.f2373f;
                int i7 = hVar.f2374g;
                if (i6 <= 0 && i7 <= 0) {
                    return;
                }
            } else if (i2 <= 0 || i5 <= 0 || hVar.f2368a <= 0.0f) {
                return;
            }
        }
        arrayList2.size();
        arrayList.size();
        int size = arrayList.size() + arrayList2.size();
        int[] iArr = new int[size * 4];
        int[] iArr2 = new int[size];
        int[] iArr3 = new int[size];
        for (int i8 = 0; i8 < arrayList2.size(); i8++) {
            io.flutter.embedding.engine.renderer.b bVar = (io.flutter.embedding.engine.renderer.b) arrayList2.get(i8);
            int i9 = i8 * 4;
            Rect rect = bVar.f2355a;
            iArr[i9] = rect.left;
            iArr[i9 + 1] = rect.top;
            iArr[i9 + 2] = rect.right;
            iArr[i9 + 3] = rect.bottom;
            iArr2[i8] = H.j.a(bVar.f2356b);
            iArr3[i8] = H.j.a(bVar.f2357c);
        }
        int size2 = arrayList2.size() * 4;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            io.flutter.embedding.engine.renderer.b bVar2 = (io.flutter.embedding.engine.renderer.b) arrayList.get(i10);
            int i11 = (i10 * 4) + size2;
            Rect rect2 = bVar2.f2355a;
            iArr[i11] = rect2.left;
            iArr[i11 + 1] = rect2.top;
            iArr[i11 + 2] = rect2.right;
            iArr[i11 + 3] = rect2.bottom;
            iArr2[arrayList2.size() + i10] = H.j.a(bVar2.f2356b);
            iArr3[arrayList2.size() + i10] = H.j.a(bVar2.f2357c);
        }
        iVar.f2389a.setViewportMetrics(hVar.f2368a, hVar.f2369b, hVar.f2370c, hVar.f2375h, hVar.f2376i, hVar.f2377j, hVar.f2378k, hVar.f2379l, hVar.f2380m, hVar.f2381n, hVar.f2382o, hVar.f2383p, hVar.f2384q, hVar.f2385r, hVar.f2386s, hVar.t, iArr, iArr2, iArr3, hVar.f2371d, hVar.f2372e, hVar.f2373f, hVar.f2374g);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.i iVar = this.f2735v;
        if (iVar == null || !iVar.f2598c.isEnabled()) {
            return null;
        }
        return this.f2735v;
    }

    public l0.c getAttachedFlutterEngine() {
        return this.f2728n;
    }

    public InterfaceC0241f getBinaryMessenger() {
        return this.f2728n.f2777c;
    }

    public C0191h getCurrentImageSurface() {
        return this.f2723i;
    }

    public io.flutter.embedding.engine.renderer.h getViewportMetrics() {
        return this.f2738y;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x01b5, code lost:
    
        r1 = r18.getDisplayCutout();
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        char c2;
        double d2;
        int i2;
        int captionBar;
        List boundingRects;
        Window window;
        DisplayCutout displayCutout;
        List<Rect> boundingRects2;
        int systemBars;
        Insets insets;
        int i3;
        int i4;
        int i5;
        int i6;
        int ime;
        Insets insets2;
        int i7;
        int i8;
        int i9;
        int i10;
        int systemGestures;
        Insets insets3;
        int i11;
        int i12;
        int i13;
        int i14;
        DisplayCutout displayCutout2;
        Insets waterfallInsets;
        int i15;
        int safeInsetTop;
        int i16;
        int safeInsetRight;
        int i17;
        int safeInsetBottom;
        int i18;
        int safeInsetLeft;
        Insets systemGestureInsets;
        int i19;
        int i20;
        int i21;
        int i22;
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        int i23 = Build.VERSION.SDK_INT;
        io.flutter.embedding.engine.renderer.h hVar = this.f2738y;
        if (i23 == 29) {
            systemGestureInsets = windowInsets.getSystemGestureInsets();
            i19 = systemGestureInsets.top;
            hVar.f2383p = i19;
            i20 = systemGestureInsets.right;
            hVar.f2384q = i20;
            i21 = systemGestureInsets.bottom;
            hVar.f2385r = i21;
            i22 = systemGestureInsets.left;
            hVar.f2386s = i22;
        }
        boolean z2 = (getWindowSystemUiVisibility() & 4) == 0;
        boolean z3 = (getWindowSystemUiVisibility() & 2) == 0;
        if (i23 >= 30) {
            systemBars = WindowInsets.Type.systemBars();
            insets = windowInsets.getInsets(systemBars);
            i3 = insets.top;
            hVar.f2375h = i3;
            i4 = insets.right;
            hVar.f2376i = i4;
            i5 = insets.bottom;
            hVar.f2377j = i5;
            i6 = insets.left;
            hVar.f2378k = i6;
            ime = WindowInsets.Type.ime();
            insets2 = windowInsets.getInsets(ime);
            i7 = insets2.top;
            hVar.f2379l = i7;
            i8 = insets2.right;
            hVar.f2380m = i8;
            i9 = insets2.bottom;
            hVar.f2381n = i9;
            i10 = insets2.left;
            hVar.f2382o = i10;
            systemGestures = WindowInsets.Type.systemGestures();
            insets3 = windowInsets.getInsets(systemGestures);
            i11 = insets3.top;
            hVar.f2383p = i11;
            i12 = insets3.right;
            hVar.f2384q = i12;
            i13 = insets3.bottom;
            hVar.f2385r = i13;
            i14 = insets3.left;
            hVar.f2386s = i14;
            displayCutout2 = windowInsets.getDisplayCutout();
            if (displayCutout2 != null) {
                waterfallInsets = displayCutout2.getWaterfallInsets();
                int i24 = hVar.f2375h;
                i15 = waterfallInsets.top;
                int max = Math.max(i24, i15);
                safeInsetTop = displayCutout2.getSafeInsetTop();
                hVar.f2375h = Math.max(max, safeInsetTop);
                int i25 = hVar.f2376i;
                i16 = waterfallInsets.right;
                int max2 = Math.max(i25, i16);
                safeInsetRight = displayCutout2.getSafeInsetRight();
                hVar.f2376i = Math.max(max2, safeInsetRight);
                int i26 = hVar.f2377j;
                i17 = waterfallInsets.bottom;
                int max3 = Math.max(i26, i17);
                safeInsetBottom = displayCutout2.getSafeInsetBottom();
                hVar.f2377j = Math.max(max3, safeInsetBottom);
                int i27 = hVar.f2378k;
                i18 = waterfallInsets.left;
                int max4 = Math.max(i27, i18);
                safeInsetLeft = displayCutout2.getSafeInsetLeft();
                hVar.f2378k = Math.max(max4, safeInsetLeft);
            }
        } else {
            if (!z3) {
                Context context = getContext();
                if (context.getResources().getConfiguration().orientation == 2) {
                    int rotation = ((DisplayManager) context.getSystemService("display")).getDisplay(0).getRotation();
                    if (rotation == 1) {
                        c2 = 3;
                    } else if (rotation == 3) {
                        c2 = 2;
                    } else if (rotation == 0 || rotation == 2) {
                        c2 = 4;
                    }
                    hVar.f2375h = !z2 ? windowInsets.getSystemWindowInsetTop() : 0;
                    hVar.f2376i = (c2 != 3 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetRight();
                    if (z3) {
                        d2 = 0.18d;
                    } else {
                        d2 = 0.18d;
                        if ((((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom()) == 0) {
                            i2 = windowInsets.getSystemWindowInsetBottom();
                            hVar.f2377j = i2;
                            hVar.f2378k = (c2 != 2 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
                            hVar.f2379l = 0;
                            hVar.f2380m = 0;
                            hVar.f2381n = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * d2 ? 0 : windowInsets.getSystemWindowInsetBottom();
                            hVar.f2382o = 0;
                        }
                    }
                    i2 = 0;
                    hVar.f2377j = i2;
                    hVar.f2378k = (c2 != 2 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
                    hVar.f2379l = 0;
                    hVar.f2380m = 0;
                    hVar.f2381n = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * d2 ? 0 : windowInsets.getSystemWindowInsetBottom();
                    hVar.f2382o = 0;
                }
            }
            c2 = 1;
            hVar.f2375h = !z2 ? windowInsets.getSystemWindowInsetTop() : 0;
            hVar.f2376i = (c2 != 3 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetRight();
            if (z3) {
            }
            i2 = 0;
            hVar.f2377j = i2;
            hVar.f2378k = (c2 != 2 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
            hVar.f2379l = 0;
            hVar.f2380m = 0;
            hVar.f2381n = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * d2 ? 0 : windowInsets.getSystemWindowInsetBottom();
            hVar.f2382o = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (i23 >= 28 && displayCutout != null) {
            boundingRects2 = displayCutout.getBoundingRects();
            for (Rect rect : boundingRects2) {
                rect.toString();
                arrayList.add(new io.flutter.embedding.engine.renderer.b(rect, 4, 1));
            }
        }
        ArrayList arrayList2 = hVar.f2388v;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (Build.VERSION.SDK_INT >= 35) {
            q qVar = this.G;
            Context context2 = getContext();
            qVar.getClass();
            Activity q2 = AbstractC0086a.q(context2);
            WindowInsets windowInsets2 = null;
            if (q2 != null && (window = q2.getWindow()) != null) {
                windowInsets2 = window.getDecorView().getRootWindowInsets();
            }
            if (windowInsets2 == null) {
                boundingRects = Collections.EMPTY_LIST;
            } else {
                captionBar = WindowInsets.Type.captionBar();
                boundingRects = windowInsets2.getBoundingRects(captionBar);
            }
            int i28 = hVar.f2375h;
            Iterator it = boundingRects.iterator();
            while (it.hasNext()) {
                i28 = Math.max(i28, ((Rect) it.next()).bottom);
            }
            hVar.f2375h = i28;
        }
        e();
        return onApplyWindowInsets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [Z0.d] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        B0.E e2;
        super.onAttachedToWindow();
        try {
            W.g gVar = W.h.f892c;
            Context context = getContext();
            gVar.getClass();
            e2 = new B0.E(27, new P(W.g.a(context)));
        } catch (NoClassDefFoundError unused) {
            e2 = null;
        }
        this.f2737x = e2;
        Activity q2 = AbstractC0086a.q(getContext());
        B0.E e3 = this.f2737x;
        if (e3 == null || q2 == null) {
            return;
        }
        this.f2716D = new W.i(1, this);
        Context context2 = getContext();
        Executor a2 = Build.VERSION.SDK_INT >= 28 ? p.c.a(context2) : new u.b(new Handler(context2.getMainLooper()));
        W.i iVar = this.f2716D;
        P p2 = (P) e3.f20f;
        P0.h.e(a2, "executor");
        P0.h.e(iVar, "consumer");
        P p3 = (P) p2.f699g;
        W.b bVar = (W.b) p2.f698f;
        bVar.getClass();
        W.j jVar = new W.j(bVar, q2, null);
        G0.j jVar2 = G0.j.f500e;
        Z0.c cVar = new Z0.c(jVar, jVar2, -2, 1);
        d1.d dVar = W0.B.f905a;
        X0.c cVar2 = b1.p.f1773a;
        if (cVar2.m(C0079t.f974f) != null) {
            throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + cVar2).toString());
        }
        Z0.c cVar3 = cVar;
        if (!cVar2.equals(jVar2)) {
            cVar3 = a1.l.a(cVar, cVar2, 0, 0, 6);
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) p3.f699g;
        ReentrantLock reentrantLock = (ReentrantLock) p3.f698f;
        reentrantLock.lock();
        try {
            if (linkedHashMap.get(iVar) == null) {
                G0.i j2 = new J(a2);
                if (j2.m(C0079t.f974f) == null) {
                    j2 = j2.j(new T());
                }
                U.a aVar = new U.a(cVar3, iVar, null);
                G0.i a3 = AbstractC0081v.a(j2, jVar2, true);
                d1.d dVar2 = W0.B.f905a;
                if (a3 != dVar2 && a3.m(G0.e.f499e) == null) {
                    a3 = a3.j(dVar2);
                }
                AbstractC0061a e0Var = new e0(a3, true);
                e0Var.V(1, e0Var, aVar);
                linkedHashMap.put(iVar, e0Var);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f2728n != null) {
            this.f2733s.b(configuration);
            d();
            AbstractC0086a.e(getContext(), this.f2728n);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        if (r2.f3053c != false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b3  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i2;
        if (!c()) {
            return super.onCreateInputConnection(editorInfo);
        }
        io.flutter.plugin.editing.l lVar = this.f2731q;
        C0008i c0008i = this.t;
        C0056m c0056m = lVar.f2444e;
        int i3 = c0056m.f756b;
        if (i3 == 1) {
            lVar.f2449j = null;
            return null;
        }
        int i4 = 4;
        if (i3 == 4) {
            return null;
        }
        if (i3 == 3) {
            if (lVar.f2455p) {
                return lVar.f2449j;
            }
            lVar.f2450k.f(c0056m.f757c);
            throw null;
        }
        u0.o oVar = lVar.f2445f;
        u0.p pVar = oVar.f3044g;
        boolean z2 = oVar.f3038a;
        boolean z3 = oVar.f3039b;
        boolean z4 = oVar.f3040c;
        boolean z5 = oVar.f3041d;
        int i5 = oVar.f3043f;
        int i6 = pVar.f3051a;
        if (i6 != 2) {
            if (i6 == 5) {
                i4 = pVar.f3052b ? 4098 : 2;
            } else if (i6 == 6) {
                i4 = 3;
            } else if (i6 == 11) {
                i4 = 0;
            } else {
                int i7 = i6 == 7 ? 131073 : (i6 == 8 || i6 == 13) ? 33 : (i6 == 9 || i6 == 12) ? 17 : i6 == 10 ? 145 : i6 == 3 ? 97 : i6 == 4 ? 113 : 1;
                if (!z2) {
                    if (z3) {
                        i7 |= 32768;
                    }
                    i2 = z4 ? 524416 : 524432;
                    i4 = i7;
                    if (i5 != 1) {
                        i4 |= 4096;
                    } else {
                        if (i5 != 2) {
                            if (i5 == 3) {
                                i4 |= 16384;
                            }
                        }
                        i4 |= 8192;
                    }
                }
                i7 |= i2;
                i4 = i7;
                if (i5 != 1) {
                }
            }
        }
        editorInfo.inputType = i4;
        editorInfo.imeOptions = 33554432;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 26 && !z5) {
            editorInfo.imeOptions = 50331648;
        }
        int intValue = oVar.f3045h.intValue();
        u0.o oVar2 = lVar.f2445f;
        String str = oVar2.f3046i;
        if (str != null) {
            editorInfo.actionLabel = str;
            editorInfo.actionId = intValue;
        }
        editorInfo.imeOptions = intValue | editorInfo.imeOptions;
        if (oVar2.f3050m != null) {
            editorInfo.hintLocales = new LocaleList(lVar.f2445f.f3050m);
        }
        String[] strArr = lVar.f2445f.f3048k;
        if (strArr != null) {
            editorInfo.contentMimeTypes = strArr;
        }
        if (i8 >= 34) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
        }
        io.flutter.plugin.editing.c cVar = new io.flutter.plugin.editing.c(this, lVar.f2444e.f757c, lVar.f2443d, c0008i, lVar.f2447h, editorInfo);
        io.flutter.plugin.editing.f fVar = lVar.f2447h;
        fVar.getClass();
        editorInfo.initialSelStart = Selection.getSelectionStart(fVar);
        io.flutter.plugin.editing.f fVar2 = lVar.f2447h;
        fVar2.getClass();
        editorInfo.initialSelEnd = Selection.getSelectionEnd(fVar2);
        lVar.f2449j = cVar;
        return cVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        W.i iVar;
        B0.E e2 = this.f2737x;
        if (e2 != null && (iVar = this.f2716D) != null) {
            P p2 = (P) ((P) e2.f20f).f699g;
            LinkedHashMap linkedHashMap = (LinkedHashMap) p2.f699g;
            ReentrantLock reentrantLock = (ReentrantLock) p2.f698f;
            reentrantLock.lock();
            try {
                W0.P p3 = (W0.P) linkedHashMap.get(iVar);
                if (p3 != null) {
                    p3.b(null);
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        this.f2716D = null;
        this.f2737x = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (c()) {
            C0184a c0184a = this.f2734u;
            Context context = getContext();
            c0184a.getClass();
            boolean isFromSource = motionEvent.isFromSource(2);
            boolean z2 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
            if (isFromSource && z2) {
                int b2 = C0184a.b(motionEvent.getActionMasked());
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
                allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                c0184a.a(motionEvent, motionEvent.getActionIndex(), b2, 0, C0184a.f2663f, allocateDirect, context);
                if (allocateDirect.position() % 288 != 0) {
                    throw new AssertionError("Packet position is not on field boundary.");
                }
                c0184a.f2664a.f2389a.dispatchPointerDataPacket(allocateDirect, allocateDirect.position());
                return true;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        return !c() ? super.onHoverEvent(motionEvent) : this.f2735v.e(motionEvent, false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        this.f2717E = View.MeasureSpec.getMode(i2);
        this.f2718F = View.MeasureSpec.getMode(i3);
        super.onMeasure(i2, i3);
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i2) {
        Rect rect;
        super.onProvideAutofillVirtualStructure(viewStructure, i2);
        io.flutter.plugin.editing.l lVar = this.f2731q;
        if (Build.VERSION.SDK_INT < 26) {
            lVar.getClass();
            return;
        }
        if (lVar.f2446g != null) {
            String str = (String) lVar.f2445f.f3047j.f409a;
            AutofillId autofillId = viewStructure.getAutofillId();
            for (int i3 = 0; i3 < lVar.f2446g.size(); i3++) {
                int keyAt = lVar.f2446g.keyAt(i3);
                C0032n c0032n = ((u0.o) lVar.f2446g.valueAt(i3)).f3047j;
                if (c0032n != null) {
                    viewStructure.addChildCount(1);
                    ViewStructure newChild = viewStructure.newChild(i3);
                    newChild.setAutofillId(autofillId, keyAt);
                    String[] strArr = (String[]) c0032n.f410b;
                    if (strArr.length > 0) {
                        newChild.setAutofillHints(strArr);
                    }
                    newChild.setAutofillType(1);
                    newChild.setVisibility(0);
                    String str2 = (String) c0032n.f412d;
                    if (str2 != null) {
                        newChild.setHint(str2);
                    }
                    if (str.hashCode() != keyAt || (rect = lVar.f2452m) == null) {
                        newChild.setDimens(0, 0, 0, 0, 1, 1);
                        newChild.setAutofillValue(AutofillValue.forText(((u0.q) c0032n.f411c).f3054a));
                    } else {
                        newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), lVar.f2452m.height());
                        newChild.setAutofillValue(AutofillValue.forText(lVar.f2447h));
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        io.flutter.embedding.engine.renderer.h hVar = this.f2738y;
        hVar.f2369b = i2;
        hVar.f2370c = i3;
        boolean z2 = this.f2720f;
        if (z2 && this.f2718F == 0) {
            hVar.f2373f = 0;
            hVar.f2374g = 8192;
        } else {
            hVar.f2373f = i3;
            hVar.f2374g = i3;
        }
        if (z2 && this.f2717E == 0) {
            hVar.f2371d = 0;
            hVar.f2372e = 8192;
        } else {
            hVar.f2371d = i2;
            hVar.f2372e = i2;
        }
        if (this.f2719e.compareAndSet(false, true)) {
            return;
        }
        e();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ByteBuffer byteBuffer;
        if (!c()) {
            return super.onTouchEvent(motionEvent);
        }
        requestUnbufferedDispatch(motionEvent);
        C0184a c0184a = this.f2734u;
        Matrix matrix = C0184a.f2663f;
        c0184a.getClass();
        int actionMasked = motionEvent.getActionMasked();
        int b2 = C0184a.b(motionEvent.getActionMasked());
        char c2 = 5;
        boolean z2 = actionMasked == 0 || actionMasked == 5;
        boolean z3 = !z2 && (actionMasked == 1 || actionMasked == 6);
        int toolType = motionEvent.getToolType(motionEvent.getActionIndex());
        if (toolType == 1) {
            c2 = 0;
        } else if (toolType == 2) {
            c2 = 2;
        } else if (toolType == 3) {
            c2 = 1;
        } else if (toolType == 4) {
            c2 = 3;
        }
        int i2 = (z3 && c2 == 0) ? 1 : 0;
        int pointerCount = motionEvent.getPointerCount();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((pointerCount + i2) * 288);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        if (z2) {
            byteBuffer = allocateDirect;
            c0184a.a(motionEvent, motionEvent.getActionIndex(), b2, 0, matrix, byteBuffer, null);
        } else {
            byteBuffer = allocateDirect;
            if (z3) {
                for (int i3 = 0; i3 < pointerCount; i3++) {
                    if (i3 != motionEvent.getActionIndex() && motionEvent.getToolType(i3) == 1) {
                        c0184a.a(motionEvent, i3, 5, 1, matrix, byteBuffer, null);
                    }
                }
                c0184a.a(motionEvent, motionEvent.getActionIndex(), b2, 0, matrix, byteBuffer, null);
                if (i2 != 0) {
                    c0184a.a(motionEvent, motionEvent.getActionIndex(), 2, 0, matrix, byteBuffer, null);
                }
            } else {
                for (int i4 = 0; i4 < pointerCount; i4++) {
                    c0184a.a(motionEvent, i4, b2, (pointerCount << 8) | 2, matrix, byteBuffer, null);
                }
            }
        }
        if (byteBuffer.position() % 288 != 0) {
            throw new AssertionError("Packet position is not on field boundary");
        }
        c0184a.f2664a.f2389a.dispatchPointerDataPacket(byteBuffer, byteBuffer.position());
        return true;
    }

    public void setDelegate(q qVar) {
        this.G = qVar;
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        View view = this.f2724j;
        if (view instanceof j) {
            ((j) view).setVisibility(i2);
        }
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.List] */
    public void setWindowInfoListenerDisplayFeatures(W.k kVar) {
        W.b bVar = W.b.f873h;
        ?? r9 = kVar.f899a;
        ArrayList arrayList = new ArrayList();
        for (W.c cVar : r9) {
            cVar.f880a.a().toString();
            T.b bVar2 = cVar.f880a;
            int i2 = 2;
            int i3 = ((bVar2.f833c - bVar2.f831a == 0 || bVar2.f834d - bVar2.f832b == 0) ? W.b.f872g : bVar) == bVar ? 3 : 2;
            W.b bVar3 = cVar.f882c;
            if (bVar3 != W.b.f874i) {
                i2 = bVar3 == W.b.f875j ? 3 : 1;
            }
            arrayList.add(new io.flutter.embedding.engine.renderer.b(bVar2.a(), i3, i2));
        }
        ArrayList arrayList2 = this.f2738y.f2387u;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        e();
    }

    public o(AbstractActivityC0187d abstractActivityC0187d, l lVar) {
        super(abstractActivityC0187d, null);
        this.f2719e = new AtomicBoolean(true);
        this.f2720f = false;
        this.f2726l = new HashSet();
        this.f2729o = new HashSet();
        this.f2738y = new io.flutter.embedding.engine.renderer.h();
        this.f2739z = new B0.E(26, this);
        this.f2713A = new D.a(this, new Handler(Looper.getMainLooper()), 2);
        this.f2714B = new m(this);
        this.f2715C = new io.flutter.embedding.engine.renderer.a(2, this);
        this.G = new q();
        this.f2722h = lVar;
        this.f2724j = lVar;
        b();
    }
}
