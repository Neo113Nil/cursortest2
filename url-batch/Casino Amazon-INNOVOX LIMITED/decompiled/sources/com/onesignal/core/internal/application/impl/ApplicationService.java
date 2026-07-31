package com.onesignal.core.internal.application.impl;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ViewTreeObserver;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.facebook.react.uimanager.ViewProps;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.DeviceUtils;
import com.onesignal.common.events.EventProducer;
import com.onesignal.common.threading.Waiter;
import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.application.ActivityLifecycleHandlerBase;
import com.onesignal.core.internal.application.AppEntryAction;
import com.onesignal.core.internal.application.IActivityLifecycleHandler;
import com.onesignal.core.internal.application.IApplicationLifecycleHandler;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.application.OneSignalInternalActivity;
import com.onesignal.debug.internal.logging.Logging;
import io.opentelemetry.semconv.JvmAttributes;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: ApplicationService.kt */
@Metadata(d1 = {"\u0000}\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016*\u0001\u0014\u0018\u0000 T2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001TB\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u000bH\u0016J\u0010\u00101\u001a\u00020/2\u0006\u00100\u001a\u00020\u0012H\u0016J\u000e\u00102\u001a\u00020/2\u0006\u00103\u001a\u000204J\u0016\u00105\u001a\u00020/2\u0006\u00106\u001a\u00020\b2\u0006\u00107\u001a\u000208J\u0018\u00109\u001a\u00020/2\u0006\u00106\u001a\u00020\b2\u0006\u0010:\u001a\u00020#H\u0002J\b\u0010;\u001a\u00020/H\u0002J\b\u0010<\u001a\u00020/H\u0002J\u001a\u0010=\u001a\u00020/2\u0006\u00106\u001a\u00020\b2\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\u0010\u0010@\u001a\u00020/2\u0006\u00106\u001a\u00020\bH\u0016J\u0010\u0010A\u001a\u00020/2\u0006\u00106\u001a\u00020\bH\u0016J\u0010\u0010B\u001a\u00020/2\u0006\u00106\u001a\u00020\bH\u0016J\u0018\u0010C\u001a\u00020/2\u0006\u0010D\u001a\u00020\b2\u0006\u0010E\u001a\u00020?H\u0016J\u0010\u0010F\u001a\u00020/2\u0006\u00106\u001a\u00020\bH\u0016J\u0010\u0010G\u001a\u00020/2\u0006\u00106\u001a\u00020\bH\u0016J\b\u0010H\u001a\u00020/H\u0016J\u0018\u0010I\u001a\u00020/2\u0006\u0010J\u001a\u00020\r2\u0006\u00106\u001a\u00020\bH\u0002J\u0010\u0010K\u001a\u00020/2\u0006\u00100\u001a\u00020\u000bH\u0016J\u0010\u0010L\u001a\u00020/2\u0006\u00100\u001a\u00020\u0012H\u0016J\u0010\u0010M\u001a\u00020/2\u0006\u0010:\u001a\u00020#H\u0002J\u0010\u0010N\u001a\u00020/2\u0006\u0010O\u001a\u00020\u0006H\u0002J\u000e\u0010P\u001a\u00020/2\u0006\u0010O\u001a\u00020\u0006J\u000e\u0010Q\u001a\u00020#H\u0096@¢\u0006\u0002\u0010RJ\u000e\u0010S\u001a\u00020#H\u0096@¢\u0006\u0002\u0010RR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0015R(\u0010\u0017\u001a\u0004\u0018\u00010\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u000e\u0010&\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020\b0)X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010,\u001a\u00020#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010%¨\u0006U"}, d2 = {"Lcom/onesignal/core/internal/application/impl/ApplicationService;", "Lcom/onesignal/core/internal/application/IApplicationService;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "()V", "_appContext", "Landroid/content/Context;", "_current", "Landroid/app/Activity;", "activityLifecycleNotifier", "Lcom/onesignal/common/events/EventProducer;", "Lcom/onesignal/core/internal/application/IActivityLifecycleHandler;", "activityReferences", "", "appContext", "getAppContext", "()Landroid/content/Context;", "applicationLifecycleNotifier", "Lcom/onesignal/core/internal/application/IApplicationLifecycleHandler;", "componentCallbacks", "com/onesignal/core/internal/application/impl/ApplicationService$componentCallbacks$1", "Lcom/onesignal/core/internal/application/impl/ApplicationService$componentCallbacks$1;", "value", "current", "getCurrent", "()Landroid/app/Activity;", "setCurrent", "(Landroid/app/Activity;)V", "entryState", "Lcom/onesignal/core/internal/application/AppEntryAction;", "getEntryState", "()Lcom/onesignal/core/internal/application/AppEntryAction;", "setEntryState", "(Lcom/onesignal/core/internal/application/AppEntryAction;)V", "isActivityChangingConfigurations", "", "isInForeground", "()Z", "lifecycleObserverInstalled", "nextResumeIsFirstActivity", "startedActivities", "", "systemConditionNotifier", "Lcom/onesignal/core/internal/application/impl/ISystemConditionHandler;", "wasInBackground", "getWasInBackground", "addActivityLifecycleHandler", "", "handler", "addApplicationLifecycleHandler", "attachToApplication", "application", "Landroid/app/Application;", "decorViewReady", "activity", JvmAttributes.JvmThreadStateValues.RUNNABLE, "Ljava/lang/Runnable;", "decrementStartedActivity", "isInternal", "handleFocus", "handleLostFocus", "onActivityCreated", "bundle", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "p0", "p1", "onActivityStarted", "onActivityStopped", "onGlobalLayout", "onOrientationChanged", "orientation", "removeActivityLifecycleHandler", "removeApplicationLifecycleHandler", "resetStaleNotificationEntryIfBackgrounded", "seedFocusFromInitContext", "context", ViewProps.START, "waitUntilActivityReady", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "waitUntilSystemConditionsAvailable", "Companion", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ApplicationService implements IApplicationService, Application.ActivityLifecycleCallbacks, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static volatile ApplicationService sharedInstance;
    private Context _appContext;
    private Activity _current;
    private int activityReferences;
    private final ApplicationService$componentCallbacks$1 componentCallbacks;
    private boolean isActivityChangingConfigurations;
    private boolean lifecycleObserverInstalled;
    private boolean nextResumeIsFirstActivity;
    private final Set<Activity> startedActivities;
    private final EventProducer<IActivityLifecycleHandler> activityLifecycleNotifier = new EventProducer<>();
    private final EventProducer<IApplicationLifecycleHandler> applicationLifecycleNotifier = new EventProducer<>();
    private final EventProducer<ISystemConditionHandler> systemConditionNotifier = new EventProducer<>();
    private AppEntryAction entryState = AppEntryAction.APP_CLOSE;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity p0, Bundle p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
    }

    /* compiled from: ApplicationService.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/onesignal/core/internal/application/impl/ApplicationService$Companion;", "", "()V", "sharedInstance", "Lcom/onesignal/core/internal/application/impl/ApplicationService;", "getInstance", "getInstanceOrNull", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ApplicationService getInstance() {
            ApplicationService applicationService;
            ApplicationService applicationService2 = ApplicationService.sharedInstance;
            if (applicationService2 != null) {
                return applicationService2;
            }
            synchronized (this) {
                applicationService = ApplicationService.sharedInstance;
                if (applicationService == null) {
                    applicationService = new ApplicationService();
                    Companion companion = ApplicationService.INSTANCE;
                    ApplicationService.sharedInstance = applicationService;
                }
            }
            return applicationService;
        }

        public final ApplicationService getInstanceOrNull() {
            return ApplicationService.sharedInstance;
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.onesignal.core.internal.application.impl.ApplicationService$componentCallbacks$1] */
    public ApplicationService() {
        Set<Activity> synchronizedSet = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        Intrinsics.checkNotNullExpressionValue(synchronizedSet, "synchronizedSet(...)");
        this.startedActivities = synchronizedSet;
        this.componentCallbacks = new ComponentCallbacks() { // from class: com.onesignal.core.internal.application.impl.ApplicationService$componentCallbacks$1
            @Override // android.content.ComponentCallbacks
            public void onLowMemory() {
            }

            @Override // android.content.ComponentCallbacks
            public void onConfigurationChanged(Configuration newConfig) {
                Intrinsics.checkNotNullParameter(newConfig, "newConfig");
                if (ApplicationService.this.get_current() != null) {
                    AndroidUtils androidUtils = AndroidUtils.INSTANCE;
                    Activity activity = ApplicationService.this.get_current();
                    Intrinsics.checkNotNull(activity);
                    if (androidUtils.hasConfigChangeFlag(activity, 128)) {
                        ApplicationService applicationService = ApplicationService.this;
                        int i = newConfig.orientation;
                        Activity activity2 = ApplicationService.this.get_current();
                        Intrinsics.checkNotNull(activity2);
                        applicationService.onOrientationChanged(i, activity2);
                    }
                }
            }
        };
    }

    @Override // com.onesignal.core.internal.application.IApplicationService
    public boolean isInForeground() {
        return getEntryState().isAppOpen() || getEntryState().isNotificationClick();
    }

    @Override // com.onesignal.core.internal.application.IApplicationService
    public AppEntryAction getEntryState() {
        return this.entryState;
    }

    @Override // com.onesignal.core.internal.application.IApplicationService
    public void setEntryState(AppEntryAction appEntryAction) {
        Intrinsics.checkNotNullParameter(appEntryAction, "<set-?>");
        this.entryState = appEntryAction;
    }

    @Override // com.onesignal.core.internal.application.IApplicationService
    public Context getAppContext() {
        Context context = this._appContext;
        Intrinsics.checkNotNull(context);
        return context;
    }

    @Override // com.onesignal.core.internal.application.IApplicationService
    /* renamed from: getCurrent, reason: from getter */
    public Activity get_current() {
        return this._current;
    }

    public void setCurrent(final Activity activity) {
        this._current = activity;
        Logging.debug$default("ApplicationService: current activity=" + get_current(), null, 2, null);
        if (activity != null) {
            this.activityLifecycleNotifier.fire(new Function1<IActivityLifecycleHandler, Unit>() { // from class: com.onesignal.core.internal.application.impl.ApplicationService$current$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(IActivityLifecycleHandler iActivityLifecycleHandler) {
                    invoke2(iActivityLifecycleHandler);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(IActivityLifecycleHandler it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    it.onActivityAvailable(activity);
                }
            });
            try {
                activity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this);
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        }
    }

    private final boolean getWasInBackground() {
        return !isInForeground() || this.nextResumeIsFirstActivity;
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

    public final void start(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        boolean z = this.lifecycleObserverInstalled;
        this._appContext = context;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        attachToApplication((Application) applicationContext);
        if (!z) {
            seedFocusFromInitContext(context);
        }
        Logging.debug$default("ApplicationService.init: entryState=" + getEntryState(), null, 2, null);
    }

    private final void seedFocusFromInitContext(Context context) {
        boolean z = context instanceof Activity;
        boolean z2 = get_current() == null;
        if (!z2 || z) {
            setEntryState(AppEntryAction.APP_OPEN);
            if (z2 && z) {
                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
                Activity activity = (Activity) context;
                setCurrent(activity);
                this.startedActivities.add(activity);
                this.activityReferences = 1;
                this.nextResumeIsFirstActivity = false;
                return;
            }
            return;
        }
        this.nextResumeIsFirstActivity = true;
        setEntryState(AppEntryAction.APP_CLOSE);
    }

    @Override // com.onesignal.core.internal.application.IApplicationService
    public void addApplicationLifecycleHandler(IApplicationLifecycleHandler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.applicationLifecycleNotifier.subscribe(handler);
        if (get_current() != null) {
            handler.onFocus(true);
        }
    }

    @Override // com.onesignal.core.internal.application.IApplicationService
    public void removeApplicationLifecycleHandler(IApplicationLifecycleHandler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.applicationLifecycleNotifier.unsubscribe(handler);
    }

    @Override // com.onesignal.core.internal.application.IApplicationService
    public void addActivityLifecycleHandler(IActivityLifecycleHandler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.activityLifecycleNotifier.subscribe(handler);
        if (get_current() != null) {
            Activity activity = get_current();
            Intrinsics.checkNotNull(activity);
            handler.onActivityAvailable(activity);
        }
    }

    @Override // com.onesignal.core.internal.application.IApplicationService
    public void removeActivityLifecycleHandler(IActivityLifecycleHandler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.activityLifecycleNotifier.unsubscribe(handler);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Logging.debug$default("ApplicationService.onActivityCreated(" + this.activityReferences + AbstractJsonLexerKt.COMMA + getEntryState() + "): " + activity, null, 2, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Logging.debug$default("ApplicationService.onActivityStarted(" + this.activityReferences + AbstractJsonLexerKt.COMMA + getEntryState() + "): " + activity, null, 2, null);
        if (Intrinsics.areEqual(get_current(), activity) && this.startedActivities.contains(activity)) {
            return;
        }
        boolean z = activity instanceof OneSignalInternalActivity;
        boolean z2 = this.isActivityChangingConfigurations;
        if (!z && get_current() == null && !z2) {
            this.nextResumeIsFirstActivity = true;
        }
        if (!z && !Intrinsics.areEqual(get_current(), activity)) {
            setCurrent(activity);
        }
        boolean add = this.startedActivities.add(activity);
        if (!z && getWasInBackground() && !this.isActivityChangingConfigurations) {
            this.startedActivities.clear();
            this.startedActivities.add(activity);
            this.activityReferences = 1;
            handleFocus();
            return;
        }
        if (!z && z2) {
            this.isActivityChangingConfigurations = false;
        } else if (add) {
            this.activityReferences++;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Logging.debug$default("ApplicationService.onActivityResumed(" + this.activityReferences + AbstractJsonLexerKt.COMMA + getEntryState() + "): " + activity, null, 2, null);
        if (activity instanceof OneSignalInternalActivity) {
            return;
        }
        if (!Intrinsics.areEqual(get_current(), activity)) {
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
    public void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Logging.debug$default("ApplicationService.onActivityPaused(" + this.activityReferences + AbstractJsonLexerKt.COMMA + getEntryState() + "): " + activity, null, 2, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Logging.debug$default("ApplicationService.onActivityStopped(" + this.activityReferences + AbstractJsonLexerKt.COMMA + getEntryState() + "): " + activity, null, 2, null);
        boolean z = activity instanceof OneSignalInternalActivity;
        if (!z) {
            this.isActivityChangingConfigurations = activity.isChangingConfigurations();
        }
        if (z || !this.isActivityChangingConfigurations) {
            decrementStartedActivity(activity, z);
        }
        this.activityLifecycleNotifier.fire(new Function1<IActivityLifecycleHandler, Unit>() { // from class: com.onesignal.core.internal.application.impl.ApplicationService$onActivityStopped$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(IActivityLifecycleHandler iActivityLifecycleHandler) {
                invoke2(iActivityLifecycleHandler);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(IActivityLifecycleHandler it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.onActivityStopped(activity);
            }
        });
    }

    private final void decrementStartedActivity(Activity activity, boolean isInternal) {
        if (this.startedActivities.remove(activity)) {
            int i = this.activityReferences - 1;
            this.activityReferences = i;
            if (i <= 0) {
                this.activityReferences = 0;
                if (!isInternal || get_current() != null) {
                    setCurrent(null);
                    handleLostFocus();
                    return;
                } else {
                    resetStaleNotificationEntryIfBackgrounded(isInternal);
                    return;
                }
            }
        }
        resetStaleNotificationEntryIfBackgrounded(isInternal);
    }

    private final void resetStaleNotificationEntryIfBackgrounded(boolean isInternal) {
        if (isInternal && get_current() == null && getEntryState() == AppEntryAction.NOTIFICATION_CLICK) {
            setEntryState(AppEntryAction.APP_CLOSE);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Logging.debug$default("ApplicationService.onActivityDestroyed(" + this.activityReferences + AbstractJsonLexerKt.COMMA + getEntryState() + "): " + activity, null, 2, null);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.systemConditionNotifier.fire(new Function1<ISystemConditionHandler, Unit>() { // from class: com.onesignal.core.internal.application.impl.ApplicationService$onGlobalLayout$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ISystemConditionHandler iSystemConditionHandler) {
                invoke2(iSystemConditionHandler);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ISystemConditionHandler it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.systemConditionChanged();
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0092, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(100, r0) == r1) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0092 -> B:32:0x005e). Please report as a decompilation issue!!! */
    @Override // com.onesignal.core.internal.application.IApplicationService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object waitUntilSystemConditionsAvailable(Continuation<? super Boolean> continuation) {
        ApplicationService$waitUntilSystemConditionsAvailable$1 applicationService$waitUntilSystemConditionsAvailable$1;
        int i;
        Activity activity;
        int i2;
        ApplicationService applicationService;
        ApplicationService applicationService2;
        ApplicationService$waitUntilSystemConditionsAvailable$1 applicationService$waitUntilSystemConditionsAvailable$12;
        final ApplicationService applicationService3;
        ISystemConditionHandler iSystemConditionHandler;
        ISystemConditionHandler iSystemConditionHandler2;
        if (continuation instanceof ApplicationService$waitUntilSystemConditionsAvailable$1) {
            applicationService$waitUntilSystemConditionsAvailable$1 = (ApplicationService$waitUntilSystemConditionsAvailable$1) continuation;
            if ((applicationService$waitUntilSystemConditionsAvailable$1.label & Integer.MIN_VALUE) != 0) {
                applicationService$waitUntilSystemConditionsAvailable$1.label -= Integer.MIN_VALUE;
                Object obj = applicationService$waitUntilSystemConditionsAvailable$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = applicationService$waitUntilSystemConditionsAvailable$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    activity = get_current();
                    i2 = AndroidUtils.INSTANCE.isRunningOnMainThread() ? 50 : 0;
                    applicationService = this;
                    if (activity != null) {
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        iSystemConditionHandler2 = (ApplicationService$waitUntilSystemConditionsAvailable$systemConditionHandler$1) applicationService$waitUntilSystemConditionsAvailable$1.L$1;
                        applicationService3 = (ApplicationService) applicationService$waitUntilSystemConditionsAvailable$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        iSystemConditionHandler = iSystemConditionHandler2;
                        applicationService3.systemConditionNotifier.unsubscribe(iSystemConditionHandler);
                        return Boxing.boxBoolean(true);
                    }
                    activity = (Activity) applicationService$waitUntilSystemConditionsAvailable$1.L$1;
                    applicationService2 = (ApplicationService) applicationService$waitUntilSystemConditionsAvailable$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (NoClassDefFoundError e) {
                        e = e;
                        Logging.info$default("ApplicationService.waitUntilSystemConditionsAvailable: AppCompatActivity is not used in this app, skipping 'isDialogFragmentShowing' check: " + e, null, 2, null);
                        applicationService$waitUntilSystemConditionsAvailable$12 = applicationService$waitUntilSystemConditionsAvailable$1;
                        applicationService3 = applicationService2;
                        final Waiter waiter = new Waiter();
                        iSystemConditionHandler = new ISystemConditionHandler() { // from class: com.onesignal.core.internal.application.impl.ApplicationService$waitUntilSystemConditionsAvailable$systemConditionHandler$1
                            @Override // com.onesignal.core.internal.application.impl.ISystemConditionHandler
                            public void systemConditionChanged() {
                                if (DeviceUtils.INSTANCE.isKeyboardUp(new WeakReference<>(ApplicationService.this.get_current()))) {
                                    return;
                                }
                                waiter.wake();
                            }
                        };
                        applicationService3.systemConditionNotifier.subscribe(iSystemConditionHandler);
                        if (DeviceUtils.INSTANCE.isKeyboardUp(new WeakReference<>(activity))) {
                        }
                        applicationService3.systemConditionNotifier.unsubscribe(iSystemConditionHandler);
                        return Boxing.boxBoolean(true);
                    }
                    applicationService$waitUntilSystemConditionsAvailable$12 = applicationService$waitUntilSystemConditionsAvailable$1;
                    applicationService3 = applicationService2;
                    final Waiter waiter2 = new Waiter();
                    iSystemConditionHandler = new ISystemConditionHandler() { // from class: com.onesignal.core.internal.application.impl.ApplicationService$waitUntilSystemConditionsAvailable$systemConditionHandler$1
                        @Override // com.onesignal.core.internal.application.impl.ISystemConditionHandler
                        public void systemConditionChanged() {
                            if (DeviceUtils.INSTANCE.isKeyboardUp(new WeakReference<>(ApplicationService.this.get_current()))) {
                                return;
                            }
                            waiter2.wake();
                        }
                    };
                    applicationService3.systemConditionNotifier.subscribe(iSystemConditionHandler);
                    if (DeviceUtils.INSTANCE.isKeyboardUp(new WeakReference<>(activity))) {
                        Logging.warn$default("ApplicationService.waitUntilSystemConditionsAvailable: keyboard up detected", null, 2, null);
                        applicationService$waitUntilSystemConditionsAvailable$12.L$0 = applicationService3;
                        applicationService$waitUntilSystemConditionsAvailable$12.L$1 = iSystemConditionHandler;
                        applicationService$waitUntilSystemConditionsAvailable$12.label = 3;
                        if (waiter2.waitForWake(applicationService$waitUntilSystemConditionsAvailable$12) != coroutine_suspended) {
                            iSystemConditionHandler2 = iSystemConditionHandler;
                            iSystemConditionHandler = iSystemConditionHandler2;
                        }
                        return coroutine_suspended;
                    }
                    applicationService3.systemConditionNotifier.unsubscribe(iSystemConditionHandler);
                    return Boxing.boxBoolean(true);
                }
                int i3 = applicationService$waitUntilSystemConditionsAvailable$1.I$0;
                applicationService = (ApplicationService) applicationService$waitUntilSystemConditionsAvailable$1.L$0;
                ResultKt.throwOnFailure(obj);
                i2 = i3;
                activity = applicationService.get_current();
                if (activity != null) {
                    try {
                    } catch (NoClassDefFoundError e2) {
                        e = e2;
                        applicationService2 = applicationService;
                        Logging.info$default("ApplicationService.waitUntilSystemConditionsAvailable: AppCompatActivity is not used in this app, skipping 'isDialogFragmentShowing' check: " + e, null, 2, null);
                        applicationService$waitUntilSystemConditionsAvailable$12 = applicationService$waitUntilSystemConditionsAvailable$1;
                        applicationService3 = applicationService2;
                        final Waiter waiter22 = new Waiter();
                        iSystemConditionHandler = new ISystemConditionHandler() { // from class: com.onesignal.core.internal.application.impl.ApplicationService$waitUntilSystemConditionsAvailable$systemConditionHandler$1
                            @Override // com.onesignal.core.internal.application.impl.ISystemConditionHandler
                            public void systemConditionChanged() {
                                if (DeviceUtils.INSTANCE.isKeyboardUp(new WeakReference<>(ApplicationService.this.get_current()))) {
                                    return;
                                }
                                waiter22.wake();
                            }
                        };
                        applicationService3.systemConditionNotifier.subscribe(iSystemConditionHandler);
                        if (DeviceUtils.INSTANCE.isKeyboardUp(new WeakReference<>(activity))) {
                        }
                        applicationService3.systemConditionNotifier.unsubscribe(iSystemConditionHandler);
                        return Boxing.boxBoolean(true);
                    }
                    if (activity instanceof AppCompatActivity) {
                        final FragmentManager supportFragmentManager = ((AppCompatActivity) activity).getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                        List<Fragment> fragments = supportFragmentManager.getFragments();
                        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
                        Fragment fragment = (Fragment) CollectionsKt.lastOrNull((List) fragments);
                        if (fragment != null && fragment.isVisible() && (fragment instanceof DialogFragment)) {
                            final Waiter waiter3 = new Waiter();
                            supportFragmentManager.registerFragmentLifecycleCallbacks(new FragmentManager.FragmentLifecycleCallbacks() { // from class: com.onesignal.core.internal.application.impl.ApplicationService$waitUntilSystemConditionsAvailable$2
                                @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                                public void onFragmentDetached(FragmentManager fm, Fragment fragmentDetached) {
                                    Intrinsics.checkNotNullParameter(fm, "fm");
                                    Intrinsics.checkNotNullParameter(fragmentDetached, "fragmentDetached");
                                    super.onFragmentDetached(fm, fragmentDetached);
                                    if (fragmentDetached instanceof DialogFragment) {
                                        FragmentManager.this.unregisterFragmentLifecycleCallbacks(this);
                                        waiter3.wake();
                                    }
                                }
                            }, true);
                            applicationService$waitUntilSystemConditionsAvailable$1.L$0 = applicationService;
                            applicationService$waitUntilSystemConditionsAvailable$1.L$1 = activity;
                            applicationService$waitUntilSystemConditionsAvailable$1.label = 2;
                            if (waiter3.waitForWake(applicationService$waitUntilSystemConditionsAvailable$1) != coroutine_suspended) {
                                applicationService2 = applicationService;
                                applicationService$waitUntilSystemConditionsAvailable$12 = applicationService$waitUntilSystemConditionsAvailable$1;
                                applicationService3 = applicationService2;
                                final Waiter waiter222 = new Waiter();
                                iSystemConditionHandler = new ISystemConditionHandler() { // from class: com.onesignal.core.internal.application.impl.ApplicationService$waitUntilSystemConditionsAvailable$systemConditionHandler$1
                                    @Override // com.onesignal.core.internal.application.impl.ISystemConditionHandler
                                    public void systemConditionChanged() {
                                        if (DeviceUtils.INSTANCE.isKeyboardUp(new WeakReference<>(ApplicationService.this.get_current()))) {
                                            return;
                                        }
                                        waiter222.wake();
                                    }
                                };
                                applicationService3.systemConditionNotifier.subscribe(iSystemConditionHandler);
                                if (DeviceUtils.INSTANCE.isKeyboardUp(new WeakReference<>(activity))) {
                                }
                                applicationService3.systemConditionNotifier.unsubscribe(iSystemConditionHandler);
                                return Boxing.boxBoolean(true);
                            }
                        }
                    }
                    applicationService$waitUntilSystemConditionsAvailable$12 = applicationService$waitUntilSystemConditionsAvailable$1;
                    applicationService3 = applicationService;
                    final Waiter waiter2222 = new Waiter();
                    iSystemConditionHandler = new ISystemConditionHandler() { // from class: com.onesignal.core.internal.application.impl.ApplicationService$waitUntilSystemConditionsAvailable$systemConditionHandler$1
                        @Override // com.onesignal.core.internal.application.impl.ISystemConditionHandler
                        public void systemConditionChanged() {
                            if (DeviceUtils.INSTANCE.isKeyboardUp(new WeakReference<>(ApplicationService.this.get_current()))) {
                                return;
                            }
                            waiter2222.wake();
                        }
                    };
                    applicationService3.systemConditionNotifier.subscribe(iSystemConditionHandler);
                    if (DeviceUtils.INSTANCE.isKeyboardUp(new WeakReference<>(activity))) {
                    }
                    applicationService3.systemConditionNotifier.unsubscribe(iSystemConditionHandler);
                    return Boxing.boxBoolean(true);
                }
                i3 = i2 + 1;
                if (i3 > 50) {
                    Logging.warn$default("ApplicationService.waitUntilSystemConditionsAvailable: current is null", null, 2, null);
                    return Boxing.boxBoolean(false);
                }
                applicationService$waitUntilSystemConditionsAvailable$1.L$0 = applicationService;
                applicationService$waitUntilSystemConditionsAvailable$1.I$0 = i3;
                applicationService$waitUntilSystemConditionsAvailable$1.label = 1;
                return coroutine_suspended;
            }
        }
        applicationService$waitUntilSystemConditionsAvailable$1 = new ApplicationService$waitUntilSystemConditionsAvailable$1(this, continuation);
        Object obj2 = applicationService$waitUntilSystemConditionsAvailable$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = applicationService$waitUntilSystemConditionsAvailable$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.onesignal.core.internal.application.IApplicationService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object waitUntilActivityReady(Continuation<? super Boolean> continuation) {
        ApplicationService$waitUntilActivityReady$1 applicationService$waitUntilActivityReady$1;
        int i;
        if (continuation instanceof ApplicationService$waitUntilActivityReady$1) {
            applicationService$waitUntilActivityReady$1 = (ApplicationService$waitUntilActivityReady$1) continuation;
            if ((applicationService$waitUntilActivityReady$1.label & Integer.MIN_VALUE) != 0) {
                applicationService$waitUntilActivityReady$1.label -= Integer.MIN_VALUE;
                Object obj = applicationService$waitUntilActivityReady$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = applicationService$waitUntilActivityReady$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Activity activity = get_current();
                    if (activity == null) {
                        return Boxing.boxBoolean(false);
                    }
                    final Waiter waiter = new Waiter();
                    decorViewReady(activity, new Runnable() { // from class: com.onesignal.core.internal.application.impl.ApplicationService$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            ApplicationService.waitUntilActivityReady$lambda$0(Waiter.this);
                        }
                    });
                    applicationService$waitUntilActivityReady$1.label = 1;
                    if (waiter.waitForWake(applicationService$waitUntilActivityReady$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxBoolean(true);
            }
        }
        applicationService$waitUntilActivityReady$1 = new ApplicationService$waitUntilActivityReady$1(this, continuation);
        Object obj2 = applicationService$waitUntilActivityReady$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = applicationService$waitUntilActivityReady$1.label;
        if (i != 0) {
        }
        return Boxing.boxBoolean(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void waitUntilActivityReady$lambda$0(Waiter waiter) {
        Intrinsics.checkNotNullParameter(waiter, "$waiter");
        waiter.wake();
    }

    public final void decorViewReady(Activity activity, final Runnable runnable) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        String str = "decorViewReady:" + runnable;
        activity.getWindow().getDecorView().post(new Runnable() { // from class: com.onesignal.core.internal.application.impl.ApplicationService$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ApplicationService.decorViewReady$lambda$1(ApplicationService.this, runnable, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void decorViewReady$lambda$1(final ApplicationService self, final Runnable runnable, final ApplicationService this$0) {
        Intrinsics.checkNotNullParameter(self, "$self");
        Intrinsics.checkNotNullParameter(runnable, "$runnable");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        self.addActivityLifecycleHandler(new ActivityLifecycleHandlerBase() { // from class: com.onesignal.core.internal.application.impl.ApplicationService$decorViewReady$1$1
            @Override // com.onesignal.core.internal.application.ActivityLifecycleHandlerBase, com.onesignal.core.internal.application.IActivityLifecycleHandler
            public void onActivityAvailable(Activity currentActivity) {
                Intrinsics.checkNotNullParameter(currentActivity, "currentActivity");
                ApplicationService.this.removeActivityLifecycleHandler(this);
                if (AndroidUtils.INSTANCE.isActivityFullyReady(currentActivity)) {
                    runnable.run();
                } else {
                    this$0.decorViewReady(currentActivity, runnable);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onOrientationChanged(int orientation, final Activity activity) {
        if (orientation == 1) {
            Logging.debug$default("ApplicationService.onOrientationChanged: Configuration Orientation Change: PORTRAIT (" + orientation + ") on activity: " + activity, null, 2, null);
        } else if (orientation == 2) {
            Logging.debug$default("ApplicationService.onOrientationChanged: Configuration Orientation Change: LANDSCAPE (" + orientation + ") on activity: " + activity, null, 2, null);
        }
        handleLostFocus();
        this.activityLifecycleNotifier.fire(new Function1<IActivityLifecycleHandler, Unit>() { // from class: com.onesignal.core.internal.application.impl.ApplicationService$onOrientationChanged$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(IActivityLifecycleHandler iActivityLifecycleHandler) {
                invoke2(iActivityLifecycleHandler);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(IActivityLifecycleHandler it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.onActivityStopped(activity);
            }
        });
        this.activityLifecycleNotifier.fire(new Function1<IActivityLifecycleHandler, Unit>() { // from class: com.onesignal.core.internal.application.impl.ApplicationService$onOrientationChanged$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(IActivityLifecycleHandler iActivityLifecycleHandler) {
                invoke2(iActivityLifecycleHandler);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(IActivityLifecycleHandler it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.onActivityAvailable(activity);
            }
        });
        activity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this);
        handleFocus();
    }

    private final void handleLostFocus() {
        if (isInForeground()) {
            Logging.debug$default("ApplicationService.handleLostFocus: application is now out of focus", null, 2, null);
            setEntryState(AppEntryAction.APP_CLOSE);
            this.applicationLifecycleNotifier.fire(new Function1<IApplicationLifecycleHandler, Unit>() { // from class: com.onesignal.core.internal.application.impl.ApplicationService$handleLostFocus$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(IApplicationLifecycleHandler iApplicationLifecycleHandler) {
                    invoke2(iApplicationLifecycleHandler);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(IApplicationLifecycleHandler it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    it.onUnfocused();
                }
            });
            return;
        }
        Logging.debug$default("ApplicationService.handleLostFocus: application already out of focus", null, 2, null);
    }

    private final void handleFocus() {
        if (getWasInBackground()) {
            Logging.debug$default("ApplicationService.handleFocus: application is now in focus, nextResumeIsFirstActivity=" + this.nextResumeIsFirstActivity, null, 2, null);
            this.nextResumeIsFirstActivity = false;
            if (getEntryState() != AppEntryAction.NOTIFICATION_CLICK) {
                setEntryState(AppEntryAction.APP_OPEN);
            }
            this.applicationLifecycleNotifier.fire(new Function1<IApplicationLifecycleHandler, Unit>() { // from class: com.onesignal.core.internal.application.impl.ApplicationService$handleFocus$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(IApplicationLifecycleHandler iApplicationLifecycleHandler) {
                    invoke2(iApplicationLifecycleHandler);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(IApplicationLifecycleHandler it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    it.onFocus(false);
                }
            });
            return;
        }
        Logging.debug$default("ApplicationService.handleFocus: application never lost focus", null, 2, null);
    }
}
