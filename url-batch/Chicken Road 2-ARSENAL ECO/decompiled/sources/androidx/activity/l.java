package androidx.activity;

import D.C0096i;
import D.C0097j;
import D.InterfaceC0099l;
import H1.RunnableC0139m;
import a.AbstractC0219a;
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
import androidx.lifecycle.AbstractC0248o;
import androidx.lifecycle.C0243j;
import androidx.lifecycle.C0255w;
import androidx.lifecycle.EnumC0246m;
import androidx.lifecycle.EnumC0247n;
import androidx.lifecycle.F;
import androidx.lifecycle.H;
import androidx.lifecycle.InterfaceC0241h;
import androidx.lifecycle.InterfaceC0252t;
import androidx.lifecycle.InterfaceC0253u;
import androidx.lifecycle.L;
import androidx.lifecycle.O;
import androidx.lifecycle.T;
import androidx.lifecycle.V;
import androidx.lifecycle.X;
import androidx.lifecycle.Y;
import com.onesignal.core.activities.PermissionsActivity;
import com.strategylink.Row.Five.R;
import d.C0312a;
import d.InterfaceC0313b;
import e.AbstractC0338c;
import e.AbstractC0342g;
import e.C0339d;
import e.C0341f;
import e.InterfaceC0337b;
import f.AbstractC0360a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import m.C0516d;
import m.C0518f;
import t.AbstractActivityC0648h;
import t.C0640G;
import x5.InterfaceC0732a;

/* loaded from: classes.dex */
public abstract class l extends AbstractActivityC0648h implements Y, InterfaceC0241h, T.h, t, u.g {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final AbstractC0342g mActivityResultRegistry;
    private int mContentLayoutId;
    private V mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;
    final m mFullyDrawnReporter;
    private final C0097j mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private s mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<C.a> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<C.a> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<C.a> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<C.a> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<C.a> mOnTrimMemoryListeners;
    final j mReportFullyDrawnExecutor;
    final T.g mSavedStateRegistryController;
    private X mViewModelStore;
    final C0312a mContextAwareHelper = new C0312a();
    private final C0255w mLifecycleRegistry = new C0255w(this);

    public l() {
        PermissionsActivity permissionsActivity = (PermissionsActivity) this;
        this.mMenuHostHelper = new C0097j(new RunnableC0139m(7, permissionsActivity));
        T.g gVar = new T.g(this);
        this.mSavedStateRegistryController = gVar;
        this.mOnBackPressedDispatcher = null;
        k kVar = new k(permissionsActivity);
        this.mReportFullyDrawnExecutor = kVar;
        this.mFullyDrawnReporter = new m(kVar, new X5.l(2, permissionsActivity));
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new e();
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
        getLifecycle().a(new f(permissionsActivity, 1));
        getLifecycle().a(new f(permissionsActivity, 0));
        getLifecycle().a(new f(permissionsActivity, 2));
        gVar.a();
        L.d(this);
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new c(0, permissionsActivity));
        addOnContextAvailableListener(new d(permissionsActivity));
    }

    public static void a(PermissionsActivity permissionsActivity) {
        Bundle a7 = permissionsActivity.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (a7 != null) {
            AbstractC0342g abstractC0342g = ((l) permissionsActivity).mActivityResultRegistry;
            HashMap hashMap = abstractC0342g.f3999b;
            HashMap hashMap2 = abstractC0342g.f3998a;
            Bundle bundle = abstractC0342g.f4004g;
            ArrayList<Integer> integerArrayList = a7.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a7.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            abstractC0342g.f4001d = a7.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            bundle.putAll(a7.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
            for (int i7 = 0; i7 < stringArrayList.size(); i7++) {
                String str = stringArrayList.get(i7);
                if (hashMap.containsKey(str)) {
                    Integer num = (Integer) hashMap.remove(str);
                    if (!bundle.containsKey(str)) {
                        hashMap2.remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i7);
                num2.intValue();
                String str2 = stringArrayList.get(i7);
                hashMap2.put(num2, str2);
                abstractC0342g.f3999b.put(str2, num2);
            }
        }
    }

    public static Bundle b(PermissionsActivity permissionsActivity) {
        Bundle bundle = new Bundle();
        AbstractC0342g abstractC0342g = ((l) permissionsActivity).mActivityResultRegistry;
        abstractC0342g.getClass();
        HashMap hashMap = abstractC0342g.f3999b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(hashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(hashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(abstractC0342g.f4001d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) abstractC0342g.f4004g.clone());
        return bundle;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.n(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    public void addMenuProvider(InterfaceC0099l interfaceC0099l) {
        C0097j c0097j = this.mMenuHostHelper;
        c0097j.f297b.add(interfaceC0099l);
        c0097j.f296a.run();
    }

    @Override // u.g
    public final void addOnConfigurationChangedListener(C.a aVar) {
        this.mOnConfigurationChangedListeners.add(aVar);
    }

    public final void addOnContextAvailableListener(InterfaceC0313b listener) {
        C0312a c0312a = this.mContextAwareHelper;
        c0312a.getClass();
        kotlin.jvm.internal.i.e(listener, "listener");
        if (c0312a.f3936b != null) {
            a(((d) listener).f3192a);
        }
        c0312a.f3935a.add(listener);
    }

    public final void addOnMultiWindowModeChangedListener(C.a aVar) {
        this.mOnMultiWindowModeChangedListeners.add(aVar);
    }

    public final void addOnNewIntentListener(C.a aVar) {
        this.mOnNewIntentListeners.add(aVar);
    }

    public final void addOnPictureInPictureModeChangedListener(C.a aVar) {
        this.mOnPictureInPictureModeChangedListeners.add(aVar);
    }

    public final void addOnTrimMemoryListener(C.a aVar) {
        this.mOnTrimMemoryListeners.add(aVar);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            i iVar = (i) getLastNonConfigurationInstance();
            if (iVar != null) {
                this.mViewModelStore = iVar.f3197b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new X();
            }
        }
    }

    public final AbstractC0342g getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // androidx.lifecycle.InterfaceC0241h
    public O.b getDefaultViewModelCreationExtras() {
        O.c cVar = new O.c(O.a.f1762b);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = cVar.f1763a;
        if (application != null) {
            linkedHashMap.put(T.f3493a, getApplication());
        }
        linkedHashMap.put(L.f3475a, this);
        linkedHashMap.put(L.f3476b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(L.f3477c, getIntent().getExtras());
        }
        return cVar;
    }

    public V getDefaultViewModelProviderFactory() {
        if (this.mDefaultFactory == null) {
            this.mDefaultFactory = new O(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
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
            return iVar.f3196a;
        }
        return null;
    }

    @Override // androidx.lifecycle.InterfaceC0253u
    public AbstractC0248o getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // androidx.activity.t
    public final s getOnBackPressedDispatcher() {
        if (this.mOnBackPressedDispatcher == null) {
            this.mOnBackPressedDispatcher = new s(new g(this));
            getLifecycle().a(new f(this, 3));
        }
        return this.mOnBackPressedDispatcher;
    }

    @Override // T.h
    public final T.f getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f2217b;
    }

    @Override // androidx.lifecycle.Y
    public X getViewModelStore() {
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
    public void onActivityResult(int i7, int i8, Intent intent) {
        if (this.mActivityResultRegistry.a(i7, i8, intent)) {
            return;
        }
        super.onActivityResult(i7, i8, intent);
    }

    @Override // android.app.Activity
    @Deprecated
    public void onBackPressed() {
        getOnBackPressedDispatcher().a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<C.a> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // t.AbstractActivityC0648h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.b(bundle);
        C0312a c0312a = this.mContextAwareHelper;
        c0312a.getClass();
        c0312a.f3936b = this;
        Iterator it = c0312a.f3935a.iterator();
        while (it.hasNext()) {
            a(((d) ((InterfaceC0313b) it.next())).f3192a);
        }
        super.onCreate(bundle);
        int i7 = H.f3464g;
        F.b(this);
        int i8 = this.mContentLayoutId;
        if (i8 != 0) {
            setContentView(i8);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i7, Menu menu) {
        if (i7 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i7, menu);
        C0097j c0097j = this.mMenuHostHelper;
        getMenuInflater();
        Iterator it = c0097j.f297b.iterator();
        while (it.hasNext()) {
            ((N.i) ((InterfaceC0099l) it.next())).f1666a.c();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        if (super.onMenuItemSelected(i7, menuItem)) {
            return true;
        }
        if (i7 != 0) {
            return false;
        }
        Iterator it = this.mMenuHostHelper.f297b.iterator();
        while (it.hasNext()) {
            if (((N.i) ((InterfaceC0099l) it.next())).f1666a.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z5) {
        if (this.mDispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<C.a> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new t.i(z5));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator<C.a> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i7, Menu menu) {
        Iterator it = this.mMenuHostHelper.f297b.iterator();
        while (it.hasNext()) {
            ((N.i) ((InterfaceC0099l) it.next())).f1666a.i();
        }
        super.onPanelClosed(i7, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z5) {
        if (this.mDispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<C.a> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new C0640G(z5));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i7, View view, Menu menu) {
        if (i7 != 0) {
            return true;
        }
        super.onPreparePanel(i7, view, menu);
        Iterator it = this.mMenuHostHelper.f297b.iterator();
        while (it.hasNext()) {
            ((N.i) ((InterfaceC0099l) it.next())).f1666a.l();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        if (this.mActivityResultRegistry.a(i7, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i7, strArr, iArr);
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        i iVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        X x6 = this.mViewModelStore;
        if (x6 == null && (iVar = (i) getLastNonConfigurationInstance()) != null) {
            x6 = iVar.f3197b;
        }
        if (x6 == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        i iVar2 = new i();
        iVar2.f3196a = onRetainCustomNonConfigurationInstance;
        iVar2.f3197b = x6;
        return iVar2;
    }

    @Override // t.AbstractActivityC0648h, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        AbstractC0248o lifecycle = getLifecycle();
        if (lifecycle instanceof C0255w) {
            C0255w c0255w = (C0255w) lifecycle;
            c0255w.d("setCurrentState");
            c0255w.f(EnumC0247n.f3513h);
        }
        super.onSaveInstanceState(bundle);
        T.f fVar = this.mSavedStateRegistryController.f2217b;
        fVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = fVar.f2212c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C0518f c0518f = fVar.f2210a;
        c0518f.getClass();
        C0516d c0516d = new C0516d(c0518f);
        c0518f.f5324h.put(c0516d, Boolean.FALSE);
        while (c0516d.hasNext()) {
            Map.Entry entry = (Map.Entry) c0516d.next();
            bundle2.putBundle((String) entry.getKey(), ((T.e) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i7) {
        super.onTrimMemory(i7);
        Iterator<C.a> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i7));
        }
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.f3936b;
    }

    public final <I, O> AbstractC0338c registerForActivityResult(AbstractC0360a abstractC0360a, AbstractC0342g abstractC0342g, InterfaceC0337b interfaceC0337b) {
        int i7;
        String str = "activity_rq#" + this.mNextLocalRequestCode.getAndIncrement();
        HashMap hashMap = abstractC0342g.f4000c;
        AbstractC0248o lifecycle = getLifecycle();
        C0255w c0255w = (C0255w) lifecycle;
        if (c0255w.f3527d.compareTo(EnumC0247n.f3514i) >= 0) {
            throw new IllegalStateException("LifecycleOwner " + this + " is attempting to register while current state is " + c0255w.f3527d + ". LifecycleOwners must call register before they are STARTED.");
        }
        HashMap hashMap2 = abstractC0342g.f3998a;
        HashMap hashMap3 = abstractC0342g.f3999b;
        if (((Integer) hashMap3.get(str)) == null) {
            int nextInt = A5.e.f57f.a().nextInt(2147418112);
            while (true) {
                i7 = nextInt + 65536;
                if (!hashMap2.containsKey(Integer.valueOf(i7))) {
                    break;
                }
                nextInt = A5.e.f57f.a().nextInt(2147418112);
            }
            hashMap2.put(Integer.valueOf(i7), str);
            hashMap3.put(str, Integer.valueOf(i7));
        }
        C0341f c0341f = (C0341f) hashMap.get(str);
        if (c0341f == null) {
            c0341f = new C0341f(lifecycle);
        }
        C0243j c0243j = new C0243j(abstractC0342g, str, abstractC0360a);
        c0341f.f3996a.a(c0243j);
        c0341f.f3997b.add(c0243j);
        hashMap.put(str, c0341f);
        return new C0339d();
    }

    public void removeMenuProvider(InterfaceC0099l interfaceC0099l) {
        this.mMenuHostHelper.a(interfaceC0099l);
    }

    @Override // u.g
    public final void removeOnConfigurationChangedListener(C.a aVar) {
        this.mOnConfigurationChangedListeners.remove(aVar);
    }

    public final void removeOnContextAvailableListener(InterfaceC0313b listener) {
        C0312a c0312a = this.mContextAwareHelper;
        c0312a.getClass();
        kotlin.jvm.internal.i.e(listener, "listener");
        c0312a.f3935a.remove(listener);
    }

    public final void removeOnMultiWindowModeChangedListener(C.a aVar) {
        this.mOnMultiWindowModeChangedListeners.remove(aVar);
    }

    public final void removeOnNewIntentListener(C.a aVar) {
        this.mOnNewIntentListeners.remove(aVar);
    }

    public final void removeOnPictureInPictureModeChangedListener(C.a aVar) {
        this.mOnPictureInPictureModeChangedListeners.remove(aVar);
    }

    public final void removeOnTrimMemoryListener(C.a aVar) {
        this.mOnTrimMemoryListeners.remove(aVar);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (AbstractC0219a.u()) {
                Trace.beginSection(AbstractC0219a.D("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            m mVar = this.mFullyDrawnReporter;
            synchronized (mVar.f3202a) {
                try {
                    mVar.f3203b = true;
                    ArrayList arrayList = mVar.f3204c;
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        ((InterfaceC0732a) obj).invoke();
                    }
                    mVar.f3204c.clear();
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
    public void setContentView(int i7) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.n(getWindow().getDecorView());
        super.setContentView(i7);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i7) {
        super.startActivityForResult(intent, i7);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i7, Intent intent, int i8, int i9, int i10) {
        super.startIntentSenderForResult(intentSender, i7, intent, i8, i9, i10);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i7, Bundle bundle) {
        super.startActivityForResult(intent, i7, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i7, Intent intent, int i8, int i9, int i10, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i7, intent, i8, i9, i10, bundle);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z5, Configuration newConfig) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z5, newConfig);
            this.mDispatchingOnMultiWindowModeChanged = false;
            Iterator<C.a> it = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                C.a next = it.next();
                kotlin.jvm.internal.i.e(newConfig, "newConfig");
                next.accept(new t.i(z5));
            }
        } catch (Throwable th) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z5, Configuration newConfig) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z5, newConfig);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            Iterator<C.a> it = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                C.a next = it.next();
                kotlin.jvm.internal.i.e(newConfig, "newConfig");
                next.accept(new C0640G(z5));
            }
        } catch (Throwable th) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.n(getWindow().getDecorView());
        super.setContentView(view);
    }

    public void addMenuProvider(final InterfaceC0099l interfaceC0099l, InterfaceC0253u interfaceC0253u) {
        final C0097j c0097j = this.mMenuHostHelper;
        c0097j.f297b.add(interfaceC0099l);
        c0097j.f296a.run();
        AbstractC0248o lifecycle = interfaceC0253u.getLifecycle();
        HashMap hashMap = c0097j.f298c;
        C0096i c0096i = (C0096i) hashMap.remove(interfaceC0099l);
        if (c0096i != null) {
            c0096i.f294a.b(c0096i.f295b);
            c0096i.f295b = null;
        }
        hashMap.put(interfaceC0099l, new C0096i(lifecycle, new InterfaceC0252t() { // from class: D.h
            @Override // androidx.lifecycle.InterfaceC0252t
            public final void a(InterfaceC0253u interfaceC0253u2, EnumC0246m enumC0246m) {
                EnumC0246m enumC0246m2 = EnumC0246m.ON_DESTROY;
                C0097j c0097j2 = C0097j.this;
                if (enumC0246m == enumC0246m2) {
                    c0097j2.a(interfaceC0099l);
                } else {
                    c0097j2.getClass();
                }
            }
        }));
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.n(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    public void addMenuProvider(final InterfaceC0099l interfaceC0099l, InterfaceC0253u interfaceC0253u, final EnumC0247n enumC0247n) {
        final C0097j c0097j = this.mMenuHostHelper;
        c0097j.getClass();
        AbstractC0248o lifecycle = interfaceC0253u.getLifecycle();
        HashMap hashMap = c0097j.f298c;
        C0096i c0096i = (C0096i) hashMap.remove(interfaceC0099l);
        if (c0096i != null) {
            c0096i.f294a.b(c0096i.f295b);
            c0096i.f295b = null;
        }
        hashMap.put(interfaceC0099l, new C0096i(lifecycle, new InterfaceC0252t() { // from class: D.g
            @Override // androidx.lifecycle.InterfaceC0252t
            public final void a(InterfaceC0253u interfaceC0253u2, EnumC0246m enumC0246m) {
                C0097j c0097j2 = C0097j.this;
                c0097j2.getClass();
                RunnableC0139m runnableC0139m = c0097j2.f296a;
                CopyOnWriteArrayList copyOnWriteArrayList = c0097j2.f297b;
                EnumC0246m.Companion.getClass();
                EnumC0247n state = enumC0247n;
                kotlin.jvm.internal.i.e(state, "state");
                int ordinal = state.ordinal();
                EnumC0246m enumC0246m2 = null;
                EnumC0246m enumC0246m3 = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : EnumC0246m.ON_RESUME : EnumC0246m.ON_START : EnumC0246m.ON_CREATE;
                InterfaceC0099l interfaceC0099l2 = interfaceC0099l;
                if (enumC0246m == enumC0246m3) {
                    copyOnWriteArrayList.add(interfaceC0099l2);
                    runnableC0139m.run();
                    return;
                }
                EnumC0246m enumC0246m4 = EnumC0246m.ON_DESTROY;
                if (enumC0246m == enumC0246m4) {
                    c0097j2.a(interfaceC0099l2);
                    return;
                }
                int ordinal2 = state.ordinal();
                if (ordinal2 == 2) {
                    enumC0246m2 = enumC0246m4;
                } else if (ordinal2 == 3) {
                    enumC0246m2 = EnumC0246m.ON_STOP;
                } else if (ordinal2 == 4) {
                    enumC0246m2 = EnumC0246m.ON_PAUSE;
                }
                if (enumC0246m == enumC0246m2) {
                    copyOnWriteArrayList.remove(interfaceC0099l2);
                    runnableC0139m.run();
                }
            }
        }));
    }

    public final <I, O> AbstractC0338c registerForActivityResult(AbstractC0360a abstractC0360a, InterfaceC0337b interfaceC0337b) {
        return registerForActivityResult(abstractC0360a, this.mActivityResultRegistry, interfaceC0337b);
    }
}
