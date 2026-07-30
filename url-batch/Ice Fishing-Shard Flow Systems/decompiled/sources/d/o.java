package d;

import I.C0117m;
import I.C0118n;
import I.C0119o;
import I.InterfaceC0120p;
import R5.InterfaceC0168h;
import a.AbstractC0169a;
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
import androidx.lifecycle.AbstractC0250p;
import androidx.lifecycle.C0258y;
import androidx.lifecycle.EnumC0248n;
import androidx.lifecycle.EnumC0249o;
import androidx.lifecycle.H;
import androidx.lifecycle.InterfaceC0244j;
import androidx.lifecycle.InterfaceC0254u;
import androidx.lifecycle.InterfaceC0256w;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.O;
import androidx.lifecycle.X;
import androidx.lifecycle.Z;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import com.icefishing.icefish.ice.fishing.s294s.R;
import e.C0368a;
import e.InterfaceC0369b;
import f.AbstractC0384c;
import f.AbstractC0391j;
import f.C0387f;
import f.C0389h;
import f.InterfaceC0383b;
import f6.InterfaceC0406a;
import g.AbstractC0407a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import k0.C0590a;
import k0.C0593d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import z.InterfaceC1052d;

/* loaded from: classes.dex */
public abstract class o extends y.f implements c0, InterfaceC0244j, k0.f, B, InterfaceC1052d {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final h Companion = new h();
    private b0 _viewModelStore;
    private final AbstractC0391j activityResultRegistry;
    private int contentLayoutId;
    private final InterfaceC0168h defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final InterfaceC0168h fullyDrawnReporter$delegate;
    private final AtomicInteger nextLocalRequestCode;
    private final InterfaceC0168h onBackPressedDispatcher$delegate;
    private final CopyOnWriteArrayList<H.a> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<H.a> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<H.a> onNewIntentListeners;
    private final CopyOnWriteArrayList<H.a> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<H.a> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final j reportFullyDrawnExecutor;
    private final k0.e savedStateRegistryController;
    private final C0368a contextAwareHelper = new C0368a();
    private final C0119o menuHostHelper = new C0119o(new d(this, 0));

    public o() {
        Intrinsics.checkNotNullParameter(this, "owner");
        k0.e eVar = new k0.e(this);
        this.savedStateRegistryController = eVar;
        this.reportFullyDrawnExecutor = new k(this);
        this.fullyDrawnReporter$delegate = R5.i.b(new n(this, 2));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new m(this);
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().a(new e(0, this));
        getLifecycle().a(new e(1, this));
        getLifecycle().a(new C0590a(4, this));
        eVar.a();
        O.d(this);
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new K(1, this));
        addOnContextAvailableListener(new InterfaceC0369b() { // from class: d.f
            @Override // e.InterfaceC0369b
            public final void a(o oVar) {
                o.a(o.this, oVar);
            }
        });
        this.defaultViewModelProviderFactory$delegate = R5.i.b(new n(this, 0));
        this.onBackPressedDispatcher$delegate = R5.i.b(new n(this, 3));
    }

    public static void a(o this$0, Context it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Bundle a7 = this$0.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (a7 != null) {
            AbstractC0391j abstractC0391j = this$0.activityResultRegistry;
            LinkedHashMap linkedHashMap = abstractC0391j.f4752b;
            LinkedHashMap linkedHashMap2 = abstractC0391j.f4751a;
            Bundle bundle = abstractC0391j.f4757g;
            ArrayList<Integer> integerArrayList = a7.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a7.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = a7.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                abstractC0391j.f4754d.addAll(stringArrayList2);
            }
            Bundle bundle2 = a7.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str = stringArrayList.get(i2);
                if (linkedHashMap.containsKey(str)) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (bundle.containsKey(str)) {
                        continue;
                    } else {
                        if ((linkedHashMap2 instanceof InterfaceC0406a) && !(linkedHashMap2 instanceof f6.d)) {
                            I.d(linkedHashMap2, "kotlin.collections.MutableMap");
                            throw null;
                        }
                        linkedHashMap2.remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i2);
                Intrinsics.checkNotNullExpressionValue(num2, "rcs[i]");
                int intValue = num2.intValue();
                String str2 = stringArrayList.get(i2);
                Intrinsics.checkNotNullExpressionValue(str2, "keys[i]");
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(intValue), str3);
                abstractC0391j.f4752b.put(str3, Integer.valueOf(intValue));
            }
        }
    }

    public static final void access$ensureViewModelStore(o oVar) {
        if (oVar._viewModelStore == null) {
            i iVar = (i) oVar.getLastNonConfigurationInstance();
            if (iVar != null) {
                oVar._viewModelStore = iVar.f4578b;
            }
            if (oVar._viewModelStore == null) {
                oVar._viewModelStore = new b0();
            }
        }
    }

    public static void b(o this$0, InterfaceC0256w interfaceC0256w, EnumC0248n event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(interfaceC0256w, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == EnumC0248n.ON_DESTROY) {
            this$0.contextAwareHelper.f4665b = null;
            if (!this$0.isChangingConfigurations()) {
                this$0.getViewModelStore().a();
            }
            k kVar = (k) this$0.reportFullyDrawnExecutor;
            o oVar = kVar.f4582l;
            oVar.getWindow().getDecorView().removeCallbacks(kVar);
            oVar.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(kVar);
        }
    }

    public static Bundle c(o this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bundle outState = new Bundle();
        AbstractC0391j abstractC0391j = this$0.activityResultRegistry;
        abstractC0391j.getClass();
        Intrinsics.checkNotNullParameter(outState, "outState");
        LinkedHashMap linkedHashMap = abstractC0391j.f4752b;
        outState.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(abstractC0391j.f4754d));
        outState.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(abstractC0391j.f4757g));
        return outState;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        j jVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        ((k) jVar).a(decorView);
        super.addContentView(view, layoutParams);
    }

    public void addMenuProvider(InterfaceC0120p provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        C0119o c0119o = this.menuHostHelper;
        c0119o.f1226b.add(provider);
        c0119o.f1225a.run();
    }

    @Override // z.InterfaceC1052d
    public final void addOnConfigurationChangedListener(H.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onConfigurationChangedListeners.add(listener);
    }

    public final void addOnContextAvailableListener(InterfaceC0369b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        C0368a c0368a = this.contextAwareHelper;
        c0368a.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        o oVar = c0368a.f4665b;
        if (oVar != null) {
            listener.a(oVar);
        }
        c0368a.f4664a.add(listener);
    }

    public final void addOnMultiWindowModeChangedListener(H.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    public final void addOnNewIntentListener(H.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onNewIntentListeners.add(listener);
    }

    public final void addOnPictureInPictureModeChangedListener(H.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    public final void addOnTrimMemoryListener(H.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onTrimMemoryListeners.add(listener);
    }

    public final void addOnUserLeaveHintListener(Runnable listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onUserLeaveHintListeners.add(listener);
    }

    public final AbstractC0391j getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // androidx.lifecycle.InterfaceC0244j
    public b0.c getDefaultViewModelCreationExtras() {
        b0.d dVar = new b0.d(0);
        if (getApplication() != null) {
            X x7 = X.f3887a;
            Application application = getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "application");
            dVar.b(x7, application);
        }
        dVar.b(O.f3869a, this);
        dVar.b(O.f3870b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            dVar.b(O.f3871c, extras);
        }
        return dVar;
    }

    public Z getDefaultViewModelProviderFactory() {
        return (Z) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    public q getFullyDrawnReporter() {
        return (q) this.fullyDrawnReporter$delegate.getValue();
    }

    public Object getLastCustomNonConfigurationInstance() {
        i iVar = (i) getLastNonConfigurationInstance();
        if (iVar != null) {
            return iVar.f4577a;
        }
        return null;
    }

    @Override // y.f, androidx.lifecycle.InterfaceC0256w
    public AbstractC0250p getLifecycle() {
        return super.getLifecycle();
    }

    @Override // d.B
    public final C0349A getOnBackPressedDispatcher() {
        return (C0349A) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // k0.f
    public final C0593d getSavedStateRegistry() {
        return this.savedStateRegistryController.f6029b;
    }

    @Override // androidx.lifecycle.c0
    public b0 getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this._viewModelStore == null) {
            i iVar = (i) getLastNonConfigurationInstance();
            if (iVar != null) {
                this._viewModelStore = iVar.f4578b;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new b0();
            }
        }
        b0 b0Var = this._viewModelStore;
        Intrinsics.b(b0Var);
        return b0Var;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        Intrinsics.checkNotNullParameter(decorView, "<this>");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "window.decorView");
        Intrinsics.checkNotNullParameter(decorView2, "<this>");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "window.decorView");
        Intrinsics.checkNotNullParameter(decorView3, "<this>");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
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

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i2, int i5, Intent intent) {
        if (this.activityResultRegistry.a(i2, i5, intent)) {
            return;
        }
        super.onActivityResult(i2, i5, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        getOnBackPressedDispatcher().b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator<H.a> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(newConfig);
        }
    }

    @Override // y.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.b(bundle);
        C0368a c0368a = this.contextAwareHelper;
        c0368a.getClass();
        Intrinsics.checkNotNullParameter(this, "context");
        c0368a.f4665b = this;
        Iterator it = c0368a.f4664a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0369b) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i2 = J.f3856e;
        H.b(this);
        int i5 = this.contentLayoutId;
        if (i5 != 0) {
            setContentView(i5);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i2, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (i2 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i2, menu);
        C0119o c0119o = this.menuHostHelper;
        getMenuInflater();
        Iterator it = c0119o.f1226b.iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.I) ((InterfaceC0120p) it.next())).f3588a.k();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i2, MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (super.onMenuItemSelected(i2, item)) {
            return true;
        }
        if (i2 == 0) {
            return this.menuHostHelper.a();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z7) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<H.a> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new y.g(z7));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        Iterator<H.a> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i2, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Iterator it = this.menuHostHelper.f1226b.iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.I) ((InterfaceC0120p) it.next())).f3588a.q();
        }
        super.onPanelClosed(i2, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z7) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<H.a> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new y.u(z7));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i2, View view, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (i2 != 0) {
            return true;
        }
        super.onPreparePanel(i2, view, menu);
        Iterator it = this.menuHostHelper.f1226b.iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.I) ((InterfaceC0120p) it.next())).f3588a.t();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (this.activityResultRegistry.a(i2, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(i2, permissions, grantResults);
    }

    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        i iVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        b0 b0Var = this._viewModelStore;
        if (b0Var == null && (iVar = (i) getLastNonConfigurationInstance()) != null) {
            b0Var = iVar.f4578b;
        }
        if (b0Var == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        i iVar2 = new i();
        iVar2.f4577a = onRetainCustomNonConfigurationInstance;
        iVar2.f4578b = b0Var;
        return iVar2;
    }

    @Override // y.f, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        if (getLifecycle() instanceof C0258y) {
            AbstractC0250p lifecycle = getLifecycle();
            Intrinsics.c(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((C0258y) lifecycle).g();
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.c(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i2) {
        super.onTrimMemory(i2);
        Iterator<H.a> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i2));
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
        return this.contextAwareHelper.f4665b;
    }

    public final <I, O> AbstractC0384c registerForActivityResult(final AbstractC0407a contract, final AbstractC0391j registry, final InterfaceC0383b callback) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(callback, "callback");
        final String key = "activity_rq#" + this.nextLocalRequestCode.getAndIncrement();
        LinkedHashMap linkedHashMap = registry.f4753c;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(this, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AbstractC0250p lifecycle = getLifecycle();
        C0258y c0258y = (C0258y) lifecycle;
        if (c0258y.f3922d.a(EnumC0249o.f3909l)) {
            throw new IllegalStateException(("LifecycleOwner " + this + " is attempting to register while current state is " + c0258y.f3922d + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        registry.d(key);
        C0387f c0387f = (C0387f) linkedHashMap.get(key);
        if (c0387f == null) {
            c0387f = new C0387f(lifecycle);
        }
        InterfaceC0254u observer = new InterfaceC0254u() { // from class: f.d
            @Override // androidx.lifecycle.InterfaceC0254u
            public final void a(InterfaceC0256w interfaceC0256w, EnumC0248n event) {
                AbstractC0391j this$0 = AbstractC0391j.this;
                LinkedHashMap linkedHashMap2 = this$0.f4755e;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                String key2 = key;
                Intrinsics.checkNotNullParameter(key2, "$key");
                InterfaceC0383b callback2 = callback;
                Intrinsics.checkNotNullParameter(callback2, "$callback");
                AbstractC0407a contract2 = contract;
                Intrinsics.checkNotNullParameter(contract2, "$contract");
                Intrinsics.checkNotNullParameter(interfaceC0256w, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(event, "event");
                if (EnumC0248n.ON_START != event) {
                    if (EnumC0248n.ON_STOP == event) {
                        linkedHashMap2.remove(key2);
                        return;
                    } else {
                        if (EnumC0248n.ON_DESTROY == event) {
                            this$0.e(key2);
                            return;
                        }
                        return;
                    }
                }
                Bundle bundle = this$0.f4757g;
                LinkedHashMap linkedHashMap3 = this$0.f4756f;
                linkedHashMap2.put(key2, new C0386e(contract2, callback2));
                if (linkedHashMap3.containsKey(key2)) {
                    Object obj = linkedHashMap3.get(key2);
                    linkedHashMap3.remove(key2);
                    callback2.c(obj);
                }
                C0382a c0382a = (C0382a) V6.b.C(key2, bundle);
                if (c0382a != null) {
                    bundle.remove(key2);
                    callback2.c(contract2.c(c0382a.f4737d, c0382a.f4738e));
                }
            }
        };
        Intrinsics.checkNotNullParameter(observer, "observer");
        c0387f.f4745a.a(observer);
        c0387f.f4746b.add(observer);
        linkedHashMap.put(key, c0387f);
        return new C0389h();
    }

    public void removeMenuProvider(InterfaceC0120p provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.menuHostHelper.b(provider);
    }

    @Override // z.InterfaceC1052d
    public final void removeOnConfigurationChangedListener(H.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onConfigurationChangedListeners.remove(listener);
    }

    public final void removeOnContextAvailableListener(InterfaceC0369b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        C0368a c0368a = this.contextAwareHelper;
        c0368a.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        c0368a.f4664a.remove(listener);
    }

    public final void removeOnMultiWindowModeChangedListener(H.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    public final void removeOnNewIntentListener(H.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onNewIntentListeners.remove(listener);
    }

    public final void removeOnPictureInPictureModeChangedListener(H.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    public final void removeOnTrimMemoryListener(H.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onTrimMemoryListeners.remove(listener);
    }

    public final void removeOnUserLeaveHintListener(Runnable listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onUserLeaveHintListeners.remove(listener);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (AbstractC0169a.o()) {
                Trace.beginSection(AbstractC0169a.G("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            q fullyDrawnReporter = getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.f4594b) {
                try {
                    fullyDrawnReporter.f4595c = true;
                    ArrayList arrayList = fullyDrawnReporter.f4596d;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        ((Function0) obj).invoke();
                    }
                    fullyDrawnReporter.f4596d.clear();
                    Unit unit = Unit.f6114a;
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
    public void setContentView(int i2) {
        initializeViewTreeOwners();
        j jVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        ((k) jVar).a(decorView);
        super.setContentView(i2);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i2) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startActivityForResult(intent, i2);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int i2, Intent intent2, int i5, int i7, int i8) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startIntentSenderForResult(intent, i2, intent2, i5, i7, i8);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i2, Bundle bundle) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startActivityForResult(intent, i2, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int i2, Intent intent2, int i5, int i7, int i8, Bundle bundle) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startIntentSenderForResult(intent, i2, intent2, i5, i7, i8, bundle);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z7, Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z7, newConfig);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<H.a> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                H.a next = it.next();
                Intrinsics.checkNotNullParameter(newConfig, "newConfig");
                next.accept(new y.g(z7));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z7, Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z7, newConfig);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<H.a> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                H.a next = it.next();
                Intrinsics.checkNotNullParameter(newConfig, "newConfig");
                next.accept(new y.u(z7));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        j jVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        ((k) jVar).a(decorView);
        super.setContentView(view);
    }

    public void addMenuProvider(InterfaceC0120p provider, InterfaceC0256w owner) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(owner, "owner");
        C0119o c0119o = this.menuHostHelper;
        c0119o.f1226b.add(provider);
        c0119o.f1225a.run();
        AbstractC0250p lifecycle = owner.getLifecycle();
        HashMap hashMap = c0119o.f1227c;
        C0118n c0118n = (C0118n) hashMap.remove(provider);
        if (c0118n != null) {
            c0118n.f1223a.b(c0118n.f1224b);
            c0118n.f1224b = null;
        }
        hashMap.put(provider, new C0118n(lifecycle, new C0117m(c0119o, 0, provider)));
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        j jVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        ((k) jVar).a(decorView);
        super.setContentView(view, layoutParams);
    }

    public void addMenuProvider(final InterfaceC0120p provider, InterfaceC0256w owner, final EnumC0249o state) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(state, "state");
        final C0119o c0119o = this.menuHostHelper;
        c0119o.getClass();
        AbstractC0250p lifecycle = owner.getLifecycle();
        HashMap hashMap = c0119o.f1227c;
        C0118n c0118n = (C0118n) hashMap.remove(provider);
        if (c0118n != null) {
            c0118n.f1223a.b(c0118n.f1224b);
            c0118n.f1224b = null;
        }
        hashMap.put(provider, new C0118n(lifecycle, new InterfaceC0254u() { // from class: I.l
            @Override // androidx.lifecycle.InterfaceC0254u
            public final void a(InterfaceC0256w interfaceC0256w, EnumC0248n enumC0248n) {
                C0119o c0119o2 = C0119o.this;
                c0119o2.getClass();
                Runnable runnable = c0119o2.f1225a;
                CopyOnWriteArrayList copyOnWriteArrayList = c0119o2.f1226b;
                EnumC0248n.Companion.getClass();
                EnumC0249o state2 = state;
                Intrinsics.checkNotNullParameter(state2, "state");
                int ordinal = state2.ordinal();
                EnumC0248n enumC0248n2 = null;
                EnumC0248n enumC0248n3 = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : EnumC0248n.ON_RESUME : EnumC0248n.ON_START : EnumC0248n.ON_CREATE;
                InterfaceC0120p interfaceC0120p = provider;
                if (enumC0248n == enumC0248n3) {
                    copyOnWriteArrayList.add(interfaceC0120p);
                    runnable.run();
                    return;
                }
                EnumC0248n enumC0248n4 = EnumC0248n.ON_DESTROY;
                if (enumC0248n == enumC0248n4) {
                    c0119o2.b(interfaceC0120p);
                    return;
                }
                Intrinsics.checkNotNullParameter(state2, "state");
                int ordinal2 = state2.ordinal();
                if (ordinal2 == 2) {
                    enumC0248n2 = enumC0248n4;
                } else if (ordinal2 == 3) {
                    enumC0248n2 = EnumC0248n.ON_STOP;
                } else if (ordinal2 == 4) {
                    enumC0248n2 = EnumC0248n.ON_PAUSE;
                }
                if (enumC0248n == enumC0248n2) {
                    copyOnWriteArrayList.remove(interfaceC0120p);
                    runnable.run();
                }
            }
        }));
    }

    public final <I, O> AbstractC0384c registerForActivityResult(AbstractC0407a contract, InterfaceC0383b callback) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return registerForActivityResult(contract, this.activityResultRegistry, callback);
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }
}
