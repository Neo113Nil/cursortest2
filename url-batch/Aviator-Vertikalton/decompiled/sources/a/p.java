package a;

import K.C0017m;
import K.C0018n;
import K.C0019o;
import K.InterfaceC0021q;
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
import androidx.fragment.app.AbstractActivityC0064v;
import androidx.lifecycle.AbstractC0082o;
import androidx.lifecycle.C0078k;
import androidx.lifecycle.C0088v;
import androidx.lifecycle.D;
import androidx.lifecycle.EnumC0080m;
import androidx.lifecycle.EnumC0081n;
import androidx.lifecycle.F;
import androidx.lifecycle.InterfaceC0076i;
import androidx.lifecycle.InterfaceC0086t;
import androidx.lifecycle.J;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import androidx.lifecycle.U;
import androidx.lifecycle.V;
import b.C0089a;
import b.InterfaceC0090b;
import c.AbstractC0096c;
import c.AbstractC0102i;
import c.C0099f;
import c.C0101h;
import c.InterfaceC0095b;
import com.fortuneink.neonpad.R;
import d.AbstractC0104a;
import g0.C0163a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class p extends z.j implements V, InterfaceC0076i, g0.f, C {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final i Companion = new i();
    private U _viewModelStore;
    private final AbstractC0102i activityResultRegistry;
    private int contentLayoutId;
    private final C0089a contextAwareHelper = new C0089a();
    private final N0.b defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final N0.b fullyDrawnReporter$delegate;
    private final C0019o menuHostHelper;
    private final AtomicInteger nextLocalRequestCode;
    private final N0.b onBackPressedDispatcher$delegate;
    private final CopyOnWriteArrayList<J.a> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<J.a> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<J.a> onNewIntentListeners;
    private final CopyOnWriteArrayList<J.a> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<J.a> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final k reportFullyDrawnExecutor;
    private final g0.e savedStateRegistryController;

    public p() {
        final AbstractActivityC0064v abstractActivityC0064v = (AbstractActivityC0064v) this;
        this.menuHostHelper = new C0019o(new d(abstractActivityC0064v, 0));
        g0.e eVar = new g0.e(this);
        this.savedStateRegistryController = eVar;
        this.reportFullyDrawnExecutor = new l(abstractActivityC0064v);
        this.fullyDrawnReporter$delegate = new N0.d(new o(abstractActivityC0064v, 2));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new n(abstractActivityC0064v);
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().a(new e(0, abstractActivityC0064v));
        int i = 1;
        getLifecycle().a(new e(i, abstractActivityC0064v));
        getLifecycle().a(new C0163a(i, abstractActivityC0064v));
        eVar.a();
        J.d(this);
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new f(0, abstractActivityC0064v));
        addOnContextAvailableListener(new InterfaceC0090b() { // from class: a.g
            @Override // b.InterfaceC0090b
            public final void a(p pVar) {
                p.a(AbstractActivityC0064v.this, pVar);
            }
        });
        this.defaultViewModelProviderFactory$delegate = new N0.d(new o(abstractActivityC0064v, 0));
        this.onBackPressedDispatcher$delegate = new N0.d(new o(abstractActivityC0064v, 3));
    }

    public static void a(AbstractActivityC0064v abstractActivityC0064v, p pVar) {
        X0.f.e(pVar, "it");
        Bundle a2 = abstractActivityC0064v.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (a2 != null) {
            AbstractC0102i abstractC0102i = ((p) abstractActivityC0064v).activityResultRegistry;
            abstractC0102i.getClass();
            ArrayList<Integer> integerArrayList = a2.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a2.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = a2.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                abstractC0102i.f1663d.addAll(stringArrayList2);
            }
            Bundle bundle = a2.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            Bundle bundle2 = abstractC0102i.f1666g;
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                LinkedHashMap linkedHashMap = abstractC0102i.f1661b;
                boolean containsKey = linkedHashMap.containsKey(str);
                LinkedHashMap linkedHashMap2 = abstractC0102i.f1660a;
                if (containsKey) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (bundle2.containsKey(str)) {
                        continue;
                    } else {
                        if (linkedHashMap2 instanceof Y0.a) {
                            ClassCastException classCastException = new ClassCastException((linkedHashMap2 == null ? "null" : linkedHashMap2.getClass().getName()).concat(" cannot be cast to kotlin.collections.MutableMap"));
                            X0.f.g(classCastException, X0.l.class.getName());
                            throw classCastException;
                        }
                        linkedHashMap2.remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i);
                X0.f.d(num2, "rcs[i]");
                int intValue = num2.intValue();
                String str2 = stringArrayList.get(i);
                X0.f.d(str2, "keys[i]");
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
                pVar._viewModelStore = jVar.f913b;
            }
            if (pVar._viewModelStore == null) {
                pVar._viewModelStore = new U();
            }
        }
    }

    public static void b(AbstractActivityC0064v abstractActivityC0064v, InterfaceC0086t interfaceC0086t, EnumC0080m enumC0080m) {
        if (enumC0080m == EnumC0080m.ON_DESTROY) {
            ((p) abstractActivityC0064v).contextAwareHelper.f1632b = null;
            if (!abstractActivityC0064v.isChangingConfigurations()) {
                abstractActivityC0064v.getViewModelStore().a();
            }
            l lVar = (l) ((p) abstractActivityC0064v).reportFullyDrawnExecutor;
            AbstractActivityC0064v abstractActivityC0064v2 = lVar.f917d;
            abstractActivityC0064v2.getWindow().getDecorView().removeCallbacks(lVar);
            abstractActivityC0064v2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(lVar);
        }
    }

    public static Bundle c(AbstractActivityC0064v abstractActivityC0064v) {
        Bundle bundle = new Bundle();
        AbstractC0102i abstractC0102i = ((p) abstractActivityC0064v).activityResultRegistry;
        abstractC0102i.getClass();
        LinkedHashMap linkedHashMap = abstractC0102i.f1661b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(abstractC0102i.f1663d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(abstractC0102i.f1666g));
        return bundle;
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    public void addMenuProvider(InterfaceC0021q interfaceC0021q) {
        X0.f.e(interfaceC0021q, "provider");
        C0019o c0019o = this.menuHostHelper;
        c0019o.f480b.add(interfaceC0021q);
        c0019o.f479a.run();
    }

    public final void addOnConfigurationChangedListener(J.a aVar) {
        X0.f.e(aVar, "listener");
        this.onConfigurationChangedListeners.add(aVar);
    }

    public final void addOnContextAvailableListener(InterfaceC0090b interfaceC0090b) {
        X0.f.e(interfaceC0090b, "listener");
        C0089a c0089a = this.contextAwareHelper;
        c0089a.getClass();
        p pVar = c0089a.f1632b;
        if (pVar != null) {
            interfaceC0090b.a(pVar);
        }
        c0089a.f1631a.add(interfaceC0090b);
    }

    public final void addOnMultiWindowModeChangedListener(J.a aVar) {
        X0.f.e(aVar, "listener");
        this.onMultiWindowModeChangedListeners.add(aVar);
    }

    public final void addOnNewIntentListener(J.a aVar) {
        X0.f.e(aVar, "listener");
        this.onNewIntentListeners.add(aVar);
    }

    public final void addOnPictureInPictureModeChangedListener(J.a aVar) {
        X0.f.e(aVar, "listener");
        this.onPictureInPictureModeChangedListeners.add(aVar);
    }

    public final void addOnTrimMemoryListener(J.a aVar) {
        X0.f.e(aVar, "listener");
        this.onTrimMemoryListeners.add(aVar);
    }

    public final void addOnUserLeaveHintListener(Runnable runnable) {
        X0.f.e(runnable, "listener");
        this.onUserLeaveHintListeners.add(runnable);
    }

    public final AbstractC0102i getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // androidx.lifecycle.InterfaceC0076i
    public Z.b getDefaultViewModelCreationExtras() {
        Z.c cVar = new Z.c(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = cVar.f882a;
        if (application != null) {
            H0.e eVar = Q.f1472d;
            Application application2 = getApplication();
            X0.f.d(application2, "application");
            linkedHashMap.put(eVar, application2);
        }
        linkedHashMap.put(J.f1453a, this);
        linkedHashMap.put(J.f1454b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(J.f1455c, extras);
        }
        return cVar;
    }

    public S getDefaultViewModelProviderFactory() {
        return (S) ((N0.d) this.defaultViewModelProviderFactory$delegate).a();
    }

    public r getFullyDrawnReporter() {
        return (r) ((N0.d) this.fullyDrawnReporter$delegate).a();
    }

    public Object getLastCustomNonConfigurationInstance() {
        j jVar = (j) getLastNonConfigurationInstance();
        if (jVar != null) {
            return jVar.f912a;
        }
        return null;
    }

    @Override // z.j, androidx.lifecycle.InterfaceC0086t
    public AbstractC0082o getLifecycle() {
        return super.getLifecycle();
    }

    public final C0039B getOnBackPressedDispatcher() {
        return (C0039B) ((N0.d) this.onBackPressedDispatcher$delegate).a();
    }

    @Override // g0.f
    public final g0.d getSavedStateRegistry() {
        return this.savedStateRegistryController.f2615b;
    }

    @Override // androidx.lifecycle.V
    public U getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this._viewModelStore == null) {
            j jVar = (j) getLastNonConfigurationInstance();
            if (jVar != null) {
                this._viewModelStore = jVar.f913b;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new U();
            }
        }
        U u2 = this._viewModelStore;
        X0.f.b(u2);
        return u2;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        X0.f.d(decorView, "window.decorView");
        J.f(decorView, this);
        View decorView2 = getWindow().getDecorView();
        X0.f.d(decorView2, "window.decorView");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        X0.f.d(decorView3, "window.decorView");
        q1.l.j0(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        X0.f.d(decorView4, "window.decorView");
        q1.l.i0(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        X0.f.d(decorView5, "window.decorView");
        decorView5.setTag(R.id.report_drawn, this);
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
    public void onBackPressed() {
        getOnBackPressedDispatcher().b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        X0.f.e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator<J.a> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().a(configuration);
        }
    }

    @Override // z.j, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.b(bundle);
        C0089a c0089a = this.contextAwareHelper;
        c0089a.getClass();
        c0089a.f1632b = this;
        Iterator it = c0089a.f1631a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0090b) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = F.f1442b;
        D.b(this);
        int i2 = this.contentLayoutId;
        if (i2 != 0) {
            setContentView(i2);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        X0.f.e(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        C0019o c0019o = this.menuHostHelper;
        getMenuInflater();
        Iterator it = c0019o.f480b.iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.D) ((InterfaceC0021q) it.next())).f1198a.j();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        X0.f.e(menuItem, "item");
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.menuHostHelper.a();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z2) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<J.a> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().a(new z.k(z2));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        X0.f.e(intent, "intent");
        super.onNewIntent(intent);
        Iterator<J.a> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        X0.f.e(menu, "menu");
        Iterator it = this.menuHostHelper.f480b.iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.D) ((InterfaceC0021q) it.next())).f1198a.p();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z2) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<J.a> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().a(new z.n(z2));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        X0.f.e(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = this.menuHostHelper.f480b.iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.D) ((InterfaceC0021q) it.next())).f1198a.s();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        X0.f.e(strArr, "permissions");
        X0.f.e(iArr, "grantResults");
        if (this.activityResultRegistry.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        j jVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        U u2 = this._viewModelStore;
        if (u2 == null && (jVar = (j) getLastNonConfigurationInstance()) != null) {
            u2 = jVar.f913b;
        }
        if (u2 == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        j jVar2 = new j();
        jVar2.f912a = onRetainCustomNonConfigurationInstance;
        jVar2.f913b = u2;
        return jVar2;
    }

    @Override // z.j, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        X0.f.e(bundle, "outState");
        if (getLifecycle() instanceof C0088v) {
            AbstractC0082o lifecycle = getLifecycle();
            X0.f.c(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((C0088v) lifecycle).g();
        }
        super.onSaveInstanceState(bundle);
        this.savedStateRegistryController.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<J.a> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().a(Integer.valueOf(i));
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
        return this.contextAwareHelper.f1632b;
    }

    public final <I, O> AbstractC0096c registerForActivityResult(final AbstractC0104a abstractC0104a, final AbstractC0102i abstractC0102i, final InterfaceC0095b interfaceC0095b) {
        X0.f.e(abstractC0104a, "contract");
        X0.f.e(abstractC0102i, "registry");
        X0.f.e(interfaceC0095b, "callback");
        final String str = "activity_rq#" + this.nextLocalRequestCode.getAndIncrement();
        X0.f.e(str, "key");
        AbstractC0082o lifecycle = getLifecycle();
        C0088v c0088v = (C0088v) lifecycle;
        if (c0088v.f1499c.compareTo(EnumC0081n.f1491d) >= 0) {
            throw new IllegalStateException(("LifecycleOwner " + this + " is attempting to register while current state is " + c0088v.f1499c + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        abstractC0102i.d(str);
        LinkedHashMap linkedHashMap = abstractC0102i.f1662c;
        C0099f c0099f = (C0099f) linkedHashMap.get(str);
        if (c0099f == null) {
            c0099f = new C0099f(lifecycle);
        }
        androidx.lifecycle.r rVar = new androidx.lifecycle.r() { // from class: c.d
            @Override // androidx.lifecycle.r
            public final void g(InterfaceC0086t interfaceC0086t, EnumC0080m enumC0080m) {
                AbstractC0102i abstractC0102i2 = AbstractC0102i.this;
                X0.f.e(abstractC0102i2, "this$0");
                String str2 = str;
                InterfaceC0095b interfaceC0095b2 = interfaceC0095b;
                X0.f.e(interfaceC0095b2, "$callback");
                AbstractC0104a abstractC0104a2 = abstractC0104a;
                X0.f.e(abstractC0104a2, "$contract");
                EnumC0080m enumC0080m2 = EnumC0080m.ON_START;
                LinkedHashMap linkedHashMap2 = abstractC0102i2.f1664e;
                if (enumC0080m2 != enumC0080m) {
                    if (EnumC0080m.ON_STOP == enumC0080m) {
                        linkedHashMap2.remove(str2);
                        return;
                    } else {
                        if (EnumC0080m.ON_DESTROY == enumC0080m) {
                            abstractC0102i2.e(str2);
                            return;
                        }
                        return;
                    }
                }
                linkedHashMap2.put(str2, new C0098e(abstractC0104a2, interfaceC0095b2));
                LinkedHashMap linkedHashMap3 = abstractC0102i2.f1665f;
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    interfaceC0095b2.a(obj);
                }
                Bundle bundle = abstractC0102i2.f1666g;
                C0094a c0094a = (C0094a) q1.d.E(bundle, str2);
                if (c0094a != null) {
                    bundle.remove(str2);
                    interfaceC0095b2.a(abstractC0104a2.c(c0094a.f1646b, c0094a.f1645a));
                }
            }
        };
        c0099f.f1653a.a(rVar);
        c0099f.f1654b.add(rVar);
        linkedHashMap.put(str, c0099f);
        return new C0101h(abstractC0102i, str, abstractC0104a, 0);
    }

    public void removeMenuProvider(InterfaceC0021q interfaceC0021q) {
        X0.f.e(interfaceC0021q, "provider");
        this.menuHostHelper.b(interfaceC0021q);
    }

    public final void removeOnConfigurationChangedListener(J.a aVar) {
        X0.f.e(aVar, "listener");
        this.onConfigurationChangedListeners.remove(aVar);
    }

    public final void removeOnContextAvailableListener(InterfaceC0090b interfaceC0090b) {
        X0.f.e(interfaceC0090b, "listener");
        C0089a c0089a = this.contextAwareHelper;
        c0089a.getClass();
        c0089a.f1631a.remove(interfaceC0090b);
    }

    public final void removeOnMultiWindowModeChangedListener(J.a aVar) {
        X0.f.e(aVar, "listener");
        this.onMultiWindowModeChangedListeners.remove(aVar);
    }

    public final void removeOnNewIntentListener(J.a aVar) {
        X0.f.e(aVar, "listener");
        this.onNewIntentListeners.remove(aVar);
    }

    public final void removeOnPictureInPictureModeChangedListener(J.a aVar) {
        X0.f.e(aVar, "listener");
        this.onPictureInPictureModeChangedListeners.remove(aVar);
    }

    public final void removeOnTrimMemoryListener(J.a aVar) {
        X0.f.e(aVar, "listener");
        this.onTrimMemoryListeners.remove(aVar);
    }

    public final void removeOnUserLeaveHintListener(Runnable runnable) {
        X0.f.e(runnable, "listener");
        this.onUserLeaveHintListeners.remove(runnable);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (q1.l.K()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            r fullyDrawnReporter = getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.f927a) {
                try {
                    fullyDrawnReporter.f928b = true;
                    Iterator it = fullyDrawnReporter.f929c.iterator();
                    while (it.hasNext()) {
                        ((W0.a) it.next()).a();
                    }
                    fullyDrawnReporter.f929c.clear();
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
    public abstract void setContentView(int i);

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        k kVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        X0.f.d(decorView, "window.decorView");
        l lVar = (l) kVar;
        lVar.getClass();
        if (!lVar.f916c) {
            lVar.f916c = true;
            decorView.getViewTreeObserver().addOnDrawListener(lVar);
        }
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        X0.f.e(intent, "intent");
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        X0.f.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        X0.f.e(intent, "intent");
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        X0.f.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z2, Configuration configuration) {
        X0.f.e(configuration, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z2, configuration);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<J.a> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().a(new z.k(z2));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z2, Configuration configuration) {
        X0.f.e(configuration, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z2, configuration);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<J.a> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().a(new z.n(z2));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    public void addMenuProvider(InterfaceC0021q interfaceC0021q, InterfaceC0086t interfaceC0086t) {
        X0.f.e(interfaceC0021q, "provider");
        X0.f.e(interfaceC0086t, "owner");
        C0019o c0019o = this.menuHostHelper;
        c0019o.f480b.add(interfaceC0021q);
        c0019o.f479a.run();
        AbstractC0082o lifecycle = interfaceC0086t.getLifecycle();
        HashMap hashMap = c0019o.f481c;
        C0018n c0018n = (C0018n) hashMap.remove(interfaceC0021q);
        if (c0018n != null) {
            c0018n.f473a.b(c0018n.f474b);
            c0018n.f474b = null;
        }
        hashMap.put(interfaceC0021q, new C0018n(lifecycle, new C0017m(c0019o, 0, interfaceC0021q)));
    }

    public void addMenuProvider(final InterfaceC0021q interfaceC0021q, InterfaceC0086t interfaceC0086t, final EnumC0081n enumC0081n) {
        X0.f.e(interfaceC0021q, "provider");
        X0.f.e(interfaceC0086t, "owner");
        X0.f.e(enumC0081n, "state");
        final C0019o c0019o = this.menuHostHelper;
        c0019o.getClass();
        AbstractC0082o lifecycle = interfaceC0086t.getLifecycle();
        HashMap hashMap = c0019o.f481c;
        C0018n c0018n = (C0018n) hashMap.remove(interfaceC0021q);
        if (c0018n != null) {
            c0018n.f473a.b(c0018n.f474b);
            c0018n.f474b = null;
        }
        hashMap.put(interfaceC0021q, new C0018n(lifecycle, new androidx.lifecycle.r() { // from class: K.l
            @Override // androidx.lifecycle.r
            public final void g(InterfaceC0086t interfaceC0086t2, EnumC0080m enumC0080m) {
                C0019o c0019o2 = C0019o.this;
                c0019o2.getClass();
                EnumC0080m.Companion.getClass();
                EnumC0081n enumC0081n2 = enumC0081n;
                X0.f.e(enumC0081n2, "state");
                int ordinal = enumC0081n2.ordinal();
                EnumC0080m enumC0080m2 = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : EnumC0080m.ON_RESUME : EnumC0080m.ON_START : EnumC0080m.ON_CREATE;
                Runnable runnable = c0019o2.f479a;
                CopyOnWriteArrayList copyOnWriteArrayList = c0019o2.f480b;
                InterfaceC0021q interfaceC0021q2 = interfaceC0021q;
                if (enumC0080m == enumC0080m2) {
                    copyOnWriteArrayList.add(interfaceC0021q2);
                    runnable.run();
                } else if (enumC0080m == EnumC0080m.ON_DESTROY) {
                    c0019o2.b(interfaceC0021q2);
                } else if (enumC0080m == C0078k.a(enumC0081n2)) {
                    copyOnWriteArrayList.remove(interfaceC0021q2);
                    runnable.run();
                }
            }
        }));
    }

    public final <I, O> AbstractC0096c registerForActivityResult(AbstractC0104a abstractC0104a, InterfaceC0095b interfaceC0095b) {
        X0.f.e(abstractC0104a, "contract");
        X0.f.e(interfaceC0095b, "callback");
        return registerForActivityResult(abstractC0104a, this.activityResultRegistry, interfaceC0095b);
    }
}
