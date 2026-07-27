package b;

import A.V;
import B1.C0097d;
import a.AbstractC0345a;
import a1.AbstractC0404s;
import a1.C0403r;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.lifecycle.C0483x;
import androidx.lifecycle.EnumC0474n;
import androidx.lifecycle.EnumC0475o;
import androidx.lifecycle.H;
import androidx.lifecycle.I;
import androidx.lifecycle.InterfaceC0470j;
import androidx.lifecycle.InterfaceC0479t;
import androidx.lifecycle.InterfaceC0481v;
import androidx.lifecycle.M;
import androidx.lifecycle.U;
import androidx.lifecycle.Y;
import androidx.lifecycle.Z;
import b.m;
import com.chicken.road.kedro.laqer.R;
import d.C0540a;
import e.C0553d;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import l.t0;
import n.AbstractC0864b;
import p1.C0993c;
import v1.C1245b;
import v1.C1248e;
import v1.InterfaceC1249f;
import w2.C1294c;
import y2.C1336k;
import y2.InterfaceC1335j;

/* loaded from: classes.dex */
public abstract class o extends Activity implements Z, InterfaceC0470j, InterfaceC1249f, E, InterfaceC0481v {
    private static final i Companion = new i();

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f5560z = 0;

    /* renamed from: d, reason: collision with root package name */
    public final C0483x f5561d = new C0483x(this);

    /* renamed from: e, reason: collision with root package name */
    public final C0540a f5562e;

    /* renamed from: i, reason: collision with root package name */
    public final C1294c f5563i;

    /* renamed from: j, reason: collision with root package name */
    public final V f5564j;

    /* renamed from: k, reason: collision with root package name */
    public Y f5565k;

    /* renamed from: l, reason: collision with root package name */
    public final k f5566l;

    /* renamed from: m, reason: collision with root package name */
    public final InterfaceC1335j f5567m;

    /* renamed from: n, reason: collision with root package name */
    public final AtomicInteger f5568n;

    /* renamed from: o, reason: collision with root package name */
    public final m f5569o;

    /* renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArrayList f5570p;

    /* renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArrayList f5571q;

    /* renamed from: r, reason: collision with root package name */
    public final CopyOnWriteArrayList f5572r;

    /* renamed from: s, reason: collision with root package name */
    public final CopyOnWriteArrayList f5573s;

    /* renamed from: t, reason: collision with root package name */
    public final CopyOnWriteArrayList f5574t;

    /* renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f5575u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f5576v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f5577w;

    /* renamed from: x, reason: collision with root package name */
    public final InterfaceC1335j f5578x;

    /* renamed from: y, reason: collision with root package name */
    public final InterfaceC1335j f5579y;

    public o() {
        C0540a c0540a = new C0540a();
        this.f5562e = c0540a;
        new RunnableC0489d(this, 0);
        C1294c c1294c = new C1294c();
        c1294c.f11388d = new CopyOnWriteArrayList();
        new HashMap();
        this.f5563i = c1294c;
        Intrinsics.checkNotNullParameter(this, "owner");
        V v4 = new V(this);
        this.f5564j = v4;
        this.f5566l = new k(this);
        this.f5567m = C1336k.a(new n(this, 2));
        this.f5568n = new AtomicInteger();
        this.f5569o = new m(this);
        this.f5570p = new CopyOnWriteArrayList();
        this.f5571q = new CopyOnWriteArrayList();
        this.f5572r = new CopyOnWriteArrayList();
        this.f5573s = new CopyOnWriteArrayList();
        this.f5574t = new CopyOnWriteArrayList();
        this.f5575u = new CopyOnWriteArrayList();
        C0483x c0483x = this.f5561d;
        if (c0483x == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        final int i2 = 0;
        c0483x.a(new InterfaceC0479t(this) { // from class: b.e

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ o f5536e;

            {
                this.f5536e = owner;
            }

            @Override // androidx.lifecycle.InterfaceC0479t
            public final void b(InterfaceC0481v interfaceC0481v, EnumC0474n event) {
                Window window;
                View peekDecorView;
                switch (i2) {
                    case 0:
                        o this$0 = this.f5536e;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(interfaceC0481v, "<anonymous parameter 0>");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event == EnumC0474n.ON_STOP && (window = this$0.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                            peekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        o this$02 = this.f5536e;
                        Intrinsics.checkNotNullParameter(this$02, "this$0");
                        Intrinsics.checkNotNullParameter(interfaceC0481v, "<anonymous parameter 0>");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event == EnumC0474n.ON_DESTROY) {
                            this$02.f5562e.f6064b = null;
                            if (!this$02.isChangingConfigurations()) {
                                this$02.d().a();
                            }
                            k kVar = this$02.f5566l;
                            o oVar = kVar.f5545j;
                            oVar.getWindow().getDecorView().removeCallbacks(kVar);
                            oVar.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(kVar);
                            break;
                        }
                        break;
                }
            }
        });
        final int i4 = 1;
        this.f5561d.a(new InterfaceC0479t(this) { // from class: b.e

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ o f5536e;

            {
                this.f5536e = owner;
            }

            @Override // androidx.lifecycle.InterfaceC0479t
            public final void b(InterfaceC0481v interfaceC0481v, EnumC0474n event) {
                Window window;
                View peekDecorView;
                switch (i4) {
                    case 0:
                        o this$0 = this.f5536e;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(interfaceC0481v, "<anonymous parameter 0>");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event == EnumC0474n.ON_STOP && (window = this$0.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                            peekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        o this$02 = this.f5536e;
                        Intrinsics.checkNotNullParameter(this$02, "this$0");
                        Intrinsics.checkNotNullParameter(interfaceC0481v, "<anonymous parameter 0>");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event == EnumC0474n.ON_DESTROY) {
                            this$02.f5562e.f6064b = null;
                            if (!this$02.isChangingConfigurations()) {
                                this$02.d().a();
                            }
                            k kVar = this$02.f5566l;
                            o oVar = kVar.f5545j;
                            oVar.getWindow().getDecorView().removeCallbacks(kVar);
                            oVar.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(kVar);
                            break;
                        }
                        break;
                }
            }
        });
        this.f5561d.a(new C1245b(this));
        v4.e();
        M.e(this);
        ((C1248e) v4.f63d).c("android:support:activity-result", new I(1, this));
        C0491f listener = new C0491f(this);
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(listener, "listener");
        o oVar = c0540a.f6064b;
        if (oVar != null) {
            listener.a(oVar);
        }
        c0540a.f6063a.add(listener);
        this.f5578x = C1336k.a(new n(this, 0));
        this.f5579y = C1336k.a(new n(this, 3));
    }

    @Override // androidx.lifecycle.InterfaceC0470j
    public final t0 a() {
        C0993c c0993c = new C0993c();
        if (getApplication() != null) {
            E1.i iVar = U.f5459d;
            Application application = getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "application");
            c0993c.r(iVar, application);
        }
        c0993c.r(M.f5442a, this);
        c0993c.r(M.f5443b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            c0993c.r(M.f5444c, extras);
        }
        return c0993c;
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h();
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        this.f5566l.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // b.E
    public final D b() {
        return (D) this.f5579y.getValue();
    }

    @Override // v1.InterfaceC1249f
    public final C1248e c() {
        return (C1248e) this.f5564j.f63d;
    }

    @Override // androidx.lifecycle.Z
    public final Y d() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f5565k == null) {
            j jVar = (j) getLastNonConfigurationInstance();
            if (jVar != null) {
                this.f5565k = jVar.f5541a;
            }
            if (this.f5565k == null) {
                this.f5565k = new Y();
            }
        }
        Y y4 = this.f5565k;
        Intrinsics.c(y4);
        return y4;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent event) {
        Object invoke;
        boolean booleanValue;
        Intrinsics.checkNotNullParameter(event, "event");
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        if (u3.d.v(decorView, event)) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Intrinsics.checkNotNullParameter(event, "event");
            return super.dispatchKeyEvent(event);
        }
        onUserInteraction();
        Window window = getWindow();
        boolean z4 = false;
        if (window.hasFeature(8)) {
            ActionBar actionBar = getActionBar();
            if (event.getKeyCode() == 82 && actionBar != null) {
                if (!u3.d.f10942f) {
                    try {
                        u3.d.f10943g = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                    } catch (NoSuchMethodException unused) {
                    }
                    u3.d.f10942f = true;
                }
                Method method = u3.d.f10943g;
                if (method != null) {
                    try {
                        invoke = method.invoke(actionBar, event);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                    if (invoke != null) {
                        booleanValue = ((Boolean) invoke).booleanValue();
                        if (booleanValue) {
                            return true;
                        }
                    }
                }
                booleanValue = false;
                if (booleanValue) {
                }
            }
        }
        if (window.superDispatchKeyEvent(event)) {
            return true;
        }
        View decorView2 = window.getDecorView();
        int i2 = AbstractC0404s.f4892a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList = C0403r.f4888d;
            C0403r c0403r = (C0403r) decorView2.getTag(R.id.tag_unhandled_key_event_manager);
            if (c0403r == null) {
                c0403r = new C0403r();
                c0403r.f4889a = null;
                c0403r.f4890b = null;
                c0403r.f4891c = null;
                decorView2.setTag(R.id.tag_unhandled_key_event_manager, c0403r);
            }
            if (event.getAction() == 0) {
                WeakHashMap weakHashMap = c0403r.f4889a;
                if (weakHashMap != null) {
                    weakHashMap.clear();
                }
                ArrayList arrayList2 = C0403r.f4888d;
                if (!arrayList2.isEmpty()) {
                    synchronized (arrayList2) {
                        try {
                            if (c0403r.f4889a == null) {
                                c0403r.f4889a = new WeakHashMap();
                            }
                            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                ArrayList arrayList3 = C0403r.f4888d;
                                View view = (View) ((WeakReference) arrayList3.get(size)).get();
                                if (view == null) {
                                    arrayList3.remove(size);
                                } else {
                                    c0403r.f4889a.put(view, Boolean.TRUE);
                                    for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        c0403r.f4889a.put((View) parent, Boolean.TRUE);
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
            View a4 = c0403r.a(decorView2);
            if (event.getAction() == 0) {
                int keyCode = event.getKeyCode();
                if (a4 != null && !KeyEvent.isModifierKey(keyCode)) {
                    if (c0403r.f4890b == null) {
                        c0403r.f4890b = new SparseArray();
                    }
                    c0403r.f4890b.put(keyCode, new WeakReference(a4));
                }
            }
            if (a4 != null) {
                z4 = true;
            }
        }
        if (z4) {
            return true;
        }
        return event.dispatch(this, decorView2 != null ? decorView2.getKeyDispatcherState() : null, this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        if (u3.d.v(decorView, event)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(event);
    }

    @Override // androidx.lifecycle.InterfaceC0481v
    public final C0483x e() {
        return this.f5561d;
    }

    @Override // androidx.lifecycle.InterfaceC0470j
    public final androidx.lifecycle.V f() {
        return (androidx.lifecycle.V) this.f5578x.getValue();
    }

    public final void h() {
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        M.i(decorView, this);
        View decorView2 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "window.decorView");
        M.j(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "window.decorView");
        AbstractC0864b.B(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView4, "window.decorView");
        Intrinsics.checkNotNullParameter(decorView4, "<this>");
        Intrinsics.checkNotNullParameter(this, "onBackPressedDispatcherOwner");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView5, "window.decorView");
        Intrinsics.checkNotNullParameter(decorView5, "<this>");
        Intrinsics.checkNotNullParameter(this, "fullyDrawnReporterOwner");
        decorView5.setTag(R.id.report_drawn, this);
    }

    public final void i(Bundle bundle) {
        super.onCreate(bundle);
        int i2 = H.f5429e;
        androidx.lifecycle.F.b(this);
    }

    public final void j(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        this.f5561d.g(EnumC0475o.f5482i);
        super.onSaveInstanceState(outState);
    }

    public final C0097d k(final B1.m callback, final AbstractC0345a contract) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(contract, "contract");
        final m registry = this.f5569o;
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(callback, "callback");
        final String key = "activity_rq#" + this.f5568n.getAndIncrement();
        registry.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(this, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C0483x c0483x = this.f5561d;
        if (c0483x.f5496d.a(EnumC0475o.f5483j)) {
            throw new IllegalStateException(("LifecycleOwner " + this + " is attempting to register while current state is " + c0483x.f5496d + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        LinkedHashMap linkedHashMap = registry.f5551b;
        if (((Integer) linkedHashMap.get(key)) == null) {
            Iterator it = T2.n.e().iterator();
            while (it.hasNext()) {
                Number number = (Number) it.next();
                int intValue = number.intValue();
                LinkedHashMap linkedHashMap2 = registry.f5550a;
                if (!linkedHashMap2.containsKey(Integer.valueOf(intValue))) {
                    int intValue2 = number.intValue();
                    linkedHashMap2.put(Integer.valueOf(intValue2), key);
                    linkedHashMap.put(key, Integer.valueOf(intValue2));
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        LinkedHashMap linkedHashMap3 = registry.f5552c;
        C0553d c0553d = (C0553d) linkedHashMap3.get(key);
        if (c0553d == null) {
            c0553d = new C0553d(c0483x);
        }
        InterfaceC0479t observer = new InterfaceC0479t() { // from class: e.b
            @Override // androidx.lifecycle.InterfaceC0479t
            public final void b(InterfaceC0481v interfaceC0481v, EnumC0474n event) {
                Integer num;
                m this$0 = m.this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                String key2 = key;
                Intrinsics.checkNotNullParameter(key2, "$key");
                B1.m callback2 = callback;
                Intrinsics.checkNotNullParameter(callback2, "$callback");
                AbstractC0345a contract2 = contract;
                Intrinsics.checkNotNullParameter(contract2, "$contract");
                Intrinsics.checkNotNullParameter(interfaceC0481v, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(event, "event");
                if (EnumC0474n.ON_START == event) {
                    this$0.f5554e.put(key2, new C0552c(callback2, contract2));
                    LinkedHashMap linkedHashMap4 = this$0.f5555f;
                    if (linkedHashMap4.containsKey(key2)) {
                        Object obj = linkedHashMap4.get(key2);
                        linkedHashMap4.remove(key2);
                        callback2.a(obj);
                    }
                    Bundle bundle = this$0.f5556g;
                    C0550a c0550a = (C0550a) M1.a.E(key2, bundle);
                    if (c0550a != null) {
                        bundle.remove(key2);
                        callback2.a(contract2.B(c0550a.f6137e, c0550a.f6136d));
                        return;
                    }
                    return;
                }
                if (EnumC0474n.ON_STOP == event) {
                    this$0.f5554e.remove(key2);
                    return;
                }
                if (EnumC0474n.ON_DESTROY == event) {
                    this$0.getClass();
                    Intrinsics.checkNotNullParameter(key2, "key");
                    if (!this$0.f5553d.contains(key2) && (num = (Integer) this$0.f5551b.remove(key2)) != null) {
                        this$0.f5550a.remove(num);
                    }
                    this$0.f5554e.remove(key2);
                    LinkedHashMap linkedHashMap5 = this$0.f5555f;
                    if (linkedHashMap5.containsKey(key2)) {
                        Log.w("ActivityResultRegistry", "Dropping pending result for request " + key2 + ": " + linkedHashMap5.get(key2));
                        linkedHashMap5.remove(key2);
                    }
                    Bundle bundle2 = this$0.f5556g;
                    if (bundle2.containsKey(key2)) {
                        Log.w("ActivityResultRegistry", "Dropping pending result for request " + key2 + ": " + ((C0550a) M1.a.E(key2, bundle2)));
                        bundle2.remove(key2);
                    }
                    LinkedHashMap linkedHashMap6 = this$0.f5552c;
                    C0553d c0553d2 = (C0553d) linkedHashMap6.get(key2);
                    if (c0553d2 != null) {
                        ArrayList arrayList = c0553d2.f6145b;
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            c0553d2.f6144a.f((InterfaceC0479t) it2.next());
                        }
                        arrayList.clear();
                        linkedHashMap6.remove(key2);
                    }
                }
            }
        };
        Intrinsics.checkNotNullParameter(observer, "observer");
        c0553d.f6144a.a(observer);
        c0553d.f6145b.add(observer);
        linkedHashMap3.put(key, c0553d);
        return new C0097d(registry, key, contract, 11);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i2, int i4, Intent intent) {
        if (this.f5569o.a(i2, i4, intent)) {
            return;
        }
        super.onActivityResult(i2, i4, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        b().c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator it = this.f5570p.iterator();
        while (it.hasNext()) {
            ((m1.h) it.next()).a(newConfig);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f5564j.f(bundle);
        C0540a c0540a = this.f5562e;
        c0540a.getClass();
        Intrinsics.checkNotNullParameter(this, "context");
        c0540a.f6064b = this;
        Iterator it = c0540a.f6063a.iterator();
        while (it.hasNext()) {
            ((C0491f) it.next()).a(this);
        }
        i(bundle);
        int i2 = H.f5429e;
        androidx.lifecycle.F.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i2, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (i2 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i2, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f5563i.f11388d).iterator();
        if (!it.hasNext()) {
            return true;
        }
        ((m1.i) it.next()).getClass();
        throw null;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i2, MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (super.onMenuItemSelected(i2, item)) {
            return true;
        }
        if (i2 == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.f5563i.f11388d).iterator();
            if (it.hasNext()) {
                ((m1.i) it.next()).getClass();
                throw null;
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z4) {
        if (this.f5576v) {
            return;
        }
        Iterator it = this.f5573s.iterator();
        while (it.hasNext()) {
            ((m1.h) it.next()).a(new S0.b(z4));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.f5572r.iterator();
        while (it.hasNext()) {
            ((m1.h) it.next()).a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i2, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Iterator it = ((CopyOnWriteArrayList) this.f5563i.f11388d).iterator();
        if (it.hasNext()) {
            ((m1.i) it.next()).getClass();
            throw null;
        }
        super.onPanelClosed(i2, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z4) {
        if (this.f5577w) {
            return;
        }
        Iterator it = this.f5574t.iterator();
        while (it.hasNext()) {
            ((m1.h) it.next()).a(new S0.o(z4));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i2, View view, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (i2 != 0) {
            return true;
        }
        super.onPreparePanel(i2, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f5563i.f11388d).iterator();
        if (!it.hasNext()) {
            return true;
        }
        ((m1.i) it.next()).getClass();
        throw null;
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i2, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (this.f5569o.a(i2, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(i2, permissions, grantResults);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        j jVar;
        Y y4 = this.f5565k;
        if (y4 == null && (jVar = (j) getLastNonConfigurationInstance()) != null) {
            y4 = jVar.f5541a;
        }
        if (y4 == null) {
            return null;
        }
        j jVar2 = new j();
        jVar2.f5541a = y4;
        return jVar2;
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        C0483x c0483x = this.f5561d;
        if (c0483x != null) {
            c0483x.g(EnumC0475o.f5482i);
        }
        j(outState);
        this.f5564j.g(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        super.onTrimMemory(i2);
        Iterator it = this.f5571q.iterator();
        while (it.hasNext()) {
            ((m1.h) it.next()).a(Integer.valueOf(i2));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f5575u.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (m3.z.p()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            ((u) this.f5567m.getValue()).a();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i2) {
        h();
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        this.f5566l.a(decorView);
        super.setContentView(i2);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i2) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startActivityForResult(intent, i2);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intent, int i2, Intent intent2, int i4, int i5, int i6) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startIntentSenderForResult(intent, i2, intent2, i4, i5, i6);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i2, Bundle bundle) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startActivityForResult(intent, i2, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intent, int i2, Intent intent2, int i4, int i5, int i6, Bundle bundle) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startIntentSenderForResult(intent, i2, intent2, i4, i5, i6, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z4, Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.f5576v = true;
        try {
            super.onMultiWindowModeChanged(z4, newConfig);
            this.f5576v = false;
            Iterator it = this.f5573s.iterator();
            while (it.hasNext()) {
                m1.h hVar = (m1.h) it.next();
                Intrinsics.checkNotNullParameter(newConfig, "newConfig");
                hVar.a(new S0.b(z4));
            }
        } catch (Throwable th) {
            this.f5576v = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z4, Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.f5577w = true;
        try {
            super.onPictureInPictureModeChanged(z4, newConfig);
            this.f5577w = false;
            Iterator it = this.f5574t.iterator();
            while (it.hasNext()) {
                m1.h hVar = (m1.h) it.next();
                Intrinsics.checkNotNullParameter(newConfig, "newConfig");
                hVar.a(new S0.o(z4));
            }
        } catch (Throwable th) {
            this.f5577w = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        h();
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        this.f5566l.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h();
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        this.f5566l.a(decorView);
        super.setContentView(view, layoutParams);
    }
}
