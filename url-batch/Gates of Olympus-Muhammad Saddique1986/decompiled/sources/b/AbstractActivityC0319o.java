package b;

import B.U;
import B.Y;
import L1.g;
import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Trace;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.C0294x;
import androidx.lifecycle.EnumC0285n;
import androidx.lifecycle.EnumC0286o;
import androidx.lifecycle.I;
import androidx.lifecycle.InterfaceC0281j;
import androidx.lifecycle.InterfaceC0290t;
import androidx.lifecycle.InterfaceC0292v;
import androidx.lifecycle.K;
import androidx.lifecycle.L;
import androidx.lifecycle.P;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import b.C0317m;
import b1.InterfaceC0353a;
import com.gatesof.olympus.martu.marku.R;
import e.C0412d;
import e.C0413e;
import e2.InterfaceC0422a;
import f2.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import m2.C0651a;
import q1.C0812b;

/* renamed from: b.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0319o extends U0.b implements b0, InterfaceC0281j, y1.f, InterfaceC0302F {
    private static final C0312h Companion = new C0312h();

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f5313w = 0;

    /* renamed from: e, reason: collision with root package name */
    public final d.a f5314e;

    /* renamed from: f, reason: collision with root package name */
    public final Y f5315f;

    /* renamed from: g, reason: collision with root package name */
    public final U f5316g;

    /* renamed from: h, reason: collision with root package name */
    public a0 f5317h;

    /* renamed from: i, reason: collision with root package name */
    public final ViewTreeObserverOnDrawListenerC0314j f5318i;

    /* renamed from: j, reason: collision with root package name */
    public final R1.n f5319j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f5320k;

    /* renamed from: l, reason: collision with root package name */
    public final C0317m f5321l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f5322m;

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList f5323n;

    /* renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArrayList f5324o;

    /* renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArrayList f5325p;

    /* renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArrayList f5326q;

    /* renamed from: r, reason: collision with root package name */
    public final CopyOnWriteArrayList f5327r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f5328s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f5329t;

    /* renamed from: u, reason: collision with root package name */
    public final R1.n f5330u;

    /* renamed from: v, reason: collision with root package name */
    public final R1.n f5331v;

    public AbstractActivityC0319o() {
        d.a aVar = new d.a();
        this.f5314e = aVar;
        this.f5315f = new Y(20);
        U u3 = new U(this);
        this.f5316g = u3;
        this.f5318i = new ViewTreeObserverOnDrawListenerC0314j(this);
        this.f5319j = R1.a.d(new C0318n(this, 2));
        this.f5320k = new AtomicInteger();
        this.f5321l = new C0317m(this);
        this.f5322m = new CopyOnWriteArrayList();
        this.f5323n = new CopyOnWriteArrayList();
        this.f5324o = new CopyOnWriteArrayList();
        this.f5325p = new CopyOnWriteArrayList();
        this.f5326q = new CopyOnWriteArrayList();
        this.f5327r = new CopyOnWriteArrayList();
        C0294x c0294x = this.f4509d;
        if (c0294x == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        final int i3 = 0;
        c0294x.a(new InterfaceC0290t(this) { // from class: b.d

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ AbstractActivityC0319o f5286e;

            {
                this.f5286e = this;
            }

            @Override // androidx.lifecycle.InterfaceC0290t
            public final void b(InterfaceC0292v interfaceC0292v, EnumC0285n enumC0285n) {
                Window window;
                View peekDecorView;
                switch (i3) {
                    case 0:
                        AbstractActivityC0319o abstractActivityC0319o = this.f5286e;
                        f2.j.f(abstractActivityC0319o, "this$0");
                        if (enumC0285n == EnumC0285n.ON_STOP && (window = abstractActivityC0319o.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                            peekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        AbstractActivityC0319o abstractActivityC0319o2 = this.f5286e;
                        f2.j.f(abstractActivityC0319o2, "this$0");
                        if (enumC0285n == EnumC0285n.ON_DESTROY) {
                            abstractActivityC0319o2.f5314e.f5643b = null;
                            if (!abstractActivityC0319o2.isChangingConfigurations()) {
                                abstractActivityC0319o2.d().a();
                            }
                            ViewTreeObserverOnDrawListenerC0314j viewTreeObserverOnDrawListenerC0314j = abstractActivityC0319o2.f5318i;
                            AbstractActivityC0319o abstractActivityC0319o3 = viewTreeObserverOnDrawListenerC0314j.f5295g;
                            abstractActivityC0319o3.getWindow().getDecorView().removeCallbacks(viewTreeObserverOnDrawListenerC0314j);
                            abstractActivityC0319o3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC0314j);
                            break;
                        }
                        break;
                }
            }
        });
        final int i4 = 1;
        this.f4509d.a(new InterfaceC0290t(this) { // from class: b.d

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ AbstractActivityC0319o f5286e;

            {
                this.f5286e = this;
            }

            @Override // androidx.lifecycle.InterfaceC0290t
            public final void b(InterfaceC0292v interfaceC0292v, EnumC0285n enumC0285n) {
                Window window;
                View peekDecorView;
                switch (i4) {
                    case 0:
                        AbstractActivityC0319o abstractActivityC0319o = this.f5286e;
                        f2.j.f(abstractActivityC0319o, "this$0");
                        if (enumC0285n == EnumC0285n.ON_STOP && (window = abstractActivityC0319o.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                            peekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        AbstractActivityC0319o abstractActivityC0319o2 = this.f5286e;
                        f2.j.f(abstractActivityC0319o2, "this$0");
                        if (enumC0285n == EnumC0285n.ON_DESTROY) {
                            abstractActivityC0319o2.f5314e.f5643b = null;
                            if (!abstractActivityC0319o2.isChangingConfigurations()) {
                                abstractActivityC0319o2.d().a();
                            }
                            ViewTreeObserverOnDrawListenerC0314j viewTreeObserverOnDrawListenerC0314j = abstractActivityC0319o2.f5318i;
                            AbstractActivityC0319o abstractActivityC0319o3 = viewTreeObserverOnDrawListenerC0314j.f5295g;
                            abstractActivityC0319o3.getWindow().getDecorView().removeCallbacks(viewTreeObserverOnDrawListenerC0314j);
                            abstractActivityC0319o3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC0314j);
                            break;
                        }
                        break;
                }
            }
        });
        this.f4509d.a(new y1.b(3, this));
        u3.e();
        P.e(this);
        ((y1.e) u3.f320d).c("android:support:activity-result", new L(1, this));
        C0309e c0309e = new C0309e(this);
        AbstractActivityC0319o abstractActivityC0319o = aVar.f5643b;
        if (abstractActivityC0319o != null) {
            c0309e.a(abstractActivityC0319o);
        }
        aVar.f5642a.add(c0309e);
        this.f5330u = R1.a.d(new C0318n(this, 0));
        this.f5331v = R1.a.d(new C0318n(this, 3));
    }

    @Override // androidx.lifecycle.InterfaceC0281j
    public final C0812b a() {
        C0812b c0812b = new C0812b();
        Application application = getApplication();
        LinkedHashMap linkedHashMap = (LinkedHashMap) c0812b.f6877a;
        if (application != null) {
            A1.i iVar = W.f5205d;
            Application application2 = getApplication();
            f2.j.e(application2, "application");
            linkedHashMap.put(iVar, application2);
        }
        linkedHashMap.put(P.f5187a, this);
        linkedHashMap.put(P.f5188b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(P.f5189c, extras);
        }
        return c0812b;
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h();
        View decorView = getWindow().getDecorView();
        f2.j.e(decorView, "window.decorView");
        this.f5318i.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // b.InterfaceC0302F
    public final C0301E b() {
        return (C0301E) this.f5331v.getValue();
    }

    @Override // y1.f
    public final y1.e c() {
        return (y1.e) this.f5316g.f320d;
    }

    @Override // androidx.lifecycle.b0
    public final a0 d() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f5317h == null) {
            C0313i c0313i = (C0313i) getLastNonConfigurationInstance();
            if (c0313i != null) {
                this.f5317h = c0313i.f5291a;
            }
            if (this.f5317h == null) {
                this.f5317h = new a0();
            }
        }
        a0 a0Var = this.f5317h;
        f2.j.c(a0Var);
        return a0Var;
    }

    @Override // androidx.lifecycle.InterfaceC0292v
    public final C0294x e() {
        return this.f4509d;
    }

    @Override // androidx.lifecycle.InterfaceC0281j
    public final X f() {
        return (X) this.f5330u.getValue();
    }

    public final void h() {
        View decorView = getWindow().getDecorView();
        f2.j.e(decorView, "window.decorView");
        P.k(decorView, this);
        View decorView2 = getWindow().getDecorView();
        f2.j.e(decorView2, "window.decorView");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        f2.j.e(decorView3, "window.decorView");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        f2.j.e(decorView4, "window.decorView");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        f2.j.e(decorView5, "window.decorView");
        decorView5.setTag(R.id.report_drawn, this);
    }

    public final G1.m i(final L1.g gVar, final O2.d dVar) {
        final C0317m c0317m = this.f5321l;
        f2.j.f(c0317m, "registry");
        final String str = "activity_rq#" + this.f5320k.getAndIncrement();
        f2.j.f(str, "key");
        C0294x c0294x = this.f4509d;
        if (c0294x.f5242d.compareTo(EnumC0286o.f5229g) >= 0) {
            throw new IllegalStateException(("LifecycleOwner " + this + " is attempting to register while current state is " + c0294x.f5242d + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        LinkedHashMap linkedHashMap = c0317m.f5304b;
        if (((Integer) linkedHashMap.get(str)) == null) {
            Iterator it = new C0651a(new m2.k(C0413e.f5686e, new m2.j(1, 1))).iterator();
            while (it.hasNext()) {
                Number number = (Number) it.next();
                int intValue = number.intValue();
                LinkedHashMap linkedHashMap2 = c0317m.f5303a;
                if (!linkedHashMap2.containsKey(Integer.valueOf(intValue))) {
                    int intValue2 = number.intValue();
                    linkedHashMap2.put(Integer.valueOf(intValue2), str);
                    linkedHashMap.put(str, Integer.valueOf(intValue2));
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        LinkedHashMap linkedHashMap3 = c0317m.f5305c;
        C0412d c0412d = (C0412d) linkedHashMap3.get(str);
        if (c0412d == null) {
            c0412d = new C0412d(c0294x);
        }
        InterfaceC0290t interfaceC0290t = new InterfaceC0290t() { // from class: e.b
            @Override // androidx.lifecycle.InterfaceC0290t
            public final void b(InterfaceC0292v interfaceC0292v, EnumC0285n enumC0285n) {
                Object obj;
                Integer num;
                Object obj2;
                C0317m c0317m2 = C0317m.this;
                j.f(c0317m2, "this$0");
                String str2 = str;
                g gVar2 = gVar;
                O2.d dVar2 = dVar;
                EnumC0285n enumC0285n2 = EnumC0285n.ON_START;
                LinkedHashMap linkedHashMap4 = c0317m2.f5307e;
                LinkedHashMap linkedHashMap5 = c0317m2.f5308f;
                Bundle bundle = c0317m2.f5309g;
                if (enumC0285n2 == enumC0285n) {
                    linkedHashMap4.put(str2, new C0411c(gVar2, dVar2));
                    if (linkedHashMap5.containsKey(str2)) {
                        Object obj3 = linkedHashMap5.get(str2);
                        linkedHashMap5.remove(str2);
                        gVar2.b(obj3);
                    }
                    if (Build.VERSION.SDK_INT >= 34) {
                        obj2 = Z0.b.a(bundle, str2, C0409a.class);
                    } else {
                        Parcelable parcelable = bundle.getParcelable(str2);
                        obj2 = C0409a.class.isInstance(parcelable) ? parcelable : null;
                    }
                    C0409a c0409a = (C0409a) obj2;
                    if (c0409a != null) {
                        bundle.remove(str2);
                        gVar2.b(dVar2.b0(c0409a.f5677e, c0409a.f5676d));
                        return;
                    }
                    return;
                }
                if (EnumC0285n.ON_STOP == enumC0285n) {
                    linkedHashMap4.remove(str2);
                    return;
                }
                if (EnumC0285n.ON_DESTROY == enumC0285n) {
                    if (!c0317m2.f5306d.contains(str2) && (num = (Integer) c0317m2.f5304b.remove(str2)) != null) {
                        c0317m2.f5303a.remove(num);
                    }
                    linkedHashMap4.remove(str2);
                    if (linkedHashMap5.containsKey(str2)) {
                        Log.w("ActivityResultRegistry", "Dropping pending result for request " + str2 + ": " + linkedHashMap5.get(str2));
                        linkedHashMap5.remove(str2);
                    }
                    if (bundle.containsKey(str2)) {
                        if (Build.VERSION.SDK_INT >= 34) {
                            obj = Z0.b.a(bundle, str2, C0409a.class);
                        } else {
                            Parcelable parcelable2 = bundle.getParcelable(str2);
                            obj = C0409a.class.isInstance(parcelable2) ? parcelable2 : null;
                        }
                        Log.w("ActivityResultRegistry", "Dropping pending result for request " + str2 + ": " + ((C0409a) obj));
                        bundle.remove(str2);
                    }
                    LinkedHashMap linkedHashMap6 = c0317m2.f5305c;
                    C0412d c0412d2 = (C0412d) linkedHashMap6.get(str2);
                    if (c0412d2 != null) {
                        ArrayList arrayList = c0412d2.f5685b;
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            c0412d2.f5684a.f((InterfaceC0290t) it2.next());
                        }
                        arrayList.clear();
                        linkedHashMap6.remove(str2);
                    }
                }
            }
        };
        c0412d.f5684a.a(interfaceC0290t);
        c0412d.f5685b.add(interfaceC0290t);
        linkedHashMap3.put(str, c0412d);
        return new G1.m(c0317m, str, dVar, 9);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i3, int i4, Intent intent) {
        if (this.f5321l.a(i3, i4, intent)) {
            return;
        }
        super.onActivityResult(i3, i4, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        b().c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        f2.j.f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator it = this.f5322m.iterator();
        while (it.hasNext()) {
            ((InterfaceC0353a) it.next()).a(configuration);
        }
    }

    @Override // U0.b, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f5316g.f(bundle);
        d.a aVar = this.f5314e;
        aVar.getClass();
        aVar.f5643b = this;
        Iterator it = aVar.f5642a.iterator();
        while (it.hasNext()) {
            ((C0309e) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i3 = K.f5174e;
        I.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i3, Menu menu) {
        f2.j.f(menu, "menu");
        if (i3 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i3, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f5315f.f334d).iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i3, MenuItem menuItem) {
        f2.j.f(menuItem, "item");
        if (super.onMenuItemSelected(i3, menuItem)) {
            return true;
        }
        if (i3 != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5315f.f334d).iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z3) {
        if (this.f5328s) {
            return;
        }
        Iterator it = this.f5325p.iterator();
        while (it.hasNext()) {
            ((InterfaceC0353a) it.next()).a(new A1.i(13, false));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        f2.j.f(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.f5324o.iterator();
        while (it.hasNext()) {
            ((InterfaceC0353a) it.next()).a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i3, Menu menu) {
        f2.j.f(menu, "menu");
        Iterator it = ((CopyOnWriteArrayList) this.f5315f.f334d).iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        super.onPanelClosed(i3, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z3) {
        if (this.f5329t) {
            return;
        }
        Iterator it = this.f5326q.iterator();
        while (it.hasNext()) {
            ((InterfaceC0353a) it.next()).a(new A1.i(14, false));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i3, View view, Menu menu) {
        f2.j.f(menu, "menu");
        if (i3 != 0) {
            return true;
        }
        super.onPreparePanel(i3, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f5315f.f334d).iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        f2.j.f(strArr, "permissions");
        f2.j.f(iArr, "grantResults");
        if (this.f5321l.a(i3, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i3, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0313i c0313i;
        a0 a0Var = this.f5317h;
        if (a0Var == null && (c0313i = (C0313i) getLastNonConfigurationInstance()) != null) {
            a0Var = c0313i.f5291a;
        }
        if (a0Var == null) {
            return null;
        }
        C0313i c0313i2 = new C0313i();
        c0313i2.f5291a = a0Var;
        return c0313i2;
    }

    @Override // U0.b, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        f2.j.f(bundle, "outState");
        C0294x c0294x = this.f4509d;
        if (c0294x != null) {
            c0294x.g(EnumC0286o.f5228f);
        }
        super.onSaveInstanceState(bundle);
        this.f5316g.g(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i3) {
        super.onTrimMemory(i3);
        Iterator it = this.f5323n.iterator();
        while (it.hasNext()) {
            ((InterfaceC0353a) it.next()).a(Integer.valueOf(i3));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f5327r.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (l0.c.C()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            C0326v c0326v = (C0326v) this.f5319j.getValue();
            synchronized (c0326v.f5334a) {
                try {
                    c0326v.f5335b = true;
                    Iterator it = c0326v.f5336c.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC0422a) it.next()).b();
                    }
                    c0326v.f5336c.clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i3) {
        h();
        View decorView = getWindow().getDecorView();
        f2.j.e(decorView, "window.decorView");
        this.f5318i.a(decorView);
        super.setContentView(i3);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i3) {
        f2.j.f(intent, "intent");
        super.startActivityForResult(intent, i3);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i3, Intent intent, int i4, int i5, int i6) {
        f2.j.f(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i3, intent, i4, i5, i6);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i3, Bundle bundle) {
        f2.j.f(intent, "intent");
        super.startActivityForResult(intent, i3, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i3, Intent intent, int i4, int i5, int i6, Bundle bundle) {
        f2.j.f(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i3, intent, i4, i5, i6, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        h();
        View decorView = getWindow().getDecorView();
        f2.j.e(decorView, "window.decorView");
        this.f5318i.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z3, Configuration configuration) {
        f2.j.f(configuration, "newConfig");
        this.f5328s = true;
        try {
            super.onMultiWindowModeChanged(z3, configuration);
            this.f5328s = false;
            Iterator it = this.f5325p.iterator();
            while (it.hasNext()) {
                ((InterfaceC0353a) it.next()).a(new A1.i(13, false));
            }
        } catch (Throwable th) {
            this.f5328s = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z3, Configuration configuration) {
        f2.j.f(configuration, "newConfig");
        this.f5329t = true;
        try {
            super.onPictureInPictureModeChanged(z3, configuration);
            this.f5329t = false;
            Iterator it = this.f5326q.iterator();
            while (it.hasNext()) {
                ((InterfaceC0353a) it.next()).a(new A1.i(14, false));
            }
        } catch (Throwable th) {
            this.f5329t = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h();
        View decorView = getWindow().getDecorView();
        f2.j.e(decorView, "window.decorView");
        this.f5318i.a(decorView);
        super.setContentView(view, layoutParams);
    }
}
