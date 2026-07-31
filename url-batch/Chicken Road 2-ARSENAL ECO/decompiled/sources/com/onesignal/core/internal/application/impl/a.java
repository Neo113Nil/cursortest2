package com.onesignal.core.internal.application.impl;

import H1.RunnableC0134h;
import H1.RunnableC0139m;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ViewTreeObserver;
import com.onesignal.common.AndroidUtils;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import k5.v;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import u0.AbstractC0676f;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public final class a implements T1.f, Application.ActivityLifecycleCallbacks, ViewTreeObserver.OnGlobalLayoutListener {
    public static final C0012a Companion = new C0012a(null);
    private static volatile a sharedInstance;
    private Context _appContext;
    private Activity _current;
    private int activityReferences;
    private final b componentCallbacks;
    private boolean isActivityChangingConfigurations;
    private boolean lifecycleObserverInstalled;
    private boolean nextResumeIsFirstActivity;
    private final Set<Activity> startedActivities;
    private final com.onesignal.common.events.b activityLifecycleNotifier = new com.onesignal.common.events.b();
    private final com.onesignal.common.events.b applicationLifecycleNotifier = new com.onesignal.common.events.b();
    private final com.onesignal.common.events.b systemConditionNotifier = new com.onesignal.common.events.b();
    private T1.b entryState = T1.b.APP_CLOSE;

    /* renamed from: com.onesignal.core.internal.application.impl.a$a, reason: collision with other inner class name */
    public static final class C0012a {
        public /* synthetic */ C0012a(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final a getInstance() {
            a aVar;
            a aVar2 = a.sharedInstance;
            if (aVar2 != null) {
                return aVar2;
            }
            synchronized (this) {
                aVar = a.sharedInstance;
                if (aVar == null) {
                    aVar = new a();
                    a.sharedInstance = aVar;
                }
            }
            return aVar;
        }

        public final a getInstanceOrNull() {
            return a.sharedInstance;
        }

        private C0012a() {
        }
    }

    public static final class b implements ComponentCallbacks {
        public b() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration newConfig) {
            kotlin.jvm.internal.i.e(newConfig, "newConfig");
            if (a.this.getCurrent() != null) {
                AndroidUtils androidUtils = AndroidUtils.INSTANCE;
                Activity current = a.this.getCurrent();
                kotlin.jvm.internal.i.b(current);
                if (androidUtils.hasConfigChangeFlag(current, 128)) {
                    a aVar = a.this;
                    int i7 = newConfig.orientation;
                    Activity current2 = aVar.getCurrent();
                    kotlin.jvm.internal.i.b(current2);
                    aVar.onOrientationChanged(i7, current2);
                }
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }
    }

    public static final class c extends kotlin.jvm.internal.j implements InterfaceC0743l {
        final /* synthetic */ Activity $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Activity activity) {
            super(1);
            this.$value = activity;
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((T1.d) obj);
            return v.f5219a;
        }

        public final void invoke(T1.d it) {
            kotlin.jvm.internal.i.e(it, "it");
            it.onActivityAvailable(this.$value);
        }
    }

    public static final class d extends T1.a {
        final /* synthetic */ Runnable $runnable;
        final /* synthetic */ a this$0;

        public d(Runnable runnable, a aVar) {
            this.$runnable = runnable;
            this.this$0 = aVar;
        }

        @Override // T1.a, T1.d
        public void onActivityAvailable(Activity currentActivity) {
            kotlin.jvm.internal.i.e(currentActivity, "currentActivity");
            a.this.removeActivityLifecycleHandler(this);
            if (AndroidUtils.INSTANCE.isActivityFullyReady(currentActivity)) {
                this.$runnable.run();
            } else {
                this.this$0.decorViewReady(currentActivity, this.$runnable);
            }
        }
    }

    public static final class e extends kotlin.jvm.internal.j implements InterfaceC0743l {
        public static final e INSTANCE = new e();

        public e() {
            super(1);
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((T1.e) obj);
            return v.f5219a;
        }

        public final void invoke(T1.e it) {
            kotlin.jvm.internal.i.e(it, "it");
            it.onFocus(false);
        }
    }

    public static final class f extends kotlin.jvm.internal.j implements InterfaceC0743l {
        public static final f INSTANCE = new f();

        public f() {
            super(1);
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((T1.e) obj);
            return v.f5219a;
        }

        public final void invoke(T1.e it) {
            kotlin.jvm.internal.i.e(it, "it");
            it.onUnfocused();
        }
    }

    public static final class g extends kotlin.jvm.internal.j implements InterfaceC0743l {
        final /* synthetic */ Activity $activity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Activity activity) {
            super(1);
            this.$activity = activity;
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((T1.d) obj);
            return v.f5219a;
        }

        public final void invoke(T1.d it) {
            kotlin.jvm.internal.i.e(it, "it");
            it.onActivityStopped(this.$activity);
        }
    }

    public static final class h extends kotlin.jvm.internal.j implements InterfaceC0743l {
        public static final h INSTANCE = new h();

        public h() {
            super(1);
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.core.internal.application.impl.b) obj);
            return v.f5219a;
        }

        public final void invoke(com.onesignal.core.internal.application.impl.b it) {
            kotlin.jvm.internal.i.e(it, "it");
            it.systemConditionChanged();
        }
    }

    public static final class i extends kotlin.jvm.internal.j implements InterfaceC0743l {
        final /* synthetic */ Activity $activity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Activity activity) {
            super(1);
            this.$activity = activity;
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((T1.d) obj);
            return v.f5219a;
        }

        public final void invoke(T1.d it) {
            kotlin.jvm.internal.i.e(it, "it");
            it.onActivityStopped(this.$activity);
        }
    }

    public static final class j extends kotlin.jvm.internal.j implements InterfaceC0743l {
        final /* synthetic */ Activity $activity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Activity activity) {
            super(1);
            this.$activity = activity;
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((T1.d) obj);
            return v.f5219a;
        }

        public final void invoke(T1.d it) {
            kotlin.jvm.internal.i.e(it, "it");
            it.onActivityAvailable(this.$activity);
        }
    }

    public static final class k extends AbstractC0607c {
        int label;
        /* synthetic */ Object result;

        public k(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.waitUntilActivityReady(this);
        }
    }

    public static final class l extends AbstractC0607c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public l(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.waitUntilSystemConditionsAvailable(this);
        }
    }

    public static final class m implements com.onesignal.core.internal.application.impl.b {
        final /* synthetic */ com.onesignal.common.threading.c $waiter;

        public m(com.onesignal.common.threading.c cVar) {
            this.$waiter = cVar;
        }

        @Override // com.onesignal.core.internal.application.impl.b
        public void systemConditionChanged() {
            if (com.onesignal.common.c.INSTANCE.isKeyboardUp(new WeakReference<>(a.this.getCurrent()))) {
                return;
            }
            this.$waiter.wake();
        }
    }

    public a() {
        Set<Activity> synchronizedSet = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        kotlin.jvm.internal.i.d(synchronizedSet, "synchronizedSet(...)");
        this.startedActivities = synchronizedSet;
        this.componentCallbacks = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void decorViewReady$lambda$1(a self, Runnable runnable, a this$0) {
        kotlin.jvm.internal.i.e(self, "$self");
        kotlin.jvm.internal.i.e(runnable, "$runnable");
        kotlin.jvm.internal.i.e(this$0, "this$0");
        self.addActivityLifecycleHandler(self.new d(runnable, this$0));
    }

    private final void decrementStartedActivity(Activity activity, boolean z5) {
        if (this.startedActivities.remove(activity)) {
            int i7 = this.activityReferences - 1;
            this.activityReferences = i7;
            if (i7 <= 0) {
                this.activityReferences = 0;
                if (z5 && getCurrent() == null) {
                    resetStaleNotificationEntryIfBackgrounded(z5);
                    return;
                } else {
                    setCurrent(null);
                    handleLostFocus();
                    return;
                }
            }
        }
        resetStaleNotificationEntryIfBackgrounded(z5);
    }

    private final boolean getWasInBackground() {
        return !isInForeground() || this.nextResumeIsFirstActivity;
    }

    private final void handleFocus() {
        if (!getWasInBackground()) {
            com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.handleFocus: application never lost focus", null, 2, null);
            return;
        }
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.handleFocus: application is now in focus, nextResumeIsFirstActivity=" + this.nextResumeIsFirstActivity, null, 2, null);
        this.nextResumeIsFirstActivity = false;
        if (getEntryState() != T1.b.NOTIFICATION_CLICK) {
            setEntryState(T1.b.APP_OPEN);
        }
        this.applicationLifecycleNotifier.fire(e.INSTANCE);
    }

    private final void handleLostFocus() {
        if (!isInForeground()) {
            com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.handleLostFocus: application already out of focus", null, 2, null);
            return;
        }
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.handleLostFocus: application is now out of focus", null, 2, null);
        setEntryState(T1.b.APP_CLOSE);
        this.applicationLifecycleNotifier.fire(f.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onOrientationChanged(int i7, Activity activity) {
        if (i7 == 1) {
            com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.onOrientationChanged: Configuration Orientation Change: PORTRAIT (" + i7 + ") on activity: " + activity, null, 2, null);
        } else if (i7 == 2) {
            com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.onOrientationChanged: Configuration Orientation Change: LANDSCAPE (" + i7 + ") on activity: " + activity, null, 2, null);
        }
        handleLostFocus();
        this.activityLifecycleNotifier.fire(new i(activity));
        this.activityLifecycleNotifier.fire(new j(activity));
        activity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this);
        handleFocus();
    }

    private final void resetStaleNotificationEntryIfBackgrounded(boolean z5) {
        if (z5 && getCurrent() == null && getEntryState() == T1.b.NOTIFICATION_CLICK) {
            setEntryState(T1.b.APP_CLOSE);
        }
    }

    private final void seedFocusFromInitContext(Context context) {
        boolean z5 = context instanceof Activity;
        boolean z6 = getCurrent() == null;
        if (z6 && !z5) {
            this.nextResumeIsFirstActivity = true;
            setEntryState(T1.b.APP_CLOSE);
            return;
        }
        setEntryState(T1.b.APP_OPEN);
        if (z6 && z5) {
            kotlin.jvm.internal.i.c(context, "null cannot be cast to non-null type android.app.Activity");
            Activity activity = (Activity) context;
            setCurrent(activity);
            this.startedActivities.add(activity);
            this.activityReferences = 1;
            this.nextResumeIsFirstActivity = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void waitUntilActivityReady$lambda$0(com.onesignal.common.threading.c waiter) {
        kotlin.jvm.internal.i.e(waiter, "$waiter");
        waiter.wake();
    }

    @Override // T1.f
    public void addActivityLifecycleHandler(T1.d handler) {
        kotlin.jvm.internal.i.e(handler, "handler");
        this.activityLifecycleNotifier.subscribe(handler);
        if (getCurrent() != null) {
            Activity current = getCurrent();
            kotlin.jvm.internal.i.b(current);
            handler.onActivityAvailable(current);
        }
    }

    @Override // T1.f
    public void addApplicationLifecycleHandler(T1.e handler) {
        kotlin.jvm.internal.i.e(handler, "handler");
        this.applicationLifecycleNotifier.subscribe(handler);
        if (getCurrent() != null) {
            handler.onFocus(true);
        }
    }

    public final void attachToApplication(Application application) {
        kotlin.jvm.internal.i.e(application, "application");
        if (this.lifecycleObserverInstalled) {
            return;
        }
        this.lifecycleObserverInstalled = true;
        if (this._appContext == null) {
            this._appContext = application;
        }
        application.registerActivityLifecycleCallbacks(this);
        application.registerComponentCallbacks(this.componentCallbacks);
    }

    public final void decorViewReady(Activity activity, Runnable runnable) {
        kotlin.jvm.internal.i.e(activity, "activity");
        kotlin.jvm.internal.i.e(runnable, "runnable");
        runnable.toString();
        activity.getWindow().getDecorView().post(new RunnableC0134h(this, runnable, this, 4));
    }

    @Override // T1.f
    public Context getAppContext() {
        Context context = this._appContext;
        kotlin.jvm.internal.i.b(context);
        return context;
    }

    @Override // T1.f
    public Activity getCurrent() {
        return this._current;
    }

    @Override // T1.f
    public T1.b getEntryState() {
        return this.entryState;
    }

    @Override // T1.f
    public boolean isInForeground() {
        return getEntryState().isAppOpen() || getEntryState().isNotificationClick();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.i.e(activity, "activity");
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.onActivityCreated(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.onActivityDestroyed(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.onActivityPaused(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.onActivityResumed(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
        if (activity instanceof T1.g) {
            return;
        }
        if (!kotlin.jvm.internal.i.a(getCurrent(), activity)) {
            setCurrent(activity);
        }
        if (!getWasInBackground() || this.isActivityChangingConfigurations) {
            return;
        }
        this.startedActivities.clear();
        this.startedActivities.add(activity);
        this.activityReferences = 1;
        handleFocus();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity p02, Bundle p12) {
        kotlin.jvm.internal.i.e(p02, "p0");
        kotlin.jvm.internal.i.e(p12, "p1");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.onActivityStarted(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
        if (kotlin.jvm.internal.i.a(getCurrent(), activity) && this.startedActivities.contains(activity)) {
            return;
        }
        boolean z5 = activity instanceof T1.g;
        boolean z6 = this.isActivityChangingConfigurations;
        if (!z5 && getCurrent() == null && !z6) {
            this.nextResumeIsFirstActivity = true;
        }
        if (!z5 && !kotlin.jvm.internal.i.a(getCurrent(), activity)) {
            setCurrent(activity);
        }
        boolean add = this.startedActivities.add(activity);
        if (!z5 && getWasInBackground() && !this.isActivityChangingConfigurations) {
            this.startedActivities.clear();
            this.startedActivities.add(activity);
            this.activityReferences = 1;
            handleFocus();
            return;
        }
        if (!z5 && z6) {
            this.isActivityChangingConfigurations = false;
        } else if (add) {
            this.activityReferences++;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.onActivityStopped(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
        boolean z5 = activity instanceof T1.g;
        if (!z5) {
            this.isActivityChangingConfigurations = activity.isChangingConfigurations();
        }
        if (z5 || !this.isActivityChangingConfigurations) {
            decrementStartedActivity(activity, z5);
        }
        this.activityLifecycleNotifier.fire(new g(activity));
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.systemConditionNotifier.fire(h.INSTANCE);
    }

    @Override // T1.f
    public void removeActivityLifecycleHandler(T1.d handler) {
        kotlin.jvm.internal.i.e(handler, "handler");
        this.activityLifecycleNotifier.unsubscribe(handler);
    }

    @Override // T1.f
    public void removeApplicationLifecycleHandler(T1.e handler) {
        kotlin.jvm.internal.i.e(handler, "handler");
        this.applicationLifecycleNotifier.unsubscribe(handler);
    }

    public void setCurrent(Activity activity) {
        this._current = activity;
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService: current activity=" + getCurrent(), null, 2, null);
        if (activity != null) {
            this.activityLifecycleNotifier.fire(new c(activity));
            try {
                activity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this);
            } catch (RuntimeException e4) {
                e4.printStackTrace();
            }
        }
    }

    @Override // T1.f
    public void setEntryState(T1.b bVar) {
        kotlin.jvm.internal.i.e(bVar, "<set-?>");
        this.entryState = bVar;
    }

    public final void start(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        boolean z5 = this.lifecycleObserverInstalled;
        this._appContext = context;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.i.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
        attachToApplication((Application) applicationContext);
        if (!z5) {
            seedFocusFromInitContext(context);
        }
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.init: entryState=" + getEntryState(), null, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // T1.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object waitUntilActivityReady(InterfaceC0564d interfaceC0564d) {
        k kVar;
        int i7;
        if (interfaceC0564d instanceof k) {
            kVar = (k) interfaceC0564d;
            int i8 = kVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                kVar.label = i8 - Integer.MIN_VALUE;
                Object obj = kVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = kVar.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    Activity current = getCurrent();
                    if (current == null) {
                        return Boolean.FALSE;
                    }
                    com.onesignal.common.threading.c cVar = new com.onesignal.common.threading.c();
                    decorViewReady(current, new RunnableC0139m(10, cVar));
                    kVar.label = 1;
                    if (cVar.waitForWake(kVar) == enumC0580a) {
                        return enumC0580a;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0676f.w(obj);
                }
                return Boolean.TRUE;
            }
        }
        kVar = new k(interfaceC0564d);
        Object obj2 = kVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = kVar.label;
        if (i7 != 0) {
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x009d, code lost:
    
        if (H5.AbstractC0165z.d(100, r0) == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x009d -> B:32:0x006b). Please report as a decompilation issue!!! */
    @Override // T1.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object waitUntilSystemConditionsAvailable(InterfaceC0564d interfaceC0564d) {
        l lVar;
        int i7;
        Activity current;
        int i8;
        a aVar;
        l lVar2;
        a aVar2;
        m mVar;
        m mVar2;
        if (interfaceC0564d instanceof l) {
            lVar = (l) interfaceC0564d;
            int i9 = lVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                lVar.label = i9 - Integer.MIN_VALUE;
                Object obj = lVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = lVar.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    current = getCurrent();
                    i8 = AndroidUtils.INSTANCE.isRunningOnMainThread() ? 50 : 0;
                    aVar = this;
                    if (current != null) {
                    }
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mVar2 = (m) lVar.L$1;
                            aVar2 = (a) lVar.L$0;
                            AbstractC0676f.w(obj);
                            mVar = mVar2;
                            aVar2.systemConditionNotifier.unsubscribe(mVar);
                            return Boolean.TRUE;
                        }
                        current = (Activity) lVar.L$1;
                        a aVar3 = (a) lVar.L$0;
                        try {
                            AbstractC0676f.w(obj);
                        } catch (NoClassDefFoundError e4) {
                            com.onesignal.debug.internal.logging.b.info$default("ApplicationService.waitUntilSystemConditionsAvailable: AppCompatActivity is not used in this app, skipping 'isDialogFragmentShowing' check: " + e4, null, 2, null);
                        }
                        lVar2 = lVar;
                        aVar2 = aVar3;
                        com.onesignal.common.threading.c cVar = new com.onesignal.common.threading.c();
                        mVar = aVar2.new m(cVar);
                        aVar2.systemConditionNotifier.subscribe(mVar);
                        if (com.onesignal.common.c.INSTANCE.isKeyboardUp(new WeakReference<>(current))) {
                            com.onesignal.debug.internal.logging.b.warn$default("ApplicationService.waitUntilSystemConditionsAvailable: keyboard up detected", null, 2, null);
                            lVar2.L$0 = aVar2;
                            lVar2.L$1 = mVar;
                            lVar2.label = 3;
                            if (cVar.waitForWake(lVar2) != enumC0580a) {
                                mVar2 = mVar;
                                mVar = mVar2;
                            }
                            return enumC0580a;
                        }
                        aVar2.systemConditionNotifier.unsubscribe(mVar);
                        return Boolean.TRUE;
                    }
                    int i10 = lVar.I$0;
                    aVar = (a) lVar.L$0;
                    AbstractC0676f.w(obj);
                    i8 = i10;
                    current = aVar.getCurrent();
                    if (current != null) {
                        lVar2 = lVar;
                        aVar2 = aVar;
                        com.onesignal.common.threading.c cVar2 = new com.onesignal.common.threading.c();
                        mVar = aVar2.new m(cVar2);
                        aVar2.systemConditionNotifier.subscribe(mVar);
                        if (com.onesignal.common.c.INSTANCE.isKeyboardUp(new WeakReference<>(current))) {
                        }
                        aVar2.systemConditionNotifier.unsubscribe(mVar);
                        return Boolean.TRUE;
                    }
                    i10 = i8 + 1;
                    if (i10 > 50) {
                        com.onesignal.debug.internal.logging.b.warn$default("ApplicationService.waitUntilSystemConditionsAvailable: current is null", null, 2, null);
                        return Boolean.FALSE;
                    }
                    lVar.L$0 = aVar;
                    lVar.I$0 = i10;
                    lVar.label = 1;
                }
            }
        }
        lVar = new l(interfaceC0564d);
        Object obj2 = lVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = lVar.label;
        if (i7 != 0) {
        }
    }
}
