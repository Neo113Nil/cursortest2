package com.onesignal.core.internal.application.impl;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ViewTreeObserver;
import androidx.lifecycle.d0;
import c4.m;
import com.onesignal.common.AndroidUtils;
import java.lang.ref.WeakReference;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import wd.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements ea.f, Application.ActivityLifecycleCallbacks, ViewTreeObserver.OnGlobalLayoutListener {
    private Context _appContext;
    private Activity _current;
    private int activityReferences;
    private boolean isActivityChangingConfigurations;
    private boolean nextResumeIsFirstActivity;
    private final com.onesignal.common.events.b activityLifecycleNotifier = new com.onesignal.common.events.b();
    private final com.onesignal.common.events.b applicationLifecycleNotifier = new com.onesignal.common.events.b();
    private final com.onesignal.common.events.b systemConditionNotifier = new com.onesignal.common.events.b();
    private ea.b entryState = ea.b.APP_CLOSE;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends ea.a {
        final /* synthetic */ Runnable $runnable;
        final /* synthetic */ a this$0;

        public b(Runnable runnable, a aVar) {
            this.$runnable = runnable;
            this.this$0 = aVar;
        }

        @Override // ea.a, ea.d
        public void onActivityAvailable(Activity activity) {
            activity.getClass();
            a.this.removeActivityLifecycleHandler(this);
            if (AndroidUtils.INSTANCE.isActivityFullyReady(activity)) {
                this.$runnable.run();
            } else {
                this.this$0.decorViewReady(activity, this.$runnable);
            }
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class j extends nd.c {
        int label;
        /* synthetic */ Object result;

        public j(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.waitUntilActivityReady(this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class k extends nd.c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public k(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.waitUntilSystemConditionsAvailable(this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class l implements com.onesignal.core.internal.application.impl.b {
        final /* synthetic */ com.onesignal.common.threading.c $waiter;

        public l(com.onesignal.common.threading.c cVar) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void decorViewReady$lambda$1(a aVar, Runnable runnable, a aVar2) {
        aVar.getClass();
        runnable.getClass();
        aVar2.getClass();
        aVar.addActivityLifecycleHandler(aVar.new b(runnable, aVar2));
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
        if (getEntryState() != ea.b.NOTIFICATION_CLICK) {
            setEntryState(ea.b.APP_OPEN);
        }
        this.applicationLifecycleNotifier.fire(c.INSTANCE);
    }

    private final void handleLostFocus() {
        if (!isInForeground()) {
            com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.handleLostFocus: application already out of focus", null, 2, null);
            return;
        }
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.handleLostFocus: application is now out of focus", null, 2, null);
        setEntryState(ea.b.APP_CLOSE);
        this.applicationLifecycleNotifier.fire(d.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onOrientationChanged(int i3, Activity activity) {
        if (i3 == 1) {
            com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.onOrientationChanged: Configuration Orientation Change: PORTRAIT (" + i3 + ") on activity: " + activity, null, 2, null);
        } else if (i3 == 2) {
            com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.onOrientationChanged: Configuration Orientation Change: LANDSCAPE (" + i3 + ") on activity: " + activity, null, 2, null);
        }
        handleLostFocus();
        this.activityLifecycleNotifier.fire(new g(activity));
        this.activityLifecycleNotifier.fire(new h(activity));
        activity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this);
        handleFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void waitUntilActivityReady$lambda$0(com.onesignal.common.threading.c cVar) {
        cVar.getClass();
        cVar.wake();
    }

    @Override // ea.f
    public void addActivityLifecycleHandler(ea.d dVar) {
        dVar.getClass();
        this.activityLifecycleNotifier.subscribe(dVar);
        if (getCurrent() != null) {
            Activity current = getCurrent();
            current.getClass();
            dVar.onActivityAvailable(current);
        }
    }

    @Override // ea.f
    public void addApplicationLifecycleHandler(ea.e eVar) {
        eVar.getClass();
        this.applicationLifecycleNotifier.subscribe(eVar);
        if (getCurrent() != null) {
            eVar.onFocus(true);
        }
    }

    public final void decorViewReady(Activity activity, Runnable runnable) {
        activity.getClass();
        runnable.getClass();
        Objects.toString(runnable);
        activity.getWindow().getDecorView().post(new m(this, runnable, this, 5));
    }

    @Override // ea.f
    public Context getAppContext() {
        Context context = this._appContext;
        context.getClass();
        return context;
    }

    @Override // ea.f
    public Activity getCurrent() {
        return this._current;
    }

    @Override // ea.f
    public ea.b getEntryState() {
        return this.entryState;
    }

    @Override // ea.f
    public boolean isInForeground() {
        return getEntryState().isAppOpen() || getEntryState().isNotificationClick();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.onActivityCreated(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        activity.getClass();
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.onActivityDestroyed(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.onActivityPaused(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        activity.getClass();
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.onActivityResumed(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
        if (!Intrinsics.a(getCurrent(), activity)) {
            setCurrent(activity);
        }
        if (!getWasInBackground() || this.isActivityChangingConfigurations) {
            return;
        }
        this.activityReferences = 1;
        handleFocus();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        activity.getClass();
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.onActivityStarted(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
        if (Intrinsics.a(getCurrent(), activity)) {
            return;
        }
        setCurrent(activity);
        if (!getWasInBackground() || this.isActivityChangingConfigurations) {
            this.activityReferences++;
        } else {
            this.activityReferences = 1;
            handleFocus();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.onActivityStopped(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
        boolean isChangingConfigurations = activity.isChangingConfigurations();
        this.isActivityChangingConfigurations = isChangingConfigurations;
        if (!isChangingConfigurations) {
            int i3 = this.activityReferences - 1;
            this.activityReferences = i3;
            if (i3 <= 0) {
                setCurrent(null);
                this.activityReferences = 0;
                handleLostFocus();
            }
        }
        this.activityLifecycleNotifier.fire(new e(activity));
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.systemConditionNotifier.fire(f.INSTANCE);
    }

    @Override // ea.f
    public void removeActivityLifecycleHandler(ea.d dVar) {
        dVar.getClass();
        this.activityLifecycleNotifier.unsubscribe(dVar);
    }

    @Override // ea.f
    public void removeApplicationLifecycleHandler(ea.e eVar) {
        eVar.getClass();
        this.applicationLifecycleNotifier.unsubscribe(eVar);
    }

    public void setCurrent(Activity activity) {
        this._current = activity;
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService: current activity=" + getCurrent(), null, 2, null);
        if (activity != null) {
            this.activityLifecycleNotifier.fire(new C0008a(activity));
            try {
                activity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this);
            } catch (RuntimeException e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // ea.f
    public void setEntryState(ea.b bVar) {
        bVar.getClass();
        this.entryState = bVar;
    }

    public final void start(Context context) {
        context.getClass();
        this._appContext = context;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        Application application = (Application) applicationContext;
        application.registerActivityLifecycleCallbacks(this);
        application.registerComponentCallbacks(new i());
        boolean z10 = context instanceof Activity;
        boolean z11 = getCurrent() == null;
        if (!z11 || z10) {
            setEntryState(ea.b.APP_OPEN);
            if (z11 && z10) {
                setCurrent((Activity) context);
                this.activityReferences = 1;
                this.nextResumeIsFirstActivity = false;
            }
        } else {
            this.nextResumeIsFirstActivity = true;
            setEntryState(ea.b.APP_CLOSE);
        }
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.init: entryState=" + getEntryState(), null, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ea.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object waitUntilActivityReady(ld.a aVar) {
        j jVar;
        int i3;
        if (aVar instanceof j) {
            jVar = (j) aVar;
            int i10 = jVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jVar.label = i10 - Integer.MIN_VALUE;
                Object obj = jVar.result;
                md.a aVar2 = md.a.f6622d;
                i3 = jVar.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    Activity current = getCurrent();
                    if (current == null) {
                        return Boolean.FALSE;
                    }
                    com.onesignal.common.threading.c cVar = new com.onesignal.common.threading.c();
                    decorViewReady(current, new d0(5, cVar));
                    jVar.label = 1;
                    if (cVar.waitForWake(jVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
                return Boolean.TRUE;
            }
        }
        jVar = new j(aVar);
        Object obj2 = jVar.result;
        md.a aVar22 = md.a.f6622d;
        i3 = jVar.label;
        if (i3 != 0) {
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x009c, code lost:
    
        if (ge.a0.i(100, r0) == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x009c -> B:32:0x006a). Please report as a decompilation issue!!! */
    @Override // ea.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object waitUntilSystemConditionsAvailable(ld.a aVar) {
        k kVar;
        int i3;
        Activity current;
        int i10;
        a aVar2;
        k kVar2;
        a aVar3;
        l lVar;
        l lVar2;
        if (aVar instanceof k) {
            kVar = (k) aVar;
            int i11 = kVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kVar.label = i11 - Integer.MIN_VALUE;
                Object obj = kVar.result;
                md.a aVar4 = md.a.f6622d;
                i3 = kVar.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    current = getCurrent();
                    i10 = AndroidUtils.INSTANCE.isRunningOnMainThread() ? 50 : 0;
                    aVar2 = this;
                    if (current != null) {
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                i0.l("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            lVar2 = (l) kVar.L$1;
                            aVar3 = (a) kVar.L$0;
                            cf.c.M(obj);
                            lVar = lVar2;
                            aVar3.systemConditionNotifier.unsubscribe(lVar);
                            return Boolean.TRUE;
                        }
                        current = (Activity) kVar.L$1;
                        a aVar5 = (a) kVar.L$0;
                        try {
                            cf.c.M(obj);
                        } catch (NoClassDefFoundError e2) {
                            com.onesignal.debug.internal.logging.b.info$default("ApplicationService.waitUntilSystemConditionsAvailable: AppCompatActivity is not used in this app, skipping 'isDialogFragmentShowing' check: " + e2, null, 2, null);
                        }
                        kVar2 = kVar;
                        aVar3 = aVar5;
                        com.onesignal.common.threading.c cVar = new com.onesignal.common.threading.c();
                        lVar = aVar3.new l(cVar);
                        aVar3.systemConditionNotifier.subscribe(lVar);
                        if (com.onesignal.common.c.INSTANCE.isKeyboardUp(new WeakReference<>(current))) {
                            com.onesignal.debug.internal.logging.b.warn$default("ApplicationService.waitUntilSystemConditionsAvailable: keyboard up detected", null, 2, null);
                            kVar2.L$0 = aVar3;
                            kVar2.L$1 = lVar;
                            kVar2.label = 3;
                            if (cVar.waitForWake(kVar2) != aVar4) {
                                lVar2 = lVar;
                                lVar = lVar2;
                            }
                            return aVar4;
                        }
                        aVar3.systemConditionNotifier.unsubscribe(lVar);
                        return Boolean.TRUE;
                    }
                    int i12 = kVar.I$0;
                    aVar2 = (a) kVar.L$0;
                    cf.c.M(obj);
                    i10 = i12;
                    current = aVar2.getCurrent();
                    if (current != null) {
                        kVar2 = kVar;
                        aVar3 = aVar2;
                        com.onesignal.common.threading.c cVar2 = new com.onesignal.common.threading.c();
                        lVar = aVar3.new l(cVar2);
                        aVar3.systemConditionNotifier.subscribe(lVar);
                        if (com.onesignal.common.c.INSTANCE.isKeyboardUp(new WeakReference<>(current))) {
                        }
                        aVar3.systemConditionNotifier.unsubscribe(lVar);
                        return Boolean.TRUE;
                    }
                    i12 = i10 + 1;
                    if (i12 > 50) {
                        com.onesignal.debug.internal.logging.b.warn$default("ApplicationService.waitUntilSystemConditionsAvailable: current is null", null, 2, null);
                        return Boolean.FALSE;
                    }
                    kVar.L$0 = aVar2;
                    kVar.I$0 = i12;
                    kVar.label = 1;
                }
            }
        }
        kVar = new k(aVar);
        Object obj2 = kVar.result;
        md.a aVar42 = md.a.f6622d;
        i3 = kVar.label;
        if (i3 != 0) {
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class c extends p implements Function1 {
        public static final c INSTANCE = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ea.e) obj);
            return Unit.f5554a;
        }

        public final void invoke(ea.e eVar) {
            eVar.getClass();
            eVar.onFocus(false);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class d extends p implements Function1 {
        public static final d INSTANCE = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ea.e) obj);
            return Unit.f5554a;
        }

        public final void invoke(ea.e eVar) {
            eVar.getClass();
            eVar.onUnfocused();
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class f extends p implements Function1 {
        public static final f INSTANCE = new f();

        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.core.internal.application.impl.b) obj);
            return Unit.f5554a;
        }

        public final void invoke(com.onesignal.core.internal.application.impl.b bVar) {
            bVar.getClass();
            bVar.systemConditionChanged();
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.core.internal.application.impl.a$a, reason: collision with other inner class name */
    public static final class C0008a extends p implements Function1 {
        final /* synthetic */ Activity $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0008a(Activity activity) {
            super(1);
            this.$value = activity;
        }

        public final void invoke(ea.d dVar) {
            dVar.getClass();
            dVar.onActivityAvailable(this.$value);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ea.d) obj);
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class e extends p implements Function1 {
        final /* synthetic */ Activity $activity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Activity activity) {
            super(1);
            this.$activity = activity;
        }

        public final void invoke(ea.d dVar) {
            dVar.getClass();
            dVar.onActivityStopped(this.$activity);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ea.d) obj);
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class g extends p implements Function1 {
        final /* synthetic */ Activity $activity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Activity activity) {
            super(1);
            this.$activity = activity;
        }

        public final void invoke(ea.d dVar) {
            dVar.getClass();
            dVar.onActivityStopped(this.$activity);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ea.d) obj);
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class h extends p implements Function1 {
        final /* synthetic */ Activity $activity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Activity activity) {
            super(1);
            this.$activity = activity;
        }

        public final void invoke(ea.d dVar) {
            dVar.getClass();
            dVar.onActivityAvailable(this.$activity);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ea.d) obj);
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class i implements ComponentCallbacks {
        public i() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            configuration.getClass();
            if (a.this.getCurrent() != null) {
                AndroidUtils androidUtils = AndroidUtils.INSTANCE;
                Activity current = a.this.getCurrent();
                current.getClass();
                if (androidUtils.hasConfigChangeFlag(current, 128)) {
                    a aVar = a.this;
                    int i3 = configuration.orientation;
                    Activity current2 = aVar.getCurrent();
                    current2.getClass();
                    aVar.onOrientationChanged(i3, current2);
                }
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }
    }
}
