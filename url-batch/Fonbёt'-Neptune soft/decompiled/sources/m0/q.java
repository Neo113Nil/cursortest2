package m0;

import A.C0010k;
import B0.C0031i;
import I.C0079n;
import P.O;
import Y0.AbstractC0107a;
import Y0.AbstractC0127v;
import Y0.C0125t;
import Y0.J;
import Y0.P;
import Y0.T;
import Y0.e0;
import a.AbstractC0132a;
import a0.C0134b;
import a0.C0135c;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Insets;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
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
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.TextServicesManager;
import android.widget.FrameLayout;
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
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Stream;
import r0.C0289a;
import w.ExecutorC0314a;
import w0.InterfaceC0320f;
import x0.C0332a;
import y0.InterfaceC0334a;

/* loaded from: classes.dex */
public final class q extends FrameLayout implements InterfaceC0334a, InterfaceC0260A {

    /* renamed from: A, reason: collision with root package name */
    public a0.i f3181A;

    /* renamed from: B, reason: collision with root package name */
    public s f3182B;

    /* renamed from: e, reason: collision with root package name */
    public final l f3183e;

    /* renamed from: f, reason: collision with root package name */
    public final n f3184f;

    /* renamed from: g, reason: collision with root package name */
    public j f3185g;

    /* renamed from: h, reason: collision with root package name */
    public View f3186h;

    /* renamed from: i, reason: collision with root package name */
    public View f3187i;

    /* renamed from: j, reason: collision with root package name */
    public final HashSet f3188j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3189k;

    /* renamed from: l, reason: collision with root package name */
    public n0.c f3190l;

    /* renamed from: m, reason: collision with root package name */
    public final HashSet f3191m;

    /* renamed from: n, reason: collision with root package name */
    public O f3192n;

    /* renamed from: o, reason: collision with root package name */
    public io.flutter.plugin.editing.j f3193o;

    /* renamed from: p, reason: collision with root package name */
    public io.flutter.plugin.editing.g f3194p;

    /* renamed from: q, reason: collision with root package name */
    public C0332a f3195q;

    /* renamed from: r, reason: collision with root package name */
    public C0031i f3196r;

    /* renamed from: s, reason: collision with root package name */
    public C0261a f3197s;

    /* renamed from: t, reason: collision with root package name */
    public io.flutter.view.k f3198t;

    /* renamed from: u, reason: collision with root package name */
    public TextServicesManager f3199u;
    public B.m v;

    /* renamed from: w, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.k f3200w;

    /* renamed from: x, reason: collision with root package name */
    public final B.m f3201x;

    /* renamed from: y, reason: collision with root package name */
    public final G.a f3202y;

    /* renamed from: z, reason: collision with root package name */
    public final C0265e f3203z;

    public q(AbstractActivityC0264d abstractActivityC0264d, l lVar) {
        super(abstractActivityC0264d, null);
        this.f3188j = new HashSet();
        this.f3191m = new HashSet();
        this.f3200w = new io.flutter.embedding.engine.renderer.k();
        this.f3201x = new B.m(28, this);
        this.f3202y = new G.a(this, new Handler(Looper.getMainLooper()), 2);
        this.f3203z = new C0265e(2, this);
        this.f3182B = new s();
        this.f3183e = lVar;
        this.f3186h = lVar;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [android.view.View, io.flutter.embedding.engine.renderer.n] */
    public final void a() {
        SparseArray sparseArray;
        Objects.toString(this.f3190l);
        if (c()) {
            Iterator it = this.f3191m.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            getContext().getContentResolver().unregisterContentObserver(this.f3202y);
            io.flutter.plugin.platform.o oVar = this.f3190l.f3280r;
            int i2 = 0;
            while (true) {
                SparseArray sparseArray2 = oVar.f2668n;
                if (i2 >= sparseArray2.size()) {
                    break;
                }
                oVar.f2658d.removeView((io.flutter.plugin.platform.j) sparseArray2.valueAt(i2));
                i2++;
            }
            int i3 = 0;
            while (true) {
                SparseArray sparseArray3 = oVar.f2666l;
                if (i3 >= sparseArray3.size()) {
                    break;
                }
                oVar.f2658d.removeView((C0289a) sparseArray3.valueAt(i3));
                i3++;
            }
            oVar.c();
            if (oVar.f2658d == null) {
                Log.e("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
            } else {
                int i4 = 0;
                while (true) {
                    sparseArray = oVar.f2667m;
                    if (i4 >= sparseArray.size()) {
                        break;
                    }
                    oVar.f2658d.removeView((View) sparseArray.valueAt(i4));
                    i4++;
                }
                sparseArray.clear();
            }
            oVar.f2658d = null;
            oVar.f2670p = false;
            int i5 = 0;
            while (true) {
                SparseArray sparseArray4 = oVar.f2665k;
                if (i5 >= sparseArray4.size()) {
                    break;
                }
                ((io.flutter.plugin.platform.g) sparseArray4.valueAt(i5)).getClass();
                i5++;
            }
            this.f3190l.f3280r.f2662h.f2622a = null;
            io.flutter.view.k kVar = this.f3198t;
            kVar.f2809u = true;
            kVar.f2793e.f2662h.f2622a = null;
            kVar.f2807s = null;
            AccessibilityManager accessibilityManager = kVar.f2791c;
            accessibilityManager.removeAccessibilityStateChangeListener(kVar.f2810w);
            accessibilityManager.removeTouchExplorationStateChangeListener(kVar.f2811x);
            kVar.f2794f.unregisterContentObserver(kVar.f2812y);
            C0031i c0031i = kVar.f2790b;
            c0031i.f156h = null;
            ((FlutterJNI) c0031i.f155g).setAccessibilityDelegate(null);
            this.f3198t = null;
            this.f3193o.f2597b.restartInput(this);
            this.f3193o.c();
            int size = ((HashSet) this.f3196r.f155g).size();
            if (size > 0) {
                Log.w("KeyboardManager", "A KeyboardManager was destroyed with " + String.valueOf(size) + " unhandled redispatch event(s).");
            }
            io.flutter.plugin.editing.g gVar = this.f3194p;
            if (gVar != null) {
                gVar.f2581a.f3284f = null;
                SpellCheckerSession spellCheckerSession = gVar.f2583c;
                if (spellCheckerSession != null) {
                    spellCheckerSession.close();
                }
            }
            O o2 = this.f3192n;
            if (o2 != null) {
                ((n0.d) o2.f876g).f3284f = null;
            }
            io.flutter.embedding.engine.renderer.l lVar = this.f3190l.f3264b;
            this.f3189k = false;
            lVar.f2537a.removeIsDisplayingFlutterUiListener(this.f3203z);
            lVar.g();
            lVar.f2537a.setSemanticsEnabled(false);
            View view = this.f3187i;
            if (view != null && this.f3186h == this.f3185g) {
                this.f3186h = view;
            }
            this.f3186h.c();
            j jVar = this.f3185g;
            if (jVar != null) {
                jVar.f3162e.close();
                removeView(this.f3185g);
                this.f3185g = null;
            }
            this.f3187i = null;
            this.f3190l = null;
        }
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        C0079n c0079n;
        C0079n c0079n2;
        CharSequence textValue;
        io.flutter.plugin.editing.j jVar = this.f3193o;
        if (Build.VERSION.SDK_INT < 26) {
            jVar.getClass();
            return;
        }
        v0.m mVar = jVar.f2601f;
        if (mVar == null || jVar.f2602g == null || (c0079n = mVar.f3537j) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            v0.m mVar2 = (v0.m) jVar.f2602g.get(sparseArray.keyAt(i2));
            if (mVar2 != null && (c0079n2 = mVar2.f3537j) != null) {
                textValue = B.f.i(sparseArray.valueAt(i2)).getTextValue();
                String charSequence = textValue.toString();
                v0.o oVar = new v0.o(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                String str = (String) c0079n2.f689e;
                if (str.equals((String) c0079n.f689e)) {
                    jVar.f2603h.f(oVar);
                } else {
                    hashMap.put(str, oVar);
                }
            }
        }
        int i3 = jVar.f2600e.f49c;
        O o2 = jVar.f2599d;
        o2.getClass();
        String.valueOf(hashMap.size());
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            v0.o oVar2 = (v0.o) entry.getValue();
            hashMap2.put((String) entry.getKey(), O.l(oVar2.f3543a, oVar2.f3544b, oVar2.f3545c, -1, -1));
        }
        ((C0079n) o2.f875f).f("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i3), hashMap2), null);
    }

    public final void b() {
        l lVar = this.f3183e;
        if (lVar != null) {
            addView(lVar);
        } else {
            n nVar = this.f3184f;
            if (nVar != null) {
                addView(nVar);
            } else {
                addView(this.f3185g);
            }
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.n] */
    public final boolean c() {
        n0.c cVar = this.f3190l;
        if (cVar != null) {
            if (cVar.f3264b == this.f3186h.getAttachedRenderer()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean checkInputConnectionProxy(View view) {
        n0.c cVar = this.f3190l;
        if (cVar == null) {
            return super.checkInputConnectionProxy(view);
        }
        io.flutter.plugin.platform.o oVar = cVar.f3280r;
        if (view == null) {
            oVar.getClass();
            return false;
        }
        HashMap hashMap = oVar.f2664j;
        if (!hashMap.containsKey(view.getContext())) {
            return false;
        }
        View view2 = (View) hashMap.get(view.getContext());
        if (view2 == view) {
            return true;
        }
        return view2.checkInputConnectionProxy(view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        if (r1 != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        boolean z2;
        C0079n c0079n;
        HashMap hashMap;
        String str;
        List enabledSpellCheckerInfos;
        Stream stream;
        boolean anyMatch;
        boolean isSpellCheckerEnabled;
        char c2 = (getResources().getConfiguration().uiMode & 48) == 32 ? (char) 2 : (char) 1;
        TextServicesManager textServicesManager = this.f3199u;
        if (textServicesManager != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                enabledSpellCheckerInfos = textServicesManager.getEnabledSpellCheckerInfos();
                stream = enabledSpellCheckerInfos.stream();
                anyMatch = stream.anyMatch(new o());
                isSpellCheckerEnabled = this.f3199u.isSpellCheckerEnabled();
                if (isSpellCheckerEnabled) {
                }
            }
            z2 = true;
            c0079n = this.f3190l.f3276n.f3527a;
            hashMap = new HashMap();
            hashMap.put("textScaleFactor", Float.valueOf(getResources().getConfiguration().fontScale));
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            hashMap.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z2));
            hashMap.put("brieflyShowPassword", Boolean.valueOf(Settings.System.getInt(getContext().getContentResolver(), "show_password", 1) != 1));
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
            if ((Build.VERSION.SDK_INT >= 34) || displayMetrics == null) {
                c0079n.h(hashMap, null);
            }
            v0.k kVar = new v0.k(displayMetrics);
            C0031i c0031i = v0.l.f3526b;
            ((ConcurrentLinkedQueue) c0031i.f154f).add(kVar);
            v0.k kVar2 = (v0.k) c0031i.f156h;
            c0031i.f156h = kVar;
            O o2 = kVar2 != null ? new O(c0031i, kVar2, 19, false) : null;
            hashMap.put("configurationId", Integer.valueOf(kVar.f3524a));
            c0079n.h(hashMap, o2);
            return;
        }
        z2 = false;
        c0079n = this.f3190l.f3276n.f3527a;
        hashMap = new HashMap();
        hashMap.put("textScaleFactor", Float.valueOf(getResources().getConfiguration().fontScale));
        DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
        hashMap.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z2));
        hashMap.put("brieflyShowPassword", Boolean.valueOf(Settings.System.getInt(getContext().getContentResolver(), "show_password", 1) != 1));
        hashMap.put("alwaysUse24HourFormat", Boolean.valueOf(DateFormat.is24HourFormat(getContext())));
        if (c2 != 1) {
        }
        hashMap.put("platformBrightness", str);
        Objects.toString(hashMap.get("textScaleFactor"));
        Objects.toString(hashMap.get("alwaysUse24HourFormat"));
        Objects.toString(hashMap.get("platformBrightness"));
        if (Build.VERSION.SDK_INT >= 34) {
        }
        c0079n.h(hashMap, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (c() && this.f3196r.F(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    public final void e() {
        if (!c()) {
            Log.w("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        float f2 = getResources().getDisplayMetrics().density;
        io.flutter.embedding.engine.renderer.k kVar = this.f3200w;
        kVar.f2519a = f2;
        kVar.f2534p = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        io.flutter.embedding.engine.renderer.l lVar = this.f3190l.f3264b;
        lVar.getClass();
        if (kVar.f2520b <= 0 || kVar.f2521c <= 0 || kVar.f2519a <= 0.0f) {
            return;
        }
        ArrayList arrayList = kVar.f2535q;
        arrayList.size();
        ArrayList arrayList2 = kVar.f2536r;
        arrayList2.size();
        int size = arrayList2.size() + arrayList.size();
        int[] iArr = new int[size * 4];
        int[] iArr2 = new int[size];
        int[] iArr3 = new int[size];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            io.flutter.embedding.engine.renderer.c cVar = (io.flutter.embedding.engine.renderer.c) arrayList.get(i2);
            int i3 = i2 * 4;
            Rect rect = cVar.f2499a;
            iArr[i3] = rect.left;
            iArr[i3 + 1] = rect.top;
            iArr[i3 + 2] = rect.right;
            iArr[i3 + 3] = rect.bottom;
            iArr2[i2] = K.j.b(cVar.f2500b);
            iArr3[i2] = K.j.b(cVar.f2501c);
        }
        int size2 = arrayList.size() * 4;
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            io.flutter.embedding.engine.renderer.c cVar2 = (io.flutter.embedding.engine.renderer.c) arrayList2.get(i4);
            int i5 = (i4 * 4) + size2;
            Rect rect2 = cVar2.f2499a;
            iArr[i5] = rect2.left;
            iArr[i5 + 1] = rect2.top;
            iArr[i5 + 2] = rect2.right;
            iArr[i5 + 3] = rect2.bottom;
            iArr2[arrayList.size() + i4] = K.j.b(cVar2.f2500b);
            iArr3[arrayList.size() + i4] = K.j.b(cVar2.f2501c);
        }
        lVar.f2537a.setViewportMetrics(kVar.f2519a, kVar.f2520b, kVar.f2521c, kVar.f2522d, kVar.f2523e, kVar.f2524f, kVar.f2525g, kVar.f2526h, kVar.f2527i, kVar.f2528j, kVar.f2529k, kVar.f2530l, kVar.f2531m, kVar.f2532n, kVar.f2533o, kVar.f2534p, iArr, iArr2, iArr3);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.k kVar = this.f3198t;
        if (kVar == null || !kVar.f2791c.isEnabled()) {
            return null;
        }
        return this.f3198t;
    }

    public n0.c getAttachedFlutterEngine() {
        return this.f3190l;
    }

    public InterfaceC0320f getBinaryMessenger() {
        return this.f3190l.f3265c;
    }

    public j getCurrentImageSurface() {
        return this.f3185g;
    }

    public io.flutter.embedding.engine.renderer.k getViewportMetrics() {
        return this.f3200w;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x01b7, code lost:
    
        r1 = r16.getDisplayCutout();
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0146 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0141  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        char c2;
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
        io.flutter.embedding.engine.renderer.k kVar = this.f3200w;
        if (i23 == 29) {
            systemGestureInsets = windowInsets.getSystemGestureInsets();
            i19 = systemGestureInsets.top;
            kVar.f2530l = i19;
            i20 = systemGestureInsets.right;
            kVar.f2531m = i20;
            i21 = systemGestureInsets.bottom;
            kVar.f2532n = i21;
            i22 = systemGestureInsets.left;
            kVar.f2533o = i22;
        }
        boolean z2 = (getWindowSystemUiVisibility() & 4) == 0;
        boolean z3 = (getWindowSystemUiVisibility() & 2) == 0;
        if (i23 >= 30) {
            systemBars = WindowInsets.Type.systemBars();
            insets = windowInsets.getInsets(systemBars);
            i3 = insets.top;
            kVar.f2522d = i3;
            i4 = insets.right;
            kVar.f2523e = i4;
            i5 = insets.bottom;
            kVar.f2524f = i5;
            i6 = insets.left;
            kVar.f2525g = i6;
            ime = WindowInsets.Type.ime();
            insets2 = windowInsets.getInsets(ime);
            i7 = insets2.top;
            kVar.f2526h = i7;
            i8 = insets2.right;
            kVar.f2527i = i8;
            i9 = insets2.bottom;
            kVar.f2528j = i9;
            i10 = insets2.left;
            kVar.f2529k = i10;
            systemGestures = WindowInsets.Type.systemGestures();
            insets3 = windowInsets.getInsets(systemGestures);
            i11 = insets3.top;
            kVar.f2530l = i11;
            i12 = insets3.right;
            kVar.f2531m = i12;
            i13 = insets3.bottom;
            kVar.f2532n = i13;
            i14 = insets3.left;
            kVar.f2533o = i14;
            displayCutout2 = windowInsets.getDisplayCutout();
            if (displayCutout2 != null) {
                waterfallInsets = displayCutout2.getWaterfallInsets();
                int i24 = kVar.f2522d;
                i15 = waterfallInsets.top;
                int max = Math.max(i24, i15);
                safeInsetTop = displayCutout2.getSafeInsetTop();
                kVar.f2522d = Math.max(max, safeInsetTop);
                int i25 = kVar.f2523e;
                i16 = waterfallInsets.right;
                int max2 = Math.max(i25, i16);
                safeInsetRight = displayCutout2.getSafeInsetRight();
                kVar.f2523e = Math.max(max2, safeInsetRight);
                int i26 = kVar.f2524f;
                i17 = waterfallInsets.bottom;
                int max3 = Math.max(i26, i17);
                safeInsetBottom = displayCutout2.getSafeInsetBottom();
                kVar.f2524f = Math.max(max3, safeInsetBottom);
                int i27 = kVar.f2525g;
                i18 = waterfallInsets.left;
                int max4 = Math.max(i27, i18);
                safeInsetLeft = displayCutout2.getSafeInsetLeft();
                kVar.f2525g = Math.max(max4, safeInsetLeft);
            }
        } else {
            if (!z3) {
                Context context = getContext();
                if (context.getResources().getConfiguration().orientation == 2) {
                    int rotation = ((DisplayManager) context.getSystemService("display")).getDisplay(0).getRotation();
                    if (rotation != 1) {
                        if (rotation == 3) {
                            if (i23 >= 23) {
                                c2 = 2;
                            }
                        } else if (rotation == 0 || rotation == 2) {
                            c2 = 4;
                        }
                        kVar.f2522d = z2 ? windowInsets.getSystemWindowInsetTop() : 0;
                        kVar.f2523e = (c2 != 3 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetRight();
                        if (z3) {
                            if ((((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom()) == 0) {
                                i2 = windowInsets.getSystemWindowInsetBottom();
                                kVar.f2524f = i2;
                                kVar.f2525g = (c2 != 2 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
                                kVar.f2526h = 0;
                                kVar.f2527i = 0;
                                kVar.f2528j = ((double) windowInsets.getSystemWindowInsetBottom()) >= ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom();
                                kVar.f2529k = 0;
                            }
                        }
                        i2 = 0;
                        kVar.f2524f = i2;
                        kVar.f2525g = (c2 != 2 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
                        kVar.f2526h = 0;
                        kVar.f2527i = 0;
                        kVar.f2528j = ((double) windowInsets.getSystemWindowInsetBottom()) >= ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom();
                        kVar.f2529k = 0;
                    }
                    c2 = 3;
                    kVar.f2522d = z2 ? windowInsets.getSystemWindowInsetTop() : 0;
                    kVar.f2523e = (c2 != 3 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetRight();
                    if (z3) {
                    }
                    i2 = 0;
                    kVar.f2524f = i2;
                    kVar.f2525g = (c2 != 2 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
                    kVar.f2526h = 0;
                    kVar.f2527i = 0;
                    kVar.f2528j = ((double) windowInsets.getSystemWindowInsetBottom()) >= ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom();
                    kVar.f2529k = 0;
                }
            }
            c2 = 1;
            kVar.f2522d = z2 ? windowInsets.getSystemWindowInsetTop() : 0;
            kVar.f2523e = (c2 != 3 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetRight();
            if (z3) {
            }
            i2 = 0;
            kVar.f2524f = i2;
            kVar.f2525g = (c2 != 2 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
            kVar.f2526h = 0;
            kVar.f2527i = 0;
            kVar.f2528j = ((double) windowInsets.getSystemWindowInsetBottom()) >= ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom();
            kVar.f2529k = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (i23 >= 28 && displayCutout != null) {
            boundingRects2 = displayCutout.getBoundingRects();
            for (Rect rect : boundingRects2) {
                rect.toString();
                arrayList.add(new io.flutter.embedding.engine.renderer.c(rect, 4, 1));
            }
        }
        ArrayList arrayList2 = kVar.f2536r;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (Build.VERSION.SDK_INT >= 35) {
            s sVar = this.f3182B;
            Context context2 = getContext();
            sVar.getClass();
            Activity r2 = AbstractC0132a.r(context2);
            WindowInsets windowInsets2 = null;
            if (r2 != null && (window = r2.getWindow()) != null) {
                windowInsets2 = window.getDecorView().getRootWindowInsets();
            }
            if (windowInsets2 == null) {
                boundingRects = Collections.emptyList();
            } else {
                captionBar = WindowInsets.Type.captionBar();
                boundingRects = windowInsets2.getBoundingRects(captionBar);
            }
            int i28 = kVar.f2522d;
            Iterator it = boundingRects.iterator();
            while (it.hasNext()) {
                i28 = Math.max(i28, ((Rect) it.next()).bottom);
            }
            kVar.f2522d = i28;
        }
        e();
        return onApplyWindowInsets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8, types: [b1.d] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        B.m mVar;
        H0.j jVar = H0.j.f503e;
        int i2 = 1;
        super.onAttachedToWindow();
        try {
            a0.g gVar = a0.h.f1275c;
            Context context = getContext();
            gVar.getClass();
            mVar = new B.m(29, new O(a0.g.a(context)));
        } catch (NoClassDefFoundError unused) {
            mVar = null;
        }
        this.v = mVar;
        Activity r2 = AbstractC0132a.r(getContext());
        B.m mVar2 = this.v;
        if (mVar2 == null || r2 == null) {
            return;
        }
        this.f3181A = new a0.i(i2, this);
        Context context2 = getContext();
        Executor a2 = Build.VERSION.SDK_INT >= 28 ? r.c.a(context2) : new ExecutorC0314a(new Handler(context2.getMainLooper()));
        a0.i iVar = this.f3181A;
        O o2 = (O) mVar2.f78f;
        Q0.h.e(a2, "executor");
        Q0.h.e(iVar, "consumer");
        C0134b c0134b = (C0134b) o2.f875f;
        c0134b.getClass();
        b1.c cVar = new b1.c(new a0.j(c0134b, r2, null), jVar, -2, 1);
        f1.d dVar = Y0.B.f1159a;
        Z0.c cVar2 = d1.p.f2100a;
        if (cVar2.k(C0125t.f1230f) != null) {
            throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + cVar2).toString());
        }
        b1.c cVar3 = cVar;
        if (!cVar2.equals(jVar)) {
            cVar3 = c1.l.a(cVar, cVar2, 0, 0, 6);
        }
        O o3 = (O) o2.f876g;
        o3.getClass();
        Q0.h.e(cVar3, "flow");
        ReentrantLock reentrantLock = (ReentrantLock) o3.f875f;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = (LinkedHashMap) o3.f876g;
        try {
            if (linkedHashMap.get(iVar) == null) {
                H0.i j2 = new J(a2);
                if (j2.k(C0125t.f1230f) == null) {
                    j2 = j2.i(new T(null));
                }
                Y.a aVar = new Y.a(cVar3, iVar, null);
                H0.i a3 = AbstractC0127v.a(j2, jVar, true);
                f1.d dVar2 = Y0.B.f1159a;
                if (a3 != dVar2 && a3.k(H0.e.f502e) == null) {
                    a3 = a3.i(dVar2);
                }
                AbstractC0107a e0Var = new e0(a3, true);
                e0Var.W(1, e0Var, aVar);
                linkedHashMap.put(iVar, e0Var);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f3190l != null) {
            this.f3195q.b(configuration);
            d();
            AbstractC0132a.e(getContext(), this.f3190l);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b9  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i2;
        int i3;
        int i4;
        if (!c()) {
            return super.onCreateInputConnection(editorInfo);
        }
        io.flutter.plugin.editing.j jVar = this.f3193o;
        C0031i c0031i = this.f3196r;
        C0010k c0010k = jVar.f2600e;
        int i5 = c0010k.f48b;
        if (i5 == 1) {
            jVar.f2605j = null;
            return null;
        }
        int i6 = 4;
        if (i5 == 4) {
            return null;
        }
        if (i5 == 3) {
            if (jVar.f2610o) {
                return jVar.f2605j;
            }
            InputConnection onCreateInputConnection = jVar.f2606k.g(c0010k.f49c).onCreateInputConnection(editorInfo);
            jVar.f2605j = onCreateInputConnection;
            return onCreateInputConnection;
        }
        v0.m mVar = jVar.f2601f;
        v0.n nVar = mVar.f3534g;
        int i7 = nVar.f3540a;
        if (i7 != 2) {
            if (i7 == 5) {
                int i8 = nVar.f3541b ? 4098 : 2;
                if (nVar.f3542c) {
                    i2 = i8 | 8192;
                    i6 = i2;
                } else {
                    i6 = i8;
                }
            } else if (i7 == 6) {
                i6 = 3;
            } else if (i7 == 11) {
                i6 = 0;
            } else {
                i2 = i7 == 7 ? 131073 : (i7 == 8 || i7 == 13) ? 33 : (i7 == 9 || i7 == 12) ? 17 : i7 == 10 ? 145 : i7 == 3 ? 97 : i7 == 4 ? 113 : 1;
                if (!mVar.f3528a) {
                    if (mVar.f3529b) {
                        i2 |= 32768;
                    }
                    i4 = mVar.f3530c ? 524416 : 524432;
                    i3 = mVar.f3533f;
                    if (i3 != 1) {
                        i2 |= 4096;
                    } else if (i3 == 2) {
                        i2 |= 8192;
                    } else if (i3 == 3) {
                        i2 |= 16384;
                    }
                    i6 = i2;
                }
                i2 |= i4;
                i3 = mVar.f3533f;
                if (i3 != 1) {
                }
                i6 = i2;
            }
        }
        editorInfo.inputType = i6;
        editorInfo.imeOptions = 33554432;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 26 && !mVar.f3531d) {
            editorInfo.imeOptions = 50331648;
        }
        int intValue = mVar.f3535h.intValue();
        v0.m mVar2 = jVar.f2601f;
        String str = mVar2.f3536i;
        if (str != null) {
            editorInfo.actionLabel = str;
            editorInfo.actionId = intValue;
        }
        editorInfo.imeOptions = intValue | editorInfo.imeOptions;
        String[] strArr = mVar2.f3538k;
        if (strArr != null) {
            if (i9 >= 25) {
                editorInfo.contentMimeTypes = strArr;
            } else {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
                editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
            }
        }
        if (i9 >= 34) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
        }
        io.flutter.plugin.editing.b bVar = new io.flutter.plugin.editing.b(this, jVar.f2600e.f49c, jVar.f2599d, c0031i, jVar.f2603h, editorInfo);
        io.flutter.plugin.editing.e eVar = jVar.f2603h;
        eVar.getClass();
        editorInfo.initialSelStart = Selection.getSelectionStart(eVar);
        io.flutter.plugin.editing.e eVar2 = jVar.f2603h;
        eVar2.getClass();
        editorInfo.initialSelEnd = Selection.getSelectionEnd(eVar2);
        jVar.f2605j = bVar;
        return bVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        a0.i iVar;
        B.m mVar = this.v;
        if (mVar != null && (iVar = this.f3181A) != null) {
            O o2 = (O) ((O) mVar.f78f).f876g;
            o2.getClass();
            ReentrantLock reentrantLock = (ReentrantLock) o2.f875f;
            reentrantLock.lock();
            LinkedHashMap linkedHashMap = (LinkedHashMap) o2.f876g;
            try {
                P p2 = (P) linkedHashMap.get(iVar);
                if (p2 != null) {
                    p2.a(null);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        this.f3181A = null;
        this.v = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (c()) {
            C0261a c0261a = this.f3197s;
            Context context = getContext();
            c0261a.getClass();
            boolean isFromSource = motionEvent.isFromSource(2);
            boolean z2 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
            if (isFromSource && z2) {
                int b2 = C0261a.b(motionEvent.getActionMasked());
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
                allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                c0261a.a(motionEvent, motionEvent.getActionIndex(), b2, 0, C0261a.f3134f, allocateDirect, context);
                if (allocateDirect.position() % 288 != 0) {
                    throw new AssertionError("Packet position is not on field boundary.");
                }
                c0261a.f3135a.f2537a.dispatchPointerDataPacket(allocateDirect, allocateDirect.position());
                return true;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        return !c() ? super.onHoverEvent(motionEvent) : this.f3198t.e(motionEvent, false);
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i2) {
        Rect rect;
        super.onProvideAutofillVirtualStructure(viewStructure, i2);
        io.flutter.plugin.editing.j jVar = this.f3193o;
        if (Build.VERSION.SDK_INT < 26) {
            jVar.getClass();
            return;
        }
        if (jVar.f2602g != null) {
            String str = (String) jVar.f2601f.f3537j.f689e;
            AutofillId autofillId = viewStructure.getAutofillId();
            for (int i3 = 0; i3 < jVar.f2602g.size(); i3++) {
                int keyAt = jVar.f2602g.keyAt(i3);
                C0079n c0079n = ((v0.m) jVar.f2602g.valueAt(i3)).f3537j;
                if (c0079n != null) {
                    viewStructure.addChildCount(1);
                    ViewStructure newChild = viewStructure.newChild(i3);
                    newChild.setAutofillId(autofillId, keyAt);
                    String[] strArr = (String[]) c0079n.f690f;
                    if (strArr.length > 0) {
                        newChild.setAutofillHints(strArr);
                    }
                    newChild.setAutofillType(1);
                    newChild.setVisibility(0);
                    String str2 = (String) c0079n.f692h;
                    if (str2 != null) {
                        newChild.setHint(str2);
                    }
                    if (str.hashCode() != keyAt || (rect = jVar.f2607l) == null) {
                        newChild.setDimens(0, 0, 0, 0, 1, 1);
                        newChild.setAutofillValue(AutofillValue.forText(((v0.o) c0079n.f691g).f3543a));
                    } else {
                        newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), jVar.f2607l.height());
                        newChild.setAutofillValue(AutofillValue.forText(jVar.f2603h));
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        io.flutter.embedding.engine.renderer.k kVar = this.f3200w;
        kVar.f2520b = i2;
        kVar.f2521c = i3;
        e();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!c()) {
            return super.onTouchEvent(motionEvent);
        }
        requestUnbufferedDispatch(motionEvent);
        this.f3197s.d(motionEvent, C0261a.f3134f);
        return true;
    }

    public void setDelegate(s sVar) {
        this.f3182B = sVar;
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        View view = this.f3186h;
        if (view instanceof l) {
            ((l) view).setVisibility(i2);
        }
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    @TargetApi(28)
    public void setWindowInfoListenerDisplayFeatures(a0.k kVar) {
        ?? r8 = kVar.f1282a;
        ArrayList arrayList = new ArrayList();
        for (C0135c c0135c : r8) {
            c0135c.f1263a.c().toString();
            X.b bVar = c0135c.f1263a;
            int b2 = bVar.b();
            C0134b c0134b = C0134b.f1256h;
            int i2 = 2;
            int i3 = ((b2 == 0 || bVar.a() == 0) ? C0134b.f1255g : c0134b) == c0134b ? 3 : 2;
            C0134b c0134b2 = C0134b.f1257i;
            C0134b c0134b3 = c0135c.f1265c;
            if (c0134b3 != c0134b2) {
                i2 = c0134b3 == C0134b.f1258j ? 3 : 1;
            }
            arrayList.add(new io.flutter.embedding.engine.renderer.c(bVar.c(), i3, i2));
        }
        ArrayList arrayList2 = this.f3200w.f2535q;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        e();
    }

    public q(AbstractActivityC0264d abstractActivityC0264d, n nVar) {
        super(abstractActivityC0264d, null);
        this.f3188j = new HashSet();
        this.f3191m = new HashSet();
        this.f3200w = new io.flutter.embedding.engine.renderer.k();
        this.f3201x = new B.m(28, this);
        this.f3202y = new G.a(this, new Handler(Looper.getMainLooper()), 2);
        this.f3203z = new C0265e(2, this);
        this.f3182B = new s();
        this.f3184f = nVar;
        this.f3186h = nVar;
        b();
    }
}
