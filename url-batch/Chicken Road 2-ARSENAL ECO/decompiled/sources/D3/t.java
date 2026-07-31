package D3;

import D.C0102o;
import H5.AbstractC0165z;
import H5.C0162w;
import H5.S;
import H5.X;
import a.AbstractC0219a;
import a1.AbstractC0223a;
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
import c0.C0269b;
import d0.C0315b;
import e3.AbstractC0345b;
import f0.C0362b;
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
import o5.C0570j;
import u.AbstractC0670e;
import u0.C0673c;
import u0.C0675e;
import u0.C0684n;
import u0.C0689s;

/* loaded from: classes.dex */
public final class t extends FrameLayout implements Q3.a, E {

    /* renamed from: A, reason: collision with root package name */
    public final q f464A;

    /* renamed from: B, reason: collision with root package name */
    public final r f465B;

    /* renamed from: C, reason: collision with root package name */
    public final C0118f f466C;

    /* renamed from: D, reason: collision with root package name */
    public p f467D;

    /* renamed from: E, reason: collision with root package name */
    public int f468E;

    /* renamed from: F, reason: collision with root package name */
    public int f469F;

    /* renamed from: G, reason: collision with root package name */
    public v f470G;

    /* renamed from: f, reason: collision with root package name */
    public boolean f471f;

    /* renamed from: g, reason: collision with root package name */
    public final C0124l f472g;

    /* renamed from: h, reason: collision with root package name */
    public final C0126n f473h;

    /* renamed from: i, reason: collision with root package name */
    public C0122j f474i;

    /* renamed from: j, reason: collision with root package name */
    public View f475j;

    /* renamed from: k, reason: collision with root package name */
    public View f476k;

    /* renamed from: l, reason: collision with root package name */
    public final HashSet f477l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f478m;

    /* renamed from: n, reason: collision with root package name */
    public E3.c f479n;

    /* renamed from: o, reason: collision with root package name */
    public final HashSet f480o;

    /* renamed from: p, reason: collision with root package name */
    public C0675e f481p;

    /* renamed from: q, reason: collision with root package name */
    public io.flutter.plugin.editing.i f482q;

    /* renamed from: r, reason: collision with root package name */
    public io.flutter.plugin.editing.g f483r;

    /* renamed from: s, reason: collision with root package name */
    public P3.a f484s;

    /* renamed from: t, reason: collision with root package name */
    public B0.c f485t;

    /* renamed from: u, reason: collision with root package name */
    public C0113a f486u;

    /* renamed from: v, reason: collision with root package name */
    public io.flutter.view.i f487v;

    /* renamed from: w, reason: collision with root package name */
    public TextServicesManager f488w;

    /* renamed from: x, reason: collision with root package name */
    public M f489x;
    public final io.flutter.embedding.engine.renderer.g y;

    /* renamed from: z, reason: collision with root package name */
    public final J1.c f490z;

    public t(AbstractActivityC0117e abstractActivityC0117e, C0124l c0124l) {
        super(abstractActivityC0117e, null);
        this.f471f = false;
        this.f477l = new HashSet();
        this.f480o = new HashSet();
        this.y = new io.flutter.embedding.engine.renderer.g();
        this.f490z = new J1.c(1, this);
        this.f464A = new q(this, new Handler(Looper.getMainLooper()), 0);
        this.f465B = new r(this);
        this.f466C = new C0118f(1, this);
        this.f470G = new v();
        this.f472g = c0124l;
        this.f475j = c0124l;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v38, types: [android.view.View, io.flutter.embedding.engine.renderer.k] */
    public final void a() {
        Objects.toString(this.f479n);
        if (c()) {
            Iterator it = this.f480o.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            getContext().getContentResolver().unregisterContentObserver(this.f464A);
            io.flutter.plugin.platform.l lVar = this.f479n.f618s;
            SparseArray sparseArray = lVar.f4585p;
            SparseArray sparseArray2 = lVar.f4586q;
            SparseArray sparseArray3 = lVar.f4588s;
            for (int i7 = 0; i7 < sparseArray3.size(); i7++) {
                lVar.f4577h.removeView((io.flutter.plugin.platform.h) sparseArray3.valueAt(i7));
            }
            for (int i8 = 0; i8 < sparseArray2.size(); i8++) {
                if (sparseArray2.valueAt(i8) != null) {
                    throw new ClassCastException();
                }
                lVar.f4577h.removeView(null);
            }
            lVar.b();
            SparseArray sparseArray4 = lVar.f4587r;
            if (lVar.f4577h == null) {
                Log.e("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
            } else {
                for (int i9 = 0; i9 < sparseArray4.size(); i9++) {
                    lVar.f4577h.removeView((View) sparseArray4.valueAt(i9));
                }
                sparseArray4.clear();
            }
            lVar.f4577h = null;
            lVar.f4590u = false;
            if (sparseArray.size() > 0) {
                sparseArray.valueAt(0).getClass();
                throw new ClassCastException();
            }
            io.flutter.plugin.platform.k kVar = this.f479n.f619t;
            SparseArray sparseArray5 = kVar.f4567l;
            SparseArray sparseArray6 = kVar.f4568m;
            for (int i10 = 0; i10 < sparseArray6.size(); i10++) {
                if (sparseArray6.valueAt(i10) != null) {
                    throw new ClassCastException();
                }
                kVar.f4563h.removeView(null);
            }
            Surface surface = kVar.f4571p;
            if (surface != null) {
                surface.release();
                kVar.f4571p = null;
                kVar.f4572q = null;
            }
            kVar.f4563h = null;
            if (sparseArray5.size() > 0) {
                sparseArray5.valueAt(0).getClass();
                throw new ClassCastException();
            }
            this.f479n.f618s.k();
            this.f479n.f619t.k();
            io.flutter.view.i iVar = this.f487v;
            iVar.f4715t = true;
            iVar.f4700e.k();
            iVar.f4713r = null;
            AccessibilityManager accessibilityManager = iVar.f4698c;
            accessibilityManager.removeAccessibilityStateChangeListener(iVar.f4716u);
            accessibilityManager.removeTouchExplorationStateChangeListener(iVar.f4717v);
            iVar.f4701f.unregisterContentObserver(iVar.f4718w);
            B0.c cVar = iVar.f4697b;
            cVar.f71g = null;
            ((FlutterJNI) cVar.f73i).setAccessibilityDelegate(null);
            this.f487v = null;
            this.f482q.f4534b.restartInput(this);
            this.f482q.b();
            int size = ((HashSet) this.f485t.f73i).size();
            if (size > 0) {
                Log.w("KeyboardManager", "A KeyboardManager was destroyed with " + size + " unhandled redispatch event(s).");
            }
            io.flutter.plugin.editing.g gVar = this.f483r;
            if (gVar != null) {
                gVar.f4521a.f1289g = null;
                SpellCheckerSession spellCheckerSession = gVar.f4523c;
                if (spellCheckerSession != null) {
                    spellCheckerSession.close();
                }
            }
            C0675e c0675e = this.f481p;
            if (c0675e != null) {
                ((J1.c) c0675e.f5976c).f1289g = null;
            }
            io.flutter.embedding.engine.renderer.h hVar = this.f479n.f601b;
            this.f478m = false;
            hVar.c(this.f466C);
            FlutterJNI flutterJNI = hVar.f4486a;
            if (this.f471f) {
                flutterJNI.removeResizingFlutterUiListener(this.f465B);
            }
            hVar.e();
            flutterJNI.setSemanticsEnabled(false);
            View view = this.f476k;
            if (view != null && this.f475j == this.f474i) {
                this.f475j = view;
            }
            this.f475j.a();
            C0122j c0122j = this.f474i;
            if (c0122j != null) {
                c0122j.f437f.close();
                removeView(this.f474i);
                this.f474i = null;
            }
            this.f476k = null;
            this.f479n = null;
        }
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        N3.n nVar;
        C0684n c0684n;
        C0684n c0684n2;
        CharSequence textValue;
        io.flutter.plugin.editing.i iVar = this.f482q;
        if (iVar == null || Build.VERSION.SDK_INT < 26 || (nVar = iVar.f4538f) == null || iVar.f4539g == null || (c0684n = nVar.f1741j) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (int i7 = 0; i7 < sparseArray.size(); i7++) {
            N3.n nVar2 = (N3.n) iVar.f4539g.get(sparseArray.keyAt(i7));
            if (nVar2 != null && (c0684n2 = nVar2.f1741j) != null) {
                String str = (String) c0684n2.f5994g;
                textValue = AbstractC0345b.e(sparseArray.valueAt(i7)).getTextValue();
                String charSequence = textValue.toString();
                N3.p pVar = new N3.p(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                if (str.equals((String) c0684n.f5994g)) {
                    iVar.f4540h.f(pVar);
                } else {
                    hashMap.put(str, pVar);
                }
            }
        }
        C0675e c0675e = iVar.f4536d;
        int i8 = iVar.f4537e.f300b;
        c0675e.getClass();
        hashMap.size();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            N3.p pVar2 = (N3.p) entry.getValue();
            hashMap2.put((String) entry.getKey(), C0675e.d(pVar2.f1748a, pVar2.f1749b, pVar2.f1750c, -1, -1));
        }
        ((B0.c) c0675e.f5975b).q("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i8), hashMap2), null);
    }

    public final void b() {
        C0124l c0124l = this.f472g;
        if (c0124l != null) {
            addView(c0124l);
        } else {
            C0126n c0126n = this.f473h;
            if (c0126n != null) {
                addView(c0126n);
            } else {
                addView(this.f474i);
            }
        }
        this.f471f = AbstractC0219a.v(getContext());
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.k] */
    public final boolean c() {
        E3.c cVar = this.f479n;
        return cVar != null && cVar.f601b == this.f475j.getAttachedRenderer();
    }

    @Override // android.view.View
    public final boolean checkInputConnectionProxy(View view) {
        E3.c cVar = this.f479n;
        if (cVar == null) {
            return super.checkInputConnectionProxy(view);
        }
        HashMap hashMap = cVar.f618s.f4584o;
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
        boolean z5;
        B0.c cVar;
        HashMap hashMap;
        String str;
        List enabledSpellCheckerInfos;
        boolean z6;
        boolean isSpellCheckerEnabled;
        char c7 = (getResources().getConfiguration().uiMode & 48) == 32 ? (char) 2 : (char) 1;
        TextServicesManager textServicesManager = this.f488w;
        if (textServicesManager != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                enabledSpellCheckerInfos = textServicesManager.getEnabledSpellCheckerInfos();
                Iterator it = enabledSpellCheckerInfos.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z6 = false;
                        break;
                    } else if (((SpellCheckerInfo) it.next()).getPackageName().equals("com.google.android.inputmethod.latin")) {
                        z6 = true;
                        break;
                    }
                }
                isSpellCheckerEnabled = this.f488w.isSpellCheckerEnabled();
                if (isSpellCheckerEnabled) {
                }
            }
            z5 = true;
            N3.m mVar = this.f479n.f614o;
            mVar.getClass();
            cVar = mVar.f1731b;
            hashMap = new HashMap();
            hashMap.put("textScaleFactor", Float.valueOf(getResources().getConfiguration().fontScale));
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            hashMap.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z5));
            hashMap.put("brieflyShowPassword", Boolean.valueOf(Settings.System.getInt(getContext().getContentResolver(), "show_password", 1) == 1));
            hashMap.put("alwaysUse24HourFormat", Boolean.valueOf(DateFormat.is24HourFormat(getContext())));
            if (c7 != 1) {
                str = "light";
            } else {
                if (c7 != 2) {
                    throw null;
                }
                str = "dark";
            }
            hashMap.put("platformBrightness", str);
            Objects.toString(hashMap.get("textScaleFactor"));
            Objects.toString(hashMap.get("alwaysUse24HourFormat"));
            Objects.toString(hashMap.get("platformBrightness"));
            if (Build.VERSION.SDK_INT >= 34 || displayMetrics == null) {
                cVar.z(hashMap, null);
            }
            N3.l lVar = new N3.l(displayMetrics);
            B0.c cVar2 = mVar.f1730a;
            ((ConcurrentLinkedQueue) cVar2.f72h).add(lVar);
            N3.l lVar2 = (N3.l) cVar2.f71g;
            cVar2.f71g = lVar;
            C0673c c0673c = lVar2 != null ? new C0673c(cVar2, lVar2, false) : null;
            hashMap.put("configurationId", Integer.valueOf(lVar.f1728a));
            cVar.z(hashMap, c0673c);
            return;
        }
        z5 = false;
        N3.m mVar2 = this.f479n.f614o;
        mVar2.getClass();
        cVar = mVar2.f1731b;
        hashMap = new HashMap();
        hashMap.put("textScaleFactor", Float.valueOf(getResources().getConfiguration().fontScale));
        DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
        hashMap.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z5));
        hashMap.put("brieflyShowPassword", Boolean.valueOf(Settings.System.getInt(getContext().getContentResolver(), "show_password", 1) == 1));
        hashMap.put("alwaysUse24HourFormat", Boolean.valueOf(DateFormat.is24HourFormat(getContext())));
        if (c7 != 1) {
        }
        hashMap.put("platformBrightness", str);
        Objects.toString(hashMap.get("textScaleFactor"));
        Objects.toString(hashMap.get("alwaysUse24HourFormat"));
        Objects.toString(hashMap.get("platformBrightness"));
        if (Build.VERSION.SDK_INT >= 34) {
        }
        cVar.z(hashMap, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (c() && this.f485t.o(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    public final void e() {
        if (!c()) {
            Log.w("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        float f7 = getResources().getDisplayMetrics().density;
        io.flutter.embedding.engine.renderer.g gVar = this.y;
        gVar.f4461a = f7;
        gVar.f4480t = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        io.flutter.embedding.engine.renderer.h hVar = this.f479n.f601b;
        hVar.getClass();
        int i7 = gVar.f4462b;
        ArrayList arrayList = gVar.f4485z;
        ArrayList arrayList2 = gVar.y;
        if (i7 == 0) {
            int i8 = gVar.f4464d;
            int i9 = gVar.f4465e;
            if (i8 <= 0 && i9 <= 0) {
                return;
            }
        } else {
            int i10 = gVar.f4463c;
            if (i10 == 0) {
                int i11 = gVar.f4466f;
                int i12 = gVar.f4467g;
                if (i11 <= 0 && i12 <= 0) {
                    return;
                }
            } else if (i7 <= 0 || i10 <= 0 || gVar.f4461a <= 0.0f) {
                return;
            }
        }
        arrayList2.size();
        arrayList.size();
        int size = arrayList.size() + arrayList2.size();
        int[] iArr = new int[size * 4];
        int[] iArr2 = new int[size];
        int[] iArr3 = new int[size];
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            io.flutter.embedding.engine.renderer.a aVar = (io.flutter.embedding.engine.renderer.a) arrayList2.get(i13);
            int i14 = i13 * 4;
            Rect rect = aVar.f4448a;
            iArr[i14] = rect.left;
            iArr[i14 + 1] = rect.top;
            iArr[i14 + 2] = rect.right;
            iArr[i14 + 3] = rect.bottom;
            iArr2[i13] = N.p.c(aVar.f4449b);
            iArr3[i13] = N.p.c(aVar.f4450c);
        }
        int size2 = arrayList2.size() * 4;
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            io.flutter.embedding.engine.renderer.a aVar2 = (io.flutter.embedding.engine.renderer.a) arrayList.get(i15);
            int i16 = (i15 * 4) + size2;
            Rect rect2 = aVar2.f4448a;
            iArr[i16] = rect2.left;
            iArr[i16 + 1] = rect2.top;
            iArr[i16 + 2] = rect2.right;
            iArr[i16 + 3] = rect2.bottom;
            iArr2[arrayList2.size() + i15] = N.p.c(aVar2.f4449b);
            iArr3[arrayList2.size() + i15] = N.p.c(aVar2.f4450c);
        }
        hVar.f4486a.setViewportMetrics(gVar.f4461a, gVar.f4462b, gVar.f4463c, gVar.f4468h, gVar.f4469i, gVar.f4470j, gVar.f4471k, gVar.f4472l, gVar.f4473m, gVar.f4474n, gVar.f4475o, gVar.f4476p, gVar.f4477q, gVar.f4478r, gVar.f4479s, gVar.f4480t, iArr, iArr2, iArr3, gVar.f4464d, gVar.f4465e, gVar.f4466f, gVar.f4467g, gVar.f4481u, gVar.f4482v, gVar.f4483w, gVar.f4484x);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.i iVar = this.f487v;
        if (iVar == null || !iVar.f4698c.isEnabled()) {
            return null;
        }
        return this.f487v;
    }

    public E3.c getAttachedFlutterEngine() {
        return this.f479n;
    }

    public O3.e getBinaryMessenger() {
        return this.f479n.f602c;
    }

    public C0122j getCurrentImageSurface() {
        return this.f474i;
    }

    public io.flutter.embedding.engine.renderer.g getViewportMetrics() {
        return this.y;
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
        char c7;
        double d7;
        int i7;
        int i8;
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
        int i9;
        int i10;
        int i11;
        int i12;
        int ime;
        Insets insets2;
        int i13;
        int i14;
        int i15;
        int i16;
        int systemGestures;
        Insets insets3;
        int i17;
        int i18;
        int i19;
        int i20;
        DisplayCutout displayCutout2;
        Insets waterfallInsets;
        int i21;
        int safeInsetTop;
        int i22;
        int safeInsetRight;
        int i23;
        int safeInsetBottom;
        int i24;
        int safeInsetLeft;
        Insets systemGestureInsets;
        int i25;
        int i26;
        int i27;
        int i28;
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        int i29 = Build.VERSION.SDK_INT;
        io.flutter.embedding.engine.renderer.g gVar = this.y;
        if (i29 == 29) {
            systemGestureInsets = windowInsets.getSystemGestureInsets();
            i25 = systemGestureInsets.top;
            gVar.f4476p = i25;
            i26 = systemGestureInsets.right;
            gVar.f4477q = i26;
            i27 = systemGestureInsets.bottom;
            gVar.f4478r = i27;
            i28 = systemGestureInsets.left;
            gVar.f4479s = i28;
        }
        boolean z5 = (getWindowSystemUiVisibility() & 4) == 0;
        boolean z6 = (getWindowSystemUiVisibility() & 2) == 0;
        if (i29 >= 30) {
            systemBars = WindowInsets.Type.systemBars();
            insets = windowInsets.getInsets(systemBars);
            i9 = insets.top;
            gVar.f4468h = i9;
            i10 = insets.right;
            gVar.f4469i = i10;
            i11 = insets.bottom;
            gVar.f4470j = i11;
            i12 = insets.left;
            gVar.f4471k = i12;
            ime = WindowInsets.Type.ime();
            insets2 = windowInsets.getInsets(ime);
            i13 = insets2.top;
            gVar.f4472l = i13;
            i14 = insets2.right;
            gVar.f4473m = i14;
            i15 = insets2.bottom;
            gVar.f4474n = i15;
            i16 = insets2.left;
            gVar.f4475o = i16;
            systemGestures = WindowInsets.Type.systemGestures();
            insets3 = windowInsets.getInsets(systemGestures);
            i17 = insets3.top;
            gVar.f4476p = i17;
            i18 = insets3.right;
            gVar.f4477q = i18;
            i19 = insets3.bottom;
            gVar.f4478r = i19;
            i20 = insets3.left;
            gVar.f4479s = i20;
            displayCutout2 = windowInsets.getDisplayCutout();
            if (displayCutout2 != null) {
                waterfallInsets = displayCutout2.getWaterfallInsets();
                int i30 = gVar.f4468h;
                i21 = waterfallInsets.top;
                int max = Math.max(i30, i21);
                safeInsetTop = displayCutout2.getSafeInsetTop();
                gVar.f4468h = Math.max(max, safeInsetTop);
                int i31 = gVar.f4469i;
                i22 = waterfallInsets.right;
                int max2 = Math.max(i31, i22);
                safeInsetRight = displayCutout2.getSafeInsetRight();
                gVar.f4469i = Math.max(max2, safeInsetRight);
                int i32 = gVar.f4470j;
                i23 = waterfallInsets.bottom;
                int max3 = Math.max(i32, i23);
                safeInsetBottom = displayCutout2.getSafeInsetBottom();
                gVar.f4470j = Math.max(max3, safeInsetBottom);
                int i33 = gVar.f4471k;
                i24 = waterfallInsets.left;
                int max4 = Math.max(i33, i24);
                safeInsetLeft = displayCutout2.getSafeInsetLeft();
                gVar.f4471k = Math.max(max4, safeInsetLeft);
            }
            i8 = 0;
        } else {
            if (!z6) {
                Context context = getContext();
                if (context.getResources().getConfiguration().orientation == 2) {
                    int rotation = ((DisplayManager) context.getSystemService("display")).getDisplay(0).getRotation();
                    if (rotation == 1) {
                        c7 = 3;
                    } else if (rotation == 3) {
                        c7 = 2;
                    } else if (rotation == 0 || rotation == 2) {
                        c7 = 4;
                    }
                    gVar.f4468h = !z5 ? windowInsets.getSystemWindowInsetTop() : 0;
                    gVar.f4469i = (c7 != 3 || c7 == 4) ? 0 : windowInsets.getSystemWindowInsetRight();
                    if (z6) {
                        d7 = 0.18d;
                    } else {
                        d7 = 0.18d;
                        if ((((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom()) == 0) {
                            i7 = windowInsets.getSystemWindowInsetBottom();
                            gVar.f4470j = i7;
                            gVar.f4471k = (c7 != 2 || c7 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
                            gVar.f4472l = 0;
                            gVar.f4473m = 0;
                            gVar.f4474n = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * d7 ? 0 : windowInsets.getSystemWindowInsetBottom();
                            i8 = 0;
                            gVar.f4475o = 0;
                        }
                    }
                    i7 = 0;
                    gVar.f4470j = i7;
                    gVar.f4471k = (c7 != 2 || c7 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
                    gVar.f4472l = 0;
                    gVar.f4473m = 0;
                    gVar.f4474n = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * d7 ? 0 : windowInsets.getSystemWindowInsetBottom();
                    i8 = 0;
                    gVar.f4475o = 0;
                }
            }
            c7 = 1;
            gVar.f4468h = !z5 ? windowInsets.getSystemWindowInsetTop() : 0;
            gVar.f4469i = (c7 != 3 || c7 == 4) ? 0 : windowInsets.getSystemWindowInsetRight();
            if (z6) {
            }
            i7 = 0;
            gVar.f4470j = i7;
            gVar.f4471k = (c7 != 2 || c7 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
            gVar.f4472l = 0;
            gVar.f4473m = 0;
            gVar.f4474n = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * d7 ? 0 : windowInsets.getSystemWindowInsetBottom();
            i8 = 0;
            gVar.f4475o = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (i29 >= 28 && displayCutout != null) {
            boundingRects2 = displayCutout.getBoundingRects();
            for (Rect rect : boundingRects2) {
                rect.toString();
                arrayList.add(new io.flutter.embedding.engine.renderer.a(rect, 4, 1));
            }
        }
        ArrayList arrayList2 = gVar.f4485z;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (Build.VERSION.SDK_INT >= 35) {
            v vVar = this.f470G;
            Context context2 = getContext();
            vVar.getClass();
            Activity v5 = AbstractC0223a.v(context2);
            WindowInsets windowInsets2 = null;
            if (v5 != null && (window = v5.getWindow()) != null) {
                windowInsets2 = window.getDecorView().getRootWindowInsets();
            }
            if (windowInsets2 == null) {
                boundingRects = Collections.EMPTY_LIST;
            } else {
                captionBar = WindowInsets.Type.captionBar();
                boundingRects = windowInsets2.getBoundingRects(captionBar);
            }
            int i34 = gVar.f4468h;
            Iterator it = boundingRects.iterator();
            while (it.hasNext()) {
                i34 = Math.max(i34, ((Rect) it.next()).bottom);
            }
            gVar.f4468h = i34;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            roundedCorner = windowInsets.getRoundedCorner(0);
            roundedCorner2 = windowInsets.getRoundedCorner(1);
            roundedCorner3 = windowInsets.getRoundedCorner(2);
            roundedCorner4 = windowInsets.getRoundedCorner(3);
            gVar.f4481u = roundedCorner != null ? roundedCorner.getRadius() : i8;
            gVar.f4482v = roundedCorner2 != null ? roundedCorner2.getRadius() : i8;
            gVar.f4483w = roundedCorner3 != null ? roundedCorner3.getRadius() : i8;
            gVar.f4484x = roundedCorner4 != null ? roundedCorner4.getRadius() : i8;
        }
        e();
        return onApplyWindowInsets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [K5.c] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        M m4;
        super.onAttachedToWindow();
        int i7 = 1;
        try {
            f0.g gVar = f0.h.f4188c;
            Context context = getContext();
            gVar.getClass();
            C0362b a7 = f0.g.a(context);
            C0689s c0689s = new C0689s(9);
            C0673c c0673c = new C0673c();
            c0673c.f5968f = a7;
            c0673c.f5969g = c0689s;
            m4 = new M(i7, c0673c);
        } catch (NoClassDefFoundError unused) {
            m4 = null;
        }
        this.f489x = m4;
        Activity v5 = AbstractC0223a.v(getContext());
        M m7 = this.f489x;
        if (m7 == null || v5 == null) {
            return;
        }
        this.f467D = new p(0, this);
        Context context2 = getContext();
        Executor executor = Build.VERSION.SDK_INT >= 28 ? AbstractC0670e.a(context2) : new D0.q(3, new Handler(context2.getMainLooper()));
        p consumer = this.f467D;
        C0673c c0673c2 = (C0673c) m7.f401g;
        kotlin.jvm.internal.i.e(executor, "executor");
        kotlin.jvm.internal.i.e(consumer, "consumer");
        C0689s c0689s2 = (C0689s) c0673c2.f5969g;
        C0362b c0362b = (C0362b) c0673c2.f5968f;
        c0362b.getClass();
        f0.i iVar = new f0.i(c0362b, v5, null);
        C0570j c0570j = C0570j.f5620f;
        K5.b bVar = new K5.b(iVar, c0570j, -2, 1);
        O5.d dVar = H5.F.f1027a;
        I5.e eVar = M5.o.f1618a;
        if (eVar.m(C0162w.f1110g) != null) {
            throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + eVar).toString());
        }
        K5.b bVar2 = bVar;
        if (!eVar.equals(c0570j)) {
            bVar2 = L5.l.a(bVar, eVar, 0, 0, 6);
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) c0689s2.f6035g;
        ReentrantLock reentrantLock = (ReentrantLock) c0689s2.f6034f;
        reentrantLock.lock();
        try {
            if (linkedHashMap.get(consumer) == null) {
                linkedHashMap.put(consumer, AbstractC0165z.l(AbstractC0165z.b(new S(executor)), null, new C0315b(bVar2, consumer, null), 3));
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f479n != null) {
            this.f484s.b(configuration);
            d();
            AbstractC0223a.a(getContext(), this.f479n);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        if (r2.f1747c != false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b3  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i7;
        if (!c()) {
            return super.onCreateInputConnection(editorInfo);
        }
        io.flutter.plugin.editing.i iVar = this.f482q;
        B0.c cVar = this.f485t;
        C0102o c0102o = iVar.f4537e;
        int i8 = c0102o.f299a;
        if (i8 == 1) {
            iVar.f4542j = null;
            return null;
        }
        int i9 = 4;
        if (i8 == 4) {
            return null;
        }
        if (i8 == 3) {
            if (iVar.f4548p) {
                return iVar.f4542j;
            }
            iVar.f4543k.i(c0102o.f300b);
            throw null;
        }
        N3.n nVar = iVar.f4538f;
        N3.o oVar = nVar.f1738g;
        boolean z5 = nVar.f1732a;
        boolean z6 = nVar.f1733b;
        boolean z7 = nVar.f1734c;
        boolean z8 = nVar.f1735d;
        int i10 = nVar.f1737f;
        int i11 = oVar.f1745a;
        if (i11 != 2) {
            if (i11 == 5) {
                i9 = oVar.f1746b ? 4098 : 2;
            } else if (i11 == 6) {
                i9 = 3;
            } else if (i11 == 11) {
                i9 = 0;
            } else {
                int i12 = i11 == 7 ? 131073 : (i11 == 8 || i11 == 13) ? 33 : (i11 == 9 || i11 == 12) ? 17 : i11 == 10 ? 145 : i11 == 3 ? 97 : i11 == 4 ? 113 : 1;
                if (!z5) {
                    if (z6) {
                        i12 |= 32768;
                    }
                    i7 = z7 ? 524416 : 524432;
                    i9 = i12;
                    if (i10 != 1) {
                        i9 |= 4096;
                    } else {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                i9 |= 16384;
                            }
                        }
                        i9 |= 8192;
                    }
                }
                i12 |= i7;
                i9 = i12;
                if (i10 != 1) {
                }
            }
        }
        editorInfo.inputType = i9;
        editorInfo.imeOptions = 33554432;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 26 && !z8) {
            editorInfo.imeOptions = 50331648;
        }
        int intValue = nVar.f1739h.intValue();
        N3.n nVar2 = iVar.f4538f;
        String str = nVar2.f1740i;
        if (str != null) {
            editorInfo.actionLabel = str;
            editorInfo.actionId = intValue;
        }
        editorInfo.imeOptions = intValue | editorInfo.imeOptions;
        if (nVar2.f1744m != null) {
            editorInfo.hintLocales = new LocaleList(iVar.f4538f.f1744m);
        }
        String[] strArr = iVar.f4538f.f1742k;
        if (strArr != null) {
            editorInfo.contentMimeTypes = strArr;
        }
        if (i13 >= 34) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
        }
        io.flutter.plugin.editing.c cVar2 = new io.flutter.plugin.editing.c(this, iVar.f4537e.f300b, iVar.f4536d, cVar, iVar.f4540h, editorInfo);
        io.flutter.plugin.editing.f fVar = iVar.f4540h;
        fVar.getClass();
        editorInfo.initialSelStart = Selection.getSelectionStart(fVar);
        io.flutter.plugin.editing.f fVar2 = iVar.f4540h;
        fVar2.getClass();
        editorInfo.initialSelEnd = Selection.getSelectionEnd(fVar2);
        iVar.f4542j = cVar2;
        return cVar2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        p pVar;
        M m4 = this.f489x;
        if (m4 != null && (pVar = this.f467D) != null) {
            C0689s c0689s = (C0689s) ((C0673c) m4.f401g).f5969g;
            LinkedHashMap linkedHashMap = (LinkedHashMap) c0689s.f6035g;
            ReentrantLock reentrantLock = (ReentrantLock) c0689s.f6034f;
            reentrantLock.lock();
            try {
                X x6 = (X) linkedHashMap.get(pVar);
                if (x6 != null) {
                    x6.d(null);
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        this.f467D = null;
        this.f489x = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (c()) {
            C0113a c0113a = this.f486u;
            Context context = getContext();
            c0113a.getClass();
            boolean isFromSource = motionEvent.isFromSource(2);
            boolean z5 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
            if (isFromSource && z5) {
                int b7 = C0113a.b(motionEvent.getActionMasked());
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
                allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                c0113a.a(motionEvent, motionEvent.getActionIndex(), b7, 0, C0113a.f407f, allocateDirect, context);
                if (allocateDirect.position() % 288 != 0) {
                    throw new AssertionError("Packet position is not on field boundary.");
                }
                c0113a.f408a.f4486a.dispatchPointerDataPacket(allocateDirect, allocateDirect.position());
                return true;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        return !c() ? super.onHoverEvent(motionEvent) : this.f487v.e(motionEvent, false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        this.f468E = View.MeasureSpec.getMode(i7);
        this.f469F = View.MeasureSpec.getMode(i8);
        super.onMeasure(i7, i8);
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i7) {
        Rect rect;
        super.onProvideAutofillVirtualStructure(viewStructure, i7);
        io.flutter.plugin.editing.i iVar = this.f482q;
        if (iVar == null || Build.VERSION.SDK_INT < 26 || iVar.f4539g == null) {
            return;
        }
        String str = (String) iVar.f4538f.f1741j.f5994g;
        AutofillId autofillId = viewStructure.getAutofillId();
        for (int i8 = 0; i8 < iVar.f4539g.size(); i8++) {
            int keyAt = iVar.f4539g.keyAt(i8);
            C0684n c0684n = ((N3.n) iVar.f4539g.valueAt(i8)).f1741j;
            if (c0684n != null) {
                viewStructure.addChildCount(1);
                ViewStructure newChild = viewStructure.newChild(i8);
                newChild.setAutofillId(autofillId, keyAt);
                String[] strArr = (String[]) c0684n.f5995h;
                if (strArr.length > 0) {
                    newChild.setAutofillHints(strArr);
                }
                newChild.setAutofillType(1);
                newChild.setVisibility(0);
                String str2 = (String) c0684n.f5997j;
                if (str2 != null) {
                    newChild.setHint(str2);
                }
                if (str.hashCode() != keyAt || (rect = iVar.f4545m) == null) {
                    newChild.setDimens(0, 0, 0, 0, 1, 1);
                    newChild.setAutofillValue(AutofillValue.forText(((N3.p) c0684n.f5996i).f1748a));
                } else {
                    newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), iVar.f4545m.height());
                    newChild.setAutofillValue(AutofillValue.forText(iVar.f4540h));
                }
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        io.flutter.embedding.engine.renderer.g gVar = this.y;
        gVar.f4462b = i7;
        gVar.f4463c = i8;
        boolean z5 = this.f471f;
        if (z5 && this.f469F == 0) {
            gVar.f4466f = 0;
            gVar.f4467g = 8192;
        } else {
            gVar.f4466f = i8;
            gVar.f4467g = i8;
        }
        if (z5 && this.f468E == 0) {
            gVar.f4464d = 0;
            gVar.f4465e = 8192;
        } else {
            gVar.f4464d = i7;
            gVar.f4465e = i7;
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
        C0113a c0113a = this.f486u;
        Matrix matrix = C0113a.f407f;
        c0113a.getClass();
        int actionMasked = motionEvent.getActionMasked();
        int b7 = C0113a.b(motionEvent.getActionMasked());
        char c7 = 5;
        boolean z5 = actionMasked == 0 || actionMasked == 5;
        boolean z6 = !z5 && (actionMasked == 1 || actionMasked == 6);
        int toolType = motionEvent.getToolType(motionEvent.getActionIndex());
        if (toolType == 1) {
            c7 = 0;
        } else if (toolType == 2) {
            c7 = 2;
        } else if (toolType == 3) {
            c7 = 1;
        } else if (toolType == 4) {
            c7 = 3;
        }
        int i7 = (z6 && c7 == 0) ? 1 : 0;
        int pointerCount = motionEvent.getPointerCount();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((pointerCount + i7) * 288);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        if (z5) {
            byteBuffer = allocateDirect;
            c0113a.a(motionEvent, motionEvent.getActionIndex(), b7, 0, matrix, byteBuffer, null);
        } else {
            byteBuffer = allocateDirect;
            if (z6) {
                for (int i8 = 0; i8 < pointerCount; i8++) {
                    if (i8 != motionEvent.getActionIndex() && motionEvent.getToolType(i8) == 1) {
                        c0113a.a(motionEvent, i8, 5, 1, matrix, byteBuffer, null);
                    }
                }
                c0113a.a(motionEvent, motionEvent.getActionIndex(), b7, 0, matrix, byteBuffer, null);
                if (i7 != 0) {
                    c0113a.a(motionEvent, motionEvent.getActionIndex(), 2, 0, matrix, byteBuffer, null);
                }
            } else {
                for (int i9 = 0; i9 < pointerCount; i9++) {
                    c0113a.a(motionEvent, i9, b7, (pointerCount << 8) | 2, matrix, byteBuffer, null);
                }
            }
        }
        if (byteBuffer.position() % 288 != 0) {
            throw new AssertionError("Packet position is not on field boundary");
        }
        c0113a.f408a.f4486a.dispatchPointerDataPacket(byteBuffer, byteBuffer.position());
        return true;
    }

    public void setDelegate(v vVar) {
        this.f470G = vVar;
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        View view = this.f475j;
        if (view instanceof C0124l) {
            ((C0124l) view).setVisibility(i7);
        }
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.List] */
    public void setWindowInfoListenerDisplayFeatures(f0.j jVar) {
        C0362b c0362b = C0362b.f4169i;
        ?? r9 = jVar.f4193a;
        ArrayList arrayList = new ArrayList();
        for (f0.c cVar : r9) {
            cVar.f4176a.a().toString();
            C0269b c0269b = cVar.f4176a;
            int i7 = 2;
            int i8 = ((c0269b.f3753c - c0269b.f3751a == 0 || c0269b.f3754d - c0269b.f3752b == 0) ? C0362b.f4168h : c0362b) == c0362b ? 3 : 2;
            C0362b c0362b2 = cVar.f4178c;
            if (c0362b2 != C0362b.f4170j) {
                i7 = c0362b2 == C0362b.f4171k ? 3 : 1;
            }
            arrayList.add(new io.flutter.embedding.engine.renderer.a(c0269b.a(), i8, i7));
        }
        ArrayList arrayList2 = this.y.y;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        e();
    }

    public t(AbstractActivityC0117e abstractActivityC0117e, C0126n c0126n) {
        super(abstractActivityC0117e, null);
        this.f471f = false;
        this.f477l = new HashSet();
        this.f480o = new HashSet();
        this.y = new io.flutter.embedding.engine.renderer.g();
        this.f490z = new J1.c(1, this);
        this.f464A = new q(this, new Handler(Looper.getMainLooper()), 0);
        this.f465B = new r(this);
        this.f466C = new C0118f(1, this);
        this.f470G = new v();
        this.f473h = c0126n;
        this.f475j = c0126n;
        b();
    }
}
