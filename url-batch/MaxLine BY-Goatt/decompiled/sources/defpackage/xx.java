package defpackage;

import android.app.Application;
import android.app.PictureInPictureUiState;
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
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import com.majelw.libystne.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class xx extends wx implements u53, jx0, zd2, su1, uq1, m4, vu1, fv1, av1, bv1, hk1 {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final px Companion = new px();
    private t53 _viewModelStore;
    private final i4 activityResultRegistry;
    private int contentLayoutId;
    private final v20 contextAwareHelper = new v20();
    private final y91 defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final y91 fullyDrawnReporter$delegate;
    private boolean hasPictureInPictureSystemFeature;
    private final jk1 menuHostHelper;
    private final AtomicInteger nextLocalRequestCode;
    private final y91 onBackPressedDispatcher$delegate;
    private final y91 onBackPressedInput$delegate;
    private final CopyOnWriteArrayList<a20> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<a20> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<a20> onNewIntentListeners;
    private final CopyOnWriteArrayList<a20> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<a20> onPictureInPictureUiStateChangedListeners;
    private final CopyOnWriteArrayList<a20> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final sx reportFullyDrawnExecutor;
    private final xd2 savedStateRegistryController;

    public xx() {
        final kr0 kr0Var = (kr0) this;
        final int i = 0;
        this.menuHostHelper = new jk1(new lx(kr0Var, i));
        yd2 yd2Var = new yd2(this, new dj(11, this));
        this.savedStateRegistryController = new xd2(yd2Var);
        this.reportFullyDrawnExecutor = new tx(kr0Var);
        final int i2 = 1;
        this.fullyDrawnReporter$delegate = ya1.b(new mx(kr0Var, i2));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new vx(kr0Var);
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureUiStateChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        int i3 = 2;
        this.onBackPressedInput$delegate = ya1.b(new mx(kr0Var, i3));
        if (getLifecycle() == null) {
            lh.g("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        getLifecycle().a(new fd1() { // from class: ox
            @Override // defpackage.fd1
            public final void o(id1 id1Var, yc1 yc1Var) {
                Window window;
                View peekDecorView;
                int i4 = i;
                kr0 kr0Var2 = kr0Var;
                switch (i4) {
                    case 0:
                        if (yc1Var == yc1.ON_STOP && (window = kr0Var2.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                            peekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        xx.d(kr0Var2, id1Var, yc1Var);
                        break;
                }
            }
        });
        getLifecycle().a(new fd1() { // from class: ox
            @Override // defpackage.fd1
            public final void o(id1 id1Var, yc1 yc1Var) {
                Window window;
                View peekDecorView;
                int i4 = i2;
                kr0 kr0Var2 = kr0Var;
                switch (i4) {
                    case 0:
                        if (yc1Var == yc1.ON_STOP && (window = kr0Var2.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                            peekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        xx.d(kr0Var2, id1Var, yc1Var);
                        break;
                }
            }
        });
        getLifecycle().a(new v72(i3, kr0Var));
        yd2Var.a();
        z71.p(this);
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new gr0(kr0Var, i2));
        addOnContextAvailableListener(new ir0(kr0Var, i2));
        this.defaultViewModelProviderFactory$delegate = ya1.b(new mx(kr0Var, 3));
        this.onBackPressedDispatcher$delegate = ya1.b(new mx(kr0Var, 4));
    }

    public static Bundle a(kr0 kr0Var) {
        Bundle bundle = new Bundle();
        i4 i4Var = ((xx) kr0Var).activityResultRegistry;
        i4Var.getClass();
        LinkedHashMap linkedHashMap = i4Var.b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(i4Var.d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(i4Var.g));
        return bundle;
    }

    public static final void access$ensureViewModelStore(xx xxVar) {
        if (xxVar._viewModelStore == null) {
            rx rxVar = (rx) xxVar.getLastNonConfigurationInstance();
            if (rxVar != null) {
                xxVar._viewModelStore = rxVar.b;
            }
            if (xxVar._viewModelStore == null) {
                xxVar._viewModelStore = new t53();
            }
        }
    }

    public static void b(ru1 ru1Var, xx xxVar, id1 id1Var, yc1 yc1Var) {
        if (yc1Var == yc1.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = xxVar.getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            ru1Var.c(onBackInvokedDispatcher);
        }
    }

    public static it0 c(kr0 kr0Var) {
        return new it0(((xx) kr0Var).reportFullyDrawnExecutor, new mx(kr0Var, 0));
    }

    public static void d(kr0 kr0Var, id1 id1Var, yc1 yc1Var) {
        if (yc1Var == yc1.ON_DESTROY) {
            ((xx) kr0Var).contextAwareHelper.b = null;
            if (!kr0Var.isChangingConfigurations()) {
                kr0Var.getViewModelStore().a();
            }
            tx txVar = (tx) ((xx) kr0Var).reportFullyDrawnExecutor;
            kr0 kr0Var2 = txVar.p;
            kr0Var2.getWindow().getDecorView().removeCallbacks(txVar);
            kr0Var2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(txVar);
        }
    }

    public static void e(kr0 kr0Var) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!Intrinsics.b(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!Intrinsics.b(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    public static void f(kr0 kr0Var, Context context) {
        context.getClass();
        Bundle a = kr0Var.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (a != null) {
            i4 i4Var = ((xx) kr0Var).activityResultRegistry;
            LinkedHashMap linkedHashMap = i4Var.b;
            LinkedHashMap linkedHashMap2 = i4Var.a;
            Bundle bundle = i4Var.g;
            ArrayList<Integer> integerArrayList = a.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                i4Var.d.addAll(stringArrayList2);
            }
            Bundle bundle2 = a.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                if (linkedHashMap.containsKey(str)) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle.containsKey(str)) {
                        s03.e(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i);
                num2.getClass();
                int intValue = num2.intValue();
                String str2 = stringArrayList.get(i);
                str2.getClass();
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(intValue), str3);
                i4Var.b.put(str3, Integer.valueOf(intValue));
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        sx sxVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((tx) sxVar).a(decorView);
        super.addContentView(view, layoutParams);
    }

    public void addMenuProvider(al1 al1Var, id1 id1Var) {
        al1Var.getClass();
        id1Var.getClass();
        jk1 jk1Var = this.menuHostHelper;
        jk1Var.b.add(al1Var);
        jk1Var.a.run();
        ad1 lifecycle = id1Var.getLifecycle();
        HashMap hashMap = jk1Var.c;
        ik1 ik1Var = (ik1) hashMap.remove(al1Var);
        if (ik1Var != null) {
            ik1Var.a.c(ik1Var.b);
            ik1Var.b = null;
        }
        hashMap.put(al1Var, new ik1(lifecycle, new nx(1, jk1Var, al1Var)));
    }

    @Override // defpackage.vu1
    public final void addOnConfigurationChangedListener(a20 a20Var) {
        a20Var.getClass();
        this.onConfigurationChangedListeners.add(a20Var);
    }

    public final void addOnContextAvailableListener(wu1 wu1Var) {
        wu1Var.getClass();
        v20 v20Var = this.contextAwareHelper;
        v20Var.getClass();
        xx xxVar = v20Var.b;
        if (xxVar != null) {
            wu1Var.a(xxVar);
        }
        v20Var.a.add(wu1Var);
    }

    @Override // defpackage.av1
    public final void addOnMultiWindowModeChangedListener(a20 a20Var) {
        a20Var.getClass();
        this.onMultiWindowModeChangedListeners.add(a20Var);
    }

    public final void addOnNewIntentListener(a20 a20Var) {
        a20Var.getClass();
        this.onNewIntentListeners.add(a20Var);
    }

    @Override // defpackage.bv1
    public final void addOnPictureInPictureModeChangedListener(a20 a20Var) {
        a20Var.getClass();
        this.onPictureInPictureModeChangedListeners.add(a20Var);
    }

    public final void addOnPictureInPictureUiStateChangedListener(a20 a20Var) {
        a20Var.getClass();
        this.onPictureInPictureUiStateChangedListeners.add(a20Var);
    }

    @Override // defpackage.fv1
    public final void addOnTrimMemoryListener(a20 a20Var) {
        a20Var.getClass();
        this.onTrimMemoryListeners.add(a20Var);
    }

    public final void addOnUserLeaveHintListener(Runnable runnable) {
        runnable.getClass();
        this.onUserLeaveHintListeners.add(runnable);
    }

    public final void enterPictureInPictureMode(k12 k12Var) {
        throw null;
    }

    @Override // defpackage.m4
    public final i4 getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // defpackage.jx0
    public i50 getDefaultViewModelCreationExtras() {
        wm1 wm1Var = new wm1(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = wm1Var.a;
        if (application != null) {
            linkedHashMap.put(p53.d, getApplication());
        }
        linkedHashMap.put(z71.v, this);
        linkedHashMap.put(z71.w, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(z71.x, extras);
        }
        return wm1Var;
    }

    @Override // defpackage.jx0
    public q53 getDefaultViewModelProviderFactory() {
        return (q53) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    public it0 getFullyDrawnReporter() {
        return (it0) this.fullyDrawnReporter$delegate.getValue();
    }

    @fa0
    public Object getLastCustomNonConfigurationInstance() {
        rx rxVar = (rx) getLastNonConfigurationInstance();
        if (rxVar != null) {
            return rxVar.a;
        }
        return null;
    }

    @Override // defpackage.wx, defpackage.id1
    public ad1 getLifecycle() {
        return super.getLifecycle();
    }

    @Override // defpackage.uq1
    public tq1 getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().b().c;
    }

    @Override // defpackage.su1
    public final ru1 getOnBackPressedDispatcher() {
        return (ru1) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // defpackage.zd2
    public final wd2 getSavedStateRegistry() {
        return this.savedStateRegistryController.b;
    }

    @Override // defpackage.u53
    public t53 getViewModelStore() {
        if (getApplication() == null) {
            lh.g("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        if (this._viewModelStore == null) {
            rx rxVar = (rx) getLastNonConfigurationInstance();
            if (rxVar != null) {
                this._viewModelStore = rxVar.b;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new t53();
            }
        }
        t53 t53Var = this._viewModelStore;
        t53Var.getClass();
        return t53Var;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        decorView6.getClass();
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.activityResultRegistry.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    @fa0
    public void onBackPressed() {
        ((jb0) this.onBackPressedInput$delegate.getValue()).a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator<a20> it = this.onConfigurationChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // defpackage.wx, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.a(bundle);
        v20 v20Var = this.contextAwareHelper;
        v20Var.getClass();
        v20Var.b = this;
        Iterator it = v20Var.a.iterator();
        while (it.hasNext()) {
            ((wu1) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = b92.n;
        z82.b(this);
        int i2 = this.contentLayoutId;
        if (i2 != 0) {
            setContentView(i2);
        }
        this.hasPictureInPictureSystemFeature = getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        jk1 jk1Var = this.menuHostHelper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = jk1Var.b.iterator();
        while (it.hasNext()) {
            ((ur0) ((al1) it.next())).a.j(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.menuHostHelper.a(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<a20> it = this.onMultiWindowModeChangedListeners.iterator();
            it.getClass();
            while (it.hasNext()) {
                a20 next = it.next();
                configuration.getClass();
                next.accept(new vm1(z));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator<a20> it = this.onNewIntentListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = this.menuHostHelper.b.iterator();
        while (it.hasNext()) {
            ((ur0) ((al1) it.next())).a.p(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<a20> it = this.onPictureInPictureModeChangedListeners.iterator();
            it.getClass();
            while (it.hasNext()) {
                a20 next = it.next();
                configuration.getClass();
                next.accept(new j12(z));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        pictureInPictureUiState.getClass();
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        nm1 b = sf0.b(pictureInPictureUiState);
        Iterator<a20> it = this.onPictureInPictureUiStateChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(b);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = this.menuHostHelper.b.iterator();
        while (it.hasNext()) {
            ((ur0) ((al1) it.next())).a.s(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.activityResultRegistry.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @fa0
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        rx rxVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        t53 t53Var = this._viewModelStore;
        if (t53Var == null && (rxVar = (rx) getLastNonConfigurationInstance()) != null) {
            t53Var = rxVar.b;
        }
        if (t53Var == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        rx rxVar2 = new rx();
        rxVar2.a = onRetainCustomNonConfigurationInstance;
        rxVar2.b = t53Var;
        return rxVar2;
    }

    @Override // defpackage.wx, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        if (getLifecycle() instanceof kd1) {
            ad1 lifecycle = getLifecycle();
            lifecycle.getClass();
            ((kd1) lifecycle).h(zc1.o);
        }
        super.onSaveInstanceState(bundle);
        this.savedStateRegistryController.b(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<a20> it = this.onTrimMemoryListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.b;
    }

    public final <I, O> b4 registerForActivityResult(w3 w3Var, i4 i4Var, u3 u3Var) {
        w3Var.getClass();
        i4Var.getClass();
        u3Var.getClass();
        return i4Var.d("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, w3Var, u3Var);
    }

    @Override // defpackage.hk1
    public void removeMenuProvider(al1 al1Var) {
        al1Var.getClass();
        this.menuHostHelper.b(al1Var);
    }

    @Override // defpackage.vu1
    public final void removeOnConfigurationChangedListener(a20 a20Var) {
        a20Var.getClass();
        this.onConfigurationChangedListeners.remove(a20Var);
    }

    public final void removeOnContextAvailableListener(wu1 wu1Var) {
        wu1Var.getClass();
        v20 v20Var = this.contextAwareHelper;
        v20Var.getClass();
        v20Var.a.remove(wu1Var);
    }

    @Override // defpackage.av1
    public final void removeOnMultiWindowModeChangedListener(a20 a20Var) {
        a20Var.getClass();
        this.onMultiWindowModeChangedListeners.remove(a20Var);
    }

    public final void removeOnNewIntentListener(a20 a20Var) {
        a20Var.getClass();
        this.onNewIntentListeners.remove(a20Var);
    }

    @Override // defpackage.bv1
    public final void removeOnPictureInPictureModeChangedListener(a20 a20Var) {
        a20Var.getClass();
        this.onPictureInPictureModeChangedListeners.remove(a20Var);
    }

    public final void removeOnPictureInPictureUiStateChangedListener(a20 a20Var) {
        a20Var.getClass();
        this.onPictureInPictureUiStateChangedListeners.remove(a20Var);
    }

    @Override // defpackage.fv1
    public final void removeOnTrimMemoryListener(a20 a20Var) {
        a20Var.getClass();
        this.onTrimMemoryListeners.remove(a20Var);
    }

    public final void removeOnUserLeaveHintListener(Runnable runnable) {
        runnable.getClass();
        this.onUserLeaveHintListeners.remove(runnable);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (ak2.j()) {
                ak2.f("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            it0 fullyDrawnReporter = getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.b) {
                try {
                    fullyDrawnReporter.c = true;
                    ArrayList arrayList = fullyDrawnReporter.d;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((Function0) obj).invoke();
                    }
                    fullyDrawnReporter.d.clear();
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        initializeViewTreeOwners();
        sx sxVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((tx) sxVar).a(decorView);
        super.setContentView(i);
    }

    public final void setPictureInPictureParams(k12 k12Var) {
        throw null;
    }

    @Override // android.app.Activity
    @fa0
    public void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @fa0
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    @fa0
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @fa0
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        sx sxVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((tx) sxVar).a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        sx sxVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((tx) sxVar).a(decorView);
        super.setContentView(view, layoutParams);
    }

    public final <I, O> b4 registerForActivityResult(w3 w3Var, u3 u3Var) {
        w3Var.getClass();
        u3Var.getClass();
        return registerForActivityResult(w3Var, this.activityResultRegistry, u3Var);
    }

    @Override // android.app.Activity
    @fa0
    public void onMultiWindowModeChanged(boolean z) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<a20> it = this.onMultiWindowModeChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(new vm1(z));
        }
    }

    @Override // android.app.Activity
    @fa0
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<a20> it = this.onPictureInPictureModeChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(new j12(z));
        }
    }

    @Override // defpackage.hk1
    public void addMenuProvider(al1 al1Var) {
        al1Var.getClass();
        jk1 jk1Var = this.menuHostHelper;
        jk1Var.b.add(al1Var);
        jk1Var.a.run();
    }

    public void addMenuProvider(al1 al1Var, id1 id1Var, zc1 zc1Var) {
        al1Var.getClass();
        id1Var.getClass();
        zc1Var.getClass();
        jk1 jk1Var = this.menuHostHelper;
        jk1Var.getClass();
        ad1 lifecycle = id1Var.getLifecycle();
        HashMap hashMap = jk1Var.c;
        ik1 ik1Var = (ik1) hashMap.remove(al1Var);
        if (ik1Var != null) {
            ik1Var.a.c(ik1Var.b);
            ik1Var.b = null;
        }
        hashMap.put(al1Var, new ik1(lifecycle, new dd1(jk1Var, zc1Var, al1Var, 1)));
    }
}
