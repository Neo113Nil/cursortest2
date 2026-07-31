package io.flutter.embedding.android;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textservice.SpellCheckerInfo;
import android.view.textservice.TextServicesManager;
import android.widget.FrameLayout;
import androidx.window.java.layout.WindowInfoTrackerCallbackAdapter;
import androidx.window.layout.DisplayFeature;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import io.flutter.embedding.android.g;
import io.flutter.embedding.android.q;
import io.flutter.view.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import k5.a;
import l5.m;
import o5.a;

/* loaded from: classes.dex */
public class k extends FrameLayout implements a.c, q.e {
    private final k5.b A;
    private final q.a<WindowLayoutInfo> B;

    /* renamed from: f, reason: collision with root package name */
    private h f17118f;

    /* renamed from: g, reason: collision with root package name */
    private i f17119g;

    /* renamed from: h, reason: collision with root package name */
    private io.flutter.embedding.android.g f17120h;

    /* renamed from: i, reason: collision with root package name */
    k5.c f17121i;

    /* renamed from: j, reason: collision with root package name */
    private k5.c f17122j;

    /* renamed from: k, reason: collision with root package name */
    private final Set<k5.b> f17123k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f17124l;

    /* renamed from: m, reason: collision with root package name */
    private io.flutter.embedding.engine.a f17125m;

    /* renamed from: n, reason: collision with root package name */
    private final Set<f> f17126n;

    /* renamed from: o, reason: collision with root package name */
    private o5.a f17127o;

    /* renamed from: p, reason: collision with root package name */
    private io.flutter.plugin.editing.f f17128p;

    /* renamed from: q, reason: collision with root package name */
    private io.flutter.plugin.editing.d f17129q;

    /* renamed from: r, reason: collision with root package name */
    private n5.a f17130r;

    /* renamed from: s, reason: collision with root package name */
    private q f17131s;

    /* renamed from: t, reason: collision with root package name */
    private io.flutter.embedding.android.a f17132t;

    /* renamed from: u, reason: collision with root package name */
    private io.flutter.view.c f17133u;

    /* renamed from: v, reason: collision with root package name */
    private TextServicesManager f17134v;

    /* renamed from: w, reason: collision with root package name */
    private x f17135w;

    /* renamed from: x, reason: collision with root package name */
    private final a.g f17136x;

    /* renamed from: y, reason: collision with root package name */
    private final c.k f17137y;

    /* renamed from: z, reason: collision with root package name */
    private final ContentObserver f17138z;

    class a implements c.k {
        a() {
        }

        @Override // io.flutter.view.c.k
        public void a(boolean z6, boolean z7) {
            k.this.A(z6, z7);
        }
    }

    class b extends ContentObserver {
        b(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z6) {
            super.onChange(z6);
            if (k.this.f17125m == null) {
                return;
            }
            z4.b.e("FlutterView", "System settings changed. Sending user settings to Flutter.");
            k.this.C();
        }
    }

    class c implements k5.b {
        c() {
        }

        @Override // k5.b
        public void c() {
            k.this.f17124l = false;
            Iterator it = k.this.f17123k.iterator();
            while (it.hasNext()) {
                ((k5.b) it.next()).c();
            }
        }

        @Override // k5.b
        public void f() {
            k.this.f17124l = true;
            Iterator it = k.this.f17123k.iterator();
            while (it.hasNext()) {
                ((k5.b) it.next()).f();
            }
        }
    }

    class d implements q.a<WindowLayoutInfo> {
        d() {
        }

        @Override // q.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(WindowLayoutInfo windowLayoutInfo) {
            k.this.setWindowInfoListenerDisplayFeatures(windowLayoutInfo);
        }
    }

    class e implements k5.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k5.a f17143a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f17144b;

        e(k5.a aVar, Runnable runnable) {
            this.f17143a = aVar;
            this.f17144b = runnable;
        }

        @Override // k5.b
        public void c() {
        }

        @Override // k5.b
        public void f() {
            this.f17143a.q(this);
            this.f17144b.run();
            k kVar = k.this;
            if ((kVar.f17121i instanceof io.flutter.embedding.android.g) || kVar.f17120h == null) {
                return;
            }
            k.this.f17120h.a();
        }
    }

    public interface f {
        void a();

        void b(io.flutter.embedding.engine.a aVar);
    }

    private enum g {
        NONE,
        LEFT,
        RIGHT,
        BOTH
    }

    private k(Context context, AttributeSet attributeSet, h hVar) {
        super(context, attributeSet);
        this.f17123k = new HashSet();
        this.f17126n = new HashSet();
        this.f17136x = new a.g();
        this.f17137y = new a();
        this.f17138z = new b(new Handler(Looper.getMainLooper()));
        this.A = new c();
        this.B = new d();
        this.f17118f = hVar;
        this.f17121i = hVar;
        v();
    }

    private k(Context context, AttributeSet attributeSet, i iVar) {
        super(context, attributeSet);
        this.f17123k = new HashSet();
        this.f17126n = new HashSet();
        this.f17136x = new a.g();
        this.f17137y = new a();
        this.f17138z = new b(new Handler(Looper.getMainLooper()));
        this.A = new c();
        this.B = new d();
        this.f17119g = iVar;
        this.f17121i = iVar;
        v();
    }

    public k(Context context, h hVar) {
        this(context, (AttributeSet) null, hVar);
    }

    public k(Context context, i iVar) {
        this(context, (AttributeSet) null, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(boolean z6, boolean z7) {
        boolean z8 = false;
        if (!this.f17125m.q().l() && !z6 && !z7) {
            z8 = true;
        }
        setWillNotDraw(z8);
    }

    private void D() {
        if (!w()) {
            z4.b.f("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        this.f17136x.f18269a = getResources().getDisplayMetrics().density;
        this.f17136x.f18284p = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f17125m.q().t(this.f17136x);
    }

    private g o() {
        Context context = getContext();
        int i7 = context.getResources().getConfiguration().orientation;
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i7 == 2) {
            if (rotation == 1) {
                return g.RIGHT;
            }
            if (rotation == 3) {
                return Build.VERSION.SDK_INT >= 23 ? g.LEFT : g.RIGHT;
            }
            if (rotation == 0 || rotation == 2) {
                return g.BOTH;
            }
        }
        return g.NONE;
    }

    @TargetApi(20)
    private int t(WindowInsets windowInsets) {
        int height = getRootView().getHeight();
        double systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
        double d7 = height;
        Double.isNaN(d7);
        if (systemWindowInsetBottom < d7 * 0.18d) {
            return 0;
        }
        return windowInsets.getSystemWindowInsetBottom();
    }

    private void v() {
        View view;
        z4.b.e("FlutterView", "Initializing FlutterView");
        if (this.f17118f != null) {
            z4.b.e("FlutterView", "Internally using a FlutterSurfaceView.");
            view = this.f17118f;
        } else if (this.f17119g != null) {
            z4.b.e("FlutterView", "Internally using a FlutterTextureView.");
            view = this.f17119g;
        } else {
            z4.b.e("FlutterView", "Internally using a FlutterImageView.");
            view = this.f17120h;
        }
        addView(view);
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean x(SpellCheckerInfo spellCheckerInfo) {
        return spellCheckerInfo.getPackageName().equals("com.google.android.inputmethod.latin");
    }

    public void B(Runnable runnable) {
        io.flutter.embedding.android.g gVar = this.f17120h;
        if (gVar == null) {
            z4.b.e("FlutterView", "Tried to revert the image view, but no image view is used.");
            return;
        }
        k5.c cVar = this.f17122j;
        if (cVar == null) {
            z4.b.e("FlutterView", "Tried to revert the image view, but no previous surface was used.");
            return;
        }
        this.f17121i = cVar;
        this.f17122j = null;
        io.flutter.embedding.engine.a aVar = this.f17125m;
        if (aVar == null) {
            gVar.a();
            runnable.run();
            return;
        }
        k5.a q7 = aVar.q();
        if (q7 == null) {
            this.f17120h.a();
            runnable.run();
        } else {
            this.f17121i.b(q7);
            q7.g(new e(q7, runnable));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void C() {
        boolean z6;
        m.b bVar = (getResources().getConfiguration().uiMode & 48) == 32 ? m.b.dark : m.b.light;
        TextServicesManager textServicesManager = this.f17134v;
        if (textServicesManager != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                boolean anyMatch = textServicesManager.getEnabledSpellCheckerInfos().stream().anyMatch(new Predicate() { // from class: io.flutter.embedding.android.j
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        boolean x6;
                        x6 = k.x((SpellCheckerInfo) obj);
                        return x6;
                    }
                });
                if (this.f17134v.isSpellCheckerEnabled()) {
                }
            }
            z6 = true;
            this.f17125m.s().a().e(getResources().getConfiguration().fontScale).c(z6).b(Settings.System.getInt(getContext().getContentResolver(), "show_password", 1) == 1).f(DateFormat.is24HourFormat(getContext())).d(bVar).a();
        }
        z6 = false;
        this.f17125m.s().a().e(getResources().getConfiguration().fontScale).c(z6).b(Settings.System.getInt(getContext().getContentResolver(), "show_password", 1) == 1).f(DateFormat.is24HourFormat(getContext())).d(bVar).a();
    }

    @Override // io.flutter.embedding.android.q.e
    public void a(KeyEvent keyEvent) {
        getRootView().dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public void autofill(SparseArray<AutofillValue> sparseArray) {
        this.f17128p.j(sparseArray);
    }

    @Override // o5.a.c
    @TargetApi(24)
    public PointerIcon b(int i7) {
        return PointerIcon.getSystemIcon(getContext(), i7);
    }

    @Override // io.flutter.embedding.android.q.e
    public boolean c(KeyEvent keyEvent) {
        return this.f17128p.r(keyEvent);
    }

    @Override // android.view.View
    public boolean checkInputConnectionProxy(View view) {
        io.flutter.embedding.engine.a aVar = this.f17125m;
        return aVar != null ? aVar.o().D(view) : super.checkInputConnectionProxy(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (w() && this.f17131s.a(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT > 19) {
            return super.fitSystemWindows(rect);
        }
        a.g gVar = this.f17136x;
        gVar.f18272d = rect.top;
        gVar.f18273e = rect.right;
        gVar.f18274f = 0;
        gVar.f18275g = rect.left;
        gVar.f18276h = 0;
        gVar.f18277i = 0;
        gVar.f18278j = rect.bottom;
        gVar.f18279k = 0;
        z4.b.e("FlutterView", "Updating window insets (fitSystemWindows()):\nStatus bar insets: Top: " + this.f17136x.f18272d + ", Left: " + this.f17136x.f18275g + ", Right: " + this.f17136x.f18273e + "\nKeyboard insets: Bottom: " + this.f17136x.f18278j + ", Left: " + this.f17136x.f18279k + ", Right: " + this.f17136x.f18277i);
        D();
        return true;
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.c cVar = this.f17133u;
        if (cVar == null || !cVar.C()) {
            return null;
        }
        return this.f17133u;
    }

    public io.flutter.embedding.engine.a getAttachedFlutterEngine() {
        return this.f17125m;
    }

    @Override // io.flutter.embedding.android.q.e
    public m5.c getBinaryMessenger() {
        return this.f17125m.i();
    }

    public io.flutter.embedding.android.g getCurrentImageSurface() {
        return this.f17120h;
    }

    public boolean j() {
        io.flutter.embedding.android.g gVar = this.f17120h;
        if (gVar != null) {
            return gVar.c();
        }
        return false;
    }

    public void k(f fVar) {
        this.f17126n.add(fVar);
    }

    public void l(k5.b bVar) {
        this.f17123k.add(bVar);
    }

    public void m(io.flutter.embedding.android.g gVar) {
        io.flutter.embedding.engine.a aVar = this.f17125m;
        if (aVar != null) {
            gVar.b(aVar.q());
        }
    }

    public void n(io.flutter.embedding.engine.a aVar) {
        z4.b.e("FlutterView", "Attaching to a FlutterEngine: " + aVar);
        if (w()) {
            if (aVar == this.f17125m) {
                z4.b.e("FlutterView", "Already attached to this engine. Doing nothing.");
                return;
            } else {
                z4.b.e("FlutterView", "Currently attached to a different engine. Detaching and then attaching to new engine.");
                s();
            }
        }
        this.f17125m = aVar;
        k5.a q7 = aVar.q();
        this.f17124l = q7.k();
        this.f17121i.b(q7);
        q7.g(this.A);
        if (Build.VERSION.SDK_INT >= 24) {
            this.f17127o = new o5.a(this, this.f17125m.l());
        }
        this.f17128p = new io.flutter.plugin.editing.f(this, this.f17125m.v(), this.f17125m.o());
        try {
            TextServicesManager textServicesManager = (TextServicesManager) getContext().getSystemService("textservices");
            this.f17134v = textServicesManager;
            this.f17129q = new io.flutter.plugin.editing.d(textServicesManager, this.f17125m.t());
        } catch (Exception unused) {
            z4.b.b("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
        }
        this.f17130r = this.f17125m.k();
        this.f17131s = new q(this);
        this.f17132t = new io.flutter.embedding.android.a(this.f17125m.q(), false);
        io.flutter.view.c cVar = new io.flutter.view.c(this, aVar.g(), (AccessibilityManager) getContext().getSystemService("accessibility"), getContext().getContentResolver(), this.f17125m.o());
        this.f17133u = cVar;
        cVar.U(this.f17137y);
        A(this.f17133u.C(), this.f17133u.D());
        this.f17125m.o().a(this.f17133u);
        this.f17125m.o().B(this.f17125m.q());
        this.f17128p.q().restartInput(this);
        C();
        getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, this.f17138z);
        D();
        aVar.o().C(this);
        Iterator<f> it = this.f17126n.iterator();
        while (it.hasNext()) {
            it.next().b(aVar);
        }
        if (this.f17124l) {
            this.A.f();
        }
    }

    @Override // android.view.View
    @SuppressLint({"InlinedApi", "NewApi"})
    @TargetApi(20)
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 == 29) {
            Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
            a.g gVar = this.f17136x;
            gVar.f18280l = systemGestureInsets.top;
            gVar.f18281m = systemGestureInsets.right;
            gVar.f18282n = systemGestureInsets.bottom;
            gVar.f18283o = systemGestureInsets.left;
        }
        boolean z6 = (getWindowSystemUiVisibility() & 4) == 0;
        boolean z7 = (getWindowSystemUiVisibility() & 2) == 0;
        if (i7 >= 30) {
            int navigationBars = z7 ? 0 | WindowInsets.Type.navigationBars() : 0;
            if (z6) {
                navigationBars |= WindowInsets.Type.statusBars();
            }
            Insets insets = windowInsets.getInsets(navigationBars);
            a.g gVar2 = this.f17136x;
            gVar2.f18272d = insets.top;
            gVar2.f18273e = insets.right;
            gVar2.f18274f = insets.bottom;
            gVar2.f18275g = insets.left;
            Insets insets2 = windowInsets.getInsets(WindowInsets.Type.ime());
            a.g gVar3 = this.f17136x;
            gVar3.f18276h = insets2.top;
            gVar3.f18277i = insets2.right;
            gVar3.f18278j = insets2.bottom;
            gVar3.f18279k = insets2.left;
            Insets insets3 = windowInsets.getInsets(WindowInsets.Type.systemGestures());
            a.g gVar4 = this.f17136x;
            gVar4.f18280l = insets3.top;
            gVar4.f18281m = insets3.right;
            gVar4.f18282n = insets3.bottom;
            gVar4.f18283o = insets3.left;
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            if (displayCutout != null) {
                Insets waterfallInsets = displayCutout.getWaterfallInsets();
                a.g gVar5 = this.f17136x;
                gVar5.f18272d = Math.max(Math.max(gVar5.f18272d, waterfallInsets.top), displayCutout.getSafeInsetTop());
                a.g gVar6 = this.f17136x;
                gVar6.f18273e = Math.max(Math.max(gVar6.f18273e, waterfallInsets.right), displayCutout.getSafeInsetRight());
                a.g gVar7 = this.f17136x;
                gVar7.f18274f = Math.max(Math.max(gVar7.f18274f, waterfallInsets.bottom), displayCutout.getSafeInsetBottom());
                a.g gVar8 = this.f17136x;
                gVar8.f18275g = Math.max(Math.max(gVar8.f18275g, waterfallInsets.left), displayCutout.getSafeInsetLeft());
            }
        } else {
            g gVar9 = g.NONE;
            if (!z7) {
                gVar9 = o();
            }
            this.f17136x.f18272d = z6 ? windowInsets.getSystemWindowInsetTop() : 0;
            this.f17136x.f18273e = (gVar9 == g.RIGHT || gVar9 == g.BOTH) ? 0 : windowInsets.getSystemWindowInsetRight();
            this.f17136x.f18274f = (z7 && t(windowInsets) == 0) ? windowInsets.getSystemWindowInsetBottom() : 0;
            this.f17136x.f18275g = (gVar9 == g.LEFT || gVar9 == g.BOTH) ? 0 : windowInsets.getSystemWindowInsetLeft();
            a.g gVar10 = this.f17136x;
            gVar10.f18276h = 0;
            gVar10.f18277i = 0;
            gVar10.f18278j = t(windowInsets);
            this.f17136x.f18279k = 0;
        }
        z4.b.e("FlutterView", "Updating window insets (onApplyWindowInsets()):\nStatus bar insets: Top: " + this.f17136x.f18272d + ", Left: " + this.f17136x.f18275g + ", Right: " + this.f17136x.f18273e + "\nKeyboard insets: Bottom: " + this.f17136x.f18278j + ", Left: " + this.f17136x.f18279k + ", Right: " + this.f17136x.f18277i + "System Gesture Insets - Left: " + this.f17136x.f18283o + ", Top: " + this.f17136x.f18280l + ", Right: " + this.f17136x.f18281m + ", Bottom: " + this.f17136x.f18278j);
        D();
        return onApplyWindowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f17135w = r();
        Activity e7 = u5.h.e(getContext());
        x xVar = this.f17135w;
        if (xVar == null || e7 == null) {
            return;
        }
        xVar.a(e7, androidx.core.content.a.c(getContext()), this.B);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f17125m != null) {
            z4.b.e("FlutterView", "Configuration changed. Sending locales and user settings to Flutter.");
            this.f17130r.d(configuration);
            C();
        }
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return !w() ? super.onCreateInputConnection(editorInfo) : this.f17128p.o(this, this.f17131s, editorInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        x xVar = this.f17135w;
        if (xVar != null) {
            xVar.b(this.B);
        }
        this.f17135w = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (w() && this.f17132t.e(motionEvent)) {
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        return !w() ? super.onHoverEvent(motionEvent) : this.f17133u.I(motionEvent);
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i7) {
        super.onProvideAutofillVirtualStructure(viewStructure, i7);
        this.f17128p.z(viewStructure, i7);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        z4.b.e("FlutterView", "Size changed. Sending Flutter new viewport metrics. FlutterView was " + i9 + " x " + i10 + ", it is now " + i7 + " x " + i8);
        a.g gVar = this.f17136x;
        gVar.f18270b = i7;
        gVar.f18271c = i8;
        D();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!w()) {
            return super.onTouchEvent(motionEvent);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            requestUnbufferedDispatch(motionEvent);
        }
        return this.f17132t.f(motionEvent);
    }

    public void p() {
        this.f17121i.Z();
        io.flutter.embedding.android.g gVar = this.f17120h;
        if (gVar == null) {
            io.flutter.embedding.android.g q7 = q();
            this.f17120h = q7;
            addView(q7);
        } else {
            gVar.i(getWidth(), getHeight());
        }
        this.f17122j = this.f17121i;
        io.flutter.embedding.android.g gVar2 = this.f17120h;
        this.f17121i = gVar2;
        io.flutter.embedding.engine.a aVar = this.f17125m;
        if (aVar != null) {
            gVar2.b(aVar.q());
        }
    }

    public io.flutter.embedding.android.g q() {
        return new io.flutter.embedding.android.g(getContext(), getWidth(), getHeight(), g.b.background);
    }

    protected x r() {
        try {
            return new x(new WindowInfoTrackerCallbackAdapter(WindowInfoTracker.Companion.getOrCreate(getContext())));
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }

    public void s() {
        z4.b.e("FlutterView", "Detaching from a FlutterEngine: " + this.f17125m);
        if (!w()) {
            z4.b.e("FlutterView", "FlutterView not attached to an engine. Not detaching.");
            return;
        }
        Iterator<f> it = this.f17126n.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        getContext().getContentResolver().unregisterContentObserver(this.f17138z);
        this.f17125m.o().I();
        this.f17125m.o().d();
        this.f17133u.O();
        this.f17133u = null;
        this.f17128p.q().restartInput(this);
        this.f17128p.p();
        this.f17131s.c();
        io.flutter.plugin.editing.d dVar = this.f17129q;
        if (dVar != null) {
            dVar.b();
        }
        o5.a aVar = this.f17127o;
        if (aVar != null) {
            aVar.c();
        }
        k5.a q7 = this.f17125m.q();
        this.f17124l = false;
        q7.q(this.A);
        q7.v();
        q7.s(false);
        k5.c cVar = this.f17122j;
        if (cVar != null && this.f17121i == this.f17120h) {
            this.f17121i = cVar;
        }
        this.f17121i.a();
        io.flutter.embedding.android.g gVar = this.f17120h;
        if (gVar != null) {
            gVar.e();
            removeView(this.f17120h);
            this.f17120h = null;
        }
        this.f17122j = null;
        this.f17125m = null;
    }

    @TargetApi(28)
    protected void setWindowInfoListenerDisplayFeatures(WindowLayoutInfo windowLayoutInfo) {
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        List<DisplayFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        ArrayList arrayList = new ArrayList();
        for (DisplayFeature displayFeature : displayFeatures) {
            z4.b.e("FlutterView", "WindowInfoTracker Display Feature reported with bounds = " + displayFeature.getBounds().toString() + " and type = " + displayFeature.getClass().getSimpleName());
            if (displayFeature instanceof FoldingFeature) {
                FoldingFeature foldingFeature = (FoldingFeature) displayFeature;
                arrayList.add(new a.b(displayFeature.getBounds(), foldingFeature.getOcclusionType() == FoldingFeature.OcclusionType.FULL ? a.d.HINGE : a.d.FOLD, foldingFeature.getState() == FoldingFeature.State.FLAT ? a.c.POSTURE_FLAT : foldingFeature.getState() == FoldingFeature.State.HALF_OPENED ? a.c.POSTURE_HALF_OPENED : a.c.UNKNOWN));
            } else {
                arrayList.add(new a.b(displayFeature.getBounds(), a.d.UNKNOWN, a.c.UNKNOWN));
            }
        }
        if (Build.VERSION.SDK_INT >= 28 && (rootWindowInsets = getRootWindowInsets()) != null && (displayCutout = rootWindowInsets.getDisplayCutout()) != null) {
            for (Rect rect : displayCutout.getBoundingRects()) {
                z4.b.e("FlutterView", "DisplayCutout area reported with bounds = " + rect.toString());
                arrayList.add(new a.b(rect, a.d.CUTOUT));
            }
        }
        this.f17136x.f18285q = arrayList;
        D();
    }

    public boolean u() {
        return this.f17124l;
    }

    public boolean w() {
        io.flutter.embedding.engine.a aVar = this.f17125m;
        return aVar != null && aVar.q() == this.f17121i.getAttachedRenderer();
    }

    public void y(f fVar) {
        this.f17126n.remove(fVar);
    }

    public void z(k5.b bVar) {
        this.f17123k.remove(bVar);
    }
}
