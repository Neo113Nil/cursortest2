package androidx.activity;

import D.AbstractActivityC0294n;
import D.C0295o;
import D.O;
import O.C0350l;
import O.C0351m;
import O.C0352n;
import O.InterfaceC0354p;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0508p;
import androidx.lifecycle.C0504l;
import androidx.lifecycle.C0515x;
import androidx.lifecycle.EnumC0506n;
import androidx.lifecycle.EnumC0507o;
import androidx.lifecycle.InterfaceC0502j;
import androidx.lifecycle.InterfaceC0511t;
import androidx.lifecycle.InterfaceC0513v;
import androidx.lifecycle.J;
import androidx.lifecycle.L;
import androidx.lifecycle.T;
import androidx.lifecycle.V;
import androidx.lifecycle.X;
import androidx.lifecycle.Y;
import com.icefishing.icefishingliveapp.C5284R;
import d.C4444a;
import d.InterfaceC4445b;
import e.AbstractC4464c;
import e.InterfaceC4463b;
import f.AbstractC4485a;
import h0.AbstractC4556b;
import h0.C4558d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import q7.InterfaceC4936e;
import x0.C5202c;
import x0.C5203d;
import x0.InterfaceC5204e;

/* loaded from: classes.dex */
public abstract class p extends AbstractActivityC0294n implements Y, InterfaceC0502j, InterfaceC5204e {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final C0467i Companion = new C0467i();
    private X _viewModelStore;
    private final e.i activityResultRegistry;
    private int contentLayoutId;
    private final InterfaceC4936e defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final InterfaceC4936e fullyDrawnReporter$delegate;
    private final AtomicInteger nextLocalRequestCode;
    private final InterfaceC4936e onBackPressedDispatcher$delegate;
    private final CopyOnWriteArrayList<N.a> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<N.a> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<N.a> onNewIntentListeners;
    private final CopyOnWriteArrayList<N.a> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<N.a> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final k reportFullyDrawnExecutor;
    private final C5203d savedStateRegistryController;
    private final C4444a contextAwareHelper = new C4444a();
    private final C0352n menuHostHelper = new C0352n(new RunnableC0462d(this, 0));

    public p() {
        C5203d c5203d = new C5203d(this);
        this.savedStateRegistryController = c5203d;
        this.reportFullyDrawnExecutor = new l(this);
        this.fullyDrawnReporter$delegate = com.bumptech.glide.e.q(new o(this, 2));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new n(this);
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().a(new C0463e(0, this));
        getLifecycle().a(new C0463e(1, this));
        getLifecycle().a(new InterfaceC0511t() { // from class: androidx.activity.ComponentActivity$4
            @Override // androidx.lifecycle.InterfaceC0511t
            public final void a(InterfaceC0513v interfaceC0513v, EnumC0506n enumC0506n) {
                p pVar = p.this;
                p.access$ensureViewModelStore(pVar);
                pVar.getLifecycle().b(this);
            }
        });
        c5203d.a();
        L.d(this);
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new C0464f(0, this));
        addOnContextAvailableListener(new InterfaceC4445b() { // from class: androidx.activity.g
            @Override // d.InterfaceC4445b
            public final void a(p pVar) {
                p.a(p.this, pVar);
            }
        });
        this.defaultViewModelProviderFactory$delegate = com.bumptech.glide.e.q(new o(this, 0));
        this.onBackPressedDispatcher$delegate = com.bumptech.glide.e.q(new o(this, 3));
    }

    public static void a(p pVar, p it) {
        kotlin.jvm.internal.h.e(it, "it");
        Bundle a9 = pVar.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (a9 != null) {
            e.i iVar = pVar.activityResultRegistry;
            iVar.getClass();
            ArrayList<Integer> integerArrayList = a9.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a9.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = a9.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                iVar.f37225d.addAll(stringArrayList2);
            }
            Bundle bundle = a9.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            Bundle bundle2 = iVar.f37228g;
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                LinkedHashMap linkedHashMap = iVar.f37223b;
                boolean containsKey = linkedHashMap.containsKey(str);
                LinkedHashMap linkedHashMap2 = iVar.f37222a;
                if (containsKey) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (bundle2.containsKey(str)) {
                        continue;
                    } else {
                        if ((linkedHashMap2 instanceof F7.a) && !(linkedHashMap2 instanceof F7.d)) {
                            kotlin.jvm.internal.u.d(linkedHashMap2, "kotlin.collections.MutableMap");
                            throw null;
                        }
                        linkedHashMap2.remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i);
                kotlin.jvm.internal.h.d(num2, "rcs[i]");
                int intValue = num2.intValue();
                String str2 = stringArrayList.get(i);
                kotlin.jvm.internal.h.d(str2, "keys[i]");
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(intValue), str3);
                linkedHashMap.put(str3, Integer.valueOf(intValue));
            }
        }
    }

    public static final void access$ensureViewModelStore(p pVar) {
        if (pVar._viewModelStore == null) {
            j jVar = (j) pVar.getLastNonConfigurationInstance();
            if (jVar != null) {
                pVar._viewModelStore = jVar.f4564b;
            }
            if (pVar._viewModelStore == null) {
                pVar._viewModelStore = new X();
            }
        }
    }

    public static void b(p pVar, InterfaceC0513v interfaceC0513v, EnumC0506n enumC0506n) {
        if (enumC0506n == EnumC0506n.ON_DESTROY) {
            pVar.contextAwareHelper.f37127b = null;
            if (!pVar.isChangingConfigurations()) {
                pVar.getViewModelStore().a();
            }
            l lVar = (l) pVar.reportFullyDrawnExecutor;
            p pVar2 = lVar.f4568w;
            pVar2.getWindow().getDecorView().removeCallbacks(lVar);
            pVar2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(lVar);
        }
    }

    public static Bundle c(p pVar) {
        Bundle bundle = new Bundle();
        e.i iVar = pVar.activityResultRegistry;
        iVar.getClass();
        LinkedHashMap linkedHashMap = iVar.f37223b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(iVar.f37225d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(iVar.f37228g));
        return bundle;
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        k kVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.h.d(decorView, "window.decorView");
        ((l) kVar).a(decorView);
        super.addContentView(view, layoutParams);
    }

    public void addMenuProvider(InterfaceC0354p provider) {
        kotlin.jvm.internal.h.e(provider, "provider");
        C0352n c0352n = this.menuHostHelper;
        c0352n.f2298b.add(provider);
        c0352n.f2297a.run();
    }

    public final void addOnConfigurationChangedListener(N.a listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        this.onConfigurationChangedListeners.add(listener);
    }

    public final void addOnContextAvailableListener(InterfaceC4445b listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        C4444a c4444a = this.contextAwareHelper;
        c4444a.getClass();
        p pVar = c4444a.f37127b;
        if (pVar != null) {
            listener.a(pVar);
        }
        c4444a.f37126a.add(listener);
    }

    public final void addOnMultiWindowModeChangedListener(N.a listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    public final void addOnNewIntentListener(N.a listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        this.onNewIntentListeners.add(listener);
    }

    public final void addOnPictureInPictureModeChangedListener(N.a listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    public final void addOnTrimMemoryListener(N.a listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        this.onTrimMemoryListeners.add(listener);
    }

    public final void addOnUserLeaveHintListener(Runnable listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        this.onUserLeaveHintListeners.add(listener);
    }

    public final e.i getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // androidx.lifecycle.InterfaceC0502j
    public AbstractC4556b getDefaultViewModelCreationExtras() {
        C4558d c4558d = new C4558d(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = c4558d.f38143a;
        if (application != null) {
            T t9 = T.f5260a;
            Application application2 = getApplication();
            kotlin.jvm.internal.h.d(application2, "application");
            linkedHashMap.put(t9, application2);
        }
        linkedHashMap.put(L.f5232a, this);
        linkedHashMap.put(L.f5233b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(L.f5234c, extras);
        }
        return c4558d;
    }

    public V getDefaultViewModelProviderFactory() {
        return (V) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    public x getFullyDrawnReporter() {
        return (x) this.fullyDrawnReporter$delegate.getValue();
    }

    public Object getLastCustomNonConfigurationInstance() {
        j jVar = (j) getLastNonConfigurationInstance();
        if (jVar != null) {
            return jVar.f4563a;
        }
        return null;
    }

    @Override // D.AbstractActivityC0294n, androidx.lifecycle.InterfaceC0513v
    public AbstractC0508p getLifecycle() {
        return super.getLifecycle();
    }

    public final G getOnBackPressedDispatcher() {
        return (G) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // x0.InterfaceC5204e
    public final C5202c getSavedStateRegistry() {
        return this.savedStateRegistryController.f41773b;
    }

    @Override // androidx.lifecycle.Y
    public X getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this._viewModelStore == null) {
            j jVar = (j) getLastNonConfigurationInstance();
            if (jVar != null) {
                this._viewModelStore = jVar.f4564b;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new X();
            }
        }
        X x3 = this._viewModelStore;
        kotlin.jvm.internal.h.b(x3);
        return x3;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.h.d(decorView, "window.decorView");
        decorView.setTag(C5284R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        kotlin.jvm.internal.h.d(decorView2, "window.decorView");
        decorView2.setTag(C5284R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        kotlin.jvm.internal.h.d(decorView3, "window.decorView");
        decorView3.setTag(C5284R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        kotlin.jvm.internal.h.d(decorView4, "window.decorView");
        decorView4.setTag(C5284R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        kotlin.jvm.internal.h.d(decorView5, "window.decorView");
        decorView5.setTag(C5284R.id.report_drawn, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i4, Intent intent) {
        if (this.activityResultRegistry.a(i, i4, intent)) {
            return;
        }
        super.onActivityResult(i, i4, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        getOnBackPressedDispatcher().c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        kotlin.jvm.internal.h.e(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator<N.a> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(newConfig);
        }
    }

    @Override // D.AbstractActivityC0294n, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.b(bundle);
        C4444a c4444a = this.contextAwareHelper;
        c4444a.getClass();
        c4444a.f37127b = this;
        Iterator it = c4444a.f37126a.iterator();
        while (it.hasNext()) {
            ((InterfaceC4445b) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = J.f5224u;
        androidx.lifecycle.H.b(this);
        int i4 = this.contentLayoutId;
        if (i4 != 0) {
            setContentView(i4);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        kotlin.jvm.internal.h.e(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        C0352n c0352n = this.menuHostHelper;
        getMenuInflater();
        Iterator it = c0352n.f2298b.iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.F) ((InterfaceC0354p) it.next())).f4936a.j();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem item) {
        kotlin.jvm.internal.h.e(item, "item");
        if (super.onMenuItemSelected(i, item)) {
            return true;
        }
        if (i == 0) {
            return this.menuHostHelper.a();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z8) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<N.a> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new C0295o(z8));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        kotlin.jvm.internal.h.e(intent, "intent");
        super.onNewIntent(intent);
        Iterator<N.a> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        kotlin.jvm.internal.h.e(menu, "menu");
        Iterator it = this.menuHostHelper.f2298b.iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.F) ((InterfaceC0354p) it.next())).f4936a.p();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z8) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<N.a> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new O(z8));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        kotlin.jvm.internal.h.e(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = this.menuHostHelper.f2298b.iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.F) ((InterfaceC0354p) it.next())).f4936a.s();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.h.e(permissions, "permissions");
        kotlin.jvm.internal.h.e(grantResults, "grantResults");
        if (this.activityResultRegistry.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(i, permissions, grantResults);
    }

    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        j jVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        X x3 = this._viewModelStore;
        if (x3 == null && (jVar = (j) getLastNonConfigurationInstance()) != null) {
            x3 = jVar.f4564b;
        }
        if (x3 == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        j jVar2 = new j();
        jVar2.f4563a = onRetainCustomNonConfigurationInstance;
        jVar2.f4564b = x3;
        return jVar2;
    }

    @Override // D.AbstractActivityC0294n, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.h.e(outState, "outState");
        if (getLifecycle() instanceof C0515x) {
            AbstractC0508p lifecycle = getLifecycle();
            kotlin.jvm.internal.h.c(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((C0515x) lifecycle).g();
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.c(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<N.a> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
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
        return this.contextAwareHelper.f37127b;
    }

    public final <I, O> AbstractC4464c registerForActivityResult(final AbstractC4485a contract, final e.i registry, final InterfaceC4463b callback) {
        kotlin.jvm.internal.h.e(contract, "contract");
        kotlin.jvm.internal.h.e(registry, "registry");
        kotlin.jvm.internal.h.e(callback, "callback");
        final String key = "activity_rq#" + this.nextLocalRequestCode.getAndIncrement();
        kotlin.jvm.internal.h.e(key, "key");
        AbstractC0508p lifecycle = getLifecycle();
        C0515x c0515x = (C0515x) lifecycle;
        if (c0515x.f5290d.compareTo(EnumC0507o.f5279w) >= 0) {
            throw new IllegalStateException(("LifecycleOwner " + this + " is attempting to register while current state is " + c0515x.f5290d + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        registry.d(key);
        LinkedHashMap linkedHashMap = registry.f37224c;
        e.f fVar = (e.f) linkedHashMap.get(key);
        if (fVar == null) {
            fVar = new e.f(lifecycle);
        }
        InterfaceC0511t interfaceC0511t = new InterfaceC0511t() { // from class: e.d
            @Override // androidx.lifecycle.InterfaceC0511t
            public final void a(InterfaceC0513v interfaceC0513v, EnumC0506n enumC0506n) {
                EnumC0506n enumC0506n2 = EnumC0506n.ON_START;
                i iVar = i.this;
                String str = key;
                LinkedHashMap linkedHashMap2 = iVar.f37226e;
                if (enumC0506n2 != enumC0506n) {
                    if (EnumC0506n.ON_STOP == enumC0506n) {
                        linkedHashMap2.remove(str);
                        return;
                    } else {
                        if (EnumC0506n.ON_DESTROY == enumC0506n) {
                            iVar.e(str);
                            return;
                        }
                        return;
                    }
                }
                InterfaceC4463b interfaceC4463b = callback;
                AbstractC4485a abstractC4485a = contract;
                linkedHashMap2.put(str, new C4466e(abstractC4485a, interfaceC4463b));
                LinkedHashMap linkedHashMap3 = iVar.f37227f;
                if (linkedHashMap3.containsKey(str)) {
                    Object obj = linkedHashMap3.get(str);
                    linkedHashMap3.remove(str);
                    interfaceC4463b.g(obj);
                }
                Bundle bundle = iVar.f37228g;
                C4462a c4462a = (C4462a) com.bumptech.glide.d.s(str, bundle);
                if (c4462a != null) {
                    bundle.remove(str);
                    interfaceC4463b.g(abstractC4485a.c(c4462a.f37209n, c4462a.f37210u));
                }
            }
        };
        fVar.f37217a.a(interfaceC0511t);
        fVar.f37218b.add(interfaceC0511t);
        linkedHashMap.put(key, fVar);
        return new e.g();
    }

    public void removeMenuProvider(InterfaceC0354p provider) {
        kotlin.jvm.internal.h.e(provider, "provider");
        this.menuHostHelper.b(provider);
    }

    public final void removeOnConfigurationChangedListener(N.a listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        this.onConfigurationChangedListeners.remove(listener);
    }

    public final void removeOnContextAvailableListener(InterfaceC4445b listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        C4444a c4444a = this.contextAwareHelper;
        c4444a.getClass();
        c4444a.f37126a.remove(listener);
    }

    public final void removeOnMultiWindowModeChangedListener(N.a listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    public final void removeOnNewIntentListener(N.a listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        this.onNewIntentListeners.remove(listener);
    }

    public final void removeOnPictureInPictureModeChangedListener(N.a listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    public final void removeOnTrimMemoryListener(N.a listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        this.onTrimMemoryListeners.remove(listener);
    }

    public final void removeOnUserLeaveHintListener(Runnable listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        this.onUserLeaveHintListeners.remove(listener);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (S0.f.m()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            x fullyDrawnReporter = getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.f4581a) {
                try {
                    fullyDrawnReporter.f4582b = true;
                    Iterator it = fullyDrawnReporter.f4583c.iterator();
                    while (it.hasNext()) {
                        ((E7.a) it.next()).invoke();
                    }
                    fullyDrawnReporter.f4583c.clear();
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
    public void setContentView(int i) {
        initializeViewTreeOwners();
        k kVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.h.d(decorView, "window.decorView");
        ((l) kVar).a(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        kotlin.jvm.internal.h.e(intent, "intent");
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int i, Intent intent2, int i4, int i9, int i10) {
        kotlin.jvm.internal.h.e(intent, "intent");
        super.startIntentSenderForResult(intent, i, intent2, i4, i9, i10);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        kotlin.jvm.internal.h.e(intent, "intent");
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int i, Intent intent2, int i4, int i9, int i10, Bundle bundle) {
        kotlin.jvm.internal.h.e(intent, "intent");
        super.startIntentSenderForResult(intent, i, intent2, i4, i9, i10, bundle);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z8, Configuration newConfig) {
        kotlin.jvm.internal.h.e(newConfig, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z8, newConfig);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<N.a> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new C0295o(z8));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z8, Configuration newConfig) {
        kotlin.jvm.internal.h.e(newConfig, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z8, newConfig);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<N.a> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new O(z8));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        k kVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.h.d(decorView, "window.decorView");
        ((l) kVar).a(decorView);
        super.setContentView(view);
    }

    public void addMenuProvider(InterfaceC0354p provider, InterfaceC0513v owner) {
        kotlin.jvm.internal.h.e(provider, "provider");
        kotlin.jvm.internal.h.e(owner, "owner");
        C0352n c0352n = this.menuHostHelper;
        c0352n.f2298b.add(provider);
        c0352n.f2297a.run();
        AbstractC0508p lifecycle = owner.getLifecycle();
        HashMap hashMap = c0352n.f2299c;
        C0351m c0351m = (C0351m) hashMap.remove(provider);
        if (c0351m != null) {
            c0351m.f2291a.b(c0351m.f2292b);
            c0351m.f2292b = null;
        }
        hashMap.put(provider, new C0351m(lifecycle, new C0350l(0, c0352n, provider)));
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        k kVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.h.d(decorView, "window.decorView");
        ((l) kVar).a(decorView);
        super.setContentView(view, layoutParams);
    }

    public void addMenuProvider(final InterfaceC0354p provider, InterfaceC0513v owner, final EnumC0507o state) {
        kotlin.jvm.internal.h.e(provider, "provider");
        kotlin.jvm.internal.h.e(owner, "owner");
        kotlin.jvm.internal.h.e(state, "state");
        final C0352n c0352n = this.menuHostHelper;
        c0352n.getClass();
        AbstractC0508p lifecycle = owner.getLifecycle();
        HashMap hashMap = c0352n.f2299c;
        C0351m c0351m = (C0351m) hashMap.remove(provider);
        if (c0351m != null) {
            c0351m.f2291a.b(c0351m.f2292b);
            c0351m.f2292b = null;
        }
        hashMap.put(provider, new C0351m(lifecycle, new InterfaceC0511t() { // from class: O.k
            @Override // androidx.lifecycle.InterfaceC0511t
            public final void a(InterfaceC0513v interfaceC0513v, EnumC0506n enumC0506n) {
                C0352n c0352n2 = C0352n.this;
                c0352n2.getClass();
                C0504l c0504l = EnumC0506n.Companion;
                EnumC0507o enumC0507o = state;
                c0504l.getClass();
                int ordinal = enumC0507o.ordinal();
                EnumC0506n enumC0506n2 = null;
                EnumC0506n enumC0506n3 = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : EnumC0506n.ON_RESUME : EnumC0506n.ON_START : EnumC0506n.ON_CREATE;
                InterfaceC0354p interfaceC0354p = provider;
                Runnable runnable = c0352n2.f2297a;
                CopyOnWriteArrayList copyOnWriteArrayList = c0352n2.f2298b;
                if (enumC0506n == enumC0506n3) {
                    copyOnWriteArrayList.add(interfaceC0354p);
                    runnable.run();
                    return;
                }
                EnumC0506n enumC0506n4 = EnumC0506n.ON_DESTROY;
                if (enumC0506n == enumC0506n4) {
                    c0352n2.b(interfaceC0354p);
                    return;
                }
                int ordinal2 = enumC0507o.ordinal();
                if (ordinal2 == 2) {
                    enumC0506n2 = enumC0506n4;
                } else if (ordinal2 == 3) {
                    enumC0506n2 = EnumC0506n.ON_STOP;
                } else if (ordinal2 == 4) {
                    enumC0506n2 = EnumC0506n.ON_PAUSE;
                }
                if (enumC0506n == enumC0506n2) {
                    copyOnWriteArrayList.remove(interfaceC0354p);
                    runnable.run();
                }
            }
        }));
    }

    public final <I, O> AbstractC4464c registerForActivityResult(AbstractC4485a contract, InterfaceC4463b callback) {
        kotlin.jvm.internal.h.e(contract, "contract");
        kotlin.jvm.internal.h.e(callback, "callback");
        return registerForActivityResult(contract, this.activityResultRegistry, callback);
    }
}
