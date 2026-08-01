package E;

import a.AbstractC0016a;
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
import g.AbstractC0036a;
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
import k0.AbstractC0040a;
import k0.AbstractC0058t;
import k0.AbstractC0063y;
import k0.C0056q;
import k0.Y;
import m.AbstractC0068d;
import s.C0086a;
import u.C0088b;
import u.C0089c;
import u.C0093g;

/* loaded from: classes.dex */
public final class v extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final C0013n f190a;

    /* renamed from: b, reason: collision with root package name */
    public final C0015p f191b;

    /* renamed from: c, reason: collision with root package name */
    public C0011l f192c;

    /* renamed from: d, reason: collision with root package name */
    public View f193d;

    /* renamed from: e, reason: collision with root package name */
    public View f194e;

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f195f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f196g;

    /* renamed from: h, reason: collision with root package name */
    public F.c f197h;

    /* renamed from: i, reason: collision with root package name */
    public final HashSet f198i;

    /* renamed from: j, reason: collision with root package name */
    public A.a f199j;

    /* renamed from: k, reason: collision with root package name */
    public io.flutter.plugin.editing.m f200k;

    /* renamed from: l, reason: collision with root package name */
    public io.flutter.plugin.editing.h f201l;

    /* renamed from: m, reason: collision with root package name */
    public O.a f202m;

    /* renamed from: n, reason: collision with root package name */
    public D.b f203n;

    /* renamed from: o, reason: collision with root package name */
    public C0001b f204o;

    /* renamed from: p, reason: collision with root package name */
    public io.flutter.view.g f205p;

    /* renamed from: q, reason: collision with root package name */
    public TextServicesManager f206q;

    /* renamed from: r, reason: collision with root package name */
    public B.k f207r;

    /* renamed from: s, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.g f208s;
    public final B.k t;

    /* renamed from: u, reason: collision with root package name */
    public final t f209u;

    /* renamed from: v, reason: collision with root package name */
    public final C0005f f210v;

    /* renamed from: w, reason: collision with root package name */
    public s f211w;

    /* renamed from: x, reason: collision with root package name */
    public x f212x;

    public v(AbstractActivityC0004e abstractActivityC0004e, C0013n c0013n) {
        super(abstractActivityC0004e, null);
        this.f195f = new HashSet();
        this.f198i = new HashSet();
        this.f208s = new io.flutter.embedding.engine.renderer.g();
        this.t = new B.k(2, this);
        this.f209u = new t(this, new Handler(Looper.getMainLooper()), 0);
        this.f210v = new C0005f(1, this);
        this.f212x = new x();
        this.f190a = c0013n;
        this.f193d = c0013n;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v39, types: [android.view.View, io.flutter.embedding.engine.renderer.j] */
    public final void a() {
        SparseArray sparseArray;
        Objects.toString(this.f197h);
        if (!c()) {
            return;
        }
        Iterator it = this.f198i.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        getContext().getContentResolver().unregisterContentObserver(this.f209u);
        io.flutter.plugin.platform.j jVar = this.f197h.f241s;
        int i2 = 0;
        while (true) {
            SparseArray sparseArray2 = jVar.f731o;
            if (i2 >= sparseArray2.size()) {
                break;
            }
            jVar.f720d.removeView((io.flutter.plugin.platform.g) sparseArray2.valueAt(i2));
            i2++;
        }
        int i3 = 0;
        while (true) {
            SparseArray sparseArray3 = jVar.f729m;
            if (i3 >= sparseArray3.size()) {
                jVar.c();
                if (jVar.f720d == null) {
                    Log.e("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
                } else {
                    int i4 = 0;
                    while (true) {
                        sparseArray = jVar.f730n;
                        if (i4 >= sparseArray.size()) {
                            break;
                        }
                        jVar.f720d.removeView((View) sparseArray.valueAt(i4));
                        i4++;
                    }
                    sparseArray.clear();
                }
                jVar.f720d = null;
                jVar.f733q = false;
                SparseArray sparseArray4 = jVar.f728l;
                if (sparseArray4.size() > 0) {
                    sparseArray4.valueAt(0).getClass();
                    throw new ClassCastException();
                }
                io.flutter.plugin.platform.i iVar = this.f197h.t;
                int i5 = 0;
                while (true) {
                    SparseArray sparseArray5 = iVar.f712i;
                    if (i5 >= sparseArray5.size()) {
                        Surface surface = iVar.f715l;
                        if (surface != null) {
                            surface.release();
                            iVar.f715l = null;
                            iVar.f716m = null;
                        }
                        iVar.f707d = null;
                        SparseArray sparseArray6 = iVar.f711h;
                        if (sparseArray6.size() > 0) {
                            sparseArray6.valueAt(0).getClass();
                            throw new ClassCastException();
                        }
                        this.f197h.f241s.b();
                        this.f197h.t.b();
                        io.flutter.view.g gVar = this.f205p;
                        gVar.t = true;
                        gVar.f834e.b();
                        gVar.f847r = null;
                        AccessibilityManager accessibilityManager = gVar.f832c;
                        accessibilityManager.removeAccessibilityStateChangeListener(gVar.f850v);
                        accessibilityManager.removeTouchExplorationStateChangeListener(gVar.f851w);
                        gVar.f835f.unregisterContentObserver(gVar.f852x);
                        D.b bVar = gVar.f831b;
                        bVar.f101c = null;
                        ((FlutterJNI) bVar.f100b).setAccessibilityDelegate(null);
                        this.f205p = null;
                        this.f200k.f679b.restartInput(this);
                        this.f200k.b();
                        int size = ((HashSet) this.f203n.f100b).size();
                        if (size > 0) {
                            Log.w("KeyboardManager", "A KeyboardManager was destroyed with " + size + " unhandled redispatch event(s).");
                        }
                        io.flutter.plugin.editing.h hVar = this.f201l;
                        if (hVar != null) {
                            hVar.f660a.f44c = null;
                            SpellCheckerSession spellCheckerSession = hVar.f662c;
                            if (spellCheckerSession != null) {
                                spellCheckerSession.close();
                            }
                        }
                        A.a aVar = this.f199j;
                        if (aVar != null) {
                            ((B.k) aVar.f4d).f44c = null;
                        }
                        io.flutter.embedding.engine.renderer.h hVar2 = this.f197h.f224b;
                        this.f196g = false;
                        hVar2.c(this.f210v);
                        hVar2.e();
                        hVar2.f623a.setSemanticsEnabled(false);
                        View view = this.f194e;
                        if (view != null && this.f193d == this.f192c) {
                            this.f193d = view;
                        }
                        this.f193d.d();
                        C0011l c0011l = this.f192c;
                        if (c0011l != null) {
                            c0011l.f167a.close();
                            removeView(this.f192c);
                            this.f192c = null;
                        }
                        this.f194e = null;
                        this.f197h = null;
                        return;
                    }
                    if (sparseArray5.valueAt(i5) != null) {
                        throw new ClassCastException();
                    }
                    iVar.f707d.removeView(null);
                    i5++;
                }
            } else {
                if (sparseArray3.valueAt(i3) != null) {
                    throw new ClassCastException();
                }
                jVar.f720d.removeView(null);
                i3++;
            }
        }
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        A.e eVar;
        A.e eVar2;
        CharSequence textValue;
        io.flutter.plugin.editing.m mVar = this.f200k;
        if (Build.VERSION.SDK_INT < 26) {
            mVar.getClass();
            return;
        }
        M.n nVar = mVar.f683f;
        if (nVar == null || mVar.f684g == null || (eVar = nVar.f389j) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            M.n nVar2 = (M.n) mVar.f684g.get(sparseArray.keyAt(i2));
            if (nVar2 != null && (eVar2 = nVar2.f389j) != null) {
                textValue = AbstractC0000a.e(sparseArray.valueAt(i2)).getTextValue();
                String charSequence = textValue.toString();
                M.p pVar = new M.p(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                String str = (String) eVar2.f7b;
                if (str.equals((String) eVar.f7b)) {
                    mVar.f685h.f(pVar);
                } else {
                    hashMap.put(str, pVar);
                }
            }
        }
        int i3 = mVar.f682e.f677b;
        A.a aVar = mVar.f681d;
        aVar.getClass();
        String.valueOf(hashMap.size());
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            M.p pVar2 = (M.p) entry.getValue();
            hashMap2.put((String) entry.getKey(), A.a.n(pVar2.f396a, pVar2.f397b, pVar2.f398c, -1, -1));
        }
        ((A.e) aVar.f3c).h("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i3), hashMap2), null);
    }

    public final void b() {
        C0013n c0013n = this.f190a;
        if (c0013n != null) {
            addView(c0013n);
        } else {
            C0015p c0015p = this.f191b;
            if (c0015p != null) {
                addView(c0015p);
            } else {
                addView(this.f192c);
            }
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.j] */
    public final boolean c() {
        F.c cVar = this.f197h;
        if (cVar != null) {
            if (cVar.f224b == this.f193d.getAttachedRenderer()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean checkInputConnectionProxy(View view) {
        F.c cVar = this.f197h;
        if (cVar == null) {
            return super.checkInputConnectionProxy(view);
        }
        io.flutter.plugin.platform.j jVar = cVar.f241s;
        if (view == null) {
            jVar.getClass();
            return false;
        }
        HashMap hashMap = jVar.f727k;
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
    /* JADX WARN: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        boolean z;
        A.e eVar;
        HashMap hashMap;
        String str;
        List enabledSpellCheckerInfos;
        boolean z2;
        boolean isSpellCheckerEnabled;
        char c2 = (getResources().getConfiguration().uiMode & 48) == 32 ? (char) 2 : (char) 1;
        TextServicesManager textServicesManager = this.f206q;
        if (textServicesManager != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                enabledSpellCheckerInfos = textServicesManager.getEnabledSpellCheckerInfos();
                Iterator it = enabledSpellCheckerInfos.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z2 = false;
                        break;
                    } else if (((SpellCheckerInfo) it.next()).getPackageName().equals("com.google.android.inputmethod.latin")) {
                        z2 = true;
                        break;
                    }
                }
                isSpellCheckerEnabled = this.f206q.isSpellCheckerEnabled();
                if (isSpellCheckerEnabled) {
                }
            }
            z = true;
            eVar = this.f197h.f237o.f379a;
            hashMap = new HashMap();
            hashMap.put("textScaleFactor", Float.valueOf(getResources().getConfiguration().fontScale));
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            hashMap.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z));
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
                eVar.j(hashMap, null);
            }
            M.l lVar = new M.l(displayMetrics);
            D.b bVar = M.m.f378b;
            ((ConcurrentLinkedQueue) bVar.f99a).add(lVar);
            M.l lVar2 = (M.l) bVar.f101c;
            bVar.f101c = lVar;
            A.a aVar = lVar2 != null ? new A.a(bVar, lVar2, 8, false) : null;
            hashMap.put("configurationId", Integer.valueOf(lVar.f376a));
            eVar.j(hashMap, aVar);
            return;
        }
        z = false;
        eVar = this.f197h.f237o.f379a;
        hashMap = new HashMap();
        hashMap.put("textScaleFactor", Float.valueOf(getResources().getConfiguration().fontScale));
        DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
        hashMap.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z));
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
        eVar.j(hashMap, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (c() && this.f203n.d(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    public final void e() {
        if (!c()) {
            Log.w("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        float f2 = getResources().getDisplayMetrics().density;
        io.flutter.embedding.engine.renderer.g gVar = this.f208s;
        gVar.f605a = f2;
        gVar.f620p = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        io.flutter.embedding.engine.renderer.h hVar = this.f197h.f224b;
        hVar.getClass();
        if (gVar.f606b <= 0 || gVar.f607c <= 0 || gVar.f605a <= 0.0f) {
            return;
        }
        ArrayList arrayList = gVar.f621q;
        arrayList.size();
        ArrayList arrayList2 = gVar.f622r;
        arrayList2.size();
        int size = arrayList2.size() + arrayList.size();
        int[] iArr = new int[size * 4];
        int[] iArr2 = new int[size];
        int[] iArr3 = new int[size];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            io.flutter.embedding.engine.renderer.a aVar = (io.flutter.embedding.engine.renderer.a) arrayList.get(i2);
            int i3 = i2 * 4;
            Rect rect = aVar.f592a;
            iArr[i3] = rect.left;
            iArr[i3 + 1] = rect.top;
            iArr[i3 + 2] = rect.right;
            iArr[i3 + 3] = rect.bottom;
            iArr2[i2] = AbstractC0068d.a(aVar.f593b);
            iArr3[i2] = AbstractC0068d.a(aVar.f594c);
        }
        int size2 = arrayList.size() * 4;
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            io.flutter.embedding.engine.renderer.a aVar2 = (io.flutter.embedding.engine.renderer.a) arrayList2.get(i4);
            int i5 = (i4 * 4) + size2;
            Rect rect2 = aVar2.f592a;
            iArr[i5] = rect2.left;
            iArr[i5 + 1] = rect2.top;
            iArr[i5 + 2] = rect2.right;
            iArr[i5 + 3] = rect2.bottom;
            iArr2[arrayList.size() + i4] = AbstractC0068d.a(aVar2.f593b);
            iArr3[arrayList.size() + i4] = AbstractC0068d.a(aVar2.f594c);
        }
        hVar.f623a.setViewportMetrics(gVar.f605a, gVar.f606b, gVar.f607c, gVar.f608d, gVar.f609e, gVar.f610f, gVar.f611g, gVar.f612h, gVar.f613i, gVar.f614j, gVar.f615k, gVar.f616l, gVar.f617m, gVar.f618n, gVar.f619o, gVar.f620p, iArr, iArr2, iArr3);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.g gVar = this.f205p;
        if (gVar == null || !gVar.f832c.isEnabled()) {
            return null;
        }
        return this.f205p;
    }

    public F.c getAttachedFlutterEngine() {
        return this.f197h;
    }

    public N.f getBinaryMessenger() {
        return this.f197h.f225c;
    }

    public C0011l getCurrentImageSurface() {
        return this.f192c;
    }

    public io.flutter.embedding.engine.renderer.g getViewportMetrics() {
        return this.f208s;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x01b0, code lost:
    
        r1 = r16.getDisplayCutout();
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013c  */
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
        io.flutter.embedding.engine.renderer.g gVar = this.f208s;
        if (i23 == 29) {
            systemGestureInsets = windowInsets.getSystemGestureInsets();
            i19 = systemGestureInsets.top;
            gVar.f616l = i19;
            i20 = systemGestureInsets.right;
            gVar.f617m = i20;
            i21 = systemGestureInsets.bottom;
            gVar.f618n = i21;
            i22 = systemGestureInsets.left;
            gVar.f619o = i22;
        }
        boolean z = (getWindowSystemUiVisibility() & 4) == 0;
        boolean z2 = (getWindowSystemUiVisibility() & 2) == 0;
        if (i23 >= 30) {
            systemBars = WindowInsets.Type.systemBars();
            insets = windowInsets.getInsets(systemBars);
            i3 = insets.top;
            gVar.f608d = i3;
            i4 = insets.right;
            gVar.f609e = i4;
            i5 = insets.bottom;
            gVar.f610f = i5;
            i6 = insets.left;
            gVar.f611g = i6;
            ime = WindowInsets.Type.ime();
            insets2 = windowInsets.getInsets(ime);
            i7 = insets2.top;
            gVar.f612h = i7;
            i8 = insets2.right;
            gVar.f613i = i8;
            i9 = insets2.bottom;
            gVar.f614j = i9;
            i10 = insets2.left;
            gVar.f615k = i10;
            systemGestures = WindowInsets.Type.systemGestures();
            insets3 = windowInsets.getInsets(systemGestures);
            i11 = insets3.top;
            gVar.f616l = i11;
            i12 = insets3.right;
            gVar.f617m = i12;
            i13 = insets3.bottom;
            gVar.f618n = i13;
            i14 = insets3.left;
            gVar.f619o = i14;
            displayCutout2 = windowInsets.getDisplayCutout();
            if (displayCutout2 != null) {
                waterfallInsets = displayCutout2.getWaterfallInsets();
                int i24 = gVar.f608d;
                i15 = waterfallInsets.top;
                int max = Math.max(i24, i15);
                safeInsetTop = displayCutout2.getSafeInsetTop();
                gVar.f608d = Math.max(max, safeInsetTop);
                int i25 = gVar.f609e;
                i16 = waterfallInsets.right;
                int max2 = Math.max(i25, i16);
                safeInsetRight = displayCutout2.getSafeInsetRight();
                gVar.f609e = Math.max(max2, safeInsetRight);
                int i26 = gVar.f610f;
                i17 = waterfallInsets.bottom;
                int max3 = Math.max(i26, i17);
                safeInsetBottom = displayCutout2.getSafeInsetBottom();
                gVar.f610f = Math.max(max3, safeInsetBottom);
                int i27 = gVar.f611g;
                i18 = waterfallInsets.left;
                int max4 = Math.max(i27, i18);
                safeInsetLeft = displayCutout2.getSafeInsetLeft();
                gVar.f611g = Math.max(max4, safeInsetLeft);
            }
        } else {
            if (!z2) {
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
                    gVar.f608d = !z ? windowInsets.getSystemWindowInsetTop() : 0;
                    gVar.f609e = (c2 != 3 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetRight();
                    if (z2) {
                        if ((((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom()) == 0) {
                            i2 = windowInsets.getSystemWindowInsetBottom();
                            gVar.f610f = i2;
                            gVar.f611g = (c2 != 2 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
                            gVar.f612h = 0;
                            gVar.f613i = 0;
                            gVar.f614j = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom();
                            gVar.f615k = 0;
                        }
                    }
                    i2 = 0;
                    gVar.f610f = i2;
                    gVar.f611g = (c2 != 2 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
                    gVar.f612h = 0;
                    gVar.f613i = 0;
                    gVar.f614j = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom();
                    gVar.f615k = 0;
                }
            }
            c2 = 1;
            gVar.f608d = !z ? windowInsets.getSystemWindowInsetTop() : 0;
            gVar.f609e = (c2 != 3 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetRight();
            if (z2) {
            }
            i2 = 0;
            gVar.f610f = i2;
            gVar.f611g = (c2 != 2 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
            gVar.f612h = 0;
            gVar.f613i = 0;
            gVar.f614j = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom();
            gVar.f615k = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (i23 >= 28 && displayCutout != null) {
            boundingRects2 = displayCutout.getBoundingRects();
            for (Rect rect : boundingRects2) {
                rect.toString();
                arrayList.add(new io.flutter.embedding.engine.renderer.a(rect, 4, 1));
            }
        }
        ArrayList arrayList2 = gVar.f622r;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (Build.VERSION.SDK_INT >= 35) {
            x xVar = this.f212x;
            Context context2 = getContext();
            xVar.getClass();
            Activity l2 = AbstractC0016a.l(context2);
            WindowInsets windowInsets2 = null;
            if (l2 != null && (window = l2.getWindow()) != null) {
                windowInsets2 = window.getDecorView().getRootWindowInsets();
            }
            if (windowInsets2 == null) {
                boundingRects = Collections.emptyList();
            } else {
                captionBar = WindowInsets.Type.captionBar();
                boundingRects = windowInsets2.getBoundingRects(captionBar);
            }
            int i28 = gVar.f608d;
            Iterator it = boundingRects.iterator();
            while (it.hasNext()) {
                i28 = Math.max(i28, ((Rect) it.next()).bottom);
            }
            gVar.f608d = i28;
        }
        e();
        return onApplyWindowInsets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v5, types: [W.i] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        B.k kVar;
        W.j jVar = W.j.f449b;
        super.onAttachedToWindow();
        try {
            C0093g c0093g = u.h.f1280a;
            Context context = getContext();
            c0093g.getClass();
            kVar = new B.k(3, new A.a(C0093g.a(context)));
        } catch (NoClassDefFoundError unused) {
            kVar = null;
        }
        this.f207r = kVar;
        Activity l2 = AbstractC0016a.l(getContext());
        B.k kVar2 = this.f207r;
        if (kVar2 == null || l2 == null) {
            return;
        }
        this.f211w = new s(0, this);
        Context context2 = getContext();
        Executor a2 = Build.VERSION.SDK_INT >= 28 ? AbstractC0036a.a(context2) : new j.a(new Handler(context2.getMainLooper()));
        s sVar = this.f211w;
        A.a aVar = (A.a) kVar2.f44c;
        e0.h.e(a2, "executor");
        e0.h.e(sVar, "consumer");
        C0088b c0088b = (C0088b) aVar.f3c;
        c0088b.getClass();
        n0.b bVar = new n0.b(new u.j(c0088b, l2, null), jVar, -2, 1);
        q0.d dVar = AbstractC0063y.f950a;
        l0.c cVar = p0.p.f1172a;
        if (cVar.k(C0056q.f936c) != null) {
            throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + cVar).toString());
        }
        if (!cVar.equals(jVar)) {
            W.i c2 = cVar.c(jVar);
            if (!e0.h.a(c2, jVar)) {
                bVar = new n0.b(bVar.f1090f, c2, -2, 1);
            }
        }
        A.a aVar2 = (A.a) aVar.f4d;
        aVar2.getClass();
        ReentrantLock reentrantLock = (ReentrantLock) aVar2.f3c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = (LinkedHashMap) aVar2.f4d;
        try {
            if (linkedHashMap.get(sVar) == null) {
                k0.F f2 = new k0.F(a2);
                p0.e eVar = new p0.e(f2.k(C0056q.f936c) != null ? f2 : AbstractC0016a.w(f2, new k0.N(null)));
                C0086a c0086a = new C0086a(bVar, sVar, null);
                AbstractC0040a y2 = new Y(AbstractC0058t.f(eVar, jVar), true);
                y2.M(1, y2, c0086a);
                linkedHashMap.put(sVar, y2);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f197h != null) {
            this.f202m.b(configuration);
            d();
            AbstractC0016a.d(getContext(), this.f197h);
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
        io.flutter.plugin.editing.m mVar = this.f200k;
        D.b bVar = this.f203n;
        io.flutter.plugin.editing.l lVar = mVar.f682e;
        int i5 = lVar.f676a;
        if (i5 == 1) {
            mVar.f687j = null;
            return null;
        }
        int i6 = 4;
        if (i5 == 4) {
            return null;
        }
        if (i5 == 3) {
            if (mVar.f693p) {
                return mVar.f687j;
            }
            mVar.f688k.f(lVar.f677b);
            throw null;
        }
        M.n nVar = mVar.f683f;
        M.o oVar = nVar.f386g;
        int i7 = oVar.f393a;
        if (i7 != 2) {
            if (i7 == 5) {
                int i8 = oVar.f394b ? 4098 : 2;
                if (oVar.f395c) {
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
                if (!nVar.f380a) {
                    if (nVar.f381b) {
                        i2 |= 32768;
                    }
                    i4 = nVar.f382c ? 524416 : 524432;
                    i3 = nVar.f385f;
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
                i3 = nVar.f385f;
                if (i3 != 1) {
                }
                i6 = i2;
            }
        }
        editorInfo.inputType = i6;
        editorInfo.imeOptions = 33554432;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 26 && !nVar.f383d) {
            editorInfo.imeOptions = 50331648;
        }
        int intValue = nVar.f387h.intValue();
        M.n nVar2 = mVar.f683f;
        String str = nVar2.f388i;
        if (str != null) {
            editorInfo.actionLabel = str;
            editorInfo.actionId = intValue;
        }
        editorInfo.imeOptions = intValue | editorInfo.imeOptions;
        if (nVar2.f392m != null) {
            editorInfo.hintLocales = new LocaleList(mVar.f683f.f392m);
        }
        String[] strArr = mVar.f683f.f390k;
        if (strArr != null) {
            editorInfo.contentMimeTypes = strArr;
        }
        if (i9 >= 34) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
        }
        io.flutter.plugin.editing.d dVar = new io.flutter.plugin.editing.d(this, mVar.f682e.f677b, mVar.f681d, bVar, mVar.f685h, editorInfo);
        io.flutter.plugin.editing.g gVar = mVar.f685h;
        gVar.getClass();
        editorInfo.initialSelStart = Selection.getSelectionStart(gVar);
        io.flutter.plugin.editing.g gVar2 = mVar.f685h;
        gVar2.getClass();
        editorInfo.initialSelEnd = Selection.getSelectionEnd(gVar2);
        mVar.f687j = dVar;
        return dVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        s sVar;
        B.k kVar = this.f207r;
        if (kVar != null && (sVar = this.f211w) != null) {
            A.a aVar = (A.a) ((A.a) kVar.f44c).f4d;
            aVar.getClass();
            ReentrantLock reentrantLock = (ReentrantLock) aVar.f3c;
            reentrantLock.lock();
            LinkedHashMap linkedHashMap = (LinkedHashMap) aVar.f4d;
            try {
                k0.K k2 = (k0.K) linkedHashMap.get(sVar);
                if (k2 != null) {
                    k2.a(null);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        this.f211w = null;
        this.f207r = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (c()) {
            C0001b c0001b = this.f204o;
            Context context = getContext();
            c0001b.getClass();
            boolean isFromSource = motionEvent.isFromSource(2);
            boolean z = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
            if (isFromSource && z) {
                int b2 = C0001b.b(motionEvent.getActionMasked());
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
                allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                c0001b.a(motionEvent, motionEvent.getActionIndex(), b2, 0, C0001b.f138f, allocateDirect, context);
                if (allocateDirect.position() % 288 != 0) {
                    throw new AssertionError("Packet position is not on field boundary.");
                }
                c0001b.f139a.f623a.dispatchPointerDataPacket(allocateDirect, allocateDirect.position());
                return true;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        return !c() ? super.onHoverEvent(motionEvent) : this.f205p.e(motionEvent, false);
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i2) {
        Rect rect;
        super.onProvideAutofillVirtualStructure(viewStructure, i2);
        io.flutter.plugin.editing.m mVar = this.f200k;
        if (Build.VERSION.SDK_INT < 26) {
            mVar.getClass();
            return;
        }
        if (mVar.f684g != null) {
            String str = (String) mVar.f683f.f389j.f7b;
            AutofillId autofillId = viewStructure.getAutofillId();
            for (int i3 = 0; i3 < mVar.f684g.size(); i3++) {
                int keyAt = mVar.f684g.keyAt(i3);
                A.e eVar = ((M.n) mVar.f684g.valueAt(i3)).f389j;
                if (eVar != null) {
                    viewStructure.addChildCount(1);
                    ViewStructure newChild = viewStructure.newChild(i3);
                    newChild.setAutofillId(autofillId, keyAt);
                    String[] strArr = (String[]) eVar.f8c;
                    if (strArr.length > 0) {
                        newChild.setAutofillHints(strArr);
                    }
                    newChild.setAutofillType(1);
                    newChild.setVisibility(0);
                    String str2 = (String) eVar.f10e;
                    if (str2 != null) {
                        newChild.setHint(str2);
                    }
                    if (str.hashCode() != keyAt || (rect = mVar.f690m) == null) {
                        newChild.setDimens(0, 0, 0, 0, 1, 1);
                        newChild.setAutofillValue(AutofillValue.forText(((M.p) eVar.f9d).f396a));
                    } else {
                        newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), mVar.f690m.height());
                        newChild.setAutofillValue(AutofillValue.forText(mVar.f685h));
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        io.flutter.embedding.engine.renderer.g gVar = this.f208s;
        gVar.f606b = i2;
        gVar.f607c = i3;
        e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        if (r4 != 4) goto L30;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ByteBuffer byteBuffer;
        int i2;
        ByteBuffer byteBuffer2;
        if (!c()) {
            return super.onTouchEvent(motionEvent);
        }
        requestUnbufferedDispatch(motionEvent);
        C0001b c0001b = this.f204o;
        Matrix matrix = C0001b.f138f;
        c0001b.getClass();
        int actionMasked = motionEvent.getActionMasked();
        int b2 = C0001b.b(motionEvent.getActionMasked());
        char c2 = 5;
        boolean z = actionMasked == 0 || actionMasked == 5;
        boolean z2 = !z && (actionMasked == 1 || actionMasked == 6);
        int toolType = motionEvent.getToolType(motionEvent.getActionIndex());
        if (toolType != 1) {
            char c3 = 2;
            if (toolType != 2) {
                c3 = 3;
                if (toolType == 3) {
                    c2 = 1;
                }
            }
            c2 = c3;
        } else {
            c2 = 0;
        }
        int i3 = (z2 && c2 == 0) ? 1 : 0;
        int pointerCount = motionEvent.getPointerCount();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((pointerCount + i3) * 288);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        if (z) {
            c0001b.a(motionEvent, motionEvent.getActionIndex(), b2, 0, matrix, allocateDirect, null);
            byteBuffer = allocateDirect;
        } else if (z2) {
            int i4 = 0;
            while (i4 < pointerCount) {
                if (i4 == motionEvent.getActionIndex() || motionEvent.getToolType(i4) != 1) {
                    i2 = i4;
                    byteBuffer2 = allocateDirect;
                } else {
                    i2 = i4;
                    byteBuffer2 = allocateDirect;
                    c0001b.a(motionEvent, i4, 5, 1, matrix, allocateDirect, null);
                }
                i4 = i2 + 1;
                allocateDirect = byteBuffer2;
            }
            byteBuffer = allocateDirect;
            c0001b.a(motionEvent, motionEvent.getActionIndex(), b2, 0, matrix, byteBuffer, null);
            if (i3 != 0) {
                c0001b.a(motionEvent, motionEvent.getActionIndex(), 2, 0, matrix, byteBuffer, null);
            }
        } else {
            byteBuffer = allocateDirect;
            for (int i5 = 0; i5 < pointerCount; i5++) {
                c0001b.a(motionEvent, i5, b2, 0, matrix, byteBuffer, null);
            }
        }
        if (byteBuffer.position() % 288 != 0) {
            throw new AssertionError("Packet position is not on field boundary");
        }
        c0001b.f139a.f623a.dispatchPointerDataPacket(byteBuffer, byteBuffer.position());
        return true;
    }

    public void setDelegate(x xVar) {
        this.f212x = xVar;
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        View view = this.f193d;
        if (view instanceof C0013n) {
            ((C0013n) view).setVisibility(i2);
        }
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    public void setWindowInfoListenerDisplayFeatures(u.k kVar) {
        ?? r8 = kVar.f1287a;
        ArrayList arrayList = new ArrayList();
        for (C0089c c0089c : r8) {
            c0089c.f1268a.c().toString();
            r.b bVar = c0089c.f1268a;
            int b2 = bVar.b();
            C0088b c0088b = C0088b.f1261e;
            int i2 = 2;
            int i3 = ((b2 == 0 || bVar.a() == 0) ? C0088b.f1260d : c0088b) == c0088b ? 3 : 2;
            C0088b c0088b2 = C0088b.f1262f;
            C0088b c0088b3 = c0089c.f1270c;
            if (c0088b3 != c0088b2) {
                i2 = c0088b3 == C0088b.f1263g ? 3 : 1;
            }
            arrayList.add(new io.flutter.embedding.engine.renderer.a(bVar.c(), i3, i2));
        }
        ArrayList arrayList2 = this.f208s.f621q;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        e();
    }

    public v(AbstractActivityC0004e abstractActivityC0004e, C0015p c0015p) {
        super(abstractActivityC0004e, null);
        this.f195f = new HashSet();
        this.f198i = new HashSet();
        this.f208s = new io.flutter.embedding.engine.renderer.g();
        this.t = new B.k(2, this);
        this.f209u = new t(this, new Handler(Looper.getMainLooper()), 0);
        this.f210v = new C0005f(1, this);
        this.f212x = new x();
        this.f191b = c0015p;
        this.f193d = c0015p;
        b();
    }
}
