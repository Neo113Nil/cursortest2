package E1;

import E.AbstractC0003d;
import E.C0009j;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Insets;
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
import b0.C0178i;
import d0.C0295b;
import f0.C0322a;
import g0.C0330b;
import g0.C0331c;
import io.flutter.embedding.engine.FlutterEngine;
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
import t2.AbstractC1212w;
import t2.C1209t;
import t2.U;

/* loaded from: classes.dex */
public final class t extends FrameLayout implements R1.a, D {

    /* renamed from: A, reason: collision with root package name */
    public int f383A;

    /* renamed from: B, reason: collision with root package name */
    public v f384B;

    /* renamed from: a, reason: collision with root package name */
    public boolean f385a;

    /* renamed from: b, reason: collision with root package name */
    public final C0036l f386b;

    /* renamed from: c, reason: collision with root package name */
    public final n f387c;

    /* renamed from: d, reason: collision with root package name */
    public C0034j f388d;

    /* renamed from: e, reason: collision with root package name */
    public View f389e;
    public View f;

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f390g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f391h;

    /* renamed from: i, reason: collision with root package name */
    public FlutterEngine f392i;

    /* renamed from: j, reason: collision with root package name */
    public final HashSet f393j;

    /* renamed from: k, reason: collision with root package name */
    public V0.e f394k;

    /* renamed from: l, reason: collision with root package name */
    public io.flutter.plugin.editing.k f395l;

    /* renamed from: m, reason: collision with root package name */
    public io.flutter.plugin.editing.h f396m;

    /* renamed from: n, reason: collision with root package name */
    public Q1.a f397n;
    public A0.f o;

    /* renamed from: p, reason: collision with root package name */
    public C0025a f398p;

    /* renamed from: q, reason: collision with root package name */
    public io.flutter.view.i f399q;

    /* renamed from: r, reason: collision with root package name */
    public TextServicesManager f400r;

    /* renamed from: s, reason: collision with root package name */
    public C0.e f401s;

    /* renamed from: t, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.i f402t;

    /* renamed from: u, reason: collision with root package name */
    public final C0178i f403u;
    public final q v;

    /* renamed from: w, reason: collision with root package name */
    public final r f404w;

    /* renamed from: x, reason: collision with root package name */
    public final C0030f f405x;

    /* renamed from: y, reason: collision with root package name */
    public p f406y;
    public int z;

    public t(AbstractActivityC0029e abstractActivityC0029e, C0036l c0036l) {
        super(abstractActivityC0029e, null);
        this.f385a = false;
        this.f390g = new HashSet();
        this.f393j = new HashSet();
        this.f402t = new io.flutter.embedding.engine.renderer.i();
        this.f403u = new C0178i(1, this);
        this.v = new q(this, new Handler(Looper.getMainLooper()), 0);
        this.f404w = new r(this);
        this.f405x = new C0030f(1, this);
        this.f384B = new v();
        this.f386b = c0036l;
        this.f389e = c0036l;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [android.view.View, io.flutter.embedding.engine.renderer.m] */
    public final void a() {
        SparseArray sparseArray;
        Objects.toString(this.f392i);
        if (c()) {
            Iterator it = this.f393j.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            getContext().getContentResolver().unregisterContentObserver(this.v);
            io.flutter.plugin.platform.r rVar = this.f392i.f9115s;
            int i3 = 0;
            while (true) {
                SparseArray sparseArray2 = rVar.o;
                if (i3 >= sparseArray2.size()) {
                    break;
                }
                rVar.f9298d.removeView((io.flutter.plugin.platform.j) sparseArray2.valueAt(i3));
                i3++;
            }
            int i4 = 0;
            while (true) {
                SparseArray sparseArray3 = rVar.f9306m;
                if (i4 >= sparseArray3.size()) {
                    break;
                }
                rVar.f9298d.removeView((K1.b) sparseArray3.valueAt(i4));
                i4++;
            }
            rVar.d();
            if (rVar.f9298d == null) {
                Log.e("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
            } else {
                int i5 = 0;
                while (true) {
                    sparseArray = rVar.f9307n;
                    if (i5 >= sparseArray.size()) {
                        break;
                    }
                    rVar.f9298d.removeView((View) sparseArray.valueAt(i5));
                    i5++;
                }
                sparseArray.clear();
            }
            rVar.f9298d = null;
            rVar.f9309q = false;
            int i6 = 0;
            while (true) {
                SparseArray sparseArray4 = rVar.f9305l;
                if (i6 >= sparseArray4.size()) {
                    break;
                }
                ((io.flutter.plugin.platform.g) sparseArray4.valueAt(i6)).onFlutterViewDetached();
                i6++;
            }
            io.flutter.plugin.platform.q qVar = this.f392i.f9116t;
            int i7 = 0;
            while (true) {
                SparseArray sparseArray5 = qVar.f9287j;
                if (i7 >= sparseArray5.size()) {
                    break;
                }
                qVar.f9282d.removeView((K1.b) sparseArray5.valueAt(i7));
                i7++;
            }
            Surface surface = qVar.f9291n;
            if (surface != null) {
                surface.release();
                qVar.f9291n = null;
                qVar.o = null;
            }
            qVar.f9282d = null;
            int i8 = 0;
            while (true) {
                SparseArray sparseArray6 = qVar.f9286i;
                if (i8 >= sparseArray6.size()) {
                    break;
                }
                ((io.flutter.plugin.platform.g) sparseArray6.valueAt(i8)).onFlutterViewDetached();
                i8++;
            }
            this.f392i.f9115s.m();
            this.f392i.f9116t.m();
            io.flutter.view.i iVar = this.f399q;
            iVar.f9440u = true;
            iVar.f9426e.m();
            iVar.f9438s = null;
            AccessibilityManager accessibilityManager = iVar.f9424c;
            accessibilityManager.removeAccessibilityStateChangeListener(iVar.v);
            accessibilityManager.removeTouchExplorationStateChangeListener(iVar.f9441w);
            iVar.f.unregisterContentObserver(iVar.f9442x);
            A0.f fVar = iVar.f9423b;
            fVar.f25d = null;
            ((FlutterJNI) fVar.f24c).setAccessibilityDelegate(null);
            this.f399q = null;
            this.f395l.f9214b.restartInput(this);
            this.f395l.c();
            int size = ((HashSet) this.o.f24c).size();
            if (size > 0) {
                Log.w("KeyboardManager", "A KeyboardManager was destroyed with " + size + " unhandled redispatch event(s).");
            }
            io.flutter.plugin.editing.h hVar = this.f396m;
            if (hVar != null) {
                hVar.f9202a.f201b = null;
                SpellCheckerSession spellCheckerSession = hVar.f9204c;
                if (spellCheckerSession != null) {
                    spellCheckerSession.close();
                }
            }
            V0.e eVar = this.f394k;
            if (eVar != null) {
                ((C0.e) eVar.f1600c).f201b = null;
            }
            io.flutter.embedding.engine.renderer.j jVar = this.f392i.f9100b;
            this.f391h = false;
            jVar.g(this.f405x);
            boolean z = this.f385a;
            FlutterJNI flutterJNI = jVar.f9162a;
            if (z) {
                flutterJNI.removeResizingFlutterUiListener(this.f404w);
            }
            jVar.j();
            flutterJNI.setSemanticsEnabled(false);
            View view = this.f;
            if (view != null && this.f389e == this.f388d) {
                this.f389e = view;
            }
            this.f389e.a();
            C0034j c0034j = this.f388d;
            if (c0034j != null) {
                c0034j.f357a.close();
                removeView(this.f388d);
                this.f388d = null;
            }
            this.f = null;
            this.f392i = null;
        }
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        O1.n nVar;
        B0.p pVar;
        B0.p pVar2;
        CharSequence textValue;
        io.flutter.plugin.editing.k kVar = this.f395l;
        if (kVar == null || Build.VERSION.SDK_INT < 26 || (nVar = kVar.f) == null || kVar.f9218g == null || (pVar = nVar.f1198j) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            O1.n nVar2 = (O1.n) kVar.f9218g.get(sparseArray.keyAt(i3));
            if (nVar2 != null && (pVar2 = nVar2.f1198j) != null) {
                textValue = io.flutter.plugin.editing.j.d(sparseArray.valueAt(i3)).getTextValue();
                String charSequence = textValue.toString();
                O1.p pVar3 = new O1.p(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                String str = (String) pVar2.f162a;
                if (str.equals((String) pVar.f162a)) {
                    kVar.f9219h.f(pVar3);
                } else {
                    hashMap.put(str, pVar3);
                }
            }
        }
        int i4 = kVar.f9217e.f292c;
        V0.e eVar = kVar.f9216d;
        eVar.getClass();
        hashMap.size();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            O1.p pVar4 = (O1.p) entry.getValue();
            hashMap2.put((String) entry.getKey(), V0.e.v(pVar4.f1205a, pVar4.f1206b, pVar4.f1207c, -1, -1));
        }
        ((P1.o) eVar.f1599b).a("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i4), hashMap2), null);
    }

    public final void b() {
        C0036l c0036l = this.f386b;
        if (c0036l != null) {
            addView(c0036l);
        } else {
            n nVar = this.f387c;
            if (nVar != null) {
                addView(nVar);
            } else {
                addView(this.f388d);
            }
        }
        this.f385a = android.support.v4.media.session.a.A(getContext());
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.m] */
    public final boolean c() {
        FlutterEngine flutterEngine = this.f392i;
        if (flutterEngine != null) {
            return flutterEngine.f9100b == this.f389e.getAttachedRenderer();
        }
        return false;
    }

    @Override // android.view.View
    public final boolean checkInputConnectionProxy(View view) {
        FlutterEngine flutterEngine = this.f392i;
        if (flutterEngine == null) {
            return super.checkInputConnectionProxy(view);
        }
        io.flutter.plugin.platform.r rVar = flutterEngine.f9115s;
        if (view == null) {
            rVar.getClass();
            return false;
        }
        HashMap hashMap = rVar.f9304k;
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
        boolean z;
        HashMap hashMap;
        String str;
        boolean z2;
        B0.p pVar;
        List enabledSpellCheckerInfos;
        boolean z3;
        boolean isSpellCheckerEnabled;
        char c3 = (getResources().getConfiguration().uiMode & 48) == 32 ? (char) 2 : (char) 1;
        TextServicesManager textServicesManager = this.f400r;
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
                isSpellCheckerEnabled = this.f400r.isSpellCheckerEnabled();
                if (isSpellCheckerEnabled) {
                }
            }
            z = true;
            O1.m mVar = this.f392i.o;
            mVar.getClass();
            hashMap = new HashMap();
            hashMap.put("textScaleFactor", Float.valueOf(getResources().getConfiguration().fontScale));
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            hashMap.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z));
            hashMap.put("brieflyShowPassword", Boolean.valueOf(Settings.System.getInt(getContext().getContentResolver(), "show_password", 1) != 1));
            hashMap.put("alwaysUse24HourFormat", Boolean.valueOf(DateFormat.is24HourFormat(getContext())));
            if (c3 != 1) {
                str = "light";
            } else {
                if (c3 != 2) {
                    throw null;
                }
                str = "dark";
            }
            hashMap.put("platformBrightness", str);
            Objects.toString(hashMap.get("textScaleFactor"));
            Objects.toString(hashMap.get("alwaysUse24HourFormat"));
            Objects.toString(hashMap.get("platformBrightness"));
            z2 = Build.VERSION.SDK_INT >= 34;
            pVar = mVar.f1189b;
            if (z2 || displayMetrics == null) {
                pVar.h(hashMap, null);
            }
            O1.l lVar = new O1.l(displayMetrics);
            A0.f fVar = mVar.f1188a;
            ((ConcurrentLinkedQueue) fVar.f23b).add(lVar);
            O1.l lVar2 = (O1.l) fVar.f25d;
            fVar.f25d = lVar;
            V0.e eVar = lVar2 != null ? new V0.e(fVar, lVar2, 20, false) : null;
            hashMap.put("configurationId", Integer.valueOf(lVar.f1186a));
            pVar.h(hashMap, eVar);
            return;
        }
        z = false;
        O1.m mVar2 = this.f392i.o;
        mVar2.getClass();
        hashMap = new HashMap();
        hashMap.put("textScaleFactor", Float.valueOf(getResources().getConfiguration().fontScale));
        DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
        hashMap.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z));
        hashMap.put("brieflyShowPassword", Boolean.valueOf(Settings.System.getInt(getContext().getContentResolver(), "show_password", 1) != 1));
        hashMap.put("alwaysUse24HourFormat", Boolean.valueOf(DateFormat.is24HourFormat(getContext())));
        if (c3 != 1) {
        }
        hashMap.put("platformBrightness", str);
        Objects.toString(hashMap.get("textScaleFactor"));
        Objects.toString(hashMap.get("alwaysUse24HourFormat"));
        Objects.toString(hashMap.get("platformBrightness"));
        if (Build.VERSION.SDK_INT >= 34) {
        }
        pVar = mVar2.f1189b;
        if (z2) {
        }
        pVar.h(hashMap, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (c() && this.o.G(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    public final void e() {
        if (!c()) {
            Log.w("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        float f = getResources().getDisplayMetrics().density;
        io.flutter.embedding.engine.renderer.i iVar = this.f402t;
        iVar.f9140a = f;
        iVar.f9157t = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        io.flutter.embedding.engine.renderer.j jVar = this.f392i.f9100b;
        jVar.getClass();
        int i3 = iVar.f9141b;
        if (i3 == 0) {
            int i4 = iVar.f9143d;
            int i5 = iVar.f9144e;
            if (i4 <= 0 && i5 <= 0) {
                return;
            }
        } else {
            int i6 = iVar.f9142c;
            if (i6 == 0) {
                int i7 = iVar.f;
                int i8 = iVar.f9145g;
                if (i7 <= 0 && i8 <= 0) {
                    return;
                }
            } else if (i3 <= 0 || i6 <= 0 || iVar.f9140a <= 0.0f) {
                return;
            }
        }
        ArrayList arrayList = iVar.f9161y;
        arrayList.size();
        ArrayList arrayList2 = iVar.z;
        arrayList2.size();
        int size = arrayList2.size() + arrayList.size();
        int[] iArr = new int[size * 4];
        int[] iArr2 = new int[size];
        int[] iArr3 = new int[size];
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            io.flutter.embedding.engine.renderer.a aVar = (io.flutter.embedding.engine.renderer.a) arrayList.get(i9);
            int i10 = i9 * 4;
            Rect rect = aVar.f9120a;
            iArr[i10] = rect.left;
            iArr[i10 + 1] = rect.top;
            iArr[i10 + 2] = rect.right;
            iArr[i10 + 3] = rect.bottom;
            iArr2[i9] = M.j.b(aVar.f9121b);
            iArr3[i9] = M.j.b(aVar.f9122c);
        }
        int size2 = arrayList.size() * 4;
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            io.flutter.embedding.engine.renderer.a aVar2 = (io.flutter.embedding.engine.renderer.a) arrayList2.get(i11);
            int i12 = (i11 * 4) + size2;
            Rect rect2 = aVar2.f9120a;
            iArr[i12] = rect2.left;
            iArr[i12 + 1] = rect2.top;
            iArr[i12 + 2] = rect2.right;
            iArr[i12 + 3] = rect2.bottom;
            iArr2[arrayList.size() + i11] = M.j.b(aVar2.f9121b);
            iArr3[arrayList.size() + i11] = M.j.b(aVar2.f9122c);
        }
        jVar.f9162a.setViewportMetrics(iVar.f9140a, iVar.f9141b, iVar.f9142c, iVar.f9146h, iVar.f9147i, iVar.f9148j, iVar.f9149k, iVar.f9150l, iVar.f9151m, iVar.f9152n, iVar.o, iVar.f9153p, iVar.f9154q, iVar.f9155r, iVar.f9156s, iVar.f9157t, iArr, iArr2, iArr3, iVar.f9143d, iVar.f9144e, iVar.f, iVar.f9145g, iVar.f9158u, iVar.v, iVar.f9159w, iVar.f9160x);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.i iVar = this.f399q;
        if (iVar == null || !iVar.f9424c.isEnabled()) {
            return null;
        }
        return this.f399q;
    }

    public FlutterEngine getAttachedFlutterEngine() {
        return this.f392i;
    }

    public P1.f getBinaryMessenger() {
        return this.f392i.f9101c;
    }

    public C0034j getCurrentImageSurface() {
        return this.f388d;
    }

    public io.flutter.embedding.engine.renderer.i getViewportMetrics() {
        return this.f402t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x01b3, code lost:
    
        r3 = r18.getDisplayCutout();
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x013d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        char c3;
        double d3;
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
        io.flutter.embedding.engine.renderer.i iVar = this.f402t;
        if (i24 == 29) {
            systemGestureInsets = windowInsets.getSystemGestureInsets();
            i20 = systemGestureInsets.top;
            iVar.f9153p = i20;
            i21 = systemGestureInsets.right;
            iVar.f9154q = i21;
            i22 = systemGestureInsets.bottom;
            iVar.f9155r = i22;
            i23 = systemGestureInsets.left;
            iVar.f9156s = i23;
        }
        boolean z = (getWindowSystemUiVisibility() & 4) == 0;
        boolean z2 = (getWindowSystemUiVisibility() & 2) == 0;
        if (i24 >= 30) {
            systemBars = WindowInsets.Type.systemBars();
            insets = windowInsets.getInsets(systemBars);
            i4 = insets.top;
            iVar.f9146h = i4;
            i5 = insets.right;
            iVar.f9147i = i5;
            i6 = insets.bottom;
            iVar.f9148j = i6;
            i7 = insets.left;
            iVar.f9149k = i7;
            ime = WindowInsets.Type.ime();
            insets2 = windowInsets.getInsets(ime);
            i8 = insets2.top;
            iVar.f9150l = i8;
            i9 = insets2.right;
            iVar.f9151m = i9;
            i10 = insets2.bottom;
            iVar.f9152n = i10;
            i11 = insets2.left;
            iVar.o = i11;
            systemGestures = WindowInsets.Type.systemGestures();
            insets3 = windowInsets.getInsets(systemGestures);
            i12 = insets3.top;
            iVar.f9153p = i12;
            i13 = insets3.right;
            iVar.f9154q = i13;
            i14 = insets3.bottom;
            iVar.f9155r = i14;
            i15 = insets3.left;
            iVar.f9156s = i15;
            displayCutout2 = windowInsets.getDisplayCutout();
            if (displayCutout2 != null) {
                waterfallInsets = displayCutout2.getWaterfallInsets();
                int i25 = iVar.f9146h;
                i16 = waterfallInsets.top;
                int max = Math.max(i25, i16);
                safeInsetTop = displayCutout2.getSafeInsetTop();
                iVar.f9146h = Math.max(max, safeInsetTop);
                int i26 = iVar.f9147i;
                i17 = waterfallInsets.right;
                int max2 = Math.max(i26, i17);
                safeInsetRight = displayCutout2.getSafeInsetRight();
                iVar.f9147i = Math.max(max2, safeInsetRight);
                int i27 = iVar.f9148j;
                i18 = waterfallInsets.bottom;
                int max3 = Math.max(i27, i18);
                safeInsetBottom = displayCutout2.getSafeInsetBottom();
                iVar.f9148j = Math.max(max3, safeInsetBottom);
                int i28 = iVar.f9149k;
                i19 = waterfallInsets.left;
                int max4 = Math.max(i28, i19);
                safeInsetLeft = displayCutout2.getSafeInsetLeft();
                iVar.f9149k = Math.max(max4, safeInsetLeft);
            }
        } else {
            if (!z2) {
                Context context = getContext();
                if (context.getResources().getConfiguration().orientation == 2) {
                    int rotation = ((DisplayManager) context.getSystemService("display")).getDisplay(0).getRotation();
                    if (rotation == 1) {
                        c3 = 3;
                    } else if (rotation == 3) {
                        c3 = 2;
                    } else if (rotation == 0 || rotation == 2) {
                        c3 = 4;
                    }
                    iVar.f9146h = !z ? windowInsets.getSystemWindowInsetTop() : 0;
                    iVar.f9147i = (c3 != 3 || c3 == 4) ? 0 : windowInsets.getSystemWindowInsetRight();
                    if (z2) {
                        d3 = 0.18d;
                    } else {
                        d3 = 0.18d;
                        if ((((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom()) == 0) {
                            i3 = windowInsets.getSystemWindowInsetBottom();
                            iVar.f9148j = i3;
                            iVar.f9149k = (c3 != 2 || c3 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
                            iVar.f9150l = 0;
                            iVar.f9151m = 0;
                            iVar.f9152n = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * d3 ? 0 : windowInsets.getSystemWindowInsetBottom();
                            iVar.o = 0;
                        }
                    }
                    i3 = 0;
                    iVar.f9148j = i3;
                    iVar.f9149k = (c3 != 2 || c3 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
                    iVar.f9150l = 0;
                    iVar.f9151m = 0;
                    iVar.f9152n = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * d3 ? 0 : windowInsets.getSystemWindowInsetBottom();
                    iVar.o = 0;
                }
            }
            c3 = 1;
            iVar.f9146h = !z ? windowInsets.getSystemWindowInsetTop() : 0;
            iVar.f9147i = (c3 != 3 || c3 == 4) ? 0 : windowInsets.getSystemWindowInsetRight();
            if (z2) {
            }
            i3 = 0;
            iVar.f9148j = i3;
            iVar.f9149k = (c3 != 2 || c3 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
            iVar.f9150l = 0;
            iVar.f9151m = 0;
            iVar.f9152n = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * d3 ? 0 : windowInsets.getSystemWindowInsetBottom();
            iVar.o = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (i24 >= 28 && displayCutout != null) {
            boundingRects2 = displayCutout.getBoundingRects();
            for (Rect rect : boundingRects2) {
                rect.toString();
                arrayList.add(new io.flutter.embedding.engine.renderer.a(rect, 4, 1));
            }
        }
        ArrayList arrayList2 = iVar.z;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (Build.VERSION.SDK_INT >= 35) {
            v vVar = this.f384B;
            Context context2 = getContext();
            vVar.getClass();
            Activity y3 = android.support.v4.media.session.a.y(context2);
            WindowInsets windowInsets2 = null;
            if (y3 != null && (window = y3.getWindow()) != null) {
                windowInsets2 = window.getDecorView().getRootWindowInsets();
            }
            if (windowInsets2 == null) {
                boundingRects = Collections.EMPTY_LIST;
            } else {
                captionBar = WindowInsets.Type.captionBar();
                boundingRects = windowInsets2.getBoundingRects(captionBar);
            }
            int i29 = iVar.f9146h;
            Iterator it = boundingRects.iterator();
            while (it.hasNext()) {
                i29 = Math.max(i29, ((Rect) it.next()).bottom);
            }
            iVar.f9146h = i29;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            roundedCorner = windowInsets.getRoundedCorner(0);
            roundedCorner2 = windowInsets.getRoundedCorner(1);
            roundedCorner3 = windowInsets.getRoundedCorner(2);
            roundedCorner4 = windowInsets.getRoundedCorner(3);
            iVar.f9158u = roundedCorner != null ? roundedCorner.getRadius() : 0;
            iVar.v = roundedCorner2 != null ? roundedCorner2.getRadius() : 0;
            iVar.f9159w = roundedCorner3 != null ? roundedCorner3.getRadius() : 0;
            iVar.f9160x = roundedCorner4 != null ? roundedCorner4.getRadius() : 0;
        }
        e();
        return onApplyWindowInsets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [w2.d] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        C0.e eVar;
        int i3 = 3;
        super.onAttachedToWindow();
        try {
            g0.g gVar = g0.h.f5028v0;
            Context context = getContext();
            gVar.getClass();
            eVar = new C0.e(i3, new C0322a(g0.g.a(context)));
        } catch (NoClassDefFoundError unused) {
            eVar = null;
        }
        this.f401s = eVar;
        Activity y3 = android.support.v4.media.session.a.y(getContext());
        C0.e eVar2 = this.f401s;
        if (eVar2 == null || y3 == null) {
            return;
        }
        this.f406y = new p(0, this);
        Context context2 = getContext();
        Executor executor = Build.VERSION.SDK_INT >= 28 ? AbstractC0003d.c(context2) : new A.b(new Handler(context2.getMainLooper()), 0);
        p consumer = this.f406y;
        C0322a c0322a = (C0322a) eVar2.f201b;
        kotlin.jvm.internal.j.e(executor, "executor");
        kotlin.jvm.internal.j.e(consumer, "consumer");
        C0330b c0330b = (C0330b) c0322a.f4977b;
        c0330b.getClass();
        g0.i iVar = new g0.i(c0330b, y3, null);
        d2.i iVar2 = d2.i.f4951a;
        w2.c cVar = new w2.c(iVar, iVar2, -2, v2.a.f10571a);
        A2.e eVar3 = t2.D.f10377a;
        u2.c cVar2 = y2.o.f10862a;
        if (cVar2.h(C1209t.f10441b) != null) {
            throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + cVar2).toString());
        }
        w2.c flow = cVar;
        if (!cVar2.equals(iVar2)) {
            flow = x2.k.a(cVar, cVar2, 0, null, 6);
        }
        V0.e eVar4 = (V0.e) c0322a.f4978c;
        eVar4.getClass();
        kotlin.jvm.internal.j.e(flow, "flow");
        ReentrantLock reentrantLock = (ReentrantLock) eVar4.f1599b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = (LinkedHashMap) eVar4.f1600c;
        try {
            if (linkedHashMap.get(consumer) == null) {
                linkedHashMap.put(consumer, AbstractC1212w.g(AbstractC1212w.a(new t2.L(executor)), null, new e0.a(flow, consumer, null), 3));
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f392i != null) {
            this.f397n.b(configuration);
            d();
            android.support.v4.media.session.a.e(getContext(), this.f392i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
    
        if (r2.f1204c != false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i3;
        int i4;
        if (!c()) {
            return super.onCreateInputConnection(editorInfo);
        }
        io.flutter.plugin.editing.k kVar = this.f395l;
        A0.f fVar = this.o;
        C0009j c0009j = kVar.f9217e;
        int i5 = c0009j.f291b;
        if (i5 == 1) {
            kVar.f9221j = null;
            return null;
        }
        int i6 = 4;
        if (i5 == 4) {
            return null;
        }
        if (i5 == 3) {
            if (kVar.f9226p) {
                return kVar.f9221j;
            }
            InputConnection onCreateInputConnection = kVar.f9222k.j(c0009j.f292c).onCreateInputConnection(editorInfo);
            kVar.f9221j = onCreateInputConnection;
            return onCreateInputConnection;
        }
        O1.n nVar = kVar.f;
        O1.o oVar = nVar.f1195g;
        int i7 = oVar.f1202a;
        if (i7 != 2) {
            if (i7 == 5) {
                i6 = oVar.f1203b ? 4098 : 2;
            } else if (i7 == 6) {
                i6 = 3;
            } else if (i7 == 11) {
                i6 = 0;
            } else {
                int i8 = i7 == 7 ? 131073 : (i7 == 8 || i7 == 13) ? 33 : (i7 == 9 || i7 == 12) ? 17 : i7 == 10 ? 145 : i7 == 3 ? 97 : i7 == 4 ? 113 : 1;
                if (!nVar.f1190a) {
                    if (nVar.f1191b) {
                        i8 |= 32768;
                    }
                    i4 = nVar.f1192c ? 524416 : 524432;
                    i6 = i8;
                    i3 = nVar.f;
                    if (i3 != 1) {
                        i6 |= 4096;
                    } else {
                        if (i3 != 2) {
                            if (i3 == 3) {
                                i6 |= 16384;
                            }
                        }
                        i6 |= 8192;
                    }
                }
                i8 |= i4;
                i6 = i8;
                i3 = nVar.f;
                if (i3 != 1) {
                }
            }
        }
        editorInfo.inputType = i6;
        editorInfo.imeOptions = 33554432;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 26 && !nVar.f1193d) {
            editorInfo.imeOptions = 50331648;
        }
        int intValue = nVar.f1196h.intValue();
        O1.n nVar2 = kVar.f;
        String str = nVar2.f1197i;
        if (str != null) {
            editorInfo.actionLabel = str;
            editorInfo.actionId = intValue;
        }
        editorInfo.imeOptions = intValue | editorInfo.imeOptions;
        if (nVar2.f1201m != null) {
            editorInfo.hintLocales = new LocaleList(kVar.f.f1201m);
        }
        String[] strArr = kVar.f.f1199k;
        if (strArr != null) {
            editorInfo.contentMimeTypes = strArr;
        }
        if (i9 >= 34) {
            if (i9 >= 35) {
                G.a.b(editorInfo);
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
        }
        io.flutter.plugin.editing.d dVar = new io.flutter.plugin.editing.d(this, kVar.f9217e.f292c, kVar.f9216d, fVar, kVar.f9219h, editorInfo);
        io.flutter.plugin.editing.g gVar = kVar.f9219h;
        gVar.getClass();
        editorInfo.initialSelStart = Selection.getSelectionStart(gVar);
        io.flutter.plugin.editing.g gVar2 = kVar.f9219h;
        gVar2.getClass();
        editorInfo.initialSelEnd = Selection.getSelectionEnd(gVar2);
        kVar.f9221j = dVar;
        return dVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        p pVar;
        C0.e eVar = this.f401s;
        if (eVar != null && (pVar = this.f406y) != null) {
            V0.e eVar2 = (V0.e) ((C0322a) eVar.f201b).f4978c;
            eVar2.getClass();
            ReentrantLock reentrantLock = (ReentrantLock) eVar2.f1599b;
            reentrantLock.lock();
            LinkedHashMap linkedHashMap = (LinkedHashMap) eVar2.f1600c;
            try {
                U u3 = (U) linkedHashMap.get(pVar);
                if (u3 != null) {
                    u3.b(null);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        this.f406y = null;
        this.f401s = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (c()) {
            C0025a c0025a = this.f398p;
            Context context = getContext();
            c0025a.getClass();
            boolean isFromSource = motionEvent.isFromSource(2);
            boolean z = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
            if (isFromSource && z) {
                int b3 = C0025a.b(motionEvent.getActionMasked());
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
                allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                c0025a.a(motionEvent, motionEvent.getActionIndex(), b3, 0, C0025a.f, allocateDirect, context);
                if (allocateDirect.position() % 288 != 0) {
                    throw new AssertionError("Packet position is not on field boundary.");
                }
                c0025a.f329a.f9162a.dispatchPointerDataPacket(allocateDirect, allocateDirect.position());
                return true;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        return !c() ? super.onHoverEvent(motionEvent) : this.f399q.f(motionEvent, false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        this.z = View.MeasureSpec.getMode(i3);
        this.f383A = View.MeasureSpec.getMode(i4);
        super.onMeasure(i3, i4);
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i3) {
        Rect rect;
        super.onProvideAutofillVirtualStructure(viewStructure, i3);
        io.flutter.plugin.editing.k kVar = this.f395l;
        if (kVar == null || Build.VERSION.SDK_INT < 26 || kVar.f9218g == null) {
            return;
        }
        String str = (String) kVar.f.f1198j.f162a;
        AutofillId autofillId = viewStructure.getAutofillId();
        for (int i4 = 0; i4 < kVar.f9218g.size(); i4++) {
            int keyAt = kVar.f9218g.keyAt(i4);
            B0.p pVar = ((O1.n) kVar.f9218g.valueAt(i4)).f1198j;
            if (pVar != null) {
                viewStructure.addChildCount(1);
                ViewStructure newChild = viewStructure.newChild(i4);
                newChild.setAutofillId(autofillId, keyAt);
                String[] strArr = (String[]) pVar.f163b;
                if (strArr.length > 0) {
                    newChild.setAutofillHints(strArr);
                }
                newChild.setAutofillType(1);
                newChild.setVisibility(0);
                String str2 = (String) pVar.f165d;
                if (str2 != null) {
                    newChild.setHint(str2);
                }
                if (str.hashCode() != keyAt || (rect = kVar.f9224m) == null) {
                    newChild.setDimens(0, 0, 0, 0, 1, 1);
                    newChild.setAutofillValue(AutofillValue.forText(((O1.p) pVar.f164c).f1205a));
                } else {
                    newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), kVar.f9224m.height());
                    newChild.setAutofillValue(AutofillValue.forText(kVar.f9219h));
                }
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i4, int i5, int i6) {
        super.onSizeChanged(i3, i4, i5, i6);
        io.flutter.embedding.engine.renderer.i iVar = this.f402t;
        iVar.f9141b = i3;
        iVar.f9142c = i4;
        boolean z = this.f385a;
        if (z && this.f383A == 0) {
            iVar.f = 0;
            iVar.f9145g = 8192;
        } else {
            iVar.f = i4;
            iVar.f9145g = i4;
        }
        if (z && this.z == 0) {
            iVar.f9143d = 0;
            iVar.f9144e = 8192;
        } else {
            iVar.f9143d = i3;
            iVar.f9144e = i3;
        }
        e();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!c()) {
            return super.onTouchEvent(motionEvent);
        }
        requestUnbufferedDispatch(motionEvent);
        this.f398p.d(motionEvent, C0025a.f);
        return true;
    }

    public void setDelegate(v vVar) {
        this.f384B = vVar;
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        View view = this.f389e;
        if (view instanceof C0036l) {
            ((C0036l) view).setVisibility(i3);
        }
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    public void setWindowInfoListenerDisplayFeatures(g0.j jVar) {
        ?? r8 = jVar.f5032a;
        ArrayList arrayList = new ArrayList();
        for (C0331c c0331c : r8) {
            c0331c.f5017a.a().toString();
            C0295b c0295b = c0331c.f5017a;
            int i3 = c0295b.f4911c - c0295b.f4909a;
            C0330b c0330b = C0330b.f5011d;
            int i4 = 2;
            int i5 = ((i3 == 0 || c0295b.f4912d - c0295b.f4910b == 0) ? C0330b.f5010c : c0330b) == c0330b ? 3 : 2;
            C0330b c0330b2 = C0330b.f5012e;
            C0330b c0330b3 = c0331c.f5019c;
            if (c0330b3 != c0330b2) {
                i4 = c0330b3 == C0330b.f ? 3 : 1;
            }
            arrayList.add(new io.flutter.embedding.engine.renderer.a(c0295b.a(), i5, i4));
        }
        ArrayList arrayList2 = this.f402t.f9161y;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        e();
    }

    public t(AbstractActivityC0029e abstractActivityC0029e, n nVar) {
        super(abstractActivityC0029e, null);
        this.f385a = false;
        this.f390g = new HashSet();
        this.f393j = new HashSet();
        this.f402t = new io.flutter.embedding.engine.renderer.i();
        this.f403u = new C0178i(1, this);
        this.v = new q(this, new Handler(Looper.getMainLooper()), 0);
        this.f404w = new r(this);
        this.f405x = new C0030f(1, this);
        this.f384B = new v();
        this.f387c = nVar;
        this.f389e = nVar;
        b();
    }
}
