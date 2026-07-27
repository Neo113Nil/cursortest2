package androidx.activity;

import E.C0035j;
import E.C0036k;
import E.InterfaceC0038m;
import a.AbstractC0169a;
import a0.C0175f;
import a0.C0176g;
import a0.InterfaceC0174e;
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
import androidx.lifecycle.AbstractC0245o;
import androidx.lifecycle.C0241k;
import androidx.lifecycle.C0252w;
import androidx.lifecycle.EnumC0243m;
import androidx.lifecycle.EnumC0244n;
import androidx.lifecycle.I;
import androidx.lifecycle.InterfaceC0238h;
import androidx.lifecycle.InterfaceC0249t;
import androidx.lifecycle.InterfaceC0250u;
import androidx.lifecycle.M;
import androidx.lifecycle.P;
import androidx.lifecycle.U;
import androidx.lifecycle.W;
import androidx.lifecycle.Y;
import androidx.lifecycle.Z;
import com.chickyneer.roadway.R;
import d.C0395a;
import e.AbstractC0402c;
import e.AbstractC0407h;
import e.C0403d;
import e.C0404e;
import e.C0406g;
import e.InterfaceC0401b;
import f.AbstractC0413a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import t4.InterfaceC1430a;
import u.AbstractActivityC1467h;
import u.C1459G;
import u.C1468i;
import w4.AbstractC1525d;

/* loaded from: classes.dex */
public abstract class l extends AbstractActivityC1467h implements Z, InterfaceC0238h, a0.h, u, v.g {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final AbstractC0407h mActivityResultRegistry;
    private int mContentLayoutId;
    private W mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;
    final m mFullyDrawnReporter;
    private final AtomicInteger mNextLocalRequestCode;
    private t mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<D.a> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<D.a> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<D.a> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<D.a> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<D.a> mOnTrimMemoryListeners;
    final j mReportFullyDrawnExecutor;
    final C0176g mSavedStateRegistryController;
    private Y mViewModelStore;
    final C0395a mContextAwareHelper = new C0395a();
    private final C0036k mMenuHostHelper = new C0036k(new B2.b(3, this));
    private final C0252w mLifecycleRegistry = new C0252w(this);

    public l() {
        C0176g c0176g = new C0176g(this);
        this.mSavedStateRegistryController = c0176g;
        this.mOnBackPressedDispatcher = null;
        k kVar = new k(this);
        this.mReportFullyDrawnExecutor = kVar;
        this.mFullyDrawnReporter = new m(kVar, new T4.m(3, this));
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new e(this);
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mDispatchingOnMultiWindowModeChanged = false;
        this.mDispatchingOnPictureInPictureModeChanged = false;
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().a(new f(this, 1));
        getLifecycle().a(new f(this, 0));
        getLifecycle().a(new f(this, 2));
        c0176g.a();
        M.e(this);
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new c(0, this));
        addOnContextAvailableListener(new d(this));
    }

    public static void a(l lVar) {
        Bundle a6 = lVar.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (a6 != null) {
            AbstractC0407h abstractC0407h = lVar.mActivityResultRegistry;
            abstractC0407h.getClass();
            ArrayList<Integer> integerArrayList = a6.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a6.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            abstractC0407h.f5510d = a6.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            Bundle bundle = a6.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            Bundle bundle2 = abstractC0407h.f5513g;
            bundle2.putAll(bundle);
            for (int i2 = 0; i2 < stringArrayList.size(); i2++) {
                String str = stringArrayList.get(i2);
                HashMap hashMap = abstractC0407h.f5508b;
                boolean containsKey = hashMap.containsKey(str);
                HashMap hashMap2 = abstractC0407h.f5507a;
                if (containsKey) {
                    Integer num = (Integer) hashMap.remove(str);
                    if (!bundle2.containsKey(str)) {
                        hashMap2.remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i2);
                num2.intValue();
                String str2 = stringArrayList.get(i2);
                hashMap2.put(num2, str2);
                hashMap.put(str2, num2);
            }
        }
    }

    public static Bundle b(l lVar) {
        Bundle bundle = new Bundle();
        AbstractC0407h abstractC0407h = lVar.mActivityResultRegistry;
        abstractC0407h.getClass();
        HashMap hashMap = abstractC0407h.f5508b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(hashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(hashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(abstractC0407h.f5510d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) abstractC0407h.f5513g.clone());
        return bundle;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.g(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    public void addMenuProvider(InterfaceC0038m interfaceC0038m) {
        C0036k c0036k = this.mMenuHostHelper;
        c0036k.f623b.add(interfaceC0038m);
        c0036k.f622a.run();
    }

    @Override // v.g
    public final void addOnConfigurationChangedListener(D.a aVar) {
        this.mOnConfigurationChangedListeners.add(aVar);
    }

    public final void addOnContextAvailableListener(d.b listener) {
        C0395a c0395a = this.mContextAwareHelper;
        c0395a.getClass();
        kotlin.jvm.internal.i.e(listener, "listener");
        if (c0395a.f5474b != null) {
            a(((d) listener).f4048a);
        }
        c0395a.f5473a.add(listener);
    }

    public final void addOnMultiWindowModeChangedListener(D.a aVar) {
        this.mOnMultiWindowModeChangedListeners.add(aVar);
    }

    public final void addOnNewIntentListener(D.a aVar) {
        this.mOnNewIntentListeners.add(aVar);
    }

    public final void addOnPictureInPictureModeChangedListener(D.a aVar) {
        this.mOnPictureInPictureModeChangedListeners.add(aVar);
    }

    public final void addOnTrimMemoryListener(D.a aVar) {
        this.mOnTrimMemoryListeners.add(aVar);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            i iVar = (i) getLastNonConfigurationInstance();
            if (iVar != null) {
                this.mViewModelStore = iVar.f4054b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new Y();
            }
        }
    }

    public final AbstractC0407h getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // androidx.lifecycle.InterfaceC0238h
    public S.b getDefaultViewModelCreationExtras() {
        S.c cVar = new S.c(S.a.f2735b);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = cVar.f2736a;
        if (application != null) {
            linkedHashMap.put(U.f4558a, getApplication());
        }
        linkedHashMap.put(M.f4540a, this);
        linkedHashMap.put(M.f4541b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(M.f4542c, getIntent().getExtras());
        }
        return cVar;
    }

    public W getDefaultViewModelProviderFactory() {
        if (this.mDefaultFactory == null) {
            this.mDefaultFactory = new P(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.mDefaultFactory;
    }

    public m getFullyDrawnReporter() {
        return this.mFullyDrawnReporter;
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        i iVar = (i) getLastNonConfigurationInstance();
        if (iVar != null) {
            return iVar.f4053a;
        }
        return null;
    }

    @Override // androidx.lifecycle.InterfaceC0250u
    public AbstractC0245o getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // androidx.activity.u
    public final t getOnBackPressedDispatcher() {
        if (this.mOnBackPressedDispatcher == null) {
            this.mOnBackPressedDispatcher = new t(new g(this));
            getLifecycle().a(new f(this, 3));
        }
        return this.mOnBackPressedDispatcher;
    }

    @Override // a0.h
    public final C0175f getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f3831b;
    }

    @Override // androidx.lifecycle.Z
    public Y getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        return this.mViewModelStore;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.i.e(decorView, "<this>");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        kotlin.jvm.internal.i.e(decorView2, "<this>");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        kotlin.jvm.internal.i.e(decorView3, "<this>");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        kotlin.jvm.internal.i.e(decorView4, "<this>");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        kotlin.jvm.internal.i.e(decorView5, "<this>");
        decorView5.setTag(R.id.report_drawn, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (this.mActivityResultRegistry.a(i2, i3, intent)) {
            return;
        }
        super.onActivityResult(i2, i3, intent);
    }

    @Override // android.app.Activity
    @Deprecated
    public void onBackPressed() {
        getOnBackPressedDispatcher().a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<D.a> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // u.AbstractActivityC1467h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.b(bundle);
        C0395a c0395a = this.mContextAwareHelper;
        c0395a.getClass();
        c0395a.f5474b = this;
        Iterator it = c0395a.f5473a.iterator();
        while (it.hasNext()) {
            a(((d) ((d.b) it.next())).f4048a);
        }
        super.onCreate(bundle);
        int i2 = I.f4529b;
        M.h(this);
        int i3 = this.mContentLayoutId;
        if (i3 != 0) {
            setContentView(i3);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i2, Menu menu) {
        if (i2 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i2, menu);
        C0036k c0036k = this.mMenuHostHelper;
        getMenuInflater();
        Iterator it = c0036k.f623b.iterator();
        while (it.hasNext()) {
            ((R.j) ((InterfaceC0038m) it.next())).f2596a.b();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 != 0) {
            return false;
        }
        Iterator it = this.mMenuHostHelper.f623b.iterator();
        while (it.hasNext()) {
            if (((R.j) ((InterfaceC0038m) it.next())).f2596a.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        if (this.mDispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<D.a> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new C1468i(z));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator<D.a> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i2, Menu menu) {
        Iterator it = this.mMenuHostHelper.f623b.iterator();
        while (it.hasNext()) {
            ((R.j) ((InterfaceC0038m) it.next())).f2596a.f();
        }
        super.onPanelClosed(i2, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.mDispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<D.a> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new C1459G(z));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i2, View view, Menu menu) {
        if (i2 != 0) {
            return true;
        }
        super.onPreparePanel(i2, view, menu);
        Iterator it = this.mMenuHostHelper.f623b.iterator();
        while (it.hasNext()) {
            ((R.j) ((InterfaceC0038m) it.next())).f2596a.h();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (this.mActivityResultRegistry.a(i2, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        i iVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        Y y5 = this.mViewModelStore;
        if (y5 == null && (iVar = (i) getLastNonConfigurationInstance()) != null) {
            y5 = iVar.f4054b;
        }
        if (y5 == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        i iVar2 = new i();
        iVar2.f4053a = onRetainCustomNonConfigurationInstance;
        iVar2.f4054b = y5;
        return iVar2;
    }

    @Override // u.AbstractActivityC1467h, android.app.Activity
    public void onSaveInstanceState(Bundle outBundle) {
        AbstractC0245o lifecycle = getLifecycle();
        if (lifecycle instanceof C0252w) {
            C0252w c0252w = (C0252w) lifecycle;
            EnumC0244n enumC0244n = EnumC0244n.f4578c;
            c0252w.d("setCurrentState");
            c0252w.f(enumC0244n);
        }
        super.onSaveInstanceState(outBundle);
        C0176g c0176g = this.mSavedStateRegistryController;
        c0176g.getClass();
        kotlin.jvm.internal.i.e(outBundle, "outBundle");
        C0175f c0175f = c0176g.f3831b;
        c0175f.getClass();
        Bundle bundle = new Bundle();
        Bundle bundle2 = c0175f.f3826c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        n.f fVar = c0175f.f3824a;
        fVar.getClass();
        n.d dVar = new n.d(fVar);
        fVar.f11275c.put(dVar, Boolean.FALSE);
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle.putBundle((String) entry.getKey(), ((InterfaceC0174e) entry.getValue()).a());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i2) {
        super.onTrimMemory(i2);
        Iterator<D.a> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i2));
        }
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.f5474b;
    }

    public final <I, O> AbstractC0402c registerForActivityResult(AbstractC0413a abstractC0413a, AbstractC0407h abstractC0407h, InterfaceC0401b interfaceC0401b) {
        int i2;
        HashMap hashMap;
        String str = "activity_rq#" + this.mNextLocalRequestCode.getAndIncrement();
        abstractC0407h.getClass();
        AbstractC0245o lifecycle = getLifecycle();
        C0252w c0252w = (C0252w) lifecycle;
        if (c0252w.f4592d.compareTo(EnumC0244n.f4579d) >= 0) {
            throw new IllegalStateException("LifecycleOwner " + this + " is attempting to register while current state is " + c0252w.f4592d + ". LifecycleOwners must call register before they are STARTED.");
        }
        HashMap hashMap2 = abstractC0407h.f5508b;
        if (((Integer) hashMap2.get(str)) == null) {
            AbstractC1525d.f12228a.getClass();
            int nextInt = AbstractC1525d.f12229b.a().nextInt(2147418112);
            while (true) {
                i2 = nextInt + 65536;
                hashMap = abstractC0407h.f5507a;
                if (!hashMap.containsKey(Integer.valueOf(i2))) {
                    break;
                }
                AbstractC1525d.f12228a.getClass();
                nextInt = AbstractC1525d.f12229b.a().nextInt(2147418112);
            }
            hashMap.put(Integer.valueOf(i2), str);
            hashMap2.put(str, Integer.valueOf(i2));
        }
        HashMap hashMap3 = abstractC0407h.f5509c;
        C0406g c0406g = (C0406g) hashMap3.get(str);
        if (c0406g == null) {
            c0406g = new C0406g(lifecycle);
        }
        C0403d c0403d = new C0403d(abstractC0407h, str, interfaceC0401b, abstractC0413a);
        c0406g.f5505a.a(c0403d);
        c0406g.f5506b.add(c0403d);
        hashMap3.put(str, c0406g);
        return new C0404e(abstractC0407h, str, abstractC0413a);
    }

    public void removeMenuProvider(InterfaceC0038m interfaceC0038m) {
        this.mMenuHostHelper.a(interfaceC0038m);
    }

    @Override // v.g
    public final void removeOnConfigurationChangedListener(D.a aVar) {
        this.mOnConfigurationChangedListeners.remove(aVar);
    }

    public final void removeOnContextAvailableListener(d.b listener) {
        C0395a c0395a = this.mContextAwareHelper;
        c0395a.getClass();
        kotlin.jvm.internal.i.e(listener, "listener");
        c0395a.f5473a.remove(listener);
    }

    public final void removeOnMultiWindowModeChangedListener(D.a aVar) {
        this.mOnMultiWindowModeChangedListeners.remove(aVar);
    }

    public final void removeOnNewIntentListener(D.a aVar) {
        this.mOnNewIntentListeners.remove(aVar);
    }

    public final void removeOnPictureInPictureModeChangedListener(D.a aVar) {
        this.mOnPictureInPictureModeChangedListeners.remove(aVar);
    }

    public final void removeOnTrimMemoryListener(D.a aVar) {
        this.mOnTrimMemoryListeners.remove(aVar);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (AbstractC0169a.x()) {
                Trace.beginSection(AbstractC0169a.I("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            m mVar = this.mFullyDrawnReporter;
            synchronized (mVar.f4059a) {
                try {
                    mVar.f4060b = true;
                    Iterator it = mVar.f4061c.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC1430a) it.next()).invoke();
                    }
                    mVar.f4061c.clear();
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
        this.mReportFullyDrawnExecutor.g(getWindow().getDecorView());
        super.setContentView(i2);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i2) {
        super.startActivityForResult(intent, i2);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i6, int i7) {
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i6, i7);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i2, Bundle bundle) {
        super.startActivityForResult(intent, i2, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i6, int i7, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i6, i7, bundle);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration newConfig) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, newConfig);
            this.mDispatchingOnMultiWindowModeChanged = false;
            Iterator<D.a> it = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                D.a next = it.next();
                kotlin.jvm.internal.i.e(newConfig, "newConfig");
                next.accept(new C1468i(z));
            }
        } catch (Throwable th) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration newConfig) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, newConfig);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            Iterator<D.a> it = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                D.a next = it.next();
                kotlin.jvm.internal.i.e(newConfig, "newConfig");
                next.accept(new C1459G(z));
            }
        } catch (Throwable th) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.g(getWindow().getDecorView());
        super.setContentView(view);
    }

    public void addMenuProvider(final InterfaceC0038m interfaceC0038m, InterfaceC0250u interfaceC0250u) {
        final C0036k c0036k = this.mMenuHostHelper;
        c0036k.f623b.add(interfaceC0038m);
        c0036k.f622a.run();
        AbstractC0245o lifecycle = interfaceC0250u.getLifecycle();
        HashMap hashMap = c0036k.f624c;
        C0035j c0035j = (C0035j) hashMap.remove(interfaceC0038m);
        if (c0035j != null) {
            c0035j.f620a.b(c0035j.f621b);
            c0035j.f621b = null;
        }
        hashMap.put(interfaceC0038m, new C0035j(lifecycle, new InterfaceC0249t() { // from class: E.i
            @Override // androidx.lifecycle.InterfaceC0249t
            public final void a(InterfaceC0250u interfaceC0250u2, EnumC0243m enumC0243m) {
                EnumC0243m enumC0243m2 = EnumC0243m.ON_DESTROY;
                C0036k c0036k2 = C0036k.this;
                if (enumC0243m == enumC0243m2) {
                    c0036k2.a(interfaceC0038m);
                } else {
                    c0036k2.getClass();
                }
            }
        }));
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.g(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    public void addMenuProvider(final InterfaceC0038m interfaceC0038m, InterfaceC0250u interfaceC0250u, final EnumC0244n enumC0244n) {
        final C0036k c0036k = this.mMenuHostHelper;
        c0036k.getClass();
        AbstractC0245o lifecycle = interfaceC0250u.getLifecycle();
        HashMap hashMap = c0036k.f624c;
        C0035j c0035j = (C0035j) hashMap.remove(interfaceC0038m);
        if (c0035j != null) {
            c0035j.f620a.b(c0035j.f621b);
            c0035j.f621b = null;
        }
        hashMap.put(interfaceC0038m, new C0035j(lifecycle, new InterfaceC0249t() { // from class: E.h
            @Override // androidx.lifecycle.InterfaceC0249t
            public final void a(InterfaceC0250u interfaceC0250u2, EnumC0243m enumC0243m) {
                C0036k c0036k2 = C0036k.this;
                c0036k2.getClass();
                EnumC0243m.Companion.getClass();
                EnumC0244n state = enumC0244n;
                kotlin.jvm.internal.i.e(state, "state");
                int ordinal = state.ordinal();
                EnumC0243m enumC0243m2 = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : EnumC0243m.ON_RESUME : EnumC0243m.ON_START : EnumC0243m.ON_CREATE;
                B2.b bVar = c0036k2.f622a;
                CopyOnWriteArrayList copyOnWriteArrayList = c0036k2.f623b;
                InterfaceC0038m interfaceC0038m2 = interfaceC0038m;
                if (enumC0243m == enumC0243m2) {
                    copyOnWriteArrayList.add(interfaceC0038m2);
                    bVar.run();
                } else if (enumC0243m == EnumC0243m.ON_DESTROY) {
                    c0036k2.a(interfaceC0038m2);
                } else if (enumC0243m == C0241k.a(state)) {
                    copyOnWriteArrayList.remove(interfaceC0038m2);
                    bVar.run();
                }
            }
        }));
    }

    public final <I, O> AbstractC0402c registerForActivityResult(AbstractC0413a abstractC0413a, InterfaceC0401b interfaceC0401b) {
        return registerForActivityResult(abstractC0413a, this.mActivityResultRegistry, interfaceC0401b);
    }
}
