package c0;

import D.C0013n;
import L.C0026b;
import L.C0038n;
import L.Q;
import M0.AbstractC0043a;
import M0.AbstractC0063v;
import M0.C0061t;
import M0.P;
import M0.T;
import M0.e0;
import a.AbstractC0069a;
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
import android.view.RoundedCorner;
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
import m0.C0193c;
import m0.C0203m;
import m0.C0204n;
import m0.C0205o;
import m0.C0206p;
import m0.C0207q;
import o0.C0214a;
import s.ExecutorC0221a;

/* loaded from: classes.dex */
public final class r extends FrameLayout {

    /* renamed from: A, reason: collision with root package name */
    public final p f1736A;

    /* renamed from: B, reason: collision with root package name */
    public final C0105g f1737B;

    /* renamed from: C, reason: collision with root package name */
    public U.i f1738C;

    /* renamed from: D, reason: collision with root package name */
    public int f1739D;

    /* renamed from: E, reason: collision with root package name */
    public int f1740E;

    /* renamed from: F, reason: collision with root package name */
    public t f1741F;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1742e;

    /* renamed from: f, reason: collision with root package name */
    public final l f1743f;

    /* renamed from: g, reason: collision with root package name */
    public final n f1744g;

    /* renamed from: h, reason: collision with root package name */
    public C0108j f1745h;

    /* renamed from: i, reason: collision with root package name */
    public View f1746i;

    /* renamed from: j, reason: collision with root package name */
    public View f1747j;

    /* renamed from: k, reason: collision with root package name */
    public final HashSet f1748k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1749l;

    /* renamed from: m, reason: collision with root package name */
    public d0.c f1750m;

    /* renamed from: n, reason: collision with root package name */
    public final HashSet f1751n;

    /* renamed from: o, reason: collision with root package name */
    public Q f1752o;

    /* renamed from: p, reason: collision with root package name */
    public io.flutter.plugin.editing.l f1753p;

    /* renamed from: q, reason: collision with root package name */
    public io.flutter.plugin.editing.h f1754q;
    public C0214a r;

    /* renamed from: s, reason: collision with root package name */
    public C0026b f1755s;

    /* renamed from: t, reason: collision with root package name */
    public C0100b f1756t;

    /* renamed from: u, reason: collision with root package name */
    public io.flutter.view.h f1757u;

    /* renamed from: v, reason: collision with root package name */
    public TextServicesManager f1758v;

    /* renamed from: w, reason: collision with root package name */
    public A.j f1759w;

    /* renamed from: x, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.g f1760x;

    /* renamed from: y, reason: collision with root package name */
    public final A.j f1761y;

    /* renamed from: z, reason: collision with root package name */
    public final B.a f1762z;

    public r(AbstractActivityC0104f abstractActivityC0104f, l lVar) {
        super(abstractActivityC0104f, null);
        this.f1742e = false;
        this.f1748k = new HashSet();
        this.f1751n = new HashSet();
        this.f1760x = new io.flutter.embedding.engine.renderer.g();
        this.f1761y = new A.j(14, this);
        this.f1762z = new B.a(this, new Handler(Looper.getMainLooper()), 1);
        this.f1736A = new p(this);
        this.f1737B = new C0105g(1, this);
        this.f1741F = new t();
        this.f1743f = lVar;
        this.f1746i = lVar;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v38, types: [android.view.View, io.flutter.embedding.engine.renderer.k] */
    public final void a() {
        SparseArray sparseArray;
        Objects.toString(this.f1750m);
        if (!c()) {
            return;
        }
        Iterator it = this.f1751n.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        getContext().getContentResolver().unregisterContentObserver(this.f1762z);
        io.flutter.plugin.platform.k kVar = this.f1750m.f1805s;
        int i2 = 0;
        while (true) {
            SparseArray sparseArray2 = kVar.r;
            if (i2 >= sparseArray2.size()) {
                break;
            }
            kVar.f2479g.removeView((io.flutter.plugin.platform.g) sparseArray2.valueAt(i2));
            i2++;
        }
        int i3 = 0;
        while (true) {
            SparseArray sparseArray3 = kVar.f2488p;
            if (i3 >= sparseArray3.size()) {
                kVar.d();
                if (kVar.f2479g == null) {
                    Log.e("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
                } else {
                    int i4 = 0;
                    while (true) {
                        sparseArray = kVar.f2489q;
                        if (i4 >= sparseArray.size()) {
                            break;
                        }
                        kVar.f2479g.removeView((View) sparseArray.valueAt(i4));
                        i4++;
                    }
                    sparseArray.clear();
                }
                kVar.f2479g = null;
                kVar.f2491t = false;
                SparseArray sparseArray4 = kVar.f2487o;
                if (sparseArray4.size() > 0) {
                    sparseArray4.valueAt(0).getClass();
                    throw new ClassCastException();
                }
                io.flutter.plugin.platform.j jVar = this.f1750m.f1806t;
                int i5 = 0;
                while (true) {
                    SparseArray sparseArray5 = jVar.f2471l;
                    if (i5 >= sparseArray5.size()) {
                        Surface surface = jVar.f2474o;
                        if (surface != null) {
                            surface.release();
                            jVar.f2474o = null;
                            jVar.f2475p = null;
                        }
                        jVar.f2466g = null;
                        SparseArray sparseArray6 = jVar.f2470k;
                        if (sparseArray6.size() > 0) {
                            sparseArray6.valueAt(0).getClass();
                            throw new ClassCastException();
                        }
                        this.f1750m.f1805s.a();
                        this.f1750m.f1806t.a();
                        io.flutter.view.h hVar = this.f1757u;
                        hVar.f2615t = true;
                        hVar.f2601e.a();
                        hVar.r = null;
                        AccessibilityManager accessibilityManager = hVar.f2599c;
                        accessibilityManager.removeAccessibilityStateChangeListener(hVar.f2616u);
                        accessibilityManager.removeTouchExplorationStateChangeListener(hVar.f2617v);
                        hVar.f2602f.unregisterContentObserver(hVar.f2618w);
                        C0026b c0026b = hVar.f2598b;
                        c0026b.f522h = null;
                        ((FlutterJNI) c0026b.f520f).setAccessibilityDelegate(null);
                        this.f1757u = null;
                        this.f1753p.f2437b.restartInput(this);
                        this.f1753p.b();
                        int size = ((HashSet) this.f1755s.f520f).size();
                        if (size > 0) {
                            Log.w("KeyboardManager", "A KeyboardManager was destroyed with " + size + " unhandled redispatch event(s).");
                        }
                        io.flutter.plugin.editing.h hVar2 = this.f1754q;
                        if (hVar2 != null) {
                            hVar2.f2420a.f2706f = null;
                            SpellCheckerSession spellCheckerSession = hVar2.f2422c;
                            if (spellCheckerSession != null) {
                                spellCheckerSession.close();
                            }
                        }
                        Q q2 = this.f1752o;
                        if (q2 != null) {
                            ((C0193c) q2.f516g).f2706f = null;
                        }
                        io.flutter.embedding.engine.renderer.h hVar3 = this.f1750m.f1789b;
                        this.f1749l = false;
                        hVar3.c(this.f1737B);
                        boolean z2 = this.f1742e;
                        FlutterJNI flutterJNI = hVar3.f2385a;
                        if (z2) {
                            flutterJNI.removeResizingFlutterUiListener(this.f1736A);
                        }
                        hVar3.e();
                        flutterJNI.setSemanticsEnabled(false);
                        View view = this.f1747j;
                        if (view != null && this.f1746i == this.f1745h) {
                            this.f1746i = view;
                        }
                        this.f1746i.d();
                        C0108j c0108j = this.f1745h;
                        if (c0108j != null) {
                            c0108j.f1713e.close();
                            removeView(this.f1745h);
                            this.f1745h = null;
                        }
                        this.f1747j = null;
                        this.f1750m = null;
                        return;
                    }
                    if (sparseArray5.valueAt(i5) != null) {
                        throw new ClassCastException();
                    }
                    jVar.f2466g.removeView(null);
                    i5++;
                }
            } else {
                if (sparseArray3.valueAt(i3) != null) {
                    throw new ClassCastException();
                }
                kVar.f2479g.removeView(null);
                i3++;
            }
        }
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        C0205o c0205o;
        C0013n c0013n;
        C0013n c0013n2;
        CharSequence textValue;
        io.flutter.plugin.editing.l lVar = this.f1753p;
        if (lVar == null || Build.VERSION.SDK_INT < 26 || (c0205o = lVar.f2441f) == null || lVar.f2442g == null || (c0013n = c0205o.f2767j) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            C0205o c0205o2 = (C0205o) lVar.f2442g.get(sparseArray.keyAt(i2));
            if (c0205o2 != null && (c0013n2 = c0205o2.f2767j) != null) {
                textValue = AbstractC0099a.f(sparseArray.valueAt(i2)).getTextValue();
                String charSequence = textValue.toString();
                C0207q c0207q = new C0207q(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                String str = (String) c0013n2.f244a;
                if (str.equals((String) c0013n.f244a)) {
                    lVar.f2443h.f(c0207q);
                } else {
                    hashMap.put(str, c0207q);
                }
            }
        }
        int i3 = lVar.f2440e.f579c;
        Q q2 = lVar.f2439d;
        q2.getClass();
        hashMap.size();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            C0207q c0207q2 = (C0207q) entry.getValue();
            hashMap2.put((String) entry.getKey(), Q.o(c0207q2.f2774a, c0207q2.f2775b, c0207q2.f2776c, -1, -1));
        }
        ((C0026b) q2.f515f).D("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i3), hashMap2), null);
    }

    public final void b() {
        l lVar = this.f1743f;
        if (lVar != null) {
            addView(lVar);
        } else {
            n nVar = this.f1744g;
            if (nVar != null) {
                addView(nVar);
            } else {
                addView(this.f1745h);
            }
        }
        this.f1742e = AbstractC0069a.s(getContext());
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.k] */
    public final boolean c() {
        d0.c cVar = this.f1750m;
        if (cVar != null) {
            if (cVar.f1789b == this.f1746i.getAttachedRenderer()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean checkInputConnectionProxy(View view) {
        d0.c cVar = this.f1750m;
        if (cVar == null) {
            return super.checkInputConnectionProxy(view);
        }
        io.flutter.plugin.platform.k kVar = cVar.f1805s;
        if (view == null) {
            kVar.getClass();
            return false;
        }
        HashMap hashMap = kVar.f2486n;
        if (!hashMap.containsKey(view.getContext())) {
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
    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        boolean z2;
        HashMap hashMap;
        String str;
        boolean z3;
        C0013n c0013n;
        List enabledSpellCheckerInfos;
        boolean z4;
        boolean isSpellCheckerEnabled;
        char c2 = (getResources().getConfiguration().uiMode & 48) == 32 ? (char) 2 : (char) 1;
        TextServicesManager textServicesManager = this.f1758v;
        if (textServicesManager != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                enabledSpellCheckerInfos = textServicesManager.getEnabledSpellCheckerInfos();
                Iterator it = enabledSpellCheckerInfos.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z4 = false;
                        break;
                    } else if (((SpellCheckerInfo) it.next()).getPackageName().equals("com.google.android.inputmethod.latin")) {
                        z4 = true;
                        break;
                    }
                }
                isSpellCheckerEnabled = this.f1758v.isSpellCheckerEnabled();
                if (isSpellCheckerEnabled) {
                }
            }
            z2 = true;
            C0204n c0204n = this.f1750m.f1802o;
            c0204n.getClass();
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
            z3 = Build.VERSION.SDK_INT >= 34;
            c0013n = c0204n.f2757b;
            if (z3 || displayMetrics == null) {
                c0013n.i(hashMap, null);
            }
            C0203m c0203m = new C0203m(displayMetrics);
            C0026b c0026b = c0204n.f2756a;
            ((ConcurrentLinkedQueue) c0026b.f521g).add(c0203m);
            C0203m c0203m2 = (C0203m) c0026b.f522h;
            c0026b.f522h = c0203m;
            Q q2 = c0203m2 != null ? new Q(c0026b, c0203m2, 17, false) : null;
            hashMap.put("configurationId", Integer.valueOf(c0203m.f2754a));
            c0013n.i(hashMap, q2);
            return;
        }
        z2 = false;
        C0204n c0204n2 = this.f1750m.f1802o;
        c0204n2.getClass();
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
        c0013n = c0204n2.f2757b;
        if (z3) {
        }
        c0013n.i(hashMap, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (c() && this.f1755s.B(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    public final void e() {
        if (!c()) {
            Log.w("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        float f2 = getResources().getDisplayMetrics().density;
        io.flutter.embedding.engine.renderer.g gVar = this.f1760x;
        gVar.f2360a = f2;
        gVar.f2378t = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        io.flutter.embedding.engine.renderer.h hVar = this.f1750m.f1789b;
        hVar.getClass();
        int i2 = gVar.f2361b;
        if (i2 == 0) {
            int i3 = gVar.f2363d;
            int i4 = gVar.f2364e;
            if (i3 <= 0 && i4 <= 0) {
                return;
            }
        } else {
            int i5 = gVar.f2362c;
            if (i5 == 0) {
                int i6 = gVar.f2365f;
                int i7 = gVar.f2366g;
                if (i6 <= 0 && i7 <= 0) {
                    return;
                }
            } else if (i2 <= 0 || i5 <= 0 || gVar.f2360a <= 0.0f) {
                return;
            }
        }
        ArrayList arrayList = gVar.f2383y;
        arrayList.size();
        ArrayList arrayList2 = gVar.f2384z;
        arrayList2.size();
        int size = arrayList2.size() + arrayList.size();
        int[] iArr = new int[size * 4];
        int[] iArr2 = new int[size];
        int[] iArr3 = new int[size];
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            io.flutter.embedding.engine.renderer.a aVar = (io.flutter.embedding.engine.renderer.a) arrayList.get(i8);
            int i9 = i8 * 4;
            Rect rect = aVar.f2347a;
            iArr[i9] = rect.left;
            iArr[i9 + 1] = rect.top;
            iArr[i9 + 2] = rect.right;
            iArr[i9 + 3] = rect.bottom;
            iArr2[i8] = F.j.b(aVar.f2348b);
            iArr3[i8] = F.j.b(aVar.f2349c);
        }
        int size2 = arrayList.size() * 4;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            io.flutter.embedding.engine.renderer.a aVar2 = (io.flutter.embedding.engine.renderer.a) arrayList2.get(i10);
            int i11 = (i10 * 4) + size2;
            Rect rect2 = aVar2.f2347a;
            iArr[i11] = rect2.left;
            iArr[i11 + 1] = rect2.top;
            iArr[i11 + 2] = rect2.right;
            iArr[i11 + 3] = rect2.bottom;
            iArr2[arrayList.size() + i10] = F.j.b(aVar2.f2348b);
            iArr3[arrayList.size() + i10] = F.j.b(aVar2.f2349c);
        }
        hVar.f2385a.setViewportMetrics(gVar.f2360a, gVar.f2361b, gVar.f2362c, gVar.f2367h, gVar.f2368i, gVar.f2369j, gVar.f2370k, gVar.f2371l, gVar.f2372m, gVar.f2373n, gVar.f2374o, gVar.f2375p, gVar.f2376q, gVar.r, gVar.f2377s, gVar.f2378t, iArr, iArr2, iArr3, gVar.f2363d, gVar.f2364e, gVar.f2365f, gVar.f2366g, gVar.f2379u, gVar.f2380v, gVar.f2381w, gVar.f2382x);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.h hVar = this.f1757u;
        if (hVar == null || !hVar.f2599c.isEnabled()) {
            return null;
        }
        return this.f1757u;
    }

    public d0.c getAttachedFlutterEngine() {
        return this.f1750m;
    }

    public n0.f getBinaryMessenger() {
        return this.f1750m.f1790c;
    }

    public C0108j getCurrentImageSurface() {
        return this.f1745h;
    }

    public io.flutter.embedding.engine.renderer.g getViewportMetrics() {
        return this.f1760x;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x01b1, code lost:
    
        r3 = r16.getDisplayCutout();
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x013d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        char c2;
        int i2;
        int i3;
        RoundedCorner roundedCorner;
        RoundedCorner roundedCorner2;
        RoundedCorner roundedCorner3;
        RoundedCorner roundedCorner4;
        int captionBar;
        List boundingRects;
        Window window;
        DisplayCutout displayCutout;
        List<Rect> boundingRects2;
        int systemBars;
        Insets insets;
        int i4;
        int i5;
        int i6;
        int i7;
        int ime;
        Insets insets2;
        int i8;
        int i9;
        int i10;
        int i11;
        int systemGestures;
        Insets insets3;
        int i12;
        int i13;
        int i14;
        int i15;
        DisplayCutout displayCutout2;
        Insets waterfallInsets;
        int i16;
        int safeInsetTop;
        int i17;
        int safeInsetRight;
        int i18;
        int safeInsetBottom;
        int i19;
        int safeInsetLeft;
        Insets systemGestureInsets;
        int i20;
        int i21;
        int i22;
        int i23;
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        int i24 = Build.VERSION.SDK_INT;
        io.flutter.embedding.engine.renderer.g gVar = this.f1760x;
        if (i24 == 29) {
            systemGestureInsets = windowInsets.getSystemGestureInsets();
            i20 = systemGestureInsets.top;
            gVar.f2375p = i20;
            i21 = systemGestureInsets.right;
            gVar.f2376q = i21;
            i22 = systemGestureInsets.bottom;
            gVar.r = i22;
            i23 = systemGestureInsets.left;
            gVar.f2377s = i23;
        }
        boolean z2 = (getWindowSystemUiVisibility() & 4) == 0;
        boolean z3 = (getWindowSystemUiVisibility() & 2) == 0;
        if (i24 >= 30) {
            systemBars = WindowInsets.Type.systemBars();
            insets = windowInsets.getInsets(systemBars);
            i4 = insets.top;
            gVar.f2367h = i4;
            i5 = insets.right;
            gVar.f2368i = i5;
            i6 = insets.bottom;
            gVar.f2369j = i6;
            i7 = insets.left;
            gVar.f2370k = i7;
            ime = WindowInsets.Type.ime();
            insets2 = windowInsets.getInsets(ime);
            i8 = insets2.top;
            gVar.f2371l = i8;
            i9 = insets2.right;
            gVar.f2372m = i9;
            i10 = insets2.bottom;
            gVar.f2373n = i10;
            i11 = insets2.left;
            gVar.f2374o = i11;
            systemGestures = WindowInsets.Type.systemGestures();
            insets3 = windowInsets.getInsets(systemGestures);
            i12 = insets3.top;
            gVar.f2375p = i12;
            i13 = insets3.right;
            gVar.f2376q = i13;
            i14 = insets3.bottom;
            gVar.r = i14;
            i15 = insets3.left;
            gVar.f2377s = i15;
            displayCutout2 = windowInsets.getDisplayCutout();
            if (displayCutout2 != null) {
                waterfallInsets = displayCutout2.getWaterfallInsets();
                int i25 = gVar.f2367h;
                i16 = waterfallInsets.top;
                int max = Math.max(i25, i16);
                safeInsetTop = displayCutout2.getSafeInsetTop();
                gVar.f2367h = Math.max(max, safeInsetTop);
                int i26 = gVar.f2368i;
                i17 = waterfallInsets.right;
                int max2 = Math.max(i26, i17);
                safeInsetRight = displayCutout2.getSafeInsetRight();
                gVar.f2368i = Math.max(max2, safeInsetRight);
                int i27 = gVar.f2369j;
                i18 = waterfallInsets.bottom;
                int max3 = Math.max(i27, i18);
                safeInsetBottom = displayCutout2.getSafeInsetBottom();
                gVar.f2369j = Math.max(max3, safeInsetBottom);
                int i28 = gVar.f2370k;
                i19 = waterfallInsets.left;
                int max4 = Math.max(i28, i19);
                safeInsetLeft = displayCutout2.getSafeInsetLeft();
                gVar.f2370k = Math.max(max4, safeInsetLeft);
            }
            i3 = 0;
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
                    gVar.f2367h = !z2 ? windowInsets.getSystemWindowInsetTop() : 0;
                    gVar.f2368i = (c2 != 3 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetRight();
                    if (z3) {
                        if ((((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom()) == 0) {
                            i2 = windowInsets.getSystemWindowInsetBottom();
                            gVar.f2369j = i2;
                            gVar.f2370k = (c2 != 2 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
                            gVar.f2371l = 0;
                            gVar.f2372m = 0;
                            gVar.f2373n = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom();
                            i3 = 0;
                            gVar.f2374o = 0;
                        }
                    }
                    i2 = 0;
                    gVar.f2369j = i2;
                    gVar.f2370k = (c2 != 2 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
                    gVar.f2371l = 0;
                    gVar.f2372m = 0;
                    gVar.f2373n = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom();
                    i3 = 0;
                    gVar.f2374o = 0;
                }
            }
            c2 = 1;
            gVar.f2367h = !z2 ? windowInsets.getSystemWindowInsetTop() : 0;
            gVar.f2368i = (c2 != 3 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetRight();
            if (z3) {
            }
            i2 = 0;
            gVar.f2369j = i2;
            gVar.f2370k = (c2 != 2 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
            gVar.f2371l = 0;
            gVar.f2372m = 0;
            gVar.f2373n = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom();
            i3 = 0;
            gVar.f2374o = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (i24 >= 28 && displayCutout != null) {
            boundingRects2 = displayCutout.getBoundingRects();
            for (Rect rect : boundingRects2) {
                rect.toString();
                arrayList.add(new io.flutter.embedding.engine.renderer.a(rect, 4, 1));
            }
        }
        ArrayList arrayList2 = gVar.f2384z;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (Build.VERSION.SDK_INT >= 35) {
            t tVar = this.f1741F;
            Context context2 = getContext();
            tVar.getClass();
            Activity n2 = o.g.n(context2);
            WindowInsets windowInsets2 = null;
            if (n2 != null && (window = n2.getWindow()) != null) {
                windowInsets2 = window.getDecorView().getRootWindowInsets();
            }
            if (windowInsets2 == null) {
                boundingRects = Collections.emptyList();
            } else {
                captionBar = WindowInsets.Type.captionBar();
                boundingRects = windowInsets2.getBoundingRects(captionBar);
            }
            int i29 = gVar.f2367h;
            Iterator it = boundingRects.iterator();
            while (it.hasNext()) {
                i29 = Math.max(i29, ((Rect) it.next()).bottom);
            }
            gVar.f2367h = i29;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            roundedCorner = windowInsets.getRoundedCorner(0);
            roundedCorner2 = windowInsets.getRoundedCorner(1);
            roundedCorner3 = windowInsets.getRoundedCorner(2);
            roundedCorner4 = windowInsets.getRoundedCorner(3);
            gVar.f2379u = roundedCorner != null ? roundedCorner.getRadius() : i3;
            gVar.f2380v = roundedCorner2 != null ? roundedCorner2.getRadius() : i3;
            gVar.f2381w = roundedCorner3 != null ? roundedCorner3.getRadius() : i3;
            gVar.f2382x = roundedCorner4 != null ? roundedCorner4.getRadius() : i3;
        }
        e();
        return onApplyWindowInsets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8, types: [P0.d] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        A.j jVar;
        w0.j jVar2 = w0.j.f3082e;
        super.onAttachedToWindow();
        try {
            U.g gVar = U.h.f1014c;
            Context context = getContext();
            gVar.getClass();
            jVar = new A.j(15, new Q(U.g.a(context)));
        } catch (NoClassDefFoundError unused) {
            jVar = null;
        }
        this.f1759w = jVar;
        Activity n2 = o.g.n(getContext());
        A.j jVar3 = this.f1759w;
        if (jVar3 == null || n2 == null) {
            return;
        }
        this.f1738C = new U.i(1, this);
        Context context2 = getContext();
        Executor a2 = Build.VERSION.SDK_INT >= 28 ? n.b.a(context2) : new ExecutorC0221a(new Handler(context2.getMainLooper()));
        U.i iVar = this.f1738C;
        Q q2 = (Q) jVar3.f30f;
        F0.i.e(a2, "executor");
        F0.i.e(iVar, "consumer");
        U.b bVar = (U.b) q2.f515f;
        bVar.getClass();
        P0.c cVar = new P0.c(new U.j(bVar, n2, null), jVar2, -2, 1);
        T0.d dVar = M0.B.f616a;
        N0.c cVar2 = R0.p.f931a;
        if (cVar2.f(C0061t.f687f) != null) {
            throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + cVar2).toString());
        }
        P0.c cVar3 = cVar;
        if (!cVar2.equals(jVar2)) {
            cVar3 = Q0.l.a(cVar, cVar2, 0, 0, 6);
        }
        Q q3 = (Q) q2.f516g;
        q3.getClass();
        F0.i.e(cVar3, "flow");
        ReentrantLock reentrantLock = (ReentrantLock) q3.f515f;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = (LinkedHashMap) q3.f516g;
        try {
            if (linkedHashMap.get(iVar) == null) {
                w0.i j2 = new M0.J(a2);
                if (j2.f(C0061t.f687f) == null) {
                    j2 = j2.k(new T(null));
                }
                S.a aVar = new S.a(cVar3, iVar, null);
                w0.i a3 = AbstractC0063v.a(j2, jVar2, true);
                T0.d dVar2 = M0.B.f616a;
                if (a3 != dVar2 && a3.f(w0.e.f3081e) == null) {
                    a3 = a3.k(dVar2);
                }
                AbstractC0043a e0Var = new e0(a3, true);
                e0Var.U(1, e0Var, aVar);
                linkedHashMap.put(iVar, e0Var);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f1750m != null) {
            this.r.b(configuration);
            d();
            o.g.b(getContext(), this.f1750m);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b1  */
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
        io.flutter.plugin.editing.l lVar = this.f1753p;
        C0026b c0026b = this.f1755s;
        C0038n c0038n = lVar.f2440e;
        int i5 = c0038n.f578b;
        if (i5 == 1) {
            lVar.f2445j = null;
            return null;
        }
        int i6 = 4;
        if (i5 == 4) {
            return null;
        }
        if (i5 == 3) {
            if (lVar.f2451p) {
                return lVar.f2445j;
            }
            lVar.f2446k.f(c0038n.f579c);
            throw null;
        }
        C0205o c0205o = lVar.f2441f;
        C0206p c0206p = c0205o.f2764g;
        int i7 = c0206p.f2771a;
        if (i7 != 2) {
            if (i7 == 5) {
                int i8 = c0206p.f2772b ? 4098 : 2;
                if (c0206p.f2773c) {
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
                if (!c0205o.f2758a) {
                    if (c0205o.f2759b) {
                        i2 |= 32768;
                    }
                    i4 = c0205o.f2760c ? 524416 : 524432;
                    i3 = c0205o.f2763f;
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
                i3 = c0205o.f2763f;
                if (i3 != 1) {
                }
                i6 = i2;
            }
        }
        editorInfo.inputType = i6;
        editorInfo.imeOptions = 33554432;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 26 && !c0205o.f2761d) {
            editorInfo.imeOptions = 50331648;
        }
        int intValue = c0205o.f2765h.intValue();
        C0205o c0205o2 = lVar.f2441f;
        String str = c0205o2.f2766i;
        if (str != null) {
            editorInfo.actionLabel = str;
            editorInfo.actionId = intValue;
        }
        editorInfo.imeOptions = intValue | editorInfo.imeOptions;
        if (c0205o2.f2770m != null) {
            editorInfo.hintLocales = new LocaleList(lVar.f2441f.f2770m);
        }
        String[] strArr = lVar.f2441f.f2768k;
        if (strArr != null) {
            editorInfo.contentMimeTypes = strArr;
        }
        if (i9 >= 34) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
        }
        io.flutter.plugin.editing.c cVar = new io.flutter.plugin.editing.c(this, lVar.f2440e.f579c, lVar.f2439d, c0026b, lVar.f2443h, editorInfo);
        io.flutter.plugin.editing.f fVar = lVar.f2443h;
        fVar.getClass();
        editorInfo.initialSelStart = Selection.getSelectionStart(fVar);
        io.flutter.plugin.editing.f fVar2 = lVar.f2443h;
        fVar2.getClass();
        editorInfo.initialSelEnd = Selection.getSelectionEnd(fVar2);
        lVar.f2445j = cVar;
        return cVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        U.i iVar;
        A.j jVar = this.f1759w;
        if (jVar != null && (iVar = this.f1738C) != null) {
            Q q2 = (Q) ((Q) jVar.f30f).f516g;
            q2.getClass();
            ReentrantLock reentrantLock = (ReentrantLock) q2.f515f;
            reentrantLock.lock();
            LinkedHashMap linkedHashMap = (LinkedHashMap) q2.f516g;
            try {
                P p2 = (P) linkedHashMap.get(iVar);
                if (p2 != null) {
                    p2.a(null);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        this.f1738C = null;
        this.f1759w = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (c()) {
            C0100b c0100b = this.f1756t;
            Context context = getContext();
            c0100b.getClass();
            boolean isFromSource = motionEvent.isFromSource(2);
            boolean z2 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
            if (isFromSource && z2) {
                int b2 = C0100b.b(motionEvent.getActionMasked());
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
                allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                c0100b.a(motionEvent, motionEvent.getActionIndex(), b2, 0, C0100b.f1684f, allocateDirect, context);
                if (allocateDirect.position() % 288 != 0) {
                    throw new AssertionError("Packet position is not on field boundary.");
                }
                c0100b.f1685a.f2385a.dispatchPointerDataPacket(allocateDirect, allocateDirect.position());
                return true;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        return !c() ? super.onHoverEvent(motionEvent) : this.f1757u.e(motionEvent, false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        this.f1739D = View.MeasureSpec.getMode(i2);
        this.f1740E = View.MeasureSpec.getMode(i3);
        super.onMeasure(i2, i3);
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i2) {
        Rect rect;
        super.onProvideAutofillVirtualStructure(viewStructure, i2);
        io.flutter.plugin.editing.l lVar = this.f1753p;
        if (lVar == null || Build.VERSION.SDK_INT < 26 || lVar.f2442g == null) {
            return;
        }
        String str = (String) lVar.f2441f.f2767j.f244a;
        AutofillId autofillId = viewStructure.getAutofillId();
        for (int i3 = 0; i3 < lVar.f2442g.size(); i3++) {
            int keyAt = lVar.f2442g.keyAt(i3);
            C0013n c0013n = ((C0205o) lVar.f2442g.valueAt(i3)).f2767j;
            if (c0013n != null) {
                viewStructure.addChildCount(1);
                ViewStructure newChild = viewStructure.newChild(i3);
                newChild.setAutofillId(autofillId, keyAt);
                String[] strArr = (String[]) c0013n.f245b;
                if (strArr.length > 0) {
                    newChild.setAutofillHints(strArr);
                }
                newChild.setAutofillType(1);
                newChild.setVisibility(0);
                String str2 = (String) c0013n.f247d;
                if (str2 != null) {
                    newChild.setHint(str2);
                }
                if (str.hashCode() != keyAt || (rect = lVar.f2448m) == null) {
                    newChild.setDimens(0, 0, 0, 0, 1, 1);
                    newChild.setAutofillValue(AutofillValue.forText(((C0207q) c0013n.f246c).f2774a));
                } else {
                    newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), lVar.f2448m.height());
                    newChild.setAutofillValue(AutofillValue.forText(lVar.f2443h));
                }
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        io.flutter.embedding.engine.renderer.g gVar = this.f1760x;
        gVar.f2361b = i2;
        gVar.f2362c = i3;
        boolean z2 = this.f1742e;
        if (z2 && this.f1740E == 0) {
            gVar.f2365f = 0;
            gVar.f2366g = 8192;
        } else {
            gVar.f2365f = i3;
            gVar.f2366g = i3;
        }
        if (z2 && this.f1739D == 0) {
            gVar.f2363d = 0;
            gVar.f2364e = 8192;
        } else {
            gVar.f2363d = i2;
            gVar.f2364e = i2;
        }
        e();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        int i2;
        if (!c()) {
            return super.onTouchEvent(motionEvent);
        }
        requestUnbufferedDispatch(motionEvent);
        C0100b c0100b = this.f1756t;
        Matrix matrix = C0100b.f1684f;
        c0100b.getClass();
        int actionMasked = motionEvent.getActionMasked();
        int b2 = C0100b.b(motionEvent.getActionMasked());
        char c2 = 5;
        int i3 = 1;
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
        int i4 = (z3 && c2 == 0) ? 1 : 0;
        int pointerCount = motionEvent.getPointerCount();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((pointerCount + i4) * 288);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        if (z2) {
            c0100b.a(motionEvent, motionEvent.getActionIndex(), b2, 0, matrix, allocateDirect, null);
            byteBuffer = allocateDirect;
        } else {
            ByteBuffer byteBuffer3 = allocateDirect;
            if (z3) {
                int i5 = 0;
                while (i5 < pointerCount) {
                    if (i5 == motionEvent.getActionIndex() || motionEvent.getToolType(i5) != i3) {
                        byteBuffer2 = byteBuffer3;
                        i2 = pointerCount;
                    } else {
                        byteBuffer2 = byteBuffer3;
                        i2 = pointerCount;
                        c0100b.a(motionEvent, i5, 5, 1, matrix, byteBuffer2, null);
                    }
                    i5++;
                    pointerCount = i2;
                    byteBuffer3 = byteBuffer2;
                    i3 = 1;
                }
                byteBuffer = byteBuffer3;
                c0100b.a(motionEvent, motionEvent.getActionIndex(), b2, 0, matrix, byteBuffer, null);
                if (i4 != 0) {
                    c0100b.a(motionEvent, motionEvent.getActionIndex(), 2, 0, matrix, byteBuffer, null);
                }
            } else {
                byteBuffer = byteBuffer3;
                for (int i6 = 0; i6 < pointerCount; i6++) {
                    c0100b.a(motionEvent, i6, b2, (pointerCount << 8) | 2, matrix, byteBuffer, null);
                }
            }
        }
        if (byteBuffer.position() % 288 != 0) {
            throw new AssertionError("Packet position is not on field boundary");
        }
        c0100b.f1685a.f2385a.dispatchPointerDataPacket(byteBuffer, byteBuffer.position());
        return true;
    }

    public void setDelegate(t tVar) {
        this.f1741F = tVar;
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        View view = this.f1746i;
        if (view instanceof l) {
            ((l) view).setVisibility(i2);
        }
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    public void setWindowInfoListenerDisplayFeatures(U.k kVar) {
        ?? r8 = kVar.f1021a;
        ArrayList arrayList = new ArrayList();
        for (U.c cVar : r8) {
            cVar.f1002a.c().toString();
            R.b bVar = cVar.f1002a;
            int b2 = bVar.b();
            U.b bVar2 = U.b.f995h;
            int i2 = 2;
            int i3 = ((b2 == 0 || bVar.a() == 0) ? U.b.f994g : bVar2) == bVar2 ? 3 : 2;
            U.b bVar3 = U.b.f996i;
            U.b bVar4 = cVar.f1004c;
            if (bVar4 != bVar3) {
                i2 = bVar4 == U.b.f997j ? 3 : 1;
            }
            arrayList.add(new io.flutter.embedding.engine.renderer.a(bVar.c(), i3, i2));
        }
        ArrayList arrayList2 = this.f1760x.f2383y;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        e();
    }

    public r(AbstractActivityC0104f abstractActivityC0104f, n nVar) {
        super(abstractActivityC0104f, null);
        this.f1742e = false;
        this.f1748k = new HashSet();
        this.f1751n = new HashSet();
        this.f1760x = new io.flutter.embedding.engine.renderer.g();
        this.f1761y = new A.j(14, this);
        this.f1762z = new B.a(this, new Handler(Looper.getMainLooper()), 1);
        this.f1736A = new p(this);
        this.f1737B = new C0105g(1, this);
        this.f1741F = new t();
        this.f1744g = nVar;
        this.f1746i = nVar;
        b();
    }
}
