package androidx.activity;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.j;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.IntentSenderRequest;
import androidx.core.app.AbstractC1278b;
import androidx.core.app.AbstractC1279c;
import androidx.core.view.C;
import androidx.core.view.InterfaceC1323x;
import androidx.lifecycle.AbstractC1346l;
import androidx.lifecycle.C1356w;
import androidx.lifecycle.H;
import androidx.lifecycle.InterfaceC1343i;
import androidx.lifecycle.InterfaceC1351q;
import androidx.lifecycle.InterfaceC1354u;
import androidx.lifecycle.N;
import androidx.lifecycle.Q;
import androidx.lifecycle.Y;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import b.C1365a;
import b.InterfaceC1366b;
import b0.AbstractC1367a;
import c.InterfaceC1375a;
import d.AbstractC2398a;
import h0.AbstractC2438g;
import h0.C2435d;
import h0.C2436e;
import h0.InterfaceC2437f;
import j0.AbstractC3182b;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class j extends androidx.core.app.h implements InterfaceC1354u, c0, InterfaceC1343i, InterfaceC2437f, y, c.d, androidx.core.content.b, androidx.core.content.c, androidx.core.app.w, androidx.core.app.x, InterfaceC1323x, u {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final c Companion = new c(null);
    private b0 _viewModelStore;
    private final c.c activityResultRegistry;
    private int contentLayoutId;
    private final W1.h defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final W1.h fullyDrawnReporter$delegate;
    private final AtomicInteger nextLocalRequestCode;
    private final W1.h onBackPressedDispatcher$delegate;
    private final CopyOnWriteArrayList<A.a> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<A.a> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<A.a> onNewIntentListeners;
    private final CopyOnWriteArrayList<A.a> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<A.a> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final e reportFullyDrawnExecutor;
    private final C2436e savedStateRegistryController;
    private final C1365a contextAwareHelper = new C1365a();
    private final androidx.core.view.A menuHostHelper = new androidx.core.view.A(new Runnable() { // from class: androidx.activity.d
        @Override // java.lang.Runnable
        public final void run() {
            j.p(j.this);
        }
    });

    public static final class a implements InterfaceC1351q {
        a() {
        }

        @Override // androidx.lifecycle.InterfaceC1351q
        public void onStateChanged(InterfaceC1354u source, AbstractC1346l.a event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            j.this.o();
            j.this.getLifecycle().removeObserver(this);
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f9852a = new b();

        private b() {
        }

        public final OnBackInvokedDispatcher a(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            Intrinsics.checkNotNullExpressionValue(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
            return onBackInvokedDispatcher;
        }
    }

    private static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private Object f9853a;

        /* renamed from: b, reason: collision with root package name */
        private b0 f9854b;

        public final Object a() {
            return this.f9853a;
        }

        public final b0 b() {
            return this.f9854b;
        }

        public final void c(Object obj) {
            this.f9853a = obj;
        }

        public final void d(b0 b0Var) {
            this.f9854b = b0Var;
        }
    }

    private interface e extends Executor {
        void m();

        void n(View view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class f implements e, ViewTreeObserver.OnDrawListener, Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final long f9855b = SystemClock.uptimeMillis() + 10000;

        /* renamed from: c, reason: collision with root package name */
        private Runnable f9856c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f9857d;

        public f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(f this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Runnable runnable = this$0.f9856c;
            if (runnable != null) {
                Intrinsics.checkNotNull(runnable);
                runnable.run();
                this$0.f9856c = null;
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.f9856c = runnable;
            View decorView = j.this.getWindow().getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
            if (!this.f9857d) {
                decorView.postOnAnimation(new Runnable() { // from class: androidx.activity.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.f.b(j.f.this);
                    }
                });
            } else if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // androidx.activity.j.e
        public void m() {
            j.this.getWindow().getDecorView().removeCallbacks(this);
            j.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // androidx.activity.j.e
        public void n(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (this.f9857d) {
                return;
            }
            this.f9857d = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.f9856c;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.f9855b) {
                    this.f9857d = false;
                    j.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.f9856c = null;
            if (j.this.getFullyDrawnReporter().c()) {
                this.f9857d = false;
                j.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    public static final class g extends c.c {
        g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void s(g this$0, int i4, AbstractC2398a.C0210a c0210a) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f(i4, c0210a.a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void t(g this$0, int i4, IntentSender.SendIntentException e4) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(e4, "$e");
            this$0.e(i4, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", e4));
        }

        @Override // c.c
        public void i(final int i4, AbstractC2398a contract, Object obj, AbstractC1279c abstractC1279c) {
            Bundle bundle;
            final int i5;
            Intrinsics.checkNotNullParameter(contract, "contract");
            j jVar = j.this;
            final AbstractC2398a.C0210a b4 = contract.b(jVar, obj);
            if (b4 != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.g.s(j.g.this, i4, b4);
                    }
                });
                return;
            }
            Intent a4 = contract.a(jVar, obj);
            if (a4.getExtras() != null) {
                Bundle extras = a4.getExtras();
                Intrinsics.checkNotNull(extras);
                if (extras.getClassLoader() == null) {
                    a4.setExtrasClassLoader(jVar.getClassLoader());
                }
            }
            if (a4.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundle = a4.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a4.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            } else {
                bundle = null;
            }
            Bundle bundle2 = bundle;
            if (Intrinsics.areEqual("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", a4.getAction())) {
                String[] stringArrayExtra = a4.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                AbstractC1278b.w(jVar, stringArrayExtra, i4);
                return;
            }
            if (!Intrinsics.areEqual("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", a4.getAction())) {
                AbstractC1278b.A(jVar, a4, i4, bundle2);
                return;
            }
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) a4.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                Intrinsics.checkNotNull(intentSenderRequest);
                i5 = i4;
                try {
                    AbstractC1278b.B(jVar, intentSenderRequest.f(), i5, intentSenderRequest.c(), intentSenderRequest.d(), intentSenderRequest.e(), 0, bundle2);
                } catch (IntentSender.SendIntentException e4) {
                    e = e4;
                    final IntentSender.SendIntentException sendIntentException = e;
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            j.g.t(j.g.this, i5, sendIntentException);
                        }
                    });
                }
            } catch (IntentSender.SendIntentException e5) {
                e = e5;
                i5 = i4;
            }
        }
    }

    static final class h extends kotlin.jvm.internal.s implements Function0 {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Q invoke() {
            Application application = j.this.getApplication();
            j jVar = j.this;
            return new Q(application, jVar, jVar.getIntent() != null ? j.this.getIntent().getExtras() : null);
        }
    }

    static final class i extends kotlin.jvm.internal.s implements Function0 {

        static final class a extends kotlin.jvm.internal.s implements Function0 {

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ j f9862i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j jVar) {
                super(0);
                this.f9862i = jVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m0invoke();
                return Unit.f41027a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m0invoke() {
                this.f9862i.reportFullyDrawn();
            }
        }

        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final t invoke() {
            return new t(j.this.reportFullyDrawnExecutor, new a(j.this));
        }
    }

    /* renamed from: androidx.activity.j$j, reason: collision with other inner class name */
    static final class C0075j extends kotlin.jvm.internal.s implements Function0 {
        C0075j() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(j this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            try {
                j.super.onBackPressed();
            } catch (IllegalStateException e4) {
                if (!Intrinsics.areEqual(e4.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e4;
                }
            } catch (NullPointerException e5) {
                if (!Intrinsics.areEqual(e5.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                    throw e5;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(j this$0, w dispatcher) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(dispatcher, "$dispatcher");
            this$0.l(dispatcher);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final w invoke() {
            final j jVar = j.this;
            final w wVar = new w(new Runnable() { // from class: androidx.activity.n
                @Override // java.lang.Runnable
                public final void run() {
                    j.C0075j.d(j.this);
                }
            });
            final j jVar2 = j.this;
            if (Build.VERSION.SDK_INT >= 33) {
                if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.o
                        @Override // java.lang.Runnable
                        public final void run() {
                            j.C0075j.e(j.this, wVar);
                        }
                    });
                    return wVar;
                }
                jVar2.l(wVar);
            }
            return wVar;
        }
    }

    public j() {
        C2436e a4 = C2436e.f36696d.a(this);
        this.savedStateRegistryController = a4;
        this.reportFullyDrawnExecutor = n();
        this.fullyDrawnReporter$delegate = W1.i.b(new i());
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new g();
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().addObserver(new InterfaceC1351q() { // from class: androidx.activity.e
            @Override // androidx.lifecycle.InterfaceC1351q
            public final void onStateChanged(InterfaceC1354u interfaceC1354u, AbstractC1346l.a aVar) {
                j.h(j.this, interfaceC1354u, aVar);
            }
        });
        getLifecycle().addObserver(new InterfaceC1351q() { // from class: androidx.activity.f
            @Override // androidx.lifecycle.InterfaceC1351q
            public final void onStateChanged(InterfaceC1354u interfaceC1354u, AbstractC1346l.a aVar) {
                j.i(j.this, interfaceC1354u, aVar);
            }
        });
        getLifecycle().addObserver(new a());
        a4.c();
        N.c(this);
        getSavedStateRegistry().h(ACTIVITY_RESULT_TAG, new C2435d.c() { // from class: androidx.activity.g
            @Override // h0.C2435d.c
            public final Bundle a() {
                Bundle j4;
                j4 = j.j(j.this);
                return j4;
            }
        });
        addOnContextAvailableListener(new InterfaceC1366b() { // from class: androidx.activity.h
            @Override // b.InterfaceC1366b
            public final void a(Context context) {
                j.k(j.this, context);
            }
        });
        this.defaultViewModelProviderFactory$delegate = W1.i.b(new h());
        this.onBackPressedDispatcher$delegate = W1.i.b(new C0075j());
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(j this$0, InterfaceC1354u interfaceC1354u, AbstractC1346l.a event) {
        Window window;
        View peekDecorView;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(interfaceC1354u, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event != AbstractC1346l.a.ON_STOP || (window = this$0.getWindow()) == null || (peekDecorView = window.peekDecorView()) == null) {
            return;
        }
        peekDecorView.cancelPendingInputEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(j this$0, InterfaceC1354u interfaceC1354u, AbstractC1346l.a event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(interfaceC1354u, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC1346l.a.ON_DESTROY) {
            this$0.contextAwareHelper.b();
            if (!this$0.isChangingConfigurations()) {
                this$0.getViewModelStore().a();
            }
            this$0.reportFullyDrawnExecutor.m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle j(j this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bundle bundle = new Bundle();
        this$0.activityResultRegistry.k(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(j this$0, Context it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Bundle b4 = this$0.getSavedStateRegistry().b(ACTIVITY_RESULT_TAG);
        if (b4 != null) {
            this$0.activityResultRegistry.j(b4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(final w wVar) {
        getLifecycle().addObserver(new InterfaceC1351q() { // from class: androidx.activity.i
            @Override // androidx.lifecycle.InterfaceC1351q
            public final void onStateChanged(InterfaceC1354u interfaceC1354u, AbstractC1346l.a aVar) {
                j.m(w.this, this, interfaceC1354u, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(w dispatcher, j this$0, InterfaceC1354u interfaceC1354u, AbstractC1346l.a event) {
        Intrinsics.checkNotNullParameter(dispatcher, "$dispatcher");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(interfaceC1354u, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC1346l.a.ON_CREATE) {
            dispatcher.o(b.f9852a.a(this$0));
        }
    }

    private final e n() {
        return new f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        if (this._viewModelStore == null) {
            d dVar = (d) getLastNonConfigurationInstance();
            if (dVar != null) {
                this._viewModelStore = dVar.b();
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new b0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(j this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.invalidateMenu();
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        eVar.n(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.core.view.InterfaceC1323x
    public void addMenuProvider(C provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.menuHostHelper.c(provider);
    }

    @Override // androidx.core.content.b
    public final void addOnConfigurationChangedListener(A.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onConfigurationChangedListeners.add(listener);
    }

    public final void addOnContextAvailableListener(InterfaceC1366b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.contextAwareHelper.a(listener);
    }

    @Override // androidx.core.app.w
    public final void addOnMultiWindowModeChangedListener(A.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    public final void addOnNewIntentListener(A.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onNewIntentListeners.add(listener);
    }

    @Override // androidx.core.app.x
    public final void addOnPictureInPictureModeChangedListener(A.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    @Override // androidx.core.content.c
    public final void addOnTrimMemoryListener(A.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onTrimMemoryListeners.add(listener);
    }

    public final void addOnUserLeaveHintListener(Runnable listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onUserLeaveHintListeners.add(listener);
    }

    @Override // c.d
    public final c.c getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // androidx.lifecycle.InterfaceC1343i
    public AbstractC1367a getDefaultViewModelCreationExtras() {
        b0.b bVar = new b0.b(null, 1, null);
        if (getApplication() != null) {
            AbstractC1367a.b bVar2 = Y.a.f12619h;
            Application application = getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "application");
            bVar.c(bVar2, application);
        }
        bVar.c(N.f12589a, this);
        bVar.c(N.f12590b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            bVar.c(N.f12591c, extras);
        }
        return bVar;
    }

    @Override // androidx.lifecycle.InterfaceC1343i
    public Y.b getDefaultViewModelProviderFactory() {
        return (Y.b) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    public t getFullyDrawnReporter() {
        return (t) this.fullyDrawnReporter$delegate.getValue();
    }

    public Object getLastCustomNonConfigurationInstance() {
        d dVar = (d) getLastNonConfigurationInstance();
        if (dVar != null) {
            return dVar.a();
        }
        return null;
    }

    @Override // androidx.core.app.h, androidx.lifecycle.InterfaceC1354u
    public AbstractC1346l getLifecycle() {
        return super.getLifecycle();
    }

    @Override // androidx.activity.y
    public final w getOnBackPressedDispatcher() {
        return (w) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // h0.InterfaceC2437f
    public final C2435d getSavedStateRegistry() {
        return this.savedStateRegistryController.b();
    }

    @Override // androidx.lifecycle.c0
    public b0 getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        o();
        b0 b0Var = this._viewModelStore;
        Intrinsics.checkNotNull(b0Var);
        return b0Var;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        d0.b(decorView, this);
        View decorView2 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "window.decorView");
        e0.a(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "window.decorView");
        AbstractC2438g.a(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView4, "window.decorView");
        B.b(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView5, "window.decorView");
        A.a(decorView5, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i4, int i5, Intent intent) {
        if (this.activityResultRegistry.e(i4, i5, intent)) {
            return;
        }
        super.onActivityResult(i4, i5, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        getOnBackPressedDispatcher().l();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator<A.a> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(newConfig);
        }
    }

    @Override // androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.savedStateRegistryController.d(bundle);
        this.contextAwareHelper.c(this);
        super.onCreate(bundle);
        H.f12575b.c(this);
        int i4 = this.contentLayoutId;
        if (i4 != 0) {
            setContentView(i4);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i4, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (i4 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i4, menu);
        this.menuHostHelper.f(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i4, MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (super.onMenuItemSelected(i4, item)) {
            return true;
        }
        if (i4 == 0) {
            return this.menuHostHelper.h(item);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z4) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<A.a> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new androidx.core.app.p(z4));
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        Iterator<A.a> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i4, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        this.menuHostHelper.g(menu);
        super.onPanelClosed(i4, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z4) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<A.a> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new androidx.core.app.z(z4));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i4, View view, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (i4 != 0) {
            return true;
        }
        super.onPreparePanel(i4, view, menu);
        this.menuHostHelper.i(menu);
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i4, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (this.activityResultRegistry.e(i4, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(i4, permissions, grantResults);
    }

    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        d dVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        b0 b0Var = this._viewModelStore;
        if (b0Var == null && (dVar = (d) getLastNonConfigurationInstance()) != null) {
            b0Var = dVar.b();
        }
        if (b0Var == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        d dVar2 = new d();
        dVar2.c(onRetainCustomNonConfigurationInstance);
        dVar2.d(b0Var);
        return dVar2;
    }

    @Override // androidx.core.app.h, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        if (getLifecycle() instanceof C1356w) {
            AbstractC1346l lifecycle = getLifecycle();
            Intrinsics.checkNotNull(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((C1356w) lifecycle).l(AbstractC1346l.b.CREATED);
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.e(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i4) {
        super.onTrimMemory(i4);
        Iterator<A.a> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i4));
        }
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.d();
    }

    public final <I, O> ActivityResultLauncher registerForActivityResult(AbstractC2398a contract, c.c registry, InterfaceC1375a callback) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return registry.l("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, contract, callback);
    }

    @Override // androidx.core.view.InterfaceC1323x
    public void removeMenuProvider(C provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.menuHostHelper.j(provider);
    }

    @Override // androidx.core.content.b
    public final void removeOnConfigurationChangedListener(A.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onConfigurationChangedListeners.remove(listener);
    }

    public final void removeOnContextAvailableListener(InterfaceC1366b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.contextAwareHelper.e(listener);
    }

    @Override // androidx.core.app.w
    public final void removeOnMultiWindowModeChangedListener(A.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    public final void removeOnNewIntentListener(A.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onNewIntentListeners.remove(listener);
    }

    @Override // androidx.core.app.x
    public final void removeOnPictureInPictureModeChangedListener(A.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    @Override // androidx.core.content.c
    public final void removeOnTrimMemoryListener(A.a listener) {
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
            if (AbstractC3182b.d()) {
                AbstractC3182b.a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            getFullyDrawnReporter().b();
            AbstractC3182b.b();
        } catch (Throwable th) {
            AbstractC3182b.b();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i4) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        eVar.n(decorView);
        super.setContentView(i4);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i4) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startActivityForResult(intent, i4);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int i4, Intent intent2, int i5, int i6, int i7) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startIntentSenderForResult(intent, i4, intent2, i5, i6, i7);
    }

    public void addMenuProvider(C provider, InterfaceC1354u owner) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.menuHostHelper.d(provider, owner);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i4, Bundle bundle) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startActivityForResult(intent, i4, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int i4, Intent intent2, int i5, int i6, int i7, Bundle bundle) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startIntentSenderForResult(intent, i4, intent2, i5, i6, i7, bundle);
    }

    public void addMenuProvider(C provider, InterfaceC1354u owner, AbstractC1346l.b state) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(state, "state");
        this.menuHostHelper.e(provider, owner, state);
    }

    public final <I, O> ActivityResultLauncher registerForActivityResult(AbstractC2398a contract, InterfaceC1375a callback) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return registerForActivityResult(contract, this.activityResultRegistry, callback);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z4, Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z4, newConfig);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<A.a> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new androidx.core.app.p(z4, newConfig));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z4, Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z4, newConfig);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<A.a> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new androidx.core.app.z(z4, newConfig));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        eVar.n(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        eVar.n(decorView);
        super.setContentView(view, layoutParams);
    }
}
