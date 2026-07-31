package b;

import D1.C0014b;
import D1.h;
import Z1.i;
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
import androidx.lifecycle.C0238x;
import androidx.lifecycle.EnumC0229n;
import androidx.lifecycle.EnumC0230o;
import androidx.lifecycle.InterfaceC0225j;
import androidx.lifecycle.InterfaceC0234t;
import androidx.lifecycle.InterfaceC0236v;
import androidx.lifecycle.K;
import androidx.lifecycle.L;
import androidx.lifecycle.P;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import b.m;
import com.gates.olympus.miruv.R;
import e.C0332d;
import e.C0333e;
import f.AbstractC0382a;
import g2.C0405a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import n1.C0675b;

/* loaded from: classes.dex */
public abstract class o extends S0.b implements b0, InterfaceC0225j, u1.f, G {
    private static final C0248h Companion = new C0248h();

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f4177w = 0;

    /* renamed from: e, reason: collision with root package name */
    public final d.a f4178e;

    /* renamed from: f, reason: collision with root package name */
    public final A2.g f4179f;

    /* renamed from: g, reason: collision with root package name */
    public final Z.r f4180g;

    /* renamed from: h, reason: collision with root package name */
    public a0 f4181h;

    /* renamed from: i, reason: collision with root package name */
    public final j f4182i;

    /* renamed from: j, reason: collision with root package name */
    public final L1.o f4183j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f4184k;

    /* renamed from: l, reason: collision with root package name */
    public final m f4185l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f4186m;

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList f4187n;

    /* renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArrayList f4188o;
    public final CopyOnWriteArrayList p;

    /* renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArrayList f4189q;

    /* renamed from: r, reason: collision with root package name */
    public final CopyOnWriteArrayList f4190r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f4191s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f4192t;

    /* renamed from: u, reason: collision with root package name */
    public final L1.o f4193u;

    /* renamed from: v, reason: collision with root package name */
    public final L1.o f4194v;

    public o() {
        d.a aVar = new d.a();
        this.f4178e = aVar;
        this.f4179f = new A2.g(15);
        Z.r rVar = new Z.r(this);
        this.f4180g = rVar;
        this.f4182i = new j(this);
        this.f4183j = I2.d.F(new n(this, 2));
        this.f4184k = new AtomicInteger();
        this.f4185l = new m(this);
        this.f4186m = new CopyOnWriteArrayList();
        this.f4187n = new CopyOnWriteArrayList();
        this.f4188o = new CopyOnWriteArrayList();
        this.p = new CopyOnWriteArrayList();
        this.f4189q = new CopyOnWriteArrayList();
        this.f4190r = new CopyOnWriteArrayList();
        C0238x c0238x = this.f3274d;
        if (c0238x == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        final int i3 = 0;
        c0238x.a(new InterfaceC0234t(this) { // from class: b.d

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ o f4151e;

            {
                this.f4151e = this;
            }

            @Override // androidx.lifecycle.InterfaceC0234t
            public final void b(InterfaceC0236v interfaceC0236v, EnumC0229n enumC0229n) {
                Window window;
                View peekDecorView;
                switch (i3) {
                    case 0:
                        o oVar = this.f4151e;
                        Z1.i.f(oVar, "this$0");
                        if (enumC0229n == EnumC0229n.ON_STOP && (window = oVar.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                            peekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        o oVar2 = this.f4151e;
                        Z1.i.f(oVar2, "this$0");
                        if (enumC0229n == EnumC0229n.ON_DESTROY) {
                            oVar2.f4178e.f4438b = null;
                            if (!oVar2.isChangingConfigurations()) {
                                oVar2.d().a();
                            }
                            j jVar = oVar2.f4182i;
                            o oVar3 = jVar.f4160g;
                            oVar3.getWindow().getDecorView().removeCallbacks(jVar);
                            oVar3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(jVar);
                            break;
                        }
                        break;
                }
            }
        });
        final int i4 = 1;
        this.f3274d.a(new InterfaceC0234t(this) { // from class: b.d

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ o f4151e;

            {
                this.f4151e = this;
            }

            @Override // androidx.lifecycle.InterfaceC0234t
            public final void b(InterfaceC0236v interfaceC0236v, EnumC0229n enumC0229n) {
                Window window;
                View peekDecorView;
                switch (i4) {
                    case 0:
                        o oVar = this.f4151e;
                        Z1.i.f(oVar, "this$0");
                        if (enumC0229n == EnumC0229n.ON_STOP && (window = oVar.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                            peekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        o oVar2 = this.f4151e;
                        Z1.i.f(oVar2, "this$0");
                        if (enumC0229n == EnumC0229n.ON_DESTROY) {
                            oVar2.f4178e.f4438b = null;
                            if (!oVar2.isChangingConfigurations()) {
                                oVar2.d().a();
                            }
                            j jVar = oVar2.f4182i;
                            o oVar3 = jVar.f4160g;
                            oVar3.getWindow().getDecorView().removeCallbacks(jVar);
                            oVar3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(jVar);
                            break;
                        }
                        break;
                }
            }
        });
        this.f3274d.a(new u1.b(3, this));
        rVar.d();
        P.e(this);
        ((u1.e) rVar.f3455c).c("android:support:activity-result", new L(1, this));
        C0245e c0245e = new C0245e(this);
        o oVar = aVar.f4438b;
        if (oVar != null) {
            c0245e.a(oVar);
        }
        aVar.f4437a.add(c0245e);
        this.f4193u = I2.d.F(new n(this, 0));
        this.f4194v = I2.d.F(new n(this, 3));
    }

    @Override // androidx.lifecycle.InterfaceC0225j
    public final C0675b a() {
        C0675b c0675b = new C0675b();
        Application application = getApplication();
        LinkedHashMap linkedHashMap = (LinkedHashMap) c0675b.f5876a;
        if (application != null) {
            F0.a aVar = W.f4004d;
            Application application2 = getApplication();
            Z1.i.e(application2, "application");
            linkedHashMap.put(aVar, application2);
        }
        linkedHashMap.put(P.f3986a, this);
        linkedHashMap.put(P.f3987b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(P.f3988c, extras);
        }
        return c0675b;
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h();
        View decorView = getWindow().getDecorView();
        Z1.i.e(decorView, "window.decorView");
        this.f4182i.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // b.G
    public final F b() {
        return (F) this.f4194v.getValue();
    }

    @Override // u1.f
    public final u1.e c() {
        return (u1.e) this.f4180g.f3455c;
    }

    @Override // androidx.lifecycle.b0
    public final a0 d() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f4181h == null) {
            C0249i c0249i = (C0249i) getLastNonConfigurationInstance();
            if (c0249i != null) {
                this.f4181h = c0249i.f4156a;
            }
            if (this.f4181h == null) {
                this.f4181h = new a0();
            }
        }
        a0 a0Var = this.f4181h;
        Z1.i.c(a0Var);
        return a0Var;
    }

    @Override // androidx.lifecycle.InterfaceC0236v
    public final C0238x e() {
        return this.f3274d;
    }

    @Override // androidx.lifecycle.InterfaceC0225j
    public final X f() {
        return (X) this.f4193u.getValue();
    }

    public final void h() {
        View decorView = getWindow().getDecorView();
        Z1.i.e(decorView, "window.decorView");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        Z1.i.e(decorView2, "window.decorView");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        Z1.i.e(decorView3, "window.decorView");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        Z1.i.e(decorView4, "window.decorView");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        Z1.i.e(decorView5, "window.decorView");
        decorView5.setTag(R.id.report_drawn, this);
    }

    public final C0014b i(final D1.h hVar, final AbstractC0382a abstractC0382a) {
        final m mVar = this.f4185l;
        Z1.i.f(mVar, "registry");
        final String str = "activity_rq#" + this.f4184k.getAndIncrement();
        Z1.i.f(str, "key");
        C0238x c0238x = this.f3274d;
        if (c0238x.f4041d.compareTo(EnumC0230o.f4028g) >= 0) {
            throw new IllegalStateException(("LifecycleOwner " + this + " is attempting to register while current state is " + c0238x.f4041d + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        LinkedHashMap linkedHashMap = mVar.f4168b;
        if (((Integer) linkedHashMap.get(str)) == null) {
            Iterator it = new C0405a(new g2.l(C0333e.f4464e, new g2.k(1, 1))).iterator();
            while (it.hasNext()) {
                Number number = (Number) it.next();
                int intValue = number.intValue();
                LinkedHashMap linkedHashMap2 = mVar.f4167a;
                if (!linkedHashMap2.containsKey(Integer.valueOf(intValue))) {
                    int intValue2 = number.intValue();
                    linkedHashMap2.put(Integer.valueOf(intValue2), str);
                    linkedHashMap.put(str, Integer.valueOf(intValue2));
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        LinkedHashMap linkedHashMap3 = mVar.f4169c;
        C0332d c0332d = (C0332d) linkedHashMap3.get(str);
        if (c0332d == null) {
            c0332d = new C0332d(c0238x);
        }
        InterfaceC0234t interfaceC0234t = new InterfaceC0234t() { // from class: e.b
            @Override // androidx.lifecycle.InterfaceC0234t
            public final void b(InterfaceC0236v interfaceC0236v, EnumC0229n enumC0229n) {
                Object obj;
                Integer num;
                Object obj2;
                m mVar2 = m.this;
                i.f(mVar2, "this$0");
                String str2 = str;
                h hVar2 = hVar;
                AbstractC0382a abstractC0382a2 = abstractC0382a;
                EnumC0229n enumC0229n2 = EnumC0229n.ON_START;
                LinkedHashMap linkedHashMap4 = mVar2.f4171e;
                LinkedHashMap linkedHashMap5 = mVar2.f4172f;
                Bundle bundle = mVar2.f4173g;
                if (enumC0229n2 == enumC0229n) {
                    linkedHashMap4.put(str2, new C0331c(hVar2, abstractC0382a2));
                    if (linkedHashMap5.containsKey(str2)) {
                        Object obj3 = linkedHashMap5.get(str2);
                        linkedHashMap5.remove(str2);
                        hVar2.b(obj3);
                    }
                    if (Build.VERSION.SDK_INT >= 34) {
                        obj2 = X0.b.a(bundle, str2, C0329a.class);
                    } else {
                        Parcelable parcelable = bundle.getParcelable(str2);
                        obj2 = C0329a.class.isInstance(parcelable) ? parcelable : null;
                    }
                    C0329a c0329a = (C0329a) obj2;
                    if (c0329a != null) {
                        bundle.remove(str2);
                        hVar2.b(abstractC0382a2.u(c0329a.f4455e, c0329a.f4454d));
                        return;
                    }
                    return;
                }
                if (EnumC0229n.ON_STOP == enumC0229n) {
                    linkedHashMap4.remove(str2);
                    return;
                }
                if (EnumC0229n.ON_DESTROY == enumC0229n) {
                    if (!mVar2.f4170d.contains(str2) && (num = (Integer) mVar2.f4168b.remove(str2)) != null) {
                        mVar2.f4167a.remove(num);
                    }
                    linkedHashMap4.remove(str2);
                    if (linkedHashMap5.containsKey(str2)) {
                        Log.w("ActivityResultRegistry", "Dropping pending result for request " + str2 + ": " + linkedHashMap5.get(str2));
                        linkedHashMap5.remove(str2);
                    }
                    if (bundle.containsKey(str2)) {
                        if (Build.VERSION.SDK_INT >= 34) {
                            obj = X0.b.a(bundle, str2, C0329a.class);
                        } else {
                            Parcelable parcelable2 = bundle.getParcelable(str2);
                            obj = C0329a.class.isInstance(parcelable2) ? parcelable2 : null;
                        }
                        Log.w("ActivityResultRegistry", "Dropping pending result for request " + str2 + ": " + ((C0329a) obj));
                        bundle.remove(str2);
                    }
                    LinkedHashMap linkedHashMap6 = mVar2.f4169c;
                    C0332d c0332d2 = (C0332d) linkedHashMap6.get(str2);
                    if (c0332d2 != null) {
                        ArrayList arrayList = c0332d2.f4463b;
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            c0332d2.f4462a.f((InterfaceC0234t) it2.next());
                        }
                        arrayList.clear();
                        linkedHashMap6.remove(str2);
                    }
                }
            }
        };
        c0332d.f4462a.a(interfaceC0234t);
        c0332d.f4463b.add(interfaceC0234t);
        linkedHashMap3.put(str, c0332d);
        return new C0014b(mVar, str, abstractC0382a, 7);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i3, int i4, Intent intent) {
        if (this.f4185l.a(i3, i4, intent)) {
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
        Z1.i.f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator it = this.f4186m.iterator();
        while (it.hasNext()) {
            ((Z0.a) it.next()).a(configuration);
        }
    }

    @Override // S0.b, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f4180g.e(bundle);
        d.a aVar = this.f4178e;
        aVar.getClass();
        aVar.f4438b = this;
        Iterator it = aVar.f4437a.iterator();
        while (it.hasNext()) {
            ((C0245e) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i3 = K.f3973e;
        androidx.lifecycle.I.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i3, Menu menu) {
        Z1.i.f(menu, "menu");
        if (i3 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i3, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f4179f.f83b).iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i3, MenuItem menuItem) {
        Z1.i.f(menuItem, "item");
        if (super.onMenuItemSelected(i3, menuItem)) {
            return true;
        }
        if (i3 != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f4179f.f83b).iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z3) {
        if (this.f4191s) {
            return;
        }
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            ((Z0.a) it.next()).a(new F0.a(12));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        Z1.i.f(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.f4188o.iterator();
        while (it.hasNext()) {
            ((Z0.a) it.next()).a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i3, Menu menu) {
        Z1.i.f(menu, "menu");
        Iterator it = ((CopyOnWriteArrayList) this.f4179f.f83b).iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        super.onPanelClosed(i3, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z3) {
        if (this.f4192t) {
            return;
        }
        Iterator it = this.f4189q.iterator();
        while (it.hasNext()) {
            ((Z0.a) it.next()).a(new F0.a(13));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i3, View view, Menu menu) {
        Z1.i.f(menu, "menu");
        if (i3 != 0) {
            return true;
        }
        super.onPreparePanel(i3, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f4179f.f83b).iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        Z1.i.f(strArr, "permissions");
        Z1.i.f(iArr, "grantResults");
        if (this.f4185l.a(i3, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i3, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0249i c0249i;
        a0 a0Var = this.f4181h;
        if (a0Var == null && (c0249i = (C0249i) getLastNonConfigurationInstance()) != null) {
            a0Var = c0249i.f4156a;
        }
        if (a0Var == null) {
            return null;
        }
        C0249i c0249i2 = new C0249i();
        c0249i2.f4156a = a0Var;
        return c0249i2;
    }

    @Override // S0.b, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        Z1.i.f(bundle, "outState");
        C0238x c0238x = this.f3274d;
        if (c0238x != null) {
            c0238x.g(EnumC0230o.f4027f);
        }
        super.onSaveInstanceState(bundle);
        this.f4180g.f(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i3) {
        super.onTrimMemory(i3);
        Iterator it = this.f4187n.iterator();
        while (it.hasNext()) {
            ((Z0.a) it.next()).a(Integer.valueOf(i3));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f4190r.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (AbstractC0382a.s()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            v vVar = (v) this.f4183j.getValue();
            synchronized (vVar.f4197a) {
                try {
                    vVar.f4198b = true;
                    Iterator it = vVar.f4199c.iterator();
                    while (it.hasNext()) {
                        ((Y1.a) it.next()).b();
                    }
                    vVar.f4199c.clear();
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
        Z1.i.e(decorView, "window.decorView");
        this.f4182i.a(decorView);
        super.setContentView(i3);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i3) {
        Z1.i.f(intent, "intent");
        super.startActivityForResult(intent, i3);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i3, Intent intent, int i4, int i5, int i6) {
        Z1.i.f(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i3, intent, i4, i5, i6);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i3, Bundle bundle) {
        Z1.i.f(intent, "intent");
        super.startActivityForResult(intent, i3, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i3, Intent intent, int i4, int i5, int i6, Bundle bundle) {
        Z1.i.f(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i3, intent, i4, i5, i6, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        h();
        View decorView = getWindow().getDecorView();
        Z1.i.e(decorView, "window.decorView");
        this.f4182i.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z3, Configuration configuration) {
        Z1.i.f(configuration, "newConfig");
        this.f4191s = true;
        try {
            super.onMultiWindowModeChanged(z3, configuration);
            this.f4191s = false;
            Iterator it = this.p.iterator();
            while (it.hasNext()) {
                ((Z0.a) it.next()).a(new F0.a(12));
            }
        } catch (Throwable th) {
            this.f4191s = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z3, Configuration configuration) {
        Z1.i.f(configuration, "newConfig");
        this.f4192t = true;
        try {
            super.onPictureInPictureModeChanged(z3, configuration);
            this.f4192t = false;
            Iterator it = this.f4189q.iterator();
            while (it.hasNext()) {
                ((Z0.a) it.next()).a(new F0.a(13));
            }
        } catch (Throwable th) {
            this.f4192t = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h();
        View decorView = getWindow().getDecorView();
        Z1.i.e(decorView, "window.decorView");
        this.f4182i.a(decorView);
        super.setContentView(view, layoutParams);
    }
}
