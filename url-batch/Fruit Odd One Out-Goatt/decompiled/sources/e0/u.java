package e0;

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
import k1.u0;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class u extends FrameLayout implements p0.a, g0 {
    public int A;
    public w B;

    /* renamed from: a, reason: collision with root package name */
    public boolean f211a;

    /* renamed from: b, reason: collision with root package name */
    public final m f212b;

    /* renamed from: c, reason: collision with root package name */
    public final o f213c;

    /* renamed from: d, reason: collision with root package name */
    public k f214d;

    /* renamed from: e, reason: collision with root package name */
    public View f215e;

    /* renamed from: f, reason: collision with root package name */
    public View f216f;

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f217g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f218h;

    /* renamed from: i, reason: collision with root package name */
    public f0.c f219i;

    /* renamed from: j, reason: collision with root package name */
    public final HashSet f220j;

    /* renamed from: k, reason: collision with root package name */
    public c0.a f221k;

    /* renamed from: l, reason: collision with root package name */
    public io.flutter.plugin.editing.n f222l;
    public io.flutter.plugin.editing.i m;

    /* renamed from: n, reason: collision with root package name */
    public o0.b f223n;

    /* renamed from: o, reason: collision with root package name */
    public h0 f224o;

    /* renamed from: p, reason: collision with root package name */
    public b f225p;

    /* renamed from: q, reason: collision with root package name */
    public io.flutter.view.i f226q;

    /* renamed from: r, reason: collision with root package name */
    public TextServicesManager f227r;

    /* renamed from: s, reason: collision with root package name */
    public androidx.lifecycle.n f228s;

    /* renamed from: t, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.g f229t;
    public final androidx.lifecycle.n u;
    public final r v;

    /* renamed from: w, reason: collision with root package name */
    public final s f230w;

    /* renamed from: x, reason: collision with root package name */
    public final g f231x;

    /* renamed from: y, reason: collision with root package name */
    public q f232y;

    /* renamed from: z, reason: collision with root package name */
    public int f233z;

    public u(Context context, m mVar) {
        super(context, null);
        this.f211a = false;
        this.f217g = new HashSet();
        this.f220j = new HashSet();
        this.f229t = new io.flutter.embedding.engine.renderer.g();
        this.u = new androidx.lifecycle.n(1, this);
        this.v = new r(this, new Handler(Looper.getMainLooper()), 0);
        this.f230w = new s(this);
        this.f231x = new g(1, this);
        this.B = new w();
        this.f212b = mVar;
        this.f215e = mVar;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v35, types: [android.view.View, io.flutter.embedding.engine.renderer.k] */
    public final void a() {
        Objects.toString(this.f219i);
        if (c()) {
            Iterator it = this.f220j.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                f0.l.a();
                return;
            }
            getContext().getContentResolver().unregisterContentObserver(this.v);
            io.flutter.plugin.platform.j jVar = this.f219i.f285s;
            SparseArray sparseArray = jVar.f523l;
            SparseArray sparseArray2 = jVar.m;
            SparseArray sparseArray3 = jVar.f525o;
            for (int i2 = 0; i2 < sparseArray3.size(); i2++) {
                jVar.f515d.removeView((io.flutter.plugin.platform.g) sparseArray3.valueAt(i2));
            }
            for (int i3 = 0; i3 < sparseArray2.size(); i3++) {
                if (sparseArray2.valueAt(i3) != null) {
                    f0.l.a();
                    return;
                }
                jVar.f515d.removeView(null);
            }
            jVar.c();
            SparseArray sparseArray4 = jVar.f524n;
            if (jVar.f515d == null) {
                Log.e("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
            } else {
                for (int i4 = 0; i4 < sparseArray4.size(); i4++) {
                    jVar.f515d.removeView((View) sparseArray4.valueAt(i4));
                }
                sparseArray4.clear();
            }
            jVar.f515d = null;
            jVar.f527q = false;
            if (sparseArray.size() > 0) {
                sparseArray.valueAt(0).getClass();
                f0.l.a();
                return;
            }
            io.flutter.plugin.platform.i iVar = this.f219i.f286t;
            SparseArray sparseArray5 = iVar.f506h;
            SparseArray sparseArray6 = iVar.f507i;
            for (int i5 = 0; i5 < sparseArray6.size(); i5++) {
                if (sparseArray6.valueAt(i5) != null) {
                    f0.l.a();
                    return;
                }
                iVar.f502d.removeView(null);
            }
            Surface surface = iVar.f510l;
            if (surface != null) {
                surface.release();
                iVar.f510l = null;
                iVar.m = null;
            }
            iVar.f502d = null;
            if (sparseArray5.size() > 0) {
                sparseArray5.valueAt(0).getClass();
                f0.l.a();
                return;
            }
            this.f219i.f285s.b();
            this.f219i.f286t.b();
            io.flutter.view.i iVar2 = this.f226q;
            iVar2.f619t = true;
            iVar2.f605e.b();
            iVar2.f617r = null;
            AccessibilityManager accessibilityManager = iVar2.f603c;
            accessibilityManager.removeAccessibilityStateChangeListener(iVar2.u);
            accessibilityManager.removeTouchExplorationStateChangeListener(iVar2.v);
            iVar2.f606f.unregisterContentObserver(iVar2.f620w);
            h0 h0Var = iVar2.f602b;
            h0Var.f153c = null;
            ((FlutterJNI) h0Var.f152b).setAccessibilityDelegate(null);
            this.f226q = null;
            this.f222l.f474b.restartInput(this);
            this.f222l.b();
            int size = ((HashSet) this.f224o.f152b).size();
            if (size > 0) {
                Log.w("KeyboardManager", "A KeyboardManager was destroyed with " + size + " unhandled redispatch event(s).");
            }
            io.flutter.plugin.editing.i iVar3 = this.m;
            if (iVar3 != null) {
                iVar3.f455a.f40c = null;
                SpellCheckerSession spellCheckerSession = iVar3.f457c;
                if (spellCheckerSession != null) {
                    spellCheckerSession.close();
                }
            }
            c0.a aVar = this.f221k;
            if (aVar != null) {
                ((androidx.lifecycle.n) aVar.f67d).f40c = null;
            }
            io.flutter.embedding.engine.renderer.h hVar = this.f219i.f269b;
            this.f218h = false;
            hVar.c(this.f231x);
            FlutterJNI flutterJNI = hVar.f422a;
            if (this.f211a) {
                flutterJNI.removeResizingFlutterUiListener(this.f230w);
            }
            hVar.e();
            flutterJNI.setSemanticsEnabled(false);
            View view = this.f216f;
            if (view != null && this.f215e == this.f214d) {
                this.f215e = view;
            }
            this.f215e.c();
            k kVar = this.f214d;
            if (kVar != null) {
                kVar.f168a.close();
                removeView(this.f214d);
                this.f214d = null;
            }
            this.f216f = null;
            this.f219i = null;
        }
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        m0.o oVar;
        c0.e eVar;
        c0.e eVar2;
        CharSequence textValue;
        io.flutter.plugin.editing.n nVar = this.f222l;
        if (nVar == null || Build.VERSION.SDK_INT < 26 || (oVar = nVar.f478f) == null || nVar.f479g == null || (eVar = oVar.f829j) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            m0.o oVar2 = (m0.o) nVar.f479g.get(sparseArray.keyAt(i2));
            if (oVar2 != null && (eVar2 = oVar2.f829j) != null) {
                String str = (String) eVar2.f70a;
                textValue = a.f(sparseArray.valueAt(i2)).getTextValue();
                String charSequence = textValue.toString();
                m0.q qVar = new m0.q(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                if (str.equals((String) eVar.f70a)) {
                    nVar.f480h.f(qVar);
                } else {
                    hashMap.put(str, qVar);
                }
            }
        }
        c0.a aVar = nVar.f476d;
        int i3 = nVar.f477e.f472b;
        aVar.getClass();
        hashMap.size();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            m0.q qVar2 = (m0.q) entry.getValue();
            hashMap2.put((String) entry.getKey(), c0.a.x(qVar2.f835a, qVar2.f836b, qVar2.f837c, -1, -1));
        }
        ((h0) aVar.f66c).d("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i3), hashMap2), null);
    }

    public final void b() {
        m mVar = this.f212b;
        if (mVar != null) {
            addView(mVar);
        } else {
            o oVar = this.f213c;
            if (oVar != null) {
                addView(oVar);
            } else {
                addView(this.f214d);
            }
        }
        this.f211a = a.a.n(getContext());
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.k] */
    public final boolean c() {
        f0.c cVar = this.f219i;
        return cVar != null && cVar.f269b == this.f215e.getAttachedRenderer();
    }

    @Override // android.view.View
    public final boolean checkInputConnectionProxy(View view) {
        f0.c cVar = this.f219i;
        if (cVar == null) {
            return super.checkInputConnectionProxy(view);
        }
        HashMap hashMap = cVar.f285s.f522k;
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
        h0 h0Var;
        HashMap hashMap;
        String str;
        List enabledSpellCheckerInfos;
        boolean z3;
        boolean isSpellCheckerEnabled;
        char c2 = (getResources().getConfiguration().uiMode & 48) == 32 ? (char) 2 : (char) 1;
        TextServicesManager textServicesManager = this.f227r;
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
                isSpellCheckerEnabled = this.f227r.isSpellCheckerEnabled();
                if (isSpellCheckerEnabled) {
                }
            }
            z2 = true;
            m0.n nVar = this.f219i.f281o;
            nVar.getClass();
            h0Var = nVar.f819b;
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
                h0Var.g(hashMap, null);
            }
            m0.m mVar = new m0.m(displayMetrics);
            h0 h0Var2 = nVar.f818a;
            ((ConcurrentLinkedQueue) h0Var2.f151a).add(mVar);
            m0.m mVar2 = (m0.m) h0Var2.f153c;
            h0Var2.f153c = mVar;
            c0.a aVar = mVar2 != null ? new c0.a(10, h0Var2, mVar2) : null;
            hashMap.put("configurationId", Integer.valueOf(mVar.f816a));
            h0Var.g(hashMap, aVar);
            return;
        }
        z2 = false;
        m0.n nVar2 = this.f219i.f281o;
        nVar2.getClass();
        h0Var = nVar2.f819b;
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
        h0Var.g(hashMap, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (c() && this.f224o.c(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    public final void e() {
        if (!c()) {
            Log.w("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        float f2 = getResources().getDisplayMetrics().density;
        io.flutter.embedding.engine.renderer.g gVar = this.f229t;
        gVar.f399a = f2;
        gVar.f417t = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        io.flutter.embedding.engine.renderer.h hVar = this.f219i.f269b;
        hVar.getClass();
        int i2 = gVar.f400b;
        ArrayList arrayList = gVar.f421z;
        ArrayList arrayList2 = gVar.f420y;
        if (i2 == 0) {
            int i3 = gVar.f402d;
            int i4 = gVar.f403e;
            if (i3 <= 0 && i4 <= 0) {
                return;
            }
        } else {
            int i5 = gVar.f401c;
            if (i5 == 0) {
                int i6 = gVar.f404f;
                int i7 = gVar.f405g;
                if (i6 <= 0 && i7 <= 0) {
                    return;
                }
            } else if (i2 <= 0 || i5 <= 0 || gVar.f399a <= 0.0f) {
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
            io.flutter.embedding.engine.renderer.a aVar = (io.flutter.embedding.engine.renderer.a) arrayList2.get(i8);
            int i9 = i8 * 4;
            Rect rect = aVar.f386a;
            iArr[i9] = rect.left;
            iArr[i9 + 1] = rect.top;
            iArr[i9 + 2] = rect.right;
            iArr[i9 + 3] = rect.bottom;
            iArr2[i8] = o.d.a(aVar.f387b);
            iArr3[i8] = o.d.a(aVar.f388c);
        }
        int size2 = arrayList2.size() * 4;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            io.flutter.embedding.engine.renderer.a aVar2 = (io.flutter.embedding.engine.renderer.a) arrayList.get(i10);
            int i11 = (i10 * 4) + size2;
            Rect rect2 = aVar2.f386a;
            iArr[i11] = rect2.left;
            iArr[i11 + 1] = rect2.top;
            iArr[i11 + 2] = rect2.right;
            iArr[i11 + 3] = rect2.bottom;
            iArr2[arrayList2.size() + i10] = o.d.a(aVar2.f387b);
            iArr3[arrayList2.size() + i10] = o.d.a(aVar2.f388c);
        }
        hVar.f422a.setViewportMetrics(gVar.f399a, gVar.f400b, gVar.f401c, gVar.f406h, gVar.f407i, gVar.f408j, gVar.f409k, gVar.f410l, gVar.m, gVar.f411n, gVar.f412o, gVar.f413p, gVar.f414q, gVar.f415r, gVar.f416s, gVar.f417t, iArr, iArr2, iArr3, gVar.f402d, gVar.f403e, gVar.f404f, gVar.f405g, gVar.u, gVar.v, gVar.f418w, gVar.f419x);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.i iVar = this.f226q;
        if (iVar == null || !iVar.f603c.isEnabled()) {
            return null;
        }
        return this.f226q;
    }

    public f0.c getAttachedFlutterEngine() {
        return this.f219i;
    }

    public n0.e getBinaryMessenger() {
        return this.f219i.f270c;
    }

    public k getCurrentImageSurface() {
        return this.f214d;
    }

    public io.flutter.embedding.engine.renderer.g getViewportMetrics() {
        return this.f229t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x01b6, code lost:
    
        r3 = r18.getDisplayCutout();
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x013e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        char c2;
        double d2;
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
        io.flutter.embedding.engine.renderer.g gVar = this.f229t;
        if (i24 == 29) {
            systemGestureInsets = windowInsets.getSystemGestureInsets();
            i20 = systemGestureInsets.top;
            gVar.f413p = i20;
            i21 = systemGestureInsets.right;
            gVar.f414q = i21;
            i22 = systemGestureInsets.bottom;
            gVar.f415r = i22;
            i23 = systemGestureInsets.left;
            gVar.f416s = i23;
        }
        boolean z2 = (getWindowSystemUiVisibility() & 4) == 0;
        boolean z3 = (getWindowSystemUiVisibility() & 2) == 0;
        if (i24 >= 30) {
            systemBars = WindowInsets.Type.systemBars();
            insets = windowInsets.getInsets(systemBars);
            i4 = insets.top;
            gVar.f406h = i4;
            i5 = insets.right;
            gVar.f407i = i5;
            i6 = insets.bottom;
            gVar.f408j = i6;
            i7 = insets.left;
            gVar.f409k = i7;
            ime = WindowInsets.Type.ime();
            insets2 = windowInsets.getInsets(ime);
            i8 = insets2.top;
            gVar.f410l = i8;
            i9 = insets2.right;
            gVar.m = i9;
            i10 = insets2.bottom;
            gVar.f411n = i10;
            i11 = insets2.left;
            gVar.f412o = i11;
            systemGestures = WindowInsets.Type.systemGestures();
            insets3 = windowInsets.getInsets(systemGestures);
            i12 = insets3.top;
            gVar.f413p = i12;
            i13 = insets3.right;
            gVar.f414q = i13;
            i14 = insets3.bottom;
            gVar.f415r = i14;
            i15 = insets3.left;
            gVar.f416s = i15;
            displayCutout2 = windowInsets.getDisplayCutout();
            if (displayCutout2 != null) {
                waterfallInsets = displayCutout2.getWaterfallInsets();
                int i25 = gVar.f406h;
                i16 = waterfallInsets.top;
                int max = Math.max(i25, i16);
                safeInsetTop = displayCutout2.getSafeInsetTop();
                gVar.f406h = Math.max(max, safeInsetTop);
                int i26 = gVar.f407i;
                i17 = waterfallInsets.right;
                int max2 = Math.max(i26, i17);
                safeInsetRight = displayCutout2.getSafeInsetRight();
                gVar.f407i = Math.max(max2, safeInsetRight);
                int i27 = gVar.f408j;
                i18 = waterfallInsets.bottom;
                int max3 = Math.max(i27, i18);
                safeInsetBottom = displayCutout2.getSafeInsetBottom();
                gVar.f408j = Math.max(max3, safeInsetBottom);
                int i28 = gVar.f409k;
                i19 = waterfallInsets.left;
                int max4 = Math.max(i28, i19);
                safeInsetLeft = displayCutout2.getSafeInsetLeft();
                gVar.f409k = Math.max(max4, safeInsetLeft);
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
                    gVar.f406h = !z2 ? windowInsets.getSystemWindowInsetTop() : 0;
                    gVar.f407i = (c2 != 3 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetRight();
                    if (z3) {
                        d2 = 0.18d;
                    } else {
                        d2 = 0.18d;
                        if ((((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom()) == 0) {
                            i2 = windowInsets.getSystemWindowInsetBottom();
                            gVar.f408j = i2;
                            gVar.f409k = (c2 != 2 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
                            gVar.f410l = 0;
                            gVar.m = 0;
                            gVar.f411n = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * d2 ? 0 : windowInsets.getSystemWindowInsetBottom();
                            i3 = 0;
                            gVar.f412o = 0;
                        }
                    }
                    i2 = 0;
                    gVar.f408j = i2;
                    gVar.f409k = (c2 != 2 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
                    gVar.f410l = 0;
                    gVar.m = 0;
                    gVar.f411n = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * d2 ? 0 : windowInsets.getSystemWindowInsetBottom();
                    i3 = 0;
                    gVar.f412o = 0;
                }
            }
            c2 = 1;
            gVar.f406h = !z2 ? windowInsets.getSystemWindowInsetTop() : 0;
            gVar.f407i = (c2 != 3 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetRight();
            if (z3) {
            }
            i2 = 0;
            gVar.f408j = i2;
            gVar.f409k = (c2 != 2 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
            gVar.f410l = 0;
            gVar.m = 0;
            gVar.f411n = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * d2 ? 0 : windowInsets.getSystemWindowInsetBottom();
            i3 = 0;
            gVar.f412o = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (i24 >= 28 && displayCutout != null) {
            boundingRects2 = displayCutout.getBoundingRects();
            for (Rect rect : boundingRects2) {
                rect.toString();
                arrayList.add(new io.flutter.embedding.engine.renderer.a(rect, 4, 1));
            }
        }
        ArrayList arrayList2 = gVar.f421z;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (Build.VERSION.SDK_INT >= 35) {
            w wVar = this.B;
            Context context2 = getContext();
            wVar.getClass();
            Activity j2 = a.a.j(context2);
            WindowInsets windowInsets2 = null;
            if (j2 != null && (window = j2.getWindow()) != null) {
                windowInsets2 = window.getDecorView().getRootWindowInsets();
            }
            if (windowInsets2 == null) {
                boundingRects = Collections.EMPTY_LIST;
            } else {
                captionBar = WindowInsets.Type.captionBar();
                boundingRects = windowInsets2.getBoundingRects(captionBar);
            }
            int i29 = gVar.f406h;
            Iterator it = boundingRects.iterator();
            while (it.hasNext()) {
                i29 = Math.max(i29, ((Rect) it.next()).bottom);
            }
            gVar.f406h = i29;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            roundedCorner = windowInsets.getRoundedCorner(0);
            roundedCorner2 = windowInsets.getRoundedCorner(1);
            roundedCorner3 = windowInsets.getRoundedCorner(2);
            roundedCorner4 = windowInsets.getRoundedCorner(3);
            gVar.u = roundedCorner != null ? roundedCorner.getRadius() : i3;
            gVar.v = roundedCorner2 != null ? roundedCorner2.getRadius() : i3;
            gVar.f418w = roundedCorner3 != null ? roundedCorner3.getRadius() : i3;
            gVar.f419x = roundedCorner4 != null ? roundedCorner4.getRadius() : i3;
        }
        e();
        return onApplyWindowInsets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [v0.h] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        androidx.lifecycle.n nVar;
        super.onAttachedToWindow();
        v0.d dVar = null;
        try {
            w.g gVar = w.h.f1219a;
            Context context = getContext();
            gVar.getClass();
            nVar = new androidx.lifecycle.n(2, new c0.a(w.g.a(context)));
        } catch (NoClassDefFoundError unused) {
            nVar = null;
        }
        this.f228s = nVar;
        Activity j2 = a.a.j(getContext());
        androidx.lifecycle.n nVar2 = this.f228s;
        if (nVar2 == null || j2 == null) {
            return;
        }
        this.f232y = new q(0, this);
        Context context2 = getContext();
        Executor a2 = Build.VERSION.SDK_INT >= 28 ? g.a.a(context2) : new j.a(new Handler(context2.getMainLooper()));
        q qVar = this.f232y;
        c0.a aVar = (c0.a) nVar2.f40c;
        a2.getClass();
        qVar.getClass();
        c0.a aVar2 = (c0.a) aVar.f67d;
        w.b bVar = (w.b) aVar.f66c;
        bVar.getClass();
        o1.a aVar3 = new o1.a(bVar, j2, dVar, 1);
        v0.i iVar = v0.i.f1196b;
        n1.b bVar2 = new n1.b(aVar3, iVar, -2, 1);
        q1.d dVar2 = k1.y.f733a;
        l1.c cVar = p1.p.f1071a;
        if (cVar.j(k1.q.f713c) != null) {
            throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + cVar).toString());
        }
        if (!cVar.equals(iVar)) {
            v0.h h2 = cVar.h(iVar);
            if (!d1.h.a(h2, iVar)) {
                bVar2 = new n1.b(bVar2.f947e, h2, -2, 1);
            }
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) aVar2.f67d;
        ReentrantLock reentrantLock = (ReentrantLock) aVar2.f66c;
        reentrantLock.lock();
        try {
            if (linkedHashMap.get(qVar) == null) {
                k1.e0 e0Var = new k1.e0(a2);
                p1.e eVar = new p1.e(e0Var.j(k1.q.f713c) != null ? e0Var : a.a.r(e0Var, new k1.l0()));
                o1.b bVar3 = new o1.b(bVar2, qVar, null);
                k1.a u0Var = new u0(k1.t.e(eVar, iVar), true);
                u0Var.M(1, u0Var, bVar3);
                linkedHashMap.put(qVar, u0Var);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f219i != null) {
            this.f223n.b(configuration);
            d();
            a.a.c(getContext(), this.f219i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        if (r2.f834c != false) goto L32;
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
        io.flutter.plugin.editing.n nVar = this.f222l;
        h0 h0Var = this.f224o;
        io.flutter.plugin.editing.m mVar = nVar.f477e;
        int i3 = mVar.f471a;
        if (i3 == 1) {
            nVar.f482j = null;
            return null;
        }
        int i4 = 4;
        if (i3 == 4) {
            return null;
        }
        if (i3 == 3) {
            if (nVar.f487p) {
                return nVar.f482j;
            }
            nVar.f483k.q(mVar.f472b);
            throw null;
        }
        m0.o oVar = nVar.f478f;
        m0.p pVar = oVar.f826g;
        boolean z2 = oVar.f820a;
        boolean z3 = oVar.f821b;
        boolean z4 = oVar.f822c;
        boolean z5 = oVar.f823d;
        int i5 = oVar.f825f;
        int i6 = pVar.f832a;
        if (i6 != 2) {
            if (i6 == 5) {
                i4 = pVar.f833b ? 4098 : 2;
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
        int intValue = oVar.f827h.intValue();
        m0.o oVar2 = nVar.f478f;
        String str = oVar2.f828i;
        if (str != null) {
            editorInfo.actionLabel = str;
            editorInfo.actionId = intValue;
        }
        editorInfo.imeOptions = intValue | editorInfo.imeOptions;
        if (oVar2.m != null) {
            editorInfo.hintLocales = new LocaleList(nVar.f478f.m);
        }
        String[] strArr = nVar.f478f.f830k;
        if (strArr != null) {
            if (i8 >= 25) {
                editorInfo.contentMimeTypes = strArr;
            } else {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
                editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
            }
        }
        if (i8 >= 34) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
        }
        io.flutter.plugin.editing.d dVar = new io.flutter.plugin.editing.d(this, nVar.f477e.f472b, nVar.f476d, h0Var, nVar.f480h, editorInfo);
        io.flutter.plugin.editing.g gVar = nVar.f480h;
        gVar.getClass();
        editorInfo.initialSelStart = Selection.getSelectionStart(gVar);
        io.flutter.plugin.editing.g gVar2 = nVar.f480h;
        gVar2.getClass();
        editorInfo.initialSelEnd = Selection.getSelectionEnd(gVar2);
        nVar.f482j = dVar;
        return dVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        q qVar;
        androidx.lifecycle.n nVar = this.f228s;
        if (nVar != null && (qVar = this.f232y) != null) {
            c0.a aVar = (c0.a) ((c0.a) nVar.f40c).f67d;
            LinkedHashMap linkedHashMap = (LinkedHashMap) aVar.f67d;
            ReentrantLock reentrantLock = (ReentrantLock) aVar.f66c;
            reentrantLock.lock();
            try {
                k1.q0 q0Var = (k1.q0) linkedHashMap.get(qVar);
                if (q0Var != null) {
                    q0Var.g(null);
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        this.f232y = null;
        this.f228s = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (c()) {
            b bVar = this.f225p;
            Context context = getContext();
            bVar.getClass();
            boolean isFromSource = motionEvent.isFromSource(2);
            boolean z2 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
            if (isFromSource && z2) {
                int b2 = b.b(motionEvent.getActionMasked());
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
                allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                bVar.a(motionEvent, motionEvent.getActionIndex(), b2, 0, b.f123f, allocateDirect, context);
                if (allocateDirect.position() % 288 != 0) {
                    throw new AssertionError("Packet position is not on field boundary.");
                }
                bVar.f124a.f422a.dispatchPointerDataPacket(allocateDirect, allocateDirect.position());
                return true;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        return !c() ? super.onHoverEvent(motionEvent) : this.f226q.e(motionEvent, false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        this.f233z = View.MeasureSpec.getMode(i2);
        this.A = View.MeasureSpec.getMode(i3);
        super.onMeasure(i2, i3);
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i2) {
        Rect rect;
        super.onProvideAutofillVirtualStructure(viewStructure, i2);
        io.flutter.plugin.editing.n nVar = this.f222l;
        if (nVar == null || Build.VERSION.SDK_INT < 26 || nVar.f479g == null) {
            return;
        }
        String str = (String) nVar.f478f.f829j.f70a;
        AutofillId autofillId = viewStructure.getAutofillId();
        for (int i3 = 0; i3 < nVar.f479g.size(); i3++) {
            int keyAt = nVar.f479g.keyAt(i3);
            c0.e eVar = ((m0.o) nVar.f479g.valueAt(i3)).f829j;
            if (eVar != null) {
                viewStructure.addChildCount(1);
                ViewStructure newChild = viewStructure.newChild(i3);
                newChild.setAutofillId(autofillId, keyAt);
                String[] strArr = (String[]) eVar.f71b;
                if (strArr.length > 0) {
                    newChild.setAutofillHints(strArr);
                }
                newChild.setAutofillType(1);
                newChild.setVisibility(0);
                String str2 = (String) eVar.f73d;
                if (str2 != null) {
                    newChild.setHint(str2);
                }
                if (str.hashCode() != keyAt || (rect = nVar.m) == null) {
                    newChild.setDimens(0, 0, 0, 0, 1, 1);
                    newChild.setAutofillValue(AutofillValue.forText(((m0.q) eVar.f72c).f835a));
                } else {
                    newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), nVar.m.height());
                    newChild.setAutofillValue(AutofillValue.forText(nVar.f480h));
                }
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        io.flutter.embedding.engine.renderer.g gVar = this.f229t;
        gVar.f400b = i2;
        gVar.f401c = i3;
        boolean z2 = this.f211a;
        if (z2 && this.A == 0) {
            gVar.f404f = 0;
            gVar.f405g = 8192;
        } else {
            gVar.f404f = i3;
            gVar.f405g = i3;
        }
        if (z2 && this.f233z == 0) {
            gVar.f402d = 0;
            gVar.f403e = 8192;
        } else {
            gVar.f402d = i2;
            gVar.f403e = i2;
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
        b bVar = this.f225p;
        Matrix matrix = b.f123f;
        bVar.getClass();
        int actionMasked = motionEvent.getActionMasked();
        int b2 = b.b(motionEvent.getActionMasked());
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
            bVar.a(motionEvent, motionEvent.getActionIndex(), b2, 0, matrix, byteBuffer, null);
        } else {
            byteBuffer = allocateDirect;
            if (z3) {
                for (int i3 = 0; i3 < pointerCount; i3++) {
                    if (i3 != motionEvent.getActionIndex() && motionEvent.getToolType(i3) == 1) {
                        bVar.a(motionEvent, i3, 5, 1, matrix, byteBuffer, null);
                    }
                }
                bVar.a(motionEvent, motionEvent.getActionIndex(), b2, 0, matrix, byteBuffer, null);
                if (i2 != 0) {
                    bVar.a(motionEvent, motionEvent.getActionIndex(), 2, 0, matrix, byteBuffer, null);
                }
            } else {
                for (int i4 = 0; i4 < pointerCount; i4++) {
                    bVar.a(motionEvent, i4, b2, (pointerCount << 8) | 2, matrix, byteBuffer, null);
                }
            }
        }
        if (byteBuffer.position() % 288 != 0) {
            throw new AssertionError("Packet position is not on field boundary");
        }
        bVar.f124a.f422a.dispatchPointerDataPacket(byteBuffer, byteBuffer.position());
        return true;
    }

    public void setDelegate(w wVar) {
        this.B = wVar;
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        View view = this.f215e;
        if (view instanceof m) {
            ((m) view).setVisibility(i2);
        }
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.List] */
    public void setWindowInfoListenerDisplayFeatures(w.j jVar) {
        w.b bVar = w.b.f1200e;
        ?? r10 = jVar.f1222a;
        ArrayList arrayList = new ArrayList();
        for (w.c cVar : r10) {
            cVar.f1207a.a().toString();
            int i2 = 1;
            if (cVar instanceof w.c) {
                t.b bVar2 = cVar.f1207a;
                int i3 = ((bVar2.f1151c - bVar2.f1149a == 0 || bVar2.f1152d - bVar2.f1150b == 0) ? w.b.f1199d : bVar) == bVar ? 3 : 2;
                w.b bVar3 = cVar.f1209c;
                if (bVar3 == w.b.f1201f) {
                    i2 = 2;
                } else if (bVar3 == w.b.f1202g) {
                    i2 = 3;
                }
                arrayList.add(new io.flutter.embedding.engine.renderer.a(bVar2.a(), i3, i2));
            } else {
                arrayList.add(new io.flutter.embedding.engine.renderer.a(cVar.f1207a.a(), 1, 1));
            }
        }
        ArrayList arrayList2 = this.f229t.f420y;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        e();
    }

    public u(Context context, o oVar) {
        super(context, null);
        this.f211a = false;
        this.f217g = new HashSet();
        this.f220j = new HashSet();
        this.f229t = new io.flutter.embedding.engine.renderer.g();
        this.u = new androidx.lifecycle.n(1, this);
        this.v = new r(this, new Handler(Looper.getMainLooper()), 0);
        this.f230w = new s(this);
        this.f231x = new g(1, this);
        this.B = new w();
        this.f213c = oVar;
        this.f215e = oVar;
        b();
    }
}
