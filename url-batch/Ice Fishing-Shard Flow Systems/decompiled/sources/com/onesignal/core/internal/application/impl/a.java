package com.onesignal.core.internal.application.impl;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ViewTreeObserver;
import androidx.fragment.app.ComponentCallbacksC0228t;
import androidx.fragment.app.Q;
import com.onesignal.common.AndroidUtils;
import i.AbstractActivityC0525l;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import v2.C0971a;

/* loaded from: classes.dex */
public final class a implements v2.f, Application.ActivityLifecycleCallbacks, ViewTreeObserver.OnGlobalLayoutListener {
    public static final C0011a Companion = new C0011a(null);
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
    private v2.b entryState = v2.b.APP_CLOSE;

    /* renamed from: com.onesignal.core.internal.application.impl.a$a, reason: collision with other inner class name */
    public static final class C0011a {
        public /* synthetic */ C0011a(DefaultConstructorMarker defaultConstructorMarker) {
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

        private C0011a() {
        }
    }

    public static final class b implements ComponentCallbacks {
        public b() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration newConfig) {
            Intrinsics.checkNotNullParameter(newConfig, "newConfig");
            if (a.this.getCurrent() != null) {
                AndroidUtils androidUtils = AndroidUtils.INSTANCE;
                Activity current = a.this.getCurrent();
                Intrinsics.b(current);
                if (androidUtils.hasConfigChangeFlag(current, 128)) {
                    a aVar = a.this;
                    int i2 = newConfig.orientation;
                    Activity current2 = aVar.getCurrent();
                    Intrinsics.b(current2);
                    aVar.onOrientationChanged(i2, current2);
                }
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }
    }

    public static final class c extends p implements Function1 {
        final /* synthetic */ Activity $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Activity activity) {
            super(1);
            this.$value = activity;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((v2.d) obj);
            return Unit.f6114a;
        }

        public final void invoke(v2.d it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onActivityAvailable(this.$value);
        }
    }

    public static final class d extends C0971a {
        final /* synthetic */ Runnable $runnable;
        final /* synthetic */ a this$0;

        public d(Runnable runnable, a aVar) {
            this.$runnable = runnable;
            this.this$0 = aVar;
        }

        @Override // v2.C0971a, v2.d
        public void onActivityAvailable(Activity currentActivity) {
            Intrinsics.checkNotNullParameter(currentActivity, "currentActivity");
            a.this.removeActivityLifecycleHandler(this);
            if (AndroidUtils.INSTANCE.isActivityFullyReady(currentActivity)) {
                this.$runnable.run();
            } else {
                this.this$0.decorViewReady(currentActivity, this.$runnable);
            }
        }
    }

    public static final class e extends p implements Function1 {
        public static final e INSTANCE = new e();

        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((v2.e) obj);
            return Unit.f6114a;
        }

        public final void invoke(v2.e it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onFocus(false);
        }
    }

    public static final class f extends p implements Function1 {
        public static final f INSTANCE = new f();

        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((v2.e) obj);
            return Unit.f6114a;
        }

        public final void invoke(v2.e it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onUnfocused();
        }
    }

    public static final class g extends p implements Function1 {
        final /* synthetic */ Activity $activity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Activity activity) {
            super(1);
            this.$activity = activity;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((v2.d) obj);
            return Unit.f6114a;
        }

        public final void invoke(v2.d it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onActivityStopped(this.$activity);
        }
    }

    public static final class h extends p implements Function1 {
        public static final h INSTANCE = new h();

        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.core.internal.application.impl.b) obj);
            return Unit.f6114a;
        }

        public final void invoke(com.onesignal.core.internal.application.impl.b it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.systemConditionChanged();
        }
    }

    public static final class i extends p implements Function1 {
        final /* synthetic */ Activity $activity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Activity activity) {
            super(1);
            this.$activity = activity;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((v2.d) obj);
            return Unit.f6114a;
        }

        public final void invoke(v2.d it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onActivityStopped(this.$activity);
        }
    }

    public static final class j extends p implements Function1 {
        final /* synthetic */ Activity $activity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Activity activity) {
            super(1);
            this.$activity = activity;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((v2.d) obj);
            return Unit.f6114a;
        }

        public final void invoke(v2.d it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onActivityAvailable(this.$activity);
        }
    }

    public static final class k extends X5.c {
        int label;
        /* synthetic */ Object result;

        public k(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.waitUntilActivityReady(this);
        }
    }

    public static final class l extends X5.c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public l(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.waitUntilSystemConditionsAvailable(this);
        }
    }

    public static final class m implements com.onesignal.core.internal.application.impl.b {
        final /* synthetic */ com.onesignal.common.threading.d $waiter;

        public m(com.onesignal.common.threading.d dVar) {
            this.$waiter = dVar;
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
        Intrinsics.checkNotNullExpressionValue(synchronizedSet, "synchronizedSet(...)");
        this.startedActivities = synchronizedSet;
        this.componentCallbacks = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void decorViewReady$lambda$1(a self, Runnable runnable, a this$0) {
        Intrinsics.checkNotNullParameter(self, "$self");
        Intrinsics.checkNotNullParameter(runnable, "$runnable");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        self.addActivityLifecycleHandler(self.new d(runnable, this$0));
    }

    private final void decrementStartedActivity(Activity activity, boolean z7) {
        if (this.startedActivities.remove(activity)) {
            int i2 = this.activityReferences - 1;
            this.activityReferences = i2;
            if (i2 <= 0) {
                this.activityReferences = 0;
                if (z7 && getCurrent() == null) {
                    resetStaleNotificationEntryIfBackgrounded(z7);
                    return;
                } else {
                    setCurrent(null);
                    handleLostFocus();
                    return;
                }
            }
        }
        resetStaleNotificationEntryIfBackgrounded(z7);
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
        if (getEntryState() != v2.b.NOTIFICATION_CLICK) {
            setEntryState(v2.b.APP_OPEN);
        }
        this.applicationLifecycleNotifier.fire(e.INSTANCE);
    }

    private final void handleLostFocus() {
        if (!isInForeground()) {
            com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.handleLostFocus: application already out of focus", null, 2, null);
            return;
        }
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.handleLostFocus: application is now out of focus", null, 2, null);
        setEntryState(v2.b.APP_CLOSE);
        this.applicationLifecycleNotifier.fire(f.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onOrientationChanged(int i2, Activity activity) {
        if (i2 == 1) {
            com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.onOrientationChanged: Configuration Orientation Change: PORTRAIT (" + i2 + ") on activity: " + activity, null, 2, null);
        } else if (i2 == 2) {
            com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.onOrientationChanged: Configuration Orientation Change: LANDSCAPE (" + i2 + ") on activity: " + activity, null, 2, null);
        }
        handleLostFocus();
        this.activityLifecycleNotifier.fire(new i(activity));
        this.activityLifecycleNotifier.fire(new j(activity));
        activity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this);
        handleFocus();
    }

    private final void resetStaleNotificationEntryIfBackgrounded(boolean z7) {
        if (z7 && getCurrent() == null && getEntryState() == v2.b.NOTIFICATION_CLICK) {
            setEntryState(v2.b.APP_CLOSE);
        }
    }

    private final void seedFocusFromInitContext(Context context) {
        boolean z7 = context instanceof Activity;
        boolean z8 = getCurrent() == null;
        if (z8 && !z7) {
            this.nextResumeIsFirstActivity = true;
            setEntryState(v2.b.APP_CLOSE);
            return;
        }
        setEntryState(v2.b.APP_OPEN);
        if (z8 && z7) {
            Intrinsics.c(context, "null cannot be cast to non-null type android.app.Activity");
            Activity activity = (Activity) context;
            setCurrent(activity);
            this.startedActivities.add(activity);
            this.activityReferences = 1;
            this.nextResumeIsFirstActivity = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void waitUntilActivityReady$lambda$0(com.onesignal.common.threading.d waiter) {
        Intrinsics.checkNotNullParameter(waiter, "$waiter");
        waiter.wake();
    }

    @Override // v2.f
    public void addActivityLifecycleHandler(v2.d handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.activityLifecycleNotifier.subscribe(handler);
        if (getCurrent() != null) {
            Activity current = getCurrent();
            Intrinsics.b(current);
            handler.onActivityAvailable(current);
        }
    }

    @Override // v2.f
    public void addApplicationLifecycleHandler(v2.e handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.applicationLifecycleNotifier.subscribe(handler);
        if (getCurrent() != null) {
            handler.onFocus(true);
        }
    }

    public final void attachToApplication(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
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
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Objects.toString(runnable);
        activity.getWindow().getDecorView().post(new B5.b(this, runnable, this, 7));
    }

    @Override // v2.f
    public Context getAppContext() {
        Context context = this._appContext;
        Intrinsics.b(context);
        return context;
    }

    @Override // v2.f
    public Activity getCurrent() {
        return this._current;
    }

    @Override // v2.f
    public v2.b getEntryState() {
        return this.entryState;
    }

    @Override // v2.f
    public boolean isInForeground() {
        return getEntryState().isAppOpen() || getEntryState().isNotificationClick();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.onActivityCreated(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.onActivityDestroyed(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.onActivityPaused(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.onActivityResumed(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
        if (activity instanceof v2.g) {
            return;
        }
        if (!Intrinsics.a(getCurrent(), activity)) {
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
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.onActivityStarted(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
        if (Intrinsics.a(getCurrent(), activity) && this.startedActivities.contains(activity)) {
            return;
        }
        boolean z7 = activity instanceof v2.g;
        boolean z8 = this.isActivityChangingConfigurations;
        if (!z7 && getCurrent() == null && !z8) {
            this.nextResumeIsFirstActivity = true;
        }
        if (!z7 && !Intrinsics.a(getCurrent(), activity)) {
            setCurrent(activity);
        }
        boolean add = this.startedActivities.add(activity);
        if (!z7 && getWasInBackground() && !this.isActivityChangingConfigurations) {
            this.startedActivities.clear();
            this.startedActivities.add(activity);
            this.activityReferences = 1;
            handleFocus();
            return;
        }
        if (!z7 && z8) {
            this.isActivityChangingConfigurations = false;
        } else if (add) {
            this.activityReferences++;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.onActivityStopped(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
        boolean z7 = activity instanceof v2.g;
        if (!z7) {
            this.isActivityChangingConfigurations = activity.isChangingConfigurations();
        }
        if (z7 || !this.isActivityChangingConfigurations) {
            decrementStartedActivity(activity, z7);
        }
        this.activityLifecycleNotifier.fire(new g(activity));
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.systemConditionNotifier.fire(h.INSTANCE);
    }

    @Override // v2.f
    public void removeActivityLifecycleHandler(v2.d handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.activityLifecycleNotifier.unsubscribe(handler);
    }

    @Override // v2.f
    public void removeApplicationLifecycleHandler(v2.e handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.applicationLifecycleNotifier.unsubscribe(handler);
    }

    public void setCurrent(Activity activity) {
        this._current = activity;
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService: current activity=" + getCurrent(), null, 2, null);
        if (activity != null) {
            this.activityLifecycleNotifier.fire(new c(activity));
            try {
                activity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this);
            } catch (RuntimeException e7) {
                e7.printStackTrace();
            }
        }
    }

    @Override // v2.f
    public void setEntryState(v2.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.entryState = bVar;
    }

    public final void start(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        boolean z7 = this.lifecycleObserverInstalled;
        this._appContext = context;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
        attachToApplication((Application) applicationContext);
        if (!z7) {
            seedFocusFromInitContext(context);
        }
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.init: entryState=" + getEntryState(), null, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // v2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object waitUntilActivityReady(V5.b bVar) {
        k kVar;
        int i2;
        if (bVar instanceof k) {
            kVar = (k) bVar;
            int i5 = kVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                kVar.label = i5 - Integer.MIN_VALUE;
                Object obj = kVar.result;
                W5.a aVar = W5.a.f2787d;
                i2 = kVar.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    Activity current = getCurrent();
                    if (current == null) {
                        return Boolean.FALSE;
                    }
                    com.onesignal.common.threading.d dVar = new com.onesignal.common.threading.d();
                    decorViewReady(current, new A.k(9, dVar));
                    kVar.label = 1;
                    if (dVar.waitForWake(kVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                }
                return Boolean.TRUE;
            }
        }
        kVar = new k(bVar);
        Object obj2 = kVar.result;
        W5.a aVar2 = W5.a.f2787d;
        i2 = kVar.label;
        if (i2 != 0) {
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x008e, code lost:
    
        if (n6.AbstractC0792z.d(100, r0) == r1) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x008e -> B:32:0x005c). Please report as a decompilation issue!!! */
    @Override // v2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object waitUntilSystemConditionsAvailable(V5.b bVar) {
        l lVar;
        int i2;
        Activity current;
        int i5;
        a aVar;
        a aVar2;
        l lVar2;
        a aVar3;
        m mVar;
        m mVar2;
        if (bVar instanceof l) {
            lVar = (l) bVar;
            int i7 = lVar.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                lVar.label = i7 - Integer.MIN_VALUE;
                Object obj = lVar.result;
                W5.a aVar4 = W5.a.f2787d;
                i2 = lVar.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    current = getCurrent();
                    i5 = AndroidUtils.INSTANCE.isRunningOnMainThread() ? 50 : 0;
                    aVar = this;
                    if (current != null) {
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mVar2 = (m) lVar.L$1;
                            aVar3 = (a) lVar.L$0;
                            V6.b.P(obj);
                            mVar = mVar2;
                            aVar3.systemConditionNotifier.unsubscribe(mVar);
                            return Boolean.TRUE;
                        }
                        current = (Activity) lVar.L$1;
                        aVar2 = (a) lVar.L$0;
                        try {
                            V6.b.P(obj);
                        } catch (NoClassDefFoundError e7) {
                            e = e7;
                            com.onesignal.debug.internal.logging.b.info$default("ApplicationService.waitUntilSystemConditionsAvailable: AppCompatActivity is not used in this app, skipping 'isDialogFragmentShowing' check: " + e, null, 2, null);
                            lVar2 = lVar;
                            aVar3 = aVar2;
                            com.onesignal.common.threading.d dVar = new com.onesignal.common.threading.d();
                            mVar = aVar3.new m(dVar);
                            aVar3.systemConditionNotifier.subscribe(mVar);
                            if (com.onesignal.common.c.INSTANCE.isKeyboardUp(new WeakReference<>(current))) {
                            }
                            aVar3.systemConditionNotifier.unsubscribe(mVar);
                            return Boolean.TRUE;
                        }
                        lVar2 = lVar;
                        aVar3 = aVar2;
                        com.onesignal.common.threading.d dVar2 = new com.onesignal.common.threading.d();
                        mVar = aVar3.new m(dVar2);
                        aVar3.systemConditionNotifier.subscribe(mVar);
                        if (com.onesignal.common.c.INSTANCE.isKeyboardUp(new WeakReference<>(current))) {
                            com.onesignal.debug.internal.logging.b.warn$default("ApplicationService.waitUntilSystemConditionsAvailable: keyboard up detected", null, 2, null);
                            lVar2.L$0 = aVar3;
                            lVar2.L$1 = mVar;
                            lVar2.label = 3;
                            if (dVar2.waitForWake(lVar2) != aVar4) {
                                mVar2 = mVar;
                                mVar = mVar2;
                            }
                            return aVar4;
                        }
                        aVar3.systemConditionNotifier.unsubscribe(mVar);
                        return Boolean.TRUE;
                    }
                    int i8 = lVar.I$0;
                    aVar = (a) lVar.L$0;
                    V6.b.P(obj);
                    i5 = i8;
                    current = aVar.getCurrent();
                    if (current != null) {
                        try {
                            if (current instanceof AbstractActivityC0525l) {
                                Q supportFragmentManager = ((AbstractActivityC0525l) current).getSupportFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                                List g7 = supportFragmentManager.f3615c.g();
                                Intrinsics.checkNotNullExpressionValue(g7, "getFragments(...)");
                                Intrinsics.checkNotNullParameter(g7, "<this>");
                                ComponentCallbacksC0228t componentCallbacksC0228t = (ComponentCallbacksC0228t) (g7.isEmpty() ? null : g7.get(g7.size() - 1));
                                if (componentCallbacksC0228t != null && componentCallbacksC0228t.h()) {
                                    componentCallbacksC0228t.i();
                                }
                            }
                            lVar2 = lVar;
                            aVar3 = aVar;
                        } catch (NoClassDefFoundError e8) {
                            e = e8;
                            aVar2 = aVar;
                            com.onesignal.debug.internal.logging.b.info$default("ApplicationService.waitUntilSystemConditionsAvailable: AppCompatActivity is not used in this app, skipping 'isDialogFragmentShowing' check: " + e, null, 2, null);
                            lVar2 = lVar;
                            aVar3 = aVar2;
                            com.onesignal.common.threading.d dVar22 = new com.onesignal.common.threading.d();
                            mVar = aVar3.new m(dVar22);
                            aVar3.systemConditionNotifier.subscribe(mVar);
                            if (com.onesignal.common.c.INSTANCE.isKeyboardUp(new WeakReference<>(current))) {
                            }
                            aVar3.systemConditionNotifier.unsubscribe(mVar);
                            return Boolean.TRUE;
                        }
                        com.onesignal.common.threading.d dVar222 = new com.onesignal.common.threading.d();
                        mVar = aVar3.new m(dVar222);
                        aVar3.systemConditionNotifier.subscribe(mVar);
                        if (com.onesignal.common.c.INSTANCE.isKeyboardUp(new WeakReference<>(current))) {
                        }
                        aVar3.systemConditionNotifier.unsubscribe(mVar);
                        return Boolean.TRUE;
                    }
                    i8 = i5 + 1;
                    if (i8 > 50) {
                        com.onesignal.debug.internal.logging.b.warn$default("ApplicationService.waitUntilSystemConditionsAvailable: current is null", null, 2, null);
                        return Boolean.FALSE;
                    }
                    lVar.L$0 = aVar;
                    lVar.I$0 = i8;
                    lVar.label = 1;
                }
            }
        }
        lVar = new l(bVar);
        Object obj2 = lVar.result;
        W5.a aVar42 = W5.a.f2787d;
        i2 = lVar.label;
        if (i2 != 0) {
        }
    }
}
