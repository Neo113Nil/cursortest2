package h4;

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
import com.google.firebase.messaging.AbstractC0315e;
import g0.C0432l;
import i4.C0547c;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.platform.InterfaceC0561g;
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
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import n4.C0758a;
import n6.AbstractC0792z;
import n6.C0787u;
import n6.S;
import n6.X;
import o6.C0809e;
import p6.EnumC0830a;
import u6.C0953e;
import x0.C0995b;
import y0.C1022a;

/* loaded from: classes.dex */
public final class p extends FrameLayout implements u4.a, y {

    /* renamed from: A, reason: collision with root package name */
    public l2.c f5232A;

    /* renamed from: B, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.i f5233B;

    /* renamed from: C, reason: collision with root package name */
    public final B.f f5234C;

    /* renamed from: D, reason: collision with root package name */
    public final M.a f5235D;

    /* renamed from: E, reason: collision with root package name */
    public final n f5236E;

    /* renamed from: F, reason: collision with root package name */
    public final C0489d f5237F;

    /* renamed from: G, reason: collision with root package name */
    public A0.i f5238G;

    /* renamed from: H, reason: collision with root package name */
    public int f5239H;

    /* renamed from: I, reason: collision with root package name */
    public int f5240I;

    /* renamed from: J, reason: collision with root package name */
    public q f5241J;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5242d;

    /* renamed from: e, reason: collision with root package name */
    public final k f5243e;

    /* renamed from: i, reason: collision with root package name */
    public final m f5244i;

    /* renamed from: l, reason: collision with root package name */
    public i f5245l;

    /* renamed from: m, reason: collision with root package name */
    public View f5246m;

    /* renamed from: n, reason: collision with root package name */
    public View f5247n;

    /* renamed from: o, reason: collision with root package name */
    public final HashSet f5248o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f5249p;

    /* renamed from: q, reason: collision with root package name */
    public C0547c f5250q;

    /* renamed from: r, reason: collision with root package name */
    public final HashSet f5251r;

    /* renamed from: s, reason: collision with root package name */
    public P0.c f5252s;

    /* renamed from: t, reason: collision with root package name */
    public io.flutter.plugin.editing.i f5253t;

    /* renamed from: u, reason: collision with root package name */
    public io.flutter.plugin.editing.g f5254u;

    /* renamed from: v, reason: collision with root package name */
    public t4.a f5255v;

    /* renamed from: w, reason: collision with root package name */
    public D0.j f5256w;

    /* renamed from: x, reason: collision with root package name */
    public C0486a f5257x;

    /* renamed from: y, reason: collision with root package name */
    public io.flutter.view.g f5258y;

    /* renamed from: z, reason: collision with root package name */
    public TextServicesManager f5259z;

    public p(AbstractActivityC0488c abstractActivityC0488c, k kVar) {
        super(abstractActivityC0488c, null);
        this.f5242d = false;
        this.f5248o = new HashSet();
        this.f5251r = new HashSet();
        this.f5233B = new io.flutter.embedding.engine.renderer.i();
        this.f5234C = new B.f(26, this);
        this.f5235D = new M.a(this, new Handler(Looper.getMainLooper()), 1);
        this.f5236E = new n(this);
        this.f5237F = new C0489d(1, this);
        this.f5241J = new q();
        this.f5243e = kVar;
        this.f5246m = kVar;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v36, types: [android.view.View, io.flutter.embedding.engine.renderer.m] */
    public final void a() {
        Objects.toString(this.f5250q);
        if (c()) {
            Iterator it = this.f5251r.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            getContext().getContentResolver().unregisterContentObserver(this.f5235D);
            io.flutter.plugin.platform.u uVar = this.f5250q.f5518s;
            SparseArray sparseArray = uVar.f5764t;
            SparseArray sparseArray2 = uVar.f5765u;
            SparseArray sparseArray3 = uVar.f5767w;
            for (int i2 = 0; i2 < sparseArray3.size(); i2++) {
                uVar.f5756l.removeView((io.flutter.plugin.platform.l) sparseArray3.valueAt(i2));
            }
            for (int i5 = 0; i5 < sparseArray2.size(); i5++) {
                uVar.f5756l.removeView((C0758a) sparseArray2.valueAt(i5));
            }
            uVar.c();
            SparseArray sparseArray4 = uVar.f5766v;
            if (uVar.f5756l == null) {
                Log.e("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
            } else {
                for (int i7 = 0; i7 < sparseArray4.size(); i7++) {
                    uVar.f5756l.removeView((View) sparseArray4.valueAt(i7));
                }
                sparseArray4.clear();
            }
            uVar.f5756l = null;
            uVar.f5769y = false;
            for (int i8 = 0; i8 < sparseArray.size(); i8++) {
                ((InterfaceC0561g) sparseArray.valueAt(i8)).onFlutterViewDetached();
            }
            io.flutter.plugin.platform.t tVar = this.f5250q.f5519t;
            SparseArray sparseArray5 = tVar.f5738q;
            SparseArray sparseArray6 = tVar.f5739r;
            for (int i9 = 0; i9 < sparseArray6.size(); i9++) {
                tVar.f5733l.removeView((C0758a) sparseArray6.valueAt(i9));
            }
            Surface surface = tVar.f5743v;
            if (surface != null) {
                surface.release();
                tVar.f5743v = null;
                tVar.f5744w = null;
            }
            tVar.f5733l = null;
            for (int i10 = 0; i10 < sparseArray5.size(); i10++) {
                ((InterfaceC0561g) sparseArray5.valueAt(i10)).onFlutterViewDetached();
            }
            this.f5250q.f5518s.q();
            this.f5250q.f5519t.q();
            io.flutter.view.g gVar = this.f5258y;
            gVar.f5898u = true;
            gVar.f5883e.q();
            gVar.f5896s = null;
            AccessibilityManager accessibilityManager = gVar.f5881c;
            accessibilityManager.removeAccessibilityStateChangeListener(gVar.f5899v);
            accessibilityManager.removeTouchExplorationStateChangeListener(gVar.f5900w);
            gVar.f5884f.unregisterContentObserver(gVar.f5901x);
            D0.j jVar = gVar.f5880b;
            jVar.f332l = null;
            ((FlutterJNI) jVar.f331i).setAccessibilityDelegate(null);
            this.f5258y = null;
            this.f5253t.f5654b.restartInput(this);
            this.f5253t.c();
            int size = ((HashSet) this.f5256w.f331i).size();
            if (size > 0) {
                Log.w("KeyboardManager", "A KeyboardManager was destroyed with " + size + " unhandled redispatch event(s).");
            }
            io.flutter.plugin.editing.g gVar2 = this.f5254u;
            if (gVar2 != null) {
                gVar2.f5641a.f6272e = null;
                SpellCheckerSession spellCheckerSession = gVar2.f5643c;
                if (spellCheckerSession != null) {
                    spellCheckerSession.close();
                }
            }
            P0.c cVar = this.f5252s;
            if (cVar != null) {
                ((l4.b) cVar.f2190i).f6272e = null;
            }
            io.flutter.embedding.engine.renderer.j jVar2 = this.f5250q.f5502b;
            this.f5249p = false;
            jVar2.g(this.f5237F);
            FlutterJNI flutterJNI = jVar2.f5598a;
            if (this.f5242d) {
                flutterJNI.removeResizingFlutterUiListener(this.f5236E);
            }
            jVar2.j();
            flutterJNI.setSemanticsEnabled(false);
            View view = this.f5247n;
            if (view != null && this.f5246m == this.f5245l) {
                this.f5246m = view;
            }
            this.f5246m.a();
            i iVar = this.f5245l;
            if (iVar != null) {
                iVar.f5209d.close();
                removeView(this.f5245l);
                this.f5245l = null;
            }
            this.f5247n = null;
            this.f5250q = null;
        }
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        r4.o oVar;
        com.google.firebase.messaging.z zVar;
        com.google.firebase.messaging.z zVar2;
        CharSequence textValue;
        io.flutter.plugin.editing.i iVar = this.f5253t;
        if (iVar == null || Build.VERSION.SDK_INT < 26 || (oVar = iVar.f5658f) == null || iVar.f5659g == null || (zVar = oVar.j) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            r4.o oVar2 = (r4.o) iVar.f5659g.get(sparseArray.keyAt(i2));
            if (oVar2 != null && (zVar2 = oVar2.j) != null) {
                String str = (String) zVar2.f4535d;
                textValue = AbstractC0315e.j(sparseArray.valueAt(i2)).getTextValue();
                String charSequence = textValue.toString();
                r4.q qVar = new r4.q(charSequence.length(), charSequence.length(), -1, -1, charSequence);
                if (str.equals((String) zVar.f4535d)) {
                    iVar.f5660h.f(qVar);
                } else {
                    hashMap.put(str, qVar);
                }
            }
        }
        P0.l lVar = iVar.f5656d;
        int i5 = iVar.f5657e.f4947c;
        lVar.getClass();
        hashMap.size();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            r4.q qVar2 = (r4.q) entry.getValue();
            hashMap2.put((String) entry.getKey(), P0.l.a(qVar2.f7523b, qVar2.f7524c, -1, -1, qVar2.f7522a));
        }
        ((s4.q) lVar.f2209e).a("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i5), hashMap2), null);
    }

    public final void b() {
        k kVar = this.f5243e;
        if (kVar != null) {
            addView(kVar);
        } else {
            m mVar = this.f5244i;
            if (mVar != null) {
                addView(mVar);
            } else {
                addView(this.f5245l);
            }
        }
        this.f5242d = P0.f.y(getContext());
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.m] */
    public final boolean c() {
        C0547c c0547c = this.f5250q;
        return c0547c != null && c0547c.f5502b == this.f5246m.getAttachedRenderer();
    }

    @Override // android.view.View
    public final boolean checkInputConnectionProxy(View view) {
        C0547c c0547c = this.f5250q;
        if (c0547c == null) {
            return super.checkInputConnectionProxy(view);
        }
        HashMap hashMap = c0547c.f5518s.f5763s;
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
        boolean z7;
        P0.i iVar;
        HashMap hashMap;
        String str;
        List enabledSpellCheckerInfos;
        boolean z8;
        boolean isSpellCheckerEnabled;
        char c7 = (getResources().getConfiguration().uiMode & 48) == 32 ? (char) 2 : (char) 1;
        TextServicesManager textServicesManager = this.f5259z;
        if (textServicesManager != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                enabledSpellCheckerInfos = textServicesManager.getEnabledSpellCheckerInfos();
                Iterator it = enabledSpellCheckerInfos.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z8 = false;
                        break;
                    } else if (((SpellCheckerInfo) it.next()).getPackageName().equals("com.google.android.inputmethod.latin")) {
                        z8 = true;
                        break;
                    }
                }
                isSpellCheckerEnabled = this.f5259z.isSpellCheckerEnabled();
                if (isSpellCheckerEnabled) {
                }
            }
            z7 = true;
            r4.n nVar = this.f5250q.f5514o;
            nVar.getClass();
            iVar = nVar.f7506b;
            hashMap = new HashMap();
            hashMap.put("textScaleFactor", Float.valueOf(getResources().getConfiguration().fontScale));
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            hashMap.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z7));
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
                iVar.l(hashMap, null);
            }
            r4.m mVar = new r4.m(displayMetrics);
            D0.j jVar = nVar.f7505a;
            ((ConcurrentLinkedQueue) jVar.f330e).add(mVar);
            r4.m mVar2 = (r4.m) jVar.f332l;
            jVar.f332l = mVar;
            P0.e eVar = mVar2 != null ? new P0.e(jVar, 10, mVar2) : null;
            hashMap.put("configurationId", Integer.valueOf(mVar.f7503a));
            iVar.l(hashMap, eVar);
            return;
        }
        z7 = false;
        r4.n nVar2 = this.f5250q.f5514o;
        nVar2.getClass();
        iVar = nVar2.f7506b;
        hashMap = new HashMap();
        hashMap.put("textScaleFactor", Float.valueOf(getResources().getConfiguration().fontScale));
        DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
        hashMap.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z7));
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
        iVar.l(hashMap, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (c() && this.f5256w.O(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    public final void e() {
        if (!c()) {
            Log.w("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        float f7 = getResources().getDisplayMetrics().density;
        io.flutter.embedding.engine.renderer.i iVar = this.f5233B;
        iVar.f5573a = f7;
        iVar.f5591t = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        io.flutter.embedding.engine.renderer.j jVar = this.f5250q.f5502b;
        jVar.getClass();
        int i2 = iVar.f5574b;
        ArrayList arrayList = iVar.f5597z;
        ArrayList arrayList2 = iVar.f5596y;
        if (i2 == 0) {
            int i5 = iVar.f5576d;
            int i7 = iVar.f5577e;
            if (i5 <= 0 && i7 <= 0) {
                return;
            }
        } else {
            int i8 = iVar.f5575c;
            if (i8 == 0) {
                int i9 = iVar.f5578f;
                int i10 = iVar.f5579g;
                if (i9 <= 0 && i10 <= 0) {
                    return;
                }
            } else if (i2 <= 0 || i8 <= 0 || iVar.f5573a <= 0.0f) {
                return;
            }
        }
        arrayList2.size();
        arrayList.size();
        int size = arrayList.size() + arrayList2.size();
        int[] iArr = new int[size * 4];
        int[] iArr2 = new int[size];
        int[] iArr3 = new int[size];
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            io.flutter.embedding.engine.renderer.a aVar = (io.flutter.embedding.engine.renderer.a) arrayList2.get(i11);
            int i12 = i11 * 4;
            Rect rect = aVar.f5553a;
            iArr[i12] = rect.left;
            iArr[i12 + 1] = rect.top;
            iArr[i12 + 2] = rect.right;
            iArr[i12 + 3] = rect.bottom;
            iArr2[i11] = S.i.b(aVar.f5554b);
            iArr3[i11] = S.i.b(aVar.f5555c);
        }
        int size2 = arrayList2.size() * 4;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            io.flutter.embedding.engine.renderer.a aVar2 = (io.flutter.embedding.engine.renderer.a) arrayList.get(i13);
            int i14 = (i13 * 4) + size2;
            Rect rect2 = aVar2.f5553a;
            iArr[i14] = rect2.left;
            iArr[i14 + 1] = rect2.top;
            iArr[i14 + 2] = rect2.right;
            iArr[i14 + 3] = rect2.bottom;
            iArr2[arrayList2.size() + i13] = S.i.b(aVar2.f5554b);
            iArr3[arrayList2.size() + i13] = S.i.b(aVar2.f5555c);
        }
        jVar.f5598a.setViewportMetrics(iVar.f5573a, iVar.f5574b, iVar.f5575c, iVar.f5580h, iVar.f5581i, iVar.j, iVar.f5582k, iVar.f5583l, iVar.f5584m, iVar.f5585n, iVar.f5586o, iVar.f5587p, iVar.f5588q, iVar.f5589r, iVar.f5590s, iVar.f5591t, iArr, iArr2, iArr3, iVar.f5576d, iVar.f5577e, iVar.f5578f, iVar.f5579g, iVar.f5592u, iVar.f5593v, iVar.f5594w, iVar.f5595x);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.g gVar = this.f5258y;
        if (gVar == null || !gVar.f5881c.isEnabled()) {
            return null;
        }
        return this.f5258y;
    }

    public C0547c getAttachedFlutterEngine() {
        return this.f5250q;
    }

    public s4.f getBinaryMessenger() {
        return this.f5250q.f5503c;
    }

    public i getCurrentImageSurface() {
        return this.f5245l;
    }

    public io.flutter.embedding.engine.renderer.i getViewportMetrics() {
        return this.f5233B;
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
        int i2;
        int i5;
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
        int i7;
        int i8;
        int i9;
        int i10;
        int ime;
        Insets insets2;
        int i11;
        int i12;
        int i13;
        int i14;
        int systemGestures;
        Insets insets3;
        int i15;
        int i16;
        int i17;
        int i18;
        DisplayCutout displayCutout2;
        Insets waterfallInsets;
        int i19;
        int safeInsetTop;
        int i20;
        int safeInsetRight;
        int i21;
        int safeInsetBottom;
        int i22;
        int safeInsetLeft;
        Insets systemGestureInsets;
        int i23;
        int i24;
        int i25;
        int i26;
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        int i27 = Build.VERSION.SDK_INT;
        io.flutter.embedding.engine.renderer.i iVar = this.f5233B;
        if (i27 == 29) {
            systemGestureInsets = windowInsets.getSystemGestureInsets();
            i23 = systemGestureInsets.top;
            iVar.f5587p = i23;
            i24 = systemGestureInsets.right;
            iVar.f5588q = i24;
            i25 = systemGestureInsets.bottom;
            iVar.f5589r = i25;
            i26 = systemGestureInsets.left;
            iVar.f5590s = i26;
        }
        boolean z7 = (getWindowSystemUiVisibility() & 4) == 0;
        boolean z8 = (getWindowSystemUiVisibility() & 2) == 0;
        if (i27 >= 30) {
            systemBars = WindowInsets.Type.systemBars();
            insets = windowInsets.getInsets(systemBars);
            i7 = insets.top;
            iVar.f5580h = i7;
            i8 = insets.right;
            iVar.f5581i = i8;
            i9 = insets.bottom;
            iVar.j = i9;
            i10 = insets.left;
            iVar.f5582k = i10;
            ime = WindowInsets.Type.ime();
            insets2 = windowInsets.getInsets(ime);
            i11 = insets2.top;
            iVar.f5583l = i11;
            i12 = insets2.right;
            iVar.f5584m = i12;
            i13 = insets2.bottom;
            iVar.f5585n = i13;
            i14 = insets2.left;
            iVar.f5586o = i14;
            systemGestures = WindowInsets.Type.systemGestures();
            insets3 = windowInsets.getInsets(systemGestures);
            i15 = insets3.top;
            iVar.f5587p = i15;
            i16 = insets3.right;
            iVar.f5588q = i16;
            i17 = insets3.bottom;
            iVar.f5589r = i17;
            i18 = insets3.left;
            iVar.f5590s = i18;
            displayCutout2 = windowInsets.getDisplayCutout();
            if (displayCutout2 != null) {
                waterfallInsets = displayCutout2.getWaterfallInsets();
                int i28 = iVar.f5580h;
                i19 = waterfallInsets.top;
                int max = Math.max(i28, i19);
                safeInsetTop = displayCutout2.getSafeInsetTop();
                iVar.f5580h = Math.max(max, safeInsetTop);
                int i29 = iVar.f5581i;
                i20 = waterfallInsets.right;
                int max2 = Math.max(i29, i20);
                safeInsetRight = displayCutout2.getSafeInsetRight();
                iVar.f5581i = Math.max(max2, safeInsetRight);
                int i30 = iVar.j;
                i21 = waterfallInsets.bottom;
                int max3 = Math.max(i30, i21);
                safeInsetBottom = displayCutout2.getSafeInsetBottom();
                iVar.j = Math.max(max3, safeInsetBottom);
                int i31 = iVar.f5582k;
                i22 = waterfallInsets.left;
                int max4 = Math.max(i31, i22);
                safeInsetLeft = displayCutout2.getSafeInsetLeft();
                iVar.f5582k = Math.max(max4, safeInsetLeft);
            }
            i5 = 0;
        } else {
            if (!z8) {
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
                    iVar.f5580h = !z7 ? windowInsets.getSystemWindowInsetTop() : 0;
                    iVar.f5581i = (c7 != 3 || c7 == 4) ? 0 : windowInsets.getSystemWindowInsetRight();
                    if (z8) {
                        d7 = 0.18d;
                    } else {
                        d7 = 0.18d;
                        if ((((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom()) == 0) {
                            i2 = windowInsets.getSystemWindowInsetBottom();
                            iVar.j = i2;
                            iVar.f5582k = (c7 != 2 || c7 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
                            iVar.f5583l = 0;
                            iVar.f5584m = 0;
                            iVar.f5585n = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * d7 ? 0 : windowInsets.getSystemWindowInsetBottom();
                            i5 = 0;
                            iVar.f5586o = 0;
                        }
                    }
                    i2 = 0;
                    iVar.j = i2;
                    iVar.f5582k = (c7 != 2 || c7 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
                    iVar.f5583l = 0;
                    iVar.f5584m = 0;
                    iVar.f5585n = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * d7 ? 0 : windowInsets.getSystemWindowInsetBottom();
                    i5 = 0;
                    iVar.f5586o = 0;
                }
            }
            c7 = 1;
            iVar.f5580h = !z7 ? windowInsets.getSystemWindowInsetTop() : 0;
            iVar.f5581i = (c7 != 3 || c7 == 4) ? 0 : windowInsets.getSystemWindowInsetRight();
            if (z8) {
            }
            i2 = 0;
            iVar.j = i2;
            iVar.f5582k = (c7 != 2 || c7 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
            iVar.f5583l = 0;
            iVar.f5584m = 0;
            iVar.f5585n = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * d7 ? 0 : windowInsets.getSystemWindowInsetBottom();
            i5 = 0;
            iVar.f5586o = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (i27 >= 28 && displayCutout != null) {
            boundingRects2 = displayCutout.getBoundingRects();
            for (Rect rect : boundingRects2) {
                rect.toString();
                arrayList.add(new io.flutter.embedding.engine.renderer.a(rect, 4, 1));
            }
        }
        ArrayList arrayList2 = iVar.f5597z;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (Build.VERSION.SDK_INT >= 35) {
            q qVar = this.f5241J;
            Context context2 = getContext();
            qVar.getClass();
            Activity J7 = O6.g.J(context2);
            WindowInsets windowInsets2 = null;
            if (J7 != null && (window = J7.getWindow()) != null) {
                windowInsets2 = window.getDecorView().getRootWindowInsets();
            }
            if (windowInsets2 == null) {
                boundingRects = Collections.EMPTY_LIST;
            } else {
                captionBar = WindowInsets.Type.captionBar();
                boundingRects = windowInsets2.getBoundingRects(captionBar);
            }
            int i32 = iVar.f5580h;
            Iterator it = boundingRects.iterator();
            while (it.hasNext()) {
                i32 = Math.max(i32, ((Rect) it.next()).bottom);
            }
            iVar.f5580h = i32;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            roundedCorner = windowInsets.getRoundedCorner(0);
            roundedCorner2 = windowInsets.getRoundedCorner(1);
            roundedCorner3 = windowInsets.getRoundedCorner(2);
            roundedCorner4 = windowInsets.getRoundedCorner(3);
            iVar.f5592u = roundedCorner != null ? roundedCorner.getRadius() : i5;
            iVar.f5593v = roundedCorner2 != null ? roundedCorner2.getRadius() : i5;
            iVar.f5594w = roundedCorner3 != null ? roundedCorner3.getRadius() : i5;
            iVar.f5595x = roundedCorner4 != null ? roundedCorner4.getRadius() : i5;
        }
        e();
        return onApplyWindowInsets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [q6.d] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        l2.c cVar;
        super.onAttachedToWindow();
        try {
            A0.g gVar = A0.h.f70a;
            Context context = getContext();
            gVar.getClass();
            cVar = new l2.c(new P0.l(A0.g.a(context)));
        } catch (NoClassDefFoundError unused) {
            cVar = null;
        }
        this.f5232A = cVar;
        Activity activity = O6.g.J(getContext());
        l2.c cVar2 = this.f5232A;
        if (cVar2 == null || activity == null) {
            return;
        }
        this.f5238G = new A0.i(1, this);
        Context context2 = getContext();
        Executor executor = Build.VERSION.SDK_INT >= 28 ? C.b.d(context2) : new E.e(new Handler(context2.getMainLooper()), 0);
        A0.i consumer = this.f5238G;
        P0.l lVar = (P0.l) cVar2.f6269d;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        P0.c cVar3 = (P0.c) lVar.f2210i;
        A0.b bVar = (A0.b) lVar.f2209e;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        A0.k kVar = new A0.k(bVar, activity, null);
        kotlin.coroutines.g gVar2 = kotlin.coroutines.g.f6146d;
        q6.c cVar4 = new q6.c(kVar, gVar2, -2, EnumC0830a.f7215d);
        C0953e c0953e = n6.F.f7011a;
        C0809e c0809e = s6.n.f7850a;
        if (c0809e.g(C0787u.f7085e) != null) {
            throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + c0809e).toString());
        }
        q6.c flow = cVar4;
        if (!c0809e.equals(gVar2)) {
            flow = r6.s.a(cVar4, c0809e, 0, null, 6);
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) cVar3.f2190i;
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(flow, "flow");
        ReentrantLock reentrantLock = (ReentrantLock) cVar3.f2189e;
        reentrantLock.lock();
        try {
            if (linkedHashMap.get(consumer) == null) {
                linkedHashMap.put(consumer, AbstractC0792z.l(AbstractC0792z.b(new S(executor)), null, new C1022a(flow, consumer, null), 3));
            }
            Unit unit = Unit.f6114a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f5250q != null) {
            this.f5255v.b(configuration);
            d();
            O6.g.z(getContext(), this.f5250q);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        if (r2.f7521c != false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ba  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i2;
        if (!c()) {
            return super.onCreateInputConnection(editorInfo);
        }
        io.flutter.plugin.editing.i iVar = this.f5253t;
        D0.j jVar = this.f5256w;
        C0432l c0432l = iVar.f5657e;
        int i5 = c0432l.f4946b;
        if (i5 == 1) {
            iVar.j = null;
            return null;
        }
        int i7 = 4;
        if (i5 == 4) {
            return null;
        }
        if (i5 == 3) {
            if (iVar.f5667p) {
                return iVar.j;
            }
            InputConnection onCreateInputConnection = iVar.f5662k.m(c0432l.f4947c).onCreateInputConnection(editorInfo);
            iVar.j = onCreateInputConnection;
            return onCreateInputConnection;
        }
        r4.o oVar = iVar.f5658f;
        r4.p pVar = oVar.f7513g;
        boolean z7 = oVar.f7507a;
        boolean z8 = oVar.f7508b;
        boolean z9 = oVar.f7509c;
        boolean z10 = oVar.f7510d;
        int i8 = oVar.f7512f;
        int i9 = pVar.f7519a;
        if (i9 != 2) {
            if (i9 == 5) {
                i7 = pVar.f7520b ? 4098 : 2;
            } else if (i9 == 6) {
                i7 = 3;
            } else if (i9 == 11) {
                i7 = 0;
            } else {
                int i10 = i9 == 7 ? 131073 : (i9 == 8 || i9 == 13) ? 33 : (i9 == 9 || i9 == 12) ? 17 : i9 == 10 ? 145 : i9 == 3 ? 97 : i9 == 4 ? 113 : 1;
                if (!z7) {
                    if (z8) {
                        i10 |= 32768;
                    }
                    i2 = z9 ? 524416 : 524432;
                    i7 = i10;
                    if (i8 != 1) {
                        i7 |= 4096;
                    } else {
                        if (i8 != 2) {
                            if (i8 == 3) {
                                i7 |= 16384;
                            }
                        }
                        i7 |= 8192;
                    }
                }
                i10 |= i2;
                i7 = i10;
                if (i8 != 1) {
                }
            }
        }
        editorInfo.inputType = i7;
        editorInfo.imeOptions = 33554432;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26 && !z10) {
            editorInfo.imeOptions = 50331648;
        }
        int intValue = oVar.f7514h.intValue();
        r4.o oVar2 = iVar.f5658f;
        String str = oVar2.f7515i;
        if (str != null) {
            editorInfo.actionLabel = str;
            editorInfo.actionId = intValue;
        }
        editorInfo.imeOptions = intValue | editorInfo.imeOptions;
        if (oVar2.f7518m != null) {
            editorInfo.hintLocales = new LocaleList(iVar.f5658f.f7518m);
        }
        String[] strArr = iVar.f5658f.f7516k;
        if (strArr != null) {
            K.d.a(editorInfo, strArr);
        }
        if (i11 >= 34) {
            if (i11 >= 35) {
                K.c.a(editorInfo);
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
        }
        io.flutter.plugin.editing.c cVar = new io.flutter.plugin.editing.c(this, iVar.f5657e.f4947c, iVar.f5656d, jVar, iVar.f5660h, editorInfo);
        io.flutter.plugin.editing.f fVar = iVar.f5660h;
        fVar.getClass();
        editorInfo.initialSelStart = Selection.getSelectionStart(fVar);
        io.flutter.plugin.editing.f fVar2 = iVar.f5660h;
        fVar2.getClass();
        editorInfo.initialSelEnd = Selection.getSelectionEnd(fVar2);
        iVar.j = cVar;
        return cVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        A0.i consumer;
        l2.c cVar = this.f5232A;
        if (cVar != null && (consumer = this.f5238G) != null) {
            P0.l lVar = (P0.l) cVar.f6269d;
            Intrinsics.checkNotNullParameter(consumer, "consumer");
            P0.c cVar2 = (P0.c) lVar.f2210i;
            LinkedHashMap linkedHashMap = (LinkedHashMap) cVar2.f2190i;
            Intrinsics.checkNotNullParameter(consumer, "consumer");
            ReentrantLock reentrantLock = (ReentrantLock) cVar2.f2189e;
            reentrantLock.lock();
            try {
                X x7 = (X) linkedHashMap.get(consumer);
                if (x7 != null) {
                    x7.d(null);
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        this.f5238G = null;
        this.f5232A = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (c()) {
            C0486a c0486a = this.f5257x;
            Context context = getContext();
            c0486a.getClass();
            boolean isFromSource = motionEvent.isFromSource(2);
            boolean z7 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
            if (isFromSource && z7) {
                int b7 = C0486a.b(motionEvent.getActionMasked());
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
                allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                c0486a.a(motionEvent, motionEvent.getActionIndex(), b7, 0, C0486a.f5182f, allocateDirect, context);
                if (allocateDirect.position() % 288 != 0) {
                    throw new AssertionError("Packet position is not on field boundary.");
                }
                c0486a.f5183a.f5598a.dispatchPointerDataPacket(allocateDirect, allocateDirect.position());
                return true;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        return !c() ? super.onHoverEvent(motionEvent) : this.f5258y.f(motionEvent, false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i5) {
        this.f5239H = View.MeasureSpec.getMode(i2);
        this.f5240I = View.MeasureSpec.getMode(i5);
        super.onMeasure(i2, i5);
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i2) {
        Rect rect;
        super.onProvideAutofillVirtualStructure(viewStructure, i2);
        io.flutter.plugin.editing.i iVar = this.f5253t;
        if (iVar == null || Build.VERSION.SDK_INT < 26 || iVar.f5659g == null) {
            return;
        }
        String str = (String) iVar.f5658f.j.f4535d;
        AutofillId autofillId = viewStructure.getAutofillId();
        for (int i5 = 0; i5 < iVar.f5659g.size(); i5++) {
            int keyAt = iVar.f5659g.keyAt(i5);
            com.google.firebase.messaging.z zVar = ((r4.o) iVar.f5659g.valueAt(i5)).j;
            if (zVar != null) {
                viewStructure.addChildCount(1);
                ViewStructure newChild = viewStructure.newChild(i5);
                newChild.setAutofillId(autofillId, keyAt);
                String[] strArr = (String[]) zVar.f4536e;
                if (strArr.length > 0) {
                    newChild.setAutofillHints(strArr);
                }
                newChild.setAutofillType(1);
                newChild.setVisibility(0);
                String str2 = (String) zVar.f4538l;
                if (str2 != null) {
                    newChild.setHint(str2);
                }
                if (str.hashCode() != keyAt || (rect = iVar.f5664m) == null) {
                    newChild.setDimens(0, 0, 0, 0, 1, 1);
                    newChild.setAutofillValue(AutofillValue.forText(((r4.q) zVar.f4537i).f7522a));
                } else {
                    newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), iVar.f5664m.height());
                    newChild.setAutofillValue(AutofillValue.forText(iVar.f5660h));
                }
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i5, int i7, int i8) {
        super.onSizeChanged(i2, i5, i7, i8);
        io.flutter.embedding.engine.renderer.i iVar = this.f5233B;
        iVar.f5574b = i2;
        iVar.f5575c = i5;
        boolean z7 = this.f5242d;
        if (z7 && this.f5240I == 0) {
            iVar.f5578f = 0;
            iVar.f5579g = 8192;
        } else {
            iVar.f5578f = i5;
            iVar.f5579g = i5;
        }
        if (z7 && this.f5239H == 0) {
            iVar.f5576d = 0;
            iVar.f5577e = 8192;
        } else {
            iVar.f5576d = i2;
            iVar.f5577e = i2;
        }
        e();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!c()) {
            return super.onTouchEvent(motionEvent);
        }
        requestUnbufferedDispatch(motionEvent);
        this.f5257x.d(motionEvent, C0486a.f5182f);
        return true;
    }

    public void setDelegate(q qVar) {
        this.f5241J = qVar;
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        View view = this.f5246m;
        if (view instanceof k) {
            ((k) view).setVisibility(i2);
        }
    }

    public void setWindowInfoListenerDisplayFeatures(A0.l lVar) {
        A0.b bVar = A0.b.f51l;
        List<A0.c> list = lVar.f80a;
        ArrayList arrayList = new ArrayList();
        for (A0.c cVar : list) {
            cVar.f58a.a().toString();
            C0995b c0995b = cVar.f58a;
            int i2 = 2;
            int i5 = ((c0995b.f8294c - c0995b.f8292a == 0 || c0995b.f8295d - c0995b.f8293b == 0) ? A0.b.f50i : bVar) == bVar ? 3 : 2;
            A0.b bVar2 = cVar.f60c;
            if (bVar2 != A0.b.f52m) {
                i2 = bVar2 == A0.b.f53n ? 3 : 1;
            }
            arrayList.add(new io.flutter.embedding.engine.renderer.a(c0995b.a(), i5, i2));
        }
        ArrayList arrayList2 = this.f5233B.f5596y;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        e();
    }

    public p(AbstractActivityC0488c abstractActivityC0488c, m mVar) {
        super(abstractActivityC0488c, null);
        this.f5242d = false;
        this.f5248o = new HashSet();
        this.f5251r = new HashSet();
        this.f5233B = new io.flutter.embedding.engine.renderer.i();
        this.f5234C = new B.f(26, this);
        this.f5235D = new M.a(this, new Handler(Looper.getMainLooper()), 1);
        this.f5236E = new n(this);
        this.f5237F = new C0489d(1, this);
        this.f5241J = new q();
        this.f5244i = mVar;
        this.f5246m = mVar;
        b();
    }
}
