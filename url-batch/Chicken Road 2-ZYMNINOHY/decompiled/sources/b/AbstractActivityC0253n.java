package b;

import E.C0009j;
import E.C0010k;
import E.C0011l;
import E.InterfaceC0007h;
import E.InterfaceC0013n;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.X;
import androidx.lifecycle.AbstractC0231j;
import androidx.lifecycle.C0237p;
import androidx.lifecycle.E;
import androidx.lifecycle.EnumC0229h;
import androidx.lifecycle.EnumC0230i;
import androidx.lifecycle.InterfaceC0224c;
import androidx.lifecycle.InterfaceC0234m;
import androidx.lifecycle.InterfaceC0235n;
import androidx.lifecycle.K;
import androidx.lifecycle.M;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import b.RunnableC0243d;
import c.C0265a;
import c.InterfaceC0266b;
import c3.C0295g;
import c3.InterfaceC0291c;
import com.rockchicken.pump.up.road.R;
import e.AbstractC0390a;
import i2.AbstractC0457a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import m1.C1304b;
import m1.C1307e;
import m1.C1308f;
import o3.InterfaceC1328a;
import p3.InterfaceC1349a;
import t.AbstractActivityC1415c;
import t.C1416d;
import t.C1424l;
import t.InterfaceC1422j;
import t.InterfaceC1423k;
import u.InterfaceC1444a;
import u.InterfaceC1445b;

/* renamed from: b.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0253n extends AbstractActivityC1415c implements P, InterfaceC0224c, m1.g, InterfaceC0239B, d.i, InterfaceC1444a, InterfaceC1445b, InterfaceC1422j, InterfaceC1423k, InterfaceC0007h {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final C0247h Companion = new C0247h();
    private O _viewModelStore;
    private final d.h activityResultRegistry;
    private int contentLayoutId;
    private final InterfaceC0291c defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final InterfaceC0291c fullyDrawnReporter$delegate;
    private final AtomicInteger nextLocalRequestCode;
    private final InterfaceC0291c onBackPressedDispatcher$delegate;
    private final CopyOnWriteArrayList<D.a> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<D.a> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<D.a> onNewIntentListeners;
    private final CopyOnWriteArrayList<D.a> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<D.a> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final InterfaceExecutorC0249j reportFullyDrawnExecutor;
    private final C1308f savedStateRegistryController;
    private final C0265a contextAwareHelper = new C0265a();
    private final C0011l menuHostHelper = new C0011l(new RunnableC0243d(this, 0));

    public AbstractActivityC0253n() {
        C1308f c1308f = new C1308f(this);
        this.savedStateRegistryController = c1308f;
        this.reportFullyDrawnExecutor = new ViewTreeObserverOnDrawListenerC0250k(this);
        this.fullyDrawnReporter$delegate = new C0295g(new C0252m(this, 2));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new C0251l(this);
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().a(new C0244e(0, this));
        getLifecycle().a(new C0244e(1, this));
        getLifecycle().a(new C1304b(2, this));
        c1308f.a();
        E.d(this);
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new androidx.lifecycle.A(1, this));
        addOnContextAvailableListener(new InterfaceC0266b() { // from class: b.f
            @Override // c.InterfaceC0266b
            public final void a(AbstractActivityC0253n abstractActivityC0253n) {
                AbstractActivityC0253n.a(AbstractActivityC0253n.this, abstractActivityC0253n);
            }
        });
        this.defaultViewModelProviderFactory$delegate = new C0295g(new C0252m(this, 0));
        this.onBackPressedDispatcher$delegate = new C0295g(new C0252m(this, 3));
    }

    public static void a(AbstractActivityC0253n abstractActivityC0253n, Context it) {
        kotlin.jvm.internal.i.e(it, "it");
        Bundle a3 = abstractActivityC0253n.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (a3 != null) {
            d.h hVar = abstractActivityC0253n.activityResultRegistry;
            LinkedHashMap linkedHashMap = hVar.f8074b;
            LinkedHashMap linkedHashMap2 = hVar.f8073a;
            Bundle bundle = hVar.f8079g;
            ArrayList<Integer> integerArrayList = a3.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a3.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = a3.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                hVar.f8076d.addAll(stringArrayList2);
            }
            Bundle bundle2 = a3.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                String str = stringArrayList.get(i4);
                if (linkedHashMap.containsKey(str)) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (bundle.containsKey(str)) {
                        continue;
                    } else {
                        if (linkedHashMap2 instanceof InterfaceC1349a) {
                            kotlin.jvm.internal.s.e(linkedHashMap2, "kotlin.collections.MutableMap");
                            throw null;
                        }
                        linkedHashMap2.remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i4);
                kotlin.jvm.internal.i.d(num2, "rcs[i]");
                int intValue = num2.intValue();
                String str2 = stringArrayList.get(i4);
                kotlin.jvm.internal.i.d(str2, "keys[i]");
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(intValue), str3);
                hVar.f8074b.put(str3, Integer.valueOf(intValue));
            }
        }
    }

    public static final void access$ensureViewModelStore(AbstractActivityC0253n abstractActivityC0253n) {
        if (abstractActivityC0253n._viewModelStore == null) {
            C0248i c0248i = (C0248i) abstractActivityC0253n.getLastNonConfigurationInstance();
            if (c0248i != null) {
                abstractActivityC0253n._viewModelStore = c0248i.f5224b;
            }
            if (abstractActivityC0253n._viewModelStore == null) {
                abstractActivityC0253n._viewModelStore = new O();
            }
        }
    }

    public static void b(AbstractActivityC0253n abstractActivityC0253n, InterfaceC0235n interfaceC0235n, EnumC0229h enumC0229h) {
        if (enumC0229h == EnumC0229h.ON_DESTROY) {
            abstractActivityC0253n.contextAwareHelper.f5397b = null;
            if (!abstractActivityC0253n.isChangingConfigurations()) {
                abstractActivityC0253n.getViewModelStore().a();
            }
            ViewTreeObserverOnDrawListenerC0250k viewTreeObserverOnDrawListenerC0250k = (ViewTreeObserverOnDrawListenerC0250k) abstractActivityC0253n.reportFullyDrawnExecutor;
            AbstractActivityC0253n abstractActivityC0253n2 = viewTreeObserverOnDrawListenerC0250k.f5228d;
            abstractActivityC0253n2.getWindow().getDecorView().removeCallbacks(viewTreeObserverOnDrawListenerC0250k);
            abstractActivityC0253n2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC0250k);
        }
    }

    public static Bundle c(AbstractActivityC0253n abstractActivityC0253n) {
        Bundle bundle = new Bundle();
        d.h hVar = abstractActivityC0253n.activityResultRegistry;
        hVar.getClass();
        LinkedHashMap linkedHashMap = hVar.f8074b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(hVar.f8076d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(hVar.f8079g));
        return bundle;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        InterfaceExecutorC0249j interfaceExecutorC0249j = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.i.d(decorView, "window.decorView");
        ((ViewTreeObserverOnDrawListenerC0250k) interfaceExecutorC0249j).a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // E.InterfaceC0007h
    public void addMenuProvider(InterfaceC0013n provider) {
        kotlin.jvm.internal.i.e(provider, "provider");
        C0011l c0011l = this.menuHostHelper;
        c0011l.f429b.add(provider);
        c0011l.f428a.run();
    }

    @Override // u.InterfaceC1444a
    public final void addOnConfigurationChangedListener(D.a listener) {
        kotlin.jvm.internal.i.e(listener, "listener");
        this.onConfigurationChangedListeners.add(listener);
    }

    public final void addOnContextAvailableListener(InterfaceC0266b listener) {
        kotlin.jvm.internal.i.e(listener, "listener");
        C0265a c0265a = this.contextAwareHelper;
        c0265a.getClass();
        AbstractActivityC0253n abstractActivityC0253n = c0265a.f5397b;
        if (abstractActivityC0253n != null) {
            listener.a(abstractActivityC0253n);
        }
        c0265a.f5396a.add(listener);
    }

    @Override // t.InterfaceC1422j
    public final void addOnMultiWindowModeChangedListener(D.a listener) {
        kotlin.jvm.internal.i.e(listener, "listener");
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    public final void addOnNewIntentListener(D.a listener) {
        kotlin.jvm.internal.i.e(listener, "listener");
        this.onNewIntentListeners.add(listener);
    }

    @Override // t.InterfaceC1423k
    public final void addOnPictureInPictureModeChangedListener(D.a listener) {
        kotlin.jvm.internal.i.e(listener, "listener");
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    @Override // u.InterfaceC1445b
    public final void addOnTrimMemoryListener(D.a listener) {
        kotlin.jvm.internal.i.e(listener, "listener");
        this.onTrimMemoryListeners.add(listener);
    }

    public final void addOnUserLeaveHintListener(Runnable listener) {
        kotlin.jvm.internal.i.e(listener, "listener");
        this.onUserLeaveHintListeners.add(listener);
    }

    @Override // d.i
    public final d.h getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // androidx.lifecycle.InterfaceC0224c
    public R.b getDefaultViewModelCreationExtras() {
        R.c cVar = new R.c(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = cVar.f2272a;
        if (application != null) {
            K k4 = K.f5032a;
            Application application2 = getApplication();
            kotlin.jvm.internal.i.d(application2, "application");
            linkedHashMap.put(k4, application2);
        }
        linkedHashMap.put(E.f5014a, this);
        linkedHashMap.put(E.f5015b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(E.f5016c, extras);
        }
        return cVar;
    }

    public M getDefaultViewModelProviderFactory() {
        return (M) ((C0295g) this.defaultViewModelProviderFactory$delegate).a();
    }

    public p getFullyDrawnReporter() {
        return (p) ((C0295g) this.fullyDrawnReporter$delegate).a();
    }

    public Object getLastCustomNonConfigurationInstance() {
        C0248i c0248i = (C0248i) getLastNonConfigurationInstance();
        if (c0248i != null) {
            return c0248i.f5223a;
        }
        return null;
    }

    @Override // t.AbstractActivityC1415c, androidx.lifecycle.InterfaceC0235n
    public AbstractC0231j getLifecycle() {
        return super.getLifecycle();
    }

    @Override // b.InterfaceC0239B
    public final C0238A getOnBackPressedDispatcher() {
        return (C0238A) ((C0295g) this.onBackPressedDispatcher$delegate).a();
    }

    @Override // m1.g
    public final C1307e getSavedStateRegistry() {
        return this.savedStateRegistryController.f14495b;
    }

    @Override // androidx.lifecycle.P
    public O getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this._viewModelStore == null) {
            C0248i c0248i = (C0248i) getLastNonConfigurationInstance();
            if (c0248i != null) {
                this._viewModelStore = c0248i.f5224b;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new O();
            }
        }
        O o = this._viewModelStore;
        kotlin.jvm.internal.i.b(o);
        return o;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.i.d(decorView, "window.decorView");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        kotlin.jvm.internal.i.d(decorView2, "window.decorView");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        kotlin.jvm.internal.i.d(decorView3, "window.decorView");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        kotlin.jvm.internal.i.d(decorView4, "window.decorView");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        kotlin.jvm.internal.i.d(decorView5, "window.decorView");
        decorView5.setTag(R.id.report_drawn, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i4, int i5, Intent intent) {
        if (this.activityResultRegistry.a(i4, i5, intent)) {
            return;
        }
        super.onActivityResult(i4, i5, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        getOnBackPressedDispatcher().c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        kotlin.jvm.internal.i.e(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator<D.a> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(newConfig);
        }
    }

    @Override // t.AbstractActivityC1415c, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.b(bundle);
        C0265a c0265a = this.contextAwareHelper;
        c0265a.getClass();
        c0265a.f5397b = this;
        Iterator it = c0265a.f5396a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0266b) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i4 = androidx.lifecycle.z.f5083b;
        androidx.lifecycle.x.b(this);
        int i5 = this.contentLayoutId;
        if (i5 != 0) {
            setContentView(i5);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i4, Menu menu) {
        kotlin.jvm.internal.i.e(menu, "menu");
        if (i4 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i4, menu);
        C0011l c0011l = this.menuHostHelper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = c0011l.f429b.iterator();
        while (it.hasNext()) {
            ((X) ((InterfaceC0013n) it.next())).f4784a.k(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i4, MenuItem item) {
        kotlin.jvm.internal.i.e(item, "item");
        if (super.onMenuItemSelected(i4, item)) {
            return true;
        }
        if (i4 == 0) {
            Iterator it = this.menuHostHelper.f429b.iterator();
            while (it.hasNext()) {
                if (((X) ((InterfaceC0013n) it.next())).f4784a.p(item)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<D.a> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new C1416d(z));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        kotlin.jvm.internal.i.e(intent, "intent");
        super.onNewIntent(intent);
        Iterator<D.a> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i4, Menu menu) {
        kotlin.jvm.internal.i.e(menu, "menu");
        Iterator it = this.menuHostHelper.f429b.iterator();
        while (it.hasNext()) {
            ((X) ((InterfaceC0013n) it.next())).f4784a.q(menu);
        }
        super.onPanelClosed(i4, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<D.a> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new C1424l(z));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i4, View view, Menu menu) {
        kotlin.jvm.internal.i.e(menu, "menu");
        if (i4 != 0) {
            return true;
        }
        super.onPreparePanel(i4, view, menu);
        Iterator it = this.menuHostHelper.f429b.iterator();
        while (it.hasNext()) {
            ((X) ((InterfaceC0013n) it.next())).f4784a.t(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i4, String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.i.e(permissions, "permissions");
        kotlin.jvm.internal.i.e(grantResults, "grantResults");
        if (this.activityResultRegistry.a(i4, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(i4, permissions, grantResults);
    }

    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0248i c0248i;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        O o = this._viewModelStore;
        if (o == null && (c0248i = (C0248i) getLastNonConfigurationInstance()) != null) {
            o = c0248i.f5224b;
        }
        if (o == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        C0248i c0248i2 = new C0248i();
        c0248i2.f5223a = onRetainCustomNonConfigurationInstance;
        c0248i2.f5224b = o;
        return c0248i2;
    }

    @Override // t.AbstractActivityC1415c, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.i.e(outState, "outState");
        if (getLifecycle() instanceof C0237p) {
            AbstractC0231j lifecycle = getLifecycle();
            kotlin.jvm.internal.i.c(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((C0237p) lifecycle).g();
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.c(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i4) {
        super.onTrimMemory(i4);
        Iterator<D.a> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i4));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.f5397b;
    }

    public final <I, O> d.c registerForActivityResult(AbstractC0390a contract, d.h registry, d.b callback) {
        kotlin.jvm.internal.i.e(contract, "contract");
        kotlin.jvm.internal.i.e(registry, "registry");
        kotlin.jvm.internal.i.e(callback, "callback");
        return registry.c("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, contract, callback);
    }

    @Override // E.InterfaceC0007h
    public void removeMenuProvider(InterfaceC0013n provider) {
        kotlin.jvm.internal.i.e(provider, "provider");
        this.menuHostHelper.a(provider);
    }

    @Override // u.InterfaceC1444a
    public final void removeOnConfigurationChangedListener(D.a listener) {
        kotlin.jvm.internal.i.e(listener, "listener");
        this.onConfigurationChangedListeners.remove(listener);
    }

    public final void removeOnContextAvailableListener(InterfaceC0266b listener) {
        kotlin.jvm.internal.i.e(listener, "listener");
        C0265a c0265a = this.contextAwareHelper;
        c0265a.getClass();
        c0265a.f5396a.remove(listener);
    }

    @Override // t.InterfaceC1422j
    public final void removeOnMultiWindowModeChangedListener(D.a listener) {
        kotlin.jvm.internal.i.e(listener, "listener");
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    public final void removeOnNewIntentListener(D.a listener) {
        kotlin.jvm.internal.i.e(listener, "listener");
        this.onNewIntentListeners.remove(listener);
    }

    @Override // t.InterfaceC1423k
    public final void removeOnPictureInPictureModeChangedListener(D.a listener) {
        kotlin.jvm.internal.i.e(listener, "listener");
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    @Override // u.InterfaceC1445b
    public final void removeOnTrimMemoryListener(D.a listener) {
        kotlin.jvm.internal.i.e(listener, "listener");
        this.onTrimMemoryListeners.remove(listener);
    }

    public final void removeOnUserLeaveHintListener(Runnable listener) {
        kotlin.jvm.internal.i.e(listener, "listener");
        this.onUserLeaveHintListeners.remove(listener);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (AbstractC0457a.u()) {
                Trace.beginSection(AbstractC0457a.E("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            p fullyDrawnReporter = getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.f5236b) {
                try {
                    fullyDrawnReporter.f5237c = true;
                    ArrayList arrayList = fullyDrawnReporter.f5238d;
                    int size = arrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj = arrayList.get(i4);
                        i4++;
                        ((InterfaceC1328a) obj).invoke();
                    }
                    fullyDrawnReporter.f5238d.clear();
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
    public void setContentView(int i4) {
        initializeViewTreeOwners();
        InterfaceExecutorC0249j interfaceExecutorC0249j = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.i.d(decorView, "window.decorView");
        ((ViewTreeObserverOnDrawListenerC0250k) interfaceExecutorC0249j).a(decorView);
        super.setContentView(i4);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i4) {
        kotlin.jvm.internal.i.e(intent, "intent");
        super.startActivityForResult(intent, i4);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int i4, Intent intent2, int i5, int i6, int i7) throws IntentSender.SendIntentException {
        kotlin.jvm.internal.i.e(intent, "intent");
        super.startIntentSenderForResult(intent, i4, intent2, i5, i6, i7);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i4, Bundle bundle) {
        kotlin.jvm.internal.i.e(intent, "intent");
        super.startActivityForResult(intent, i4, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int i4, Intent intent2, int i5, int i6, int i7, Bundle bundle) throws IntentSender.SendIntentException {
        kotlin.jvm.internal.i.e(intent, "intent");
        super.startIntentSenderForResult(intent, i4, intent2, i5, i6, i7, bundle);
    }

    public final <I, O> d.c registerForActivityResult(AbstractC0390a contract, d.b callback) {
        kotlin.jvm.internal.i.e(contract, "contract");
        kotlin.jvm.internal.i.e(callback, "callback");
        return registerForActivityResult(contract, this.activityResultRegistry, callback);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration newConfig) {
        kotlin.jvm.internal.i.e(newConfig, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, newConfig);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<D.a> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new C1416d(z));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration newConfig) {
        kotlin.jvm.internal.i.e(newConfig, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, newConfig);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<D.a> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new C1424l(z));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        InterfaceExecutorC0249j interfaceExecutorC0249j = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.i.d(decorView, "window.decorView");
        ((ViewTreeObserverOnDrawListenerC0250k) interfaceExecutorC0249j).a(decorView);
        super.setContentView(view);
    }

    public void addMenuProvider(InterfaceC0013n provider, InterfaceC0235n owner) {
        kotlin.jvm.internal.i.e(provider, "provider");
        kotlin.jvm.internal.i.e(owner, "owner");
        C0011l c0011l = this.menuHostHelper;
        c0011l.f429b.add(provider);
        c0011l.f428a.run();
        AbstractC0231j lifecycle = owner.getLifecycle();
        HashMap hashMap = c0011l.f430c;
        C0010k c0010k = (C0010k) hashMap.remove(provider);
        if (c0010k != null) {
            c0010k.f426a.b(c0010k.f427b);
            c0010k.f427b = null;
        }
        hashMap.put(provider, new C0010k(lifecycle, new C0009j(c0011l, 0, provider)));
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        InterfaceExecutorC0249j interfaceExecutorC0249j = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.i.d(decorView, "window.decorView");
        ((ViewTreeObserverOnDrawListenerC0250k) interfaceExecutorC0249j).a(decorView);
        super.setContentView(view, layoutParams);
    }

    public void addMenuProvider(final InterfaceC0013n provider, InterfaceC0235n owner, final EnumC0230i state) {
        kotlin.jvm.internal.i.e(provider, "provider");
        kotlin.jvm.internal.i.e(owner, "owner");
        kotlin.jvm.internal.i.e(state, "state");
        final C0011l c0011l = this.menuHostHelper;
        c0011l.getClass();
        AbstractC0231j lifecycle = owner.getLifecycle();
        HashMap hashMap = c0011l.f430c;
        C0010k c0010k = (C0010k) hashMap.remove(provider);
        if (c0010k != null) {
            c0010k.f426a.b(c0010k.f427b);
            c0010k.f427b = null;
        }
        hashMap.put(provider, new C0010k(lifecycle, new InterfaceC0234m() { // from class: E.i
            @Override // androidx.lifecycle.InterfaceC0234m
            public final void a(InterfaceC0235n interfaceC0235n, EnumC0229h enumC0229h) {
                C0011l c0011l2 = C0011l.this;
                c0011l2.getClass();
                RunnableC0243d runnableC0243d = c0011l2.f428a;
                CopyOnWriteArrayList copyOnWriteArrayList = c0011l2.f429b;
                EnumC0229h.Companion.getClass();
                EnumC0230i enumC0230i = state;
                int ordinal = enumC0230i.ordinal();
                EnumC0229h enumC0229h2 = null;
                EnumC0229h enumC0229h3 = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : EnumC0229h.ON_RESUME : EnumC0229h.ON_START : EnumC0229h.ON_CREATE;
                InterfaceC0013n interfaceC0013n = provider;
                if (enumC0229h == enumC0229h3) {
                    copyOnWriteArrayList.add(interfaceC0013n);
                    runnableC0243d.run();
                    return;
                }
                EnumC0229h enumC0229h4 = EnumC0229h.ON_DESTROY;
                if (enumC0229h == enumC0229h4) {
                    c0011l2.a(interfaceC0013n);
                    return;
                }
                int ordinal2 = enumC0230i.ordinal();
                if (ordinal2 == 2) {
                    enumC0229h2 = enumC0229h4;
                } else if (ordinal2 == 3) {
                    enumC0229h2 = EnumC0229h.ON_STOP;
                } else if (ordinal2 == 4) {
                    enumC0229h2 = EnumC0229h.ON_PAUSE;
                }
                if (enumC0229h == enumC0229h2) {
                    copyOnWriteArrayList.remove(interfaceC0013n);
                    runnableC0243d.run();
                }
            }
        }));
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }
}
